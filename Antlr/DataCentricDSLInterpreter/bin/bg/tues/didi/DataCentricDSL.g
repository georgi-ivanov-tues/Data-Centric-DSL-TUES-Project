grammar DataCentricDSL;

options {
  output=AST;
}

tokens {
  BLOCK;
  RETURN;
  STATEMENTS;
  ASSIGNMENT;
  FUNC_CALL;
  EXP;
  EXP_LIST;
  ID_LIST;
  IF;
  TERNARY;
  UNARY_MIN;
  NEGATE;
  FUNCTION;
  INDEXES;
  LIST;
  LOOKUP;
  PRINT;
  PRINTLN;
}

@parser::header {
  package bg.tues.didi;
  import bg.tues.didi.*; 
  import java.util.Map;
  import java.util.HashMap;
  import bg.tues.didi.Function;
}

@lexer::header {
  package bg.tues.didi;
}
 
@parser::members {
  public Map<String, Function> functions = new HashMap<String, Function>();
  
  private void defineFunction(String id, Object idList, Object block) {

    // `idList` is possibly null! Create an empty tree in that case. 
    CommonTree idListTree = idList == null ? new CommonTree() : (CommonTree)idList;

    // `block` is never null.
    CommonTree blockTree = (CommonTree)block;

    // The function name with the number of parameters after it the unique key
    String key = id + idListTree.getChildCount();
    functions.put(key, new Function(id, idListTree, blockTree));
  }
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
      case '"': builder.append("\""); break;
      case '\'': builder.append("'"); break;
      case '/': builder.append("/"); break;
      case '\\': builder.append("\\"); break;
      default: builder.append(c);
    }
  }
}
 

program
  :  (functionDef)* block EOF -> block
  ;

block
  :  statement* (Return expression ';')? 
     -> ^(BLOCK ^(STATEMENTS statement*) ^(RETURN expression?))
  ;

statement
  :  assignment ';'   -> assignment
  |  incrementation ';' -> incrementation
  |  functionCall ';' -> functionCall
  |  ifStatement
  |  forStatement
  |  whileStatement
  |  query ';' -> query
  |  update ';' -> update
  |  println ';' -> println
  |  print ';' -> print
  ;

query: 
  'query'^ (expression)
  ;

update:
  'update'^ (expression)
  ;

variableCall
  : Identifier
  ;

assignment
  :  Identifier indexes? '=' (expression -> ^(ASSIGNMENT Identifier indexes? expression) )
  |  'global' Identifier indexes? '=' (expression -> ^('global' ASSIGNMENT Identifier indexes? expression))
  ;

functionCall
  :  Identifier '(' exprList? ')' -> ^(FUNC_CALL Identifier exprList?)
  |  Assert '(' expression ')'    -> ^(FUNC_CALL Assert expression)
  |  Size '(' expression ')'      -> ^(FUNC_CALL Size expression)
  ;

println
  : Println (expression -> ^(PRINTLN expression))
  ;
  
print
  : Print (expression -> ^(PRINT expression))
  ;

ifStatement
  :  ifStat elseIfStat* elseStat? -> ^(IF ifStat elseIfStat* elseStat?)
  ;

ifStat
  :  If '(' expression ')' '{' block '}' -> ^(EXP expression block)
  ;

elseIfStat
  :  Else If '(' expression ')' '{' block '}' -> ^(EXP expression block)
  ;

elseStat
  :  Else '{' block '}' -> ^(EXP block)
  ;

functionDef
  :  'func' Identifier '(' idList? ')' '{' block '}'
   {defineFunction($Identifier.text, $idList.tree, $block.tree);}
  ;

forStatement
  :  (For '(' assignment ';' expression ';' afterthought ')' '{' block '}' 
     -> ^(For assignment expression afterthought block))
  ;

afterthought
  : (Identifier '=' expression) | incrementation
  ;

whileStatement
  :  While '(' expression ')' '{' block '}' -> ^(While expression block)
  ;

