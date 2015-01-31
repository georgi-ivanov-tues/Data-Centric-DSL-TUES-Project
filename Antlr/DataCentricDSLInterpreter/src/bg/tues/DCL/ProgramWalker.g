tree grammar ProgramWalker;

options {
  tokenVocab=DataCentricDSL;
  ASTLabelType=CommonTree;
}
 
@header {
  package bg.tues.DCL;
  import bg.tues.DCL.*;
  import bg.tues.DCL.tree.*;
  import bg.tues.DCL.tree.funcions.PrintlnNode;
  import bg.tues.DCL.tree.funcions.PrintNode;
  import bg.tues.DCL.tree.funcions.QueryNode;
  import bg.tues.DCL.tree.expressions.operations.*;
  import java.util.Map; 
  import java.util.HashMap;
  import java.io.PrintStream;
  import java.util.List;
  import java.util.ArrayList;
  import java.sql.Connection;
  import java.sql.ResultSet;
  import java.sql.Statement;
  import java.sql.SQLException;
  import java.sql.ResultSetMetaData;
  import java.util.Arrays;
}

@members {
  public Map<String, Function> functions = null;
  public Map<String, Object> context = new HashMap<String, Object>();
  Scope currentScope = null;
  Scope globalScope = null;
  private Connection dataSource;
  private PrintStream outputStream;
  
  public ProgramWalker(TreeNodeStream input, Scope scope, Map<String, Function> fns) {
    super(input, new RecognizerSharedState());
    this.globalScope = scope;
    this.functions = fns;
    outputStream = System.out;
  }
  
  public ProgramWalker(TreeNodeStream input, Map<String, Object> context, Map<String, Function> fns) {
    super(input, new RecognizerSharedState());
    this.globalScope = new Scope();
    resolveOptions(context);
    this.functions = fns;
  }
    
  public ProgramWalker(TreeNodeStream input, Scope scope, Map<String, Object> context, Map<String, Function> fns) {
    super(input, new RecognizerSharedState());
    this.globalScope = scope;
    resolveOptions(context);
    this.functions = fns;
  }
  
  public ProgramWalker(TreeNodeStream input, RecognizerSharedState state, Scope scope, Map<String, Object> context, Map<String, Function> fns) {
    super(input, state);
    this.globalScope = scope;
    resolveOptions(context);
    this.functions = fns;
  }
  
  private void resolveOptions(Map<String, Object> context) {
    dataSource = (Connection) context.get("dataSource");
    PrintStream o = (PrintStream) context.get("outputStream");
    if(o == null) {
      outputStream = System.out;
    } else {
      outputStream = o;
    }
  }
}

program returns [Node node]
  :  block{
      node = $block.node; 
      node.evaluate();
    } 
  ;
 
block returns [Node node]
@init {
  BlockNode bn = new BlockNode();
  node = bn;
  if(currentScope == null) {
    currentScope = globalScope;
  } else {
    Scope scope = new Scope(currentScope);
    currentScope = scope;
  }
}
@after { 
  currentScope = currentScope.parent();
} 
  :  ^(BLOCK 
        ^( STATEMENTS (statement  {bn.addStatement($statement.node);})* ) 
        ^( RETURN     (expression {bn.addReturn($expression.node);  })? )
      )
  ;

statement returns [Node node]
  :  assignment     {node = $assignment.node;}
  |  functionCall   {node = $functionCall.node;}
  |  ifStatement    {node = $ifStatement.node;}
  |  forStatement   {node = $forStatement.node;} 
  |  whileStatement {node = $whileStatement.node;}
  |  incrementation {node = $incrementation.node;}
  |  query {node = $query.node;}
  ;

query returns [Node node]: 
  ^('query' expression {node = new QueryNode($expression.node, dataSource);})
;

variableCall returns [String value]:
  Identifier {value=$Identifier.text;}
;

assignment returns [Node node] 
  :  ^(ASSIGNMENT i=Identifier x=indexes? e=expression {node = new AssignmentNode($i.text, $x.e, $e.node, currentScope);})
  |  ^('global' ASSIGNMENT i=Identifier x=indexes? e=expression {
        Scope globalScope = currentScope;
        
        while(globalScope.parent() != null){
          globalScope = globalScope.parent();
        }
        node = new AssignmentNode($i.text, $x.e, $e.node, globalScope);
        })
  ;

