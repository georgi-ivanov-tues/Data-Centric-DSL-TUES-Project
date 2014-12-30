tree grammar ProgramWalker;

options {
  tokenVocab=DataCentricDSL;
  ASTLabelType=CommonTree;
}
 
@header {
  package org.dataCentricDSL;
  import org.dataCentricDSL.*;
  import org.dataCentricDSL.tree.*;
  import org.dataCentricDSL.tree.funcions.PrintlnNode;
  import java.util.Map; 
  import java.util.HashMap;
  
  import java.util.List;
  import java.util.ArrayList;
  import java.sql.Connection;
  import java.sql.ResultSet;
  import java.sql.Statement;
  import java.sql.SQLException;
  import java.sql.ResultSetMetaData;
  import org.dataCentricDSL.tree.*;
}

@members {
  public Map<String, Function> functions = null;
  Scope currentScope = null;
  
  public ProgramWalker(CommonTreeNodeStream nodes, Map<String, Function> fns) {
    this(nodes, null, fns);
  }
  
  public ProgramWalker(CommonTreeNodeStream nds, Scope sc, Map<String, Function> fns) {
    super(nds);
    currentScope = sc;
    functions = fns;
  }
  
  // 
  
   public ProgramWalker(TreeNodeStream input, Map<String, Object> context) {
    super(input, new RecognizerSharedState());
    this.context = context;
  }
  
  public ProgramWalker(TreeNodeStream input, RecognizerSharedState state, Map<String, Object> context) {
    super(input, state);
    this.context = context;
  }
   
  public Map<String, Object> context = new HashMap<String, Object>();
  
  public ResultSet executeQuery(String sqlStatement, Connection connection) throws SQLException {
    Statement statement = connection.createStatement();
    ResultSet result = statement.executeQuery(sqlStatement);
    //if(statement != null) statement.close();
    return result;
  }
  
  public void print(Object obj) throws SQLException {
    if((obj instanceof String)
    ||(obj instanceof Integer)
    ||(obj instanceof Float) 
    ||(obj instanceof Character) 
    ||(obj instanceof Boolean)) System.out.println(obj);
    else if(obj instanceof ResultSet) printResultSet((ResultSet) obj);
    else System.out.println("Error on printing...");
  }
  
  public void printResultSet(ResultSet resultSet) throws SQLException {
    ResultSetMetaData metaData = resultSet.getMetaData();
    int columnCount = metaData.getColumnCount();
    while(resultSet.next()) {
      for(int i = 1; i <= columnCount; i++) {
        if(i > 1) System.out.print(" ");
        String columnValue = resultSet.getString(i);
        System.out.printf("\%15s", columnValue);
      }
      System.out.println("");
    }
  }
}

program returns [TLNode node]
  :  block {node = $block.node;} 
  ;

block returns [TLNode node]
@init {
  BlockNode bn = new BlockNode();
  node = bn;
  Scope scope = new Scope(currentScope);
  currentScope = scope;
}
@after { 
  currentScope = currentScope.parent();
}
  :  ^(BLOCK 
        ^( STATEMENTS (statement  {bn.addStatement($statement.node);})* ) 
        ^( RETURN     (expression {bn.addReturn($expression.node);  })? )
      )
  ;

statement returns [TLNode node]
  :  assignment     {node = $assignment.node;}
  |  functionCall   {node = $functionCall.node;}
  |  ifStatement    {node = $ifStatement.node;}
  |  forStatement   {node = $forStatement.node;}
  |  whileStatement {node = $whileStatement.node;}
  |  query {node = null;}
  |  print {node = null;}
  ;

query returns [ResultSet result]: 
  {String sqlStatement = "";}
  ^('query'
   (  String {sqlStatement = $String.text;} 
   |  variableCall {sqlStatement = (String) context.get($variableCall.value);}
   )
   {try {
      result = executeQuery(sqlStatement, (Connection) context.get("dataSource"));
      context.put("lastResult", result);
    } catch (java.sql.SQLException e) {
      e.printStackTrace();
    }} 
   )
;

