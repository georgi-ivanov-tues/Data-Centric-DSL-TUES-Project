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
}

@members { 
  public ArrayList<String[]> queries = new ArrayList<String[]>();
  public Map<String, String> variables = new HashMap<>();
  public Map<String, ArrayList<String[]>> queryVariables = new HashMap<>();
}

program:
  (query | print | variableDecl)*
  ;
  
query returns [ArrayList<String[\]> result]: 
  ^('query'
   (  STRING_LITERAL  {
      try {
        result = org.dataCentricDSL.derbyDB.QueryExectution.executeQuery($STRING_LITERAL.text);
        queries.addAll(result);
      } catch (java.sql.SQLException e) {
        e.printStackTrace();
      }} 
   |  variableCall {
      try {
        result = org.dataCentricDSL.derbyDB.QueryExectution.executeQuery(variables.get($variableCall.value));
        queries.addAll(result);
      } catch (java.sql.SQLException e) {
        e.printStackTrace();
      }}
   ) 
   )
;

print:
   ^('print' 
    (
    STRING_LITERAL {System.out.println($STRING_LITERAL.text);}
    | query 
    {
	    try {
	      org.dataCentricDSL.derbyDB.QueryExectution.printQueryResult($query.result);
	    } catch (java.sql.SQLException e) {
	      e.printStackTrace();
	    }} 
    | variableCall { 
        if(variables.get($variableCall.value) != null){
          System.out.println(variables.get($variableCall.value)); 
        }else if(queryVariables.get($variableCall.value) != null)
	        try {
	          org.dataCentricDSL.derbyDB.QueryExectution.printQueryResult(queryVariables.get($variableCall.value));
	        } catch (java.sql.SQLException e) {
	          e.printStackTrace();
	        } 
      }) 
    )
;

variableDecl:
  IDENT 
  ( q=query {queryVariables.put($IDENT.text,q);}
  | v=variableCall { variables.put($IDENT.text, variables.get($variableCall.value)); }
  | STRING_LITERAL { variables.put($IDENT.text, $STRING_LITERAL.text); }
  )
;

variableCall returns [String value]:
  IDENT {value=$IDENT.text; }
;