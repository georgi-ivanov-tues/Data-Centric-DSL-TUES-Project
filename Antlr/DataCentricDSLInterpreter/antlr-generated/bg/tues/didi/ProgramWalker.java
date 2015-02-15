// $ANTLR 3.5.2 D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g 2015-02-15 23:04:59

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
	@Override public String getGrammarFileName() { return "D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g"; }


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
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:77:1: program returns [Value returnValue] : block ;
	public final Value program() throws RecognitionException {
		Value returnValue = null;


		Node block1 =null;

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:78:3: ( block )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:78:6: block
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
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:83:1: block returns [Node node] : ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) ;
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
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:99:3: ( ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:99:6: ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) )
			{
			match(input,BLOCK,FOLLOW_BLOCK_in_block84); 
			match(input, Token.DOWN, null); 
			match(input,STATEMENTS,FOLLOW_STATEMENTS_in_block97); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:100:23: ( statement )*
				loop1:
				while (true) {
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==ASSIGNMENT||(LA1_0 >= FUNC_CALL && LA1_0 <= For)||LA1_0==IF||LA1_0==Identifier||(LA1_0 >= PRINT && LA1_0 <= PRINTLN)||LA1_0==While||(LA1_0 >= 75 && LA1_0 <= 77)) ) {
						alt1=1;
					}

					switch (alt1) {
					case 1 :
						// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:100:24: statement
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
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:101:23: ( expression )?
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= Add && LA2_0 <= And)||LA2_0==Bool||LA2_0==Divide||LA2_0==Equals||(LA2_0 >= GT && LA2_0 <= GTEquals)||LA2_0==In||(LA2_0 >= LOOKUP && LA2_0 <= Number)||LA2_0==Or||LA2_0==Pow||(LA2_0 >= Subtract && LA2_0 <= TERNARY)||LA2_0==UNARY_MIN||LA2_0==76) ) {
					alt2=1;
				}
				switch (alt2) {
					case 1 :
						// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:101:24: expression
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
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:105:1: statement returns [Node node] : ( assignment | functionCall | ifStatement | forStatement | whileStatement | incrementation | query | update | println | print );
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
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:106:3: ( assignment | functionCall | ifStatement | forStatement | whileStatement | incrementation | query | update | println | print )
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
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:106:6: assignment
					{
					pushFollow(FOLLOW_assignment_in_statement159);
					assignment4=assignment();
					state._fsp--;

					node = assignment4;
					}
					break;
				case 2 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:107:6: functionCall
					{
					pushFollow(FOLLOW_functionCall_in_statement172);
					functionCall5=functionCall();
					state._fsp--;

					node = functionCall5;
					}
					break;
				case 3 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:108:6: ifStatement
					{
					pushFollow(FOLLOW_ifStatement_in_statement183);
					ifStatement6=ifStatement();
					state._fsp--;

					node = ifStatement6;
					}
					break;
				case 4 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:109:6: forStatement
					{
					pushFollow(FOLLOW_forStatement_in_statement195);
					forStatement7=forStatement();
					state._fsp--;

					node = forStatement7;
					}
					break;
				case 5 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:110:6: whileStatement
					{
					pushFollow(FOLLOW_whileStatement_in_statement207);
					whileStatement8=whileStatement();
					state._fsp--;

					node = whileStatement8;
					}
					break;
				case 6 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:111:6: incrementation
					{
					pushFollow(FOLLOW_incrementation_in_statement216);
					incrementation9=incrementation();
					state._fsp--;

					node = incrementation9;
					}
					break;
				case 7 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:112:6: query
					{
					pushFollow(FOLLOW_query_in_statement225);
					query10=query();
					state._fsp--;

					node = query10;
					}
					break;
				case 8 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:113:6: update
					{
					pushFollow(FOLLOW_update_in_statement234);
					update11=update();
					state._fsp--;

					node = update11;
					}
					break;
				case 9 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:114:6: println
					{
					pushFollow(FOLLOW_println_in_statement243);
					println12=println();
					state._fsp--;

					node = println12;
					}
					break;
				case 10 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:115:6: print
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
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:118:1: query returns [Node node] : ( ^( 'query' expression ) | ^( 'query' functionCall ) );
	public final Node query() throws RecognitionException {
		Node node = null;


		Node expression14 =null;
		Node functionCall15 =null;

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:119:3: ( ^( 'query' expression ) | ^( 'query' functionCall ) )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==76) ) {
				int LA4_1 = input.LA(2);
				if ( (LA4_1==DOWN) ) {
					int LA4_2 = input.LA(3);
					if ( ((LA4_2 >= Add && LA4_2 <= And)||LA4_2==Bool||LA4_2==Divide||LA4_2==Equals||(LA4_2 >= GT && LA4_2 <= GTEquals)||LA4_2==In||(LA4_2 >= LOOKUP && LA4_2 <= Number)||LA4_2==Or||LA4_2==Pow||(LA4_2 >= Subtract && LA4_2 <= TERNARY)||LA4_2==UNARY_MIN||LA4_2==76) ) {
						alt4=1;
					}
					else if ( (LA4_2==FUNC_CALL) ) {
						alt4=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 2, input);
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
							new NoViableAltException("", 4, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:119:5: ^( 'query' expression )
					{
					match(input,76,FOLLOW_76_in_query272); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_query274);
					expression14=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new QueryNode(expression14, dataSource);
					}
					break;
				case 2 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:120:5: ^( 'query' functionCall )
					{
					match(input,76,FOLLOW_76_in_query284); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_functionCall_in_query286);
					functionCall15=functionCall();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new QueryNode(functionCall15, dataSource);
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
	// $ANTLR end "query"



	// $ANTLR start "update"
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:123:1: update returns [Node node] : ( ^( 'update' expression ) | ^( 'update' functionCall ) );
	public final Node update() throws RecognitionException {
		Node node = null;


		Node expression16 =null;
		Node functionCall17 =null;

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:124:3: ( ^( 'update' expression ) | ^( 'update' functionCall ) )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==77) ) {
				int LA5_1 = input.LA(2);
				if ( (LA5_1==DOWN) ) {
					int LA5_2 = input.LA(3);
					if ( ((LA5_2 >= Add && LA5_2 <= And)||LA5_2==Bool||LA5_2==Divide||LA5_2==Equals||(LA5_2 >= GT && LA5_2 <= GTEquals)||LA5_2==In||(LA5_2 >= LOOKUP && LA5_2 <= Number)||LA5_2==Or||LA5_2==Pow||(LA5_2 >= Subtract && LA5_2 <= TERNARY)||LA5_2==UNARY_MIN||LA5_2==76) ) {
						alt5=1;
					}
					else if ( (LA5_2==FUNC_CALL) ) {
						alt5=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 5, 2, input);
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
							new NoViableAltException("", 5, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:124:5: ^( 'update' expression )
					{
					match(input,77,FOLLOW_77_in_update307); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_update309);
					expression16=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new UpdateNode(expression16, dataSource, outputStream);
					}
					break;
				case 2 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:125:5: ^( 'update' functionCall )
					{
					match(input,77,FOLLOW_77_in_update319); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_functionCall_in_update321);
					functionCall17=functionCall();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new UpdateNode(functionCall17, dataSource, outputStream);
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
	// $ANTLR end "update"



	// $ANTLR start "variableCall"
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:128:1: variableCall returns [String value] : Identifier ;
	public final String variableCall() throws RecognitionException {
		String value = null;


		CommonTree Identifier18=null;

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:128:36: ( Identifier )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:129:3: Identifier
			{
			Identifier18=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_variableCall340); 
			value=(Identifier18!=null?Identifier18.getText():null);
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
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:132:1: assignment returns [Node node] : ( ^( ASSIGNMENT i= Identifier (x= indexes )? ( expression | functionCall ) ) | ^( 'global' ASSIGNMENT i= Identifier (x= indexes )? ( expression | functionCall ) ) );
	public final Node assignment() throws RecognitionException {
		Node node = null;


		CommonTree i=null;
		java.util.List<Node> x =null;
		Node expression19 =null;
		Node functionCall20 =null;
		Node expression21 =null;
		Node functionCall22 =null;

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:133:3: ( ^( ASSIGNMENT i= Identifier (x= indexes )? ( expression | functionCall ) ) | ^( 'global' ASSIGNMENT i= Identifier (x= indexes )? ( expression | functionCall ) ) )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==ASSIGNMENT) ) {
				alt10=1;
			}
			else if ( (LA10_0==75) ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:133:6: ^( ASSIGNMENT i= Identifier (x= indexes )? ( expression | functionCall ) )
					{
					match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assignment360); 
					match(input, Token.DOWN, null); 
					i=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_assignment364); 
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:133:33: (x= indexes )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==INDEXES) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:133:33: x= indexes
							{
							pushFollow(FOLLOW_indexes_in_assignment368);
							x=indexes();
							state._fsp--;

							}
							break;

					}

					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:133:43: ( expression | functionCall )
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( ((LA7_0 >= Add && LA7_0 <= And)||LA7_0==Bool||LA7_0==Divide||LA7_0==Equals||(LA7_0 >= GT && LA7_0 <= GTEquals)||LA7_0==In||(LA7_0 >= LOOKUP && LA7_0 <= Number)||LA7_0==Or||LA7_0==Pow||(LA7_0 >= Subtract && LA7_0 <= TERNARY)||LA7_0==UNARY_MIN||LA7_0==76) ) {
						alt7=1;
					}
					else if ( (LA7_0==FUNC_CALL) ) {
						alt7=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 7, 0, input);
						throw nvae;
					}

					switch (alt7) {
						case 1 :
							// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:133:44: expression
							{
							pushFollow(FOLLOW_expression_in_assignment372);
							expression19=expression();
							state._fsp--;

							node = new AssignmentNode((i!=null?i.getText():null), x, expression19, currentScope);
							}
							break;
						case 2 :
							// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:134:6: functionCall
							{
							pushFollow(FOLLOW_functionCall_in_assignment381);
							functionCall20=functionCall();
							state._fsp--;

							node = new AssignmentNode((i!=null?i.getText():null), x, functionCall20, currentScope);
							}
							break;

					}

					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:135:6: ^( 'global' ASSIGNMENT i= Identifier (x= indexes )? ( expression | functionCall ) )
					{
					match(input,75,FOLLOW_75_in_assignment393); 
					match(input, Token.DOWN, null); 
					match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assignment395); 
					i=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_assignment399); 
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:135:42: (x= indexes )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==INDEXES) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:135:42: x= indexes
							{
							pushFollow(FOLLOW_indexes_in_assignment403);
							x=indexes();
							state._fsp--;

							}
							break;

					}

					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:135:52: ( expression | functionCall )
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( ((LA9_0 >= Add && LA9_0 <= And)||LA9_0==Bool||LA9_0==Divide||LA9_0==Equals||(LA9_0 >= GT && LA9_0 <= GTEquals)||LA9_0==In||(LA9_0 >= LOOKUP && LA9_0 <= Number)||LA9_0==Or||LA9_0==Pow||(LA9_0 >= Subtract && LA9_0 <= TERNARY)||LA9_0==UNARY_MIN||LA9_0==76) ) {
						alt9=1;
					}
					else if ( (LA9_0==FUNC_CALL) ) {
						alt9=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 9, 0, input);
						throw nvae;
					}

					switch (alt9) {
						case 1 :
							// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:135:53: expression
							{
							pushFollow(FOLLOW_expression_in_assignment407);
							expression21=expression();
							state._fsp--;


							        Scope globalScope = currentScope;
							        
							        while(globalScope.parent() != null){
							          globalScope = globalScope.parent();
							        }
							        node = new AssignmentNode((i!=null?i.getText():null), x, expression21, globalScope);
							        
							}
							break;
						case 2 :
							// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:143:7: functionCall
							{
							pushFollow(FOLLOW_functionCall_in_assignment417);
							functionCall22=functionCall();
							state._fsp--;


							        Scope globalScope = currentScope;
							        
							        while(globalScope.parent() != null){
							          globalScope = globalScope.parent();
							        }
							        node = new AssignmentNode((i!=null?i.getText():null), x, functionCall22, globalScope);
							        
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
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:153:1: functionCall returns [Node node] : ( ^( FUNC_CALL Identifier ( exprList )? ) | ^( FUNC_CALL Assert expression ) | ^( FUNC_CALL Size expression ) );
	public final Node functionCall() throws RecognitionException {
		Node node = null;


		CommonTree Identifier24=null;
		java.util.List<Node> exprList23 =null;

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:154:3: ( ^( FUNC_CALL Identifier ( exprList )? ) | ^( FUNC_CALL Assert expression ) | ^( FUNC_CALL Size expression ) )
			int alt12=3;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==FUNC_CALL) ) {
				int LA12_1 = input.LA(2);
				if ( (LA12_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case Identifier:
						{
						alt12=1;
						}
						break;
					case Assert:
						{
						alt12=2;
						}
						break;
					case Size:
						{
						alt12=3;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 12, 2, input);
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
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:154:6: ^( FUNC_CALL Identifier ( exprList )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall440); 
					match(input, Token.DOWN, null); 
					Identifier24=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_functionCall442); 
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:154:29: ( exprList )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==EXP_LIST) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:154:29: exprList
							{
							pushFollow(FOLLOW_exprList_in_functionCall444);
							exprList23=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 


					        
					        int paramSize = 0;
					        if(exprList23 == null){
					            paramSize = 0;
					        }else{
					            paramSize = exprList23.size();
					        }
					      Function function = new Function(functions.get((Identifier24!=null?Identifier24.getText():null) + paramSize));
					      function.setParameters(paramSize == 0 ? new ArrayList<Node>() : exprList23);
					      function.setFunctions(functions);
					      function.setContext(context);
					      node = function;
					      
					  
					}
					break;
				case 2 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:172:6: ^( FUNC_CALL Assert expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall459); 
					match(input, Token.DOWN, null); 
					match(input,Assert,FOLLOW_Assert_in_functionCall461); 
					pushFollow(FOLLOW_expression_in_functionCall463);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:173:6: ^( FUNC_CALL Size expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall473); 
					match(input, Token.DOWN, null); 
					match(input,Size,FOLLOW_Size_in_functionCall475); 
					pushFollow(FOLLOW_expression_in_functionCall477);
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
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:176:1: println returns [Node node] : ( ^( PRINTLN functionCall ) | ^( PRINTLN ( expression )? ) );
	public final Node println() throws RecognitionException {
		Node node = null;


		Node functionCall25 =null;
		Node expression26 =null;

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:177:3: ( ^( PRINTLN functionCall ) | ^( PRINTLN ( expression )? ) )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==PRINTLN) ) {
				int LA14_1 = input.LA(2);
				if ( (LA14_1==DOWN) ) {
					int LA14_2 = input.LA(3);
					if ( (LA14_2==FUNC_CALL) ) {
						alt14=1;
					}
					else if ( (LA14_2==UP||(LA14_2 >= Add && LA14_2 <= And)||LA14_2==Bool||LA14_2==Divide||LA14_2==Equals||(LA14_2 >= GT && LA14_2 <= GTEquals)||LA14_2==In||(LA14_2 >= LOOKUP && LA14_2 <= Number)||LA14_2==Or||LA14_2==Pow||(LA14_2 >= Subtract && LA14_2 <= TERNARY)||LA14_2==UNARY_MIN||LA14_2==76) ) {
						alt14=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 14, 2, input);
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
							new NoViableAltException("", 14, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:177:6: ^( PRINTLN functionCall )
					{
					match(input,PRINTLN,FOLLOW_PRINTLN_in_println497); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_functionCall_in_println499);
					functionCall25=functionCall();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new PrintlnNode(functionCall25, outputStream);
					}
					break;
				case 2 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:178:6: ^( PRINTLN ( expression )? )
					{
					match(input,PRINTLN,FOLLOW_PRINTLN_in_println510); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:178:16: ( expression )?
						int alt13=2;
						int LA13_0 = input.LA(1);
						if ( ((LA13_0 >= Add && LA13_0 <= And)||LA13_0==Bool||LA13_0==Divide||LA13_0==Equals||(LA13_0 >= GT && LA13_0 <= GTEquals)||LA13_0==In||(LA13_0 >= LOOKUP && LA13_0 <= Number)||LA13_0==Or||LA13_0==Pow||(LA13_0 >= Subtract && LA13_0 <= TERNARY)||LA13_0==UNARY_MIN||LA13_0==76) ) {
							alt13=1;
						}
						switch (alt13) {
							case 1 :
								// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:178:16: expression
								{
								pushFollow(FOLLOW_expression_in_println512);
								expression26=expression();
								state._fsp--;

								}
								break;

						}

						match(input, Token.UP, null); 
					}

					node = new PrintlnNode(expression26, outputStream);
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
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:181:1: print returns [Node node] : ( ^( PRINT functionCall ) | ^( PRINT ( expression )? ) );
	public final Node print() throws RecognitionException {
		Node node = null;


		Node functionCall27 =null;
		Node expression28 =null;

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:182:3: ( ^( PRINT functionCall ) | ^( PRINT ( expression )? ) )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==PRINT) ) {
				int LA16_1 = input.LA(2);
				if ( (LA16_1==DOWN) ) {
					int LA16_2 = input.LA(3);
					if ( (LA16_2==FUNC_CALL) ) {
						alt16=1;
					}
					else if ( (LA16_2==UP||(LA16_2 >= Add && LA16_2 <= And)||LA16_2==Bool||LA16_2==Divide||LA16_2==Equals||(LA16_2 >= GT && LA16_2 <= GTEquals)||LA16_2==In||(LA16_2 >= LOOKUP && LA16_2 <= Number)||LA16_2==Or||LA16_2==Pow||(LA16_2 >= Subtract && LA16_2 <= TERNARY)||LA16_2==UNARY_MIN||LA16_2==76) ) {
						alt16=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 16, 2, input);
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
							new NoViableAltException("", 16, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:182:6: ^( PRINT functionCall )
					{
					match(input,PRINT,FOLLOW_PRINT_in_print537); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_functionCall_in_print539);
					functionCall27=functionCall();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new PrintNode(functionCall27, outputStream);
					}
					break;
				case 2 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:183:6: ^( PRINT ( expression )? )
					{
					match(input,PRINT,FOLLOW_PRINT_in_print550); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:183:14: ( expression )?
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( ((LA15_0 >= Add && LA15_0 <= And)||LA15_0==Bool||LA15_0==Divide||LA15_0==Equals||(LA15_0 >= GT && LA15_0 <= GTEquals)||LA15_0==In||(LA15_0 >= LOOKUP && LA15_0 <= Number)||LA15_0==Or||LA15_0==Pow||(LA15_0 >= Subtract && LA15_0 <= TERNARY)||LA15_0==UNARY_MIN||LA15_0==76) ) {
							alt15=1;
						}
						switch (alt15) {
							case 1 :
								// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:183:14: expression
								{
								pushFollow(FOLLOW_expression_in_print552);
								expression28=expression();
								state._fsp--;

								}
								break;

						}

						match(input, Token.UP, null); 
					}

					node = new PrintNode(expression28, outputStream);
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
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:186:1: ifStatement returns [Node node] : ^( IF ( ^( EXP expression b1= block ) )+ ( ^( EXP b2= block ) )? ) ;
	public final Node ifStatement() throws RecognitionException {
		Node node = null;


		Node b1 =null;
		Node b2 =null;
		Node expression29 =null;


		  IfNode ifNode = new IfNode();
		  node = ifNode;

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:191:3: ( ^( IF ( ^( EXP expression b1= block ) )+ ( ^( EXP b2= block ) )? ) )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:191:6: ^( IF ( ^( EXP expression b1= block ) )+ ( ^( EXP b2= block ) )? )
			{
			match(input,IF,FOLLOW_IF_in_ifStatement583); 
			match(input, Token.DOWN, null); 
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:192:8: ( ^( EXP expression b1= block ) )+
			int cnt17=0;
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==EXP) ) {
					int LA17_1 = input.LA(2);
					if ( (LA17_1==DOWN) ) {
						int LA17_3 = input.LA(3);
						if ( ((LA17_3 >= Add && LA17_3 <= And)||LA17_3==Bool||LA17_3==Divide||LA17_3==Equals||(LA17_3 >= GT && LA17_3 <= GTEquals)||LA17_3==In||(LA17_3 >= LOOKUP && LA17_3 <= Number)||LA17_3==Or||LA17_3==Pow||(LA17_3 >= Subtract && LA17_3 <= TERNARY)||LA17_3==UNARY_MIN||LA17_3==76) ) {
							alt17=1;
						}

					}

				}

				switch (alt17) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:192:9: ^( EXP expression b1= block )
					{
					match(input,EXP,FOLLOW_EXP_in_ifStatement595); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_ifStatement597);
					expression29=expression();
					state._fsp--;

					pushFollow(FOLLOW_block_in_ifStatement601);
					b1=block();
					state._fsp--;

					match(input, Token.UP, null); 

					ifNode.addChoice(expression29, b1);  
					}
					break;

				default :
					if ( cnt17 >= 1 ) break loop17;
					EarlyExitException eee = new EarlyExitException(17, input);
					throw eee;
				}
				cnt17++;
			}

			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:193:8: ( ^( EXP b2= block ) )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==EXP) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:193:9: ^( EXP b2= block )
					{
					match(input,EXP,FOLLOW_EXP_in_ifStatement618); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_block_in_ifStatement622);
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
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:197:1: forStatement returns [Node node] : ^( For a= assignment b= expression c= afterthought d= block ) ;
	public final Node forStatement() throws RecognitionException {
		Node node = null;


		Node a =null;
		Node b =null;
		Node c =null;
		Node d =null;

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:198:3: ( ^( For a= assignment b= expression c= afterthought d= block ) )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:198:6: ^( For a= assignment b= expression c= afterthought d= block )
			{
			match(input,For,FOLLOW_For_in_forStatement667); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_assignment_in_forStatement671);
			a=assignment();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_forStatement675);
			b=expression();
			state._fsp--;

			pushFollow(FOLLOW_afterthought_in_forStatement679);
			c=afterthought();
			state._fsp--;

			pushFollow(FOLLOW_block_in_forStatement683);
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
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:201:1: afterthought returns [Node node] : ( ( Identifier '=' expression ) | incrementation ) ;
	public final Node afterthought() throws RecognitionException {
		Node node = null;


		CommonTree Identifier30=null;
		Node expression31 =null;
		Node incrementation32 =null;

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:201:33: ( ( ( Identifier '=' expression ) | incrementation ) )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:202:3: ( ( Identifier '=' expression ) | incrementation )
			{
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:202:3: ( ( Identifier '=' expression ) | incrementation )
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==Identifier) ) {
				int LA19_1 = input.LA(2);
				if ( (LA19_1==Assign) ) {
					alt19=1;
				}
				else if ( (LA19_1==Increment||LA19_1==73) ) {
					alt19=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 19, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:202:4: ( Identifier '=' expression )
					{
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:202:4: ( Identifier '=' expression )
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:202:5: Identifier '=' expression
					{
					Identifier30=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_afterthought704); 
					match(input,Assign,FOLLOW_Assign_in_afterthought706); 
					pushFollow(FOLLOW_expression_in_afterthought708);
					expression31=expression();
					state._fsp--;

					node = new AssignmentNode((Identifier30!=null?Identifier30.getText():null), expression31, currentScope);
					}

					}
					break;
				case 2 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:203:5: incrementation
					{
					pushFollow(FOLLOW_incrementation_in_afterthought718);
					incrementation32=incrementation();
					state._fsp--;

					node = incrementation32;
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
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:206:1: whileStatement returns [Node node] : ^( While expression block ) ;
	public final Node whileStatement() throws RecognitionException {
		Node node = null;


		Node expression33 =null;
		Node block34 =null;

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:207:3: ( ^( While expression block ) )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:207:6: ^( While expression block )
			{
			match(input,While,FOLLOW_While_in_whileStatement738); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_whileStatement740);
			expression33=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_whileStatement742);
			block34=block();
			state._fsp--;

			match(input, Token.UP, null); 

			node = new WhileNode(expression33, block34);
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
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:210:1: idList returns [java.util.List<String> i] : ^( ID_LIST ( Identifier )+ ) ;
	public final java.util.List<String> idList() throws RecognitionException {
		java.util.List<String> i = null;


		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:211:3: ( ^( ID_LIST ( Identifier )+ ) )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:211:6: ^( ID_LIST ( Identifier )+ )
			{
			match(input,ID_LIST,FOLLOW_ID_LIST_in_idList764); 
			match(input, Token.DOWN, null); 
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:211:16: ( Identifier )+
			int cnt20=0;
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==Identifier) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:211:16: Identifier
					{
					match(input,Identifier,FOLLOW_Identifier_in_idList766); 
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
		return i;
	}
	// $ANTLR end "idList"



	// $ANTLR start "exprList"
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:214:1: exprList returns [java.util.List<Node> e] : ^( EXP_LIST (a= expression )+ ) ;
	public final java.util.List<Node> exprList() throws RecognitionException {
		java.util.List<Node> e = null;


		Node a =null;


		  e = new ArrayList<Node>();

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:218:3: ( ^( EXP_LIST (a= expression )+ ) )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:218:6: ^( EXP_LIST (a= expression )+ )
			{
			match(input,EXP_LIST,FOLLOW_EXP_LIST_in_exprList792); 
			match(input, Token.DOWN, null); 
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:218:17: (a= expression )+
			int cnt21=0;
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( ((LA21_0 >= Add && LA21_0 <= And)||LA21_0==Bool||LA21_0==Divide||LA21_0==Equals||(LA21_0 >= GT && LA21_0 <= GTEquals)||LA21_0==In||(LA21_0 >= LOOKUP && LA21_0 <= Number)||LA21_0==Or||LA21_0==Pow||(LA21_0 >= Subtract && LA21_0 <= TERNARY)||LA21_0==UNARY_MIN||LA21_0==76) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:218:18: a= expression
					{
					pushFollow(FOLLOW_expression_in_exprList797);
					a=expression();
					state._fsp--;

					e.add(a);
					}
					break;

				default :
					if ( cnt21 >= 1 ) break loop21;
					EarlyExitException eee = new EarlyExitException(21, input);
					throw eee;
				}
				cnt21++;
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
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:222:1: expression returns [Node node] : ( ^( TERNARY expression expression expression ) | ^( In expression expression ) | ^( '||' a= expression b= expression ) | ^( '&&' a= expression b= expression ) | ^( '==' a= expression b= expression ) | ^( '!=' a= expression b= expression ) | ^( '>=' a= expression b= expression ) | ^( '<=' a= expression b= expression ) | ^( '>' a= expression b= expression ) | ^( '<' a= expression b= expression ) | ^( '+' a= expression b= expression ) | ^( '-' a= expression b= expression ) | ^( '*' a= expression b= expression ) | ^( '/' a= expression b= expression ) | ^( '%' expression expression ) | ^( '^' expression expression ) | ^( UNARY_MIN expression ) | ^( NEGATE expression ) | Number | Bool | Null | lookup | query );
	public final Node expression() throws RecognitionException {
		Node node = null;


		CommonTree Number35=null;
		CommonTree Bool36=null;
		Node a =null;
		Node b =null;
		Node lookup37 =null;
		Node query38 =null;

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:223:3: ( ^( TERNARY expression expression expression ) | ^( In expression expression ) | ^( '||' a= expression b= expression ) | ^( '&&' a= expression b= expression ) | ^( '==' a= expression b= expression ) | ^( '!=' a= expression b= expression ) | ^( '>=' a= expression b= expression ) | ^( '<=' a= expression b= expression ) | ^( '>' a= expression b= expression ) | ^( '<' a= expression b= expression ) | ^( '+' a= expression b= expression ) | ^( '-' a= expression b= expression ) | ^( '*' a= expression b= expression ) | ^( '/' a= expression b= expression ) | ^( '%' expression expression ) | ^( '^' expression expression ) | ^( UNARY_MIN expression ) | ^( NEGATE expression ) | Number | Bool | Null | lookup | query )
			int alt22=23;
			switch ( input.LA(1) ) {
			case TERNARY:
				{
				alt22=1;
				}
				break;
			case In:
				{
				alt22=2;
				}
				break;
			case Or:
				{
				alt22=3;
				}
				break;
			case And:
				{
				alt22=4;
				}
				break;
			case Equals:
				{
				alt22=5;
				}
				break;
			case NEquals:
				{
				alt22=6;
				}
				break;
			case GTEquals:
				{
				alt22=7;
				}
				break;
			case LTEquals:
				{
				alt22=8;
				}
				break;
			case GT:
				{
				alt22=9;
				}
				break;
			case LT:
				{
				alt22=10;
				}
				break;
			case Add:
				{
				alt22=11;
				}
				break;
			case Subtract:
				{
				alt22=12;
				}
				break;
			case Multiply:
				{
				alt22=13;
				}
				break;
			case Divide:
				{
				alt22=14;
				}
				break;
			case Modulus:
				{
				alt22=15;
				}
				break;
			case Pow:
				{
				alt22=16;
				}
				break;
			case UNARY_MIN:
				{
				alt22=17;
				}
				break;
			case NEGATE:
				{
				alt22=18;
				}
				break;
			case Number:
				{
				alt22=19;
				}
				break;
			case Bool:
				{
				alt22=20;
				}
				break;
			case Null:
				{
				alt22=21;
				}
				break;
			case LOOKUP:
				{
				alt22=22;
				}
				break;
			case 76:
				{
				alt22=23;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}
			switch (alt22) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:223:6: ^( TERNARY expression expression expression )
					{
					match(input,TERNARY,FOLLOW_TERNARY_in_expression823); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression825);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression827);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression829);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:224:6: ^( In expression expression )
					{
					match(input,In,FOLLOW_In_in_expression838); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression840);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression842);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:225:6: ^( '||' a= expression b= expression )
					{
					match(input,Or,FOLLOW_Or_in_expression851); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression855);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression859);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new OrNode(a, b);
					}
					break;
				case 4 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:226:6: ^( '&&' a= expression b= expression )
					{
					match(input,And,FOLLOW_And_in_expression870); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression874);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression878);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new AndNode(a, b);
					}
					break;
				case 5 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:227:6: ^( '==' a= expression b= expression )
					{
					match(input,Equals,FOLLOW_Equals_in_expression889); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression893);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression897);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new EqualsNode(a, b);
					}
					break;
				case 6 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:228:6: ^( '!=' a= expression b= expression )
					{
					match(input,NEquals,FOLLOW_NEquals_in_expression908); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression912);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression916);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new NotEqualsNode(a, b);
					}
					break;
				case 7 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:229:6: ^( '>=' a= expression b= expression )
					{
					match(input,GTEquals,FOLLOW_GTEquals_in_expression927); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression931);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression935);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GreaterThanAndEqualsNode(a, b);
					}
					break;
				case 8 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:230:6: ^( '<=' a= expression b= expression )
					{
					match(input,LTEquals,FOLLOW_LTEquals_in_expression946); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression950);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression954);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new LessThanAndEqualsNode(a, b);
					}
					break;
				case 9 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:231:6: ^( '>' a= expression b= expression )
					{
					match(input,GT,FOLLOW_GT_in_expression965); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression969);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression973);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GreaterThanNode(a, b);
					}
					break;
				case 10 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:232:6: ^( '<' a= expression b= expression )
					{
					match(input,LT,FOLLOW_LT_in_expression984); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression988);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression992);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new LessThanNode(a, b);
					}
					break;
				case 11 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:233:6: ^( '+' a= expression b= expression )
					{
					match(input,Add,FOLLOW_Add_in_expression1003); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1007);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1011);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new AddNode(a, b);
					}
					break;
				case 12 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:234:6: ^( '-' a= expression b= expression )
					{
					match(input,Subtract,FOLLOW_Subtract_in_expression1022); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1026);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1030);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new SubNode(a, b);
					}
					break;
				case 13 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:235:6: ^( '*' a= expression b= expression )
					{
					match(input,Multiply,FOLLOW_Multiply_in_expression1041); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1045);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1049);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new MultiplicationNode(a, b);
					}
					break;
				case 14 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:236:6: ^( '/' a= expression b= expression )
					{
					match(input,Divide,FOLLOW_Divide_in_expression1060); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1064);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1068);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new DivisionNode(a, b);
					}
					break;
				case 15 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:237:6: ^( '%' expression expression )
					{
					match(input,Modulus,FOLLOW_Modulus_in_expression1079); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1081);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1083);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 16 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:238:6: ^( '^' expression expression )
					{
					match(input,Pow,FOLLOW_Pow_in_expression1092); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1094);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1096);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 17 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:239:6: ^( UNARY_MIN expression )
					{
					match(input,UNARY_MIN,FOLLOW_UNARY_MIN_in_expression1105); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1107);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 18 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:240:6: ^( NEGATE expression )
					{
					match(input,NEGATE,FOLLOW_NEGATE_in_expression1116); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1118);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 19 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:241:6: Number
					{
					Number35=(CommonTree)match(input,Number,FOLLOW_Number_in_expression1126); 
					node = new AtomNode(Double.parseDouble((Number35!=null?Number35.getText():null)));
					}
					break;
				case 20 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:242:6: Bool
					{
					Bool36=(CommonTree)match(input,Bool,FOLLOW_Bool_in_expression1135); 
					node = new AtomNode(new Boolean((Bool36!=null?Bool36.getText():null)));
					}
					break;
				case 21 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:243:6: Null
					{
					match(input,Null,FOLLOW_Null_in_expression1145); 
					}
					break;
				case 22 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:244:6: lookup
					{
					pushFollow(FOLLOW_lookup_in_expression1152);
					lookup37=lookup();
					state._fsp--;

					node = lookup37;
					}
					break;
				case 23 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:245:6: query
					{
					pushFollow(FOLLOW_query_in_expression1163);
					query38=query();
					state._fsp--;

					node = query38;
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
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:248:1: incrementation returns [Node node] : ( variableCall ( '++' | '--' ) ) ;
	public final Node incrementation() throws RecognitionException {
		Node node = null;


		String variableCall39 =null;

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:249:3: ( ( variableCall ( '++' | '--' ) ) )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:249:4: ( variableCall ( '++' | '--' ) )
			{
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:249:4: ( variableCall ( '++' | '--' ) )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:249:5: variableCall ( '++' | '--' )
			{
			pushFollow(FOLLOW_variableCall_in_incrementation1182);
			variableCall39=variableCall();
			state._fsp--;

			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:249:18: ( '++' | '--' )
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==Increment) ) {
				alt23=1;
			}
			else if ( (LA23_0==73) ) {
				alt23=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}

			switch (alt23) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:249:19: '++'
					{
					match(input,Increment,FOLLOW_Increment_in_incrementation1185); 
					node = new IncrementationNode(variableCall39,1,currentScope);
					}
					break;
				case 2 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:250:5: '--'
					{
					match(input,73,FOLLOW_73_in_incrementation1192); 
					node = new IncrementationNode(variableCall39,-1,currentScope);
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
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:254:1: lookup returns [Node node] : ( ^( LOOKUP list ( indexes )? ) | ^( LOOKUP expression ( indexes )? ) | ^( LOOKUP i= Identifier (x= indexes )? ) | ^( LOOKUP String ( indexes )? ) );
	public final Node lookup() throws RecognitionException {
		Node node = null;


		CommonTree i=null;
		CommonTree String40=null;
		java.util.List<Node> x =null;

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:256:3: ( ^( LOOKUP list ( indexes )? ) | ^( LOOKUP expression ( indexes )? ) | ^( LOOKUP i= Identifier (x= indexes )? ) | ^( LOOKUP String ( indexes )? ) )
			int alt28=4;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==LOOKUP) ) {
				int LA28_1 = input.LA(2);
				if ( (LA28_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case Identifier:
						{
						alt28=3;
						}
						break;
					case String:
						{
						alt28=4;
						}
						break;
					case LIST:
						{
						alt28=1;
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
						alt28=2;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 28, 2, input);
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
							new NoViableAltException("", 28, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}

			switch (alt28) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:256:6: ^( LOOKUP list ( indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup1217); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_list_in_lookup1219);
					list();
					state._fsp--;

					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:256:20: ( indexes )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==INDEXES) ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:256:20: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1221);
							indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:257:6: ^( LOOKUP expression ( indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup1231); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_lookup1233);
					expression();
					state._fsp--;

					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:257:26: ( indexes )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==INDEXES) ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:257:26: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1235);
							indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:258:6: ^( LOOKUP i= Identifier (x= indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup1246); 
					match(input, Token.DOWN, null); 
					i=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_lookup1250); 
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:258:29: (x= indexes )?
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==INDEXES) ) {
						alt26=1;
					}
					switch (alt26) {
						case 1 :
							// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:258:29: x= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1254);
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
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:264:6: ^( LOOKUP String ( indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup1273); 
					match(input, Token.DOWN, null); 
					String40=(CommonTree)match(input,String,FOLLOW_String_in_lookup1275); 
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:264:22: ( indexes )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==INDEXES) ) {
						alt27=1;
					}
					switch (alt27) {
						case 1 :
							// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:264:22: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1277);
							indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 


					        node = new AtomNode((String40!=null?String40.getText():null));
					      
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
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:269:1: list returns [Node node] : ^( LIST ( exprList )? ) ;
	public final Node list() throws RecognitionException {
		Node node = null;


		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:270:3: ( ^( LIST ( exprList )? ) )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:270:6: ^( LIST ( exprList )? )
			{
			match(input,LIST,FOLLOW_LIST_in_list1302); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:270:13: ( exprList )?
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==EXP_LIST) ) {
					alt29=1;
				}
				switch (alt29) {
					case 1 :
						// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:270:13: exprList
						{
						pushFollow(FOLLOW_exprList_in_list1304);
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
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:273:1: indexes returns [java.util.List<Node> e] : ^( INDEXES ( expression )+ ) ;
	public final java.util.List<Node> indexes() throws RecognitionException {
		java.util.List<Node> e = null;


		Node expression41 =null;

		e = new java.util.ArrayList<Node>();
		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:275:3: ( ^( INDEXES ( expression )+ ) )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:275:6: ^( INDEXES ( expression )+ )
			{
			match(input,INDEXES,FOLLOW_INDEXES_in_indexes1330); 
			match(input, Token.DOWN, null); 
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:275:16: ( expression )+
			int cnt30=0;
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( ((LA30_0 >= Add && LA30_0 <= And)||LA30_0==Bool||LA30_0==Divide||LA30_0==Equals||(LA30_0 >= GT && LA30_0 <= GTEquals)||LA30_0==In||(LA30_0 >= LOOKUP && LA30_0 <= Number)||LA30_0==Or||LA30_0==Pow||(LA30_0 >= Subtract && LA30_0 <= TERNARY)||LA30_0==UNARY_MIN||LA30_0==76) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:275:17: expression
					{
					pushFollow(FOLLOW_expression_in_indexes1333);
					expression41=expression();
					state._fsp--;

					e.add(expression41);
					}
					break;

				default :
					if ( cnt30 >= 1 ) break loop30;
					EarlyExitException eee = new EarlyExitException(30, input);
					throw eee;
				}
				cnt30++;
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
	public static final BitSet FOLLOW_expression_in_query274 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_76_in_query284 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_functionCall_in_query286 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_77_in_update307 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_update309 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_77_in_update319 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_functionCall_in_update321 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_variableCall340 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGNMENT_in_assignment360 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_assignment364 = new BitSet(new long[]{0x0247FC49A2080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_indexes_in_assignment368 = new BitSet(new long[]{0x0247FC41A2080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_assignment372 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_functionCall_in_assignment381 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_75_in_assignment393 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ASSIGNMENT_in_assignment395 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_Identifier_in_assignment399 = new BitSet(new long[]{0x0247FC49A2080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_indexes_in_assignment403 = new BitSet(new long[]{0x0247FC41A2080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_assignment407 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_functionCall_in_assignment417 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall440 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_functionCall442 = new BitSet(new long[]{0x0000000000400008L});
	public static final BitSet FOLLOW_exprList_in_functionCall444 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall459 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Assert_in_functionCall461 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_functionCall463 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall473 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Size_in_functionCall475 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_functionCall477 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PRINTLN_in_println497 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_functionCall_in_println499 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PRINTLN_in_println510 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_println512 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PRINT_in_print537 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_functionCall_in_print539 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PRINT_in_print550 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_print552 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IF_in_ifStatement583 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_EXP_in_ifStatement595 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_ifStatement597 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_block_in_ifStatement601 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXP_in_ifStatement618 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_block_in_ifStatement622 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_For_in_forStatement667 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assignment_in_forStatement671 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_forStatement675 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_afterthought_in_forStatement679 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_block_in_forStatement683 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_afterthought704 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Assign_in_afterthought706 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_afterthought708 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incrementation_in_afterthought718 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_While_in_whileStatement738 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_whileStatement740 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_block_in_whileStatement742 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_LIST_in_idList764 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_idList766 = new BitSet(new long[]{0x0000001000000008L});
	public static final BitSet FOLLOW_EXP_LIST_in_exprList792 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_exprList797 = new BitSet(new long[]{0x0247FC4182080468L,0x00000000000010B0L});
	public static final BitSet FOLLOW_TERNARY_in_expression823 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression825 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression827 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression829 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_In_in_expression838 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression840 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression842 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Or_in_expression851 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression855 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression859 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_And_in_expression870 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression874 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression878 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Equals_in_expression889 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression893 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression897 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEquals_in_expression908 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression912 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression916 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GTEquals_in_expression927 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression931 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression935 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LTEquals_in_expression946 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression950 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression954 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_expression965 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression969 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression973 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LT_in_expression984 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression988 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression992 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Add_in_expression1003 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1007 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression1011 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Subtract_in_expression1022 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1026 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression1030 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Multiply_in_expression1041 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1045 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression1049 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Divide_in_expression1060 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1064 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression1068 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Modulus_in_expression1079 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1081 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression1083 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Pow_in_expression1092 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1094 = new BitSet(new long[]{0x0247FC4182080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression1096 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNARY_MIN_in_expression1105 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1107 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEGATE_in_expression1116 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1118 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Number_in_expression1126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Bool_in_expression1135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Null_in_expression1145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lookup_in_expression1152 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_query_in_expression1163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableCall_in_incrementation1182 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_Increment_in_incrementation1185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_73_in_incrementation1192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup1217 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_list_in_lookup1219 = new BitSet(new long[]{0x0000000800000008L});
	public static final BitSet FOLLOW_indexes_in_lookup1221 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup1231 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_lookup1233 = new BitSet(new long[]{0x0000000800000008L});
	public static final BitSet FOLLOW_indexes_in_lookup1235 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup1246 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_lookup1250 = new BitSet(new long[]{0x0000000800000008L});
	public static final BitSet FOLLOW_indexes_in_lookup1254 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup1273 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_String_in_lookup1275 = new BitSet(new long[]{0x0000000800000008L});
	public static final BitSet FOLLOW_indexes_in_lookup1277 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LIST_in_list1302 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exprList_in_list1304 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INDEXES_in_indexes1330 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_indexes1333 = new BitSet(new long[]{0x0247FC4182080468L,0x00000000000010B0L});
}