print:
   ^('print' 
    ( String {System.out.println($String.text);}
    | query 
      { try {
          printResultSet($query.result);
        } catch (SQLException e) {
          e.printStackTrace();
        }} 
    | variableCall 
      { Object text = context.get($variableCall.value); 
        if(text != null){
          try {
            print(text);
          } catch (SQLException e) {
            e.printStackTrace();
          }
        } 
      }) 
    )
;

variableCall returns [String value]:
  Identifier {value=$Identifier.text;} 
;


variableDecl:
  Identifier 
  ( query {context.put($Identifier.text, $query.result);}
  | String 
  { if($String.text.length() == 1) context.put($Identifier.text, $String.text.charAt(0)); // It's a char
    else context.put($Identifier.text, $String.text);} // It's a string
  | FLOAT { context.put($Identifier.text, Float.parseFloat($FLOAT.text)); }
  | Bool { context.put($Identifier.text, Boolean.parseBoolean($Bool.text)); }
//  | expression {
//    if($expression.node instanceof Integer){
//      context.put($Identifier.text, (Integer)$expression.node);
//    }
//    else if($expression.node instanceof String){
//      context.put($Identifier.text, (String)$expression.node);
//    }
////  context.put($IDENT.text, $expression.result);} 
//  }
  )
; 

assignment returns [TLNode node]
  :  ^(ASSIGNMENT i=Identifier x=indexes? e=expression) 
     {node = new AssignmentNode($i.text, $x.e, $e.node, currentScope);}
  ;

functionCall returns [TLNode node]
  :  ^(FUNC_CALL Identifier exprList?)
  |  ^(FUNC_CALL Println expression?) {node = new PrintlnNode($expression.node);}
  |  ^(FUNC_CALL Print expression)
  |  ^(FUNC_CALL Assert expression)
  |  ^(FUNC_CALL Size expression)
  ;

ifStatement returns [TLNode node]
@init  {
  IfNode ifNode = new IfNode();
  node = ifNode;
}
  :  ^(IF 
       (^(EXP expression b1=block) {ifNode.addChoice($expression.node, $b1.node);  })+ 
       (^(EXP b2=block)            {ifNode.addChoice(new AtomNode(true), $b2.node);})?
     )
  ;
   
forStatement returns [TLNode node]
  :  ^(For Identifier expression expression block)
  ;

whileStatement returns [TLNode node]
  :  ^(While expression block)
  ;

idList returns [java.util.List<String> i]
  :  ^(ID_LIST Identifier+)
  ;

exprList returns [java.util.List<TLNode> e]
  :  ^(EXP_LIST expression+)
  ;

expression returns [TLNode node]
  :  ^(TERNARY expression expression expression)
  |  ^(In expression expression)
  |  ^('||' expression expression)
  |  ^('&&' expression expression)
  |  ^('==' expression expression)
  |  ^('!=' expression expression)
  |  ^('>=' expression expression)
  |  ^('<=' expression expression)
  |  ^('>' expression expression)
  |  ^('<' a=expression b=expression) {node = new LTNode($a.node, $b.node);}
  |  ^('+' a=expression b=expression) {node = new AddNode($a.node, $b.node);}
  |  ^('-' expression expression)
  |  ^('*' expression expression)
  |  ^('/' expression expression)
  |  ^('%' expression expression)
  |  ^('^' expression expression)
  |  ^(UNARY_MIN expression)
  |  ^(NEGATE expression)
  |  Number {node = new AtomNode(Double.parseDouble($Number.text));}
  |  Bool
  |  Null
  |  lookup {node = $lookup.node;}           
  ;

lookup returns [TLNode node]
  :  ^(LOOKUP functionCall indexes?)
  |  ^(LOOKUP list indexes?)
  |  ^(LOOKUP expression indexes?) 
  |  ^(LOOKUP i=Identifier x=indexes?) 
      {
        node = ($x.e != null) ? 
          new LookupNode(new IdentifierNode($i.text, currentScope), $x.e) : 
          new IdentifierNode($i.text, currentScope);
      }
  |  ^(LOOKUP String indexes?)
  ;
  
list returns [TLNode node]
  :  ^(LIST exprList?)
  ;

indexes returns [java.util.List<TLNode> e]
@init {e = new java.util.ArrayList<TLNode>();}
  :  ^(INDEXES (expression {e.add($expression.node);})+)
  ;
  