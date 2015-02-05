// $ANTLR 3.5.2 D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g 2015-02-06 00:08:30

  package bg.tues.DCL;
  import bg.tues.DCL.*;
  import bg.tues.DCL.tree.*;
  import bg.tues.DCL.tree.functions.PrintlnNode;
  import bg.tues.DCL.tree.functions.PrintNode;
  import bg.tues.DCL.tree.functions.QueryNode;
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
		"End", "Equals", "Escape", "Excl", "FUNCTION", "FUNC_CALL", "For", "GT", 
		"GTEquals", "ID_LIST", "IF", "INDEXES", "Identifier", "If", "In", "Increment", 
		"Int", "LIST", "LOOKUP", "LT", "LTEquals", "Modulus", "Multiply", "NEGATE", 
		"NEquals", "Null", "Number", "OBrace", "OBracket", "OParen", "Or", "PRINT", 
		"PRINTLN", "Pow", "Print", "Println", "QMark", "RETURN", "Return", "SColon", 
		"STATEMENTS", "Size", "Space", "String", "Subtract", "TERNARY", "To", 
		"UNARY_MIN", "While", "'--'", "'func'", "'global'", "'query'"
	};
	public static final int EOF=-1;
	public static final int T__73=73;
	public static final int T__74=74;
	public static final int T__75=75;
	public static final int T__76=76;
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
	public static final int Escape=26;
	public static final int Excl=27;
	public static final int FUNCTION=28;
	public static final int FUNC_CALL=29;
	public static final int For=30;
	public static final int GT=31;
	public static final int GTEquals=32;
	public static final int ID_LIST=33;
	public static final int IF=34;
	public static final int INDEXES=35;
	public static final int Identifier=36;
	public static final int If=37;
	public static final int In=38;
	public static final int Increment=39;
	public static final int Int=40;
	public static final int LIST=41;
	public static final int LOOKUP=42;
	public static final int LT=43;
	public static final int LTEquals=44;
	public static final int Modulus=45;
	public static final int Multiply=46;
	public static final int NEGATE=47;
	public static final int NEquals=48;
	public static final int Null=49;
	public static final int Number=50;
	public static final int OBrace=51;
	public static final int OBracket=52;
	public static final int OParen=53;
	public static final int Or=54;
	public static final int PRINT=55;
	public static final int PRINTLN=56;
	public static final int Pow=57;
	public static final int Print=58;
	public static final int Println=59;
	public static final int QMark=60;
	public static final int RETURN=61;
	public static final int Return=62;
	public static final int SColon=63;
	public static final int STATEMENTS=64;
	public static final int Size=65;
	public static final int Space=66;
	public static final int String=67;
	public static final int Subtract=68;
	public static final int TERNARY=69;
	public static final int To=70;
	public static final int UNARY_MIN=71;
	public static final int While=72;

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
	@Override public String getGrammarFileName() { return "D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g"; }


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



	// $ANTLR start "program"
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:76:1: program returns [Value returnValue] : block ;
	public final Value program() throws RecognitionException {
		Value returnValue = null;


		Node block1 =null;

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:77:3: ( block )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:77:6: block
			{
			pushFollow(FOLLOW_block_in_program51);
			block1=block();
			state._fsp--;


			      returnValue = block1.evaluate(); 
			    
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return returnValue;
	}
	// $ANTLR end "program"



	// $ANTLR start "block"
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:82:1: block returns [Node node] : ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) ;
	public final Node block() throws RecognitionException {
		Node node = null;


		Node statement2 =null;
		Node expression3 =null;


		  BlockNode bn = new BlockNode();
		  node = bn;
		  if(currentScope == null) {
		    currentScope = globalScope;
		  } else {
		    Scope scope = new Scope(currentScope);
		    currentScope = scope;
		  }

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:98:3: ( ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:98:6: ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) )
			{
			match(input,BLOCK,FOLLOW_BLOCK_in_block84); 
			match(input, Token.DOWN, null); 
			match(input,STATEMENTS,FOLLOW_STATEMENTS_in_block97); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:99:23: ( statement )*
				loop1:
				while (true) {
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==ASSIGNMENT||(LA1_0 >= FUNC_CALL && LA1_0 <= For)||LA1_0==IF||LA1_0==Identifier||(LA1_0 >= PRINT && LA1_0 <= PRINTLN)||LA1_0==While||(LA1_0 >= 75 && LA1_0 <= 76)) ) {
						alt1=1;
					}

					switch (alt1) {
					case 1 :
						// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:99:24: statement
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
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:100:23: ( expression )?
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= Add && LA2_0 <= And)||LA2_0==Bool||LA2_0==Divide||LA2_0==Equals||(LA2_0 >= GT && LA2_0 <= GTEquals)||LA2_0==In||(LA2_0 >= LOOKUP && LA2_0 <= Number)||LA2_0==Or||LA2_0==Pow||(LA2_0 >= Subtract && LA2_0 <= TERNARY)||LA2_0==UNARY_MIN||LA2_0==76) ) {
					alt2=1;
				}
				switch (alt2) {
					case 1 :
						// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:100:24: expression
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

			 
			  if(currentScope != null){
			    currentScope = currentScope.parent();
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
	// $ANTLR end "block"



	// $ANTLR start "statement"
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:104:1: statement returns [Node node] : ( assignment | functionCall | ifStatement | forStatement | whileStatement | incrementation | query | println | print );
	public final Node statement() throws RecognitionException {
		Node node = null;


		Node assignment4 =null;
		Node functionCall5 =null;
		Node ifStatement6 =null;
		Node forStatement7 =null;
		Node whileStatement8 =null;
		Node incrementation9 =null;
		Node query10 =null;
		Node println11 =null;
		Node print12 =null;

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:105:3: ( assignment | functionCall | ifStatement | forStatement | whileStatement | incrementation | query | println | print )
			int alt3=9;
			switch ( input.LA(1) ) {
			case ASSIGNMENT:
			case 75:
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
			case 76:
				{
				alt3=7;
				}
				break;
			case PRINTLN:
				{
				alt3=8;
				}
				break;
			case PRINT:
				{
				alt3=9;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:105:6: assignment
					{
					pushFollow(FOLLOW_assignment_in_statement159);
					assignment4=assignment();
					state._fsp--;

					node = assignment4;
					}
					break;
				case 2 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:106:6: functionCall
					{
					pushFollow(FOLLOW_functionCall_in_statement172);
					functionCall5=functionCall();
					state._fsp--;

					node = functionCall5;
					}
					break;
				case 3 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:107:6: ifStatement
					{
					pushFollow(FOLLOW_ifStatement_in_statement183);
					ifStatement6=ifStatement();
					state._fsp--;

					node = ifStatement6;
					}
					break;
				case 4 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:108:6: forStatement
					{
					pushFollow(FOLLOW_forStatement_in_statement195);
					forStatement7=forStatement();
					state._fsp--;

					node = forStatement7;
					}
					break;
				case 5 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:109:6: whileStatement
					{
					pushFollow(FOLLOW_whileStatement_in_statement207);
					whileStatement8=whileStatement();
					state._fsp--;

					node = whileStatement8;
					}
					break;
				case 6 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:110:6: incrementation
					{
					pushFollow(FOLLOW_incrementation_in_statement216);
					incrementation9=incrementation();
					state._fsp--;

					node = incrementation9;
					}
					break;
				case 7 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:111:6: query
					{
					pushFollow(FOLLOW_query_in_statement225);
					query10=query();
					state._fsp--;

					node = query10;
					}
					break;
				case 8 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:112:6: println
					{
					pushFollow(FOLLOW_println_in_statement234);
					println11=println();
					state._fsp--;

					node = println11;
					}
					break;
				case 9 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:113:6: print
					{
					pushFollow(FOLLOW_print_in_statement243);
					print12=print();
					state._fsp--;

					node = print12;
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
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:116:1: query returns [Node node] : ^( 'query' ( expression | functionCall ) ) ;
	public final Node query() throws RecognitionException {
		Node node = null;


		Node expression13 =null;
		Node functionCall14 =null;

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:116:26: ( ^( 'query' ( expression | functionCall ) ) )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:117:3: ^( 'query' ( expression | functionCall ) )
			{
			match(input,76,FOLLOW_76_in_query263); 
			match(input, Token.DOWN, null); 
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:117:13: ( expression | functionCall )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( ((LA4_0 >= Add && LA4_0 <= And)||LA4_0==Bool||LA4_0==Divide||LA4_0==Equals||(LA4_0 >= GT && LA4_0 <= GTEquals)||LA4_0==In||(LA4_0 >= LOOKUP && LA4_0 <= Number)||LA4_0==Or||LA4_0==Pow||(LA4_0 >= Subtract && LA4_0 <= TERNARY)||LA4_0==UNARY_MIN||LA4_0==76) ) {
				alt4=1;
			}
			else if ( (LA4_0==FUNC_CALL) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:117:14: expression
					{
					pushFollow(FOLLOW_expression_in_query266);
					expression13=expression();
					state._fsp--;

					node = new QueryNode(expression13, dataSource);
					}
					break;
				case 2 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:118:5: functionCall
					{
					pushFollow(FOLLOW_functionCall_in_query274);
					functionCall14=functionCall();
					state._fsp--;

					node = new QueryNode(functionCall14, dataSource);
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
	// $ANTLR end "query"



	// $ANTLR start "variableCall"
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:121:1: variableCall returns [String value] : Identifier ;
	public final String variableCall() throws RecognitionException {
		String value = null;


		CommonTree Identifier15=null;

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:121:36: ( Identifier )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:122:3: Identifier
			{
			Identifier15=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_variableCall292); 
			value=(Identifier15!=null?Identifier15.getText():null);
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
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:125:1: assignment returns [Node node] : ( ^( ASSIGNMENT i= Identifier (x= indexes )? ( expression | functionCall ) ) | ^( 'global' ASSIGNMENT i= Identifier (x= indexes )? ( expression | functionCall ) ) );
	public final Node assignment() throws RecognitionException {
		Node node = null;


		CommonTree i=null;
		java.util.List<Node> x =null;
		Node expression16 =null;
		Node functionCall17 =null;
		Node expression18 =null;
		Node functionCall19 =null;

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:126:3: ( ^( ASSIGNMENT i= Identifier (x= indexes )? ( expression | functionCall ) ) | ^( 'global' ASSIGNMENT i= Identifier (x= indexes )? ( expression | functionCall ) ) )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==ASSIGNMENT) ) {
				alt9=1;
			}
			else if ( (LA9_0==75) ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:126:6: ^( ASSIGNMENT i= Identifier (x= indexes )? ( expression | functionCall ) )
					{
					match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assignment312); 
					match(input, Token.DOWN, null); 
					i=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_assignment316); 
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:126:33: (x= indexes )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==INDEXES) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:126:33: x= indexes
							{
							pushFollow(FOLLOW_indexes_in_assignment320);
							x=indexes();
							state._fsp--;

							}
							break;

					}

					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:126:43: ( expression | functionCall )
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( ((LA6_0 >= Add && LA6_0 <= And)||LA6_0==Bool||LA6_0==Divide||LA6_0==Equals||(LA6_0 >= GT && LA6_0 <= GTEquals)||LA6_0==In||(LA6_0 >= LOOKUP && LA6_0 <= Number)||LA6_0==Or||LA6_0==Pow||(LA6_0 >= Subtract && LA6_0 <= TERNARY)||LA6_0==UNARY_MIN||LA6_0==76) ) {
						alt6=1;
					}
					else if ( (LA6_0==FUNC_CALL) ) {
						alt6=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 6, 0, input);
						throw nvae;
					}

					switch (alt6) {
						case 1 :
							// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:126:44: expression
							{
							pushFollow(FOLLOW_expression_in_assignment324);
							expression16=expression();
							state._fsp--;

							node = new AssignmentNode((i!=null?i.getText():null), x, expression16, currentScope);
							}
							break;
						case 2 :
							// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:127:6: functionCall
							{
							pushFollow(FOLLOW_functionCall_in_assignment333);
							functionCall17=functionCall();
							state._fsp--;

							node = new AssignmentNode((i!=null?i.getText():null), x, functionCall17, currentScope);
							}
							break;

					}

					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:128:6: ^( 'global' ASSIGNMENT i= Identifier (x= indexes )? ( expression | functionCall ) )
					{
					match(input,75,FOLLOW_75_in_assignment345); 
					match(input, Token.DOWN, null); 
					match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assignment347); 
					i=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_assignment351); 
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:128:42: (x= indexes )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==INDEXES) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:128:42: x= indexes
							{
							pushFollow(FOLLOW_indexes_in_assignment355);
							x=indexes();
							state._fsp--;

							}
							break;

					}

					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:128:52: ( expression | functionCall )
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( ((LA8_0 >= Add && LA8_0 <= And)||LA8_0==Bool||LA8_0==Divide||LA8_0==Equals||(LA8_0 >= GT && LA8_0 <= GTEquals)||LA8_0==In||(LA8_0 >= LOOKUP && LA8_0 <= Number)||LA8_0==Or||LA8_0==Pow||(LA8_0 >= Subtract && LA8_0 <= TERNARY)||LA8_0==UNARY_MIN||LA8_0==76) ) {
						alt8=1;
					}
					else if ( (LA8_0==FUNC_CALL) ) {
						alt8=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 8, 0, input);
						throw nvae;
					}

					switch (alt8) {
						case 1 :
							// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:128:53: expression
							{
							pushFollow(FOLLOW_expression_in_assignment359);
							expression18=expression();
							state._fsp--;


							        Scope globalScope = currentScope;
							        
							        while(globalScope.parent() != null){
							          globalScope = globalScope.parent();
							        }
							        node = new AssignmentNode((i!=null?i.getText():null), x, expression18, globalScope);
							        
							}
							break;
						case 2 :
							// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:136:7: functionCall
							{
							pushFollow(FOLLOW_functionCall_in_assignment369);
							functionCall19=functionCall();
							state._fsp--;


							        Scope globalScope = currentScope;
							        
							        while(globalScope.parent() != null){
							          globalScope = globalScope.parent();
							        }
							        node = new AssignmentNode((i!=null?i.getText():null), x, functionCall19, globalScope);
							        
							}
							break;

					}

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
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:146:1: functionCall returns [Node node] : ( ^( FUNC_CALL Identifier ( exprList )? ) | ^( FUNC_CALL Assert expression ) | ^( FUNC_CALL Size expression ) );
	public final Node functionCall() throws RecognitionException {
		Node node = null;


		CommonTree Identifier21=null;
		java.util.List<Node> exprList20 =null;

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:147:3: ( ^( FUNC_CALL Identifier ( exprList )? ) | ^( FUNC_CALL Assert expression ) | ^( FUNC_CALL Size expression ) )
			int alt11=3;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==FUNC_CALL) ) {
				int LA11_1 = input.LA(2);
				if ( (LA11_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case Identifier:
						{
						alt11=1;
						}
						break;
					case Assert:
						{
						alt11=2;
						}
						break;
					case Size:
						{
						alt11=3;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 11, 2, input);
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
							new NoViableAltException("", 11, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:147:6: ^( FUNC_CALL Identifier ( exprList )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall392); 
					match(input, Token.DOWN, null); 
					Identifier21=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_functionCall394); 
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:147:29: ( exprList )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==EXP_LIST) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:147:29: exprList
							{
							pushFollow(FOLLOW_exprList_in_functionCall396);
							exprList20=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 


					        
					        int paramSize = 0;
					        if(exprList20 == null){
					            paramSize = 0;
					        }else{
					            paramSize = exprList20.size();
					        }
					      Function function = functions.get((Identifier21!=null?Identifier21.getText():null) + paramSize);
					      function.setParameters(paramSize == 0 ? new ArrayList<Node>() : exprList20);
					      node = function;
					      
					  
					}
					break;
				case 2 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:163:6: ^( FUNC_CALL Assert expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall411); 
					match(input, Token.DOWN, null); 
					match(input,Assert,FOLLOW_Assert_in_functionCall413); 
					pushFollow(FOLLOW_expression_in_functionCall415);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:164:6: ^( FUNC_CALL Size expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall425); 
					match(input, Token.DOWN, null); 
					match(input,Size,FOLLOW_Size_in_functionCall427); 
					pushFollow(FOLLOW_expression_in_functionCall429);
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



	// $ANTLR start "println"
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:167:1: println returns [Node node] : ( ^( PRINTLN functionCall ) | ^( PRINTLN ( expression )? ) );
	public final Node println() throws RecognitionException {
		Node node = null;


		Node functionCall22 =null;
		Node expression23 =null;

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:168:3: ( ^( PRINTLN functionCall ) | ^( PRINTLN ( expression )? ) )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==PRINTLN) ) {
				int LA13_1 = input.LA(2);
				if ( (LA13_1==DOWN) ) {
					int LA13_2 = input.LA(3);
					if ( (LA13_2==FUNC_CALL) ) {
						alt13=1;
					}
					else if ( (LA13_2==UP||(LA13_2 >= Add && LA13_2 <= And)||LA13_2==Bool||LA13_2==Divide||LA13_2==Equals||(LA13_2 >= GT && LA13_2 <= GTEquals)||LA13_2==In||(LA13_2 >= LOOKUP && LA13_2 <= Number)||LA13_2==Or||LA13_2==Pow||(LA13_2 >= Subtract && LA13_2 <= TERNARY)||LA13_2==UNARY_MIN||LA13_2==76) ) {
						alt13=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 13, 2, input);
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
							new NoViableAltException("", 13, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:168:6: ^( PRINTLN functionCall )
					{
					match(input,PRINTLN,FOLLOW_PRINTLN_in_println449); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_functionCall_in_println451);
					functionCall22=functionCall();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new PrintlnNode(functionCall22, outputStream);
					}
					break;
				case 2 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:169:6: ^( PRINTLN ( expression )? )
					{
					match(input,PRINTLN,FOLLOW_PRINTLN_in_println462); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:169:16: ( expression )?
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( ((LA12_0 >= Add && LA12_0 <= And)||LA12_0==Bool||LA12_0==Divide||LA12_0==Equals||(LA12_0 >= GT && LA12_0 <= GTEquals)||LA12_0==In||(LA12_0 >= LOOKUP && LA12_0 <= Number)||LA12_0==Or||LA12_0==Pow||(LA12_0 >= Subtract && LA12_0 <= TERNARY)||LA12_0==UNARY_MIN||LA12_0==76) ) {
							alt12=1;
						}
						switch (alt12) {
							case 1 :
								// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:169:16: expression
								{
								pushFollow(FOLLOW_expression_in_println464);
								expression23=expression();
								state._fsp--;

								}
								break;

						}

						match(input, Token.UP, null); 
					}

					node = new PrintlnNode(expression23, outputStream);
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
	// $ANTLR end "println"



	// $ANTLR start "print"
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:172:1: print returns [Node node] : ( ^( PRINT functionCall ) | ^( PRINT ( expression )? ) );
	public final Node print() throws RecognitionException {
		Node node = null;


		Node functionCall24 =null;
		Node expression25 =null;

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:173:3: ( ^( PRINT functionCall ) | ^( PRINT ( expression )? ) )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==PRINT) ) {
				int LA15_1 = input.LA(2);
				if ( (LA15_1==DOWN) ) {
					int LA15_2 = input.LA(3);
					if ( (LA15_2==FUNC_CALL) ) {
						alt15=1;
					}
					else if ( (LA15_2==UP||(LA15_2 >= Add && LA15_2 <= And)||LA15_2==Bool||LA15_2==Divide||LA15_2==Equals||(LA15_2 >= GT && LA15_2 <= GTEquals)||LA15_2==In||(LA15_2 >= LOOKUP && LA15_2 <= Number)||LA15_2==Or||LA15_2==Pow||(LA15_2 >= Subtract && LA15_2 <= TERNARY)||LA15_2==UNARY_MIN||LA15_2==76) ) {
						alt15=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 15, 2, input);
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
							new NoViableAltException("", 15, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:173:6: ^( PRINT functionCall )
					{
					match(input,PRINT,FOLLOW_PRINT_in_print489); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_functionCall_in_print491);
					functionCall24=functionCall();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new PrintNode(functionCall24, outputStream);
					}
					break;
				case 2 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:174:6: ^( PRINT ( expression )? )
					{
					match(input,PRINT,FOLLOW_PRINT_in_print502); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:174:14: ( expression )?
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( ((LA14_0 >= Add && LA14_0 <= And)||LA14_0==Bool||LA14_0==Divide||LA14_0==Equals||(LA14_0 >= GT && LA14_0 <= GTEquals)||LA14_0==In||(LA14_0 >= LOOKUP && LA14_0 <= Number)||LA14_0==Or||LA14_0==Pow||(LA14_0 >= Subtract && LA14_0 <= TERNARY)||LA14_0==UNARY_MIN||LA14_0==76) ) {
							alt14=1;
						}
						switch (alt14) {
							case 1 :
								// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:174:14: expression
								{
								pushFollow(FOLLOW_expression_in_print504);
								expression25=expression();
								state._fsp--;

								}
								break;

						}

						match(input, Token.UP, null); 
					}

					node = new PrintNode(expression25, outputStream);
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
	// $ANTLR end "print"



	// $ANTLR start "ifStatement"
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:177:1: ifStatement returns [Node node] : ^( IF ( ^( EXP expression b1= block ) )+ ( ^( EXP b2= block ) )? ) ;
	public final Node ifStatement() throws RecognitionException {
		Node node = null;


		Node b1 =null;
		Node b2 =null;
		Node expression26 =null;


		  IfNode ifNode = new IfNode();
		  node = ifNode;

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:182:3: ( ^( IF ( ^( EXP expression b1= block ) )+ ( ^( EXP b2= block ) )? ) )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:182:6: ^( IF ( ^( EXP expression b1= block ) )+ ( ^( EXP b2= block ) )? )
			{
			match(input,IF,FOLLOW_IF_in_ifStatement535); 
			match(input, Token.DOWN, null); 
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:183:8: ( ^( EXP expression b1= block ) )+
			int cnt16=0;
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==EXP) ) {
					int LA16_1 = input.LA(2);
					if ( (LA16_1==DOWN) ) {
						int LA16_3 = input.LA(3);
						if ( ((LA16_3 >= Add && LA16_3 <= And)||LA16_3==Bool||LA16_3==Divide||LA16_3==Equals||(LA16_3 >= GT && LA16_3 <= GTEquals)||LA16_3==In||(LA16_3 >= LOOKUP && LA16_3 <= Number)||LA16_3==Or||LA16_3==Pow||(LA16_3 >= Subtract && LA16_3 <= TERNARY)||LA16_3==UNARY_MIN||LA16_3==76) ) {
							alt16=1;
						}

					}

				}

				switch (alt16) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:183:9: ^( EXP expression b1= block )
					{
					match(input,EXP,FOLLOW_EXP_in_ifStatement547); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_ifStatement549);
					expression26=expression();
					state._fsp--;

					pushFollow(FOLLOW_block_in_ifStatement553);
					b1=block();
					state._fsp--;

					match(input, Token.UP, null); 

					ifNode.addChoice(expression26, b1);  
					}
					break;

				default :
					if ( cnt16 >= 1 ) break loop16;
					EarlyExitException eee = new EarlyExitException(16, input);
					throw eee;
				}
				cnt16++;
			}

			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:184:8: ( ^( EXP b2= block ) )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==EXP) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:184:9: ^( EXP b2= block )
					{
					match(input,EXP,FOLLOW_EXP_in_ifStatement570); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_block_in_ifStatement574);
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
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:188:1: forStatement returns [Node node] : ^( For a= assignment b= expression c= afterthought d= block ) ;
	public final Node forStatement() throws RecognitionException {
		Node node = null;


		Node a =null;
		Node b =null;
		Node c =null;
		Node d =null;

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:189:3: ( ^( For a= assignment b= expression c= afterthought d= block ) )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:189:6: ^( For a= assignment b= expression c= afterthought d= block )
			{
			match(input,For,FOLLOW_For_in_forStatement619); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_assignment_in_forStatement623);
			a=assignment();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_forStatement627);
			b=expression();
			state._fsp--;

			pushFollow(FOLLOW_afterthought_in_forStatement631);
			c=afterthought();
			state._fsp--;

			pushFollow(FOLLOW_block_in_forStatement635);
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
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:192:1: afterthought returns [Node node] : ( ( Identifier '=' expression ) | incrementation ) ;
	public final Node afterthought() throws RecognitionException {
		Node node = null;


		CommonTree Identifier27=null;
		Node expression28 =null;
		Node incrementation29 =null;

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:192:33: ( ( ( Identifier '=' expression ) | incrementation ) )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:193:3: ( ( Identifier '=' expression ) | incrementation )
			{
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:193:3: ( ( Identifier '=' expression ) | incrementation )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==Identifier) ) {
				int LA18_1 = input.LA(2);
				if ( (LA18_1==Assign) ) {
					alt18=1;
				}
				else if ( (LA18_1==Increment||LA18_1==73) ) {
					alt18=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:193:4: ( Identifier '=' expression )
					{
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:193:4: ( Identifier '=' expression )
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:193:5: Identifier '=' expression
					{
					Identifier27=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_afterthought656); 
					match(input,Assign,FOLLOW_Assign_in_afterthought658); 
					pushFollow(FOLLOW_expression_in_afterthought660);
					expression28=expression();
					state._fsp--;

					node = new AssignmentNode((Identifier27!=null?Identifier27.getText():null), expression28, currentScope);
					}

					}
					break;
				case 2 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:194:5: incrementation
					{
					pushFollow(FOLLOW_incrementation_in_afterthought670);
					incrementation29=incrementation();
					state._fsp--;

					node = incrementation29;
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
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:197:1: whileStatement returns [Node node] : ^( While expression block ) ;
	public final Node whileStatement() throws RecognitionException {
		Node node = null;


		Node expression30 =null;
		Node block31 =null;

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:198:3: ( ^( While expression block ) )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:198:6: ^( While expression block )
			{
			match(input,While,FOLLOW_While_in_whileStatement690); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_whileStatement692);
			expression30=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_whileStatement694);
			block31=block();
			state._fsp--;

			match(input, Token.UP, null); 

			node = new WhileNode(expression30, block31);
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
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:201:1: idList returns [java.util.List<String> i] : ^( ID_LIST ( Identifier )+ ) ;
	public final java.util.List<String> idList() throws RecognitionException {
		java.util.List<String> i = null;


		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:202:3: ( ^( ID_LIST ( Identifier )+ ) )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:202:6: ^( ID_LIST ( Identifier )+ )
			{
			match(input,ID_LIST,FOLLOW_ID_LIST_in_idList716); 
			match(input, Token.DOWN, null); 
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:202:16: ( Identifier )+
			int cnt19=0;
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==Identifier) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:202:16: Identifier
					{
					match(input,Identifier,FOLLOW_Identifier_in_idList718); 
					}
					break;

				default :
					if ( cnt19 >= 1 ) break loop19;
					EarlyExitException eee = new EarlyExitException(19, input);
					throw eee;
				}
				cnt19++;
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
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:205:1: exprList returns [java.util.List<Node> e] : ^( EXP_LIST (a= expression )+ ) ;
	public final java.util.List<Node> exprList() throws RecognitionException {
		java.util.List<Node> e = null;


		Node a =null;


		  e = new ArrayList<Node>();

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:209:3: ( ^( EXP_LIST (a= expression )+ ) )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:209:6: ^( EXP_LIST (a= expression )+ )
			{
			match(input,EXP_LIST,FOLLOW_EXP_LIST_in_exprList744); 
			match(input, Token.DOWN, null); 
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:209:17: (a= expression )+
			int cnt20=0;
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( ((LA20_0 >= Add && LA20_0 <= And)||LA20_0==Bool||LA20_0==Divide||LA20_0==Equals||(LA20_0 >= GT && LA20_0 <= GTEquals)||LA20_0==In||(LA20_0 >= LOOKUP && LA20_0 <= Number)||LA20_0==Or||LA20_0==Pow||(LA20_0 >= Subtract && LA20_0 <= TERNARY)||LA20_0==UNARY_MIN||LA20_0==76) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:209:18: a= expression
					{
					pushFollow(FOLLOW_expression_in_exprList749);
					a=expression();
					state._fsp--;

					e.add(a);
					}
					break;

				default :
					if ( cnt20 >= 1 ) break loop20;
					EarlyExitException eee = new EarlyExitException(20, input);
					throw eee;
				}
				cnt20++;
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
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:213:1: expression returns [Node node] : ( ^( TERNARY expression expression expression ) | ^( In expression expression ) | ^( '||' a= expression b= expression ) | ^( '&&' a= expression b= expression ) | ^( '==' a= expression b= expression ) | ^( '!=' a= expression b= expression ) | ^( '>=' a= expression b= expression ) | ^( '<=' a= expression b= expression ) | ^( '>' a= expression b= expression ) | ^( '<' a= expression b= expression ) | ^( '+' a= expression b= expression ) | ^( '-' a= expression b= expression ) | ^( '*' a= expression b= expression ) | ^( '/' a= expression b= expression ) | ^( '%' expression expression ) | ^( '^' expression expression ) | ^( UNARY_MIN expression ) | ^( NEGATE expression ) | Number | Bool | Null | lookup | query );
	public final Node expression() throws RecognitionException {
		Node node = null;


		CommonTree Number32=null;
		CommonTree Bool33=null;
		Node a =null;
		Node b =null;
		Node lookup34 =null;
		Node query35 =null;

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:214:3: ( ^( TERNARY expression expression expression ) | ^( In expression expression ) | ^( '||' a= expression b= expression ) | ^( '&&' a= expression b= expression ) | ^( '==' a= expression b= expression ) | ^( '!=' a= expression b= expression ) | ^( '>=' a= expression b= expression ) | ^( '<=' a= expression b= expression ) | ^( '>' a= expression b= expression ) | ^( '<' a= expression b= expression ) | ^( '+' a= expression b= expression ) | ^( '-' a= expression b= expression ) | ^( '*' a= expression b= expression ) | ^( '/' a= expression b= expression ) | ^( '%' expression expression ) | ^( '^' expression expression ) | ^( UNARY_MIN expression ) | ^( NEGATE expression ) | Number | Bool | Null | lookup | query )
			int alt21=23;
			switch ( input.LA(1) ) {
			case TERNARY:
				{
				alt21=1;
				}
				break;
			case In:
				{
				alt21=2;
				}
				break;
			case Or:
				{
				alt21=3;
				}
				break;
			case And:
				{
				alt21=4;
				}
				break;
			case Equals:
				{
				alt21=5;
				}
				break;
			case NEquals:
				{
				alt21=6;
				}
				break;
			case GTEquals:
				{
				alt21=7;
				}
				break;
			case LTEquals:
				{
				alt21=8;
				}
				break;
			case GT:
				{
				alt21=9;
				}
				break;
			case LT:
				{
				alt21=10;
				}
				break;
			case Add:
				{
				alt21=11;
				}
				break;
			case Subtract:
				{
				alt21=12;
				}
				break;
			case Multiply:
				{
				alt21=13;
				}
				break;
			case Divide:
				{
				alt21=14;
				}
				break;
			case Modulus:
				{
				alt21=15;
				}
				break;
			case Pow:
				{
				alt21=16;
				}
				break;
			case UNARY_MIN:
				{
				alt21=17;
				}
				break;
			case NEGATE:
				{
				alt21=18;
				}
				break;
			case Number:
				{
				alt21=19;
				}
				break;
			case Bool:
				{
				alt21=20;
				}
				break;
			case Null:
				{
				alt21=21;
				}
				break;
			case LOOKUP:
				{
				alt21=22;
				}
				break;
			case 76:
				{
				alt21=23;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}
			switch (alt21) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:214:6: ^( TERNARY expression expression expression )
					{
					match(input,TERNARY,FOLLOW_TERNARY_in_expression775); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression777);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression779);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression781);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:215:6: ^( In expression expression )
					{
					match(input,In,FOLLOW_In_in_expression790); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression792);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression794);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:216:6: ^( '||' a= expression b= expression )
					{
					match(input,Or,FOLLOW_Or_in_expression803); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression807);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression811);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new OrNode(a, b);
					}
					break;
				case 4 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:217:6: ^( '&&' a= expression b= expression )
					{
					match(input,And,FOLLOW_And_in_expression822); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression826);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression830);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new AndNode(a, b);
					}
					break;
				case 5 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:218:6: ^( '==' a= expression b= expression )
					{
					match(input,Equals,FOLLOW_Equals_in_expression841); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression845);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression849);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new EqualsNode(a, b);
					}
					break;
				case 6 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:219:6: ^( '!=' a= expression b= expression )
					{
					match(input,NEquals,FOLLOW_NEquals_in_expression860); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression864);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression868);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new NotEqualsNode(a, b);
					}
					break;
				case 7 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:220:6: ^( '>=' a= expression b= expression )
					{
					match(input,GTEquals,FOLLOW_GTEquals_in_expression879); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression883);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression887);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GreaterThanAndEqualsNode(a, b);
					}
					break;
				case 8 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:221:6: ^( '<=' a= expression b= expression )
					{
					match(input,LTEquals,FOLLOW_LTEquals_in_expression898); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression902);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression906);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new LessThanAndEqualsNode(a, b);
					}
					break;
				case 9 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:222:6: ^( '>' a= expression b= expression )
					{
					match(input,GT,FOLLOW_GT_in_expression917); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression921);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression925);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GreaterThanNode(a, b);
					}
					break;
				case 10 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:223:6: ^( '<' a= expression b= expression )
					{
					match(input,LT,FOLLOW_LT_in_expression936); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression940);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression944);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new LessThanNode(a, b);
					}
					break;
				case 11 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:224:6: ^( '+' a= expression b= expression )
					{
					match(input,Add,FOLLOW_Add_in_expression955); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression959);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression963);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new AddNode(a, b);
					}
					break;
				case 12 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:225:6: ^( '-' a= expression b= expression )
					{
					match(input,Subtract,FOLLOW_Subtract_in_expression974); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression978);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression982);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new SubNode(a, b);
					}
					break;
				case 13 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:226:6: ^( '*' a= expression b= expression )
					{
					match(input,Multiply,FOLLOW_Multiply_in_expression993); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression997);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1001);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new MultiplicationNode(a, b);
					}
					break;
				case 14 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:227:6: ^( '/' a= expression b= expression )
					{
					match(input,Divide,FOLLOW_Divide_in_expression1012); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1016);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1020);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new DivisionNode(a, b);
					}
					break;
				case 15 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:228:6: ^( '%' expression expression )
					{
					match(input,Modulus,FOLLOW_Modulus_in_expression1031); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1033);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1035);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 16 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:229:6: ^( '^' expression expression )
					{
					match(input,Pow,FOLLOW_Pow_in_expression1044); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1046);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1048);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 17 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:230:6: ^( UNARY_MIN expression )
					{
					match(input,UNARY_MIN,FOLLOW_UNARY_MIN_in_expression1057); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1059);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 18 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:231:6: ^( NEGATE expression )
					{
					match(input,NEGATE,FOLLOW_NEGATE_in_expression1068); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1070);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 19 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:232:6: Number
					{
					Number32=(CommonTree)match(input,Number,FOLLOW_Number_in_expression1078); 
					node = new AtomNode(Double.parseDouble((Number32!=null?Number32.getText():null)));
					}
					break;
				case 20 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:233:6: Bool
					{
					Bool33=(CommonTree)match(input,Bool,FOLLOW_Bool_in_expression1087); 
					node = new AtomNode(new Boolean((Bool33!=null?Bool33.getText():null)));
					}
					break;
				case 21 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:234:6: Null
					{
					match(input,Null,FOLLOW_Null_in_expression1097); 
					}
					break;
				case 22 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:235:6: lookup
					{
					pushFollow(FOLLOW_lookup_in_expression1104);
					lookup34=lookup();
					state._fsp--;

					node = lookup34;
					}
					break;
				case 23 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:236:6: query
					{
					pushFollow(FOLLOW_query_in_expression1115);
					query35=query();
					state._fsp--;

					node = query35;
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
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:239:1: incrementation returns [Node node] : ( variableCall ( '++' | '--' ) ) ;
	public final Node incrementation() throws RecognitionException {
		Node node = null;


		String variableCall36 =null;

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:240:3: ( ( variableCall ( '++' | '--' ) ) )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:240:4: ( variableCall ( '++' | '--' ) )
			{
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:240:4: ( variableCall ( '++' | '--' ) )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:240:5: variableCall ( '++' | '--' )
			{
			pushFollow(FOLLOW_variableCall_in_incrementation1134);
			variableCall36=variableCall();
			state._fsp--;

			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:240:18: ( '++' | '--' )
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==Increment) ) {
				alt22=1;
			}
			else if ( (LA22_0==73) ) {
				alt22=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:240:19: '++'
					{
					match(input,Increment,FOLLOW_Increment_in_incrementation1137); 
					node = new IncrementationNode(variableCall36,1,currentScope);
					}
					break;
				case 2 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:241:5: '--'
					{
					match(input,73,FOLLOW_73_in_incrementation1144); 
					node = new IncrementationNode(variableCall36,-1,currentScope);
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
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:245:1: lookup returns [Node node] : ( ^( LOOKUP list ( indexes )? ) | ^( LOOKUP expression ( indexes )? ) | ^( LOOKUP i= Identifier (x= indexes )? ) | ^( LOOKUP String ( indexes )? ) );
	public final Node lookup() throws RecognitionException {
		Node node = null;


		CommonTree i=null;
		CommonTree String37=null;
		java.util.List<Node> x =null;

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:247:3: ( ^( LOOKUP list ( indexes )? ) | ^( LOOKUP expression ( indexes )? ) | ^( LOOKUP i= Identifier (x= indexes )? ) | ^( LOOKUP String ( indexes )? ) )
			int alt27=4;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==LOOKUP) ) {
				int LA27_1 = input.LA(2);
				if ( (LA27_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case Identifier:
						{
						alt27=3;
						}
						break;
					case String:
						{
						alt27=4;
						}
						break;
					case LIST:
						{
						alt27=1;
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
					case 76:
						{
						alt27=2;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 27, 2, input);
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
							new NoViableAltException("", 27, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}

			switch (alt27) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:247:6: ^( LOOKUP list ( indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup1169); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_list_in_lookup1171);
					list();
					state._fsp--;

					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:247:20: ( indexes )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==INDEXES) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:247:20: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1173);
							indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:248:6: ^( LOOKUP expression ( indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup1183); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_lookup1185);
					expression();
					state._fsp--;

					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:248:26: ( indexes )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==INDEXES) ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:248:26: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1187);
							indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:249:6: ^( LOOKUP i= Identifier (x= indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup1198); 
					match(input, Token.DOWN, null); 
					i=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_lookup1202); 
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:249:29: (x= indexes )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==INDEXES) ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:249:29: x= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1206);
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
				case 4 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:255:6: ^( LOOKUP String ( indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup1225); 
					match(input, Token.DOWN, null); 
					String37=(CommonTree)match(input,String,FOLLOW_String_in_lookup1227); 
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:255:22: ( indexes )?
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==INDEXES) ) {
						alt26=1;
					}
					switch (alt26) {
						case 1 :
							// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:255:22: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1229);
							indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 


					        node = new AtomNode((String37!=null?String37.getText():null));
					      
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
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:260:1: list returns [Node node] : ^( LIST ( exprList )? ) ;
	public final Node list() throws RecognitionException {
		Node node = null;


		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:261:3: ( ^( LIST ( exprList )? ) )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:261:6: ^( LIST ( exprList )? )
			{
			match(input,LIST,FOLLOW_LIST_in_list1254); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:261:13: ( exprList )?
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==EXP_LIST) ) {
					alt28=1;
				}
				switch (alt28) {
					case 1 :
						// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:261:13: exprList
						{
						pushFollow(FOLLOW_exprList_in_list1256);
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
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:264:1: indexes returns [java.util.List<Node> e] : ^( INDEXES ( expression )+ ) ;
	public final java.util.List<Node> indexes() throws RecognitionException {
		java.util.List<Node> e = null;


		Node expression38 =null;

		e = new java.util.ArrayList<Node>();
		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:266:3: ( ^( INDEXES ( expression )+ ) )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:266:6: ^( INDEXES ( expression )+ )
			{
			match(input,INDEXES,FOLLOW_INDEXES_in_indexes1282); 
			match(input, Token.DOWN, null); 
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:266:16: ( expression )+
			int cnt29=0;
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( ((LA29_0 >= Add && LA29_0 <= And)||LA29_0==Bool||LA29_0==Divide||LA29_0==Equals||(LA29_0 >= GT && LA29_0 <= GTEquals)||LA29_0==In||(LA29_0 >= LOOKUP && LA29_0 <= Number)||LA29_0==Or||LA29_0==Pow||(LA29_0 >= Subtract && LA29_0 <= TERNARY)||LA29_0==UNARY_MIN||LA29_0==76) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\ProgramWalker.g:266:17: expression
					{
					pushFollow(FOLLOW_expression_in_indexes1285);
					expression38=expression();
					state._fsp--;

					e.add(expression38);
					}
					break;

				default :
					if ( cnt29 >= 1 ) break loop29;
					EarlyExitException eee = new EarlyExitException(29, input);
					throw eee;
				}
				cnt29++;
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
	public static final BitSet FOLLOW_statement_in_block100 = new BitSet(new long[]{0x0180001460000018L,0x0000000000001900L});
	public static final BitSet FOLLOW_RETURN_in_block120 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_block127 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assignment_in_statement159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_statement172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_statement183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forStatement_in_statement195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStatement_in_statement207 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incrementation_in_statement216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_query_in_statement225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_println_in_statement234 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_in_statement243 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_76_in_query263 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_query266 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_functionCall_in_query274 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_variableCall292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGNMENT_in_assignment312 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_assignment316 = new BitSet(new long[]{0x0247FC49A2080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_indexes_in_assignment320 = new BitSet(new long[]{0x0247FC41A2080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_assignment324 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_functionCall_in_assignment333 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_75_in_assignment345 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ASSIGNMENT_in_assignment347 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_Identifier_in_assignment351 = new BitSet(new long[]{0x0247FC49A2080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_indexes_in_assignment355 = new BitSet(new long[]{0x0247FC41A2080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_assignment359 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_functionCall_in_assignment369 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall392 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_functionCall394 = new BitSet(new long[]{0x0000000000400008L});
	public static final BitSet FOLLOW_exprList_in_functionCall396 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall411 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Assert_in_functionCall413 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_functionCall415 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall425 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Size_in_functionCall427 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_functionCall429 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PRINTLN_in_println449 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_functionCall_in_println451 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PRINTLN_in_println462 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_println464 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PRINT_in_print489 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_functionCall_in_print491 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PRINT_in_print502 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_print504 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IF_in_ifStatement535 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_EXP_in_ifStatement547 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_ifStatement549 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_block_in_ifStatement553 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXP_in_ifStatement570 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_block_in_ifStatement574 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_For_in_forStatement619 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assignment_in_forStatement623 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_forStatement627 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_afterthought_in_forStatement631 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_block_in_forStatement635 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_afterthought656 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Assign_in_afterthought658 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_afterthought660 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incrementation_in_afterthought670 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_While_in_whileStatement690 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_whileStatement692 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_block_in_whileStatement694 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_LIST_in_idList716 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_idList718 = new BitSet(new long[]{0x0000001000000008L});
	public static final BitSet FOLLOW_EXP_LIST_in_exprList744 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_exprList749 = new BitSet(new long[]{0x0247FC4182080468L,0x00000000000010B0L});
	public static final BitSet FOLLOW_TERNARY_in_expression775 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression777 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression779 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression781 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_In_in_expression790 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression792 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression794 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Or_in_expression803 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression807 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression811 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_And_in_expression822 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression826 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression830 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Equals_in_expression841 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression845 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression849 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEquals_in_expression860 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression864 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression868 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GTEquals_in_expression879 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression883 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression887 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LTEquals_in_expression898 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression902 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression906 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_expression917 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression921 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression925 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LT_in_expression936 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression940 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression944 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Add_in_expression955 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression959 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression963 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Subtract_in_expression974 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression978 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression982 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Multiply_in_expression993 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression997 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression1001 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Divide_in_expression1012 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1016 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression1020 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Modulus_in_expression1031 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1033 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression1035 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Pow_in_expression1044 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1046 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression1048 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNARY_MIN_in_expression1057 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1059 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEGATE_in_expression1068 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1070 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Number_in_expression1078 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Bool_in_expression1087 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Null_in_expression1097 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lookup_in_expression1104 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_query_in_expression1115 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableCall_in_incrementation1134 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_Increment_in_incrementation1137 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_73_in_incrementation1144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup1169 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_list_in_lookup1171 = new BitSet(new long[]{0x0000000800000008L});
	public static final BitSet FOLLOW_indexes_in_lookup1173 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup1183 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_lookup1185 = new BitSet(new long[]{0x0000000800000008L});
	public static final BitSet FOLLOW_indexes_in_lookup1187 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup1198 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_lookup1202 = new BitSet(new long[]{0x0000000800000008L});
	public static final BitSet FOLLOW_indexes_in_lookup1206 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup1225 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_String_in_lookup1227 = new BitSet(new long[]{0x0000000800000008L});
	public static final BitSet FOLLOW_indexes_in_lookup1229 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LIST_in_list1254 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exprList_in_list1256 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INDEXES_in_indexes1282 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_indexes1285 = new BitSet(new long[]{0x0247FC4182080468L,0x00000000000010B0L});
}
