tree grammar ProgramWalker;

options {
  language = Java;
  tokenVocab = DataCentricDSL;
  ASTLabelType = CommonTree;
}

@header { 
  package org.dataCentricDSL;
  import java.util.List;
  import java.util.ArrayList;
  import java.util.Map;
  import java.util.HashMap;
  import java.sql.Connection;
  import java.sql.ResultSet;
  import java.sql.Statement;
  import java.sql.SQLException;
  import java.sql.ResultSetMetaData;
}
 
@members {  
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
  
  // copy
  
  interface Node {
      Object eval();
    }

    abstract class BinaryNode implements Node {

      protected Node left;
      protected Node right;

      public BinaryNode(Node l, Node r) {
        left = l;
        right = r;
      }
    }

    class AtomNode implements Node {

      private Object value;

      public AtomNode(Object v) {
        value = v;
      }

      @Override
      public Object eval() {
        return value;
      }
    }

    class OrNode extends BinaryNode {

      public OrNode(Node left, Node right) { super(left, right); }

      @Override
      public Object eval() {
        return (Boolean)super.left.eval() || (Boolean)super.right.eval();
      }
    }

    class AndNode extends BinaryNode {

      public AndNode(Node left, Node right) { super(left, right); }

      @Override
      public Object eval() {
        return (Boolean)super.left.eval() && (Boolean)super.right.eval();
      }
    }

    class LTNode extends BinaryNode {

      public LTNode(Node left, Node right) { super(left, right); }

      @Override
      public Object eval() {
        return (Integer)super.left.eval() < (Integer)super.right.eval();
      }
    }

    class LTEqNode extends BinaryNode {

      public LTEqNode(Node left, Node right) { super(left, right); }

      @Override
      public Object eval() {
        return (Integer)super.left.eval() <= (Integer)super.right.eval();
      }
    }

    class GTNode extends BinaryNode {

      public GTNode(Node left, Node right) { super(left, right); }

      @Override
      public Object eval() {
        return (Integer)super.left.eval() > (Integer)super.right.eval();
      }
    }

    class GTEqNode extends BinaryNode {

      public GTEqNode(Node left, Node right) { super(left, right); }

      @Override
      public Object eval() {
        return (Integer)super.left.eval() >= (Integer)super.right.eval();
      }
    }

    class EqNode extends BinaryNode {

      public EqNode(Node left, Node right) { super(left, right); }

      @Override
      public Object eval() {
        return super.left.eval().equals(super.right.eval());
      }
    }

    class NEqNode extends BinaryNode {

      public NEqNode(Node left, Node right) { super(left, right); }

      @Override
      public Object eval() {
        return !super.left.eval().equals(super.right.eval());
      }
    }

    class VarNode implements Node {

      private java.util.Map<String, Object> memory;
      private String var;

      VarNode(java.util.Map<String, Object> m, String v) {
        memory = m;
        var = v;
      }

      @Override
      public Object eval() {
        Object value = memory.get(var);
        if(value == null) {
          throw new RuntimeException("Unknown variable: " + var);
        }
        return value;
      }
    }

    class IfNode implements Node {

      private Node test;
      private Node ifTrue;
      private Node ifFalse;

      public IfNode(Node a, Node b, Node c) {
        test = a;
        ifTrue = b;
        ifFalse = c;
      }

      @Override
      public Object eval() {
        if((Boolean)test.eval()){
          return ifTrue.eval();
        }else{
          return ifFalse.eval();
        }
//        return (Boolean)test.eval();
//        return (Boolean)test.eval() ? ifTrue.eval() : ifFalse.eval();
//          return (Boolean)test.eval() ? "true" : "false";
      }
    }
}

program :
  (block)*
  ;
  
block:
 ( ifStatement
 | query
 | print
 | variableDecl
 )
;  
  
//copy
ifStatement:
  ^('if' a=if_expression b=if_expression c=if_expression?) {
//  System.out.println("a = " + $a.n.eval()); 
//  System.out.println("b = " + $b.n.eval());
//  System.out.println("c = " + $c.n.eval());
  Node n = new IfNode($a.n, $b.n, $c.n);
    System.out.println("IF RESULT = " + n.eval());
//    System.out.println("a = " + $a.n.eval());
//    System.out.println("b = " + $b.n.eval()); 
//    System.out.println("c = " + $c.n.eval());
  
  }  
;

if_expression returns [Node n]
  :  ^('or' a=if_expression b=if_expression)   {$n = new OrNode($a.n, $b.n);}
  |  ^('and' a=if_expression b=if_expression)  {$n = new AndNode($a.n, $b.n);}
  |  ^('==' a=if_expression b=if_expression) {$n = new EqNode($a.n, $b.n);}
  |  ^('!=' a=if_expression b=if_expression) {$n = new NEqNode($a.n, $b.n);}
  |  ^('<=' a=if_expression b=if_expression) {$n = new LTEqNode($a.n, $b.n);}
  |  ^('<' a=if_expression b=if_expression)  {$n = new LTNode($a.n, $b.n);}
  |  ^('>=' a=if_expression b=if_expression) {$n = new GTEqNode($a.n, $b.n);}
  |  ^('>' a=if_expression b=if_expression)  {$n = new GTNode($a.n, $b.n);}
//  |  BOOLEAN                           {$n = new AtomNode(Boolean.valueOf($BOOLEAN.text));}
//  |  INTEGER                            {$n = new AtomNode(Integer.valueOf($INTEGER.text));}
  |  IDENT                                {$n = new VarNode(context, $IDENT.text);}
//  |  block
  |  print {$n = null;}
//   | variableDecl {$n = null;}
//| block
  ;
//paste  
  
  
query returns [ResultSet result]: 
  {String sqlStatement = "";}
  ^('query'
   (  STRING_LITERAL  {sqlStatement = $STRING_LITERAL.text;} 
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
    ( STRING_LITERAL {System.out.println($STRING_LITERAL.text);}
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

variableDecl:
  IDENT 
  ( query {context.put($IDENT.text, $query.result);}
  | STRING_LITERAL 
  { if($STRING_LITERAL.text.length() == 1) context.put($IDENT.text, $STRING_LITERAL.text.charAt(0)); // It's a char
    else context.put($IDENT.text, $STRING_LITERAL.text);} // It's a string
  | FLOAT { context.put($IDENT.text, Float.parseFloat($FLOAT.text)); }
  | BOOLEAN { context.put($IDENT.text, Boolean.parseBoolean($BOOLEAN.text)); }
  | expression {
    if($expression.result instanceof Integer){
      context.put($IDENT.text, (Integer)$expression.result);
    }
    else if($expression.result instanceof String){
      context.put($IDENT.text, (String)$expression.result);
    }
//  context.put($IDENT.text, $expression.result);} 
  }
  )
; 

variableCall returns [String value]:
  IDENT {value=$IDENT.text;} 
;


expression returns [Object result]:
  (^('+' op1=expression op2=expression) { result = (Integer)op1 + (Integer)op2; }
  | ^('-' op1=expression op2=expression) { result = (Integer)op1 - (Integer)op2; }
  | ^('*' op1=expression op2=expression) { result = (Integer)op1 * (Integer)op2; }
  | ^('/' op1=expression op2=expression) { result = (Integer)op1 / (Integer)op2; }
  | ^('%' op1=expression op2=expression) { result = (Integer)op1 \% (Integer)op2; }
  | ^(NEGATION e=expression)  { result = -(Integer)e; }
  | variableCall { result = context.get($variableCall.value);}
  | INTEGER { result = Integer.parseInt($INTEGER.text); })
  ;