idList
  :  Identifier (',' Identifier)* -> ^(ID_LIST Identifier+)
  ;
  
incrementation
  : variableCall ('++'|'--')
  ; 

exprList
  :  expression (',' expression)* -> ^(EXP_LIST expression+)
  ;

expression
  :  condExpr | query
  ;

condExpr
  :  (orExpr -> orExpr) 
     ( '?' a=expression ':' b=expression -> ^(TERNARY orExpr $a $b)
     | In expression                     -> ^(In orExpr expression)
     )?
  ;

orExpr
  :  andExpr ('||'^ andExpr)*
  ;

andExpr
  :  equExpr ('&&'^ equExpr)*
  ;

equExpr
  :  relExpr (('==' | '!=')^ relExpr)*
  ;

relExpr
  :  addExpr (('>=' | '<=' | '>' | '<')^ addExpr)*
  ;

addExpr
  :  mulExpr (('+' | '-')^ mulExpr)*
  ;

mulExpr
  :  powExpr (('*' | '/' | '%')^ powExpr)*
  ;

powExpr
  :  unaryExpr ('^'^ unaryExpr)*
  ;
  
unaryExpr
  :  '-' atom -> ^(UNARY_MIN atom)
  |  '!' atom -> ^(NEGATE atom)
  |  atom
  ;

atom
  :  Number
  |  Bool
  |  Null
  |  lookup
  |  functionCall
  ;

list
  :  '[' exprList? ']' -> ^(LIST exprList?)
  ;

lookup
  :  list indexes?               -> ^(LOOKUP list indexes?)
  |  Identifier indexes?         -> ^(LOOKUP Identifier indexes?)
  |  String indexes?             -> ^(LOOKUP String indexes?)
  |  '(' expression ')' indexes? -> ^(LOOKUP expression indexes?)
  ;

indexes
  :  ('[' expression ']')+ -> ^(INDEXES expression+)
  ;

// Tokens
Println  : 'println';
Print    : 'print';
Assert   : 'assert';
Size     : 'size';
Def      : 'def';
If       : 'if';
Else     : 'else';
Return   : 'return';
For      : 'for';
While    : 'while';
To       : 'to';
Do       : 'do';
End      : 'end';
In       : 'in';
Null     : 'null';

Or       : '||';
And      : '&&';
Equals   : '==';
NEquals  : '!=';
GTEquals : '>=';
LTEquals : '<=';
Pow      : '^';
Excl     : '!';
GT       : '>';
LT       : '<';
Add      : '+';
Increment: '++';
Subtract : '-';
Multiply : '*';
Divide   : '/';
Modulus  : '%';
OBrace   : '{';
CBrace   : '}';
OBracket : '[';
CBracket : ']';
OParen   : '(';
CParen   : ')';
SColon   : ';';
Assign   : '=';
Comma    : ',';
QMark    : '?';
Colon    : ':';

Bool
  :  'true' 
  |  'false'
  ;

Number
  :  Int ('.' Digit+)?
  ;

Identifier
  :  ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | Digit)*
  ;

String
@init {
  final StringBuilder builder = new StringBuilder();
}
@after {
  setText(builder.toString());
}
  :  '"'  (Escape[builder] | c=~('\\' | '"' | '\r' | '\n') {builder.appendCodePoint(c);})* '"' 
  |  '\'' (Escape[builder] | c=~('\\' | '\'' | '\r' | '\n') {builder.appendCodePoint(c);})* '\''
  ;

fragment Escape[StringBuilder builder]
  : '\\' . {processEscapeSequence(getText(), $builder);}
  ;

Comment
  :  '//' ~('\r' | '\n')* {skip();}
  |  '/*' .* '*/'         {skip();}
  ;

Space
  :  (' ' | '\t' | '\r' | '\n' | '\u000C') {skip();}
  ;

fragment Int
  :  '1'..'9' Digit*
  |  '0'
  ;
  
fragment Digit 
  :  '0'..'9'
  ;