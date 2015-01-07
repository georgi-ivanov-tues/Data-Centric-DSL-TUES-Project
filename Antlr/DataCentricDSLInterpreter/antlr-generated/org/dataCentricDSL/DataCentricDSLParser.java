// $ANTLR 3.5.2 D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g 2015-01-07 18:52:36

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
		"'func'", "'query'"
	};
	public static final int EOF=-1;
	public static final int T__70=70;
	public static final int T__71=71;
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
				if ( (LA1_0==Assert||LA1_0==For||(LA1_0 >= Identifier && LA1_0 <= If)||(LA1_0 >= Print && LA1_0 <= Println)||LA1_0==Size||LA1_0==While||LA1_0==71) ) {
					alt1=1;
				}
				else if ( (LA1_0==70) ) {
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:88:1: statement : ( assignment ';' -> assignment | functionCall ';' -> functionCall | ifStatement | forStatement | whileStatement | query ';' -> query );
	public final DataCentricDSLParser.statement_return statement() throws RecognitionException {
		DataCentricDSLParser.statement_return retval = new DataCentricDSLParser.statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal9=null;
		Token char_literal11=null;
		Token char_literal16=null;
		ParserRuleReturnScope assignment8 =null;
		ParserRuleReturnScope functionCall10 =null;
		ParserRuleReturnScope ifStatement12 =null;
		ParserRuleReturnScope forStatement13 =null;
		ParserRuleReturnScope whileStatement14 =null;
		ParserRuleReturnScope query15 =null;

		Object char_literal9_tree=null;
		Object char_literal11_tree=null;
		Object char_literal16_tree=null;
		RewriteRuleTokenStream stream_SColon=new RewriteRuleTokenStream(adaptor,"token SColon");
		RewriteRuleSubtreeStream stream_functionCall=new RewriteRuleSubtreeStream(adaptor,"rule functionCall");
		RewriteRuleSubtreeStream stream_assignment=new RewriteRuleSubtreeStream(adaptor,"rule assignment");
		RewriteRuleSubtreeStream stream_query=new RewriteRuleSubtreeStream(adaptor,"rule query");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:89:3: ( assignment ';' -> assignment | functionCall ';' -> functionCall | ifStatement | forStatement | whileStatement | query ';' -> query )
			int alt3=6;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				int LA3_1 = input.LA(2);
				if ( (LA3_1==OParen) ) {
					alt3=2;
				}
				else if ( (LA3_1==Assign||LA3_1==OBracket) ) {
					alt3=1;
				}

				else {
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
			case Assert:
			case Print:
			case Println:
			case Size:
				{
				alt3=2;
				}
				break;
			case If:
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
			case 71:
				{
				alt3=6;
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:91:6: functionCall ';'
					{
					pushFollow(FOLLOW_functionCall_in_statement241);
					functionCall10=functionCall();
					state._fsp--;

					stream_functionCall.add(functionCall10.getTree());
					char_literal11=(Token)match(input,SColon,FOLLOW_SColon_in_statement243);  
					stream_SColon.add(char_literal11);

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
				case 3 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:92:6: ifStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_ifStatement_in_statement254);
					ifStatement12=ifStatement();
					state._fsp--;

					adaptor.addChild(root_0, ifStatement12.getTree());

					}
					break;
				case 4 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:93:6: forStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_forStatement_in_statement261);
					forStatement13=forStatement();
					state._fsp--;

					adaptor.addChild(root_0, forStatement13.getTree());

					}
					break;
				case 5 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:94:6: whileStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_whileStatement_in_statement268);
					whileStatement14=whileStatement();
					state._fsp--;

					adaptor.addChild(root_0, whileStatement14.getTree());

					}
					break;
				case 6 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:95:6: query ';'
					{
					pushFollow(FOLLOW_query_in_statement275);
					query15=query();
					state._fsp--;

					stream_query.add(query15.getTree());
					char_literal16=(Token)match(input,SColon,FOLLOW_SColon_in_statement277);  
					stream_SColon.add(char_literal16);

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

		Token string_literal17=null;
		Token String18=null;
		ParserRuleReturnScope variableCall19 =null;

		Object string_literal17_tree=null;
		Object String18_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:98:6: ( 'query' ^ ( String | variableCall ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:99:3: 'query' ^ ( String | variableCall )
			{
			root_0 = (Object)adaptor.nil();


			string_literal17=(Token)match(input,71,FOLLOW_71_in_query294); 
			string_literal17_tree = (Object)adaptor.create(string_literal17);
			root_0 = (Object)adaptor.becomeRoot(string_literal17_tree, root_0);

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
					String18=(Token)match(input,String,FOLLOW_String_in_query298); 
					String18_tree = (Object)adaptor.create(String18);
					adaptor.addChild(root_0, String18_tree);

					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:99:22: variableCall
					{
					pushFollow(FOLLOW_variableCall_in_query302);
					variableCall19=variableCall();
					state._fsp--;

					adaptor.addChild(root_0, variableCall19.getTree());

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

		Token Identifier20=null;

		Object Identifier20_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:102:13: ( Identifier )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:103:3: Identifier
			{
			root_0 = (Object)adaptor.nil();


			Identifier20=(Token)match(input,Identifier,FOLLOW_Identifier_in_variableCall313); 
			Identifier20_tree = (Object)adaptor.create(Identifier20);
			adaptor.addChild(root_0, Identifier20_tree);

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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:106:1: assignment : Identifier ( indexes )? '=' expression -> ^( ASSIGNMENT Identifier ( indexes )? expression ) ;
	public final DataCentricDSLParser.assignment_return assignment() throws RecognitionException {
		DataCentricDSLParser.assignment_return retval = new DataCentricDSLParser.assignment_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier21=null;
		Token char_literal23=null;
		ParserRuleReturnScope indexes22 =null;
		ParserRuleReturnScope expression24 =null;

		Object Identifier21_tree=null;
		Object char_literal23_tree=null;
		RewriteRuleTokenStream stream_Assign=new RewriteRuleTokenStream(adaptor,"token Assign");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_indexes=new RewriteRuleSubtreeStream(adaptor,"rule indexes");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:107:3: ( Identifier ( indexes )? '=' expression -> ^( ASSIGNMENT Identifier ( indexes )? expression ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:107:6: Identifier ( indexes )? '=' expression
			{
			Identifier21=(Token)match(input,Identifier,FOLLOW_Identifier_in_assignment325);  
			stream_Identifier.add(Identifier21);

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
					pushFollow(FOLLOW_indexes_in_assignment327);
					indexes22=indexes();
					state._fsp--;

					stream_indexes.add(indexes22.getTree());
					}
					break;

			}

			char_literal23=(Token)match(input,Assign,FOLLOW_Assign_in_assignment330);  
			stream_Assign.add(char_literal23);

			pushFollow(FOLLOW_expression_in_assignment332);
			expression24=expression();
			state._fsp--;

			stream_expression.add(expression24.getTree());
			// AST REWRITE
			// elements: Identifier, expression, indexes
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:111:1: functionCall : ( Identifier '(' ( exprList )? ')' -> ^( FUNC_CALL Identifier ( exprList )? ) | Println '(' ( expression )? ')' -> ^( FUNC_CALL Println ( expression )? ) | Print '(' expression ')' -> ^( FUNC_CALL Print expression ) | Assert '(' expression ')' -> ^( FUNC_CALL Assert expression ) | Size '(' expression ')' -> ^( FUNC_CALL Size expression ) );
	public final DataCentricDSLParser.functionCall_return functionCall() throws RecognitionException {
		DataCentricDSLParser.functionCall_return retval = new DataCentricDSLParser.functionCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier25=null;
		Token char_literal26=null;
		Token char_literal28=null;
		Token Println29=null;
		Token char_literal30=null;
		Token char_literal32=null;
		Token Print33=null;
		Token char_literal34=null;
		Token char_literal36=null;
		Token Assert37=null;
		Token char_literal38=null;
		Token char_literal40=null;
		Token Size41=null;
		Token char_literal42=null;
		Token char_literal44=null;
		ParserRuleReturnScope exprList27 =null;
		ParserRuleReturnScope expression31 =null;
		ParserRuleReturnScope expression35 =null;
		ParserRuleReturnScope expression39 =null;
		ParserRuleReturnScope expression43 =null;

		Object Identifier25_tree=null;
		Object char_literal26_tree=null;
		Object char_literal28_tree=null;
		Object Println29_tree=null;
		Object char_literal30_tree=null;
		Object char_literal32_tree=null;
		Object Print33_tree=null;
		Object char_literal34_tree=null;
		Object char_literal36_tree=null;
		Object Assert37_tree=null;
		Object char_literal38_tree=null;
		Object char_literal40_tree=null;
		Object Size41_tree=null;
		Object char_literal42_tree=null;
		Object char_literal44_tree=null;
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
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:112:3: ( Identifier '(' ( exprList )? ')' -> ^( FUNC_CALL Identifier ( exprList )? ) | Println '(' ( expression )? ')' -> ^( FUNC_CALL Println ( expression )? ) | Print '(' expression ')' -> ^( FUNC_CALL Print expression ) | Assert '(' expression ')' -> ^( FUNC_CALL Assert expression ) | Size '(' expression ')' -> ^( FUNC_CALL Size expression ) )
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:112:6: Identifier '(' ( exprList )? ')'
					{
					Identifier25=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionCall360);  
					stream_Identifier.add(Identifier25);

					char_literal26=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall362);  
					stream_OParen.add(char_literal26);

					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:112:21: ( exprList )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==Assert||LA6_0==Bool||LA6_0==Excl||LA6_0==Identifier||(LA6_0 >= Null && LA6_0 <= Number)||(LA6_0 >= OBracket && LA6_0 <= OParen)||(LA6_0 >= Print && LA6_0 <= Println)||LA6_0==Size||(LA6_0 >= String && LA6_0 <= Subtract)||LA6_0==71) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:112:21: exprList
							{
							pushFollow(FOLLOW_exprList_in_functionCall364);
							exprList27=exprList();
							state._fsp--;

							stream_exprList.add(exprList27.getTree());
							}
							break;

					}

					char_literal28=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall367);  
					stream_CParen.add(char_literal28);

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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:113:6: Println '(' ( expression )? ')'
					{
					Println29=(Token)match(input,Println,FOLLOW_Println_in_functionCall385);  
					stream_Println.add(Println29);

					char_literal30=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall387);  
					stream_OParen.add(char_literal30);

					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:113:18: ( expression )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==Assert||LA7_0==Bool||LA7_0==Excl||LA7_0==Identifier||(LA7_0 >= Null && LA7_0 <= Number)||(LA7_0 >= OBracket && LA7_0 <= OParen)||(LA7_0 >= Print && LA7_0 <= Println)||LA7_0==Size||(LA7_0 >= String && LA7_0 <= Subtract)||LA7_0==71) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:113:18: expression
							{
							pushFollow(FOLLOW_expression_in_functionCall389);
							expression31=expression();
							state._fsp--;

							stream_expression.add(expression31.getTree());
							}
							break;

					}

					char_literal32=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall392);  
					stream_CParen.add(char_literal32);

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
					// 113:36: -> ^( FUNC_CALL Println ( expression )? )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:113:39: ^( FUNC_CALL Println ( expression )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Println.nextNode());
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:113:59: ( expression )?
						if ( stream_expression.hasNext() ) {
							adaptor.addChild(root_1, stream_expression.nextTree());
						}
						stream_expression.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:116:6: Print '(' expression ')'
					{
					Print33=(Token)match(input,Print,FOLLOW_Print_in_functionCall414);  
					stream_Print.add(Print33);

					char_literal34=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall416);  
					stream_OParen.add(char_literal34);

					pushFollow(FOLLOW_expression_in_functionCall418);
					expression35=expression();
					state._fsp--;

					stream_expression.add(expression35.getTree());
					char_literal36=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall420);  
					stream_CParen.add(char_literal36);

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
					// 116:35: -> ^( FUNC_CALL Print expression )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:116:38: ^( FUNC_CALL Print expression )
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:117:6: Assert '(' expression ')'
					{
					Assert37=(Token)match(input,Assert,FOLLOW_Assert_in_functionCall441);  
					stream_Assert.add(Assert37);

					char_literal38=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall443);  
					stream_OParen.add(char_literal38);

					pushFollow(FOLLOW_expression_in_functionCall445);
					expression39=expression();
					state._fsp--;

					stream_expression.add(expression39.getTree());
					char_literal40=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall447);  
					stream_CParen.add(char_literal40);

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
					// 117:35: -> ^( FUNC_CALL Assert expression )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:117:38: ^( FUNC_CALL Assert expression )
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:118:6: Size '(' expression ')'
					{
					Size41=(Token)match(input,Size,FOLLOW_Size_in_functionCall467);  
					stream_Size.add(Size41);

					char_literal42=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall469);  
					stream_OParen.add(char_literal42);

					pushFollow(FOLLOW_expression_in_functionCall471);
					expression43=expression();
					state._fsp--;

					stream_expression.add(expression43.getTree());
					char_literal44=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall473);  
					stream_CParen.add(char_literal44);

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
					// 118:35: -> ^( FUNC_CALL Size expression )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:118:38: ^( FUNC_CALL Size expression )
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:121:1: ifStatement : ifStat ( elseIfStat )* ( elseStat )? -> ^( IF ifStat ( elseIfStat )* ( elseStat )? ) ;
	public final DataCentricDSLParser.ifStatement_return ifStatement() throws RecognitionException {
		DataCentricDSLParser.ifStatement_return retval = new DataCentricDSLParser.ifStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope ifStat45 =null;
		ParserRuleReturnScope elseIfStat46 =null;
		ParserRuleReturnScope elseStat47 =null;

		RewriteRuleSubtreeStream stream_elseIfStat=new RewriteRuleSubtreeStream(adaptor,"rule elseIfStat");
		RewriteRuleSubtreeStream stream_ifStat=new RewriteRuleSubtreeStream(adaptor,"rule ifStat");
		RewriteRuleSubtreeStream stream_elseStat=new RewriteRuleSubtreeStream(adaptor,"rule elseStat");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:122:3: ( ifStat ( elseIfStat )* ( elseStat )? -> ^( IF ifStat ( elseIfStat )* ( elseStat )? ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:122:6: ifStat ( elseIfStat )* ( elseStat )?
			{
			pushFollow(FOLLOW_ifStat_in_ifStatement502);
			ifStat45=ifStat();
			state._fsp--;

			stream_ifStat.add(ifStat45.getTree());
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:122:13: ( elseIfStat )*
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:122:13: elseIfStat
					{
					pushFollow(FOLLOW_elseIfStat_in_ifStatement504);
					elseIfStat46=elseIfStat();
					state._fsp--;

					stream_elseIfStat.add(elseIfStat46.getTree());
					}
					break;

				default :
					break loop9;
				}
			}

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:122:25: ( elseStat )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==Else) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:122:25: elseStat
					{
					pushFollow(FOLLOW_elseStat_in_ifStatement507);
					elseStat47=elseStat();
					state._fsp--;

					stream_elseStat.add(elseStat47.getTree());
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
			// 122:35: -> ^( IF ifStat ( elseIfStat )* ( elseStat )? )
			{
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:122:38: ^( IF ifStat ( elseIfStat )* ( elseStat )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);
				adaptor.addChild(root_1, stream_ifStat.nextTree());
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:122:50: ( elseIfStat )*
				while ( stream_elseIfStat.hasNext() ) {
					adaptor.addChild(root_1, stream_elseIfStat.nextTree());
				}
				stream_elseIfStat.reset();

				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:122:62: ( elseStat )?
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:125:1: ifStat : If '(' expression ')' '{' block '}' -> ^( EXP expression block ) ;
	public final DataCentricDSLParser.ifStat_return ifStat() throws RecognitionException {
		DataCentricDSLParser.ifStat_return retval = new DataCentricDSLParser.ifStat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token If48=null;
		Token char_literal49=null;
		Token char_literal51=null;
		Token char_literal52=null;
		Token char_literal54=null;
		ParserRuleReturnScope expression50 =null;
		ParserRuleReturnScope block53 =null;

		Object If48_tree=null;
		Object char_literal49_tree=null;
		Object char_literal51_tree=null;
		Object char_literal52_tree=null;
		Object char_literal54_tree=null;
		RewriteRuleTokenStream stream_OBrace=new RewriteRuleTokenStream(adaptor,"token OBrace");
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_If=new RewriteRuleTokenStream(adaptor,"token If");
		RewriteRuleTokenStream stream_CBrace=new RewriteRuleTokenStream(adaptor,"token CBrace");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:126:3: ( If '(' expression ')' '{' block '}' -> ^( EXP expression block ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:126:6: If '(' expression ')' '{' block '}'
			{
			If48=(Token)match(input,If,FOLLOW_If_in_ifStat536);  
			stream_If.add(If48);

			char_literal49=(Token)match(input,OParen,FOLLOW_OParen_in_ifStat538);  
			stream_OParen.add(char_literal49);

			pushFollow(FOLLOW_expression_in_ifStat540);
			expression50=expression();
			state._fsp--;

			stream_expression.add(expression50.getTree());
			char_literal51=(Token)match(input,CParen,FOLLOW_CParen_in_ifStat542);  
			stream_CParen.add(char_literal51);

			char_literal52=(Token)match(input,OBrace,FOLLOW_OBrace_in_ifStat544);  
			stream_OBrace.add(char_literal52);

			pushFollow(FOLLOW_block_in_ifStat546);
			block53=block();
			state._fsp--;

			stream_block.add(block53.getTree());
			char_literal54=(Token)match(input,CBrace,FOLLOW_CBrace_in_ifStat548);  
			stream_CBrace.add(char_literal54);

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
			// 126:42: -> ^( EXP expression block )
			{
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:126:45: ^( EXP expression block )
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:129:1: elseIfStat : Else If '(' expression ')' '{' block '}' -> ^( EXP expression block ) ;
	public final DataCentricDSLParser.elseIfStat_return elseIfStat() throws RecognitionException {
		DataCentricDSLParser.elseIfStat_return retval = new DataCentricDSLParser.elseIfStat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Else55=null;
		Token If56=null;
		Token char_literal57=null;
		Token char_literal59=null;
		Token char_literal60=null;
		Token char_literal62=null;
		ParserRuleReturnScope expression58 =null;
		ParserRuleReturnScope block61 =null;

		Object Else55_tree=null;
		Object If56_tree=null;
		Object char_literal57_tree=null;
		Object char_literal59_tree=null;
		Object char_literal60_tree=null;
		Object char_literal62_tree=null;
		RewriteRuleTokenStream stream_OBrace=new RewriteRuleTokenStream(adaptor,"token OBrace");
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_Else=new RewriteRuleTokenStream(adaptor,"token Else");
		RewriteRuleTokenStream stream_If=new RewriteRuleTokenStream(adaptor,"token If");
		RewriteRuleTokenStream stream_CBrace=new RewriteRuleTokenStream(adaptor,"token CBrace");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:130:3: ( Else If '(' expression ')' '{' block '}' -> ^( EXP expression block ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:130:6: Else If '(' expression ')' '{' block '}'
			{
			Else55=(Token)match(input,Else,FOLLOW_Else_in_elseIfStat572);  
			stream_Else.add(Else55);

			If56=(Token)match(input,If,FOLLOW_If_in_elseIfStat574);  
			stream_If.add(If56);

			char_literal57=(Token)match(input,OParen,FOLLOW_OParen_in_elseIfStat576);  
			stream_OParen.add(char_literal57);

			pushFollow(FOLLOW_expression_in_elseIfStat578);
			expression58=expression();
			state._fsp--;

			stream_expression.add(expression58.getTree());
			char_literal59=(Token)match(input,CParen,FOLLOW_CParen_in_elseIfStat580);  
			stream_CParen.add(char_literal59);

			char_literal60=(Token)match(input,OBrace,FOLLOW_OBrace_in_elseIfStat582);  
			stream_OBrace.add(char_literal60);

			pushFollow(FOLLOW_block_in_elseIfStat584);
			block61=block();
			state._fsp--;

			stream_block.add(block61.getTree());
			char_literal62=(Token)match(input,CBrace,FOLLOW_CBrace_in_elseIfStat586);  
			stream_CBrace.add(char_literal62);

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
			// 130:47: -> ^( EXP expression block )
			{
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:130:50: ^( EXP expression block )
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:133:1: elseStat : Else '{' block '}' -> ^( EXP block ) ;
	public final DataCentricDSLParser.elseStat_return elseStat() throws RecognitionException {
		DataCentricDSLParser.elseStat_return retval = new DataCentricDSLParser.elseStat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Else63=null;
		Token char_literal64=null;
		Token char_literal66=null;
		ParserRuleReturnScope block65 =null;

		Object Else63_tree=null;
		Object char_literal64_tree=null;
		Object char_literal66_tree=null;
		RewriteRuleTokenStream stream_OBrace=new RewriteRuleTokenStream(adaptor,"token OBrace");
		RewriteRuleTokenStream stream_Else=new RewriteRuleTokenStream(adaptor,"token Else");
		RewriteRuleTokenStream stream_CBrace=new RewriteRuleTokenStream(adaptor,"token CBrace");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:134:3: ( Else '{' block '}' -> ^( EXP block ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:134:6: Else '{' block '}'
			{
			Else63=(Token)match(input,Else,FOLLOW_Else_in_elseStat610);  
			stream_Else.add(Else63);

			char_literal64=(Token)match(input,OBrace,FOLLOW_OBrace_in_elseStat612);  
			stream_OBrace.add(char_literal64);

			pushFollow(FOLLOW_block_in_elseStat614);
			block65=block();
			state._fsp--;

			stream_block.add(block65.getTree());
			char_literal66=(Token)match(input,CBrace,FOLLOW_CBrace_in_elseStat616);  
			stream_CBrace.add(char_literal66);

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
			// 134:25: -> ^( EXP block )
			{
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:134:28: ^( EXP block )
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:137:1: functionDecl : 'func' Identifier '(' ( idList )? ')' '{' block '}' ;
	public final DataCentricDSLParser.functionDecl_return functionDecl() throws RecognitionException {
		DataCentricDSLParser.functionDecl_return retval = new DataCentricDSLParser.functionDecl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal67=null;
		Token Identifier68=null;
		Token char_literal69=null;
		Token char_literal71=null;
		Token char_literal72=null;
		Token char_literal74=null;
		ParserRuleReturnScope idList70 =null;
		ParserRuleReturnScope block73 =null;

		Object string_literal67_tree=null;
		Object Identifier68_tree=null;
		Object char_literal69_tree=null;
		Object char_literal71_tree=null;
		Object char_literal72_tree=null;
		Object char_literal74_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:138:3: ( 'func' Identifier '(' ( idList )? ')' '{' block '}' )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:138:6: 'func' Identifier '(' ( idList )? ')' '{' block '}'
			{
			root_0 = (Object)adaptor.nil();


			string_literal67=(Token)match(input,70,FOLLOW_70_in_functionDecl638); 
			string_literal67_tree = (Object)adaptor.create(string_literal67);
			adaptor.addChild(root_0, string_literal67_tree);

			Identifier68=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionDecl640); 
			Identifier68_tree = (Object)adaptor.create(Identifier68);
			adaptor.addChild(root_0, Identifier68_tree);

			char_literal69=(Token)match(input,OParen,FOLLOW_OParen_in_functionDecl642); 
			char_literal69_tree = (Object)adaptor.create(char_literal69);
			adaptor.addChild(root_0, char_literal69_tree);

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:138:28: ( idList )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==Identifier) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:138:28: idList
					{
					pushFollow(FOLLOW_idList_in_functionDecl644);
					idList70=idList();
					state._fsp--;

					adaptor.addChild(root_0, idList70.getTree());

					}
					break;

			}

			char_literal71=(Token)match(input,CParen,FOLLOW_CParen_in_functionDecl647); 
			char_literal71_tree = (Object)adaptor.create(char_literal71);
			adaptor.addChild(root_0, char_literal71_tree);

			char_literal72=(Token)match(input,OBrace,FOLLOW_OBrace_in_functionDecl649); 
			char_literal72_tree = (Object)adaptor.create(char_literal72);
			adaptor.addChild(root_0, char_literal72_tree);

			pushFollow(FOLLOW_block_in_functionDecl651);
			block73=block();
			state._fsp--;

			adaptor.addChild(root_0, block73.getTree());

			char_literal74=(Token)match(input,CBrace,FOLLOW_CBrace_in_functionDecl653); 
			char_literal74_tree = (Object)adaptor.create(char_literal74);
			adaptor.addChild(root_0, char_literal74_tree);

			defineFunction((Identifier68!=null?Identifier68.getText():null), (idList70!=null?((Object)idList70.getTree()):null), (block73!=null?((Object)block73.getTree()):null));
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:142:1: forStatement : For '(' Identifier '=' expression ';' expression ';' Identifier '=' expression ')' '{' block '}' -> ^( For Identifier expression expression Identifier expression block ) ;
	public final DataCentricDSLParser.forStatement_return forStatement() throws RecognitionException {
		DataCentricDSLParser.forStatement_return retval = new DataCentricDSLParser.forStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token For75=null;
		Token char_literal76=null;
		Token Identifier77=null;
		Token char_literal78=null;
		Token char_literal80=null;
		Token char_literal82=null;
		Token Identifier83=null;
		Token char_literal84=null;
		Token char_literal86=null;
		Token char_literal87=null;
		Token char_literal89=null;
		ParserRuleReturnScope expression79 =null;
		ParserRuleReturnScope expression81 =null;
		ParserRuleReturnScope expression85 =null;
		ParserRuleReturnScope block88 =null;

		Object For75_tree=null;
		Object char_literal76_tree=null;
		Object Identifier77_tree=null;
		Object char_literal78_tree=null;
		Object char_literal80_tree=null;
		Object char_literal82_tree=null;
		Object Identifier83_tree=null;
		Object char_literal84_tree=null;
		Object char_literal86_tree=null;
		Object char_literal87_tree=null;
		Object char_literal89_tree=null;
		RewriteRuleTokenStream stream_OBrace=new RewriteRuleTokenStream(adaptor,"token OBrace");
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_Assign=new RewriteRuleTokenStream(adaptor,"token Assign");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_For=new RewriteRuleTokenStream(adaptor,"token For");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_CBrace=new RewriteRuleTokenStream(adaptor,"token CBrace");
		RewriteRuleTokenStream stream_SColon=new RewriteRuleTokenStream(adaptor,"token SColon");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:145:4: ( For '(' Identifier '=' expression ';' expression ';' Identifier '=' expression ')' '{' block '}' -> ^( For Identifier expression expression Identifier expression block ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:145:7: For '(' Identifier '=' expression ';' expression ';' Identifier '=' expression ')' '{' block '}'
			{
			For75=(Token)match(input,For,FOLLOW_For_in_forStatement678);  
			stream_For.add(For75);

			char_literal76=(Token)match(input,OParen,FOLLOW_OParen_in_forStatement680);  
			stream_OParen.add(char_literal76);

			Identifier77=(Token)match(input,Identifier,FOLLOW_Identifier_in_forStatement682);  
			stream_Identifier.add(Identifier77);

			char_literal78=(Token)match(input,Assign,FOLLOW_Assign_in_forStatement684);  
			stream_Assign.add(char_literal78);

			pushFollow(FOLLOW_expression_in_forStatement686);
			expression79=expression();
			state._fsp--;

			stream_expression.add(expression79.getTree());
			char_literal80=(Token)match(input,SColon,FOLLOW_SColon_in_forStatement688);  
			stream_SColon.add(char_literal80);

			pushFollow(FOLLOW_expression_in_forStatement690);
			expression81=expression();
			state._fsp--;

			stream_expression.add(expression81.getTree());
			char_literal82=(Token)match(input,SColon,FOLLOW_SColon_in_forStatement692);  
			stream_SColon.add(char_literal82);

			Identifier83=(Token)match(input,Identifier,FOLLOW_Identifier_in_forStatement694);  
			stream_Identifier.add(Identifier83);

			char_literal84=(Token)match(input,Assign,FOLLOW_Assign_in_forStatement696);  
			stream_Assign.add(char_literal84);

			pushFollow(FOLLOW_expression_in_forStatement698);
			expression85=expression();
			state._fsp--;

			stream_expression.add(expression85.getTree());
			char_literal86=(Token)match(input,CParen,FOLLOW_CParen_in_forStatement700);  
			stream_CParen.add(char_literal86);

			char_literal87=(Token)match(input,OBrace,FOLLOW_OBrace_in_forStatement702);  
			stream_OBrace.add(char_literal87);

			pushFollow(FOLLOW_block_in_forStatement704);
			block88=block();
			state._fsp--;

			stream_block.add(block88.getTree());
			char_literal89=(Token)match(input,CBrace,FOLLOW_CBrace_in_forStatement706);  
			stream_CBrace.add(char_literal89);

			// AST REWRITE
			// elements: For, expression, expression, Identifier, block, expression, Identifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 146:6: -> ^( For Identifier expression expression Identifier expression block )
			{
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:146:9: ^( For Identifier expression expression Identifier expression block )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_For.nextNode(), root_1);
				adaptor.addChild(root_1, stream_Identifier.nextNode());
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_Identifier.nextNode());
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
	// $ANTLR end "forStatement"


	public static class whileStatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "whileStatement"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:150:1: whileStatement : While '(' expression ')' '{' block '}' -> ^( While expression block ) ;
	public final DataCentricDSLParser.whileStatement_return whileStatement() throws RecognitionException {
		DataCentricDSLParser.whileStatement_return retval = new DataCentricDSLParser.whileStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token While90=null;
		Token char_literal91=null;
		Token char_literal93=null;
		Token char_literal94=null;
		Token char_literal96=null;
		ParserRuleReturnScope expression92 =null;
		ParserRuleReturnScope block95 =null;

		Object While90_tree=null;
		Object char_literal91_tree=null;
		Object char_literal93_tree=null;
		Object char_literal94_tree=null;
		Object char_literal96_tree=null;
		RewriteRuleTokenStream stream_OBrace=new RewriteRuleTokenStream(adaptor,"token OBrace");
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_While=new RewriteRuleTokenStream(adaptor,"token While");
		RewriteRuleTokenStream stream_CBrace=new RewriteRuleTokenStream(adaptor,"token CBrace");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:151:3: ( While '(' expression ')' '{' block '}' -> ^( While expression block ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:151:6: While '(' expression ')' '{' block '}'
			{
			While90=(Token)match(input,While,FOLLOW_While_in_whileStatement747);  
			stream_While.add(While90);

			char_literal91=(Token)match(input,OParen,FOLLOW_OParen_in_whileStatement749);  
			stream_OParen.add(char_literal91);

			pushFollow(FOLLOW_expression_in_whileStatement751);
			expression92=expression();
			state._fsp--;

			stream_expression.add(expression92.getTree());
			char_literal93=(Token)match(input,CParen,FOLLOW_CParen_in_whileStatement753);  
			stream_CParen.add(char_literal93);

			char_literal94=(Token)match(input,OBrace,FOLLOW_OBrace_in_whileStatement755);  
			stream_OBrace.add(char_literal94);

			pushFollow(FOLLOW_block_in_whileStatement757);
			block95=block();
			state._fsp--;

			stream_block.add(block95.getTree());
			char_literal96=(Token)match(input,CBrace,FOLLOW_CBrace_in_whileStatement759);  
			stream_CBrace.add(char_literal96);

			// AST REWRITE
			// elements: expression, block, While
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 151:45: -> ^( While expression block )
			{
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:151:48: ^( While expression block )
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:154:1: idList : Identifier ( ',' Identifier )* -> ^( ID_LIST ( Identifier )+ ) ;
	public final DataCentricDSLParser.idList_return idList() throws RecognitionException {
		DataCentricDSLParser.idList_return retval = new DataCentricDSLParser.idList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier97=null;
		Token char_literal98=null;
		Token Identifier99=null;

		Object Identifier97_tree=null;
		Object char_literal98_tree=null;
		Object Identifier99_tree=null;
		RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:155:3: ( Identifier ( ',' Identifier )* -> ^( ID_LIST ( Identifier )+ ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:155:6: Identifier ( ',' Identifier )*
			{
			Identifier97=(Token)match(input,Identifier,FOLLOW_Identifier_in_idList783);  
			stream_Identifier.add(Identifier97);

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:155:17: ( ',' Identifier )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==Comma) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:155:18: ',' Identifier
					{
					char_literal98=(Token)match(input,Comma,FOLLOW_Comma_in_idList786);  
					stream_Comma.add(char_literal98);

					Identifier99=(Token)match(input,Identifier,FOLLOW_Identifier_in_idList788);  
					stream_Identifier.add(Identifier99);

					}
					break;

				default :
					break loop12;
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
			// 155:35: -> ^( ID_LIST ( Identifier )+ )
			{
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:155:38: ^( ID_LIST ( Identifier )+ )
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:158:1: exprList : expression ( ',' expression )* -> ^( EXP_LIST ( expression )+ ) ;
	public final DataCentricDSLParser.exprList_return exprList() throws RecognitionException {
		DataCentricDSLParser.exprList_return retval = new DataCentricDSLParser.exprList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal101=null;
		ParserRuleReturnScope expression100 =null;
		ParserRuleReturnScope expression102 =null;

		Object char_literal101_tree=null;
		RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:159:3: ( expression ( ',' expression )* -> ^( EXP_LIST ( expression )+ ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:159:6: expression ( ',' expression )*
			{
			pushFollow(FOLLOW_expression_in_exprList813);
			expression100=expression();
			state._fsp--;

			stream_expression.add(expression100.getTree());
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:159:17: ( ',' expression )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==Comma) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:159:18: ',' expression
					{
					char_literal101=(Token)match(input,Comma,FOLLOW_Comma_in_exprList816);  
					stream_Comma.add(char_literal101);

					pushFollow(FOLLOW_expression_in_exprList818);
					expression102=expression();
					state._fsp--;

					stream_expression.add(expression102.getTree());
					}
					break;

				default :
					break loop13;
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
			// 159:35: -> ^( EXP_LIST ( expression )+ )
			{
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:159:38: ^( EXP_LIST ( expression )+ )
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:162:1: expression : ( condExpr | query );
	public final DataCentricDSLParser.expression_return expression() throws RecognitionException {
		DataCentricDSLParser.expression_return retval = new DataCentricDSLParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope condExpr103 =null;
		ParserRuleReturnScope query104 =null;


		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:163:3: ( condExpr | query )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==Assert||LA14_0==Bool||LA14_0==Excl||LA14_0==Identifier||(LA14_0 >= Null && LA14_0 <= Number)||(LA14_0 >= OBracket && LA14_0 <= OParen)||(LA14_0 >= Print && LA14_0 <= Println)||LA14_0==Size||(LA14_0 >= String && LA14_0 <= Subtract)) ) {
				alt14=1;
			}
			else if ( (LA14_0==71) ) {
				alt14=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:163:6: condExpr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_condExpr_in_expression843);
					condExpr103=condExpr();
					state._fsp--;

					adaptor.addChild(root_0, condExpr103.getTree());

					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:163:17: query
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_query_in_expression847);
					query104=query();
					state._fsp--;

					adaptor.addChild(root_0, query104.getTree());

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


	public static class condExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "condExpr"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:170:1: condExpr : ( orExpr -> orExpr ) ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )? ;
	public final DataCentricDSLParser.condExpr_return condExpr() throws RecognitionException {
		DataCentricDSLParser.condExpr_return retval = new DataCentricDSLParser.condExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal106=null;
		Token char_literal107=null;
		Token In108=null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope orExpr105 =null;
		ParserRuleReturnScope expression109 =null;

		Object char_literal106_tree=null;
		Object char_literal107_tree=null;
		Object In108_tree=null;
		RewriteRuleTokenStream stream_In=new RewriteRuleTokenStream(adaptor,"token In");
		RewriteRuleTokenStream stream_Colon=new RewriteRuleTokenStream(adaptor,"token Colon");
		RewriteRuleTokenStream stream_QMark=new RewriteRuleTokenStream(adaptor,"token QMark");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_orExpr=new RewriteRuleSubtreeStream(adaptor,"rule orExpr");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:171:3: ( ( orExpr -> orExpr ) ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )? )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:171:6: ( orExpr -> orExpr ) ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )?
			{
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:171:6: ( orExpr -> orExpr )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:171:7: orExpr
			{
			pushFollow(FOLLOW_orExpr_in_condExpr866);
			orExpr105=orExpr();
			state._fsp--;

			stream_orExpr.add(orExpr105.getTree());
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
			// 171:14: -> orExpr
			{
				adaptor.addChild(root_0, stream_orExpr.nextTree());
			}


			retval.tree = root_0;

			}

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:172:6: ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )?
			int alt15=3;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==QMark) ) {
				alt15=1;
			}
			else if ( (LA15_0==In) ) {
				alt15=2;
			}
			switch (alt15) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:172:8: '?' a= expression ':' b= expression
					{
					char_literal106=(Token)match(input,QMark,FOLLOW_QMark_in_condExpr881);  
					stream_QMark.add(char_literal106);

					pushFollow(FOLLOW_expression_in_condExpr885);
					a=expression();
					state._fsp--;

					stream_expression.add(a.getTree());
					char_literal107=(Token)match(input,Colon,FOLLOW_Colon_in_condExpr887);  
					stream_Colon.add(char_literal107);

					pushFollow(FOLLOW_expression_in_condExpr891);
					b=expression();
					state._fsp--;

					stream_expression.add(b.getTree());
					// AST REWRITE
					// elements: orExpr, a, b
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
					// 172:42: -> ^( TERNARY orExpr $a $b)
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:172:45: ^( TERNARY orExpr $a $b)
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:173:8: In expression
					{
					In108=(Token)match(input,In,FOLLOW_In_in_condExpr914);  
					stream_In.add(In108);

					pushFollow(FOLLOW_expression_in_condExpr916);
					expression109=expression();
					state._fsp--;

					stream_expression.add(expression109.getTree());
					// AST REWRITE
					// elements: expression, orExpr, In
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 173:42: -> ^( In orExpr expression )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:173:45: ^( In orExpr expression )
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:177:1: orExpr : andExpr ( '||' ^ andExpr )* ;
	public final DataCentricDSLParser.orExpr_return orExpr() throws RecognitionException {
		DataCentricDSLParser.orExpr_return retval = new DataCentricDSLParser.orExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal111=null;
		ParserRuleReturnScope andExpr110 =null;
		ParserRuleReturnScope andExpr112 =null;

		Object string_literal111_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:178:3: ( andExpr ( '||' ^ andExpr )* )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:178:6: andExpr ( '||' ^ andExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_andExpr_in_orExpr968);
			andExpr110=andExpr();
			state._fsp--;

			adaptor.addChild(root_0, andExpr110.getTree());

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:178:14: ( '||' ^ andExpr )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==Or) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:178:15: '||' ^ andExpr
					{
					string_literal111=(Token)match(input,Or,FOLLOW_Or_in_orExpr971); 
					string_literal111_tree = (Object)adaptor.create(string_literal111);
					root_0 = (Object)adaptor.becomeRoot(string_literal111_tree, root_0);

					pushFollow(FOLLOW_andExpr_in_orExpr974);
					andExpr112=andExpr();
					state._fsp--;

					adaptor.addChild(root_0, andExpr112.getTree());

					}
					break;

				default :
					break loop16;
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:181:1: andExpr : equExpr ( '&&' ^ equExpr )* ;
	public final DataCentricDSLParser.andExpr_return andExpr() throws RecognitionException {
		DataCentricDSLParser.andExpr_return retval = new DataCentricDSLParser.andExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal114=null;
		ParserRuleReturnScope equExpr113 =null;
		ParserRuleReturnScope equExpr115 =null;

		Object string_literal114_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:182:3: ( equExpr ( '&&' ^ equExpr )* )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:182:6: equExpr ( '&&' ^ equExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_equExpr_in_andExpr990);
			equExpr113=equExpr();
			state._fsp--;

			adaptor.addChild(root_0, equExpr113.getTree());

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:182:14: ( '&&' ^ equExpr )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==And) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:182:15: '&&' ^ equExpr
					{
					string_literal114=(Token)match(input,And,FOLLOW_And_in_andExpr993); 
					string_literal114_tree = (Object)adaptor.create(string_literal114);
					root_0 = (Object)adaptor.becomeRoot(string_literal114_tree, root_0);

					pushFollow(FOLLOW_equExpr_in_andExpr996);
					equExpr115=equExpr();
					state._fsp--;

					adaptor.addChild(root_0, equExpr115.getTree());

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
	// $ANTLR end "andExpr"


	public static class equExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "equExpr"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:185:1: equExpr : relExpr ( ( '==' | '!=' ) ^ relExpr )* ;
	public final DataCentricDSLParser.equExpr_return equExpr() throws RecognitionException {
		DataCentricDSLParser.equExpr_return retval = new DataCentricDSLParser.equExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set117=null;
		ParserRuleReturnScope relExpr116 =null;
		ParserRuleReturnScope relExpr118 =null;

		Object set117_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:186:3: ( relExpr ( ( '==' | '!=' ) ^ relExpr )* )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:186:6: relExpr ( ( '==' | '!=' ) ^ relExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_relExpr_in_equExpr1012);
			relExpr116=relExpr();
			state._fsp--;

			adaptor.addChild(root_0, relExpr116.getTree());

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:186:14: ( ( '==' | '!=' ) ^ relExpr )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==Equals||LA18_0==NEquals) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:186:15: ( '==' | '!=' ) ^ relExpr
					{
					set117=input.LT(1);
					set117=input.LT(1);
					if ( input.LA(1)==Equals||input.LA(1)==NEquals ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set117), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_relExpr_in_equExpr1024);
					relExpr118=relExpr();
					state._fsp--;

					adaptor.addChild(root_0, relExpr118.getTree());

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
	// $ANTLR end "equExpr"


	public static class relExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "relExpr"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:189:1: relExpr : addExpr ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )* ;
	public final DataCentricDSLParser.relExpr_return relExpr() throws RecognitionException {
		DataCentricDSLParser.relExpr_return retval = new DataCentricDSLParser.relExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set120=null;
		ParserRuleReturnScope addExpr119 =null;
		ParserRuleReturnScope addExpr121 =null;

		Object set120_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:190:3: ( addExpr ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )* )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:190:6: addExpr ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_addExpr_in_relExpr1040);
			addExpr119=addExpr();
			state._fsp--;

			adaptor.addChild(root_0, addExpr119.getTree());

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:190:14: ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( ((LA19_0 >= GT && LA19_0 <= GTEquals)||(LA19_0 >= LT && LA19_0 <= LTEquals)) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:190:15: ( '>=' | '<=' | '>' | '<' ) ^ addExpr
					{
					set120=input.LT(1);
					set120=input.LT(1);
					if ( (input.LA(1) >= GT && input.LA(1) <= GTEquals)||(input.LA(1) >= LT && input.LA(1) <= LTEquals) ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set120), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_addExpr_in_relExpr1060);
					addExpr121=addExpr();
					state._fsp--;

					adaptor.addChild(root_0, addExpr121.getTree());

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
	// $ANTLR end "relExpr"


	public static class addExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "addExpr"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:193:1: addExpr : mulExpr ( ( '+' | '-' ) ^ mulExpr )* ;
	public final DataCentricDSLParser.addExpr_return addExpr() throws RecognitionException {
		DataCentricDSLParser.addExpr_return retval = new DataCentricDSLParser.addExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set123=null;
		ParserRuleReturnScope mulExpr122 =null;
		ParserRuleReturnScope mulExpr124 =null;

		Object set123_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:194:3: ( mulExpr ( ( '+' | '-' ) ^ mulExpr )* )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:194:6: mulExpr ( ( '+' | '-' ) ^ mulExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_mulExpr_in_addExpr1076);
			mulExpr122=mulExpr();
			state._fsp--;

			adaptor.addChild(root_0, mulExpr122.getTree());

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:194:14: ( ( '+' | '-' ) ^ mulExpr )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==Add||LA20_0==Subtract) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:194:15: ( '+' | '-' ) ^ mulExpr
					{
					set123=input.LT(1);
					set123=input.LT(1);
					if ( input.LA(1)==Add||input.LA(1)==Subtract ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set123), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_mulExpr_in_addExpr1088);
					mulExpr124=mulExpr();
					state._fsp--;

					adaptor.addChild(root_0, mulExpr124.getTree());

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
	// $ANTLR end "addExpr"


	public static class mulExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "mulExpr"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:197:1: mulExpr : powExpr ( ( '*' | '/' | '%' ) ^ powExpr )* ;
	public final DataCentricDSLParser.mulExpr_return mulExpr() throws RecognitionException {
		DataCentricDSLParser.mulExpr_return retval = new DataCentricDSLParser.mulExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set126=null;
		ParserRuleReturnScope powExpr125 =null;
		ParserRuleReturnScope powExpr127 =null;

		Object set126_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:198:3: ( powExpr ( ( '*' | '/' | '%' ) ^ powExpr )* )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:198:6: powExpr ( ( '*' | '/' | '%' ) ^ powExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_powExpr_in_mulExpr1104);
			powExpr125=powExpr();
			state._fsp--;

			adaptor.addChild(root_0, powExpr125.getTree());

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:198:14: ( ( '*' | '/' | '%' ) ^ powExpr )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==Divide||(LA21_0 >= Modulus && LA21_0 <= Multiply)) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:198:15: ( '*' | '/' | '%' ) ^ powExpr
					{
					set126=input.LT(1);
					set126=input.LT(1);
					if ( input.LA(1)==Divide||(input.LA(1) >= Modulus && input.LA(1) <= Multiply) ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set126), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_powExpr_in_mulExpr1120);
					powExpr127=powExpr();
					state._fsp--;

					adaptor.addChild(root_0, powExpr127.getTree());

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
	// $ANTLR end "mulExpr"


	public static class powExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "powExpr"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:201:1: powExpr : unaryExpr ( '^' ^ unaryExpr )* ;
	public final DataCentricDSLParser.powExpr_return powExpr() throws RecognitionException {
		DataCentricDSLParser.powExpr_return retval = new DataCentricDSLParser.powExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal129=null;
		ParserRuleReturnScope unaryExpr128 =null;
		ParserRuleReturnScope unaryExpr130 =null;

		Object char_literal129_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:202:3: ( unaryExpr ( '^' ^ unaryExpr )* )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:202:6: unaryExpr ( '^' ^ unaryExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_unaryExpr_in_powExpr1136);
			unaryExpr128=unaryExpr();
			state._fsp--;

			adaptor.addChild(root_0, unaryExpr128.getTree());

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:202:16: ( '^' ^ unaryExpr )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==Pow) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:202:17: '^' ^ unaryExpr
					{
					char_literal129=(Token)match(input,Pow,FOLLOW_Pow_in_powExpr1139); 
					char_literal129_tree = (Object)adaptor.create(char_literal129);
					root_0 = (Object)adaptor.becomeRoot(char_literal129_tree, root_0);

					pushFollow(FOLLOW_unaryExpr_in_powExpr1142);
					unaryExpr130=unaryExpr();
					state._fsp--;

					adaptor.addChild(root_0, unaryExpr130.getTree());

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
	// $ANTLR end "powExpr"


	public static class unaryExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "unaryExpr"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:205:1: unaryExpr : ( '-' atom -> ^( UNARY_MIN atom ) | '!' atom -> ^( NEGATE atom ) | atom );
	public final DataCentricDSLParser.unaryExpr_return unaryExpr() throws RecognitionException {
		DataCentricDSLParser.unaryExpr_return retval = new DataCentricDSLParser.unaryExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal131=null;
		Token char_literal133=null;
		ParserRuleReturnScope atom132 =null;
		ParserRuleReturnScope atom134 =null;
		ParserRuleReturnScope atom135 =null;

		Object char_literal131_tree=null;
		Object char_literal133_tree=null;
		RewriteRuleTokenStream stream_Excl=new RewriteRuleTokenStream(adaptor,"token Excl");
		RewriteRuleTokenStream stream_Subtract=new RewriteRuleTokenStream(adaptor,"token Subtract");
		RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:206:3: ( '-' atom -> ^( UNARY_MIN atom ) | '!' atom -> ^( NEGATE atom ) | atom )
			int alt23=3;
			switch ( input.LA(1) ) {
			case Subtract:
				{
				alt23=1;
				}
				break;
			case Excl:
				{
				alt23=2;
				}
				break;
			case Assert:
			case Bool:
			case Identifier:
			case Null:
			case Number:
			case OBracket:
			case OParen:
			case Print:
			case Println:
			case Size:
			case String:
				{
				alt23=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}
			switch (alt23) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:206:6: '-' atom
					{
					char_literal131=(Token)match(input,Subtract,FOLLOW_Subtract_in_unaryExpr1160);  
					stream_Subtract.add(char_literal131);

					pushFollow(FOLLOW_atom_in_unaryExpr1162);
					atom132=atom();
					state._fsp--;

					stream_atom.add(atom132.getTree());
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
					// 206:15: -> ^( UNARY_MIN atom )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:206:18: ^( UNARY_MIN atom )
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:207:6: '!' atom
					{
					char_literal133=(Token)match(input,Excl,FOLLOW_Excl_in_unaryExpr1177);  
					stream_Excl.add(char_literal133);

					pushFollow(FOLLOW_atom_in_unaryExpr1179);
					atom134=atom();
					state._fsp--;

					stream_atom.add(atom134.getTree());
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
					// 207:15: -> ^( NEGATE atom )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:207:18: ^( NEGATE atom )
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:208:6: atom
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_atom_in_unaryExpr1194);
					atom135=atom();
					state._fsp--;

					adaptor.addChild(root_0, atom135.getTree());

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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:211:1: atom : ( Number | Bool | Null | lookup );
	public final DataCentricDSLParser.atom_return atom() throws RecognitionException {
		DataCentricDSLParser.atom_return retval = new DataCentricDSLParser.atom_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Number136=null;
		Token Bool137=null;
		Token Null138=null;
		ParserRuleReturnScope lookup139 =null;

		Object Number136_tree=null;
		Object Bool137_tree=null;
		Object Null138_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:212:3: ( Number | Bool | Null | lookup )
			int alt24=4;
			switch ( input.LA(1) ) {
			case Number:
				{
				alt24=1;
				}
				break;
			case Bool:
				{
				alt24=2;
				}
				break;
			case Null:
				{
				alt24=3;
				}
				break;
			case Assert:
			case Identifier:
			case OBracket:
			case OParen:
			case Print:
			case Println:
			case Size:
			case String:
				{
				alt24=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}
			switch (alt24) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:212:6: Number
					{
					root_0 = (Object)adaptor.nil();


					Number136=(Token)match(input,Number,FOLLOW_Number_in_atom1208); 
					Number136_tree = (Object)adaptor.create(Number136);
					adaptor.addChild(root_0, Number136_tree);

					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:213:6: Bool
					{
					root_0 = (Object)adaptor.nil();


					Bool137=(Token)match(input,Bool,FOLLOW_Bool_in_atom1215); 
					Bool137_tree = (Object)adaptor.create(Bool137);
					adaptor.addChild(root_0, Bool137_tree);

					}
					break;
				case 3 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:214:6: Null
					{
					root_0 = (Object)adaptor.nil();


					Null138=(Token)match(input,Null,FOLLOW_Null_in_atom1222); 
					Null138_tree = (Object)adaptor.create(Null138);
					adaptor.addChild(root_0, Null138_tree);

					}
					break;
				case 4 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:215:6: lookup
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_lookup_in_atom1229);
					lookup139=lookup();
					state._fsp--;

					adaptor.addChild(root_0, lookup139.getTree());

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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:218:1: list : '[' ( exprList )? ']' -> ^( LIST ( exprList )? ) ;
	public final DataCentricDSLParser.list_return list() throws RecognitionException {
		DataCentricDSLParser.list_return retval = new DataCentricDSLParser.list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal140=null;
		Token char_literal142=null;
		ParserRuleReturnScope exprList141 =null;

		Object char_literal140_tree=null;
		Object char_literal142_tree=null;
		RewriteRuleTokenStream stream_CBracket=new RewriteRuleTokenStream(adaptor,"token CBracket");
		RewriteRuleTokenStream stream_OBracket=new RewriteRuleTokenStream(adaptor,"token OBracket");
		RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:219:3: ( '[' ( exprList )? ']' -> ^( LIST ( exprList )? ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:219:6: '[' ( exprList )? ']'
			{
			char_literal140=(Token)match(input,OBracket,FOLLOW_OBracket_in_list1243);  
			stream_OBracket.add(char_literal140);

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:219:10: ( exprList )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==Assert||LA25_0==Bool||LA25_0==Excl||LA25_0==Identifier||(LA25_0 >= Null && LA25_0 <= Number)||(LA25_0 >= OBracket && LA25_0 <= OParen)||(LA25_0 >= Print && LA25_0 <= Println)||LA25_0==Size||(LA25_0 >= String && LA25_0 <= Subtract)||LA25_0==71) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:219:10: exprList
					{
					pushFollow(FOLLOW_exprList_in_list1245);
					exprList141=exprList();
					state._fsp--;

					stream_exprList.add(exprList141.getTree());
					}
					break;

			}

			char_literal142=(Token)match(input,CBracket,FOLLOW_CBracket_in_list1248);  
			stream_CBracket.add(char_literal142);

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
			// 219:24: -> ^( LIST ( exprList )? )
			{
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:219:27: ^( LIST ( exprList )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:219:34: ( exprList )?
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:222:1: lookup : ( functionCall ( indexes )? -> ^( LOOKUP functionCall ( indexes )? ) | list ( indexes )? -> ^( LOOKUP list ( indexes )? ) | Identifier ( indexes )? -> ^( LOOKUP Identifier ( indexes )? ) | String ( indexes )? -> ^( LOOKUP String ( indexes )? ) | '(' expression ')' ( indexes )? -> ^( LOOKUP expression ( indexes )? ) );
	public final DataCentricDSLParser.lookup_return lookup() throws RecognitionException {
		DataCentricDSLParser.lookup_return retval = new DataCentricDSLParser.lookup_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier147=null;
		Token String149=null;
		Token char_literal151=null;
		Token char_literal153=null;
		ParserRuleReturnScope functionCall143 =null;
		ParserRuleReturnScope indexes144 =null;
		ParserRuleReturnScope list145 =null;
		ParserRuleReturnScope indexes146 =null;
		ParserRuleReturnScope indexes148 =null;
		ParserRuleReturnScope indexes150 =null;
		ParserRuleReturnScope expression152 =null;
		ParserRuleReturnScope indexes154 =null;

		Object Identifier147_tree=null;
		Object String149_tree=null;
		Object char_literal151_tree=null;
		Object char_literal153_tree=null;
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_String=new RewriteRuleTokenStream(adaptor,"token String");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_functionCall=new RewriteRuleSubtreeStream(adaptor,"rule functionCall");
		RewriteRuleSubtreeStream stream_indexes=new RewriteRuleSubtreeStream(adaptor,"rule indexes");
		RewriteRuleSubtreeStream stream_list=new RewriteRuleSubtreeStream(adaptor,"rule list");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:223:3: ( functionCall ( indexes )? -> ^( LOOKUP functionCall ( indexes )? ) | list ( indexes )? -> ^( LOOKUP list ( indexes )? ) | Identifier ( indexes )? -> ^( LOOKUP Identifier ( indexes )? ) | String ( indexes )? -> ^( LOOKUP String ( indexes )? ) | '(' expression ')' ( indexes )? -> ^( LOOKUP expression ( indexes )? ) )
			int alt31=5;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				int LA31_1 = input.LA(2);
				if ( (LA31_1==OParen) ) {
					alt31=1;
				}
				else if ( ((LA31_1 >= Add && LA31_1 <= And)||(LA31_1 >= CBracket && LA31_1 <= Comma)||LA31_1==Divide||LA31_1==Equals||(LA31_1 >= GT && LA31_1 <= GTEquals)||LA31_1==In||(LA31_1 >= LT && LA31_1 <= Multiply)||LA31_1==NEquals||LA31_1==OBracket||(LA31_1 >= Or && LA31_1 <= Pow)||LA31_1==QMark||LA31_1==SColon||LA31_1==Subtract) ) {
					alt31=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 31, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case Assert:
			case Print:
			case Println:
			case Size:
				{
				alt31=1;
				}
				break;
			case OBracket:
				{
				alt31=2;
				}
				break;
			case String:
				{
				alt31=4;
				}
				break;
			case OParen:
				{
				alt31=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}
			switch (alt31) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:223:6: functionCall ( indexes )?
					{
					pushFollow(FOLLOW_functionCall_in_lookup1271);
					functionCall143=functionCall();
					state._fsp--;

					stream_functionCall.add(functionCall143.getTree());
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:223:19: ( indexes )?
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==OBracket) ) {
						alt26=1;
					}
					switch (alt26) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:223:19: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1273);
							indexes144=indexes();
							state._fsp--;

							stream_indexes.add(indexes144.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: functionCall, indexes
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 223:34: -> ^( LOOKUP functionCall ( indexes )? )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:223:37: ^( LOOKUP functionCall ( indexes )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
						adaptor.addChild(root_1, stream_functionCall.nextTree());
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:223:59: ( indexes )?
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:224:6: list ( indexes )?
					{
					pushFollow(FOLLOW_list_in_lookup1298);
					list145=list();
					state._fsp--;

					stream_list.add(list145.getTree());
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:224:11: ( indexes )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==OBracket) ) {
						alt27=1;
					}
					switch (alt27) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:224:11: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1300);
							indexes146=indexes();
							state._fsp--;

							stream_indexes.add(indexes146.getTree());
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
					// 224:34: -> ^( LOOKUP list ( indexes )? )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:224:37: ^( LOOKUP list ( indexes )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
						adaptor.addChild(root_1, stream_list.nextTree());
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:224:51: ( indexes )?
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:225:6: Identifier ( indexes )?
					{
					Identifier147=(Token)match(input,Identifier,FOLLOW_Identifier_in_lookup1333);  
					stream_Identifier.add(Identifier147);

					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:225:17: ( indexes )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==OBracket) ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:225:17: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1335);
							indexes148=indexes();
							state._fsp--;

							stream_indexes.add(indexes148.getTree());
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
					// 225:34: -> ^( LOOKUP Identifier ( indexes )? )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:225:37: ^( LOOKUP Identifier ( indexes )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
						adaptor.addChild(root_1, stream_Identifier.nextNode());
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:225:57: ( indexes )?
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:226:6: String ( indexes )?
					{
					String149=(Token)match(input,String,FOLLOW_String_in_lookup1362);  
					stream_String.add(String149);

					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:226:13: ( indexes )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==OBracket) ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:226:13: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1364);
							indexes150=indexes();
							state._fsp--;

							stream_indexes.add(indexes150.getTree());
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
					// 226:34: -> ^( LOOKUP String ( indexes )? )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:226:37: ^( LOOKUP String ( indexes )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
						adaptor.addChild(root_1, stream_String.nextNode());
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:226:53: ( indexes )?
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
				case 5 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:227:6: '(' expression ')' ( indexes )?
					{
					char_literal151=(Token)match(input,OParen,FOLLOW_OParen_in_lookup1395);  
					stream_OParen.add(char_literal151);

					pushFollow(FOLLOW_expression_in_lookup1397);
					expression152=expression();
					state._fsp--;

					stream_expression.add(expression152.getTree());
					char_literal153=(Token)match(input,CParen,FOLLOW_CParen_in_lookup1399);  
					stream_CParen.add(char_literal153);

					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:227:25: ( indexes )?
					int alt30=2;
					int LA30_0 = input.LA(1);
					if ( (LA30_0==OBracket) ) {
						alt30=1;
					}
					switch (alt30) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:227:25: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1401);
							indexes154=indexes();
							state._fsp--;

							stream_indexes.add(indexes154.getTree());
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
					// 227:34: -> ^( LOOKUP expression ( indexes )? )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:227:37: ^( LOOKUP expression ( indexes )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
						adaptor.addChild(root_1, stream_expression.nextTree());
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:227:57: ( indexes )?
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:230:1: indexes : ( '[' expression ']' )+ -> ^( INDEXES ( expression )+ ) ;
	public final DataCentricDSLParser.indexes_return indexes() throws RecognitionException {
		DataCentricDSLParser.indexes_return retval = new DataCentricDSLParser.indexes_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal155=null;
		Token char_literal157=null;
		ParserRuleReturnScope expression156 =null;

		Object char_literal155_tree=null;
		Object char_literal157_tree=null;
		RewriteRuleTokenStream stream_CBracket=new RewriteRuleTokenStream(adaptor,"token CBracket");
		RewriteRuleTokenStream stream_OBracket=new RewriteRuleTokenStream(adaptor,"token OBracket");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:231:3: ( ( '[' expression ']' )+ -> ^( INDEXES ( expression )+ ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:231:6: ( '[' expression ']' )+
			{
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:231:6: ( '[' expression ']' )+
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:231:7: '[' expression ']'
					{
					char_literal155=(Token)match(input,OBracket,FOLLOW_OBracket_in_indexes1428);  
					stream_OBracket.add(char_literal155);

					pushFollow(FOLLOW_expression_in_indexes1430);
					expression156=expression();
					state._fsp--;

					stream_expression.add(expression156.getTree());
					char_literal157=(Token)match(input,CBracket,FOLLOW_CBracket_in_indexes1432);  
					stream_CBracket.add(char_literal157);

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
			// 231:28: -> ^( INDEXES ( expression )+ )
			{
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\org\\dataCentricDSL\\DataCentricDSL.g:231:31: ^( INDEXES ( expression )+ )
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
	public static final BitSet FOLLOW_statement_in_block170 = new BitSet(new long[]{0x4980001820000082L,0x00000000000000E0L});
	public static final BitSet FOLLOW_functionDecl_in_block174 = new BitSet(new long[]{0x4980001820000082L,0x00000000000000E0L});
	public static final BitSet FOLLOW_Return_in_block179 = new BitSet(new long[]{0x419B000804000480L,0x0000000000000083L});
	public static final BitSet FOLLOW_expression_in_block181 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_SColon_in_block183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_statement225 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_SColon_in_statement227 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_statement241 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_SColon_in_statement243 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_statement254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forStatement_in_statement261 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStatement_in_statement268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_query_in_statement275 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_SColon_in_statement277 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_71_in_query294 = new BitSet(new long[]{0x0000000800000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_String_in_query298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableCall_in_query302 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_variableCall313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_assignment325 = new BitSet(new long[]{0x0008000000000100L});
	public static final BitSet FOLLOW_indexes_in_assignment327 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Assign_in_assignment330 = new BitSet(new long[]{0x419B000804000480L,0x0000000000000083L});
	public static final BitSet FOLLOW_expression_in_assignment332 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_functionCall360 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall362 = new BitSet(new long[]{0x419B000804002480L,0x0000000000000083L});
	public static final BitSet FOLLOW_exprList_in_functionCall364 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CParen_in_functionCall367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Println_in_functionCall385 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall387 = new BitSet(new long[]{0x419B000804002480L,0x0000000000000083L});
	public static final BitSet FOLLOW_expression_in_functionCall389 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CParen_in_functionCall392 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Print_in_functionCall414 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall416 = new BitSet(new long[]{0x419B000804000480L,0x0000000000000083L});
	public static final BitSet FOLLOW_expression_in_functionCall418 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CParen_in_functionCall420 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Assert_in_functionCall441 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall443 = new BitSet(new long[]{0x419B000804000480L,0x0000000000000083L});
	public static final BitSet FOLLOW_expression_in_functionCall445 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CParen_in_functionCall447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Size_in_functionCall467 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall469 = new BitSet(new long[]{0x419B000804000480L,0x0000000000000083L});
	public static final BitSet FOLLOW_expression_in_functionCall471 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CParen_in_functionCall473 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStat_in_ifStatement502 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_elseIfStat_in_ifStatement504 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_elseStat_in_ifStatement507 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_If_in_ifStat536 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_OParen_in_ifStat538 = new BitSet(new long[]{0x419B000804000480L,0x0000000000000083L});
	public static final BitSet FOLLOW_expression_in_ifStat540 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CParen_in_ifStat542 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_OBrace_in_ifStat544 = new BitSet(new long[]{0x4980001820000880L,0x00000000000000E0L});
	public static final BitSet FOLLOW_block_in_ifStat546 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CBrace_in_ifStat548 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Else_in_elseIfStat572 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_If_in_elseIfStat574 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_OParen_in_elseIfStat576 = new BitSet(new long[]{0x419B000804000480L,0x0000000000000083L});
	public static final BitSet FOLLOW_expression_in_elseIfStat578 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CParen_in_elseIfStat580 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_OBrace_in_elseIfStat582 = new BitSet(new long[]{0x4980001820000880L,0x00000000000000E0L});
	public static final BitSet FOLLOW_block_in_elseIfStat584 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CBrace_in_elseIfStat586 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Else_in_elseStat610 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_OBrace_in_elseStat612 = new BitSet(new long[]{0x4980001820000880L,0x00000000000000E0L});
	public static final BitSet FOLLOW_block_in_elseStat614 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CBrace_in_elseStat616 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_70_in_functionDecl638 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_Identifier_in_functionDecl640 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_OParen_in_functionDecl642 = new BitSet(new long[]{0x0000000800002000L});
	public static final BitSet FOLLOW_idList_in_functionDecl644 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CParen_in_functionDecl647 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_OBrace_in_functionDecl649 = new BitSet(new long[]{0x4980001820000880L,0x00000000000000E0L});
	public static final BitSet FOLLOW_block_in_functionDecl651 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CBrace_in_functionDecl653 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_For_in_forStatement678 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_OParen_in_forStatement680 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_Identifier_in_forStatement682 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Assign_in_forStatement684 = new BitSet(new long[]{0x419B000804000480L,0x0000000000000083L});
	public static final BitSet FOLLOW_expression_in_forStatement686 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_SColon_in_forStatement688 = new BitSet(new long[]{0x419B000804000480L,0x0000000000000083L});
	public static final BitSet FOLLOW_expression_in_forStatement690 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_SColon_in_forStatement692 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_Identifier_in_forStatement694 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Assign_in_forStatement696 = new BitSet(new long[]{0x419B000804000480L,0x0000000000000083L});
	public static final BitSet FOLLOW_expression_in_forStatement698 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CParen_in_forStatement700 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_OBrace_in_forStatement702 = new BitSet(new long[]{0x4980001820000880L,0x00000000000000E0L});
	public static final BitSet FOLLOW_block_in_forStatement704 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CBrace_in_forStatement706 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_While_in_whileStatement747 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_OParen_in_whileStatement749 = new BitSet(new long[]{0x419B000804000480L,0x0000000000000083L});
	public static final BitSet FOLLOW_expression_in_whileStatement751 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CParen_in_whileStatement753 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_OBrace_in_whileStatement755 = new BitSet(new long[]{0x4980001820000880L,0x00000000000000E0L});
	public static final BitSet FOLLOW_block_in_whileStatement757 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CBrace_in_whileStatement759 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_idList783 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_Comma_in_idList786 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_Identifier_in_idList788 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_expression_in_exprList813 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_Comma_in_exprList816 = new BitSet(new long[]{0x419B000804000480L,0x0000000000000083L});
	public static final BitSet FOLLOW_expression_in_exprList818 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_condExpr_in_expression843 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_query_in_expression847 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_orExpr_in_condExpr866 = new BitSet(new long[]{0x0200002000000002L});
	public static final BitSet FOLLOW_QMark_in_condExpr881 = new BitSet(new long[]{0x419B000804000480L,0x0000000000000083L});
	public static final BitSet FOLLOW_expression_in_condExpr885 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_Colon_in_condExpr887 = new BitSet(new long[]{0x419B000804000480L,0x0000000000000083L});
	public static final BitSet FOLLOW_expression_in_condExpr891 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_In_in_condExpr914 = new BitSet(new long[]{0x419B000804000480L,0x0000000000000083L});
	public static final BitSet FOLLOW_expression_in_condExpr916 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_andExpr_in_orExpr968 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_Or_in_orExpr971 = new BitSet(new long[]{0x419B000804000480L,0x0000000000000003L});
	public static final BitSet FOLLOW_andExpr_in_orExpr974 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_equExpr_in_andExpr990 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_And_in_andExpr993 = new BitSet(new long[]{0x419B000804000480L,0x0000000000000003L});
	public static final BitSet FOLLOW_equExpr_in_andExpr996 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_relExpr_in_equExpr1012 = new BitSet(new long[]{0x0000800002000002L});
	public static final BitSet FOLLOW_set_in_equExpr1015 = new BitSet(new long[]{0x419B000804000480L,0x0000000000000003L});
	public static final BitSet FOLLOW_relExpr_in_equExpr1024 = new BitSet(new long[]{0x0000800002000002L});
	public static final BitSet FOLLOW_addExpr_in_relExpr1040 = new BitSet(new long[]{0x00000C00C0000002L});
	public static final BitSet FOLLOW_set_in_relExpr1043 = new BitSet(new long[]{0x419B000804000480L,0x0000000000000003L});
	public static final BitSet FOLLOW_addExpr_in_relExpr1060 = new BitSet(new long[]{0x00000C00C0000002L});
	public static final BitSet FOLLOW_mulExpr_in_addExpr1076 = new BitSet(new long[]{0x0000000000000022L,0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_addExpr1079 = new BitSet(new long[]{0x419B000804000480L,0x0000000000000003L});
	public static final BitSet FOLLOW_mulExpr_in_addExpr1088 = new BitSet(new long[]{0x0000000000000022L,0x0000000000000002L});
	public static final BitSet FOLLOW_powExpr_in_mulExpr1104 = new BitSet(new long[]{0x0000300000080002L});
	public static final BitSet FOLLOW_set_in_mulExpr1107 = new BitSet(new long[]{0x419B000804000480L,0x0000000000000003L});
	public static final BitSet FOLLOW_powExpr_in_mulExpr1120 = new BitSet(new long[]{0x0000300000080002L});
	public static final BitSet FOLLOW_unaryExpr_in_powExpr1136 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_Pow_in_powExpr1139 = new BitSet(new long[]{0x419B000804000480L,0x0000000000000003L});
	public static final BitSet FOLLOW_unaryExpr_in_powExpr1142 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_Subtract_in_unaryExpr1160 = new BitSet(new long[]{0x419B000800000480L,0x0000000000000001L});
	public static final BitSet FOLLOW_atom_in_unaryExpr1162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Excl_in_unaryExpr1177 = new BitSet(new long[]{0x419B000800000480L,0x0000000000000001L});
	public static final BitSet FOLLOW_atom_in_unaryExpr1179 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_unaryExpr1194 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Number_in_atom1208 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Bool_in_atom1215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Null_in_atom1222 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lookup_in_atom1229 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OBracket_in_list1243 = new BitSet(new long[]{0x419B000804001480L,0x0000000000000083L});
	public static final BitSet FOLLOW_exprList_in_list1245 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CBracket_in_list1248 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_lookup1271 = new BitSet(new long[]{0x0008000000000002L});
	public static final BitSet FOLLOW_indexes_in_lookup1273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_list_in_lookup1298 = new BitSet(new long[]{0x0008000000000002L});
	public static final BitSet FOLLOW_indexes_in_lookup1300 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_lookup1333 = new BitSet(new long[]{0x0008000000000002L});
	public static final BitSet FOLLOW_indexes_in_lookup1335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_String_in_lookup1362 = new BitSet(new long[]{0x0008000000000002L});
	public static final BitSet FOLLOW_indexes_in_lookup1364 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OParen_in_lookup1395 = new BitSet(new long[]{0x419B000804000480L,0x0000000000000083L});
	public static final BitSet FOLLOW_expression_in_lookup1397 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CParen_in_lookup1399 = new BitSet(new long[]{0x0008000000000002L});
	public static final BitSet FOLLOW_indexes_in_lookup1401 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OBracket_in_indexes1428 = new BitSet(new long[]{0x419B000804000480L,0x0000000000000083L});
	public static final BitSet FOLLOW_expression_in_indexes1430 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CBracket_in_indexes1432 = new BitSet(new long[]{0x0008000000000002L});
}
