grammar DataCentricDSL;

options {
  language = Java;
  output=AST;
  ASTLabelType=CommonTree;
}

@header {
	package org.dataCentricDSL;
} 

@lexer::header {
	package org.dataCentricDSL;
}

@lexer::members {
  private void processEscapeSequence(String text, StringBuilder builder) {
    if(text == null) { //This shouldn't happen, but you never know
      return;
    }
    if(text.length() < 2) { //This neither
      return;
    }
    char c = text.charAt(text.length() - 1);
    switch(c) {
      case 'n': builder.append("\n"); break;
      case 'r': builder.append("\r"); break;
      case 't': builder.append("\t"); break;
      case 'b': builder.append("\b"); break;
      case 'f': builder.append("\f"); break;
      case '"': builder.append("\""); break;
      case '\'': builder.append("'"); break;
      case '/': builder.append("/"); break;
      case '\\': builder.append("\\"); break;
      default: builder.append(c);
    }
  }
}

program: 
//	package_declaration // They don't work for some reason...
//	import_declaration*
	(query)* EOF!
	;
	
//package_declaration:
//	'package' STRING ';'
//;

//import_declaration:
//	'import' STRING ';'
//;

query: 
	'query'^ '('! STRING_LITERAL ')'! ';'!
;
// READ THIS:
// http://stackoverflow.com/questions/4931346/how-to-output-the-ast-built-using-antlr/4933963#4933963

//request:
//	REQUEST_STRING
//;

STRING_LITERAL
  @init{final StringBuilder builder = new StringBuilder();}
  : '"'
    (ESCAPE[builder] 
    | c=~('\\' | '"' | '\r' | '\n') {builder.appendCodePoint(c);}
    )*
    '"'
    {setText(builder.toString());}
  ;
  
fragment ESCAPE[StringBuilder builder]
  : '\\' . {processEscapeSequence(getText(), $builder);}
  ;
  
//STRING: ('a'..'z' | 'A'..'Z')('a'..'z' | 'A'..'Z' | '0'..'9')*;
//REQUEST_STRING: ('a'..'z' | 'A'..'Z')('a'..'z' | 'A'..'Z' | '0'..'9' | ' ')*;
WS: (' ' | '\t' | '\n' | '\r' | '\f')+ {$channel = HIDDEN;};
COMMENT: '//' ~('\n' | '\r')* ('\n' | '\r')? {$channel = HIDDEN;};
MULTILINE_COMMENT: '/*' .* '*/' {$channel = HIDDEN;};