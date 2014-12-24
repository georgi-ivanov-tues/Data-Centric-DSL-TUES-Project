grammar DataCentricDSL;

options {
  language = Java;
  output=AST;
  ASTLabelType=CommonTree;
}

tokens {
  NEGATION;
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
	block* EOF!
	; 

block: // thing of a better name later
//  ((query | print | variableDecl | ifStatement) ';'!)
  (((print | variableDecl) ';'!) | ifStatement)
;

query: 
	'query'^ (STRING_LITERAL | variableCall)
;

print:
  'print'^ (STRING_LITERAL | query | variableCall)
;

variableDecl:
  IDENT '='! ( query | STRING_LITERAL | FLOAT | BOOLEAN | expression)
;

variableCall:
  IDENT
;

// copy
ifStatement
//  :  'if' '(' a=if_expression ')' 'then' '{' b=if_expression '}' ('else' '{' c=if_expression '}')? -> ^('if' $a $b $c?)
:  'if' a=if_expression 'then' b=if_expression ('else' c=if_expression )? -> ^('if' $a $b $c?)
  ;

if_expression
  :  orExpression
  ;

orExpression
  :  andExpression ('or'^ andExpression)*
  ;

andExpression
  :  equalityExpression ('and'^ equalityExpression)*
  ;

equalityExpression
  :  relationalExpression (('==' | '!=')^ relationalExpression)*
  ;

relationalExpression
  :  atom (('<=' | '<' | '>=' | '>')^ atom)*
  ;

atom
  :  BOOLEAN
  |  INTEGER
  |  variableCall
  |  '(' if_expression ')' -> if_expression
  |  print
  ;

// paste

term
  : variableCall
  | '('! expression ')'!
  | INTEGER
  ;
  
unary
  : ('+'! | negation^)* term
  ;

negation
  : '-' -> NEGATION
  ;

mult
  : unary (('*'^ | '/'^ | 'mod'^) unary)*
  ;
  
expression
  : mult (('+'^ | '-'^) mult)*
  ;

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

WS: (' ' | '\t' | '\n' | '\r' | '\f')+ {$channel = HIDDEN;};
COMMENT: '//' ~('\n' | '\r')* ('\n' | '\r')? {$channel = HIDDEN;};
MULTILINE_COMMENT: '/*' .* '*/' {$channel = HIDDEN;};
fragment DIGIT : '0'..'9';
fragment LETTER : ('a'..'z' | 'A'..'Z');
INTEGER : DIGIT+;
FLOAT : '0'..'9' DIGIT* '.' DIGIT*;
BOOLEAN: 'true' | 'false';
IDENT : LETTER (LETTER | DIGIT)*; 