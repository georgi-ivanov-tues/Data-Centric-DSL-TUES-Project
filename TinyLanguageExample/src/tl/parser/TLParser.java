// $ANTLR 3.2 Sep 23, 2009 12:02:23 src/grammar/TL.g 2011-03-16 22:40:30

  package tl.parser;
  import tl.*; 
  import java.util.Map;
  import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class TLParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BLOCK", "RETURN", "STATEMENTS", "ASSIGNMENT", "FUNC_CALL", "EXP", "EXP_LIST", "ID_LIST", "IF", "TERNARY", "UNARY_MIN", "NEGATE", "FUNCTION", "INDEXES", "LIST", "LOOKUP", "Return", "Identifier", "Println", "Print", "Assert", "Size", "End", "If", "Do", "Else", "Def", "For", "To", "While", "In", "Number", "Bool", "Null", "String", "Or", "And", "Equals", "NEquals", "GTEquals", "LTEquals", "Pow", "Excl", "GT", "LT", "Add", "Subtract", "Multiply", "Divide", "Modulus", "OBrace", "CBrace", "OBracket", "CBracket", "OParen", "CParen", "SColon", "Assign", "Comma", "QMark", "Colon", "Int", "Digit", "Comment", "Space"
    };
    public static final int FUNCTION=16;
    public static final int End=26;
    public static final int OParen=58;
    public static final int LT=48;
    public static final int Assert=24;
    public static final int TERNARY=13;
    public static final int EXP_LIST=10;
    public static final int While=33;
    public static final int ID_LIST=11;
    public static final int QMark=63;
    public static final int Add=49;
    public static final int EOF=-1;
    public static final int Int=65;
    public static final int Identifier=21;
    public static final int IF=12;
    public static final int FUNC_CALL=8;
    public static final int Space=68;
    public static final int Size=25;
    public static final int Assign=61;
    public static final int CParen=59;
    public static final int Number=35;
    public static final int To=32;
    public static final int Comment=67;
    public static final int EXP=9;
    public static final int Print=23;
    public static final int GTEquals=43;
    public static final int CBrace=55;
    public static final int RETURN=5;
    public static final int Do=28;
    public static final int String=38;
    public static final int Or=39;
    public static final int Return=20;
    public static final int If=27;
    public static final int Null=37;
    public static final int And=40;
    public static final int CBracket=57;
    public static final int Println=22;
    public static final int In=34;
    public static final int Bool=36;
    public static final int NEquals=42;
    public static final int Subtract=50;
    public static final int Modulus=53;
    public static final int Multiply=51;
    public static final int OBrace=54;
    public static final int INDEXES=17;
    public static final int NEGATE=15;
    public static final int Colon=64;
    public static final int Excl=46;
    public static final int Digit=66;
    public static final int LIST=18;
    public static final int For=31;
    public static final int Divide=52;
    public static final int Def=30;
    public static final int SColon=60;
    public static final int LOOKUP=19;
    public static final int OBracket=56;
    public static final int BLOCK=4;
    public static final int GT=47;
    public static final int STATEMENTS=6;
    public static final int UNARY_MIN=14;
    public static final int ASSIGNMENT=7;
    public static final int Else=29;
    public static final int Comma=62;
    public static final int Equals=41;
    public static final int Pow=45;
    public static final int LTEquals=44;

    // delegates
    // delegators


        public TLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public TLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return TLParser.tokenNames; }
    public String getGrammarFileName() { return "src/grammar/TL.g"; }


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


    public static class parse_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parse"
    // src/grammar/TL.g:55:1: parse : block EOF -> block ;
    public final TLParser.parse_return parse() throws RecognitionException {
        TLParser.parse_return retval = new TLParser.parse_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EOF2=null;
        TLParser.block_return block1 = null;


        Object EOF2_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // src/grammar/TL.g:56:3: ( block EOF -> block )
            // src/grammar/TL.g:56:6: block EOF
            {
            pushFollow(FOLLOW_block_in_parse138);
            block1=block();

            state._fsp--;

            stream_block.add(block1.getTree());
            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_parse140);  
            stream_EOF.add(EOF2);



            // AST REWRITE
            // elements: block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 56:16: -> block
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
        }
        return retval;
    }
    // $ANTLR end "parse"

    public static class block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "block"
    // src/grammar/TL.g:59:1: block : ( statement | functionDecl )* ( Return expression ';' )? -> ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) ;
    public final TLParser.block_return block() throws RecognitionException {
        TLParser.block_return retval = new TLParser.block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Return5=null;
        Token char_literal7=null;
        TLParser.statement_return statement3 = null;

        TLParser.functionDecl_return functionDecl4 = null;

        TLParser.expression_return expression6 = null;


        Object Return5_tree=null;
        Object char_literal7_tree=null;
        RewriteRuleTokenStream stream_Return=new RewriteRuleTokenStream(adaptor,"token Return");
        RewriteRuleTokenStream stream_SColon=new RewriteRuleTokenStream(adaptor,"token SColon");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_functionDecl=new RewriteRuleSubtreeStream(adaptor,"rule functionDecl");
        try {
            // src/grammar/TL.g:60:3: ( ( statement | functionDecl )* ( Return expression ';' )? -> ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) )
            // src/grammar/TL.g:60:6: ( statement | functionDecl )* ( Return expression ';' )?
            {
            // src/grammar/TL.g:60:6: ( statement | functionDecl )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=Identifier && LA1_0<=Size)||LA1_0==If||LA1_0==For||LA1_0==While) ) {
                    alt1=1;
                }
                else if ( (LA1_0==Def) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // src/grammar/TL.g:60:7: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block159);
            	    statement3=statement();

            	    state._fsp--;

            	    stream_statement.add(statement3.getTree());

            	    }
            	    break;
            	case 2 :
            	    // src/grammar/TL.g:60:19: functionDecl
            	    {
            	    pushFollow(FOLLOW_functionDecl_in_block163);
            	    functionDecl4=functionDecl();

            	    state._fsp--;

            	    stream_functionDecl.add(functionDecl4.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // src/grammar/TL.g:60:34: ( Return expression ';' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==Return) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // src/grammar/TL.g:60:35: Return expression ';'
                    {
                    Return5=(Token)match(input,Return,FOLLOW_Return_in_block168);  
                    stream_Return.add(Return5);

                    pushFollow(FOLLOW_expression_in_block170);
                    expression6=expression();

                    state._fsp--;

                    stream_expression.add(expression6.getTree());
                    char_literal7=(Token)match(input,SColon,FOLLOW_SColon_in_block172);  
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
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 61:6: -> ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) )
            {
                // src/grammar/TL.g:61:9: ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);

                // src/grammar/TL.g:61:17: ^( STATEMENTS ( statement )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(STATEMENTS, "STATEMENTS"), root_2);

                // src/grammar/TL.g:61:30: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_2, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_1, root_2);
                }
                // src/grammar/TL.g:61:42: ^( RETURN ( expression )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(RETURN, "RETURN"), root_2);

                // src/grammar/TL.g:61:51: ( expression )?
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
        }
        return retval;
    }
    // $ANTLR end "block"

    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // src/grammar/TL.g:64:1: statement : ( assignment ';' -> assignment | functionCall ';' -> functionCall | ifStatement | forStatement | whileStatement );
    public final TLParser.statement_return statement() throws RecognitionException {
        TLParser.statement_return retval = new TLParser.statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal9=null;
        Token char_literal11=null;
        TLParser.assignment_return assignment8 = null;

        TLParser.functionCall_return functionCall10 = null;

        TLParser.ifStatement_return ifStatement12 = null;

        TLParser.forStatement_return forStatement13 = null;

        TLParser.whileStatement_return whileStatement14 = null;


        Object char_literal9_tree=null;
        Object char_literal11_tree=null;
        RewriteRuleTokenStream stream_SColon=new RewriteRuleTokenStream(adaptor,"token SColon");
        RewriteRuleSubtreeStream stream_functionCall=new RewriteRuleSubtreeStream(adaptor,"rule functionCall");
        RewriteRuleSubtreeStream stream_assignment=new RewriteRuleSubtreeStream(adaptor,"rule assignment");
        try {
            // src/grammar/TL.g:65:3: ( assignment ';' -> assignment | functionCall ';' -> functionCall | ifStatement | forStatement | whileStatement )
            int alt3=5;
            switch ( input.LA(1) ) {
            case Identifier:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==OParen) ) {
                    alt3=2;
                }
                else if ( (LA3_1==OBracket||LA3_1==Assign) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case Println:
            case Print:
            case Assert:
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // src/grammar/TL.g:65:6: assignment ';'
                    {
                    pushFollow(FOLLOW_assignment_in_statement214);
                    assignment8=assignment();

                    state._fsp--;

                    stream_assignment.add(assignment8.getTree());
                    char_literal9=(Token)match(input,SColon,FOLLOW_SColon_in_statement216);  
                    stream_SColon.add(char_literal9);



                    // AST REWRITE
                    // elements: assignment
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 65:23: -> assignment
                    {
                        adaptor.addChild(root_0, stream_assignment.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // src/grammar/TL.g:66:6: functionCall ';'
                    {
                    pushFollow(FOLLOW_functionCall_in_statement229);
                    functionCall10=functionCall();

                    state._fsp--;

                    stream_functionCall.add(functionCall10.getTree());
                    char_literal11=(Token)match(input,SColon,FOLLOW_SColon_in_statement231);  
                    stream_SColon.add(char_literal11);



                    // AST REWRITE
                    // elements: functionCall
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 66:23: -> functionCall
                    {
                        adaptor.addChild(root_0, stream_functionCall.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // src/grammar/TL.g:67:6: ifStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ifStatement_in_statement242);
                    ifStatement12=ifStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, ifStatement12.getTree());

                    }
                    break;
                case 4 :
                    // src/grammar/TL.g:68:6: forStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forStatement_in_statement249);
                    forStatement13=forStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, forStatement13.getTree());

                    }
                    break;
                case 5 :
                    // src/grammar/TL.g:69:6: whileStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_whileStatement_in_statement256);
                    whileStatement14=whileStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, whileStatement14.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class assignment_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignment"
    // src/grammar/TL.g:72:1: assignment : Identifier ( indexes )? '=' expression -> ^( ASSIGNMENT Identifier ( indexes )? expression ) ;
    public final TLParser.assignment_return assignment() throws RecognitionException {
        TLParser.assignment_return retval = new TLParser.assignment_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Identifier15=null;
        Token char_literal17=null;
        TLParser.indexes_return indexes16 = null;

        TLParser.expression_return expression18 = null;


        Object Identifier15_tree=null;
        Object char_literal17_tree=null;
        RewriteRuleTokenStream stream_Assign=new RewriteRuleTokenStream(adaptor,"token Assign");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_indexes=new RewriteRuleSubtreeStream(adaptor,"rule indexes");
        try {
            // src/grammar/TL.g:73:3: ( Identifier ( indexes )? '=' expression -> ^( ASSIGNMENT Identifier ( indexes )? expression ) )
            // src/grammar/TL.g:73:6: Identifier ( indexes )? '=' expression
            {
            Identifier15=(Token)match(input,Identifier,FOLLOW_Identifier_in_assignment270);  
            stream_Identifier.add(Identifier15);

            // src/grammar/TL.g:73:17: ( indexes )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==OBracket) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // src/grammar/TL.g:73:17: indexes
                    {
                    pushFollow(FOLLOW_indexes_in_assignment272);
                    indexes16=indexes();

                    state._fsp--;

                    stream_indexes.add(indexes16.getTree());

                    }
                    break;

            }

            char_literal17=(Token)match(input,Assign,FOLLOW_Assign_in_assignment275);  
            stream_Assign.add(char_literal17);

            pushFollow(FOLLOW_expression_in_assignment277);
            expression18=expression();

            state._fsp--;

            stream_expression.add(expression18.getTree());


            // AST REWRITE
            // elements: expression, Identifier, indexes
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 74:6: -> ^( ASSIGNMENT Identifier ( indexes )? expression )
            {
                // src/grammar/TL.g:74:9: ^( ASSIGNMENT Identifier ( indexes )? expression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ASSIGNMENT, "ASSIGNMENT"), root_1);

                adaptor.addChild(root_1, stream_Identifier.nextNode());
                // src/grammar/TL.g:74:33: ( indexes )?
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
        }
        return retval;
    }
    // $ANTLR end "assignment"

    public static class functionCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionCall"
    // src/grammar/TL.g:77:1: functionCall : ( Identifier '(' ( exprList )? ')' -> ^( FUNC_CALL Identifier ( exprList )? ) | Println '(' ( expression )? ')' -> ^( FUNC_CALL Println ( expression )? ) | Print '(' expression ')' -> ^( FUNC_CALL Print expression ) | Assert '(' expression ')' -> ^( FUNC_CALL Assert expression ) | Size '(' expression ')' -> ^( FUNC_CALL Size expression ) );
    public final TLParser.functionCall_return functionCall() throws RecognitionException {
        TLParser.functionCall_return retval = new TLParser.functionCall_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Identifier19=null;
        Token char_literal20=null;
        Token char_literal22=null;
        Token Println23=null;
        Token char_literal24=null;
        Token char_literal26=null;
        Token Print27=null;
        Token char_literal28=null;
        Token char_literal30=null;
        Token Assert31=null;
        Token char_literal32=null;
        Token char_literal34=null;
        Token Size35=null;
        Token char_literal36=null;
        Token char_literal38=null;
        TLParser.exprList_return exprList21 = null;

        TLParser.expression_return expression25 = null;

        TLParser.expression_return expression29 = null;

        TLParser.expression_return expression33 = null;

        TLParser.expression_return expression37 = null;


        Object Identifier19_tree=null;
        Object char_literal20_tree=null;
        Object char_literal22_tree=null;
        Object Println23_tree=null;
        Object char_literal24_tree=null;
        Object char_literal26_tree=null;
        Object Print27_tree=null;
        Object char_literal28_tree=null;
        Object char_literal30_tree=null;
        Object Assert31_tree=null;
        Object char_literal32_tree=null;
        Object char_literal34_tree=null;
        Object Size35_tree=null;
        Object char_literal36_tree=null;
        Object char_literal38_tree=null;
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
            // src/grammar/TL.g:78:3: ( Identifier '(' ( exprList )? ')' -> ^( FUNC_CALL Identifier ( exprList )? ) | Println '(' ( expression )? ')' -> ^( FUNC_CALL Println ( expression )? ) | Print '(' expression ')' -> ^( FUNC_CALL Print expression ) | Assert '(' expression ')' -> ^( FUNC_CALL Assert expression ) | Size '(' expression ')' -> ^( FUNC_CALL Size expression ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case Identifier:
                {
                alt7=1;
                }
                break;
            case Println:
                {
                alt7=2;
                }
                break;
            case Print:
                {
                alt7=3;
                }
                break;
            case Assert:
                {
                alt7=4;
                }
                break;
            case Size:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // src/grammar/TL.g:78:6: Identifier '(' ( exprList )? ')'
                    {
                    Identifier19=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionCall310);  
                    stream_Identifier.add(Identifier19);

                    char_literal20=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall312);  
                    stream_OParen.add(char_literal20);

                    // src/grammar/TL.g:78:21: ( exprList )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( ((LA5_0>=Identifier && LA5_0<=Size)||(LA5_0>=Number && LA5_0<=String)||LA5_0==Excl||LA5_0==Subtract||LA5_0==OBracket||LA5_0==OParen) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // src/grammar/TL.g:78:21: exprList
                            {
                            pushFollow(FOLLOW_exprList_in_functionCall314);
                            exprList21=exprList();

                            state._fsp--;

                            stream_exprList.add(exprList21.getTree());

                            }
                            break;

                    }

                    char_literal22=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall317);  
                    stream_CParen.add(char_literal22);



                    // AST REWRITE
                    // elements: Identifier, exprList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 78:35: -> ^( FUNC_CALL Identifier ( exprList )? )
                    {
                        // src/grammar/TL.g:78:38: ^( FUNC_CALL Identifier ( exprList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);

                        adaptor.addChild(root_1, stream_Identifier.nextNode());
                        // src/grammar/TL.g:78:61: ( exprList )?
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
                    // src/grammar/TL.g:79:6: Println '(' ( expression )? ')'
                    {
                    Println23=(Token)match(input,Println,FOLLOW_Println_in_functionCall335);  
                    stream_Println.add(Println23);

                    char_literal24=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall337);  
                    stream_OParen.add(char_literal24);

                    // src/grammar/TL.g:79:18: ( expression )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( ((LA6_0>=Identifier && LA6_0<=Size)||(LA6_0>=Number && LA6_0<=String)||LA6_0==Excl||LA6_0==Subtract||LA6_0==OBracket||LA6_0==OParen) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // src/grammar/TL.g:79:18: expression
                            {
                            pushFollow(FOLLOW_expression_in_functionCall339);
                            expression25=expression();

                            state._fsp--;

                            stream_expression.add(expression25.getTree());

                            }
                            break;

                    }

                    char_literal26=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall342);  
                    stream_CParen.add(char_literal26);



                    // AST REWRITE
                    // elements: expression, Println
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 79:35: -> ^( FUNC_CALL Println ( expression )? )
                    {
                        // src/grammar/TL.g:79:38: ^( FUNC_CALL Println ( expression )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);

                        adaptor.addChild(root_1, stream_Println.nextNode());
                        // src/grammar/TL.g:79:58: ( expression )?
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
                    // src/grammar/TL.g:80:6: Print '(' expression ')'
                    {
                    Print27=(Token)match(input,Print,FOLLOW_Print_in_functionCall361);  
                    stream_Print.add(Print27);

                    char_literal28=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall363);  
                    stream_OParen.add(char_literal28);

                    pushFollow(FOLLOW_expression_in_functionCall365);
                    expression29=expression();

                    state._fsp--;

                    stream_expression.add(expression29.getTree());
                    char_literal30=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall367);  
                    stream_CParen.add(char_literal30);



                    // AST REWRITE
                    // elements: Print, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 80:35: -> ^( FUNC_CALL Print expression )
                    {
                        // src/grammar/TL.g:80:38: ^( FUNC_CALL Print expression )
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
                    // src/grammar/TL.g:81:6: Assert '(' expression ')'
                    {
                    Assert31=(Token)match(input,Assert,FOLLOW_Assert_in_functionCall388);  
                    stream_Assert.add(Assert31);

                    char_literal32=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall390);  
                    stream_OParen.add(char_literal32);

                    pushFollow(FOLLOW_expression_in_functionCall392);
                    expression33=expression();

                    state._fsp--;

                    stream_expression.add(expression33.getTree());
                    char_literal34=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall394);  
                    stream_CParen.add(char_literal34);



                    // AST REWRITE
                    // elements: expression, Assert
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 81:35: -> ^( FUNC_CALL Assert expression )
                    {
                        // src/grammar/TL.g:81:38: ^( FUNC_CALL Assert expression )
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
                    // src/grammar/TL.g:82:6: Size '(' expression ')'
                    {
                    Size35=(Token)match(input,Size,FOLLOW_Size_in_functionCall414);  
                    stream_Size.add(Size35);

                    char_literal36=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall416);  
                    stream_OParen.add(char_literal36);

                    pushFollow(FOLLOW_expression_in_functionCall418);
                    expression37=expression();

                    state._fsp--;

                    stream_expression.add(expression37.getTree());
                    char_literal38=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall420);  
                    stream_CParen.add(char_literal38);



                    // AST REWRITE
                    // elements: expression, Size
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 82:35: -> ^( FUNC_CALL Size expression )
                    {
                        // src/grammar/TL.g:82:38: ^( FUNC_CALL Size expression )
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
        }
        return retval;
    }
    // $ANTLR end "functionCall"

    public static class ifStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifStatement"
    // src/grammar/TL.g:85:1: ifStatement : ifStat ( elseIfStat )* ( elseStat )? End -> ^( IF ifStat ( elseIfStat )* ( elseStat )? ) ;
    public final TLParser.ifStatement_return ifStatement() throws RecognitionException {
        TLParser.ifStatement_return retval = new TLParser.ifStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token End42=null;
        TLParser.ifStat_return ifStat39 = null;

        TLParser.elseIfStat_return elseIfStat40 = null;

        TLParser.elseStat_return elseStat41 = null;


        Object End42_tree=null;
        RewriteRuleTokenStream stream_End=new RewriteRuleTokenStream(adaptor,"token End");
        RewriteRuleSubtreeStream stream_elseIfStat=new RewriteRuleSubtreeStream(adaptor,"rule elseIfStat");
        RewriteRuleSubtreeStream stream_ifStat=new RewriteRuleSubtreeStream(adaptor,"rule ifStat");
        RewriteRuleSubtreeStream stream_elseStat=new RewriteRuleSubtreeStream(adaptor,"rule elseStat");
        try {
            // src/grammar/TL.g:86:3: ( ifStat ( elseIfStat )* ( elseStat )? End -> ^( IF ifStat ( elseIfStat )* ( elseStat )? ) )
            // src/grammar/TL.g:86:6: ifStat ( elseIfStat )* ( elseStat )? End
            {
            pushFollow(FOLLOW_ifStat_in_ifStatement449);
            ifStat39=ifStat();

            state._fsp--;

            stream_ifStat.add(ifStat39.getTree());
            // src/grammar/TL.g:86:13: ( elseIfStat )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==Else) ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1==If) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // src/grammar/TL.g:86:13: elseIfStat
            	    {
            	    pushFollow(FOLLOW_elseIfStat_in_ifStatement451);
            	    elseIfStat40=elseIfStat();

            	    state._fsp--;

            	    stream_elseIfStat.add(elseIfStat40.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // src/grammar/TL.g:86:25: ( elseStat )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==Else) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // src/grammar/TL.g:86:25: elseStat
                    {
                    pushFollow(FOLLOW_elseStat_in_ifStatement454);
                    elseStat41=elseStat();

                    state._fsp--;

                    stream_elseStat.add(elseStat41.getTree());

                    }
                    break;

            }

            End42=(Token)match(input,End,FOLLOW_End_in_ifStatement457);  
            stream_End.add(End42);



            // AST REWRITE
            // elements: ifStat, elseIfStat, elseStat
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 86:39: -> ^( IF ifStat ( elseIfStat )* ( elseStat )? )
            {
                // src/grammar/TL.g:86:42: ^( IF ifStat ( elseIfStat )* ( elseStat )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);

                adaptor.addChild(root_1, stream_ifStat.nextTree());
                // src/grammar/TL.g:86:54: ( elseIfStat )*
                while ( stream_elseIfStat.hasNext() ) {
                    adaptor.addChild(root_1, stream_elseIfStat.nextTree());

                }
                stream_elseIfStat.reset();
                // src/grammar/TL.g:86:66: ( elseStat )?
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
        }
        return retval;
    }
    // $ANTLR end "ifStatement"

    public static class ifStat_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifStat"
    // src/grammar/TL.g:89:1: ifStat : If expression Do block -> ^( EXP expression block ) ;
    public final TLParser.ifStat_return ifStat() throws RecognitionException {
        TLParser.ifStat_return retval = new TLParser.ifStat_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token If43=null;
        Token Do45=null;
        TLParser.expression_return expression44 = null;

        TLParser.block_return block46 = null;


        Object If43_tree=null;
        Object Do45_tree=null;
        RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
        RewriteRuleTokenStream stream_If=new RewriteRuleTokenStream(adaptor,"token If");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // src/grammar/TL.g:90:3: ( If expression Do block -> ^( EXP expression block ) )
            // src/grammar/TL.g:90:6: If expression Do block
            {
            If43=(Token)match(input,If,FOLLOW_If_in_ifStat485);  
            stream_If.add(If43);

            pushFollow(FOLLOW_expression_in_ifStat487);
            expression44=expression();

            state._fsp--;

            stream_expression.add(expression44.getTree());
            Do45=(Token)match(input,Do,FOLLOW_Do_in_ifStat489);  
            stream_Do.add(Do45);

            pushFollow(FOLLOW_block_in_ifStat491);
            block46=block();

            state._fsp--;

            stream_block.add(block46.getTree());


            // AST REWRITE
            // elements: block, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 90:29: -> ^( EXP expression block )
            {
                // src/grammar/TL.g:90:32: ^( EXP expression block )
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
        }
        return retval;
    }
    // $ANTLR end "ifStat"

    public static class elseIfStat_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elseIfStat"
    // src/grammar/TL.g:93:1: elseIfStat : Else If expression Do block -> ^( EXP expression block ) ;
    public final TLParser.elseIfStat_return elseIfStat() throws RecognitionException {
        TLParser.elseIfStat_return retval = new TLParser.elseIfStat_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Else47=null;
        Token If48=null;
        Token Do50=null;
        TLParser.expression_return expression49 = null;

        TLParser.block_return block51 = null;


        Object Else47_tree=null;
        Object If48_tree=null;
        Object Do50_tree=null;
        RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
        RewriteRuleTokenStream stream_Else=new RewriteRuleTokenStream(adaptor,"token Else");
        RewriteRuleTokenStream stream_If=new RewriteRuleTokenStream(adaptor,"token If");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // src/grammar/TL.g:94:3: ( Else If expression Do block -> ^( EXP expression block ) )
            // src/grammar/TL.g:94:6: Else If expression Do block
            {
            Else47=(Token)match(input,Else,FOLLOW_Else_in_elseIfStat515);  
            stream_Else.add(Else47);

            If48=(Token)match(input,If,FOLLOW_If_in_elseIfStat517);  
            stream_If.add(If48);

            pushFollow(FOLLOW_expression_in_elseIfStat519);
            expression49=expression();

            state._fsp--;

            stream_expression.add(expression49.getTree());
            Do50=(Token)match(input,Do,FOLLOW_Do_in_elseIfStat521);  
            stream_Do.add(Do50);

            pushFollow(FOLLOW_block_in_elseIfStat523);
            block51=block();

            state._fsp--;

            stream_block.add(block51.getTree());


            // AST REWRITE
            // elements: block, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 94:34: -> ^( EXP expression block )
            {
                // src/grammar/TL.g:94:37: ^( EXP expression block )
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
        }
        return retval;
    }
    // $ANTLR end "elseIfStat"

    public static class elseStat_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elseStat"
    // src/grammar/TL.g:97:1: elseStat : Else Do block -> ^( EXP block ) ;
    public final TLParser.elseStat_return elseStat() throws RecognitionException {
        TLParser.elseStat_return retval = new TLParser.elseStat_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Else52=null;
        Token Do53=null;
        TLParser.block_return block54 = null;


        Object Else52_tree=null;
        Object Do53_tree=null;
        RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
        RewriteRuleTokenStream stream_Else=new RewriteRuleTokenStream(adaptor,"token Else");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // src/grammar/TL.g:98:3: ( Else Do block -> ^( EXP block ) )
            // src/grammar/TL.g:98:6: Else Do block
            {
            Else52=(Token)match(input,Else,FOLLOW_Else_in_elseStat547);  
            stream_Else.add(Else52);

            Do53=(Token)match(input,Do,FOLLOW_Do_in_elseStat549);  
            stream_Do.add(Do53);

            pushFollow(FOLLOW_block_in_elseStat551);
            block54=block();

            state._fsp--;

            stream_block.add(block54.getTree());


            // AST REWRITE
            // elements: block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 98:20: -> ^( EXP block )
            {
                // src/grammar/TL.g:98:23: ^( EXP block )
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
        }
        return retval;
    }
    // $ANTLR end "elseStat"

    public static class functionDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionDecl"
    // src/grammar/TL.g:101:1: functionDecl : Def Identifier '(' ( idList )? ')' block End ;
    public final TLParser.functionDecl_return functionDecl() throws RecognitionException {
        TLParser.functionDecl_return retval = new TLParser.functionDecl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Def55=null;
        Token Identifier56=null;
        Token char_literal57=null;
        Token char_literal59=null;
        Token End61=null;
        TLParser.idList_return idList58 = null;

        TLParser.block_return block60 = null;


        Object Def55_tree=null;
        Object Identifier56_tree=null;
        Object char_literal57_tree=null;
        Object char_literal59_tree=null;
        Object End61_tree=null;

        try {
            // src/grammar/TL.g:102:3: ( Def Identifier '(' ( idList )? ')' block End )
            // src/grammar/TL.g:102:6: Def Identifier '(' ( idList )? ')' block End
            {
            root_0 = (Object)adaptor.nil();

            Def55=(Token)match(input,Def,FOLLOW_Def_in_functionDecl573); 
            Def55_tree = (Object)adaptor.create(Def55);
            adaptor.addChild(root_0, Def55_tree);

            Identifier56=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionDecl575); 
            Identifier56_tree = (Object)adaptor.create(Identifier56);
            adaptor.addChild(root_0, Identifier56_tree);

            char_literal57=(Token)match(input,OParen,FOLLOW_OParen_in_functionDecl577); 
            char_literal57_tree = (Object)adaptor.create(char_literal57);
            adaptor.addChild(root_0, char_literal57_tree);

            // src/grammar/TL.g:102:25: ( idList )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==Identifier) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // src/grammar/TL.g:102:25: idList
                    {
                    pushFollow(FOLLOW_idList_in_functionDecl579);
                    idList58=idList();

                    state._fsp--;

                    adaptor.addChild(root_0, idList58.getTree());

                    }
                    break;

            }

            char_literal59=(Token)match(input,CParen,FOLLOW_CParen_in_functionDecl582); 
            char_literal59_tree = (Object)adaptor.create(char_literal59);
            adaptor.addChild(root_0, char_literal59_tree);

            pushFollow(FOLLOW_block_in_functionDecl584);
            block60=block();

            state._fsp--;

            adaptor.addChild(root_0, block60.getTree());
            End61=(Token)match(input,End,FOLLOW_End_in_functionDecl586); 
            End61_tree = (Object)adaptor.create(End61);
            adaptor.addChild(root_0, End61_tree);

            defineFunction((Identifier56!=null?Identifier56.getText():null), (idList58!=null?((Object)idList58.tree):null), (block60!=null?((Object)block60.tree):null));

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
        }
        return retval;
    }
    // $ANTLR end "functionDecl"

    public static class forStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forStatement"
    // src/grammar/TL.g:106:1: forStatement : For Identifier '=' expression To expression Do block End -> ^( For Identifier expression expression block ) ;
    public final TLParser.forStatement_return forStatement() throws RecognitionException {
        TLParser.forStatement_return retval = new TLParser.forStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token For62=null;
        Token Identifier63=null;
        Token char_literal64=null;
        Token To66=null;
        Token Do68=null;
        Token End70=null;
        TLParser.expression_return expression65 = null;

        TLParser.expression_return expression67 = null;

        TLParser.block_return block69 = null;


        Object For62_tree=null;
        Object Identifier63_tree=null;
        Object char_literal64_tree=null;
        Object To66_tree=null;
        Object Do68_tree=null;
        Object End70_tree=null;
        RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
        RewriteRuleTokenStream stream_End=new RewriteRuleTokenStream(adaptor,"token End");
        RewriteRuleTokenStream stream_Assign=new RewriteRuleTokenStream(adaptor,"token Assign");
        RewriteRuleTokenStream stream_To=new RewriteRuleTokenStream(adaptor,"token To");
        RewriteRuleTokenStream stream_For=new RewriteRuleTokenStream(adaptor,"token For");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // src/grammar/TL.g:107:3: ( For Identifier '=' expression To expression Do block End -> ^( For Identifier expression expression block ) )
            // src/grammar/TL.g:107:6: For Identifier '=' expression To expression Do block End
            {
            For62=(Token)match(input,For,FOLLOW_For_in_forStatement608);  
            stream_For.add(For62);

            Identifier63=(Token)match(input,Identifier,FOLLOW_Identifier_in_forStatement610);  
            stream_Identifier.add(Identifier63);

            char_literal64=(Token)match(input,Assign,FOLLOW_Assign_in_forStatement612);  
            stream_Assign.add(char_literal64);

            pushFollow(FOLLOW_expression_in_forStatement614);
            expression65=expression();

            state._fsp--;

            stream_expression.add(expression65.getTree());
            To66=(Token)match(input,To,FOLLOW_To_in_forStatement616);  
            stream_To.add(To66);

            pushFollow(FOLLOW_expression_in_forStatement618);
            expression67=expression();

            state._fsp--;

            stream_expression.add(expression67.getTree());
            Do68=(Token)match(input,Do,FOLLOW_Do_in_forStatement620);  
            stream_Do.add(Do68);

            pushFollow(FOLLOW_block_in_forStatement622);
            block69=block();

            state._fsp--;

            stream_block.add(block69.getTree());
            End70=(Token)match(input,End,FOLLOW_End_in_forStatement624);  
            stream_End.add(End70);



            // AST REWRITE
            // elements: expression, For, expression, block, Identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 108:6: -> ^( For Identifier expression expression block )
            {
                // src/grammar/TL.g:108:9: ^( For Identifier expression expression block )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_For.nextNode(), root_1);

                adaptor.addChild(root_1, stream_Identifier.nextNode());
                adaptor.addChild(root_1, stream_expression.nextTree());
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
        }
        return retval;
    }
    // $ANTLR end "forStatement"

    public static class whileStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "whileStatement"
    // src/grammar/TL.g:111:1: whileStatement : While expression Do block End -> ^( While expression block ) ;
    public final TLParser.whileStatement_return whileStatement() throws RecognitionException {
        TLParser.whileStatement_return retval = new TLParser.whileStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token While71=null;
        Token Do73=null;
        Token End75=null;
        TLParser.expression_return expression72 = null;

        TLParser.block_return block74 = null;


        Object While71_tree=null;
        Object Do73_tree=null;
        Object End75_tree=null;
        RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
        RewriteRuleTokenStream stream_End=new RewriteRuleTokenStream(adaptor,"token End");
        RewriteRuleTokenStream stream_While=new RewriteRuleTokenStream(adaptor,"token While");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // src/grammar/TL.g:112:3: ( While expression Do block End -> ^( While expression block ) )
            // src/grammar/TL.g:112:6: While expression Do block End
            {
            While71=(Token)match(input,While,FOLLOW_While_in_whileStatement658);  
            stream_While.add(While71);

            pushFollow(FOLLOW_expression_in_whileStatement660);
            expression72=expression();

            state._fsp--;

            stream_expression.add(expression72.getTree());
            Do73=(Token)match(input,Do,FOLLOW_Do_in_whileStatement662);  
            stream_Do.add(Do73);

            pushFollow(FOLLOW_block_in_whileStatement664);
            block74=block();

            state._fsp--;

            stream_block.add(block74.getTree());
            End75=(Token)match(input,End,FOLLOW_End_in_whileStatement666);  
            stream_End.add(End75);



            // AST REWRITE
            // elements: While, expression, block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 112:36: -> ^( While expression block )
            {
                // src/grammar/TL.g:112:39: ^( While expression block )
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
        }
        return retval;
    }
    // $ANTLR end "whileStatement"

    public static class idList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "idList"
    // src/grammar/TL.g:115:1: idList : Identifier ( ',' Identifier )* -> ^( ID_LIST ( Identifier )+ ) ;
    public final TLParser.idList_return idList() throws RecognitionException {
        TLParser.idList_return retval = new TLParser.idList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Identifier76=null;
        Token char_literal77=null;
        Token Identifier78=null;

        Object Identifier76_tree=null;
        Object char_literal77_tree=null;
        Object Identifier78_tree=null;
        RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

        try {
            // src/grammar/TL.g:116:3: ( Identifier ( ',' Identifier )* -> ^( ID_LIST ( Identifier )+ ) )
            // src/grammar/TL.g:116:6: Identifier ( ',' Identifier )*
            {
            Identifier76=(Token)match(input,Identifier,FOLLOW_Identifier_in_idList690);  
            stream_Identifier.add(Identifier76);

            // src/grammar/TL.g:116:17: ( ',' Identifier )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==Comma) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // src/grammar/TL.g:116:18: ',' Identifier
            	    {
            	    char_literal77=(Token)match(input,Comma,FOLLOW_Comma_in_idList693);  
            	    stream_Comma.add(char_literal77);

            	    Identifier78=(Token)match(input,Identifier,FOLLOW_Identifier_in_idList695);  
            	    stream_Identifier.add(Identifier78);


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);



            // AST REWRITE
            // elements: Identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 116:35: -> ^( ID_LIST ( Identifier )+ )
            {
                // src/grammar/TL.g:116:38: ^( ID_LIST ( Identifier )+ )
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
        }
        return retval;
    }
    // $ANTLR end "idList"

    public static class exprList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprList"
    // src/grammar/TL.g:119:1: exprList : expression ( ',' expression )* -> ^( EXP_LIST ( expression )+ ) ;
    public final TLParser.exprList_return exprList() throws RecognitionException {
        TLParser.exprList_return retval = new TLParser.exprList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal80=null;
        TLParser.expression_return expression79 = null;

        TLParser.expression_return expression81 = null;


        Object char_literal80_tree=null;
        RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // src/grammar/TL.g:120:3: ( expression ( ',' expression )* -> ^( EXP_LIST ( expression )+ ) )
            // src/grammar/TL.g:120:6: expression ( ',' expression )*
            {
            pushFollow(FOLLOW_expression_in_exprList720);
            expression79=expression();

            state._fsp--;

            stream_expression.add(expression79.getTree());
            // src/grammar/TL.g:120:17: ( ',' expression )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==Comma) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // src/grammar/TL.g:120:18: ',' expression
            	    {
            	    char_literal80=(Token)match(input,Comma,FOLLOW_Comma_in_exprList723);  
            	    stream_Comma.add(char_literal80);

            	    pushFollow(FOLLOW_expression_in_exprList725);
            	    expression81=expression();

            	    state._fsp--;

            	    stream_expression.add(expression81.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);



            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 120:35: -> ^( EXP_LIST ( expression )+ )
            {
                // src/grammar/TL.g:120:38: ^( EXP_LIST ( expression )+ )
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
        }
        return retval;
    }
    // $ANTLR end "exprList"

    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // src/grammar/TL.g:123:1: expression : condExpr ;
    public final TLParser.expression_return expression() throws RecognitionException {
        TLParser.expression_return retval = new TLParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        TLParser.condExpr_return condExpr82 = null;



        try {
            // src/grammar/TL.g:124:3: ( condExpr )
            // src/grammar/TL.g:124:6: condExpr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_condExpr_in_expression750);
            condExpr82=condExpr();

            state._fsp--;

            adaptor.addChild(root_0, condExpr82.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class condExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condExpr"
    // src/grammar/TL.g:127:1: condExpr : ( orExpr -> orExpr ) ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )? ;
    public final TLParser.condExpr_return condExpr() throws RecognitionException {
        TLParser.condExpr_return retval = new TLParser.condExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal84=null;
        Token char_literal85=null;
        Token In86=null;
        TLParser.expression_return a = null;

        TLParser.expression_return b = null;

        TLParser.orExpr_return orExpr83 = null;

        TLParser.expression_return expression87 = null;


        Object char_literal84_tree=null;
        Object char_literal85_tree=null;
        Object In86_tree=null;
        RewriteRuleTokenStream stream_In=new RewriteRuleTokenStream(adaptor,"token In");
        RewriteRuleTokenStream stream_Colon=new RewriteRuleTokenStream(adaptor,"token Colon");
        RewriteRuleTokenStream stream_QMark=new RewriteRuleTokenStream(adaptor,"token QMark");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_orExpr=new RewriteRuleSubtreeStream(adaptor,"rule orExpr");
        try {
            // src/grammar/TL.g:128:3: ( ( orExpr -> orExpr ) ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )? )
            // src/grammar/TL.g:128:6: ( orExpr -> orExpr ) ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )?
            {
            // src/grammar/TL.g:128:6: ( orExpr -> orExpr )
            // src/grammar/TL.g:128:7: orExpr
            {
            pushFollow(FOLLOW_orExpr_in_condExpr765);
            orExpr83=orExpr();

            state._fsp--;

            stream_orExpr.add(orExpr83.getTree());


            // AST REWRITE
            // elements: orExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 128:14: -> orExpr
            {
                adaptor.addChild(root_0, stream_orExpr.nextTree());

            }

            retval.tree = root_0;
            }

            // src/grammar/TL.g:129:6: ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )?
            int alt13=3;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==QMark) ) {
                alt13=1;
            }
            else if ( (LA13_0==In) ) {
                alt13=2;
            }
            switch (alt13) {
                case 1 :
                    // src/grammar/TL.g:129:8: '?' a= expression ':' b= expression
                    {
                    char_literal84=(Token)match(input,QMark,FOLLOW_QMark_in_condExpr780);  
                    stream_QMark.add(char_literal84);

                    pushFollow(FOLLOW_expression_in_condExpr784);
                    a=expression();

                    state._fsp--;

                    stream_expression.add(a.getTree());
                    char_literal85=(Token)match(input,Colon,FOLLOW_Colon_in_condExpr786);  
                    stream_Colon.add(char_literal85);

                    pushFollow(FOLLOW_expression_in_condExpr790);
                    b=expression();

                    state._fsp--;

                    stream_expression.add(b.getTree());


                    // AST REWRITE
                    // elements: orExpr, b, a
                    // token labels: 
                    // rule labels: retval, b, a
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);
                    RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 129:42: -> ^( TERNARY orExpr $a $b)
                    {
                        // src/grammar/TL.g:129:45: ^( TERNARY orExpr $a $b)
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
                    // src/grammar/TL.g:130:8: In expression
                    {
                    In86=(Token)match(input,In,FOLLOW_In_in_condExpr813);  
                    stream_In.add(In86);

                    pushFollow(FOLLOW_expression_in_condExpr815);
                    expression87=expression();

                    state._fsp--;

                    stream_expression.add(expression87.getTree());


                    // AST REWRITE
                    // elements: expression, In, orExpr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 130:42: -> ^( In orExpr expression )
                    {
                        // src/grammar/TL.g:130:45: ^( In orExpr expression )
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
        }
        return retval;
    }
    // $ANTLR end "condExpr"

    public static class orExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "orExpr"
    // src/grammar/TL.g:134:1: orExpr : andExpr ( '||' andExpr )* ;
    public final TLParser.orExpr_return orExpr() throws RecognitionException {
        TLParser.orExpr_return retval = new TLParser.orExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal89=null;
        TLParser.andExpr_return andExpr88 = null;

        TLParser.andExpr_return andExpr90 = null;


        Object string_literal89_tree=null;

        try {
            // src/grammar/TL.g:135:3: ( andExpr ( '||' andExpr )* )
            // src/grammar/TL.g:135:6: andExpr ( '||' andExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_andExpr_in_orExpr867);
            andExpr88=andExpr();

            state._fsp--;

            adaptor.addChild(root_0, andExpr88.getTree());
            // src/grammar/TL.g:135:14: ( '||' andExpr )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==Or) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // src/grammar/TL.g:135:15: '||' andExpr
            	    {
            	    string_literal89=(Token)match(input,Or,FOLLOW_Or_in_orExpr870); 
            	    string_literal89_tree = (Object)adaptor.create(string_literal89);
            	    root_0 = (Object)adaptor.becomeRoot(string_literal89_tree, root_0);

            	    pushFollow(FOLLOW_andExpr_in_orExpr873);
            	    andExpr90=andExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, andExpr90.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


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
        }
        return retval;
    }
    // $ANTLR end "orExpr"

    public static class andExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "andExpr"
    // src/grammar/TL.g:138:1: andExpr : equExpr ( '&&' equExpr )* ;
    public final TLParser.andExpr_return andExpr() throws RecognitionException {
        TLParser.andExpr_return retval = new TLParser.andExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal92=null;
        TLParser.equExpr_return equExpr91 = null;

        TLParser.equExpr_return equExpr93 = null;


        Object string_literal92_tree=null;

        try {
            // src/grammar/TL.g:139:3: ( equExpr ( '&&' equExpr )* )
            // src/grammar/TL.g:139:6: equExpr ( '&&' equExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equExpr_in_andExpr889);
            equExpr91=equExpr();

            state._fsp--;

            adaptor.addChild(root_0, equExpr91.getTree());
            // src/grammar/TL.g:139:14: ( '&&' equExpr )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==And) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // src/grammar/TL.g:139:15: '&&' equExpr
            	    {
            	    string_literal92=(Token)match(input,And,FOLLOW_And_in_andExpr892); 
            	    string_literal92_tree = (Object)adaptor.create(string_literal92);
            	    root_0 = (Object)adaptor.becomeRoot(string_literal92_tree, root_0);

            	    pushFollow(FOLLOW_equExpr_in_andExpr895);
            	    equExpr93=equExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, equExpr93.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


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
        }
        return retval;
    }
    // $ANTLR end "andExpr"

    public static class equExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equExpr"
    // src/grammar/TL.g:142:1: equExpr : relExpr ( ( '==' | '!=' ) relExpr )* ;
    public final TLParser.equExpr_return equExpr() throws RecognitionException {
        TLParser.equExpr_return retval = new TLParser.equExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set95=null;
        TLParser.relExpr_return relExpr94 = null;

        TLParser.relExpr_return relExpr96 = null;


        Object set95_tree=null;

        try {
            // src/grammar/TL.g:143:3: ( relExpr ( ( '==' | '!=' ) relExpr )* )
            // src/grammar/TL.g:143:6: relExpr ( ( '==' | '!=' ) relExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relExpr_in_equExpr911);
            relExpr94=relExpr();

            state._fsp--;

            adaptor.addChild(root_0, relExpr94.getTree());
            // src/grammar/TL.g:143:14: ( ( '==' | '!=' ) relExpr )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=Equals && LA16_0<=NEquals)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // src/grammar/TL.g:143:15: ( '==' | '!=' ) relExpr
            	    {
            	    set95=(Token)input.LT(1);
            	    set95=(Token)input.LT(1);
            	    if ( (input.LA(1)>=Equals && input.LA(1)<=NEquals) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set95), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_relExpr_in_equExpr923);
            	    relExpr96=relExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, relExpr96.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


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
        }
        return retval;
    }
    // $ANTLR end "equExpr"

    public static class relExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relExpr"
    // src/grammar/TL.g:146:1: relExpr : addExpr ( ( '>=' | '<=' | '>' | '<' ) addExpr )* ;
    public final TLParser.relExpr_return relExpr() throws RecognitionException {
        TLParser.relExpr_return retval = new TLParser.relExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set98=null;
        TLParser.addExpr_return addExpr97 = null;

        TLParser.addExpr_return addExpr99 = null;


        Object set98_tree=null;

        try {
            // src/grammar/TL.g:147:3: ( addExpr ( ( '>=' | '<=' | '>' | '<' ) addExpr )* )
            // src/grammar/TL.g:147:6: addExpr ( ( '>=' | '<=' | '>' | '<' ) addExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_addExpr_in_relExpr939);
            addExpr97=addExpr();

            state._fsp--;

            adaptor.addChild(root_0, addExpr97.getTree());
            // src/grammar/TL.g:147:14: ( ( '>=' | '<=' | '>' | '<' ) addExpr )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=GTEquals && LA17_0<=LTEquals)||(LA17_0>=GT && LA17_0<=LT)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // src/grammar/TL.g:147:15: ( '>=' | '<=' | '>' | '<' ) addExpr
            	    {
            	    set98=(Token)input.LT(1);
            	    set98=(Token)input.LT(1);
            	    if ( (input.LA(1)>=GTEquals && input.LA(1)<=LTEquals)||(input.LA(1)>=GT && input.LA(1)<=LT) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set98), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_addExpr_in_relExpr959);
            	    addExpr99=addExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, addExpr99.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


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
        }
        return retval;
    }
    // $ANTLR end "relExpr"

    public static class addExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "addExpr"
    // src/grammar/TL.g:150:1: addExpr : mulExpr ( ( '+' | '-' ) mulExpr )* ;
    public final TLParser.addExpr_return addExpr() throws RecognitionException {
        TLParser.addExpr_return retval = new TLParser.addExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set101=null;
        TLParser.mulExpr_return mulExpr100 = null;

        TLParser.mulExpr_return mulExpr102 = null;


        Object set101_tree=null;

        try {
            // src/grammar/TL.g:151:3: ( mulExpr ( ( '+' | '-' ) mulExpr )* )
            // src/grammar/TL.g:151:6: mulExpr ( ( '+' | '-' ) mulExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_mulExpr_in_addExpr975);
            mulExpr100=mulExpr();

            state._fsp--;

            adaptor.addChild(root_0, mulExpr100.getTree());
            // src/grammar/TL.g:151:14: ( ( '+' | '-' ) mulExpr )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=Add && LA18_0<=Subtract)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // src/grammar/TL.g:151:15: ( '+' | '-' ) mulExpr
            	    {
            	    set101=(Token)input.LT(1);
            	    set101=(Token)input.LT(1);
            	    if ( (input.LA(1)>=Add && input.LA(1)<=Subtract) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set101), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_mulExpr_in_addExpr987);
            	    mulExpr102=mulExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, mulExpr102.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


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
        }
        return retval;
    }
    // $ANTLR end "addExpr"

    public static class mulExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mulExpr"
    // src/grammar/TL.g:154:1: mulExpr : powExpr ( ( '*' | '/' | '%' ) powExpr )* ;
    public final TLParser.mulExpr_return mulExpr() throws RecognitionException {
        TLParser.mulExpr_return retval = new TLParser.mulExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set104=null;
        TLParser.powExpr_return powExpr103 = null;

        TLParser.powExpr_return powExpr105 = null;


        Object set104_tree=null;

        try {
            // src/grammar/TL.g:155:3: ( powExpr ( ( '*' | '/' | '%' ) powExpr )* )
            // src/grammar/TL.g:155:6: powExpr ( ( '*' | '/' | '%' ) powExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_powExpr_in_mulExpr1003);
            powExpr103=powExpr();

            state._fsp--;

            adaptor.addChild(root_0, powExpr103.getTree());
            // src/grammar/TL.g:155:14: ( ( '*' | '/' | '%' ) powExpr )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=Multiply && LA19_0<=Modulus)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // src/grammar/TL.g:155:15: ( '*' | '/' | '%' ) powExpr
            	    {
            	    set104=(Token)input.LT(1);
            	    set104=(Token)input.LT(1);
            	    if ( (input.LA(1)>=Multiply && input.LA(1)<=Modulus) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set104), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_powExpr_in_mulExpr1019);
            	    powExpr105=powExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, powExpr105.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


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
        }
        return retval;
    }
    // $ANTLR end "mulExpr"

    public static class powExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "powExpr"
    // src/grammar/TL.g:158:1: powExpr : unaryExpr ( '^' unaryExpr )* ;
    public final TLParser.powExpr_return powExpr() throws RecognitionException {
        TLParser.powExpr_return retval = new TLParser.powExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal107=null;
        TLParser.unaryExpr_return unaryExpr106 = null;

        TLParser.unaryExpr_return unaryExpr108 = null;


        Object char_literal107_tree=null;

        try {
            // src/grammar/TL.g:159:3: ( unaryExpr ( '^' unaryExpr )* )
            // src/grammar/TL.g:159:6: unaryExpr ( '^' unaryExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_unaryExpr_in_powExpr1035);
            unaryExpr106=unaryExpr();

            state._fsp--;

            adaptor.addChild(root_0, unaryExpr106.getTree());
            // src/grammar/TL.g:159:16: ( '^' unaryExpr )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==Pow) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // src/grammar/TL.g:159:17: '^' unaryExpr
            	    {
            	    char_literal107=(Token)match(input,Pow,FOLLOW_Pow_in_powExpr1038); 
            	    char_literal107_tree = (Object)adaptor.create(char_literal107);
            	    root_0 = (Object)adaptor.becomeRoot(char_literal107_tree, root_0);

            	    pushFollow(FOLLOW_unaryExpr_in_powExpr1041);
            	    unaryExpr108=unaryExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, unaryExpr108.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


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
        }
        return retval;
    }
    // $ANTLR end "powExpr"

    public static class unaryExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryExpr"
    // src/grammar/TL.g:162:1: unaryExpr : ( '-' atom -> ^( UNARY_MIN atom ) | '!' atom -> ^( NEGATE atom ) | atom );
    public final TLParser.unaryExpr_return unaryExpr() throws RecognitionException {
        TLParser.unaryExpr_return retval = new TLParser.unaryExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal109=null;
        Token char_literal111=null;
        TLParser.atom_return atom110 = null;

        TLParser.atom_return atom112 = null;

        TLParser.atom_return atom113 = null;


        Object char_literal109_tree=null;
        Object char_literal111_tree=null;
        RewriteRuleTokenStream stream_Excl=new RewriteRuleTokenStream(adaptor,"token Excl");
        RewriteRuleTokenStream stream_Subtract=new RewriteRuleTokenStream(adaptor,"token Subtract");
        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        try {
            // src/grammar/TL.g:163:3: ( '-' atom -> ^( UNARY_MIN atom ) | '!' atom -> ^( NEGATE atom ) | atom )
            int alt21=3;
            switch ( input.LA(1) ) {
            case Subtract:
                {
                alt21=1;
                }
                break;
            case Excl:
                {
                alt21=2;
                }
                break;
            case Identifier:
            case Println:
            case Print:
            case Assert:
            case Size:
            case Number:
            case Bool:
            case Null:
            case String:
            case OBracket:
            case OParen:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // src/grammar/TL.g:163:6: '-' atom
                    {
                    char_literal109=(Token)match(input,Subtract,FOLLOW_Subtract_in_unaryExpr1059);  
                    stream_Subtract.add(char_literal109);

                    pushFollow(FOLLOW_atom_in_unaryExpr1061);
                    atom110=atom();

                    state._fsp--;

                    stream_atom.add(atom110.getTree());


                    // AST REWRITE
                    // elements: atom
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 163:15: -> ^( UNARY_MIN atom )
                    {
                        // src/grammar/TL.g:163:18: ^( UNARY_MIN atom )
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
                    // src/grammar/TL.g:164:6: '!' atom
                    {
                    char_literal111=(Token)match(input,Excl,FOLLOW_Excl_in_unaryExpr1076);  
                    stream_Excl.add(char_literal111);

                    pushFollow(FOLLOW_atom_in_unaryExpr1078);
                    atom112=atom();

                    state._fsp--;

                    stream_atom.add(atom112.getTree());


                    // AST REWRITE
                    // elements: atom
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 164:15: -> ^( NEGATE atom )
                    {
                        // src/grammar/TL.g:164:18: ^( NEGATE atom )
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
                    // src/grammar/TL.g:165:6: atom
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_atom_in_unaryExpr1093);
                    atom113=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom113.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "unaryExpr"

    public static class atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom"
    // src/grammar/TL.g:168:1: atom : ( Number | Bool | Null | lookup );
    public final TLParser.atom_return atom() throws RecognitionException {
        TLParser.atom_return retval = new TLParser.atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Number114=null;
        Token Bool115=null;
        Token Null116=null;
        TLParser.lookup_return lookup117 = null;


        Object Number114_tree=null;
        Object Bool115_tree=null;
        Object Null116_tree=null;

        try {
            // src/grammar/TL.g:169:3: ( Number | Bool | Null | lookup )
            int alt22=4;
            switch ( input.LA(1) ) {
            case Number:
                {
                alt22=1;
                }
                break;
            case Bool:
                {
                alt22=2;
                }
                break;
            case Null:
                {
                alt22=3;
                }
                break;
            case Identifier:
            case Println:
            case Print:
            case Assert:
            case Size:
            case String:
            case OBracket:
            case OParen:
                {
                alt22=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // src/grammar/TL.g:169:6: Number
                    {
                    root_0 = (Object)adaptor.nil();

                    Number114=(Token)match(input,Number,FOLLOW_Number_in_atom1107); 
                    Number114_tree = (Object)adaptor.create(Number114);
                    adaptor.addChild(root_0, Number114_tree);


                    }
                    break;
                case 2 :
                    // src/grammar/TL.g:170:6: Bool
                    {
                    root_0 = (Object)adaptor.nil();

                    Bool115=(Token)match(input,Bool,FOLLOW_Bool_in_atom1114); 
                    Bool115_tree = (Object)adaptor.create(Bool115);
                    adaptor.addChild(root_0, Bool115_tree);


                    }
                    break;
                case 3 :
                    // src/grammar/TL.g:171:6: Null
                    {
                    root_0 = (Object)adaptor.nil();

                    Null116=(Token)match(input,Null,FOLLOW_Null_in_atom1121); 
                    Null116_tree = (Object)adaptor.create(Null116);
                    adaptor.addChild(root_0, Null116_tree);


                    }
                    break;
                case 4 :
                    // src/grammar/TL.g:172:6: lookup
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_lookup_in_atom1128);
                    lookup117=lookup();

                    state._fsp--;

                    adaptor.addChild(root_0, lookup117.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "atom"

    public static class list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "list"
    // src/grammar/TL.g:175:1: list : '[' ( exprList )? ']' -> ^( LIST ( exprList )? ) ;
    public final TLParser.list_return list() throws RecognitionException {
        TLParser.list_return retval = new TLParser.list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal118=null;
        Token char_literal120=null;
        TLParser.exprList_return exprList119 = null;


        Object char_literal118_tree=null;
        Object char_literal120_tree=null;
        RewriteRuleTokenStream stream_CBracket=new RewriteRuleTokenStream(adaptor,"token CBracket");
        RewriteRuleTokenStream stream_OBracket=new RewriteRuleTokenStream(adaptor,"token OBracket");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");
        try {
            // src/grammar/TL.g:176:3: ( '[' ( exprList )? ']' -> ^( LIST ( exprList )? ) )
            // src/grammar/TL.g:176:6: '[' ( exprList )? ']'
            {
            char_literal118=(Token)match(input,OBracket,FOLLOW_OBracket_in_list1142);  
            stream_OBracket.add(char_literal118);

            // src/grammar/TL.g:176:10: ( exprList )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=Identifier && LA23_0<=Size)||(LA23_0>=Number && LA23_0<=String)||LA23_0==Excl||LA23_0==Subtract||LA23_0==OBracket||LA23_0==OParen) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // src/grammar/TL.g:176:10: exprList
                    {
                    pushFollow(FOLLOW_exprList_in_list1144);
                    exprList119=exprList();

                    state._fsp--;

                    stream_exprList.add(exprList119.getTree());

                    }
                    break;

            }

            char_literal120=(Token)match(input,CBracket,FOLLOW_CBracket_in_list1147);  
            stream_CBracket.add(char_literal120);



            // AST REWRITE
            // elements: exprList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 176:24: -> ^( LIST ( exprList )? )
            {
                // src/grammar/TL.g:176:27: ^( LIST ( exprList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);

                // src/grammar/TL.g:176:34: ( exprList )?
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
        }
        return retval;
    }
    // $ANTLR end "list"

    public static class lookup_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lookup"
    // src/grammar/TL.g:179:1: lookup : ( functionCall ( indexes )? -> ^( LOOKUP functionCall ( indexes )? ) | list ( indexes )? -> ^( LOOKUP list ( indexes )? ) | Identifier ( indexes )? -> ^( LOOKUP Identifier ( indexes )? ) | String ( indexes )? -> ^( LOOKUP String ( indexes )? ) | '(' expression ')' ( indexes )? -> ^( LOOKUP expression ( indexes )? ) );
    public final TLParser.lookup_return lookup() throws RecognitionException {
        TLParser.lookup_return retval = new TLParser.lookup_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Identifier125=null;
        Token String127=null;
        Token char_literal129=null;
        Token char_literal131=null;
        TLParser.functionCall_return functionCall121 = null;

        TLParser.indexes_return indexes122 = null;

        TLParser.list_return list123 = null;

        TLParser.indexes_return indexes124 = null;

        TLParser.indexes_return indexes126 = null;

        TLParser.indexes_return indexes128 = null;

        TLParser.expression_return expression130 = null;

        TLParser.indexes_return indexes132 = null;


        Object Identifier125_tree=null;
        Object String127_tree=null;
        Object char_literal129_tree=null;
        Object char_literal131_tree=null;
        RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
        RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
        RewriteRuleTokenStream stream_String=new RewriteRuleTokenStream(adaptor,"token String");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_functionCall=new RewriteRuleSubtreeStream(adaptor,"rule functionCall");
        RewriteRuleSubtreeStream stream_indexes=new RewriteRuleSubtreeStream(adaptor,"rule indexes");
        RewriteRuleSubtreeStream stream_list=new RewriteRuleSubtreeStream(adaptor,"rule list");
        try {
            // src/grammar/TL.g:180:3: ( functionCall ( indexes )? -> ^( LOOKUP functionCall ( indexes )? ) | list ( indexes )? -> ^( LOOKUP list ( indexes )? ) | Identifier ( indexes )? -> ^( LOOKUP Identifier ( indexes )? ) | String ( indexes )? -> ^( LOOKUP String ( indexes )? ) | '(' expression ')' ( indexes )? -> ^( LOOKUP expression ( indexes )? ) )
            int alt29=5;
            switch ( input.LA(1) ) {
            case Identifier:
                {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==OParen) ) {
                    alt29=1;
                }
                else if ( (LA29_1==Do||LA29_1==To||LA29_1==In||(LA29_1>=Or && LA29_1<=Pow)||(LA29_1>=GT && LA29_1<=Modulus)||(LA29_1>=OBracket && LA29_1<=CBracket)||(LA29_1>=CParen && LA29_1<=SColon)||(LA29_1>=Comma && LA29_1<=Colon)) ) {
                    alt29=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 1, input);

                    throw nvae;
                }
                }
                break;
            case Println:
            case Print:
            case Assert:
            case Size:
                {
                alt29=1;
                }
                break;
            case OBracket:
                {
                alt29=2;
                }
                break;
            case String:
                {
                alt29=4;
                }
                break;
            case OParen:
                {
                alt29=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // src/grammar/TL.g:180:6: functionCall ( indexes )?
                    {
                    pushFollow(FOLLOW_functionCall_in_lookup1170);
                    functionCall121=functionCall();

                    state._fsp--;

                    stream_functionCall.add(functionCall121.getTree());
                    // src/grammar/TL.g:180:19: ( indexes )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==OBracket) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // src/grammar/TL.g:180:19: indexes
                            {
                            pushFollow(FOLLOW_indexes_in_lookup1172);
                            indexes122=indexes();

                            state._fsp--;

                            stream_indexes.add(indexes122.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: indexes, functionCall
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 180:34: -> ^( LOOKUP functionCall ( indexes )? )
                    {
                        // src/grammar/TL.g:180:37: ^( LOOKUP functionCall ( indexes )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);

                        adaptor.addChild(root_1, stream_functionCall.nextTree());
                        // src/grammar/TL.g:180:59: ( indexes )?
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
                    // src/grammar/TL.g:181:6: list ( indexes )?
                    {
                    pushFollow(FOLLOW_list_in_lookup1197);
                    list123=list();

                    state._fsp--;

                    stream_list.add(list123.getTree());
                    // src/grammar/TL.g:181:11: ( indexes )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==OBracket) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // src/grammar/TL.g:181:11: indexes
                            {
                            pushFollow(FOLLOW_indexes_in_lookup1199);
                            indexes124=indexes();

                            state._fsp--;

                            stream_indexes.add(indexes124.getTree());

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
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 181:34: -> ^( LOOKUP list ( indexes )? )
                    {
                        // src/grammar/TL.g:181:37: ^( LOOKUP list ( indexes )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);

                        adaptor.addChild(root_1, stream_list.nextTree());
                        // src/grammar/TL.g:181:51: ( indexes )?
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
                    // src/grammar/TL.g:182:6: Identifier ( indexes )?
                    {
                    Identifier125=(Token)match(input,Identifier,FOLLOW_Identifier_in_lookup1232);  
                    stream_Identifier.add(Identifier125);

                    // src/grammar/TL.g:182:17: ( indexes )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==OBracket) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // src/grammar/TL.g:182:17: indexes
                            {
                            pushFollow(FOLLOW_indexes_in_lookup1234);
                            indexes126=indexes();

                            state._fsp--;

                            stream_indexes.add(indexes126.getTree());

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
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 182:34: -> ^( LOOKUP Identifier ( indexes )? )
                    {
                        // src/grammar/TL.g:182:37: ^( LOOKUP Identifier ( indexes )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);

                        adaptor.addChild(root_1, stream_Identifier.nextNode());
                        // src/grammar/TL.g:182:57: ( indexes )?
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
                    // src/grammar/TL.g:183:6: String ( indexes )?
                    {
                    String127=(Token)match(input,String,FOLLOW_String_in_lookup1261);  
                    stream_String.add(String127);

                    // src/grammar/TL.g:183:13: ( indexes )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==OBracket) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // src/grammar/TL.g:183:13: indexes
                            {
                            pushFollow(FOLLOW_indexes_in_lookup1263);
                            indexes128=indexes();

                            state._fsp--;

                            stream_indexes.add(indexes128.getTree());

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
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 183:34: -> ^( LOOKUP String ( indexes )? )
                    {
                        // src/grammar/TL.g:183:37: ^( LOOKUP String ( indexes )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);

                        adaptor.addChild(root_1, stream_String.nextNode());
                        // src/grammar/TL.g:183:53: ( indexes )?
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
                    // src/grammar/TL.g:184:6: '(' expression ')' ( indexes )?
                    {
                    char_literal129=(Token)match(input,OParen,FOLLOW_OParen_in_lookup1294);  
                    stream_OParen.add(char_literal129);

                    pushFollow(FOLLOW_expression_in_lookup1296);
                    expression130=expression();

                    state._fsp--;

                    stream_expression.add(expression130.getTree());
                    char_literal131=(Token)match(input,CParen,FOLLOW_CParen_in_lookup1298);  
                    stream_CParen.add(char_literal131);

                    // src/grammar/TL.g:184:25: ( indexes )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==OBracket) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // src/grammar/TL.g:184:25: indexes
                            {
                            pushFollow(FOLLOW_indexes_in_lookup1300);
                            indexes132=indexes();

                            state._fsp--;

                            stream_indexes.add(indexes132.getTree());

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
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 184:34: -> ^( LOOKUP expression ( indexes )? )
                    {
                        // src/grammar/TL.g:184:37: ^( LOOKUP expression ( indexes )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        // src/grammar/TL.g:184:57: ( indexes )?
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
        }
        return retval;
    }
    // $ANTLR end "lookup"

    public static class indexes_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "indexes"
    // src/grammar/TL.g:187:1: indexes : ( '[' expression ']' )+ -> ^( INDEXES ( expression )+ ) ;
    public final TLParser.indexes_return indexes() throws RecognitionException {
        TLParser.indexes_return retval = new TLParser.indexes_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal133=null;
        Token char_literal135=null;
        TLParser.expression_return expression134 = null;


        Object char_literal133_tree=null;
        Object char_literal135_tree=null;
        RewriteRuleTokenStream stream_CBracket=new RewriteRuleTokenStream(adaptor,"token CBracket");
        RewriteRuleTokenStream stream_OBracket=new RewriteRuleTokenStream(adaptor,"token OBracket");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // src/grammar/TL.g:188:3: ( ( '[' expression ']' )+ -> ^( INDEXES ( expression )+ ) )
            // src/grammar/TL.g:188:6: ( '[' expression ']' )+
            {
            // src/grammar/TL.g:188:6: ( '[' expression ']' )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==OBracket) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // src/grammar/TL.g:188:7: '[' expression ']'
            	    {
            	    char_literal133=(Token)match(input,OBracket,FOLLOW_OBracket_in_indexes1327);  
            	    stream_OBracket.add(char_literal133);

            	    pushFollow(FOLLOW_expression_in_indexes1329);
            	    expression134=expression();

            	    state._fsp--;

            	    stream_expression.add(expression134.getTree());
            	    char_literal135=(Token)match(input,CBracket,FOLLOW_CBracket_in_indexes1331);  
            	    stream_CBracket.add(char_literal135);


            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);



            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 188:28: -> ^( INDEXES ( expression )+ )
            {
                // src/grammar/TL.g:188:31: ^( INDEXES ( expression )+ )
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
        }
        return retval;
    }
    // $ANTLR end "indexes"

    // Delegated rules


 

    public static final BitSet FOLLOW_block_in_parse138 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_parse140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_block159 = new BitSet(new long[]{0x00000002CBF00002L});
    public static final BitSet FOLLOW_functionDecl_in_block163 = new BitSet(new long[]{0x00000002CBF00002L});
    public static final BitSet FOLLOW_Return_in_block168 = new BitSet(new long[]{0x0504407803E00000L});
    public static final BitSet FOLLOW_expression_in_block170 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_SColon_in_block172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement214 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_SColon_in_statement216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_statement229 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_SColon_in_statement231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forStatement_in_statement249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_assignment270 = new BitSet(new long[]{0x2100000000000000L});
    public static final BitSet FOLLOW_indexes_in_assignment272 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_Assign_in_assignment275 = new BitSet(new long[]{0x0504407803E00000L});
    public static final BitSet FOLLOW_expression_in_assignment277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_functionCall310 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_OParen_in_functionCall312 = new BitSet(new long[]{0x0D04407803E00000L});
    public static final BitSet FOLLOW_exprList_in_functionCall314 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_CParen_in_functionCall317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Println_in_functionCall335 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_OParen_in_functionCall337 = new BitSet(new long[]{0x0D04407803E00000L});
    public static final BitSet FOLLOW_expression_in_functionCall339 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_CParen_in_functionCall342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Print_in_functionCall361 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_OParen_in_functionCall363 = new BitSet(new long[]{0x0504407803E00000L});
    public static final BitSet FOLLOW_expression_in_functionCall365 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_CParen_in_functionCall367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Assert_in_functionCall388 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_OParen_in_functionCall390 = new BitSet(new long[]{0x0504407803E00000L});
    public static final BitSet FOLLOW_expression_in_functionCall392 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_CParen_in_functionCall394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Size_in_functionCall414 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_OParen_in_functionCall416 = new BitSet(new long[]{0x0504407803E00000L});
    public static final BitSet FOLLOW_expression_in_functionCall418 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_CParen_in_functionCall420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStat_in_ifStatement449 = new BitSet(new long[]{0x0000000024000000L});
    public static final BitSet FOLLOW_elseIfStat_in_ifStatement451 = new BitSet(new long[]{0x0000000024000000L});
    public static final BitSet FOLLOW_elseStat_in_ifStatement454 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_End_in_ifStatement457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_If_in_ifStat485 = new BitSet(new long[]{0x0504407803E00000L});
    public static final BitSet FOLLOW_expression_in_ifStat487 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_Do_in_ifStat489 = new BitSet(new long[]{0x00000002CBF00000L});
    public static final BitSet FOLLOW_block_in_ifStat491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Else_in_elseIfStat515 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_If_in_elseIfStat517 = new BitSet(new long[]{0x0504407803E00000L});
    public static final BitSet FOLLOW_expression_in_elseIfStat519 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_Do_in_elseIfStat521 = new BitSet(new long[]{0x00000002CBF00000L});
    public static final BitSet FOLLOW_block_in_elseIfStat523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Else_in_elseStat547 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_Do_in_elseStat549 = new BitSet(new long[]{0x00000002CBF00000L});
    public static final BitSet FOLLOW_block_in_elseStat551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Def_in_functionDecl573 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_Identifier_in_functionDecl575 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_OParen_in_functionDecl577 = new BitSet(new long[]{0x0800000000200000L});
    public static final BitSet FOLLOW_idList_in_functionDecl579 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_CParen_in_functionDecl582 = new BitSet(new long[]{0x00000002CBF00000L});
    public static final BitSet FOLLOW_block_in_functionDecl584 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_End_in_functionDecl586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_For_in_forStatement608 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_Identifier_in_forStatement610 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_Assign_in_forStatement612 = new BitSet(new long[]{0x0504407803E00000L});
    public static final BitSet FOLLOW_expression_in_forStatement614 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_To_in_forStatement616 = new BitSet(new long[]{0x0504407803E00000L});
    public static final BitSet FOLLOW_expression_in_forStatement618 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_Do_in_forStatement620 = new BitSet(new long[]{0x00000002CBF00000L});
    public static final BitSet FOLLOW_block_in_forStatement622 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_End_in_forStatement624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_While_in_whileStatement658 = new BitSet(new long[]{0x0504407803E00000L});
    public static final BitSet FOLLOW_expression_in_whileStatement660 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_Do_in_whileStatement662 = new BitSet(new long[]{0x00000002CBF00000L});
    public static final BitSet FOLLOW_block_in_whileStatement664 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_End_in_whileStatement666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_idList690 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_Comma_in_idList693 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_Identifier_in_idList695 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_expression_in_exprList720 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_Comma_in_exprList723 = new BitSet(new long[]{0x0504407803E00000L});
    public static final BitSet FOLLOW_expression_in_exprList725 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_condExpr_in_expression750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orExpr_in_condExpr765 = new BitSet(new long[]{0x8000000400000002L});
    public static final BitSet FOLLOW_QMark_in_condExpr780 = new BitSet(new long[]{0x0504407803E00000L});
    public static final BitSet FOLLOW_expression_in_condExpr784 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_Colon_in_condExpr786 = new BitSet(new long[]{0x0504407803E00000L});
    public static final BitSet FOLLOW_expression_in_condExpr790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_In_in_condExpr813 = new BitSet(new long[]{0x0504407803E00000L});
    public static final BitSet FOLLOW_expression_in_condExpr815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExpr_in_orExpr867 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_Or_in_orExpr870 = new BitSet(new long[]{0x0504407803E00000L});
    public static final BitSet FOLLOW_andExpr_in_orExpr873 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_equExpr_in_andExpr889 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_And_in_andExpr892 = new BitSet(new long[]{0x0504407803E00000L});
    public static final BitSet FOLLOW_equExpr_in_andExpr895 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_relExpr_in_equExpr911 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_set_in_equExpr914 = new BitSet(new long[]{0x0504407803E00000L});
    public static final BitSet FOLLOW_relExpr_in_equExpr923 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_addExpr_in_relExpr939 = new BitSet(new long[]{0x0001980000000002L});
    public static final BitSet FOLLOW_set_in_relExpr942 = new BitSet(new long[]{0x0504407803E00000L});
    public static final BitSet FOLLOW_addExpr_in_relExpr959 = new BitSet(new long[]{0x0001980000000002L});
    public static final BitSet FOLLOW_mulExpr_in_addExpr975 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_set_in_addExpr978 = new BitSet(new long[]{0x0504407803E00000L});
    public static final BitSet FOLLOW_mulExpr_in_addExpr987 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_powExpr_in_mulExpr1003 = new BitSet(new long[]{0x0038000000000002L});
    public static final BitSet FOLLOW_set_in_mulExpr1006 = new BitSet(new long[]{0x0504407803E00000L});
    public static final BitSet FOLLOW_powExpr_in_mulExpr1019 = new BitSet(new long[]{0x0038000000000002L});
    public static final BitSet FOLLOW_unaryExpr_in_powExpr1035 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_Pow_in_powExpr1038 = new BitSet(new long[]{0x0504407803E00000L});
    public static final BitSet FOLLOW_unaryExpr_in_powExpr1041 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_Subtract_in_unaryExpr1059 = new BitSet(new long[]{0x0504407803E00000L});
    public static final BitSet FOLLOW_atom_in_unaryExpr1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Excl_in_unaryExpr1076 = new BitSet(new long[]{0x0504407803E00000L});
    public static final BitSet FOLLOW_atom_in_unaryExpr1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_unaryExpr1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Number_in_atom1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Bool_in_atom1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Null_in_atom1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lookup_in_atom1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OBracket_in_list1142 = new BitSet(new long[]{0x0704407803E00000L});
    public static final BitSet FOLLOW_exprList_in_list1144 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_CBracket_in_list1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_lookup1170 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_indexes_in_lookup1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_in_lookup1197 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_indexes_in_lookup1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_lookup1232 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_indexes_in_lookup1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_String_in_lookup1261 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_indexes_in_lookup1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OParen_in_lookup1294 = new BitSet(new long[]{0x0504407803E00000L});
    public static final BitSet FOLLOW_expression_in_lookup1296 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_CParen_in_lookup1298 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_indexes_in_lookup1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OBracket_in_indexes1327 = new BitSet(new long[]{0x0504407803E00000L});
    public static final BitSet FOLLOW_expression_in_indexes1329 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_CBracket_in_indexes1331 = new BitSet(new long[]{0x0100000000000002L});

}