functionCall returns [Node node]
  :  ^(FUNC_CALL Identifier exprList?) {
        
        int paramSize = 0;
        if($exprList.e == null){
            paramSize = 0;
        }else{
            paramSize = $exprList.e.size();
        }
      Function function = functions.get($Identifier.text + paramSize);
      function.setParameters(paramSize == 0 ? new ArrayList<Node>() : $exprList.e);
      node = function;
      
  }
  |  ^(FUNC_CALL Println expression?) {node = new PrintlnNode($expression.node, outputStream);}
  |  ^(FUNC_CALL Print expression) {node = new PrintNode($expression.node, outputStream);}
  |  ^(FUNC_CALL Assert expression) 
  |  ^(FUNC_CALL Size expression)
  ;

ifStatement returns [Node node]
@init  {
  IfNode ifNode = new IfNode();
  node = ifNode;
}
  :  ^(IF 
       (^(EXP expression b1=block) {ifNode.addChoice($expression.node, $b1.node);  })+ 
       (^(EXP b2=block)            {ifNode.addChoice(new AtomNode(true), $b2.node);})?
     )
  ;
   
forStatement returns [Node node]
  :  ^(For a=assignment b=expression c=afterthought d=block) {node = new ForNode($a.node, $b.node, $c.node, $d.node, currentScope);}
  ;

afterthought returns [Node node]:
  ((Identifier '=' expression {node = new AssignmentNode($Identifier.text, $expression.node, currentScope);}) 
  | incrementation {node = $incrementation.node;})
;

whileStatement returns [Node node]
  :  ^(While expression block) {node = new WhileNode($expression.node, $block.node);}
  ;

idList returns [java.util.List<String> i]
  :  ^(ID_LIST Identifier+)
  ;

exprList returns [java.util.List<Node> e]
@init {
  e = new ArrayList<Node>();
}
  :  ^(EXP_LIST (a=expression {e.add($a.node);})+)
  ; 

// fix all other expressions!
expression returns [Node node]
  :  ^(TERNARY expression expression expression)
  |  ^(In expression expression)
  |  ^('||' a=expression b=expression) 
  |  ^('&&' a=expression b=expression) 
  |  ^('==' a=expression b=expression) {node = new EqualsNode($a.node, $b.node);}
  |  ^('!=' a=expression b=expression) {node = new NotEqualsNode($a.node, $b.node);}
  |  ^('>=' a=expression b=expression) {node = new GreaterThanAndEqualsNode($a.node, $b.node);}
  |  ^('<=' a=expression b=expression) {node = new LessThanAndEqualsNode($a.node, $b.node);}
  |  ^('>' a=expression b=expression) {node = new GreaterThanNode($a.node, $b.node);}
  |  ^('<' a=expression b=expression) {node = new LessThanNode($a.node, $b.node);}
  |  ^('+' a=expression b=expression) {node = new AddNode($a.node, $b.node);}
  |  ^('-' a=expression b=expression) {node = new SubNode($a.node, $b.node);}
  |  ^('*' a=expression b=expression) {node = new MultiplicationNode($a.node, $b.node);}
  |  ^('/' a=expression b=expression) {node = new DivisionNode($a.node, $b.node);}
  |  ^('%' expression expression)
  |  ^('^' expression expression)
  |  ^(UNARY_MIN expression)
  |  ^(NEGATE expression)
  |  Number {node = new AtomNode(Double.parseDouble($Number.text));}
  |  Bool {node = new AtomNode(new Boolean($Bool.text));} 
  |  Null
  |  lookup {node = $lookup.node;}  
  |  query {node = $query.node;}
  ;

incrementation returns [Node node]
  :(variableCall ('++'{node = new IncrementationNode($variableCall.value,1,currentScope);}
  | '--' {node = new IncrementationNode($variableCall.value,-1,currentScope);})
  )
;

lookup returns [Node node]
  :  ^(LOOKUP functionCall indexes?)
  |  ^(LOOKUP list indexes?)
  |  ^(LOOKUP expression indexes?) 
  |  ^(LOOKUP i=Identifier x=indexes?) 
      {
        node = ($x.e != null) ? 
          new LookupNode(new IdentifierNode($i.text, currentScope), $x.e) : 
          new IdentifierNode($i.text, currentScope);
      }
  |  ^(LOOKUP String indexes?) {
        node = new AtomNode($String.text);
      }
  ;
  
list returns [Node node]
  :  ^(LIST exprList?)
  ;

indexes returns [java.util.List<Node> e]
@init {e = new java.util.ArrayList<Node>();}
  :  ^(INDEXES (expression {e.add($expression.node);})+)
  ;
  