// $ANTLR 3.5.2 D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g 2015-02-15 19:01:38

  package bg.tues.didi;
  import bg.tues.didi.*; 
  import java.util.Map;
  import java.util.HashMap;
  import bg.tues.didi.Function;


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
	@Override public String getGrammarFileName() { return "D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g"; }


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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:81:1: program : ( functionDef )* block EOF -> block ;
	public final DataCentricDSLParser.program_return program() throws RecognitionException {
		DataCentricDSLParser.program_return retval = new DataCentricDSLParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EOF3=null;
		ParserRuleReturnScope functionDef1 =null;
		ParserRuleReturnScope block2 =null;

		Object EOF3_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_functionDef=new RewriteRuleSubtreeStream(adaptor,"rule functionDef");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:82:3: ( ( functionDef )* block EOF -> block )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:82:6: ( functionDef )* block EOF
			{
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:82:6: ( functionDef )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==74) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:82:7: functionDef
					{
					pushFollow(FOLLOW_functionDef_in_program160);
					functionDef1=functionDef();
					state._fsp--;

					stream_functionDef.add(functionDef1.getTree());
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
			// 82:31: -> block
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:85:1: block : ( statement )* ( Return expression ';' )? -> ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) ;
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
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:86:3: ( ( statement )* ( Return expression ';' )? -> ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:86:6: ( statement )* ( Return expression ';' )?
			{
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:86:6: ( statement )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==Assert||LA2_0==For||(LA2_0 >= Identifier && LA2_0 <= If)||(LA2_0 >= Print && LA2_0 <= Println)||LA2_0==Size||LA2_0==While||(LA2_0 >= 75 && LA2_0 <= 77)) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:86:6: statement
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

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:86:17: ( Return expression ';' )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==Return) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:86:18: Return expression ';'
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
			// elements: statement, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 87:6: -> ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) )
			{
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:87:9: ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:87:17: ^( STATEMENTS ( statement )* )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(STATEMENTS, "STATEMENTS"), root_2);
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:87:30: ( statement )*
				while ( stream_statement.hasNext() ) {
					adaptor.addChild(root_2, stream_statement.nextTree());
				}
				stream_statement.reset();

				adaptor.addChild(root_1, root_2);
				}

				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:87:42: ^( RETURN ( expression )? )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(RETURN, "RETURN"), root_2);
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:87:51: ( expression )?
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:90:1: statement : ( assignment ';' -> assignment | incrementation ';' -> incrementation | functionCall ';' -> functionCall | ifStatement | forStatement | whileStatement | query ';' -> query | update ';' -> update | println ';' -> println | print ';' -> print );
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
		Token char_literal24=null;
		ParserRuleReturnScope assignment8 =null;
		ParserRuleReturnScope incrementation10 =null;
		ParserRuleReturnScope functionCall12 =null;
		ParserRuleReturnScope ifStatement14 =null;
		ParserRuleReturnScope forStatement15 =null;
		ParserRuleReturnScope whileStatement16 =null;
		ParserRuleReturnScope query17 =null;
		ParserRuleReturnScope update19 =null;
		ParserRuleReturnScope println21 =null;
		ParserRuleReturnScope print23 =null;

		Object char_literal9_tree=null;
		Object char_literal11_tree=null;
		Object char_literal13_tree=null;
		Object char_literal18_tree=null;
		Object char_literal20_tree=null;
		Object char_literal22_tree=null;
		Object char_literal24_tree=null;
		RewriteRuleTokenStream stream_SColon=new RewriteRuleTokenStream(adaptor,"token SColon");
		RewriteRuleSubtreeStream stream_update=new RewriteRuleSubtreeStream(adaptor,"rule update");
		RewriteRuleSubtreeStream stream_functionCall=new RewriteRuleSubtreeStream(adaptor,"rule functionCall");
		RewriteRuleSubtreeStream stream_assignment=new RewriteRuleSubtreeStream(adaptor,"rule assignment");
		RewriteRuleSubtreeStream stream_println=new RewriteRuleSubtreeStream(adaptor,"rule println");
		RewriteRuleSubtreeStream stream_query=new RewriteRuleSubtreeStream(adaptor,"rule query");
		RewriteRuleSubtreeStream stream_print=new RewriteRuleSubtreeStream(adaptor,"rule print");
		RewriteRuleSubtreeStream stream_incrementation=new RewriteRuleSubtreeStream(adaptor,"rule incrementation");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:91:3: ( assignment ';' -> assignment | incrementation ';' -> incrementation | functionCall ';' -> functionCall | ifStatement | forStatement | whileStatement | query ';' -> query | update ';' -> update | println ';' -> println | print ';' -> print )
			int alt4=10;
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
			case 77:
				{
				alt4=8;
				}
				break;
			case Println:
				{
				alt4=9;
				}
				break;
			case Print:
				{
				alt4=10;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:91:6: assignment ';'
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
					// 91:23: -> assignment
					{
						adaptor.addChild(root_0, stream_assignment.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:92:6: incrementation ';'
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
					// 92:25: -> incrementation
					{
						adaptor.addChild(root_0, stream_incrementation.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:93:6: functionCall ';'
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
					// 93:23: -> functionCall
					{
						adaptor.addChild(root_0, stream_functionCall.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:94:6: ifStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_ifStatement_in_statement275);
					ifStatement14=ifStatement();
					state._fsp--;

					adaptor.addChild(root_0, ifStatement14.getTree());

					}
					break;
				case 5 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:95:6: forStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_forStatement_in_statement282);
					forStatement15=forStatement();
					state._fsp--;

					adaptor.addChild(root_0, forStatement15.getTree());

					}
					break;
				case 6 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:96:6: whileStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_whileStatement_in_statement289);
					whileStatement16=whileStatement();
					state._fsp--;

					adaptor.addChild(root_0, whileStatement16.getTree());

					}
					break;
				case 7 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:97:6: query ';'
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
					// 97:16: -> query
					{
						adaptor.addChild(root_0, stream_query.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 8 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:98:6: update ';'
					{
					pushFollow(FOLLOW_update_in_statement309);
					update19=update();
					state._fsp--;

					stream_update.add(update19.getTree());
					char_literal20=(Token)match(input,SColon,FOLLOW_SColon_in_statement311);  
					stream_SColon.add(char_literal20);

					// AST REWRITE
					// elements: update
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 98:17: -> update
					{
						adaptor.addChild(root_0, stream_update.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 9 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:99:6: println ';'
					{
					pushFollow(FOLLOW_println_in_statement322);
					println21=println();
					state._fsp--;

					stream_println.add(println21.getTree());
					char_literal22=(Token)match(input,SColon,FOLLOW_SColon_in_statement324);  
					stream_SColon.add(char_literal22);

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
				case 10 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:100:6: print ';'
					{
					pushFollow(FOLLOW_print_in_statement335);
					print23=print();
					state._fsp--;

					stream_print.add(print23.getTree());
					char_literal24=(Token)match(input,SColon,FOLLOW_SColon_in_statement337);  
					stream_SColon.add(char_literal24);

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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:103:1: query : 'query' ^ ( expression | functionCall ) ;
	public final DataCentricDSLParser.query_return query() throws RecognitionException {
		DataCentricDSLParser.query_return retval = new DataCentricDSLParser.query_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal25=null;
		ParserRuleReturnScope expression26 =null;
		ParserRuleReturnScope functionCall27 =null;

		Object string_literal25_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:103:6: ( 'query' ^ ( expression | functionCall ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:104:3: 'query' ^ ( expression | functionCall )
			{
			root_0 = (Object)adaptor.nil();


			string_literal25=(Token)match(input,76,FOLLOW_76_in_query354); 
			string_literal25_tree = (Object)adaptor.create(string_literal25);
			root_0 = (Object)adaptor.becomeRoot(string_literal25_tree, root_0);

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:104:12: ( expression | functionCall )
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:104:13: expression
					{
					pushFollow(FOLLOW_expression_in_query358);
					expression26=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression26.getTree());

					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:104:26: functionCall
					{
					pushFollow(FOLLOW_functionCall_in_query362);
					functionCall27=functionCall();
					state._fsp--;

					adaptor.addChild(root_0, functionCall27.getTree());

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


	public static class update_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "update"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:107:1: update : 'update' ^ ( expression ) ;
	public final DataCentricDSLParser.update_return update() throws RecognitionException {
		DataCentricDSLParser.update_return retval = new DataCentricDSLParser.update_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal28=null;
		ParserRuleReturnScope expression29 =null;

		Object string_literal28_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:107:7: ( 'update' ^ ( expression ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:108:3: 'update' ^ ( expression )
			{
			root_0 = (Object)adaptor.nil();


			string_literal28=(Token)match(input,77,FOLLOW_77_in_update373); 
			string_literal28_tree = (Object)adaptor.create(string_literal28);
			root_0 = (Object)adaptor.becomeRoot(string_literal28_tree, root_0);

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:108:13: ( expression )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:108:14: expression
			{
			pushFollow(FOLLOW_expression_in_update377);
			expression29=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression29.getTree());

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
	// $ANTLR end "update"


	public static class variableCall_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "variableCall"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:111:1: variableCall : Identifier ;
	public final DataCentricDSLParser.variableCall_return variableCall() throws RecognitionException {
		DataCentricDSLParser.variableCall_return retval = new DataCentricDSLParser.variableCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier30=null;

		Object Identifier30_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:111:13: ( Identifier )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:112:3: Identifier
			{
			root_0 = (Object)adaptor.nil();


			Identifier30=(Token)match(input,Identifier,FOLLOW_Identifier_in_variableCall388); 
			Identifier30_tree = (Object)adaptor.create(Identifier30);
			adaptor.addChild(root_0, Identifier30_tree);

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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:115:1: assignment : ( Identifier ( indexes )? '=' ( expression -> ^( ASSIGNMENT Identifier ( indexes )? expression ) | functionCall -> ^( ASSIGNMENT Identifier ( indexes )? functionCall ) ) | 'global' Identifier ( indexes )? '=' ( expression -> ^( 'global' ASSIGNMENT Identifier ( indexes )? expression ) | functionCall -> ^( 'global' ASSIGNMENT Identifier ( indexes )? functionCall ) ) );
	public final DataCentricDSLParser.assignment_return assignment() throws RecognitionException {
		DataCentricDSLParser.assignment_return retval = new DataCentricDSLParser.assignment_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier31=null;
		Token char_literal33=null;
		Token string_literal36=null;
		Token Identifier37=null;
		Token char_literal39=null;
		ParserRuleReturnScope indexes32 =null;
		ParserRuleReturnScope expression34 =null;
		ParserRuleReturnScope functionCall35 =null;
		ParserRuleReturnScope indexes38 =null;
		ParserRuleReturnScope expression40 =null;
		ParserRuleReturnScope functionCall41 =null;

		Object Identifier31_tree=null;
		Object char_literal33_tree=null;
		Object string_literal36_tree=null;
		Object Identifier37_tree=null;
		Object char_literal39_tree=null;
		RewriteRuleTokenStream stream_Assign=new RewriteRuleTokenStream(adaptor,"token Assign");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_functionCall=new RewriteRuleSubtreeStream(adaptor,"rule functionCall");
		RewriteRuleSubtreeStream stream_indexes=new RewriteRuleSubtreeStream(adaptor,"rule indexes");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:116:3: ( Identifier ( indexes )? '=' ( expression -> ^( ASSIGNMENT Identifier ( indexes )? expression ) | functionCall -> ^( ASSIGNMENT Identifier ( indexes )? functionCall ) ) | 'global' Identifier ( indexes )? '=' ( expression -> ^( 'global' ASSIGNMENT Identifier ( indexes )? expression ) | functionCall -> ^( 'global' ASSIGNMENT Identifier ( indexes )? functionCall ) ) )
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:116:6: Identifier ( indexes )? '=' ( expression -> ^( ASSIGNMENT Identifier ( indexes )? expression ) | functionCall -> ^( ASSIGNMENT Identifier ( indexes )? functionCall ) )
					{
					Identifier31=(Token)match(input,Identifier,FOLLOW_Identifier_in_assignment400);  
					stream_Identifier.add(Identifier31);

					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:116:17: ( indexes )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==OBracket) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:116:17: indexes
							{
							pushFollow(FOLLOW_indexes_in_assignment402);
							indexes32=indexes();
							state._fsp--;

							stream_indexes.add(indexes32.getTree());
							}
							break;

					}

					char_literal33=(Token)match(input,Assign,FOLLOW_Assign_in_assignment405);  
					stream_Assign.add(char_literal33);

					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:116:30: ( expression -> ^( ASSIGNMENT Identifier ( indexes )? expression ) | functionCall -> ^( ASSIGNMENT Identifier ( indexes )? functionCall ) )
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
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:116:31: expression
							{
							pushFollow(FOLLOW_expression_in_assignment408);
							expression34=expression();
							state._fsp--;

							stream_expression.add(expression34.getTree());
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
							// 116:42: -> ^( ASSIGNMENT Identifier ( indexes )? expression )
							{
								// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:116:45: ^( ASSIGNMENT Identifier ( indexes )? expression )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ASSIGNMENT, "ASSIGNMENT"), root_1);
								adaptor.addChild(root_1, stream_Identifier.nextNode());
								// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:116:69: ( indexes )?
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
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:117:6: functionCall
							{
							pushFollow(FOLLOW_functionCall_in_assignment428);
							functionCall35=functionCall();
							state._fsp--;

							stream_functionCall.add(functionCall35.getTree());
							// AST REWRITE
							// elements: indexes, Identifier, functionCall
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 117:19: -> ^( ASSIGNMENT Identifier ( indexes )? functionCall )
							{
								// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:117:22: ^( ASSIGNMENT Identifier ( indexes )? functionCall )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ASSIGNMENT, "ASSIGNMENT"), root_1);
								adaptor.addChild(root_1, stream_Identifier.nextNode());
								// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:117:46: ( indexes )?
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:118:6: 'global' Identifier ( indexes )? '=' ( expression -> ^( 'global' ASSIGNMENT Identifier ( indexes )? expression ) | functionCall -> ^( 'global' ASSIGNMENT Identifier ( indexes )? functionCall ) )
					{
					string_literal36=(Token)match(input,75,FOLLOW_75_in_assignment449);  
					stream_75.add(string_literal36);

					Identifier37=(Token)match(input,Identifier,FOLLOW_Identifier_in_assignment451);  
					stream_Identifier.add(Identifier37);

					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:118:26: ( indexes )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==OBracket) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:118:26: indexes
							{
							pushFollow(FOLLOW_indexes_in_assignment453);
							indexes38=indexes();
							state._fsp--;

							stream_indexes.add(indexes38.getTree());
							}
							break;

					}

					char_literal39=(Token)match(input,Assign,FOLLOW_Assign_in_assignment456);  
					stream_Assign.add(char_literal39);

					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:118:39: ( expression -> ^( 'global' ASSIGNMENT Identifier ( indexes )? expression ) | functionCall -> ^( 'global' ASSIGNMENT Identifier ( indexes )? functionCall ) )
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
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:118:40: expression
							{
							pushFollow(FOLLOW_expression_in_assignment459);
							expression40=expression();
							state._fsp--;

							stream_expression.add(expression40.getTree());
							// AST REWRITE
							// elements: indexes, expression, 75, Identifier
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 118:51: -> ^( 'global' ASSIGNMENT Identifier ( indexes )? expression )
							{
								// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:118:54: ^( 'global' ASSIGNMENT Identifier ( indexes )? expression )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(stream_75.nextNode(), root_1);
								adaptor.addChild(root_1, (Object)adaptor.create(ASSIGNMENT, "ASSIGNMENT"));
								adaptor.addChild(root_1, stream_Identifier.nextNode());
								// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:118:87: ( indexes )?
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
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:119:6: functionCall
							{
							pushFollow(FOLLOW_functionCall_in_assignment481);
							functionCall41=functionCall();
							state._fsp--;

							stream_functionCall.add(functionCall41.getTree());
							// AST REWRITE
							// elements: indexes, functionCall, 75, Identifier
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 119:19: -> ^( 'global' ASSIGNMENT Identifier ( indexes )? functionCall )
							{
								// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:119:22: ^( 'global' ASSIGNMENT Identifier ( indexes )? functionCall )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot(stream_75.nextNode(), root_1);
								adaptor.addChild(root_1, (Object)adaptor.create(ASSIGNMENT, "ASSIGNMENT"));
								adaptor.addChild(root_1, stream_Identifier.nextNode());
								// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:119:55: ( indexes )?
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:122:1: functionCall : ( Identifier '(' ( exprList )? ')' -> ^( FUNC_CALL Identifier ( exprList )? ) | Assert '(' expression ')' -> ^( FUNC_CALL Assert expression ) | Size '(' expression ')' -> ^( FUNC_CALL Size expression ) );
	public final DataCentricDSLParser.functionCall_return functionCall() throws RecognitionException {
		DataCentricDSLParser.functionCall_return retval = new DataCentricDSLParser.functionCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier42=null;
		Token char_literal43=null;
		Token char_literal45=null;
		Token Assert46=null;
		Token char_literal47=null;
		Token char_literal49=null;
		Token Size50=null;
		Token char_literal51=null;
		Token char_literal53=null;
		ParserRuleReturnScope exprList44 =null;
		ParserRuleReturnScope expression48 =null;
		ParserRuleReturnScope expression52 =null;

		Object Identifier42_tree=null;
		Object char_literal43_tree=null;
		Object char_literal45_tree=null;
		Object Assert46_tree=null;
		Object char_literal47_tree=null;
		Object char_literal49_tree=null;
		Object Size50_tree=null;
		Object char_literal51_tree=null;
		Object char_literal53_tree=null;
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_Assert=new RewriteRuleTokenStream(adaptor,"token Assert");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_Size=new RewriteRuleTokenStream(adaptor,"token Size");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:123:3: ( Identifier '(' ( exprList )? ')' -> ^( FUNC_CALL Identifier ( exprList )? ) | Assert '(' expression ')' -> ^( FUNC_CALL Assert expression ) | Size '(' expression ')' -> ^( FUNC_CALL Size expression ) )
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:123:6: Identifier '(' ( exprList )? ')'
					{
					Identifier42=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionCall511);  
					stream_Identifier.add(Identifier42);

					char_literal43=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall513);  
					stream_OParen.add(char_literal43);

					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:123:21: ( exprList )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==Bool||LA11_0==Excl||LA11_0==Identifier||(LA11_0 >= Null && LA11_0 <= Number)||(LA11_0 >= OBracket && LA11_0 <= OParen)||(LA11_0 >= String && LA11_0 <= Subtract)||LA11_0==76) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:123:21: exprList
							{
							pushFollow(FOLLOW_exprList_in_functionCall515);
							exprList44=exprList();
							state._fsp--;

							stream_exprList.add(exprList44.getTree());
							}
							break;

					}

					char_literal45=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall518);  
					stream_CParen.add(char_literal45);

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
					// 123:35: -> ^( FUNC_CALL Identifier ( exprList )? )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:123:38: ^( FUNC_CALL Identifier ( exprList )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
						adaptor.addChild(root_1, stream_Identifier.nextNode());
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:123:61: ( exprList )?
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:124:6: Assert '(' expression ')'
					{
					Assert46=(Token)match(input,Assert,FOLLOW_Assert_in_functionCall536);  
					stream_Assert.add(Assert46);

					char_literal47=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall538);  
					stream_OParen.add(char_literal47);

					pushFollow(FOLLOW_expression_in_functionCall540);
					expression48=expression();
					state._fsp--;

					stream_expression.add(expression48.getTree());
					char_literal49=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall542);  
					stream_CParen.add(char_literal49);

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
					// 124:35: -> ^( FUNC_CALL Assert expression )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:124:38: ^( FUNC_CALL Assert expression )
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:125:6: Size '(' expression ')'
					{
					Size50=(Token)match(input,Size,FOLLOW_Size_in_functionCall562);  
					stream_Size.add(Size50);

					char_literal51=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall564);  
					stream_OParen.add(char_literal51);

					pushFollow(FOLLOW_expression_in_functionCall566);
					expression52=expression();
					state._fsp--;

					stream_expression.add(expression52.getTree());
					char_literal53=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall568);  
					stream_CParen.add(char_literal53);

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
					// 125:35: -> ^( FUNC_CALL Size expression )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:125:38: ^( FUNC_CALL Size expression )
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:128:1: println : Println ( expression -> ^( PRINTLN expression ) | functionCall -> ^( PRINTLN functionCall ) ) ;
	public final DataCentricDSLParser.println_return println() throws RecognitionException {
		DataCentricDSLParser.println_return retval = new DataCentricDSLParser.println_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Println54=null;
		ParserRuleReturnScope expression55 =null;
		ParserRuleReturnScope functionCall56 =null;

		Object Println54_tree=null;
		RewriteRuleTokenStream stream_Println=new RewriteRuleTokenStream(adaptor,"token Println");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_functionCall=new RewriteRuleSubtreeStream(adaptor,"rule functionCall");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:129:3: ( Println ( expression -> ^( PRINTLN expression ) | functionCall -> ^( PRINTLN functionCall ) ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:129:5: Println ( expression -> ^( PRINTLN expression ) | functionCall -> ^( PRINTLN functionCall ) )
			{
			Println54=(Token)match(input,Println,FOLLOW_Println_in_println596);  
			stream_Println.add(Println54);

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:129:13: ( expression -> ^( PRINTLN expression ) | functionCall -> ^( PRINTLN functionCall ) )
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:129:14: expression
					{
					pushFollow(FOLLOW_expression_in_println599);
					expression55=expression();
					state._fsp--;

					stream_expression.add(expression55.getTree());
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
					// 129:25: -> ^( PRINTLN expression )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:129:28: ^( PRINTLN expression )
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:130:5: functionCall
					{
					pushFollow(FOLLOW_functionCall_in_println613);
					functionCall56=functionCall();
					state._fsp--;

					stream_functionCall.add(functionCall56.getTree());
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
					// 130:18: -> ^( PRINTLN functionCall )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:130:21: ^( PRINTLN functionCall )
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:133:1: print : Print ( expression -> ^( PRINT expression ) | functionCall -> ^( PRINT functionCall ) ) ;
	public final DataCentricDSLParser.print_return print() throws RecognitionException {
		DataCentricDSLParser.print_return retval = new DataCentricDSLParser.print_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Print57=null;
		ParserRuleReturnScope expression58 =null;
		ParserRuleReturnScope functionCall59 =null;

		Object Print57_tree=null;
		RewriteRuleTokenStream stream_Print=new RewriteRuleTokenStream(adaptor,"token Print");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_functionCall=new RewriteRuleSubtreeStream(adaptor,"rule functionCall");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:134:3: ( Print ( expression -> ^( PRINT expression ) | functionCall -> ^( PRINT functionCall ) ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:134:5: Print ( expression -> ^( PRINT expression ) | functionCall -> ^( PRINT functionCall ) )
			{
			Print57=(Token)match(input,Print,FOLLOW_Print_in_print638);  
			stream_Print.add(Print57);

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:134:11: ( expression -> ^( PRINT expression ) | functionCall -> ^( PRINT functionCall ) )
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:134:12: expression
					{
					pushFollow(FOLLOW_expression_in_print641);
					expression58=expression();
					state._fsp--;

					stream_expression.add(expression58.getTree());
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
					// 134:23: -> ^( PRINT expression )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:134:26: ^( PRINT expression )
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:135:5: functionCall
					{
					pushFollow(FOLLOW_functionCall_in_print655);
					functionCall59=functionCall();
					state._fsp--;

					stream_functionCall.add(functionCall59.getTree());
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
					// 135:18: -> ^( PRINT functionCall )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:135:21: ^( PRINT functionCall )
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:138:1: ifStatement : ifStat ( elseIfStat )* ( elseStat )? -> ^( IF ifStat ( elseIfStat )* ( elseStat )? ) ;
	public final DataCentricDSLParser.ifStatement_return ifStatement() throws RecognitionException {
		DataCentricDSLParser.ifStatement_return retval = new DataCentricDSLParser.ifStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope ifStat60 =null;
		ParserRuleReturnScope elseIfStat61 =null;
		ParserRuleReturnScope elseStat62 =null;

		RewriteRuleSubtreeStream stream_elseIfStat=new RewriteRuleSubtreeStream(adaptor,"rule elseIfStat");
		RewriteRuleSubtreeStream stream_ifStat=new RewriteRuleSubtreeStream(adaptor,"rule ifStat");
		RewriteRuleSubtreeStream stream_elseStat=new RewriteRuleSubtreeStream(adaptor,"rule elseStat");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:139:3: ( ifStat ( elseIfStat )* ( elseStat )? -> ^( IF ifStat ( elseIfStat )* ( elseStat )? ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:139:6: ifStat ( elseIfStat )* ( elseStat )?
			{
			pushFollow(FOLLOW_ifStat_in_ifStatement679);
			ifStat60=ifStat();
			state._fsp--;

			stream_ifStat.add(ifStat60.getTree());
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:139:13: ( elseIfStat )*
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:139:13: elseIfStat
					{
					pushFollow(FOLLOW_elseIfStat_in_ifStatement681);
					elseIfStat61=elseIfStat();
					state._fsp--;

					stream_elseIfStat.add(elseIfStat61.getTree());
					}
					break;

				default :
					break loop15;
				}
			}

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:139:25: ( elseStat )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==Else) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:139:25: elseStat
					{
					pushFollow(FOLLOW_elseStat_in_ifStatement684);
					elseStat62=elseStat();
					state._fsp--;

					stream_elseStat.add(elseStat62.getTree());
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
			// 139:35: -> ^( IF ifStat ( elseIfStat )* ( elseStat )? )
			{
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:139:38: ^( IF ifStat ( elseIfStat )* ( elseStat )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);
				adaptor.addChild(root_1, stream_ifStat.nextTree());
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:139:50: ( elseIfStat )*
				while ( stream_elseIfStat.hasNext() ) {
					adaptor.addChild(root_1, stream_elseIfStat.nextTree());
				}
				stream_elseIfStat.reset();

				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:139:62: ( elseStat )?
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:142:1: ifStat : If '(' expression ')' '{' block '}' -> ^( EXP expression block ) ;
	public final DataCentricDSLParser.ifStat_return ifStat() throws RecognitionException {
		DataCentricDSLParser.ifStat_return retval = new DataCentricDSLParser.ifStat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token If63=null;
		Token char_literal64=null;
		Token char_literal66=null;
		Token char_literal67=null;
		Token char_literal69=null;
		ParserRuleReturnScope expression65 =null;
		ParserRuleReturnScope block68 =null;

		Object If63_tree=null;
		Object char_literal64_tree=null;
		Object char_literal66_tree=null;
		Object char_literal67_tree=null;
		Object char_literal69_tree=null;
		RewriteRuleTokenStream stream_OBrace=new RewriteRuleTokenStream(adaptor,"token OBrace");
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_If=new RewriteRuleTokenStream(adaptor,"token If");
		RewriteRuleTokenStream stream_CBrace=new RewriteRuleTokenStream(adaptor,"token CBrace");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:143:3: ( If '(' expression ')' '{' block '}' -> ^( EXP expression block ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:143:6: If '(' expression ')' '{' block '}'
			{
			If63=(Token)match(input,If,FOLLOW_If_in_ifStat713);  
			stream_If.add(If63);

			char_literal64=(Token)match(input,OParen,FOLLOW_OParen_in_ifStat715);  
			stream_OParen.add(char_literal64);

			pushFollow(FOLLOW_expression_in_ifStat717);
			expression65=expression();
			state._fsp--;

			stream_expression.add(expression65.getTree());
			char_literal66=(Token)match(input,CParen,FOLLOW_CParen_in_ifStat719);  
			stream_CParen.add(char_literal66);

			char_literal67=(Token)match(input,OBrace,FOLLOW_OBrace_in_ifStat721);  
			stream_OBrace.add(char_literal67);

			pushFollow(FOLLOW_block_in_ifStat723);
			block68=block();
			state._fsp--;

			stream_block.add(block68.getTree());
			char_literal69=(Token)match(input,CBrace,FOLLOW_CBrace_in_ifStat725);  
			stream_CBrace.add(char_literal69);

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
			// 143:42: -> ^( EXP expression block )
			{
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:143:45: ^( EXP expression block )
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:146:1: elseIfStat : Else If '(' expression ')' '{' block '}' -> ^( EXP expression block ) ;
	public final DataCentricDSLParser.elseIfStat_return elseIfStat() throws RecognitionException {
		DataCentricDSLParser.elseIfStat_return retval = new DataCentricDSLParser.elseIfStat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Else70=null;
		Token If71=null;
		Token char_literal72=null;
		Token char_literal74=null;
		Token char_literal75=null;
		Token char_literal77=null;
		ParserRuleReturnScope expression73 =null;
		ParserRuleReturnScope block76 =null;

		Object Else70_tree=null;
		Object If71_tree=null;
		Object char_literal72_tree=null;
		Object char_literal74_tree=null;
		Object char_literal75_tree=null;
		Object char_literal77_tree=null;
		RewriteRuleTokenStream stream_OBrace=new RewriteRuleTokenStream(adaptor,"token OBrace");
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_Else=new RewriteRuleTokenStream(adaptor,"token Else");
		RewriteRuleTokenStream stream_If=new RewriteRuleTokenStream(adaptor,"token If");
		RewriteRuleTokenStream stream_CBrace=new RewriteRuleTokenStream(adaptor,"token CBrace");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:147:3: ( Else If '(' expression ')' '{' block '}' -> ^( EXP expression block ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:147:6: Else If '(' expression ')' '{' block '}'
			{
			Else70=(Token)match(input,Else,FOLLOW_Else_in_elseIfStat749);  
			stream_Else.add(Else70);

			If71=(Token)match(input,If,FOLLOW_If_in_elseIfStat751);  
			stream_If.add(If71);

			char_literal72=(Token)match(input,OParen,FOLLOW_OParen_in_elseIfStat753);  
			stream_OParen.add(char_literal72);

			pushFollow(FOLLOW_expression_in_elseIfStat755);
			expression73=expression();
			state._fsp--;

			stream_expression.add(expression73.getTree());
			char_literal74=(Token)match(input,CParen,FOLLOW_CParen_in_elseIfStat757);  
			stream_CParen.add(char_literal74);

			char_literal75=(Token)match(input,OBrace,FOLLOW_OBrace_in_elseIfStat759);  
			stream_OBrace.add(char_literal75);

			pushFollow(FOLLOW_block_in_elseIfStat761);
			block76=block();
			state._fsp--;

			stream_block.add(block76.getTree());
			char_literal77=(Token)match(input,CBrace,FOLLOW_CBrace_in_elseIfStat763);  
			stream_CBrace.add(char_literal77);

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
			// 147:47: -> ^( EXP expression block )
			{
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:147:50: ^( EXP expression block )
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:150:1: elseStat : Else '{' block '}' -> ^( EXP block ) ;
	public final DataCentricDSLParser.elseStat_return elseStat() throws RecognitionException {
		DataCentricDSLParser.elseStat_return retval = new DataCentricDSLParser.elseStat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Else78=null;
		Token char_literal79=null;
		Token char_literal81=null;
		ParserRuleReturnScope block80 =null;

		Object Else78_tree=null;
		Object char_literal79_tree=null;
		Object char_literal81_tree=null;
		RewriteRuleTokenStream stream_OBrace=new RewriteRuleTokenStream(adaptor,"token OBrace");
		RewriteRuleTokenStream stream_Else=new RewriteRuleTokenStream(adaptor,"token Else");
		RewriteRuleTokenStream stream_CBrace=new RewriteRuleTokenStream(adaptor,"token CBrace");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:151:3: ( Else '{' block '}' -> ^( EXP block ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:151:6: Else '{' block '}'
			{
			Else78=(Token)match(input,Else,FOLLOW_Else_in_elseStat787);  
			stream_Else.add(Else78);

			char_literal79=(Token)match(input,OBrace,FOLLOW_OBrace_in_elseStat789);  
			stream_OBrace.add(char_literal79);

			pushFollow(FOLLOW_block_in_elseStat791);
			block80=block();
			state._fsp--;

			stream_block.add(block80.getTree());
			char_literal81=(Token)match(input,CBrace,FOLLOW_CBrace_in_elseStat793);  
			stream_CBrace.add(char_literal81);

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
			// 151:25: -> ^( EXP block )
			{
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:151:28: ^( EXP block )
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


	public static class functionDef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionDef"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:154:1: functionDef : 'func' Identifier '(' ( idList )? ')' '{' block '}' ;
	public final DataCentricDSLParser.functionDef_return functionDef() throws RecognitionException {
		DataCentricDSLParser.functionDef_return retval = new DataCentricDSLParser.functionDef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal82=null;
		Token Identifier83=null;
		Token char_literal84=null;
		Token char_literal86=null;
		Token char_literal87=null;
		Token char_literal89=null;
		ParserRuleReturnScope idList85 =null;
		ParserRuleReturnScope block88 =null;

		Object string_literal82_tree=null;
		Object Identifier83_tree=null;
		Object char_literal84_tree=null;
		Object char_literal86_tree=null;
		Object char_literal87_tree=null;
		Object char_literal89_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:155:3: ( 'func' Identifier '(' ( idList )? ')' '{' block '}' )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:155:6: 'func' Identifier '(' ( idList )? ')' '{' block '}'
			{
			root_0 = (Object)adaptor.nil();


			string_literal82=(Token)match(input,74,FOLLOW_74_in_functionDef815); 
			string_literal82_tree = (Object)adaptor.create(string_literal82);
			adaptor.addChild(root_0, string_literal82_tree);

			Identifier83=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionDef817); 
			Identifier83_tree = (Object)adaptor.create(Identifier83);
			adaptor.addChild(root_0, Identifier83_tree);

			char_literal84=(Token)match(input,OParen,FOLLOW_OParen_in_functionDef819); 
			char_literal84_tree = (Object)adaptor.create(char_literal84);
			adaptor.addChild(root_0, char_literal84_tree);

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:155:28: ( idList )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==Identifier) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:155:28: idList
					{
					pushFollow(FOLLOW_idList_in_functionDef821);
					idList85=idList();
					state._fsp--;

					adaptor.addChild(root_0, idList85.getTree());

					}
					break;

			}

			char_literal86=(Token)match(input,CParen,FOLLOW_CParen_in_functionDef824); 
			char_literal86_tree = (Object)adaptor.create(char_literal86);
			adaptor.addChild(root_0, char_literal86_tree);

			char_literal87=(Token)match(input,OBrace,FOLLOW_OBrace_in_functionDef826); 
			char_literal87_tree = (Object)adaptor.create(char_literal87);
			adaptor.addChild(root_0, char_literal87_tree);

			pushFollow(FOLLOW_block_in_functionDef828);
			block88=block();
			state._fsp--;

			adaptor.addChild(root_0, block88.getTree());

			char_literal89=(Token)match(input,CBrace,FOLLOW_CBrace_in_functionDef830); 
			char_literal89_tree = (Object)adaptor.create(char_literal89);
			adaptor.addChild(root_0, char_literal89_tree);

			defineFunction((Identifier83!=null?Identifier83.getText():null), (idList85!=null?((Object)idList85.getTree()):null), (block88!=null?((Object)block88.getTree()):null));
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
	// $ANTLR end "functionDef"


	public static class forStatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "forStatement"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:159:1: forStatement : ( For '(' assignment ';' expression ';' afterthought ')' '{' block '}' -> ^( For assignment expression afterthought block ) ) ;
	public final DataCentricDSLParser.forStatement_return forStatement() throws RecognitionException {
		DataCentricDSLParser.forStatement_return retval = new DataCentricDSLParser.forStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token For90=null;
		Token char_literal91=null;
		Token char_literal93=null;
		Token char_literal95=null;
		Token char_literal97=null;
		Token char_literal98=null;
		Token char_literal100=null;
		ParserRuleReturnScope assignment92 =null;
		ParserRuleReturnScope expression94 =null;
		ParserRuleReturnScope afterthought96 =null;
		ParserRuleReturnScope block99 =null;

		Object For90_tree=null;
		Object char_literal91_tree=null;
		Object char_literal93_tree=null;
		Object char_literal95_tree=null;
		Object char_literal97_tree=null;
		Object char_literal98_tree=null;
		Object char_literal100_tree=null;
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
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:160:3: ( ( For '(' assignment ';' expression ';' afterthought ')' '{' block '}' -> ^( For assignment expression afterthought block ) ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:160:6: ( For '(' assignment ';' expression ';' afterthought ')' '{' block '}' -> ^( For assignment expression afterthought block ) )
			{
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:160:6: ( For '(' assignment ';' expression ';' afterthought ')' '{' block '}' -> ^( For assignment expression afterthought block ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:160:7: For '(' assignment ';' expression ';' afterthought ')' '{' block '}'
			{
			For90=(Token)match(input,For,FOLLOW_For_in_forStatement850);  
			stream_For.add(For90);

			char_literal91=(Token)match(input,OParen,FOLLOW_OParen_in_forStatement852);  
			stream_OParen.add(char_literal91);

			pushFollow(FOLLOW_assignment_in_forStatement854);
			assignment92=assignment();
			state._fsp--;

			stream_assignment.add(assignment92.getTree());
			char_literal93=(Token)match(input,SColon,FOLLOW_SColon_in_forStatement856);  
			stream_SColon.add(char_literal93);

			pushFollow(FOLLOW_expression_in_forStatement858);
			expression94=expression();
			state._fsp--;

			stream_expression.add(expression94.getTree());
			char_literal95=(Token)match(input,SColon,FOLLOW_SColon_in_forStatement860);  
			stream_SColon.add(char_literal95);

			pushFollow(FOLLOW_afterthought_in_forStatement862);
			afterthought96=afterthought();
			state._fsp--;

			stream_afterthought.add(afterthought96.getTree());
			char_literal97=(Token)match(input,CParen,FOLLOW_CParen_in_forStatement864);  
			stream_CParen.add(char_literal97);

			char_literal98=(Token)match(input,OBrace,FOLLOW_OBrace_in_forStatement866);  
			stream_OBrace.add(char_literal98);

			pushFollow(FOLLOW_block_in_forStatement868);
			block99=block();
			state._fsp--;

			stream_block.add(block99.getTree());
			char_literal100=(Token)match(input,CBrace,FOLLOW_CBrace_in_forStatement870);  
			stream_CBrace.add(char_literal100);

			// AST REWRITE
			// elements: For, expression, assignment, block, afterthought
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
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:161:9: ^( For assignment expression afterthought block )
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:164:1: afterthought : ( ( Identifier '=' expression ) | incrementation );
	public final DataCentricDSLParser.afterthought_return afterthought() throws RecognitionException {
		DataCentricDSLParser.afterthought_return retval = new DataCentricDSLParser.afterthought_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier101=null;
		Token char_literal102=null;
		ParserRuleReturnScope expression103 =null;
		ParserRuleReturnScope incrementation104 =null;

		Object Identifier101_tree=null;
		Object char_literal102_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:164:13: ( ( Identifier '=' expression ) | incrementation )
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:165:3: ( Identifier '=' expression )
					{
					root_0 = (Object)adaptor.nil();


					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:165:3: ( Identifier '=' expression )
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:165:4: Identifier '=' expression
					{
					Identifier101=(Token)match(input,Identifier,FOLLOW_Identifier_in_afterthought902); 
					Identifier101_tree = (Object)adaptor.create(Identifier101);
					adaptor.addChild(root_0, Identifier101_tree);

					char_literal102=(Token)match(input,Assign,FOLLOW_Assign_in_afterthought904); 
					char_literal102_tree = (Object)adaptor.create(char_literal102);
					adaptor.addChild(root_0, char_literal102_tree);

					pushFollow(FOLLOW_expression_in_afterthought906);
					expression103=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression103.getTree());

					}

					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:165:33: incrementation
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_incrementation_in_afterthought911);
					incrementation104=incrementation();
					state._fsp--;

					adaptor.addChild(root_0, incrementation104.getTree());

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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:168:1: whileStatement : While '(' expression ')' '{' block '}' -> ^( While expression block ) ;
	public final DataCentricDSLParser.whileStatement_return whileStatement() throws RecognitionException {
		DataCentricDSLParser.whileStatement_return retval = new DataCentricDSLParser.whileStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token While105=null;
		Token char_literal106=null;
		Token char_literal108=null;
		Token char_literal109=null;
		Token char_literal111=null;
		ParserRuleReturnScope expression107 =null;
		ParserRuleReturnScope block110 =null;

		Object While105_tree=null;
		Object char_literal106_tree=null;
		Object char_literal108_tree=null;
		Object char_literal109_tree=null;
		Object char_literal111_tree=null;
		RewriteRuleTokenStream stream_OBrace=new RewriteRuleTokenStream(adaptor,"token OBrace");
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_While=new RewriteRuleTokenStream(adaptor,"token While");
		RewriteRuleTokenStream stream_CBrace=new RewriteRuleTokenStream(adaptor,"token CBrace");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:169:3: ( While '(' expression ')' '{' block '}' -> ^( While expression block ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:169:6: While '(' expression ')' '{' block '}'
			{
			While105=(Token)match(input,While,FOLLOW_While_in_whileStatement923);  
			stream_While.add(While105);

			char_literal106=(Token)match(input,OParen,FOLLOW_OParen_in_whileStatement925);  
			stream_OParen.add(char_literal106);

			pushFollow(FOLLOW_expression_in_whileStatement927);
			expression107=expression();
			state._fsp--;

			stream_expression.add(expression107.getTree());
			char_literal108=(Token)match(input,CParen,FOLLOW_CParen_in_whileStatement929);  
			stream_CParen.add(char_literal108);

			char_literal109=(Token)match(input,OBrace,FOLLOW_OBrace_in_whileStatement931);  
			stream_OBrace.add(char_literal109);

			pushFollow(FOLLOW_block_in_whileStatement933);
			block110=block();
			state._fsp--;

			stream_block.add(block110.getTree());
			char_literal111=(Token)match(input,CBrace,FOLLOW_CBrace_in_whileStatement935);  
			stream_CBrace.add(char_literal111);

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
			// 169:45: -> ^( While expression block )
			{
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:169:48: ^( While expression block )
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:172:1: idList : Identifier ( ',' Identifier )* -> ^( ID_LIST ( Identifier )+ ) ;
	public final DataCentricDSLParser.idList_return idList() throws RecognitionException {
		DataCentricDSLParser.idList_return retval = new DataCentricDSLParser.idList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier112=null;
		Token char_literal113=null;
		Token Identifier114=null;

		Object Identifier112_tree=null;
		Object char_literal113_tree=null;
		Object Identifier114_tree=null;
		RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:173:3: ( Identifier ( ',' Identifier )* -> ^( ID_LIST ( Identifier )+ ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:173:6: Identifier ( ',' Identifier )*
			{
			Identifier112=(Token)match(input,Identifier,FOLLOW_Identifier_in_idList959);  
			stream_Identifier.add(Identifier112);

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:173:17: ( ',' Identifier )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==Comma) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:173:18: ',' Identifier
					{
					char_literal113=(Token)match(input,Comma,FOLLOW_Comma_in_idList962);  
					stream_Comma.add(char_literal113);

					Identifier114=(Token)match(input,Identifier,FOLLOW_Identifier_in_idList964);  
					stream_Identifier.add(Identifier114);

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
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:173:38: ^( ID_LIST ( Identifier )+ )
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


	public static class incrementation_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "incrementation"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:176:1: incrementation : variableCall ( '++' | '--' ) ;
	public final DataCentricDSLParser.incrementation_return incrementation() throws RecognitionException {
		DataCentricDSLParser.incrementation_return retval = new DataCentricDSLParser.incrementation_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set116=null;
		ParserRuleReturnScope variableCall115 =null;

		Object set116_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:177:3: ( variableCall ( '++' | '--' ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:177:5: variableCall ( '++' | '--' )
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_variableCall_in_incrementation990);
			variableCall115=variableCall();
			state._fsp--;

			adaptor.addChild(root_0, variableCall115.getTree());

			set116=input.LT(1);
			if ( input.LA(1)==Increment||input.LA(1)==73 ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set116));
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


	public static class exprList_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprList"
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:180:1: exprList : expression ( ',' expression )* -> ^( EXP_LIST ( expression )+ ) ;
	public final DataCentricDSLParser.exprList_return exprList() throws RecognitionException {
		DataCentricDSLParser.exprList_return retval = new DataCentricDSLParser.exprList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal118=null;
		ParserRuleReturnScope expression117 =null;
		ParserRuleReturnScope expression119 =null;

		Object char_literal118_tree=null;
		RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:181:3: ( expression ( ',' expression )* -> ^( EXP_LIST ( expression )+ ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:181:6: expression ( ',' expression )*
			{
			pushFollow(FOLLOW_expression_in_exprList1008);
			expression117=expression();
			state._fsp--;

			stream_expression.add(expression117.getTree());
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:181:17: ( ',' expression )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==Comma) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:181:18: ',' expression
					{
					char_literal118=(Token)match(input,Comma,FOLLOW_Comma_in_exprList1011);  
					stream_Comma.add(char_literal118);

					pushFollow(FOLLOW_expression_in_exprList1013);
					expression119=expression();
					state._fsp--;

					stream_expression.add(expression119.getTree());
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
			// 181:35: -> ^( EXP_LIST ( expression )+ )
			{
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:181:38: ^( EXP_LIST ( expression )+ )
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:184:1: expression : ( condExpr | query );
	public final DataCentricDSLParser.expression_return expression() throws RecognitionException {
		DataCentricDSLParser.expression_return retval = new DataCentricDSLParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope condExpr120 =null;
		ParserRuleReturnScope query121 =null;


		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:185:3: ( condExpr | query )
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:185:6: condExpr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_condExpr_in_expression1038);
					condExpr120=condExpr();
					state._fsp--;

					adaptor.addChild(root_0, condExpr120.getTree());

					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:185:17: query
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_query_in_expression1042);
					query121=query();
					state._fsp--;

					adaptor.addChild(root_0, query121.getTree());

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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:188:1: condExpr : ( orExpr -> orExpr ) ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )? ;
	public final DataCentricDSLParser.condExpr_return condExpr() throws RecognitionException {
		DataCentricDSLParser.condExpr_return retval = new DataCentricDSLParser.condExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal123=null;
		Token char_literal124=null;
		Token In125=null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope orExpr122 =null;
		ParserRuleReturnScope expression126 =null;

		Object char_literal123_tree=null;
		Object char_literal124_tree=null;
		Object In125_tree=null;
		RewriteRuleTokenStream stream_In=new RewriteRuleTokenStream(adaptor,"token In");
		RewriteRuleTokenStream stream_Colon=new RewriteRuleTokenStream(adaptor,"token Colon");
		RewriteRuleTokenStream stream_QMark=new RewriteRuleTokenStream(adaptor,"token QMark");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_orExpr=new RewriteRuleSubtreeStream(adaptor,"rule orExpr");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:189:3: ( ( orExpr -> orExpr ) ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )? )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:189:6: ( orExpr -> orExpr ) ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )?
			{
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:189:6: ( orExpr -> orExpr )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:189:7: orExpr
			{
			pushFollow(FOLLOW_orExpr_in_condExpr1057);
			orExpr122=orExpr();
			state._fsp--;

			stream_orExpr.add(orExpr122.getTree());
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

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:190:6: ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )?
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:190:8: '?' a= expression ':' b= expression
					{
					char_literal123=(Token)match(input,QMark,FOLLOW_QMark_in_condExpr1072);  
					stream_QMark.add(char_literal123);

					pushFollow(FOLLOW_expression_in_condExpr1076);
					a=expression();
					state._fsp--;

					stream_expression.add(a.getTree());
					char_literal124=(Token)match(input,Colon,FOLLOW_Colon_in_condExpr1078);  
					stream_Colon.add(char_literal124);

					pushFollow(FOLLOW_expression_in_condExpr1082);
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
					// 190:42: -> ^( TERNARY orExpr $a $b)
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:190:45: ^( TERNARY orExpr $a $b)
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:191:8: In expression
					{
					In125=(Token)match(input,In,FOLLOW_In_in_condExpr1105);  
					stream_In.add(In125);

					pushFollow(FOLLOW_expression_in_condExpr1107);
					expression126=expression();
					state._fsp--;

					stream_expression.add(expression126.getTree());
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
					// 191:42: -> ^( In orExpr expression )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:191:45: ^( In orExpr expression )
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:195:1: orExpr : andExpr ( '||' ^ andExpr )* ;
	public final DataCentricDSLParser.orExpr_return orExpr() throws RecognitionException {
		DataCentricDSLParser.orExpr_return retval = new DataCentricDSLParser.orExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal128=null;
		ParserRuleReturnScope andExpr127 =null;
		ParserRuleReturnScope andExpr129 =null;

		Object string_literal128_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:196:3: ( andExpr ( '||' ^ andExpr )* )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:196:6: andExpr ( '||' ^ andExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_andExpr_in_orExpr1159);
			andExpr127=andExpr();
			state._fsp--;

			adaptor.addChild(root_0, andExpr127.getTree());

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:196:14: ( '||' ^ andExpr )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==Or) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:196:15: '||' ^ andExpr
					{
					string_literal128=(Token)match(input,Or,FOLLOW_Or_in_orExpr1162); 
					string_literal128_tree = (Object)adaptor.create(string_literal128);
					root_0 = (Object)adaptor.becomeRoot(string_literal128_tree, root_0);

					pushFollow(FOLLOW_andExpr_in_orExpr1165);
					andExpr129=andExpr();
					state._fsp--;

					adaptor.addChild(root_0, andExpr129.getTree());

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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:199:1: andExpr : equExpr ( '&&' ^ equExpr )* ;
	public final DataCentricDSLParser.andExpr_return andExpr() throws RecognitionException {
		DataCentricDSLParser.andExpr_return retval = new DataCentricDSLParser.andExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal131=null;
		ParserRuleReturnScope equExpr130 =null;
		ParserRuleReturnScope equExpr132 =null;

		Object string_literal131_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:200:3: ( equExpr ( '&&' ^ equExpr )* )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:200:6: equExpr ( '&&' ^ equExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_equExpr_in_andExpr1181);
			equExpr130=equExpr();
			state._fsp--;

			adaptor.addChild(root_0, equExpr130.getTree());

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:200:14: ( '&&' ^ equExpr )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==And) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:200:15: '&&' ^ equExpr
					{
					string_literal131=(Token)match(input,And,FOLLOW_And_in_andExpr1184); 
					string_literal131_tree = (Object)adaptor.create(string_literal131);
					root_0 = (Object)adaptor.becomeRoot(string_literal131_tree, root_0);

					pushFollow(FOLLOW_equExpr_in_andExpr1187);
					equExpr132=equExpr();
					state._fsp--;

					adaptor.addChild(root_0, equExpr132.getTree());

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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:203:1: equExpr : relExpr ( ( '==' | '!=' ) ^ relExpr )* ;
	public final DataCentricDSLParser.equExpr_return equExpr() throws RecognitionException {
		DataCentricDSLParser.equExpr_return retval = new DataCentricDSLParser.equExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set134=null;
		ParserRuleReturnScope relExpr133 =null;
		ParserRuleReturnScope relExpr135 =null;

		Object set134_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:204:3: ( relExpr ( ( '==' | '!=' ) ^ relExpr )* )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:204:6: relExpr ( ( '==' | '!=' ) ^ relExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_relExpr_in_equExpr1203);
			relExpr133=relExpr();
			state._fsp--;

			adaptor.addChild(root_0, relExpr133.getTree());

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:204:14: ( ( '==' | '!=' ) ^ relExpr )*
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==Equals||LA25_0==NEquals) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:204:15: ( '==' | '!=' ) ^ relExpr
					{
					set134=input.LT(1);
					set134=input.LT(1);
					if ( input.LA(1)==Equals||input.LA(1)==NEquals ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set134), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_relExpr_in_equExpr1215);
					relExpr135=relExpr();
					state._fsp--;

					adaptor.addChild(root_0, relExpr135.getTree());

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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:207:1: relExpr : addExpr ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )* ;
	public final DataCentricDSLParser.relExpr_return relExpr() throws RecognitionException {
		DataCentricDSLParser.relExpr_return retval = new DataCentricDSLParser.relExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set137=null;
		ParserRuleReturnScope addExpr136 =null;
		ParserRuleReturnScope addExpr138 =null;

		Object set137_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:208:3: ( addExpr ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )* )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:208:6: addExpr ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_addExpr_in_relExpr1231);
			addExpr136=addExpr();
			state._fsp--;

			adaptor.addChild(root_0, addExpr136.getTree());

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:208:14: ( ( '>=' | '<=' | '>' | '<' ) ^ addExpr )*
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( ((LA26_0 >= GT && LA26_0 <= GTEquals)||(LA26_0 >= LT && LA26_0 <= LTEquals)) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:208:15: ( '>=' | '<=' | '>' | '<' ) ^ addExpr
					{
					set137=input.LT(1);
					set137=input.LT(1);
					if ( (input.LA(1) >= GT && input.LA(1) <= GTEquals)||(input.LA(1) >= LT && input.LA(1) <= LTEquals) ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set137), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_addExpr_in_relExpr1251);
					addExpr138=addExpr();
					state._fsp--;

					adaptor.addChild(root_0, addExpr138.getTree());

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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:211:1: addExpr : mulExpr ( ( '+' | '-' ) ^ mulExpr )* ;
	public final DataCentricDSLParser.addExpr_return addExpr() throws RecognitionException {
		DataCentricDSLParser.addExpr_return retval = new DataCentricDSLParser.addExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set140=null;
		ParserRuleReturnScope mulExpr139 =null;
		ParserRuleReturnScope mulExpr141 =null;

		Object set140_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:212:3: ( mulExpr ( ( '+' | '-' ) ^ mulExpr )* )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:212:6: mulExpr ( ( '+' | '-' ) ^ mulExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_mulExpr_in_addExpr1267);
			mulExpr139=mulExpr();
			state._fsp--;

			adaptor.addChild(root_0, mulExpr139.getTree());

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:212:14: ( ( '+' | '-' ) ^ mulExpr )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==Add||LA27_0==Subtract) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:212:15: ( '+' | '-' ) ^ mulExpr
					{
					set140=input.LT(1);
					set140=input.LT(1);
					if ( input.LA(1)==Add||input.LA(1)==Subtract ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set140), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_mulExpr_in_addExpr1279);
					mulExpr141=mulExpr();
					state._fsp--;

					adaptor.addChild(root_0, mulExpr141.getTree());

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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:215:1: mulExpr : powExpr ( ( '*' | '/' | '%' ) ^ powExpr )* ;
	public final DataCentricDSLParser.mulExpr_return mulExpr() throws RecognitionException {
		DataCentricDSLParser.mulExpr_return retval = new DataCentricDSLParser.mulExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set143=null;
		ParserRuleReturnScope powExpr142 =null;
		ParserRuleReturnScope powExpr144 =null;

		Object set143_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:216:3: ( powExpr ( ( '*' | '/' | '%' ) ^ powExpr )* )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:216:6: powExpr ( ( '*' | '/' | '%' ) ^ powExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_powExpr_in_mulExpr1295);
			powExpr142=powExpr();
			state._fsp--;

			adaptor.addChild(root_0, powExpr142.getTree());

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:216:14: ( ( '*' | '/' | '%' ) ^ powExpr )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==Divide||(LA28_0 >= Modulus && LA28_0 <= Multiply)) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:216:15: ( '*' | '/' | '%' ) ^ powExpr
					{
					set143=input.LT(1);
					set143=input.LT(1);
					if ( input.LA(1)==Divide||(input.LA(1) >= Modulus && input.LA(1) <= Multiply) ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set143), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_powExpr_in_mulExpr1311);
					powExpr144=powExpr();
					state._fsp--;

					adaptor.addChild(root_0, powExpr144.getTree());

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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:219:1: powExpr : unaryExpr ( '^' ^ unaryExpr )* ;
	public final DataCentricDSLParser.powExpr_return powExpr() throws RecognitionException {
		DataCentricDSLParser.powExpr_return retval = new DataCentricDSLParser.powExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal146=null;
		ParserRuleReturnScope unaryExpr145 =null;
		ParserRuleReturnScope unaryExpr147 =null;

		Object char_literal146_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:220:3: ( unaryExpr ( '^' ^ unaryExpr )* )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:220:6: unaryExpr ( '^' ^ unaryExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_unaryExpr_in_powExpr1327);
			unaryExpr145=unaryExpr();
			state._fsp--;

			adaptor.addChild(root_0, unaryExpr145.getTree());

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:220:16: ( '^' ^ unaryExpr )*
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==Pow) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:220:17: '^' ^ unaryExpr
					{
					char_literal146=(Token)match(input,Pow,FOLLOW_Pow_in_powExpr1330); 
					char_literal146_tree = (Object)adaptor.create(char_literal146);
					root_0 = (Object)adaptor.becomeRoot(char_literal146_tree, root_0);

					pushFollow(FOLLOW_unaryExpr_in_powExpr1333);
					unaryExpr147=unaryExpr();
					state._fsp--;

					adaptor.addChild(root_0, unaryExpr147.getTree());

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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:223:1: unaryExpr : ( '-' atom -> ^( UNARY_MIN atom ) | '!' atom -> ^( NEGATE atom ) | atom );
	public final DataCentricDSLParser.unaryExpr_return unaryExpr() throws RecognitionException {
		DataCentricDSLParser.unaryExpr_return retval = new DataCentricDSLParser.unaryExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal148=null;
		Token char_literal150=null;
		ParserRuleReturnScope atom149 =null;
		ParserRuleReturnScope atom151 =null;
		ParserRuleReturnScope atom152 =null;

		Object char_literal148_tree=null;
		Object char_literal150_tree=null;
		RewriteRuleTokenStream stream_Excl=new RewriteRuleTokenStream(adaptor,"token Excl");
		RewriteRuleTokenStream stream_Subtract=new RewriteRuleTokenStream(adaptor,"token Subtract");
		RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:224:3: ( '-' atom -> ^( UNARY_MIN atom ) | '!' atom -> ^( NEGATE atom ) | atom )
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:224:6: '-' atom
					{
					char_literal148=(Token)match(input,Subtract,FOLLOW_Subtract_in_unaryExpr1351);  
					stream_Subtract.add(char_literal148);

					pushFollow(FOLLOW_atom_in_unaryExpr1353);
					atom149=atom();
					state._fsp--;

					stream_atom.add(atom149.getTree());
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
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:224:18: ^( UNARY_MIN atom )
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:225:6: '!' atom
					{
					char_literal150=(Token)match(input,Excl,FOLLOW_Excl_in_unaryExpr1368);  
					stream_Excl.add(char_literal150);

					pushFollow(FOLLOW_atom_in_unaryExpr1370);
					atom151=atom();
					state._fsp--;

					stream_atom.add(atom151.getTree());
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
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:225:18: ^( NEGATE atom )
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:226:6: atom
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_atom_in_unaryExpr1385);
					atom152=atom();
					state._fsp--;

					adaptor.addChild(root_0, atom152.getTree());

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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:229:1: atom : ( Number | Bool | Null | lookup );
	public final DataCentricDSLParser.atom_return atom() throws RecognitionException {
		DataCentricDSLParser.atom_return retval = new DataCentricDSLParser.atom_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Number153=null;
		Token Bool154=null;
		Token Null155=null;
		ParserRuleReturnScope lookup156 =null;

		Object Number153_tree=null;
		Object Bool154_tree=null;
		Object Null155_tree=null;

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:230:3: ( Number | Bool | Null | lookup )
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:230:6: Number
					{
					root_0 = (Object)adaptor.nil();


					Number153=(Token)match(input,Number,FOLLOW_Number_in_atom1399); 
					Number153_tree = (Object)adaptor.create(Number153);
					adaptor.addChild(root_0, Number153_tree);

					}
					break;
				case 2 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:231:6: Bool
					{
					root_0 = (Object)adaptor.nil();


					Bool154=(Token)match(input,Bool,FOLLOW_Bool_in_atom1406); 
					Bool154_tree = (Object)adaptor.create(Bool154);
					adaptor.addChild(root_0, Bool154_tree);

					}
					break;
				case 3 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:232:6: Null
					{
					root_0 = (Object)adaptor.nil();


					Null155=(Token)match(input,Null,FOLLOW_Null_in_atom1413); 
					Null155_tree = (Object)adaptor.create(Null155);
					adaptor.addChild(root_0, Null155_tree);

					}
					break;
				case 4 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:233:6: lookup
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_lookup_in_atom1420);
					lookup156=lookup();
					state._fsp--;

					adaptor.addChild(root_0, lookup156.getTree());

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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:236:1: list : '[' ( exprList )? ']' -> ^( LIST ( exprList )? ) ;
	public final DataCentricDSLParser.list_return list() throws RecognitionException {
		DataCentricDSLParser.list_return retval = new DataCentricDSLParser.list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal157=null;
		Token char_literal159=null;
		ParserRuleReturnScope exprList158 =null;

		Object char_literal157_tree=null;
		Object char_literal159_tree=null;
		RewriteRuleTokenStream stream_CBracket=new RewriteRuleTokenStream(adaptor,"token CBracket");
		RewriteRuleTokenStream stream_OBracket=new RewriteRuleTokenStream(adaptor,"token OBracket");
		RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:237:3: ( '[' ( exprList )? ']' -> ^( LIST ( exprList )? ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:237:6: '[' ( exprList )? ']'
			{
			char_literal157=(Token)match(input,OBracket,FOLLOW_OBracket_in_list1434);  
			stream_OBracket.add(char_literal157);

			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:237:10: ( exprList )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==Bool||LA32_0==Excl||LA32_0==Identifier||(LA32_0 >= Null && LA32_0 <= Number)||(LA32_0 >= OBracket && LA32_0 <= OParen)||(LA32_0 >= String && LA32_0 <= Subtract)||LA32_0==76) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:237:10: exprList
					{
					pushFollow(FOLLOW_exprList_in_list1436);
					exprList158=exprList();
					state._fsp--;

					stream_exprList.add(exprList158.getTree());
					}
					break;

			}

			char_literal159=(Token)match(input,CBracket,FOLLOW_CBracket_in_list1439);  
			stream_CBracket.add(char_literal159);

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
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:237:27: ^( LIST ( exprList )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:237:34: ( exprList )?
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:240:1: lookup : ( list ( indexes )? -> ^( LOOKUP list ( indexes )? ) | Identifier ( indexes )? -> ^( LOOKUP Identifier ( indexes )? ) | String ( indexes )? -> ^( LOOKUP String ( indexes )? ) | '(' expression ')' ( indexes )? -> ^( LOOKUP expression ( indexes )? ) );
	public final DataCentricDSLParser.lookup_return lookup() throws RecognitionException {
		DataCentricDSLParser.lookup_return retval = new DataCentricDSLParser.lookup_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier162=null;
		Token String164=null;
		Token char_literal166=null;
		Token char_literal168=null;
		ParserRuleReturnScope list160 =null;
		ParserRuleReturnScope indexes161 =null;
		ParserRuleReturnScope indexes163 =null;
		ParserRuleReturnScope indexes165 =null;
		ParserRuleReturnScope expression167 =null;
		ParserRuleReturnScope indexes169 =null;

		Object Identifier162_tree=null;
		Object String164_tree=null;
		Object char_literal166_tree=null;
		Object char_literal168_tree=null;
		RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
		RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
		RewriteRuleTokenStream stream_String=new RewriteRuleTokenStream(adaptor,"token String");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_indexes=new RewriteRuleSubtreeStream(adaptor,"rule indexes");
		RewriteRuleSubtreeStream stream_list=new RewriteRuleSubtreeStream(adaptor,"rule list");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:241:3: ( list ( indexes )? -> ^( LOOKUP list ( indexes )? ) | Identifier ( indexes )? -> ^( LOOKUP Identifier ( indexes )? ) | String ( indexes )? -> ^( LOOKUP String ( indexes )? ) | '(' expression ')' ( indexes )? -> ^( LOOKUP expression ( indexes )? ) )
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:241:6: list ( indexes )?
					{
					pushFollow(FOLLOW_list_in_lookup1462);
					list160=list();
					state._fsp--;

					stream_list.add(list160.getTree());
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:241:11: ( indexes )?
					int alt33=2;
					int LA33_0 = input.LA(1);
					if ( (LA33_0==OBracket) ) {
						alt33=1;
					}
					switch (alt33) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:241:11: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1464);
							indexes161=indexes();
							state._fsp--;

							stream_indexes.add(indexes161.getTree());
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
					// 241:34: -> ^( LOOKUP list ( indexes )? )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:241:37: ^( LOOKUP list ( indexes )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
						adaptor.addChild(root_1, stream_list.nextTree());
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:241:51: ( indexes )?
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:242:6: Identifier ( indexes )?
					{
					Identifier162=(Token)match(input,Identifier,FOLLOW_Identifier_in_lookup1497);  
					stream_Identifier.add(Identifier162);

					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:242:17: ( indexes )?
					int alt34=2;
					int LA34_0 = input.LA(1);
					if ( (LA34_0==OBracket) ) {
						alt34=1;
					}
					switch (alt34) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:242:17: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1499);
							indexes163=indexes();
							state._fsp--;

							stream_indexes.add(indexes163.getTree());
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
					// 242:34: -> ^( LOOKUP Identifier ( indexes )? )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:242:37: ^( LOOKUP Identifier ( indexes )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
						adaptor.addChild(root_1, stream_Identifier.nextNode());
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:242:57: ( indexes )?
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:243:6: String ( indexes )?
					{
					String164=(Token)match(input,String,FOLLOW_String_in_lookup1526);  
					stream_String.add(String164);

					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:243:13: ( indexes )?
					int alt35=2;
					int LA35_0 = input.LA(1);
					if ( (LA35_0==OBracket) ) {
						alt35=1;
					}
					switch (alt35) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:243:13: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1528);
							indexes165=indexes();
							state._fsp--;

							stream_indexes.add(indexes165.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: indexes, String
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 243:34: -> ^( LOOKUP String ( indexes )? )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:243:37: ^( LOOKUP String ( indexes )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
						adaptor.addChild(root_1, stream_String.nextNode());
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:243:53: ( indexes )?
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:244:6: '(' expression ')' ( indexes )?
					{
					char_literal166=(Token)match(input,OParen,FOLLOW_OParen_in_lookup1559);  
					stream_OParen.add(char_literal166);

					pushFollow(FOLLOW_expression_in_lookup1561);
					expression167=expression();
					state._fsp--;

					stream_expression.add(expression167.getTree());
					char_literal168=(Token)match(input,CParen,FOLLOW_CParen_in_lookup1563);  
					stream_CParen.add(char_literal168);

					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:244:25: ( indexes )?
					int alt36=2;
					int LA36_0 = input.LA(1);
					if ( (LA36_0==OBracket) ) {
						alt36=1;
					}
					switch (alt36) {
						case 1 :
							// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:244:25: indexes
							{
							pushFollow(FOLLOW_indexes_in_lookup1565);
							indexes169=indexes();
							state._fsp--;

							stream_indexes.add(indexes169.getTree());
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
					// 244:34: -> ^( LOOKUP expression ( indexes )? )
					{
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:244:37: ^( LOOKUP expression ( indexes )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);
						adaptor.addChild(root_1, stream_expression.nextTree());
						// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:244:57: ( indexes )?
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
	// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:247:1: indexes : ( '[' expression ']' )+ -> ^( INDEXES ( expression )+ ) ;
	public final DataCentricDSLParser.indexes_return indexes() throws RecognitionException {
		DataCentricDSLParser.indexes_return retval = new DataCentricDSLParser.indexes_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal170=null;
		Token char_literal172=null;
		ParserRuleReturnScope expression171 =null;

		Object char_literal170_tree=null;
		Object char_literal172_tree=null;
		RewriteRuleTokenStream stream_CBracket=new RewriteRuleTokenStream(adaptor,"token CBracket");
		RewriteRuleTokenStream stream_OBracket=new RewriteRuleTokenStream(adaptor,"token OBracket");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:248:3: ( ( '[' expression ']' )+ -> ^( INDEXES ( expression )+ ) )
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:248:6: ( '[' expression ']' )+
			{
			// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:248:6: ( '[' expression ']' )+
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
					// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:248:7: '[' expression ']'
					{
					char_literal170=(Token)match(input,OBracket,FOLLOW_OBracket_in_indexes1592);  
					stream_OBracket.add(char_literal170);

					pushFollow(FOLLOW_expression_in_indexes1594);
					expression171=expression();
					state._fsp--;

					stream_expression.add(expression171.getTree());
					char_literal172=(Token)match(input,CBracket,FOLLOW_CBracket_in_indexes1596);  
					stream_CBracket.add(char_literal172);

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
			// 248:28: -> ^( INDEXES ( expression )+ )
			{
				// D:\\Documents\\Programing\\GitHub\\Data-Centric-DSL-TUES-Project\\Antlr\\DataCentricDSLInterpreter\\src\\bg\\tues\\didi\\DataCentricDSL.g:248:31: ^( INDEXES ( expression )+ )
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



	public static final BitSet FOLLOW_functionDef_in_program160 = new BitSet(new long[]{0x4C00003040000080L,0x0000000000003D02L});
	public static final BitSet FOLLOW_block_in_program164 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_block184 = new BitSet(new long[]{0x4C00003040000082L,0x0000000000003902L});
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
	public static final BitSet FOLLOW_update_in_statement309 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_SColon_in_statement311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_println_in_statement322 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_SColon_in_statement324 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_in_statement335 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_SColon_in_statement337 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_76_in_query354 = new BitSet(new long[]{0x0036001008000480L,0x000000000000101AL});
	public static final BitSet FOLLOW_expression_in_query358 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_query362 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_update373 = new BitSet(new long[]{0x0036001008000400L,0x0000000000001018L});
	public static final BitSet FOLLOW_expression_in_update377 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_variableCall388 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_assignment400 = new BitSet(new long[]{0x0010000000000100L});
	public static final BitSet FOLLOW_indexes_in_assignment402 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Assign_in_assignment405 = new BitSet(new long[]{0x0036001008000480L,0x000000000000101AL});
	public static final BitSet FOLLOW_expression_in_assignment408 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_assignment428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_75_in_assignment449 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_Identifier_in_assignment451 = new BitSet(new long[]{0x0010000000000100L});
	public static final BitSet FOLLOW_indexes_in_assignment453 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Assign_in_assignment456 = new BitSet(new long[]{0x0036001008000480L,0x000000000000101AL});
	public static final BitSet FOLLOW_expression_in_assignment459 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_assignment481 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_functionCall511 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall513 = new BitSet(new long[]{0x0036001008002400L,0x0000000000001018L});
	public static final BitSet FOLLOW_exprList_in_functionCall515 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CParen_in_functionCall518 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Assert_in_functionCall536 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall538 = new BitSet(new long[]{0x0036001008000400L,0x0000000000001018L});
	public static final BitSet FOLLOW_expression_in_functionCall540 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CParen_in_functionCall542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Size_in_functionCall562 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_OParen_in_functionCall564 = new BitSet(new long[]{0x0036001008000400L,0x0000000000001018L});
	public static final BitSet FOLLOW_expression_in_functionCall566 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CParen_in_functionCall568 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Println_in_println596 = new BitSet(new long[]{0x0036001008000480L,0x000000000000101AL});
	public static final BitSet FOLLOW_expression_in_println599 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_println613 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Print_in_print638 = new BitSet(new long[]{0x0036001008000480L,0x000000000000101AL});
	public static final BitSet FOLLOW_expression_in_print641 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_print655 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStat_in_ifStatement679 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_elseIfStat_in_ifStatement681 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_elseStat_in_ifStatement684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_If_in_ifStat713 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_OParen_in_ifStat715 = new BitSet(new long[]{0x0036001008000400L,0x0000000000001018L});
	public static final BitSet FOLLOW_expression_in_ifStat717 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CParen_in_ifStat719 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_OBrace_in_ifStat721 = new BitSet(new long[]{0x4C00003040000880L,0x0000000000003902L});
	public static final BitSet FOLLOW_block_in_ifStat723 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CBrace_in_ifStat725 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Else_in_elseIfStat749 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_If_in_elseIfStat751 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_OParen_in_elseIfStat753 = new BitSet(new long[]{0x0036001008000400L,0x0000000000001018L});
	public static final BitSet FOLLOW_expression_in_elseIfStat755 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CParen_in_elseIfStat757 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_OBrace_in_elseIfStat759 = new BitSet(new long[]{0x4C00003040000880L,0x0000000000003902L});
	public static final BitSet FOLLOW_block_in_elseIfStat761 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CBrace_in_elseIfStat763 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Else_in_elseStat787 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_OBrace_in_elseStat789 = new BitSet(new long[]{0x4C00003040000880L,0x0000000000003902L});
	public static final BitSet FOLLOW_block_in_elseStat791 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CBrace_in_elseStat793 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_74_in_functionDef815 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_Identifier_in_functionDef817 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_OParen_in_functionDef819 = new BitSet(new long[]{0x0000001000002000L});
	public static final BitSet FOLLOW_idList_in_functionDef821 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CParen_in_functionDef824 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_OBrace_in_functionDef826 = new BitSet(new long[]{0x4C00003040000880L,0x0000000000003902L});
	public static final BitSet FOLLOW_block_in_functionDef828 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CBrace_in_functionDef830 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_For_in_forStatement850 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_OParen_in_forStatement852 = new BitSet(new long[]{0x0000001000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_assignment_in_forStatement854 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_SColon_in_forStatement856 = new BitSet(new long[]{0x0036001008000400L,0x0000000000001018L});
	public static final BitSet FOLLOW_expression_in_forStatement858 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_SColon_in_forStatement860 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_afterthought_in_forStatement862 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CParen_in_forStatement864 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_OBrace_in_forStatement866 = new BitSet(new long[]{0x4C00003040000880L,0x0000000000003902L});
	public static final BitSet FOLLOW_block_in_forStatement868 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CBrace_in_forStatement870 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_afterthought902 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Assign_in_afterthought904 = new BitSet(new long[]{0x0036001008000400L,0x0000000000001018L});
	public static final BitSet FOLLOW_expression_in_afterthought906 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incrementation_in_afterthought911 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_While_in_whileStatement923 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_OParen_in_whileStatement925 = new BitSet(new long[]{0x0036001008000400L,0x0000000000001018L});
	public static final BitSet FOLLOW_expression_in_whileStatement927 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CParen_in_whileStatement929 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_OBrace_in_whileStatement931 = new BitSet(new long[]{0x4C00003040000880L,0x0000000000003902L});
	public static final BitSet FOLLOW_block_in_whileStatement933 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CBrace_in_whileStatement935 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_idList959 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_Comma_in_idList962 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_Identifier_in_idList964 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_variableCall_in_incrementation990 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_set_in_incrementation992 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_exprList1008 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_Comma_in_exprList1011 = new BitSet(new long[]{0x0036001008000400L,0x0000000000001018L});
	public static final BitSet FOLLOW_expression_in_exprList1013 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_condExpr_in_expression1038 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_query_in_expression1042 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_orExpr_in_condExpr1057 = new BitSet(new long[]{0x1000004000000002L});
	public static final BitSet FOLLOW_QMark_in_condExpr1072 = new BitSet(new long[]{0x0036001008000400L,0x0000000000001018L});
	public static final BitSet FOLLOW_expression_in_condExpr1076 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_Colon_in_condExpr1078 = new BitSet(new long[]{0x0036001008000400L,0x0000000000001018L});
	public static final BitSet FOLLOW_expression_in_condExpr1082 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_In_in_condExpr1105 = new BitSet(new long[]{0x0036001008000400L,0x0000000000001018L});
	public static final BitSet FOLLOW_expression_in_condExpr1107 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_andExpr_in_orExpr1159 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_Or_in_orExpr1162 = new BitSet(new long[]{0x0036001008000400L,0x0000000000000018L});
	public static final BitSet FOLLOW_andExpr_in_orExpr1165 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_equExpr_in_andExpr1181 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_And_in_andExpr1184 = new BitSet(new long[]{0x0036001008000400L,0x0000000000000018L});
	public static final BitSet FOLLOW_equExpr_in_andExpr1187 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_relExpr_in_equExpr1203 = new BitSet(new long[]{0x0001000002000002L});
	public static final BitSet FOLLOW_set_in_equExpr1206 = new BitSet(new long[]{0x0036001008000400L,0x0000000000000018L});
	public static final BitSet FOLLOW_relExpr_in_equExpr1215 = new BitSet(new long[]{0x0001000002000002L});
	public static final BitSet FOLLOW_addExpr_in_relExpr1231 = new BitSet(new long[]{0x0000180180000002L});
	public static final BitSet FOLLOW_set_in_relExpr1234 = new BitSet(new long[]{0x0036001008000400L,0x0000000000000018L});
	public static final BitSet FOLLOW_addExpr_in_relExpr1251 = new BitSet(new long[]{0x0000180180000002L});
	public static final BitSet FOLLOW_mulExpr_in_addExpr1267 = new BitSet(new long[]{0x0000000000000022L,0x0000000000000010L});
	public static final BitSet FOLLOW_set_in_addExpr1270 = new BitSet(new long[]{0x0036001008000400L,0x0000000000000018L});
	public static final BitSet FOLLOW_mulExpr_in_addExpr1279 = new BitSet(new long[]{0x0000000000000022L,0x0000000000000010L});
	public static final BitSet FOLLOW_powExpr_in_mulExpr1295 = new BitSet(new long[]{0x0000600000080002L});
	public static final BitSet FOLLOW_set_in_mulExpr1298 = new BitSet(new long[]{0x0036001008000400L,0x0000000000000018L});
	public static final BitSet FOLLOW_powExpr_in_mulExpr1311 = new BitSet(new long[]{0x0000600000080002L});
	public static final BitSet FOLLOW_unaryExpr_in_powExpr1327 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_Pow_in_powExpr1330 = new BitSet(new long[]{0x0036001008000400L,0x0000000000000018L});
	public static final BitSet FOLLOW_unaryExpr_in_powExpr1333 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_Subtract_in_unaryExpr1351 = new BitSet(new long[]{0x0036001000000400L,0x0000000000000008L});
	public static final BitSet FOLLOW_atom_in_unaryExpr1353 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Excl_in_unaryExpr1368 = new BitSet(new long[]{0x0036001000000400L,0x0000000000000008L});
	public static final BitSet FOLLOW_atom_in_unaryExpr1370 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_unaryExpr1385 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Number_in_atom1399 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Bool_in_atom1406 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Null_in_atom1413 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lookup_in_atom1420 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OBracket_in_list1434 = new BitSet(new long[]{0x0036001008001400L,0x0000000000001018L});
	public static final BitSet FOLLOW_exprList_in_list1436 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CBracket_in_list1439 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_list_in_lookup1462 = new BitSet(new long[]{0x0010000000000002L});
	public static final BitSet FOLLOW_indexes_in_lookup1464 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_lookup1497 = new BitSet(new long[]{0x0010000000000002L});
	public static final BitSet FOLLOW_indexes_in_lookup1499 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_String_in_lookup1526 = new BitSet(new long[]{0x0010000000000002L});
	public static final BitSet FOLLOW_indexes_in_lookup1528 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OParen_in_lookup1559 = new BitSet(new long[]{0x0036001008000400L,0x0000000000001018L});
	public static final BitSet FOLLOW_expression_in_lookup1561 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CParen_in_lookup1563 = new BitSet(new long[]{0x0010000000000002L});
	public static final BitSet FOLLOW_indexes_in_lookup1565 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OBracket_in_indexes1592 = new BitSet(new long[]{0x0036001008000400L,0x0000000000001018L});
	public static final BitSet FOLLOW_expression_in_indexes1594 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CBracket_in_indexes1596 = new BitSet(new long[]{0x0010000000000002L});
}
