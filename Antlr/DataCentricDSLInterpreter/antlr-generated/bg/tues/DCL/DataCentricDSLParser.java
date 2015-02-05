// $ANTLR 3.5.2 D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g 2015-02-06 00:08:28

  package bg.tues.DCL;
  import bg.tues.DCL.*; 
  import java.util.Map;
  import java.util.HashMap;
  import bg.tues.DCL.Function;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class DataCentricDSLParser extends Parser {
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public DataCentricDSLParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public DataCentricDSLParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return DataCentricDSLParser.tokenNames; }
	@Override public String getGrammarFileName() { return "D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g"; }


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


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:82:1: program : ( functionDecl )* block EOF -> block ;
	public final DataCentricDSLParser.program_return program() throws RecognitionException {
		DataCentricDSLParser.program_return retval = new DataCentricDSLParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EOF3=null;
		ParserRuleReturnScope functionDecl1 =null;
		ParserRuleReturnScope block2 =null;

		Object EOF3_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_functionDecl=new RewriteRuleSubtreeStream(adaptor,"rule functionDecl");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:83:3: ( ( functionDecl )* block EOF -> block )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:83:6: ( functionDecl )* block EOF
			{
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:83:6: ( functionDecl )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==74) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:83:7: functionDecl
					{
					pushFollow(FOLLOW_functionDecl_in_program160);
					functionDecl1=functionDecl();
					state._fsp--;

					stream_functionDecl.add(functionDecl1.getTree());
					}
					break;

				default :
					break loop1;
				}
			}

			pushFollow(FOLLOW_block_in_program164);
			block2=block();
			state._fsp--;

			stream_block.add(block2.getTree());
			EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_program166);  
			stream_EOF.add(EOF3);

			// AST REWRITE
			// elements: block
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 83:32: -> block
			{
				adaptor.addChild(root_0, stream_block.nextTree());
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"


	public static class block_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "block"
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:86:1: block : ( statement )* ( Return expression ';' )? -> ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) ;
	public final DataCentricDSLParser.block_return block() throws RecognitionException {
		DataCentricDSLParser.block_return retval = new DataCentricDSLParser.block_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Return5=null;
		Token char_literal7=null;
		ParserRuleReturnScope statement4 =null;
		ParserRuleReturnScope expression6 =null;

		Object Return5_tree=null;
		Object char_literal7_tree=null;
		RewriteRuleTokenStream stream_Return=new RewriteRuleTokenStream(adaptor,"token Return");
		RewriteRuleTokenStream stream_SColon=new RewriteRuleTokenStream(adaptor,"token SColon");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:87:3: ( ( statement )* ( Return expression ';' )? -> ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:87:6: ( statement )* ( Return expression ';' )?
			{
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:87:6: ( statement )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==Assert||LA2_0==For||(LA2_0 >= Identifier && LA2_0 <= If)||(LA2_0 >= Print && LA2_0 <= Println)||LA2_0==Size||LA2_0==While||(LA2_0 >= 75 && LA2_0 <= 76)) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:87:6: statement
					{
					pushFollow(FOLLOW_statement_in_block184);
					statement4=statement();
					state._fsp--;

					stream_statement.add(statement4.getTree());
					}
					break;

				default :
					break loop2;
				}
			}

			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:87:17: ( Return expression ';' )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==Return) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:87:18: Return expression ';'
					{
					Return5=(Token)match(input,Return,FOLLOW_Return_in_block188);  
					stream_Return.add(Return5);

					pushFollow(FOLLOW_expression_in_block190);
					expression6=expression();
					state._fsp--;

					stream_expression.add(expression6.getTree());
					char_literal7=(Token)match(input,SColon,FOLLOW_SColon_in_block192);  
					stream_SColon.add(char_literal7);

					}
					break;

			}

			// AST REWRITE
			// elements: expression, statement
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 88:6: -> ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) )
			{
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:88:9: ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:88:17: ^( STATEMENTS ( statement )* )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(STATEMENTS, "STATEMENTS"), root_2);
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:88:30: ( statement )*
				while ( stream_statement.hasNext() ) {
					adaptor.addChild(root_2, stream_statement.nextTree());
				}
				stream_statement.reset();

				adaptor.addChild(root_1, root_2);
				}

				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:88:42: ^( RETURN ( expression )? )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(RETURN, "RETURN"), root_2);
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:88:51: ( expression )?
				if ( stream_expression.hasNext() ) {
					adaptor.addChild(root_2, stream_expression.nextTree());
				}
				stream_expression.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "block"


	public static class statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:91:1: statement : ( assignment ';' -> assignment | incrementation ';' -> incrementation | functionCall ';' -> functionCall | ifStatement | forStatement | whileStatement | query ';' -> query | println ';' -> println | print ';' -> print );
	public final DataCentricDSLParser.statement_return statement() throws RecognitionException {
		DataCentricDSLParser.statement_return retval = new DataCentricDSLParser.statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal9=null;
		Token char_literal11=null;
		Token char_literal13=null;
		Token char_literal18=null;
		Token char_literal20=null;
		Token char_literal22=null;
		ParserRuleReturnScope assignment8 =null;
		ParserRuleReturnScope incrementation10 =null;
		ParserRuleReturnScope functionCall12 =null;
		ParserRuleReturnScope ifStatement14 =null;
		ParserRuleReturnScope forStatement15 =null;
		ParserRuleReturnScope whileStatement16 =null;
		ParserRuleReturnScope query17 =null;
		ParserRuleReturnScope println19 =null;
		ParserRuleReturnScope print21 =null;

		Object char_literal9_tree=null;
		Object char_literal11_tree=null;
		Object char_literal13_tree=null;
		Object char_literal18_tree=null;
		Object char_literal20_tree=null;
		Object char_literal22_tree=null;
		RewriteRuleTokenStream stream_SColon=new RewriteRuleTokenStream(adaptor,"token SColon");
		RewriteRuleSubtreeStream stream_println=new RewriteRuleSubtreeStream(adaptor,"rule println");
		RewriteRuleSubtreeStream stream_print=new RewriteRuleSubtreeStream(adaptor,"rule print");
		RewriteRuleSubtreeStream stream_assignment=new RewriteRuleSubtreeStream(adaptor,"rule assignment");
		RewriteRuleSubtreeStream stream_functionCall=new RewriteRuleSubtreeStream(adaptor,"rule functionCall");
		RewriteRuleSubtreeStream stream_query=new RewriteRuleSubtreeStream(adaptor,"rule query");
		RewriteRuleSubtreeStream stream_incrementation=new RewriteRuleSubtreeStream(adaptor,"rule incrementation");

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:92:3: ( assignment ';' -> assignment | incrementation ';' -> incrementation | functionCall ';' -> functionCall | ifStatement | forStatement | whileStatement | query ';' -> query | println ';' -> println | print ';' -> print )
			int alt4=9;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				switch ( input.LA(2) ) {
				case OParen:
					{
					alt4=3;
					}
					break;
				case Assign:
				case OBracket:
					{
					alt4=1;
					}
					break;
				case Increment:
				case 73:
					{
					alt4=2;
					}
					break;
				default:
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
				break;
			case 75:
				{
				alt4=1;
				}
				break;
			case Assert:
			case Size:
				{
				alt4=3;
				}
				break;
			case If:
				{
				alt4=4;
				}
				break;
			case For:
				{
				alt4=5;
				}
				break;
			case While:
				{
				alt4=6;
				}
				break;
			case 76:
				{
				alt4=7;
				}
				break;
			case Println:
				{
				alt4=8;
				}
				break;
			case Print:
				{
				alt4=9;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:92:6: assignment ';'
					{
					pushFollow(FOLLOW_assignment_in_statement234);
					assignment8=assignment();
					state._fsp--;

					stream_assignment.add(assignment8.getTree());
					char_literal9=(Token)match(input,SColon,FOLLOW_SColon_in_statement236);  
					stream_SColon.add(char_literal9);

					// AST REWRITE
					// elements: assignment
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 92:23: -> assignment
					{
						adaptor.addChild(root_0, stream_assignment.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:93:6: incrementation ';'
					{
					pushFollow(FOLLOW_incrementation_in_statement249);
					incrementation10=incrementation();
					state._fsp--;

					stream_incrementation.add(incrementation10.getTree());
					char_literal11=(Token)match(input,SColon,FOLLOW_SColon_in_statement251);  
					stream_SColon.add(char_literal11);

					// AST REWRITE
					// elements: incrementation
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 93:25: -> incrementation
					{
						adaptor.addChild(root_0, stream_incrementation.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:94:6: functionCall ';'
					{
					pushFollow(FOLLOW_functionCall_in_statement262);
					functionCall12=functionCall();
					state._fsp--;

					stream_functionCall.add(functionCall12.getTree());
					char_literal13=(Token)match(input,SColon,FOLLOW_SColon_in_statement264);  
					stream_SColon.add(char_literal13);

					// AST REWRITE
					// elements: functionCall
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 94:23: -> functionCall
					{
						adaptor.addChild(root_0, stream_functionCall.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:95:6: ifStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_ifStatement_in_statement275);
					ifStatement14=ifStatement();
					state._fsp--;

					adaptor.addChild(root_0, ifStatement14.getTree());

					}
					break;
				case 5 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:96:6: forStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_forStatement_in_statement282);
					forStatement15=forStatement();
					state._fsp--;

					adaptor.addChild(root_0, forStatement15.getTree());

					}
					break;
				case 6 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:97:6: whileStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_whileStatement_in_statement289);
					whileStatement16=whileStatement();
					state._fsp--;

					adaptor.addChild(root_0, whileStatement16.getTree());

					}
					break;
				case 7 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:98:6: query ';'
					{
					pushFollow(FOLLOW_query_in_statement296);
					query17=query();
					state._fsp--;

					stream_query.add(query17.getTree());
					char_literal18=(Token)match(input,SColon,FOLLOW_SColon_in_statement298);  
					stream_SColon.add(char_literal18);

					// AST REWRITE
					// elements: query
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 98:16: -> query
					{
						adaptor.addChild(root_0, stream_query.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 8 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:99:6: println ';'
					{
					pushFollow(FOLLOW_println_in_statement309);
					println19=println();
					state._fsp--;

					stream_println.add(println19.getTree());
					char_literal20=(Token)match(input,SColon,FOLLOW_SColon_in_statement311);  
					stream_SColon.add(char_literal20);

					// AST REWRITE
					// elements: println
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 99:18: -> println
					{
						adaptor.addChild(root_0, stream_println.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 9 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:100:6: print ';'
					{
					pushFollow(FOLLOW_print_in_statement322);
					print21=print();
					state._fsp--;

					stream_print.add(print21.getTree());
					char_literal22=(Token)match(input,SColon,FOLLOW_SColon_in_statement324);  
					stream_SColon.add(char_literal22);

					// AST REWRITE
					// elements: print
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 100:16: -> print
					{
						adaptor.addChild(root_0, stream_print.nextTree());
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statement"


	public static class query_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "query"
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:103:1: query : 'query' ^ ( expression | functionCall ) ;
	public final DataCentricDSLParser.query_return query() throws RecognitionException {
		DataCentricDSLParser.query_return retval = new DataCentricDSLParser.query_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal23=null;
		ParserRuleReturnScope expression24 =null;
		ParserRuleReturnScope functionCall25 =null;

		Object string_literal23_tree=null;

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:103:6: ( 'query' ^ ( expression | functionCall ) )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:104:3: 'query' ^ ( expression | functionCall )
			{
			root_0 = (Object)adaptor.nil();


			string_literal23=(Token)match(input,76,FOLLOW_76_in_query341); 
			string_literal23_tree = (Object)adaptor.create(string_literal23);
			root_0 = (Object)adaptor.becomeRoot(string_literal23_tree, root_0);

			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:104:12: ( expression | functionCall )
			int alt5=2;
			switch ( input.LA(1) ) {
			case Bool:
			case Excl:
			case Null:
			case Number:
			case OBracket:
			case OParen:
			case String:
			case Subtract:
			case 76:
				{
				alt5=1;
				}
				break;
			case Identifier:
				{
				int LA5_2 = input.LA(2);
				if ( (LA5_2==OParen) ) {
					alt5=2;
				}
				else if ( ((LA5_2 >= Add && LA5_2 <= And)||(LA5_2 >= CBracket && LA5_2 <= Comma)||LA5_2==Divide||LA5_2==Equals||(LA5_2 >= GT && LA5_2 <= GTEquals)||LA5_2==In||(LA5_2 >= LT && LA5_2 <= Multiply)||LA5_2==NEquals||LA5_2==OBracket||LA5_2==Or||LA5_2==Pow||LA5_2==QMark||LA5_2==SColon||LA5_2==Subtract) ) {
					alt5=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case Assert:
			case Size:
				{
				alt5=2;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:104:13: expression
					{
					pushFollow(FOLLOW_expression_in_query345);
					expression24=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression24.getTree());

					}
					break;
				case 2 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:104:26: functionCall
					{
					pushFollow(FOLLOW_functionCall_in_query349);
					functionCall25=functionCall();
					state._fsp--;

					adaptor.addChild(root_0, functionCall25.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "query"


	public static class variableCall_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "variableCall"
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:107:1: variableCall : Identifier ;
	public final DataCentricDSLParser.variableCall_return variableCall() throws RecognitionException {
		DataCentricDSLParser.variableCall_return retval = new DataCentricDSLParser.variableCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier26=null;

		Object Identifier26_tree=null;

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:107:13: ( Identifier )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:108:3: Identifier
			{
			root_0 = (Object)adaptor.nil();


			Identifier26=(Token)match(input,Identifier,FOLLOW_Identifier_in_variableCall360); 
			Identifier26_tree = (Object)adaptor.create(Identifier26);
			adaptor.addChild(root_0, Identifier26_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "variableCall"


	public static class assignment_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assignment"
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:111:1: assignment : ( Identifier ( indexes )? '=' ( expression -> ^( ASSIGNMENT Identifier ( indexes )? expression ) | functionCall -> ^( ASSIGNMENT Identifier ( indexes )? functionCall ) ) | 'global' Identifier ( indexes )? '=' ( expression -> ^( 'global' ASSIGNMENT Identifier ( indexes )? expression ) | functionCall -> ^( 'global' ASSIGNMENT Identifier ( indexes )? functionCall ) ) );
	public final DataCentricDSLParser.assignment_return assignment() throws RecognitionException {
		DataCentricDSLParser.assignment_return retval = new DataCentricDSLParser.assignment_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier27=null;
		Token char_literal29=null;
		Token string_literal32=null;
		Token Identifier33=null;
		Token char_literal35=null;
		ParserRuleReturnScope indexes28 =null;
		ParserRuleReturnScope expression30 =null;
		ParserRuleReturnScope functionCall31 =null;
		ParserRuleReturnScope indexes34 =null;
		ParserRuleReturnScope expression36 =null;
		ParserRuleReturnScope functionCall37 =null;

		Object Identifier27_tree=null;
		Object char_literal29_tree=null;
		Object string_literal32_tree=null;
		Object Identifier33_tree=null;
		Object char_literal35_tree=null;
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_Assign=new RewriteRuleTokenStream(adaptor,"token Assign");
		RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_indexes=new RewriteRuleSubtreeStream(adaptor,"rule indexes");
		RewriteRuleSubtreeStream stream_functionCall=new RewriteRuleSubtreeStream(adaptor,"rule functionCall");

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:112:3: ( Identifier ( indexes )? '=' ( expression -> ^( ASSIGNMENT Identifier ( indexes )? expression ) | functionCall -> ^( ASSIGNMENT Identifier ( indexes )? functionCall ) ) | 'global' Identifier ( indexes )? '=' ( expression -> ^( 'global' ASSIGNMENT Identifier ( indexes )? expression ) | functionCall -> ^( 'global' ASSIGNMENT Identifier ( indexes )? functionCall ) ) )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==Identifier) ) {
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
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:112:6: Identifier ( indexes )? '=' ( expression -> ^( ASSIGNMENT Identifier ( indexes )? expression ) | functionCall -> ^( ASSIGNMENT Identifier ( indexes )? functionCall ) )
					{
					Identifier27=(Token)match(input,Identifier,FOLLOW_Identifier_in_assignment372);  
					stream_Identifier.add(Identifier27);

					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:112:17: ( indexes )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==OBracket) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:112:17: indexes
							{
							pushFollow(FOLLOW_indexes_in_assignment374);
							indexes28=indexes();
							state._fsp--;

							stream_indexes.add(indexes28.getTree());
							}
							break;

					}

					char_literal29=(Token)match(input,Assign,FOLLOW_Assign_in_assignment377);  
					stream_Assign.add(char_literal29);

					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:112:30: ( expression -> ^( ASSIGNMENT Identifier ( indexes )? expression ) | functionCall -> ^( ASSIGNMENT Identifier ( indexes )? functionCall ) )
					int alt7=2;
					switch ( input.LA(1) ) {
					case Bool:
					case Excl:
					case Null:
					case Number:
					case OBracket:
					case OParen:
					case String:
					case Subtract:
					case 76:
						{
						alt7=1;
						}
						break;
					case Identifier:
						{
						int LA7_2 = input.LA(2);
						if ( (LA7_2==OParen) ) {
							alt7=2;
						}
						else if ( ((LA7_2 >= Add && LA7_2 <= And)||LA7_2==Divide||LA7_2==Equals||(LA7_2 >= GT && LA7_2 <= GTEquals)||LA7_2==In||(LA7_2 >= LT && LA7_2 <= Multiply)||LA7_2==NEquals||LA7_2==OBracket||LA7_2==Or||LA7_2==Pow||LA7_2==QMark||LA7_2==SColon||LA7_2==Subtract) ) {
							alt7=1;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 7, 2, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case Assert:
					case Size:
						{
						alt7=2;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 7, 0, input);
						throw nvae;
					}
					switch (alt7) {
						case 1 :
							// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:112:31: expression
							{
							pushFollow(FOLLOW_expression_in_assignment380);
							expression30=expression();
							state._fsp--;

							stream_expression.add(expression30.getTree());
							// AST REWRITE
							// elements: expression, indexes, Identifier
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 112:42: -> ^( ASSIGNMENT Identifier ( indexes )? expression )
							{
								// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:112:45: ^( ASSIGNMENT Identifier ( indexes )? expression )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ASSIGNMENT, "ASSIGNMENT"), root_1);
								adaptor.addChild(root_1, stream_Identifier.nextNode());
								// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:112:69: ( indexes )?
								if ( stream_indexes.hasNext() ) {
									adaptor.addChild(root_1, stream_indexes.nextTree());
								}
								stream_indexes.reset();

								adaptor.addChild(root_1, stream_expression.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 2 :
							// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:113:6: functionCall
							{
							pushFollow(FOLLOW_functionCall_in_assignment400);
							functionCall31=functionCall();
							state._fsp--;

							stream_functionCall.add(functionCall31.getTree());
							// AST REWRITE
							// elements: functionCall, indexes, Identifier
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 113:19: -> ^( ASSIGNMENT Identifier ( indexes )? functionCall )
							{
								// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:113:22: ^( ASSIGNMENT Identifier ( indexes )? functionCall )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ASSIGNMENT, "ASSIGNMENT"), root_1);
								adaptor.addChild(root_1, stream_Identifier.nextNode());
								// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:113:46: ( indexes )?
								if ( stream_indexes.hasNext() ) {
									adaptor.addChild(root_1, stream_indexes.nextTree());
								}
								stream_indexes.reset();

								adaptor.addChild(root_1, stream_functionCall.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;

					}

					}
					break;
				case 2 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:114:6: 'global' Identifier ( indexes )? '=' ( expression -> ^( 'global' ASSIGNMENT Identifier ( indexes )? expression ) | functionCall -> ^( 'global' ASSIGNMENT Identifier ( indexes )? functionCall ) )
					{
					string_literal32=(Token)match(input,75,FOLLOW_75_in_assignment421);  
					stream_75.add(string_literal32);

					Identifier33=(Token)match(input,Identifier,FOLLOW_Identifier_in_assignment423);  
					stream_Identifier.add(Identifier33);

					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:114:26: ( indexes )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==OBracket) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:114:26: indexes
							{
							pushFollow(FOLLOW_indexes_in_assignment425);
							indexes34=indexes();
							state._fsp--;

							stream_indexes.add(indexes34.getTree());
							}
							break;

					}

					char_literal35=(Token)match(input,Assign,FOLLOW_Assign_in_assignment428);  
					stream_Assign.add(char_literal35);

					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:114:39: ( expression -> ^( 'global' ASSIGNMENT Identifier ( indexes )? expression ) | functionCall -> ^( 'global' ASSIGNMENT Identifier ( indexes )? functionCall ) )
					int alt9=2;
					switch ( input.LA(1) ) {
					case Bool:
					case Excl:
					case Null:
					case Number:
					case OBracket:
					case OParen:
					case String:
					case Subtract:
					case 76:
						{
						alt9=1;
						}
						break;
					case Identifier:
						{
						int LA9_2 = input.LA(2);
						if ( (LA9_2==OParen) ) {
							alt9=2;
						}
						else if ( ((LA9_2 >= Add && LA9_2 <= And)||LA9_2==Divide||LA9_2==Equals||(LA9_2 >= GT && LA9_2 <= GTEquals)||LA9_2==In||(LA9_2 >= LT && LA9_2 <= Multiply)||LA9_2==NEquals||LA9_2==OBracket||LA9_2==Or||LA9_2==Pow||LA9_2==QMark||LA9_2==SColon||LA9_2==Subtract) ) {
							alt9=1;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 9, 2, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case Assert:
					case Size:
						{
						alt9=2;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 9, 0, input);
						throw nvae;
					}
					switch (alt9) {
						case 1 :
							// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:114:40: expression
							{
							pushFollow(FOLLOW_expression_in_assignment431);
							expression36=expression();
							state._fsp--;

							stream_expression.add(expression36.getTree());
							// AST REWRITE
							// elements: Identifier, 75, expression, indexes
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 114:51: -> ^( 'global' ASSIGNMENT Identifier ( indexes )? expression )
							{
								// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:114:54: ^( 'global' ASSIGNMENT Identifier ( indexes )? expression )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(stream_75.nextNode(), root_1);
								adaptor.addChild(root_1, (Object)adaptor.create(ASSIGNMENT, "ASSIGNMENT"));
								adaptor.addChild(root_1, stream_Identifier.nextNode());
								// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:114:87: ( indexes )?
								if ( stream_indexes.hasNext() ) {
									adaptor.addChild(root_1, stream_indexes.nextTree());
								}
								stream_indexes.reset();

								adaptor.addChild(root_1, stream_expression.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 2 :
							// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:115:6: functionCall
							{
							pushFollow(FOLLOW_functionCall_in_assignment453);
							functionCall37=functionCall();
							state._fsp--;

							stream_functionCall.add(functionCall37.getTree());
							// AST REWRITE
							// elements: functionCall, indexes, Identifier, 75
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 115:19: -> ^( 'global' ASSIGNMENT Identifier ( indexes )? functionCall )
							{
								// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:115:22: ^( 'global' ASSIGNMENT Identifier ( indexes )? functionCall )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(stream_75.nextNode(), root_1);
								adaptor.addChild(root_1, (Object)adaptor.create(ASSIGNMENT, "ASSIGNMENT"));
								adaptor.addChild(root_1, stream_Identifier.nextNode());
								// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:115:55: ( indexes )?
								if ( stream_indexes.hasNext() ) {
									adaptor.addChild(root_1, stream_indexes.nextTree());
								}
								stream_indexes.reset();

								adaptor.addChild(root_1, stream_functionCall.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;

					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignment"


	public static class functionCall_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionCall"
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:118:1: functionCall : ( Identifier '(' ( exprList )? ')' -> ^( FUNC_CALL Identifier ( exprList )? ) | Assert '(' expression ')' -> ^( FUNC_CALL Assert expression ) | Size '(' expression ')' -> ^( FUNC_CALL Size expression ) );
	public final DataCentricDSLParser.functionCall_return functionCall() throws RecognitionException {
		DataCentricDSLParser.functionCall_return retval = new DataCentricDSLParser.functionCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier38=null;
		Token char_literal39=null;
		Token char_literal41=null;
		Token Assert42=null;
		Token char_literal43=null;
		Token char_literal45=null;
		Token Size46=null;
		Token char_literal47=null;
		Token char_literal49=null;
		ParserRuleReturnScope exprList40 =null;
		ParserRuleReturnScope expression44 =null;
		ParserRuleReturnScope expression48 =null;

		Object Identifier38_tree=null;
		Object char_literal39_tree=null;
		Object char_literal41_tree=null;
		Object Assert42_tree=null;
		Object char_literal43_tree=null;
		Object char_literal45_tree=null;
		Object Size46_tree=null;
		Object char_literal47_tree=null;
		Object char_literal49_tree=null;
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_Assert=new RewriteRuleTokenStream(adaptor,"token Assert");
		RewriteRuleTokenStream stream_Size=new RewriteRuleTokenStream(adaptor,"token Size");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:119:3: ( Identifier '(' ( exprList )? ')' -> ^( FUNC_CALL Identifier ( exprList )? ) | Assert '(' expression ')' -> ^( FUNC_CALL Assert expression ) | Size '(' expression ')' -> ^( FUNC_CALL Size expression ) )
			int alt12=3;
			switch ( input.LA(1) ) {
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
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:119:6: Identifier '(' ( exprList )? ')'
					{
					Identifier38=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionCall483);  
					stream_Identifier.add(Identifier38);

					char_literal39=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall485);  
					stream_OParen.add(char_literal39);

					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:119:21: ( exprList )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==Bool||LA11_0==Excl||LA11_0==Identifier||(LA11_0 >= Null && LA11_0 <= Number)||(LA11_0 >= OBracket && LA11_0 <= OParen)||(LA11_0 >= String && LA11_0 <= Subtract)||LA11_0==76) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:119:21: exprList
							{
							pushFollow(FOLLOW_exprList_in_functionCall487);
							exprList40=exprList();
							state._fsp--;

							stream_exprList.add(exprList40.getTree());
							}
							break;

					}

					char_literal41=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall490);  
					stream_CParen.add(char_literal41);

					// AST REWRITE
					// elements: Identifier, exprList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 119:35: -> ^( FUNC_CALL Identifier ( exprList )? )
					{
						// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:119:38: ^( FUNC_CALL Identifier ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Identifier.nextNode());
						// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:119:61: ( exprList )?
						if ( stream_exprList.hasNext() ) {
							adaptor.addChild(root_1, stream_exprList.nextTree());
						}
						stream_exprList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:122:6: Assert '(' expression ')'
					{
					Assert42=(Token)match(input,Assert,FOLLOW_Assert_in_functionCall510);  
					stream_Assert.add(Assert42);

					char_literal43=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall512);  
					stream_OParen.add(char_literal43);

					pushFollow(FOLLOW_expression_in_functionCall514);
					expression44=expression();
					state._fsp--;

					stream_expression.add(expression44.getTree());
					char_literal45=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall516);  
					stream_CParen.add(char_literal45);

					// AST REWRITE
					// elements: Assert, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 122:35: -> ^( FUNC_CALL Assert expression )
					{
						// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:122:38: ^( FUNC_CALL Assert expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Assert.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:123:6: Size '(' expression ')'
					{
					Size46=(Token)match(input,Size,FOLLOW_Size_in_functionCall536);  
					stream_Size.add(Size46);

					char_literal47=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall538);  
					stream_OParen.add(char_literal47);

					pushFollow(FOLLOW_expression_in_functionCall540);
					expression48=expression();
					state._fsp--;

					stream_expression.add(expression48.getTree());
					char_literal49=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall542);  
					stream_CParen.add(char_literal49);

					// AST REWRITE
					// elements: Size, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 123:35: -> ^( FUNC_CALL Size expression )
					{
						// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:123:38: ^( FUNC_CALL Size expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Size.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "functionCall"


	public static class println_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "println"
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:126:1: println : Println ( expression -> ^( PRINTLN expression ) | functionCall -> ^( PRINTLN functionCall ) ) ;
	public final DataCentricDSLParser.println_return println() throws RecognitionException {
		DataCentricDSLParser.println_return retval = new DataCentricDSLParser.println_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Println50=null;
		ParserRuleReturnScope expression51 =null;
		ParserRuleReturnScope functionCall52 =null;

		Object Println50_tree=null;
		RewriteRuleTokenStream stream_Println=new RewriteRuleTokenStream(adaptor,"token Println");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_functionCall=new RewriteRuleSubtreeStream(adaptor,"rule functionCall");

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:127:3: ( Println ( expression -> ^( PRINTLN expression ) | functionCall -> ^( PRINTLN functionCall ) ) )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:127:5: Println ( expression -> ^( PRINTLN expression ) | functionCall -> ^( PRINTLN functionCall ) )
			{
			Println50=(Token)match(input,Println,FOLLOW_Println_in_println570);  
			stream_Println.add(Println50);

			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:127:13: ( expression -> ^( PRINTLN expression ) | functionCall -> ^( PRINTLN functionCall ) )
			int alt13=2;
			switch ( input.LA(1) ) {
			case Bool:
			case Excl:
			case Null:
			case Number:
			case OBracket:
			case OParen:
			case String:
			case Subtract:
			case 76:
				{
				alt13=1;
				}
				break;
			case Identifier:
				{
				int LA13_2 = input.LA(2);
				if ( (LA13_2==OParen) ) {
					alt13=2;
				}
				else if ( ((LA13_2 >= Add && LA13_2 <= And)||LA13_2==Divide||LA13_2==Equals||(LA13_2 >= GT && LA13_2 <= GTEquals)||LA13_2==In||(LA13_2 >= LT && LA13_2 <= Multiply)||LA13_2==NEquals||LA13_2==OBracket||LA13_2==Or||LA13_2==Pow||LA13_2==QMark||LA13_2==SColon||LA13_2==Subtract) ) {
					alt13=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 13, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case Assert:
			case Size:
				{
				alt13=2;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:127:14: expression
					{
					pushFollow(FOLLOW_expression_in_println573);
					expression51=expression();
					state._fsp--;

					stream_expression.add(expression51.getTree());
					// AST REWRITE
					// elements: expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 127:25: -> ^( PRINTLN expression )
					{
						// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:127:28: ^( PRINTLN expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PRINTLN, "PRINTLN"), root_1);
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:128:5: functionCall
					{
					pushFollow(FOLLOW_functionCall_in_println587);
					functionCall52=functionCall();
					state._fsp--;

					stream_functionCall.add(functionCall52.getTree());
					// AST REWRITE
					// elements: functionCall
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 128:18: -> ^( PRINTLN functionCall )
					{
						// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:128:21: ^( PRINTLN functionCall )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PRINTLN, "PRINTLN"), root_1);
						adaptor.addChild(root_1, stream_functionCall.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "println"


	public static class print_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "print"
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:131:1: print : Print ( expression -> ^( PRINT expression ) | functionCall -> ^( PRINT functionCall ) ) ;
	public final DataCentricDSLParser.print_return print() throws RecognitionException {
		DataCentricDSLParser.print_return retval = new DataCentricDSLParser.print_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Print53=null;
		ParserRuleReturnScope expression54 =null;
		ParserRuleReturnScope functionCall55 =null;

		Object Print53_tree=null;
		RewriteRuleTokenStream stream_Print=new RewriteRuleTokenStream(adaptor,"token Print");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_functionCall=new RewriteRuleSubtreeStream(adaptor,"rule functionCall");

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:132:3: ( Print ( expression -> ^( PRINT expression ) | functionCall -> ^( PRINT functionCall ) ) )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:132:5: Print ( expression -> ^( PRINT expression ) | functionCall -> ^( PRINT functionCall ) )
			{
			Print53=(Token)match(input,Print,FOLLOW_Print_in_print612);  
			stream_Print.add(Print53);

			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:132:11: ( expression -> ^( PRINT expression ) | functionCall -> ^( PRINT functionCall ) )
			int alt14=2;
			switch ( input.LA(1) ) {
			case Bool:
			case Excl:
			case Null:
			case Number:
			case OBracket:
			case OParen:
			case String:
			case Subtract:
			case 76:
				{
				alt14=1;
				}
				break;
			case Identifier:
				{
				int LA14_2 = input.LA(2);
				if ( (LA14_2==OParen) ) {
					alt14=2;
				}
				else if ( ((LA14_2 >= Add && LA14_2 <= And)||LA14_2==Divide||LA14_2==Equals||(LA14_2 >= GT && LA14_2 <= GTEquals)||LA14_2==In||(LA14_2 >= LT && LA14_2 <= Multiply)||LA14_2==NEquals||LA14_2==OBracket||LA14_2==Or||LA14_2==Pow||LA14_2==QMark||LA14_2==SColon||LA14_2==Subtract) ) {
					alt14=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 14, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case Assert:
			case Size:
				{
				alt14=2;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:132:12: expression
					{
					pushFollow(FOLLOW_expression_in_print615);
					expression54=expression();
					state._fsp--;

					stream_expression.add(expression54.getTree());
					// AST REWRITE
					// elements: expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 132:23: -> ^( PRINT expression )
					{
						// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:132:26: ^( PRINT expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PRINT, "PRINT"), root_1);
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:133:5: functionCall
					{
					pushFollow(FOLLOW_functionCall_in_print629);
					functionCall55=functionCall();
					state._fsp--;

					stream_functionCall.add(functionCall55.getTree());
					// AST REWRITE
					// elements: functionCall
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 133:18: -> ^( PRINT functionCall )
					{
						// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:133:21: ^( PRINT functionCall )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PRINT, "PRINT"), root_1);
						adaptor.addChild(root_1, stream_functionCall.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "print"


	public static class ifStatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ifStatement"
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:136:1: ifStatement : ifStat ( elseIfStat )* ( elseStat )? -> ^( IF ifStat ( elseIfStat )* ( elseStat )? ) ;
	public final DataCentricDSLParser.ifStatement_return ifStatement() throws RecognitionException {
		DataCentricDSLParser.ifStatement_return retval = new DataCentricDSLParser.ifStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope ifStat56 =null;
		ParserRuleReturnScope elseIfStat57 =null;
		ParserRuleReturnScope elseStat58 =null;

		RewriteRuleSubtreeStream stream_ifStat=new RewriteRuleSubtreeStream(adaptor,"rule ifStat");
		RewriteRuleSubtreeStream stream_elseIfStat=new RewriteRuleSubtreeStream(adaptor,"rule elseIfStat");
		RewriteRuleSubtreeStream stream_elseStat=new RewriteRuleSubtreeStream(adaptor,"rule elseStat");

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:137:3: ( ifStat ( elseIfStat )* ( elseStat )? -> ^( IF ifStat ( elseIfStat )* ( elseStat )? ) )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:137:6: ifStat ( elseIfStat )* ( elseStat )?
			{
			pushFollow(FOLLOW_ifStat_in_ifStatement653);
			ifStat56=ifStat();
			state._fsp--;

			stream_ifStat.add(ifStat56.getTree());
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:137:13: ( elseIfStat )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==Else) ) {
					int LA15_1 = input.LA(2);
					if ( (LA15_1==If) ) {
						alt15=1;
					}

				}

				switch (alt15) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:137:13: elseIfStat
					{
					pushFollow(FOLLOW_elseIfStat_in_ifStatement655);
					elseIfStat57=elseIfStat();
					state._fsp--;

					stream_elseIfStat.add(elseIfStat57.getTree());
					}
					break;

				default :
					break loop15;
				}
			}

			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:137:25: ( elseStat )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==Else) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:137:25: elseStat
					{
					pushFollow(FOLLOW_elseStat_in_ifStatement658);
					elseStat58=elseStat();
					state._fsp--;

					stream_elseStat.add(elseStat58.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: elseIfStat, ifStat, elseStat
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 137:35: -> ^( IF ifStat ( elseIfStat )* ( elseStat )? )
			{
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:137:38: ^( IF ifStat ( elseIfStat )* ( elseStat )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);
				adaptor.addChild(root_1, stream_ifStat.nextTree());
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:137:50: ( elseIfStat )*
				while ( stream_elseIfStat.hasNext() ) {
					adaptor.addChild(root_1, stream_elseIfStat.nextTree());
				}
				stream_elseIfStat.reset();

				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:137:62: ( elseStat )?
				if ( stream_elseStat.hasNext() ) {
					adaptor.addChild(root_1, stream_elseStat.nextTree());
				}
				stream_elseStat.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ifStatement"


	public static class ifStat_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ifStat"
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:140:1: ifStat : If '(' expression ')' '{' block '}' -> ^( EXP expression block ) ;
	public final DataCentricDSLParser.ifStat_return ifStat() throws RecognitionException {
		DataCentricDSLParser.ifStat_return retval = new DataCentricDSLParser.ifStat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token If59=null;
		Token char_literal60=null;
		Token char_literal62=null;
		Token char_literal63=null;
		Token char_literal65=null;
		ParserRuleReturnScope expression61 =null;
		ParserRuleReturnScope block64 =null;

		Object If59_tree=null;
		Object char_literal60_tree=null;
		Object char_literal62_tree=null;
		Object char_literal63_tree=null;
		Object char_literal65_tree=null;
		RewriteRuleTokenStream stream_OBrace=new RewriteRuleTokenStream(adaptor,"token OBrace");
		RewriteRuleTokenStream stream_CBrace=new RewriteRuleTokenStream(adaptor,"token CBrace");
		RewriteRuleTokenStream stream_If=new RewriteRuleTokenStream(adaptor,"token If");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:141:3: ( If '(' expression ')' '{' block '}' -> ^( EXP expression block ) )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:141:6: If '(' expression ')' '{' block '}'
			{
			If59=(Token)match(input,If,FOLLOW_If_in_ifStat687);  
			stream_If.add(If59);

			char_literal60=(Token)match(input,OParen,FOLLOW_OParen_in_ifStat689);  
			stream_OParen.add(char_literal60);

			pushFollow(FOLLOW_expression_in_ifStat691);
			expression61=expression();
			state._fsp--;

			stream_expression.add(expression61.getTree());
			char_literal62=(Token)match(input,CParen,FOLLOW_CParen_in_ifStat693);  
			stream_CParen.add(char_literal62);

			char_literal63=(Token)match(input,OBrace,FOLLOW_OBrace_in_ifStat695);  
			stream_OBrace.add(char_literal63);

			pushFollow(FOLLOW_block_in_ifStat697);
			block64=block();
			state._fsp--;

			stream_block.add(block64.getTree());
			char_literal65=(Token)match(input,CBrace,FOLLOW_CBrace_in_ifStat699);  
			stream_CBrace.add(char_literal65);

			// AST REWRITE
			// elements: expression, block
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 141:42: -> ^( EXP expression block )
			{
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:141:45: ^( EXP expression block )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXP, "EXP"), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_block.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ifStat"


	public static class elseIfStat_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "elseIfStat"
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:144:1: elseIfStat : Else If '(' expression ')' '{' block '}' -> ^( EXP expression block ) ;
	public final DataCentricDSLParser.elseIfStat_return elseIfStat() throws RecognitionException {
		DataCentricDSLParser.elseIfStat_return retval = new DataCentricDSLParser.elseIfStat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Else66=null;
		Token If67=null;
		Token char_literal68=null;
		Token char_literal70=null;
		Token char_literal71=null;
		Token char_literal73=null;
		ParserRuleReturnScope expression69 =null;
		ParserRuleReturnScope block72 =null;

		Object Else66_tree=null;
		Object If67_tree=null;
		Object char_literal68_tree=null;
		Object char_literal70_tree=null;
		Object char_literal71_tree=null;
		Object char_literal73_tree=null;
		RewriteRuleTokenStream stream_OBrace=new RewriteRuleTokenStream(adaptor,"token OBrace");
		RewriteRuleTokenStream stream_Else=new RewriteRuleTokenStream(adaptor,"token Else");
		RewriteRuleTokenStream stream_CBrace=new RewriteRuleTokenStream(adaptor,"token CBrace");
		RewriteRuleTokenStream stream_If=new RewriteRuleTokenStream(adaptor,"token If");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:145:3: ( Else If '(' expression ')' '{' block '}' -> ^( EXP expression block ) )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:145:6: Else If '(' expression ')' '{' block '}'
			{
			Else66=(Token)match(input,Else,FOLLOW_Else_in_elseIfStat723);  
			stream_Else.add(Else66);

			If67=(Token)match(input,If,FOLLOW_If_in_elseIfStat725);  
			stream_If.add(If67);

			char_literal68=(Token)match(input,OParen,FOLLOW_OParen_in_elseIfStat727);  
			stream_OParen.add(char_literal68);

			pushFollow(FOLLOW_expression_in_elseIfStat729);
			expression69=expression();
			state._fsp--;

			stream_expression.add(expression69.getTree());
			char_literal70=(Token)match(input,CParen,FOLLOW_CParen_in_elseIfStat731);  
			stream_CParen.add(char_literal70);

			char_literal71=(Token)match(input,OBrace,FOLLOW_OBrace_in_elseIfStat733);  
			stream_OBrace.add(char_literal71);

			pushFollow(FOLLOW_block_in_elseIfStat735);
			block72=block();
			state._fsp--;

			stream_block.add(block72.getTree());
			char_literal73=(Token)match(input,CBrace,FOLLOW_CBrace_in_elseIfStat737);  
			stream_CBrace.add(char_literal73);

			// AST REWRITE
			// elements: block, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 145:47: -> ^( EXP expression block )
			{
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:145:50: ^( EXP expression block )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXP, "EXP"), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_block.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "elseIfStat"


	public static class elseStat_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "elseStat"
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:148:1: elseStat : Else '{' block '}' -> ^( EXP block ) ;
	public final DataCentricDSLParser.elseStat_return elseStat() throws RecognitionException {
		DataCentricDSLParser.elseStat_return retval = new DataCentricDSLParser.elseStat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Else74=null;
		Token char_literal75=null;
		Token char_literal77=null;
		ParserRuleReturnScope block76 =null;

		Object Else74_tree=null;
		Object char_literal75_tree=null;
		Object char_literal77_tree=null;
		RewriteRuleTokenStream stream_OBrace=new RewriteRuleTokenStream(adaptor,"token OBrace");
		RewriteRuleTokenStream stream_Else=new RewriteRuleTokenStream(adaptor,"token Else");
		RewriteRuleTokenStream stream_CBrace=new RewriteRuleTokenStream(adaptor,"token CBrace");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:149:3: ( Else '{' block '}' -> ^( EXP block ) )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:149:6: Else '{' block '}'
			{
			Else74=(Token)match(input,Else,FOLLOW_Else_in_elseStat761);  
			stream_Else.add(Else74);

			char_literal75=(Token)match(input,OBrace,FOLLOW_OBrace_in_elseStat763);  
			stream_OBrace.add(char_literal75);

			pushFollow(FOLLOW_block_in_elseStat765);
			block76=block();
			state._fsp--;

			stream_block.add(block76.getTree());
			char_literal77=(Token)match(input,CBrace,FOLLOW_CBrace_in_elseStat767);  
			stream_CBrace.add(char_literal77);

			// AST REWRITE
			// elements: block
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 149:25: -> ^( EXP block )
			{
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:149:28: ^( EXP block )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXP, "EXP"), root_1);
				adaptor.addChild(root_1, stream_block.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "elseStat"


	public static class functionDecl_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionDecl"
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:152:1: functionDecl : 'func' Identifier '(' ( idList )? ')' '{' block '}' ;
	public final DataCentricDSLParser.functionDecl_return functionDecl() throws RecognitionException {
		DataCentricDSLParser.functionDecl_return retval = new DataCentricDSLParser.functionDecl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal78=null;
		Token Identifier79=null;
		Token char_literal80=null;
		Token char_literal82=null;
		Token char_literal83=null;
		Token char_literal85=null;
		ParserRuleReturnScope idList81 =null;
		ParserRuleReturnScope block84 =null;

		Object string_literal78_tree=null;
		Object Identifier79_tree=null;
		Object char_literal80_tree=null;
		Object char_literal82_tree=null;
		Object char_literal83_tree=null;
		Object char_literal85_tree=null;

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:153:3: ( 'func' Identifier '(' ( idList )? ')' '{' block '}' )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:153:6: 'func' Identifier '(' ( idList )? ')' '{' block '}'
			{
			root_0 = (Object)adaptor.nil();


			string_literal78=(Token)match(input,74,FOLLOW_74_in_functionDecl789); 
			string_literal78_tree = (Object)adaptor.create(string_literal78);
			adaptor.addChild(root_0, string_literal78_tree);

			Identifier79=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionDecl791); 
			Identifier79_tree = (Object)adaptor.create(Identifier79);
			adaptor.addChild(root_0, Identifier79_tree);

			char_literal80=(Token)match(input,OParen,FOLLOW_OParen_in_functionDecl793); 
			char_literal80_tree = (Object)adaptor.create(char_literal80);
			adaptor.addChild(root_0, char_literal80_tree);

			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:153:28: ( idList )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==Identifier) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:153:28: idList
					{
					pushFollow(FOLLOW_idList_in_functionDecl795);
					idList81=idList();
					state._fsp--;

					adaptor.addChild(root_0, idList81.getTree());

					}
					break;

			}

			char_literal82=(Token)match(input,CParen,FOLLOW_CParen_in_functionDecl798); 
			char_literal82_tree = (Object)adaptor.create(char_literal82);
			adaptor.addChild(root_0, char_literal82_tree);

			char_literal83=(Token)match(input,OBrace,FOLLOW_OBrace_in_functionDecl800); 
			char_literal83_tree = (Object)adaptor.create(char_literal83);
			adaptor.addChild(root_0, char_literal83_tree);

			pushFollow(FOLLOW_block_in_functionDecl802);
			block84=block();
			state._fsp--;

			adaptor.addChild(root_0, block84.getTree());

			char_literal85=(Token)match(input,CBrace,FOLLOW_CBrace_in_functionDecl804); 
			char_literal85_tree = (Object)adaptor.create(char_literal85);
			adaptor.addChild(root_0, char_literal85_tree);

			defineFunction((Identifier79!=null?Identifier79.getText():null), (idList81!=null?((Object)idList81.getTree()):null), (block84!=null?((Object)block84.getTree()):null));
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "functionDecl"


	public static class forStatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "forStatement"
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:159:1: forStatement : ( For '(' assignment ';' expression ';' afterthought ')' '{' block '}' -> ^( For assignment expression afterthought block ) ) ;
	public final DataCentricDSLParser.forStatement_return forStatement() throws RecognitionException {
		DataCentricDSLParser.forStatement_return retval = new DataCentricDSLParser.forStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token For86=null;
		Token char_literal87=null;
		Token char_literal89=null;
		Token char_literal91=null;
		Token char_literal93=null;
		Token char_literal94=null;
		Token char_literal96=null;
		ParserRuleReturnScope assignment88 =null;
		ParserRuleReturnScope expression90 =null;
		ParserRuleReturnScope afterthought92 =null;
		ParserRuleReturnScope block95 =null;

		Object For86_tree=null;
		Object char_literal87_tree=null;
		Object char_literal89_tree=null;
		Object char_literal91_tree=null;
		Object char_literal93_tree=null;
		Object char_literal94_tree=null;
		Object char_literal96_tree=null;
		RewriteRuleTokenStream stream_OBrace=new RewriteRuleTokenStream(adaptor,"token OBrace");
		RewriteRuleTokenStream stream_For=new RewriteRuleTokenStream(adaptor,"token For");
		RewriteRuleTokenStream stream_SColon=new RewriteRuleTokenStream(adaptor,"token SColon");
		RewriteRuleTokenStream stream_CBrace=new RewriteRuleTokenStream(adaptor,"token CBrace");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_afterthought=new RewriteRuleSubtreeStream(adaptor,"rule afterthought");
		RewriteRuleSubtreeStream stream_assignment=new RewriteRuleSubtreeStream(adaptor,"rule assignment");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:160:3: ( ( For '(' assignment ';' expression ';' afterthought ')' '{' block '}' -> ^( For assignment expression afterthought block ) ) )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:160:6: ( For '(' assignment ';' expression ';' afterthought ')' '{' block '}' -> ^( For assignment expression afterthought block ) )
			{
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:160:6: ( For '(' assignment ';' expression ';' afterthought ')' '{' block '}' -> ^( For assignment expression afterthought block ) )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:160:7: For '(' assignment ';' expression ';' afterthought ')' '{' block '}'
			{
			For86=(Token)match(input,For,FOLLOW_For_in_forStatement826);  
			stream_For.add(For86);

			char_literal87=(Token)match(input,OParen,FOLLOW_OParen_in_forStatement828);  
			stream_OParen.add(char_literal87);

			pushFollow(FOLLOW_assignment_in_forStatement830);
			assignment88=assignment();
			state._fsp--;

			stream_assignment.add(assignment88.getTree());
			char_literal89=(Token)match(input,SColon,FOLLOW_SColon_in_forStatement832);  
			stream_SColon.add(char_literal89);

			pushFollow(FOLLOW_expression_in_forStatement834);
			expression90=expression();
			state._fsp--;

			stream_expression.add(expression90.getTree());
			char_literal91=(Token)match(input,SColon,FOLLOW_SColon_in_forStatement836);  
			stream_SColon.add(char_literal91);

			pushFollow(FOLLOW_afterthought_in_forStatement838);
			afterthought92=afterthought();
			state._fsp--;

			stream_afterthought.add(afterthought92.getTree());
			char_literal93=(Token)match(input,CParen,FOLLOW_CParen_in_forStatement840);  
			stream_CParen.add(char_literal93);

			char_literal94=(Token)match(input,OBrace,FOLLOW_OBrace_in_forStatement842);  
			stream_OBrace.add(char_literal94);

			pushFollow(FOLLOW_block_in_forStatement844);
			block95=block();
			state._fsp--;

			stream_block.add(block95.getTree());
			char_literal96=(Token)match(input,CBrace,FOLLOW_CBrace_in_forStatement846);  
			stream_CBrace.add(char_literal96);

			// AST REWRITE
			// elements: assignment, expression, For, afterthought, block
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 161:6: -> ^( For assignment expression afterthought block )
			{
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:161:9: ^( For assignment expression afterthought block )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_For.nextNode(), root_1);
				adaptor.addChild(root_1, stream_assignment.nextTree());
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_afterthought.nextTree());
				adaptor.addChild(root_1, stream_block.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "forStatement"


	public static class afterthought_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "afterthought"
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:164:1: afterthought : ( ( Identifier '=' expression ) | incrementation );
	public final DataCentricDSLParser.afterthought_return afterthought() throws RecognitionException {
		DataCentricDSLParser.afterthought_return retval = new DataCentricDSLParser.afterthought_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier97=null;
		Token char_literal98=null;
		ParserRuleReturnScope expression99 =null;
		ParserRuleReturnScope incrementation100 =null;

		Object Identifier97_tree=null;
		Object char_literal98_tree=null;

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:164:13: ( ( Identifier '=' expression ) | incrementation )
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
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:165:3: ( Identifier '=' expression )
					{
					root_0 = (Object)adaptor.nil();


					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:165:3: ( Identifier '=' expression )
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:165:4: Identifier '=' expression
					{
					Identifier97=(Token)match(input,Identifier,FOLLOW_Identifier_in_afterthought878); 
					Identifier97_tree = (Object)adaptor.create(Identifier97);
					adaptor.addChild(root_0, Identifier97_tree);

					char_literal98=(Token)match(input,Assign,FOLLOW_Assign_in_afterthought880); 
					char_literal98_tree = (Object)adaptor.create(char_literal98);
					adaptor.addChild(root_0, char_literal98_tree);

					pushFollow(FOLLOW_expression_in_afterthought882);
					expression99=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression99.getTree());

					}

					}
					break;
				case 2 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:165:33: incrementation
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_incrementation_in_afterthought887);
					incrementation100=incrementation();
					state._fsp--;

					adaptor.addChild(root_0, incrementation100.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "afterthought"


	public static class whileStatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "whileStatement"
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:168:1: whileStatement : While '(' expression ')' '{' block '}' -> ^( While expression block ) ;
	public final DataCentricDSLParser.whileStatement_return whileStatement() throws RecognitionException {
		DataCentricDSLParser.whileStatement_return retval = new DataCentricDSLParser.whileStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token While101=null;
		Token char_literal102=null;
		Token char_literal104=null;
		Token char_literal105=null;
		Token char_literal107=null;
		ParserRuleReturnScope expression103 =null;
		ParserRuleReturnScope block106 =null;

		Object While101_tree=null;
		Object char_literal102_tree=null;
		Object char_literal104_tree=null;
		Object char_literal105_tree=null;
		Object char_literal107_tree=null;
		RewriteRuleTokenStream stream_OBrace=new RewriteRuleTokenStream(adaptor,"token OBrace");
		RewriteRuleTokenStream stream_While=new RewriteRuleTokenStream(adaptor,"token While");
		RewriteRuleTokenStream stream_CBrace=new RewriteRuleTokenStream(adaptor,"token CBrace");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:169:3: ( While '(' expression ')' '{' block '}' -> ^( While expression block ) )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:169:6: While '(' expression ')' '{' block '}'
			{
			While101=(Token)match(input,While,FOLLOW_While_in_whileStatement899);  
			stream_While.add(While101);

			char_literal102=(Token)match(input,OParen,FOLLOW_OParen_in_whileStatement901);  
			stream_OParen.add(char_literal102);

			pushFollow(FOLLOW_expression_in_whileStatement903);
			expression103=expression();
			state._fsp--;

			stream_expression.add(expression103.getTree());
			char_literal104=(Token)match(input,CParen,FOLLOW_CParen_in_whileStatement905);  
			stream_CParen.add(char_literal104);

			char_literal105=(Token)match(input,OBrace,FOLLOW_OBrace_in_whileStatement907);  
			stream_OBrace.add(char_literal105);

			pushFollow(FOLLOW_block_in_whileStatement909);
			block106=block();
			state._fsp--;

			stream_block.add(block106.getTree());
			char_literal107=(Token)match(input,CBrace,FOLLOW_CBrace_in_whileStatement911);  
			stream_CBrace.add(char_literal107);

			// AST REWRITE
			// elements: While, expression, block
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 169:45: -> ^( While expression block )
			{
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:169:48: ^( While expression block )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_While.nextNode(), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_block.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "whileStatement"


	public static class idList_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "idList"
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:172:1: idList : Identifier ( ',' Identifier )* -> ^( ID_LIST ( Identifier )+ ) ;
	public final DataCentricDSLParser.idList_return idList() throws RecognitionException {
		DataCentricDSLParser.idList_return retval = new DataCentricDSLParser.idList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier108=null;
		Token char_literal109=null;
		Token Identifier110=null;

		Object Identifier108_tree=null;
		Object char_literal109_tree=null;
		Object Identifier110_tree=null;
		RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:173:3: ( Identifier ( ',' Identifier )* -> ^( ID_LIST ( Identifier )+ ) )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:173:6: Identifier ( ',' Identifier )*
			{
			Identifier108=(Token)match(input,Identifier,FOLLOW_Identifier_in_idList935);  
			stream_Identifier.add(Identifier108);

			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:173:17: ( ',' Identifier )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==Comma) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:173:18: ',' Identifier
					{
					char_literal109=(Token)match(input,Comma,FOLLOW_Comma_in_idList938);  
					stream_Comma.add(char_literal109);

					Identifier110=(Token)match(input,Identifier,FOLLOW_Identifier_in_idList940);  
					stream_Identifier.add(Identifier110);

					}
					break;

				default :
					break loop19;
				}
			}

			// AST REWRITE
			// elements: Identifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 173:35: -> ^( ID_LIST ( Identifier )+ )
			{
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:173:38: ^( ID_LIST ( Identifier )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ID_LIST, "ID_LIST"), root_1);
				if ( !(stream_Identifier.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_Identifier.hasNext() ) {
					adaptor.addChild(root_1, stream_Identifier.nextNode());
				}
				stream_Identifier.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "idList"


	public static class exprList_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprList"
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:176:1: exprList : expression ( ',' expression )* -> ^( EXP_LIST ( expression )+ ) ;
	public final DataCentricDSLParser.exprList_return exprList() throws RecognitionException {
		DataCentricDSLParser.exprList_return retval = new DataCentricDSLParser.exprList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal112=null;
		ParserRuleReturnScope expression111 =null;
		ParserRuleReturnScope expression113 =null;

		Object char_literal112_tree=null;
		RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:177:3: ( expression ( ',' expression )* -> ^( EXP_LIST ( expression )+ ) )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:177:6: expression ( ',' expression )*
			{
			pushFollow(FOLLOW_expression_in_exprList965);
			expression111=expression();
			state._fsp--;

			stream_expression.add(expression111.getTree());
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:177:17: ( ',' expression )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==Comma) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:177:18: ',' expression
					{
					char_literal112=(Token)match(input,Comma,FOLLOW_Comma_in_exprList968);  
					stream_Comma.add(char_literal112);

					pushFollow(FOLLOW_expression_in_exprList970);
					expression113=expression();
					state._fsp--;

					stream_expression.add(expression113.getTree());
					}
					break;

				default :
					break loop20;
				}
			}

			// AST REWRITE
			// elements: expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 177:35: -> ^( EXP_LIST ( expression )+ )
			{
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:177:38: ^( EXP_LIST ( expression )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXP_LIST, "EXP_LIST"), root_1);
				if ( !(stream_expression.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_expression.nextTree());
				}
				stream_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exprList"


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:180:1: expression : ( condExpr | query );
	public final DataCentricDSLParser.expression_return expression() throws RecognitionException {
		DataCentricDSLParser.expression_return retval = new DataCentricDSLParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope condExpr114 =null;
		ParserRuleReturnScope query115 =null;


		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:181:3: ( condExpr | query )
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==Bool||LA21_0==Excl||LA21_0==Identifier||(LA21_0 >= Null && LA21_0 <= Number)||(LA21_0 >= OBracket && LA21_0 <= OParen)||(LA21_0 >= String && LA21_0 <= Subtract)) ) {
				alt21=1;
			}
			else if ( (LA21_0==76) ) {
				alt21=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:181:6: condExpr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_condExpr_in_expression995);
					condExpr114=condExpr();
					state._fsp--;

					adaptor.addChild(root_0, condExpr114.getTree());

					}
					break;
				case 2 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:181:17: query
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_query_in_expression999);
					query115=query();
					state._fsp--;

					adaptor.addChild(root_0, query115.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class incrementation_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "incrementation"
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:184:1: incrementation : variableCall ( '++' | '--' ) ;
	public final DataCentricDSLParser.incrementation_return incrementation() throws RecognitionException {
		DataCentricDSLParser.incrementation_return retval = new DataCentricDSLParser.incrementation_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set117=null;
		ParserRuleReturnScope variableCall116 =null;

		Object set117_tree=null;

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:185:3: ( variableCall ( '++' | '--' ) )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:185:5: variableCall ( '++' | '--' )
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_variableCall_in_incrementation1012);
			variableCall116=variableCall();
			state._fsp--;

			adaptor.addChild(root_0, variableCall116.getTree());

			set117=input.LT(1);
			if ( input.LA(1)==Increment||input.LA(1)==73 ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set117));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "incrementation"


	public static class condExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "condExpr"
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:188:1: condExpr : ( orExpr -> orExpr ) ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )? ;
	public final DataCentricDSLParser.condExpr_return condExpr() throws RecognitionException {
		DataCentricDSLParser.condExpr_return retval = new DataCentricDSLParser.condExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal119=null;
		Token char_literal120=null;
		Token In121=null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope orExpr118 =null;
		ParserRuleReturnScope expression122 =null;

		Object char_literal119_tree=null;
		Object char_literal120_tree=null;
		Object In121_tree=null;
		RewriteRuleTokenStream stream_In=new RewriteRuleTokenStream(adaptor,"token In");
		RewriteRuleTokenStream stream_QMark=new RewriteRuleTokenStream(adaptor,"token QMark");
		RewriteRuleTokenStream stream_Colon=new RewriteRuleTokenStream(adaptor,"token Colon");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_orExpr=new RewriteRuleSubtreeStream(adaptor,"rule orExpr");

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:189:3: ( ( orExpr -> orExpr ) ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )? )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:189:6: ( orExpr -> orExpr ) ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )?
			{
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:189:6: ( orExpr -> orExpr )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:189:7: orExpr
			{
			pushFollow(FOLLOW_orExpr_in_condExpr1031);
			orExpr118=orExpr();
			state._fsp--;

			stream_orExpr.add(orExpr118.getTree());
			// AST REWRITE
			// elements: orExpr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 189:14: -> orExpr
			{
				adaptor.addChild(root_0, stream_orExpr.nextTree());
			}


			retval.tree = root_0;

			}

			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:190:6: ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )?
			int alt22=3;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==QMark) ) {
				alt22=1;
			}
			else if ( (LA22_0==In) ) {
				alt22=2;
			}
			switch (alt22) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:190:8: '?' a= expression ':' b= expression
					{
					char_literal119=(Token)match(input,QMark,FOLLOW_QMark_in_condExpr1046);  
					stream_QMark.add(char_literal119);

					pushFollow(FOLLOW_expression_in_condExpr1050);
					a=expression();
					state._fsp--;

					stream_expression.add(a.getTree());
					char_literal120=(Token)match(input,Colon,FOLLOW_Colon_in_condExpr1052);  
					stream_Colon.add(char_literal120);

					pushFollow(FOLLOW_expression_in_condExpr1056);
					b=expression();
					state._fsp--;

					stream_expression.add(b.getTree());
					// AST REWRITE
					// elements: orExpr, a, b
					// token labels: 
					// rule labels: a, b, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.getTree():null);
					RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 190:42: -> ^( TERNARY orExpr $a $b)
					{
						// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:190:45: ^( TERNARY orExpr $a $b)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TERNARY, "TERNARY"), root_1);
						adaptor.addChild(root_1, stream_orExpr.nextTree());
						adaptor.addChild(root_1, stream_a.nextTree());
						adaptor.addChild(root_1, stream_b.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:191:8: In expression
					{
					In121=(Token)match(input,In,FOLLOW_In_in_condExpr1079);  
					stream_In.add(In121);

					pushFollow(FOLLOW_expression_in_condExpr1081);
					expression122=expression();
					state._fsp--;

					stream_expression.add(expression122.getTree());
					// AST REWRITE
					// elements: expression, In, orExpr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 191:42: -> ^( In orExpr expression )
					{
						// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:191:45: ^( In orExpr expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_In.nextNode(), root_1);
						adaptor.addChild(root_1, stream_orExpr.nextTree());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "condExpr"


	public static class orExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "orExpr"
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:195:1: orExpr : andExpr ( '||' ^ andExpr )* ;
	public final DataCentricDSLParser.orExpr_return orExpr() throws RecognitionException {
		DataCentricDSLParser.orExpr_return retval = new DataCentricDSLParser.orExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal124=null;
		ParserRuleReturnScope andExpr123 =null;
		ParserRuleReturnScope andExpr125 =null;

		Object string_literal124_tree=null;

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:196:3: ( andExpr ( '||' ^ andExpr )* )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:196:6: andExpr ( '||' ^ andExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_andExpr_in_orExpr1133);
			andExpr123=andExpr();
			state._fsp--;

			adaptor.addChild(root_0, andExpr123.getTree());

			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:196:14: ( '||' ^ andExpr )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==Or) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:196:15: '||' ^ andExpr
					{
					string_literal124=(Token)match(input,Or,FOLLOW_Or_in_orExpr1136); 
					string_literal124_tree = (Object)adaptor.create(string_literal124);
					root_0 = (Object)adaptor.becomeRoot(string_literal124_tree, root_0);

					pushFollow(FOLLOW_andExpr_in_orExpr1139);
					andExpr125=andExpr();
					state._fsp--;

					adaptor.addChild(root_0, andExpr125.getTree());

					}
					break;

				default :
					break loop23;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "orExpr"


	public static class andExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "andExpr"
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:199:1: andExpr : equExpr ( '&&' ^ equExpr )* ;
	public final DataCentricDSLParser.andExpr_return andExpr() throws RecognitionException {
		DataCentricDSLParser.andExpr_return retval = new DataCentricDSLParser.andExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal127=null;
		ParserRuleReturnScope equExpr126 =null;
		ParserRuleReturnScope equExpr128 =null;

		Object string_literal127_tree=null;

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:200:3: ( equExpr ( '&&' ^ equExpr )* )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:200:6: equExpr ( '&&' ^ equExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_equExpr_in_andExpr1155);
			equExpr126=equExpr();
			state._fsp--;

			adaptor.addChild(root_0, equExpr126.getTree());

			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:200:14: ( '&&' ^ equExpr )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==And) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:200:15: '&&' ^ equExpr
					{
					string_literal127=(Token)match(input,And,FOLLOW_And_in_andExpr1158); 
					string_literal127_tree = (Object)adaptor.create(string_literal127);
					root_0 = (Object)adaptor.becomeRoot(string_literal127_tree, root_0);

					pushFollow(FOLLOW_equExpr_in_andExpr1161);
					equExpr128=equExpr();
					state._fsp--;

					adaptor.addChild(root_0, equExpr128.getTree());

					}
					break;

				default :
					break loop24;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "andExpr"


	public static class equExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "equExpr"
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:203:1: equExpr : relExpr ( ( '==' | '!=' ) ^ relExpr )* ;
	public final DataCentricDSLParser.equExpr_return equExpr() throws RecognitionException {
		DataCentricDSLParser.equExpr_return retval = new DataCentricDSLParser.equExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set130=null;
		ParserRuleReturnScope relExpr129 =null;
		ParserRuleReturnScope relExpr131 =null;

		Object set130_tree=null;

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:204:3: ( relExpr ( ( '==' | '!=' ) ^ relExpr )* )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:204:6: relExpr ( ( '==' | '!=' ) ^ relExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_relExpr_in_equExpr1177);
			relExpr129=relExpr();
			state._fsp--;

			adaptor.addChild(root_0, relExpr129.getTree());

			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:204:14: ( ( '==' | '!=' ) ^ relExpr )*
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==Equals||LA25_0==NEquals) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:204:15: ( '==' | '!=' ) ^ relExpr
					{
					set130=input.LT(1);
					set130=input.LT(1);
					if ( input.LA(1)==Equals||input.LA(1)==NEquals ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set130), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_relExpr_in_equExpr1189);
					relExpr131=relExpr();
					state._fsp--;

					adaptor.addChild(root_0, relExpr131.getTree());

					}
					break;

				default :
					break loop25;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "equExpr"


	public static class relExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "relExpr"
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:207:1: relExpr : addExpr ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )* ;
	public final DataCentricDSLParser.relExpr_return relExpr() throws RecognitionException {
		DataCentricDSLParser.relExpr_return retval = new DataCentricDSLParser.relExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set133=null;
		ParserRuleReturnScope addExpr132 =null;
		ParserRuleReturnScope addExpr134 =null;

		Object set133_tree=null;

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:208:3: ( addExpr ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )* )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:208:6: addExpr ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_addExpr_in_relExpr1205);
			addExpr132=addExpr();
			state._fsp--;

			adaptor.addChild(root_0, addExpr132.getTree());

			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:208:14: ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )*
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( ((LA26_0 >= GT && LA26_0 <= GTEquals)||(LA26_0 >= LT && LA26_0 <= LTEquals)) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:208:15: ( '>=' | '<=' | '>' | '<' ) ^ addExpr
					{
					set133=input.LT(1);
					set133=input.LT(1);
					if ( (input.LA(1) >= GT && input.LA(1) <= GTEquals)||(input.LA(1) >= LT && input.LA(1) <= LTEquals) ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set133), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_addExpr_in_relExpr1225);
					addExpr134=addExpr();
					state._fsp--;

					adaptor.addChild(root_0, addExpr134.getTree());

					}
					break;

				default :
					break loop26;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "relExpr"


	public static class addExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "addExpr"
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:211:1: addExpr : mulExpr ( ( '+' | '-' ) ^ mulExpr )* ;
	public final DataCentricDSLParser.addExpr_return addExpr() throws RecognitionException {
		DataCentricDSLParser.addExpr_return retval = new DataCentricDSLParser.addExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set136=null;
		ParserRuleReturnScope mulExpr135 =null;
		ParserRuleReturnScope mulExpr137 =null;

		Object set136_tree=null;

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:212:3: ( mulExpr ( ( '+' | '-' ) ^ mulExpr )* )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:212:6: mulExpr ( ( '+' | '-' ) ^ mulExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_mulExpr_in_addExpr1241);
			mulExpr135=mulExpr();
			state._fsp--;

			adaptor.addChild(root_0, mulExpr135.getTree());

			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:212:14: ( ( '+' | '-' ) ^ mulExpr )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==Add||LA27_0==Subtract) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:212:15: ( '+' | '-' ) ^ mulExpr
					{
					set136=input.LT(1);
					set136=input.LT(1);
					if ( input.LA(1)==Add||input.LA(1)==Subtract ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set136), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_mulExpr_in_addExpr1253);
					mulExpr137=mulExpr();
					state._fsp--;

					adaptor.addChild(root_0, mulExpr137.getTree());

					}
					break;

				default :
					break loop27;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "addExpr"


	public static class mulExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "mulExpr"
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:215:1: mulExpr : powExpr ( ( '*' | '/' | '%' ) ^ powExpr )* ;
	public final DataCentricDSLParser.mulExpr_return mulExpr() throws RecognitionException {
		DataCentricDSLParser.mulExpr_return retval = new DataCentricDSLParser.mulExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set139=null;
		ParserRuleReturnScope powExpr138 =null;
		ParserRuleReturnScope powExpr140 =null;

		Object set139_tree=null;

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:216:3: ( powExpr ( ( '*' | '/' | '%' ) ^ powExpr )* )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:216:6: powExpr ( ( '*' | '/' | '%' ) ^ powExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_powExpr_in_mulExpr1269);
			powExpr138=powExpr();
			state._fsp--;

			adaptor.addChild(root_0, powExpr138.getTree());

			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:216:14: ( ( '*' | '/' | '%' ) ^ powExpr )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==Divide||(LA28_0 >= Modulus && LA28_0 <= Multiply)) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:216:15: ( '*' | '/' | '%' ) ^ powExpr
					{
					set139=input.LT(1);
					set139=input.LT(1);
					if ( input.LA(1)==Divide||(input.LA(1) >= Modulus && input.LA(1) <= Multiply) ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set139), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_powExpr_in_mulExpr1285);
					powExpr140=powExpr();
					state._fsp--;

					adaptor.addChild(root_0, powExpr140.getTree());

					}
					break;

				default :
					break loop28;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "mulExpr"


	public static class powExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "powExpr"
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:219:1: powExpr : unaryExpr ( '^' ^ unaryExpr )* ;
	public final DataCentricDSLParser.powExpr_return powExpr() throws RecognitionException {
		DataCentricDSLParser.powExpr_return retval = new DataCentricDSLParser.powExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal142=null;
		ParserRuleReturnScope unaryExpr141 =null;
		ParserRuleReturnScope unaryExpr143 =null;

		Object char_literal142_tree=null;

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:220:3: ( unaryExpr ( '^' ^ unaryExpr )* )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:220:6: unaryExpr ( '^' ^ unaryExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_unaryExpr_in_powExpr1301);
			unaryExpr141=unaryExpr();
			state._fsp--;

			adaptor.addChild(root_0, unaryExpr141.getTree());

			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:220:16: ( '^' ^ unaryExpr )*
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==Pow) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:220:17: '^' ^ unaryExpr
					{
					char_literal142=(Token)match(input,Pow,FOLLOW_Pow_in_powExpr1304); 
					char_literal142_tree = (Object)adaptor.create(char_literal142);
					root_0 = (Object)adaptor.becomeRoot(char_literal142_tree, root_0);

					pushFollow(FOLLOW_unaryExpr_in_powExpr1307);
					unaryExpr143=unaryExpr();
					state._fsp--;

					adaptor.addChild(root_0, unaryExpr143.getTree());

					}
					break;

				default :
					break loop29;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "powExpr"


	public static class unaryExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "unaryExpr"
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:223:1: unaryExpr : ( '-' atom -> ^( UNARY_MIN atom ) | '!' atom -> ^( NEGATE atom ) | atom );
	public final DataCentricDSLParser.unaryExpr_return unaryExpr() throws RecognitionException {
		DataCentricDSLParser.unaryExpr_return retval = new DataCentricDSLParser.unaryExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal144=null;
		Token char_literal146=null;
		ParserRuleReturnScope atom145 =null;
		ParserRuleReturnScope atom147 =null;
		ParserRuleReturnScope atom148 =null;

		Object char_literal144_tree=null;
		Object char_literal146_tree=null;
		RewriteRuleTokenStream stream_Subtract=new RewriteRuleTokenStream(adaptor,"token Subtract");
		RewriteRuleTokenStream stream_Excl=new RewriteRuleTokenStream(adaptor,"token Excl");
		RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:224:3: ( '-' atom -> ^( UNARY_MIN atom ) | '!' atom -> ^( NEGATE atom ) | atom )
			int alt30=3;
			switch ( input.LA(1) ) {
			case Subtract:
				{
				alt30=1;
				}
				break;
			case Excl:
				{
				alt30=2;
				}
				break;
			case Bool:
			case Identifier:
			case Null:
			case Number:
			case OBracket:
			case OParen:
			case String:
				{
				alt30=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}
			switch (alt30) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:224:6: '-' atom
					{
					char_literal144=(Token)match(input,Subtract,FOLLOW_Subtract_in_unaryExpr1325);  
					stream_Subtract.add(char_literal144);

					pushFollow(FOLLOW_atom_in_unaryExpr1327);
					atom145=atom();
					state._fsp--;

					stream_atom.add(atom145.getTree());
					// AST REWRITE
					// elements: atom
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 224:15: -> ^( UNARY_MIN atom )
					{
						// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:224:18: ^( UNARY_MIN atom )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(UNARY_MIN, "UNARY_MIN"), root_1);
						adaptor.addChild(root_1, stream_atom.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:225:6: '!' atom
					{
					char_literal146=(Token)match(input,Excl,FOLLOW_Excl_in_unaryExpr1342);  
					stream_Excl.add(char_literal146);

					pushFollow(FOLLOW_atom_in_unaryExpr1344);
					atom147=atom();
					state._fsp--;

					stream_atom.add(atom147.getTree());
					// AST REWRITE
					// elements: atom
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 225:15: -> ^( NEGATE atom )
					{
						// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:225:18: ^( NEGATE atom )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NEGATE, "NEGATE"), root_1);
						adaptor.addChild(root_1, stream_atom.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:226:6: atom
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_atom_in_unaryExpr1359);
					atom148=atom();
					state._fsp--;

					adaptor.addChild(root_0, atom148.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unaryExpr"


	public static class atom_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "atom"
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:229:1: atom : ( Number | Bool | Null | lookup );
	public final DataCentricDSLParser.atom_return atom() throws RecognitionException {
		DataCentricDSLParser.atom_return retval = new DataCentricDSLParser.atom_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Number149=null;
		Token Bool150=null;
		Token Null151=null;
		ParserRuleReturnScope lookup152 =null;

		Object Number149_tree=null;
		Object Bool150_tree=null;
		Object Null151_tree=null;

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:230:3: ( Number | Bool | Null | lookup )
			int alt31=4;
			switch ( input.LA(1) ) {
			case Number:
				{
				alt31=1;
				}
				break;
			case Bool:
				{
				alt31=2;
				}
				break;
			case Null:
				{
				alt31=3;
				}
				break;
			case Identifier:
			case OBracket:
			case OParen:
			case String:
				{
				alt31=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}
			switch (alt31) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:230:6: Number
					{
					root_0 = (Object)adaptor.nil();


					Number149=(Token)match(input,Number,FOLLOW_Number_in_atom1373); 
					Number149_tree = (Object)adaptor.create(Number149);
					adaptor.addChild(root_0, Number149_tree);

					}
					break;
				case 2 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:231:6: Bool
					{
					root_0 = (Object)adaptor.nil();


					Bool150=(Token)match(input,Bool,FOLLOW_Bool_in_atom1380); 
					Bool150_tree = (Object)adaptor.create(Bool150);
					adaptor.addChild(root_0, Bool150_tree);

					}
					break;
				case 3 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:232:6: Null
					{
					root_0 = (Object)adaptor.nil();


					Null151=(Token)match(input,Null,FOLLOW_Null_in_atom1387); 
					Null151_tree = (Object)adaptor.create(Null151);
					adaptor.addChild(root_0, Null151_tree);

					}
					break;
				case 4 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:233:6: lookup
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_lookup_in_atom1394);
					lookup152=lookup();
					state._fsp--;

					adaptor.addChild(root_0, lookup152.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "atom"


	public static class list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "list"
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:236:1: list : '[' ( exprList )? ']' -> ^( LIST ( exprList )? ) ;
	public final DataCentricDSLParser.list_return list() throws RecognitionException {
		DataCentricDSLParser.list_return retval = new DataCentricDSLParser.list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal153=null;
		Token char_literal155=null;
		ParserRuleReturnScope exprList154 =null;

		Object char_literal153_tree=null;
		Object char_literal155_tree=null;
		RewriteRuleTokenStream stream_CBracket=new RewriteRuleTokenStream(adaptor,"token CBracket");
		RewriteRuleTokenStream stream_OBracket=new RewriteRuleTokenStream(adaptor,"token OBracket");
		RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:237:3: ( '[' ( exprList )? ']' -> ^( LIST ( exprList )? ) )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:237:6: '[' ( exprList )? ']'
			{
			char_literal153=(Token)match(input,OBracket,FOLLOW_OBracket_in_list1408);  
			stream_OBracket.add(char_literal153);

			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:237:10: ( exprList )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==Bool||LA32_0==Excl||LA32_0==Identifier||(LA32_0 >= Null && LA32_0 <= Number)||(LA32_0 >= OBracket && LA32_0 <= OParen)||(LA32_0 >= String && LA32_0 <= Subtract)||LA32_0==76) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:237:10: exprList
					{
					pushFollow(FOLLOW_exprList_in_list1410);
					exprList154=exprList();
					state._fsp--;

					stream_exprList.add(exprList154.getTree());
					}
					break;

			}

			char_literal155=(Token)match(input,CBracket,FOLLOW_CBracket_in_list1413);  
			stream_CBracket.add(char_literal155);

			// AST REWRITE
			// elements: exprList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 237:24: -> ^( LIST ( exprList )? )
			{
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:237:27: ^( LIST ( exprList )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:237:34: ( exprList )?
				if ( stream_exprList.hasNext() ) {
					adaptor.addChild(root_1, stream_exprList.nextTree());
				}
				stream_exprList.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "list"


	public static class lookup_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "lookup"
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:240:1: lookup : ( list ( indexes )? -> ^( LOOKUP list ( indexes )? ) | Identifier ( indexes )? -> ^( LOOKUP Identifier ( indexes )? ) | String ( indexes )? -> ^( LOOKUP String ( indexes )? ) | '(' expression ')' ( indexes )? -> ^( LOOKUP expression ( indexes )? ) );
	public final DataCentricDSLParser.lookup_return lookup() throws RecognitionException {
		DataCentricDSLParser.lookup_return retval = new DataCentricDSLParser.lookup_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier158=null;
		Token String160=null;
		Token char_literal162=null;
		Token char_literal164=null;
		ParserRuleReturnScope list156 =null;
		ParserRuleReturnScope indexes157 =null;
		ParserRuleReturnScope indexes159 =null;
		ParserRuleReturnScope indexes161 =null;
		ParserRuleReturnScope expression163 =null;
		ParserRuleReturnScope indexes165 =null;

		Object Identifier158_tree=null;
		Object String160_tree=null;
		Object char_literal162_tree=null;
		Object char_literal164_tree=null;
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_String=new RewriteRuleTokenStream(adaptor,"token String");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_indexes=new RewriteRuleSubtreeStream(adaptor,"rule indexes");
		RewriteRuleSubtreeStream stream_list=new RewriteRuleSubtreeStream(adaptor,"rule list");

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:242:3: ( list ( indexes )? -> ^( LOOKUP list ( indexes )? ) | Identifier ( indexes )? -> ^( LOOKUP Identifier ( indexes )? ) | String ( indexes )? -> ^( LOOKUP String ( indexes )? ) | '(' expression ')' ( indexes )? -> ^( LOOKUP expression ( indexes )? ) )
			int alt37=4;
			switch ( input.LA(1) ) {
			case OBracket:
				{
				alt37=1;
				}
				break;
			case Identifier:
				{
				alt37=2;
				}
				break;
			case String:
				{
				alt37=3;
				}
				break;
			case OParen:
				{
				alt37=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 37, 0, input);
				throw nvae;
			}
			switch (alt37) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:242:6: list ( indexes )?
					{
					pushFollow(FOLLOW_list_in_lookup1437);
					list156=list();
					state._fsp--;

					stream_list.add(list156.getTree());
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:242:11: ( indexes )?
					int alt33=2;
					int LA33_0 = input.LA(1);
					if ( (LA33_0==OBracket) ) {
						alt33=1;
					}
					switch (alt33) {
						case 1 :
							// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:242:11: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1439);
							indexes157=indexes();
							state._fsp--;

							stream_indexes.add(indexes157.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: indexes, list
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 242:34: -> ^( LOOKUP list ( indexes )? )
					{
						// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:242:37: ^( LOOKUP list ( indexes )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
						adaptor.addChild(root_1, stream_list.nextTree());
						// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:242:51: ( indexes )?
						if ( stream_indexes.hasNext() ) {
							adaptor.addChild(root_1, stream_indexes.nextTree());
						}
						stream_indexes.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:243:6: Identifier ( indexes )?
					{
					Identifier158=(Token)match(input,Identifier,FOLLOW_Identifier_in_lookup1472);  
					stream_Identifier.add(Identifier158);

					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:243:17: ( indexes )?
					int alt34=2;
					int LA34_0 = input.LA(1);
					if ( (LA34_0==OBracket) ) {
						alt34=1;
					}
					switch (alt34) {
						case 1 :
							// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:243:17: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1474);
							indexes159=indexes();
							state._fsp--;

							stream_indexes.add(indexes159.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: Identifier, indexes
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 243:34: -> ^( LOOKUP Identifier ( indexes )? )
					{
						// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:243:37: ^( LOOKUP Identifier ( indexes )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
						adaptor.addChild(root_1, stream_Identifier.nextNode());
						// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:243:57: ( indexes )?
						if ( stream_indexes.hasNext() ) {
							adaptor.addChild(root_1, stream_indexes.nextTree());
						}
						stream_indexes.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:244:6: String ( indexes )?
					{
					String160=(Token)match(input,String,FOLLOW_String_in_lookup1501);  
					stream_String.add(String160);

					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:244:13: ( indexes )?
					int alt35=2;
					int LA35_0 = input.LA(1);
					if ( (LA35_0==OBracket) ) {
						alt35=1;
					}
					switch (alt35) {
						case 1 :
							// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:244:13: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1503);
							indexes161=indexes();
							state._fsp--;

							stream_indexes.add(indexes161.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: String, indexes
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 244:34: -> ^( LOOKUP String ( indexes )? )
					{
						// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:244:37: ^( LOOKUP String ( indexes )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
						adaptor.addChild(root_1, stream_String.nextNode());
						// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:244:53: ( indexes )?
						if ( stream_indexes.hasNext() ) {
							adaptor.addChild(root_1, stream_indexes.nextTree());
						}
						stream_indexes.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:245:6: '(' expression ')' ( indexes )?
					{
					char_literal162=(Token)match(input,OParen,FOLLOW_OParen_in_lookup1534);  
					stream_OParen.add(char_literal162);

					pushFollow(FOLLOW_expression_in_lookup1536);
					expression163=expression();
					state._fsp--;

					stream_expression.add(expression163.getTree());
					char_literal164=(Token)match(input,CParen,FOLLOW_CParen_in_lookup1538);  
					stream_CParen.add(char_literal164);

					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:245:25: ( indexes )?
					int alt36=2;
					int LA36_0 = input.LA(1);
					if ( (LA36_0==OBracket) ) {
						alt36=1;
					}
					switch (alt36) {
						case 1 :
							// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:245:25: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1540);
							indexes165=indexes();
							state._fsp--;

							stream_indexes.add(indexes165.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: expression, indexes
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 245:34: -> ^( LOOKUP expression ( indexes )? )
					{
						// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:245:37: ^( LOOKUP expression ( indexes )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
						adaptor.addChild(root_1, stream_expression.nextTree());
						// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:245:57: ( indexes )?
						if ( stream_indexes.hasNext() ) {
							adaptor.addChild(root_1, stream_indexes.nextTree());
						}
						stream_indexes.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lookup"


	public static class indexes_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "indexes"
	// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:248:1: indexes : ( '[' expression ']' )+ -> ^( INDEXES ( expression )+ ) ;
	public final DataCentricDSLParser.indexes_return indexes() throws RecognitionException {
		DataCentricDSLParser.indexes_return retval = new DataCentricDSLParser.indexes_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal166=null;
		Token char_literal168=null;
		ParserRuleReturnScope expression167 =null;

		Object char_literal166_tree=null;
		Object char_literal168_tree=null;
		RewriteRuleTokenStream stream_CBracket=new RewriteRuleTokenStream(adaptor,"token CBracket");
		RewriteRuleTokenStream stream_OBracket=new RewriteRuleTokenStream(adaptor,"token OBracket");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:249:3: ( ( '[' expression ']' )+ -> ^( INDEXES ( expression )+ ) )
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:249:6: ( '[' expression ']' )+
			{
			// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:249:6: ( '[' expression ']' )+
			int cnt38=0;
			loop38:
			while (true) {
				int alt38=2;
				int LA38_0 = input.LA(1);
				if ( (LA38_0==OBracket) ) {
					alt38=1;
				}

				switch (alt38) {
				case 1 :
					// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:249:7: '[' expression ']'
					{
					char_literal166=(Token)match(input,OBracket,FOLLOW_OBracket_in_indexes1567);  
					stream_OBracket.add(char_literal166);

					pushFollow(FOLLOW_expression_in_indexes1569);
					expression167=expression();
					state._fsp--;

					stream_expression.add(expression167.getTree());
					char_literal168=(Token)match(input,CBracket,FOLLOW_CBracket_in_indexes1571);  
					stream_CBracket.add(char_literal168);

					}
					break;

				default :
					if ( cnt38 >= 1 ) break loop38;
					EarlyExitException eee = new EarlyExitException(38, input);
					throw eee;
				}
				cnt38++;
			}

			// AST REWRITE
			// elements: expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 249:28: -> ^( INDEXES ( expression )+ )
			{
				// D:\\Language-GIT\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:249:31: ^( INDEXES ( expression )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INDEXES, "INDEXES"), root_1);
				if ( !(stream_expression.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_expression.nextTree());
				}
				stream_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "indexes"

	// Delegated rules



	public static final BitSet FOLLOW_functionDecl_in_program160 = new BitSet(new long[]{0x4C00003040000080L,0x0000000000001D02L});
	public static final BitSet FOLLOW_block_in_program164 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_block184 = new BitSet(new long[]{0x4C00003040000082L,0x0000000000001902L});
	public static final BitSet FOLLOW_Return_in_block188 = new BitSet(new long[]{0x0036001008000400L,0x0000000000001018L});
	public static final BitSet FOLLOW_expression_in_block190 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_SColon_in_block192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_statement234 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_SColon_in_statement236 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incrementation_in_statement249 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_SColon_in_statement251 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_statement262 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_SColon_in_statement264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_statement275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forStatement_in_statement282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStatement_in_statement289 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_query_in_statement296 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_SColon_in_statement298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_println_in_statement309 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_SColon_in_statement311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_in_statement322 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_SColon_in_statement324 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_76_in_query341 = new BitSet(new long[]{0x0036001008000480L,0x000000000000101AL});
	public static final BitSet FOLLOW_expression_in_query345 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_query349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_variableCall360 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_assignment372 = new BitSet(new long[]{0x0010000000000100L});
	public static final BitSet FOLLOW_indexes_in_assignment374 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Assign_in_assignment377 = new BitSet(new long[]{0x0036001008000480L,0x000000000000101AL});
	public static final BitSet FOLLOW_expression_in_assignment380 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_assignment400 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_75_in_assignment421 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_Identifier_in_assignment423 = new BitSet(new long[]{0x0010000000000100L});
	public static final BitSet FOLLOW_indexes_in_assignment425 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Assign_in_assignment428 = new BitSet(new long[]{0x0036001008000480L,0x000000000000101AL});
	public static final BitSet FOLLOW_expression_in_assignment431 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_assignment453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_functionCall483 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall485 = new BitSet(new long[]{0x0036001008002400L,0x0000000000001018L});
	public static final BitSet FOLLOW_exprList_in_functionCall487 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CParen_in_functionCall490 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Assert_in_functionCall510 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall512 = new BitSet(new long[]{0x0036001008000400L,0x0000000000001018L});
	public static final BitSet FOLLOW_expression_in_functionCall514 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CParen_in_functionCall516 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Size_in_functionCall536 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall538 = new BitSet(new long[]{0x0036001008000400L,0x0000000000001018L});
	public static final BitSet FOLLOW_expression_in_functionCall540 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CParen_in_functionCall542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Println_in_println570 = new BitSet(new long[]{0x0036001008000480L,0x000000000000101AL});
	public static final BitSet FOLLOW_expression_in_println573 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_println587 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Print_in_print612 = new BitSet(new long[]{0x0036001008000480L,0x000000000000101AL});
	public static final BitSet FOLLOW_expression_in_print615 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_print629 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStat_in_ifStatement653 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_elseIfStat_in_ifStatement655 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_elseStat_in_ifStatement658 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_If_in_ifStat687 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_OParen_in_ifStat689 = new BitSet(new long[]{0x0036001008000400L,0x0000000000001018L});
	public static final BitSet FOLLOW_expression_in_ifStat691 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CParen_in_ifStat693 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_OBrace_in_ifStat695 = new BitSet(new long[]{0x4C00003040000880L,0x0000000000001902L});
	public static final BitSet FOLLOW_block_in_ifStat697 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CBrace_in_ifStat699 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Else_in_elseIfStat723 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_If_in_elseIfStat725 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_OParen_in_elseIfStat727 = new BitSet(new long[]{0x0036001008000400L,0x0000000000001018L});
	public static final BitSet FOLLOW_expression_in_elseIfStat729 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CParen_in_elseIfStat731 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_OBrace_in_elseIfStat733 = new BitSet(new long[]{0x4C00003040000880L,0x0000000000001902L});
	public static final BitSet FOLLOW_block_in_elseIfStat735 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CBrace_in_elseIfStat737 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Else_in_elseStat761 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_OBrace_in_elseStat763 = new BitSet(new long[]{0x4C00003040000880L,0x0000000000001902L});
	public static final BitSet FOLLOW_block_in_elseStat765 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CBrace_in_elseStat767 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_74_in_functionDecl789 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_Identifier_in_functionDecl791 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_OParen_in_functionDecl793 = new BitSet(new long[]{0x0000001000002000L});
	public static final BitSet FOLLOW_idList_in_functionDecl795 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CParen_in_functionDecl798 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_OBrace_in_functionDecl800 = new BitSet(new long[]{0x4C00003040000880L,0x0000000000001902L});
	public static final BitSet FOLLOW_block_in_functionDecl802 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CBrace_in_functionDecl804 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_For_in_forStatement826 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_OParen_in_forStatement828 = new BitSet(new long[]{0x0000001000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_assignment_in_forStatement830 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_SColon_in_forStatement832 = new BitSet(new long[]{0x0036001008000400L,0x0000000000001018L});
	public static final BitSet FOLLOW_expression_in_forStatement834 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_SColon_in_forStatement836 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_afterthought_in_forStatement838 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CParen_in_forStatement840 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_OBrace_in_forStatement842 = new BitSet(new long[]{0x4C00003040000880L,0x0000000000001902L});
	public static final BitSet FOLLOW_block_in_forStatement844 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CBrace_in_forStatement846 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_afterthought878 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Assign_in_afterthought880 = new BitSet(new long[]{0x0036001008000400L,0x0000000000001018L});
	public static final BitSet FOLLOW_expression_in_afterthought882 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incrementation_in_afterthought887 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_While_in_whileStatement899 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_OParen_in_whileStatement901 = new BitSet(new long[]{0x0036001008000400L,0x0000000000001018L});
	public static final BitSet FOLLOW_expression_in_whileStatement903 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CParen_in_whileStatement905 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_OBrace_in_whileStatement907 = new BitSet(new long[]{0x4C00003040000880L,0x0000000000001902L});
	public static final BitSet FOLLOW_block_in_whileStatement909 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CBrace_in_whileStatement911 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_idList935 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_Comma_in_idList938 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_Identifier_in_idList940 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_expression_in_exprList965 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_Comma_in_exprList968 = new BitSet(new long[]{0x0036001008000400L,0x0000000000001018L});
	public static final BitSet FOLLOW_expression_in_exprList970 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_condExpr_in_expression995 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_query_in_expression999 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableCall_in_incrementation1012 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_set_in_incrementation1014 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_orExpr_in_condExpr1031 = new BitSet(new long[]{0x1000004000000002L});
	public static final BitSet FOLLOW_QMark_in_condExpr1046 = new BitSet(new long[]{0x0036001008000400L,0x0000000000001018L});
	public static final BitSet FOLLOW_expression_in_condExpr1050 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_Colon_in_condExpr1052 = new BitSet(new long[]{0x0036001008000400L,0x0000000000001018L});
	public static final BitSet FOLLOW_expression_in_condExpr1056 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_In_in_condExpr1079 = new BitSet(new long[]{0x0036001008000400L,0x0000000000001018L});
	public static final BitSet FOLLOW_expression_in_condExpr1081 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_andExpr_in_orExpr1133 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_Or_in_orExpr1136 = new BitSet(new long[]{0x0036001008000400L,0x0000000000000018L});
	public static final BitSet FOLLOW_andExpr_in_orExpr1139 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_equExpr_in_andExpr1155 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_And_in_andExpr1158 = new BitSet(new long[]{0x0036001008000400L,0x0000000000000018L});
	public static final BitSet FOLLOW_equExpr_in_andExpr1161 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_relExpr_in_equExpr1177 = new BitSet(new long[]{0x0001000002000002L});
	public static final BitSet FOLLOW_set_in_equExpr1180 = new BitSet(new long[]{0x0036001008000400L,0x0000000000000018L});
	public static final BitSet FOLLOW_relExpr_in_equExpr1189 = new BitSet(new long[]{0x0001000002000002L});
	public static final BitSet FOLLOW_addExpr_in_relExpr1205 = new BitSet(new long[]{0x0000180180000002L});
	public static final BitSet FOLLOW_set_in_relExpr1208 = new BitSet(new long[]{0x0036001008000400L,0x0000000000000018L});
	public static final BitSet FOLLOW_addExpr_in_relExpr1225 = new BitSet(new long[]{0x0000180180000002L});
	public static final BitSet FOLLOW_mulExpr_in_addExpr1241 = new BitSet(new long[]{0x0000000000000022L,0x0000000000000010L});
	public static final BitSet FOLLOW_set_in_addExpr1244 = new BitSet(new long[]{0x0036001008000400L,0x0000000000000018L});
	public static final BitSet FOLLOW_mulExpr_in_addExpr1253 = new BitSet(new long[]{0x0000000000000022L,0x0000000000000010L});
	public static final BitSet FOLLOW_powExpr_in_mulExpr1269 = new BitSet(new long[]{0x0000600000080002L});
	public static final BitSet FOLLOW_set_in_mulExpr1272 = new BitSet(new long[]{0x0036001008000400L,0x0000000000000018L});
	public static final BitSet FOLLOW_powExpr_in_mulExpr1285 = new BitSet(new long[]{0x0000600000080002L});
	public static final BitSet FOLLOW_unaryExpr_in_powExpr1301 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_Pow_in_powExpr1304 = new BitSet(new long[]{0x0036001008000400L,0x0000000000000018L});
	public static final BitSet FOLLOW_unaryExpr_in_powExpr1307 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_Subtract_in_unaryExpr1325 = new BitSet(new long[]{0x0036001000000400L,0x0000000000000008L});
	public static final BitSet FOLLOW_atom_in_unaryExpr1327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Excl_in_unaryExpr1342 = new BitSet(new long[]{0x0036001000000400L,0x0000000000000008L});
	public static final BitSet FOLLOW_atom_in_unaryExpr1344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_unaryExpr1359 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Number_in_atom1373 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Bool_in_atom1380 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Null_in_atom1387 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lookup_in_atom1394 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OBracket_in_list1408 = new BitSet(new long[]{0x0036001008001400L,0x0000000000001018L});
	public static final BitSet FOLLOW_exprList_in_list1410 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CBracket_in_list1413 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_list_in_lookup1437 = new BitSet(new long[]{0x0010000000000002L});
	public static final BitSet FOLLOW_indexes_in_lookup1439 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_lookup1472 = new BitSet(new long[]{0x0010000000000002L});
	public static final BitSet FOLLOW_indexes_in_lookup1474 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_String_in_lookup1501 = new BitSet(new long[]{0x0010000000000002L});
	public static final BitSet FOLLOW_indexes_in_lookup1503 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OParen_in_lookup1534 = new BitSet(new long[]{0x0036001008000400L,0x0000000000001018L});
	public static final BitSet FOLLOW_expression_in_lookup1536 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CParen_in_lookup1538 = new BitSet(new long[]{0x0010000000000002L});
	public static final BitSet FOLLOW_indexes_in_lookup1540 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OBracket_in_indexes1567 = new BitSet(new long[]{0x0036001008000400L,0x0000000000001018L});
	public static final BitSet FOLLOW_expression_in_indexes1569 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CBracket_in_indexes1571 = new BitSet(new long[]{0x0010000000000002L});
}
