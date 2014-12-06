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
      { String text = (String) context.get($variableCall.value); 
        if(text != null){
          System.out.println(text); 
        } 
      }) 
    )
;

variableDecl:
  IDENT 
  ( query {context.put($IDENT.text, $query.result);}
  | variableCall { context.put($IDENT.text, context.get($variableCall.value)); }
  | STRING_LITERAL { context.put($IDENT.text, $STRING_LITERAL.text); }
  )
;

variableCall returns [String value]:
  IDENT {value=$IDENT.text; }
;