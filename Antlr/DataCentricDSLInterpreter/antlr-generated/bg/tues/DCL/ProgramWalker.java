// $ANTLR 3.5.2 D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g 2015-01-17 13:59:44

  package bg.tues.DCL;
  import bg.tues.DCL.*;
  import bg.tues.DCL.tree.*;
  import bg.tues.DCL.tree.funcions.PrintlnNode;
  import bg.tues.DCL.tree.funcions.PrintNode;
  import bg.tues.DCL.tree.funcions.QueryNode;
  import bg.tues.DCL.tree.expressions.operations.*;
  import java.util.Map; 
  import java.util.HashMap;
  
  import java.util.List;
  import java.util.ArrayList;
  import java.sql.Connection;
  import java.sql.ResultSet;
  import java.sql.Statement;
  import java.sql.SQLException;
  import java.sql.ResultSetMetaData;
  import java.util.Arrays;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ProgramWalker extends TreeParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGNMENT", "Add", "And", "Assert", 
		"Assign", "BLOCK", "Bool", "CBrace", "CBracket", "CParen", "Colon", "Comma", 
		"Comment", "Def", "Digit", "Divide", "Do", "EXP", "EXP_LIST", "Else", 
		"End", "Equals", "Excl", "FUNCTION", "FUNC_CALL", "For", "GT", "GTEquals", 
		"ID_LIST", "IF", "INDEXES", "Identifier", "If", "In", "Increment", "Int", 
		"LIST", "LOOKUP", "LT", "LTEquals", "Modulus", "Multiply", "NEGATE", "NEquals", 
		"Null", "Number", "OBrace", "OBracket", "OParen", "Or", "Pow", "Print", 
		"Println", "QMark", "RETURN", "Return", "SColon", "STATEMENTS", "Size", 
		"Space", "String", "Subtract", "TERNARY", "To", "UNARY_MIN", "While", 
		"'--'", "'func'", "'global'", "'query'"
	};
	public static final int EOF=-1;
	public static final int T__70=70;
	public static final int T__71=71;
	public static final int T__72=72;
	public static final int T__73=73;
	public static final int ASSIGNMENT=4;
	public static final int Add=5;
	public static final int And=6;
	public static final int Assert=7;
	public static final int Assign=8;
	public static final int BLOCK=9;
	public static final int Bool=10;
	public static final int CBrace=11;
	public static final int CBracket=12;
	public static final int CParen=13;
	public static final int Colon=14;
	public static final int Comma=15;
	public static final int Comment=16;
	public static final int Def=17;
	public static final int Digit=18;
	public static final int Divide=19;
	public static final int Do=20;
	public static final int EXP=21;
	public static final int EXP_LIST=22;
	public static final int Else=23;
	public static final int End=24;
	public static final int Equals=25;
	public static final int Excl=26;
	public static final int FUNCTION=27;
	public static final int FUNC_CALL=28;
	public static final int For=29;
	public static final int GT=30;
	public static final int GTEquals=31;
	public static final int ID_LIST=32;
	public static final int IF=33;
	public static final int INDEXES=34;
	public static final int Identifier=35;
	public static final int If=36;
	public static final int In=37;
	public static final int Increment=38;
	public static final int Int=39;
	public static final int LIST=40;
	public static final int LOOKUP=41;
	public static final int LT=42;
	public static final int LTEquals=43;
	public static final int Modulus=44;
	public static final int Multiply=45;
	public static final int NEGATE=46;
	public static final int NEquals=47;
	public static final int Null=48;
	public static final int Number=49;
	public static final int OBrace=50;
	public static final int OBracket=51;
	public static final int OParen=52;
	public static final int Or=53;
	public static final int Pow=54;
	public static final int Print=55;
	public static final int Println=56;
	public static final int QMark=57;
	public static final int RETURN=58;
	public static final int Return=59;
	public static final int SColon=60;
	public static final int STATEMENTS=61;
	public static final int Size=62;
	public static final int Space=63;
	public static final int String=64;
	public static final int Subtract=65;
	public static final int TERNARY=66;
	public static final int To=67;
	public static final int UNARY_MIN=68;
	public static final int While=69;

	// delegates
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public ProgramWalker(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public ProgramWalker(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return ProgramWalker.tokenNames; }
	@Override public String getGrammarFileName() { return "D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g"; }


	  public Map<String, Function> functions = null;
	  Scope currentScope = null;
	    
	  public ProgramWalker(TreeNodeStream input, Map<String, Object> context, Map<String, Function> fns) {
	    super(input, new RecognizerSharedState());
	    this.context = context;
	    functions = fns;
	  }
	  
	//  public ProgramWalker(CommonTreeNodeStream nodes, Map<String, Function> fns) {
	//    this(nodes, null, fns);
	//  }
	  
	  public ProgramWalker(CommonTreeNodeStream nds, Scope sc, Map<String, Function> fns) {
	    super(nds);
	    currentScope = sc;
	    functions = fns;
	  }
	  
	   public ProgramWalker(TreeNodeStream input, Map<String, Object> context) {
	    super(input, new RecognizerSharedState());
	    this.context = context;
	  }
	  
	  public ProgramWalker(TreeNodeStream input, RecognizerSharedState state, Map<String, Object> context) {
	    super(input, state);
	    this.context = context;
	  }
	   
	  public Map<String, Object> context = new HashMap<String, Object>();
	  



	// $ANTLR start "program"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:63:1: program returns [Node node] : block ;
	public final Node program() throws RecognitionException {
		Node node = null;


		Node block1 =null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:64:3: ( block )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:64:6: block
			{
			pushFollow(FOLLOW_block_in_program51);
			block1=block();
			state._fsp--;


			      node = block1; 
			      node.evaluate();
			    
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "program"



	// $ANTLR start "block"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:70:1: block returns [Node node] : ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) ;
	public final Node block() throws RecognitionException {
		Node node = null;


		Node statement2 =null;
		Node expression3 =null;


		  BlockNode bn = new BlockNode();
		  node = bn;
		  Scope scope = new Scope(currentScope);
		  currentScope = scope;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:80:3: ( ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:80:6: ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) )
			{
			match(input,BLOCK,FOLLOW_BLOCK_in_block84); 
			match(input, Token.DOWN, null); 
			match(input,STATEMENTS,FOLLOW_STATEMENTS_in_block97); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:81:23: ( statement )*
				loop1:
				while (true) {
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==ASSIGNMENT||(LA1_0 >= FUNC_CALL && LA1_0 <= For)||LA1_0==IF||LA1_0==Identifier||LA1_0==While||(LA1_0 >= 72 && LA1_0 <= 73)) ) {
						alt1=1;
					}

					switch (alt1) {
					case 1 :
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:81:24: statement
						{
						pushFollow(FOLLOW_statement_in_block100);
						statement2=statement();
						state._fsp--;

						bn.addStatement(statement2);
						}
						break;

					default :
						break loop1;
					}
				}

				match(input, Token.UP, null); 
			}

			match(input,RETURN,FOLLOW_RETURN_in_block120); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:82:23: ( expression )?
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= Add && LA2_0 <= And)||LA2_0==Bool||LA2_0==Divide||LA2_0==Equals||(LA2_0 >= GT && LA2_0 <= GTEquals)||LA2_0==In||(LA2_0 >= LOOKUP && LA2_0 <= Number)||(LA2_0 >= Or && LA2_0 <= Pow)||(LA2_0 >= Subtract && LA2_0 <= TERNARY)||LA2_0==UNARY_MIN||LA2_0==73) ) {
					alt2=1;
				}
				switch (alt2) {
					case 1 :
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:82:24: expression
						{
						pushFollow(FOLLOW_expression_in_block127);
						expression3=expression();
						state._fsp--;

						bn.addReturn(expression3);  
						}
						break;

				}

				match(input, Token.UP, null); 
			}

			match(input, Token.UP, null); 

			}

			 
			  currentScope = currentScope.parent();

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "block"



	// $ANTLR start "statement"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:86:1: statement returns [Node node] : ( assignment | functionCall | ifStatement | forStatement | whileStatement | incrementation | query );
	public final Node statement() throws RecognitionException {
		Node node = null;


		Node assignment4 =null;
		Node functionCall5 =null;
		Node ifStatement6 =null;
		Node forStatement7 =null;
		Node whileStatement8 =null;
		Node incrementation9 =null;
		Node query10 =null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:87:3: ( assignment | functionCall | ifStatement | forStatement | whileStatement | incrementation | query )
			int alt3=7;
			switch ( input.LA(1) ) {
			case ASSIGNMENT:
			case 72:
				{
				alt3=1;
				}
				break;
			case FUNC_CALL:
				{
				alt3=2;
				}
				break;
			case IF:
				{
				alt3=3;
				}
				break;
			case For:
				{
				alt3=4;
				}
				break;
			case While:
				{
				alt3=5;
				}
				break;
			case Identifier:
				{
				alt3=6;
				}
				break;
			case 73:
				{
				alt3=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:87:6: assignment
					{
					pushFollow(FOLLOW_assignment_in_statement159);
					assignment4=assignment();
					state._fsp--;

					node = assignment4;
					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:88:6: functionCall
					{
					pushFollow(FOLLOW_functionCall_in_statement172);
					functionCall5=functionCall();
					state._fsp--;

					node = functionCall5;
					}
					break;
				case 3 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:89:6: ifStatement
					{
					pushFollow(FOLLOW_ifStatement_in_statement183);
					ifStatement6=ifStatement();
					state._fsp--;

					node = ifStatement6;
					}
					break;
				case 4 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:90:6: forStatement
					{
					pushFollow(FOLLOW_forStatement_in_statement195);
					forStatement7=forStatement();
					state._fsp--;

					node = forStatement7;
					}
					break;
				case 5 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:91:6: whileStatement
					{
					pushFollow(FOLLOW_whileStatement_in_statement207);
					whileStatement8=whileStatement();
					state._fsp--;

					node = whileStatement8;
					}
					break;
				case 6 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:92:6: incrementation
					{
					pushFollow(FOLLOW_incrementation_in_statement216);
					incrementation9=incrementation();
					state._fsp--;

					node = incrementation9;
					}
					break;
				case 7 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:93:6: query
					{
					pushFollow(FOLLOW_query_in_statement225);
					query10=query();
					state._fsp--;

					node = query10;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "statement"



	// $ANTLR start "query"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:96:1: query returns [Node node] : ^( 'query' expression ) ;
	public final Node query() throws RecognitionException {
		Node node = null;


		Node expression11 =null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:96:26: ( ^( 'query' expression ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:97:3: ^( 'query' expression )
			{
			match(input,73,FOLLOW_73_in_query245); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_query247);
			expression11=expression();
			state._fsp--;

			node = new QueryNode(expression11, (Connection) context.get("dataSource"));
			match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "query"



	// $ANTLR start "variableCall"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:100:1: variableCall returns [String value] : Identifier ;
	public final String variableCall() throws RecognitionException {
		String value = null;


		CommonTree Identifier12=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:100:36: ( Identifier )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:101:3: Identifier
			{
			Identifier12=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_variableCall264); 
			value=(Identifier12!=null?Identifier12.getText():null);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "variableCall"



	// $ANTLR start "assignment"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:104:1: assignment returns [Node node] : ( ^( ASSIGNMENT i= Identifier (x= indexes )? e= expression ) | ^( 'global' ASSIGNMENT i= Identifier (x= indexes )? e= expression ) );
	public final Node assignment() throws RecognitionException {
		Node node = null;


		CommonTree i=null;
		java.util.List<Node> x =null;
		Node e =null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:105:3: ( ^( ASSIGNMENT i= Identifier (x= indexes )? e= expression ) | ^( 'global' ASSIGNMENT i= Identifier (x= indexes )? e= expression ) )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==ASSIGNMENT) ) {
				alt6=1;
			}
			else if ( (LA6_0==72) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:105:6: ^( ASSIGNMENT i= Identifier (x= indexes )? e= expression )
					{
					match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assignment284); 
					match(input, Token.DOWN, null); 
					i=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_assignment288); 
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:105:33: (x= indexes )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==INDEXES) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:105:33: x= indexes
							{
							pushFollow(FOLLOW_indexes_in_assignment292);
							x=indexes();
							state._fsp--;

							}
							break;

					}

					pushFollow(FOLLOW_expression_in_assignment297);
					e=expression();
					state._fsp--;

					node = new AssignmentNode((i!=null?i.getText():null), x, e, currentScope);
					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:106:6: ^( 'global' ASSIGNMENT i= Identifier (x= indexes )? e= expression )
					{
					match(input,72,FOLLOW_72_in_assignment308); 
					match(input, Token.DOWN, null); 
					match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assignment310); 
					i=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_assignment314); 
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:106:42: (x= indexes )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==INDEXES) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:106:42: x= indexes
							{
							pushFollow(FOLLOW_indexes_in_assignment318);
							x=indexes();
							state._fsp--;

							}
							break;

					}

					pushFollow(FOLLOW_expression_in_assignment323);
					e=expression();
					state._fsp--;


					        Scope globalScope = currentScope;
					        
					        while(globalScope.parent() != null){
					          globalScope = globalScope.parent();
					        }
					        node = new AssignmentNode((i!=null?i.getText():null), x, e, globalScope);
					        
					match(input, Token.UP, null); 

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "assignment"



	// $ANTLR start "functionCall"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:116:1: functionCall returns [Node node] : ( ^( FUNC_CALL Identifier ( exprList )? ) | ^( FUNC_CALL Println ( expression )? ) | ^( FUNC_CALL Print expression ) | ^( FUNC_CALL Assert expression ) | ^( FUNC_CALL Size expression ) );
	public final Node functionCall() throws RecognitionException {
		Node node = null;


		CommonTree Identifier14=null;
		java.util.List<Node> exprList13 =null;
		Node expression15 =null;
		Node expression16 =null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:117:3: ( ^( FUNC_CALL Identifier ( exprList )? ) | ^( FUNC_CALL Println ( expression )? ) | ^( FUNC_CALL Print expression ) | ^( FUNC_CALL Assert expression ) | ^( FUNC_CALL Size expression ) )
			int alt9=5;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==FUNC_CALL) ) {
				int LA9_1 = input.LA(2);
				if ( (LA9_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case Identifier:
						{
						alt9=1;
						}
						break;
					case Println:
						{
						alt9=2;
						}
						break;
					case Print:
						{
						alt9=3;
						}
						break;
					case Assert:
						{
						alt9=4;
						}
						break;
					case Size:
						{
						alt9=5;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 9, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:117:6: ^( FUNC_CALL Identifier ( exprList )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall345); 
					match(input, Token.DOWN, null); 
					Identifier14=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_functionCall347); 
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:117:29: ( exprList )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==EXP_LIST) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:117:29: exprList
							{
							pushFollow(FOLLOW_exprList_in_functionCall349);
							exprList13=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 


					        
					        int paramSize = 0;
					        if(exprList13 == null){
					            paramSize = 0;
					        }else{
					            paramSize = exprList13.size();
					        }
					      Function function = functions.get((Identifier14!=null?Identifier14.getText():null) + paramSize);
					      function.setParameters(paramSize == 0 ? new ArrayList<Node>() : exprList13);
					      node = function;
					      
					  
					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:130:6: ^( FUNC_CALL Println ( expression )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall361); 
					match(input, Token.DOWN, null); 
					match(input,Println,FOLLOW_Println_in_functionCall363); 
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:130:26: ( expression )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( ((LA8_0 >= Add && LA8_0 <= And)||LA8_0==Bool||LA8_0==Divide||LA8_0==Equals||(LA8_0 >= GT && LA8_0 <= GTEquals)||LA8_0==In||(LA8_0 >= LOOKUP && LA8_0 <= Number)||(LA8_0 >= Or && LA8_0 <= Pow)||(LA8_0 >= Subtract && LA8_0 <= TERNARY)||LA8_0==UNARY_MIN||LA8_0==73) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:130:26: expression
							{
							pushFollow(FOLLOW_expression_in_functionCall365);
							expression15=expression();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					node = new PrintlnNode(expression15);
					}
					break;
				case 3 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:131:6: ^( FUNC_CALL Print expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall377); 
					match(input, Token.DOWN, null); 
					match(input,Print,FOLLOW_Print_in_functionCall379); 
					pushFollow(FOLLOW_expression_in_functionCall381);
					expression16=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new PrintNode(expression16);
					}
					break;
				case 4 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:132:6: ^( FUNC_CALL Assert expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall392); 
					match(input, Token.DOWN, null); 
					match(input,Assert,FOLLOW_Assert_in_functionCall394); 
					pushFollow(FOLLOW_expression_in_functionCall396);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 5 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:133:6: ^( FUNC_CALL Size expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall406); 
					match(input, Token.DOWN, null); 
					match(input,Size,FOLLOW_Size_in_functionCall408); 
					pushFollow(FOLLOW_expression_in_functionCall410);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "functionCall"



	// $ANTLR start "ifStatement"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:136:1: ifStatement returns [Node node] : ^( IF ( ^( EXP expression b1= block ) )+ ( ^( EXP b2= block ) )? ) ;
	public final Node ifStatement() throws RecognitionException {
		Node node = null;


		Node b1 =null;
		Node b2 =null;
		Node expression17 =null;


		  IfNode ifNode = new IfNode();
		  node = ifNode;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:141:3: ( ^( IF ( ^( EXP expression b1= block ) )+ ( ^( EXP b2= block ) )? ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:141:6: ^( IF ( ^( EXP expression b1= block ) )+ ( ^( EXP b2= block ) )? )
			{
			match(input,IF,FOLLOW_IF_in_ifStatement436); 
			match(input, Token.DOWN, null); 
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:142:8: ( ^( EXP expression b1= block ) )+
			int cnt10=0;
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==EXP) ) {
					int LA10_1 = input.LA(2);
					if ( (LA10_1==DOWN) ) {
						int LA10_3 = input.LA(3);
						if ( ((LA10_3 >= Add && LA10_3 <= And)||LA10_3==Bool||LA10_3==Divide||LA10_3==Equals||(LA10_3 >= GT && LA10_3 <= GTEquals)||LA10_3==In||(LA10_3 >= LOOKUP && LA10_3 <= Number)||(LA10_3 >= Or && LA10_3 <= Pow)||(LA10_3 >= Subtract && LA10_3 <= TERNARY)||LA10_3==UNARY_MIN||LA10_3==73) ) {
							alt10=1;
						}

					}

				}

				switch (alt10) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:142:9: ^( EXP expression b1= block )
					{
					match(input,EXP,FOLLOW_EXP_in_ifStatement448); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_ifStatement450);
					expression17=expression();
					state._fsp--;

					pushFollow(FOLLOW_block_in_ifStatement454);
					b1=block();
					state._fsp--;

					match(input, Token.UP, null); 

					ifNode.addChoice(expression17, b1);  
					}
					break;

				default :
					if ( cnt10 >= 1 ) break loop10;
					EarlyExitException eee = new EarlyExitException(10, input);
					throw eee;
				}
				cnt10++;
			}

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:143:8: ( ^( EXP b2= block ) )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==EXP) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:143:9: ^( EXP b2= block )
					{
					match(input,EXP,FOLLOW_EXP_in_ifStatement471); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_block_in_ifStatement475);
					b2=block();
					state._fsp--;

					match(input, Token.UP, null); 

					ifNode.addChoice(new AtomNode(true), b2);
					}
					break;

			}

			match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "ifStatement"



	// $ANTLR start "forStatement"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:147:1: forStatement returns [Node node] : ^( For a= assignment b= expression c= afterthought d= block ) ;
	public final Node forStatement() throws RecognitionException {
		Node node = null;


		Node a =null;
		Node b =null;
		Node c =null;
		Node d =null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:148:3: ( ^( For a= assignment b= expression c= afterthought d= block ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:148:6: ^( For a= assignment b= expression c= afterthought d= block )
			{
			match(input,For,FOLLOW_For_in_forStatement520); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_assignment_in_forStatement524);
			a=assignment();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_forStatement528);
			b=expression();
			state._fsp--;

			pushFollow(FOLLOW_afterthought_in_forStatement532);
			c=afterthought();
			state._fsp--;

			pushFollow(FOLLOW_block_in_forStatement536);
			d=block();
			state._fsp--;

			match(input, Token.UP, null); 

			node = new ForNode(a, b, c, d, currentScope);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "forStatement"



	// $ANTLR start "afterthought"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:151:1: afterthought returns [Node node] : ( ( Identifier '=' expression ) | incrementation ) ;
	public final Node afterthought() throws RecognitionException {
		Node node = null;


		CommonTree Identifier18=null;
		Node expression19 =null;
		Node incrementation20 =null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:151:33: ( ( ( Identifier '=' expression ) | incrementation ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:152:3: ( ( Identifier '=' expression ) | incrementation )
			{
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:152:3: ( ( Identifier '=' expression ) | incrementation )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==Identifier) ) {
				int LA12_1 = input.LA(2);
				if ( (LA12_1==Assign) ) {
					alt12=1;
				}
				else if ( (LA12_1==Increment||LA12_1==70) ) {
					alt12=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 12, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:152:4: ( Identifier '=' expression )
					{
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:152:4: ( Identifier '=' expression )
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:152:5: Identifier '=' expression
					{
					Identifier18=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_afterthought557); 
					match(input,Assign,FOLLOW_Assign_in_afterthought559); 
					pushFollow(FOLLOW_expression_in_afterthought561);
					expression19=expression();
					state._fsp--;

					node = new AssignmentNode((Identifier18!=null?Identifier18.getText():null), expression19, currentScope);
					}

					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:153:5: incrementation
					{
					pushFollow(FOLLOW_incrementation_in_afterthought571);
					incrementation20=incrementation();
					state._fsp--;

					node = incrementation20;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "afterthought"



	// $ANTLR start "whileStatement"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:156:1: whileStatement returns [Node node] : ^( While expression block ) ;
	public final Node whileStatement() throws RecognitionException {
		Node node = null;


		Node expression21 =null;
		Node block22 =null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:157:3: ( ^( While expression block ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:157:6: ^( While expression block )
			{
			match(input,While,FOLLOW_While_in_whileStatement591); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_whileStatement593);
			expression21=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_whileStatement595);
			block22=block();
			state._fsp--;

			match(input, Token.UP, null); 

			node = new WhileNode(expression21, block22);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "whileStatement"



	// $ANTLR start "idList"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:160:1: idList returns [java.util.List<String> i] : ^( ID_LIST ( Identifier )+ ) ;
	public final java.util.List<String> idList() throws RecognitionException {
		java.util.List<String> i = null;


		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:161:3: ( ^( ID_LIST ( Identifier )+ ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:161:6: ^( ID_LIST ( Identifier )+ )
			{
			match(input,ID_LIST,FOLLOW_ID_LIST_in_idList617); 
			match(input, Token.DOWN, null); 
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:161:16: ( Identifier )+
			int cnt13=0;
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==Identifier) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:161:16: Identifier
					{
					match(input,Identifier,FOLLOW_Identifier_in_idList619); 
					}
					break;

				default :
					if ( cnt13 >= 1 ) break loop13;
					EarlyExitException eee = new EarlyExitException(13, input);
					throw eee;
				}
				cnt13++;
			}

			match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return i;
	}
	// $ANTLR end "idList"



	// $ANTLR start "exprList"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:164:1: exprList returns [java.util.List<Node> e] : ^( EXP_LIST (a= expression )+ ) ;
	public final java.util.List<Node> exprList() throws RecognitionException {
		java.util.List<Node> e = null;


		Node a =null;


		  e = new ArrayList<Node>();

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:168:3: ( ^( EXP_LIST (a= expression )+ ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:168:6: ^( EXP_LIST (a= expression )+ )
			{
			match(input,EXP_LIST,FOLLOW_EXP_LIST_in_exprList645); 
			match(input, Token.DOWN, null); 
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:168:17: (a= expression )+
			int cnt14=0;
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( ((LA14_0 >= Add && LA14_0 <= And)||LA14_0==Bool||LA14_0==Divide||LA14_0==Equals||(LA14_0 >= GT && LA14_0 <= GTEquals)||LA14_0==In||(LA14_0 >= LOOKUP && LA14_0 <= Number)||(LA14_0 >= Or && LA14_0 <= Pow)||(LA14_0 >= Subtract && LA14_0 <= TERNARY)||LA14_0==UNARY_MIN||LA14_0==73) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:168:18: a= expression
					{
					pushFollow(FOLLOW_expression_in_exprList650);
					a=expression();
					state._fsp--;

					e.add(a);
					}
					break;

				default :
					if ( cnt14 >= 1 ) break loop14;
					EarlyExitException eee = new EarlyExitException(14, input);
					throw eee;
				}
				cnt14++;
			}

			match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "exprList"



	// $ANTLR start "expression"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:172:1: expression returns [Node node] : ( ^( TERNARY expression expression expression ) | ^( In expression expression ) | ^( '||' a= expression b= expression ) | ^( '&&' a= expression b= expression ) | ^( '==' a= expression b= expression ) | ^( '!=' a= expression b= expression ) | ^( '>=' a= expression b= expression ) | ^( '<=' a= expression b= expression ) | ^( '>' a= expression b= expression ) | ^( '<' a= expression b= expression ) | ^( '+' a= expression b= expression ) | ^( '-' a= expression b= expression ) | ^( '*' a= expression b= expression ) | ^( '/' a= expression b= expression ) | ^( '%' expression expression ) | ^( '^' expression expression ) | ^( UNARY_MIN expression ) | ^( NEGATE expression ) | Number | Bool | Null | lookup | query );
	public final Node expression() throws RecognitionException {
		Node node = null;


		CommonTree Number23=null;
		CommonTree Bool24=null;
		Node a =null;
		Node b =null;
		Node lookup25 =null;
		Node query26 =null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:173:3: ( ^( TERNARY expression expression expression ) | ^( In expression expression ) | ^( '||' a= expression b= expression ) | ^( '&&' a= expression b= expression ) | ^( '==' a= expression b= expression ) | ^( '!=' a= expression b= expression ) | ^( '>=' a= expression b= expression ) | ^( '<=' a= expression b= expression ) | ^( '>' a= expression b= expression ) | ^( '<' a= expression b= expression ) | ^( '+' a= expression b= expression ) | ^( '-' a= expression b= expression ) | ^( '*' a= expression b= expression ) | ^( '/' a= expression b= expression ) | ^( '%' expression expression ) | ^( '^' expression expression ) | ^( UNARY_MIN expression ) | ^( NEGATE expression ) | Number | Bool | Null | lookup | query )
			int alt15=23;
			switch ( input.LA(1) ) {
			case TERNARY:
				{
				alt15=1;
				}
				break;
			case In:
				{
				alt15=2;
				}
				break;
			case Or:
				{
				alt15=3;
				}
				break;
			case And:
				{
				alt15=4;
				}
				break;
			case Equals:
				{
				alt15=5;
				}
				break;
			case NEquals:
				{
				alt15=6;
				}
				break;
			case GTEquals:
				{
				alt15=7;
				}
				break;
			case LTEquals:
				{
				alt15=8;
				}
				break;
			case GT:
				{
				alt15=9;
				}
				break;
			case LT:
				{
				alt15=10;
				}
				break;
			case Add:
				{
				alt15=11;
				}
				break;
			case Subtract:
				{
				alt15=12;
				}
				break;
			case Multiply:
				{
				alt15=13;
				}
				break;
			case Divide:
				{
				alt15=14;
				}
				break;
			case Modulus:
				{
				alt15=15;
				}
				break;
			case Pow:
				{
				alt15=16;
				}
				break;
			case UNARY_MIN:
				{
				alt15=17;
				}
				break;
			case NEGATE:
				{
				alt15=18;
				}
				break;
			case Number:
				{
				alt15=19;
				}
				break;
			case Bool:
				{
				alt15=20;
				}
				break;
			case Null:
				{
				alt15=21;
				}
				break;
			case LOOKUP:
				{
				alt15=22;
				}
				break;
			case 73:
				{
				alt15=23;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}
			switch (alt15) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:173:6: ^( TERNARY expression expression expression )
					{
					match(input,TERNARY,FOLLOW_TERNARY_in_expression676); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression678);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression680);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression682);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:174:6: ^( In expression expression )
					{
					match(input,In,FOLLOW_In_in_expression691); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression693);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression695);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:175:6: ^( '||' a= expression b= expression )
					{
					match(input,Or,FOLLOW_Or_in_expression704); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression708);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression712);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 4 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:176:6: ^( '&&' a= expression b= expression )
					{
					match(input,And,FOLLOW_And_in_expression722); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression726);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression730);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 5 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:177:6: ^( '==' a= expression b= expression )
					{
					match(input,Equals,FOLLOW_Equals_in_expression740); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression744);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression748);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new EqualsNode(a, b);
					}
					break;
				case 6 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:178:6: ^( '!=' a= expression b= expression )
					{
					match(input,NEquals,FOLLOW_NEquals_in_expression759); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression763);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression767);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new NotEqualsNode(a, b);
					}
					break;
				case 7 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:179:6: ^( '>=' a= expression b= expression )
					{
					match(input,GTEquals,FOLLOW_GTEquals_in_expression778); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression782);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression786);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GreaterThanAndEqualsNode(a, b);
					}
					break;
				case 8 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:180:6: ^( '<=' a= expression b= expression )
					{
					match(input,LTEquals,FOLLOW_LTEquals_in_expression797); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression801);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression805);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new LessThanAndEqualsNode(a, b);
					}
					break;
				case 9 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:181:6: ^( '>' a= expression b= expression )
					{
					match(input,GT,FOLLOW_GT_in_expression816); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression820);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression824);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GreaterThanNode(a, b);
					}
					break;
				case 10 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:182:6: ^( '<' a= expression b= expression )
					{
					match(input,LT,FOLLOW_LT_in_expression835); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression839);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression843);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new LessThanNode(a, b);
					}
					break;
				case 11 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:183:6: ^( '+' a= expression b= expression )
					{
					match(input,Add,FOLLOW_Add_in_expression854); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression858);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression862);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new AddNode(a, b);
					}
					break;
				case 12 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:184:6: ^( '-' a= expression b= expression )
					{
					match(input,Subtract,FOLLOW_Subtract_in_expression873); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression877);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression881);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new SubNode(a, b);
					}
					break;
				case 13 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:185:6: ^( '*' a= expression b= expression )
					{
					match(input,Multiply,FOLLOW_Multiply_in_expression892); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression896);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression900);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new MultiplicationNode(a, b);
					}
					break;
				case 14 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:186:6: ^( '/' a= expression b= expression )
					{
					match(input,Divide,FOLLOW_Divide_in_expression911); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression915);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression919);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new DivisionNode(a, b);
					}
					break;
				case 15 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:187:6: ^( '%' expression expression )
					{
					match(input,Modulus,FOLLOW_Modulus_in_expression930); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression932);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression934);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 16 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:188:6: ^( '^' expression expression )
					{
					match(input,Pow,FOLLOW_Pow_in_expression943); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression945);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression947);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 17 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:189:6: ^( UNARY_MIN expression )
					{
					match(input,UNARY_MIN,FOLLOW_UNARY_MIN_in_expression956); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression958);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 18 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:190:6: ^( NEGATE expression )
					{
					match(input,NEGATE,FOLLOW_NEGATE_in_expression967); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression969);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 19 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:191:6: Number
					{
					Number23=(CommonTree)match(input,Number,FOLLOW_Number_in_expression977); 
					node = new AtomNode(Double.parseDouble((Number23!=null?Number23.getText():null)));
					}
					break;
				case 20 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:192:6: Bool
					{
					Bool24=(CommonTree)match(input,Bool,FOLLOW_Bool_in_expression986); 
					node = new AtomNode(new Boolean((Bool24!=null?Bool24.getText():null)));
					}
					break;
				case 21 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:193:6: Null
					{
					match(input,Null,FOLLOW_Null_in_expression996); 
					}
					break;
				case 22 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:194:6: lookup
					{
					pushFollow(FOLLOW_lookup_in_expression1003);
					lookup25=lookup();
					state._fsp--;

					node = lookup25;
					}
					break;
				case 23 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:195:6: query
					{
					pushFollow(FOLLOW_query_in_expression1014);
					query26=query();
					state._fsp--;

					node = query26;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "expression"



	// $ANTLR start "incrementation"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:198:1: incrementation returns [Node node] : ( variableCall ( '++' | '--' ) ) ;
	public final Node incrementation() throws RecognitionException {
		Node node = null;


		String variableCall27 =null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:199:3: ( ( variableCall ( '++' | '--' ) ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:199:4: ( variableCall ( '++' | '--' ) )
			{
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:199:4: ( variableCall ( '++' | '--' ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:199:5: variableCall ( '++' | '--' )
			{
			pushFollow(FOLLOW_variableCall_in_incrementation1033);
			variableCall27=variableCall();
			state._fsp--;

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:199:18: ( '++' | '--' )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==Increment) ) {
				alt16=1;
			}
			else if ( (LA16_0==70) ) {
				alt16=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:199:19: '++'
					{
					match(input,Increment,FOLLOW_Increment_in_incrementation1036); 
					node = new IncrementationNode(variableCall27,1,currentScope);
					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:200:5: '--'
					{
					match(input,70,FOLLOW_70_in_incrementation1043); 
					node = new IncrementationNode(variableCall27,-1,currentScope);
					}
					break;

			}

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "incrementation"



	// $ANTLR start "lookup"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:204:1: lookup returns [Node node] : ( ^( LOOKUP functionCall ( indexes )? ) | ^( LOOKUP list ( indexes )? ) | ^( LOOKUP expression ( indexes )? ) | ^( LOOKUP i= Identifier (x= indexes )? ) | ^( LOOKUP String ( indexes )? ) );
	public final Node lookup() throws RecognitionException {
		Node node = null;


		CommonTree i=null;
		CommonTree String28=null;
		java.util.List<Node> x =null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:205:3: ( ^( LOOKUP functionCall ( indexes )? ) | ^( LOOKUP list ( indexes )? ) | ^( LOOKUP expression ( indexes )? ) | ^( LOOKUP i= Identifier (x= indexes )? ) | ^( LOOKUP String ( indexes )? ) )
			int alt22=5;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==LOOKUP) ) {
				int LA22_1 = input.LA(2);
				if ( (LA22_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case Identifier:
						{
						alt22=4;
						}
						break;
					case String:
						{
						alt22=5;
						}
						break;
					case FUNC_CALL:
						{
						alt22=1;
						}
						break;
					case LIST:
						{
						alt22=2;
						}
						break;
					case Add:
					case And:
					case Bool:
					case Divide:
					case Equals:
					case GT:
					case GTEquals:
					case In:
					case LOOKUP:
					case LT:
					case LTEquals:
					case Modulus:
					case Multiply:
					case NEGATE:
					case NEquals:
					case Null:
					case Number:
					case Or:
					case Pow:
					case Subtract:
					case TERNARY:
					case UNARY_MIN:
					case 73:
						{
						alt22=3;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 22, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 22, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:205:6: ^( LOOKUP functionCall ( indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup1067); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_functionCall_in_lookup1069);
					functionCall();
					state._fsp--;

					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:205:28: ( indexes )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==INDEXES) ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:205:28: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1071);
							indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:206:6: ^( LOOKUP list ( indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup1081); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_list_in_lookup1083);
					list();
					state._fsp--;

					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:206:20: ( indexes )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==INDEXES) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:206:20: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1085);
							indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:207:6: ^( LOOKUP expression ( indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup1095); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_lookup1097);
					expression();
					state._fsp--;

					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:207:26: ( indexes )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==INDEXES) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:207:26: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1099);
							indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					}
					break;
				case 4 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:208:6: ^( LOOKUP i= Identifier (x= indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup1110); 
					match(input, Token.DOWN, null); 
					i=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_lookup1114); 
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:208:29: (x= indexes )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==INDEXES) ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:208:29: x= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1118);
							x=indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 


					        node = (x != null) ? 
					          new LookupNode(new IdentifierNode((i!=null?i.getText():null), currentScope), x) : 
					          new IdentifierNode((i!=null?i.getText():null), currentScope);
					      
					}
					break;
				case 5 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:214:6: ^( LOOKUP String ( indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup1137); 
					match(input, Token.DOWN, null); 
					String28=(CommonTree)match(input,String,FOLLOW_String_in_lookup1139); 
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:214:22: ( indexes )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==INDEXES) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:214:22: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1141);
							indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 


					        node = new AtomNode((String28!=null?String28.getText():null));
					      
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "lookup"



	// $ANTLR start "list"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:219:1: list returns [Node node] : ^( LIST ( exprList )? ) ;
	public final Node list() throws RecognitionException {
		Node node = null;


		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:220:3: ( ^( LIST ( exprList )? ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:220:6: ^( LIST ( exprList )? )
			{
			match(input,LIST,FOLLOW_LIST_in_list1166); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:220:13: ( exprList )?
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==EXP_LIST) ) {
					alt23=1;
				}
				switch (alt23) {
					case 1 :
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:220:13: exprList
						{
						pushFollow(FOLLOW_exprList_in_list1168);
						exprList();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return node;
	}
	// $ANTLR end "list"



	// $ANTLR start "indexes"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:223:1: indexes returns [java.util.List<Node> e] : ^( INDEXES ( expression )+ ) ;
	public final java.util.List<Node> indexes() throws RecognitionException {
		java.util.List<Node> e = null;


		Node expression29 =null;

		e = new java.util.ArrayList<Node>();
		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:225:3: ( ^( INDEXES ( expression )+ ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:225:6: ^( INDEXES ( expression )+ )
			{
			match(input,INDEXES,FOLLOW_INDEXES_in_indexes1194); 
			match(input, Token.DOWN, null); 
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:225:16: ( expression )+
			int cnt24=0;
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( ((LA24_0 >= Add && LA24_0 <= And)||LA24_0==Bool||LA24_0==Divide||LA24_0==Equals||(LA24_0 >= GT && LA24_0 <= GTEquals)||LA24_0==In||(LA24_0 >= LOOKUP && LA24_0 <= Number)||(LA24_0 >= Or && LA24_0 <= Pow)||(LA24_0 >= Subtract && LA24_0 <= TERNARY)||LA24_0==UNARY_MIN||LA24_0==73) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:225:17: expression
					{
					pushFollow(FOLLOW_expression_in_indexes1197);
					expression29=expression();
					state._fsp--;

					e.add(expression29);
					}
					break;

				default :
					if ( cnt24 >= 1 ) break loop24;
					EarlyExitException eee = new EarlyExitException(24, input);
					throw eee;
				}
				cnt24++;
			}

			match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "indexes"

	// Delegated rules



	public static final BitSet FOLLOW_block_in_program51 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCK_in_block84 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_STATEMENTS_in_block97 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statement_in_block100 = new BitSet(new long[]{0x0000000A30000018L,0x0000000000000320L});
	public static final BitSet FOLLOW_RETURN_in_block120 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_block127 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assignment_in_statement159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_statement172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_statement183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forStatement_in_statement195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStatement_in_statement207 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incrementation_in_statement216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_query_in_statement225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_73_in_query245 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_query247 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_variableCall264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGNMENT_in_assignment284 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_assignment288 = new BitSet(new long[]{0x0063FE24C2080460L,0x0000000000000216L});
	public static final BitSet FOLLOW_indexes_in_assignment292 = new BitSet(new long[]{0x0063FE20C2080460L,0x0000000000000216L});
	public static final BitSet FOLLOW_expression_in_assignment297 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_72_in_assignment308 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ASSIGNMENT_in_assignment310 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_Identifier_in_assignment314 = new BitSet(new long[]{0x0063FE24C2080460L,0x0000000000000216L});
	public static final BitSet FOLLOW_indexes_in_assignment318 = new BitSet(new long[]{0x0063FE20C2080460L,0x0000000000000216L});
	public static final BitSet FOLLOW_expression_in_assignment323 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall345 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_functionCall347 = new BitSet(new long[]{0x0000000000400008L});
	public static final BitSet FOLLOW_exprList_in_functionCall349 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall361 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Println_in_functionCall363 = new BitSet(new long[]{0x0063FE20C2080468L,0x0000000000000216L});
	public static final BitSet FOLLOW_expression_in_functionCall365 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall377 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Print_in_functionCall379 = new BitSet(new long[]{0x0063FE20C2080460L,0x0000000000000216L});
	public static final BitSet FOLLOW_expression_in_functionCall381 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall392 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Assert_in_functionCall394 = new BitSet(new long[]{0x0063FE20C2080460L,0x0000000000000216L});
	public static final BitSet FOLLOW_expression_in_functionCall396 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall406 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Size_in_functionCall408 = new BitSet(new long[]{0x0063FE20C2080460L,0x0000000000000216L});
	public static final BitSet FOLLOW_expression_in_functionCall410 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IF_in_ifStatement436 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_EXP_in_ifStatement448 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_ifStatement450 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_block_in_ifStatement454 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXP_in_ifStatement471 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_block_in_ifStatement475 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_For_in_forStatement520 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assignment_in_forStatement524 = new BitSet(new long[]{0x0063FE20C2080460L,0x0000000000000216L});
	public static final BitSet FOLLOW_expression_in_forStatement528 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_afterthought_in_forStatement532 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_block_in_forStatement536 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_afterthought557 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Assign_in_afterthought559 = new BitSet(new long[]{0x0063FE20C2080460L,0x0000000000000216L});
	public static final BitSet FOLLOW_expression_in_afterthought561 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incrementation_in_afterthought571 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_While_in_whileStatement591 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_whileStatement593 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_block_in_whileStatement595 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_LIST_in_idList617 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_idList619 = new BitSet(new long[]{0x0000000800000008L});
	public static final BitSet FOLLOW_EXP_LIST_in_exprList645 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_exprList650 = new BitSet(new long[]{0x0063FE20C2080468L,0x0000000000000216L});
	public static final BitSet FOLLOW_TERNARY_in_expression676 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression678 = new BitSet(new long[]{0x0063FE20C2080460L,0x0000000000000216L});
	public static final BitSet FOLLOW_expression_in_expression680 = new BitSet(new long[]{0x0063FE20C2080460L,0x0000000000000216L});
	public static final BitSet FOLLOW_expression_in_expression682 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_In_in_expression691 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression693 = new BitSet(new long[]{0x0063FE20C2080460L,0x0000000000000216L});
	public static final BitSet FOLLOW_expression_in_expression695 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Or_in_expression704 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression708 = new BitSet(new long[]{0x0063FE20C2080460L,0x0000000000000216L});
	public static final BitSet FOLLOW_expression_in_expression712 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_And_in_expression722 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression726 = new BitSet(new long[]{0x0063FE20C2080460L,0x0000000000000216L});
	public static final BitSet FOLLOW_expression_in_expression730 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Equals_in_expression740 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression744 = new BitSet(new long[]{0x0063FE20C2080460L,0x0000000000000216L});
	public static final BitSet FOLLOW_expression_in_expression748 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEquals_in_expression759 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression763 = new BitSet(new long[]{0x0063FE20C2080460L,0x0000000000000216L});
	public static final BitSet FOLLOW_expression_in_expression767 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GTEquals_in_expression778 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression782 = new BitSet(new long[]{0x0063FE20C2080460L,0x0000000000000216L});
	public static final BitSet FOLLOW_expression_in_expression786 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LTEquals_in_expression797 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression801 = new BitSet(new long[]{0x0063FE20C2080460L,0x0000000000000216L});
	public static final BitSet FOLLOW_expression_in_expression805 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_expression816 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression820 = new BitSet(new long[]{0x0063FE20C2080460L,0x0000000000000216L});
	public static final BitSet FOLLOW_expression_in_expression824 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LT_in_expression835 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression839 = new BitSet(new long[]{0x0063FE20C2080460L,0x0000000000000216L});
	public static final BitSet FOLLOW_expression_in_expression843 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Add_in_expression854 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression858 = new BitSet(new long[]{0x0063FE20C2080460L,0x0000000000000216L});
	public static final BitSet FOLLOW_expression_in_expression862 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Subtract_in_expression873 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression877 = new BitSet(new long[]{0x0063FE20C2080460L,0x0000000000000216L});
	public static final BitSet FOLLOW_expression_in_expression881 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Multiply_in_expression892 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression896 = new BitSet(new long[]{0x0063FE20C2080460L,0x0000000000000216L});
	public static final BitSet FOLLOW_expression_in_expression900 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Divide_in_expression911 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression915 = new BitSet(new long[]{0x0063FE20C2080460L,0x0000000000000216L});
	public static final BitSet FOLLOW_expression_in_expression919 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Modulus_in_expression930 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression932 = new BitSet(new long[]{0x0063FE20C2080460L,0x0000000000000216L});
	public static final BitSet FOLLOW_expression_in_expression934 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Pow_in_expression943 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression945 = new BitSet(new long[]{0x0063FE20C2080460L,0x0000000000000216L});
	public static final BitSet FOLLOW_expression_in_expression947 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNARY_MIN_in_expression956 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression958 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEGATE_in_expression967 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression969 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Number_in_expression977 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Bool_in_expression986 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Null_in_expression996 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lookup_in_expression1003 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_query_in_expression1014 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableCall_in_incrementation1033 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_Increment_in_incrementation1036 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_70_in_incrementation1043 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup1067 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_functionCall_in_lookup1069 = new BitSet(new long[]{0x0000000400000008L});
	public static final BitSet FOLLOW_indexes_in_lookup1071 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup1081 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_list_in_lookup1083 = new BitSet(new long[]{0x0000000400000008L});
	public static final BitSet FOLLOW_indexes_in_lookup1085 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup1095 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_lookup1097 = new BitSet(new long[]{0x0000000400000008L});
	public static final BitSet FOLLOW_indexes_in_lookup1099 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup1110 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_lookup1114 = new BitSet(new long[]{0x0000000400000008L});
	public static final BitSet FOLLOW_indexes_in_lookup1118 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup1137 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_String_in_lookup1139 = new BitSet(new long[]{0x0000000400000008L});
	public static final BitSet FOLLOW_indexes_in_lookup1141 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LIST_in_list1166 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exprList_in_list1168 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INDEXES_in_indexes1194 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_indexes1197 = new BitSet(new long[]{0x0063FE20C2080468L,0x0000000000000216L});
}