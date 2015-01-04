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
  import org.dataCentricDSL.tree.funcions.QueryNode;
  import org.dataCentricDSL.tree.expressions.operations.*;
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
  
  public Scope getCurrentScope(){
    return currentScope;
  }
  
  public ProgramWalker(CommonTreeNodeStream nodes, Map<String, Function> fns) {
    this(nodes, null, fns);
  }
  
  public ProgramWalker(CommonTreeNodeStream nds, Scope sc, Map<String, Function> fns) {
    super(nds);
    currentScope = sc;
    functions = fns;
  }
  
   public ProgramWalker(TreeNodeStream input, Map<String, Object> context) {
    super(input, new RecognizerSharedState());
    this.context = context;
  }
  
  public ProgramWalker(TreeNodeStream input, RecognizerSharedState state, Map<String, Object> context) {
    super(input, state);
    this.context = context;
  }
   
  public Map<String, Object> context = new HashMap<String, Object>();
  
}

program returns [TLNode node]
  :  block{
      node = $block.node;  
      node.evaluate();
    } 
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
  |  query {node = $query.node;}
  ;

query returns [TLNode node]: 
  {String sqlStatement = "";}
  ^('query'
   (  String {node = new QueryNode(new AtomNode($String.text), (Connection) context.get("dataSource"));} 
   |  variableCall {node = new QueryNode(new IdentifierNode($variableCall.value, currentScope), (Connection) context.get("dataSource"));}
   )
   )
;

variableCall returns [String value]:
  Identifier {value=$Identifier.text;}
;

assignment returns [TLNode node] 
  :  ^(ASSIGNMENT i=Identifier x=indexes? e=expression {node = new AssignmentNode($i.text, $x.e, $e.node, currentScope);})
//  |  ^(ASSIGNMENT i=Identifier e=query {node = new AssignmentNode($i.text, $e.node, currentScope);})
  ;

functionCall returns [TLNode node]
  :  ^(FUNC_CALL Identifier exprList?)
  |  ^(FUNC_CALL Println expression?) {node = new PrintlnNode($expression.node);}
//  |  ^(FUNC_CALL Println query) {node = new PrintlnNode($query.node);}
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
//  :  ^(For s=Identifier a=expression b=expression c=assignment d=block) {node = new ForNode($s.text, $a.node, $b.node, $c.node, $d.node, currentScope);}
//:  ^(For a=Identifier b=expression c=expression d=block) {node = new ForNode(new AssignmentNode($a.text, $b.node, currentScope), $c.node, $d.node);}
:  ^(For a=Identifier b=expression c=expression d=block) {node = new ForNode($a.text, $b.node, $c.node, $d.node, currentScope);}
//:  ^(For a=Identifier b=expression c=expression d=Identifier e=expression f=block) {node = new ForNode($a.text, $b.node, $c.node, $d.text, $e.node, $f.node, currentScope);}
  ;

whileStatement returns [TLNode node]
  :  ^(While expression block) {node = new WhileNode($expression.node, $block.node);}
  ;

idList returns [java.util.List<String> i]
  :  ^(ID_LIST Identifier+)
  ;

exprList returns [java.util.List<TLNode> e]
  :  ^(EXP_LIST expression+)
  ; 

// fix all other expressions!
expression returns [TLNode node]
  :  ^(TERNARY expression expression expression)
  |  ^(In expression expression)
  |  ^('||' a=expression b=expression) 
  |  ^('&&' a=expression b=expression) 
  |  ^('==' a=expression b=expression) {node = new EqualsNode($a.node, $b.node);}
  |  ^('!=' a=expression b=expression) {node = new NotEqualsNode($a.node, $b.node);}
  |  ^('>=' a=expression b=expression) {node = new GreaterThanAndEqualsNode($a.node, $b.node);}
  |  ^('<=' a=expression b=expression) {node = new LessThanAndEqualsNode($a.node, $b.node);}
  |  ^('>' a=expression b=expression) {node = new GreaterThanNode($a.node, $b.node);}
  |  ^('<' a=expression b=expression) {node = new LessThanNode($a.node, $b.node);}
  |  ^('+' a=expression b=expression) {node = new AddNode($a.node, $b.node);}
  |  ^('-' a=expression b=expression) {node = new SubNode($a.node, $b.node);}
  |  ^('*' a=expression b=expression) {node = new MultiplicationNode($a.node, $b.node);}
  |  ^('/' a=expression b=expression) {node = new DivisionNode($a.node, $b.node);}
  |  ^('%' expression expression)
  |  ^('^' expression expression)
  |  ^(UNARY_MIN expression)
  |  ^(NEGATE expression)
  |  Number {node = new AtomNode(Double.parseDouble($Number.text));}
  |  Bool
  |  Null
  |  lookup {node = $lookup.node;}  
  |  query {node = $query.node;}
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
  |  ^(LOOKUP String indexes?) {
        node = new AtomNode($String.text);
      }
  ;
  
list returns [TLNode node]
  :  ^(LIST exprList?)
  ;

indexes returns [java.util.List<TLNode> e]
@init {e = new java.util.ArrayList<TLNode>();}
  :  ^(INDEXES (expression {e.add($expression.node);})+)
  ;
  