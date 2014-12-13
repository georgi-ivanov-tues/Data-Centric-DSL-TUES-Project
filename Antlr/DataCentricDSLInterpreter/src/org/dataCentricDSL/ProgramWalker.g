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
}

program:
  (query | print | variableDecl)*
  ;
  
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
  | variableCall { context.put($IDENT.text, context.get($variableCall.value)); }
  | STRING_LITERAL 
  { if($STRING_LITERAL.text.length() == 1) context.put($IDENT.text, $STRING_LITERAL.text.charAt(0)); // It's a char
    else context.put($IDENT.text, $STRING_LITERAL.text);} // It's a string
  | INTEGER { context.put($IDENT.text, Integer.parseInt($INTEGER.text));}
  | FLOAT { context.put($IDENT.text, Float.parseFloat($FLOAT.text)); }
  | BOOLEAN { context.put($IDENT.text, Boolean.parseBoolean($BOOLEAN.text)); }
//  | expression { context.put($expression.text, $expression.result);}
  )
;

variableCall returns [String value]:
  IDENT {value=$IDENT.text;} 
;

//expression returns [int result]
//  : ^('+' op1=expression op2=expression) { result = op1 + op2; }
//  | ^('-' op1=expression op2=expression) { result = op1 - op2; }
//  | ^('*' op1=expression op2=expression) { result = op1 * op2; }
//  | ^('/' op1=expression op2=expression) { result = op1 / op2; }
//  | ^('%' op1=expression op2=expression) { result = op1 \% op2; }
//  | ^(NEGATION e=expression)  { result = -e; }
//  | IDENT { result = (Integer) context.get($IDENT.text); }
//  | INTEGER { result = Integer.parseInt($INTEGER.text); }
//  ;
