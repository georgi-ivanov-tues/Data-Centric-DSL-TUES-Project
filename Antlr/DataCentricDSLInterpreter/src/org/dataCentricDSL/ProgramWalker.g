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
  private List<String> queries = new ArrayList<String>();
  private Map<String, String> variables = new HashMap<>();
}

program returns [List<String> result]:  // Samo za da minat testovete :D
  (query {result = queries;} | print | variableDecl)*
  ;
  
query returns [String request]: 
  ^('query' STRING_LITERAL) {request = $STRING_LITERAL.text; queries.add($STRING_LITERAL.text);}
;

print:
   ^('print' 
    (
    STRING_LITERAL {System.out.println($STRING_LITERAL.text);}
    | query {System.out.println($query.request);}
    | variableCall { System.out.println($variableCall.value); })
    )
;

variableDecl:
  IDENT 
  ( q=query { variables.put($IDENT.text, q); }
  | v=variableCall { variables.put($IDENT.text, v); }
  | STRING_LITERAL { variables.put($IDENT.text, $STRING_LITERAL.text); }
  )
;

variableCall returns [String value]:
  IDENT { value=variables.get($IDENT.text); }
;