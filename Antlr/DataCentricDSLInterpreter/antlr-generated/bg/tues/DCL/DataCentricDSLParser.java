// $ANTLR 3.5.2 D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g 2015-01-17 21:04:08

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
	@Override public String getGrammarFileName() { return "D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g"; }


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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:80:1: program : block EOF -> block ;
	public final DataCentricDSLParser.program_return program() throws RecognitionException {
		DataCentricDSLParser.program_return retval = new DataCentricDSLParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope block1 =null;

		Object EOF2_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:81:3: ( block EOF -> block )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:81:6: block EOF
			{
			pushFollow(FOLLOW_block_in_program149);
			block1=block();
			state._fsp--;

			stream_block.add(block1.getTree());
			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_program151);  
			stream_EOF.add(EOF2);

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
			// 81:16: -> block
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:84:1: block : ( statement | functionDecl )* ( Return expression ';' )? -> ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) ;
	public final DataCentricDSLParser.block_return block() throws RecognitionException {
		DataCentricDSLParser.block_return retval = new DataCentricDSLParser.block_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Return5=null;
		Token char_literal7=null;
		ParserRuleReturnScope statement3 =null;
		ParserRuleReturnScope functionDecl4 =null;
		ParserRuleReturnScope expression6 =null;

		Object Return5_tree=null;
		Object char_literal7_tree=null;
		RewriteRuleTokenStream stream_Return=new RewriteRuleTokenStream(adaptor,"token Return");
		RewriteRuleTokenStream stream_SColon=new RewriteRuleTokenStream(adaptor,"token SColon");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_functionDecl=new RewriteRuleSubtreeStream(adaptor,"rule functionDecl");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:85:3: ( ( statement | functionDecl )* ( Return expression ';' )? -> ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:85:6: ( statement | functionDecl )* ( Return expression ';' )?
			{
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:85:6: ( statement | functionDecl )*
			loop1:
			while (true) {
				int alt1=3;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==Assert||LA1_0==For||(LA1_0 >= Identifier && LA1_0 <= If)||(LA1_0 >= Print && LA1_0 <= Println)||LA1_0==Size||LA1_0==While||(LA1_0 >= 72 && LA1_0 <= 73)) ) {
					alt1=1;
				}
				else if ( (LA1_0==71) ) {
					alt1=2;
				}

				switch (alt1) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:85:7: statement
					{
					pushFollow(FOLLOW_statement_in_block170);
					statement3=statement();
					state._fsp--;

					stream_statement.add(statement3.getTree());
					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:85:19: functionDecl
					{
					pushFollow(FOLLOW_functionDecl_in_block174);
					functionDecl4=functionDecl();
					state._fsp--;

					stream_functionDecl.add(functionDecl4.getTree());
					}
					break;

				default :
					break loop1;
				}
			}

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:85:34: ( Return expression ';' )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==Return) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:85:35: Return expression ';'
					{
					Return5=(Token)match(input,Return,FOLLOW_Return_in_block179);  
					stream_Return.add(Return5);

					pushFollow(FOLLOW_expression_in_block181);
					expression6=expression();
					state._fsp--;

					stream_expression.add(expression6.getTree());
					char_literal7=(Token)match(input,SColon,FOLLOW_SColon_in_block183);  
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
			// 86:6: -> ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) )
			{
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:86:9: ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:86:17: ^( STATEMENTS ( statement )* )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(STATEMENTS, "STATEMENTS"), root_2);
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:86:30: ( statement )*
				while ( stream_statement.hasNext() ) {
					adaptor.addChild(root_2, stream_statement.nextTree());
				}
				stream_statement.reset();

				adaptor.addChild(root_1, root_2);
				}

				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:86:42: ^( RETURN ( expression )? )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(RETURN, "RETURN"), root_2);
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:86:51: ( expression )?
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:89:1: statement : ( assignment ';' -> assignment | incrementation ';' -> incrementation | functionCall ';' -> functionCall | ifStatement | forStatement | whileStatement | query ';' -> query );
	public final DataCentricDSLParser.statement_return statement() throws RecognitionException {
		DataCentricDSLParser.statement_return retval = new DataCentricDSLParser.statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal9=null;
		Token char_literal11=null;
		Token char_literal13=null;
		Token char_literal18=null;
		ParserRuleReturnScope assignment8 =null;
		ParserRuleReturnScope incrementation10 =null;
		ParserRuleReturnScope functionCall12 =null;
		ParserRuleReturnScope ifStatement14 =null;
		ParserRuleReturnScope forStatement15 =null;
		ParserRuleReturnScope whileStatement16 =null;
		ParserRuleReturnScope query17 =null;

		Object char_literal9_tree=null;
		Object char_literal11_tree=null;
		Object char_literal13_tree=null;
		Object char_literal18_tree=null;
		RewriteRuleTokenStream stream_SColon=new RewriteRuleTokenStream(adaptor,"token SColon");
		RewriteRuleSubtreeStream stream_functionCall=new RewriteRuleSubtreeStream(adaptor,"rule functionCall");
		RewriteRuleSubtreeStream stream_assignment=new RewriteRuleSubtreeStream(adaptor,"rule assignment");
		RewriteRuleSubtreeStream stream_query=new RewriteRuleSubtreeStream(adaptor,"rule query");
		RewriteRuleSubtreeStream stream_incrementation=new RewriteRuleSubtreeStream(adaptor,"rule incrementation");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:90:3: ( assignment ';' -> assignment | incrementation ';' -> incrementation | functionCall ';' -> functionCall | ifStatement | forStatement | whileStatement | query ';' -> query )
			int alt3=7;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				switch ( input.LA(2) ) {
				case OParen:
					{
					alt3=3;
					}
					break;
				case Assign:
				case OBracket:
					{
					alt3=1;
					}
					break;
				case Increment:
				case 70:
					{
					alt3=2;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 72:
				{
				alt3=1;
				}
				break;
			case Assert:
			case Print:
			case Println:
			case Size:
				{
				alt3=3;
				}
				break;
			case If:
				{
				alt3=4;
				}
				break;
			case For:
				{
				alt3=5;
				}
				break;
			case While:
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:90:6: assignment ';'
					{
					pushFollow(FOLLOW_assignment_in_statement225);
					assignment8=assignment();
					state._fsp--;

					stream_assignment.add(assignment8.getTree());
					char_literal9=(Token)match(input,SColon,FOLLOW_SColon_in_statement227);  
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
					// 90:23: -> assignment
					{
						adaptor.addChild(root_0, stream_assignment.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:91:6: incrementation ';'
					{
					pushFollow(FOLLOW_incrementation_in_statement240);
					incrementation10=incrementation();
					state._fsp--;

					stream_incrementation.add(incrementation10.getTree());
					char_literal11=(Token)match(input,SColon,FOLLOW_SColon_in_statement242);  
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
					// 91:25: -> incrementation
					{
						adaptor.addChild(root_0, stream_incrementation.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:92:6: functionCall ';'
					{
					pushFollow(FOLLOW_functionCall_in_statement253);
					functionCall12=functionCall();
					state._fsp--;

					stream_functionCall.add(functionCall12.getTree());
					char_literal13=(Token)match(input,SColon,FOLLOW_SColon_in_statement255);  
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
					// 92:23: -> functionCall
					{
						adaptor.addChild(root_0, stream_functionCall.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:93:6: ifStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_ifStatement_in_statement266);
					ifStatement14=ifStatement();
					state._fsp--;

					adaptor.addChild(root_0, ifStatement14.getTree());

					}
					break;
				case 5 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:94:6: forStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_forStatement_in_statement273);
					forStatement15=forStatement();
					state._fsp--;

					adaptor.addChild(root_0, forStatement15.getTree());

					}
					break;
				case 6 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:95:6: whileStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_whileStatement_in_statement280);
					whileStatement16=whileStatement();
					state._fsp--;

					adaptor.addChild(root_0, whileStatement16.getTree());

					}
					break;
				case 7 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:96:6: query ';'
					{
					pushFollow(FOLLOW_query_in_statement287);
					query17=query();
					state._fsp--;

					stream_query.add(query17.getTree());
					char_literal18=(Token)match(input,SColon,FOLLOW_SColon_in_statement289);  
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
					// 96:16: -> query
					{
						adaptor.addChild(root_0, stream_query.nextTree());
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:99:1: query : 'query' ^ ( expression ) ;
	public final DataCentricDSLParser.query_return query() throws RecognitionException {
		DataCentricDSLParser.query_return retval = new DataCentricDSLParser.query_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal19=null;
		ParserRuleReturnScope expression20 =null;

		Object string_literal19_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:99:6: ( 'query' ^ ( expression ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:100:3: 'query' ^ ( expression )
			{
			root_0 = (Object)adaptor.nil();


			string_literal19=(Token)match(input,73,FOLLOW_73_in_query306); 
			string_literal19_tree = (Object)adaptor.create(string_literal19);
			root_0 = (Object)adaptor.becomeRoot(string_literal19_tree, root_0);

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:100:12: ( expression )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:100:13: expression
			{
			pushFollow(FOLLOW_expression_in_query310);
			expression20=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression20.getTree());

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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:103:1: variableCall : Identifier ;
	public final DataCentricDSLParser.variableCall_return variableCall() throws RecognitionException {
		DataCentricDSLParser.variableCall_return retval = new DataCentricDSLParser.variableCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier21=null;

		Object Identifier21_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:103:13: ( Identifier )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:104:3: Identifier
			{
			root_0 = (Object)adaptor.nil();


			Identifier21=(Token)match(input,Identifier,FOLLOW_Identifier_in_variableCall321); 
			Identifier21_tree = (Object)adaptor.create(Identifier21);
			adaptor.addChild(root_0, Identifier21_tree);

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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:107:1: assignment : ( Identifier ( indexes )? '=' expression -> ^( ASSIGNMENT Identifier ( indexes )? expression ) | 'global' Identifier ( indexes )? '=' expression -> ^( 'global' ASSIGNMENT Identifier ( indexes )? expression ) );
	public final DataCentricDSLParser.assignment_return assignment() throws RecognitionException {
		DataCentricDSLParser.assignment_return retval = new DataCentricDSLParser.assignment_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier22=null;
		Token char_literal24=null;
		Token string_literal26=null;
		Token Identifier27=null;
		Token char_literal29=null;
		ParserRuleReturnScope indexes23 =null;
		ParserRuleReturnScope expression25 =null;
		ParserRuleReturnScope indexes28 =null;
		ParserRuleReturnScope expression30 =null;

		Object Identifier22_tree=null;
		Object char_literal24_tree=null;
		Object string_literal26_tree=null;
		Object Identifier27_tree=null;
		Object char_literal29_tree=null;
		RewriteRuleTokenStream stream_Assign=new RewriteRuleTokenStream(adaptor,"token Assign");
		RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_indexes=new RewriteRuleSubtreeStream(adaptor,"rule indexes");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:108:3: ( Identifier ( indexes )? '=' expression -> ^( ASSIGNMENT Identifier ( indexes )? expression ) | 'global' Identifier ( indexes )? '=' expression -> ^( 'global' ASSIGNMENT Identifier ( indexes )? expression ) )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==Identifier) ) {
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:108:6: Identifier ( indexes )? '=' expression
					{
					Identifier22=(Token)match(input,Identifier,FOLLOW_Identifier_in_assignment333);  
					stream_Identifier.add(Identifier22);

					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:108:17: ( indexes )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==OBracket) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:108:17: indexes
							{
							pushFollow(FOLLOW_indexes_in_assignment335);
							indexes23=indexes();
							state._fsp--;

							stream_indexes.add(indexes23.getTree());
							}
							break;

					}

					char_literal24=(Token)match(input,Assign,FOLLOW_Assign_in_assignment338);  
					stream_Assign.add(char_literal24);

					pushFollow(FOLLOW_expression_in_assignment340);
					expression25=expression();
					state._fsp--;

					stream_expression.add(expression25.getTree());
					// AST REWRITE
					// elements: indexes, Identifier, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 108:41: -> ^( ASSIGNMENT Identifier ( indexes )? expression )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:108:44: ^( ASSIGNMENT Identifier ( indexes )? expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ASSIGNMENT, "ASSIGNMENT"), root_1);
						adaptor.addChild(root_1, stream_Identifier.nextNode());
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:108:68: ( indexes )?
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:109:5: 'global' Identifier ( indexes )? '=' expression
					{
					string_literal26=(Token)match(input,72,FOLLOW_72_in_assignment359);  
					stream_72.add(string_literal26);

					Identifier27=(Token)match(input,Identifier,FOLLOW_Identifier_in_assignment361);  
					stream_Identifier.add(Identifier27);

					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:109:25: ( indexes )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==OBracket) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:109:25: indexes
							{
							pushFollow(FOLLOW_indexes_in_assignment363);
							indexes28=indexes();
							state._fsp--;

							stream_indexes.add(indexes28.getTree());
							}
							break;

					}

					char_literal29=(Token)match(input,Assign,FOLLOW_Assign_in_assignment366);  
					stream_Assign.add(char_literal29);

					pushFollow(FOLLOW_expression_in_assignment368);
					expression30=expression();
					state._fsp--;

					stream_expression.add(expression30.getTree());
					// AST REWRITE
					// elements: expression, indexes, Identifier, 72
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 109:49: -> ^( 'global' ASSIGNMENT Identifier ( indexes )? expression )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:109:52: ^( 'global' ASSIGNMENT Identifier ( indexes )? expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_72.nextNode(), root_1);
						adaptor.addChild(root_1, (Object)adaptor.create(ASSIGNMENT, "ASSIGNMENT"));
						adaptor.addChild(root_1, stream_Identifier.nextNode());
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:109:85: ( indexes )?
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:112:1: functionCall : ( Identifier '(' ( exprList )? ')' -> ^( FUNC_CALL Identifier ( exprList )? ) | Println expression -> ^( FUNC_CALL Println expression ) | Print expression -> ^( FUNC_CALL Print expression ) | Assert '(' expression ')' -> ^( FUNC_CALL Assert expression ) | Size '(' expression ')' -> ^( FUNC_CALL Size expression ) );
	public final DataCentricDSLParser.functionCall_return functionCall() throws RecognitionException {
		DataCentricDSLParser.functionCall_return retval = new DataCentricDSLParser.functionCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier31=null;
		Token char_literal32=null;
		Token char_literal34=null;
		Token Println35=null;
		Token Print37=null;
		Token Assert39=null;
		Token char_literal40=null;
		Token char_literal42=null;
		Token Size43=null;
		Token char_literal44=null;
		Token char_literal46=null;
		ParserRuleReturnScope exprList33 =null;
		ParserRuleReturnScope expression36 =null;
		ParserRuleReturnScope expression38 =null;
		ParserRuleReturnScope expression41 =null;
		ParserRuleReturnScope expression45 =null;

		Object Identifier31_tree=null;
		Object char_literal32_tree=null;
		Object char_literal34_tree=null;
		Object Println35_tree=null;
		Object Print37_tree=null;
		Object Assert39_tree=null;
		Object char_literal40_tree=null;
		Object char_literal42_tree=null;
		Object Size43_tree=null;
		Object char_literal44_tree=null;
		Object char_literal46_tree=null;
		RewriteRuleTokenStream stream_Println=new RewriteRuleTokenStream(adaptor,"token Println");
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_Assert=new RewriteRuleTokenStream(adaptor,"token Assert");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_Print=new RewriteRuleTokenStream(adaptor,"token Print");
		RewriteRuleTokenStream stream_Size=new RewriteRuleTokenStream(adaptor,"token Size");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:113:3: ( Identifier '(' ( exprList )? ')' -> ^( FUNC_CALL Identifier ( exprList )? ) | Println expression -> ^( FUNC_CALL Println expression ) | Print expression -> ^( FUNC_CALL Print expression ) | Assert '(' expression ')' -> ^( FUNC_CALL Assert expression ) | Size '(' expression ')' -> ^( FUNC_CALL Size expression ) )
			int alt8=5;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				alt8=1;
				}
				break;
			case Println:
				{
				alt8=2;
				}
				break;
			case Print:
				{
				alt8=3;
				}
				break;
			case Assert:
				{
				alt8=4;
				}
				break;
			case Size:
				{
				alt8=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:113:6: Identifier '(' ( exprList )? ')'
					{
					Identifier31=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionCall397);  
					stream_Identifier.add(Identifier31);

					char_literal32=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall399);  
					stream_OParen.add(char_literal32);

					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:113:21: ( exprList )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==Bool||LA7_0==Excl||LA7_0==Identifier||(LA7_0 >= Null && LA7_0 <= Number)||(LA7_0 >= OBracket && LA7_0 <= OParen)||(LA7_0 >= String && LA7_0 <= Subtract)||LA7_0==73) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:113:21: exprList
							{
							pushFollow(FOLLOW_exprList_in_functionCall401);
							exprList33=exprList();
							state._fsp--;

							stream_exprList.add(exprList33.getTree());
							}
							break;

					}

					char_literal34=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall404);  
					stream_CParen.add(char_literal34);

					// AST REWRITE
					// elements: exprList, Identifier
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 113:35: -> ^( FUNC_CALL Identifier ( exprList )? )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:113:38: ^( FUNC_CALL Identifier ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Identifier.nextNode());
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:113:61: ( exprList )?
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:114:6: Println expression
					{
					Println35=(Token)match(input,Println,FOLLOW_Println_in_functionCall422);  
					stream_Println.add(Println35);

					pushFollow(FOLLOW_expression_in_functionCall425);
					expression36=expression();
					state._fsp--;

					stream_expression.add(expression36.getTree());
					// AST REWRITE
					// elements: Println, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 114:29: -> ^( FUNC_CALL Println expression )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:114:32: ^( FUNC_CALL Println expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Println.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:115:6: Print expression
					{
					Print37=(Token)match(input,Print,FOLLOW_Print_in_functionCall445);  
					stream_Print.add(Print37);

					pushFollow(FOLLOW_expression_in_functionCall447);
					expression38=expression();
					state._fsp--;

					stream_expression.add(expression38.getTree());
					// AST REWRITE
					// elements: expression, Print
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 115:27: -> ^( FUNC_CALL Print expression )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:115:30: ^( FUNC_CALL Print expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Print.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:116:6: Assert '(' expression ')'
					{
					Assert39=(Token)match(input,Assert,FOLLOW_Assert_in_functionCall468);  
					stream_Assert.add(Assert39);

					char_literal40=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall470);  
					stream_OParen.add(char_literal40);

					pushFollow(FOLLOW_expression_in_functionCall472);
					expression41=expression();
					state._fsp--;

					stream_expression.add(expression41.getTree());
					char_literal42=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall474);  
					stream_CParen.add(char_literal42);

					// AST REWRITE
					// elements: expression, Assert
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 116:35: -> ^( FUNC_CALL Assert expression )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:116:38: ^( FUNC_CALL Assert expression )
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
				case 5 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:117:6: Size '(' expression ')'
					{
					Size43=(Token)match(input,Size,FOLLOW_Size_in_functionCall494);  
					stream_Size.add(Size43);

					char_literal44=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall496);  
					stream_OParen.add(char_literal44);

					pushFollow(FOLLOW_expression_in_functionCall498);
					expression45=expression();
					state._fsp--;

					stream_expression.add(expression45.getTree());
					char_literal46=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall500);  
					stream_CParen.add(char_literal46);

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
					// 117:35: -> ^( FUNC_CALL Size expression )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:117:38: ^( FUNC_CALL Size expression )
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


	public static class ifStatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ifStatement"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:120:1: ifStatement : ifStat ( elseIfStat )* ( elseStat )? -> ^( IF ifStat ( elseIfStat )* ( elseStat )? ) ;
	public final DataCentricDSLParser.ifStatement_return ifStatement() throws RecognitionException {
		DataCentricDSLParser.ifStatement_return retval = new DataCentricDSLParser.ifStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope ifStat47 =null;
		ParserRuleReturnScope elseIfStat48 =null;
		ParserRuleReturnScope elseStat49 =null;

		RewriteRuleSubtreeStream stream_elseIfStat=new RewriteRuleSubtreeStream(adaptor,"rule elseIfStat");
		RewriteRuleSubtreeStream stream_ifStat=new RewriteRuleSubtreeStream(adaptor,"rule ifStat");
		RewriteRuleSubtreeStream stream_elseStat=new RewriteRuleSubtreeStream(adaptor,"rule elseStat");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:121:3: ( ifStat ( elseIfStat )* ( elseStat )? -> ^( IF ifStat ( elseIfStat )* ( elseStat )? ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:121:6: ifStat ( elseIfStat )* ( elseStat )?
			{
			pushFollow(FOLLOW_ifStat_in_ifStatement529);
			ifStat47=ifStat();
			state._fsp--;

			stream_ifStat.add(ifStat47.getTree());
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:121:13: ( elseIfStat )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==Else) ) {
					int LA9_1 = input.LA(2);
					if ( (LA9_1==If) ) {
						alt9=1;
					}

				}

				switch (alt9) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:121:13: elseIfStat
					{
					pushFollow(FOLLOW_elseIfStat_in_ifStatement531);
					elseIfStat48=elseIfStat();
					state._fsp--;

					stream_elseIfStat.add(elseIfStat48.getTree());
					}
					break;

				default :
					break loop9;
				}
			}

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:121:25: ( elseStat )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==Else) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:121:25: elseStat
					{
					pushFollow(FOLLOW_elseStat_in_ifStatement534);
					elseStat49=elseStat();
					state._fsp--;

					stream_elseStat.add(elseStat49.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: ifStat, elseStat, elseIfStat
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 121:35: -> ^( IF ifStat ( elseIfStat )* ( elseStat )? )
			{
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:121:38: ^( IF ifStat ( elseIfStat )* ( elseStat )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);
				adaptor.addChild(root_1, stream_ifStat.nextTree());
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:121:50: ( elseIfStat )*
				while ( stream_elseIfStat.hasNext() ) {
					adaptor.addChild(root_1, stream_elseIfStat.nextTree());
				}
				stream_elseIfStat.reset();

				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:121:62: ( elseStat )?
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:124:1: ifStat : If '(' expression ')' '{' block '}' -> ^( EXP expression block ) ;
	public final DataCentricDSLParser.ifStat_return ifStat() throws RecognitionException {
		DataCentricDSLParser.ifStat_return retval = new DataCentricDSLParser.ifStat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token If50=null;
		Token char_literal51=null;
		Token char_literal53=null;
		Token char_literal54=null;
		Token char_literal56=null;
		ParserRuleReturnScope expression52 =null;
		ParserRuleReturnScope block55 =null;

		Object If50_tree=null;
		Object char_literal51_tree=null;
		Object char_literal53_tree=null;
		Object char_literal54_tree=null;
		Object char_literal56_tree=null;
		RewriteRuleTokenStream stream_OBrace=new RewriteRuleTokenStream(adaptor,"token OBrace");
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_If=new RewriteRuleTokenStream(adaptor,"token If");
		RewriteRuleTokenStream stream_CBrace=new RewriteRuleTokenStream(adaptor,"token CBrace");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:125:3: ( If '(' expression ')' '{' block '}' -> ^( EXP expression block ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:125:6: If '(' expression ')' '{' block '}'
			{
			If50=(Token)match(input,If,FOLLOW_If_in_ifStat563);  
			stream_If.add(If50);

			char_literal51=(Token)match(input,OParen,FOLLOW_OParen_in_ifStat565);  
			stream_OParen.add(char_literal51);

			pushFollow(FOLLOW_expression_in_ifStat567);
			expression52=expression();
			state._fsp--;

			stream_expression.add(expression52.getTree());
			char_literal53=(Token)match(input,CParen,FOLLOW_CParen_in_ifStat569);  
			stream_CParen.add(char_literal53);

			char_literal54=(Token)match(input,OBrace,FOLLOW_OBrace_in_ifStat571);  
			stream_OBrace.add(char_literal54);

			pushFollow(FOLLOW_block_in_ifStat573);
			block55=block();
			state._fsp--;

			stream_block.add(block55.getTree());
			char_literal56=(Token)match(input,CBrace,FOLLOW_CBrace_in_ifStat575);  
			stream_CBrace.add(char_literal56);

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
			// 125:42: -> ^( EXP expression block )
			{
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:125:45: ^( EXP expression block )
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:128:1: elseIfStat : Else If '(' expression ')' '{' block '}' -> ^( EXP expression block ) ;
	public final DataCentricDSLParser.elseIfStat_return elseIfStat() throws RecognitionException {
		DataCentricDSLParser.elseIfStat_return retval = new DataCentricDSLParser.elseIfStat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Else57=null;
		Token If58=null;
		Token char_literal59=null;
		Token char_literal61=null;
		Token char_literal62=null;
		Token char_literal64=null;
		ParserRuleReturnScope expression60 =null;
		ParserRuleReturnScope block63 =null;

		Object Else57_tree=null;
		Object If58_tree=null;
		Object char_literal59_tree=null;
		Object char_literal61_tree=null;
		Object char_literal62_tree=null;
		Object char_literal64_tree=null;
		RewriteRuleTokenStream stream_OBrace=new RewriteRuleTokenStream(adaptor,"token OBrace");
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_Else=new RewriteRuleTokenStream(adaptor,"token Else");
		RewriteRuleTokenStream stream_If=new RewriteRuleTokenStream(adaptor,"token If");
		RewriteRuleTokenStream stream_CBrace=new RewriteRuleTokenStream(adaptor,"token CBrace");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:129:3: ( Else If '(' expression ')' '{' block '}' -> ^( EXP expression block ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:129:6: Else If '(' expression ')' '{' block '}'
			{
			Else57=(Token)match(input,Else,FOLLOW_Else_in_elseIfStat599);  
			stream_Else.add(Else57);

			If58=(Token)match(input,If,FOLLOW_If_in_elseIfStat601);  
			stream_If.add(If58);

			char_literal59=(Token)match(input,OParen,FOLLOW_OParen_in_elseIfStat603);  
			stream_OParen.add(char_literal59);

			pushFollow(FOLLOW_expression_in_elseIfStat605);
			expression60=expression();
			state._fsp--;

			stream_expression.add(expression60.getTree());
			char_literal61=(Token)match(input,CParen,FOLLOW_CParen_in_elseIfStat607);  
			stream_CParen.add(char_literal61);

			char_literal62=(Token)match(input,OBrace,FOLLOW_OBrace_in_elseIfStat609);  
			stream_OBrace.add(char_literal62);

			pushFollow(FOLLOW_block_in_elseIfStat611);
			block63=block();
			state._fsp--;

			stream_block.add(block63.getTree());
			char_literal64=(Token)match(input,CBrace,FOLLOW_CBrace_in_elseIfStat613);  
			stream_CBrace.add(char_literal64);

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
			// 129:47: -> ^( EXP expression block )
			{
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:129:50: ^( EXP expression block )
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:132:1: elseStat : Else '{' block '}' -> ^( EXP block ) ;
	public final DataCentricDSLParser.elseStat_return elseStat() throws RecognitionException {
		DataCentricDSLParser.elseStat_return retval = new DataCentricDSLParser.elseStat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Else65=null;
		Token char_literal66=null;
		Token char_literal68=null;
		ParserRuleReturnScope block67 =null;

		Object Else65_tree=null;
		Object char_literal66_tree=null;
		Object char_literal68_tree=null;
		RewriteRuleTokenStream stream_OBrace=new RewriteRuleTokenStream(adaptor,"token OBrace");
		RewriteRuleTokenStream stream_Else=new RewriteRuleTokenStream(adaptor,"token Else");
		RewriteRuleTokenStream stream_CBrace=new RewriteRuleTokenStream(adaptor,"token CBrace");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:133:3: ( Else '{' block '}' -> ^( EXP block ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:133:6: Else '{' block '}'
			{
			Else65=(Token)match(input,Else,FOLLOW_Else_in_elseStat637);  
			stream_Else.add(Else65);

			char_literal66=(Token)match(input,OBrace,FOLLOW_OBrace_in_elseStat639);  
			stream_OBrace.add(char_literal66);

			pushFollow(FOLLOW_block_in_elseStat641);
			block67=block();
			state._fsp--;

			stream_block.add(block67.getTree());
			char_literal68=(Token)match(input,CBrace,FOLLOW_CBrace_in_elseStat643);  
			stream_CBrace.add(char_literal68);

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
			// 133:25: -> ^( EXP block )
			{
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:133:28: ^( EXP block )
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:136:1: functionDecl : 'func' Identifier '(' ( idList )? ')' '{' block '}' ;
	public final DataCentricDSLParser.functionDecl_return functionDecl() throws RecognitionException {
		DataCentricDSLParser.functionDecl_return retval = new DataCentricDSLParser.functionDecl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal69=null;
		Token Identifier70=null;
		Token char_literal71=null;
		Token char_literal73=null;
		Token char_literal74=null;
		Token char_literal76=null;
		ParserRuleReturnScope idList72 =null;
		ParserRuleReturnScope block75 =null;

		Object string_literal69_tree=null;
		Object Identifier70_tree=null;
		Object char_literal71_tree=null;
		Object char_literal73_tree=null;
		Object char_literal74_tree=null;
		Object char_literal76_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:137:3: ( 'func' Identifier '(' ( idList )? ')' '{' block '}' )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:137:6: 'func' Identifier '(' ( idList )? ')' '{' block '}'
			{
			root_0 = (Object)adaptor.nil();


			string_literal69=(Token)match(input,71,FOLLOW_71_in_functionDecl665); 
			string_literal69_tree = (Object)adaptor.create(string_literal69);
			adaptor.addChild(root_0, string_literal69_tree);

			Identifier70=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionDecl667); 
			Identifier70_tree = (Object)adaptor.create(Identifier70);
			adaptor.addChild(root_0, Identifier70_tree);

			char_literal71=(Token)match(input,OParen,FOLLOW_OParen_in_functionDecl669); 
			char_literal71_tree = (Object)adaptor.create(char_literal71);
			adaptor.addChild(root_0, char_literal71_tree);

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:137:28: ( idList )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==Identifier) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:137:28: idList
					{
					pushFollow(FOLLOW_idList_in_functionDecl671);
					idList72=idList();
					state._fsp--;

					adaptor.addChild(root_0, idList72.getTree());

					}
					break;

			}

			char_literal73=(Token)match(input,CParen,FOLLOW_CParen_in_functionDecl674); 
			char_literal73_tree = (Object)adaptor.create(char_literal73);
			adaptor.addChild(root_0, char_literal73_tree);

			char_literal74=(Token)match(input,OBrace,FOLLOW_OBrace_in_functionDecl676); 
			char_literal74_tree = (Object)adaptor.create(char_literal74);
			adaptor.addChild(root_0, char_literal74_tree);

			pushFollow(FOLLOW_block_in_functionDecl678);
			block75=block();
			state._fsp--;

			adaptor.addChild(root_0, block75.getTree());

			char_literal76=(Token)match(input,CBrace,FOLLOW_CBrace_in_functionDecl680); 
			char_literal76_tree = (Object)adaptor.create(char_literal76);
			adaptor.addChild(root_0, char_literal76_tree);

			defineFunction((Identifier70!=null?Identifier70.getText():null), (idList72!=null?((Object)idList72.getTree()):null), (block75!=null?((Object)block75.getTree()):null));
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:143:1: forStatement : ( For '(' assignment ';' expression ';' afterthought ')' '{' block '}' -> ^( For assignment expression afterthought block ) ) ;
	public final DataCentricDSLParser.forStatement_return forStatement() throws RecognitionException {
		DataCentricDSLParser.forStatement_return retval = new DataCentricDSLParser.forStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token For77=null;
		Token char_literal78=null;
		Token char_literal80=null;
		Token char_literal82=null;
		Token char_literal84=null;
		Token char_literal85=null;
		Token char_literal87=null;
		ParserRuleReturnScope assignment79 =null;
		ParserRuleReturnScope expression81 =null;
		ParserRuleReturnScope afterthought83 =null;
		ParserRuleReturnScope block86 =null;

		Object For77_tree=null;
		Object char_literal78_tree=null;
		Object char_literal80_tree=null;
		Object char_literal82_tree=null;
		Object char_literal84_tree=null;
		Object char_literal85_tree=null;
		Object char_literal87_tree=null;
		RewriteRuleTokenStream stream_OBrace=new RewriteRuleTokenStream(adaptor,"token OBrace");
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_For=new RewriteRuleTokenStream(adaptor,"token For");
		RewriteRuleTokenStream stream_CBrace=new RewriteRuleTokenStream(adaptor,"token CBrace");
		RewriteRuleTokenStream stream_SColon=new RewriteRuleTokenStream(adaptor,"token SColon");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_assignment=new RewriteRuleSubtreeStream(adaptor,"rule assignment");
		RewriteRuleSubtreeStream stream_afterthought=new RewriteRuleSubtreeStream(adaptor,"rule afterthought");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:144:3: ( ( For '(' assignment ';' expression ';' afterthought ')' '{' block '}' -> ^( For assignment expression afterthought block ) ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:144:6: ( For '(' assignment ';' expression ';' afterthought ')' '{' block '}' -> ^( For assignment expression afterthought block ) )
			{
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:144:6: ( For '(' assignment ';' expression ';' afterthought ')' '{' block '}' -> ^( For assignment expression afterthought block ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:144:7: For '(' assignment ';' expression ';' afterthought ')' '{' block '}'
			{
			For77=(Token)match(input,For,FOLLOW_For_in_forStatement702);  
			stream_For.add(For77);

			char_literal78=(Token)match(input,OParen,FOLLOW_OParen_in_forStatement704);  
			stream_OParen.add(char_literal78);

			pushFollow(FOLLOW_assignment_in_forStatement706);
			assignment79=assignment();
			state._fsp--;

			stream_assignment.add(assignment79.getTree());
			char_literal80=(Token)match(input,SColon,FOLLOW_SColon_in_forStatement708);  
			stream_SColon.add(char_literal80);

			pushFollow(FOLLOW_expression_in_forStatement710);
			expression81=expression();
			state._fsp--;

			stream_expression.add(expression81.getTree());
			char_literal82=(Token)match(input,SColon,FOLLOW_SColon_in_forStatement712);  
			stream_SColon.add(char_literal82);

			pushFollow(FOLLOW_afterthought_in_forStatement714);
			afterthought83=afterthought();
			state._fsp--;

			stream_afterthought.add(afterthought83.getTree());
			char_literal84=(Token)match(input,CParen,FOLLOW_CParen_in_forStatement716);  
			stream_CParen.add(char_literal84);

			char_literal85=(Token)match(input,OBrace,FOLLOW_OBrace_in_forStatement718);  
			stream_OBrace.add(char_literal85);

			pushFollow(FOLLOW_block_in_forStatement720);
			block86=block();
			state._fsp--;

			stream_block.add(block86.getTree());
			char_literal87=(Token)match(input,CBrace,FOLLOW_CBrace_in_forStatement722);  
			stream_CBrace.add(char_literal87);

			// AST REWRITE
			// elements: afterthought, assignment, For, expression, block
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 145:6: -> ^( For assignment expression afterthought block )
			{
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:145:9: ^( For assignment expression afterthought block )
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:148:1: afterthought : ( ( Identifier '=' expression ) | incrementation );
	public final DataCentricDSLParser.afterthought_return afterthought() throws RecognitionException {
		DataCentricDSLParser.afterthought_return retval = new DataCentricDSLParser.afterthought_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier88=null;
		Token char_literal89=null;
		ParserRuleReturnScope expression90 =null;
		ParserRuleReturnScope incrementation91 =null;

		Object Identifier88_tree=null;
		Object char_literal89_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:148:13: ( ( Identifier '=' expression ) | incrementation )
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:149:3: ( Identifier '=' expression )
					{
					root_0 = (Object)adaptor.nil();


					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:149:3: ( Identifier '=' expression )
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:149:4: Identifier '=' expression
					{
					Identifier88=(Token)match(input,Identifier,FOLLOW_Identifier_in_afterthought754); 
					Identifier88_tree = (Object)adaptor.create(Identifier88);
					adaptor.addChild(root_0, Identifier88_tree);

					char_literal89=(Token)match(input,Assign,FOLLOW_Assign_in_afterthought756); 
					char_literal89_tree = (Object)adaptor.create(char_literal89);
					adaptor.addChild(root_0, char_literal89_tree);

					pushFollow(FOLLOW_expression_in_afterthought758);
					expression90=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression90.getTree());

					}

					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:149:33: incrementation
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_incrementation_in_afterthought763);
					incrementation91=incrementation();
					state._fsp--;

					adaptor.addChild(root_0, incrementation91.getTree());

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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:152:1: whileStatement : While '(' expression ')' '{' block '}' -> ^( While expression block ) ;
	public final DataCentricDSLParser.whileStatement_return whileStatement() throws RecognitionException {
		DataCentricDSLParser.whileStatement_return retval = new DataCentricDSLParser.whileStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token While92=null;
		Token char_literal93=null;
		Token char_literal95=null;
		Token char_literal96=null;
		Token char_literal98=null;
		ParserRuleReturnScope expression94 =null;
		ParserRuleReturnScope block97 =null;

		Object While92_tree=null;
		Object char_literal93_tree=null;
		Object char_literal95_tree=null;
		Object char_literal96_tree=null;
		Object char_literal98_tree=null;
		RewriteRuleTokenStream stream_OBrace=new RewriteRuleTokenStream(adaptor,"token OBrace");
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_While=new RewriteRuleTokenStream(adaptor,"token While");
		RewriteRuleTokenStream stream_CBrace=new RewriteRuleTokenStream(adaptor,"token CBrace");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:153:3: ( While '(' expression ')' '{' block '}' -> ^( While expression block ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:153:6: While '(' expression ')' '{' block '}'
			{
			While92=(Token)match(input,While,FOLLOW_While_in_whileStatement775);  
			stream_While.add(While92);

			char_literal93=(Token)match(input,OParen,FOLLOW_OParen_in_whileStatement777);  
			stream_OParen.add(char_literal93);

			pushFollow(FOLLOW_expression_in_whileStatement779);
			expression94=expression();
			state._fsp--;

			stream_expression.add(expression94.getTree());
			char_literal95=(Token)match(input,CParen,FOLLOW_CParen_in_whileStatement781);  
			stream_CParen.add(char_literal95);

			char_literal96=(Token)match(input,OBrace,FOLLOW_OBrace_in_whileStatement783);  
			stream_OBrace.add(char_literal96);

			pushFollow(FOLLOW_block_in_whileStatement785);
			block97=block();
			state._fsp--;

			stream_block.add(block97.getTree());
			char_literal98=(Token)match(input,CBrace,FOLLOW_CBrace_in_whileStatement787);  
			stream_CBrace.add(char_literal98);

			// AST REWRITE
			// elements: block, expression, While
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 153:45: -> ^( While expression block )
			{
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:153:48: ^( While expression block )
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:156:1: idList : Identifier ( ',' Identifier )* -> ^( ID_LIST ( Identifier )+ ) ;
	public final DataCentricDSLParser.idList_return idList() throws RecognitionException {
		DataCentricDSLParser.idList_return retval = new DataCentricDSLParser.idList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier99=null;
		Token char_literal100=null;
		Token Identifier101=null;

		Object Identifier99_tree=null;
		Object char_literal100_tree=null;
		Object Identifier101_tree=null;
		RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:157:3: ( Identifier ( ',' Identifier )* -> ^( ID_LIST ( Identifier )+ ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:157:6: Identifier ( ',' Identifier )*
			{
			Identifier99=(Token)match(input,Identifier,FOLLOW_Identifier_in_idList811);  
			stream_Identifier.add(Identifier99);

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:157:17: ( ',' Identifier )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==Comma) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:157:18: ',' Identifier
					{
					char_literal100=(Token)match(input,Comma,FOLLOW_Comma_in_idList814);  
					stream_Comma.add(char_literal100);

					Identifier101=(Token)match(input,Identifier,FOLLOW_Identifier_in_idList816);  
					stream_Identifier.add(Identifier101);

					}
					break;

				default :
					break loop13;
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
			// 157:35: -> ^( ID_LIST ( Identifier )+ )
			{
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:157:38: ^( ID_LIST ( Identifier )+ )
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:160:1: exprList : expression ( ',' expression )* -> ^( EXP_LIST ( expression )+ ) ;
	public final DataCentricDSLParser.exprList_return exprList() throws RecognitionException {
		DataCentricDSLParser.exprList_return retval = new DataCentricDSLParser.exprList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal103=null;
		ParserRuleReturnScope expression102 =null;
		ParserRuleReturnScope expression104 =null;

		Object char_literal103_tree=null;
		RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:161:3: ( expression ( ',' expression )* -> ^( EXP_LIST ( expression )+ ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:161:6: expression ( ',' expression )*
			{
			pushFollow(FOLLOW_expression_in_exprList841);
			expression102=expression();
			state._fsp--;

			stream_expression.add(expression102.getTree());
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:161:17: ( ',' expression )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==Comma) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:161:18: ',' expression
					{
					char_literal103=(Token)match(input,Comma,FOLLOW_Comma_in_exprList844);  
					stream_Comma.add(char_literal103);

					pushFollow(FOLLOW_expression_in_exprList846);
					expression104=expression();
					state._fsp--;

					stream_expression.add(expression104.getTree());
					}
					break;

				default :
					break loop14;
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
			// 161:35: -> ^( EXP_LIST ( expression )+ )
			{
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:161:38: ^( EXP_LIST ( expression )+ )
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:164:1: expression : ( condExpr | query );
	public final DataCentricDSLParser.expression_return expression() throws RecognitionException {
		DataCentricDSLParser.expression_return retval = new DataCentricDSLParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope condExpr105 =null;
		ParserRuleReturnScope query106 =null;


		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:165:3: ( condExpr | query )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==Bool||LA15_0==Excl||LA15_0==Identifier||(LA15_0 >= Null && LA15_0 <= Number)||(LA15_0 >= OBracket && LA15_0 <= OParen)||(LA15_0 >= String && LA15_0 <= Subtract)) ) {
				alt15=1;
			}
			else if ( (LA15_0==73) ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:165:6: condExpr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_condExpr_in_expression871);
					condExpr105=condExpr();
					state._fsp--;

					adaptor.addChild(root_0, condExpr105.getTree());

					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:165:17: query
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_query_in_expression875);
					query106=query();
					state._fsp--;

					adaptor.addChild(root_0, query106.getTree());

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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:168:1: incrementation : variableCall ( '++' | '--' ) ;
	public final DataCentricDSLParser.incrementation_return incrementation() throws RecognitionException {
		DataCentricDSLParser.incrementation_return retval = new DataCentricDSLParser.incrementation_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set108=null;
		ParserRuleReturnScope variableCall107 =null;

		Object set108_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:169:3: ( variableCall ( '++' | '--' ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:169:5: variableCall ( '++' | '--' )
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_variableCall_in_incrementation888);
			variableCall107=variableCall();
			state._fsp--;

			adaptor.addChild(root_0, variableCall107.getTree());

			set108=input.LT(1);
			if ( input.LA(1)==Increment||input.LA(1)==70 ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set108));
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:172:1: condExpr : ( orExpr -> orExpr ) ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )? ;
	public final DataCentricDSLParser.condExpr_return condExpr() throws RecognitionException {
		DataCentricDSLParser.condExpr_return retval = new DataCentricDSLParser.condExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal110=null;
		Token char_literal111=null;
		Token In112=null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope orExpr109 =null;
		ParserRuleReturnScope expression113 =null;

		Object char_literal110_tree=null;
		Object char_literal111_tree=null;
		Object In112_tree=null;
		RewriteRuleTokenStream stream_In=new RewriteRuleTokenStream(adaptor,"token In");
		RewriteRuleTokenStream stream_Colon=new RewriteRuleTokenStream(adaptor,"token Colon");
		RewriteRuleTokenStream stream_QMark=new RewriteRuleTokenStream(adaptor,"token QMark");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_orExpr=new RewriteRuleSubtreeStream(adaptor,"rule orExpr");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:173:3: ( ( orExpr -> orExpr ) ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )? )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:173:6: ( orExpr -> orExpr ) ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )?
			{
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:173:6: ( orExpr -> orExpr )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:173:7: orExpr
			{
			pushFollow(FOLLOW_orExpr_in_condExpr907);
			orExpr109=orExpr();
			state._fsp--;

			stream_orExpr.add(orExpr109.getTree());
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
			// 173:14: -> orExpr
			{
				adaptor.addChild(root_0, stream_orExpr.nextTree());
			}


			retval.tree = root_0;

			}

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:174:6: ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )?
			int alt16=3;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==QMark) ) {
				alt16=1;
			}
			else if ( (LA16_0==In) ) {
				alt16=2;
			}
			switch (alt16) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:174:8: '?' a= expression ':' b= expression
					{
					char_literal110=(Token)match(input,QMark,FOLLOW_QMark_in_condExpr922);  
					stream_QMark.add(char_literal110);

					pushFollow(FOLLOW_expression_in_condExpr926);
					a=expression();
					state._fsp--;

					stream_expression.add(a.getTree());
					char_literal111=(Token)match(input,Colon,FOLLOW_Colon_in_condExpr928);  
					stream_Colon.add(char_literal111);

					pushFollow(FOLLOW_expression_in_condExpr932);
					b=expression();
					state._fsp--;

					stream_expression.add(b.getTree());
					// AST REWRITE
					// elements: b, orExpr, a
					// token labels: 
					// rule labels: retval, b, a
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.getTree():null);
					RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 174:42: -> ^( TERNARY orExpr $a $b)
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:174:45: ^( TERNARY orExpr $a $b)
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:175:8: In expression
					{
					In112=(Token)match(input,In,FOLLOW_In_in_condExpr955);  
					stream_In.add(In112);

					pushFollow(FOLLOW_expression_in_condExpr957);
					expression113=expression();
					state._fsp--;

					stream_expression.add(expression113.getTree());
					// AST REWRITE
					// elements: orExpr, In, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 175:42: -> ^( In orExpr expression )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:175:45: ^( In orExpr expression )
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:179:1: orExpr : andExpr ( '||' ^ andExpr )* ;
	public final DataCentricDSLParser.orExpr_return orExpr() throws RecognitionException {
		DataCentricDSLParser.orExpr_return retval = new DataCentricDSLParser.orExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal115=null;
		ParserRuleReturnScope andExpr114 =null;
		ParserRuleReturnScope andExpr116 =null;

		Object string_literal115_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:180:3: ( andExpr ( '||' ^ andExpr )* )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:180:6: andExpr ( '||' ^ andExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_andExpr_in_orExpr1009);
			andExpr114=andExpr();
			state._fsp--;

			adaptor.addChild(root_0, andExpr114.getTree());

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:180:14: ( '||' ^ andExpr )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==Or) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:180:15: '||' ^ andExpr
					{
					string_literal115=(Token)match(input,Or,FOLLOW_Or_in_orExpr1012); 
					string_literal115_tree = (Object)adaptor.create(string_literal115);
					root_0 = (Object)adaptor.becomeRoot(string_literal115_tree, root_0);

					pushFollow(FOLLOW_andExpr_in_orExpr1015);
					andExpr116=andExpr();
					state._fsp--;

					adaptor.addChild(root_0, andExpr116.getTree());

					}
					break;

				default :
					break loop17;
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:183:1: andExpr : equExpr ( '&&' ^ equExpr )* ;
	public final DataCentricDSLParser.andExpr_return andExpr() throws RecognitionException {
		DataCentricDSLParser.andExpr_return retval = new DataCentricDSLParser.andExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal118=null;
		ParserRuleReturnScope equExpr117 =null;
		ParserRuleReturnScope equExpr119 =null;

		Object string_literal118_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:184:3: ( equExpr ( '&&' ^ equExpr )* )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:184:6: equExpr ( '&&' ^ equExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_equExpr_in_andExpr1031);
			equExpr117=equExpr();
			state._fsp--;

			adaptor.addChild(root_0, equExpr117.getTree());

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:184:14: ( '&&' ^ equExpr )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==And) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:184:15: '&&' ^ equExpr
					{
					string_literal118=(Token)match(input,And,FOLLOW_And_in_andExpr1034); 
					string_literal118_tree = (Object)adaptor.create(string_literal118);
					root_0 = (Object)adaptor.becomeRoot(string_literal118_tree, root_0);

					pushFollow(FOLLOW_equExpr_in_andExpr1037);
					equExpr119=equExpr();
					state._fsp--;

					adaptor.addChild(root_0, equExpr119.getTree());

					}
					break;

				default :
					break loop18;
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:187:1: equExpr : relExpr ( ( '==' | '!=' ) ^ relExpr )* ;
	public final DataCentricDSLParser.equExpr_return equExpr() throws RecognitionException {
		DataCentricDSLParser.equExpr_return retval = new DataCentricDSLParser.equExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set121=null;
		ParserRuleReturnScope relExpr120 =null;
		ParserRuleReturnScope relExpr122 =null;

		Object set121_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:188:3: ( relExpr ( ( '==' | '!=' ) ^ relExpr )* )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:188:6: relExpr ( ( '==' | '!=' ) ^ relExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_relExpr_in_equExpr1053);
			relExpr120=relExpr();
			state._fsp--;

			adaptor.addChild(root_0, relExpr120.getTree());

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:188:14: ( ( '==' | '!=' ) ^ relExpr )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==Equals||LA19_0==NEquals) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:188:15: ( '==' | '!=' ) ^ relExpr
					{
					set121=input.LT(1);
					set121=input.LT(1);
					if ( input.LA(1)==Equals||input.LA(1)==NEquals ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set121), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_relExpr_in_equExpr1065);
					relExpr122=relExpr();
					state._fsp--;

					adaptor.addChild(root_0, relExpr122.getTree());

					}
					break;

				default :
					break loop19;
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:191:1: relExpr : addExpr ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )* ;
	public final DataCentricDSLParser.relExpr_return relExpr() throws RecognitionException {
		DataCentricDSLParser.relExpr_return retval = new DataCentricDSLParser.relExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set124=null;
		ParserRuleReturnScope addExpr123 =null;
		ParserRuleReturnScope addExpr125 =null;

		Object set124_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:192:3: ( addExpr ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )* )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:192:6: addExpr ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_addExpr_in_relExpr1081);
			addExpr123=addExpr();
			state._fsp--;

			adaptor.addChild(root_0, addExpr123.getTree());

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:192:14: ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( ((LA20_0 >= GT && LA20_0 <= GTEquals)||(LA20_0 >= LT && LA20_0 <= LTEquals)) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:192:15: ( '>=' | '<=' | '>' | '<' ) ^ addExpr
					{
					set124=input.LT(1);
					set124=input.LT(1);
					if ( (input.LA(1) >= GT && input.LA(1) <= GTEquals)||(input.LA(1) >= LT && input.LA(1) <= LTEquals) ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set124), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_addExpr_in_relExpr1101);
					addExpr125=addExpr();
					state._fsp--;

					adaptor.addChild(root_0, addExpr125.getTree());

					}
					break;

				default :
					break loop20;
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:195:1: addExpr : mulExpr ( ( '+' | '-' ) ^ mulExpr )* ;
	public final DataCentricDSLParser.addExpr_return addExpr() throws RecognitionException {
		DataCentricDSLParser.addExpr_return retval = new DataCentricDSLParser.addExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set127=null;
		ParserRuleReturnScope mulExpr126 =null;
		ParserRuleReturnScope mulExpr128 =null;

		Object set127_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:196:3: ( mulExpr ( ( '+' | '-' ) ^ mulExpr )* )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:196:6: mulExpr ( ( '+' | '-' ) ^ mulExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_mulExpr_in_addExpr1117);
			mulExpr126=mulExpr();
			state._fsp--;

			adaptor.addChild(root_0, mulExpr126.getTree());

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:196:14: ( ( '+' | '-' ) ^ mulExpr )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==Add||LA21_0==Subtract) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:196:15: ( '+' | '-' ) ^ mulExpr
					{
					set127=input.LT(1);
					set127=input.LT(1);
					if ( input.LA(1)==Add||input.LA(1)==Subtract ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set127), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_mulExpr_in_addExpr1129);
					mulExpr128=mulExpr();
					state._fsp--;

					adaptor.addChild(root_0, mulExpr128.getTree());

					}
					break;

				default :
					break loop21;
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:199:1: mulExpr : powExpr ( ( '*' | '/' | '%' ) ^ powExpr )* ;
	public final DataCentricDSLParser.mulExpr_return mulExpr() throws RecognitionException {
		DataCentricDSLParser.mulExpr_return retval = new DataCentricDSLParser.mulExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set130=null;
		ParserRuleReturnScope powExpr129 =null;
		ParserRuleReturnScope powExpr131 =null;

		Object set130_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:200:3: ( powExpr ( ( '*' | '/' | '%' ) ^ powExpr )* )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:200:6: powExpr ( ( '*' | '/' | '%' ) ^ powExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_powExpr_in_mulExpr1145);
			powExpr129=powExpr();
			state._fsp--;

			adaptor.addChild(root_0, powExpr129.getTree());

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:200:14: ( ( '*' | '/' | '%' ) ^ powExpr )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==Divide||(LA22_0 >= Modulus && LA22_0 <= Multiply)) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:200:15: ( '*' | '/' | '%' ) ^ powExpr
					{
					set130=input.LT(1);
					set130=input.LT(1);
					if ( input.LA(1)==Divide||(input.LA(1) >= Modulus && input.LA(1) <= Multiply) ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set130), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_powExpr_in_mulExpr1161);
					powExpr131=powExpr();
					state._fsp--;

					adaptor.addChild(root_0, powExpr131.getTree());

					}
					break;

				default :
					break loop22;
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:203:1: powExpr : unaryExpr ( '^' ^ unaryExpr )* ;
	public final DataCentricDSLParser.powExpr_return powExpr() throws RecognitionException {
		DataCentricDSLParser.powExpr_return retval = new DataCentricDSLParser.powExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal133=null;
		ParserRuleReturnScope unaryExpr132 =null;
		ParserRuleReturnScope unaryExpr134 =null;

		Object char_literal133_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:204:3: ( unaryExpr ( '^' ^ unaryExpr )* )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:204:6: unaryExpr ( '^' ^ unaryExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_unaryExpr_in_powExpr1177);
			unaryExpr132=unaryExpr();
			state._fsp--;

			adaptor.addChild(root_0, unaryExpr132.getTree());

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:204:16: ( '^' ^ unaryExpr )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==Pow) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:204:17: '^' ^ unaryExpr
					{
					char_literal133=(Token)match(input,Pow,FOLLOW_Pow_in_powExpr1180); 
					char_literal133_tree = (Object)adaptor.create(char_literal133);
					root_0 = (Object)adaptor.becomeRoot(char_literal133_tree, root_0);

					pushFollow(FOLLOW_unaryExpr_in_powExpr1183);
					unaryExpr134=unaryExpr();
					state._fsp--;

					adaptor.addChild(root_0, unaryExpr134.getTree());

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
	// $ANTLR end "powExpr"


	public static class unaryExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "unaryExpr"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:207:1: unaryExpr : ( '-' atom -> ^( UNARY_MIN atom ) | '!' atom -> ^( NEGATE atom ) | atom );
	public final DataCentricDSLParser.unaryExpr_return unaryExpr() throws RecognitionException {
		DataCentricDSLParser.unaryExpr_return retval = new DataCentricDSLParser.unaryExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal135=null;
		Token char_literal137=null;
		ParserRuleReturnScope atom136 =null;
		ParserRuleReturnScope atom138 =null;
		ParserRuleReturnScope atom139 =null;

		Object char_literal135_tree=null;
		Object char_literal137_tree=null;
		RewriteRuleTokenStream stream_Excl=new RewriteRuleTokenStream(adaptor,"token Excl");
		RewriteRuleTokenStream stream_Subtract=new RewriteRuleTokenStream(adaptor,"token Subtract");
		RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:208:3: ( '-' atom -> ^( UNARY_MIN atom ) | '!' atom -> ^( NEGATE atom ) | atom )
			int alt24=3;
			switch ( input.LA(1) ) {
			case Subtract:
				{
				alt24=1;
				}
				break;
			case Excl:
				{
				alt24=2;
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
				alt24=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}
			switch (alt24) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:208:6: '-' atom
					{
					char_literal135=(Token)match(input,Subtract,FOLLOW_Subtract_in_unaryExpr1201);  
					stream_Subtract.add(char_literal135);

					pushFollow(FOLLOW_atom_in_unaryExpr1203);
					atom136=atom();
					state._fsp--;

					stream_atom.add(atom136.getTree());
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
					// 208:15: -> ^( UNARY_MIN atom )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:208:18: ^( UNARY_MIN atom )
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:209:6: '!' atom
					{
					char_literal137=(Token)match(input,Excl,FOLLOW_Excl_in_unaryExpr1218);  
					stream_Excl.add(char_literal137);

					pushFollow(FOLLOW_atom_in_unaryExpr1220);
					atom138=atom();
					state._fsp--;

					stream_atom.add(atom138.getTree());
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
					// 209:15: -> ^( NEGATE atom )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:209:18: ^( NEGATE atom )
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:210:6: atom
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_atom_in_unaryExpr1235);
					atom139=atom();
					state._fsp--;

					adaptor.addChild(root_0, atom139.getTree());

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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:213:1: atom : ( Number | Bool | Null | lookup );
	public final DataCentricDSLParser.atom_return atom() throws RecognitionException {
		DataCentricDSLParser.atom_return retval = new DataCentricDSLParser.atom_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Number140=null;
		Token Bool141=null;
		Token Null142=null;
		ParserRuleReturnScope lookup143 =null;

		Object Number140_tree=null;
		Object Bool141_tree=null;
		Object Null142_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:214:3: ( Number | Bool | Null | lookup )
			int alt25=4;
			switch ( input.LA(1) ) {
			case Number:
				{
				alt25=1;
				}
				break;
			case Bool:
				{
				alt25=2;
				}
				break;
			case Null:
				{
				alt25=3;
				}
				break;
			case Identifier:
			case OBracket:
			case OParen:
			case String:
				{
				alt25=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}
			switch (alt25) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:214:6: Number
					{
					root_0 = (Object)adaptor.nil();


					Number140=(Token)match(input,Number,FOLLOW_Number_in_atom1249); 
					Number140_tree = (Object)adaptor.create(Number140);
					adaptor.addChild(root_0, Number140_tree);

					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:215:6: Bool
					{
					root_0 = (Object)adaptor.nil();


					Bool141=(Token)match(input,Bool,FOLLOW_Bool_in_atom1256); 
					Bool141_tree = (Object)adaptor.create(Bool141);
					adaptor.addChild(root_0, Bool141_tree);

					}
					break;
				case 3 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:216:6: Null
					{
					root_0 = (Object)adaptor.nil();


					Null142=(Token)match(input,Null,FOLLOW_Null_in_atom1263); 
					Null142_tree = (Object)adaptor.create(Null142);
					adaptor.addChild(root_0, Null142_tree);

					}
					break;
				case 4 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:217:6: lookup
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_lookup_in_atom1270);
					lookup143=lookup();
					state._fsp--;

					adaptor.addChild(root_0, lookup143.getTree());

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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:220:1: list : '[' ( exprList )? ']' -> ^( LIST ( exprList )? ) ;
	public final DataCentricDSLParser.list_return list() throws RecognitionException {
		DataCentricDSLParser.list_return retval = new DataCentricDSLParser.list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal144=null;
		Token char_literal146=null;
		ParserRuleReturnScope exprList145 =null;

		Object char_literal144_tree=null;
		Object char_literal146_tree=null;
		RewriteRuleTokenStream stream_CBracket=new RewriteRuleTokenStream(adaptor,"token CBracket");
		RewriteRuleTokenStream stream_OBracket=new RewriteRuleTokenStream(adaptor,"token OBracket");
		RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:221:3: ( '[' ( exprList )? ']' -> ^( LIST ( exprList )? ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:221:6: '[' ( exprList )? ']'
			{
			char_literal144=(Token)match(input,OBracket,FOLLOW_OBracket_in_list1284);  
			stream_OBracket.add(char_literal144);

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:221:10: ( exprList )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==Bool||LA26_0==Excl||LA26_0==Identifier||(LA26_0 >= Null && LA26_0 <= Number)||(LA26_0 >= OBracket && LA26_0 <= OParen)||(LA26_0 >= String && LA26_0 <= Subtract)||LA26_0==73) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:221:10: exprList
					{
					pushFollow(FOLLOW_exprList_in_list1286);
					exprList145=exprList();
					state._fsp--;

					stream_exprList.add(exprList145.getTree());
					}
					break;

			}

			char_literal146=(Token)match(input,CBracket,FOLLOW_CBracket_in_list1289);  
			stream_CBracket.add(char_literal146);

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
			// 221:24: -> ^( LIST ( exprList )? )
			{
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:221:27: ^( LIST ( exprList )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:221:34: ( exprList )?
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:224:1: lookup : ( list ( indexes )? -> ^( LOOKUP list ( indexes )? ) | Identifier ( indexes )? -> ^( LOOKUP Identifier ( indexes )? ) | String ( indexes )? -> ^( LOOKUP String ( indexes )? ) | '(' expression ')' ( indexes )? -> ^( LOOKUP expression ( indexes )? ) );
	public final DataCentricDSLParser.lookup_return lookup() throws RecognitionException {
		DataCentricDSLParser.lookup_return retval = new DataCentricDSLParser.lookup_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier149=null;
		Token String151=null;
		Token char_literal153=null;
		Token char_literal155=null;
		ParserRuleReturnScope list147 =null;
		ParserRuleReturnScope indexes148 =null;
		ParserRuleReturnScope indexes150 =null;
		ParserRuleReturnScope indexes152 =null;
		ParserRuleReturnScope expression154 =null;
		ParserRuleReturnScope indexes156 =null;

		Object Identifier149_tree=null;
		Object String151_tree=null;
		Object char_literal153_tree=null;
		Object char_literal155_tree=null;
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_String=new RewriteRuleTokenStream(adaptor,"token String");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_indexes=new RewriteRuleSubtreeStream(adaptor,"rule indexes");
		RewriteRuleSubtreeStream stream_list=new RewriteRuleSubtreeStream(adaptor,"rule list");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:226:3: ( list ( indexes )? -> ^( LOOKUP list ( indexes )? ) | Identifier ( indexes )? -> ^( LOOKUP Identifier ( indexes )? ) | String ( indexes )? -> ^( LOOKUP String ( indexes )? ) | '(' expression ')' ( indexes )? -> ^( LOOKUP expression ( indexes )? ) )
			int alt31=4;
			switch ( input.LA(1) ) {
			case OBracket:
				{
				alt31=1;
				}
				break;
			case Identifier:
				{
				alt31=2;
				}
				break;
			case String:
				{
				alt31=3;
				}
				break;
			case OParen:
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:226:6: list ( indexes )?
					{
					pushFollow(FOLLOW_list_in_lookup1313);
					list147=list();
					state._fsp--;

					stream_list.add(list147.getTree());
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:226:11: ( indexes )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==OBracket) ) {
						alt27=1;
					}
					switch (alt27) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:226:11: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1315);
							indexes148=indexes();
							state._fsp--;

							stream_indexes.add(indexes148.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: list, indexes
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 226:34: -> ^( LOOKUP list ( indexes )? )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:226:37: ^( LOOKUP list ( indexes )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
						adaptor.addChild(root_1, stream_list.nextTree());
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:226:51: ( indexes )?
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:227:6: Identifier ( indexes )?
					{
					Identifier149=(Token)match(input,Identifier,FOLLOW_Identifier_in_lookup1348);  
					stream_Identifier.add(Identifier149);

					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:227:17: ( indexes )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==OBracket) ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:227:17: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1350);
							indexes150=indexes();
							state._fsp--;

							stream_indexes.add(indexes150.getTree());
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
					// 227:34: -> ^( LOOKUP Identifier ( indexes )? )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:227:37: ^( LOOKUP Identifier ( indexes )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
						adaptor.addChild(root_1, stream_Identifier.nextNode());
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:227:57: ( indexes )?
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:228:6: String ( indexes )?
					{
					String151=(Token)match(input,String,FOLLOW_String_in_lookup1377);  
					stream_String.add(String151);

					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:228:13: ( indexes )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==OBracket) ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:228:13: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1379);
							indexes152=indexes();
							state._fsp--;

							stream_indexes.add(indexes152.getTree());
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
					// 228:34: -> ^( LOOKUP String ( indexes )? )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:228:37: ^( LOOKUP String ( indexes )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
						adaptor.addChild(root_1, stream_String.nextNode());
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:228:53: ( indexes )?
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:229:6: '(' expression ')' ( indexes )?
					{
					char_literal153=(Token)match(input,OParen,FOLLOW_OParen_in_lookup1410);  
					stream_OParen.add(char_literal153);

					pushFollow(FOLLOW_expression_in_lookup1412);
					expression154=expression();
					state._fsp--;

					stream_expression.add(expression154.getTree());
					char_literal155=(Token)match(input,CParen,FOLLOW_CParen_in_lookup1414);  
					stream_CParen.add(char_literal155);

					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:229:25: ( indexes )?
					int alt30=2;
					int LA30_0 = input.LA(1);
					if ( (LA30_0==OBracket) ) {
						alt30=1;
					}
					switch (alt30) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:229:25: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1416);
							indexes156=indexes();
							state._fsp--;

							stream_indexes.add(indexes156.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: indexes, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 229:34: -> ^( LOOKUP expression ( indexes )? )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:229:37: ^( LOOKUP expression ( indexes )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
						adaptor.addChild(root_1, stream_expression.nextTree());
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:229:57: ( indexes )?
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:232:1: indexes : ( '[' expression ']' )+ -> ^( INDEXES ( expression )+ ) ;
	public final DataCentricDSLParser.indexes_return indexes() throws RecognitionException {
		DataCentricDSLParser.indexes_return retval = new DataCentricDSLParser.indexes_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal157=null;
		Token char_literal159=null;
		ParserRuleReturnScope expression158 =null;

		Object char_literal157_tree=null;
		Object char_literal159_tree=null;
		RewriteRuleTokenStream stream_CBracket=new RewriteRuleTokenStream(adaptor,"token CBracket");
		RewriteRuleTokenStream stream_OBracket=new RewriteRuleTokenStream(adaptor,"token OBracket");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:233:3: ( ( '[' expression ']' )+ -> ^( INDEXES ( expression )+ ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:233:6: ( '[' expression ']' )+
			{
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:233:6: ( '[' expression ']' )+
			int cnt32=0;
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==OBracket) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:233:7: '[' expression ']'
					{
					char_literal157=(Token)match(input,OBracket,FOLLOW_OBracket_in_indexes1443);  
					stream_OBracket.add(char_literal157);

					pushFollow(FOLLOW_expression_in_indexes1445);
					expression158=expression();
					state._fsp--;

					stream_expression.add(expression158.getTree());
					char_literal159=(Token)match(input,CBracket,FOLLOW_CBracket_in_indexes1447);  
					stream_CBracket.add(char_literal159);

					}
					break;

				default :
					if ( cnt32 >= 1 ) break loop32;
					EarlyExitException eee = new EarlyExitException(32, input);
					throw eee;
				}
				cnt32++;
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
			// 233:28: -> ^( INDEXES ( expression )+ )
			{
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\DCL\\DataCentricDSL.g:233:31: ^( INDEXES ( expression )+ )
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



	public static final BitSet FOLLOW_block_in_program149 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program151 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_block170 = new BitSet(new long[]{0x4980001820000082L,0x00000000000003A0L});
	public static final BitSet FOLLOW_functionDecl_in_block174 = new BitSet(new long[]{0x4980001820000082L,0x00000000000003A0L});
	public static final BitSet FOLLOW_Return_in_block179 = new BitSet(new long[]{0x001B000804000400L,0x0000000000000203L});
	public static final BitSet FOLLOW_expression_in_block181 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_SColon_in_block183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_statement225 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_SColon_in_statement227 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incrementation_in_statement240 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_SColon_in_statement242 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_statement253 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_SColon_in_statement255 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_statement266 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forStatement_in_statement273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStatement_in_statement280 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_query_in_statement287 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_SColon_in_statement289 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_73_in_query306 = new BitSet(new long[]{0x001B000804000400L,0x0000000000000203L});
	public static final BitSet FOLLOW_expression_in_query310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_variableCall321 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_assignment333 = new BitSet(new long[]{0x0008000000000100L});
	public static final BitSet FOLLOW_indexes_in_assignment335 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Assign_in_assignment338 = new BitSet(new long[]{0x001B000804000400L,0x0000000000000203L});
	public static final BitSet FOLLOW_expression_in_assignment340 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_72_in_assignment359 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_Identifier_in_assignment361 = new BitSet(new long[]{0x0008000000000100L});
	public static final BitSet FOLLOW_indexes_in_assignment363 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Assign_in_assignment366 = new BitSet(new long[]{0x001B000804000400L,0x0000000000000203L});
	public static final BitSet FOLLOW_expression_in_assignment368 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_functionCall397 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall399 = new BitSet(new long[]{0x001B000804002400L,0x0000000000000203L});
	public static final BitSet FOLLOW_exprList_in_functionCall401 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CParen_in_functionCall404 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Println_in_functionCall422 = new BitSet(new long[]{0x001B000804000400L,0x0000000000000203L});
	public static final BitSet FOLLOW_expression_in_functionCall425 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Print_in_functionCall445 = new BitSet(new long[]{0x001B000804000400L,0x0000000000000203L});
	public static final BitSet FOLLOW_expression_in_functionCall447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Assert_in_functionCall468 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall470 = new BitSet(new long[]{0x001B000804000400L,0x0000000000000203L});
	public static final BitSet FOLLOW_expression_in_functionCall472 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CParen_in_functionCall474 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Size_in_functionCall494 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall496 = new BitSet(new long[]{0x001B000804000400L,0x0000000000000203L});
	public static final BitSet FOLLOW_expression_in_functionCall498 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CParen_in_functionCall500 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStat_in_ifStatement529 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_elseIfStat_in_ifStatement531 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_elseStat_in_ifStatement534 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_If_in_ifStat563 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_OParen_in_ifStat565 = new BitSet(new long[]{0x001B000804000400L,0x0000000000000203L});
	public static final BitSet FOLLOW_expression_in_ifStat567 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CParen_in_ifStat569 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_OBrace_in_ifStat571 = new BitSet(new long[]{0x4980001820000880L,0x00000000000003A0L});
	public static final BitSet FOLLOW_block_in_ifStat573 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CBrace_in_ifStat575 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Else_in_elseIfStat599 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_If_in_elseIfStat601 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_OParen_in_elseIfStat603 = new BitSet(new long[]{0x001B000804000400L,0x0000000000000203L});
	public static final BitSet FOLLOW_expression_in_elseIfStat605 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CParen_in_elseIfStat607 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_OBrace_in_elseIfStat609 = new BitSet(new long[]{0x4980001820000880L,0x00000000000003A0L});
	public static final BitSet FOLLOW_block_in_elseIfStat611 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CBrace_in_elseIfStat613 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Else_in_elseStat637 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_OBrace_in_elseStat639 = new BitSet(new long[]{0x4980001820000880L,0x00000000000003A0L});
	public static final BitSet FOLLOW_block_in_elseStat641 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CBrace_in_elseStat643 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_71_in_functionDecl665 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_Identifier_in_functionDecl667 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_OParen_in_functionDecl669 = new BitSet(new long[]{0x0000000800002000L});
	public static final BitSet FOLLOW_idList_in_functionDecl671 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CParen_in_functionDecl674 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_OBrace_in_functionDecl676 = new BitSet(new long[]{0x4980001820000880L,0x00000000000003A0L});
	public static final BitSet FOLLOW_block_in_functionDecl678 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CBrace_in_functionDecl680 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_For_in_forStatement702 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_OParen_in_forStatement704 = new BitSet(new long[]{0x0000000800000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_assignment_in_forStatement706 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_SColon_in_forStatement708 = new BitSet(new long[]{0x001B000804000400L,0x0000000000000203L});
	public static final BitSet FOLLOW_expression_in_forStatement710 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_SColon_in_forStatement712 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_afterthought_in_forStatement714 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CParen_in_forStatement716 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_OBrace_in_forStatement718 = new BitSet(new long[]{0x4980001820000880L,0x00000000000003A0L});
	public static final BitSet FOLLOW_block_in_forStatement720 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CBrace_in_forStatement722 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_afterthought754 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Assign_in_afterthought756 = new BitSet(new long[]{0x001B000804000400L,0x0000000000000203L});
	public static final BitSet FOLLOW_expression_in_afterthought758 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incrementation_in_afterthought763 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_While_in_whileStatement775 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_OParen_in_whileStatement777 = new BitSet(new long[]{0x001B000804000400L,0x0000000000000203L});
	public static final BitSet FOLLOW_expression_in_whileStatement779 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CParen_in_whileStatement781 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_OBrace_in_whileStatement783 = new BitSet(new long[]{0x4980001820000880L,0x00000000000003A0L});
	public static final BitSet FOLLOW_block_in_whileStatement785 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CBrace_in_whileStatement787 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_idList811 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_Comma_in_idList814 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_Identifier_in_idList816 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_expression_in_exprList841 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_Comma_in_exprList844 = new BitSet(new long[]{0x001B000804000400L,0x0000000000000203L});
	public static final BitSet FOLLOW_expression_in_exprList846 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_condExpr_in_expression871 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_query_in_expression875 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableCall_in_incrementation888 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_set_in_incrementation890 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_orExpr_in_condExpr907 = new BitSet(new long[]{0x0200002000000002L});
	public static final BitSet FOLLOW_QMark_in_condExpr922 = new BitSet(new long[]{0x001B000804000400L,0x0000000000000203L});
	public static final BitSet FOLLOW_expression_in_condExpr926 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_Colon_in_condExpr928 = new BitSet(new long[]{0x001B000804000400L,0x0000000000000203L});
	public static final BitSet FOLLOW_expression_in_condExpr932 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_In_in_condExpr955 = new BitSet(new long[]{0x001B000804000400L,0x0000000000000203L});
	public static final BitSet FOLLOW_expression_in_condExpr957 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_andExpr_in_orExpr1009 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_Or_in_orExpr1012 = new BitSet(new long[]{0x001B000804000400L,0x0000000000000003L});
	public static final BitSet FOLLOW_andExpr_in_orExpr1015 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_equExpr_in_andExpr1031 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_And_in_andExpr1034 = new BitSet(new long[]{0x001B000804000400L,0x0000000000000003L});
	public static final BitSet FOLLOW_equExpr_in_andExpr1037 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_relExpr_in_equExpr1053 = new BitSet(new long[]{0x0000800002000002L});
	public static final BitSet FOLLOW_set_in_equExpr1056 = new BitSet(new long[]{0x001B000804000400L,0x0000000000000003L});
	public static final BitSet FOLLOW_relExpr_in_equExpr1065 = new BitSet(new long[]{0x0000800002000002L});
	public static final BitSet FOLLOW_addExpr_in_relExpr1081 = new BitSet(new long[]{0x00000C00C0000002L});
	public static final BitSet FOLLOW_set_in_relExpr1084 = new BitSet(new long[]{0x001B000804000400L,0x0000000000000003L});
	public static final BitSet FOLLOW_addExpr_in_relExpr1101 = new BitSet(new long[]{0x00000C00C0000002L});
	public static final BitSet FOLLOW_mulExpr_in_addExpr1117 = new BitSet(new long[]{0x0000000000000022L,0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_addExpr1120 = new BitSet(new long[]{0x001B000804000400L,0x0000000000000003L});
	public static final BitSet FOLLOW_mulExpr_in_addExpr1129 = new BitSet(new long[]{0x0000000000000022L,0x0000000000000002L});
	public static final BitSet FOLLOW_powExpr_in_mulExpr1145 = new BitSet(new long[]{0x0000300000080002L});
	public static final BitSet FOLLOW_set_in_mulExpr1148 = new BitSet(new long[]{0x001B000804000400L,0x0000000000000003L});
	public static final BitSet FOLLOW_powExpr_in_mulExpr1161 = new BitSet(new long[]{0x0000300000080002L});
	public static final BitSet FOLLOW_unaryExpr_in_powExpr1177 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_Pow_in_powExpr1180 = new BitSet(new long[]{0x001B000804000400L,0x0000000000000003L});
	public static final BitSet FOLLOW_unaryExpr_in_powExpr1183 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_Subtract_in_unaryExpr1201 = new BitSet(new long[]{0x001B000800000400L,0x0000000000000001L});
	public static final BitSet FOLLOW_atom_in_unaryExpr1203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Excl_in_unaryExpr1218 = new BitSet(new long[]{0x001B000800000400L,0x0000000000000001L});
	public static final BitSet FOLLOW_atom_in_unaryExpr1220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_unaryExpr1235 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Number_in_atom1249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Bool_in_atom1256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Null_in_atom1263 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lookup_in_atom1270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OBracket_in_list1284 = new BitSet(new long[]{0x001B000804001400L,0x0000000000000203L});
	public static final BitSet FOLLOW_exprList_in_list1286 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CBracket_in_list1289 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_list_in_lookup1313 = new BitSet(new long[]{0x0008000000000002L});
	public static final BitSet FOLLOW_indexes_in_lookup1315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_lookup1348 = new BitSet(new long[]{0x0008000000000002L});
	public static final BitSet FOLLOW_indexes_in_lookup1350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_String_in_lookup1377 = new BitSet(new long[]{0x0008000000000002L});
	public static final BitSet FOLLOW_indexes_in_lookup1379 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OParen_in_lookup1410 = new BitSet(new long[]{0x001B000804000400L,0x0000000000000203L});
	public static final BitSet FOLLOW_expression_in_lookup1412 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CParen_in_lookup1414 = new BitSet(new long[]{0x0008000000000002L});
	public static final BitSet FOLLOW_indexes_in_lookup1416 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OBracket_in_indexes1443 = new BitSet(new long[]{0x001B000804000400L,0x0000000000000203L});
	public static final BitSet FOLLOW_expression_in_indexes1445 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CBracket_in_indexes1447 = new BitSet(new long[]{0x0008000000000002L});
}
