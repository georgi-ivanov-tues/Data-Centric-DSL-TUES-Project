// $ANTLR 3.5.2 D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g 2015-02-14 19:18:06

  package bg.tues.didi;
  import bg.tues.didi.*;
  import bg.tues.didi.tree.*;
  import bg.tues.didi.tree.functions.PrintlnNode;
  import bg.tues.didi.tree.functions.PrintNode;
  import bg.tues.didi.tree.functions.QueryNode;
  import bg.tues.didi.tree.expressions.operations.*;
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
  import bg.tues.didi.tree.functions.UpdateNode;


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
		"UNARY_MIN", "While", "'--'", "'func'", "'global'", "'query'", "'update'"
	};
	public static final int EOF=-1;
	public static final int T__73=73;
	public static final int T__74=74;
	public static final int T__75=75;
	public static final int T__76=76;
	public static final int T__77=77;
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
	@Override public String getGrammarFileName() { return "D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g"; }


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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:77:1: program returns [Value returnValue] : block ;
	public final Value program() throws RecognitionException {
		Value returnValue = null;


		Node block1 =null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:78:3: ( block )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:78:6: block
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:83:1: block returns [Node node] : ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) ;
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
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:99:3: ( ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:99:6: ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) )
			{
			match(input,BLOCK,FOLLOW_BLOCK_in_block84); 
			match(input, Token.DOWN, null); 
			match(input,STATEMENTS,FOLLOW_STATEMENTS_in_block97); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:100:23: ( statement )*
				loop1:
				while (true) {
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==ASSIGNMENT||(LA1_0 >= FUNC_CALL && LA1_0 <= For)||LA1_0==IF||LA1_0==Identifier||(LA1_0 >= PRINT && LA1_0 <= PRINTLN)||LA1_0==While||(LA1_0 >= 75 && LA1_0 <= 77)) ) {
						alt1=1;
					}

					switch (alt1) {
					case 1 :
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:100:24: statement
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
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:101:23: ( expression )?
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= Add && LA2_0 <= And)||LA2_0==Bool||LA2_0==Divide||LA2_0==Equals||(LA2_0 >= GT && LA2_0 <= GTEquals)||LA2_0==In||(LA2_0 >= LOOKUP && LA2_0 <= Number)||LA2_0==Or||LA2_0==Pow||(LA2_0 >= Subtract && LA2_0 <= TERNARY)||LA2_0==UNARY_MIN||LA2_0==76) ) {
					alt2=1;
				}
				switch (alt2) {
					case 1 :
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:101:24: expression
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:105:1: statement returns [Node node] : ( assignment | functionCall | ifStatement | forStatement | whileStatement | incrementation | query | update | println | print );
	public final Node statement() throws RecognitionException {
		Node node = null;


		Node assignment4 =null;
		Node functionCall5 =null;
		Node ifStatement6 =null;
		Node forStatement7 =null;
		Node whileStatement8 =null;
		Node incrementation9 =null;
		Node query10 =null;
		Node update11 =null;
		Node println12 =null;
		Node print13 =null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:106:3: ( assignment | functionCall | ifStatement | forStatement | whileStatement | incrementation | query | update | println | print )
			int alt3=10;
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
			case 77:
				{
				alt3=8;
				}
				break;
			case PRINTLN:
				{
				alt3=9;
				}
				break;
			case PRINT:
				{
				alt3=10;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:106:6: assignment
					{
					pushFollow(FOLLOW_assignment_in_statement159);
					assignment4=assignment();
					state._fsp--;

					node = assignment4;
					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:107:6: functionCall
					{
					pushFollow(FOLLOW_functionCall_in_statement172);
					functionCall5=functionCall();
					state._fsp--;

					node = functionCall5;
					}
					break;
				case 3 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:108:6: ifStatement
					{
					pushFollow(FOLLOW_ifStatement_in_statement183);
					ifStatement6=ifStatement();
					state._fsp--;

					node = ifStatement6;
					}
					break;
				case 4 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:109:6: forStatement
					{
					pushFollow(FOLLOW_forStatement_in_statement195);
					forStatement7=forStatement();
					state._fsp--;

					node = forStatement7;
					}
					break;
				case 5 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:110:6: whileStatement
					{
					pushFollow(FOLLOW_whileStatement_in_statement207);
					whileStatement8=whileStatement();
					state._fsp--;

					node = whileStatement8;
					}
					break;
				case 6 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:111:6: incrementation
					{
					pushFollow(FOLLOW_incrementation_in_statement216);
					incrementation9=incrementation();
					state._fsp--;

					node = incrementation9;
					}
					break;
				case 7 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:112:6: query
					{
					pushFollow(FOLLOW_query_in_statement225);
					query10=query();
					state._fsp--;

					node = query10;
					}
					break;
				case 8 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:113:6: update
					{
					pushFollow(FOLLOW_update_in_statement234);
					update11=update();
					state._fsp--;

					node = update11;
					}
					break;
				case 9 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:114:6: println
					{
					pushFollow(FOLLOW_println_in_statement243);
					println12=println();
					state._fsp--;

					node = println12;
					}
					break;
				case 10 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:115:6: print
					{
					pushFollow(FOLLOW_print_in_statement252);
					print13=print();
					state._fsp--;

					node = print13;
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:118:1: query returns [Node node] : ^( 'query' ( expression | functionCall ) ) ;
	public final Node query() throws RecognitionException {
		Node node = null;


		Node expression14 =null;
		Node functionCall15 =null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:118:26: ( ^( 'query' ( expression | functionCall ) ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:119:3: ^( 'query' ( expression | functionCall ) )
			{
			match(input,76,FOLLOW_76_in_query272); 
			match(input, Token.DOWN, null); 
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:119:13: ( expression | functionCall )
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:119:14: expression
					{
					pushFollow(FOLLOW_expression_in_query275);
					expression14=expression();
					state._fsp--;

					node = new QueryNode(expression14, dataSource);
					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:120:5: functionCall
					{
					pushFollow(FOLLOW_functionCall_in_query283);
					functionCall15=functionCall();
					state._fsp--;

					node = new QueryNode(functionCall15, dataSource);
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



	// $ANTLR start "update"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:123:1: update returns [Node node] : ^( 'update' ( expression ) ) ;
	public final Node update() throws RecognitionException {
		Node node = null;


		Node expression16 =null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:123:27: ( ^( 'update' ( expression ) ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:124:3: ^( 'update' ( expression ) )
			{
			match(input,77,FOLLOW_77_in_update303); 
			match(input, Token.DOWN, null); 
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:124:14: ( expression )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:124:15: expression
			{
			pushFollow(FOLLOW_expression_in_update306);
			expression16=expression();
			state._fsp--;

			node = new UpdateNode(expression16, dataSource);
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
	// $ANTLR end "update"



	// $ANTLR start "variableCall"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:127:1: variableCall returns [String value] : Identifier ;
	public final String variableCall() throws RecognitionException {
		String value = null;


		CommonTree Identifier17=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:127:36: ( Identifier )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:128:3: Identifier
			{
			Identifier17=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_variableCall324); 
			value=(Identifier17!=null?Identifier17.getText():null);
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:131:1: assignment returns [Node node] : ( ^( ASSIGNMENT i= Identifier (x= indexes )? ( expression | functionCall ) ) | ^( 'global' ASSIGNMENT i= Identifier (x= indexes )? ( expression | functionCall ) ) );
	public final Node assignment() throws RecognitionException {
		Node node = null;


		CommonTree i=null;
		java.util.List<Node> x =null;
		Node expression18 =null;
		Node functionCall19 =null;
		Node expression20 =null;
		Node functionCall21 =null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:132:3: ( ^( ASSIGNMENT i= Identifier (x= indexes )? ( expression | functionCall ) ) | ^( 'global' ASSIGNMENT i= Identifier (x= indexes )? ( expression | functionCall ) ) )
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:132:6: ^( ASSIGNMENT i= Identifier (x= indexes )? ( expression | functionCall ) )
					{
					match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assignment344); 
					match(input, Token.DOWN, null); 
					i=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_assignment348); 
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:132:33: (x= indexes )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==INDEXES) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:132:33: x= indexes
							{
							pushFollow(FOLLOW_indexes_in_assignment352);
							x=indexes();
							state._fsp--;

							}
							break;

					}

					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:132:43: ( expression | functionCall )
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
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:132:44: expression
							{
							pushFollow(FOLLOW_expression_in_assignment356);
							expression18=expression();
							state._fsp--;

							node = new AssignmentNode((i!=null?i.getText():null), x, expression18, currentScope);
							}
							break;
						case 2 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:133:6: functionCall
							{
							pushFollow(FOLLOW_functionCall_in_assignment365);
							functionCall19=functionCall();
							state._fsp--;

							node = new AssignmentNode((i!=null?i.getText():null), x, functionCall19, currentScope);
							}
							break;

					}

					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:134:6: ^( 'global' ASSIGNMENT i= Identifier (x= indexes )? ( expression | functionCall ) )
					{
					match(input,75,FOLLOW_75_in_assignment377); 
					match(input, Token.DOWN, null); 
					match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assignment379); 
					i=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_assignment383); 
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:134:42: (x= indexes )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==INDEXES) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:134:42: x= indexes
							{
							pushFollow(FOLLOW_indexes_in_assignment387);
							x=indexes();
							state._fsp--;

							}
							break;

					}

					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:134:52: ( expression | functionCall )
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
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:134:53: expression
							{
							pushFollow(FOLLOW_expression_in_assignment391);
							expression20=expression();
							state._fsp--;


							        Scope globalScope = currentScope;
							        
							        while(globalScope.parent() != null){
							          globalScope = globalScope.parent();
							        }
							        node = new AssignmentNode((i!=null?i.getText():null), x, expression20, globalScope);
							        
							}
							break;
						case 2 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:142:7: functionCall
							{
							pushFollow(FOLLOW_functionCall_in_assignment401);
							functionCall21=functionCall();
							state._fsp--;


							        Scope globalScope = currentScope;
							        
							        while(globalScope.parent() != null){
							          globalScope = globalScope.parent();
							        }
							        node = new AssignmentNode((i!=null?i.getText():null), x, functionCall21, globalScope);
							        
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:152:1: functionCall returns [Node node] : ( ^( FUNC_CALL Identifier ( exprList )? ) | ^( FUNC_CALL Assert expression ) | ^( FUNC_CALL Size expression ) );
	public final Node functionCall() throws RecognitionException {
		Node node = null;


		CommonTree Identifier23=null;
		java.util.List<Node> exprList22 =null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:153:3: ( ^( FUNC_CALL Identifier ( exprList )? ) | ^( FUNC_CALL Assert expression ) | ^( FUNC_CALL Size expression ) )
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:153:6: ^( FUNC_CALL Identifier ( exprList )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall424); 
					match(input, Token.DOWN, null); 
					Identifier23=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_functionCall426); 
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:153:29: ( exprList )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==EXP_LIST) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:153:29: exprList
							{
							pushFollow(FOLLOW_exprList_in_functionCall428);
							exprList22=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 


					        
					        int paramSize = 0;
					        if(exprList22 == null){
					            paramSize = 0;
					        }else{
					            paramSize = exprList22.size();
					        }
					      Function function = functions.get((Identifier23!=null?Identifier23.getText():null) + paramSize);
					      function.setParameters(paramSize == 0 ? new ArrayList<Node>() : exprList22);
					      function.setFunctions(functions);
					      function.setContext(context);
					      node = function;
					      
					  
					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:171:6: ^( FUNC_CALL Assert expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall443); 
					match(input, Token.DOWN, null); 
					match(input,Assert,FOLLOW_Assert_in_functionCall445); 
					pushFollow(FOLLOW_expression_in_functionCall447);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:172:6: ^( FUNC_CALL Size expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall457); 
					match(input, Token.DOWN, null); 
					match(input,Size,FOLLOW_Size_in_functionCall459); 
					pushFollow(FOLLOW_expression_in_functionCall461);
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:175:1: println returns [Node node] : ( ^( PRINTLN functionCall ) | ^( PRINTLN ( expression )? ) );
	public final Node println() throws RecognitionException {
		Node node = null;


		Node functionCall24 =null;
		Node expression25 =null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:176:3: ( ^( PRINTLN functionCall ) | ^( PRINTLN ( expression )? ) )
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:176:6: ^( PRINTLN functionCall )
					{
					match(input,PRINTLN,FOLLOW_PRINTLN_in_println481); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_functionCall_in_println483);
					functionCall24=functionCall();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new PrintlnNode(functionCall24, outputStream);
					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:177:6: ^( PRINTLN ( expression )? )
					{
					match(input,PRINTLN,FOLLOW_PRINTLN_in_println494); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:177:16: ( expression )?
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( ((LA12_0 >= Add && LA12_0 <= And)||LA12_0==Bool||LA12_0==Divide||LA12_0==Equals||(LA12_0 >= GT && LA12_0 <= GTEquals)||LA12_0==In||(LA12_0 >= LOOKUP && LA12_0 <= Number)||LA12_0==Or||LA12_0==Pow||(LA12_0 >= Subtract && LA12_0 <= TERNARY)||LA12_0==UNARY_MIN||LA12_0==76) ) {
							alt12=1;
						}
						switch (alt12) {
							case 1 :
								// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:177:16: expression
								{
								pushFollow(FOLLOW_expression_in_println496);
								expression25=expression();
								state._fsp--;

								}
								break;

						}

						match(input, Token.UP, null); 
					}

					node = new PrintlnNode(expression25, outputStream);
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:180:1: print returns [Node node] : ( ^( PRINT functionCall ) | ^( PRINT ( expression )? ) );
	public final Node print() throws RecognitionException {
		Node node = null;


		Node functionCall26 =null;
		Node expression27 =null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:181:3: ( ^( PRINT functionCall ) | ^( PRINT ( expression )? ) )
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:181:6: ^( PRINT functionCall )
					{
					match(input,PRINT,FOLLOW_PRINT_in_print521); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_functionCall_in_print523);
					functionCall26=functionCall();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new PrintNode(functionCall26, outputStream);
					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:182:6: ^( PRINT ( expression )? )
					{
					match(input,PRINT,FOLLOW_PRINT_in_print534); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:182:14: ( expression )?
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( ((LA14_0 >= Add && LA14_0 <= And)||LA14_0==Bool||LA14_0==Divide||LA14_0==Equals||(LA14_0 >= GT && LA14_0 <= GTEquals)||LA14_0==In||(LA14_0 >= LOOKUP && LA14_0 <= Number)||LA14_0==Or||LA14_0==Pow||(LA14_0 >= Subtract && LA14_0 <= TERNARY)||LA14_0==UNARY_MIN||LA14_0==76) ) {
							alt14=1;
						}
						switch (alt14) {
							case 1 :
								// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:182:14: expression
								{
								pushFollow(FOLLOW_expression_in_print536);
								expression27=expression();
								state._fsp--;

								}
								break;

						}

						match(input, Token.UP, null); 
					}

					node = new PrintNode(expression27, outputStream);
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:185:1: ifStatement returns [Node node] : ^( IF ( ^( EXP expression b1= block ) )+ ( ^( EXP b2= block ) )? ) ;
	public final Node ifStatement() throws RecognitionException {
		Node node = null;


		Node b1 =null;
		Node b2 =null;
		Node expression28 =null;


		  IfNode ifNode = new IfNode();
		  node = ifNode;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:190:3: ( ^( IF ( ^( EXP expression b1= block ) )+ ( ^( EXP b2= block ) )? ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:190:6: ^( IF ( ^( EXP expression b1= block ) )+ ( ^( EXP b2= block ) )? )
			{
			match(input,IF,FOLLOW_IF_in_ifStatement567); 
			match(input, Token.DOWN, null); 
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:191:8: ( ^( EXP expression b1= block ) )+
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:191:9: ^( EXP expression b1= block )
					{
					match(input,EXP,FOLLOW_EXP_in_ifStatement579); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_ifStatement581);
					expression28=expression();
					state._fsp--;

					pushFollow(FOLLOW_block_in_ifStatement585);
					b1=block();
					state._fsp--;

					match(input, Token.UP, null); 

					ifNode.addChoice(expression28, b1);  
					}
					break;

				default :
					if ( cnt16 >= 1 ) break loop16;
					EarlyExitException eee = new EarlyExitException(16, input);
					throw eee;
				}
				cnt16++;
			}

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:192:8: ( ^( EXP b2= block ) )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==EXP) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:192:9: ^( EXP b2= block )
					{
					match(input,EXP,FOLLOW_EXP_in_ifStatement602); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_block_in_ifStatement606);
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:196:1: forStatement returns [Node node] : ^( For a= assignment b= expression c= afterthought d= block ) ;
	public final Node forStatement() throws RecognitionException {
		Node node = null;


		Node a =null;
		Node b =null;
		Node c =null;
		Node d =null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:197:3: ( ^( For a= assignment b= expression c= afterthought d= block ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:197:6: ^( For a= assignment b= expression c= afterthought d= block )
			{
			match(input,For,FOLLOW_For_in_forStatement651); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_assignment_in_forStatement655);
			a=assignment();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_forStatement659);
			b=expression();
			state._fsp--;

			pushFollow(FOLLOW_afterthought_in_forStatement663);
			c=afterthought();
			state._fsp--;

			pushFollow(FOLLOW_block_in_forStatement667);
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:200:1: afterthought returns [Node node] : ( ( Identifier '=' expression ) | incrementation ) ;
	public final Node afterthought() throws RecognitionException {
		Node node = null;


		CommonTree Identifier29=null;
		Node expression30 =null;
		Node incrementation31 =null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:200:33: ( ( ( Identifier '=' expression ) | incrementation ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:201:3: ( ( Identifier '=' expression ) | incrementation )
			{
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:201:3: ( ( Identifier '=' expression ) | incrementation )
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:201:4: ( Identifier '=' expression )
					{
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:201:4: ( Identifier '=' expression )
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:201:5: Identifier '=' expression
					{
					Identifier29=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_afterthought688); 
					match(input,Assign,FOLLOW_Assign_in_afterthought690); 
					pushFollow(FOLLOW_expression_in_afterthought692);
					expression30=expression();
					state._fsp--;

					node = new AssignmentNode((Identifier29!=null?Identifier29.getText():null), expression30, currentScope);
					}

					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:202:5: incrementation
					{
					pushFollow(FOLLOW_incrementation_in_afterthought702);
					incrementation31=incrementation();
					state._fsp--;

					node = incrementation31;
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:205:1: whileStatement returns [Node node] : ^( While expression block ) ;
	public final Node whileStatement() throws RecognitionException {
		Node node = null;


		Node expression32 =null;
		Node block33 =null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:206:3: ( ^( While expression block ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:206:6: ^( While expression block )
			{
			match(input,While,FOLLOW_While_in_whileStatement722); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_whileStatement724);
			expression32=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_whileStatement726);
			block33=block();
			state._fsp--;

			match(input, Token.UP, null); 

			node = new WhileNode(expression32, block33);
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:209:1: idList returns [java.util.List<String> i] : ^( ID_LIST ( Identifier )+ ) ;
	public final java.util.List<String> idList() throws RecognitionException {
		java.util.List<String> i = null;


		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:210:3: ( ^( ID_LIST ( Identifier )+ ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:210:6: ^( ID_LIST ( Identifier )+ )
			{
			match(input,ID_LIST,FOLLOW_ID_LIST_in_idList748); 
			match(input, Token.DOWN, null); 
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:210:16: ( Identifier )+
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:210:16: Identifier
					{
					match(input,Identifier,FOLLOW_Identifier_in_idList750); 
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:213:1: exprList returns [java.util.List<Node> e] : ^( EXP_LIST (a= expression )+ ) ;
	public final java.util.List<Node> exprList() throws RecognitionException {
		java.util.List<Node> e = null;


		Node a =null;


		  e = new ArrayList<Node>();

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:217:3: ( ^( EXP_LIST (a= expression )+ ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:217:6: ^( EXP_LIST (a= expression )+ )
			{
			match(input,EXP_LIST,FOLLOW_EXP_LIST_in_exprList776); 
			match(input, Token.DOWN, null); 
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:217:17: (a= expression )+
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:217:18: a= expression
					{
					pushFollow(FOLLOW_expression_in_exprList781);
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:221:1: expression returns [Node node] : ( ^( TERNARY expression expression expression ) | ^( In expression expression ) | ^( '||' a= expression b= expression ) | ^( '&&' a= expression b= expression ) | ^( '==' a= expression b= expression ) | ^( '!=' a= expression b= expression ) | ^( '>=' a= expression b= expression ) | ^( '<=' a= expression b= expression ) | ^( '>' a= expression b= expression ) | ^( '<' a= expression b= expression ) | ^( '+' a= expression b= expression ) | ^( '-' a= expression b= expression ) | ^( '*' a= expression b= expression ) | ^( '/' a= expression b= expression ) | ^( '%' expression expression ) | ^( '^' expression expression ) | ^( UNARY_MIN expression ) | ^( NEGATE expression ) | Number | Bool | Null | lookup | query );
	public final Node expression() throws RecognitionException {
		Node node = null;


		CommonTree Number34=null;
		CommonTree Bool35=null;
		Node a =null;
		Node b =null;
		Node lookup36 =null;
		Node query37 =null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:222:3: ( ^( TERNARY expression expression expression ) | ^( In expression expression ) | ^( '||' a= expression b= expression ) | ^( '&&' a= expression b= expression ) | ^( '==' a= expression b= expression ) | ^( '!=' a= expression b= expression ) | ^( '>=' a= expression b= expression ) | ^( '<=' a= expression b= expression ) | ^( '>' a= expression b= expression ) | ^( '<' a= expression b= expression ) | ^( '+' a= expression b= expression ) | ^( '-' a= expression b= expression ) | ^( '*' a= expression b= expression ) | ^( '/' a= expression b= expression ) | ^( '%' expression expression ) | ^( '^' expression expression ) | ^( UNARY_MIN expression ) | ^( NEGATE expression ) | Number | Bool | Null | lookup | query )
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:222:6: ^( TERNARY expression expression expression )
					{
					match(input,TERNARY,FOLLOW_TERNARY_in_expression807); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression809);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression811);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression813);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:223:6: ^( In expression expression )
					{
					match(input,In,FOLLOW_In_in_expression822); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression824);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression826);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:224:6: ^( '||' a= expression b= expression )
					{
					match(input,Or,FOLLOW_Or_in_expression835); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression839);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression843);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new OrNode(a, b);
					}
					break;
				case 4 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:225:6: ^( '&&' a= expression b= expression )
					{
					match(input,And,FOLLOW_And_in_expression854); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression858);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression862);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new AndNode(a, b);
					}
					break;
				case 5 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:226:6: ^( '==' a= expression b= expression )
					{
					match(input,Equals,FOLLOW_Equals_in_expression873); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression877);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression881);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new EqualsNode(a, b);
					}
					break;
				case 6 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:227:6: ^( '!=' a= expression b= expression )
					{
					match(input,NEquals,FOLLOW_NEquals_in_expression892); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression896);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression900);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new NotEqualsNode(a, b);
					}
					break;
				case 7 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:228:6: ^( '>=' a= expression b= expression )
					{
					match(input,GTEquals,FOLLOW_GTEquals_in_expression911); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression915);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression919);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GreaterThanAndEqualsNode(a, b);
					}
					break;
				case 8 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:229:6: ^( '<=' a= expression b= expression )
					{
					match(input,LTEquals,FOLLOW_LTEquals_in_expression930); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression934);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression938);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new LessThanAndEqualsNode(a, b);
					}
					break;
				case 9 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:230:6: ^( '>' a= expression b= expression )
					{
					match(input,GT,FOLLOW_GT_in_expression949); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression953);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression957);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GreaterThanNode(a, b);
					}
					break;
				case 10 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:231:6: ^( '<' a= expression b= expression )
					{
					match(input,LT,FOLLOW_LT_in_expression968); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression972);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression976);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new LessThanNode(a, b);
					}
					break;
				case 11 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:232:6: ^( '+' a= expression b= expression )
					{
					match(input,Add,FOLLOW_Add_in_expression987); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression991);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression995);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new AddNode(a, b);
					}
					break;
				case 12 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:233:6: ^( '-' a= expression b= expression )
					{
					match(input,Subtract,FOLLOW_Subtract_in_expression1006); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1010);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1014);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new SubNode(a, b);
					}
					break;
				case 13 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:234:6: ^( '*' a= expression b= expression )
					{
					match(input,Multiply,FOLLOW_Multiply_in_expression1025); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1029);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1033);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new MultiplicationNode(a, b);
					}
					break;
				case 14 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:235:6: ^( '/' a= expression b= expression )
					{
					match(input,Divide,FOLLOW_Divide_in_expression1044); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1048);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1052);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new DivisionNode(a, b);
					}
					break;
				case 15 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:236:6: ^( '%' expression expression )
					{
					match(input,Modulus,FOLLOW_Modulus_in_expression1063); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1065);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1067);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 16 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:237:6: ^( '^' expression expression )
					{
					match(input,Pow,FOLLOW_Pow_in_expression1076); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1078);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1080);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 17 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:238:6: ^( UNARY_MIN expression )
					{
					match(input,UNARY_MIN,FOLLOW_UNARY_MIN_in_expression1089); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1091);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 18 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:239:6: ^( NEGATE expression )
					{
					match(input,NEGATE,FOLLOW_NEGATE_in_expression1100); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1102);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 19 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:240:6: Number
					{
					Number34=(CommonTree)match(input,Number,FOLLOW_Number_in_expression1110); 
					node = new AtomNode(Double.parseDouble((Number34!=null?Number34.getText():null)));
					}
					break;
				case 20 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:241:6: Bool
					{
					Bool35=(CommonTree)match(input,Bool,FOLLOW_Bool_in_expression1119); 
					node = new AtomNode(new Boolean((Bool35!=null?Bool35.getText():null)));
					}
					break;
				case 21 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:242:6: Null
					{
					match(input,Null,FOLLOW_Null_in_expression1129); 
					}
					break;
				case 22 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:243:6: lookup
					{
					pushFollow(FOLLOW_lookup_in_expression1136);
					lookup36=lookup();
					state._fsp--;

					node = lookup36;
					}
					break;
				case 23 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:244:6: query
					{
					pushFollow(FOLLOW_query_in_expression1147);
					query37=query();
					state._fsp--;

					node = query37;
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:247:1: incrementation returns [Node node] : ( variableCall ( '++' | '--' ) ) ;
	public final Node incrementation() throws RecognitionException {
		Node node = null;


		String variableCall38 =null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:248:3: ( ( variableCall ( '++' | '--' ) ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:248:4: ( variableCall ( '++' | '--' ) )
			{
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:248:4: ( variableCall ( '++' | '--' ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:248:5: variableCall ( '++' | '--' )
			{
			pushFollow(FOLLOW_variableCall_in_incrementation1166);
			variableCall38=variableCall();
			state._fsp--;

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:248:18: ( '++' | '--' )
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:248:19: '++'
					{
					match(input,Increment,FOLLOW_Increment_in_incrementation1169); 
					node = new IncrementationNode(variableCall38,1,currentScope);
					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:249:5: '--'
					{
					match(input,73,FOLLOW_73_in_incrementation1176); 
					node = new IncrementationNode(variableCall38,-1,currentScope);
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:253:1: lookup returns [Node node] : ( ^( LOOKUP list ( indexes )? ) | ^( LOOKUP expression ( indexes )? ) | ^( LOOKUP i= Identifier (x= indexes )? ) | ^( LOOKUP String ( indexes )? ) );
	public final Node lookup() throws RecognitionException {
		Node node = null;


		CommonTree i=null;
		CommonTree String39=null;
		java.util.List<Node> x =null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:255:3: ( ^( LOOKUP list ( indexes )? ) | ^( LOOKUP expression ( indexes )? ) | ^( LOOKUP i= Identifier (x= indexes )? ) | ^( LOOKUP String ( indexes )? ) )
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:255:6: ^( LOOKUP list ( indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup1201); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_list_in_lookup1203);
					list();
					state._fsp--;

					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:255:20: ( indexes )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==INDEXES) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:255:20: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1205);
							indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:256:6: ^( LOOKUP expression ( indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup1215); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_lookup1217);
					expression();
					state._fsp--;

					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:256:26: ( indexes )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==INDEXES) ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:256:26: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1219);
							indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:257:6: ^( LOOKUP i= Identifier (x= indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup1230); 
					match(input, Token.DOWN, null); 
					i=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_lookup1234); 
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:257:29: (x= indexes )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==INDEXES) ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:257:29: x= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1238);
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:263:6: ^( LOOKUP String ( indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup1257); 
					match(input, Token.DOWN, null); 
					String39=(CommonTree)match(input,String,FOLLOW_String_in_lookup1259); 
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:263:22: ( indexes )?
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==INDEXES) ) {
						alt26=1;
					}
					switch (alt26) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:263:22: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1261);
							indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 


					        node = new AtomNode((String39!=null?String39.getText():null));
					      
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:268:1: list returns [Node node] : ^( LIST ( exprList )? ) ;
	public final Node list() throws RecognitionException {
		Node node = null;


		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:269:3: ( ^( LIST ( exprList )? ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:269:6: ^( LIST ( exprList )? )
			{
			match(input,LIST,FOLLOW_LIST_in_list1286); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:269:13: ( exprList )?
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==EXP_LIST) ) {
					alt28=1;
				}
				switch (alt28) {
					case 1 :
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:269:13: exprList
						{
						pushFollow(FOLLOW_exprList_in_list1288);
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:272:1: indexes returns [java.util.List<Node> e] : ^( INDEXES ( expression )+ ) ;
	public final java.util.List<Node> indexes() throws RecognitionException {
		java.util.List<Node> e = null;


		Node expression40 =null;

		e = new java.util.ArrayList<Node>();
		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:274:3: ( ^( INDEXES ( expression )+ ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:274:6: ^( INDEXES ( expression )+ )
			{
			match(input,INDEXES,FOLLOW_INDEXES_in_indexes1314); 
			match(input, Token.DOWN, null); 
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:274:16: ( expression )+
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:274:17: expression
					{
					pushFollow(FOLLOW_expression_in_indexes1317);
					expression40=expression();
					state._fsp--;

					e.add(expression40);
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
	public static final BitSet FOLLOW_statement_in_block100 = new BitSet(new long[]{0x0180001460000018L,0x0000000000003900L});
	public static final BitSet FOLLOW_RETURN_in_block120 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_block127 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assignment_in_statement159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_statement172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_statement183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forStatement_in_statement195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStatement_in_statement207 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incrementation_in_statement216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_query_in_statement225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_update_in_statement234 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_println_in_statement243 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_in_statement252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_76_in_query272 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_query275 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_functionCall_in_query283 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_77_in_update303 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_update306 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_variableCall324 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGNMENT_in_assignment344 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_assignment348 = new BitSet(new long[]{0x0247FC49A2080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_indexes_in_assignment352 = new BitSet(new long[]{0x0247FC41A2080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_assignment356 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_functionCall_in_assignment365 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_75_in_assignment377 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ASSIGNMENT_in_assignment379 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_Identifier_in_assignment383 = new BitSet(new long[]{0x0247FC49A2080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_indexes_in_assignment387 = new BitSet(new long[]{0x0247FC41A2080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_assignment391 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_functionCall_in_assignment401 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall424 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_functionCall426 = new BitSet(new long[]{0x0000000000400008L});
	public static final BitSet FOLLOW_exprList_in_functionCall428 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall443 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Assert_in_functionCall445 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_functionCall447 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall457 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Size_in_functionCall459 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_functionCall461 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PRINTLN_in_println481 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_functionCall_in_println483 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PRINTLN_in_println494 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_println496 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PRINT_in_print521 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_functionCall_in_print523 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PRINT_in_print534 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_print536 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IF_in_ifStatement567 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_EXP_in_ifStatement579 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_ifStatement581 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_block_in_ifStatement585 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXP_in_ifStatement602 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_block_in_ifStatement606 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_For_in_forStatement651 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assignment_in_forStatement655 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_forStatement659 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_afterthought_in_forStatement663 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_block_in_forStatement667 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_afterthought688 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Assign_in_afterthought690 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_afterthought692 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incrementation_in_afterthought702 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_While_in_whileStatement722 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_whileStatement724 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_block_in_whileStatement726 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_LIST_in_idList748 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_idList750 = new BitSet(new long[]{0x0000001000000008L});
	public static final BitSet FOLLOW_EXP_LIST_in_exprList776 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_exprList781 = new BitSet(new long[]{0x0247FC4182080468L,0x00000000000010B0L});
	public static final BitSet FOLLOW_TERNARY_in_expression807 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression809 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression811 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression813 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_In_in_expression822 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression824 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression826 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Or_in_expression835 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression839 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression843 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_And_in_expression854 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression858 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression862 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Equals_in_expression873 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression877 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression881 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEquals_in_expression892 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression896 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression900 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GTEquals_in_expression911 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression915 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression919 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LTEquals_in_expression930 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression934 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression938 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_expression949 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression953 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression957 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LT_in_expression968 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression972 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression976 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Add_in_expression987 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression991 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression995 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Subtract_in_expression1006 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1010 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression1014 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Multiply_in_expression1025 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1029 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression1033 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Divide_in_expression1044 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1048 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression1052 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Modulus_in_expression1063 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1065 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression1067 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Pow_in_expression1076 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1078 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression1080 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNARY_MIN_in_expression1089 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1091 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEGATE_in_expression1100 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1102 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Number_in_expression1110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Bool_in_expression1119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Null_in_expression1129 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lookup_in_expression1136 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_query_in_expression1147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableCall_in_incrementation1166 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_Increment_in_incrementation1169 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_73_in_incrementation1176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup1201 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_list_in_lookup1203 = new BitSet(new long[]{0x0000000800000008L});
	public static final BitSet FOLLOW_indexes_in_lookup1205 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup1215 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_lookup1217 = new BitSet(new long[]{0x0000000800000008L});
	public static final BitSet FOLLOW_indexes_in_lookup1219 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup1230 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_lookup1234 = new BitSet(new long[]{0x0000000800000008L});
	public static final BitSet FOLLOW_indexes_in_lookup1238 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup1257 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_String_in_lookup1259 = new BitSet(new long[]{0x0000000800000008L});
	public static final BitSet FOLLOW_indexes_in_lookup1261 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LIST_in_list1286 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exprList_in_list1288 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INDEXES_in_indexes1314 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_indexes1317 = new BitSet(new long[]{0x0247FC4182080468L,0x00000000000010B0L});
}
