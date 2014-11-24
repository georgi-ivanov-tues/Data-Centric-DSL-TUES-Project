grammar DataCentricDSL;

options {
  language = Java;
  output=AST;
}

@header {
	package org.dataCentricDSL;
}

@lexer::header {
	package org.dataCentricDSL;
}

program: 
//	package_declaration // They don't work for some reason...
//	import_declaration*
	(query^)*
	;
	
package_declaration:
	'package' STRING ';'
;

import_declaration:
	'import' STRING ';'
;

query: 
	'query'^ '('! request ')'! ';'!
;
// READ THIS:
// http://stackoverflow.com/questions/4931346/how-to-output-the-ast-built-using-antlr/4933963#4933963

request:
	REQUEST_STRING
;

STRING: ('a'..'z' | 'A'..'Z')('a'..'z' | 'A'..'Z' | '0'..'9')*;
REQUEST_STRING: ('a'..'z' | 'A'..'Z')('a'..'z' | 'A'..'Z' | '0'..'9' | ' ')*;
WS: (' ' | '\t' | '\n' | '\r' | '\f')+ {$channel = HIDDEN;};