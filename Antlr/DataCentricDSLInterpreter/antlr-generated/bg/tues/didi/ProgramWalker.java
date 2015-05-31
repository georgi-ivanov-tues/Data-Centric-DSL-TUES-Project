// $ANTLR 3.5.2 D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g 2015-05-31 21:16:29

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
				if ( ((LA2_0 >= Add && LA2_0 <= And)||LA2_0==Bool||LA2_0==Divide||LA2_0==Equals||LA2_0==FUNC_CALL||(LA2_0 >= GT && LA2_0 <= GTEquals)||LA2_0==In||(LA2_0 >= LOOKUP && LA2_0 <= Number)||LA2_0==Or||LA2_0==Pow||(LA2_0 >= Subtract && LA2_0 <= TERNARY)||LA2_0==UNARY_MIN||LA2_0==76) ) {
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:118:1: query returns [Node node] : ^( 'query' expression ) ;
	public final Node query() throws RecognitionException {
		Node node = null;


		Node expression14 =null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:119:3: ( ^( 'query' expression ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:119:5: ^( 'query' expression )
			{
			match(input,76,FOLLOW_76_in_query272); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_query274);
			expression14=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			node = new QueryNode(expression14, dataSource);
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:122:1: update returns [Node node] : ^( 'update' expression ) ;
	public final Node update() throws RecognitionException {
		Node node = null;


		Node expression15 =null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:123:3: ( ^( 'update' expression ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:123:5: ^( 'update' expression )
			{
			match(input,77,FOLLOW_77_in_update295); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_update297);
			expression15=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			node = new UpdateNode(expression15, dataSource, outputStream);
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:126:1: variableCall returns [String value] : Identifier ;
	public final String variableCall() throws RecognitionException {
		String value = null;


		CommonTree Identifier16=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:126:36: ( Identifier )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:127:3: Identifier
			{
			Identifier16=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_variableCall316); 
			value=(Identifier16!=null?Identifier16.getText():null);
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:130:1: assignment returns [Node node] : ( ^( ASSIGNMENT i= Identifier (x= indexes )? ( expression ) ) | ^( 'global' ASSIGNMENT i= Identifier (x= indexes )? ( expression ) ) );
	public final Node assignment() throws RecognitionException {
		Node node = null;


		CommonTree i=null;
		java.util.List<Node> x =null;
		Node expression17 =null;
		Node expression18 =null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:131:3: ( ^( ASSIGNMENT i= Identifier (x= indexes )? ( expression ) ) | ^( 'global' ASSIGNMENT i= Identifier (x= indexes )? ( expression ) ) )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==ASSIGNMENT) ) {
				alt6=1;
			}
			else if ( (LA6_0==75) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:131:6: ^( ASSIGNMENT i= Identifier (x= indexes )? ( expression ) )
					{
					match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assignment336); 
					match(input, Token.DOWN, null); 
					i=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_assignment340); 
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:131:33: (x= indexes )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==INDEXES) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:131:33: x= indexes
							{
							pushFollow(FOLLOW_indexes_in_assignment344);
							x=indexes();
							state._fsp--;

							}
							break;

					}

					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:131:43: ( expression )
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:131:44: expression
					{
					pushFollow(FOLLOW_expression_in_assignment348);
					expression17=expression();
					state._fsp--;

					node = new AssignmentNode((i!=null?i.getText():null), x, expression17, currentScope);
					}

					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:132:6: ^( 'global' ASSIGNMENT i= Identifier (x= indexes )? ( expression ) )
					{
					match(input,75,FOLLOW_75_in_assignment360); 
					match(input, Token.DOWN, null); 
					match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assignment362); 
					i=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_assignment366); 
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:132:42: (x= indexes )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==INDEXES) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:132:42: x= indexes
							{
							pushFollow(FOLLOW_indexes_in_assignment370);
							x=indexes();
							state._fsp--;

							}
							break;

					}

					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:132:52: ( expression )
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:132:53: expression
					{
					pushFollow(FOLLOW_expression_in_assignment374);
					expression18=expression();
					state._fsp--;


					        Scope globalScope = currentScope;
					        
					        while(!(globalScope.isGlobalScope())){
					          globalScope = globalScope.parent();
					        }
					        node = new AssignmentNode((i!=null?i.getText():null), x, expression18, globalScope);
					        
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:142:1: functionCall returns [Node node] : ( ^( FUNC_CALL Identifier ( exprList )? ) | ^( FUNC_CALL Assert expression ) | ^( FUNC_CALL Size expression ) );
	public final Node functionCall() throws RecognitionException {
		Node node = null;


		CommonTree Identifier20=null;
		java.util.List<Node> exprList19 =null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:143:3: ( ^( FUNC_CALL Identifier ( exprList )? ) | ^( FUNC_CALL Assert expression ) | ^( FUNC_CALL Size expression ) )
			int alt8=3;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==FUNC_CALL) ) {
				int LA8_1 = input.LA(2);
				if ( (LA8_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case Identifier:
						{
						alt8=1;
						}
						break;
					case Assert:
						{
						alt8=2;
						}
						break;
					case Size:
						{
						alt8=3;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 8, 2, input);
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
							new NoViableAltException("", 8, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:143:6: ^( FUNC_CALL Identifier ( exprList )? )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall397); 
					match(input, Token.DOWN, null); 
					Identifier20=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_functionCall399); 
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:143:29: ( exprList )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==EXP_LIST) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:143:29: exprList
							{
							pushFollow(FOLLOW_exprList_in_functionCall401);
							exprList19=exprList();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 


					        
					        int paramSize = 0;
					        if(exprList19 == null){
					            paramSize = 0;
					        }else{
					            paramSize = exprList19.size();
					        }
					      Function function = new Function(functions.get((Identifier20!=null?Identifier20.getText():null) + paramSize));
					      function.setParameters(paramSize == 0 ? new ArrayList<Node>() : exprList19);
					      function.setFunctions(functions);
					      
					      Map<String, Object> newContext = new HashMap<String, Object>();
					      newContext.put("dataSource", dataSource);
					      newContext.put("outputStream", outputStream);
					      
					      function.setContext(newContext);
					      function.setScope(new Scope(currentScope));
					      node = function;
					      
					  
					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:164:6: ^( FUNC_CALL Assert expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall413); 
					match(input, Token.DOWN, null); 
					match(input,Assert,FOLLOW_Assert_in_functionCall415); 
					pushFollow(FOLLOW_expression_in_functionCall417);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:165:6: ^( FUNC_CALL Size expression )
					{
					match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall427); 
					match(input, Token.DOWN, null); 
					match(input,Size,FOLLOW_Size_in_functionCall429); 
					pushFollow(FOLLOW_expression_in_functionCall431);
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:168:1: println returns [Node node] : ^( PRINTLN ( expression )? ) ;
	public final Node println() throws RecognitionException {
		Node node = null;


		Node expression21 =null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:169:3: ( ^( PRINTLN ( expression )? ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:169:6: ^( PRINTLN ( expression )? )
			{
			match(input,PRINTLN,FOLLOW_PRINTLN_in_println451); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:169:16: ( expression )?
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( ((LA9_0 >= Add && LA9_0 <= And)||LA9_0==Bool||LA9_0==Divide||LA9_0==Equals||LA9_0==FUNC_CALL||(LA9_0 >= GT && LA9_0 <= GTEquals)||LA9_0==In||(LA9_0 >= LOOKUP && LA9_0 <= Number)||LA9_0==Or||LA9_0==Pow||(LA9_0 >= Subtract && LA9_0 <= TERNARY)||LA9_0==UNARY_MIN||LA9_0==76) ) {
					alt9=1;
				}
				switch (alt9) {
					case 1 :
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:169:16: expression
						{
						pushFollow(FOLLOW_expression_in_println453);
						expression21=expression();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			node = new PrintlnNode(expression21, outputStream);
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:172:1: print returns [Node node] : ^( PRINT ( expression )? ) ;
	public final Node print() throws RecognitionException {
		Node node = null;


		Node expression22 =null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:173:3: ( ^( PRINT ( expression )? ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:173:5: ^( PRINT ( expression )? )
			{
			match(input,PRINT,FOLLOW_PRINT_in_print477); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:173:13: ( expression )?
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( ((LA10_0 >= Add && LA10_0 <= And)||LA10_0==Bool||LA10_0==Divide||LA10_0==Equals||LA10_0==FUNC_CALL||(LA10_0 >= GT && LA10_0 <= GTEquals)||LA10_0==In||(LA10_0 >= LOOKUP && LA10_0 <= Number)||LA10_0==Or||LA10_0==Pow||(LA10_0 >= Subtract && LA10_0 <= TERNARY)||LA10_0==UNARY_MIN||LA10_0==76) ) {
					alt10=1;
				}
				switch (alt10) {
					case 1 :
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:173:13: expression
						{
						pushFollow(FOLLOW_expression_in_print479);
						expression22=expression();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			node = new PrintNode(expression22, outputStream);
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:176:1: ifStatement returns [Node node] : ^( IF ( ^( EXP expression b1= block ) )+ ( ^( EXP b2= block ) )? ) ;
	public final Node ifStatement() throws RecognitionException {
		Node node = null;


		Node b1 =null;
		Node b2 =null;
		Node expression23 =null;


		  IfNode ifNode = new IfNode();
		  node = ifNode;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:181:3: ( ^( IF ( ^( EXP expression b1= block ) )+ ( ^( EXP b2= block ) )? ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:181:6: ^( IF ( ^( EXP expression b1= block ) )+ ( ^( EXP b2= block ) )? )
			{
			match(input,IF,FOLLOW_IF_in_ifStatement510); 
			match(input, Token.DOWN, null); 
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:182:8: ( ^( EXP expression b1= block ) )+
			int cnt11=0;
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==EXP) ) {
					int LA11_1 = input.LA(2);
					if ( (LA11_1==DOWN) ) {
						int LA11_3 = input.LA(3);
						if ( ((LA11_3 >= Add && LA11_3 <= And)||LA11_3==Bool||LA11_3==Divide||LA11_3==Equals||LA11_3==FUNC_CALL||(LA11_3 >= GT && LA11_3 <= GTEquals)||LA11_3==In||(LA11_3 >= LOOKUP && LA11_3 <= Number)||LA11_3==Or||LA11_3==Pow||(LA11_3 >= Subtract && LA11_3 <= TERNARY)||LA11_3==UNARY_MIN||LA11_3==76) ) {
							alt11=1;
						}

					}

				}

				switch (alt11) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:182:9: ^( EXP expression b1= block )
					{
					match(input,EXP,FOLLOW_EXP_in_ifStatement522); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_ifStatement524);
					expression23=expression();
					state._fsp--;

					pushFollow(FOLLOW_block_in_ifStatement528);
					b1=block();
					state._fsp--;

					match(input, Token.UP, null); 

					ifNode.addChoice(expression23, b1);  
					}
					break;

				default :
					if ( cnt11 >= 1 ) break loop11;
					EarlyExitException eee = new EarlyExitException(11, input);
					throw eee;
				}
				cnt11++;
			}

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:183:8: ( ^( EXP b2= block ) )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==EXP) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:183:9: ^( EXP b2= block )
					{
					match(input,EXP,FOLLOW_EXP_in_ifStatement545); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_block_in_ifStatement549);
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:187:1: forStatement returns [Node node] : ^( For a= assignment b= expression c= afterthought d= block ) ;
	public final Node forStatement() throws RecognitionException {
		Node node = null;


		Node a =null;
		Node b =null;
		Node c =null;
		Node d =null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:188:3: ( ^( For a= assignment b= expression c= afterthought d= block ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:188:6: ^( For a= assignment b= expression c= afterthought d= block )
			{
			match(input,For,FOLLOW_For_in_forStatement594); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_assignment_in_forStatement598);
			a=assignment();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_forStatement602);
			b=expression();
			state._fsp--;

			pushFollow(FOLLOW_afterthought_in_forStatement606);
			c=afterthought();
			state._fsp--;

			pushFollow(FOLLOW_block_in_forStatement610);
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:191:1: afterthought returns [Node node] : ( ( Identifier '=' expression ) | incrementation ) ;
	public final Node afterthought() throws RecognitionException {
		Node node = null;


		CommonTree Identifier24=null;
		Node expression25 =null;
		Node incrementation26 =null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:192:3: ( ( ( Identifier '=' expression ) | incrementation ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:192:5: ( ( Identifier '=' expression ) | incrementation )
			{
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:192:5: ( ( Identifier '=' expression ) | incrementation )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==Identifier) ) {
				int LA13_1 = input.LA(2);
				if ( (LA13_1==Assign) ) {
					alt13=1;
				}
				else if ( (LA13_1==Increment||LA13_1==73) ) {
					alt13=2;
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:192:6: ( Identifier '=' expression )
					{
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:192:6: ( Identifier '=' expression )
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:192:7: Identifier '=' expression
					{
					Identifier24=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_afterthought632); 
					match(input,Assign,FOLLOW_Assign_in_afterthought634); 
					pushFollow(FOLLOW_expression_in_afterthought636);
					expression25=expression();
					state._fsp--;

					node = new AssignmentNode((Identifier24!=null?Identifier24.getText():null), expression25, currentScope);
					}

					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:193:5: incrementation
					{
					pushFollow(FOLLOW_incrementation_in_afterthought646);
					incrementation26=incrementation();
					state._fsp--;

					node = incrementation26;
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:196:1: whileStatement returns [Node node] : ^( While expression block ) ;
	public final Node whileStatement() throws RecognitionException {
		Node node = null;


		Node expression27 =null;
		Node block28 =null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:197:3: ( ^( While expression block ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:197:6: ^( While expression block )
			{
			match(input,While,FOLLOW_While_in_whileStatement666); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_whileStatement668);
			expression27=expression();
			state._fsp--;

			pushFollow(FOLLOW_block_in_whileStatement670);
			block28=block();
			state._fsp--;

			match(input, Token.UP, null); 

			node = new WhileNode(expression27, block28);
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:200:1: idList returns [java.util.List<String> i] : ^( ID_LIST ( Identifier )+ ) ;
	public final java.util.List<String> idList() throws RecognitionException {
		java.util.List<String> i = null;


		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:201:3: ( ^( ID_LIST ( Identifier )+ ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:201:6: ^( ID_LIST ( Identifier )+ )
			{
			match(input,ID_LIST,FOLLOW_ID_LIST_in_idList692); 
			match(input, Token.DOWN, null); 
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:201:16: ( Identifier )+
			int cnt14=0;
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==Identifier) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:201:16: Identifier
					{
					match(input,Identifier,FOLLOW_Identifier_in_idList694); 
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
		return i;
	}
	// $ANTLR end "idList"



	// $ANTLR start "exprList"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:204:1: exprList returns [java.util.List<Node> e] : ^( EXP_LIST (a= expression )+ ) ;
	public final java.util.List<Node> exprList() throws RecognitionException {
		java.util.List<Node> e = null;


		Node a =null;


		  e = new ArrayList<Node>();

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:208:3: ( ^( EXP_LIST (a= expression )+ ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:208:6: ^( EXP_LIST (a= expression )+ )
			{
			match(input,EXP_LIST,FOLLOW_EXP_LIST_in_exprList720); 
			match(input, Token.DOWN, null); 
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:208:17: (a= expression )+
			int cnt15=0;
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( ((LA15_0 >= Add && LA15_0 <= And)||LA15_0==Bool||LA15_0==Divide||LA15_0==Equals||LA15_0==FUNC_CALL||(LA15_0 >= GT && LA15_0 <= GTEquals)||LA15_0==In||(LA15_0 >= LOOKUP && LA15_0 <= Number)||LA15_0==Or||LA15_0==Pow||(LA15_0 >= Subtract && LA15_0 <= TERNARY)||LA15_0==UNARY_MIN||LA15_0==76) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:208:18: a= expression
					{
					pushFollow(FOLLOW_expression_in_exprList725);
					a=expression();
					state._fsp--;

					e.add(a);
					}
					break;

				default :
					if ( cnt15 >= 1 ) break loop15;
					EarlyExitException eee = new EarlyExitException(15, input);
					throw eee;
				}
				cnt15++;
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:211:1: expression returns [Node node] : ( ^( TERNARY expression expression expression ) | ^( In expression expression ) | ^( '||' a= expression b= expression ) | ^( '&&' a= expression b= expression ) | ^( '==' a= expression b= expression ) | ^( '!=' a= expression b= expression ) | ^( '>=' a= expression b= expression ) | ^( '<=' a= expression b= expression ) | ^( '>' a= expression b= expression ) | ^( '<' a= expression b= expression ) | ^( '+' a= expression b= expression ) | ^( '-' a= expression b= expression ) | ^( '*' a= expression b= expression ) | ^( '/' a= expression b= expression ) | ^( '%' a= expression b= expression ) | ^( '^' a= expression b= expression ) | ^( UNARY_MIN a= expression ) | ^( NEGATE a= expression ) | Number | Bool | Null | lookup | query | functionCall );
	public final Node expression() throws RecognitionException {
		Node node = null;


		CommonTree Number29=null;
		CommonTree Bool30=null;
		Node a =null;
		Node b =null;
		Node lookup31 =null;
		Node query32 =null;
		Node functionCall33 =null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:212:3: ( ^( TERNARY expression expression expression ) | ^( In expression expression ) | ^( '||' a= expression b= expression ) | ^( '&&' a= expression b= expression ) | ^( '==' a= expression b= expression ) | ^( '!=' a= expression b= expression ) | ^( '>=' a= expression b= expression ) | ^( '<=' a= expression b= expression ) | ^( '>' a= expression b= expression ) | ^( '<' a= expression b= expression ) | ^( '+' a= expression b= expression ) | ^( '-' a= expression b= expression ) | ^( '*' a= expression b= expression ) | ^( '/' a= expression b= expression ) | ^( '%' a= expression b= expression ) | ^( '^' a= expression b= expression ) | ^( UNARY_MIN a= expression ) | ^( NEGATE a= expression ) | Number | Bool | Null | lookup | query | functionCall )
			int alt16=24;
			switch ( input.LA(1) ) {
			case TERNARY:
				{
				alt16=1;
				}
				break;
			case In:
				{
				alt16=2;
				}
				break;
			case Or:
				{
				alt16=3;
				}
				break;
			case And:
				{
				alt16=4;
				}
				break;
			case Equals:
				{
				alt16=5;
				}
				break;
			case NEquals:
				{
				alt16=6;
				}
				break;
			case GTEquals:
				{
				alt16=7;
				}
				break;
			case LTEquals:
				{
				alt16=8;
				}
				break;
			case GT:
				{
				alt16=9;
				}
				break;
			case LT:
				{
				alt16=10;
				}
				break;
			case Add:
				{
				alt16=11;
				}
				break;
			case Subtract:
				{
				alt16=12;
				}
				break;
			case Multiply:
				{
				alt16=13;
				}
				break;
			case Divide:
				{
				alt16=14;
				}
				break;
			case Modulus:
				{
				alt16=15;
				}
				break;
			case Pow:
				{
				alt16=16;
				}
				break;
			case UNARY_MIN:
				{
				alt16=17;
				}
				break;
			case NEGATE:
				{
				alt16=18;
				}
				break;
			case Number:
				{
				alt16=19;
				}
				break;
			case Bool:
				{
				alt16=20;
				}
				break;
			case Null:
				{
				alt16=21;
				}
				break;
			case LOOKUP:
				{
				alt16=22;
				}
				break;
			case 76:
				{
				alt16=23;
				}
				break;
			case FUNC_CALL:
				{
				alt16=24;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:212:6: ^( TERNARY expression expression expression )
					{
					match(input,TERNARY,FOLLOW_TERNARY_in_expression750); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression752);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression754);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression756);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:213:6: ^( In expression expression )
					{
					match(input,In,FOLLOW_In_in_expression765); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression767);
					expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression769);
					expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:214:6: ^( '||' a= expression b= expression )
					{
					match(input,Or,FOLLOW_Or_in_expression778); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression782);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression786);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new OrNode(a, b);
					}
					break;
				case 4 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:215:6: ^( '&&' a= expression b= expression )
					{
					match(input,And,FOLLOW_And_in_expression797); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression801);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression805);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new AndNode(a, b);
					}
					break;
				case 5 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:216:6: ^( '==' a= expression b= expression )
					{
					match(input,Equals,FOLLOW_Equals_in_expression816); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression820);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression824);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new EqualsNode(a, b);
					}
					break;
				case 6 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:217:6: ^( '!=' a= expression b= expression )
					{
					match(input,NEquals,FOLLOW_NEquals_in_expression835); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression839);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression843);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new NotEqualsNode(a, b);
					}
					break;
				case 7 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:218:6: ^( '>=' a= expression b= expression )
					{
					match(input,GTEquals,FOLLOW_GTEquals_in_expression854); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression858);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression862);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GreaterThanAndEqualsNode(a, b);
					}
					break;
				case 8 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:219:6: ^( '<=' a= expression b= expression )
					{
					match(input,LTEquals,FOLLOW_LTEquals_in_expression873); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression877);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression881);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new LessThanAndEqualsNode(a, b);
					}
					break;
				case 9 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:220:6: ^( '>' a= expression b= expression )
					{
					match(input,GT,FOLLOW_GT_in_expression892); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression896);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression900);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new GreaterThanNode(a, b);
					}
					break;
				case 10 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:221:6: ^( '<' a= expression b= expression )
					{
					match(input,LT,FOLLOW_LT_in_expression911); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression915);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression919);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new LessThanNode(a, b);
					}
					break;
				case 11 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:222:6: ^( '+' a= expression b= expression )
					{
					match(input,Add,FOLLOW_Add_in_expression930); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression934);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression938);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new AddNode(a, b);
					}
					break;
				case 12 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:223:6: ^( '-' a= expression b= expression )
					{
					match(input,Subtract,FOLLOW_Subtract_in_expression949); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression953);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression957);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new SubNode(a, b);
					}
					break;
				case 13 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:224:6: ^( '*' a= expression b= expression )
					{
					match(input,Multiply,FOLLOW_Multiply_in_expression968); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression972);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression976);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new MultiplicationNode(a, b);
					}
					break;
				case 14 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:225:6: ^( '/' a= expression b= expression )
					{
					match(input,Divide,FOLLOW_Divide_in_expression987); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression991);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression995);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new DivisionNode(a, b);
					}
					break;
				case 15 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:226:6: ^( '%' a= expression b= expression )
					{
					match(input,Modulus,FOLLOW_Modulus_in_expression1006); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1010);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1014);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new ModNode(a, b);
					}
					break;
				case 16 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:227:6: ^( '^' a= expression b= expression )
					{
					match(input,Pow,FOLLOW_Pow_in_expression1025); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1029);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression1033);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new PowerNode(a, b);
					}
					break;
				case 17 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:228:6: ^( UNARY_MIN a= expression )
					{
					match(input,UNARY_MIN,FOLLOW_UNARY_MIN_in_expression1044); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1048);
					a=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new AtomNode("-" + a);
					}
					break;
				case 18 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:229:6: ^( NEGATE a= expression )
					{
					match(input,NEGATE,FOLLOW_NEGATE_in_expression1058); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression1062);
					a=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					node = new BoolNegationNode(a);
					}
					break;
				case 19 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:230:6: Number
					{
					Number29=(CommonTree)match(input,Number,FOLLOW_Number_in_expression1072); 
					node = new AtomNode(Double.parseDouble((Number29!=null?Number29.getText():null)));
					}
					break;
				case 20 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:231:6: Bool
					{
					Bool30=(CommonTree)match(input,Bool,FOLLOW_Bool_in_expression1081); 
					node = new AtomNode(new Boolean((Bool30!=null?Bool30.getText():null)));
					}
					break;
				case 21 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:232:6: Null
					{
					match(input,Null,FOLLOW_Null_in_expression1091); 
					}
					break;
				case 22 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:233:6: lookup
					{
					pushFollow(FOLLOW_lookup_in_expression1098);
					lookup31=lookup();
					state._fsp--;

					node = lookup31;
					}
					break;
				case 23 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:234:6: query
					{
					pushFollow(FOLLOW_query_in_expression1109);
					query32=query();
					state._fsp--;

					node = query32;
					}
					break;
				case 24 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:235:6: functionCall
					{
					pushFollow(FOLLOW_functionCall_in_expression1118);
					functionCall33=functionCall();
					state._fsp--;

					node = functionCall33;
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:238:1: incrementation returns [Node node] : ( variableCall ( '++' | '--' ) ) ;
	public final Node incrementation() throws RecognitionException {
		Node node = null;


		String variableCall34 =null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:239:3: ( ( variableCall ( '++' | '--' ) ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:239:5: ( variableCall ( '++' | '--' ) )
			{
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:239:5: ( variableCall ( '++' | '--' ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:239:6: variableCall ( '++' | '--' )
			{
			pushFollow(FOLLOW_variableCall_in_incrementation1138);
			variableCall34=variableCall();
			state._fsp--;

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:239:19: ( '++' | '--' )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==Increment) ) {
				alt17=1;
			}
			else if ( (LA17_0==73) ) {
				alt17=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:239:20: '++'
					{
					match(input,Increment,FOLLOW_Increment_in_incrementation1141); 
					node = new IncrementationNode(variableCall34,1,currentScope);
					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:240:5: '--'
					{
					match(input,73,FOLLOW_73_in_incrementation1148); 
					node = new IncrementationNode(variableCall34,-1,currentScope);
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:244:1: lookup returns [Node node] : ( ^( LOOKUP list ( indexes )? ) | ^( LOOKUP expression ( indexes )? ) | ^( LOOKUP i= Identifier (x= indexes )? ) | ^( LOOKUP String ( indexes )? ) );
	public final Node lookup() throws RecognitionException {
		Node node = null;


		CommonTree i=null;
		CommonTree String35=null;
		java.util.List<Node> x =null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:245:3: ( ^( LOOKUP list ( indexes )? ) | ^( LOOKUP expression ( indexes )? ) | ^( LOOKUP i= Identifier (x= indexes )? ) | ^( LOOKUP String ( indexes )? ) )
			int alt22=4;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==LOOKUP) ) {
				int LA22_1 = input.LA(2);
				if ( (LA22_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case Identifier:
						{
						alt22=3;
						}
						break;
					case String:
						{
						alt22=4;
						}
						break;
					case LIST:
						{
						alt22=1;
						}
						break;
					case Add:
					case And:
					case Bool:
					case Divide:
					case Equals:
					case FUNC_CALL:
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
						alt22=2;
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:245:6: ^( LOOKUP list ( indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup1172); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_list_in_lookup1174);
					list();
					state._fsp--;

					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:245:20: ( indexes )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==INDEXES) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:245:20: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1176);
							indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:246:6: ^( LOOKUP expression ( indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup1186); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_lookup1188);
					expression();
					state._fsp--;

					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:246:26: ( indexes )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==INDEXES) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:246:26: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1190);
							indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:247:6: ^( LOOKUP i= Identifier (x= indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup1201); 
					match(input, Token.DOWN, null); 
					i=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_lookup1205); 
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:247:29: (x= indexes )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==INDEXES) ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:247:29: x= indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1209);
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:253:6: ^( LOOKUP String ( indexes )? )
					{
					match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup1228); 
					match(input, Token.DOWN, null); 
					String35=(CommonTree)match(input,String,FOLLOW_String_in_lookup1230); 
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:253:22: ( indexes )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==INDEXES) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:253:22: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1232);
							indexes();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 


					        node = new AtomNode((String35!=null?String35.getText():null));
					      
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:258:1: list returns [Node node] : ^( LIST ( exprList )? ) ;
	public final Node list() throws RecognitionException {
		Node node = null;


		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:259:3: ( ^( LIST ( exprList )? ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:259:6: ^( LIST ( exprList )? )
			{
			match(input,LIST,FOLLOW_LIST_in_list1257); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:259:13: ( exprList )?
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==EXP_LIST) ) {
					alt23=1;
				}
				switch (alt23) {
					case 1 :
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:259:13: exprList
						{
						pushFollow(FOLLOW_exprList_in_list1259);
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:262:1: indexes returns [java.util.List<Node> e] : ^( INDEXES ( expression )+ ) ;
	public final java.util.List<Node> indexes() throws RecognitionException {
		java.util.List<Node> e = null;


		Node expression36 =null;

		e = new java.util.ArrayList<Node>();
		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:264:3: ( ^( INDEXES ( expression )+ ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:264:6: ^( INDEXES ( expression )+ )
			{
			match(input,INDEXES,FOLLOW_INDEXES_in_indexes1285); 
			match(input, Token.DOWN, null); 
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:264:16: ( expression )+
			int cnt24=0;
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( ((LA24_0 >= Add && LA24_0 <= And)||LA24_0==Bool||LA24_0==Divide||LA24_0==Equals||LA24_0==FUNC_CALL||(LA24_0 >= GT && LA24_0 <= GTEquals)||LA24_0==In||(LA24_0 >= LOOKUP && LA24_0 <= Number)||LA24_0==Or||LA24_0==Pow||(LA24_0 >= Subtract && LA24_0 <= TERNARY)||LA24_0==UNARY_MIN||LA24_0==76) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\ProgramWalker.g:264:17: expression
					{
					pushFollow(FOLLOW_expression_in_indexes1288);
					expression36=expression();
					state._fsp--;

					e.add(expression36);
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
	public static final BitSet FOLLOW_77_in_update295 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_update297 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_variableCall316 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGNMENT_in_assignment336 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_assignment340 = new BitSet(new long[]{0x0247FC49A2080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_indexes_in_assignment344 = new BitSet(new long[]{0x0247FC41A2080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_assignment348 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_75_in_assignment360 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ASSIGNMENT_in_assignment362 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_Identifier_in_assignment366 = new BitSet(new long[]{0x0247FC49A2080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_indexes_in_assignment370 = new BitSet(new long[]{0x0247FC41A2080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_assignment374 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall397 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_functionCall399 = new BitSet(new long[]{0x0000000000400008L});
	public static final BitSet FOLLOW_exprList_in_functionCall401 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall413 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Assert_in_functionCall415 = new BitSet(new long[]{0x0247FC41A2080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_functionCall417 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_CALL_in_functionCall427 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Size_in_functionCall429 = new BitSet(new long[]{0x0247FC41A2080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_functionCall431 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PRINTLN_in_println451 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_println453 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PRINT_in_print477 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_print479 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IF_in_ifStatement510 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_EXP_in_ifStatement522 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_ifStatement524 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_block_in_ifStatement528 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXP_in_ifStatement545 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_block_in_ifStatement549 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_For_in_forStatement594 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assignment_in_forStatement598 = new BitSet(new long[]{0x0247FC41A2080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_forStatement602 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_afterthought_in_forStatement606 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_block_in_forStatement610 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_afterthought632 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Assign_in_afterthought634 = new BitSet(new long[]{0x0247FC41A2080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_afterthought636 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incrementation_in_afterthought646 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_While_in_whileStatement666 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_whileStatement668 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_block_in_whileStatement670 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_LIST_in_idList692 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_idList694 = new BitSet(new long[]{0x0000001000000008L});
	public static final BitSet FOLLOW_EXP_LIST_in_exprList720 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_exprList725 = new BitSet(new long[]{0x0247FC41A2080468L,0x00000000000010B0L});
	public static final BitSet FOLLOW_TERNARY_in_expression750 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression752 = new BitSet(new long[]{0x0247FC41A2080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression754 = new BitSet(new long[]{0x0247FC41A2080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression756 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_In_in_expression765 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression767 = new BitSet(new long[]{0x0247FC41A2080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression769 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Or_in_expression778 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression782 = new BitSet(new long[]{0x0247FC41A2080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression786 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_And_in_expression797 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression801 = new BitSet(new long[]{0x0247FC41A2080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression805 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Equals_in_expression816 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression820 = new BitSet(new long[]{0x0247FC41A2080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression824 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEquals_in_expression835 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression839 = new BitSet(new long[]{0x0247FC41A2080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression843 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GTEquals_in_expression854 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression858 = new BitSet(new long[]{0x0247FC41A2080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression862 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LTEquals_in_expression873 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression877 = new BitSet(new long[]{0x0247FC41A2080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression881 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_expression892 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression896 = new BitSet(new long[]{0x0247FC41A2080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression900 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LT_in_expression911 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression915 = new BitSet(new long[]{0x0247FC41A2080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression919 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Add_in_expression930 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression934 = new BitSet(new long[]{0x0247FC41A2080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression938 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Subtract_in_expression949 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression953 = new BitSet(new long[]{0x0247FC41A2080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression957 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Multiply_in_expression968 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression972 = new BitSet(new long[]{0x0247FC41A2080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression976 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Divide_in_expression987 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression991 = new BitSet(new long[]{0x0247FC41A2080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression995 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Modulus_in_expression1006 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1010 = new BitSet(new long[]{0x0247FC41A2080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression1014 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Pow_in_expression1025 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1029 = new BitSet(new long[]{0x0247FC41A2080460L,0x00000000000010B0L});
	public static final BitSet FOLLOW_expression_in_expression1033 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNARY_MIN_in_expression1044 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1048 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEGATE_in_expression1058 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression1062 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Number_in_expression1072 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Bool_in_expression1081 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Null_in_expression1091 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lookup_in_expression1098 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_query_in_expression1109 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_expression1118 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableCall_in_incrementation1138 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_Increment_in_incrementation1141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_73_in_incrementation1148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup1172 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_list_in_lookup1174 = new BitSet(new long[]{0x0000000800000008L});
	public static final BitSet FOLLOW_indexes_in_lookup1176 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup1186 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_lookup1188 = new BitSet(new long[]{0x0000000800000008L});
	public static final BitSet FOLLOW_indexes_in_lookup1190 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup1201 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Identifier_in_lookup1205 = new BitSet(new long[]{0x0000000800000008L});
	public static final BitSet FOLLOW_indexes_in_lookup1209 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOOKUP_in_lookup1228 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_String_in_lookup1230 = new BitSet(new long[]{0x0000000800000008L});
	public static final BitSet FOLLOW_indexes_in_lookup1232 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LIST_in_list1257 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exprList_in_list1259 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INDEXES_in_indexes1285 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_indexes1288 = new BitSet(new long[]{0x0247FC41A2080468L,0x00000000000010B0L});
}
