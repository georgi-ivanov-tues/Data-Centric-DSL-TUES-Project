grammar DataCentricDSL;

options {
  language = Java;
}

@header {
	package org.dataCentricDSL;
}

@lexer::header {
	package org.dataCentricDSL;
}

rule: STRING+;

//QUERY: 'query' '(' queryParams += STRING ('+' queryParams += STRING)* ')' ';';

//'query' '('queryParams += XExpression ('+' queryParams += XExpression)*')'';'

STRING: ('a'..'z' | 'A'..'Z' | '0'..'9')+;

WS: (' ' | '\t' | '\n' | '\r')+ {$channel = HIDDEN;};