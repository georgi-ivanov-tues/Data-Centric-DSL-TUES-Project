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

program returns [List<String> result]:  
  query* {result = queries;}
  ;
  
query: 
  ^('query' STRING_LITERAL) 
  {queries.add($STRING_LITERAL.text);}
; 
