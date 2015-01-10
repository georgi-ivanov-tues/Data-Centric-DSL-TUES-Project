// $ANTLR 3.5.2 D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g 2015-01-10 22:55:01

  package org.dataCentricDSL;
  import org.dataCentricDSL.*; 
  import java.util.Map;
  import java.util.HashMap;


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
	@Override public String getGrammarFileName() { return "D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g"; }


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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:79:1: program : block EOF -> block ;
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
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:80:3: ( block EOF -> block )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:80:6: block EOF
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
			// 80:16: -> block
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:83:1: block : ( statement | functionDecl )* ( Return expression ';' )? -> ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) ;
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
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:84:3: ( ( statement | functionDecl )* ( Return expression ';' )? -> ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:84:6: ( statement | functionDecl )* ( Return expression ';' )?
			{
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:84:6: ( statement | functionDecl )*
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:84:7: statement
					{
					pushFollow(FOLLOW_statement_in_block170);
					statement3=statement();
					state._fsp--;

					stream_statement.add(statement3.getTree());
					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:84:19: functionDecl
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

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:84:34: ( Return expression ';' )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==Return) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:84:35: Return expression ';'
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
			// 85:6: -> ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) )
			{
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:85:9: ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:85:17: ^( STATEMENTS ( statement )* )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(STATEMENTS, "STATEMENTS"), root_2);
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:85:30: ( statement )*
				while ( stream_statement.hasNext() ) {
					adaptor.addChild(root_2, stream_statement.nextTree());
				}
				stream_statement.reset();

				adaptor.addChild(root_1, root_2);
				}

				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:85:42: ^( RETURN ( expression )? )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(RETURN, "RETURN"), root_2);
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:85:51: ( expression )?
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:88:1: statement : ( assignment ';' -> assignment | incrementation ';' -> incrementation | functionCall ';' -> functionCall | ifStatement | forStatement | whileStatement | query ';' -> query );
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
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:89:3: ( assignment ';' -> assignment | incrementation ';' -> incrementation | functionCall ';' -> functionCall | ifStatement | forStatement | whileStatement | query ';' -> query )
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:89:6: assignment ';'
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
					// 89:23: -> assignment
					{
						adaptor.addChild(root_0, stream_assignment.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:90:6: incrementation ';'
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
					// 90:25: -> incrementation
					{
						adaptor.addChild(root_0, stream_incrementation.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:91:6: functionCall ';'
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
					// 91:23: -> functionCall
					{
						adaptor.addChild(root_0, stream_functionCall.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:92:6: ifStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_ifStatement_in_statement266);
					ifStatement14=ifStatement();
					state._fsp--;

					adaptor.addChild(root_0, ifStatement14.getTree());

					}
					break;
				case 5 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:93:6: forStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_forStatement_in_statement273);
					forStatement15=forStatement();
					state._fsp--;

					adaptor.addChild(root_0, forStatement15.getTree());

					}
					break;
				case 6 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:94:6: whileStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_whileStatement_in_statement280);
					whileStatement16=whileStatement();
					state._fsp--;

					adaptor.addChild(root_0, whileStatement16.getTree());

					}
					break;
				case 7 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:95:6: query ';'
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
					// 95:16: -> query
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:98:1: query : 'query' ^ ( String | variableCall ) ;
	public final DataCentricDSLParser.query_return query() throws RecognitionException {
		DataCentricDSLParser.query_return retval = new DataCentricDSLParser.query_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal19=null;
		Token String20=null;
		ParserRuleReturnScope variableCall21 =null;

		Object string_literal19_tree=null;
		Object String20_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:98:6: ( 'query' ^ ( String | variableCall ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:99:3: 'query' ^ ( String | variableCall )
			{
			root_0 = (Object)adaptor.nil();


			string_literal19=(Token)match(input,73,FOLLOW_73_in_query306); 
			string_literal19_tree = (Object)adaptor.create(string_literal19);
			root_0 = (Object)adaptor.becomeRoot(string_literal19_tree, root_0);

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:99:12: ( String | variableCall )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==String) ) {
				alt4=1;
			}
			else if ( (LA4_0==Identifier) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:99:13: String
					{
					String20=(Token)match(input,String,FOLLOW_String_in_query310); 
					String20_tree = (Object)adaptor.create(String20);
					adaptor.addChild(root_0, String20_tree);

					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:99:22: variableCall
					{
					pushFollow(FOLLOW_variableCall_in_query314);
					variableCall21=variableCall();
					state._fsp--;

					adaptor.addChild(root_0, variableCall21.getTree());

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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:102:1: variableCall : Identifier ;
	public final DataCentricDSLParser.variableCall_return variableCall() throws RecognitionException {
		DataCentricDSLParser.variableCall_return retval = new DataCentricDSLParser.variableCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier22=null;

		Object Identifier22_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:102:13: ( Identifier )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:103:3: Identifier
			{
			root_0 = (Object)adaptor.nil();


			Identifier22=(Token)match(input,Identifier,FOLLOW_Identifier_in_variableCall325); 
			Identifier22_tree = (Object)adaptor.create(Identifier22);
			adaptor.addChild(root_0, Identifier22_tree);

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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:106:1: assignment : ( Identifier ( indexes )? '=' expression -> ^( ASSIGNMENT Identifier ( indexes )? expression ) | 'global' Identifier ( indexes )? '=' expression -> ^( 'global' ASSIGNMENT Identifier ( indexes )? expression ) );
	public final DataCentricDSLParser.assignment_return assignment() throws RecognitionException {
		DataCentricDSLParser.assignment_return retval = new DataCentricDSLParser.assignment_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier23=null;
		Token char_literal25=null;
		Token string_literal27=null;
		Token Identifier28=null;
		Token char_literal30=null;
		ParserRuleReturnScope indexes24 =null;
		ParserRuleReturnScope expression26 =null;
		ParserRuleReturnScope indexes29 =null;
		ParserRuleReturnScope expression31 =null;

		Object Identifier23_tree=null;
		Object char_literal25_tree=null;
		Object string_literal27_tree=null;
		Object Identifier28_tree=null;
		Object char_literal30_tree=null;
		RewriteRuleTokenStream stream_Assign=new RewriteRuleTokenStream(adaptor,"token Assign");
		RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_indexes=new RewriteRuleSubtreeStream(adaptor,"rule indexes");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:107:3: ( Identifier ( indexes )? '=' expression -> ^( ASSIGNMENT Identifier ( indexes )? expression ) | 'global' Identifier ( indexes )? '=' expression -> ^( 'global' ASSIGNMENT Identifier ( indexes )? expression ) )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==Identifier) ) {
				alt7=1;
			}
			else if ( (LA7_0==72) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:107:6: Identifier ( indexes )? '=' expression
					{
					Identifier23=(Token)match(input,Identifier,FOLLOW_Identifier_in_assignment337);  
					stream_Identifier.add(Identifier23);

					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:107:17: ( indexes )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==OBracket) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:107:17: indexes
							{
							pushFollow(FOLLOW_indexes_in_assignment339);
							indexes24=indexes();
							state._fsp--;

							stream_indexes.add(indexes24.getTree());
							}
							break;

					}

					char_literal25=(Token)match(input,Assign,FOLLOW_Assign_in_assignment342);  
					stream_Assign.add(char_literal25);

					pushFollow(FOLLOW_expression_in_assignment344);
					expression26=expression();
					state._fsp--;

					stream_expression.add(expression26.getTree());
					// AST REWRITE
					// elements: expression, Identifier, indexes
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 107:41: -> ^( ASSIGNMENT Identifier ( indexes )? expression )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:107:44: ^( ASSIGNMENT Identifier ( indexes )? expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ASSIGNMENT, "ASSIGNMENT"), root_1);
						adaptor.addChild(root_1, stream_Identifier.nextNode());
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:107:68: ( indexes )?
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:108:5: 'global' Identifier ( indexes )? '=' expression
					{
					string_literal27=(Token)match(input,72,FOLLOW_72_in_assignment363);  
					stream_72.add(string_literal27);

					Identifier28=(Token)match(input,Identifier,FOLLOW_Identifier_in_assignment365);  
					stream_Identifier.add(Identifier28);

					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:108:25: ( indexes )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==OBracket) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:108:25: indexes
							{
							pushFollow(FOLLOW_indexes_in_assignment367);
							indexes29=indexes();
							state._fsp--;

							stream_indexes.add(indexes29.getTree());
							}
							break;

					}

					char_literal30=(Token)match(input,Assign,FOLLOW_Assign_in_assignment370);  
					stream_Assign.add(char_literal30);

					pushFollow(FOLLOW_expression_in_assignment372);
					expression31=expression();
					state._fsp--;

					stream_expression.add(expression31.getTree());
					// AST REWRITE
					// elements: indexes, Identifier, 72, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 108:49: -> ^( 'global' ASSIGNMENT Identifier ( indexes )? expression )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:108:52: ^( 'global' ASSIGNMENT Identifier ( indexes )? expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_72.nextNode(), root_1);
						adaptor.addChild(root_1, (Object)adaptor.create(ASSIGNMENT, "ASSIGNMENT"));
						adaptor.addChild(root_1, stream_Identifier.nextNode());
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:108:85: ( indexes )?
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:111:1: functionCall : ( Identifier '(' ( exprList )? ')' -> ^( FUNC_CALL Identifier ( exprList )? ) | Println expression -> ^( FUNC_CALL Println expression ) | Print expression -> ^( FUNC_CALL Print expression ) | Assert '(' expression ')' -> ^( FUNC_CALL Assert expression ) | Size '(' expression ')' -> ^( FUNC_CALL Size expression ) );
	public final DataCentricDSLParser.functionCall_return functionCall() throws RecognitionException {
		DataCentricDSLParser.functionCall_return retval = new DataCentricDSLParser.functionCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier32=null;
		Token char_literal33=null;
		Token char_literal35=null;
		Token Println36=null;
		Token Print38=null;
		Token Assert40=null;
		Token char_literal41=null;
		Token char_literal43=null;
		Token Size44=null;
		Token char_literal45=null;
		Token char_literal47=null;
		ParserRuleReturnScope exprList34 =null;
		ParserRuleReturnScope expression37 =null;
		ParserRuleReturnScope expression39 =null;
		ParserRuleReturnScope expression42 =null;
		ParserRuleReturnScope expression46 =null;

		Object Identifier32_tree=null;
		Object char_literal33_tree=null;
		Object char_literal35_tree=null;
		Object Println36_tree=null;
		Object Print38_tree=null;
		Object Assert40_tree=null;
		Object char_literal41_tree=null;
		Object char_literal43_tree=null;
		Object Size44_tree=null;
		Object char_literal45_tree=null;
		Object char_literal47_tree=null;
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
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:112:3: ( Identifier '(' ( exprList )? ')' -> ^( FUNC_CALL Identifier ( exprList )? ) | Println expression -> ^( FUNC_CALL Println expression ) | Print expression -> ^( FUNC_CALL Print expression ) | Assert '(' expression ')' -> ^( FUNC_CALL Assert expression ) | Size '(' expression ')' -> ^( FUNC_CALL Size expression ) )
			int alt9=5;
			switch ( input.LA(1) ) {
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
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:112:6: Identifier '(' ( exprList )? ')'
					{
					Identifier32=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionCall401);  
					stream_Identifier.add(Identifier32);

					char_literal33=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall403);  
					stream_OParen.add(char_literal33);

					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:112:21: ( exprList )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==Bool||LA8_0==Excl||LA8_0==Identifier||(LA8_0 >= Null && LA8_0 <= Number)||(LA8_0 >= OBracket && LA8_0 <= OParen)||(LA8_0 >= String && LA8_0 <= Subtract)||LA8_0==73) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:112:21: exprList
							{
							pushFollow(FOLLOW_exprList_in_functionCall405);
							exprList34=exprList();
							state._fsp--;

							stream_exprList.add(exprList34.getTree());
							}
							break;

					}

					char_literal35=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall408);  
					stream_CParen.add(char_literal35);

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
					// 112:35: -> ^( FUNC_CALL Identifier ( exprList )? )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:112:38: ^( FUNC_CALL Identifier ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Identifier.nextNode());
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:112:61: ( exprList )?
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:113:6: Println expression
					{
					Println36=(Token)match(input,Println,FOLLOW_Println_in_functionCall426);  
					stream_Println.add(Println36);

					pushFollow(FOLLOW_expression_in_functionCall429);
					expression37=expression();
					state._fsp--;

					stream_expression.add(expression37.getTree());
					// AST REWRITE
					// elements: expression, Println
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 113:29: -> ^( FUNC_CALL Println expression )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:113:32: ^( FUNC_CALL Println expression )
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:114:6: Print expression
					{
					Print38=(Token)match(input,Print,FOLLOW_Print_in_functionCall449);  
					stream_Print.add(Print38);

					pushFollow(FOLLOW_expression_in_functionCall451);
					expression39=expression();
					state._fsp--;

					stream_expression.add(expression39.getTree());
					// AST REWRITE
					// elements: Print, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 114:27: -> ^( FUNC_CALL Print expression )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:114:30: ^( FUNC_CALL Print expression )
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:115:6: Assert '(' expression ')'
					{
					Assert40=(Token)match(input,Assert,FOLLOW_Assert_in_functionCall472);  
					stream_Assert.add(Assert40);

					char_literal41=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall474);  
					stream_OParen.add(char_literal41);

					pushFollow(FOLLOW_expression_in_functionCall476);
					expression42=expression();
					state._fsp--;

					stream_expression.add(expression42.getTree());
					char_literal43=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall478);  
					stream_CParen.add(char_literal43);

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
					// 115:35: -> ^( FUNC_CALL Assert expression )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:115:38: ^( FUNC_CALL Assert expression )
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:116:6: Size '(' expression ')'
					{
					Size44=(Token)match(input,Size,FOLLOW_Size_in_functionCall498);  
					stream_Size.add(Size44);

					char_literal45=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall500);  
					stream_OParen.add(char_literal45);

					pushFollow(FOLLOW_expression_in_functionCall502);
					expression46=expression();
					state._fsp--;

					stream_expression.add(expression46.getTree());
					char_literal47=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall504);  
					stream_CParen.add(char_literal47);

					// AST REWRITE
					// elements: expression, Size
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 116:35: -> ^( FUNC_CALL Size expression )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:116:38: ^( FUNC_CALL Size expression )
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:119:1: ifStatement : ifStat ( elseIfStat )* ( elseStat )? -> ^( IF ifStat ( elseIfStat )* ( elseStat )? ) ;
	public final DataCentricDSLParser.ifStatement_return ifStatement() throws RecognitionException {
		DataCentricDSLParser.ifStatement_return retval = new DataCentricDSLParser.ifStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope ifStat48 =null;
		ParserRuleReturnScope elseIfStat49 =null;
		ParserRuleReturnScope elseStat50 =null;

		RewriteRuleSubtreeStream stream_elseIfStat=new RewriteRuleSubtreeStream(adaptor,"rule elseIfStat");
		RewriteRuleSubtreeStream stream_ifStat=new RewriteRuleSubtreeStream(adaptor,"rule ifStat");
		RewriteRuleSubtreeStream stream_elseStat=new RewriteRuleSubtreeStream(adaptor,"rule elseStat");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:120:3: ( ifStat ( elseIfStat )* ( elseStat )? -> ^( IF ifStat ( elseIfStat )* ( elseStat )? ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:120:6: ifStat ( elseIfStat )* ( elseStat )?
			{
			pushFollow(FOLLOW_ifStat_in_ifStatement533);
			ifStat48=ifStat();
			state._fsp--;

			stream_ifStat.add(ifStat48.getTree());
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:120:13: ( elseIfStat )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==Else) ) {
					int LA10_1 = input.LA(2);
					if ( (LA10_1==If) ) {
						alt10=1;
					}

				}

				switch (alt10) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:120:13: elseIfStat
					{
					pushFollow(FOLLOW_elseIfStat_in_ifStatement535);
					elseIfStat49=elseIfStat();
					state._fsp--;

					stream_elseIfStat.add(elseIfStat49.getTree());
					}
					break;

				default :
					break loop10;
				}
			}

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:120:25: ( elseStat )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==Else) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:120:25: elseStat
					{
					pushFollow(FOLLOW_elseStat_in_ifStatement538);
					elseStat50=elseStat();
					state._fsp--;

					stream_elseStat.add(elseStat50.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: elseIfStat, elseStat, ifStat
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 120:35: -> ^( IF ifStat ( elseIfStat )* ( elseStat )? )
			{
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:120:38: ^( IF ifStat ( elseIfStat )* ( elseStat )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);
				adaptor.addChild(root_1, stream_ifStat.nextTree());
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:120:50: ( elseIfStat )*
				while ( stream_elseIfStat.hasNext() ) {
					adaptor.addChild(root_1, stream_elseIfStat.nextTree());
				}
				stream_elseIfStat.reset();

				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:120:62: ( elseStat )?
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:123:1: ifStat : If '(' expression ')' '{' block '}' -> ^( EXP expression block ) ;
	public final DataCentricDSLParser.ifStat_return ifStat() throws RecognitionException {
		DataCentricDSLParser.ifStat_return retval = new DataCentricDSLParser.ifStat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token If51=null;
		Token char_literal52=null;
		Token char_literal54=null;
		Token char_literal55=null;
		Token char_literal57=null;
		ParserRuleReturnScope expression53 =null;
		ParserRuleReturnScope block56 =null;

		Object If51_tree=null;
		Object char_literal52_tree=null;
		Object char_literal54_tree=null;
		Object char_literal55_tree=null;
		Object char_literal57_tree=null;
		RewriteRuleTokenStream stream_OBrace=new RewriteRuleTokenStream(adaptor,"token OBrace");
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_If=new RewriteRuleTokenStream(adaptor,"token If");
		RewriteRuleTokenStream stream_CBrace=new RewriteRuleTokenStream(adaptor,"token CBrace");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:124:3: ( If '(' expression ')' '{' block '}' -> ^( EXP expression block ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:124:6: If '(' expression ')' '{' block '}'
			{
			If51=(Token)match(input,If,FOLLOW_If_in_ifStat567);  
			stream_If.add(If51);

			char_literal52=(Token)match(input,OParen,FOLLOW_OParen_in_ifStat569);  
			stream_OParen.add(char_literal52);

			pushFollow(FOLLOW_expression_in_ifStat571);
			expression53=expression();
			state._fsp--;

			stream_expression.add(expression53.getTree());
			char_literal54=(Token)match(input,CParen,FOLLOW_CParen_in_ifStat573);  
			stream_CParen.add(char_literal54);

			char_literal55=(Token)match(input,OBrace,FOLLOW_OBrace_in_ifStat575);  
			stream_OBrace.add(char_literal55);

			pushFollow(FOLLOW_block_in_ifStat577);
			block56=block();
			state._fsp--;

			stream_block.add(block56.getTree());
			char_literal57=(Token)match(input,CBrace,FOLLOW_CBrace_in_ifStat579);  
			stream_CBrace.add(char_literal57);

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
			// 124:42: -> ^( EXP expression block )
			{
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:124:45: ^( EXP expression block )
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:127:1: elseIfStat : Else If '(' expression ')' '{' block '}' -> ^( EXP expression block ) ;
	public final DataCentricDSLParser.elseIfStat_return elseIfStat() throws RecognitionException {
		DataCentricDSLParser.elseIfStat_return retval = new DataCentricDSLParser.elseIfStat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Else58=null;
		Token If59=null;
		Token char_literal60=null;
		Token char_literal62=null;
		Token char_literal63=null;
		Token char_literal65=null;
		ParserRuleReturnScope expression61 =null;
		ParserRuleReturnScope block64 =null;

		Object Else58_tree=null;
		Object If59_tree=null;
		Object char_literal60_tree=null;
		Object char_literal62_tree=null;
		Object char_literal63_tree=null;
		Object char_literal65_tree=null;
		RewriteRuleTokenStream stream_OBrace=new RewriteRuleTokenStream(adaptor,"token OBrace");
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_Else=new RewriteRuleTokenStream(adaptor,"token Else");
		RewriteRuleTokenStream stream_If=new RewriteRuleTokenStream(adaptor,"token If");
		RewriteRuleTokenStream stream_CBrace=new RewriteRuleTokenStream(adaptor,"token CBrace");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:128:3: ( Else If '(' expression ')' '{' block '}' -> ^( EXP expression block ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:128:6: Else If '(' expression ')' '{' block '}'
			{
			Else58=(Token)match(input,Else,FOLLOW_Else_in_elseIfStat603);  
			stream_Else.add(Else58);

			If59=(Token)match(input,If,FOLLOW_If_in_elseIfStat605);  
			stream_If.add(If59);

			char_literal60=(Token)match(input,OParen,FOLLOW_OParen_in_elseIfStat607);  
			stream_OParen.add(char_literal60);

			pushFollow(FOLLOW_expression_in_elseIfStat609);
			expression61=expression();
			state._fsp--;

			stream_expression.add(expression61.getTree());
			char_literal62=(Token)match(input,CParen,FOLLOW_CParen_in_elseIfStat611);  
			stream_CParen.add(char_literal62);

			char_literal63=(Token)match(input,OBrace,FOLLOW_OBrace_in_elseIfStat613);  
			stream_OBrace.add(char_literal63);

			pushFollow(FOLLOW_block_in_elseIfStat615);
			block64=block();
			state._fsp--;

			stream_block.add(block64.getTree());
			char_literal65=(Token)match(input,CBrace,FOLLOW_CBrace_in_elseIfStat617);  
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
			// 128:47: -> ^( EXP expression block )
			{
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:128:50: ^( EXP expression block )
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:131:1: elseStat : Else '{' block '}' -> ^( EXP block ) ;
	public final DataCentricDSLParser.elseStat_return elseStat() throws RecognitionException {
		DataCentricDSLParser.elseStat_return retval = new DataCentricDSLParser.elseStat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Else66=null;
		Token char_literal67=null;
		Token char_literal69=null;
		ParserRuleReturnScope block68 =null;

		Object Else66_tree=null;
		Object char_literal67_tree=null;
		Object char_literal69_tree=null;
		RewriteRuleTokenStream stream_OBrace=new RewriteRuleTokenStream(adaptor,"token OBrace");
		RewriteRuleTokenStream stream_Else=new RewriteRuleTokenStream(adaptor,"token Else");
		RewriteRuleTokenStream stream_CBrace=new RewriteRuleTokenStream(adaptor,"token CBrace");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:132:3: ( Else '{' block '}' -> ^( EXP block ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:132:6: Else '{' block '}'
			{
			Else66=(Token)match(input,Else,FOLLOW_Else_in_elseStat641);  
			stream_Else.add(Else66);

			char_literal67=(Token)match(input,OBrace,FOLLOW_OBrace_in_elseStat643);  
			stream_OBrace.add(char_literal67);

			pushFollow(FOLLOW_block_in_elseStat645);
			block68=block();
			state._fsp--;

			stream_block.add(block68.getTree());
			char_literal69=(Token)match(input,CBrace,FOLLOW_CBrace_in_elseStat647);  
			stream_CBrace.add(char_literal69);

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
			// 132:25: -> ^( EXP block )
			{
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:132:28: ^( EXP block )
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:135:1: functionDecl : 'func' Identifier '(' ( idList )? ')' '{' block '}' ;
	public final DataCentricDSLParser.functionDecl_return functionDecl() throws RecognitionException {
		DataCentricDSLParser.functionDecl_return retval = new DataCentricDSLParser.functionDecl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal70=null;
		Token Identifier71=null;
		Token char_literal72=null;
		Token char_literal74=null;
		Token char_literal75=null;
		Token char_literal77=null;
		ParserRuleReturnScope idList73 =null;
		ParserRuleReturnScope block76 =null;

		Object string_literal70_tree=null;
		Object Identifier71_tree=null;
		Object char_literal72_tree=null;
		Object char_literal74_tree=null;
		Object char_literal75_tree=null;
		Object char_literal77_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:136:3: ( 'func' Identifier '(' ( idList )? ')' '{' block '}' )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:136:6: 'func' Identifier '(' ( idList )? ')' '{' block '}'
			{
			root_0 = (Object)adaptor.nil();


			string_literal70=(Token)match(input,71,FOLLOW_71_in_functionDecl669); 
			string_literal70_tree = (Object)adaptor.create(string_literal70);
			adaptor.addChild(root_0, string_literal70_tree);

			Identifier71=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionDecl671); 
			Identifier71_tree = (Object)adaptor.create(Identifier71);
			adaptor.addChild(root_0, Identifier71_tree);

			char_literal72=(Token)match(input,OParen,FOLLOW_OParen_in_functionDecl673); 
			char_literal72_tree = (Object)adaptor.create(char_literal72);
			adaptor.addChild(root_0, char_literal72_tree);

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:136:28: ( idList )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==Identifier) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:136:28: idList
					{
					pushFollow(FOLLOW_idList_in_functionDecl675);
					idList73=idList();
					state._fsp--;

					adaptor.addChild(root_0, idList73.getTree());

					}
					break;

			}

			char_literal74=(Token)match(input,CParen,FOLLOW_CParen_in_functionDecl678); 
			char_literal74_tree = (Object)adaptor.create(char_literal74);
			adaptor.addChild(root_0, char_literal74_tree);

			char_literal75=(Token)match(input,OBrace,FOLLOW_OBrace_in_functionDecl680); 
			char_literal75_tree = (Object)adaptor.create(char_literal75);
			adaptor.addChild(root_0, char_literal75_tree);

			pushFollow(FOLLOW_block_in_functionDecl682);
			block76=block();
			state._fsp--;

			adaptor.addChild(root_0, block76.getTree());

			char_literal77=(Token)match(input,CBrace,FOLLOW_CBrace_in_functionDecl684); 
			char_literal77_tree = (Object)adaptor.create(char_literal77);
			adaptor.addChild(root_0, char_literal77_tree);

			defineFunction((Identifier71!=null?Identifier71.getText():null), (idList73!=null?((Object)idList73.getTree()):null), (block76!=null?((Object)block76.getTree()):null));
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:140:1: forStatement : ( For '(' assignment ';' expression ';' afterthought ')' '{' block '}' -> ^( For assignment expression afterthought block ) ) ;
	public final DataCentricDSLParser.forStatement_return forStatement() throws RecognitionException {
		DataCentricDSLParser.forStatement_return retval = new DataCentricDSLParser.forStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token For78=null;
		Token char_literal79=null;
		Token char_literal81=null;
		Token char_literal83=null;
		Token char_literal85=null;
		Token char_literal86=null;
		Token char_literal88=null;
		ParserRuleReturnScope assignment80 =null;
		ParserRuleReturnScope expression82 =null;
		ParserRuleReturnScope afterthought84 =null;
		ParserRuleReturnScope block87 =null;

		Object For78_tree=null;
		Object char_literal79_tree=null;
		Object char_literal81_tree=null;
		Object char_literal83_tree=null;
		Object char_literal85_tree=null;
		Object char_literal86_tree=null;
		Object char_literal88_tree=null;
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
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:141:3: ( ( For '(' assignment ';' expression ';' afterthought ')' '{' block '}' -> ^( For assignment expression afterthought block ) ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:141:6: ( For '(' assignment ';' expression ';' afterthought ')' '{' block '}' -> ^( For assignment expression afterthought block ) )
			{
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:141:6: ( For '(' assignment ';' expression ';' afterthought ')' '{' block '}' -> ^( For assignment expression afterthought block ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:141:7: For '(' assignment ';' expression ';' afterthought ')' '{' block '}'
			{
			For78=(Token)match(input,For,FOLLOW_For_in_forStatement707);  
			stream_For.add(For78);

			char_literal79=(Token)match(input,OParen,FOLLOW_OParen_in_forStatement709);  
			stream_OParen.add(char_literal79);

			pushFollow(FOLLOW_assignment_in_forStatement711);
			assignment80=assignment();
			state._fsp--;

			stream_assignment.add(assignment80.getTree());
			char_literal81=(Token)match(input,SColon,FOLLOW_SColon_in_forStatement713);  
			stream_SColon.add(char_literal81);

			pushFollow(FOLLOW_expression_in_forStatement715);
			expression82=expression();
			state._fsp--;

			stream_expression.add(expression82.getTree());
			char_literal83=(Token)match(input,SColon,FOLLOW_SColon_in_forStatement717);  
			stream_SColon.add(char_literal83);

			pushFollow(FOLLOW_afterthought_in_forStatement719);
			afterthought84=afterthought();
			state._fsp--;

			stream_afterthought.add(afterthought84.getTree());
			char_literal85=(Token)match(input,CParen,FOLLOW_CParen_in_forStatement721);  
			stream_CParen.add(char_literal85);

			char_literal86=(Token)match(input,OBrace,FOLLOW_OBrace_in_forStatement723);  
			stream_OBrace.add(char_literal86);

			pushFollow(FOLLOW_block_in_forStatement725);
			block87=block();
			state._fsp--;

			stream_block.add(block87.getTree());
			char_literal88=(Token)match(input,CBrace,FOLLOW_CBrace_in_forStatement727);  
			stream_CBrace.add(char_literal88);

			// AST REWRITE
			// elements: block, expression, For, assignment, afterthought
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 142:6: -> ^( For assignment expression afterthought block )
			{
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:142:9: ^( For assignment expression afterthought block )
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:145:1: afterthought : ( ( Identifier '=' expression ) | incrementation );
	public final DataCentricDSLParser.afterthought_return afterthought() throws RecognitionException {
		DataCentricDSLParser.afterthought_return retval = new DataCentricDSLParser.afterthought_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier89=null;
		Token char_literal90=null;
		ParserRuleReturnScope expression91 =null;
		ParserRuleReturnScope incrementation92 =null;

		Object Identifier89_tree=null;
		Object char_literal90_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:145:13: ( ( Identifier '=' expression ) | incrementation )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==Identifier) ) {
				int LA13_1 = input.LA(2);
				if ( (LA13_1==Assign) ) {
					alt13=1;
				}
				else if ( (LA13_1==Increment||LA13_1==70) ) {
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:146:3: ( Identifier '=' expression )
					{
					root_0 = (Object)adaptor.nil();


					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:146:3: ( Identifier '=' expression )
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:146:4: Identifier '=' expression
					{
					Identifier89=(Token)match(input,Identifier,FOLLOW_Identifier_in_afterthought759); 
					Identifier89_tree = (Object)adaptor.create(Identifier89);
					adaptor.addChild(root_0, Identifier89_tree);

					char_literal90=(Token)match(input,Assign,FOLLOW_Assign_in_afterthought761); 
					char_literal90_tree = (Object)adaptor.create(char_literal90);
					adaptor.addChild(root_0, char_literal90_tree);

					pushFollow(FOLLOW_expression_in_afterthought763);
					expression91=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression91.getTree());

					}

					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:146:33: incrementation
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_incrementation_in_afterthought768);
					incrementation92=incrementation();
					state._fsp--;

					adaptor.addChild(root_0, incrementation92.getTree());

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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:149:1: whileStatement : While '(' expression ')' '{' block '}' -> ^( While expression block ) ;
	public final DataCentricDSLParser.whileStatement_return whileStatement() throws RecognitionException {
		DataCentricDSLParser.whileStatement_return retval = new DataCentricDSLParser.whileStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token While93=null;
		Token char_literal94=null;
		Token char_literal96=null;
		Token char_literal97=null;
		Token char_literal99=null;
		ParserRuleReturnScope expression95 =null;
		ParserRuleReturnScope block98 =null;

		Object While93_tree=null;
		Object char_literal94_tree=null;
		Object char_literal96_tree=null;
		Object char_literal97_tree=null;
		Object char_literal99_tree=null;
		RewriteRuleTokenStream stream_OBrace=new RewriteRuleTokenStream(adaptor,"token OBrace");
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_While=new RewriteRuleTokenStream(adaptor,"token While");
		RewriteRuleTokenStream stream_CBrace=new RewriteRuleTokenStream(adaptor,"token CBrace");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:150:3: ( While '(' expression ')' '{' block '}' -> ^( While expression block ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:150:6: While '(' expression ')' '{' block '}'
			{
			While93=(Token)match(input,While,FOLLOW_While_in_whileStatement780);  
			stream_While.add(While93);

			char_literal94=(Token)match(input,OParen,FOLLOW_OParen_in_whileStatement782);  
			stream_OParen.add(char_literal94);

			pushFollow(FOLLOW_expression_in_whileStatement784);
			expression95=expression();
			state._fsp--;

			stream_expression.add(expression95.getTree());
			char_literal96=(Token)match(input,CParen,FOLLOW_CParen_in_whileStatement786);  
			stream_CParen.add(char_literal96);

			char_literal97=(Token)match(input,OBrace,FOLLOW_OBrace_in_whileStatement788);  
			stream_OBrace.add(char_literal97);

			pushFollow(FOLLOW_block_in_whileStatement790);
			block98=block();
			state._fsp--;

			stream_block.add(block98.getTree());
			char_literal99=(Token)match(input,CBrace,FOLLOW_CBrace_in_whileStatement792);  
			stream_CBrace.add(char_literal99);

			// AST REWRITE
			// elements: expression, While, block
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 150:45: -> ^( While expression block )
			{
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:150:48: ^( While expression block )
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:153:1: idList : Identifier ( ',' Identifier )* -> ^( ID_LIST ( Identifier )+ ) ;
	public final DataCentricDSLParser.idList_return idList() throws RecognitionException {
		DataCentricDSLParser.idList_return retval = new DataCentricDSLParser.idList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier100=null;
		Token char_literal101=null;
		Token Identifier102=null;

		Object Identifier100_tree=null;
		Object char_literal101_tree=null;
		Object Identifier102_tree=null;
		RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:154:3: ( Identifier ( ',' Identifier )* -> ^( ID_LIST ( Identifier )+ ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:154:6: Identifier ( ',' Identifier )*
			{
			Identifier100=(Token)match(input,Identifier,FOLLOW_Identifier_in_idList816);  
			stream_Identifier.add(Identifier100);

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:154:17: ( ',' Identifier )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==Comma) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:154:18: ',' Identifier
					{
					char_literal101=(Token)match(input,Comma,FOLLOW_Comma_in_idList819);  
					stream_Comma.add(char_literal101);

					Identifier102=(Token)match(input,Identifier,FOLLOW_Identifier_in_idList821);  
					stream_Identifier.add(Identifier102);

					}
					break;

				default :
					break loop14;
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
			// 154:35: -> ^( ID_LIST ( Identifier )+ )
			{
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:154:38: ^( ID_LIST ( Identifier )+ )
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:157:1: exprList : expression ( ',' expression )* -> ^( EXP_LIST ( expression )+ ) ;
	public final DataCentricDSLParser.exprList_return exprList() throws RecognitionException {
		DataCentricDSLParser.exprList_return retval = new DataCentricDSLParser.exprList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal104=null;
		ParserRuleReturnScope expression103 =null;
		ParserRuleReturnScope expression105 =null;

		Object char_literal104_tree=null;
		RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:158:3: ( expression ( ',' expression )* -> ^( EXP_LIST ( expression )+ ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:158:6: expression ( ',' expression )*
			{
			pushFollow(FOLLOW_expression_in_exprList846);
			expression103=expression();
			state._fsp--;

			stream_expression.add(expression103.getTree());
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:158:17: ( ',' expression )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==Comma) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:158:18: ',' expression
					{
					char_literal104=(Token)match(input,Comma,FOLLOW_Comma_in_exprList849);  
					stream_Comma.add(char_literal104);

					pushFollow(FOLLOW_expression_in_exprList851);
					expression105=expression();
					state._fsp--;

					stream_expression.add(expression105.getTree());
					}
					break;

				default :
					break loop15;
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
			// 158:35: -> ^( EXP_LIST ( expression )+ )
			{
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:158:38: ^( EXP_LIST ( expression )+ )
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:161:1: expression : ( condExpr | query );
	public final DataCentricDSLParser.expression_return expression() throws RecognitionException {
		DataCentricDSLParser.expression_return retval = new DataCentricDSLParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope condExpr106 =null;
		ParserRuleReturnScope query107 =null;


		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:162:3: ( condExpr | query )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==Bool||LA16_0==Excl||LA16_0==Identifier||(LA16_0 >= Null && LA16_0 <= Number)||(LA16_0 >= OBracket && LA16_0 <= OParen)||(LA16_0 >= String && LA16_0 <= Subtract)) ) {
				alt16=1;
			}
			else if ( (LA16_0==73) ) {
				alt16=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:162:6: condExpr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_condExpr_in_expression876);
					condExpr106=condExpr();
					state._fsp--;

					adaptor.addChild(root_0, condExpr106.getTree());

					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:162:17: query
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_query_in_expression880);
					query107=query();
					state._fsp--;

					adaptor.addChild(root_0, query107.getTree());

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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:165:1: incrementation : variableCall ( '++' | '--' ) ;
	public final DataCentricDSLParser.incrementation_return incrementation() throws RecognitionException {
		DataCentricDSLParser.incrementation_return retval = new DataCentricDSLParser.incrementation_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set109=null;
		ParserRuleReturnScope variableCall108 =null;

		Object set109_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:166:3: ( variableCall ( '++' | '--' ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:166:5: variableCall ( '++' | '--' )
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_variableCall_in_incrementation893);
			variableCall108=variableCall();
			state._fsp--;

			adaptor.addChild(root_0, variableCall108.getTree());

			set109=input.LT(1);
			if ( input.LA(1)==Increment||input.LA(1)==70 ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set109));
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:169:1: condExpr : ( orExpr -> orExpr ) ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )? ;
	public final DataCentricDSLParser.condExpr_return condExpr() throws RecognitionException {
		DataCentricDSLParser.condExpr_return retval = new DataCentricDSLParser.condExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal111=null;
		Token char_literal112=null;
		Token In113=null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope orExpr110 =null;
		ParserRuleReturnScope expression114 =null;

		Object char_literal111_tree=null;
		Object char_literal112_tree=null;
		Object In113_tree=null;
		RewriteRuleTokenStream stream_In=new RewriteRuleTokenStream(adaptor,"token In");
		RewriteRuleTokenStream stream_Colon=new RewriteRuleTokenStream(adaptor,"token Colon");
		RewriteRuleTokenStream stream_QMark=new RewriteRuleTokenStream(adaptor,"token QMark");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_orExpr=new RewriteRuleSubtreeStream(adaptor,"rule orExpr");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:170:3: ( ( orExpr -> orExpr ) ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )? )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:170:6: ( orExpr -> orExpr ) ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )?
			{
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:170:6: ( orExpr -> orExpr )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:170:7: orExpr
			{
			pushFollow(FOLLOW_orExpr_in_condExpr912);
			orExpr110=orExpr();
			state._fsp--;

			stream_orExpr.add(orExpr110.getTree());
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
			// 170:14: -> orExpr
			{
				adaptor.addChild(root_0, stream_orExpr.nextTree());
			}


			retval.tree = root_0;

			}

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:171:6: ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )?
			int alt17=3;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==QMark) ) {
				alt17=1;
			}
			else if ( (LA17_0==In) ) {
				alt17=2;
			}
			switch (alt17) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:171:8: '?' a= expression ':' b= expression
					{
					char_literal111=(Token)match(input,QMark,FOLLOW_QMark_in_condExpr927);  
					stream_QMark.add(char_literal111);

					pushFollow(FOLLOW_expression_in_condExpr931);
					a=expression();
					state._fsp--;

					stream_expression.add(a.getTree());
					char_literal112=(Token)match(input,Colon,FOLLOW_Colon_in_condExpr933);  
					stream_Colon.add(char_literal112);

					pushFollow(FOLLOW_expression_in_condExpr937);
					b=expression();
					state._fsp--;

					stream_expression.add(b.getTree());
					// AST REWRITE
					// elements: a, orExpr, b
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
					// 171:42: -> ^( TERNARY orExpr $a $b)
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:171:45: ^( TERNARY orExpr $a $b)
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:172:8: In expression
					{
					In113=(Token)match(input,In,FOLLOW_In_in_condExpr960);  
					stream_In.add(In113);

					pushFollow(FOLLOW_expression_in_condExpr962);
					expression114=expression();
					state._fsp--;

					stream_expression.add(expression114.getTree());
					// AST REWRITE
					// elements: In, expression, orExpr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 172:42: -> ^( In orExpr expression )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:172:45: ^( In orExpr expression )
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:176:1: orExpr : andExpr ( '||' ^ andExpr )* ;
	public final DataCentricDSLParser.orExpr_return orExpr() throws RecognitionException {
		DataCentricDSLParser.orExpr_return retval = new DataCentricDSLParser.orExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal116=null;
		ParserRuleReturnScope andExpr115 =null;
		ParserRuleReturnScope andExpr117 =null;

		Object string_literal116_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:177:3: ( andExpr ( '||' ^ andExpr )* )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:177:6: andExpr ( '||' ^ andExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_andExpr_in_orExpr1014);
			andExpr115=andExpr();
			state._fsp--;

			adaptor.addChild(root_0, andExpr115.getTree());

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:177:14: ( '||' ^ andExpr )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==Or) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:177:15: '||' ^ andExpr
					{
					string_literal116=(Token)match(input,Or,FOLLOW_Or_in_orExpr1017); 
					string_literal116_tree = (Object)adaptor.create(string_literal116);
					root_0 = (Object)adaptor.becomeRoot(string_literal116_tree, root_0);

					pushFollow(FOLLOW_andExpr_in_orExpr1020);
					andExpr117=andExpr();
					state._fsp--;

					adaptor.addChild(root_0, andExpr117.getTree());

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
	// $ANTLR end "orExpr"


	public static class andExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "andExpr"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:180:1: andExpr : equExpr ( '&&' ^ equExpr )* ;
	public final DataCentricDSLParser.andExpr_return andExpr() throws RecognitionException {
		DataCentricDSLParser.andExpr_return retval = new DataCentricDSLParser.andExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal119=null;
		ParserRuleReturnScope equExpr118 =null;
		ParserRuleReturnScope equExpr120 =null;

		Object string_literal119_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:181:3: ( equExpr ( '&&' ^ equExpr )* )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:181:6: equExpr ( '&&' ^ equExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_equExpr_in_andExpr1036);
			equExpr118=equExpr();
			state._fsp--;

			adaptor.addChild(root_0, equExpr118.getTree());

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:181:14: ( '&&' ^ equExpr )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==And) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:181:15: '&&' ^ equExpr
					{
					string_literal119=(Token)match(input,And,FOLLOW_And_in_andExpr1039); 
					string_literal119_tree = (Object)adaptor.create(string_literal119);
					root_0 = (Object)adaptor.becomeRoot(string_literal119_tree, root_0);

					pushFollow(FOLLOW_equExpr_in_andExpr1042);
					equExpr120=equExpr();
					state._fsp--;

					adaptor.addChild(root_0, equExpr120.getTree());

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
	// $ANTLR end "andExpr"


	public static class equExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "equExpr"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:184:1: equExpr : relExpr ( ( '==' | '!=' ) ^ relExpr )* ;
	public final DataCentricDSLParser.equExpr_return equExpr() throws RecognitionException {
		DataCentricDSLParser.equExpr_return retval = new DataCentricDSLParser.equExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set122=null;
		ParserRuleReturnScope relExpr121 =null;
		ParserRuleReturnScope relExpr123 =null;

		Object set122_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:185:3: ( relExpr ( ( '==' | '!=' ) ^ relExpr )* )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:185:6: relExpr ( ( '==' | '!=' ) ^ relExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_relExpr_in_equExpr1058);
			relExpr121=relExpr();
			state._fsp--;

			adaptor.addChild(root_0, relExpr121.getTree());

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:185:14: ( ( '==' | '!=' ) ^ relExpr )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==Equals||LA20_0==NEquals) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:185:15: ( '==' | '!=' ) ^ relExpr
					{
					set122=input.LT(1);
					set122=input.LT(1);
					if ( input.LA(1)==Equals||input.LA(1)==NEquals ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set122), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_relExpr_in_equExpr1070);
					relExpr123=relExpr();
					state._fsp--;

					adaptor.addChild(root_0, relExpr123.getTree());

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
	// $ANTLR end "equExpr"


	public static class relExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "relExpr"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:188:1: relExpr : addExpr ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )* ;
	public final DataCentricDSLParser.relExpr_return relExpr() throws RecognitionException {
		DataCentricDSLParser.relExpr_return retval = new DataCentricDSLParser.relExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set125=null;
		ParserRuleReturnScope addExpr124 =null;
		ParserRuleReturnScope addExpr126 =null;

		Object set125_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:189:3: ( addExpr ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )* )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:189:6: addExpr ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_addExpr_in_relExpr1086);
			addExpr124=addExpr();
			state._fsp--;

			adaptor.addChild(root_0, addExpr124.getTree());

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:189:14: ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( ((LA21_0 >= GT && LA21_0 <= GTEquals)||(LA21_0 >= LT && LA21_0 <= LTEquals)) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:189:15: ( '>=' | '<=' | '>' | '<' ) ^ addExpr
					{
					set125=input.LT(1);
					set125=input.LT(1);
					if ( (input.LA(1) >= GT && input.LA(1) <= GTEquals)||(input.LA(1) >= LT && input.LA(1) <= LTEquals) ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set125), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_addExpr_in_relExpr1106);
					addExpr126=addExpr();
					state._fsp--;

					adaptor.addChild(root_0, addExpr126.getTree());

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
	// $ANTLR end "relExpr"


	public static class addExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "addExpr"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:192:1: addExpr : mulExpr ( ( '+' | '-' ) ^ mulExpr )* ;
	public final DataCentricDSLParser.addExpr_return addExpr() throws RecognitionException {
		DataCentricDSLParser.addExpr_return retval = new DataCentricDSLParser.addExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set128=null;
		ParserRuleReturnScope mulExpr127 =null;
		ParserRuleReturnScope mulExpr129 =null;

		Object set128_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:193:3: ( mulExpr ( ( '+' | '-' ) ^ mulExpr )* )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:193:6: mulExpr ( ( '+' | '-' ) ^ mulExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_mulExpr_in_addExpr1122);
			mulExpr127=mulExpr();
			state._fsp--;

			adaptor.addChild(root_0, mulExpr127.getTree());

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:193:14: ( ( '+' | '-' ) ^ mulExpr )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==Add||LA22_0==Subtract) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:193:15: ( '+' | '-' ) ^ mulExpr
					{
					set128=input.LT(1);
					set128=input.LT(1);
					if ( input.LA(1)==Add||input.LA(1)==Subtract ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set128), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_mulExpr_in_addExpr1134);
					mulExpr129=mulExpr();
					state._fsp--;

					adaptor.addChild(root_0, mulExpr129.getTree());

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
	// $ANTLR end "addExpr"


	public static class mulExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "mulExpr"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:196:1: mulExpr : powExpr ( ( '*' | '/' | '%' ) ^ powExpr )* ;
	public final DataCentricDSLParser.mulExpr_return mulExpr() throws RecognitionException {
		DataCentricDSLParser.mulExpr_return retval = new DataCentricDSLParser.mulExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set131=null;
		ParserRuleReturnScope powExpr130 =null;
		ParserRuleReturnScope powExpr132 =null;

		Object set131_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:197:3: ( powExpr ( ( '*' | '/' | '%' ) ^ powExpr )* )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:197:6: powExpr ( ( '*' | '/' | '%' ) ^ powExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_powExpr_in_mulExpr1150);
			powExpr130=powExpr();
			state._fsp--;

			adaptor.addChild(root_0, powExpr130.getTree());

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:197:14: ( ( '*' | '/' | '%' ) ^ powExpr )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==Divide||(LA23_0 >= Modulus && LA23_0 <= Multiply)) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:197:15: ( '*' | '/' | '%' ) ^ powExpr
					{
					set131=input.LT(1);
					set131=input.LT(1);
					if ( input.LA(1)==Divide||(input.LA(1) >= Modulus && input.LA(1) <= Multiply) ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set131), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_powExpr_in_mulExpr1166);
					powExpr132=powExpr();
					state._fsp--;

					adaptor.addChild(root_0, powExpr132.getTree());

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
	// $ANTLR end "mulExpr"


	public static class powExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "powExpr"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:200:1: powExpr : unaryExpr ( '^' ^ unaryExpr )* ;
	public final DataCentricDSLParser.powExpr_return powExpr() throws RecognitionException {
		DataCentricDSLParser.powExpr_return retval = new DataCentricDSLParser.powExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal134=null;
		ParserRuleReturnScope unaryExpr133 =null;
		ParserRuleReturnScope unaryExpr135 =null;

		Object char_literal134_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:201:3: ( unaryExpr ( '^' ^ unaryExpr )* )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:201:6: unaryExpr ( '^' ^ unaryExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_unaryExpr_in_powExpr1182);
			unaryExpr133=unaryExpr();
			state._fsp--;

			adaptor.addChild(root_0, unaryExpr133.getTree());

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:201:16: ( '^' ^ unaryExpr )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==Pow) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:201:17: '^' ^ unaryExpr
					{
					char_literal134=(Token)match(input,Pow,FOLLOW_Pow_in_powExpr1185); 
					char_literal134_tree = (Object)adaptor.create(char_literal134);
					root_0 = (Object)adaptor.becomeRoot(char_literal134_tree, root_0);

					pushFollow(FOLLOW_unaryExpr_in_powExpr1188);
					unaryExpr135=unaryExpr();
					state._fsp--;

					adaptor.addChild(root_0, unaryExpr135.getTree());

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
	// $ANTLR end "powExpr"


	public static class unaryExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "unaryExpr"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:204:1: unaryExpr : ( '-' atom -> ^( UNARY_MIN atom ) | '!' atom -> ^( NEGATE atom ) | atom );
	public final DataCentricDSLParser.unaryExpr_return unaryExpr() throws RecognitionException {
		DataCentricDSLParser.unaryExpr_return retval = new DataCentricDSLParser.unaryExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal136=null;
		Token char_literal138=null;
		ParserRuleReturnScope atom137 =null;
		ParserRuleReturnScope atom139 =null;
		ParserRuleReturnScope atom140 =null;

		Object char_literal136_tree=null;
		Object char_literal138_tree=null;
		RewriteRuleTokenStream stream_Excl=new RewriteRuleTokenStream(adaptor,"token Excl");
		RewriteRuleTokenStream stream_Subtract=new RewriteRuleTokenStream(adaptor,"token Subtract");
		RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:205:3: ( '-' atom -> ^( UNARY_MIN atom ) | '!' atom -> ^( NEGATE atom ) | atom )
			int alt25=3;
			switch ( input.LA(1) ) {
			case Subtract:
				{
				alt25=1;
				}
				break;
			case Excl:
				{
				alt25=2;
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
				alt25=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}
			switch (alt25) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:205:6: '-' atom
					{
					char_literal136=(Token)match(input,Subtract,FOLLOW_Subtract_in_unaryExpr1206);  
					stream_Subtract.add(char_literal136);

					pushFollow(FOLLOW_atom_in_unaryExpr1208);
					atom137=atom();
					state._fsp--;

					stream_atom.add(atom137.getTree());
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
					// 205:15: -> ^( UNARY_MIN atom )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:205:18: ^( UNARY_MIN atom )
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:206:6: '!' atom
					{
					char_literal138=(Token)match(input,Excl,FOLLOW_Excl_in_unaryExpr1223);  
					stream_Excl.add(char_literal138);

					pushFollow(FOLLOW_atom_in_unaryExpr1225);
					atom139=atom();
					state._fsp--;

					stream_atom.add(atom139.getTree());
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
					// 206:15: -> ^( NEGATE atom )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:206:18: ^( NEGATE atom )
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:207:6: atom
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_atom_in_unaryExpr1240);
					atom140=atom();
					state._fsp--;

					adaptor.addChild(root_0, atom140.getTree());

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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:210:1: atom : ( Number | Bool | Null | lookup );
	public final DataCentricDSLParser.atom_return atom() throws RecognitionException {
		DataCentricDSLParser.atom_return retval = new DataCentricDSLParser.atom_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Number141=null;
		Token Bool142=null;
		Token Null143=null;
		ParserRuleReturnScope lookup144 =null;

		Object Number141_tree=null;
		Object Bool142_tree=null;
		Object Null143_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:211:3: ( Number | Bool | Null | lookup )
			int alt26=4;
			switch ( input.LA(1) ) {
			case Number:
				{
				alt26=1;
				}
				break;
			case Bool:
				{
				alt26=2;
				}
				break;
			case Null:
				{
				alt26=3;
				}
				break;
			case Identifier:
			case OBracket:
			case OParen:
			case String:
				{
				alt26=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}
			switch (alt26) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:211:6: Number
					{
					root_0 = (Object)adaptor.nil();


					Number141=(Token)match(input,Number,FOLLOW_Number_in_atom1254); 
					Number141_tree = (Object)adaptor.create(Number141);
					adaptor.addChild(root_0, Number141_tree);

					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:212:6: Bool
					{
					root_0 = (Object)adaptor.nil();


					Bool142=(Token)match(input,Bool,FOLLOW_Bool_in_atom1261); 
					Bool142_tree = (Object)adaptor.create(Bool142);
					adaptor.addChild(root_0, Bool142_tree);

					}
					break;
				case 3 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:213:6: Null
					{
					root_0 = (Object)adaptor.nil();


					Null143=(Token)match(input,Null,FOLLOW_Null_in_atom1268); 
					Null143_tree = (Object)adaptor.create(Null143);
					adaptor.addChild(root_0, Null143_tree);

					}
					break;
				case 4 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:214:6: lookup
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_lookup_in_atom1275);
					lookup144=lookup();
					state._fsp--;

					adaptor.addChild(root_0, lookup144.getTree());

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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:217:1: list : '[' ( exprList )? ']' -> ^( LIST ( exprList )? ) ;
	public final DataCentricDSLParser.list_return list() throws RecognitionException {
		DataCentricDSLParser.list_return retval = new DataCentricDSLParser.list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal145=null;
		Token char_literal147=null;
		ParserRuleReturnScope exprList146 =null;

		Object char_literal145_tree=null;
		Object char_literal147_tree=null;
		RewriteRuleTokenStream stream_CBracket=new RewriteRuleTokenStream(adaptor,"token CBracket");
		RewriteRuleTokenStream stream_OBracket=new RewriteRuleTokenStream(adaptor,"token OBracket");
		RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:218:3: ( '[' ( exprList )? ']' -> ^( LIST ( exprList )? ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:218:6: '[' ( exprList )? ']'
			{
			char_literal145=(Token)match(input,OBracket,FOLLOW_OBracket_in_list1289);  
			stream_OBracket.add(char_literal145);

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:218:10: ( exprList )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==Bool||LA27_0==Excl||LA27_0==Identifier||(LA27_0 >= Null && LA27_0 <= Number)||(LA27_0 >= OBracket && LA27_0 <= OParen)||(LA27_0 >= String && LA27_0 <= Subtract)||LA27_0==73) ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:218:10: exprList
					{
					pushFollow(FOLLOW_exprList_in_list1291);
					exprList146=exprList();
					state._fsp--;

					stream_exprList.add(exprList146.getTree());
					}
					break;

			}

			char_literal147=(Token)match(input,CBracket,FOLLOW_CBracket_in_list1294);  
			stream_CBracket.add(char_literal147);

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
			// 218:24: -> ^( LIST ( exprList )? )
			{
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:218:27: ^( LIST ( exprList )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:218:34: ( exprList )?
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:221:1: lookup : ( list ( indexes )? -> ^( LOOKUP list ( indexes )? ) | Identifier ( indexes )? -> ^( LOOKUP Identifier ( indexes )? ) | String ( indexes )? -> ^( LOOKUP String ( indexes )? ) | '(' expression ')' ( indexes )? -> ^( LOOKUP expression ( indexes )? ) );
	public final DataCentricDSLParser.lookup_return lookup() throws RecognitionException {
		DataCentricDSLParser.lookup_return retval = new DataCentricDSLParser.lookup_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier150=null;
		Token String152=null;
		Token char_literal154=null;
		Token char_literal156=null;
		ParserRuleReturnScope list148 =null;
		ParserRuleReturnScope indexes149 =null;
		ParserRuleReturnScope indexes151 =null;
		ParserRuleReturnScope indexes153 =null;
		ParserRuleReturnScope expression155 =null;
		ParserRuleReturnScope indexes157 =null;

		Object Identifier150_tree=null;
		Object String152_tree=null;
		Object char_literal154_tree=null;
		Object char_literal156_tree=null;
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_String=new RewriteRuleTokenStream(adaptor,"token String");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_indexes=new RewriteRuleSubtreeStream(adaptor,"rule indexes");
		RewriteRuleSubtreeStream stream_list=new RewriteRuleSubtreeStream(adaptor,"rule list");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:223:3: ( list ( indexes )? -> ^( LOOKUP list ( indexes )? ) | Identifier ( indexes )? -> ^( LOOKUP Identifier ( indexes )? ) | String ( indexes )? -> ^( LOOKUP String ( indexes )? ) | '(' expression ')' ( indexes )? -> ^( LOOKUP expression ( indexes )? ) )
			int alt32=4;
			switch ( input.LA(1) ) {
			case OBracket:
				{
				alt32=1;
				}
				break;
			case Identifier:
				{
				alt32=2;
				}
				break;
			case String:
				{
				alt32=3;
				}
				break;
			case OParen:
				{
				alt32=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}
			switch (alt32) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:223:6: list ( indexes )?
					{
					pushFollow(FOLLOW_list_in_lookup1318);
					list148=list();
					state._fsp--;

					stream_list.add(list148.getTree());
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:223:11: ( indexes )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==OBracket) ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:223:11: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1320);
							indexes149=indexes();
							state._fsp--;

							stream_indexes.add(indexes149.getTree());
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
					// 223:34: -> ^( LOOKUP list ( indexes )? )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:223:37: ^( LOOKUP list ( indexes )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
						adaptor.addChild(root_1, stream_list.nextTree());
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:223:51: ( indexes )?
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:224:6: Identifier ( indexes )?
					{
					Identifier150=(Token)match(input,Identifier,FOLLOW_Identifier_in_lookup1353);  
					stream_Identifier.add(Identifier150);

					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:224:17: ( indexes )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==OBracket) ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:224:17: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1355);
							indexes151=indexes();
							state._fsp--;

							stream_indexes.add(indexes151.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: indexes, Identifier
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 224:34: -> ^( LOOKUP Identifier ( indexes )? )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:224:37: ^( LOOKUP Identifier ( indexes )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
						adaptor.addChild(root_1, stream_Identifier.nextNode());
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:224:57: ( indexes )?
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:225:6: String ( indexes )?
					{
					String152=(Token)match(input,String,FOLLOW_String_in_lookup1382);  
					stream_String.add(String152);

					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:225:13: ( indexes )?
					int alt30=2;
					int LA30_0 = input.LA(1);
					if ( (LA30_0==OBracket) ) {
						alt30=1;
					}
					switch (alt30) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:225:13: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1384);
							indexes153=indexes();
							state._fsp--;

							stream_indexes.add(indexes153.getTree());
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
					// 225:34: -> ^( LOOKUP String ( indexes )? )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:225:37: ^( LOOKUP String ( indexes )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
						adaptor.addChild(root_1, stream_String.nextNode());
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:225:53: ( indexes )?
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:226:6: '(' expression ')' ( indexes )?
					{
					char_literal154=(Token)match(input,OParen,FOLLOW_OParen_in_lookup1415);  
					stream_OParen.add(char_literal154);

					pushFollow(FOLLOW_expression_in_lookup1417);
					expression155=expression();
					state._fsp--;

					stream_expression.add(expression155.getTree());
					char_literal156=(Token)match(input,CParen,FOLLOW_CParen_in_lookup1419);  
					stream_CParen.add(char_literal156);

					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:226:25: ( indexes )?
					int alt31=2;
					int LA31_0 = input.LA(1);
					if ( (LA31_0==OBracket) ) {
						alt31=1;
					}
					switch (alt31) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:226:25: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1421);
							indexes157=indexes();
							state._fsp--;

							stream_indexes.add(indexes157.getTree());
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
					// 226:34: -> ^( LOOKUP expression ( indexes )? )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:226:37: ^( LOOKUP expression ( indexes )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
						adaptor.addChild(root_1, stream_expression.nextTree());
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:226:57: ( indexes )?
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:229:1: indexes : ( '[' expression ']' )+ -> ^( INDEXES ( expression )+ ) ;
	public final DataCentricDSLParser.indexes_return indexes() throws RecognitionException {
		DataCentricDSLParser.indexes_return retval = new DataCentricDSLParser.indexes_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal158=null;
		Token char_literal160=null;
		ParserRuleReturnScope expression159 =null;

		Object char_literal158_tree=null;
		Object char_literal160_tree=null;
		RewriteRuleTokenStream stream_CBracket=new RewriteRuleTokenStream(adaptor,"token CBracket");
		RewriteRuleTokenStream stream_OBracket=new RewriteRuleTokenStream(adaptor,"token OBracket");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:230:3: ( ( '[' expression ']' )+ -> ^( INDEXES ( expression )+ ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:230:6: ( '[' expression ']' )+
			{
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:230:6: ( '[' expression ']' )+
			int cnt33=0;
			loop33:
			while (true) {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==OBracket) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:230:7: '[' expression ']'
					{
					char_literal158=(Token)match(input,OBracket,FOLLOW_OBracket_in_indexes1448);  
					stream_OBracket.add(char_literal158);

					pushFollow(FOLLOW_expression_in_indexes1450);
					expression159=expression();
					state._fsp--;

					stream_expression.add(expression159.getTree());
					char_literal160=(Token)match(input,CBracket,FOLLOW_CBracket_in_indexes1452);  
					stream_CBracket.add(char_literal160);

					}
					break;

				default :
					if ( cnt33 >= 1 ) break loop33;
					EarlyExitException eee = new EarlyExitException(33, input);
					throw eee;
				}
				cnt33++;
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
			// 230:28: -> ^( INDEXES ( expression )+ )
			{
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:230:31: ^( INDEXES ( expression )+ )
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
	public static final BitSet FOLLOW_73_in_query306 = new BitSet(new long[]{0x0000000800000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_String_in_query310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableCall_in_query314 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_variableCall325 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_assignment337 = new BitSet(new long[]{0x0008000000000100L});
	public static final BitSet FOLLOW_indexes_in_assignment339 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Assign_in_assignment342 = new BitSet(new long[]{0x001B000804000400L,0x0000000000000203L});
	public static final BitSet FOLLOW_expression_in_assignment344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_72_in_assignment363 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_Identifier_in_assignment365 = new BitSet(new long[]{0x0008000000000100L});
	public static final BitSet FOLLOW_indexes_in_assignment367 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Assign_in_assignment370 = new BitSet(new long[]{0x001B000804000400L,0x0000000000000203L});
	public static final BitSet FOLLOW_expression_in_assignment372 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_functionCall401 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall403 = new BitSet(new long[]{0x001B000804002400L,0x0000000000000203L});
	public static final BitSet FOLLOW_exprList_in_functionCall405 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CParen_in_functionCall408 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Println_in_functionCall426 = new BitSet(new long[]{0x001B000804000400L,0x0000000000000203L});
	public static final BitSet FOLLOW_expression_in_functionCall429 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Print_in_functionCall449 = new BitSet(new long[]{0x001B000804000400L,0x0000000000000203L});
	public static final BitSet FOLLOW_expression_in_functionCall451 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Assert_in_functionCall472 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall474 = new BitSet(new long[]{0x001B000804000400L,0x0000000000000203L});
	public static final BitSet FOLLOW_expression_in_functionCall476 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CParen_in_functionCall478 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Size_in_functionCall498 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall500 = new BitSet(new long[]{0x001B000804000400L,0x0000000000000203L});
	public static final BitSet FOLLOW_expression_in_functionCall502 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CParen_in_functionCall504 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStat_in_ifStatement533 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_elseIfStat_in_ifStatement535 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_elseStat_in_ifStatement538 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_If_in_ifStat567 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_OParen_in_ifStat569 = new BitSet(new long[]{0x001B000804000400L,0x0000000000000203L});
	public static final BitSet FOLLOW_expression_in_ifStat571 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CParen_in_ifStat573 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_OBrace_in_ifStat575 = new BitSet(new long[]{0x4980001820000880L,0x00000000000003A0L});
	public static final BitSet FOLLOW_block_in_ifStat577 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CBrace_in_ifStat579 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Else_in_elseIfStat603 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_If_in_elseIfStat605 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_OParen_in_elseIfStat607 = new BitSet(new long[]{0x001B000804000400L,0x0000000000000203L});
	public static final BitSet FOLLOW_expression_in_elseIfStat609 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CParen_in_elseIfStat611 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_OBrace_in_elseIfStat613 = new BitSet(new long[]{0x4980001820000880L,0x00000000000003A0L});
	public static final BitSet FOLLOW_block_in_elseIfStat615 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CBrace_in_elseIfStat617 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Else_in_elseStat641 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_OBrace_in_elseStat643 = new BitSet(new long[]{0x4980001820000880L,0x00000000000003A0L});
	public static final BitSet FOLLOW_block_in_elseStat645 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CBrace_in_elseStat647 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_71_in_functionDecl669 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_Identifier_in_functionDecl671 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_OParen_in_functionDecl673 = new BitSet(new long[]{0x0000000800002000L});
	public static final BitSet FOLLOW_idList_in_functionDecl675 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CParen_in_functionDecl678 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_OBrace_in_functionDecl680 = new BitSet(new long[]{0x4980001820000880L,0x00000000000003A0L});
	public static final BitSet FOLLOW_block_in_functionDecl682 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CBrace_in_functionDecl684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_For_in_forStatement707 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_OParen_in_forStatement709 = new BitSet(new long[]{0x0000000800000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_assignment_in_forStatement711 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_SColon_in_forStatement713 = new BitSet(new long[]{0x001B000804000400L,0x0000000000000203L});
	public static final BitSet FOLLOW_expression_in_forStatement715 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_SColon_in_forStatement717 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_afterthought_in_forStatement719 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CParen_in_forStatement721 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_OBrace_in_forStatement723 = new BitSet(new long[]{0x4980001820000880L,0x00000000000003A0L});
	public static final BitSet FOLLOW_block_in_forStatement725 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CBrace_in_forStatement727 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_afterthought759 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Assign_in_afterthought761 = new BitSet(new long[]{0x001B000804000400L,0x0000000000000203L});
	public static final BitSet FOLLOW_expression_in_afterthought763 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incrementation_in_afterthought768 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_While_in_whileStatement780 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_OParen_in_whileStatement782 = new BitSet(new long[]{0x001B000804000400L,0x0000000000000203L});
	public static final BitSet FOLLOW_expression_in_whileStatement784 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CParen_in_whileStatement786 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_OBrace_in_whileStatement788 = new BitSet(new long[]{0x4980001820000880L,0x00000000000003A0L});
	public static final BitSet FOLLOW_block_in_whileStatement790 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CBrace_in_whileStatement792 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_idList816 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_Comma_in_idList819 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_Identifier_in_idList821 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_expression_in_exprList846 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_Comma_in_exprList849 = new BitSet(new long[]{0x001B000804000400L,0x0000000000000203L});
	public static final BitSet FOLLOW_expression_in_exprList851 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_condExpr_in_expression876 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_query_in_expression880 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableCall_in_incrementation893 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_set_in_incrementation895 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_orExpr_in_condExpr912 = new BitSet(new long[]{0x0200002000000002L});
	public static final BitSet FOLLOW_QMark_in_condExpr927 = new BitSet(new long[]{0x001B000804000400L,0x0000000000000203L});
	public static final BitSet FOLLOW_expression_in_condExpr931 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_Colon_in_condExpr933 = new BitSet(new long[]{0x001B000804000400L,0x0000000000000203L});
	public static final BitSet FOLLOW_expression_in_condExpr937 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_In_in_condExpr960 = new BitSet(new long[]{0x001B000804000400L,0x0000000000000203L});
	public static final BitSet FOLLOW_expression_in_condExpr962 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_andExpr_in_orExpr1014 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_Or_in_orExpr1017 = new BitSet(new long[]{0x001B000804000400L,0x0000000000000003L});
	public static final BitSet FOLLOW_andExpr_in_orExpr1020 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_equExpr_in_andExpr1036 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_And_in_andExpr1039 = new BitSet(new long[]{0x001B000804000400L,0x0000000000000003L});
	public static final BitSet FOLLOW_equExpr_in_andExpr1042 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_relExpr_in_equExpr1058 = new BitSet(new long[]{0x0000800002000002L});
	public static final BitSet FOLLOW_set_in_equExpr1061 = new BitSet(new long[]{0x001B000804000400L,0x0000000000000003L});
	public static final BitSet FOLLOW_relExpr_in_equExpr1070 = new BitSet(new long[]{0x0000800002000002L});
	public static final BitSet FOLLOW_addExpr_in_relExpr1086 = new BitSet(new long[]{0x00000C00C0000002L});
	public static final BitSet FOLLOW_set_in_relExpr1089 = new BitSet(new long[]{0x001B000804000400L,0x0000000000000003L});
	public static final BitSet FOLLOW_addExpr_in_relExpr1106 = new BitSet(new long[]{0x00000C00C0000002L});
	public static final BitSet FOLLOW_mulExpr_in_addExpr1122 = new BitSet(new long[]{0x0000000000000022L,0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_addExpr1125 = new BitSet(new long[]{0x001B000804000400L,0x0000000000000003L});
	public static final BitSet FOLLOW_mulExpr_in_addExpr1134 = new BitSet(new long[]{0x0000000000000022L,0x0000000000000002L});
	public static final BitSet FOLLOW_powExpr_in_mulExpr1150 = new BitSet(new long[]{0x0000300000080002L});
	public static final BitSet FOLLOW_set_in_mulExpr1153 = new BitSet(new long[]{0x001B000804000400L,0x0000000000000003L});
	public static final BitSet FOLLOW_powExpr_in_mulExpr1166 = new BitSet(new long[]{0x0000300000080002L});
	public static final BitSet FOLLOW_unaryExpr_in_powExpr1182 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_Pow_in_powExpr1185 = new BitSet(new long[]{0x001B000804000400L,0x0000000000000003L});
	public static final BitSet FOLLOW_unaryExpr_in_powExpr1188 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_Subtract_in_unaryExpr1206 = new BitSet(new long[]{0x001B000800000400L,0x0000000000000001L});
	public static final BitSet FOLLOW_atom_in_unaryExpr1208 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Excl_in_unaryExpr1223 = new BitSet(new long[]{0x001B000800000400L,0x0000000000000001L});
	public static final BitSet FOLLOW_atom_in_unaryExpr1225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_unaryExpr1240 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Number_in_atom1254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Bool_in_atom1261 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Null_in_atom1268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lookup_in_atom1275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OBracket_in_list1289 = new BitSet(new long[]{0x001B000804001400L,0x0000000000000203L});
	public static final BitSet FOLLOW_exprList_in_list1291 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CBracket_in_list1294 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_list_in_lookup1318 = new BitSet(new long[]{0x0008000000000002L});
	public static final BitSet FOLLOW_indexes_in_lookup1320 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_lookup1353 = new BitSet(new long[]{0x0008000000000002L});
	public static final BitSet FOLLOW_indexes_in_lookup1355 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_String_in_lookup1382 = new BitSet(new long[]{0x0008000000000002L});
	public static final BitSet FOLLOW_indexes_in_lookup1384 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OParen_in_lookup1415 = new BitSet(new long[]{0x001B000804000400L,0x0000000000000203L});
	public static final BitSet FOLLOW_expression_in_lookup1417 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CParen_in_lookup1419 = new BitSet(new long[]{0x0008000000000002L});
	public static final BitSet FOLLOW_indexes_in_lookup1421 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OBracket_in_indexes1448 = new BitSet(new long[]{0x001B000804000400L,0x0000000000000203L});
	public static final BitSet FOLLOW_expression_in_indexes1450 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CBracket_in_indexes1452 = new BitSet(new long[]{0x0008000000000002L});
}
