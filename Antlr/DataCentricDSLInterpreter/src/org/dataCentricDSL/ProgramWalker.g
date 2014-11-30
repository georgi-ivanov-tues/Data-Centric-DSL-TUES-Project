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
}

@members {
  private List<String> queries = new ArrayList<String>();
}

program returns [List<String> result]:  // Samo za da minat testovete :D
  (query {result = queries;} | print)*
  ;
  
query returns [String request]: 
  ^('query' STRING_LITERAL) {request = $STRING_LITERAL.text; queries.add($STRING_LITERAL.text);}
;

print:
   ^('print' 
    (
    STRING_LITERAL {System.out.println($STRING_LITERAL.text);}
    | query {System.out.println($query.request);})
    )
;
