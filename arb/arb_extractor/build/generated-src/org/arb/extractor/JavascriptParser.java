// $ANTLR 3.4 /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g 2013-04-24 20:51:00

package org.arb.extractor;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class JavascriptParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CALL_EXPR_DEF", "CharacterEscapeSequence", "Comment", "DecimalDigit", "DecimalLiteral", "DoubleStringCharacter", "EscapeCharacter", "EscapeSequence", "ExponentPart", "FUNC_DECL_DEF", "FUNC_EXPR_DEF", "HexDigit", "HexEscapeSequence", "HexIntegerLiteral", "Identifier", "IdentifierPart", "IdentifierStart", "LT", "LineComment", "NonEscapeCharacter", "NumericLiteral", "STRING_LITERAL_DEF", "SingleEscapeCharacter", "SingleStringCharacter", "StringLiteral", "UnicodeCombiningMark", "UnicodeConnectorPunctuation", "UnicodeDigit", "UnicodeEscapeSequence", "UnicodeLetter", "VAR_DECL_DEF", "WhiteSpace", "'!'", "'!='", "'!=='", "'%'", "'%='", "'&&'", "'&'", "'&='", "'('", "')'", "'*'", "'*='", "'+'", "'++'", "'+='", "','", "'-'", "'--'", "'-='", "'.'", "'/'", "'/='", "':'", "';'", "'<'", "'<<'", "'<<='", "'<='", "'='", "'=='", "'==='", "'>'", "'>='", "'>>'", "'>>='", "'>>>'", "'>>>='", "'?'", "'['", "']'", "'^'", "'^='", "'break'", "'case'", "'catch'", "'continue'", "'default'", "'delete'", "'do'", "'else'", "'false'", "'finally'", "'for'", "'function'", "'if'", "'in'", "'instanceof'", "'new'", "'null'", "'return'", "'switch'", "'this'", "'throw'", "'true'", "'try'", "'typeof'", "'var'", "'void'", "'while'", "'with'", "'{'", "'|'", "'|='", "'||'", "'}'", "'~'"
    };

    public static final int EOF=-1;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__90=90;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__99=99;
    public static final int T__100=100;
    public static final int T__101=101;
    public static final int T__102=102;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__110=110;
    public static final int T__111=111;
    public static final int CALL_EXPR_DEF=4;
    public static final int CharacterEscapeSequence=5;
    public static final int Comment=6;
    public static final int DecimalDigit=7;
    public static final int DecimalLiteral=8;
    public static final int DoubleStringCharacter=9;
    public static final int EscapeCharacter=10;
    public static final int EscapeSequence=11;
    public static final int ExponentPart=12;
    public static final int FUNC_DECL_DEF=13;
    public static final int FUNC_EXPR_DEF=14;
    public static final int HexDigit=15;
    public static final int HexEscapeSequence=16;
    public static final int HexIntegerLiteral=17;
    public static final int Identifier=18;
    public static final int IdentifierPart=19;
    public static final int IdentifierStart=20;
    public static final int LT=21;
    public static final int LineComment=22;
    public static final int NonEscapeCharacter=23;
    public static final int NumericLiteral=24;
    public static final int STRING_LITERAL_DEF=25;
    public static final int SingleEscapeCharacter=26;
    public static final int SingleStringCharacter=27;
    public static final int StringLiteral=28;
    public static final int UnicodeCombiningMark=29;
    public static final int UnicodeConnectorPunctuation=30;
    public static final int UnicodeDigit=31;
    public static final int UnicodeEscapeSequence=32;
    public static final int UnicodeLetter=33;
    public static final int VAR_DECL_DEF=34;
    public static final int WhiteSpace=35;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public JavascriptParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public JavascriptParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
        this.state.ruleMemo = new HashMap[380+1];
         

    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return JavascriptParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g"; }


    public static class program_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "program"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:33:1: program : ( LT !)* sourceElements ( LT !)* EOF !;
    public final JavascriptParser.program_return program() throws RecognitionException {
        JavascriptParser.program_return retval = new JavascriptParser.program_return();
        retval.start = input.LT(1);

        int program_StartIndex = input.index();

        CommonTree root_0 = null;

        Token LT1=null;
        Token LT3=null;
        Token EOF4=null;
        JavascriptParser.sourceElements_return sourceElements2 =null;


        CommonTree LT1_tree=null;
        CommonTree LT3_tree=null;
        CommonTree EOF4_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:34:3: ( ( LT !)* sourceElements ( LT !)* EOF !)
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:34:5: ( LT !)* sourceElements ( LT !)* EOF !
            {
            root_0 = (CommonTree)adaptor.nil();


            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:34:7: ( LT !)*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==LT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:34:7: LT !
            	    {
            	    LT1=(Token)match(input,LT,FOLLOW_LT_in_program100); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            pushFollow(FOLLOW_sourceElements_in_program104);
            sourceElements2=sourceElements();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sourceElements2.getTree());

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:34:27: ( LT !)*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==LT) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:34:27: LT !
            	    {
            	    LT3=(Token)match(input,LT,FOLLOW_LT_in_program106); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            EOF4=(Token)match(input,EOF,FOLLOW_EOF_in_program110); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 1, program_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "program"


    public static class sourceElements_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "sourceElements"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:37:1: sourceElements : sourceElement ( ( LT !)* sourceElement )* ;
    public final JavascriptParser.sourceElements_return sourceElements() throws RecognitionException {
        JavascriptParser.sourceElements_return retval = new JavascriptParser.sourceElements_return();
        retval.start = input.LT(1);

        int sourceElements_StartIndex = input.index();

        CommonTree root_0 = null;

        Token LT6=null;
        JavascriptParser.sourceElement_return sourceElement5 =null;

        JavascriptParser.sourceElement_return sourceElement7 =null;


        CommonTree LT6_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:38:3: ( sourceElement ( ( LT !)* sourceElement )* )
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:38:5: sourceElement ( ( LT !)* sourceElement )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_sourceElement_in_sourceElements124);
            sourceElement5=sourceElement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sourceElement5.getTree());

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:38:19: ( ( LT !)* sourceElement )*
            loop4:
            do {
                int alt4=2;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:38:20: ( LT !)* sourceElement
            	    {
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:38:22: ( LT !)*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==LT) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:38:22: LT !
            	    	    {
            	    	    LT6=(Token)match(input,LT,FOLLOW_LT_in_sourceElements127); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop3;
            	        }
            	    } while (true);


            	    pushFollow(FOLLOW_sourceElement_in_sourceElements131);
            	    sourceElement7=sourceElement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, sourceElement7.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 2, sourceElements_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "sourceElements"


    public static class sourceElement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "sourceElement"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:41:1: sourceElement : ( functionDeclaration | statement );
    public final JavascriptParser.sourceElement_return sourceElement() throws RecognitionException {
        JavascriptParser.sourceElement_return retval = new JavascriptParser.sourceElement_return();
        retval.start = input.LT(1);

        int sourceElement_StartIndex = input.index();

        CommonTree root_0 = null;

        JavascriptParser.functionDeclaration_return functionDeclaration8 =null;

        JavascriptParser.statement_return statement9 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:42:3: ( functionDeclaration | statement )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==89) ) {
                int LA5_1 = input.LA(2);

                if ( (synpred5_Javascript()) ) {
                    alt5=1;
                }
                else if ( (true) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA5_0==Identifier||LA5_0==NumericLiteral||LA5_0==StringLiteral||LA5_0==36||LA5_0==44||(LA5_0 >= 48 && LA5_0 <= 49)||(LA5_0 >= 52 && LA5_0 <= 53)||LA5_0==59||LA5_0==74||LA5_0==78||LA5_0==81||(LA5_0 >= 83 && LA5_0 <= 84)||LA5_0==86||LA5_0==88||LA5_0==90||(LA5_0 >= 93 && LA5_0 <= 106)||LA5_0==111) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:42:5: functionDeclaration
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_functionDeclaration_in_sourceElement146);
                    functionDeclaration8=functionDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionDeclaration8.getTree());

                    }
                    break;
                case 2 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:43:5: statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_statement_in_sourceElement152);
                    statement9=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement9.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 3, sourceElement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "sourceElement"


    public static class functionDeclaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "functionDeclaration"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:47:1: functionDeclaration : 'function' ( LT )* Identifier ( LT )* formalParameterList ( LT )* functionBody -> ^( FUNC_DECL_DEF Identifier formalParameterList functionBody ) ;
    public final JavascriptParser.functionDeclaration_return functionDeclaration() throws RecognitionException {
        JavascriptParser.functionDeclaration_return retval = new JavascriptParser.functionDeclaration_return();
        retval.start = input.LT(1);

        int functionDeclaration_StartIndex = input.index();

        CommonTree root_0 = null;

        Token string_literal10=null;
        Token LT11=null;
        Token Identifier12=null;
        Token LT13=null;
        Token LT15=null;
        JavascriptParser.formalParameterList_return formalParameterList14 =null;

        JavascriptParser.functionBody_return functionBody16 =null;


        CommonTree string_literal10_tree=null;
        CommonTree LT11_tree=null;
        CommonTree Identifier12_tree=null;
        CommonTree LT13_tree=null;
        CommonTree LT15_tree=null;
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleSubtreeStream stream_functionBody=new RewriteRuleSubtreeStream(adaptor,"rule functionBody");
        RewriteRuleSubtreeStream stream_formalParameterList=new RewriteRuleSubtreeStream(adaptor,"rule formalParameterList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:48:3: ( 'function' ( LT )* Identifier ( LT )* formalParameterList ( LT )* functionBody -> ^( FUNC_DECL_DEF Identifier formalParameterList functionBody ) )
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:48:5: 'function' ( LT )* Identifier ( LT )* formalParameterList ( LT )* functionBody
            {
            string_literal10=(Token)match(input,89,FOLLOW_89_in_functionDeclaration166); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_89.add(string_literal10);


            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:48:16: ( LT )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==LT) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:48:16: LT
            	    {
            	    LT11=(Token)match(input,LT,FOLLOW_LT_in_functionDeclaration168); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LT.add(LT11);


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            Identifier12=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionDeclaration171); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(Identifier12);


            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:48:31: ( LT )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==LT) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:48:31: LT
            	    {
            	    LT13=(Token)match(input,LT,FOLLOW_LT_in_functionDeclaration173); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LT.add(LT13);


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            pushFollow(FOLLOW_formalParameterList_in_functionDeclaration176);
            formalParameterList14=formalParameterList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_formalParameterList.add(formalParameterList14.getTree());

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:48:55: ( LT )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==LT) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:48:55: LT
            	    {
            	    LT15=(Token)match(input,LT,FOLLOW_LT_in_functionDeclaration178); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LT.add(LT15);


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            pushFollow(FOLLOW_functionBody_in_functionDeclaration181);
            functionBody16=functionBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_functionBody.add(functionBody16.getTree());

            // AST REWRITE
            // elements: Identifier, functionBody, formalParameterList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 49:3: -> ^( FUNC_DECL_DEF Identifier formalParameterList functionBody )
            {
                // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:49:6: ^( FUNC_DECL_DEF Identifier formalParameterList functionBody )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(FUNC_DECL_DEF, "FUNC_DECL_DEF")
                , root_1);

                adaptor.addChild(root_1, 
                stream_Identifier.nextNode()
                );

                adaptor.addChild(root_1, stream_formalParameterList.nextTree());

                adaptor.addChild(root_1, stream_functionBody.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 4, functionDeclaration_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "functionDeclaration"


    public static class functionExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "functionExpression"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:52:1: functionExpression : 'function' ( LT )* ( Identifier )? ( LT )* formalParameterList ( LT )* functionBody -> ^( FUNC_EXPR_DEF ( Identifier )? formalParameterList functionBody ) ;
    public final JavascriptParser.functionExpression_return functionExpression() throws RecognitionException {
        JavascriptParser.functionExpression_return retval = new JavascriptParser.functionExpression_return();
        retval.start = input.LT(1);

        int functionExpression_StartIndex = input.index();

        CommonTree root_0 = null;

        Token string_literal17=null;
        Token LT18=null;
        Token Identifier19=null;
        Token LT20=null;
        Token LT22=null;
        JavascriptParser.formalParameterList_return formalParameterList21 =null;

        JavascriptParser.functionBody_return functionBody23 =null;


        CommonTree string_literal17_tree=null;
        CommonTree LT18_tree=null;
        CommonTree Identifier19_tree=null;
        CommonTree LT20_tree=null;
        CommonTree LT22_tree=null;
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleSubtreeStream stream_functionBody=new RewriteRuleSubtreeStream(adaptor,"rule functionBody");
        RewriteRuleSubtreeStream stream_formalParameterList=new RewriteRuleSubtreeStream(adaptor,"rule formalParameterList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:53:3: ( 'function' ( LT )* ( Identifier )? ( LT )* formalParameterList ( LT )* functionBody -> ^( FUNC_EXPR_DEF ( Identifier )? formalParameterList functionBody ) )
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:53:5: 'function' ( LT )* ( Identifier )? ( LT )* formalParameterList ( LT )* functionBody
            {
            string_literal17=(Token)match(input,89,FOLLOW_89_in_functionExpression208); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_89.add(string_literal17);


            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:53:16: ( LT )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==LT) ) {
                    int LA9_2 = input.LA(2);

                    if ( (synpred9_Javascript()) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:53:16: LT
            	    {
            	    LT18=(Token)match(input,LT,FOLLOW_LT_in_functionExpression210); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LT.add(LT18);


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:53:20: ( Identifier )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==Identifier) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:53:20: Identifier
                    {
                    Identifier19=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionExpression213); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Identifier.add(Identifier19);


                    }
                    break;

            }


            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:53:32: ( LT )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==LT) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:53:32: LT
            	    {
            	    LT20=(Token)match(input,LT,FOLLOW_LT_in_functionExpression216); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LT.add(LT20);


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            pushFollow(FOLLOW_formalParameterList_in_functionExpression219);
            formalParameterList21=formalParameterList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_formalParameterList.add(formalParameterList21.getTree());

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:53:56: ( LT )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==LT) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:53:56: LT
            	    {
            	    LT22=(Token)match(input,LT,FOLLOW_LT_in_functionExpression221); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LT.add(LT22);


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            pushFollow(FOLLOW_functionBody_in_functionExpression224);
            functionBody23=functionBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_functionBody.add(functionBody23.getTree());

            // AST REWRITE
            // elements: functionBody, Identifier, formalParameterList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 54:3: -> ^( FUNC_EXPR_DEF ( Identifier )? formalParameterList functionBody )
            {
                // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:54:6: ^( FUNC_EXPR_DEF ( Identifier )? formalParameterList functionBody )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(FUNC_EXPR_DEF, "FUNC_EXPR_DEF")
                , root_1);

                // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:54:22: ( Identifier )?
                if ( stream_Identifier.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_Identifier.nextNode()
                    );

                }
                stream_Identifier.reset();

                adaptor.addChild(root_1, stream_formalParameterList.nextTree());

                adaptor.addChild(root_1, stream_functionBody.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 5, functionExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "functionExpression"


    public static class formalParameterList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "formalParameterList"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:57:1: formalParameterList : '(' ^ ( ( LT !)* Identifier ( ( LT !)* ',' ( LT !)* Identifier )* )? ( LT !)* ')' ;
    public final JavascriptParser.formalParameterList_return formalParameterList() throws RecognitionException {
        JavascriptParser.formalParameterList_return retval = new JavascriptParser.formalParameterList_return();
        retval.start = input.LT(1);

        int formalParameterList_StartIndex = input.index();

        CommonTree root_0 = null;

        Token char_literal24=null;
        Token LT25=null;
        Token Identifier26=null;
        Token LT27=null;
        Token char_literal28=null;
        Token LT29=null;
        Token Identifier30=null;
        Token LT31=null;
        Token char_literal32=null;

        CommonTree char_literal24_tree=null;
        CommonTree LT25_tree=null;
        CommonTree Identifier26_tree=null;
        CommonTree LT27_tree=null;
        CommonTree char_literal28_tree=null;
        CommonTree LT29_tree=null;
        CommonTree Identifier30_tree=null;
        CommonTree LT31_tree=null;
        CommonTree char_literal32_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:58:3: ( '(' ^ ( ( LT !)* Identifier ( ( LT !)* ',' ( LT !)* Identifier )* )? ( LT !)* ')' )
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:58:5: '(' ^ ( ( LT !)* Identifier ( ( LT !)* ',' ( LT !)* Identifier )* )? ( LT !)* ')'
            {
            root_0 = (CommonTree)adaptor.nil();


            char_literal24=(Token)match(input,44,FOLLOW_44_in_formalParameterList252); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal24_tree = 
            (CommonTree)adaptor.create(char_literal24)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(char_literal24_tree, root_0);
            }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:58:10: ( ( LT !)* Identifier ( ( LT !)* ',' ( LT !)* Identifier )* )?
            int alt17=2;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:58:11: ( LT !)* Identifier ( ( LT !)* ',' ( LT !)* Identifier )*
                    {
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:58:13: ( LT !)*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==LT) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:58:13: LT !
                    	    {
                    	    LT25=(Token)match(input,LT,FOLLOW_LT_in_formalParameterList256); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    Identifier26=(Token)match(input,Identifier,FOLLOW_Identifier_in_formalParameterList260); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Identifier26_tree = 
                    (CommonTree)adaptor.create(Identifier26)
                    ;
                    adaptor.addChild(root_0, Identifier26_tree);
                    }

                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:58:27: ( ( LT !)* ',' ( LT !)* Identifier )*
                    loop16:
                    do {
                        int alt16=2;
                        alt16 = dfa16.predict(input);
                        switch (alt16) {
                    	case 1 :
                    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:58:28: ( LT !)* ',' ( LT !)* Identifier
                    	    {
                    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:58:30: ( LT !)*
                    	    loop14:
                    	    do {
                    	        int alt14=2;
                    	        int LA14_0 = input.LA(1);

                    	        if ( (LA14_0==LT) ) {
                    	            alt14=1;
                    	        }


                    	        switch (alt14) {
                    	    	case 1 :
                    	    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:58:30: LT !
                    	    	    {
                    	    	    LT27=(Token)match(input,LT,FOLLOW_LT_in_formalParameterList263); if (state.failed) return retval;

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop14;
                    	        }
                    	    } while (true);


                    	    char_literal28=(Token)match(input,51,FOLLOW_51_in_formalParameterList267); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal28_tree = 
                    	    (CommonTree)adaptor.create(char_literal28)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal28_tree);
                    	    }

                    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:58:39: ( LT !)*
                    	    loop15:
                    	    do {
                    	        int alt15=2;
                    	        int LA15_0 = input.LA(1);

                    	        if ( (LA15_0==LT) ) {
                    	            alt15=1;
                    	        }


                    	        switch (alt15) {
                    	    	case 1 :
                    	    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:58:39: LT !
                    	    	    {
                    	    	    LT29=(Token)match(input,LT,FOLLOW_LT_in_formalParameterList269); if (state.failed) return retval;

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop15;
                    	        }
                    	    } while (true);


                    	    Identifier30=(Token)match(input,Identifier,FOLLOW_Identifier_in_formalParameterList273); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    Identifier30_tree = 
                    	    (CommonTree)adaptor.create(Identifier30)
                    	    ;
                    	    adaptor.addChild(root_0, Identifier30_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }


            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:58:59: ( LT !)*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==LT) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:58:59: LT !
            	    {
            	    LT31=(Token)match(input,LT,FOLLOW_LT_in_formalParameterList279); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            char_literal32=(Token)match(input,45,FOLLOW_45_in_formalParameterList283); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal32_tree = 
            (CommonTree)adaptor.create(char_literal32)
            ;
            adaptor.addChild(root_0, char_literal32_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 6, formalParameterList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "formalParameterList"


    public static class functionBody_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "functionBody"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:61:1: functionBody : '{' ^ ( LT !)* sourceElements ( LT !)* '}' ;
    public final JavascriptParser.functionBody_return functionBody() throws RecognitionException {
        JavascriptParser.functionBody_return retval = new JavascriptParser.functionBody_return();
        retval.start = input.LT(1);

        int functionBody_StartIndex = input.index();

        CommonTree root_0 = null;

        Token char_literal33=null;
        Token LT34=null;
        Token LT36=null;
        Token char_literal37=null;
        JavascriptParser.sourceElements_return sourceElements35 =null;


        CommonTree char_literal33_tree=null;
        CommonTree LT34_tree=null;
        CommonTree LT36_tree=null;
        CommonTree char_literal37_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:62:3: ( '{' ^ ( LT !)* sourceElements ( LT !)* '}' )
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:62:5: '{' ^ ( LT !)* sourceElements ( LT !)* '}'
            {
            root_0 = (CommonTree)adaptor.nil();


            char_literal33=(Token)match(input,106,FOLLOW_106_in_functionBody296); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal33_tree = 
            (CommonTree)adaptor.create(char_literal33)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(char_literal33_tree, root_0);
            }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:62:12: ( LT !)*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==LT) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:62:12: LT !
            	    {
            	    LT34=(Token)match(input,LT,FOLLOW_LT_in_functionBody299); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            pushFollow(FOLLOW_sourceElements_in_functionBody303);
            sourceElements35=sourceElements();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sourceElements35.getTree());

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:62:32: ( LT !)*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==LT) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:62:32: LT !
            	    {
            	    LT36=(Token)match(input,LT,FOLLOW_LT_in_functionBody305); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            char_literal37=(Token)match(input,110,FOLLOW_110_in_functionBody309); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal37_tree = 
            (CommonTree)adaptor.create(char_literal37)
            ;
            adaptor.addChild(root_0, char_literal37_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 7, functionBody_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "functionBody"


    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:66:1: statement : ( statementBlock | variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement );
    public final JavascriptParser.statement_return statement() throws RecognitionException {
        JavascriptParser.statement_return retval = new JavascriptParser.statement_return();
        retval.start = input.LT(1);

        int statement_StartIndex = input.index();

        CommonTree root_0 = null;

        JavascriptParser.statementBlock_return statementBlock38 =null;

        JavascriptParser.variableStatement_return variableStatement39 =null;

        JavascriptParser.emptyStatement_return emptyStatement40 =null;

        JavascriptParser.expressionStatement_return expressionStatement41 =null;

        JavascriptParser.ifStatement_return ifStatement42 =null;

        JavascriptParser.iterationStatement_return iterationStatement43 =null;

        JavascriptParser.continueStatement_return continueStatement44 =null;

        JavascriptParser.breakStatement_return breakStatement45 =null;

        JavascriptParser.returnStatement_return returnStatement46 =null;

        JavascriptParser.withStatement_return withStatement47 =null;

        JavascriptParser.labelledStatement_return labelledStatement48 =null;

        JavascriptParser.switchStatement_return switchStatement49 =null;

        JavascriptParser.throwStatement_return throwStatement50 =null;

        JavascriptParser.tryStatement_return tryStatement51 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:67:3: ( statementBlock | variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement )
            int alt21=14;
            switch ( input.LA(1) ) {
            case 106:
                {
                int LA21_1 = input.LA(2);

                if ( (synpred21_Javascript()) ) {
                    alt21=1;
                }
                else if ( (synpred24_Javascript()) ) {
                    alt21=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;

                }
                }
                break;
            case 102:
                {
                alt21=2;
                }
                break;
            case 59:
                {
                alt21=3;
                }
                break;
            case NumericLiteral:
            case StringLiteral:
            case 36:
            case 44:
            case 48:
            case 49:
            case 52:
            case 53:
            case 74:
            case 83:
            case 86:
            case 89:
            case 93:
            case 94:
            case 97:
            case 99:
            case 101:
            case 103:
            case 111:
                {
                alt21=4;
                }
                break;
            case Identifier:
                {
                int LA21_5 = input.LA(2);

                if ( (synpred24_Javascript()) ) {
                    alt21=4;
                }
                else if ( (synpred31_Javascript()) ) {
                    alt21=11;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 5, input);

                    throw nvae;

                }
                }
                break;
            case 90:
                {
                alt21=5;
                }
                break;
            case 84:
            case 88:
            case 104:
                {
                alt21=6;
                }
                break;
            case 81:
                {
                alt21=7;
                }
                break;
            case 78:
                {
                alt21=8;
                }
                break;
            case 95:
                {
                alt21=9;
                }
                break;
            case 105:
                {
                alt21=10;
                }
                break;
            case 96:
                {
                alt21=12;
                }
                break;
            case 98:
                {
                alt21=13;
                }
                break;
            case 100:
                {
                alt21=14;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }

            switch (alt21) {
                case 1 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:67:5: statementBlock
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_statementBlock_in_statement323);
                    statementBlock38=statementBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementBlock38.getTree());

                    }
                    break;
                case 2 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:68:5: variableStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_variableStatement_in_statement329);
                    variableStatement39=variableStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableStatement39.getTree());

                    }
                    break;
                case 3 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:69:5: emptyStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_emptyStatement_in_statement335);
                    emptyStatement40=emptyStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, emptyStatement40.getTree());

                    }
                    break;
                case 4 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:70:5: expressionStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_expressionStatement_in_statement341);
                    expressionStatement41=expressionStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionStatement41.getTree());

                    }
                    break;
                case 5 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:71:5: ifStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_ifStatement_in_statement347);
                    ifStatement42=ifStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifStatement42.getTree());

                    }
                    break;
                case 6 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:72:5: iterationStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_iterationStatement_in_statement353);
                    iterationStatement43=iterationStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, iterationStatement43.getTree());

                    }
                    break;
                case 7 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:73:5: continueStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_continueStatement_in_statement359);
                    continueStatement44=continueStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, continueStatement44.getTree());

                    }
                    break;
                case 8 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:74:5: breakStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_breakStatement_in_statement365);
                    breakStatement45=breakStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, breakStatement45.getTree());

                    }
                    break;
                case 9 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:75:5: returnStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_returnStatement_in_statement371);
                    returnStatement46=returnStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, returnStatement46.getTree());

                    }
                    break;
                case 10 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:76:5: withStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_withStatement_in_statement377);
                    withStatement47=withStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, withStatement47.getTree());

                    }
                    break;
                case 11 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:77:5: labelledStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_labelledStatement_in_statement383);
                    labelledStatement48=labelledStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, labelledStatement48.getTree());

                    }
                    break;
                case 12 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:78:5: switchStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_switchStatement_in_statement389);
                    switchStatement49=switchStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, switchStatement49.getTree());

                    }
                    break;
                case 13 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:79:5: throwStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_throwStatement_in_statement395);
                    throwStatement50=throwStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, throwStatement50.getTree());

                    }
                    break;
                case 14 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:80:5: tryStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_tryStatement_in_statement401);
                    tryStatement51=tryStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, tryStatement51.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 8, statement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "statement"


    public static class statementBlock_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statementBlock"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:83:1: statementBlock : '{' ( LT !)* ( statementList )? ( LT !)* '}' ;
    public final JavascriptParser.statementBlock_return statementBlock() throws RecognitionException {
        JavascriptParser.statementBlock_return retval = new JavascriptParser.statementBlock_return();
        retval.start = input.LT(1);

        int statementBlock_StartIndex = input.index();

        CommonTree root_0 = null;

        Token char_literal52=null;
        Token LT53=null;
        Token LT55=null;
        Token char_literal56=null;
        JavascriptParser.statementList_return statementList54 =null;


        CommonTree char_literal52_tree=null;
        CommonTree LT53_tree=null;
        CommonTree LT55_tree=null;
        CommonTree char_literal56_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:84:3: ( '{' ( LT !)* ( statementList )? ( LT !)* '}' )
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:84:5: '{' ( LT !)* ( statementList )? ( LT !)* '}'
            {
            root_0 = (CommonTree)adaptor.nil();


            char_literal52=(Token)match(input,106,FOLLOW_106_in_statementBlock414); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal52_tree = 
            (CommonTree)adaptor.create(char_literal52)
            ;
            adaptor.addChild(root_0, char_literal52_tree);
            }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:84:11: ( LT !)*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==LT) ) {
                    int LA22_2 = input.LA(2);

                    if ( (synpred34_Javascript()) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:84:11: LT !
            	    {
            	    LT53=(Token)match(input,LT,FOLLOW_LT_in_statementBlock416); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:84:14: ( statementList )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==Identifier||LA23_0==NumericLiteral||LA23_0==StringLiteral||LA23_0==36||LA23_0==44||(LA23_0 >= 48 && LA23_0 <= 49)||(LA23_0 >= 52 && LA23_0 <= 53)||LA23_0==59||LA23_0==74||LA23_0==78||LA23_0==81||(LA23_0 >= 83 && LA23_0 <= 84)||LA23_0==86||(LA23_0 >= 88 && LA23_0 <= 90)||(LA23_0 >= 93 && LA23_0 <= 106)||LA23_0==111) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:84:14: statementList
                    {
                    pushFollow(FOLLOW_statementList_in_statementBlock420);
                    statementList54=statementList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList54.getTree());

                    }
                    break;

            }


            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:84:31: ( LT !)*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==LT) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:84:31: LT !
            	    {
            	    LT55=(Token)match(input,LT,FOLLOW_LT_in_statementBlock423); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            char_literal56=(Token)match(input,110,FOLLOW_110_in_statementBlock427); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal56_tree = 
            (CommonTree)adaptor.create(char_literal56)
            ;
            adaptor.addChild(root_0, char_literal56_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 9, statementBlock_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "statementBlock"


    public static class statementList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statementList"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:87:1: statementList : statement ( ( LT !)* statement )* ;
    public final JavascriptParser.statementList_return statementList() throws RecognitionException {
        JavascriptParser.statementList_return retval = new JavascriptParser.statementList_return();
        retval.start = input.LT(1);

        int statementList_StartIndex = input.index();

        CommonTree root_0 = null;

        Token LT58=null;
        JavascriptParser.statement_return statement57 =null;

        JavascriptParser.statement_return statement59 =null;


        CommonTree LT58_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:88:3: ( statement ( ( LT !)* statement )* )
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:88:5: statement ( ( LT !)* statement )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_statement_in_statementList440);
            statement57=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement57.getTree());

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:88:15: ( ( LT !)* statement )*
            loop26:
            do {
                int alt26=2;
                alt26 = dfa26.predict(input);
                switch (alt26) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:88:16: ( LT !)* statement
            	    {
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:88:18: ( LT !)*
            	    loop25:
            	    do {
            	        int alt25=2;
            	        int LA25_0 = input.LA(1);

            	        if ( (LA25_0==LT) ) {
            	            alt25=1;
            	        }


            	        switch (alt25) {
            	    	case 1 :
            	    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:88:18: LT !
            	    	    {
            	    	    LT58=(Token)match(input,LT,FOLLOW_LT_in_statementList443); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop25;
            	        }
            	    } while (true);


            	    pushFollow(FOLLOW_statement_in_statementList447);
            	    statement59=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement59.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 10, statementList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "statementList"


    public static class variableStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "variableStatement"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:91:1: variableStatement : 'var' ( LT !)* variableDeclarationList ( LT | ';' ) !;
    public final JavascriptParser.variableStatement_return variableStatement() throws RecognitionException {
        JavascriptParser.variableStatement_return retval = new JavascriptParser.variableStatement_return();
        retval.start = input.LT(1);

        int variableStatement_StartIndex = input.index();

        CommonTree root_0 = null;

        Token string_literal60=null;
        Token LT61=null;
        Token set63=null;
        JavascriptParser.variableDeclarationList_return variableDeclarationList62 =null;


        CommonTree string_literal60_tree=null;
        CommonTree LT61_tree=null;
        CommonTree set63_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:92:3: ( 'var' ( LT !)* variableDeclarationList ( LT | ';' ) !)
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:92:5: 'var' ( LT !)* variableDeclarationList ( LT | ';' ) !
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal60=(Token)match(input,102,FOLLOW_102_in_variableStatement462); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal60_tree = 
            (CommonTree)adaptor.create(string_literal60)
            ;
            adaptor.addChild(root_0, string_literal60_tree);
            }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:92:13: ( LT !)*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==LT) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:92:13: LT !
            	    {
            	    LT61=(Token)match(input,LT,FOLLOW_LT_in_variableStatement464); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            pushFollow(FOLLOW_variableDeclarationList_in_variableStatement468);
            variableDeclarationList62=variableDeclarationList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclarationList62.getTree());

            set63=(Token)input.LT(1);

            if ( input.LA(1)==LT||input.LA(1)==59 ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 11, variableStatement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "variableStatement"


    public static class variableDeclarationList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "variableDeclarationList"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:95:1: variableDeclarationList : variableDeclaration ( ( LT !)* ',' ( LT !)* variableDeclaration )* ;
    public final JavascriptParser.variableDeclarationList_return variableDeclarationList() throws RecognitionException {
        JavascriptParser.variableDeclarationList_return retval = new JavascriptParser.variableDeclarationList_return();
        retval.start = input.LT(1);

        int variableDeclarationList_StartIndex = input.index();

        CommonTree root_0 = null;

        Token LT65=null;
        Token char_literal66=null;
        Token LT67=null;
        JavascriptParser.variableDeclaration_return variableDeclaration64 =null;

        JavascriptParser.variableDeclaration_return variableDeclaration68 =null;


        CommonTree LT65_tree=null;
        CommonTree char_literal66_tree=null;
        CommonTree LT67_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:96:3: ( variableDeclaration ( ( LT !)* ',' ( LT !)* variableDeclaration )* )
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:96:5: variableDeclaration ( ( LT !)* ',' ( LT !)* variableDeclaration )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationList490);
            variableDeclaration64=variableDeclaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration64.getTree());

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:96:25: ( ( LT !)* ',' ( LT !)* variableDeclaration )*
            loop30:
            do {
                int alt30=2;
                alt30 = dfa30.predict(input);
                switch (alt30) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:96:26: ( LT !)* ',' ( LT !)* variableDeclaration
            	    {
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:96:28: ( LT !)*
            	    loop28:
            	    do {
            	        int alt28=2;
            	        int LA28_0 = input.LA(1);

            	        if ( (LA28_0==LT) ) {
            	            alt28=1;
            	        }


            	        switch (alt28) {
            	    	case 1 :
            	    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:96:28: LT !
            	    	    {
            	    	    LT65=(Token)match(input,LT,FOLLOW_LT_in_variableDeclarationList493); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop28;
            	        }
            	    } while (true);


            	    char_literal66=(Token)match(input,51,FOLLOW_51_in_variableDeclarationList497); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal66_tree = 
            	    (CommonTree)adaptor.create(char_literal66)
            	    ;
            	    adaptor.addChild(root_0, char_literal66_tree);
            	    }

            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:96:37: ( LT !)*
            	    loop29:
            	    do {
            	        int alt29=2;
            	        int LA29_0 = input.LA(1);

            	        if ( (LA29_0==LT) ) {
            	            alt29=1;
            	        }


            	        switch (alt29) {
            	    	case 1 :
            	    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:96:37: LT !
            	    	    {
            	    	    LT67=(Token)match(input,LT,FOLLOW_LT_in_variableDeclarationList499); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop29;
            	        }
            	    } while (true);


            	    pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationList503);
            	    variableDeclaration68=variableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration68.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 12, variableDeclarationList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "variableDeclarationList"


    public static class variableDeclarationListNoIn_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "variableDeclarationListNoIn"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:99:1: variableDeclarationListNoIn : variableDeclarationNoIn ( ( LT !)* ',' ( LT !)* variableDeclarationNoIn )* ;
    public final JavascriptParser.variableDeclarationListNoIn_return variableDeclarationListNoIn() throws RecognitionException {
        JavascriptParser.variableDeclarationListNoIn_return retval = new JavascriptParser.variableDeclarationListNoIn_return();
        retval.start = input.LT(1);

        int variableDeclarationListNoIn_StartIndex = input.index();

        CommonTree root_0 = null;

        Token LT70=null;
        Token char_literal71=null;
        Token LT72=null;
        JavascriptParser.variableDeclarationNoIn_return variableDeclarationNoIn69 =null;

        JavascriptParser.variableDeclarationNoIn_return variableDeclarationNoIn73 =null;


        CommonTree LT70_tree=null;
        CommonTree char_literal71_tree=null;
        CommonTree LT72_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:100:3: ( variableDeclarationNoIn ( ( LT !)* ',' ( LT !)* variableDeclarationNoIn )* )
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:100:5: variableDeclarationNoIn ( ( LT !)* ',' ( LT !)* variableDeclarationNoIn )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_variableDeclarationNoIn_in_variableDeclarationListNoIn518);
            variableDeclarationNoIn69=variableDeclarationNoIn();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclarationNoIn69.getTree());

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:100:29: ( ( LT !)* ',' ( LT !)* variableDeclarationNoIn )*
            loop33:
            do {
                int alt33=2;
                alt33 = dfa33.predict(input);
                switch (alt33) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:100:30: ( LT !)* ',' ( LT !)* variableDeclarationNoIn
            	    {
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:100:32: ( LT !)*
            	    loop31:
            	    do {
            	        int alt31=2;
            	        int LA31_0 = input.LA(1);

            	        if ( (LA31_0==LT) ) {
            	            alt31=1;
            	        }


            	        switch (alt31) {
            	    	case 1 :
            	    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:100:32: LT !
            	    	    {
            	    	    LT70=(Token)match(input,LT,FOLLOW_LT_in_variableDeclarationListNoIn521); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop31;
            	        }
            	    } while (true);


            	    char_literal71=(Token)match(input,51,FOLLOW_51_in_variableDeclarationListNoIn525); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal71_tree = 
            	    (CommonTree)adaptor.create(char_literal71)
            	    ;
            	    adaptor.addChild(root_0, char_literal71_tree);
            	    }

            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:100:41: ( LT !)*
            	    loop32:
            	    do {
            	        int alt32=2;
            	        int LA32_0 = input.LA(1);

            	        if ( (LA32_0==LT) ) {
            	            alt32=1;
            	        }


            	        switch (alt32) {
            	    	case 1 :
            	    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:100:41: LT !
            	    	    {
            	    	    LT72=(Token)match(input,LT,FOLLOW_LT_in_variableDeclarationListNoIn527); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop32;
            	        }
            	    } while (true);


            	    pushFollow(FOLLOW_variableDeclarationNoIn_in_variableDeclarationListNoIn531);
            	    variableDeclarationNoIn73=variableDeclarationNoIn();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclarationNoIn73.getTree());

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 13, variableDeclarationListNoIn_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "variableDeclarationListNoIn"


    public static class variableDeclaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "variableDeclaration"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:103:1: variableDeclaration : Identifier ( LT )* ( initializer )? -> ^( VAR_DECL_DEF Identifier ( initializer )+ ) ;
    public final JavascriptParser.variableDeclaration_return variableDeclaration() throws RecognitionException {
        JavascriptParser.variableDeclaration_return retval = new JavascriptParser.variableDeclaration_return();
        retval.start = input.LT(1);

        int variableDeclaration_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Identifier74=null;
        Token LT75=null;
        JavascriptParser.initializer_return initializer76 =null;


        CommonTree Identifier74_tree=null;
        CommonTree LT75_tree=null;
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_initializer=new RewriteRuleSubtreeStream(adaptor,"rule initializer");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:104:3: ( Identifier ( LT )* ( initializer )? -> ^( VAR_DECL_DEF Identifier ( initializer )+ ) )
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:104:5: Identifier ( LT )* ( initializer )?
            {
            Identifier74=(Token)match(input,Identifier,FOLLOW_Identifier_in_variableDeclaration546); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(Identifier74);


            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:104:16: ( LT )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==LT) ) {
                    int LA34_2 = input.LA(2);

                    if ( (synpred47_Javascript()) ) {
                        alt34=1;
                    }


                }


                switch (alt34) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:104:16: LT
            	    {
            	    LT75=(Token)match(input,LT,FOLLOW_LT_in_variableDeclaration548); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LT.add(LT75);


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:104:20: ( initializer )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==64) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:104:20: initializer
                    {
                    pushFollow(FOLLOW_initializer_in_variableDeclaration551);
                    initializer76=initializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_initializer.add(initializer76.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: Identifier, initializer
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 104:33: -> ^( VAR_DECL_DEF Identifier ( initializer )+ )
            {
                // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:104:36: ^( VAR_DECL_DEF Identifier ( initializer )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(VAR_DECL_DEF, "VAR_DECL_DEF")
                , root_1);

                adaptor.addChild(root_1, 
                stream_Identifier.nextNode()
                );

                if ( !(stream_initializer.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_initializer.hasNext() ) {
                    adaptor.addChild(root_1, stream_initializer.nextTree());

                }
                stream_initializer.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 14, variableDeclaration_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "variableDeclaration"


    public static class variableDeclarationNoIn_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "variableDeclarationNoIn"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:107:1: variableDeclarationNoIn : Identifier ^ ( LT !)* ( initialiserNoIn )? ;
    public final JavascriptParser.variableDeclarationNoIn_return variableDeclarationNoIn() throws RecognitionException {
        JavascriptParser.variableDeclarationNoIn_return retval = new JavascriptParser.variableDeclarationNoIn_return();
        retval.start = input.LT(1);

        int variableDeclarationNoIn_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Identifier77=null;
        Token LT78=null;
        JavascriptParser.initialiserNoIn_return initialiserNoIn79 =null;


        CommonTree Identifier77_tree=null;
        CommonTree LT78_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:108:3: ( Identifier ^ ( LT !)* ( initialiserNoIn )? )
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:108:5: Identifier ^ ( LT !)* ( initialiserNoIn )?
            {
            root_0 = (CommonTree)adaptor.nil();


            Identifier77=(Token)match(input,Identifier,FOLLOW_Identifier_in_variableDeclarationNoIn576); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier77_tree = 
            (CommonTree)adaptor.create(Identifier77)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(Identifier77_tree, root_0);
            }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:108:19: ( LT !)*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==LT) ) {
                    int LA36_2 = input.LA(2);

                    if ( (synpred49_Javascript()) ) {
                        alt36=1;
                    }


                }


                switch (alt36) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:108:19: LT !
            	    {
            	    LT78=(Token)match(input,LT,FOLLOW_LT_in_variableDeclarationNoIn579); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:108:22: ( initialiserNoIn )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==64) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:108:22: initialiserNoIn
                    {
                    pushFollow(FOLLOW_initialiserNoIn_in_variableDeclarationNoIn583);
                    initialiserNoIn79=initialiserNoIn();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, initialiserNoIn79.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 15, variableDeclarationNoIn_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "variableDeclarationNoIn"


    public static class initializer_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "initializer"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:111:1: initializer : '=' ( LT !)* assignmentExpression ;
    public final JavascriptParser.initializer_return initializer() throws RecognitionException {
        JavascriptParser.initializer_return retval = new JavascriptParser.initializer_return();
        retval.start = input.LT(1);

        int initializer_StartIndex = input.index();

        CommonTree root_0 = null;

        Token char_literal80=null;
        Token LT81=null;
        JavascriptParser.assignmentExpression_return assignmentExpression82 =null;


        CommonTree char_literal80_tree=null;
        CommonTree LT81_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:112:3: ( '=' ( LT !)* assignmentExpression )
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:112:5: '=' ( LT !)* assignmentExpression
            {
            root_0 = (CommonTree)adaptor.nil();


            char_literal80=(Token)match(input,64,FOLLOW_64_in_initializer597); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal80_tree = 
            (CommonTree)adaptor.create(char_literal80)
            ;
            adaptor.addChild(root_0, char_literal80_tree);
            }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:112:11: ( LT !)*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==LT) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:112:11: LT !
            	    {
            	    LT81=(Token)match(input,LT,FOLLOW_LT_in_initializer599); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            pushFollow(FOLLOW_assignmentExpression_in_initializer603);
            assignmentExpression82=assignmentExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpression82.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 16, initializer_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "initializer"


    public static class initialiserNoIn_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "initialiserNoIn"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:115:1: initialiserNoIn : '=' ( LT !)* assignmentExpressionNoIn ;
    public final JavascriptParser.initialiserNoIn_return initialiserNoIn() throws RecognitionException {
        JavascriptParser.initialiserNoIn_return retval = new JavascriptParser.initialiserNoIn_return();
        retval.start = input.LT(1);

        int initialiserNoIn_StartIndex = input.index();

        CommonTree root_0 = null;

        Token char_literal83=null;
        Token LT84=null;
        JavascriptParser.assignmentExpressionNoIn_return assignmentExpressionNoIn85 =null;


        CommonTree char_literal83_tree=null;
        CommonTree LT84_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:116:3: ( '=' ( LT !)* assignmentExpressionNoIn )
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:116:5: '=' ( LT !)* assignmentExpressionNoIn
            {
            root_0 = (CommonTree)adaptor.nil();


            char_literal83=(Token)match(input,64,FOLLOW_64_in_initialiserNoIn616); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal83_tree = 
            (CommonTree)adaptor.create(char_literal83)
            ;
            adaptor.addChild(root_0, char_literal83_tree);
            }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:116:11: ( LT !)*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==LT) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:116:11: LT !
            	    {
            	    LT84=(Token)match(input,LT,FOLLOW_LT_in_initialiserNoIn618); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            pushFollow(FOLLOW_assignmentExpressionNoIn_in_initialiserNoIn622);
            assignmentExpressionNoIn85=assignmentExpressionNoIn();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpressionNoIn85.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 17, initialiserNoIn_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "initialiserNoIn"


    public static class emptyStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "emptyStatement"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:119:1: emptyStatement : ';' ;
    public final JavascriptParser.emptyStatement_return emptyStatement() throws RecognitionException {
        JavascriptParser.emptyStatement_return retval = new JavascriptParser.emptyStatement_return();
        retval.start = input.LT(1);

        int emptyStatement_StartIndex = input.index();

        CommonTree root_0 = null;

        Token char_literal86=null;

        CommonTree char_literal86_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:120:3: ( ';' )
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:120:5: ';'
            {
            root_0 = (CommonTree)adaptor.nil();


            char_literal86=(Token)match(input,59,FOLLOW_59_in_emptyStatement635); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal86_tree = 
            (CommonTree)adaptor.create(char_literal86)
            ;
            adaptor.addChild(root_0, char_literal86_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 18, emptyStatement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "emptyStatement"


    public static class expressionStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expressionStatement"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:123:1: expressionStatement : expression ( LT | ';' ) !;
    public final JavascriptParser.expressionStatement_return expressionStatement() throws RecognitionException {
        JavascriptParser.expressionStatement_return retval = new JavascriptParser.expressionStatement_return();
        retval.start = input.LT(1);

        int expressionStatement_StartIndex = input.index();

        CommonTree root_0 = null;

        Token set88=null;
        JavascriptParser.expression_return expression87 =null;


        CommonTree set88_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:124:3: ( expression ( LT | ';' ) !)
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:124:5: expression ( LT | ';' ) !
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_expression_in_expressionStatement648);
            expression87=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression87.getTree());

            set88=(Token)input.LT(1);

            if ( input.LA(1)==LT||input.LA(1)==59 ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 19, expressionStatement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "expressionStatement"


    public static class ifStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ifStatement"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:127:1: ifStatement : 'if' ^ ( LT !)* '(' ( LT !)* expression ( LT !)* ')' ( LT !)* statement ( ( LT !)* 'else' ( LT !)* statement )? ;
    public final JavascriptParser.ifStatement_return ifStatement() throws RecognitionException {
        JavascriptParser.ifStatement_return retval = new JavascriptParser.ifStatement_return();
        retval.start = input.LT(1);

        int ifStatement_StartIndex = input.index();

        CommonTree root_0 = null;

        Token string_literal89=null;
        Token LT90=null;
        Token char_literal91=null;
        Token LT92=null;
        Token LT94=null;
        Token char_literal95=null;
        Token LT96=null;
        Token LT98=null;
        Token string_literal99=null;
        Token LT100=null;
        JavascriptParser.expression_return expression93 =null;

        JavascriptParser.statement_return statement97 =null;

        JavascriptParser.statement_return statement101 =null;


        CommonTree string_literal89_tree=null;
        CommonTree LT90_tree=null;
        CommonTree char_literal91_tree=null;
        CommonTree LT92_tree=null;
        CommonTree LT94_tree=null;
        CommonTree char_literal95_tree=null;
        CommonTree LT96_tree=null;
        CommonTree LT98_tree=null;
        CommonTree string_literal99_tree=null;
        CommonTree LT100_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:128:3: ( 'if' ^ ( LT !)* '(' ( LT !)* expression ( LT !)* ')' ( LT !)* statement ( ( LT !)* 'else' ( LT !)* statement )? )
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:128:5: 'if' ^ ( LT !)* '(' ( LT !)* expression ( LT !)* ')' ( LT !)* statement ( ( LT !)* 'else' ( LT !)* statement )?
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal89=(Token)match(input,90,FOLLOW_90_in_ifStatement670); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal89_tree = 
            (CommonTree)adaptor.create(string_literal89)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(string_literal89_tree, root_0);
            }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:128:13: ( LT !)*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==LT) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:128:13: LT !
            	    {
            	    LT90=(Token)match(input,LT,FOLLOW_LT_in_ifStatement673); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            char_literal91=(Token)match(input,44,FOLLOW_44_in_ifStatement677); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal91_tree = 
            (CommonTree)adaptor.create(char_literal91)
            ;
            adaptor.addChild(root_0, char_literal91_tree);
            }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:128:22: ( LT !)*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==LT) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:128:22: LT !
            	    {
            	    LT92=(Token)match(input,LT,FOLLOW_LT_in_ifStatement679); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            pushFollow(FOLLOW_expression_in_ifStatement683);
            expression93=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression93.getTree());

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:128:38: ( LT !)*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==LT) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:128:38: LT !
            	    {
            	    LT94=(Token)match(input,LT,FOLLOW_LT_in_ifStatement685); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            char_literal95=(Token)match(input,45,FOLLOW_45_in_ifStatement689); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal95_tree = 
            (CommonTree)adaptor.create(char_literal95)
            ;
            adaptor.addChild(root_0, char_literal95_tree);
            }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:128:47: ( LT !)*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==LT) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:128:47: LT !
            	    {
            	    LT96=(Token)match(input,LT,FOLLOW_LT_in_ifStatement691); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            pushFollow(FOLLOW_statement_in_ifStatement695);
            statement97=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement97.getTree());

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:128:60: ( ( LT !)* 'else' ( LT !)* statement )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==LT) ) {
                int LA46_1 = input.LA(2);

                if ( (synpred60_Javascript()) ) {
                    alt46=1;
                }
            }
            else if ( (LA46_0==85) ) {
                int LA46_2 = input.LA(2);

                if ( (synpred60_Javascript()) ) {
                    alt46=1;
                }
            }
            switch (alt46) {
                case 1 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:128:61: ( LT !)* 'else' ( LT !)* statement
                    {
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:128:63: ( LT !)*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==LT) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:128:63: LT !
                    	    {
                    	    LT98=(Token)match(input,LT,FOLLOW_LT_in_ifStatement698); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);


                    string_literal99=(Token)match(input,85,FOLLOW_85_in_ifStatement702); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal99_tree = 
                    (CommonTree)adaptor.create(string_literal99)
                    ;
                    adaptor.addChild(root_0, string_literal99_tree);
                    }

                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:128:75: ( LT !)*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==LT) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:128:75: LT !
                    	    {
                    	    LT100=(Token)match(input,LT,FOLLOW_LT_in_ifStatement704); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);


                    pushFollow(FOLLOW_statement_in_ifStatement708);
                    statement101=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement101.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 20, ifStatement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "ifStatement"


    public static class iterationStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "iterationStatement"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:131:1: iterationStatement : ( doWhileStatement | whileStatement | forStatement | forInStatement );
    public final JavascriptParser.iterationStatement_return iterationStatement() throws RecognitionException {
        JavascriptParser.iterationStatement_return retval = new JavascriptParser.iterationStatement_return();
        retval.start = input.LT(1);

        int iterationStatement_StartIndex = input.index();

        CommonTree root_0 = null;

        JavascriptParser.doWhileStatement_return doWhileStatement102 =null;

        JavascriptParser.whileStatement_return whileStatement103 =null;

        JavascriptParser.forStatement_return forStatement104 =null;

        JavascriptParser.forInStatement_return forInStatement105 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:132:3: ( doWhileStatement | whileStatement | forStatement | forInStatement )
            int alt47=4;
            switch ( input.LA(1) ) {
            case 84:
                {
                alt47=1;
                }
                break;
            case 104:
                {
                alt47=2;
                }
                break;
            case 88:
                {
                int LA47_3 = input.LA(2);

                if ( (synpred63_Javascript()) ) {
                    alt47=3;
                }
                else if ( (true) ) {
                    alt47=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 3, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;

            }

            switch (alt47) {
                case 1 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:132:5: doWhileStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_doWhileStatement_in_iterationStatement723);
                    doWhileStatement102=doWhileStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doWhileStatement102.getTree());

                    }
                    break;
                case 2 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:133:5: whileStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_whileStatement_in_iterationStatement729);
                    whileStatement103=whileStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whileStatement103.getTree());

                    }
                    break;
                case 3 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:134:5: forStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_forStatement_in_iterationStatement735);
                    forStatement104=forStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, forStatement104.getTree());

                    }
                    break;
                case 4 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:135:5: forInStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_forInStatement_in_iterationStatement741);
                    forInStatement105=forInStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, forInStatement105.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 21, iterationStatement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "iterationStatement"


    public static class doWhileStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "doWhileStatement"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:138:1: doWhileStatement : 'do' ^ ( LT !)* statement ( LT !)* 'while' ( LT !)* '(' expression ')' ( LT | ';' ) !;
    public final JavascriptParser.doWhileStatement_return doWhileStatement() throws RecognitionException {
        JavascriptParser.doWhileStatement_return retval = new JavascriptParser.doWhileStatement_return();
        retval.start = input.LT(1);

        int doWhileStatement_StartIndex = input.index();

        CommonTree root_0 = null;

        Token string_literal106=null;
        Token LT107=null;
        Token LT109=null;
        Token string_literal110=null;
        Token LT111=null;
        Token char_literal112=null;
        Token char_literal114=null;
        Token set115=null;
        JavascriptParser.statement_return statement108 =null;

        JavascriptParser.expression_return expression113 =null;


        CommonTree string_literal106_tree=null;
        CommonTree LT107_tree=null;
        CommonTree LT109_tree=null;
        CommonTree string_literal110_tree=null;
        CommonTree LT111_tree=null;
        CommonTree char_literal112_tree=null;
        CommonTree char_literal114_tree=null;
        CommonTree set115_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:139:3: ( 'do' ^ ( LT !)* statement ( LT !)* 'while' ( LT !)* '(' expression ')' ( LT | ';' ) !)
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:139:5: 'do' ^ ( LT !)* statement ( LT !)* 'while' ( LT !)* '(' expression ')' ( LT | ';' ) !
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal106=(Token)match(input,84,FOLLOW_84_in_doWhileStatement754); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal106_tree = 
            (CommonTree)adaptor.create(string_literal106)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(string_literal106_tree, root_0);
            }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:139:13: ( LT !)*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==LT) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:139:13: LT !
            	    {
            	    LT107=(Token)match(input,LT,FOLLOW_LT_in_doWhileStatement757); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);


            pushFollow(FOLLOW_statement_in_doWhileStatement761);
            statement108=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement108.getTree());

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:139:28: ( LT !)*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==LT) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:139:28: LT !
            	    {
            	    LT109=(Token)match(input,LT,FOLLOW_LT_in_doWhileStatement763); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            string_literal110=(Token)match(input,104,FOLLOW_104_in_doWhileStatement767); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal110_tree = 
            (CommonTree)adaptor.create(string_literal110)
            ;
            adaptor.addChild(root_0, string_literal110_tree);
            }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:139:41: ( LT !)*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==LT) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:139:41: LT !
            	    {
            	    LT111=(Token)match(input,LT,FOLLOW_LT_in_doWhileStatement769); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


            char_literal112=(Token)match(input,44,FOLLOW_44_in_doWhileStatement773); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal112_tree = 
            (CommonTree)adaptor.create(char_literal112)
            ;
            adaptor.addChild(root_0, char_literal112_tree);
            }

            pushFollow(FOLLOW_expression_in_doWhileStatement775);
            expression113=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression113.getTree());

            char_literal114=(Token)match(input,45,FOLLOW_45_in_doWhileStatement777); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal114_tree = 
            (CommonTree)adaptor.create(char_literal114)
            ;
            adaptor.addChild(root_0, char_literal114_tree);
            }

            set115=(Token)input.LT(1);

            if ( input.LA(1)==LT||input.LA(1)==59 ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 22, doWhileStatement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "doWhileStatement"


    public static class whileStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whileStatement"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:142:1: whileStatement : 'while' ^ ( LT !)* '(' ( LT !)* expression ( LT !)* ')' ( LT !)* statement ;
    public final JavascriptParser.whileStatement_return whileStatement() throws RecognitionException {
        JavascriptParser.whileStatement_return retval = new JavascriptParser.whileStatement_return();
        retval.start = input.LT(1);

        int whileStatement_StartIndex = input.index();

        CommonTree root_0 = null;

        Token string_literal116=null;
        Token LT117=null;
        Token char_literal118=null;
        Token LT119=null;
        Token LT121=null;
        Token char_literal122=null;
        Token LT123=null;
        JavascriptParser.expression_return expression120 =null;

        JavascriptParser.statement_return statement124 =null;


        CommonTree string_literal116_tree=null;
        CommonTree LT117_tree=null;
        CommonTree char_literal118_tree=null;
        CommonTree LT119_tree=null;
        CommonTree LT121_tree=null;
        CommonTree char_literal122_tree=null;
        CommonTree LT123_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:143:3: ( 'while' ^ ( LT !)* '(' ( LT !)* expression ( LT !)* ')' ( LT !)* statement )
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:143:5: 'while' ^ ( LT !)* '(' ( LT !)* expression ( LT !)* ')' ( LT !)* statement
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal116=(Token)match(input,104,FOLLOW_104_in_whileStatement799); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal116_tree = 
            (CommonTree)adaptor.create(string_literal116)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(string_literal116_tree, root_0);
            }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:143:16: ( LT !)*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==LT) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:143:16: LT !
            	    {
            	    LT117=(Token)match(input,LT,FOLLOW_LT_in_whileStatement802); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);


            char_literal118=(Token)match(input,44,FOLLOW_44_in_whileStatement806); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal118_tree = 
            (CommonTree)adaptor.create(char_literal118)
            ;
            adaptor.addChild(root_0, char_literal118_tree);
            }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:143:25: ( LT !)*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==LT) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:143:25: LT !
            	    {
            	    LT119=(Token)match(input,LT,FOLLOW_LT_in_whileStatement808); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


            pushFollow(FOLLOW_expression_in_whileStatement812);
            expression120=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression120.getTree());

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:143:41: ( LT !)*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==LT) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:143:41: LT !
            	    {
            	    LT121=(Token)match(input,LT,FOLLOW_LT_in_whileStatement814); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


            char_literal122=(Token)match(input,45,FOLLOW_45_in_whileStatement818); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal122_tree = 
            (CommonTree)adaptor.create(char_literal122)
            ;
            adaptor.addChild(root_0, char_literal122_tree);
            }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:143:50: ( LT !)*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==LT) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:143:50: LT !
            	    {
            	    LT123=(Token)match(input,LT,FOLLOW_LT_in_whileStatement820); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);


            pushFollow(FOLLOW_statement_in_whileStatement824);
            statement124=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement124.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 23, whileStatement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "whileStatement"


    public static class forStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "forStatement"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:146:1: forStatement : 'for' ^ ( LT !)* '(' ( ( LT !)* forStatementInitialiserPart )? ( LT !)* ';' ( ( LT !)* expression )? ( LT !)* ';' ( ( LT !)* expression )? ( LT !)* ')' ( LT !)* statement ;
    public final JavascriptParser.forStatement_return forStatement() throws RecognitionException {
        JavascriptParser.forStatement_return retval = new JavascriptParser.forStatement_return();
        retval.start = input.LT(1);

        int forStatement_StartIndex = input.index();

        CommonTree root_0 = null;

        Token string_literal125=null;
        Token LT126=null;
        Token char_literal127=null;
        Token LT128=null;
        Token LT130=null;
        Token char_literal131=null;
        Token LT132=null;
        Token LT134=null;
        Token char_literal135=null;
        Token LT136=null;
        Token LT138=null;
        Token char_literal139=null;
        Token LT140=null;
        JavascriptParser.forStatementInitialiserPart_return forStatementInitialiserPart129 =null;

        JavascriptParser.expression_return expression133 =null;

        JavascriptParser.expression_return expression137 =null;

        JavascriptParser.statement_return statement141 =null;


        CommonTree string_literal125_tree=null;
        CommonTree LT126_tree=null;
        CommonTree char_literal127_tree=null;
        CommonTree LT128_tree=null;
        CommonTree LT130_tree=null;
        CommonTree char_literal131_tree=null;
        CommonTree LT132_tree=null;
        CommonTree LT134_tree=null;
        CommonTree char_literal135_tree=null;
        CommonTree LT136_tree=null;
        CommonTree LT138_tree=null;
        CommonTree char_literal139_tree=null;
        CommonTree LT140_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:147:3: ( 'for' ^ ( LT !)* '(' ( ( LT !)* forStatementInitialiserPart )? ( LT !)* ';' ( ( LT !)* expression )? ( LT !)* ';' ( ( LT !)* expression )? ( LT !)* ')' ( LT !)* statement )
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:147:5: 'for' ^ ( LT !)* '(' ( ( LT !)* forStatementInitialiserPart )? ( LT !)* ';' ( ( LT !)* expression )? ( LT !)* ';' ( ( LT !)* expression )? ( LT !)* ')' ( LT !)* statement
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal125=(Token)match(input,88,FOLLOW_88_in_forStatement837); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal125_tree = 
            (CommonTree)adaptor.create(string_literal125)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(string_literal125_tree, root_0);
            }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:147:14: ( LT !)*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==LT) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:147:14: LT !
            	    {
            	    LT126=(Token)match(input,LT,FOLLOW_LT_in_forStatement840); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);


            char_literal127=(Token)match(input,44,FOLLOW_44_in_forStatement844); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal127_tree = 
            (CommonTree)adaptor.create(char_literal127)
            ;
            adaptor.addChild(root_0, char_literal127_tree);
            }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:147:21: ( ( LT !)* forStatementInitialiserPart )?
            int alt57=2;
            alt57 = dfa57.predict(input);
            switch (alt57) {
                case 1 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:147:22: ( LT !)* forStatementInitialiserPart
                    {
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:147:24: ( LT !)*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==LT) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:147:24: LT !
                    	    {
                    	    LT128=(Token)match(input,LT,FOLLOW_LT_in_forStatement847); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);


                    pushFollow(FOLLOW_forStatementInitialiserPart_in_forStatement851);
                    forStatementInitialiserPart129=forStatementInitialiserPart();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, forStatementInitialiserPart129.getTree());

                    }
                    break;

            }


            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:147:59: ( LT !)*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==LT) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:147:59: LT !
            	    {
            	    LT130=(Token)match(input,LT,FOLLOW_LT_in_forStatement855); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);


            char_literal131=(Token)match(input,59,FOLLOW_59_in_forStatement859); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal131_tree = 
            (CommonTree)adaptor.create(char_literal131)
            ;
            adaptor.addChild(root_0, char_literal131_tree);
            }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:147:66: ( ( LT !)* expression )?
            int alt60=2;
            alt60 = dfa60.predict(input);
            switch (alt60) {
                case 1 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:147:67: ( LT !)* expression
                    {
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:147:69: ( LT !)*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==LT) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:147:69: LT !
                    	    {
                    	    LT132=(Token)match(input,LT,FOLLOW_LT_in_forStatement862); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);


                    pushFollow(FOLLOW_expression_in_forStatement866);
                    expression133=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression133.getTree());

                    }
                    break;

            }


            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:147:87: ( LT !)*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==LT) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:147:87: LT !
            	    {
            	    LT134=(Token)match(input,LT,FOLLOW_LT_in_forStatement870); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);


            char_literal135=(Token)match(input,59,FOLLOW_59_in_forStatement874); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal135_tree = 
            (CommonTree)adaptor.create(char_literal135)
            ;
            adaptor.addChild(root_0, char_literal135_tree);
            }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:147:94: ( ( LT !)* expression )?
            int alt63=2;
            alt63 = dfa63.predict(input);
            switch (alt63) {
                case 1 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:147:95: ( LT !)* expression
                    {
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:147:97: ( LT !)*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==LT) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:147:97: LT !
                    	    {
                    	    LT136=(Token)match(input,LT,FOLLOW_LT_in_forStatement877); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop62;
                        }
                    } while (true);


                    pushFollow(FOLLOW_expression_in_forStatement881);
                    expression137=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression137.getTree());

                    }
                    break;

            }


            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:147:115: ( LT !)*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==LT) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:147:115: LT !
            	    {
            	    LT138=(Token)match(input,LT,FOLLOW_LT_in_forStatement885); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);


            char_literal139=(Token)match(input,45,FOLLOW_45_in_forStatement889); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal139_tree = 
            (CommonTree)adaptor.create(char_literal139)
            ;
            adaptor.addChild(root_0, char_literal139_tree);
            }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:147:124: ( LT !)*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==LT) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:147:124: LT !
            	    {
            	    LT140=(Token)match(input,LT,FOLLOW_LT_in_forStatement891); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);


            pushFollow(FOLLOW_statement_in_forStatement895);
            statement141=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement141.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 24, forStatement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "forStatement"


    public static class forStatementInitialiserPart_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "forStatementInitialiserPart"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:150:1: forStatementInitialiserPart : ( expressionNoIn | 'var' ( LT !)* variableDeclarationListNoIn );
    public final JavascriptParser.forStatementInitialiserPart_return forStatementInitialiserPart() throws RecognitionException {
        JavascriptParser.forStatementInitialiserPart_return retval = new JavascriptParser.forStatementInitialiserPart_return();
        retval.start = input.LT(1);

        int forStatementInitialiserPart_StartIndex = input.index();

        CommonTree root_0 = null;

        Token string_literal143=null;
        Token LT144=null;
        JavascriptParser.expressionNoIn_return expressionNoIn142 =null;

        JavascriptParser.variableDeclarationListNoIn_return variableDeclarationListNoIn145 =null;


        CommonTree string_literal143_tree=null;
        CommonTree LT144_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:151:3: ( expressionNoIn | 'var' ( LT !)* variableDeclarationListNoIn )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==Identifier||LA67_0==NumericLiteral||LA67_0==StringLiteral||LA67_0==36||LA67_0==44||(LA67_0 >= 48 && LA67_0 <= 49)||(LA67_0 >= 52 && LA67_0 <= 53)||LA67_0==74||LA67_0==83||LA67_0==86||LA67_0==89||(LA67_0 >= 93 && LA67_0 <= 94)||LA67_0==97||LA67_0==99||LA67_0==101||LA67_0==103||LA67_0==106||LA67_0==111) ) {
                alt67=1;
            }
            else if ( (LA67_0==102) ) {
                alt67=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;

            }
            switch (alt67) {
                case 1 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:151:5: expressionNoIn
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_expressionNoIn_in_forStatementInitialiserPart908);
                    expressionNoIn142=expressionNoIn();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionNoIn142.getTree());

                    }
                    break;
                case 2 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:152:5: 'var' ( LT !)* variableDeclarationListNoIn
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal143=(Token)match(input,102,FOLLOW_102_in_forStatementInitialiserPart914); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal143_tree = 
                    (CommonTree)adaptor.create(string_literal143)
                    ;
                    adaptor.addChild(root_0, string_literal143_tree);
                    }

                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:152:13: ( LT !)*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==LT) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:152:13: LT !
                    	    {
                    	    LT144=(Token)match(input,LT,FOLLOW_LT_in_forStatementInitialiserPart916); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop66;
                        }
                    } while (true);


                    pushFollow(FOLLOW_variableDeclarationListNoIn_in_forStatementInitialiserPart920);
                    variableDeclarationListNoIn145=variableDeclarationListNoIn();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclarationListNoIn145.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 25, forStatementInitialiserPart_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "forStatementInitialiserPart"


    public static class forInStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "forInStatement"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:155:1: forInStatement : 'for' ^ ( LT !)* '(' ( LT !)* forInStatementInitialiserPart ( LT !)* 'in' ( LT !)* expression ( LT !)* ')' ( LT !)* statement ;
    public final JavascriptParser.forInStatement_return forInStatement() throws RecognitionException {
        JavascriptParser.forInStatement_return retval = new JavascriptParser.forInStatement_return();
        retval.start = input.LT(1);

        int forInStatement_StartIndex = input.index();

        CommonTree root_0 = null;

        Token string_literal146=null;
        Token LT147=null;
        Token char_literal148=null;
        Token LT149=null;
        Token LT151=null;
        Token string_literal152=null;
        Token LT153=null;
        Token LT155=null;
        Token char_literal156=null;
        Token LT157=null;
        JavascriptParser.forInStatementInitialiserPart_return forInStatementInitialiserPart150 =null;

        JavascriptParser.expression_return expression154 =null;

        JavascriptParser.statement_return statement158 =null;


        CommonTree string_literal146_tree=null;
        CommonTree LT147_tree=null;
        CommonTree char_literal148_tree=null;
        CommonTree LT149_tree=null;
        CommonTree LT151_tree=null;
        CommonTree string_literal152_tree=null;
        CommonTree LT153_tree=null;
        CommonTree LT155_tree=null;
        CommonTree char_literal156_tree=null;
        CommonTree LT157_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:156:3: ( 'for' ^ ( LT !)* '(' ( LT !)* forInStatementInitialiserPart ( LT !)* 'in' ( LT !)* expression ( LT !)* ')' ( LT !)* statement )
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:156:5: 'for' ^ ( LT !)* '(' ( LT !)* forInStatementInitialiserPart ( LT !)* 'in' ( LT !)* expression ( LT !)* ')' ( LT !)* statement
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal146=(Token)match(input,88,FOLLOW_88_in_forInStatement933); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal146_tree = 
            (CommonTree)adaptor.create(string_literal146)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(string_literal146_tree, root_0);
            }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:156:14: ( LT !)*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==LT) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:156:14: LT !
            	    {
            	    LT147=(Token)match(input,LT,FOLLOW_LT_in_forInStatement936); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);


            char_literal148=(Token)match(input,44,FOLLOW_44_in_forInStatement940); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal148_tree = 
            (CommonTree)adaptor.create(char_literal148)
            ;
            adaptor.addChild(root_0, char_literal148_tree);
            }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:156:23: ( LT !)*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==LT) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:156:23: LT !
            	    {
            	    LT149=(Token)match(input,LT,FOLLOW_LT_in_forInStatement942); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);


            pushFollow(FOLLOW_forInStatementInitialiserPart_in_forInStatement946);
            forInStatementInitialiserPart150=forInStatementInitialiserPart();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, forInStatementInitialiserPart150.getTree());

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:156:58: ( LT !)*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==LT) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:156:58: LT !
            	    {
            	    LT151=(Token)match(input,LT,FOLLOW_LT_in_forInStatement948); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);


            string_literal152=(Token)match(input,91,FOLLOW_91_in_forInStatement952); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal152_tree = 
            (CommonTree)adaptor.create(string_literal152)
            ;
            adaptor.addChild(root_0, string_literal152_tree);
            }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:156:68: ( LT !)*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==LT) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:156:68: LT !
            	    {
            	    LT153=(Token)match(input,LT,FOLLOW_LT_in_forInStatement954); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);


            pushFollow(FOLLOW_expression_in_forInStatement958);
            expression154=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression154.getTree());

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:156:84: ( LT !)*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==LT) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:156:84: LT !
            	    {
            	    LT155=(Token)match(input,LT,FOLLOW_LT_in_forInStatement960); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);


            char_literal156=(Token)match(input,45,FOLLOW_45_in_forInStatement964); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal156_tree = 
            (CommonTree)adaptor.create(char_literal156)
            ;
            adaptor.addChild(root_0, char_literal156_tree);
            }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:156:93: ( LT !)*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==LT) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:156:93: LT !
            	    {
            	    LT157=(Token)match(input,LT,FOLLOW_LT_in_forInStatement966); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);


            pushFollow(FOLLOW_statement_in_forInStatement970);
            statement158=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement158.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 26, forInStatement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "forInStatement"


    public static class forInStatementInitialiserPart_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "forInStatementInitialiserPart"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:159:1: forInStatementInitialiserPart : ( leftHandSideExpression | 'var' ( LT !)* variableDeclarationNoIn );
    public final JavascriptParser.forInStatementInitialiserPart_return forInStatementInitialiserPart() throws RecognitionException {
        JavascriptParser.forInStatementInitialiserPart_return retval = new JavascriptParser.forInStatementInitialiserPart_return();
        retval.start = input.LT(1);

        int forInStatementInitialiserPart_StartIndex = input.index();

        CommonTree root_0 = null;

        Token string_literal160=null;
        Token LT161=null;
        JavascriptParser.leftHandSideExpression_return leftHandSideExpression159 =null;

        JavascriptParser.variableDeclarationNoIn_return variableDeclarationNoIn162 =null;


        CommonTree string_literal160_tree=null;
        CommonTree LT161_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:160:3: ( leftHandSideExpression | 'var' ( LT !)* variableDeclarationNoIn )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==Identifier||LA75_0==NumericLiteral||LA75_0==StringLiteral||LA75_0==44||LA75_0==74||LA75_0==86||LA75_0==89||(LA75_0 >= 93 && LA75_0 <= 94)||LA75_0==97||LA75_0==99||LA75_0==106) ) {
                alt75=1;
            }
            else if ( (LA75_0==102) ) {
                alt75=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;

            }
            switch (alt75) {
                case 1 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:160:5: leftHandSideExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_leftHandSideExpression_in_forInStatementInitialiserPart983);
                    leftHandSideExpression159=leftHandSideExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, leftHandSideExpression159.getTree());

                    }
                    break;
                case 2 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:161:5: 'var' ( LT !)* variableDeclarationNoIn
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal160=(Token)match(input,102,FOLLOW_102_in_forInStatementInitialiserPart989); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal160_tree = 
                    (CommonTree)adaptor.create(string_literal160)
                    ;
                    adaptor.addChild(root_0, string_literal160_tree);
                    }

                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:161:13: ( LT !)*
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==LT) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:161:13: LT !
                    	    {
                    	    LT161=(Token)match(input,LT,FOLLOW_LT_in_forInStatementInitialiserPart991); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop74;
                        }
                    } while (true);


                    pushFollow(FOLLOW_variableDeclarationNoIn_in_forInStatementInitialiserPart995);
                    variableDeclarationNoIn162=variableDeclarationNoIn();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclarationNoIn162.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 27, forInStatementInitialiserPart_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "forInStatementInitialiserPart"


    public static class continueStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "continueStatement"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:164:1: continueStatement : 'continue' ( Identifier )? ( LT | ';' ) !;
    public final JavascriptParser.continueStatement_return continueStatement() throws RecognitionException {
        JavascriptParser.continueStatement_return retval = new JavascriptParser.continueStatement_return();
        retval.start = input.LT(1);

        int continueStatement_StartIndex = input.index();

        CommonTree root_0 = null;

        Token string_literal163=null;
        Token Identifier164=null;
        Token set165=null;

        CommonTree string_literal163_tree=null;
        CommonTree Identifier164_tree=null;
        CommonTree set165_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:165:3: ( 'continue' ( Identifier )? ( LT | ';' ) !)
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:165:5: 'continue' ( Identifier )? ( LT | ';' ) !
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal163=(Token)match(input,81,FOLLOW_81_in_continueStatement1008); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal163_tree = 
            (CommonTree)adaptor.create(string_literal163)
            ;
            adaptor.addChild(root_0, string_literal163_tree);
            }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:165:16: ( Identifier )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==Identifier) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:165:16: Identifier
                    {
                    Identifier164=(Token)match(input,Identifier,FOLLOW_Identifier_in_continueStatement1010); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Identifier164_tree = 
                    (CommonTree)adaptor.create(Identifier164)
                    ;
                    adaptor.addChild(root_0, Identifier164_tree);
                    }

                    }
                    break;

            }


            set165=(Token)input.LT(1);

            if ( input.LA(1)==LT||input.LA(1)==59 ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 28, continueStatement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "continueStatement"


    public static class breakStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "breakStatement"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:168:1: breakStatement : 'break' ( Identifier )? ( LT | ';' ) !;
    public final JavascriptParser.breakStatement_return breakStatement() throws RecognitionException {
        JavascriptParser.breakStatement_return retval = new JavascriptParser.breakStatement_return();
        retval.start = input.LT(1);

        int breakStatement_StartIndex = input.index();

        CommonTree root_0 = null;

        Token string_literal166=null;
        Token Identifier167=null;
        Token set168=null;

        CommonTree string_literal166_tree=null;
        CommonTree Identifier167_tree=null;
        CommonTree set168_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:169:3: ( 'break' ( Identifier )? ( LT | ';' ) !)
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:169:5: 'break' ( Identifier )? ( LT | ';' ) !
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal166=(Token)match(input,78,FOLLOW_78_in_breakStatement1033); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal166_tree = 
            (CommonTree)adaptor.create(string_literal166)
            ;
            adaptor.addChild(root_0, string_literal166_tree);
            }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:169:13: ( Identifier )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==Identifier) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:169:13: Identifier
                    {
                    Identifier167=(Token)match(input,Identifier,FOLLOW_Identifier_in_breakStatement1035); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Identifier167_tree = 
                    (CommonTree)adaptor.create(Identifier167)
                    ;
                    adaptor.addChild(root_0, Identifier167_tree);
                    }

                    }
                    break;

            }


            set168=(Token)input.LT(1);

            if ( input.LA(1)==LT||input.LA(1)==59 ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 29, breakStatement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "breakStatement"


    public static class returnStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "returnStatement"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:172:1: returnStatement : 'return' ^ ( expression )? ( LT | ';' ) !;
    public final JavascriptParser.returnStatement_return returnStatement() throws RecognitionException {
        JavascriptParser.returnStatement_return retval = new JavascriptParser.returnStatement_return();
        retval.start = input.LT(1);

        int returnStatement_StartIndex = input.index();

        CommonTree root_0 = null;

        Token string_literal169=null;
        Token set171=null;
        JavascriptParser.expression_return expression170 =null;


        CommonTree string_literal169_tree=null;
        CommonTree set171_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:173:3: ( 'return' ^ ( expression )? ( LT | ';' ) !)
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:173:5: 'return' ^ ( expression )? ( LT | ';' ) !
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal169=(Token)match(input,95,FOLLOW_95_in_returnStatement1058); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal169_tree = 
            (CommonTree)adaptor.create(string_literal169)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(string_literal169_tree, root_0);
            }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:173:15: ( expression )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==Identifier||LA78_0==NumericLiteral||LA78_0==StringLiteral||LA78_0==36||LA78_0==44||(LA78_0 >= 48 && LA78_0 <= 49)||(LA78_0 >= 52 && LA78_0 <= 53)||LA78_0==74||LA78_0==83||LA78_0==86||LA78_0==89||(LA78_0 >= 93 && LA78_0 <= 94)||LA78_0==97||LA78_0==99||LA78_0==101||LA78_0==103||LA78_0==106||LA78_0==111) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:173:15: expression
                    {
                    pushFollow(FOLLOW_expression_in_returnStatement1061);
                    expression170=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression170.getTree());

                    }
                    break;

            }


            set171=(Token)input.LT(1);

            if ( input.LA(1)==LT||input.LA(1)==59 ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 30, returnStatement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "returnStatement"


    public static class withStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "withStatement"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:176:1: withStatement : 'with' ^ ( LT !)* '(' ( LT !)* expression ( LT !)* ')' ( LT !)* statement ;
    public final JavascriptParser.withStatement_return withStatement() throws RecognitionException {
        JavascriptParser.withStatement_return retval = new JavascriptParser.withStatement_return();
        retval.start = input.LT(1);

        int withStatement_StartIndex = input.index();

        CommonTree root_0 = null;

        Token string_literal172=null;
        Token LT173=null;
        Token char_literal174=null;
        Token LT175=null;
        Token LT177=null;
        Token char_literal178=null;
        Token LT179=null;
        JavascriptParser.expression_return expression176 =null;

        JavascriptParser.statement_return statement180 =null;


        CommonTree string_literal172_tree=null;
        CommonTree LT173_tree=null;
        CommonTree char_literal174_tree=null;
        CommonTree LT175_tree=null;
        CommonTree LT177_tree=null;
        CommonTree char_literal178_tree=null;
        CommonTree LT179_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:177:3: ( 'with' ^ ( LT !)* '(' ( LT !)* expression ( LT !)* ')' ( LT !)* statement )
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:177:5: 'with' ^ ( LT !)* '(' ( LT !)* expression ( LT !)* ')' ( LT !)* statement
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal172=(Token)match(input,105,FOLLOW_105_in_withStatement1084); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal172_tree = 
            (CommonTree)adaptor.create(string_literal172)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(string_literal172_tree, root_0);
            }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:177:15: ( LT !)*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==LT) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:177:15: LT !
            	    {
            	    LT173=(Token)match(input,LT,FOLLOW_LT_in_withStatement1087); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);


            char_literal174=(Token)match(input,44,FOLLOW_44_in_withStatement1091); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal174_tree = 
            (CommonTree)adaptor.create(char_literal174)
            ;
            adaptor.addChild(root_0, char_literal174_tree);
            }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:177:24: ( LT !)*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==LT) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:177:24: LT !
            	    {
            	    LT175=(Token)match(input,LT,FOLLOW_LT_in_withStatement1093); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop80;
                }
            } while (true);


            pushFollow(FOLLOW_expression_in_withStatement1097);
            expression176=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression176.getTree());

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:177:40: ( LT !)*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==LT) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:177:40: LT !
            	    {
            	    LT177=(Token)match(input,LT,FOLLOW_LT_in_withStatement1099); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);


            char_literal178=(Token)match(input,45,FOLLOW_45_in_withStatement1103); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal178_tree = 
            (CommonTree)adaptor.create(char_literal178)
            ;
            adaptor.addChild(root_0, char_literal178_tree);
            }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:177:49: ( LT !)*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==LT) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:177:49: LT !
            	    {
            	    LT179=(Token)match(input,LT,FOLLOW_LT_in_withStatement1105); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop82;
                }
            } while (true);


            pushFollow(FOLLOW_statement_in_withStatement1109);
            statement180=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement180.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 31, withStatement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "withStatement"


    public static class labelledStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "labelledStatement"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:180:1: labelledStatement : Identifier ( LT !)* ':' ( LT !)* statement ;
    public final JavascriptParser.labelledStatement_return labelledStatement() throws RecognitionException {
        JavascriptParser.labelledStatement_return retval = new JavascriptParser.labelledStatement_return();
        retval.start = input.LT(1);

        int labelledStatement_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Identifier181=null;
        Token LT182=null;
        Token char_literal183=null;
        Token LT184=null;
        JavascriptParser.statement_return statement185 =null;


        CommonTree Identifier181_tree=null;
        CommonTree LT182_tree=null;
        CommonTree char_literal183_tree=null;
        CommonTree LT184_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:181:3: ( Identifier ( LT !)* ':' ( LT !)* statement )
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:181:5: Identifier ( LT !)* ':' ( LT !)* statement
            {
            root_0 = (CommonTree)adaptor.nil();


            Identifier181=(Token)match(input,Identifier,FOLLOW_Identifier_in_labelledStatement1122); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier181_tree = 
            (CommonTree)adaptor.create(Identifier181)
            ;
            adaptor.addChild(root_0, Identifier181_tree);
            }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:181:18: ( LT !)*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==LT) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:181:18: LT !
            	    {
            	    LT182=(Token)match(input,LT,FOLLOW_LT_in_labelledStatement1124); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop83;
                }
            } while (true);


            char_literal183=(Token)match(input,58,FOLLOW_58_in_labelledStatement1128); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal183_tree = 
            (CommonTree)adaptor.create(char_literal183)
            ;
            adaptor.addChild(root_0, char_literal183_tree);
            }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:181:27: ( LT !)*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==LT) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:181:27: LT !
            	    {
            	    LT184=(Token)match(input,LT,FOLLOW_LT_in_labelledStatement1130); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop84;
                }
            } while (true);


            pushFollow(FOLLOW_statement_in_labelledStatement1134);
            statement185=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement185.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 32, labelledStatement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "labelledStatement"


    public static class switchStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "switchStatement"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:184:1: switchStatement : 'switch' ^ ( LT !)* '(' ( LT !)* expression ( LT !)* ')' ( LT !)* caseBlock ;
    public final JavascriptParser.switchStatement_return switchStatement() throws RecognitionException {
        JavascriptParser.switchStatement_return retval = new JavascriptParser.switchStatement_return();
        retval.start = input.LT(1);

        int switchStatement_StartIndex = input.index();

        CommonTree root_0 = null;

        Token string_literal186=null;
        Token LT187=null;
        Token char_literal188=null;
        Token LT189=null;
        Token LT191=null;
        Token char_literal192=null;
        Token LT193=null;
        JavascriptParser.expression_return expression190 =null;

        JavascriptParser.caseBlock_return caseBlock194 =null;


        CommonTree string_literal186_tree=null;
        CommonTree LT187_tree=null;
        CommonTree char_literal188_tree=null;
        CommonTree LT189_tree=null;
        CommonTree LT191_tree=null;
        CommonTree char_literal192_tree=null;
        CommonTree LT193_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:185:3: ( 'switch' ^ ( LT !)* '(' ( LT !)* expression ( LT !)* ')' ( LT !)* caseBlock )
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:185:5: 'switch' ^ ( LT !)* '(' ( LT !)* expression ( LT !)* ')' ( LT !)* caseBlock
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal186=(Token)match(input,96,FOLLOW_96_in_switchStatement1147); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal186_tree = 
            (CommonTree)adaptor.create(string_literal186)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(string_literal186_tree, root_0);
            }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:185:17: ( LT !)*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==LT) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:185:17: LT !
            	    {
            	    LT187=(Token)match(input,LT,FOLLOW_LT_in_switchStatement1150); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop85;
                }
            } while (true);


            char_literal188=(Token)match(input,44,FOLLOW_44_in_switchStatement1154); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal188_tree = 
            (CommonTree)adaptor.create(char_literal188)
            ;
            adaptor.addChild(root_0, char_literal188_tree);
            }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:185:26: ( LT !)*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==LT) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:185:26: LT !
            	    {
            	    LT189=(Token)match(input,LT,FOLLOW_LT_in_switchStatement1156); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop86;
                }
            } while (true);


            pushFollow(FOLLOW_expression_in_switchStatement1160);
            expression190=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression190.getTree());

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:185:42: ( LT !)*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==LT) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:185:42: LT !
            	    {
            	    LT191=(Token)match(input,LT,FOLLOW_LT_in_switchStatement1162); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop87;
                }
            } while (true);


            char_literal192=(Token)match(input,45,FOLLOW_45_in_switchStatement1166); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal192_tree = 
            (CommonTree)adaptor.create(char_literal192)
            ;
            adaptor.addChild(root_0, char_literal192_tree);
            }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:185:51: ( LT !)*
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( (LA88_0==LT) ) {
                    alt88=1;
                }


                switch (alt88) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:185:51: LT !
            	    {
            	    LT193=(Token)match(input,LT,FOLLOW_LT_in_switchStatement1168); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop88;
                }
            } while (true);


            pushFollow(FOLLOW_caseBlock_in_switchStatement1172);
            caseBlock194=caseBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, caseBlock194.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 33, switchStatement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "switchStatement"


    public static class caseBlock_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "caseBlock"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:188:1: caseBlock : '{' ( ( LT !)* caseClause )* ( ( LT !)* defaultClause ( ( LT !)* caseClause )* )? ( LT !)* '}' ;
    public final JavascriptParser.caseBlock_return caseBlock() throws RecognitionException {
        JavascriptParser.caseBlock_return retval = new JavascriptParser.caseBlock_return();
        retval.start = input.LT(1);

        int caseBlock_StartIndex = input.index();

        CommonTree root_0 = null;

        Token char_literal195=null;
        Token LT196=null;
        Token LT198=null;
        Token LT200=null;
        Token LT202=null;
        Token char_literal203=null;
        JavascriptParser.caseClause_return caseClause197 =null;

        JavascriptParser.defaultClause_return defaultClause199 =null;

        JavascriptParser.caseClause_return caseClause201 =null;


        CommonTree char_literal195_tree=null;
        CommonTree LT196_tree=null;
        CommonTree LT198_tree=null;
        CommonTree LT200_tree=null;
        CommonTree LT202_tree=null;
        CommonTree char_literal203_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:189:3: ( '{' ( ( LT !)* caseClause )* ( ( LT !)* defaultClause ( ( LT !)* caseClause )* )? ( LT !)* '}' )
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:189:5: '{' ( ( LT !)* caseClause )* ( ( LT !)* defaultClause ( ( LT !)* caseClause )* )? ( LT !)* '}'
            {
            root_0 = (CommonTree)adaptor.nil();


            char_literal195=(Token)match(input,106,FOLLOW_106_in_caseBlock1185); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal195_tree = 
            (CommonTree)adaptor.create(char_literal195)
            ;
            adaptor.addChild(root_0, char_literal195_tree);
            }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:189:9: ( ( LT !)* caseClause )*
            loop90:
            do {
                int alt90=2;
                alt90 = dfa90.predict(input);
                switch (alt90) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:189:10: ( LT !)* caseClause
            	    {
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:189:12: ( LT !)*
            	    loop89:
            	    do {
            	        int alt89=2;
            	        int LA89_0 = input.LA(1);

            	        if ( (LA89_0==LT) ) {
            	            alt89=1;
            	        }


            	        switch (alt89) {
            	    	case 1 :
            	    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:189:12: LT !
            	    	    {
            	    	    LT196=(Token)match(input,LT,FOLLOW_LT_in_caseBlock1188); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop89;
            	        }
            	    } while (true);


            	    pushFollow(FOLLOW_caseClause_in_caseBlock1192);
            	    caseClause197=caseClause();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, caseClause197.getTree());

            	    }
            	    break;

            	default :
            	    break loop90;
                }
            } while (true);


            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:189:28: ( ( LT !)* defaultClause ( ( LT !)* caseClause )* )?
            int alt94=2;
            alt94 = dfa94.predict(input);
            switch (alt94) {
                case 1 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:189:29: ( LT !)* defaultClause ( ( LT !)* caseClause )*
                    {
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:189:31: ( LT !)*
                    loop91:
                    do {
                        int alt91=2;
                        int LA91_0 = input.LA(1);

                        if ( (LA91_0==LT) ) {
                            alt91=1;
                        }


                        switch (alt91) {
                    	case 1 :
                    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:189:31: LT !
                    	    {
                    	    LT198=(Token)match(input,LT,FOLLOW_LT_in_caseBlock1197); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop91;
                        }
                    } while (true);


                    pushFollow(FOLLOW_defaultClause_in_caseBlock1201);
                    defaultClause199=defaultClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, defaultClause199.getTree());

                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:189:48: ( ( LT !)* caseClause )*
                    loop93:
                    do {
                        int alt93=2;
                        alt93 = dfa93.predict(input);
                        switch (alt93) {
                    	case 1 :
                    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:189:49: ( LT !)* caseClause
                    	    {
                    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:189:51: ( LT !)*
                    	    loop92:
                    	    do {
                    	        int alt92=2;
                    	        int LA92_0 = input.LA(1);

                    	        if ( (LA92_0==LT) ) {
                    	            alt92=1;
                    	        }


                    	        switch (alt92) {
                    	    	case 1 :
                    	    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:189:51: LT !
                    	    	    {
                    	    	    LT200=(Token)match(input,LT,FOLLOW_LT_in_caseBlock1204); if (state.failed) return retval;

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop92;
                    	        }
                    	    } while (true);


                    	    pushFollow(FOLLOW_caseClause_in_caseBlock1208);
                    	    caseClause201=caseClause();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, caseClause201.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop93;
                        }
                    } while (true);


                    }
                    break;

            }


            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:189:71: ( LT !)*
            loop95:
            do {
                int alt95=2;
                int LA95_0 = input.LA(1);

                if ( (LA95_0==LT) ) {
                    alt95=1;
                }


                switch (alt95) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:189:71: LT !
            	    {
            	    LT202=(Token)match(input,LT,FOLLOW_LT_in_caseBlock1214); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop95;
                }
            } while (true);


            char_literal203=(Token)match(input,110,FOLLOW_110_in_caseBlock1218); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal203_tree = 
            (CommonTree)adaptor.create(char_literal203)
            ;
            adaptor.addChild(root_0, char_literal203_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 34, caseBlock_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "caseBlock"


    public static class caseClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "caseClause"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:192:1: caseClause : 'case' ^ ( LT !)* expression ( LT !)* ':' ( LT !)* ( statementList )? ;
    public final JavascriptParser.caseClause_return caseClause() throws RecognitionException {
        JavascriptParser.caseClause_return retval = new JavascriptParser.caseClause_return();
        retval.start = input.LT(1);

        int caseClause_StartIndex = input.index();

        CommonTree root_0 = null;

        Token string_literal204=null;
        Token LT205=null;
        Token LT207=null;
        Token char_literal208=null;
        Token LT209=null;
        JavascriptParser.expression_return expression206 =null;

        JavascriptParser.statementList_return statementList210 =null;


        CommonTree string_literal204_tree=null;
        CommonTree LT205_tree=null;
        CommonTree LT207_tree=null;
        CommonTree char_literal208_tree=null;
        CommonTree LT209_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:193:3: ( 'case' ^ ( LT !)* expression ( LT !)* ':' ( LT !)* ( statementList )? )
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:193:5: 'case' ^ ( LT !)* expression ( LT !)* ':' ( LT !)* ( statementList )?
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal204=(Token)match(input,79,FOLLOW_79_in_caseClause1231); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal204_tree = 
            (CommonTree)adaptor.create(string_literal204)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(string_literal204_tree, root_0);
            }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:193:15: ( LT !)*
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==LT) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:193:15: LT !
            	    {
            	    LT205=(Token)match(input,LT,FOLLOW_LT_in_caseClause1234); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop96;
                }
            } while (true);


            pushFollow(FOLLOW_expression_in_caseClause1238);
            expression206=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression206.getTree());

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:193:31: ( LT !)*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==LT) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:193:31: LT !
            	    {
            	    LT207=(Token)match(input,LT,FOLLOW_LT_in_caseClause1240); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop97;
                }
            } while (true);


            char_literal208=(Token)match(input,58,FOLLOW_58_in_caseClause1244); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal208_tree = 
            (CommonTree)adaptor.create(char_literal208)
            ;
            adaptor.addChild(root_0, char_literal208_tree);
            }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:193:40: ( LT !)*
            loop98:
            do {
                int alt98=2;
                int LA98_0 = input.LA(1);

                if ( (LA98_0==LT) ) {
                    int LA98_2 = input.LA(2);

                    if ( (synpred118_Javascript()) ) {
                        alt98=1;
                    }


                }


                switch (alt98) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:193:40: LT !
            	    {
            	    LT209=(Token)match(input,LT,FOLLOW_LT_in_caseClause1246); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop98;
                }
            } while (true);


            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:193:43: ( statementList )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==Identifier||LA99_0==NumericLiteral||LA99_0==StringLiteral||LA99_0==36||LA99_0==44||(LA99_0 >= 48 && LA99_0 <= 49)||(LA99_0 >= 52 && LA99_0 <= 53)||LA99_0==59||LA99_0==74||LA99_0==78||LA99_0==81||(LA99_0 >= 83 && LA99_0 <= 84)||LA99_0==86||(LA99_0 >= 88 && LA99_0 <= 90)||(LA99_0 >= 93 && LA99_0 <= 106)||LA99_0==111) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:193:43: statementList
                    {
                    pushFollow(FOLLOW_statementList_in_caseClause1250);
                    statementList210=statementList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList210.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 35, caseClause_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "caseClause"


    public static class defaultClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "defaultClause"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:196:1: defaultClause : 'default' ^ ( LT !)* ':' ( LT !)* ( statementList )? ;
    public final JavascriptParser.defaultClause_return defaultClause() throws RecognitionException {
        JavascriptParser.defaultClause_return retval = new JavascriptParser.defaultClause_return();
        retval.start = input.LT(1);

        int defaultClause_StartIndex = input.index();

        CommonTree root_0 = null;

        Token string_literal211=null;
        Token LT212=null;
        Token char_literal213=null;
        Token LT214=null;
        JavascriptParser.statementList_return statementList215 =null;


        CommonTree string_literal211_tree=null;
        CommonTree LT212_tree=null;
        CommonTree char_literal213_tree=null;
        CommonTree LT214_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:197:3: ( 'default' ^ ( LT !)* ':' ( LT !)* ( statementList )? )
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:197:5: 'default' ^ ( LT !)* ':' ( LT !)* ( statementList )?
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal211=(Token)match(input,82,FOLLOW_82_in_defaultClause1264); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal211_tree = 
            (CommonTree)adaptor.create(string_literal211)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(string_literal211_tree, root_0);
            }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:197:18: ( LT !)*
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==LT) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:197:18: LT !
            	    {
            	    LT212=(Token)match(input,LT,FOLLOW_LT_in_defaultClause1267); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop100;
                }
            } while (true);


            char_literal213=(Token)match(input,58,FOLLOW_58_in_defaultClause1271); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal213_tree = 
            (CommonTree)adaptor.create(char_literal213)
            ;
            adaptor.addChild(root_0, char_literal213_tree);
            }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:197:27: ( LT !)*
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( (LA101_0==LT) ) {
                    int LA101_2 = input.LA(2);

                    if ( (synpred121_Javascript()) ) {
                        alt101=1;
                    }


                }


                switch (alt101) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:197:27: LT !
            	    {
            	    LT214=(Token)match(input,LT,FOLLOW_LT_in_defaultClause1273); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop101;
                }
            } while (true);


            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:197:30: ( statementList )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==Identifier||LA102_0==NumericLiteral||LA102_0==StringLiteral||LA102_0==36||LA102_0==44||(LA102_0 >= 48 && LA102_0 <= 49)||(LA102_0 >= 52 && LA102_0 <= 53)||LA102_0==59||LA102_0==74||LA102_0==78||LA102_0==81||(LA102_0 >= 83 && LA102_0 <= 84)||LA102_0==86||(LA102_0 >= 88 && LA102_0 <= 90)||(LA102_0 >= 93 && LA102_0 <= 106)||LA102_0==111) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:197:30: statementList
                    {
                    pushFollow(FOLLOW_statementList_in_defaultClause1277);
                    statementList215=statementList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList215.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 36, defaultClause_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "defaultClause"


    public static class throwStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "throwStatement"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:200:1: throwStatement : 'throw' ^ expression ( LT | ';' ) !;
    public final JavascriptParser.throwStatement_return throwStatement() throws RecognitionException {
        JavascriptParser.throwStatement_return retval = new JavascriptParser.throwStatement_return();
        retval.start = input.LT(1);

        int throwStatement_StartIndex = input.index();

        CommonTree root_0 = null;

        Token string_literal216=null;
        Token set218=null;
        JavascriptParser.expression_return expression217 =null;


        CommonTree string_literal216_tree=null;
        CommonTree set218_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:201:3: ( 'throw' ^ expression ( LT | ';' ) !)
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:201:5: 'throw' ^ expression ( LT | ';' ) !
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal216=(Token)match(input,98,FOLLOW_98_in_throwStatement1291); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal216_tree = 
            (CommonTree)adaptor.create(string_literal216)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(string_literal216_tree, root_0);
            }

            pushFollow(FOLLOW_expression_in_throwStatement1294);
            expression217=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression217.getTree());

            set218=(Token)input.LT(1);

            if ( input.LA(1)==LT||input.LA(1)==59 ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 37, throwStatement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "throwStatement"


    public static class tryStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tryStatement"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:204:1: tryStatement : 'try' ^ ( LT !)* statementBlock ( LT !)* ( finallyClause | catchClause ( ( LT !)* finallyClause )? ) ;
    public final JavascriptParser.tryStatement_return tryStatement() throws RecognitionException {
        JavascriptParser.tryStatement_return retval = new JavascriptParser.tryStatement_return();
        retval.start = input.LT(1);

        int tryStatement_StartIndex = input.index();

        CommonTree root_0 = null;

        Token string_literal219=null;
        Token LT220=null;
        Token LT222=null;
        Token LT225=null;
        JavascriptParser.statementBlock_return statementBlock221 =null;

        JavascriptParser.finallyClause_return finallyClause223 =null;

        JavascriptParser.catchClause_return catchClause224 =null;

        JavascriptParser.finallyClause_return finallyClause226 =null;


        CommonTree string_literal219_tree=null;
        CommonTree LT220_tree=null;
        CommonTree LT222_tree=null;
        CommonTree LT225_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:205:3: ( 'try' ^ ( LT !)* statementBlock ( LT !)* ( finallyClause | catchClause ( ( LT !)* finallyClause )? ) )
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:205:5: 'try' ^ ( LT !)* statementBlock ( LT !)* ( finallyClause | catchClause ( ( LT !)* finallyClause )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal219=(Token)match(input,100,FOLLOW_100_in_tryStatement1316); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal219_tree = 
            (CommonTree)adaptor.create(string_literal219)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(string_literal219_tree, root_0);
            }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:205:14: ( LT !)*
            loop103:
            do {
                int alt103=2;
                int LA103_0 = input.LA(1);

                if ( (LA103_0==LT) ) {
                    alt103=1;
                }


                switch (alt103) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:205:14: LT !
            	    {
            	    LT220=(Token)match(input,LT,FOLLOW_LT_in_tryStatement1319); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop103;
                }
            } while (true);


            pushFollow(FOLLOW_statementBlock_in_tryStatement1323);
            statementBlock221=statementBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statementBlock221.getTree());

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:205:34: ( LT !)*
            loop104:
            do {
                int alt104=2;
                int LA104_0 = input.LA(1);

                if ( (LA104_0==LT) ) {
                    alt104=1;
                }


                switch (alt104) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:205:34: LT !
            	    {
            	    LT222=(Token)match(input,LT,FOLLOW_LT_in_tryStatement1325); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop104;
                }
            } while (true);


            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:205:37: ( finallyClause | catchClause ( ( LT !)* finallyClause )? )
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==87) ) {
                alt107=1;
            }
            else if ( (LA107_0==80) ) {
                alt107=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;

            }
            switch (alt107) {
                case 1 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:205:38: finallyClause
                    {
                    pushFollow(FOLLOW_finallyClause_in_tryStatement1330);
                    finallyClause223=finallyClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, finallyClause223.getTree());

                    }
                    break;
                case 2 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:205:54: catchClause ( ( LT !)* finallyClause )?
                    {
                    pushFollow(FOLLOW_catchClause_in_tryStatement1334);
                    catchClause224=catchClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, catchClause224.getTree());

                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:205:66: ( ( LT !)* finallyClause )?
                    int alt106=2;
                    alt106 = dfa106.predict(input);
                    switch (alt106) {
                        case 1 :
                            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:205:67: ( LT !)* finallyClause
                            {
                            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:205:69: ( LT !)*
                            loop105:
                            do {
                                int alt105=2;
                                int LA105_0 = input.LA(1);

                                if ( (LA105_0==LT) ) {
                                    alt105=1;
                                }


                                switch (alt105) {
                            	case 1 :
                            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:205:69: LT !
                            	    {
                            	    LT225=(Token)match(input,LT,FOLLOW_LT_in_tryStatement1337); if (state.failed) return retval;

                            	    }
                            	    break;

                            	default :
                            	    break loop105;
                                }
                            } while (true);


                            pushFollow(FOLLOW_finallyClause_in_tryStatement1341);
                            finallyClause226=finallyClause();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, finallyClause226.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 38, tryStatement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "tryStatement"


    public static class catchClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "catchClause"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:208:1: catchClause : 'catch' ^ ( LT !)* '(' ( LT !)* Identifier ( LT !)* ')' ( LT !)* statementBlock ;
    public final JavascriptParser.catchClause_return catchClause() throws RecognitionException {
        JavascriptParser.catchClause_return retval = new JavascriptParser.catchClause_return();
        retval.start = input.LT(1);

        int catchClause_StartIndex = input.index();

        CommonTree root_0 = null;

        Token string_literal227=null;
        Token LT228=null;
        Token char_literal229=null;
        Token LT230=null;
        Token Identifier231=null;
        Token LT232=null;
        Token char_literal233=null;
        Token LT234=null;
        JavascriptParser.statementBlock_return statementBlock235 =null;


        CommonTree string_literal227_tree=null;
        CommonTree LT228_tree=null;
        CommonTree char_literal229_tree=null;
        CommonTree LT230_tree=null;
        CommonTree Identifier231_tree=null;
        CommonTree LT232_tree=null;
        CommonTree char_literal233_tree=null;
        CommonTree LT234_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:209:3: ( 'catch' ^ ( LT !)* '(' ( LT !)* Identifier ( LT !)* ')' ( LT !)* statementBlock )
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:209:5: 'catch' ^ ( LT !)* '(' ( LT !)* Identifier ( LT !)* ')' ( LT !)* statementBlock
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal227=(Token)match(input,80,FOLLOW_80_in_catchClause1357); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal227_tree = 
            (CommonTree)adaptor.create(string_literal227)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(string_literal227_tree, root_0);
            }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:209:16: ( LT !)*
            loop108:
            do {
                int alt108=2;
                int LA108_0 = input.LA(1);

                if ( (LA108_0==LT) ) {
                    alt108=1;
                }


                switch (alt108) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:209:16: LT !
            	    {
            	    LT228=(Token)match(input,LT,FOLLOW_LT_in_catchClause1360); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop108;
                }
            } while (true);


            char_literal229=(Token)match(input,44,FOLLOW_44_in_catchClause1364); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal229_tree = 
            (CommonTree)adaptor.create(char_literal229)
            ;
            adaptor.addChild(root_0, char_literal229_tree);
            }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:209:25: ( LT !)*
            loop109:
            do {
                int alt109=2;
                int LA109_0 = input.LA(1);

                if ( (LA109_0==LT) ) {
                    alt109=1;
                }


                switch (alt109) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:209:25: LT !
            	    {
            	    LT230=(Token)match(input,LT,FOLLOW_LT_in_catchClause1366); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop109;
                }
            } while (true);


            Identifier231=(Token)match(input,Identifier,FOLLOW_Identifier_in_catchClause1370); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier231_tree = 
            (CommonTree)adaptor.create(Identifier231)
            ;
            adaptor.addChild(root_0, Identifier231_tree);
            }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:209:41: ( LT !)*
            loop110:
            do {
                int alt110=2;
                int LA110_0 = input.LA(1);

                if ( (LA110_0==LT) ) {
                    alt110=1;
                }


                switch (alt110) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:209:41: LT !
            	    {
            	    LT232=(Token)match(input,LT,FOLLOW_LT_in_catchClause1372); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop110;
                }
            } while (true);


            char_literal233=(Token)match(input,45,FOLLOW_45_in_catchClause1376); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal233_tree = 
            (CommonTree)adaptor.create(char_literal233)
            ;
            adaptor.addChild(root_0, char_literal233_tree);
            }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:209:50: ( LT !)*
            loop111:
            do {
                int alt111=2;
                int LA111_0 = input.LA(1);

                if ( (LA111_0==LT) ) {
                    alt111=1;
                }


                switch (alt111) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:209:50: LT !
            	    {
            	    LT234=(Token)match(input,LT,FOLLOW_LT_in_catchClause1378); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop111;
                }
            } while (true);


            pushFollow(FOLLOW_statementBlock_in_catchClause1382);
            statementBlock235=statementBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statementBlock235.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 39, catchClause_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "catchClause"


    public static class finallyClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "finallyClause"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:212:1: finallyClause : 'finally' ^ ( LT !)* statementBlock ;
    public final JavascriptParser.finallyClause_return finallyClause() throws RecognitionException {
        JavascriptParser.finallyClause_return retval = new JavascriptParser.finallyClause_return();
        retval.start = input.LT(1);

        int finallyClause_StartIndex = input.index();

        CommonTree root_0 = null;

        Token string_literal236=null;
        Token LT237=null;
        JavascriptParser.statementBlock_return statementBlock238 =null;


        CommonTree string_literal236_tree=null;
        CommonTree LT237_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:213:3: ( 'finally' ^ ( LT !)* statementBlock )
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:213:5: 'finally' ^ ( LT !)* statementBlock
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal236=(Token)match(input,87,FOLLOW_87_in_finallyClause1395); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal236_tree = 
            (CommonTree)adaptor.create(string_literal236)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(string_literal236_tree, root_0);
            }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:213:18: ( LT !)*
            loop112:
            do {
                int alt112=2;
                int LA112_0 = input.LA(1);

                if ( (LA112_0==LT) ) {
                    alt112=1;
                }


                switch (alt112) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:213:18: LT !
            	    {
            	    LT237=(Token)match(input,LT,FOLLOW_LT_in_finallyClause1398); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop112;
                }
            } while (true);


            pushFollow(FOLLOW_statementBlock_in_finallyClause1402);
            statementBlock238=statementBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statementBlock238.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 40, finallyClause_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "finallyClause"


    public static class expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:217:1: expression : assignmentExpression ( ( LT !)* ',' ( LT !)* assignmentExpression )* ;
    public final JavascriptParser.expression_return expression() throws RecognitionException {
        JavascriptParser.expression_return retval = new JavascriptParser.expression_return();
        retval.start = input.LT(1);

        int expression_StartIndex = input.index();

        CommonTree root_0 = null;

        Token LT240=null;
        Token char_literal241=null;
        Token LT242=null;
        JavascriptParser.assignmentExpression_return assignmentExpression239 =null;

        JavascriptParser.assignmentExpression_return assignmentExpression243 =null;


        CommonTree LT240_tree=null;
        CommonTree char_literal241_tree=null;
        CommonTree LT242_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:218:3: ( assignmentExpression ( ( LT !)* ',' ( LT !)* assignmentExpression )* )
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:218:5: assignmentExpression ( ( LT !)* ',' ( LT !)* assignmentExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_assignmentExpression_in_expression1416);
            assignmentExpression239=assignmentExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpression239.getTree());

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:218:26: ( ( LT !)* ',' ( LT !)* assignmentExpression )*
            loop115:
            do {
                int alt115=2;
                alt115 = dfa115.predict(input);
                switch (alt115) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:218:27: ( LT !)* ',' ( LT !)* assignmentExpression
            	    {
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:218:29: ( LT !)*
            	    loop113:
            	    do {
            	        int alt113=2;
            	        int LA113_0 = input.LA(1);

            	        if ( (LA113_0==LT) ) {
            	            alt113=1;
            	        }


            	        switch (alt113) {
            	    	case 1 :
            	    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:218:29: LT !
            	    	    {
            	    	    LT240=(Token)match(input,LT,FOLLOW_LT_in_expression1419); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop113;
            	        }
            	    } while (true);


            	    char_literal241=(Token)match(input,51,FOLLOW_51_in_expression1423); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal241_tree = 
            	    (CommonTree)adaptor.create(char_literal241)
            	    ;
            	    adaptor.addChild(root_0, char_literal241_tree);
            	    }

            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:218:38: ( LT !)*
            	    loop114:
            	    do {
            	        int alt114=2;
            	        int LA114_0 = input.LA(1);

            	        if ( (LA114_0==LT) ) {
            	            alt114=1;
            	        }


            	        switch (alt114) {
            	    	case 1 :
            	    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:218:38: LT !
            	    	    {
            	    	    LT242=(Token)match(input,LT,FOLLOW_LT_in_expression1425); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop114;
            	        }
            	    } while (true);


            	    pushFollow(FOLLOW_assignmentExpression_in_expression1429);
            	    assignmentExpression243=assignmentExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpression243.getTree());

            	    }
            	    break;

            	default :
            	    break loop115;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 41, expression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "expression"


    public static class expressionNoIn_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expressionNoIn"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:221:1: expressionNoIn : assignmentExpressionNoIn ( ( LT !)* ',' ( LT !)* assignmentExpressionNoIn )* ;
    public final JavascriptParser.expressionNoIn_return expressionNoIn() throws RecognitionException {
        JavascriptParser.expressionNoIn_return retval = new JavascriptParser.expressionNoIn_return();
        retval.start = input.LT(1);

        int expressionNoIn_StartIndex = input.index();

        CommonTree root_0 = null;

        Token LT245=null;
        Token char_literal246=null;
        Token LT247=null;
        JavascriptParser.assignmentExpressionNoIn_return assignmentExpressionNoIn244 =null;

        JavascriptParser.assignmentExpressionNoIn_return assignmentExpressionNoIn248 =null;


        CommonTree LT245_tree=null;
        CommonTree char_literal246_tree=null;
        CommonTree LT247_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:222:3: ( assignmentExpressionNoIn ( ( LT !)* ',' ( LT !)* assignmentExpressionNoIn )* )
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:222:5: assignmentExpressionNoIn ( ( LT !)* ',' ( LT !)* assignmentExpressionNoIn )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_assignmentExpressionNoIn_in_expressionNoIn1444);
            assignmentExpressionNoIn244=assignmentExpressionNoIn();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpressionNoIn244.getTree());

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:222:30: ( ( LT !)* ',' ( LT !)* assignmentExpressionNoIn )*
            loop118:
            do {
                int alt118=2;
                alt118 = dfa118.predict(input);
                switch (alt118) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:222:31: ( LT !)* ',' ( LT !)* assignmentExpressionNoIn
            	    {
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:222:33: ( LT !)*
            	    loop116:
            	    do {
            	        int alt116=2;
            	        int LA116_0 = input.LA(1);

            	        if ( (LA116_0==LT) ) {
            	            alt116=1;
            	        }


            	        switch (alt116) {
            	    	case 1 :
            	    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:222:33: LT !
            	    	    {
            	    	    LT245=(Token)match(input,LT,FOLLOW_LT_in_expressionNoIn1447); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop116;
            	        }
            	    } while (true);


            	    char_literal246=(Token)match(input,51,FOLLOW_51_in_expressionNoIn1451); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal246_tree = 
            	    (CommonTree)adaptor.create(char_literal246)
            	    ;
            	    adaptor.addChild(root_0, char_literal246_tree);
            	    }

            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:222:42: ( LT !)*
            	    loop117:
            	    do {
            	        int alt117=2;
            	        int LA117_0 = input.LA(1);

            	        if ( (LA117_0==LT) ) {
            	            alt117=1;
            	        }


            	        switch (alt117) {
            	    	case 1 :
            	    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:222:42: LT !
            	    	    {
            	    	    LT247=(Token)match(input,LT,FOLLOW_LT_in_expressionNoIn1453); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop117;
            	        }
            	    } while (true);


            	    pushFollow(FOLLOW_assignmentExpressionNoIn_in_expressionNoIn1457);
            	    assignmentExpressionNoIn248=assignmentExpressionNoIn();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpressionNoIn248.getTree());

            	    }
            	    break;

            	default :
            	    break loop118;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 42, expressionNoIn_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "expressionNoIn"


    public static class assignmentExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignmentExpression"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:225:1: assignmentExpression : ( conditionalExpression | leftHandSideExpression ( LT !)* assignmentOperator ^ ( LT !)* assignmentExpression );
    public final JavascriptParser.assignmentExpression_return assignmentExpression() throws RecognitionException {
        JavascriptParser.assignmentExpression_return retval = new JavascriptParser.assignmentExpression_return();
        retval.start = input.LT(1);

        int assignmentExpression_StartIndex = input.index();

        CommonTree root_0 = null;

        Token LT251=null;
        Token LT253=null;
        JavascriptParser.conditionalExpression_return conditionalExpression249 =null;

        JavascriptParser.leftHandSideExpression_return leftHandSideExpression250 =null;

        JavascriptParser.assignmentOperator_return assignmentOperator252 =null;

        JavascriptParser.assignmentExpression_return assignmentExpression254 =null;


        CommonTree LT251_tree=null;
        CommonTree LT253_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:226:3: ( conditionalExpression | leftHandSideExpression ( LT !)* assignmentOperator ^ ( LT !)* assignmentExpression )
            int alt121=2;
            switch ( input.LA(1) ) {
            case 97:
                {
                int LA121_1 = input.LA(2);

                if ( (synpred140_Javascript()) ) {
                    alt121=1;
                }
                else if ( (true) ) {
                    alt121=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 121, 1, input);

                    throw nvae;

                }
                }
                break;
            case Identifier:
                {
                int LA121_2 = input.LA(2);

                if ( (synpred140_Javascript()) ) {
                    alt121=1;
                }
                else if ( (true) ) {
                    alt121=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 121, 2, input);

                    throw nvae;

                }
                }
                break;
            case 94:
                {
                int LA121_3 = input.LA(2);

                if ( (synpred140_Javascript()) ) {
                    alt121=1;
                }
                else if ( (true) ) {
                    alt121=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 121, 3, input);

                    throw nvae;

                }
                }
                break;
            case 99:
                {
                int LA121_4 = input.LA(2);

                if ( (synpred140_Javascript()) ) {
                    alt121=1;
                }
                else if ( (true) ) {
                    alt121=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 121, 4, input);

                    throw nvae;

                }
                }
                break;
            case 86:
                {
                int LA121_5 = input.LA(2);

                if ( (synpred140_Javascript()) ) {
                    alt121=1;
                }
                else if ( (true) ) {
                    alt121=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 121, 5, input);

                    throw nvae;

                }
                }
                break;
            case StringLiteral:
                {
                int LA121_6 = input.LA(2);

                if ( (synpred140_Javascript()) ) {
                    alt121=1;
                }
                else if ( (true) ) {
                    alt121=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 121, 6, input);

                    throw nvae;

                }
                }
                break;
            case NumericLiteral:
                {
                int LA121_7 = input.LA(2);

                if ( (synpred140_Javascript()) ) {
                    alt121=1;
                }
                else if ( (true) ) {
                    alt121=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 121, 7, input);

                    throw nvae;

                }
                }
                break;
            case 74:
                {
                int LA121_8 = input.LA(2);

                if ( (synpred140_Javascript()) ) {
                    alt121=1;
                }
                else if ( (true) ) {
                    alt121=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 121, 8, input);

                    throw nvae;

                }
                }
                break;
            case 106:
                {
                int LA121_9 = input.LA(2);

                if ( (synpred140_Javascript()) ) {
                    alt121=1;
                }
                else if ( (true) ) {
                    alt121=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 121, 9, input);

                    throw nvae;

                }
                }
                break;
            case 44:
                {
                int LA121_10 = input.LA(2);

                if ( (synpred140_Javascript()) ) {
                    alt121=1;
                }
                else if ( (true) ) {
                    alt121=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 121, 10, input);

                    throw nvae;

                }
                }
                break;
            case 89:
                {
                int LA121_11 = input.LA(2);

                if ( (synpred140_Javascript()) ) {
                    alt121=1;
                }
                else if ( (true) ) {
                    alt121=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 121, 11, input);

                    throw nvae;

                }
                }
                break;
            case 93:
                {
                int LA121_12 = input.LA(2);

                if ( (synpred140_Javascript()) ) {
                    alt121=1;
                }
                else if ( (true) ) {
                    alt121=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 121, 12, input);

                    throw nvae;

                }
                }
                break;
            case 36:
            case 48:
            case 49:
            case 52:
            case 53:
            case 83:
            case 101:
            case 103:
            case 111:
                {
                alt121=1;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 121, 0, input);

                throw nvae;

            }

            switch (alt121) {
                case 1 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:226:5: conditionalExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_conditionalExpression_in_assignmentExpression1472);
                    conditionalExpression249=conditionalExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression249.getTree());

                    }
                    break;
                case 2 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:227:5: leftHandSideExpression ( LT !)* assignmentOperator ^ ( LT !)* assignmentExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_leftHandSideExpression_in_assignmentExpression1478);
                    leftHandSideExpression250=leftHandSideExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, leftHandSideExpression250.getTree());

                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:227:30: ( LT !)*
                    loop119:
                    do {
                        int alt119=2;
                        int LA119_0 = input.LA(1);

                        if ( (LA119_0==LT) ) {
                            alt119=1;
                        }


                        switch (alt119) {
                    	case 1 :
                    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:227:30: LT !
                    	    {
                    	    LT251=(Token)match(input,LT,FOLLOW_LT_in_assignmentExpression1480); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop119;
                        }
                    } while (true);


                    pushFollow(FOLLOW_assignmentOperator_in_assignmentExpression1484);
                    assignmentOperator252=assignmentOperator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(assignmentOperator252.getTree(), root_0);

                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:227:55: ( LT !)*
                    loop120:
                    do {
                        int alt120=2;
                        int LA120_0 = input.LA(1);

                        if ( (LA120_0==LT) ) {
                            alt120=1;
                        }


                        switch (alt120) {
                    	case 1 :
                    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:227:55: LT !
                    	    {
                    	    LT253=(Token)match(input,LT,FOLLOW_LT_in_assignmentExpression1487); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop120;
                        }
                    } while (true);


                    pushFollow(FOLLOW_assignmentExpression_in_assignmentExpression1491);
                    assignmentExpression254=assignmentExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpression254.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 43, assignmentExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "assignmentExpression"


    public static class assignmentExpressionNoIn_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignmentExpressionNoIn"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:230:1: assignmentExpressionNoIn : ( conditionalExpressionNoIn | leftHandSideExpression ( LT !)* assignmentOperator ^ ( LT !)* assignmentExpressionNoIn );
    public final JavascriptParser.assignmentExpressionNoIn_return assignmentExpressionNoIn() throws RecognitionException {
        JavascriptParser.assignmentExpressionNoIn_return retval = new JavascriptParser.assignmentExpressionNoIn_return();
        retval.start = input.LT(1);

        int assignmentExpressionNoIn_StartIndex = input.index();

        CommonTree root_0 = null;

        Token LT257=null;
        Token LT259=null;
        JavascriptParser.conditionalExpressionNoIn_return conditionalExpressionNoIn255 =null;

        JavascriptParser.leftHandSideExpression_return leftHandSideExpression256 =null;

        JavascriptParser.assignmentOperator_return assignmentOperator258 =null;

        JavascriptParser.assignmentExpressionNoIn_return assignmentExpressionNoIn260 =null;


        CommonTree LT257_tree=null;
        CommonTree LT259_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:231:3: ( conditionalExpressionNoIn | leftHandSideExpression ( LT !)* assignmentOperator ^ ( LT !)* assignmentExpressionNoIn )
            int alt124=2;
            switch ( input.LA(1) ) {
            case 97:
                {
                int LA124_1 = input.LA(2);

                if ( (synpred143_Javascript()) ) {
                    alt124=1;
                }
                else if ( (true) ) {
                    alt124=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 124, 1, input);

                    throw nvae;

                }
                }
                break;
            case Identifier:
                {
                int LA124_2 = input.LA(2);

                if ( (synpred143_Javascript()) ) {
                    alt124=1;
                }
                else if ( (true) ) {
                    alt124=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 124, 2, input);

                    throw nvae;

                }
                }
                break;
            case 94:
                {
                int LA124_3 = input.LA(2);

                if ( (synpred143_Javascript()) ) {
                    alt124=1;
                }
                else if ( (true) ) {
                    alt124=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 124, 3, input);

                    throw nvae;

                }
                }
                break;
            case 99:
                {
                int LA124_4 = input.LA(2);

                if ( (synpred143_Javascript()) ) {
                    alt124=1;
                }
                else if ( (true) ) {
                    alt124=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 124, 4, input);

                    throw nvae;

                }
                }
                break;
            case 86:
                {
                int LA124_5 = input.LA(2);

                if ( (synpred143_Javascript()) ) {
                    alt124=1;
                }
                else if ( (true) ) {
                    alt124=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 124, 5, input);

                    throw nvae;

                }
                }
                break;
            case StringLiteral:
                {
                int LA124_6 = input.LA(2);

                if ( (synpred143_Javascript()) ) {
                    alt124=1;
                }
                else if ( (true) ) {
                    alt124=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 124, 6, input);

                    throw nvae;

                }
                }
                break;
            case NumericLiteral:
                {
                int LA124_7 = input.LA(2);

                if ( (synpred143_Javascript()) ) {
                    alt124=1;
                }
                else if ( (true) ) {
                    alt124=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 124, 7, input);

                    throw nvae;

                }
                }
                break;
            case 74:
                {
                int LA124_8 = input.LA(2);

                if ( (synpred143_Javascript()) ) {
                    alt124=1;
                }
                else if ( (true) ) {
                    alt124=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 124, 8, input);

                    throw nvae;

                }
                }
                break;
            case 106:
                {
                int LA124_9 = input.LA(2);

                if ( (synpred143_Javascript()) ) {
                    alt124=1;
                }
                else if ( (true) ) {
                    alt124=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 124, 9, input);

                    throw nvae;

                }
                }
                break;
            case 44:
                {
                int LA124_10 = input.LA(2);

                if ( (synpred143_Javascript()) ) {
                    alt124=1;
                }
                else if ( (true) ) {
                    alt124=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 124, 10, input);

                    throw nvae;

                }
                }
                break;
            case 89:
                {
                int LA124_11 = input.LA(2);

                if ( (synpred143_Javascript()) ) {
                    alt124=1;
                }
                else if ( (true) ) {
                    alt124=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 124, 11, input);

                    throw nvae;

                }
                }
                break;
            case 93:
                {
                int LA124_12 = input.LA(2);

                if ( (synpred143_Javascript()) ) {
                    alt124=1;
                }
                else if ( (true) ) {
                    alt124=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 124, 12, input);

                    throw nvae;

                }
                }
                break;
            case 36:
            case 48:
            case 49:
            case 52:
            case 53:
            case 83:
            case 101:
            case 103:
            case 111:
                {
                alt124=1;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 124, 0, input);

                throw nvae;

            }

            switch (alt124) {
                case 1 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:231:5: conditionalExpressionNoIn
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_conditionalExpressionNoIn_in_assignmentExpressionNoIn1504);
                    conditionalExpressionNoIn255=conditionalExpressionNoIn();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpressionNoIn255.getTree());

                    }
                    break;
                case 2 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:232:5: leftHandSideExpression ( LT !)* assignmentOperator ^ ( LT !)* assignmentExpressionNoIn
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_leftHandSideExpression_in_assignmentExpressionNoIn1510);
                    leftHandSideExpression256=leftHandSideExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, leftHandSideExpression256.getTree());

                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:232:30: ( LT !)*
                    loop122:
                    do {
                        int alt122=2;
                        int LA122_0 = input.LA(1);

                        if ( (LA122_0==LT) ) {
                            alt122=1;
                        }


                        switch (alt122) {
                    	case 1 :
                    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:232:30: LT !
                    	    {
                    	    LT257=(Token)match(input,LT,FOLLOW_LT_in_assignmentExpressionNoIn1512); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop122;
                        }
                    } while (true);


                    pushFollow(FOLLOW_assignmentOperator_in_assignmentExpressionNoIn1516);
                    assignmentOperator258=assignmentOperator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(assignmentOperator258.getTree(), root_0);

                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:232:55: ( LT !)*
                    loop123:
                    do {
                        int alt123=2;
                        int LA123_0 = input.LA(1);

                        if ( (LA123_0==LT) ) {
                            alt123=1;
                        }


                        switch (alt123) {
                    	case 1 :
                    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:232:55: LT !
                    	    {
                    	    LT259=(Token)match(input,LT,FOLLOW_LT_in_assignmentExpressionNoIn1519); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop123;
                        }
                    } while (true);


                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_assignmentExpressionNoIn1523);
                    assignmentExpressionNoIn260=assignmentExpressionNoIn();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpressionNoIn260.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 44, assignmentExpressionNoIn_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "assignmentExpressionNoIn"


    public static class leftHandSideExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "leftHandSideExpression"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:235:1: leftHandSideExpression : ( callExpression | newExpression );
    public final JavascriptParser.leftHandSideExpression_return leftHandSideExpression() throws RecognitionException {
        JavascriptParser.leftHandSideExpression_return retval = new JavascriptParser.leftHandSideExpression_return();
        retval.start = input.LT(1);

        int leftHandSideExpression_StartIndex = input.index();

        CommonTree root_0 = null;

        JavascriptParser.callExpression_return callExpression261 =null;

        JavascriptParser.newExpression_return newExpression262 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:236:3: ( callExpression | newExpression )
            int alt125=2;
            switch ( input.LA(1) ) {
            case 97:
                {
                int LA125_1 = input.LA(2);

                if ( (synpred146_Javascript()) ) {
                    alt125=1;
                }
                else if ( (true) ) {
                    alt125=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 125, 1, input);

                    throw nvae;

                }
                }
                break;
            case Identifier:
                {
                int LA125_2 = input.LA(2);

                if ( (synpred146_Javascript()) ) {
                    alt125=1;
                }
                else if ( (true) ) {
                    alt125=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 125, 2, input);

                    throw nvae;

                }
                }
                break;
            case 94:
                {
                int LA125_3 = input.LA(2);

                if ( (synpred146_Javascript()) ) {
                    alt125=1;
                }
                else if ( (true) ) {
                    alt125=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 125, 3, input);

                    throw nvae;

                }
                }
                break;
            case 99:
                {
                int LA125_4 = input.LA(2);

                if ( (synpred146_Javascript()) ) {
                    alt125=1;
                }
                else if ( (true) ) {
                    alt125=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 125, 4, input);

                    throw nvae;

                }
                }
                break;
            case 86:
                {
                int LA125_5 = input.LA(2);

                if ( (synpred146_Javascript()) ) {
                    alt125=1;
                }
                else if ( (true) ) {
                    alt125=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 125, 5, input);

                    throw nvae;

                }
                }
                break;
            case StringLiteral:
                {
                int LA125_6 = input.LA(2);

                if ( (synpred146_Javascript()) ) {
                    alt125=1;
                }
                else if ( (true) ) {
                    alt125=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 125, 6, input);

                    throw nvae;

                }
                }
                break;
            case NumericLiteral:
                {
                int LA125_7 = input.LA(2);

                if ( (synpred146_Javascript()) ) {
                    alt125=1;
                }
                else if ( (true) ) {
                    alt125=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 125, 7, input);

                    throw nvae;

                }
                }
                break;
            case 74:
                {
                int LA125_8 = input.LA(2);

                if ( (synpred146_Javascript()) ) {
                    alt125=1;
                }
                else if ( (true) ) {
                    alt125=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 125, 8, input);

                    throw nvae;

                }
                }
                break;
            case 106:
                {
                int LA125_9 = input.LA(2);

                if ( (synpred146_Javascript()) ) {
                    alt125=1;
                }
                else if ( (true) ) {
                    alt125=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 125, 9, input);

                    throw nvae;

                }
                }
                break;
            case 44:
                {
                int LA125_10 = input.LA(2);

                if ( (synpred146_Javascript()) ) {
                    alt125=1;
                }
                else if ( (true) ) {
                    alt125=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 125, 10, input);

                    throw nvae;

                }
                }
                break;
            case 89:
                {
                int LA125_11 = input.LA(2);

                if ( (synpred146_Javascript()) ) {
                    alt125=1;
                }
                else if ( (true) ) {
                    alt125=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 125, 11, input);

                    throw nvae;

                }
                }
                break;
            case 93:
                {
                int LA125_12 = input.LA(2);

                if ( (synpred146_Javascript()) ) {
                    alt125=1;
                }
                else if ( (true) ) {
                    alt125=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 125, 12, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 125, 0, input);

                throw nvae;

            }

            switch (alt125) {
                case 1 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:236:5: callExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_callExpression_in_leftHandSideExpression1536);
                    callExpression261=callExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, callExpression261.getTree());

                    }
                    break;
                case 2 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:237:5: newExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_newExpression_in_leftHandSideExpression1542);
                    newExpression262=newExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, newExpression262.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 45, leftHandSideExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "leftHandSideExpression"


    public static class newExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "newExpression"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:240:1: newExpression : ( memberExpression | 'new' ^ ( LT !)* newExpression );
    public final JavascriptParser.newExpression_return newExpression() throws RecognitionException {
        JavascriptParser.newExpression_return retval = new JavascriptParser.newExpression_return();
        retval.start = input.LT(1);

        int newExpression_StartIndex = input.index();

        CommonTree root_0 = null;

        Token string_literal264=null;
        Token LT265=null;
        JavascriptParser.memberExpression_return memberExpression263 =null;

        JavascriptParser.newExpression_return newExpression266 =null;


        CommonTree string_literal264_tree=null;
        CommonTree LT265_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:241:3: ( memberExpression | 'new' ^ ( LT !)* newExpression )
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==Identifier||LA127_0==NumericLiteral||LA127_0==StringLiteral||LA127_0==44||LA127_0==74||LA127_0==86||LA127_0==89||LA127_0==94||LA127_0==97||LA127_0==99||LA127_0==106) ) {
                alt127=1;
            }
            else if ( (LA127_0==93) ) {
                int LA127_12 = input.LA(2);

                if ( (synpred147_Javascript()) ) {
                    alt127=1;
                }
                else if ( (true) ) {
                    alt127=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 127, 12, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 127, 0, input);

                throw nvae;

            }
            switch (alt127) {
                case 1 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:241:5: memberExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_memberExpression_in_newExpression1555);
                    memberExpression263=memberExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, memberExpression263.getTree());

                    }
                    break;
                case 2 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:242:5: 'new' ^ ( LT !)* newExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal264=(Token)match(input,93,FOLLOW_93_in_newExpression1561); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal264_tree = 
                    (CommonTree)adaptor.create(string_literal264)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(string_literal264_tree, root_0);
                    }

                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:242:14: ( LT !)*
                    loop126:
                    do {
                        int alt126=2;
                        int LA126_0 = input.LA(1);

                        if ( (LA126_0==LT) ) {
                            alt126=1;
                        }


                        switch (alt126) {
                    	case 1 :
                    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:242:14: LT !
                    	    {
                    	    LT265=(Token)match(input,LT,FOLLOW_LT_in_newExpression1564); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop126;
                        }
                    } while (true);


                    pushFollow(FOLLOW_newExpression_in_newExpression1568);
                    newExpression266=newExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, newExpression266.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 46, newExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "newExpression"


    public static class memberExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "memberExpression"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:245:1: memberExpression : ( primaryExpression | functionExpression | 'new' ( LT !)* memberExpression ( LT !)* arguments ) ( ( LT !)* memberExpressionSuffix )* ;
    public final JavascriptParser.memberExpression_return memberExpression() throws RecognitionException {
        JavascriptParser.memberExpression_return retval = new JavascriptParser.memberExpression_return();
        retval.start = input.LT(1);

        int memberExpression_StartIndex = input.index();

        CommonTree root_0 = null;

        Token string_literal269=null;
        Token LT270=null;
        Token LT272=null;
        Token LT274=null;
        JavascriptParser.primaryExpression_return primaryExpression267 =null;

        JavascriptParser.functionExpression_return functionExpression268 =null;

        JavascriptParser.memberExpression_return memberExpression271 =null;

        JavascriptParser.arguments_return arguments273 =null;

        JavascriptParser.memberExpressionSuffix_return memberExpressionSuffix275 =null;


        CommonTree string_literal269_tree=null;
        CommonTree LT270_tree=null;
        CommonTree LT272_tree=null;
        CommonTree LT274_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:246:3: ( ( primaryExpression | functionExpression | 'new' ( LT !)* memberExpression ( LT !)* arguments ) ( ( LT !)* memberExpressionSuffix )* )
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:246:5: ( primaryExpression | functionExpression | 'new' ( LT !)* memberExpression ( LT !)* arguments ) ( ( LT !)* memberExpressionSuffix )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:246:5: ( primaryExpression | functionExpression | 'new' ( LT !)* memberExpression ( LT !)* arguments )
            int alt130=3;
            switch ( input.LA(1) ) {
            case Identifier:
            case NumericLiteral:
            case StringLiteral:
            case 44:
            case 74:
            case 86:
            case 94:
            case 97:
            case 99:
            case 106:
                {
                alt130=1;
                }
                break;
            case 89:
                {
                alt130=2;
                }
                break;
            case 93:
                {
                alt130=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 130, 0, input);

                throw nvae;

            }

            switch (alt130) {
                case 1 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:246:6: primaryExpression
                    {
                    pushFollow(FOLLOW_primaryExpression_in_memberExpression1582);
                    primaryExpression267=primaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primaryExpression267.getTree());

                    }
                    break;
                case 2 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:246:26: functionExpression
                    {
                    pushFollow(FOLLOW_functionExpression_in_memberExpression1586);
                    functionExpression268=functionExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionExpression268.getTree());

                    }
                    break;
                case 3 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:246:47: 'new' ( LT !)* memberExpression ( LT !)* arguments
                    {
                    string_literal269=(Token)match(input,93,FOLLOW_93_in_memberExpression1590); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal269_tree = 
                    (CommonTree)adaptor.create(string_literal269)
                    ;
                    adaptor.addChild(root_0, string_literal269_tree);
                    }

                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:246:55: ( LT !)*
                    loop128:
                    do {
                        int alt128=2;
                        int LA128_0 = input.LA(1);

                        if ( (LA128_0==LT) ) {
                            alt128=1;
                        }


                        switch (alt128) {
                    	case 1 :
                    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:246:55: LT !
                    	    {
                    	    LT270=(Token)match(input,LT,FOLLOW_LT_in_memberExpression1592); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop128;
                        }
                    } while (true);


                    pushFollow(FOLLOW_memberExpression_in_memberExpression1596);
                    memberExpression271=memberExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, memberExpression271.getTree());

                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:246:77: ( LT !)*
                    loop129:
                    do {
                        int alt129=2;
                        int LA129_0 = input.LA(1);

                        if ( (LA129_0==LT) ) {
                            alt129=1;
                        }


                        switch (alt129) {
                    	case 1 :
                    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:246:77: LT !
                    	    {
                    	    LT272=(Token)match(input,LT,FOLLOW_LT_in_memberExpression1598); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop129;
                        }
                    } while (true);


                    pushFollow(FOLLOW_arguments_in_memberExpression1602);
                    arguments273=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments273.getTree());

                    }
                    break;

            }


            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:246:91: ( ( LT !)* memberExpressionSuffix )*
            loop132:
            do {
                int alt132=2;
                int LA132_0 = input.LA(1);

                if ( (LA132_0==LT) ) {
                    int LA132_1 = input.LA(2);

                    if ( (synpred154_Javascript()) ) {
                        alt132=1;
                    }


                }
                else if ( (LA132_0==55||LA132_0==74) ) {
                    alt132=1;
                }


                switch (alt132) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:246:92: ( LT !)* memberExpressionSuffix
            	    {
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:246:94: ( LT !)*
            	    loop131:
            	    do {
            	        int alt131=2;
            	        int LA131_0 = input.LA(1);

            	        if ( (LA131_0==LT) ) {
            	            alt131=1;
            	        }


            	        switch (alt131) {
            	    	case 1 :
            	    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:246:94: LT !
            	    	    {
            	    	    LT274=(Token)match(input,LT,FOLLOW_LT_in_memberExpression1606); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop131;
            	        }
            	    } while (true);


            	    pushFollow(FOLLOW_memberExpressionSuffix_in_memberExpression1610);
            	    memberExpressionSuffix275=memberExpressionSuffix();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, memberExpressionSuffix275.getTree());

            	    }
            	    break;

            	default :
            	    break loop132;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 47, memberExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "memberExpression"


    public static class memberExpressionSuffix_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "memberExpressionSuffix"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:249:1: memberExpressionSuffix : ( indexSuffix | propertyReferenceSuffix );
    public final JavascriptParser.memberExpressionSuffix_return memberExpressionSuffix() throws RecognitionException {
        JavascriptParser.memberExpressionSuffix_return retval = new JavascriptParser.memberExpressionSuffix_return();
        retval.start = input.LT(1);

        int memberExpressionSuffix_StartIndex = input.index();

        CommonTree root_0 = null;

        JavascriptParser.indexSuffix_return indexSuffix276 =null;

        JavascriptParser.propertyReferenceSuffix_return propertyReferenceSuffix277 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:250:3: ( indexSuffix | propertyReferenceSuffix )
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==74) ) {
                alt133=1;
            }
            else if ( (LA133_0==55) ) {
                alt133=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 133, 0, input);

                throw nvae;

            }
            switch (alt133) {
                case 1 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:250:5: indexSuffix
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_indexSuffix_in_memberExpressionSuffix1625);
                    indexSuffix276=indexSuffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, indexSuffix276.getTree());

                    }
                    break;
                case 2 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:251:5: propertyReferenceSuffix
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_propertyReferenceSuffix_in_memberExpressionSuffix1631);
                    propertyReferenceSuffix277=propertyReferenceSuffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, propertyReferenceSuffix277.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 48, memberExpressionSuffix_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "memberExpressionSuffix"


    public static class callExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "callExpression"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:254:1: callExpression : memberExpression ( LT )* arguments ( ( LT )* callExpressionSuffix )* -> ^( CALL_EXPR_DEF memberExpression arguments ( callExpressionSuffix )* ) ;
    public final JavascriptParser.callExpression_return callExpression() throws RecognitionException {
        JavascriptParser.callExpression_return retval = new JavascriptParser.callExpression_return();
        retval.start = input.LT(1);

        int callExpression_StartIndex = input.index();

        CommonTree root_0 = null;

        Token LT279=null;
        Token LT281=null;
        JavascriptParser.memberExpression_return memberExpression278 =null;

        JavascriptParser.arguments_return arguments280 =null;

        JavascriptParser.callExpressionSuffix_return callExpressionSuffix282 =null;


        CommonTree LT279_tree=null;
        CommonTree LT281_tree=null;
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleSubtreeStream stream_memberExpression=new RewriteRuleSubtreeStream(adaptor,"rule memberExpression");
        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        RewriteRuleSubtreeStream stream_callExpressionSuffix=new RewriteRuleSubtreeStream(adaptor,"rule callExpressionSuffix");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:255:3: ( memberExpression ( LT )* arguments ( ( LT )* callExpressionSuffix )* -> ^( CALL_EXPR_DEF memberExpression arguments ( callExpressionSuffix )* ) )
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:255:5: memberExpression ( LT )* arguments ( ( LT )* callExpressionSuffix )*
            {
            pushFollow(FOLLOW_memberExpression_in_callExpression1644);
            memberExpression278=memberExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_memberExpression.add(memberExpression278.getTree());

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:255:22: ( LT )*
            loop134:
            do {
                int alt134=2;
                int LA134_0 = input.LA(1);

                if ( (LA134_0==LT) ) {
                    alt134=1;
                }


                switch (alt134) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:255:22: LT
            	    {
            	    LT279=(Token)match(input,LT,FOLLOW_LT_in_callExpression1646); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LT.add(LT279);


            	    }
            	    break;

            	default :
            	    break loop134;
                }
            } while (true);


            pushFollow(FOLLOW_arguments_in_callExpression1649);
            arguments280=arguments();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_arguments.add(arguments280.getTree());

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:255:36: ( ( LT )* callExpressionSuffix )*
            loop136:
            do {
                int alt136=2;
                int LA136_0 = input.LA(1);

                if ( (LA136_0==LT) ) {
                    int LA136_1 = input.LA(2);

                    if ( (synpred158_Javascript()) ) {
                        alt136=1;
                    }


                }
                else if ( (LA136_0==44||LA136_0==55||LA136_0==74) ) {
                    alt136=1;
                }


                switch (alt136) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:255:37: ( LT )* callExpressionSuffix
            	    {
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:255:37: ( LT )*
            	    loop135:
            	    do {
            	        int alt135=2;
            	        int LA135_0 = input.LA(1);

            	        if ( (LA135_0==LT) ) {
            	            alt135=1;
            	        }


            	        switch (alt135) {
            	    	case 1 :
            	    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:255:37: LT
            	    	    {
            	    	    LT281=(Token)match(input,LT,FOLLOW_LT_in_callExpression1652); if (state.failed) return retval; 
            	    	    if ( state.backtracking==0 ) stream_LT.add(LT281);


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop135;
            	        }
            	    } while (true);


            	    pushFollow(FOLLOW_callExpressionSuffix_in_callExpression1655);
            	    callExpressionSuffix282=callExpressionSuffix();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_callExpressionSuffix.add(callExpressionSuffix282.getTree());

            	    }
            	    break;

            	default :
            	    break loop136;
                }
            } while (true);


            // AST REWRITE
            // elements: memberExpression, arguments, callExpressionSuffix
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 256:3: -> ^( CALL_EXPR_DEF memberExpression arguments ( callExpressionSuffix )* )
            {
                // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:256:6: ^( CALL_EXPR_DEF memberExpression arguments ( callExpressionSuffix )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CALL_EXPR_DEF, "CALL_EXPR_DEF")
                , root_1);

                adaptor.addChild(root_1, stream_memberExpression.nextTree());

                adaptor.addChild(root_1, stream_arguments.nextTree());

                // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:256:49: ( callExpressionSuffix )*
                while ( stream_callExpressionSuffix.hasNext() ) {
                    adaptor.addChild(root_1, stream_callExpressionSuffix.nextTree());

                }
                stream_callExpressionSuffix.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 49, callExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "callExpression"


    public static class callExpressionSuffix_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "callExpressionSuffix"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:259:1: callExpressionSuffix : ( arguments | indexSuffix | propertyReferenceSuffix );
    public final JavascriptParser.callExpressionSuffix_return callExpressionSuffix() throws RecognitionException {
        JavascriptParser.callExpressionSuffix_return retval = new JavascriptParser.callExpressionSuffix_return();
        retval.start = input.LT(1);

        int callExpressionSuffix_StartIndex = input.index();

        CommonTree root_0 = null;

        JavascriptParser.arguments_return arguments283 =null;

        JavascriptParser.indexSuffix_return indexSuffix284 =null;

        JavascriptParser.propertyReferenceSuffix_return propertyReferenceSuffix285 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:260:3: ( arguments | indexSuffix | propertyReferenceSuffix )
            int alt137=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt137=1;
                }
                break;
            case 74:
                {
                alt137=2;
                }
                break;
            case 55:
                {
                alt137=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 137, 0, input);

                throw nvae;

            }

            switch (alt137) {
                case 1 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:260:5: arguments
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_arguments_in_callExpressionSuffix1685);
                    arguments283=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments283.getTree());

                    }
                    break;
                case 2 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:261:5: indexSuffix
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_indexSuffix_in_callExpressionSuffix1691);
                    indexSuffix284=indexSuffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, indexSuffix284.getTree());

                    }
                    break;
                case 3 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:262:5: propertyReferenceSuffix
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_propertyReferenceSuffix_in_callExpressionSuffix1697);
                    propertyReferenceSuffix285=propertyReferenceSuffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, propertyReferenceSuffix285.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 50, callExpressionSuffix_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "callExpressionSuffix"


    public static class arguments_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arguments"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:265:1: arguments : '(' ( ( LT !)* assignmentExpression ( ( LT !)* ',' ( LT !)* assignmentExpression )* )? ( LT !)* ')' ;
    public final JavascriptParser.arguments_return arguments() throws RecognitionException {
        JavascriptParser.arguments_return retval = new JavascriptParser.arguments_return();
        retval.start = input.LT(1);

        int arguments_StartIndex = input.index();

        CommonTree root_0 = null;

        Token char_literal286=null;
        Token LT287=null;
        Token LT289=null;
        Token char_literal290=null;
        Token LT291=null;
        Token LT293=null;
        Token char_literal294=null;
        JavascriptParser.assignmentExpression_return assignmentExpression288 =null;

        JavascriptParser.assignmentExpression_return assignmentExpression292 =null;


        CommonTree char_literal286_tree=null;
        CommonTree LT287_tree=null;
        CommonTree LT289_tree=null;
        CommonTree char_literal290_tree=null;
        CommonTree LT291_tree=null;
        CommonTree LT293_tree=null;
        CommonTree char_literal294_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:266:3: ( '(' ( ( LT !)* assignmentExpression ( ( LT !)* ',' ( LT !)* assignmentExpression )* )? ( LT !)* ')' )
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:266:5: '(' ( ( LT !)* assignmentExpression ( ( LT !)* ',' ( LT !)* assignmentExpression )* )? ( LT !)* ')'
            {
            root_0 = (CommonTree)adaptor.nil();


            char_literal286=(Token)match(input,44,FOLLOW_44_in_arguments1710); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal286_tree = 
            (CommonTree)adaptor.create(char_literal286)
            ;
            adaptor.addChild(root_0, char_literal286_tree);
            }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:266:9: ( ( LT !)* assignmentExpression ( ( LT !)* ',' ( LT !)* assignmentExpression )* )?
            int alt142=2;
            alt142 = dfa142.predict(input);
            switch (alt142) {
                case 1 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:266:10: ( LT !)* assignmentExpression ( ( LT !)* ',' ( LT !)* assignmentExpression )*
                    {
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:266:12: ( LT !)*
                    loop138:
                    do {
                        int alt138=2;
                        int LA138_0 = input.LA(1);

                        if ( (LA138_0==LT) ) {
                            alt138=1;
                        }


                        switch (alt138) {
                    	case 1 :
                    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:266:12: LT !
                    	    {
                    	    LT287=(Token)match(input,LT,FOLLOW_LT_in_arguments1713); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop138;
                        }
                    } while (true);


                    pushFollow(FOLLOW_assignmentExpression_in_arguments1717);
                    assignmentExpression288=assignmentExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpression288.getTree());

                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:266:36: ( ( LT !)* ',' ( LT !)* assignmentExpression )*
                    loop141:
                    do {
                        int alt141=2;
                        alt141 = dfa141.predict(input);
                        switch (alt141) {
                    	case 1 :
                    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:266:37: ( LT !)* ',' ( LT !)* assignmentExpression
                    	    {
                    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:266:39: ( LT !)*
                    	    loop139:
                    	    do {
                    	        int alt139=2;
                    	        int LA139_0 = input.LA(1);

                    	        if ( (LA139_0==LT) ) {
                    	            alt139=1;
                    	        }


                    	        switch (alt139) {
                    	    	case 1 :
                    	    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:266:39: LT !
                    	    	    {
                    	    	    LT289=(Token)match(input,LT,FOLLOW_LT_in_arguments1720); if (state.failed) return retval;

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop139;
                    	        }
                    	    } while (true);


                    	    char_literal290=(Token)match(input,51,FOLLOW_51_in_arguments1724); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal290_tree = 
                    	    (CommonTree)adaptor.create(char_literal290)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal290_tree);
                    	    }

                    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:266:48: ( LT !)*
                    	    loop140:
                    	    do {
                    	        int alt140=2;
                    	        int LA140_0 = input.LA(1);

                    	        if ( (LA140_0==LT) ) {
                    	            alt140=1;
                    	        }


                    	        switch (alt140) {
                    	    	case 1 :
                    	    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:266:48: LT !
                    	    	    {
                    	    	    LT291=(Token)match(input,LT,FOLLOW_LT_in_arguments1726); if (state.failed) return retval;

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop140;
                    	        }
                    	    } while (true);


                    	    pushFollow(FOLLOW_assignmentExpression_in_arguments1730);
                    	    assignmentExpression292=assignmentExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpression292.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop141;
                        }
                    } while (true);


                    }
                    break;

            }


            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:266:78: ( LT !)*
            loop143:
            do {
                int alt143=2;
                int LA143_0 = input.LA(1);

                if ( (LA143_0==LT) ) {
                    alt143=1;
                }


                switch (alt143) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:266:78: LT !
            	    {
            	    LT293=(Token)match(input,LT,FOLLOW_LT_in_arguments1736); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop143;
                }
            } while (true);


            char_literal294=(Token)match(input,45,FOLLOW_45_in_arguments1740); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal294_tree = 
            (CommonTree)adaptor.create(char_literal294)
            ;
            adaptor.addChild(root_0, char_literal294_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 51, arguments_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "arguments"


    public static class indexSuffix_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "indexSuffix"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:269:1: indexSuffix : '[' ( LT !)* expression ( LT !)* ']' ;
    public final JavascriptParser.indexSuffix_return indexSuffix() throws RecognitionException {
        JavascriptParser.indexSuffix_return retval = new JavascriptParser.indexSuffix_return();
        retval.start = input.LT(1);

        int indexSuffix_StartIndex = input.index();

        CommonTree root_0 = null;

        Token char_literal295=null;
        Token LT296=null;
        Token LT298=null;
        Token char_literal299=null;
        JavascriptParser.expression_return expression297 =null;


        CommonTree char_literal295_tree=null;
        CommonTree LT296_tree=null;
        CommonTree LT298_tree=null;
        CommonTree char_literal299_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:270:3: ( '[' ( LT !)* expression ( LT !)* ']' )
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:270:5: '[' ( LT !)* expression ( LT !)* ']'
            {
            root_0 = (CommonTree)adaptor.nil();


            char_literal295=(Token)match(input,74,FOLLOW_74_in_indexSuffix1753); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal295_tree = 
            (CommonTree)adaptor.create(char_literal295)
            ;
            adaptor.addChild(root_0, char_literal295_tree);
            }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:270:11: ( LT !)*
            loop144:
            do {
                int alt144=2;
                int LA144_0 = input.LA(1);

                if ( (LA144_0==LT) ) {
                    alt144=1;
                }


                switch (alt144) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:270:11: LT !
            	    {
            	    LT296=(Token)match(input,LT,FOLLOW_LT_in_indexSuffix1755); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop144;
                }
            } while (true);


            pushFollow(FOLLOW_expression_in_indexSuffix1759);
            expression297=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression297.getTree());

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:270:27: ( LT !)*
            loop145:
            do {
                int alt145=2;
                int LA145_0 = input.LA(1);

                if ( (LA145_0==LT) ) {
                    alt145=1;
                }


                switch (alt145) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:270:27: LT !
            	    {
            	    LT298=(Token)match(input,LT,FOLLOW_LT_in_indexSuffix1761); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop145;
                }
            } while (true);


            char_literal299=(Token)match(input,75,FOLLOW_75_in_indexSuffix1765); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal299_tree = 
            (CommonTree)adaptor.create(char_literal299)
            ;
            adaptor.addChild(root_0, char_literal299_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 52, indexSuffix_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "indexSuffix"


    public static class propertyReferenceSuffix_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "propertyReferenceSuffix"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:273:1: propertyReferenceSuffix : '.' ( LT !)* Identifier ;
    public final JavascriptParser.propertyReferenceSuffix_return propertyReferenceSuffix() throws RecognitionException {
        JavascriptParser.propertyReferenceSuffix_return retval = new JavascriptParser.propertyReferenceSuffix_return();
        retval.start = input.LT(1);

        int propertyReferenceSuffix_StartIndex = input.index();

        CommonTree root_0 = null;

        Token char_literal300=null;
        Token LT301=null;
        Token Identifier302=null;

        CommonTree char_literal300_tree=null;
        CommonTree LT301_tree=null;
        CommonTree Identifier302_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:274:3: ( '.' ( LT !)* Identifier )
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:274:5: '.' ( LT !)* Identifier
            {
            root_0 = (CommonTree)adaptor.nil();


            char_literal300=(Token)match(input,55,FOLLOW_55_in_propertyReferenceSuffix1778); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal300_tree = 
            (CommonTree)adaptor.create(char_literal300)
            ;
            adaptor.addChild(root_0, char_literal300_tree);
            }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:274:11: ( LT !)*
            loop146:
            do {
                int alt146=2;
                int LA146_0 = input.LA(1);

                if ( (LA146_0==LT) ) {
                    alt146=1;
                }


                switch (alt146) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:274:11: LT !
            	    {
            	    LT301=(Token)match(input,LT,FOLLOW_LT_in_propertyReferenceSuffix1780); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop146;
                }
            } while (true);


            Identifier302=(Token)match(input,Identifier,FOLLOW_Identifier_in_propertyReferenceSuffix1784); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier302_tree = 
            (CommonTree)adaptor.create(Identifier302)
            ;
            adaptor.addChild(root_0, Identifier302_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 53, propertyReferenceSuffix_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "propertyReferenceSuffix"


    public static class assignmentOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignmentOperator"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:277:1: assignmentOperator : ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '>>>=' | '&=' | '^=' | '|=' );
    public final JavascriptParser.assignmentOperator_return assignmentOperator() throws RecognitionException {
        JavascriptParser.assignmentOperator_return retval = new JavascriptParser.assignmentOperator_return();
        retval.start = input.LT(1);

        int assignmentOperator_StartIndex = input.index();

        CommonTree root_0 = null;

        Token set303=null;

        CommonTree set303_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:278:3: ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '>>>=' | '&=' | '^=' | '|=' )
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set303=(Token)input.LT(1);

            if ( input.LA(1)==40||input.LA(1)==43||input.LA(1)==47||input.LA(1)==50||input.LA(1)==54||input.LA(1)==57||input.LA(1)==62||input.LA(1)==64||input.LA(1)==70||input.LA(1)==72||input.LA(1)==77||input.LA(1)==108 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set303)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 54, assignmentOperator_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "assignmentOperator"


    public static class conditionalExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conditionalExpression"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:281:1: conditionalExpression : logicalORExpression ( ( LT !)* '?' ^ ( LT !)* assignmentExpression ( LT !)* ':' ( LT !)* assignmentExpression )? ;
    public final JavascriptParser.conditionalExpression_return conditionalExpression() throws RecognitionException {
        JavascriptParser.conditionalExpression_return retval = new JavascriptParser.conditionalExpression_return();
        retval.start = input.LT(1);

        int conditionalExpression_StartIndex = input.index();

        CommonTree root_0 = null;

        Token LT305=null;
        Token char_literal306=null;
        Token LT307=null;
        Token LT309=null;
        Token char_literal310=null;
        Token LT311=null;
        JavascriptParser.logicalORExpression_return logicalORExpression304 =null;

        JavascriptParser.assignmentExpression_return assignmentExpression308 =null;

        JavascriptParser.assignmentExpression_return assignmentExpression312 =null;


        CommonTree LT305_tree=null;
        CommonTree char_literal306_tree=null;
        CommonTree LT307_tree=null;
        CommonTree LT309_tree=null;
        CommonTree char_literal310_tree=null;
        CommonTree LT311_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:282:3: ( logicalORExpression ( ( LT !)* '?' ^ ( LT !)* assignmentExpression ( LT !)* ':' ( LT !)* assignmentExpression )? )
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:282:5: logicalORExpression ( ( LT !)* '?' ^ ( LT !)* assignmentExpression ( LT !)* ':' ( LT !)* assignmentExpression )?
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_logicalORExpression_in_conditionalExpression1854);
            logicalORExpression304=logicalORExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalORExpression304.getTree());

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:282:25: ( ( LT !)* '?' ^ ( LT !)* assignmentExpression ( LT !)* ':' ( LT !)* assignmentExpression )?
            int alt151=2;
            alt151 = dfa151.predict(input);
            switch (alt151) {
                case 1 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:282:26: ( LT !)* '?' ^ ( LT !)* assignmentExpression ( LT !)* ':' ( LT !)* assignmentExpression
                    {
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:282:28: ( LT !)*
                    loop147:
                    do {
                        int alt147=2;
                        int LA147_0 = input.LA(1);

                        if ( (LA147_0==LT) ) {
                            alt147=1;
                        }


                        switch (alt147) {
                    	case 1 :
                    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:282:28: LT !
                    	    {
                    	    LT305=(Token)match(input,LT,FOLLOW_LT_in_conditionalExpression1857); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop147;
                        }
                    } while (true);


                    char_literal306=(Token)match(input,73,FOLLOW_73_in_conditionalExpression1861); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal306_tree = 
                    (CommonTree)adaptor.create(char_literal306)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(char_literal306_tree, root_0);
                    }

                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:282:38: ( LT !)*
                    loop148:
                    do {
                        int alt148=2;
                        int LA148_0 = input.LA(1);

                        if ( (LA148_0==LT) ) {
                            alt148=1;
                        }


                        switch (alt148) {
                    	case 1 :
                    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:282:38: LT !
                    	    {
                    	    LT307=(Token)match(input,LT,FOLLOW_LT_in_conditionalExpression1864); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop148;
                        }
                    } while (true);


                    pushFollow(FOLLOW_assignmentExpression_in_conditionalExpression1868);
                    assignmentExpression308=assignmentExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpression308.getTree());

                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:282:64: ( LT !)*
                    loop149:
                    do {
                        int alt149=2;
                        int LA149_0 = input.LA(1);

                        if ( (LA149_0==LT) ) {
                            alt149=1;
                        }


                        switch (alt149) {
                    	case 1 :
                    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:282:64: LT !
                    	    {
                    	    LT309=(Token)match(input,LT,FOLLOW_LT_in_conditionalExpression1870); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop149;
                        }
                    } while (true);


                    char_literal310=(Token)match(input,58,FOLLOW_58_in_conditionalExpression1874); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal310_tree = 
                    (CommonTree)adaptor.create(char_literal310)
                    ;
                    adaptor.addChild(root_0, char_literal310_tree);
                    }

                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:282:73: ( LT !)*
                    loop150:
                    do {
                        int alt150=2;
                        int LA150_0 = input.LA(1);

                        if ( (LA150_0==LT) ) {
                            alt150=1;
                        }


                        switch (alt150) {
                    	case 1 :
                    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:282:73: LT !
                    	    {
                    	    LT311=(Token)match(input,LT,FOLLOW_LT_in_conditionalExpression1876); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop150;
                        }
                    } while (true);


                    pushFollow(FOLLOW_assignmentExpression_in_conditionalExpression1880);
                    assignmentExpression312=assignmentExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpression312.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 55, conditionalExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "conditionalExpression"


    public static class conditionalExpressionNoIn_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conditionalExpressionNoIn"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:285:1: conditionalExpressionNoIn : logicalORExpressionNoIn ( ( LT !)* '?' ^ ( LT !)* assignmentExpressionNoIn ( LT !)* ':' ( LT !)* assignmentExpressionNoIn )? ;
    public final JavascriptParser.conditionalExpressionNoIn_return conditionalExpressionNoIn() throws RecognitionException {
        JavascriptParser.conditionalExpressionNoIn_return retval = new JavascriptParser.conditionalExpressionNoIn_return();
        retval.start = input.LT(1);

        int conditionalExpressionNoIn_StartIndex = input.index();

        CommonTree root_0 = null;

        Token LT314=null;
        Token char_literal315=null;
        Token LT316=null;
        Token LT318=null;
        Token char_literal319=null;
        Token LT320=null;
        JavascriptParser.logicalORExpressionNoIn_return logicalORExpressionNoIn313 =null;

        JavascriptParser.assignmentExpressionNoIn_return assignmentExpressionNoIn317 =null;

        JavascriptParser.assignmentExpressionNoIn_return assignmentExpressionNoIn321 =null;


        CommonTree LT314_tree=null;
        CommonTree char_literal315_tree=null;
        CommonTree LT316_tree=null;
        CommonTree LT318_tree=null;
        CommonTree char_literal319_tree=null;
        CommonTree LT320_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:286:3: ( logicalORExpressionNoIn ( ( LT !)* '?' ^ ( LT !)* assignmentExpressionNoIn ( LT !)* ':' ( LT !)* assignmentExpressionNoIn )? )
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:286:5: logicalORExpressionNoIn ( ( LT !)* '?' ^ ( LT !)* assignmentExpressionNoIn ( LT !)* ':' ( LT !)* assignmentExpressionNoIn )?
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_logicalORExpressionNoIn_in_conditionalExpressionNoIn1895);
            logicalORExpressionNoIn313=logicalORExpressionNoIn();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalORExpressionNoIn313.getTree());

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:286:29: ( ( LT !)* '?' ^ ( LT !)* assignmentExpressionNoIn ( LT !)* ':' ( LT !)* assignmentExpressionNoIn )?
            int alt156=2;
            alt156 = dfa156.predict(input);
            switch (alt156) {
                case 1 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:286:30: ( LT !)* '?' ^ ( LT !)* assignmentExpressionNoIn ( LT !)* ':' ( LT !)* assignmentExpressionNoIn
                    {
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:286:32: ( LT !)*
                    loop152:
                    do {
                        int alt152=2;
                        int LA152_0 = input.LA(1);

                        if ( (LA152_0==LT) ) {
                            alt152=1;
                        }


                        switch (alt152) {
                    	case 1 :
                    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:286:32: LT !
                    	    {
                    	    LT314=(Token)match(input,LT,FOLLOW_LT_in_conditionalExpressionNoIn1898); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop152;
                        }
                    } while (true);


                    char_literal315=(Token)match(input,73,FOLLOW_73_in_conditionalExpressionNoIn1902); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal315_tree = 
                    (CommonTree)adaptor.create(char_literal315)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(char_literal315_tree, root_0);
                    }

                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:286:42: ( LT !)*
                    loop153:
                    do {
                        int alt153=2;
                        int LA153_0 = input.LA(1);

                        if ( (LA153_0==LT) ) {
                            alt153=1;
                        }


                        switch (alt153) {
                    	case 1 :
                    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:286:42: LT !
                    	    {
                    	    LT316=(Token)match(input,LT,FOLLOW_LT_in_conditionalExpressionNoIn1905); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop153;
                        }
                    } while (true);


                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn1909);
                    assignmentExpressionNoIn317=assignmentExpressionNoIn();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpressionNoIn317.getTree());

                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:286:72: ( LT !)*
                    loop154:
                    do {
                        int alt154=2;
                        int LA154_0 = input.LA(1);

                        if ( (LA154_0==LT) ) {
                            alt154=1;
                        }


                        switch (alt154) {
                    	case 1 :
                    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:286:72: LT !
                    	    {
                    	    LT318=(Token)match(input,LT,FOLLOW_LT_in_conditionalExpressionNoIn1911); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop154;
                        }
                    } while (true);


                    char_literal319=(Token)match(input,58,FOLLOW_58_in_conditionalExpressionNoIn1915); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal319_tree = 
                    (CommonTree)adaptor.create(char_literal319)
                    ;
                    adaptor.addChild(root_0, char_literal319_tree);
                    }

                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:286:81: ( LT !)*
                    loop155:
                    do {
                        int alt155=2;
                        int LA155_0 = input.LA(1);

                        if ( (LA155_0==LT) ) {
                            alt155=1;
                        }


                        switch (alt155) {
                    	case 1 :
                    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:286:81: LT !
                    	    {
                    	    LT320=(Token)match(input,LT,FOLLOW_LT_in_conditionalExpressionNoIn1917); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop155;
                        }
                    } while (true);


                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn1921);
                    assignmentExpressionNoIn321=assignmentExpressionNoIn();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpressionNoIn321.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 56, conditionalExpressionNoIn_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "conditionalExpressionNoIn"


    public static class logicalORExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logicalORExpression"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:289:1: logicalORExpression : logicalANDExpression ( ( LT !)* '||' ^ ( LT !)* logicalANDExpression )* ;
    public final JavascriptParser.logicalORExpression_return logicalORExpression() throws RecognitionException {
        JavascriptParser.logicalORExpression_return retval = new JavascriptParser.logicalORExpression_return();
        retval.start = input.LT(1);

        int logicalORExpression_StartIndex = input.index();

        CommonTree root_0 = null;

        Token LT323=null;
        Token string_literal324=null;
        Token LT325=null;
        JavascriptParser.logicalANDExpression_return logicalANDExpression322 =null;

        JavascriptParser.logicalANDExpression_return logicalANDExpression326 =null;


        CommonTree LT323_tree=null;
        CommonTree string_literal324_tree=null;
        CommonTree LT325_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:290:3: ( logicalANDExpression ( ( LT !)* '||' ^ ( LT !)* logicalANDExpression )* )
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:290:5: logicalANDExpression ( ( LT !)* '||' ^ ( LT !)* logicalANDExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_logicalANDExpression_in_logicalORExpression1936);
            logicalANDExpression322=logicalANDExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalANDExpression322.getTree());

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:290:26: ( ( LT !)* '||' ^ ( LT !)* logicalANDExpression )*
            loop159:
            do {
                int alt159=2;
                alt159 = dfa159.predict(input);
                switch (alt159) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:290:27: ( LT !)* '||' ^ ( LT !)* logicalANDExpression
            	    {
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:290:29: ( LT !)*
            	    loop157:
            	    do {
            	        int alt157=2;
            	        int LA157_0 = input.LA(1);

            	        if ( (LA157_0==LT) ) {
            	            alt157=1;
            	        }


            	        switch (alt157) {
            	    	case 1 :
            	    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:290:29: LT !
            	    	    {
            	    	    LT323=(Token)match(input,LT,FOLLOW_LT_in_logicalORExpression1939); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop157;
            	        }
            	    } while (true);


            	    string_literal324=(Token)match(input,109,FOLLOW_109_in_logicalORExpression1943); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal324_tree = 
            	    (CommonTree)adaptor.create(string_literal324)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(string_literal324_tree, root_0);
            	    }

            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:290:40: ( LT !)*
            	    loop158:
            	    do {
            	        int alt158=2;
            	        int LA158_0 = input.LA(1);

            	        if ( (LA158_0==LT) ) {
            	            alt158=1;
            	        }


            	        switch (alt158) {
            	    	case 1 :
            	    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:290:40: LT !
            	    	    {
            	    	    LT325=(Token)match(input,LT,FOLLOW_LT_in_logicalORExpression1946); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop158;
            	        }
            	    } while (true);


            	    pushFollow(FOLLOW_logicalANDExpression_in_logicalORExpression1950);
            	    logicalANDExpression326=logicalANDExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalANDExpression326.getTree());

            	    }
            	    break;

            	default :
            	    break loop159;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 57, logicalORExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "logicalORExpression"


    public static class logicalORExpressionNoIn_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logicalORExpressionNoIn"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:293:1: logicalORExpressionNoIn : logicalANDExpressionNoIn ( ( LT !)* '||' ^ ( LT !)* logicalANDExpressionNoIn )* ;
    public final JavascriptParser.logicalORExpressionNoIn_return logicalORExpressionNoIn() throws RecognitionException {
        JavascriptParser.logicalORExpressionNoIn_return retval = new JavascriptParser.logicalORExpressionNoIn_return();
        retval.start = input.LT(1);

        int logicalORExpressionNoIn_StartIndex = input.index();

        CommonTree root_0 = null;

        Token LT328=null;
        Token string_literal329=null;
        Token LT330=null;
        JavascriptParser.logicalANDExpressionNoIn_return logicalANDExpressionNoIn327 =null;

        JavascriptParser.logicalANDExpressionNoIn_return logicalANDExpressionNoIn331 =null;


        CommonTree LT328_tree=null;
        CommonTree string_literal329_tree=null;
        CommonTree LT330_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:294:3: ( logicalANDExpressionNoIn ( ( LT !)* '||' ^ ( LT !)* logicalANDExpressionNoIn )* )
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:294:5: logicalANDExpressionNoIn ( ( LT !)* '||' ^ ( LT !)* logicalANDExpressionNoIn )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn1965);
            logicalANDExpressionNoIn327=logicalANDExpressionNoIn();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalANDExpressionNoIn327.getTree());

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:294:30: ( ( LT !)* '||' ^ ( LT !)* logicalANDExpressionNoIn )*
            loop162:
            do {
                int alt162=2;
                alt162 = dfa162.predict(input);
                switch (alt162) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:294:31: ( LT !)* '||' ^ ( LT !)* logicalANDExpressionNoIn
            	    {
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:294:33: ( LT !)*
            	    loop160:
            	    do {
            	        int alt160=2;
            	        int LA160_0 = input.LA(1);

            	        if ( (LA160_0==LT) ) {
            	            alt160=1;
            	        }


            	        switch (alt160) {
            	    	case 1 :
            	    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:294:33: LT !
            	    	    {
            	    	    LT328=(Token)match(input,LT,FOLLOW_LT_in_logicalORExpressionNoIn1968); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop160;
            	        }
            	    } while (true);


            	    string_literal329=(Token)match(input,109,FOLLOW_109_in_logicalORExpressionNoIn1972); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal329_tree = 
            	    (CommonTree)adaptor.create(string_literal329)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(string_literal329_tree, root_0);
            	    }

            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:294:44: ( LT !)*
            	    loop161:
            	    do {
            	        int alt161=2;
            	        int LA161_0 = input.LA(1);

            	        if ( (LA161_0==LT) ) {
            	            alt161=1;
            	        }


            	        switch (alt161) {
            	    	case 1 :
            	    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:294:44: LT !
            	    	    {
            	    	    LT330=(Token)match(input,LT,FOLLOW_LT_in_logicalORExpressionNoIn1975); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop161;
            	        }
            	    } while (true);


            	    pushFollow(FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn1979);
            	    logicalANDExpressionNoIn331=logicalANDExpressionNoIn();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalANDExpressionNoIn331.getTree());

            	    }
            	    break;

            	default :
            	    break loop162;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 58, logicalORExpressionNoIn_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "logicalORExpressionNoIn"


    public static class logicalANDExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logicalANDExpression"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:297:1: logicalANDExpression : bitwiseORExpression ( ( LT !)* '&&' ^ ( LT !)* bitwiseORExpression )* ;
    public final JavascriptParser.logicalANDExpression_return logicalANDExpression() throws RecognitionException {
        JavascriptParser.logicalANDExpression_return retval = new JavascriptParser.logicalANDExpression_return();
        retval.start = input.LT(1);

        int logicalANDExpression_StartIndex = input.index();

        CommonTree root_0 = null;

        Token LT333=null;
        Token string_literal334=null;
        Token LT335=null;
        JavascriptParser.bitwiseORExpression_return bitwiseORExpression332 =null;

        JavascriptParser.bitwiseORExpression_return bitwiseORExpression336 =null;


        CommonTree LT333_tree=null;
        CommonTree string_literal334_tree=null;
        CommonTree LT335_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:298:3: ( bitwiseORExpression ( ( LT !)* '&&' ^ ( LT !)* bitwiseORExpression )* )
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:298:5: bitwiseORExpression ( ( LT !)* '&&' ^ ( LT !)* bitwiseORExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_bitwiseORExpression_in_logicalANDExpression1994);
            bitwiseORExpression332=bitwiseORExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseORExpression332.getTree());

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:298:25: ( ( LT !)* '&&' ^ ( LT !)* bitwiseORExpression )*
            loop165:
            do {
                int alt165=2;
                alt165 = dfa165.predict(input);
                switch (alt165) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:298:26: ( LT !)* '&&' ^ ( LT !)* bitwiseORExpression
            	    {
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:298:28: ( LT !)*
            	    loop163:
            	    do {
            	        int alt163=2;
            	        int LA163_0 = input.LA(1);

            	        if ( (LA163_0==LT) ) {
            	            alt163=1;
            	        }


            	        switch (alt163) {
            	    	case 1 :
            	    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:298:28: LT !
            	    	    {
            	    	    LT333=(Token)match(input,LT,FOLLOW_LT_in_logicalANDExpression1997); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop163;
            	        }
            	    } while (true);


            	    string_literal334=(Token)match(input,41,FOLLOW_41_in_logicalANDExpression2001); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal334_tree = 
            	    (CommonTree)adaptor.create(string_literal334)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(string_literal334_tree, root_0);
            	    }

            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:298:39: ( LT !)*
            	    loop164:
            	    do {
            	        int alt164=2;
            	        int LA164_0 = input.LA(1);

            	        if ( (LA164_0==LT) ) {
            	            alt164=1;
            	        }


            	        switch (alt164) {
            	    	case 1 :
            	    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:298:39: LT !
            	    	    {
            	    	    LT335=(Token)match(input,LT,FOLLOW_LT_in_logicalANDExpression2004); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop164;
            	        }
            	    } while (true);


            	    pushFollow(FOLLOW_bitwiseORExpression_in_logicalANDExpression2008);
            	    bitwiseORExpression336=bitwiseORExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseORExpression336.getTree());

            	    }
            	    break;

            	default :
            	    break loop165;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 59, logicalANDExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "logicalANDExpression"


    public static class logicalANDExpressionNoIn_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logicalANDExpressionNoIn"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:301:1: logicalANDExpressionNoIn : bitwiseORExpressionNoIn ( ( LT !)* '&&' ^ ( LT !)* bitwiseORExpressionNoIn )* ;
    public final JavascriptParser.logicalANDExpressionNoIn_return logicalANDExpressionNoIn() throws RecognitionException {
        JavascriptParser.logicalANDExpressionNoIn_return retval = new JavascriptParser.logicalANDExpressionNoIn_return();
        retval.start = input.LT(1);

        int logicalANDExpressionNoIn_StartIndex = input.index();

        CommonTree root_0 = null;

        Token LT338=null;
        Token string_literal339=null;
        Token LT340=null;
        JavascriptParser.bitwiseORExpressionNoIn_return bitwiseORExpressionNoIn337 =null;

        JavascriptParser.bitwiseORExpressionNoIn_return bitwiseORExpressionNoIn341 =null;


        CommonTree LT338_tree=null;
        CommonTree string_literal339_tree=null;
        CommonTree LT340_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:302:3: ( bitwiseORExpressionNoIn ( ( LT !)* '&&' ^ ( LT !)* bitwiseORExpressionNoIn )* )
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:302:5: bitwiseORExpressionNoIn ( ( LT !)* '&&' ^ ( LT !)* bitwiseORExpressionNoIn )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn2023);
            bitwiseORExpressionNoIn337=bitwiseORExpressionNoIn();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseORExpressionNoIn337.getTree());

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:302:29: ( ( LT !)* '&&' ^ ( LT !)* bitwiseORExpressionNoIn )*
            loop168:
            do {
                int alt168=2;
                alt168 = dfa168.predict(input);
                switch (alt168) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:302:30: ( LT !)* '&&' ^ ( LT !)* bitwiseORExpressionNoIn
            	    {
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:302:32: ( LT !)*
            	    loop166:
            	    do {
            	        int alt166=2;
            	        int LA166_0 = input.LA(1);

            	        if ( (LA166_0==LT) ) {
            	            alt166=1;
            	        }


            	        switch (alt166) {
            	    	case 1 :
            	    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:302:32: LT !
            	    	    {
            	    	    LT338=(Token)match(input,LT,FOLLOW_LT_in_logicalANDExpressionNoIn2026); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop166;
            	        }
            	    } while (true);


            	    string_literal339=(Token)match(input,41,FOLLOW_41_in_logicalANDExpressionNoIn2030); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal339_tree = 
            	    (CommonTree)adaptor.create(string_literal339)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(string_literal339_tree, root_0);
            	    }

            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:302:43: ( LT !)*
            	    loop167:
            	    do {
            	        int alt167=2;
            	        int LA167_0 = input.LA(1);

            	        if ( (LA167_0==LT) ) {
            	            alt167=1;
            	        }


            	        switch (alt167) {
            	    	case 1 :
            	    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:302:43: LT !
            	    	    {
            	    	    LT340=(Token)match(input,LT,FOLLOW_LT_in_logicalANDExpressionNoIn2033); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop167;
            	        }
            	    } while (true);


            	    pushFollow(FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn2037);
            	    bitwiseORExpressionNoIn341=bitwiseORExpressionNoIn();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseORExpressionNoIn341.getTree());

            	    }
            	    break;

            	default :
            	    break loop168;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 60, logicalANDExpressionNoIn_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "logicalANDExpressionNoIn"


    public static class bitwiseORExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bitwiseORExpression"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:305:1: bitwiseORExpression : bitwiseXORExpression ( ( LT !)* '|' ^ ( LT !)* bitwiseXORExpression )* ;
    public final JavascriptParser.bitwiseORExpression_return bitwiseORExpression() throws RecognitionException {
        JavascriptParser.bitwiseORExpression_return retval = new JavascriptParser.bitwiseORExpression_return();
        retval.start = input.LT(1);

        int bitwiseORExpression_StartIndex = input.index();

        CommonTree root_0 = null;

        Token LT343=null;
        Token char_literal344=null;
        Token LT345=null;
        JavascriptParser.bitwiseXORExpression_return bitwiseXORExpression342 =null;

        JavascriptParser.bitwiseXORExpression_return bitwiseXORExpression346 =null;


        CommonTree LT343_tree=null;
        CommonTree char_literal344_tree=null;
        CommonTree LT345_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:306:3: ( bitwiseXORExpression ( ( LT !)* '|' ^ ( LT !)* bitwiseXORExpression )* )
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:306:5: bitwiseXORExpression ( ( LT !)* '|' ^ ( LT !)* bitwiseXORExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_bitwiseXORExpression_in_bitwiseORExpression2052);
            bitwiseXORExpression342=bitwiseXORExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseXORExpression342.getTree());

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:306:26: ( ( LT !)* '|' ^ ( LT !)* bitwiseXORExpression )*
            loop171:
            do {
                int alt171=2;
                alt171 = dfa171.predict(input);
                switch (alt171) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:306:27: ( LT !)* '|' ^ ( LT !)* bitwiseXORExpression
            	    {
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:306:29: ( LT !)*
            	    loop169:
            	    do {
            	        int alt169=2;
            	        int LA169_0 = input.LA(1);

            	        if ( (LA169_0==LT) ) {
            	            alt169=1;
            	        }


            	        switch (alt169) {
            	    	case 1 :
            	    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:306:29: LT !
            	    	    {
            	    	    LT343=(Token)match(input,LT,FOLLOW_LT_in_bitwiseORExpression2055); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop169;
            	        }
            	    } while (true);


            	    char_literal344=(Token)match(input,107,FOLLOW_107_in_bitwiseORExpression2059); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal344_tree = 
            	    (CommonTree)adaptor.create(char_literal344)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal344_tree, root_0);
            	    }

            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:306:39: ( LT !)*
            	    loop170:
            	    do {
            	        int alt170=2;
            	        int LA170_0 = input.LA(1);

            	        if ( (LA170_0==LT) ) {
            	            alt170=1;
            	        }


            	        switch (alt170) {
            	    	case 1 :
            	    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:306:39: LT !
            	    	    {
            	    	    LT345=(Token)match(input,LT,FOLLOW_LT_in_bitwiseORExpression2062); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop170;
            	        }
            	    } while (true);


            	    pushFollow(FOLLOW_bitwiseXORExpression_in_bitwiseORExpression2066);
            	    bitwiseXORExpression346=bitwiseXORExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseXORExpression346.getTree());

            	    }
            	    break;

            	default :
            	    break loop171;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 61, bitwiseORExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "bitwiseORExpression"


    public static class bitwiseORExpressionNoIn_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bitwiseORExpressionNoIn"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:309:1: bitwiseORExpressionNoIn : bitwiseXORExpressionNoIn ( ( LT !)* '|' ^ ( LT !)* bitwiseXORExpressionNoIn )* ;
    public final JavascriptParser.bitwiseORExpressionNoIn_return bitwiseORExpressionNoIn() throws RecognitionException {
        JavascriptParser.bitwiseORExpressionNoIn_return retval = new JavascriptParser.bitwiseORExpressionNoIn_return();
        retval.start = input.LT(1);

        int bitwiseORExpressionNoIn_StartIndex = input.index();

        CommonTree root_0 = null;

        Token LT348=null;
        Token char_literal349=null;
        Token LT350=null;
        JavascriptParser.bitwiseXORExpressionNoIn_return bitwiseXORExpressionNoIn347 =null;

        JavascriptParser.bitwiseXORExpressionNoIn_return bitwiseXORExpressionNoIn351 =null;


        CommonTree LT348_tree=null;
        CommonTree char_literal349_tree=null;
        CommonTree LT350_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:310:3: ( bitwiseXORExpressionNoIn ( ( LT !)* '|' ^ ( LT !)* bitwiseXORExpressionNoIn )* )
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:310:5: bitwiseXORExpressionNoIn ( ( LT !)* '|' ^ ( LT !)* bitwiseXORExpressionNoIn )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn2081);
            bitwiseXORExpressionNoIn347=bitwiseXORExpressionNoIn();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseXORExpressionNoIn347.getTree());

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:310:30: ( ( LT !)* '|' ^ ( LT !)* bitwiseXORExpressionNoIn )*
            loop174:
            do {
                int alt174=2;
                alt174 = dfa174.predict(input);
                switch (alt174) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:310:31: ( LT !)* '|' ^ ( LT !)* bitwiseXORExpressionNoIn
            	    {
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:310:33: ( LT !)*
            	    loop172:
            	    do {
            	        int alt172=2;
            	        int LA172_0 = input.LA(1);

            	        if ( (LA172_0==LT) ) {
            	            alt172=1;
            	        }


            	        switch (alt172) {
            	    	case 1 :
            	    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:310:33: LT !
            	    	    {
            	    	    LT348=(Token)match(input,LT,FOLLOW_LT_in_bitwiseORExpressionNoIn2084); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop172;
            	        }
            	    } while (true);


            	    char_literal349=(Token)match(input,107,FOLLOW_107_in_bitwiseORExpressionNoIn2088); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal349_tree = 
            	    (CommonTree)adaptor.create(char_literal349)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal349_tree, root_0);
            	    }

            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:310:43: ( LT !)*
            	    loop173:
            	    do {
            	        int alt173=2;
            	        int LA173_0 = input.LA(1);

            	        if ( (LA173_0==LT) ) {
            	            alt173=1;
            	        }


            	        switch (alt173) {
            	    	case 1 :
            	    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:310:43: LT !
            	    	    {
            	    	    LT350=(Token)match(input,LT,FOLLOW_LT_in_bitwiseORExpressionNoIn2091); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop173;
            	        }
            	    } while (true);


            	    pushFollow(FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn2095);
            	    bitwiseXORExpressionNoIn351=bitwiseXORExpressionNoIn();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseXORExpressionNoIn351.getTree());

            	    }
            	    break;

            	default :
            	    break loop174;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 62, bitwiseORExpressionNoIn_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "bitwiseORExpressionNoIn"


    public static class bitwiseXORExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bitwiseXORExpression"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:313:1: bitwiseXORExpression : bitwiseANDExpression ( ( LT !)* '^' ^ ( LT !)* bitwiseANDExpression )* ;
    public final JavascriptParser.bitwiseXORExpression_return bitwiseXORExpression() throws RecognitionException {
        JavascriptParser.bitwiseXORExpression_return retval = new JavascriptParser.bitwiseXORExpression_return();
        retval.start = input.LT(1);

        int bitwiseXORExpression_StartIndex = input.index();

        CommonTree root_0 = null;

        Token LT353=null;
        Token char_literal354=null;
        Token LT355=null;
        JavascriptParser.bitwiseANDExpression_return bitwiseANDExpression352 =null;

        JavascriptParser.bitwiseANDExpression_return bitwiseANDExpression356 =null;


        CommonTree LT353_tree=null;
        CommonTree char_literal354_tree=null;
        CommonTree LT355_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:314:3: ( bitwiseANDExpression ( ( LT !)* '^' ^ ( LT !)* bitwiseANDExpression )* )
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:314:5: bitwiseANDExpression ( ( LT !)* '^' ^ ( LT !)* bitwiseANDExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression2110);
            bitwiseANDExpression352=bitwiseANDExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseANDExpression352.getTree());

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:314:26: ( ( LT !)* '^' ^ ( LT !)* bitwiseANDExpression )*
            loop177:
            do {
                int alt177=2;
                alt177 = dfa177.predict(input);
                switch (alt177) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:314:27: ( LT !)* '^' ^ ( LT !)* bitwiseANDExpression
            	    {
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:314:29: ( LT !)*
            	    loop175:
            	    do {
            	        int alt175=2;
            	        int LA175_0 = input.LA(1);

            	        if ( (LA175_0==LT) ) {
            	            alt175=1;
            	        }


            	        switch (alt175) {
            	    	case 1 :
            	    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:314:29: LT !
            	    	    {
            	    	    LT353=(Token)match(input,LT,FOLLOW_LT_in_bitwiseXORExpression2113); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop175;
            	        }
            	    } while (true);


            	    char_literal354=(Token)match(input,76,FOLLOW_76_in_bitwiseXORExpression2117); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal354_tree = 
            	    (CommonTree)adaptor.create(char_literal354)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal354_tree, root_0);
            	    }

            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:314:39: ( LT !)*
            	    loop176:
            	    do {
            	        int alt176=2;
            	        int LA176_0 = input.LA(1);

            	        if ( (LA176_0==LT) ) {
            	            alt176=1;
            	        }


            	        switch (alt176) {
            	    	case 1 :
            	    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:314:39: LT !
            	    	    {
            	    	    LT355=(Token)match(input,LT,FOLLOW_LT_in_bitwiseXORExpression2120); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop176;
            	        }
            	    } while (true);


            	    pushFollow(FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression2124);
            	    bitwiseANDExpression356=bitwiseANDExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseANDExpression356.getTree());

            	    }
            	    break;

            	default :
            	    break loop177;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 63, bitwiseXORExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "bitwiseXORExpression"


    public static class bitwiseXORExpressionNoIn_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bitwiseXORExpressionNoIn"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:317:1: bitwiseXORExpressionNoIn : bitwiseANDExpressionNoIn ( ( LT !)* '^' ^ ( LT !)* bitwiseANDExpressionNoIn )* ;
    public final JavascriptParser.bitwiseXORExpressionNoIn_return bitwiseXORExpressionNoIn() throws RecognitionException {
        JavascriptParser.bitwiseXORExpressionNoIn_return retval = new JavascriptParser.bitwiseXORExpressionNoIn_return();
        retval.start = input.LT(1);

        int bitwiseXORExpressionNoIn_StartIndex = input.index();

        CommonTree root_0 = null;

        Token LT358=null;
        Token char_literal359=null;
        Token LT360=null;
        JavascriptParser.bitwiseANDExpressionNoIn_return bitwiseANDExpressionNoIn357 =null;

        JavascriptParser.bitwiseANDExpressionNoIn_return bitwiseANDExpressionNoIn361 =null;


        CommonTree LT358_tree=null;
        CommonTree char_literal359_tree=null;
        CommonTree LT360_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:318:3: ( bitwiseANDExpressionNoIn ( ( LT !)* '^' ^ ( LT !)* bitwiseANDExpressionNoIn )* )
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:318:5: bitwiseANDExpressionNoIn ( ( LT !)* '^' ^ ( LT !)* bitwiseANDExpressionNoIn )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn2139);
            bitwiseANDExpressionNoIn357=bitwiseANDExpressionNoIn();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseANDExpressionNoIn357.getTree());

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:318:30: ( ( LT !)* '^' ^ ( LT !)* bitwiseANDExpressionNoIn )*
            loop180:
            do {
                int alt180=2;
                alt180 = dfa180.predict(input);
                switch (alt180) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:318:31: ( LT !)* '^' ^ ( LT !)* bitwiseANDExpressionNoIn
            	    {
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:318:33: ( LT !)*
            	    loop178:
            	    do {
            	        int alt178=2;
            	        int LA178_0 = input.LA(1);

            	        if ( (LA178_0==LT) ) {
            	            alt178=1;
            	        }


            	        switch (alt178) {
            	    	case 1 :
            	    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:318:33: LT !
            	    	    {
            	    	    LT358=(Token)match(input,LT,FOLLOW_LT_in_bitwiseXORExpressionNoIn2142); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop178;
            	        }
            	    } while (true);


            	    char_literal359=(Token)match(input,76,FOLLOW_76_in_bitwiseXORExpressionNoIn2146); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal359_tree = 
            	    (CommonTree)adaptor.create(char_literal359)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal359_tree, root_0);
            	    }

            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:318:43: ( LT !)*
            	    loop179:
            	    do {
            	        int alt179=2;
            	        int LA179_0 = input.LA(1);

            	        if ( (LA179_0==LT) ) {
            	            alt179=1;
            	        }


            	        switch (alt179) {
            	    	case 1 :
            	    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:318:43: LT !
            	    	    {
            	    	    LT360=(Token)match(input,LT,FOLLOW_LT_in_bitwiseXORExpressionNoIn2149); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop179;
            	        }
            	    } while (true);


            	    pushFollow(FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn2153);
            	    bitwiseANDExpressionNoIn361=bitwiseANDExpressionNoIn();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseANDExpressionNoIn361.getTree());

            	    }
            	    break;

            	default :
            	    break loop180;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 64, bitwiseXORExpressionNoIn_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "bitwiseXORExpressionNoIn"


    public static class bitwiseANDExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bitwiseANDExpression"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:321:1: bitwiseANDExpression : equalityExpression ( ( LT !)* '&' ^ ( LT !)* equalityExpression )* ;
    public final JavascriptParser.bitwiseANDExpression_return bitwiseANDExpression() throws RecognitionException {
        JavascriptParser.bitwiseANDExpression_return retval = new JavascriptParser.bitwiseANDExpression_return();
        retval.start = input.LT(1);

        int bitwiseANDExpression_StartIndex = input.index();

        CommonTree root_0 = null;

        Token LT363=null;
        Token char_literal364=null;
        Token LT365=null;
        JavascriptParser.equalityExpression_return equalityExpression362 =null;

        JavascriptParser.equalityExpression_return equalityExpression366 =null;


        CommonTree LT363_tree=null;
        CommonTree char_literal364_tree=null;
        CommonTree LT365_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:322:3: ( equalityExpression ( ( LT !)* '&' ^ ( LT !)* equalityExpression )* )
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:322:5: equalityExpression ( ( LT !)* '&' ^ ( LT !)* equalityExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_equalityExpression_in_bitwiseANDExpression2168);
            equalityExpression362=equalityExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression362.getTree());

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:322:24: ( ( LT !)* '&' ^ ( LT !)* equalityExpression )*
            loop183:
            do {
                int alt183=2;
                alt183 = dfa183.predict(input);
                switch (alt183) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:322:25: ( LT !)* '&' ^ ( LT !)* equalityExpression
            	    {
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:322:27: ( LT !)*
            	    loop181:
            	    do {
            	        int alt181=2;
            	        int LA181_0 = input.LA(1);

            	        if ( (LA181_0==LT) ) {
            	            alt181=1;
            	        }


            	        switch (alt181) {
            	    	case 1 :
            	    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:322:27: LT !
            	    	    {
            	    	    LT363=(Token)match(input,LT,FOLLOW_LT_in_bitwiseANDExpression2171); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop181;
            	        }
            	    } while (true);


            	    char_literal364=(Token)match(input,42,FOLLOW_42_in_bitwiseANDExpression2175); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal364_tree = 
            	    (CommonTree)adaptor.create(char_literal364)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal364_tree, root_0);
            	    }

            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:322:37: ( LT !)*
            	    loop182:
            	    do {
            	        int alt182=2;
            	        int LA182_0 = input.LA(1);

            	        if ( (LA182_0==LT) ) {
            	            alt182=1;
            	        }


            	        switch (alt182) {
            	    	case 1 :
            	    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:322:37: LT !
            	    	    {
            	    	    LT365=(Token)match(input,LT,FOLLOW_LT_in_bitwiseANDExpression2178); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop182;
            	        }
            	    } while (true);


            	    pushFollow(FOLLOW_equalityExpression_in_bitwiseANDExpression2182);
            	    equalityExpression366=equalityExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression366.getTree());

            	    }
            	    break;

            	default :
            	    break loop183;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 65, bitwiseANDExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "bitwiseANDExpression"


    public static class bitwiseANDExpressionNoIn_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bitwiseANDExpressionNoIn"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:325:1: bitwiseANDExpressionNoIn : equalityExpressionNoIn ( ( LT !)* '&' ^ ( LT !)* equalityExpressionNoIn )* ;
    public final JavascriptParser.bitwiseANDExpressionNoIn_return bitwiseANDExpressionNoIn() throws RecognitionException {
        JavascriptParser.bitwiseANDExpressionNoIn_return retval = new JavascriptParser.bitwiseANDExpressionNoIn_return();
        retval.start = input.LT(1);

        int bitwiseANDExpressionNoIn_StartIndex = input.index();

        CommonTree root_0 = null;

        Token LT368=null;
        Token char_literal369=null;
        Token LT370=null;
        JavascriptParser.equalityExpressionNoIn_return equalityExpressionNoIn367 =null;

        JavascriptParser.equalityExpressionNoIn_return equalityExpressionNoIn371 =null;


        CommonTree LT368_tree=null;
        CommonTree char_literal369_tree=null;
        CommonTree LT370_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:326:3: ( equalityExpressionNoIn ( ( LT !)* '&' ^ ( LT !)* equalityExpressionNoIn )* )
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:326:5: equalityExpressionNoIn ( ( LT !)* '&' ^ ( LT !)* equalityExpressionNoIn )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn2197);
            equalityExpressionNoIn367=equalityExpressionNoIn();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpressionNoIn367.getTree());

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:326:28: ( ( LT !)* '&' ^ ( LT !)* equalityExpressionNoIn )*
            loop186:
            do {
                int alt186=2;
                alt186 = dfa186.predict(input);
                switch (alt186) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:326:29: ( LT !)* '&' ^ ( LT !)* equalityExpressionNoIn
            	    {
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:326:31: ( LT !)*
            	    loop184:
            	    do {
            	        int alt184=2;
            	        int LA184_0 = input.LA(1);

            	        if ( (LA184_0==LT) ) {
            	            alt184=1;
            	        }


            	        switch (alt184) {
            	    	case 1 :
            	    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:326:31: LT !
            	    	    {
            	    	    LT368=(Token)match(input,LT,FOLLOW_LT_in_bitwiseANDExpressionNoIn2200); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop184;
            	        }
            	    } while (true);


            	    char_literal369=(Token)match(input,42,FOLLOW_42_in_bitwiseANDExpressionNoIn2204); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal369_tree = 
            	    (CommonTree)adaptor.create(char_literal369)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal369_tree, root_0);
            	    }

            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:326:41: ( LT !)*
            	    loop185:
            	    do {
            	        int alt185=2;
            	        int LA185_0 = input.LA(1);

            	        if ( (LA185_0==LT) ) {
            	            alt185=1;
            	        }


            	        switch (alt185) {
            	    	case 1 :
            	    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:326:41: LT !
            	    	    {
            	    	    LT370=(Token)match(input,LT,FOLLOW_LT_in_bitwiseANDExpressionNoIn2207); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop185;
            	        }
            	    } while (true);


            	    pushFollow(FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn2211);
            	    equalityExpressionNoIn371=equalityExpressionNoIn();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpressionNoIn371.getTree());

            	    }
            	    break;

            	default :
            	    break loop186;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 66, bitwiseANDExpressionNoIn_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "bitwiseANDExpressionNoIn"


    public static class equalityExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "equalityExpression"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:329:1: equalityExpression : relationalExpression ( ( LT !)* ( '==' ^| '!=' ^| '===' ^| '!==' ^) ( LT !)* relationalExpression )* ;
    public final JavascriptParser.equalityExpression_return equalityExpression() throws RecognitionException {
        JavascriptParser.equalityExpression_return retval = new JavascriptParser.equalityExpression_return();
        retval.start = input.LT(1);

        int equalityExpression_StartIndex = input.index();

        CommonTree root_0 = null;

        Token LT373=null;
        Token string_literal374=null;
        Token string_literal375=null;
        Token string_literal376=null;
        Token string_literal377=null;
        Token LT378=null;
        JavascriptParser.relationalExpression_return relationalExpression372 =null;

        JavascriptParser.relationalExpression_return relationalExpression379 =null;


        CommonTree LT373_tree=null;
        CommonTree string_literal374_tree=null;
        CommonTree string_literal375_tree=null;
        CommonTree string_literal376_tree=null;
        CommonTree string_literal377_tree=null;
        CommonTree LT378_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:330:3: ( relationalExpression ( ( LT !)* ( '==' ^| '!=' ^| '===' ^| '!==' ^) ( LT !)* relationalExpression )* )
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:330:5: relationalExpression ( ( LT !)* ( '==' ^| '!=' ^| '===' ^| '!==' ^) ( LT !)* relationalExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_relationalExpression_in_equalityExpression2226);
            relationalExpression372=relationalExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression372.getTree());

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:330:26: ( ( LT !)* ( '==' ^| '!=' ^| '===' ^| '!==' ^) ( LT !)* relationalExpression )*
            loop190:
            do {
                int alt190=2;
                alt190 = dfa190.predict(input);
                switch (alt190) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:330:27: ( LT !)* ( '==' ^| '!=' ^| '===' ^| '!==' ^) ( LT !)* relationalExpression
            	    {
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:330:29: ( LT !)*
            	    loop187:
            	    do {
            	        int alt187=2;
            	        int LA187_0 = input.LA(1);

            	        if ( (LA187_0==LT) ) {
            	            alt187=1;
            	        }


            	        switch (alt187) {
            	    	case 1 :
            	    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:330:29: LT !
            	    	    {
            	    	    LT373=(Token)match(input,LT,FOLLOW_LT_in_equalityExpression2229); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop187;
            	        }
            	    } while (true);


            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:330:32: ( '==' ^| '!=' ^| '===' ^| '!==' ^)
            	    int alt188=4;
            	    switch ( input.LA(1) ) {
            	    case 65:
            	        {
            	        alt188=1;
            	        }
            	        break;
            	    case 37:
            	        {
            	        alt188=2;
            	        }
            	        break;
            	    case 66:
            	        {
            	        alt188=3;
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt188=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 188, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt188) {
            	        case 1 :
            	            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:330:33: '==' ^
            	            {
            	            string_literal374=(Token)match(input,65,FOLLOW_65_in_equalityExpression2234); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal374_tree = 
            	            (CommonTree)adaptor.create(string_literal374)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal374_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:330:41: '!=' ^
            	            {
            	            string_literal375=(Token)match(input,37,FOLLOW_37_in_equalityExpression2239); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal375_tree = 
            	            (CommonTree)adaptor.create(string_literal375)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal375_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:330:49: '===' ^
            	            {
            	            string_literal376=(Token)match(input,66,FOLLOW_66_in_equalityExpression2244); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal376_tree = 
            	            (CommonTree)adaptor.create(string_literal376)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal376_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:330:58: '!==' ^
            	            {
            	            string_literal377=(Token)match(input,38,FOLLOW_38_in_equalityExpression2249); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal377_tree = 
            	            (CommonTree)adaptor.create(string_literal377)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal377_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:330:68: ( LT !)*
            	    loop189:
            	    do {
            	        int alt189=2;
            	        int LA189_0 = input.LA(1);

            	        if ( (LA189_0==LT) ) {
            	            alt189=1;
            	        }


            	        switch (alt189) {
            	    	case 1 :
            	    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:330:68: LT !
            	    	    {
            	    	    LT378=(Token)match(input,LT,FOLLOW_LT_in_equalityExpression2253); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop189;
            	        }
            	    } while (true);


            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression2257);
            	    relationalExpression379=relationalExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression379.getTree());

            	    }
            	    break;

            	default :
            	    break loop190;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 67, equalityExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "equalityExpression"


    public static class equalityExpressionNoIn_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "equalityExpressionNoIn"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:333:1: equalityExpressionNoIn : relationalExpressionNoIn ( ( LT !)* ( '==' ^| '!=' ^| '===' ^| '!==' ^) ( LT !)* relationalExpressionNoIn )* ;
    public final JavascriptParser.equalityExpressionNoIn_return equalityExpressionNoIn() throws RecognitionException {
        JavascriptParser.equalityExpressionNoIn_return retval = new JavascriptParser.equalityExpressionNoIn_return();
        retval.start = input.LT(1);

        int equalityExpressionNoIn_StartIndex = input.index();

        CommonTree root_0 = null;

        Token LT381=null;
        Token string_literal382=null;
        Token string_literal383=null;
        Token string_literal384=null;
        Token string_literal385=null;
        Token LT386=null;
        JavascriptParser.relationalExpressionNoIn_return relationalExpressionNoIn380 =null;

        JavascriptParser.relationalExpressionNoIn_return relationalExpressionNoIn387 =null;


        CommonTree LT381_tree=null;
        CommonTree string_literal382_tree=null;
        CommonTree string_literal383_tree=null;
        CommonTree string_literal384_tree=null;
        CommonTree string_literal385_tree=null;
        CommonTree LT386_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:334:3: ( relationalExpressionNoIn ( ( LT !)* ( '==' ^| '!=' ^| '===' ^| '!==' ^) ( LT !)* relationalExpressionNoIn )* )
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:334:5: relationalExpressionNoIn ( ( LT !)* ( '==' ^| '!=' ^| '===' ^| '!==' ^) ( LT !)* relationalExpressionNoIn )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn2272);
            relationalExpressionNoIn380=relationalExpressionNoIn();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpressionNoIn380.getTree());

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:334:30: ( ( LT !)* ( '==' ^| '!=' ^| '===' ^| '!==' ^) ( LT !)* relationalExpressionNoIn )*
            loop194:
            do {
                int alt194=2;
                alt194 = dfa194.predict(input);
                switch (alt194) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:334:31: ( LT !)* ( '==' ^| '!=' ^| '===' ^| '!==' ^) ( LT !)* relationalExpressionNoIn
            	    {
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:334:33: ( LT !)*
            	    loop191:
            	    do {
            	        int alt191=2;
            	        int LA191_0 = input.LA(1);

            	        if ( (LA191_0==LT) ) {
            	            alt191=1;
            	        }


            	        switch (alt191) {
            	    	case 1 :
            	    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:334:33: LT !
            	    	    {
            	    	    LT381=(Token)match(input,LT,FOLLOW_LT_in_equalityExpressionNoIn2275); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop191;
            	        }
            	    } while (true);


            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:334:36: ( '==' ^| '!=' ^| '===' ^| '!==' ^)
            	    int alt192=4;
            	    switch ( input.LA(1) ) {
            	    case 65:
            	        {
            	        alt192=1;
            	        }
            	        break;
            	    case 37:
            	        {
            	        alt192=2;
            	        }
            	        break;
            	    case 66:
            	        {
            	        alt192=3;
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt192=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 192, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt192) {
            	        case 1 :
            	            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:334:37: '==' ^
            	            {
            	            string_literal382=(Token)match(input,65,FOLLOW_65_in_equalityExpressionNoIn2280); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal382_tree = 
            	            (CommonTree)adaptor.create(string_literal382)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal382_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:334:45: '!=' ^
            	            {
            	            string_literal383=(Token)match(input,37,FOLLOW_37_in_equalityExpressionNoIn2285); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal383_tree = 
            	            (CommonTree)adaptor.create(string_literal383)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal383_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:334:53: '===' ^
            	            {
            	            string_literal384=(Token)match(input,66,FOLLOW_66_in_equalityExpressionNoIn2290); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal384_tree = 
            	            (CommonTree)adaptor.create(string_literal384)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal384_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:334:62: '!==' ^
            	            {
            	            string_literal385=(Token)match(input,38,FOLLOW_38_in_equalityExpressionNoIn2295); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal385_tree = 
            	            (CommonTree)adaptor.create(string_literal385)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal385_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:334:72: ( LT !)*
            	    loop193:
            	    do {
            	        int alt193=2;
            	        int LA193_0 = input.LA(1);

            	        if ( (LA193_0==LT) ) {
            	            alt193=1;
            	        }


            	        switch (alt193) {
            	    	case 1 :
            	    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:334:72: LT !
            	    	    {
            	    	    LT386=(Token)match(input,LT,FOLLOW_LT_in_equalityExpressionNoIn2299); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop193;
            	        }
            	    } while (true);


            	    pushFollow(FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn2303);
            	    relationalExpressionNoIn387=relationalExpressionNoIn();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpressionNoIn387.getTree());

            	    }
            	    break;

            	default :
            	    break loop194;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 68, equalityExpressionNoIn_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "equalityExpressionNoIn"


    public static class relationalExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "relationalExpression"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:337:1: relationalExpression : shiftExpression ( ( LT !)* ( '<' ^| '>' ^| '<=' ^| '>=' ^| 'instanceof' ^| 'in' ^) ( LT !)* shiftExpression )* ;
    public final JavascriptParser.relationalExpression_return relationalExpression() throws RecognitionException {
        JavascriptParser.relationalExpression_return retval = new JavascriptParser.relationalExpression_return();
        retval.start = input.LT(1);

        int relationalExpression_StartIndex = input.index();

        CommonTree root_0 = null;

        Token LT389=null;
        Token char_literal390=null;
        Token char_literal391=null;
        Token string_literal392=null;
        Token string_literal393=null;
        Token string_literal394=null;
        Token string_literal395=null;
        Token LT396=null;
        JavascriptParser.shiftExpression_return shiftExpression388 =null;

        JavascriptParser.shiftExpression_return shiftExpression397 =null;


        CommonTree LT389_tree=null;
        CommonTree char_literal390_tree=null;
        CommonTree char_literal391_tree=null;
        CommonTree string_literal392_tree=null;
        CommonTree string_literal393_tree=null;
        CommonTree string_literal394_tree=null;
        CommonTree string_literal395_tree=null;
        CommonTree LT396_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:338:3: ( shiftExpression ( ( LT !)* ( '<' ^| '>' ^| '<=' ^| '>=' ^| 'instanceof' ^| 'in' ^) ( LT !)* shiftExpression )* )
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:338:5: shiftExpression ( ( LT !)* ( '<' ^| '>' ^| '<=' ^| '>=' ^| 'instanceof' ^| 'in' ^) ( LT !)* shiftExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_shiftExpression_in_relationalExpression2318);
            shiftExpression388=shiftExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpression388.getTree());

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:338:21: ( ( LT !)* ( '<' ^| '>' ^| '<=' ^| '>=' ^| 'instanceof' ^| 'in' ^) ( LT !)* shiftExpression )*
            loop198:
            do {
                int alt198=2;
                alt198 = dfa198.predict(input);
                switch (alt198) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:338:22: ( LT !)* ( '<' ^| '>' ^| '<=' ^| '>=' ^| 'instanceof' ^| 'in' ^) ( LT !)* shiftExpression
            	    {
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:338:24: ( LT !)*
            	    loop195:
            	    do {
            	        int alt195=2;
            	        int LA195_0 = input.LA(1);

            	        if ( (LA195_0==LT) ) {
            	            alt195=1;
            	        }


            	        switch (alt195) {
            	    	case 1 :
            	    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:338:24: LT !
            	    	    {
            	    	    LT389=(Token)match(input,LT,FOLLOW_LT_in_relationalExpression2321); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop195;
            	        }
            	    } while (true);


            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:338:27: ( '<' ^| '>' ^| '<=' ^| '>=' ^| 'instanceof' ^| 'in' ^)
            	    int alt196=6;
            	    switch ( input.LA(1) ) {
            	    case 60:
            	        {
            	        alt196=1;
            	        }
            	        break;
            	    case 67:
            	        {
            	        alt196=2;
            	        }
            	        break;
            	    case 63:
            	        {
            	        alt196=3;
            	        }
            	        break;
            	    case 68:
            	        {
            	        alt196=4;
            	        }
            	        break;
            	    case 92:
            	        {
            	        alt196=5;
            	        }
            	        break;
            	    case 91:
            	        {
            	        alt196=6;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 196, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt196) {
            	        case 1 :
            	            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:338:28: '<' ^
            	            {
            	            char_literal390=(Token)match(input,60,FOLLOW_60_in_relationalExpression2326); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal390_tree = 
            	            (CommonTree)adaptor.create(char_literal390)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal390_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:338:35: '>' ^
            	            {
            	            char_literal391=(Token)match(input,67,FOLLOW_67_in_relationalExpression2331); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal391_tree = 
            	            (CommonTree)adaptor.create(char_literal391)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal391_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:338:42: '<=' ^
            	            {
            	            string_literal392=(Token)match(input,63,FOLLOW_63_in_relationalExpression2336); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal392_tree = 
            	            (CommonTree)adaptor.create(string_literal392)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal392_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:338:50: '>=' ^
            	            {
            	            string_literal393=(Token)match(input,68,FOLLOW_68_in_relationalExpression2341); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal393_tree = 
            	            (CommonTree)adaptor.create(string_literal393)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal393_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:338:58: 'instanceof' ^
            	            {
            	            string_literal394=(Token)match(input,92,FOLLOW_92_in_relationalExpression2346); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal394_tree = 
            	            (CommonTree)adaptor.create(string_literal394)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal394_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:338:74: 'in' ^
            	            {
            	            string_literal395=(Token)match(input,91,FOLLOW_91_in_relationalExpression2351); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal395_tree = 
            	            (CommonTree)adaptor.create(string_literal395)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal395_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:338:83: ( LT !)*
            	    loop197:
            	    do {
            	        int alt197=2;
            	        int LA197_0 = input.LA(1);

            	        if ( (LA197_0==LT) ) {
            	            alt197=1;
            	        }


            	        switch (alt197) {
            	    	case 1 :
            	    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:338:83: LT !
            	    	    {
            	    	    LT396=(Token)match(input,LT,FOLLOW_LT_in_relationalExpression2355); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop197;
            	        }
            	    } while (true);


            	    pushFollow(FOLLOW_shiftExpression_in_relationalExpression2359);
            	    shiftExpression397=shiftExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpression397.getTree());

            	    }
            	    break;

            	default :
            	    break loop198;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 69, relationalExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "relationalExpression"


    public static class relationalExpressionNoIn_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "relationalExpressionNoIn"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:341:1: relationalExpressionNoIn : shiftExpression ( ( LT !)* ( '<' ^| '>' ^| '<=' ^| '>=' ^| 'instanceof' ^) ( LT !)* shiftExpression )* ;
    public final JavascriptParser.relationalExpressionNoIn_return relationalExpressionNoIn() throws RecognitionException {
        JavascriptParser.relationalExpressionNoIn_return retval = new JavascriptParser.relationalExpressionNoIn_return();
        retval.start = input.LT(1);

        int relationalExpressionNoIn_StartIndex = input.index();

        CommonTree root_0 = null;

        Token LT399=null;
        Token char_literal400=null;
        Token char_literal401=null;
        Token string_literal402=null;
        Token string_literal403=null;
        Token string_literal404=null;
        Token LT405=null;
        JavascriptParser.shiftExpression_return shiftExpression398 =null;

        JavascriptParser.shiftExpression_return shiftExpression406 =null;


        CommonTree LT399_tree=null;
        CommonTree char_literal400_tree=null;
        CommonTree char_literal401_tree=null;
        CommonTree string_literal402_tree=null;
        CommonTree string_literal403_tree=null;
        CommonTree string_literal404_tree=null;
        CommonTree LT405_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:342:3: ( shiftExpression ( ( LT !)* ( '<' ^| '>' ^| '<=' ^| '>=' ^| 'instanceof' ^) ( LT !)* shiftExpression )* )
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:342:5: shiftExpression ( ( LT !)* ( '<' ^| '>' ^| '<=' ^| '>=' ^| 'instanceof' ^) ( LT !)* shiftExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_shiftExpression_in_relationalExpressionNoIn2374);
            shiftExpression398=shiftExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpression398.getTree());

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:342:21: ( ( LT !)* ( '<' ^| '>' ^| '<=' ^| '>=' ^| 'instanceof' ^) ( LT !)* shiftExpression )*
            loop202:
            do {
                int alt202=2;
                alt202 = dfa202.predict(input);
                switch (alt202) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:342:22: ( LT !)* ( '<' ^| '>' ^| '<=' ^| '>=' ^| 'instanceof' ^) ( LT !)* shiftExpression
            	    {
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:342:24: ( LT !)*
            	    loop199:
            	    do {
            	        int alt199=2;
            	        int LA199_0 = input.LA(1);

            	        if ( (LA199_0==LT) ) {
            	            alt199=1;
            	        }


            	        switch (alt199) {
            	    	case 1 :
            	    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:342:24: LT !
            	    	    {
            	    	    LT399=(Token)match(input,LT,FOLLOW_LT_in_relationalExpressionNoIn2377); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop199;
            	        }
            	    } while (true);


            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:342:27: ( '<' ^| '>' ^| '<=' ^| '>=' ^| 'instanceof' ^)
            	    int alt200=5;
            	    switch ( input.LA(1) ) {
            	    case 60:
            	        {
            	        alt200=1;
            	        }
            	        break;
            	    case 67:
            	        {
            	        alt200=2;
            	        }
            	        break;
            	    case 63:
            	        {
            	        alt200=3;
            	        }
            	        break;
            	    case 68:
            	        {
            	        alt200=4;
            	        }
            	        break;
            	    case 92:
            	        {
            	        alt200=5;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 200, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt200) {
            	        case 1 :
            	            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:342:28: '<' ^
            	            {
            	            char_literal400=(Token)match(input,60,FOLLOW_60_in_relationalExpressionNoIn2382); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal400_tree = 
            	            (CommonTree)adaptor.create(char_literal400)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal400_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:342:35: '>' ^
            	            {
            	            char_literal401=(Token)match(input,67,FOLLOW_67_in_relationalExpressionNoIn2387); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal401_tree = 
            	            (CommonTree)adaptor.create(char_literal401)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal401_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:342:42: '<=' ^
            	            {
            	            string_literal402=(Token)match(input,63,FOLLOW_63_in_relationalExpressionNoIn2392); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal402_tree = 
            	            (CommonTree)adaptor.create(string_literal402)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal402_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:342:50: '>=' ^
            	            {
            	            string_literal403=(Token)match(input,68,FOLLOW_68_in_relationalExpressionNoIn2397); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal403_tree = 
            	            (CommonTree)adaptor.create(string_literal403)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal403_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:342:58: 'instanceof' ^
            	            {
            	            string_literal404=(Token)match(input,92,FOLLOW_92_in_relationalExpressionNoIn2402); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal404_tree = 
            	            (CommonTree)adaptor.create(string_literal404)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal404_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:342:75: ( LT !)*
            	    loop201:
            	    do {
            	        int alt201=2;
            	        int LA201_0 = input.LA(1);

            	        if ( (LA201_0==LT) ) {
            	            alt201=1;
            	        }


            	        switch (alt201) {
            	    	case 1 :
            	    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:342:75: LT !
            	    	    {
            	    	    LT405=(Token)match(input,LT,FOLLOW_LT_in_relationalExpressionNoIn2406); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop201;
            	        }
            	    } while (true);


            	    pushFollow(FOLLOW_shiftExpression_in_relationalExpressionNoIn2410);
            	    shiftExpression406=shiftExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpression406.getTree());

            	    }
            	    break;

            	default :
            	    break loop202;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 70, relationalExpressionNoIn_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "relationalExpressionNoIn"


    public static class shiftExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "shiftExpression"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:345:1: shiftExpression : additiveExpression ( ( LT !)* ( '<<' ^| '>>' ^| '>>>' ^) ( LT !)* additiveExpression )* ;
    public final JavascriptParser.shiftExpression_return shiftExpression() throws RecognitionException {
        JavascriptParser.shiftExpression_return retval = new JavascriptParser.shiftExpression_return();
        retval.start = input.LT(1);

        int shiftExpression_StartIndex = input.index();

        CommonTree root_0 = null;

        Token LT408=null;
        Token string_literal409=null;
        Token string_literal410=null;
        Token string_literal411=null;
        Token LT412=null;
        JavascriptParser.additiveExpression_return additiveExpression407 =null;

        JavascriptParser.additiveExpression_return additiveExpression413 =null;


        CommonTree LT408_tree=null;
        CommonTree string_literal409_tree=null;
        CommonTree string_literal410_tree=null;
        CommonTree string_literal411_tree=null;
        CommonTree LT412_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:346:3: ( additiveExpression ( ( LT !)* ( '<<' ^| '>>' ^| '>>>' ^) ( LT !)* additiveExpression )* )
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:346:5: additiveExpression ( ( LT !)* ( '<<' ^| '>>' ^| '>>>' ^) ( LT !)* additiveExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_additiveExpression_in_shiftExpression2425);
            additiveExpression407=additiveExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression407.getTree());

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:346:24: ( ( LT !)* ( '<<' ^| '>>' ^| '>>>' ^) ( LT !)* additiveExpression )*
            loop206:
            do {
                int alt206=2;
                alt206 = dfa206.predict(input);
                switch (alt206) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:346:25: ( LT !)* ( '<<' ^| '>>' ^| '>>>' ^) ( LT !)* additiveExpression
            	    {
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:346:27: ( LT !)*
            	    loop203:
            	    do {
            	        int alt203=2;
            	        int LA203_0 = input.LA(1);

            	        if ( (LA203_0==LT) ) {
            	            alt203=1;
            	        }


            	        switch (alt203) {
            	    	case 1 :
            	    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:346:27: LT !
            	    	    {
            	    	    LT408=(Token)match(input,LT,FOLLOW_LT_in_shiftExpression2428); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop203;
            	        }
            	    } while (true);


            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:346:30: ( '<<' ^| '>>' ^| '>>>' ^)
            	    int alt204=3;
            	    switch ( input.LA(1) ) {
            	    case 61:
            	        {
            	        alt204=1;
            	        }
            	        break;
            	    case 69:
            	        {
            	        alt204=2;
            	        }
            	        break;
            	    case 71:
            	        {
            	        alt204=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 204, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt204) {
            	        case 1 :
            	            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:346:31: '<<' ^
            	            {
            	            string_literal409=(Token)match(input,61,FOLLOW_61_in_shiftExpression2433); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal409_tree = 
            	            (CommonTree)adaptor.create(string_literal409)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal409_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:346:39: '>>' ^
            	            {
            	            string_literal410=(Token)match(input,69,FOLLOW_69_in_shiftExpression2438); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal410_tree = 
            	            (CommonTree)adaptor.create(string_literal410)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal410_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:346:47: '>>>' ^
            	            {
            	            string_literal411=(Token)match(input,71,FOLLOW_71_in_shiftExpression2443); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal411_tree = 
            	            (CommonTree)adaptor.create(string_literal411)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal411_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:346:57: ( LT !)*
            	    loop205:
            	    do {
            	        int alt205=2;
            	        int LA205_0 = input.LA(1);

            	        if ( (LA205_0==LT) ) {
            	            alt205=1;
            	        }


            	        switch (alt205) {
            	    	case 1 :
            	    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:346:57: LT !
            	    	    {
            	    	    LT412=(Token)match(input,LT,FOLLOW_LT_in_shiftExpression2447); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop205;
            	        }
            	    } while (true);


            	    pushFollow(FOLLOW_additiveExpression_in_shiftExpression2451);
            	    additiveExpression413=additiveExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression413.getTree());

            	    }
            	    break;

            	default :
            	    break loop206;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 71, shiftExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "shiftExpression"


    public static class additiveExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "additiveExpression"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:349:1: additiveExpression : multiplicativeExpression ( ( LT !)* ( '+' ^| '-' ^) ( LT !)* multiplicativeExpression )* ;
    public final JavascriptParser.additiveExpression_return additiveExpression() throws RecognitionException {
        JavascriptParser.additiveExpression_return retval = new JavascriptParser.additiveExpression_return();
        retval.start = input.LT(1);

        int additiveExpression_StartIndex = input.index();

        CommonTree root_0 = null;

        Token LT415=null;
        Token char_literal416=null;
        Token char_literal417=null;
        Token LT418=null;
        JavascriptParser.multiplicativeExpression_return multiplicativeExpression414 =null;

        JavascriptParser.multiplicativeExpression_return multiplicativeExpression419 =null;


        CommonTree LT415_tree=null;
        CommonTree char_literal416_tree=null;
        CommonTree char_literal417_tree=null;
        CommonTree LT418_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:350:3: ( multiplicativeExpression ( ( LT !)* ( '+' ^| '-' ^) ( LT !)* multiplicativeExpression )* )
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:350:5: multiplicativeExpression ( ( LT !)* ( '+' ^| '-' ^) ( LT !)* multiplicativeExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression2466);
            multiplicativeExpression414=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression414.getTree());

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:350:30: ( ( LT !)* ( '+' ^| '-' ^) ( LT !)* multiplicativeExpression )*
            loop210:
            do {
                int alt210=2;
                int LA210_0 = input.LA(1);

                if ( (LA210_0==LT) ) {
                    int LA210_1 = input.LA(2);

                    if ( (synpred256_Javascript()) ) {
                        alt210=1;
                    }


                }
                else if ( (LA210_0==48||LA210_0==52) ) {
                    alt210=1;
                }


                switch (alt210) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:350:31: ( LT !)* ( '+' ^| '-' ^) ( LT !)* multiplicativeExpression
            	    {
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:350:33: ( LT !)*
            	    loop207:
            	    do {
            	        int alt207=2;
            	        int LA207_0 = input.LA(1);

            	        if ( (LA207_0==LT) ) {
            	            alt207=1;
            	        }


            	        switch (alt207) {
            	    	case 1 :
            	    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:350:33: LT !
            	    	    {
            	    	    LT415=(Token)match(input,LT,FOLLOW_LT_in_additiveExpression2469); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop207;
            	        }
            	    } while (true);


            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:350:36: ( '+' ^| '-' ^)
            	    int alt208=2;
            	    int LA208_0 = input.LA(1);

            	    if ( (LA208_0==48) ) {
            	        alt208=1;
            	    }
            	    else if ( (LA208_0==52) ) {
            	        alt208=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 208, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt208) {
            	        case 1 :
            	            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:350:37: '+' ^
            	            {
            	            char_literal416=(Token)match(input,48,FOLLOW_48_in_additiveExpression2474); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal416_tree = 
            	            (CommonTree)adaptor.create(char_literal416)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal416_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:350:44: '-' ^
            	            {
            	            char_literal417=(Token)match(input,52,FOLLOW_52_in_additiveExpression2479); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal417_tree = 
            	            (CommonTree)adaptor.create(char_literal417)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal417_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:350:52: ( LT !)*
            	    loop209:
            	    do {
            	        int alt209=2;
            	        int LA209_0 = input.LA(1);

            	        if ( (LA209_0==LT) ) {
            	            alt209=1;
            	        }


            	        switch (alt209) {
            	    	case 1 :
            	    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:350:52: LT !
            	    	    {
            	    	    LT418=(Token)match(input,LT,FOLLOW_LT_in_additiveExpression2483); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop209;
            	        }
            	    } while (true);


            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression2487);
            	    multiplicativeExpression419=multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression419.getTree());

            	    }
            	    break;

            	default :
            	    break loop210;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 72, additiveExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "additiveExpression"


    public static class multiplicativeExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "multiplicativeExpression"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:353:1: multiplicativeExpression : unaryExpression ( ( LT !)* ( '*' ^| '/' ^| '%' ^) ( LT !)* unaryExpression )* ;
    public final JavascriptParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        JavascriptParser.multiplicativeExpression_return retval = new JavascriptParser.multiplicativeExpression_return();
        retval.start = input.LT(1);

        int multiplicativeExpression_StartIndex = input.index();

        CommonTree root_0 = null;

        Token LT421=null;
        Token char_literal422=null;
        Token char_literal423=null;
        Token char_literal424=null;
        Token LT425=null;
        JavascriptParser.unaryExpression_return unaryExpression420 =null;

        JavascriptParser.unaryExpression_return unaryExpression426 =null;


        CommonTree LT421_tree=null;
        CommonTree char_literal422_tree=null;
        CommonTree char_literal423_tree=null;
        CommonTree char_literal424_tree=null;
        CommonTree LT425_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:354:3: ( unaryExpression ( ( LT !)* ( '*' ^| '/' ^| '%' ^) ( LT !)* unaryExpression )* )
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:354:5: unaryExpression ( ( LT !)* ( '*' ^| '/' ^| '%' ^) ( LT !)* unaryExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression2502);
            unaryExpression420=unaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression420.getTree());

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:354:21: ( ( LT !)* ( '*' ^| '/' ^| '%' ^) ( LT !)* unaryExpression )*
            loop214:
            do {
                int alt214=2;
                alt214 = dfa214.predict(input);
                switch (alt214) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:354:22: ( LT !)* ( '*' ^| '/' ^| '%' ^) ( LT !)* unaryExpression
            	    {
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:354:24: ( LT !)*
            	    loop211:
            	    do {
            	        int alt211=2;
            	        int LA211_0 = input.LA(1);

            	        if ( (LA211_0==LT) ) {
            	            alt211=1;
            	        }


            	        switch (alt211) {
            	    	case 1 :
            	    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:354:24: LT !
            	    	    {
            	    	    LT421=(Token)match(input,LT,FOLLOW_LT_in_multiplicativeExpression2505); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop211;
            	        }
            	    } while (true);


            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:354:27: ( '*' ^| '/' ^| '%' ^)
            	    int alt212=3;
            	    switch ( input.LA(1) ) {
            	    case 46:
            	        {
            	        alt212=1;
            	        }
            	        break;
            	    case 56:
            	        {
            	        alt212=2;
            	        }
            	        break;
            	    case 39:
            	        {
            	        alt212=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 212, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt212) {
            	        case 1 :
            	            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:354:28: '*' ^
            	            {
            	            char_literal422=(Token)match(input,46,FOLLOW_46_in_multiplicativeExpression2510); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal422_tree = 
            	            (CommonTree)adaptor.create(char_literal422)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal422_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:354:35: '/' ^
            	            {
            	            char_literal423=(Token)match(input,56,FOLLOW_56_in_multiplicativeExpression2515); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal423_tree = 
            	            (CommonTree)adaptor.create(char_literal423)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal423_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:354:42: '%' ^
            	            {
            	            char_literal424=(Token)match(input,39,FOLLOW_39_in_multiplicativeExpression2520); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal424_tree = 
            	            (CommonTree)adaptor.create(char_literal424)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal424_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:354:50: ( LT !)*
            	    loop213:
            	    do {
            	        int alt213=2;
            	        int LA213_0 = input.LA(1);

            	        if ( (LA213_0==LT) ) {
            	            alt213=1;
            	        }


            	        switch (alt213) {
            	    	case 1 :
            	    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:354:50: LT !
            	    	    {
            	    	    LT425=(Token)match(input,LT,FOLLOW_LT_in_multiplicativeExpression2524); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop213;
            	        }
            	    } while (true);


            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression2528);
            	    unaryExpression426=unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression426.getTree());

            	    }
            	    break;

            	default :
            	    break loop214;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 73, multiplicativeExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "multiplicativeExpression"


    public static class unaryExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unaryExpression"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:357:1: unaryExpression : ( postfixExpression | ( 'delete' ^| 'void' ^| 'typeof' ^| '++' ^| '--' ^| '+' ^| '-' ^| '~' ^| '!' ^) unaryExpression );
    public final JavascriptParser.unaryExpression_return unaryExpression() throws RecognitionException {
        JavascriptParser.unaryExpression_return retval = new JavascriptParser.unaryExpression_return();
        retval.start = input.LT(1);

        int unaryExpression_StartIndex = input.index();

        CommonTree root_0 = null;

        Token string_literal428=null;
        Token string_literal429=null;
        Token string_literal430=null;
        Token string_literal431=null;
        Token string_literal432=null;
        Token char_literal433=null;
        Token char_literal434=null;
        Token char_literal435=null;
        Token char_literal436=null;
        JavascriptParser.postfixExpression_return postfixExpression427 =null;

        JavascriptParser.unaryExpression_return unaryExpression437 =null;


        CommonTree string_literal428_tree=null;
        CommonTree string_literal429_tree=null;
        CommonTree string_literal430_tree=null;
        CommonTree string_literal431_tree=null;
        CommonTree string_literal432_tree=null;
        CommonTree char_literal433_tree=null;
        CommonTree char_literal434_tree=null;
        CommonTree char_literal435_tree=null;
        CommonTree char_literal436_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:358:3: ( postfixExpression | ( 'delete' ^| 'void' ^| 'typeof' ^| '++' ^| '--' ^| '+' ^| '-' ^| '~' ^| '!' ^) unaryExpression )
            int alt216=2;
            int LA216_0 = input.LA(1);

            if ( (LA216_0==Identifier||LA216_0==NumericLiteral||LA216_0==StringLiteral||LA216_0==44||LA216_0==74||LA216_0==86||LA216_0==89||(LA216_0 >= 93 && LA216_0 <= 94)||LA216_0==97||LA216_0==99||LA216_0==106) ) {
                alt216=1;
            }
            else if ( (LA216_0==36||(LA216_0 >= 48 && LA216_0 <= 49)||(LA216_0 >= 52 && LA216_0 <= 53)||LA216_0==83||LA216_0==101||LA216_0==103||LA216_0==111) ) {
                alt216=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 216, 0, input);

                throw nvae;

            }
            switch (alt216) {
                case 1 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:358:5: postfixExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_postfixExpression_in_unaryExpression2543);
                    postfixExpression427=postfixExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfixExpression427.getTree());

                    }
                    break;
                case 2 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:359:5: ( 'delete' ^| 'void' ^| 'typeof' ^| '++' ^| '--' ^| '+' ^| '-' ^| '~' ^| '!' ^) unaryExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:359:5: ( 'delete' ^| 'void' ^| 'typeof' ^| '++' ^| '--' ^| '+' ^| '-' ^| '~' ^| '!' ^)
                    int alt215=9;
                    switch ( input.LA(1) ) {
                    case 83:
                        {
                        alt215=1;
                        }
                        break;
                    case 103:
                        {
                        alt215=2;
                        }
                        break;
                    case 101:
                        {
                        alt215=3;
                        }
                        break;
                    case 49:
                        {
                        alt215=4;
                        }
                        break;
                    case 53:
                        {
                        alt215=5;
                        }
                        break;
                    case 48:
                        {
                        alt215=6;
                        }
                        break;
                    case 52:
                        {
                        alt215=7;
                        }
                        break;
                    case 111:
                        {
                        alt215=8;
                        }
                        break;
                    case 36:
                        {
                        alt215=9;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 215, 0, input);

                        throw nvae;

                    }

                    switch (alt215) {
                        case 1 :
                            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:359:6: 'delete' ^
                            {
                            string_literal428=(Token)match(input,83,FOLLOW_83_in_unaryExpression2550); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal428_tree = 
                            (CommonTree)adaptor.create(string_literal428)
                            ;
                            root_0 = (CommonTree)adaptor.becomeRoot(string_literal428_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:359:18: 'void' ^
                            {
                            string_literal429=(Token)match(input,103,FOLLOW_103_in_unaryExpression2555); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal429_tree = 
                            (CommonTree)adaptor.create(string_literal429)
                            ;
                            root_0 = (CommonTree)adaptor.becomeRoot(string_literal429_tree, root_0);
                            }

                            }
                            break;
                        case 3 :
                            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:359:28: 'typeof' ^
                            {
                            string_literal430=(Token)match(input,101,FOLLOW_101_in_unaryExpression2560); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal430_tree = 
                            (CommonTree)adaptor.create(string_literal430)
                            ;
                            root_0 = (CommonTree)adaptor.becomeRoot(string_literal430_tree, root_0);
                            }

                            }
                            break;
                        case 4 :
                            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:359:40: '++' ^
                            {
                            string_literal431=(Token)match(input,49,FOLLOW_49_in_unaryExpression2565); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal431_tree = 
                            (CommonTree)adaptor.create(string_literal431)
                            ;
                            root_0 = (CommonTree)adaptor.becomeRoot(string_literal431_tree, root_0);
                            }

                            }
                            break;
                        case 5 :
                            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:359:48: '--' ^
                            {
                            string_literal432=(Token)match(input,53,FOLLOW_53_in_unaryExpression2570); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal432_tree = 
                            (CommonTree)adaptor.create(string_literal432)
                            ;
                            root_0 = (CommonTree)adaptor.becomeRoot(string_literal432_tree, root_0);
                            }

                            }
                            break;
                        case 6 :
                            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:359:56: '+' ^
                            {
                            char_literal433=(Token)match(input,48,FOLLOW_48_in_unaryExpression2575); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal433_tree = 
                            (CommonTree)adaptor.create(char_literal433)
                            ;
                            root_0 = (CommonTree)adaptor.becomeRoot(char_literal433_tree, root_0);
                            }

                            }
                            break;
                        case 7 :
                            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:359:63: '-' ^
                            {
                            char_literal434=(Token)match(input,52,FOLLOW_52_in_unaryExpression2580); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal434_tree = 
                            (CommonTree)adaptor.create(char_literal434)
                            ;
                            root_0 = (CommonTree)adaptor.becomeRoot(char_literal434_tree, root_0);
                            }

                            }
                            break;
                        case 8 :
                            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:359:70: '~' ^
                            {
                            char_literal435=(Token)match(input,111,FOLLOW_111_in_unaryExpression2585); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal435_tree = 
                            (CommonTree)adaptor.create(char_literal435)
                            ;
                            root_0 = (CommonTree)adaptor.becomeRoot(char_literal435_tree, root_0);
                            }

                            }
                            break;
                        case 9 :
                            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:359:77: '!' ^
                            {
                            char_literal436=(Token)match(input,36,FOLLOW_36_in_unaryExpression2590); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal436_tree = 
                            (CommonTree)adaptor.create(char_literal436)
                            ;
                            root_0 = (CommonTree)adaptor.becomeRoot(char_literal436_tree, root_0);
                            }

                            }
                            break;

                    }


                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression2594);
                    unaryExpression437=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression437.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 74, unaryExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "unaryExpression"


    public static class postfixExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "postfixExpression"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:362:1: postfixExpression : leftHandSideExpression ( '++' ^| '--' ^)? ;
    public final JavascriptParser.postfixExpression_return postfixExpression() throws RecognitionException {
        JavascriptParser.postfixExpression_return retval = new JavascriptParser.postfixExpression_return();
        retval.start = input.LT(1);

        int postfixExpression_StartIndex = input.index();

        CommonTree root_0 = null;

        Token string_literal439=null;
        Token string_literal440=null;
        JavascriptParser.leftHandSideExpression_return leftHandSideExpression438 =null;


        CommonTree string_literal439_tree=null;
        CommonTree string_literal440_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:363:3: ( leftHandSideExpression ( '++' ^| '--' ^)? )
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:363:5: leftHandSideExpression ( '++' ^| '--' ^)?
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_leftHandSideExpression_in_postfixExpression2607);
            leftHandSideExpression438=leftHandSideExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, leftHandSideExpression438.getTree());

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:363:28: ( '++' ^| '--' ^)?
            int alt217=3;
            int LA217_0 = input.LA(1);

            if ( (LA217_0==49) ) {
                alt217=1;
            }
            else if ( (LA217_0==53) ) {
                alt217=2;
            }
            switch (alt217) {
                case 1 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:363:29: '++' ^
                    {
                    string_literal439=(Token)match(input,49,FOLLOW_49_in_postfixExpression2610); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal439_tree = 
                    (CommonTree)adaptor.create(string_literal439)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(string_literal439_tree, root_0);
                    }

                    }
                    break;
                case 2 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:363:37: '--' ^
                    {
                    string_literal440=(Token)match(input,53,FOLLOW_53_in_postfixExpression2615); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal440_tree = 
                    (CommonTree)adaptor.create(string_literal440)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(string_literal440_tree, root_0);
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 75, postfixExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "postfixExpression"


    public static class primaryExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primaryExpression"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:366:1: primaryExpression : ( 'this' | Identifier | literal | arrayLiteral | objectLiteral | '(' ^ ( LT !)* expression ( LT !)* ')' );
    public final JavascriptParser.primaryExpression_return primaryExpression() throws RecognitionException {
        JavascriptParser.primaryExpression_return retval = new JavascriptParser.primaryExpression_return();
        retval.start = input.LT(1);

        int primaryExpression_StartIndex = input.index();

        CommonTree root_0 = null;

        Token string_literal441=null;
        Token Identifier442=null;
        Token char_literal446=null;
        Token LT447=null;
        Token LT449=null;
        Token char_literal450=null;
        JavascriptParser.literal_return literal443 =null;

        JavascriptParser.arrayLiteral_return arrayLiteral444 =null;

        JavascriptParser.objectLiteral_return objectLiteral445 =null;

        JavascriptParser.expression_return expression448 =null;


        CommonTree string_literal441_tree=null;
        CommonTree Identifier442_tree=null;
        CommonTree char_literal446_tree=null;
        CommonTree LT447_tree=null;
        CommonTree LT449_tree=null;
        CommonTree char_literal450_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:367:3: ( 'this' | Identifier | literal | arrayLiteral | objectLiteral | '(' ^ ( LT !)* expression ( LT !)* ')' )
            int alt220=6;
            switch ( input.LA(1) ) {
            case 97:
                {
                alt220=1;
                }
                break;
            case Identifier:
                {
                alt220=2;
                }
                break;
            case NumericLiteral:
            case StringLiteral:
            case 86:
            case 94:
            case 99:
                {
                alt220=3;
                }
                break;
            case 74:
                {
                alt220=4;
                }
                break;
            case 106:
                {
                alt220=5;
                }
                break;
            case 44:
                {
                alt220=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 220, 0, input);

                throw nvae;

            }

            switch (alt220) {
                case 1 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:367:5: 'this'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal441=(Token)match(input,97,FOLLOW_97_in_primaryExpression2631); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal441_tree = 
                    (CommonTree)adaptor.create(string_literal441)
                    ;
                    adaptor.addChild(root_0, string_literal441_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:368:5: Identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    Identifier442=(Token)match(input,Identifier,FOLLOW_Identifier_in_primaryExpression2637); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Identifier442_tree = 
                    (CommonTree)adaptor.create(Identifier442)
                    ;
                    adaptor.addChild(root_0, Identifier442_tree);
                    }

                    }
                    break;
                case 3 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:369:5: literal
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_literal_in_primaryExpression2643);
                    literal443=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, literal443.getTree());

                    }
                    break;
                case 4 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:370:5: arrayLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_arrayLiteral_in_primaryExpression2649);
                    arrayLiteral444=arrayLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayLiteral444.getTree());

                    }
                    break;
                case 5 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:371:5: objectLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_objectLiteral_in_primaryExpression2655);
                    objectLiteral445=objectLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, objectLiteral445.getTree());

                    }
                    break;
                case 6 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:372:5: '(' ^ ( LT !)* expression ( LT !)* ')'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal446=(Token)match(input,44,FOLLOW_44_in_primaryExpression2661); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal446_tree = 
                    (CommonTree)adaptor.create(char_literal446)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(char_literal446_tree, root_0);
                    }

                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:372:12: ( LT !)*
                    loop218:
                    do {
                        int alt218=2;
                        int LA218_0 = input.LA(1);

                        if ( (LA218_0==LT) ) {
                            alt218=1;
                        }


                        switch (alt218) {
                    	case 1 :
                    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:372:12: LT !
                    	    {
                    	    LT447=(Token)match(input,LT,FOLLOW_LT_in_primaryExpression2664); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop218;
                        }
                    } while (true);


                    pushFollow(FOLLOW_expression_in_primaryExpression2668);
                    expression448=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression448.getTree());

                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:372:28: ( LT !)*
                    loop219:
                    do {
                        int alt219=2;
                        int LA219_0 = input.LA(1);

                        if ( (LA219_0==LT) ) {
                            alt219=1;
                        }


                        switch (alt219) {
                    	case 1 :
                    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:372:28: LT !
                    	    {
                    	    LT449=(Token)match(input,LT,FOLLOW_LT_in_primaryExpression2670); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop219;
                        }
                    } while (true);


                    char_literal450=(Token)match(input,45,FOLLOW_45_in_primaryExpression2674); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal450_tree = 
                    (CommonTree)adaptor.create(char_literal450)
                    ;
                    adaptor.addChild(root_0, char_literal450_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 76, primaryExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "primaryExpression"


    public static class arrayLiteral_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arrayLiteral"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:376:1: arrayLiteral : '[' ( LT !)* ( assignmentExpression )? ( ( LT !)* ',' ( ( LT !)* assignmentExpression )? )* ( LT !)* ']' ;
    public final JavascriptParser.arrayLiteral_return arrayLiteral() throws RecognitionException {
        JavascriptParser.arrayLiteral_return retval = new JavascriptParser.arrayLiteral_return();
        retval.start = input.LT(1);

        int arrayLiteral_StartIndex = input.index();

        CommonTree root_0 = null;

        Token char_literal451=null;
        Token LT452=null;
        Token LT454=null;
        Token char_literal455=null;
        Token LT456=null;
        Token LT458=null;
        Token char_literal459=null;
        JavascriptParser.assignmentExpression_return assignmentExpression453 =null;

        JavascriptParser.assignmentExpression_return assignmentExpression457 =null;


        CommonTree char_literal451_tree=null;
        CommonTree LT452_tree=null;
        CommonTree LT454_tree=null;
        CommonTree char_literal455_tree=null;
        CommonTree LT456_tree=null;
        CommonTree LT458_tree=null;
        CommonTree char_literal459_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:377:3: ( '[' ( LT !)* ( assignmentExpression )? ( ( LT !)* ',' ( ( LT !)* assignmentExpression )? )* ( LT !)* ']' )
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:377:5: '[' ( LT !)* ( assignmentExpression )? ( ( LT !)* ',' ( ( LT !)* assignmentExpression )? )* ( LT !)* ']'
            {
            root_0 = (CommonTree)adaptor.nil();


            char_literal451=(Token)match(input,74,FOLLOW_74_in_arrayLiteral2688); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal451_tree = 
            (CommonTree)adaptor.create(char_literal451)
            ;
            adaptor.addChild(root_0, char_literal451_tree);
            }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:377:11: ( LT !)*
            loop221:
            do {
                int alt221=2;
                int LA221_0 = input.LA(1);

                if ( (LA221_0==LT) ) {
                    int LA221_2 = input.LA(2);

                    if ( (synpred280_Javascript()) ) {
                        alt221=1;
                    }


                }


                switch (alt221) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:377:11: LT !
            	    {
            	    LT452=(Token)match(input,LT,FOLLOW_LT_in_arrayLiteral2690); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop221;
                }
            } while (true);


            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:377:14: ( assignmentExpression )?
            int alt222=2;
            int LA222_0 = input.LA(1);

            if ( (LA222_0==Identifier||LA222_0==NumericLiteral||LA222_0==StringLiteral||LA222_0==36||LA222_0==44||(LA222_0 >= 48 && LA222_0 <= 49)||(LA222_0 >= 52 && LA222_0 <= 53)||LA222_0==74||LA222_0==83||LA222_0==86||LA222_0==89||(LA222_0 >= 93 && LA222_0 <= 94)||LA222_0==97||LA222_0==99||LA222_0==101||LA222_0==103||LA222_0==106||LA222_0==111) ) {
                alt222=1;
            }
            switch (alt222) {
                case 1 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:377:14: assignmentExpression
                    {
                    pushFollow(FOLLOW_assignmentExpression_in_arrayLiteral2694);
                    assignmentExpression453=assignmentExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpression453.getTree());

                    }
                    break;

            }


            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:377:36: ( ( LT !)* ',' ( ( LT !)* assignmentExpression )? )*
            loop226:
            do {
                int alt226=2;
                alt226 = dfa226.predict(input);
                switch (alt226) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:377:37: ( LT !)* ',' ( ( LT !)* assignmentExpression )?
            	    {
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:377:39: ( LT !)*
            	    loop223:
            	    do {
            	        int alt223=2;
            	        int LA223_0 = input.LA(1);

            	        if ( (LA223_0==LT) ) {
            	            alt223=1;
            	        }


            	        switch (alt223) {
            	    	case 1 :
            	    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:377:39: LT !
            	    	    {
            	    	    LT454=(Token)match(input,LT,FOLLOW_LT_in_arrayLiteral2698); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop223;
            	        }
            	    } while (true);


            	    char_literal455=(Token)match(input,51,FOLLOW_51_in_arrayLiteral2702); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal455_tree = 
            	    (CommonTree)adaptor.create(char_literal455)
            	    ;
            	    adaptor.addChild(root_0, char_literal455_tree);
            	    }

            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:377:46: ( ( LT !)* assignmentExpression )?
            	    int alt225=2;
            	    alt225 = dfa225.predict(input);
            	    switch (alt225) {
            	        case 1 :
            	            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:377:47: ( LT !)* assignmentExpression
            	            {
            	            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:377:49: ( LT !)*
            	            loop224:
            	            do {
            	                int alt224=2;
            	                int LA224_0 = input.LA(1);

            	                if ( (LA224_0==LT) ) {
            	                    alt224=1;
            	                }


            	                switch (alt224) {
            	            	case 1 :
            	            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:377:49: LT !
            	            	    {
            	            	    LT456=(Token)match(input,LT,FOLLOW_LT_in_arrayLiteral2705); if (state.failed) return retval;

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop224;
            	                }
            	            } while (true);


            	            pushFollow(FOLLOW_assignmentExpression_in_arrayLiteral2709);
            	            assignmentExpression457=assignmentExpression();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpression457.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop226;
                }
            } while (true);


            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:377:79: ( LT !)*
            loop227:
            do {
                int alt227=2;
                int LA227_0 = input.LA(1);

                if ( (LA227_0==LT) ) {
                    alt227=1;
                }


                switch (alt227) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:377:79: LT !
            	    {
            	    LT458=(Token)match(input,LT,FOLLOW_LT_in_arrayLiteral2715); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop227;
                }
            } while (true);


            char_literal459=(Token)match(input,75,FOLLOW_75_in_arrayLiteral2719); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal459_tree = 
            (CommonTree)adaptor.create(char_literal459)
            ;
            adaptor.addChild(root_0, char_literal459_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 77, arrayLiteral_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "arrayLiteral"


    public static class objectLiteral_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "objectLiteral"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:381:1: objectLiteral : '{' ( LT !)* propertyNameAndValue ( ( LT !)* ',' ( LT !)* propertyNameAndValue )* ( LT !)* '}' ;
    public final JavascriptParser.objectLiteral_return objectLiteral() throws RecognitionException {
        JavascriptParser.objectLiteral_return retval = new JavascriptParser.objectLiteral_return();
        retval.start = input.LT(1);

        int objectLiteral_StartIndex = input.index();

        CommonTree root_0 = null;

        Token char_literal460=null;
        Token LT461=null;
        Token LT463=null;
        Token char_literal464=null;
        Token LT465=null;
        Token LT467=null;
        Token char_literal468=null;
        JavascriptParser.propertyNameAndValue_return propertyNameAndValue462 =null;

        JavascriptParser.propertyNameAndValue_return propertyNameAndValue466 =null;


        CommonTree char_literal460_tree=null;
        CommonTree LT461_tree=null;
        CommonTree LT463_tree=null;
        CommonTree char_literal464_tree=null;
        CommonTree LT465_tree=null;
        CommonTree LT467_tree=null;
        CommonTree char_literal468_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:382:3: ( '{' ( LT !)* propertyNameAndValue ( ( LT !)* ',' ( LT !)* propertyNameAndValue )* ( LT !)* '}' )
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:382:5: '{' ( LT !)* propertyNameAndValue ( ( LT !)* ',' ( LT !)* propertyNameAndValue )* ( LT !)* '}'
            {
            root_0 = (CommonTree)adaptor.nil();


            char_literal460=(Token)match(input,106,FOLLOW_106_in_objectLiteral2733); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal460_tree = 
            (CommonTree)adaptor.create(char_literal460)
            ;
            adaptor.addChild(root_0, char_literal460_tree);
            }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:382:11: ( LT !)*
            loop228:
            do {
                int alt228=2;
                int LA228_0 = input.LA(1);

                if ( (LA228_0==LT) ) {
                    alt228=1;
                }


                switch (alt228) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:382:11: LT !
            	    {
            	    LT461=(Token)match(input,LT,FOLLOW_LT_in_objectLiteral2735); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop228;
                }
            } while (true);


            pushFollow(FOLLOW_propertyNameAndValue_in_objectLiteral2739);
            propertyNameAndValue462=propertyNameAndValue();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, propertyNameAndValue462.getTree());

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:382:35: ( ( LT !)* ',' ( LT !)* propertyNameAndValue )*
            loop231:
            do {
                int alt231=2;
                alt231 = dfa231.predict(input);
                switch (alt231) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:382:36: ( LT !)* ',' ( LT !)* propertyNameAndValue
            	    {
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:382:38: ( LT !)*
            	    loop229:
            	    do {
            	        int alt229=2;
            	        int LA229_0 = input.LA(1);

            	        if ( (LA229_0==LT) ) {
            	            alt229=1;
            	        }


            	        switch (alt229) {
            	    	case 1 :
            	    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:382:38: LT !
            	    	    {
            	    	    LT463=(Token)match(input,LT,FOLLOW_LT_in_objectLiteral2742); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop229;
            	        }
            	    } while (true);


            	    char_literal464=(Token)match(input,51,FOLLOW_51_in_objectLiteral2746); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal464_tree = 
            	    (CommonTree)adaptor.create(char_literal464)
            	    ;
            	    adaptor.addChild(root_0, char_literal464_tree);
            	    }

            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:382:47: ( LT !)*
            	    loop230:
            	    do {
            	        int alt230=2;
            	        int LA230_0 = input.LA(1);

            	        if ( (LA230_0==LT) ) {
            	            alt230=1;
            	        }


            	        switch (alt230) {
            	    	case 1 :
            	    	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:382:47: LT !
            	    	    {
            	    	    LT465=(Token)match(input,LT,FOLLOW_LT_in_objectLiteral2748); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop230;
            	        }
            	    } while (true);


            	    pushFollow(FOLLOW_propertyNameAndValue_in_objectLiteral2752);
            	    propertyNameAndValue466=propertyNameAndValue();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, propertyNameAndValue466.getTree());

            	    }
            	    break;

            	default :
            	    break loop231;
                }
            } while (true);


            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:382:75: ( LT !)*
            loop232:
            do {
                int alt232=2;
                int LA232_0 = input.LA(1);

                if ( (LA232_0==LT) ) {
                    alt232=1;
                }


                switch (alt232) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:382:75: LT !
            	    {
            	    LT467=(Token)match(input,LT,FOLLOW_LT_in_objectLiteral2756); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop232;
                }
            } while (true);


            char_literal468=(Token)match(input,110,FOLLOW_110_in_objectLiteral2760); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal468_tree = 
            (CommonTree)adaptor.create(char_literal468)
            ;
            adaptor.addChild(root_0, char_literal468_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 78, objectLiteral_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "objectLiteral"


    public static class propertyNameAndValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "propertyNameAndValue"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:385:1: propertyNameAndValue : propertyName ( LT !)* ':' ( LT !)* assignmentExpression ;
    public final JavascriptParser.propertyNameAndValue_return propertyNameAndValue() throws RecognitionException {
        JavascriptParser.propertyNameAndValue_return retval = new JavascriptParser.propertyNameAndValue_return();
        retval.start = input.LT(1);

        int propertyNameAndValue_StartIndex = input.index();

        CommonTree root_0 = null;

        Token LT470=null;
        Token char_literal471=null;
        Token LT472=null;
        JavascriptParser.propertyName_return propertyName469 =null;

        JavascriptParser.assignmentExpression_return assignmentExpression473 =null;


        CommonTree LT470_tree=null;
        CommonTree char_literal471_tree=null;
        CommonTree LT472_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:386:3: ( propertyName ( LT !)* ':' ( LT !)* assignmentExpression )
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:386:5: propertyName ( LT !)* ':' ( LT !)* assignmentExpression
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_propertyName_in_propertyNameAndValue2773);
            propertyName469=propertyName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, propertyName469.getTree());

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:386:20: ( LT !)*
            loop233:
            do {
                int alt233=2;
                int LA233_0 = input.LA(1);

                if ( (LA233_0==LT) ) {
                    alt233=1;
                }


                switch (alt233) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:386:20: LT !
            	    {
            	    LT470=(Token)match(input,LT,FOLLOW_LT_in_propertyNameAndValue2775); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop233;
                }
            } while (true);


            char_literal471=(Token)match(input,58,FOLLOW_58_in_propertyNameAndValue2779); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal471_tree = 
            (CommonTree)adaptor.create(char_literal471)
            ;
            adaptor.addChild(root_0, char_literal471_tree);
            }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:386:29: ( LT !)*
            loop234:
            do {
                int alt234=2;
                int LA234_0 = input.LA(1);

                if ( (LA234_0==LT) ) {
                    alt234=1;
                }


                switch (alt234) {
            	case 1 :
            	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:386:29: LT !
            	    {
            	    LT472=(Token)match(input,LT,FOLLOW_LT_in_propertyNameAndValue2781); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop234;
                }
            } while (true);


            pushFollow(FOLLOW_assignmentExpression_in_propertyNameAndValue2785);
            assignmentExpression473=assignmentExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpression473.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 79, propertyNameAndValue_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "propertyNameAndValue"


    public static class propertyName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "propertyName"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:389:1: propertyName : ( Identifier | StringLiteral | NumericLiteral );
    public final JavascriptParser.propertyName_return propertyName() throws RecognitionException {
        JavascriptParser.propertyName_return retval = new JavascriptParser.propertyName_return();
        retval.start = input.LT(1);

        int propertyName_StartIndex = input.index();

        CommonTree root_0 = null;

        Token set474=null;

        CommonTree set474_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:390:3: ( Identifier | StringLiteral | NumericLiteral )
            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set474=(Token)input.LT(1);

            if ( input.LA(1)==Identifier||input.LA(1)==NumericLiteral||input.LA(1)==StringLiteral ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set474)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 80, propertyName_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "propertyName"


    public static class literal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "literal"
    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:396:1: literal : ( 'null' | 'true' | 'false' | StringLiteral -> ^( STRING_LITERAL_DEF StringLiteral ) | NumericLiteral );
    public final JavascriptParser.literal_return literal() throws RecognitionException {
        JavascriptParser.literal_return retval = new JavascriptParser.literal_return();
        retval.start = input.LT(1);

        int literal_StartIndex = input.index();

        CommonTree root_0 = null;

        Token string_literal475=null;
        Token string_literal476=null;
        Token string_literal477=null;
        Token StringLiteral478=null;
        Token NumericLiteral479=null;

        CommonTree string_literal475_tree=null;
        CommonTree string_literal476_tree=null;
        CommonTree string_literal477_tree=null;
        CommonTree StringLiteral478_tree=null;
        CommonTree NumericLiteral479_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }

            // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:397:3: ( 'null' | 'true' | 'false' | StringLiteral -> ^( STRING_LITERAL_DEF StringLiteral ) | NumericLiteral )
            int alt235=5;
            switch ( input.LA(1) ) {
            case 94:
                {
                alt235=1;
                }
                break;
            case 99:
                {
                alt235=2;
                }
                break;
            case 86:
                {
                alt235=3;
                }
                break;
            case StringLiteral:
                {
                alt235=4;
                }
                break;
            case NumericLiteral:
                {
                alt235=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 235, 0, input);

                throw nvae;

            }

            switch (alt235) {
                case 1 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:397:5: 'null'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal475=(Token)match(input,94,FOLLOW_94_in_literal2824); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal475_tree = 
                    (CommonTree)adaptor.create(string_literal475)
                    ;
                    adaptor.addChild(root_0, string_literal475_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:398:5: 'true'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal476=(Token)match(input,99,FOLLOW_99_in_literal2830); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal476_tree = 
                    (CommonTree)adaptor.create(string_literal476)
                    ;
                    adaptor.addChild(root_0, string_literal476_tree);
                    }

                    }
                    break;
                case 3 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:399:5: 'false'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal477=(Token)match(input,86,FOLLOW_86_in_literal2836); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal477_tree = 
                    (CommonTree)adaptor.create(string_literal477)
                    ;
                    adaptor.addChild(root_0, string_literal477_tree);
                    }

                    }
                    break;
                case 4 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:400:5: StringLiteral
                    {
                    StringLiteral478=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_literal2842); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_StringLiteral.add(StringLiteral478);


                    // AST REWRITE
                    // elements: StringLiteral
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 400:20: -> ^( STRING_LITERAL_DEF StringLiteral )
                    {
                        // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:400:23: ^( STRING_LITERAL_DEF StringLiteral )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(STRING_LITERAL_DEF, "STRING_LITERAL_DEF")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_StringLiteral.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:401:5: NumericLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    NumericLiteral479=(Token)match(input,NumericLiteral,FOLLOW_NumericLiteral_in_literal2857); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NumericLiteral479_tree = 
                    (CommonTree)adaptor.create(NumericLiteral479)
                    ;
                    adaptor.addChild(root_0, NumericLiteral479_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 81, literal_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "literal"

    // $ANTLR start synpred5_Javascript
    public final void synpred5_Javascript_fragment() throws RecognitionException {
        // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:42:5: ( functionDeclaration )
        // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:42:5: functionDeclaration
        {
        pushFollow(FOLLOW_functionDeclaration_in_synpred5_Javascript146);
        functionDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred5_Javascript

    // $ANTLR start synpred9_Javascript
    public final void synpred9_Javascript_fragment() throws RecognitionException {
        // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:53:16: ( LT )
        // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:53:16: LT
        {
        match(input,LT,FOLLOW_LT_in_synpred9_Javascript210); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred9_Javascript

    // $ANTLR start synpred21_Javascript
    public final void synpred21_Javascript_fragment() throws RecognitionException {
        // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:67:5: ( statementBlock )
        // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:67:5: statementBlock
        {
        pushFollow(FOLLOW_statementBlock_in_synpred21_Javascript323);
        statementBlock();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred21_Javascript

    // $ANTLR start synpred24_Javascript
    public final void synpred24_Javascript_fragment() throws RecognitionException {
        // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:70:5: ( expressionStatement )
        // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:70:5: expressionStatement
        {
        pushFollow(FOLLOW_expressionStatement_in_synpred24_Javascript341);
        expressionStatement();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred24_Javascript

    // $ANTLR start synpred31_Javascript
    public final void synpred31_Javascript_fragment() throws RecognitionException {
        // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:77:5: ( labelledStatement )
        // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:77:5: labelledStatement
        {
        pushFollow(FOLLOW_labelledStatement_in_synpred31_Javascript383);
        labelledStatement();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred31_Javascript

    // $ANTLR start synpred34_Javascript
    public final void synpred34_Javascript_fragment() throws RecognitionException {
        // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:84:11: ( LT )
        // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:84:11: LT
        {
        match(input,LT,FOLLOW_LT_in_synpred34_Javascript416); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred34_Javascript

    // $ANTLR start synpred47_Javascript
    public final void synpred47_Javascript_fragment() throws RecognitionException {
        // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:104:16: ( LT )
        // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:104:16: LT
        {
        match(input,LT,FOLLOW_LT_in_synpred47_Javascript548); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred47_Javascript

    // $ANTLR start synpred49_Javascript
    public final void synpred49_Javascript_fragment() throws RecognitionException {
        // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:108:19: ( LT )
        // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:108:19: LT
        {
        match(input,LT,FOLLOW_LT_in_synpred49_Javascript579); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred49_Javascript

    // $ANTLR start synpred60_Javascript
    public final void synpred60_Javascript_fragment() throws RecognitionException {
        // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:128:61: ( ( LT )* 'else' ( LT )* statement )
        // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:128:61: ( LT )* 'else' ( LT )* statement
        {
        // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:128:63: ( LT )*
        loop248:
        do {
            int alt248=2;
            int LA248_0 = input.LA(1);

            if ( (LA248_0==LT) ) {
                alt248=1;
            }


            switch (alt248) {
        	case 1 :
        	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:128:63: LT
        	    {
        	    match(input,LT,FOLLOW_LT_in_synpred60_Javascript698); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop248;
            }
        } while (true);


        match(input,85,FOLLOW_85_in_synpred60_Javascript702); if (state.failed) return ;

        // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:128:75: ( LT )*
        loop249:
        do {
            int alt249=2;
            int LA249_0 = input.LA(1);

            if ( (LA249_0==LT) ) {
                alt249=1;
            }


            switch (alt249) {
        	case 1 :
        	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:128:75: LT
        	    {
        	    match(input,LT,FOLLOW_LT_in_synpred60_Javascript704); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop249;
            }
        } while (true);


        pushFollow(FOLLOW_statement_in_synpred60_Javascript708);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred60_Javascript

    // $ANTLR start synpred63_Javascript
    public final void synpred63_Javascript_fragment() throws RecognitionException {
        // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:134:5: ( forStatement )
        // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:134:5: forStatement
        {
        pushFollow(FOLLOW_forStatement_in_synpred63_Javascript735);
        forStatement();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred63_Javascript

    // $ANTLR start synpred118_Javascript
    public final void synpred118_Javascript_fragment() throws RecognitionException {
        // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:193:40: ( LT )
        // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:193:40: LT
        {
        match(input,LT,FOLLOW_LT_in_synpred118_Javascript1246); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred118_Javascript

    // $ANTLR start synpred121_Javascript
    public final void synpred121_Javascript_fragment() throws RecognitionException {
        // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:197:27: ( LT )
        // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:197:27: LT
        {
        match(input,LT,FOLLOW_LT_in_synpred121_Javascript1273); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred121_Javascript

    // $ANTLR start synpred140_Javascript
    public final void synpred140_Javascript_fragment() throws RecognitionException {
        // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:226:5: ( conditionalExpression )
        // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:226:5: conditionalExpression
        {
        pushFollow(FOLLOW_conditionalExpression_in_synpred140_Javascript1472);
        conditionalExpression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred140_Javascript

    // $ANTLR start synpred143_Javascript
    public final void synpred143_Javascript_fragment() throws RecognitionException {
        // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:231:5: ( conditionalExpressionNoIn )
        // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:231:5: conditionalExpressionNoIn
        {
        pushFollow(FOLLOW_conditionalExpressionNoIn_in_synpred143_Javascript1504);
        conditionalExpressionNoIn();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred143_Javascript

    // $ANTLR start synpred146_Javascript
    public final void synpred146_Javascript_fragment() throws RecognitionException {
        // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:236:5: ( callExpression )
        // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:236:5: callExpression
        {
        pushFollow(FOLLOW_callExpression_in_synpred146_Javascript1536);
        callExpression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred146_Javascript

    // $ANTLR start synpred147_Javascript
    public final void synpred147_Javascript_fragment() throws RecognitionException {
        // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:241:5: ( memberExpression )
        // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:241:5: memberExpression
        {
        pushFollow(FOLLOW_memberExpression_in_synpred147_Javascript1555);
        memberExpression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred147_Javascript

    // $ANTLR start synpred154_Javascript
    public final void synpred154_Javascript_fragment() throws RecognitionException {
        // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:246:92: ( ( LT )* memberExpressionSuffix )
        // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:246:92: ( LT )* memberExpressionSuffix
        {
        // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:246:94: ( LT )*
        loop263:
        do {
            int alt263=2;
            int LA263_0 = input.LA(1);

            if ( (LA263_0==LT) ) {
                alt263=1;
            }


            switch (alt263) {
        	case 1 :
        	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:246:94: LT
        	    {
        	    match(input,LT,FOLLOW_LT_in_synpred154_Javascript1606); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop263;
            }
        } while (true);


        pushFollow(FOLLOW_memberExpressionSuffix_in_synpred154_Javascript1610);
        memberExpressionSuffix();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred154_Javascript

    // $ANTLR start synpred158_Javascript
    public final void synpred158_Javascript_fragment() throws RecognitionException {
        // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:255:37: ( ( LT )* callExpressionSuffix )
        // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:255:37: ( LT )* callExpressionSuffix
        {
        // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:255:37: ( LT )*
        loop264:
        do {
            int alt264=2;
            int LA264_0 = input.LA(1);

            if ( (LA264_0==LT) ) {
                alt264=1;
            }


            switch (alt264) {
        	case 1 :
        	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:255:37: LT
        	    {
        	    match(input,LT,FOLLOW_LT_in_synpred158_Javascript1652); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop264;
            }
        } while (true);


        pushFollow(FOLLOW_callExpressionSuffix_in_synpred158_Javascript1655);
        callExpressionSuffix();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred158_Javascript

    // $ANTLR start synpred256_Javascript
    public final void synpred256_Javascript_fragment() throws RecognitionException {
        // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:350:31: ( ( LT )* ( '+' | '-' ) ( LT )* multiplicativeExpression )
        // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:350:31: ( LT )* ( '+' | '-' ) ( LT )* multiplicativeExpression
        {
        // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:350:33: ( LT )*
        loop309:
        do {
            int alt309=2;
            int LA309_0 = input.LA(1);

            if ( (LA309_0==LT) ) {
                alt309=1;
            }


            switch (alt309) {
        	case 1 :
        	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:350:33: LT
        	    {
        	    match(input,LT,FOLLOW_LT_in_synpred256_Javascript2469); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop309;
            }
        } while (true);


        if ( input.LA(1)==48||input.LA(1)==52 ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:350:52: ( LT )*
        loop310:
        do {
            int alt310=2;
            int LA310_0 = input.LA(1);

            if ( (LA310_0==LT) ) {
                alt310=1;
            }


            switch (alt310) {
        	case 1 :
        	    // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:350:52: LT
        	    {
        	    match(input,LT,FOLLOW_LT_in_synpred256_Javascript2483); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop310;
            }
        } while (true);


        pushFollow(FOLLOW_multiplicativeExpression_in_synpred256_Javascript2487);
        multiplicativeExpression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred256_Javascript

    // $ANTLR start synpred280_Javascript
    public final void synpred280_Javascript_fragment() throws RecognitionException {
        // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:377:11: ( LT )
        // /Users/shervinafshar/Documents/htdocs/arb/arb_extractor/src/main/antlr/Javascript.g:377:11: LT
        {
        match(input,LT,FOLLOW_LT_in_synpred280_Javascript2690); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred280_Javascript

    // Delegated rules

    public final boolean synpred21_Javascript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_Javascript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred121_Javascript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred121_Javascript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred143_Javascript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred143_Javascript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_Javascript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_Javascript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_Javascript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_Javascript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred256_Javascript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred256_Javascript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred158_Javascript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred158_Javascript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred49_Javascript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred49_Javascript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_Javascript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_Javascript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred154_Javascript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred154_Javascript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred63_Javascript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred63_Javascript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred280_Javascript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred280_Javascript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred147_Javascript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred147_Javascript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred118_Javascript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred118_Javascript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred60_Javascript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred60_Javascript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_Javascript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_Javascript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_Javascript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_Javascript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred140_Javascript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred140_Javascript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred47_Javascript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred47_Javascript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred146_Javascript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred146_Javascript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA57 dfa57 = new DFA57(this);
    protected DFA60 dfa60 = new DFA60(this);
    protected DFA63 dfa63 = new DFA63(this);
    protected DFA90 dfa90 = new DFA90(this);
    protected DFA94 dfa94 = new DFA94(this);
    protected DFA93 dfa93 = new DFA93(this);
    protected DFA106 dfa106 = new DFA106(this);
    protected DFA115 dfa115 = new DFA115(this);
    protected DFA118 dfa118 = new DFA118(this);
    protected DFA142 dfa142 = new DFA142(this);
    protected DFA141 dfa141 = new DFA141(this);
    protected DFA151 dfa151 = new DFA151(this);
    protected DFA156 dfa156 = new DFA156(this);
    protected DFA159 dfa159 = new DFA159(this);
    protected DFA162 dfa162 = new DFA162(this);
    protected DFA165 dfa165 = new DFA165(this);
    protected DFA168 dfa168 = new DFA168(this);
    protected DFA171 dfa171 = new DFA171(this);
    protected DFA174 dfa174 = new DFA174(this);
    protected DFA177 dfa177 = new DFA177(this);
    protected DFA180 dfa180 = new DFA180(this);
    protected DFA183 dfa183 = new DFA183(this);
    protected DFA186 dfa186 = new DFA186(this);
    protected DFA190 dfa190 = new DFA190(this);
    protected DFA194 dfa194 = new DFA194(this);
    protected DFA198 dfa198 = new DFA198(this);
    protected DFA202 dfa202 = new DFA202(this);
    protected DFA206 dfa206 = new DFA206(this);
    protected DFA214 dfa214 = new DFA214(this);
    protected DFA226 dfa226 = new DFA226(this);
    protected DFA225 dfa225 = new DFA225(this);
    protected DFA231 dfa231 = new DFA231(this);
    static final String DFA4_eotS =
        "\4\uffff";
    static final String DFA4_eofS =
        "\2\2\2\uffff";
    static final String DFA4_minS =
        "\2\22\2\uffff";
    static final String DFA4_maxS =
        "\2\157\2\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA4_specialS =
        "\4\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\3\2\uffff\1\1\2\uffff\1\3\3\uffff\1\3\7\uffff\1\3\7\uffff"+
            "\1\3\3\uffff\2\3\2\uffff\2\3\5\uffff\1\3\16\uffff\1\3\3\uffff"+
            "\1\3\2\uffff\1\3\1\uffff\2\3\1\uffff\1\3\1\uffff\3\3\2\uffff"+
            "\16\3\3\uffff\1\2\1\3",
            "\1\3\2\uffff\1\1\2\uffff\1\3\3\uffff\1\3\7\uffff\1\3\7\uffff"+
            "\1\3\3\uffff\2\3\2\uffff\2\3\5\uffff\1\3\16\uffff\1\3\3\uffff"+
            "\1\3\2\uffff\1\3\1\uffff\2\3\1\uffff\1\3\1\uffff\3\3\2\uffff"+
            "\16\3\3\uffff\1\2\1\3",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "()* loopback of 38:19: ( ( LT !)* sourceElement )*";
        }
    }
    static final String DFA17_eotS =
        "\4\uffff";
    static final String DFA17_eofS =
        "\4\uffff";
    static final String DFA17_minS =
        "\2\22\2\uffff";
    static final String DFA17_maxS =
        "\2\55\2\uffff";
    static final String DFA17_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA17_specialS =
        "\4\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\2\2\uffff\1\1\27\uffff\1\3",
            "\1\2\2\uffff\1\1\27\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "58:10: ( ( LT !)* Identifier ( ( LT !)* ',' ( LT !)* Identifier )* )?";
        }
    }
    static final String DFA16_eotS =
        "\4\uffff";
    static final String DFA16_eofS =
        "\4\uffff";
    static final String DFA16_minS =
        "\2\25\2\uffff";
    static final String DFA16_maxS =
        "\2\63\2\uffff";
    static final String DFA16_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA16_specialS =
        "\4\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\1\27\uffff\1\2\5\uffff\1\3",
            "\1\1\27\uffff\1\2\5\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "()* loopback of 58:27: ( ( LT !)* ',' ( LT !)* Identifier )*";
        }
    }
    static final String DFA26_eotS =
        "\4\uffff";
    static final String DFA26_eofS =
        "\1\2\3\uffff";
    static final String DFA26_minS =
        "\2\22\2\uffff";
    static final String DFA26_maxS =
        "\2\157\2\uffff";
    static final String DFA26_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA26_specialS =
        "\4\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\3\2\uffff\1\1\2\uffff\1\3\3\uffff\1\3\7\uffff\1\3\7\uffff"+
            "\1\3\3\uffff\2\3\2\uffff\2\3\5\uffff\1\3\16\uffff\1\3\3\uffff"+
            "\1\3\1\2\1\uffff\1\3\1\2\2\3\1\uffff\1\3\1\uffff\3\3\2\uffff"+
            "\16\3\3\uffff\1\2\1\3",
            "\1\3\2\uffff\1\1\2\uffff\1\3\3\uffff\1\3\7\uffff\1\3\7\uffff"+
            "\1\3\3\uffff\2\3\2\uffff\2\3\5\uffff\1\3\16\uffff\1\3\3\uffff"+
            "\1\3\1\2\1\uffff\1\3\1\2\2\3\1\uffff\1\3\1\uffff\3\3\2\uffff"+
            "\16\3\3\uffff\1\2\1\3",
            "",
            ""
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "()* loopback of 88:15: ( ( LT !)* statement )*";
        }
    }
    static final String DFA30_eotS =
        "\5\uffff";
    static final String DFA30_eofS =
        "\1\uffff\1\2\2\uffff\1\2";
    static final String DFA30_minS =
        "\1\25\1\22\2\uffff\1\22";
    static final String DFA30_maxS =
        "\1\73\1\157\2\uffff\1\157";
    static final String DFA30_acceptS =
        "\2\uffff\1\2\1\1\1\uffff";
    static final String DFA30_specialS =
        "\5\uffff}>";
    static final String[] DFA30_transitionS = {
            "\1\1\35\uffff\1\3\7\uffff\1\2",
            "\1\2\2\uffff\1\4\2\uffff\1\2\3\uffff\1\2\7\uffff\1\2\7\uffff"+
            "\1\2\3\uffff\2\2\1\uffff\1\3\2\2\5\uffff\1\2\16\uffff\1\2\3"+
            "\uffff\2\2\1\uffff\6\2\1\uffff\3\2\2\uffff\16\2\3\uffff\2\2",
            "",
            "",
            "\1\2\2\uffff\1\4\2\uffff\1\2\3\uffff\1\2\7\uffff\1\2\7\uffff"+
            "\1\2\3\uffff\2\2\1\uffff\1\3\2\2\5\uffff\1\2\16\uffff\1\2\3"+
            "\uffff\2\2\1\uffff\6\2\1\uffff\3\2\2\uffff\16\2\3\uffff\2\2"
    };

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "()* loopback of 96:25: ( ( LT !)* ',' ( LT !)* variableDeclaration )*";
        }
    }
    static final String DFA33_eotS =
        "\4\uffff";
    static final String DFA33_eofS =
        "\1\2\3\uffff";
    static final String DFA33_minS =
        "\2\25\2\uffff";
    static final String DFA33_maxS =
        "\2\73\2\uffff";
    static final String DFA33_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA33_specialS =
        "\4\uffff}>";
    static final String[] DFA33_transitionS = {
            "\1\1\35\uffff\1\3\7\uffff\1\2",
            "\1\1\35\uffff\1\3\7\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "()* loopback of 100:29: ( ( LT !)* ',' ( LT !)* variableDeclarationNoIn )*";
        }
    }
    static final String DFA57_eotS =
        "\4\uffff";
    static final String DFA57_eofS =
        "\4\uffff";
    static final String DFA57_minS =
        "\2\22\2\uffff";
    static final String DFA57_maxS =
        "\2\157\2\uffff";
    static final String DFA57_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA57_specialS =
        "\4\uffff}>";
    static final String[] DFA57_transitionS = {
            "\1\2\2\uffff\1\1\2\uffff\1\2\3\uffff\1\2\7\uffff\1\2\7\uffff"+
            "\1\2\3\uffff\2\2\2\uffff\2\2\5\uffff\1\3\16\uffff\1\2\10\uffff"+
            "\1\2\2\uffff\1\2\2\uffff\1\2\3\uffff\2\2\2\uffff\1\2\1\uffff"+
            "\1\2\1\uffff\3\2\2\uffff\1\2\4\uffff\1\2",
            "\1\2\2\uffff\1\1\2\uffff\1\2\3\uffff\1\2\7\uffff\1\2\7\uffff"+
            "\1\2\3\uffff\2\2\2\uffff\2\2\5\uffff\1\3\16\uffff\1\2\10\uffff"+
            "\1\2\2\uffff\1\2\2\uffff\1\2\3\uffff\2\2\2\uffff\1\2\1\uffff"+
            "\1\2\1\uffff\3\2\2\uffff\1\2\4\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA57_eot = DFA.unpackEncodedString(DFA57_eotS);
    static final short[] DFA57_eof = DFA.unpackEncodedString(DFA57_eofS);
    static final char[] DFA57_min = DFA.unpackEncodedStringToUnsignedChars(DFA57_minS);
    static final char[] DFA57_max = DFA.unpackEncodedStringToUnsignedChars(DFA57_maxS);
    static final short[] DFA57_accept = DFA.unpackEncodedString(DFA57_acceptS);
    static final short[] DFA57_special = DFA.unpackEncodedString(DFA57_specialS);
    static final short[][] DFA57_transition;

    static {
        int numStates = DFA57_transitionS.length;
        DFA57_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA57_transition[i] = DFA.unpackEncodedString(DFA57_transitionS[i]);
        }
    }

    class DFA57 extends DFA {

        public DFA57(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 57;
            this.eot = DFA57_eot;
            this.eof = DFA57_eof;
            this.min = DFA57_min;
            this.max = DFA57_max;
            this.accept = DFA57_accept;
            this.special = DFA57_special;
            this.transition = DFA57_transition;
        }
        public String getDescription() {
            return "147:21: ( ( LT !)* forStatementInitialiserPart )?";
        }
    }
    static final String DFA60_eotS =
        "\4\uffff";
    static final String DFA60_eofS =
        "\4\uffff";
    static final String DFA60_minS =
        "\2\22\2\uffff";
    static final String DFA60_maxS =
        "\2\157\2\uffff";
    static final String DFA60_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA60_specialS =
        "\4\uffff}>";
    static final String[] DFA60_transitionS = {
            "\1\2\2\uffff\1\1\2\uffff\1\2\3\uffff\1\2\7\uffff\1\2\7\uffff"+
            "\1\2\3\uffff\2\2\2\uffff\2\2\5\uffff\1\3\16\uffff\1\2\10\uffff"+
            "\1\2\2\uffff\1\2\2\uffff\1\2\3\uffff\2\2\2\uffff\1\2\1\uffff"+
            "\1\2\1\uffff\1\2\1\uffff\1\2\2\uffff\1\2\4\uffff\1\2",
            "\1\2\2\uffff\1\1\2\uffff\1\2\3\uffff\1\2\7\uffff\1\2\7\uffff"+
            "\1\2\3\uffff\2\2\2\uffff\2\2\5\uffff\1\3\16\uffff\1\2\10\uffff"+
            "\1\2\2\uffff\1\2\2\uffff\1\2\3\uffff\2\2\2\uffff\1\2\1\uffff"+
            "\1\2\1\uffff\1\2\1\uffff\1\2\2\uffff\1\2\4\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA60_eot = DFA.unpackEncodedString(DFA60_eotS);
    static final short[] DFA60_eof = DFA.unpackEncodedString(DFA60_eofS);
    static final char[] DFA60_min = DFA.unpackEncodedStringToUnsignedChars(DFA60_minS);
    static final char[] DFA60_max = DFA.unpackEncodedStringToUnsignedChars(DFA60_maxS);
    static final short[] DFA60_accept = DFA.unpackEncodedString(DFA60_acceptS);
    static final short[] DFA60_special = DFA.unpackEncodedString(DFA60_specialS);
    static final short[][] DFA60_transition;

    static {
        int numStates = DFA60_transitionS.length;
        DFA60_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA60_transition[i] = DFA.unpackEncodedString(DFA60_transitionS[i]);
        }
    }

    class DFA60 extends DFA {

        public DFA60(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 60;
            this.eot = DFA60_eot;
            this.eof = DFA60_eof;
            this.min = DFA60_min;
            this.max = DFA60_max;
            this.accept = DFA60_accept;
            this.special = DFA60_special;
            this.transition = DFA60_transition;
        }
        public String getDescription() {
            return "147:66: ( ( LT !)* expression )?";
        }
    }
    static final String DFA63_eotS =
        "\4\uffff";
    static final String DFA63_eofS =
        "\4\uffff";
    static final String DFA63_minS =
        "\2\22\2\uffff";
    static final String DFA63_maxS =
        "\2\157\2\uffff";
    static final String DFA63_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA63_specialS =
        "\4\uffff}>";
    static final String[] DFA63_transitionS = {
            "\1\2\2\uffff\1\1\2\uffff\1\2\3\uffff\1\2\7\uffff\1\2\7\uffff"+
            "\1\2\1\3\2\uffff\2\2\2\uffff\2\2\24\uffff\1\2\10\uffff\1\2\2"+
            "\uffff\1\2\2\uffff\1\2\3\uffff\2\2\2\uffff\1\2\1\uffff\1\2\1"+
            "\uffff\1\2\1\uffff\1\2\2\uffff\1\2\4\uffff\1\2",
            "\1\2\2\uffff\1\1\2\uffff\1\2\3\uffff\1\2\7\uffff\1\2\7\uffff"+
            "\1\2\1\3\2\uffff\2\2\2\uffff\2\2\24\uffff\1\2\10\uffff\1\2\2"+
            "\uffff\1\2\2\uffff\1\2\3\uffff\2\2\2\uffff\1\2\1\uffff\1\2\1"+
            "\uffff\1\2\1\uffff\1\2\2\uffff\1\2\4\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA63_eot = DFA.unpackEncodedString(DFA63_eotS);
    static final short[] DFA63_eof = DFA.unpackEncodedString(DFA63_eofS);
    static final char[] DFA63_min = DFA.unpackEncodedStringToUnsignedChars(DFA63_minS);
    static final char[] DFA63_max = DFA.unpackEncodedStringToUnsignedChars(DFA63_maxS);
    static final short[] DFA63_accept = DFA.unpackEncodedString(DFA63_acceptS);
    static final short[] DFA63_special = DFA.unpackEncodedString(DFA63_specialS);
    static final short[][] DFA63_transition;

    static {
        int numStates = DFA63_transitionS.length;
        DFA63_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA63_transition[i] = DFA.unpackEncodedString(DFA63_transitionS[i]);
        }
    }

    class DFA63 extends DFA {

        public DFA63(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 63;
            this.eot = DFA63_eot;
            this.eof = DFA63_eof;
            this.min = DFA63_min;
            this.max = DFA63_max;
            this.accept = DFA63_accept;
            this.special = DFA63_special;
            this.transition = DFA63_transition;
        }
        public String getDescription() {
            return "147:94: ( ( LT !)* expression )?";
        }
    }
    static final String DFA90_eotS =
        "\4\uffff";
    static final String DFA90_eofS =
        "\4\uffff";
    static final String DFA90_minS =
        "\2\25\2\uffff";
    static final String DFA90_maxS =
        "\2\156\2\uffff";
    static final String DFA90_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA90_specialS =
        "\4\uffff}>";
    static final String[] DFA90_transitionS = {
            "\1\1\71\uffff\1\3\2\uffff\1\2\33\uffff\1\2",
            "\1\1\71\uffff\1\3\2\uffff\1\2\33\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA90_eot = DFA.unpackEncodedString(DFA90_eotS);
    static final short[] DFA90_eof = DFA.unpackEncodedString(DFA90_eofS);
    static final char[] DFA90_min = DFA.unpackEncodedStringToUnsignedChars(DFA90_minS);
    static final char[] DFA90_max = DFA.unpackEncodedStringToUnsignedChars(DFA90_maxS);
    static final short[] DFA90_accept = DFA.unpackEncodedString(DFA90_acceptS);
    static final short[] DFA90_special = DFA.unpackEncodedString(DFA90_specialS);
    static final short[][] DFA90_transition;

    static {
        int numStates = DFA90_transitionS.length;
        DFA90_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA90_transition[i] = DFA.unpackEncodedString(DFA90_transitionS[i]);
        }
    }

    class DFA90 extends DFA {

        public DFA90(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 90;
            this.eot = DFA90_eot;
            this.eof = DFA90_eof;
            this.min = DFA90_min;
            this.max = DFA90_max;
            this.accept = DFA90_accept;
            this.special = DFA90_special;
            this.transition = DFA90_transition;
        }
        public String getDescription() {
            return "()* loopback of 189:9: ( ( LT !)* caseClause )*";
        }
    }
    static final String DFA94_eotS =
        "\4\uffff";
    static final String DFA94_eofS =
        "\4\uffff";
    static final String DFA94_minS =
        "\2\25\2\uffff";
    static final String DFA94_maxS =
        "\2\156\2\uffff";
    static final String DFA94_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA94_specialS =
        "\4\uffff}>";
    static final String[] DFA94_transitionS = {
            "\1\1\74\uffff\1\2\33\uffff\1\3",
            "\1\1\74\uffff\1\2\33\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA94_eot = DFA.unpackEncodedString(DFA94_eotS);
    static final short[] DFA94_eof = DFA.unpackEncodedString(DFA94_eofS);
    static final char[] DFA94_min = DFA.unpackEncodedStringToUnsignedChars(DFA94_minS);
    static final char[] DFA94_max = DFA.unpackEncodedStringToUnsignedChars(DFA94_maxS);
    static final short[] DFA94_accept = DFA.unpackEncodedString(DFA94_acceptS);
    static final short[] DFA94_special = DFA.unpackEncodedString(DFA94_specialS);
    static final short[][] DFA94_transition;

    static {
        int numStates = DFA94_transitionS.length;
        DFA94_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA94_transition[i] = DFA.unpackEncodedString(DFA94_transitionS[i]);
        }
    }

    class DFA94 extends DFA {

        public DFA94(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 94;
            this.eot = DFA94_eot;
            this.eof = DFA94_eof;
            this.min = DFA94_min;
            this.max = DFA94_max;
            this.accept = DFA94_accept;
            this.special = DFA94_special;
            this.transition = DFA94_transition;
        }
        public String getDescription() {
            return "189:28: ( ( LT !)* defaultClause ( ( LT !)* caseClause )* )?";
        }
    }
    static final String DFA93_eotS =
        "\4\uffff";
    static final String DFA93_eofS =
        "\4\uffff";
    static final String DFA93_minS =
        "\2\25\2\uffff";
    static final String DFA93_maxS =
        "\2\156\2\uffff";
    static final String DFA93_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA93_specialS =
        "\4\uffff}>";
    static final String[] DFA93_transitionS = {
            "\1\1\71\uffff\1\3\36\uffff\1\2",
            "\1\1\71\uffff\1\3\36\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA93_eot = DFA.unpackEncodedString(DFA93_eotS);
    static final short[] DFA93_eof = DFA.unpackEncodedString(DFA93_eofS);
    static final char[] DFA93_min = DFA.unpackEncodedStringToUnsignedChars(DFA93_minS);
    static final char[] DFA93_max = DFA.unpackEncodedStringToUnsignedChars(DFA93_maxS);
    static final short[] DFA93_accept = DFA.unpackEncodedString(DFA93_acceptS);
    static final short[] DFA93_special = DFA.unpackEncodedString(DFA93_specialS);
    static final short[][] DFA93_transition;

    static {
        int numStates = DFA93_transitionS.length;
        DFA93_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA93_transition[i] = DFA.unpackEncodedString(DFA93_transitionS[i]);
        }
    }

    class DFA93 extends DFA {

        public DFA93(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 93;
            this.eot = DFA93_eot;
            this.eof = DFA93_eof;
            this.min = DFA93_min;
            this.max = DFA93_max;
            this.accept = DFA93_accept;
            this.special = DFA93_special;
            this.transition = DFA93_transition;
        }
        public String getDescription() {
            return "()* loopback of 189:48: ( ( LT !)* caseClause )*";
        }
    }
    static final String DFA106_eotS =
        "\4\uffff";
    static final String DFA106_eofS =
        "\2\3\2\uffff";
    static final String DFA106_minS =
        "\2\22\2\uffff";
    static final String DFA106_maxS =
        "\2\157\2\uffff";
    static final String DFA106_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA106_specialS =
        "\4\uffff}>";
    static final String[] DFA106_transitionS = {
            "\1\3\2\uffff\1\1\2\uffff\1\3\3\uffff\1\3\7\uffff\1\3\7\uffff"+
            "\1\3\3\uffff\2\3\2\uffff\2\3\5\uffff\1\3\16\uffff\1\3\3\uffff"+
            "\2\3\1\uffff\6\3\1\2\3\3\2\uffff\16\3\3\uffff\2\3",
            "\1\3\2\uffff\1\1\2\uffff\1\3\3\uffff\1\3\7\uffff\1\3\7\uffff"+
            "\1\3\3\uffff\2\3\2\uffff\2\3\5\uffff\1\3\16\uffff\1\3\3\uffff"+
            "\2\3\1\uffff\6\3\1\2\3\3\2\uffff\16\3\3\uffff\2\3",
            "",
            ""
    };

    static final short[] DFA106_eot = DFA.unpackEncodedString(DFA106_eotS);
    static final short[] DFA106_eof = DFA.unpackEncodedString(DFA106_eofS);
    static final char[] DFA106_min = DFA.unpackEncodedStringToUnsignedChars(DFA106_minS);
    static final char[] DFA106_max = DFA.unpackEncodedStringToUnsignedChars(DFA106_maxS);
    static final short[] DFA106_accept = DFA.unpackEncodedString(DFA106_acceptS);
    static final short[] DFA106_special = DFA.unpackEncodedString(DFA106_specialS);
    static final short[][] DFA106_transition;

    static {
        int numStates = DFA106_transitionS.length;
        DFA106_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA106_transition[i] = DFA.unpackEncodedString(DFA106_transitionS[i]);
        }
    }

    class DFA106 extends DFA {

        public DFA106(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 106;
            this.eot = DFA106_eot;
            this.eof = DFA106_eof;
            this.min = DFA106_min;
            this.max = DFA106_max;
            this.accept = DFA106_accept;
            this.special = DFA106_special;
            this.transition = DFA106_transition;
        }
        public String getDescription() {
            return "205:66: ( ( LT !)* finallyClause )?";
        }
    }
    static final String DFA115_eotS =
        "\5\uffff";
    static final String DFA115_eofS =
        "\2\2\2\uffff\1\2";
    static final String DFA115_minS =
        "\1\25\1\22\2\uffff\1\22";
    static final String DFA115_maxS =
        "\1\113\1\157\2\uffff\1\157";
    static final String DFA115_acceptS =
        "\2\uffff\1\2\1\1\1\uffff";
    static final String DFA115_specialS =
        "\5\uffff}>";
    static final String[] DFA115_transitionS = {
            "\1\1\27\uffff\1\2\5\uffff\1\3\6\uffff\2\2\17\uffff\1\2",
            "\1\2\2\uffff\1\4\2\uffff\1\2\3\uffff\1\2\7\uffff\1\2\7\uffff"+
            "\2\2\2\uffff\2\2\1\uffff\1\3\2\2\4\uffff\2\2\16\uffff\2\2\2"+
            "\uffff\2\2\1\uffff\6\2\1\uffff\3\2\2\uffff\16\2\3\uffff\2\2",
            "",
            "",
            "\1\2\2\uffff\1\4\2\uffff\1\2\3\uffff\1\2\7\uffff\1\2\7\uffff"+
            "\2\2\2\uffff\2\2\1\uffff\1\3\2\2\4\uffff\2\2\16\uffff\2\2\2"+
            "\uffff\2\2\1\uffff\6\2\1\uffff\3\2\2\uffff\16\2\3\uffff\2\2"
    };

    static final short[] DFA115_eot = DFA.unpackEncodedString(DFA115_eotS);
    static final short[] DFA115_eof = DFA.unpackEncodedString(DFA115_eofS);
    static final char[] DFA115_min = DFA.unpackEncodedStringToUnsignedChars(DFA115_minS);
    static final char[] DFA115_max = DFA.unpackEncodedStringToUnsignedChars(DFA115_maxS);
    static final short[] DFA115_accept = DFA.unpackEncodedString(DFA115_acceptS);
    static final short[] DFA115_special = DFA.unpackEncodedString(DFA115_specialS);
    static final short[][] DFA115_transition;

    static {
        int numStates = DFA115_transitionS.length;
        DFA115_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA115_transition[i] = DFA.unpackEncodedString(DFA115_transitionS[i]);
        }
    }

    class DFA115 extends DFA {

        public DFA115(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 115;
            this.eot = DFA115_eot;
            this.eof = DFA115_eof;
            this.min = DFA115_min;
            this.max = DFA115_max;
            this.accept = DFA115_accept;
            this.special = DFA115_special;
            this.transition = DFA115_transition;
        }
        public String getDescription() {
            return "()* loopback of 218:26: ( ( LT !)* ',' ( LT !)* assignmentExpression )*";
        }
    }
    static final String DFA118_eotS =
        "\4\uffff";
    static final String DFA118_eofS =
        "\1\2\3\uffff";
    static final String DFA118_minS =
        "\2\25\2\uffff";
    static final String DFA118_maxS =
        "\2\73\2\uffff";
    static final String DFA118_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA118_specialS =
        "\4\uffff}>";
    static final String[] DFA118_transitionS = {
            "\1\1\35\uffff\1\3\7\uffff\1\2",
            "\1\1\35\uffff\1\3\7\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA118_eot = DFA.unpackEncodedString(DFA118_eotS);
    static final short[] DFA118_eof = DFA.unpackEncodedString(DFA118_eofS);
    static final char[] DFA118_min = DFA.unpackEncodedStringToUnsignedChars(DFA118_minS);
    static final char[] DFA118_max = DFA.unpackEncodedStringToUnsignedChars(DFA118_maxS);
    static final short[] DFA118_accept = DFA.unpackEncodedString(DFA118_acceptS);
    static final short[] DFA118_special = DFA.unpackEncodedString(DFA118_specialS);
    static final short[][] DFA118_transition;

    static {
        int numStates = DFA118_transitionS.length;
        DFA118_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA118_transition[i] = DFA.unpackEncodedString(DFA118_transitionS[i]);
        }
    }

    class DFA118 extends DFA {

        public DFA118(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 118;
            this.eot = DFA118_eot;
            this.eof = DFA118_eof;
            this.min = DFA118_min;
            this.max = DFA118_max;
            this.accept = DFA118_accept;
            this.special = DFA118_special;
            this.transition = DFA118_transition;
        }
        public String getDescription() {
            return "()* loopback of 222:30: ( ( LT !)* ',' ( LT !)* assignmentExpressionNoIn )*";
        }
    }
    static final String DFA142_eotS =
        "\4\uffff";
    static final String DFA142_eofS =
        "\4\uffff";
    static final String DFA142_minS =
        "\2\22\2\uffff";
    static final String DFA142_maxS =
        "\2\157\2\uffff";
    static final String DFA142_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA142_specialS =
        "\4\uffff}>";
    static final String[] DFA142_transitionS = {
            "\1\2\2\uffff\1\1\2\uffff\1\2\3\uffff\1\2\7\uffff\1\2\7\uffff"+
            "\1\2\1\3\2\uffff\2\2\2\uffff\2\2\24\uffff\1\2\10\uffff\1\2\2"+
            "\uffff\1\2\2\uffff\1\2\3\uffff\2\2\2\uffff\1\2\1\uffff\1\2\1"+
            "\uffff\1\2\1\uffff\1\2\2\uffff\1\2\4\uffff\1\2",
            "\1\2\2\uffff\1\1\2\uffff\1\2\3\uffff\1\2\7\uffff\1\2\7\uffff"+
            "\1\2\1\3\2\uffff\2\2\2\uffff\2\2\24\uffff\1\2\10\uffff\1\2\2"+
            "\uffff\1\2\2\uffff\1\2\3\uffff\2\2\2\uffff\1\2\1\uffff\1\2\1"+
            "\uffff\1\2\1\uffff\1\2\2\uffff\1\2\4\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA142_eot = DFA.unpackEncodedString(DFA142_eotS);
    static final short[] DFA142_eof = DFA.unpackEncodedString(DFA142_eofS);
    static final char[] DFA142_min = DFA.unpackEncodedStringToUnsignedChars(DFA142_minS);
    static final char[] DFA142_max = DFA.unpackEncodedStringToUnsignedChars(DFA142_maxS);
    static final short[] DFA142_accept = DFA.unpackEncodedString(DFA142_acceptS);
    static final short[] DFA142_special = DFA.unpackEncodedString(DFA142_specialS);
    static final short[][] DFA142_transition;

    static {
        int numStates = DFA142_transitionS.length;
        DFA142_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA142_transition[i] = DFA.unpackEncodedString(DFA142_transitionS[i]);
        }
    }

    class DFA142 extends DFA {

        public DFA142(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 142;
            this.eot = DFA142_eot;
            this.eof = DFA142_eof;
            this.min = DFA142_min;
            this.max = DFA142_max;
            this.accept = DFA142_accept;
            this.special = DFA142_special;
            this.transition = DFA142_transition;
        }
        public String getDescription() {
            return "266:9: ( ( LT !)* assignmentExpression ( ( LT !)* ',' ( LT !)* assignmentExpression )* )?";
        }
    }
    static final String DFA141_eotS =
        "\4\uffff";
    static final String DFA141_eofS =
        "\4\uffff";
    static final String DFA141_minS =
        "\2\25\2\uffff";
    static final String DFA141_maxS =
        "\2\63\2\uffff";
    static final String DFA141_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA141_specialS =
        "\4\uffff}>";
    static final String[] DFA141_transitionS = {
            "\1\1\27\uffff\1\2\5\uffff\1\3",
            "\1\1\27\uffff\1\2\5\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA141_eot = DFA.unpackEncodedString(DFA141_eotS);
    static final short[] DFA141_eof = DFA.unpackEncodedString(DFA141_eofS);
    static final char[] DFA141_min = DFA.unpackEncodedStringToUnsignedChars(DFA141_minS);
    static final char[] DFA141_max = DFA.unpackEncodedStringToUnsignedChars(DFA141_maxS);
    static final short[] DFA141_accept = DFA.unpackEncodedString(DFA141_acceptS);
    static final short[] DFA141_special = DFA.unpackEncodedString(DFA141_specialS);
    static final short[][] DFA141_transition;

    static {
        int numStates = DFA141_transitionS.length;
        DFA141_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA141_transition[i] = DFA.unpackEncodedString(DFA141_transitionS[i]);
        }
    }

    class DFA141 extends DFA {

        public DFA141(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 141;
            this.eot = DFA141_eot;
            this.eof = DFA141_eof;
            this.min = DFA141_min;
            this.max = DFA141_max;
            this.accept = DFA141_accept;
            this.special = DFA141_special;
            this.transition = DFA141_transition;
        }
        public String getDescription() {
            return "()* loopback of 266:36: ( ( LT !)* ',' ( LT !)* assignmentExpression )*";
        }
    }
    static final String DFA151_eotS =
        "\5\uffff";
    static final String DFA151_eofS =
        "\2\3\2\uffff\1\3";
    static final String DFA151_minS =
        "\1\25\1\22\2\uffff\1\22";
    static final String DFA151_maxS =
        "\1\156\1\157\2\uffff\1\157";
    static final String DFA151_acceptS =
        "\2\uffff\1\1\1\2\1\uffff";
    static final String DFA151_specialS =
        "\5\uffff}>";
    static final String[] DFA151_transitionS = {
            "\1\1\27\uffff\1\3\5\uffff\1\3\6\uffff\2\3\15\uffff\1\2\1\uffff"+
            "\1\3\42\uffff\1\3",
            "\1\3\2\uffff\1\4\2\uffff\1\3\3\uffff\1\3\7\uffff\1\3\7\uffff"+
            "\2\3\2\uffff\2\3\1\uffff\3\3\4\uffff\2\3\15\uffff\1\2\2\3\2"+
            "\uffff\2\3\1\uffff\6\3\1\uffff\3\3\2\uffff\16\3\3\uffff\2\3",
            "",
            "",
            "\1\3\2\uffff\1\4\2\uffff\1\3\3\uffff\1\3\7\uffff\1\3\7\uffff"+
            "\2\3\2\uffff\2\3\1\uffff\3\3\4\uffff\2\3\15\uffff\1\2\2\3\2"+
            "\uffff\2\3\1\uffff\6\3\1\uffff\3\3\2\uffff\16\3\3\uffff\2\3"
    };

    static final short[] DFA151_eot = DFA.unpackEncodedString(DFA151_eotS);
    static final short[] DFA151_eof = DFA.unpackEncodedString(DFA151_eofS);
    static final char[] DFA151_min = DFA.unpackEncodedStringToUnsignedChars(DFA151_minS);
    static final char[] DFA151_max = DFA.unpackEncodedStringToUnsignedChars(DFA151_maxS);
    static final short[] DFA151_accept = DFA.unpackEncodedString(DFA151_acceptS);
    static final short[] DFA151_special = DFA.unpackEncodedString(DFA151_specialS);
    static final short[][] DFA151_transition;

    static {
        int numStates = DFA151_transitionS.length;
        DFA151_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA151_transition[i] = DFA.unpackEncodedString(DFA151_transitionS[i]);
        }
    }

    class DFA151 extends DFA {

        public DFA151(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 151;
            this.eot = DFA151_eot;
            this.eof = DFA151_eof;
            this.min = DFA151_min;
            this.max = DFA151_max;
            this.accept = DFA151_accept;
            this.special = DFA151_special;
            this.transition = DFA151_transition;
        }
        public String getDescription() {
            return "282:25: ( ( LT !)* '?' ^ ( LT !)* assignmentExpression ( LT !)* ':' ( LT !)* assignmentExpression )?";
        }
    }
    static final String DFA156_eotS =
        "\4\uffff";
    static final String DFA156_eofS =
        "\1\3\3\uffff";
    static final String DFA156_minS =
        "\2\25\2\uffff";
    static final String DFA156_maxS =
        "\2\133\2\uffff";
    static final String DFA156_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA156_specialS =
        "\4\uffff}>";
    static final String[] DFA156_transitionS = {
            "\1\1\35\uffff\1\3\6\uffff\2\3\15\uffff\1\2\21\uffff\1\3",
            "\1\1\35\uffff\1\3\6\uffff\2\3\15\uffff\1\2\21\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA156_eot = DFA.unpackEncodedString(DFA156_eotS);
    static final short[] DFA156_eof = DFA.unpackEncodedString(DFA156_eofS);
    static final char[] DFA156_min = DFA.unpackEncodedStringToUnsignedChars(DFA156_minS);
    static final char[] DFA156_max = DFA.unpackEncodedStringToUnsignedChars(DFA156_maxS);
    static final short[] DFA156_accept = DFA.unpackEncodedString(DFA156_acceptS);
    static final short[] DFA156_special = DFA.unpackEncodedString(DFA156_specialS);
    static final short[][] DFA156_transition;

    static {
        int numStates = DFA156_transitionS.length;
        DFA156_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA156_transition[i] = DFA.unpackEncodedString(DFA156_transitionS[i]);
        }
    }

    class DFA156 extends DFA {

        public DFA156(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 156;
            this.eot = DFA156_eot;
            this.eof = DFA156_eof;
            this.min = DFA156_min;
            this.max = DFA156_max;
            this.accept = DFA156_accept;
            this.special = DFA156_special;
            this.transition = DFA156_transition;
        }
        public String getDescription() {
            return "286:29: ( ( LT !)* '?' ^ ( LT !)* assignmentExpressionNoIn ( LT !)* ':' ( LT !)* assignmentExpressionNoIn )?";
        }
    }
    static final String DFA159_eotS =
        "\5\uffff";
    static final String DFA159_eofS =
        "\2\2\2\uffff\1\2";
    static final String DFA159_minS =
        "\1\25\1\22\2\uffff\1\22";
    static final String DFA159_maxS =
        "\1\156\1\157\2\uffff\1\157";
    static final String DFA159_acceptS =
        "\2\uffff\1\2\1\1\1\uffff";
    static final String DFA159_specialS =
        "\5\uffff}>";
    static final String[] DFA159_transitionS = {
            "\1\1\27\uffff\1\2\5\uffff\1\2\6\uffff\2\2\15\uffff\1\2\1\uffff"+
            "\1\2\41\uffff\1\3\1\2",
            "\1\2\2\uffff\1\4\2\uffff\1\2\3\uffff\1\2\7\uffff\1\2\7\uffff"+
            "\2\2\2\uffff\2\2\1\uffff\3\2\4\uffff\2\2\15\uffff\3\2\2\uffff"+
            "\2\2\1\uffff\6\2\1\uffff\3\2\2\uffff\16\2\2\uffff\1\3\2\2",
            "",
            "",
            "\1\2\2\uffff\1\4\2\uffff\1\2\3\uffff\1\2\7\uffff\1\2\7\uffff"+
            "\2\2\2\uffff\2\2\1\uffff\3\2\4\uffff\2\2\15\uffff\3\2\2\uffff"+
            "\2\2\1\uffff\6\2\1\uffff\3\2\2\uffff\16\2\2\uffff\1\3\2\2"
    };

    static final short[] DFA159_eot = DFA.unpackEncodedString(DFA159_eotS);
    static final short[] DFA159_eof = DFA.unpackEncodedString(DFA159_eofS);
    static final char[] DFA159_min = DFA.unpackEncodedStringToUnsignedChars(DFA159_minS);
    static final char[] DFA159_max = DFA.unpackEncodedStringToUnsignedChars(DFA159_maxS);
    static final short[] DFA159_accept = DFA.unpackEncodedString(DFA159_acceptS);
    static final short[] DFA159_special = DFA.unpackEncodedString(DFA159_specialS);
    static final short[][] DFA159_transition;

    static {
        int numStates = DFA159_transitionS.length;
        DFA159_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA159_transition[i] = DFA.unpackEncodedString(DFA159_transitionS[i]);
        }
    }

    class DFA159 extends DFA {

        public DFA159(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 159;
            this.eot = DFA159_eot;
            this.eof = DFA159_eof;
            this.min = DFA159_min;
            this.max = DFA159_max;
            this.accept = DFA159_accept;
            this.special = DFA159_special;
            this.transition = DFA159_transition;
        }
        public String getDescription() {
            return "()* loopback of 290:26: ( ( LT !)* '||' ^ ( LT !)* logicalANDExpression )*";
        }
    }
    static final String DFA162_eotS =
        "\4\uffff";
    static final String DFA162_eofS =
        "\1\2\3\uffff";
    static final String DFA162_minS =
        "\2\25\2\uffff";
    static final String DFA162_maxS =
        "\2\155\2\uffff";
    static final String DFA162_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA162_specialS =
        "\4\uffff}>";
    static final String[] DFA162_transitionS = {
            "\1\1\35\uffff\1\2\6\uffff\2\2\15\uffff\1\2\21\uffff\1\2\21\uffff"+
            "\1\3",
            "\1\1\35\uffff\1\2\6\uffff\2\2\15\uffff\1\2\21\uffff\1\2\21"+
            "\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA162_eot = DFA.unpackEncodedString(DFA162_eotS);
    static final short[] DFA162_eof = DFA.unpackEncodedString(DFA162_eofS);
    static final char[] DFA162_min = DFA.unpackEncodedStringToUnsignedChars(DFA162_minS);
    static final char[] DFA162_max = DFA.unpackEncodedStringToUnsignedChars(DFA162_maxS);
    static final short[] DFA162_accept = DFA.unpackEncodedString(DFA162_acceptS);
    static final short[] DFA162_special = DFA.unpackEncodedString(DFA162_specialS);
    static final short[][] DFA162_transition;

    static {
        int numStates = DFA162_transitionS.length;
        DFA162_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA162_transition[i] = DFA.unpackEncodedString(DFA162_transitionS[i]);
        }
    }

    class DFA162 extends DFA {

        public DFA162(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 162;
            this.eot = DFA162_eot;
            this.eof = DFA162_eof;
            this.min = DFA162_min;
            this.max = DFA162_max;
            this.accept = DFA162_accept;
            this.special = DFA162_special;
            this.transition = DFA162_transition;
        }
        public String getDescription() {
            return "()* loopback of 294:30: ( ( LT !)* '||' ^ ( LT !)* logicalANDExpressionNoIn )*";
        }
    }
    static final String DFA165_eotS =
        "\5\uffff";
    static final String DFA165_eofS =
        "\2\2\2\uffff\1\2";
    static final String DFA165_minS =
        "\1\25\1\22\2\uffff\1\22";
    static final String DFA165_maxS =
        "\1\156\1\157\2\uffff\1\157";
    static final String DFA165_acceptS =
        "\2\uffff\1\2\1\1\1\uffff";
    static final String DFA165_specialS =
        "\5\uffff}>";
    static final String[] DFA165_transitionS = {
            "\1\1\23\uffff\1\3\3\uffff\1\2\5\uffff\1\2\6\uffff\2\2\15\uffff"+
            "\1\2\1\uffff\1\2\41\uffff\2\2",
            "\1\2\2\uffff\1\4\2\uffff\1\2\3\uffff\1\2\7\uffff\1\2\4\uffff"+
            "\1\3\2\uffff\2\2\2\uffff\2\2\1\uffff\3\2\4\uffff\2\2\15\uffff"+
            "\3\2\2\uffff\2\2\1\uffff\6\2\1\uffff\3\2\2\uffff\16\2\2\uffff"+
            "\3\2",
            "",
            "",
            "\1\2\2\uffff\1\4\2\uffff\1\2\3\uffff\1\2\7\uffff\1\2\4\uffff"+
            "\1\3\2\uffff\2\2\2\uffff\2\2\1\uffff\3\2\4\uffff\2\2\15\uffff"+
            "\3\2\2\uffff\2\2\1\uffff\6\2\1\uffff\3\2\2\uffff\16\2\2\uffff"+
            "\3\2"
    };

    static final short[] DFA165_eot = DFA.unpackEncodedString(DFA165_eotS);
    static final short[] DFA165_eof = DFA.unpackEncodedString(DFA165_eofS);
    static final char[] DFA165_min = DFA.unpackEncodedStringToUnsignedChars(DFA165_minS);
    static final char[] DFA165_max = DFA.unpackEncodedStringToUnsignedChars(DFA165_maxS);
    static final short[] DFA165_accept = DFA.unpackEncodedString(DFA165_acceptS);
    static final short[] DFA165_special = DFA.unpackEncodedString(DFA165_specialS);
    static final short[][] DFA165_transition;

    static {
        int numStates = DFA165_transitionS.length;
        DFA165_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA165_transition[i] = DFA.unpackEncodedString(DFA165_transitionS[i]);
        }
    }

    class DFA165 extends DFA {

        public DFA165(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 165;
            this.eot = DFA165_eot;
            this.eof = DFA165_eof;
            this.min = DFA165_min;
            this.max = DFA165_max;
            this.accept = DFA165_accept;
            this.special = DFA165_special;
            this.transition = DFA165_transition;
        }
        public String getDescription() {
            return "()* loopback of 298:25: ( ( LT !)* '&&' ^ ( LT !)* bitwiseORExpression )*";
        }
    }
    static final String DFA168_eotS =
        "\4\uffff";
    static final String DFA168_eofS =
        "\1\2\3\uffff";
    static final String DFA168_minS =
        "\2\25\2\uffff";
    static final String DFA168_maxS =
        "\2\155\2\uffff";
    static final String DFA168_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA168_specialS =
        "\4\uffff}>";
    static final String[] DFA168_transitionS = {
            "\1\1\23\uffff\1\3\11\uffff\1\2\6\uffff\2\2\15\uffff\1\2\21\uffff"+
            "\1\2\21\uffff\1\2",
            "\1\1\23\uffff\1\3\11\uffff\1\2\6\uffff\2\2\15\uffff\1\2\21"+
            "\uffff\1\2\21\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA168_eot = DFA.unpackEncodedString(DFA168_eotS);
    static final short[] DFA168_eof = DFA.unpackEncodedString(DFA168_eofS);
    static final char[] DFA168_min = DFA.unpackEncodedStringToUnsignedChars(DFA168_minS);
    static final char[] DFA168_max = DFA.unpackEncodedStringToUnsignedChars(DFA168_maxS);
    static final short[] DFA168_accept = DFA.unpackEncodedString(DFA168_acceptS);
    static final short[] DFA168_special = DFA.unpackEncodedString(DFA168_specialS);
    static final short[][] DFA168_transition;

    static {
        int numStates = DFA168_transitionS.length;
        DFA168_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA168_transition[i] = DFA.unpackEncodedString(DFA168_transitionS[i]);
        }
    }

    class DFA168 extends DFA {

        public DFA168(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 168;
            this.eot = DFA168_eot;
            this.eof = DFA168_eof;
            this.min = DFA168_min;
            this.max = DFA168_max;
            this.accept = DFA168_accept;
            this.special = DFA168_special;
            this.transition = DFA168_transition;
        }
        public String getDescription() {
            return "()* loopback of 302:29: ( ( LT !)* '&&' ^ ( LT !)* bitwiseORExpressionNoIn )*";
        }
    }
    static final String DFA171_eotS =
        "\5\uffff";
    static final String DFA171_eofS =
        "\2\2\2\uffff\1\2";
    static final String DFA171_minS =
        "\1\25\1\22\2\uffff\1\22";
    static final String DFA171_maxS =
        "\1\156\1\157\2\uffff\1\157";
    static final String DFA171_acceptS =
        "\2\uffff\1\2\1\1\1\uffff";
    static final String DFA171_specialS =
        "\5\uffff}>";
    static final String[] DFA171_transitionS = {
            "\1\1\23\uffff\1\2\3\uffff\1\2\5\uffff\1\2\6\uffff\2\2\15\uffff"+
            "\1\2\1\uffff\1\2\37\uffff\1\3\1\uffff\2\2",
            "\1\2\2\uffff\1\4\2\uffff\1\2\3\uffff\1\2\7\uffff\1\2\4\uffff"+
            "\1\2\2\uffff\2\2\2\uffff\2\2\1\uffff\3\2\4\uffff\2\2\15\uffff"+
            "\3\2\2\uffff\2\2\1\uffff\6\2\1\uffff\3\2\2\uffff\16\2\1\3\1"+
            "\uffff\3\2",
            "",
            "",
            "\1\2\2\uffff\1\4\2\uffff\1\2\3\uffff\1\2\7\uffff\1\2\4\uffff"+
            "\1\2\2\uffff\2\2\2\uffff\2\2\1\uffff\3\2\4\uffff\2\2\15\uffff"+
            "\3\2\2\uffff\2\2\1\uffff\6\2\1\uffff\3\2\2\uffff\16\2\1\3\1"+
            "\uffff\3\2"
    };

    static final short[] DFA171_eot = DFA.unpackEncodedString(DFA171_eotS);
    static final short[] DFA171_eof = DFA.unpackEncodedString(DFA171_eofS);
    static final char[] DFA171_min = DFA.unpackEncodedStringToUnsignedChars(DFA171_minS);
    static final char[] DFA171_max = DFA.unpackEncodedStringToUnsignedChars(DFA171_maxS);
    static final short[] DFA171_accept = DFA.unpackEncodedString(DFA171_acceptS);
    static final short[] DFA171_special = DFA.unpackEncodedString(DFA171_specialS);
    static final short[][] DFA171_transition;

    static {
        int numStates = DFA171_transitionS.length;
        DFA171_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA171_transition[i] = DFA.unpackEncodedString(DFA171_transitionS[i]);
        }
    }

    class DFA171 extends DFA {

        public DFA171(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 171;
            this.eot = DFA171_eot;
            this.eof = DFA171_eof;
            this.min = DFA171_min;
            this.max = DFA171_max;
            this.accept = DFA171_accept;
            this.special = DFA171_special;
            this.transition = DFA171_transition;
        }
        public String getDescription() {
            return "()* loopback of 306:26: ( ( LT !)* '|' ^ ( LT !)* bitwiseXORExpression )*";
        }
    }
    static final String DFA174_eotS =
        "\4\uffff";
    static final String DFA174_eofS =
        "\1\2\3\uffff";
    static final String DFA174_minS =
        "\2\25\2\uffff";
    static final String DFA174_maxS =
        "\2\155\2\uffff";
    static final String DFA174_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA174_specialS =
        "\4\uffff}>";
    static final String[] DFA174_transitionS = {
            "\1\1\23\uffff\1\2\11\uffff\1\2\6\uffff\2\2\15\uffff\1\2\21\uffff"+
            "\1\2\17\uffff\1\3\1\uffff\1\2",
            "\1\1\23\uffff\1\2\11\uffff\1\2\6\uffff\2\2\15\uffff\1\2\21"+
            "\uffff\1\2\17\uffff\1\3\1\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA174_eot = DFA.unpackEncodedString(DFA174_eotS);
    static final short[] DFA174_eof = DFA.unpackEncodedString(DFA174_eofS);
    static final char[] DFA174_min = DFA.unpackEncodedStringToUnsignedChars(DFA174_minS);
    static final char[] DFA174_max = DFA.unpackEncodedStringToUnsignedChars(DFA174_maxS);
    static final short[] DFA174_accept = DFA.unpackEncodedString(DFA174_acceptS);
    static final short[] DFA174_special = DFA.unpackEncodedString(DFA174_specialS);
    static final short[][] DFA174_transition;

    static {
        int numStates = DFA174_transitionS.length;
        DFA174_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA174_transition[i] = DFA.unpackEncodedString(DFA174_transitionS[i]);
        }
    }

    class DFA174 extends DFA {

        public DFA174(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 174;
            this.eot = DFA174_eot;
            this.eof = DFA174_eof;
            this.min = DFA174_min;
            this.max = DFA174_max;
            this.accept = DFA174_accept;
            this.special = DFA174_special;
            this.transition = DFA174_transition;
        }
        public String getDescription() {
            return "()* loopback of 310:30: ( ( LT !)* '|' ^ ( LT !)* bitwiseXORExpressionNoIn )*";
        }
    }
    static final String DFA177_eotS =
        "\5\uffff";
    static final String DFA177_eofS =
        "\2\2\2\uffff\1\2";
    static final String DFA177_minS =
        "\1\25\1\22\2\uffff\1\22";
    static final String DFA177_maxS =
        "\1\156\1\157\2\uffff\1\157";
    static final String DFA177_acceptS =
        "\2\uffff\1\2\1\1\1\uffff";
    static final String DFA177_specialS =
        "\5\uffff}>";
    static final String[] DFA177_transitionS = {
            "\1\1\23\uffff\1\2\3\uffff\1\2\5\uffff\1\2\6\uffff\2\2\15\uffff"+
            "\1\2\1\uffff\1\2\1\3\36\uffff\1\2\1\uffff\2\2",
            "\1\2\2\uffff\1\4\2\uffff\1\2\3\uffff\1\2\7\uffff\1\2\4\uffff"+
            "\1\2\2\uffff\2\2\2\uffff\2\2\1\uffff\3\2\4\uffff\2\2\15\uffff"+
            "\3\2\1\3\1\uffff\2\2\1\uffff\6\2\1\uffff\3\2\2\uffff\17\2\1"+
            "\uffff\3\2",
            "",
            "",
            "\1\2\2\uffff\1\4\2\uffff\1\2\3\uffff\1\2\7\uffff\1\2\4\uffff"+
            "\1\2\2\uffff\2\2\2\uffff\2\2\1\uffff\3\2\4\uffff\2\2\15\uffff"+
            "\3\2\1\3\1\uffff\2\2\1\uffff\6\2\1\uffff\3\2\2\uffff\17\2\1"+
            "\uffff\3\2"
    };

    static final short[] DFA177_eot = DFA.unpackEncodedString(DFA177_eotS);
    static final short[] DFA177_eof = DFA.unpackEncodedString(DFA177_eofS);
    static final char[] DFA177_min = DFA.unpackEncodedStringToUnsignedChars(DFA177_minS);
    static final char[] DFA177_max = DFA.unpackEncodedStringToUnsignedChars(DFA177_maxS);
    static final short[] DFA177_accept = DFA.unpackEncodedString(DFA177_acceptS);
    static final short[] DFA177_special = DFA.unpackEncodedString(DFA177_specialS);
    static final short[][] DFA177_transition;

    static {
        int numStates = DFA177_transitionS.length;
        DFA177_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA177_transition[i] = DFA.unpackEncodedString(DFA177_transitionS[i]);
        }
    }

    class DFA177 extends DFA {

        public DFA177(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 177;
            this.eot = DFA177_eot;
            this.eof = DFA177_eof;
            this.min = DFA177_min;
            this.max = DFA177_max;
            this.accept = DFA177_accept;
            this.special = DFA177_special;
            this.transition = DFA177_transition;
        }
        public String getDescription() {
            return "()* loopback of 314:26: ( ( LT !)* '^' ^ ( LT !)* bitwiseANDExpression )*";
        }
    }
    static final String DFA180_eotS =
        "\4\uffff";
    static final String DFA180_eofS =
        "\1\2\3\uffff";
    static final String DFA180_minS =
        "\2\25\2\uffff";
    static final String DFA180_maxS =
        "\2\155\2\uffff";
    static final String DFA180_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA180_specialS =
        "\4\uffff}>";
    static final String[] DFA180_transitionS = {
            "\1\1\23\uffff\1\2\11\uffff\1\2\6\uffff\2\2\15\uffff\1\2\2\uffff"+
            "\1\3\16\uffff\1\2\17\uffff\1\2\1\uffff\1\2",
            "\1\1\23\uffff\1\2\11\uffff\1\2\6\uffff\2\2\15\uffff\1\2\2\uffff"+
            "\1\3\16\uffff\1\2\17\uffff\1\2\1\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA180_eot = DFA.unpackEncodedString(DFA180_eotS);
    static final short[] DFA180_eof = DFA.unpackEncodedString(DFA180_eofS);
    static final char[] DFA180_min = DFA.unpackEncodedStringToUnsignedChars(DFA180_minS);
    static final char[] DFA180_max = DFA.unpackEncodedStringToUnsignedChars(DFA180_maxS);
    static final short[] DFA180_accept = DFA.unpackEncodedString(DFA180_acceptS);
    static final short[] DFA180_special = DFA.unpackEncodedString(DFA180_specialS);
    static final short[][] DFA180_transition;

    static {
        int numStates = DFA180_transitionS.length;
        DFA180_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA180_transition[i] = DFA.unpackEncodedString(DFA180_transitionS[i]);
        }
    }

    class DFA180 extends DFA {

        public DFA180(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 180;
            this.eot = DFA180_eot;
            this.eof = DFA180_eof;
            this.min = DFA180_min;
            this.max = DFA180_max;
            this.accept = DFA180_accept;
            this.special = DFA180_special;
            this.transition = DFA180_transition;
        }
        public String getDescription() {
            return "()* loopback of 318:30: ( ( LT !)* '^' ^ ( LT !)* bitwiseANDExpressionNoIn )*";
        }
    }
    static final String DFA183_eotS =
        "\5\uffff";
    static final String DFA183_eofS =
        "\2\2\2\uffff\1\2";
    static final String DFA183_minS =
        "\1\25\1\22\2\uffff\1\22";
    static final String DFA183_maxS =
        "\1\156\1\157\2\uffff\1\157";
    static final String DFA183_acceptS =
        "\2\uffff\1\2\1\1\1\uffff";
    static final String DFA183_specialS =
        "\5\uffff}>";
    static final String[] DFA183_transitionS = {
            "\1\1\23\uffff\1\2\1\3\2\uffff\1\2\5\uffff\1\2\6\uffff\2\2\15"+
            "\uffff\1\2\1\uffff\2\2\36\uffff\1\2\1\uffff\2\2",
            "\1\2\2\uffff\1\4\2\uffff\1\2\3\uffff\1\2\7\uffff\1\2\4\uffff"+
            "\1\2\1\3\1\uffff\2\2\2\uffff\2\2\1\uffff\3\2\4\uffff\2\2\15"+
            "\uffff\4\2\1\uffff\2\2\1\uffff\6\2\1\uffff\3\2\2\uffff\17\2"+
            "\1\uffff\3\2",
            "",
            "",
            "\1\2\2\uffff\1\4\2\uffff\1\2\3\uffff\1\2\7\uffff\1\2\4\uffff"+
            "\1\2\1\3\1\uffff\2\2\2\uffff\2\2\1\uffff\3\2\4\uffff\2\2\15"+
            "\uffff\4\2\1\uffff\2\2\1\uffff\6\2\1\uffff\3\2\2\uffff\17\2"+
            "\1\uffff\3\2"
    };

    static final short[] DFA183_eot = DFA.unpackEncodedString(DFA183_eotS);
    static final short[] DFA183_eof = DFA.unpackEncodedString(DFA183_eofS);
    static final char[] DFA183_min = DFA.unpackEncodedStringToUnsignedChars(DFA183_minS);
    static final char[] DFA183_max = DFA.unpackEncodedStringToUnsignedChars(DFA183_maxS);
    static final short[] DFA183_accept = DFA.unpackEncodedString(DFA183_acceptS);
    static final short[] DFA183_special = DFA.unpackEncodedString(DFA183_specialS);
    static final short[][] DFA183_transition;

    static {
        int numStates = DFA183_transitionS.length;
        DFA183_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA183_transition[i] = DFA.unpackEncodedString(DFA183_transitionS[i]);
        }
    }

    class DFA183 extends DFA {

        public DFA183(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 183;
            this.eot = DFA183_eot;
            this.eof = DFA183_eof;
            this.min = DFA183_min;
            this.max = DFA183_max;
            this.accept = DFA183_accept;
            this.special = DFA183_special;
            this.transition = DFA183_transition;
        }
        public String getDescription() {
            return "()* loopback of 322:24: ( ( LT !)* '&' ^ ( LT !)* equalityExpression )*";
        }
    }
    static final String DFA186_eotS =
        "\4\uffff";
    static final String DFA186_eofS =
        "\1\2\3\uffff";
    static final String DFA186_minS =
        "\2\25\2\uffff";
    static final String DFA186_maxS =
        "\2\155\2\uffff";
    static final String DFA186_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA186_specialS =
        "\4\uffff}>";
    static final String[] DFA186_transitionS = {
            "\1\1\23\uffff\1\2\1\3\10\uffff\1\2\6\uffff\2\2\15\uffff\1\2"+
            "\2\uffff\1\2\16\uffff\1\2\17\uffff\1\2\1\uffff\1\2",
            "\1\1\23\uffff\1\2\1\3\10\uffff\1\2\6\uffff\2\2\15\uffff\1\2"+
            "\2\uffff\1\2\16\uffff\1\2\17\uffff\1\2\1\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA186_eot = DFA.unpackEncodedString(DFA186_eotS);
    static final short[] DFA186_eof = DFA.unpackEncodedString(DFA186_eofS);
    static final char[] DFA186_min = DFA.unpackEncodedStringToUnsignedChars(DFA186_minS);
    static final char[] DFA186_max = DFA.unpackEncodedStringToUnsignedChars(DFA186_maxS);
    static final short[] DFA186_accept = DFA.unpackEncodedString(DFA186_acceptS);
    static final short[] DFA186_special = DFA.unpackEncodedString(DFA186_specialS);
    static final short[][] DFA186_transition;

    static {
        int numStates = DFA186_transitionS.length;
        DFA186_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA186_transition[i] = DFA.unpackEncodedString(DFA186_transitionS[i]);
        }
    }

    class DFA186 extends DFA {

        public DFA186(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 186;
            this.eot = DFA186_eot;
            this.eof = DFA186_eof;
            this.min = DFA186_min;
            this.max = DFA186_max;
            this.accept = DFA186_accept;
            this.special = DFA186_special;
            this.transition = DFA186_transition;
        }
        public String getDescription() {
            return "()* loopback of 326:28: ( ( LT !)* '&' ^ ( LT !)* equalityExpressionNoIn )*";
        }
    }
    static final String DFA190_eotS =
        "\5\uffff";
    static final String DFA190_eofS =
        "\2\2\2\uffff\1\2";
    static final String DFA190_minS =
        "\1\25\1\22\2\uffff\1\22";
    static final String DFA190_maxS =
        "\1\156\1\157\2\uffff\1\157";
    static final String DFA190_acceptS =
        "\2\uffff\1\2\1\1\1\uffff";
    static final String DFA190_specialS =
        "\5\uffff}>";
    static final String[] DFA190_transitionS = {
            "\1\1\17\uffff\2\3\2\uffff\2\2\2\uffff\1\2\5\uffff\1\2\6\uffff"+
            "\2\2\5\uffff\2\3\6\uffff\1\2\1\uffff\2\2\36\uffff\1\2\1\uffff"+
            "\2\2",
            "\1\2\2\uffff\1\4\2\uffff\1\2\3\uffff\1\2\7\uffff\1\2\2\3\2"+
            "\uffff\2\2\1\uffff\2\2\2\uffff\2\2\1\uffff\3\2\4\uffff\2\2\5"+
            "\uffff\2\3\6\uffff\4\2\1\uffff\2\2\1\uffff\6\2\1\uffff\3\2\2"+
            "\uffff\17\2\1\uffff\3\2",
            "",
            "",
            "\1\2\2\uffff\1\4\2\uffff\1\2\3\uffff\1\2\7\uffff\1\2\2\3\2"+
            "\uffff\2\2\1\uffff\2\2\2\uffff\2\2\1\uffff\3\2\4\uffff\2\2\5"+
            "\uffff\2\3\6\uffff\4\2\1\uffff\2\2\1\uffff\6\2\1\uffff\3\2\2"+
            "\uffff\17\2\1\uffff\3\2"
    };

    static final short[] DFA190_eot = DFA.unpackEncodedString(DFA190_eotS);
    static final short[] DFA190_eof = DFA.unpackEncodedString(DFA190_eofS);
    static final char[] DFA190_min = DFA.unpackEncodedStringToUnsignedChars(DFA190_minS);
    static final char[] DFA190_max = DFA.unpackEncodedStringToUnsignedChars(DFA190_maxS);
    static final short[] DFA190_accept = DFA.unpackEncodedString(DFA190_acceptS);
    static final short[] DFA190_special = DFA.unpackEncodedString(DFA190_specialS);
    static final short[][] DFA190_transition;

    static {
        int numStates = DFA190_transitionS.length;
        DFA190_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA190_transition[i] = DFA.unpackEncodedString(DFA190_transitionS[i]);
        }
    }

    class DFA190 extends DFA {

        public DFA190(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 190;
            this.eot = DFA190_eot;
            this.eof = DFA190_eof;
            this.min = DFA190_min;
            this.max = DFA190_max;
            this.accept = DFA190_accept;
            this.special = DFA190_special;
            this.transition = DFA190_transition;
        }
        public String getDescription() {
            return "()* loopback of 330:26: ( ( LT !)* ( '==' ^| '!=' ^| '===' ^| '!==' ^) ( LT !)* relationalExpression )*";
        }
    }
    static final String DFA194_eotS =
        "\4\uffff";
    static final String DFA194_eofS =
        "\1\2\3\uffff";
    static final String DFA194_minS =
        "\2\25\2\uffff";
    static final String DFA194_maxS =
        "\2\155\2\uffff";
    static final String DFA194_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA194_specialS =
        "\4\uffff}>";
    static final String[] DFA194_transitionS = {
            "\1\1\17\uffff\2\3\2\uffff\2\2\10\uffff\1\2\6\uffff\2\2\5\uffff"+
            "\2\3\6\uffff\1\2\2\uffff\1\2\16\uffff\1\2\17\uffff\1\2\1\uffff"+
            "\1\2",
            "\1\1\17\uffff\2\3\2\uffff\2\2\10\uffff\1\2\6\uffff\2\2\5\uffff"+
            "\2\3\6\uffff\1\2\2\uffff\1\2\16\uffff\1\2\17\uffff\1\2\1\uffff"+
            "\1\2",
            "",
            ""
    };

    static final short[] DFA194_eot = DFA.unpackEncodedString(DFA194_eotS);
    static final short[] DFA194_eof = DFA.unpackEncodedString(DFA194_eofS);
    static final char[] DFA194_min = DFA.unpackEncodedStringToUnsignedChars(DFA194_minS);
    static final char[] DFA194_max = DFA.unpackEncodedStringToUnsignedChars(DFA194_maxS);
    static final short[] DFA194_accept = DFA.unpackEncodedString(DFA194_acceptS);
    static final short[] DFA194_special = DFA.unpackEncodedString(DFA194_specialS);
    static final short[][] DFA194_transition;

    static {
        int numStates = DFA194_transitionS.length;
        DFA194_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA194_transition[i] = DFA.unpackEncodedString(DFA194_transitionS[i]);
        }
    }

    class DFA194 extends DFA {

        public DFA194(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 194;
            this.eot = DFA194_eot;
            this.eof = DFA194_eof;
            this.min = DFA194_min;
            this.max = DFA194_max;
            this.accept = DFA194_accept;
            this.special = DFA194_special;
            this.transition = DFA194_transition;
        }
        public String getDescription() {
            return "()* loopback of 334:30: ( ( LT !)* ( '==' ^| '!=' ^| '===' ^| '!==' ^) ( LT !)* relationalExpressionNoIn )*";
        }
    }
    static final String DFA198_eotS =
        "\5\uffff";
    static final String DFA198_eofS =
        "\2\2\2\uffff\1\2";
    static final String DFA198_minS =
        "\1\25\1\22\2\uffff\1\22";
    static final String DFA198_maxS =
        "\1\156\1\157\2\uffff\1\157";
    static final String DFA198_acceptS =
        "\2\uffff\1\2\1\1\1\uffff";
    static final String DFA198_specialS =
        "\5\uffff}>";
    static final String[] DFA198_transitionS = {
            "\1\1\17\uffff\2\2\2\uffff\2\2\2\uffff\1\2\5\uffff\1\2\6\uffff"+
            "\2\2\1\3\2\uffff\1\3\1\uffff\2\2\2\3\4\uffff\1\2\1\uffff\2\2"+
            "\16\uffff\2\3\16\uffff\1\2\1\uffff\2\2",
            "\1\2\2\uffff\1\4\2\uffff\1\2\3\uffff\1\2\7\uffff\3\2\2\uffff"+
            "\2\2\1\uffff\2\2\2\uffff\2\2\1\uffff\3\2\4\uffff\2\2\1\3\2\uffff"+
            "\1\3\1\uffff\2\2\2\3\4\uffff\4\2\1\uffff\2\2\1\uffff\6\2\1\uffff"+
            "\3\2\2\3\17\2\1\uffff\3\2",
            "",
            "",
            "\1\2\2\uffff\1\4\2\uffff\1\2\3\uffff\1\2\7\uffff\3\2\2\uffff"+
            "\2\2\1\uffff\2\2\2\uffff\2\2\1\uffff\3\2\4\uffff\2\2\1\3\2\uffff"+
            "\1\3\1\uffff\2\2\2\3\4\uffff\4\2\1\uffff\2\2\1\uffff\6\2\1\uffff"+
            "\3\2\2\3\17\2\1\uffff\3\2"
    };

    static final short[] DFA198_eot = DFA.unpackEncodedString(DFA198_eotS);
    static final short[] DFA198_eof = DFA.unpackEncodedString(DFA198_eofS);
    static final char[] DFA198_min = DFA.unpackEncodedStringToUnsignedChars(DFA198_minS);
    static final char[] DFA198_max = DFA.unpackEncodedStringToUnsignedChars(DFA198_maxS);
    static final short[] DFA198_accept = DFA.unpackEncodedString(DFA198_acceptS);
    static final short[] DFA198_special = DFA.unpackEncodedString(DFA198_specialS);
    static final short[][] DFA198_transition;

    static {
        int numStates = DFA198_transitionS.length;
        DFA198_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA198_transition[i] = DFA.unpackEncodedString(DFA198_transitionS[i]);
        }
    }

    class DFA198 extends DFA {

        public DFA198(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 198;
            this.eot = DFA198_eot;
            this.eof = DFA198_eof;
            this.min = DFA198_min;
            this.max = DFA198_max;
            this.accept = DFA198_accept;
            this.special = DFA198_special;
            this.transition = DFA198_transition;
        }
        public String getDescription() {
            return "()* loopback of 338:21: ( ( LT !)* ( '<' ^| '>' ^| '<=' ^| '>=' ^| 'instanceof' ^| 'in' ^) ( LT !)* shiftExpression )*";
        }
    }
    static final String DFA202_eotS =
        "\4\uffff";
    static final String DFA202_eofS =
        "\1\2\3\uffff";
    static final String DFA202_minS =
        "\2\25\2\uffff";
    static final String DFA202_maxS =
        "\2\155\2\uffff";
    static final String DFA202_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA202_specialS =
        "\4\uffff}>";
    static final String[] DFA202_transitionS = {
            "\1\1\17\uffff\2\2\2\uffff\2\2\10\uffff\1\2\6\uffff\2\2\1\3\2"+
            "\uffff\1\3\1\uffff\2\2\2\3\4\uffff\1\2\2\uffff\1\2\16\uffff"+
            "\1\2\1\3\16\uffff\1\2\1\uffff\1\2",
            "\1\1\17\uffff\2\2\2\uffff\2\2\10\uffff\1\2\6\uffff\2\2\1\3"+
            "\2\uffff\1\3\1\uffff\2\2\2\3\4\uffff\1\2\2\uffff\1\2\16\uffff"+
            "\1\2\1\3\16\uffff\1\2\1\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA202_eot = DFA.unpackEncodedString(DFA202_eotS);
    static final short[] DFA202_eof = DFA.unpackEncodedString(DFA202_eofS);
    static final char[] DFA202_min = DFA.unpackEncodedStringToUnsignedChars(DFA202_minS);
    static final char[] DFA202_max = DFA.unpackEncodedStringToUnsignedChars(DFA202_maxS);
    static final short[] DFA202_accept = DFA.unpackEncodedString(DFA202_acceptS);
    static final short[] DFA202_special = DFA.unpackEncodedString(DFA202_specialS);
    static final short[][] DFA202_transition;

    static {
        int numStates = DFA202_transitionS.length;
        DFA202_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA202_transition[i] = DFA.unpackEncodedString(DFA202_transitionS[i]);
        }
    }

    class DFA202 extends DFA {

        public DFA202(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 202;
            this.eot = DFA202_eot;
            this.eof = DFA202_eof;
            this.min = DFA202_min;
            this.max = DFA202_max;
            this.accept = DFA202_accept;
            this.special = DFA202_special;
            this.transition = DFA202_transition;
        }
        public String getDescription() {
            return "()* loopback of 342:21: ( ( LT !)* ( '<' ^| '>' ^| '<=' ^| '>=' ^| 'instanceof' ^) ( LT !)* shiftExpression )*";
        }
    }
    static final String DFA206_eotS =
        "\5\uffff";
    static final String DFA206_eofS =
        "\2\2\2\uffff\1\2";
    static final String DFA206_minS =
        "\1\25\1\22\2\uffff\1\22";
    static final String DFA206_maxS =
        "\1\156\1\157\2\uffff\1\157";
    static final String DFA206_acceptS =
        "\2\uffff\1\2\1\1\1\uffff";
    static final String DFA206_specialS =
        "\5\uffff}>";
    static final String[] DFA206_transitionS = {
            "\1\1\17\uffff\2\2\2\uffff\2\2\2\uffff\1\2\5\uffff\1\2\6\uffff"+
            "\3\2\1\3\1\uffff\1\2\1\uffff\4\2\1\3\1\uffff\1\3\1\uffff\1\2"+
            "\1\uffff\2\2\16\uffff\2\2\16\uffff\1\2\1\uffff\2\2",
            "\1\2\2\uffff\1\4\2\uffff\1\2\3\uffff\1\2\7\uffff\3\2\2\uffff"+
            "\2\2\1\uffff\2\2\2\uffff\2\2\1\uffff\3\2\4\uffff\3\2\1\3\1\uffff"+
            "\1\2\1\uffff\4\2\1\3\1\uffff\1\3\1\uffff\4\2\1\uffff\2\2\1\uffff"+
            "\6\2\1\uffff\24\2\1\uffff\3\2",
            "",
            "",
            "\1\2\2\uffff\1\4\2\uffff\1\2\3\uffff\1\2\7\uffff\3\2\2\uffff"+
            "\2\2\1\uffff\2\2\2\uffff\2\2\1\uffff\3\2\4\uffff\3\2\1\3\1\uffff"+
            "\1\2\1\uffff\4\2\1\3\1\uffff\1\3\1\uffff\4\2\1\uffff\2\2\1\uffff"+
            "\6\2\1\uffff\24\2\1\uffff\3\2"
    };

    static final short[] DFA206_eot = DFA.unpackEncodedString(DFA206_eotS);
    static final short[] DFA206_eof = DFA.unpackEncodedString(DFA206_eofS);
    static final char[] DFA206_min = DFA.unpackEncodedStringToUnsignedChars(DFA206_minS);
    static final char[] DFA206_max = DFA.unpackEncodedStringToUnsignedChars(DFA206_maxS);
    static final short[] DFA206_accept = DFA.unpackEncodedString(DFA206_acceptS);
    static final short[] DFA206_special = DFA.unpackEncodedString(DFA206_specialS);
    static final short[][] DFA206_transition;

    static {
        int numStates = DFA206_transitionS.length;
        DFA206_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA206_transition[i] = DFA.unpackEncodedString(DFA206_transitionS[i]);
        }
    }

    class DFA206 extends DFA {

        public DFA206(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 206;
            this.eot = DFA206_eot;
            this.eof = DFA206_eof;
            this.min = DFA206_min;
            this.max = DFA206_max;
            this.accept = DFA206_accept;
            this.special = DFA206_special;
            this.transition = DFA206_transition;
        }
        public String getDescription() {
            return "()* loopback of 346:24: ( ( LT !)* ( '<<' ^| '>>' ^| '>>>' ^) ( LT !)* additiveExpression )*";
        }
    }
    static final String DFA214_eotS =
        "\5\uffff";
    static final String DFA214_eofS =
        "\2\2\2\uffff\1\2";
    static final String DFA214_minS =
        "\1\25\1\22\2\uffff\1\22";
    static final String DFA214_maxS =
        "\1\156\1\157\2\uffff\1\157";
    static final String DFA214_acceptS =
        "\2\uffff\1\2\1\1\1\uffff";
    static final String DFA214_specialS =
        "\5\uffff}>";
    static final String[] DFA214_transitionS = {
            "\1\1\17\uffff\2\2\1\3\1\uffff\2\2\2\uffff\1\2\1\3\1\uffff\1"+
            "\2\2\uffff\2\2\3\uffff\1\3\1\uffff\4\2\1\uffff\1\2\1\uffff\5"+
            "\2\1\uffff\1\2\1\uffff\1\2\1\uffff\2\2\16\uffff\2\2\16\uffff"+
            "\1\2\1\uffff\2\2",
            "\1\2\2\uffff\1\4\2\uffff\1\2\3\uffff\1\2\7\uffff\3\2\1\3\1"+
            "\uffff\2\2\1\uffff\2\2\1\3\1\uffff\2\2\1\uffff\3\2\2\uffff\1"+
            "\3\1\uffff\4\2\1\uffff\1\2\1\uffff\5\2\1\uffff\1\2\1\uffff\4"+
            "\2\1\uffff\2\2\1\uffff\6\2\1\uffff\24\2\1\uffff\3\2",
            "",
            "",
            "\1\2\2\uffff\1\4\2\uffff\1\2\3\uffff\1\2\7\uffff\3\2\1\3\1"+
            "\uffff\2\2\1\uffff\2\2\1\3\1\uffff\2\2\1\uffff\3\2\2\uffff\1"+
            "\3\1\uffff\4\2\1\uffff\1\2\1\uffff\5\2\1\uffff\1\2\1\uffff\4"+
            "\2\1\uffff\2\2\1\uffff\6\2\1\uffff\24\2\1\uffff\3\2"
    };

    static final short[] DFA214_eot = DFA.unpackEncodedString(DFA214_eotS);
    static final short[] DFA214_eof = DFA.unpackEncodedString(DFA214_eofS);
    static final char[] DFA214_min = DFA.unpackEncodedStringToUnsignedChars(DFA214_minS);
    static final char[] DFA214_max = DFA.unpackEncodedStringToUnsignedChars(DFA214_maxS);
    static final short[] DFA214_accept = DFA.unpackEncodedString(DFA214_acceptS);
    static final short[] DFA214_special = DFA.unpackEncodedString(DFA214_specialS);
    static final short[][] DFA214_transition;

    static {
        int numStates = DFA214_transitionS.length;
        DFA214_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA214_transition[i] = DFA.unpackEncodedString(DFA214_transitionS[i]);
        }
    }

    class DFA214 extends DFA {

        public DFA214(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 214;
            this.eot = DFA214_eot;
            this.eof = DFA214_eof;
            this.min = DFA214_min;
            this.max = DFA214_max;
            this.accept = DFA214_accept;
            this.special = DFA214_special;
            this.transition = DFA214_transition;
        }
        public String getDescription() {
            return "()* loopback of 354:21: ( ( LT !)* ( '*' ^| '/' ^| '%' ^) ( LT !)* unaryExpression )*";
        }
    }
    static final String DFA226_eotS =
        "\4\uffff";
    static final String DFA226_eofS =
        "\4\uffff";
    static final String DFA226_minS =
        "\2\25\2\uffff";
    static final String DFA226_maxS =
        "\2\113\2\uffff";
    static final String DFA226_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA226_specialS =
        "\4\uffff}>";
    static final String[] DFA226_transitionS = {
            "\1\1\35\uffff\1\3\27\uffff\1\2",
            "\1\1\35\uffff\1\3\27\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA226_eot = DFA.unpackEncodedString(DFA226_eotS);
    static final short[] DFA226_eof = DFA.unpackEncodedString(DFA226_eofS);
    static final char[] DFA226_min = DFA.unpackEncodedStringToUnsignedChars(DFA226_minS);
    static final char[] DFA226_max = DFA.unpackEncodedStringToUnsignedChars(DFA226_maxS);
    static final short[] DFA226_accept = DFA.unpackEncodedString(DFA226_acceptS);
    static final short[] DFA226_special = DFA.unpackEncodedString(DFA226_specialS);
    static final short[][] DFA226_transition;

    static {
        int numStates = DFA226_transitionS.length;
        DFA226_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA226_transition[i] = DFA.unpackEncodedString(DFA226_transitionS[i]);
        }
    }

    class DFA226 extends DFA {

        public DFA226(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 226;
            this.eot = DFA226_eot;
            this.eof = DFA226_eof;
            this.min = DFA226_min;
            this.max = DFA226_max;
            this.accept = DFA226_accept;
            this.special = DFA226_special;
            this.transition = DFA226_transition;
        }
        public String getDescription() {
            return "()* loopback of 377:36: ( ( LT !)* ',' ( ( LT !)* assignmentExpression )? )*";
        }
    }
    static final String DFA225_eotS =
        "\4\uffff";
    static final String DFA225_eofS =
        "\4\uffff";
    static final String DFA225_minS =
        "\2\22\2\uffff";
    static final String DFA225_maxS =
        "\2\157\2\uffff";
    static final String DFA225_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA225_specialS =
        "\4\uffff}>";
    static final String[] DFA225_transitionS = {
            "\1\2\2\uffff\1\1\2\uffff\1\2\3\uffff\1\2\7\uffff\1\2\7\uffff"+
            "\1\2\3\uffff\2\2\1\uffff\1\3\2\2\24\uffff\1\2\1\3\7\uffff\1"+
            "\2\2\uffff\1\2\2\uffff\1\2\3\uffff\2\2\2\uffff\1\2\1\uffff\1"+
            "\2\1\uffff\1\2\1\uffff\1\2\2\uffff\1\2\4\uffff\1\2",
            "\1\2\2\uffff\1\1\2\uffff\1\2\3\uffff\1\2\7\uffff\1\2\7\uffff"+
            "\1\2\3\uffff\2\2\1\uffff\1\3\2\2\24\uffff\1\2\1\3\7\uffff\1"+
            "\2\2\uffff\1\2\2\uffff\1\2\3\uffff\2\2\2\uffff\1\2\1\uffff\1"+
            "\2\1\uffff\1\2\1\uffff\1\2\2\uffff\1\2\4\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA225_eot = DFA.unpackEncodedString(DFA225_eotS);
    static final short[] DFA225_eof = DFA.unpackEncodedString(DFA225_eofS);
    static final char[] DFA225_min = DFA.unpackEncodedStringToUnsignedChars(DFA225_minS);
    static final char[] DFA225_max = DFA.unpackEncodedStringToUnsignedChars(DFA225_maxS);
    static final short[] DFA225_accept = DFA.unpackEncodedString(DFA225_acceptS);
    static final short[] DFA225_special = DFA.unpackEncodedString(DFA225_specialS);
    static final short[][] DFA225_transition;

    static {
        int numStates = DFA225_transitionS.length;
        DFA225_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA225_transition[i] = DFA.unpackEncodedString(DFA225_transitionS[i]);
        }
    }

    class DFA225 extends DFA {

        public DFA225(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 225;
            this.eot = DFA225_eot;
            this.eof = DFA225_eof;
            this.min = DFA225_min;
            this.max = DFA225_max;
            this.accept = DFA225_accept;
            this.special = DFA225_special;
            this.transition = DFA225_transition;
        }
        public String getDescription() {
            return "377:46: ( ( LT !)* assignmentExpression )?";
        }
    }
    static final String DFA231_eotS =
        "\4\uffff";
    static final String DFA231_eofS =
        "\4\uffff";
    static final String DFA231_minS =
        "\2\25\2\uffff";
    static final String DFA231_maxS =
        "\2\156\2\uffff";
    static final String DFA231_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA231_specialS =
        "\4\uffff}>";
    static final String[] DFA231_transitionS = {
            "\1\1\35\uffff\1\3\72\uffff\1\2",
            "\1\1\35\uffff\1\3\72\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA231_eot = DFA.unpackEncodedString(DFA231_eotS);
    static final short[] DFA231_eof = DFA.unpackEncodedString(DFA231_eofS);
    static final char[] DFA231_min = DFA.unpackEncodedStringToUnsignedChars(DFA231_minS);
    static final char[] DFA231_max = DFA.unpackEncodedStringToUnsignedChars(DFA231_maxS);
    static final short[] DFA231_accept = DFA.unpackEncodedString(DFA231_acceptS);
    static final short[] DFA231_special = DFA.unpackEncodedString(DFA231_specialS);
    static final short[][] DFA231_transition;

    static {
        int numStates = DFA231_transitionS.length;
        DFA231_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA231_transition[i] = DFA.unpackEncodedString(DFA231_transitionS[i]);
        }
    }

    class DFA231 extends DFA {

        public DFA231(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 231;
            this.eot = DFA231_eot;
            this.eof = DFA231_eof;
            this.min = DFA231_min;
            this.max = DFA231_max;
            this.accept = DFA231_accept;
            this.special = DFA231_special;
            this.transition = DFA231_transition;
        }
        public String getDescription() {
            return "()* loopback of 382:35: ( ( LT !)* ',' ( LT !)* propertyNameAndValue )*";
        }
    }
 

    public static final BitSet FOLLOW_LT_in_program100 = new BitSet(new long[]{0x0833101011240000L,0x000087FFE75A4400L});
    public static final BitSet FOLLOW_sourceElements_in_program104 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LT_in_program106 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_EOF_in_program110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sourceElement_in_sourceElements124 = new BitSet(new long[]{0x0833101011240002L,0x000087FFE75A4400L});
    public static final BitSet FOLLOW_LT_in_sourceElements127 = new BitSet(new long[]{0x0833101011240000L,0x000087FFE75A4400L});
    public static final BitSet FOLLOW_sourceElement_in_sourceElements131 = new BitSet(new long[]{0x0833101011240002L,0x000087FFE75A4400L});
    public static final BitSet FOLLOW_functionDeclaration_in_sourceElement146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_sourceElement152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_functionDeclaration166 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_LT_in_functionDeclaration168 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_Identifier_in_functionDeclaration171 = new BitSet(new long[]{0x0000100000200000L});
    public static final BitSet FOLLOW_LT_in_functionDeclaration173 = new BitSet(new long[]{0x0000100000200000L});
    public static final BitSet FOLLOW_formalParameterList_in_functionDeclaration176 = new BitSet(new long[]{0x0000000000200000L,0x0000040000000000L});
    public static final BitSet FOLLOW_LT_in_functionDeclaration178 = new BitSet(new long[]{0x0000000000200000L,0x0000040000000000L});
    public static final BitSet FOLLOW_functionBody_in_functionDeclaration181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_functionExpression208 = new BitSet(new long[]{0x0000100000240000L});
    public static final BitSet FOLLOW_LT_in_functionExpression210 = new BitSet(new long[]{0x0000100000240000L});
    public static final BitSet FOLLOW_Identifier_in_functionExpression213 = new BitSet(new long[]{0x0000100000200000L});
    public static final BitSet FOLLOW_LT_in_functionExpression216 = new BitSet(new long[]{0x0000100000200000L});
    public static final BitSet FOLLOW_formalParameterList_in_functionExpression219 = new BitSet(new long[]{0x0000000000200000L,0x0000040000000000L});
    public static final BitSet FOLLOW_LT_in_functionExpression221 = new BitSet(new long[]{0x0000000000200000L,0x0000040000000000L});
    public static final BitSet FOLLOW_functionBody_in_functionExpression224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_formalParameterList252 = new BitSet(new long[]{0x0000200000240000L});
    public static final BitSet FOLLOW_LT_in_formalParameterList256 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_Identifier_in_formalParameterList260 = new BitSet(new long[]{0x0008200000200000L});
    public static final BitSet FOLLOW_LT_in_formalParameterList263 = new BitSet(new long[]{0x0008000000200000L});
    public static final BitSet FOLLOW_51_in_formalParameterList267 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_LT_in_formalParameterList269 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_Identifier_in_formalParameterList273 = new BitSet(new long[]{0x0008200000200000L});
    public static final BitSet FOLLOW_LT_in_formalParameterList279 = new BitSet(new long[]{0x0000200000200000L});
    public static final BitSet FOLLOW_45_in_formalParameterList283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_functionBody296 = new BitSet(new long[]{0x0833101011240000L,0x000087FFE75A4400L});
    public static final BitSet FOLLOW_LT_in_functionBody299 = new BitSet(new long[]{0x0833101011240000L,0x000087FFE75A4400L});
    public static final BitSet FOLLOW_sourceElements_in_functionBody303 = new BitSet(new long[]{0x0000000000200000L,0x0000400000000000L});
    public static final BitSet FOLLOW_LT_in_functionBody305 = new BitSet(new long[]{0x0000000000200000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_functionBody309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementBlock_in_statement323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableStatement_in_statement329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyStatement_in_statement335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionStatement_in_statement341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterationStatement_in_statement353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_continueStatement_in_statement359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_breakStatement_in_statement365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnStatement_in_statement371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_withStatement_in_statement377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_labelledStatement_in_statement383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchStatement_in_statement389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_throwStatement_in_statement395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tryStatement_in_statement401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_statementBlock414 = new BitSet(new long[]{0x0833101011240000L,0x0000C7FFE75A4400L});
    public static final BitSet FOLLOW_LT_in_statementBlock416 = new BitSet(new long[]{0x0833101011240000L,0x0000C7FFE75A4400L});
    public static final BitSet FOLLOW_statementList_in_statementBlock420 = new BitSet(new long[]{0x0000000000200000L,0x0000400000000000L});
    public static final BitSet FOLLOW_LT_in_statementBlock423 = new BitSet(new long[]{0x0000000000200000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_statementBlock427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statementList440 = new BitSet(new long[]{0x0833101011240002L,0x000087FFE75A4400L});
    public static final BitSet FOLLOW_LT_in_statementList443 = new BitSet(new long[]{0x0833101011240000L,0x000087FFE75A4400L});
    public static final BitSet FOLLOW_statement_in_statementList447 = new BitSet(new long[]{0x0833101011240002L,0x000087FFE75A4400L});
    public static final BitSet FOLLOW_102_in_variableStatement462 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_LT_in_variableStatement464 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_variableDeclarationList_in_variableStatement468 = new BitSet(new long[]{0x0800000000200000L});
    public static final BitSet FOLLOW_set_in_variableStatement470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationList490 = new BitSet(new long[]{0x0008000000200002L});
    public static final BitSet FOLLOW_LT_in_variableDeclarationList493 = new BitSet(new long[]{0x0008000000200000L});
    public static final BitSet FOLLOW_51_in_variableDeclarationList497 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_LT_in_variableDeclarationList499 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationList503 = new BitSet(new long[]{0x0008000000200002L});
    public static final BitSet FOLLOW_variableDeclarationNoIn_in_variableDeclarationListNoIn518 = new BitSet(new long[]{0x0008000000200002L});
    public static final BitSet FOLLOW_LT_in_variableDeclarationListNoIn521 = new BitSet(new long[]{0x0008000000200000L});
    public static final BitSet FOLLOW_51_in_variableDeclarationListNoIn525 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_LT_in_variableDeclarationListNoIn527 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_variableDeclarationNoIn_in_variableDeclarationListNoIn531 = new BitSet(new long[]{0x0008000000200002L});
    public static final BitSet FOLLOW_Identifier_in_variableDeclaration546 = new BitSet(new long[]{0x0000000000200002L,0x0000000000000001L});
    public static final BitSet FOLLOW_LT_in_variableDeclaration548 = new BitSet(new long[]{0x0000000000200002L,0x0000000000000001L});
    public static final BitSet FOLLOW_initializer_in_variableDeclaration551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_variableDeclarationNoIn576 = new BitSet(new long[]{0x0000000000200002L,0x0000000000000001L});
    public static final BitSet FOLLOW_LT_in_variableDeclarationNoIn579 = new BitSet(new long[]{0x0000000000200002L,0x0000000000000001L});
    public static final BitSet FOLLOW_initialiserNoIn_in_variableDeclarationNoIn583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_initializer597 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_LT_in_initializer599 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_assignmentExpression_in_initializer603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_initialiserNoIn616 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_LT_in_initialiserNoIn618 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_initialiserNoIn622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_emptyStatement635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionStatement648 = new BitSet(new long[]{0x0800000000200000L});
    public static final BitSet FOLLOW_set_in_expressionStatement650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ifStatement670 = new BitSet(new long[]{0x0000100000200000L});
    public static final BitSet FOLLOW_LT_in_ifStatement673 = new BitSet(new long[]{0x0000100000200000L});
    public static final BitSet FOLLOW_44_in_ifStatement677 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_LT_in_ifStatement679 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_expression_in_ifStatement683 = new BitSet(new long[]{0x0000200000200000L});
    public static final BitSet FOLLOW_LT_in_ifStatement685 = new BitSet(new long[]{0x0000200000200000L});
    public static final BitSet FOLLOW_45_in_ifStatement689 = new BitSet(new long[]{0x0833101011240000L,0x000087FFE75A4400L});
    public static final BitSet FOLLOW_LT_in_ifStatement691 = new BitSet(new long[]{0x0833101011240000L,0x000087FFE75A4400L});
    public static final BitSet FOLLOW_statement_in_ifStatement695 = new BitSet(new long[]{0x0000000000200002L,0x0000000000200000L});
    public static final BitSet FOLLOW_LT_in_ifStatement698 = new BitSet(new long[]{0x0000000000200000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_ifStatement702 = new BitSet(new long[]{0x0833101011240000L,0x000087FFE75A4400L});
    public static final BitSet FOLLOW_LT_in_ifStatement704 = new BitSet(new long[]{0x0833101011240000L,0x000087FFE75A4400L});
    public static final BitSet FOLLOW_statement_in_ifStatement708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doWhileStatement_in_iterationStatement723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_iterationStatement729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forStatement_in_iterationStatement735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forInStatement_in_iterationStatement741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_doWhileStatement754 = new BitSet(new long[]{0x0833101011240000L,0x000087FFE75A4400L});
    public static final BitSet FOLLOW_LT_in_doWhileStatement757 = new BitSet(new long[]{0x0833101011240000L,0x000087FFE75A4400L});
    public static final BitSet FOLLOW_statement_in_doWhileStatement761 = new BitSet(new long[]{0x0000000000200000L,0x0000010000000000L});
    public static final BitSet FOLLOW_LT_in_doWhileStatement763 = new BitSet(new long[]{0x0000000000200000L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_doWhileStatement767 = new BitSet(new long[]{0x0000100000200000L});
    public static final BitSet FOLLOW_LT_in_doWhileStatement769 = new BitSet(new long[]{0x0000100000200000L});
    public static final BitSet FOLLOW_44_in_doWhileStatement773 = new BitSet(new long[]{0x0033101011040000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_expression_in_doWhileStatement775 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_doWhileStatement777 = new BitSet(new long[]{0x0800000000200000L});
    public static final BitSet FOLLOW_set_in_doWhileStatement779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_whileStatement799 = new BitSet(new long[]{0x0000100000200000L});
    public static final BitSet FOLLOW_LT_in_whileStatement802 = new BitSet(new long[]{0x0000100000200000L});
    public static final BitSet FOLLOW_44_in_whileStatement806 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_LT_in_whileStatement808 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_expression_in_whileStatement812 = new BitSet(new long[]{0x0000200000200000L});
    public static final BitSet FOLLOW_LT_in_whileStatement814 = new BitSet(new long[]{0x0000200000200000L});
    public static final BitSet FOLLOW_45_in_whileStatement818 = new BitSet(new long[]{0x0833101011240000L,0x000087FFE75A4400L});
    public static final BitSet FOLLOW_LT_in_whileStatement820 = new BitSet(new long[]{0x0833101011240000L,0x000087FFE75A4400L});
    public static final BitSet FOLLOW_statement_in_whileStatement824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_forStatement837 = new BitSet(new long[]{0x0000100000200000L});
    public static final BitSet FOLLOW_LT_in_forStatement840 = new BitSet(new long[]{0x0000100000200000L});
    public static final BitSet FOLLOW_44_in_forStatement844 = new BitSet(new long[]{0x0833101011240000L,0x000084EA62480400L});
    public static final BitSet FOLLOW_LT_in_forStatement847 = new BitSet(new long[]{0x0033101011240000L,0x000084EA62480400L});
    public static final BitSet FOLLOW_forStatementInitialiserPart_in_forStatement851 = new BitSet(new long[]{0x0800000000200000L});
    public static final BitSet FOLLOW_LT_in_forStatement855 = new BitSet(new long[]{0x0800000000200000L});
    public static final BitSet FOLLOW_59_in_forStatement859 = new BitSet(new long[]{0x0833101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_LT_in_forStatement862 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_expression_in_forStatement866 = new BitSet(new long[]{0x0800000000200000L});
    public static final BitSet FOLLOW_LT_in_forStatement870 = new BitSet(new long[]{0x0800000000200000L});
    public static final BitSet FOLLOW_59_in_forStatement874 = new BitSet(new long[]{0x0033301011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_LT_in_forStatement877 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_expression_in_forStatement881 = new BitSet(new long[]{0x0000200000200000L});
    public static final BitSet FOLLOW_LT_in_forStatement885 = new BitSet(new long[]{0x0000200000200000L});
    public static final BitSet FOLLOW_45_in_forStatement889 = new BitSet(new long[]{0x0833101011240000L,0x000087FFE75A4400L});
    public static final BitSet FOLLOW_LT_in_forStatement891 = new BitSet(new long[]{0x0833101011240000L,0x000087FFE75A4400L});
    public static final BitSet FOLLOW_statement_in_forStatement895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionNoIn_in_forStatementInitialiserPart908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_forStatementInitialiserPart914 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_LT_in_forStatementInitialiserPart916 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_variableDeclarationListNoIn_in_forStatementInitialiserPart920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_forInStatement933 = new BitSet(new long[]{0x0000100000200000L});
    public static final BitSet FOLLOW_LT_in_forInStatement936 = new BitSet(new long[]{0x0000100000200000L});
    public static final BitSet FOLLOW_44_in_forInStatement940 = new BitSet(new long[]{0x0000100011240000L,0x0000044A62400400L});
    public static final BitSet FOLLOW_LT_in_forInStatement942 = new BitSet(new long[]{0x0000100011240000L,0x0000044A62400400L});
    public static final BitSet FOLLOW_forInStatementInitialiserPart_in_forInStatement946 = new BitSet(new long[]{0x0000000000200000L,0x0000000008000000L});
    public static final BitSet FOLLOW_LT_in_forInStatement948 = new BitSet(new long[]{0x0000000000200000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_forInStatement952 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_LT_in_forInStatement954 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_expression_in_forInStatement958 = new BitSet(new long[]{0x0000200000200000L});
    public static final BitSet FOLLOW_LT_in_forInStatement960 = new BitSet(new long[]{0x0000200000200000L});
    public static final BitSet FOLLOW_45_in_forInStatement964 = new BitSet(new long[]{0x0833101011240000L,0x000087FFE75A4400L});
    public static final BitSet FOLLOW_LT_in_forInStatement966 = new BitSet(new long[]{0x0833101011240000L,0x000087FFE75A4400L});
    public static final BitSet FOLLOW_statement_in_forInStatement970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_leftHandSideExpression_in_forInStatementInitialiserPart983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_forInStatementInitialiserPart989 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_LT_in_forInStatementInitialiserPart991 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_variableDeclarationNoIn_in_forInStatementInitialiserPart995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_continueStatement1008 = new BitSet(new long[]{0x0800000000240000L});
    public static final BitSet FOLLOW_Identifier_in_continueStatement1010 = new BitSet(new long[]{0x0800000000200000L});
    public static final BitSet FOLLOW_set_in_continueStatement1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_breakStatement1033 = new BitSet(new long[]{0x0800000000240000L});
    public static final BitSet FOLLOW_Identifier_in_breakStatement1035 = new BitSet(new long[]{0x0800000000200000L});
    public static final BitSet FOLLOW_set_in_breakStatement1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_returnStatement1058 = new BitSet(new long[]{0x0833101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_expression_in_returnStatement1061 = new BitSet(new long[]{0x0800000000200000L});
    public static final BitSet FOLLOW_set_in_returnStatement1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_withStatement1084 = new BitSet(new long[]{0x0000100000200000L});
    public static final BitSet FOLLOW_LT_in_withStatement1087 = new BitSet(new long[]{0x0000100000200000L});
    public static final BitSet FOLLOW_44_in_withStatement1091 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_LT_in_withStatement1093 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_expression_in_withStatement1097 = new BitSet(new long[]{0x0000200000200000L});
    public static final BitSet FOLLOW_LT_in_withStatement1099 = new BitSet(new long[]{0x0000200000200000L});
    public static final BitSet FOLLOW_45_in_withStatement1103 = new BitSet(new long[]{0x0833101011240000L,0x000087FFE75A4400L});
    public static final BitSet FOLLOW_LT_in_withStatement1105 = new BitSet(new long[]{0x0833101011240000L,0x000087FFE75A4400L});
    public static final BitSet FOLLOW_statement_in_withStatement1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_labelledStatement1122 = new BitSet(new long[]{0x0400000000200000L});
    public static final BitSet FOLLOW_LT_in_labelledStatement1124 = new BitSet(new long[]{0x0400000000200000L});
    public static final BitSet FOLLOW_58_in_labelledStatement1128 = new BitSet(new long[]{0x0833101011240000L,0x000087FFE75A4400L});
    public static final BitSet FOLLOW_LT_in_labelledStatement1130 = new BitSet(new long[]{0x0833101011240000L,0x000087FFE75A4400L});
    public static final BitSet FOLLOW_statement_in_labelledStatement1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_switchStatement1147 = new BitSet(new long[]{0x0000100000200000L});
    public static final BitSet FOLLOW_LT_in_switchStatement1150 = new BitSet(new long[]{0x0000100000200000L});
    public static final BitSet FOLLOW_44_in_switchStatement1154 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_LT_in_switchStatement1156 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_expression_in_switchStatement1160 = new BitSet(new long[]{0x0000200000200000L});
    public static final BitSet FOLLOW_LT_in_switchStatement1162 = new BitSet(new long[]{0x0000200000200000L});
    public static final BitSet FOLLOW_45_in_switchStatement1166 = new BitSet(new long[]{0x0000000000200000L,0x0000040000000000L});
    public static final BitSet FOLLOW_LT_in_switchStatement1168 = new BitSet(new long[]{0x0000000000200000L,0x0000040000000000L});
    public static final BitSet FOLLOW_caseBlock_in_switchStatement1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_caseBlock1185 = new BitSet(new long[]{0x0000000000200000L,0x0000400000048000L});
    public static final BitSet FOLLOW_LT_in_caseBlock1188 = new BitSet(new long[]{0x0000000000200000L,0x0000000000008000L});
    public static final BitSet FOLLOW_caseClause_in_caseBlock1192 = new BitSet(new long[]{0x0000000000200000L,0x0000400000048000L});
    public static final BitSet FOLLOW_LT_in_caseBlock1197 = new BitSet(new long[]{0x0000000000200000L,0x0000000000040000L});
    public static final BitSet FOLLOW_defaultClause_in_caseBlock1201 = new BitSet(new long[]{0x0000000000200000L,0x0000400000008000L});
    public static final BitSet FOLLOW_LT_in_caseBlock1204 = new BitSet(new long[]{0x0000000000200000L,0x0000000000008000L});
    public static final BitSet FOLLOW_caseClause_in_caseBlock1208 = new BitSet(new long[]{0x0000000000200000L,0x0000400000008000L});
    public static final BitSet FOLLOW_LT_in_caseBlock1214 = new BitSet(new long[]{0x0000000000200000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_caseBlock1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_caseClause1231 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_LT_in_caseClause1234 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_expression_in_caseClause1238 = new BitSet(new long[]{0x0400000000200000L});
    public static final BitSet FOLLOW_LT_in_caseClause1240 = new BitSet(new long[]{0x0400000000200000L});
    public static final BitSet FOLLOW_58_in_caseClause1244 = new BitSet(new long[]{0x0833101011240002L,0x000087FFE75A4400L});
    public static final BitSet FOLLOW_LT_in_caseClause1246 = new BitSet(new long[]{0x0833101011240002L,0x000087FFE75A4400L});
    public static final BitSet FOLLOW_statementList_in_caseClause1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_defaultClause1264 = new BitSet(new long[]{0x0400000000200000L});
    public static final BitSet FOLLOW_LT_in_defaultClause1267 = new BitSet(new long[]{0x0400000000200000L});
    public static final BitSet FOLLOW_58_in_defaultClause1271 = new BitSet(new long[]{0x0833101011240002L,0x000087FFE75A4400L});
    public static final BitSet FOLLOW_LT_in_defaultClause1273 = new BitSet(new long[]{0x0833101011240002L,0x000087FFE75A4400L});
    public static final BitSet FOLLOW_statementList_in_defaultClause1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_throwStatement1291 = new BitSet(new long[]{0x0033101011040000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_expression_in_throwStatement1294 = new BitSet(new long[]{0x0800000000200000L});
    public static final BitSet FOLLOW_set_in_throwStatement1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_tryStatement1316 = new BitSet(new long[]{0x0000000000200000L,0x0000040000000000L});
    public static final BitSet FOLLOW_LT_in_tryStatement1319 = new BitSet(new long[]{0x0000000000200000L,0x0000040000000000L});
    public static final BitSet FOLLOW_statementBlock_in_tryStatement1323 = new BitSet(new long[]{0x0000000000200000L,0x0000000000810000L});
    public static final BitSet FOLLOW_LT_in_tryStatement1325 = new BitSet(new long[]{0x0000000000200000L,0x0000000000810000L});
    public static final BitSet FOLLOW_finallyClause_in_tryStatement1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_catchClause_in_tryStatement1334 = new BitSet(new long[]{0x0000000000200002L,0x0000000000800000L});
    public static final BitSet FOLLOW_LT_in_tryStatement1337 = new BitSet(new long[]{0x0000000000200000L,0x0000000000800000L});
    public static final BitSet FOLLOW_finallyClause_in_tryStatement1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_catchClause1357 = new BitSet(new long[]{0x0000100000200000L});
    public static final BitSet FOLLOW_LT_in_catchClause1360 = new BitSet(new long[]{0x0000100000200000L});
    public static final BitSet FOLLOW_44_in_catchClause1364 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_LT_in_catchClause1366 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_Identifier_in_catchClause1370 = new BitSet(new long[]{0x0000200000200000L});
    public static final BitSet FOLLOW_LT_in_catchClause1372 = new BitSet(new long[]{0x0000200000200000L});
    public static final BitSet FOLLOW_45_in_catchClause1376 = new BitSet(new long[]{0x0000000000200000L,0x0000040000000000L});
    public static final BitSet FOLLOW_LT_in_catchClause1378 = new BitSet(new long[]{0x0000000000200000L,0x0000040000000000L});
    public static final BitSet FOLLOW_statementBlock_in_catchClause1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_finallyClause1395 = new BitSet(new long[]{0x0000000000200000L,0x0000040000000000L});
    public static final BitSet FOLLOW_LT_in_finallyClause1398 = new BitSet(new long[]{0x0000000000200000L,0x0000040000000000L});
    public static final BitSet FOLLOW_statementBlock_in_finallyClause1402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_expression1416 = new BitSet(new long[]{0x0008000000200002L});
    public static final BitSet FOLLOW_LT_in_expression1419 = new BitSet(new long[]{0x0008000000200000L});
    public static final BitSet FOLLOW_51_in_expression1423 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_LT_in_expression1425 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_assignmentExpression_in_expression1429 = new BitSet(new long[]{0x0008000000200002L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_expressionNoIn1444 = new BitSet(new long[]{0x0008000000200002L});
    public static final BitSet FOLLOW_LT_in_expressionNoIn1447 = new BitSet(new long[]{0x0008000000200000L});
    public static final BitSet FOLLOW_51_in_expressionNoIn1451 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_LT_in_expressionNoIn1453 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_expressionNoIn1457 = new BitSet(new long[]{0x0008000000200002L});
    public static final BitSet FOLLOW_conditionalExpression_in_assignmentExpression1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_leftHandSideExpression_in_assignmentExpression1478 = new BitSet(new long[]{0x4244890000200000L,0x0000100000002141L});
    public static final BitSet FOLLOW_LT_in_assignmentExpression1480 = new BitSet(new long[]{0x4244890000200000L,0x0000100000002141L});
    public static final BitSet FOLLOW_assignmentOperator_in_assignmentExpression1484 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_LT_in_assignmentExpression1487 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_assignmentExpression_in_assignmentExpression1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpressionNoIn_in_assignmentExpressionNoIn1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_leftHandSideExpression_in_assignmentExpressionNoIn1510 = new BitSet(new long[]{0x4244890000200000L,0x0000100000002141L});
    public static final BitSet FOLLOW_LT_in_assignmentExpressionNoIn1512 = new BitSet(new long[]{0x4244890000200000L,0x0000100000002141L});
    public static final BitSet FOLLOW_assignmentOperator_in_assignmentExpressionNoIn1516 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_LT_in_assignmentExpressionNoIn1519 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_assignmentExpressionNoIn1523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callExpression_in_leftHandSideExpression1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newExpression_in_leftHandSideExpression1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_memberExpression_in_newExpression1555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_newExpression1561 = new BitSet(new long[]{0x0000100011240000L,0x0000040A62400400L});
    public static final BitSet FOLLOW_LT_in_newExpression1564 = new BitSet(new long[]{0x0000100011240000L,0x0000040A62400400L});
    public static final BitSet FOLLOW_newExpression_in_newExpression1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_memberExpression1582 = new BitSet(new long[]{0x0080000000200002L,0x0000000000000400L});
    public static final BitSet FOLLOW_functionExpression_in_memberExpression1586 = new BitSet(new long[]{0x0080000000200002L,0x0000000000000400L});
    public static final BitSet FOLLOW_93_in_memberExpression1590 = new BitSet(new long[]{0x0000100011240000L,0x0000040A62400400L});
    public static final BitSet FOLLOW_LT_in_memberExpression1592 = new BitSet(new long[]{0x0000100011240000L,0x0000040A62400400L});
    public static final BitSet FOLLOW_memberExpression_in_memberExpression1596 = new BitSet(new long[]{0x0000100000200000L});
    public static final BitSet FOLLOW_LT_in_memberExpression1598 = new BitSet(new long[]{0x0000100000200000L});
    public static final BitSet FOLLOW_arguments_in_memberExpression1602 = new BitSet(new long[]{0x0080000000200002L,0x0000000000000400L});
    public static final BitSet FOLLOW_LT_in_memberExpression1606 = new BitSet(new long[]{0x0080000000200000L,0x0000000000000400L});
    public static final BitSet FOLLOW_memberExpressionSuffix_in_memberExpression1610 = new BitSet(new long[]{0x0080000000200002L,0x0000000000000400L});
    public static final BitSet FOLLOW_indexSuffix_in_memberExpressionSuffix1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyReferenceSuffix_in_memberExpressionSuffix1631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_memberExpression_in_callExpression1644 = new BitSet(new long[]{0x0000100000200000L});
    public static final BitSet FOLLOW_LT_in_callExpression1646 = new BitSet(new long[]{0x0000100000200000L});
    public static final BitSet FOLLOW_arguments_in_callExpression1649 = new BitSet(new long[]{0x0080100000200002L,0x0000000000000400L});
    public static final BitSet FOLLOW_LT_in_callExpression1652 = new BitSet(new long[]{0x0080100000200000L,0x0000000000000400L});
    public static final BitSet FOLLOW_callExpressionSuffix_in_callExpression1655 = new BitSet(new long[]{0x0080100000200002L,0x0000000000000400L});
    public static final BitSet FOLLOW_arguments_in_callExpressionSuffix1685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_indexSuffix_in_callExpressionSuffix1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyReferenceSuffix_in_callExpressionSuffix1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_arguments1710 = new BitSet(new long[]{0x0033301011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_LT_in_arguments1713 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_assignmentExpression_in_arguments1717 = new BitSet(new long[]{0x0008200000200000L});
    public static final BitSet FOLLOW_LT_in_arguments1720 = new BitSet(new long[]{0x0008000000200000L});
    public static final BitSet FOLLOW_51_in_arguments1724 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_LT_in_arguments1726 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_assignmentExpression_in_arguments1730 = new BitSet(new long[]{0x0008200000200000L});
    public static final BitSet FOLLOW_LT_in_arguments1736 = new BitSet(new long[]{0x0000200000200000L});
    public static final BitSet FOLLOW_45_in_arguments1740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_indexSuffix1753 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_LT_in_indexSuffix1755 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_expression_in_indexSuffix1759 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000800L});
    public static final BitSet FOLLOW_LT_in_indexSuffix1761 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_indexSuffix1765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_propertyReferenceSuffix1778 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_LT_in_propertyReferenceSuffix1780 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_Identifier_in_propertyReferenceSuffix1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalORExpression_in_conditionalExpression1854 = new BitSet(new long[]{0x0000000000200002L,0x0000000000000200L});
    public static final BitSet FOLLOW_LT_in_conditionalExpression1857 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_conditionalExpression1861 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_LT_in_conditionalExpression1864 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_assignmentExpression_in_conditionalExpression1868 = new BitSet(new long[]{0x0400000000200000L});
    public static final BitSet FOLLOW_LT_in_conditionalExpression1870 = new BitSet(new long[]{0x0400000000200000L});
    public static final BitSet FOLLOW_58_in_conditionalExpression1874 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_LT_in_conditionalExpression1876 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_assignmentExpression_in_conditionalExpression1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalORExpressionNoIn_in_conditionalExpressionNoIn1895 = new BitSet(new long[]{0x0000000000200002L,0x0000000000000200L});
    public static final BitSet FOLLOW_LT_in_conditionalExpressionNoIn1898 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_conditionalExpressionNoIn1902 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_LT_in_conditionalExpressionNoIn1905 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn1909 = new BitSet(new long[]{0x0400000000200000L});
    public static final BitSet FOLLOW_LT_in_conditionalExpressionNoIn1911 = new BitSet(new long[]{0x0400000000200000L});
    public static final BitSet FOLLOW_58_in_conditionalExpressionNoIn1915 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_LT_in_conditionalExpressionNoIn1917 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn1921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalANDExpression_in_logicalORExpression1936 = new BitSet(new long[]{0x0000000000200002L,0x0000200000000000L});
    public static final BitSet FOLLOW_LT_in_logicalORExpression1939 = new BitSet(new long[]{0x0000000000200000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_logicalORExpression1943 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_LT_in_logicalORExpression1946 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_logicalANDExpression_in_logicalORExpression1950 = new BitSet(new long[]{0x0000000000200002L,0x0000200000000000L});
    public static final BitSet FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn1965 = new BitSet(new long[]{0x0000000000200002L,0x0000200000000000L});
    public static final BitSet FOLLOW_LT_in_logicalORExpressionNoIn1968 = new BitSet(new long[]{0x0000000000200000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_logicalORExpressionNoIn1972 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_LT_in_logicalORExpressionNoIn1975 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn1979 = new BitSet(new long[]{0x0000000000200002L,0x0000200000000000L});
    public static final BitSet FOLLOW_bitwiseORExpression_in_logicalANDExpression1994 = new BitSet(new long[]{0x0000020000200002L});
    public static final BitSet FOLLOW_LT_in_logicalANDExpression1997 = new BitSet(new long[]{0x0000020000200000L});
    public static final BitSet FOLLOW_41_in_logicalANDExpression2001 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_LT_in_logicalANDExpression2004 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_bitwiseORExpression_in_logicalANDExpression2008 = new BitSet(new long[]{0x0000020000200002L});
    public static final BitSet FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn2023 = new BitSet(new long[]{0x0000020000200002L});
    public static final BitSet FOLLOW_LT_in_logicalANDExpressionNoIn2026 = new BitSet(new long[]{0x0000020000200000L});
    public static final BitSet FOLLOW_41_in_logicalANDExpressionNoIn2030 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_LT_in_logicalANDExpressionNoIn2033 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn2037 = new BitSet(new long[]{0x0000020000200002L});
    public static final BitSet FOLLOW_bitwiseXORExpression_in_bitwiseORExpression2052 = new BitSet(new long[]{0x0000000000200002L,0x0000080000000000L});
    public static final BitSet FOLLOW_LT_in_bitwiseORExpression2055 = new BitSet(new long[]{0x0000000000200000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_bitwiseORExpression2059 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_LT_in_bitwiseORExpression2062 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_bitwiseXORExpression_in_bitwiseORExpression2066 = new BitSet(new long[]{0x0000000000200002L,0x0000080000000000L});
    public static final BitSet FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn2081 = new BitSet(new long[]{0x0000000000200002L,0x0000080000000000L});
    public static final BitSet FOLLOW_LT_in_bitwiseORExpressionNoIn2084 = new BitSet(new long[]{0x0000000000200000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_bitwiseORExpressionNoIn2088 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_LT_in_bitwiseORExpressionNoIn2091 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn2095 = new BitSet(new long[]{0x0000000000200002L,0x0000080000000000L});
    public static final BitSet FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression2110 = new BitSet(new long[]{0x0000000000200002L,0x0000000000001000L});
    public static final BitSet FOLLOW_LT_in_bitwiseXORExpression2113 = new BitSet(new long[]{0x0000000000200000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_bitwiseXORExpression2117 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_LT_in_bitwiseXORExpression2120 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression2124 = new BitSet(new long[]{0x0000000000200002L,0x0000000000001000L});
    public static final BitSet FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn2139 = new BitSet(new long[]{0x0000000000200002L,0x0000000000001000L});
    public static final BitSet FOLLOW_LT_in_bitwiseXORExpressionNoIn2142 = new BitSet(new long[]{0x0000000000200000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_bitwiseXORExpressionNoIn2146 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_LT_in_bitwiseXORExpressionNoIn2149 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn2153 = new BitSet(new long[]{0x0000000000200002L,0x0000000000001000L});
    public static final BitSet FOLLOW_equalityExpression_in_bitwiseANDExpression2168 = new BitSet(new long[]{0x0000040000200002L});
    public static final BitSet FOLLOW_LT_in_bitwiseANDExpression2171 = new BitSet(new long[]{0x0000040000200000L});
    public static final BitSet FOLLOW_42_in_bitwiseANDExpression2175 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_LT_in_bitwiseANDExpression2178 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_equalityExpression_in_bitwiseANDExpression2182 = new BitSet(new long[]{0x0000040000200002L});
    public static final BitSet FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn2197 = new BitSet(new long[]{0x0000040000200002L});
    public static final BitSet FOLLOW_LT_in_bitwiseANDExpressionNoIn2200 = new BitSet(new long[]{0x0000040000200000L});
    public static final BitSet FOLLOW_42_in_bitwiseANDExpressionNoIn2204 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_LT_in_bitwiseANDExpressionNoIn2207 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn2211 = new BitSet(new long[]{0x0000040000200002L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression2226 = new BitSet(new long[]{0x0000006000200002L,0x0000000000000006L});
    public static final BitSet FOLLOW_LT_in_equalityExpression2229 = new BitSet(new long[]{0x0000006000200000L,0x0000000000000006L});
    public static final BitSet FOLLOW_65_in_equalityExpression2234 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_37_in_equalityExpression2239 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_66_in_equalityExpression2244 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_38_in_equalityExpression2249 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_LT_in_equalityExpression2253 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression2257 = new BitSet(new long[]{0x0000006000200002L,0x0000000000000006L});
    public static final BitSet FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn2272 = new BitSet(new long[]{0x0000006000200002L,0x0000000000000006L});
    public static final BitSet FOLLOW_LT_in_equalityExpressionNoIn2275 = new BitSet(new long[]{0x0000006000200000L,0x0000000000000006L});
    public static final BitSet FOLLOW_65_in_equalityExpressionNoIn2280 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_37_in_equalityExpressionNoIn2285 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_66_in_equalityExpressionNoIn2290 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_38_in_equalityExpressionNoIn2295 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_LT_in_equalityExpressionNoIn2299 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn2303 = new BitSet(new long[]{0x0000006000200002L,0x0000000000000006L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpression2318 = new BitSet(new long[]{0x9000000000200002L,0x0000000018000018L});
    public static final BitSet FOLLOW_LT_in_relationalExpression2321 = new BitSet(new long[]{0x9000000000200000L,0x0000000018000018L});
    public static final BitSet FOLLOW_60_in_relationalExpression2326 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_67_in_relationalExpression2331 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_63_in_relationalExpression2336 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_68_in_relationalExpression2341 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_92_in_relationalExpression2346 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_91_in_relationalExpression2351 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_LT_in_relationalExpression2355 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpression2359 = new BitSet(new long[]{0x9000000000200002L,0x0000000018000018L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpressionNoIn2374 = new BitSet(new long[]{0x9000000000200002L,0x0000000010000018L});
    public static final BitSet FOLLOW_LT_in_relationalExpressionNoIn2377 = new BitSet(new long[]{0x9000000000200000L,0x0000000010000018L});
    public static final BitSet FOLLOW_60_in_relationalExpressionNoIn2382 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_67_in_relationalExpressionNoIn2387 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_63_in_relationalExpressionNoIn2392 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_68_in_relationalExpressionNoIn2397 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_92_in_relationalExpressionNoIn2402 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_LT_in_relationalExpressionNoIn2406 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpressionNoIn2410 = new BitSet(new long[]{0x9000000000200002L,0x0000000010000018L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression2425 = new BitSet(new long[]{0x2000000000200002L,0x00000000000000A0L});
    public static final BitSet FOLLOW_LT_in_shiftExpression2428 = new BitSet(new long[]{0x2000000000200000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_61_in_shiftExpression2433 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_69_in_shiftExpression2438 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_71_in_shiftExpression2443 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_LT_in_shiftExpression2447 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression2451 = new BitSet(new long[]{0x2000000000200002L,0x00000000000000A0L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression2466 = new BitSet(new long[]{0x0011000000200002L});
    public static final BitSet FOLLOW_LT_in_additiveExpression2469 = new BitSet(new long[]{0x0011000000200000L});
    public static final BitSet FOLLOW_48_in_additiveExpression2474 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_52_in_additiveExpression2479 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_LT_in_additiveExpression2483 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression2487 = new BitSet(new long[]{0x0011000000200002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression2502 = new BitSet(new long[]{0x0100408000200002L});
    public static final BitSet FOLLOW_LT_in_multiplicativeExpression2505 = new BitSet(new long[]{0x0100408000200000L});
    public static final BitSet FOLLOW_46_in_multiplicativeExpression2510 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_56_in_multiplicativeExpression2515 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_39_in_multiplicativeExpression2520 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_LT_in_multiplicativeExpression2524 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression2528 = new BitSet(new long[]{0x0100408000200002L});
    public static final BitSet FOLLOW_postfixExpression_in_unaryExpression2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_unaryExpression2550 = new BitSet(new long[]{0x0033101011040000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_103_in_unaryExpression2555 = new BitSet(new long[]{0x0033101011040000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_101_in_unaryExpression2560 = new BitSet(new long[]{0x0033101011040000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_49_in_unaryExpression2565 = new BitSet(new long[]{0x0033101011040000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_53_in_unaryExpression2570 = new BitSet(new long[]{0x0033101011040000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_48_in_unaryExpression2575 = new BitSet(new long[]{0x0033101011040000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_52_in_unaryExpression2580 = new BitSet(new long[]{0x0033101011040000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_111_in_unaryExpression2585 = new BitSet(new long[]{0x0033101011040000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_36_in_unaryExpression2590 = new BitSet(new long[]{0x0033101011040000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression2594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_leftHandSideExpression_in_postfixExpression2607 = new BitSet(new long[]{0x0022000000000002L});
    public static final BitSet FOLLOW_49_in_postfixExpression2610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_postfixExpression2615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_primaryExpression2631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_primaryExpression2637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primaryExpression2643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLiteral_in_primaryExpression2649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectLiteral_in_primaryExpression2655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_primaryExpression2661 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_LT_in_primaryExpression2664 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_expression_in_primaryExpression2668 = new BitSet(new long[]{0x0000200000200000L});
    public static final BitSet FOLLOW_LT_in_primaryExpression2670 = new BitSet(new long[]{0x0000200000200000L});
    public static final BitSet FOLLOW_45_in_primaryExpression2674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_arrayLiteral2688 = new BitSet(new long[]{0x003B101011240000L,0x000084AA62480C00L});
    public static final BitSet FOLLOW_LT_in_arrayLiteral2690 = new BitSet(new long[]{0x003B101011240000L,0x000084AA62480C00L});
    public static final BitSet FOLLOW_assignmentExpression_in_arrayLiteral2694 = new BitSet(new long[]{0x0008000000200000L,0x0000000000000800L});
    public static final BitSet FOLLOW_LT_in_arrayLiteral2698 = new BitSet(new long[]{0x0008000000200000L});
    public static final BitSet FOLLOW_51_in_arrayLiteral2702 = new BitSet(new long[]{0x003B101011240000L,0x000084AA62480C00L});
    public static final BitSet FOLLOW_LT_in_arrayLiteral2705 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_assignmentExpression_in_arrayLiteral2709 = new BitSet(new long[]{0x0008000000200000L,0x0000000000000800L});
    public static final BitSet FOLLOW_LT_in_arrayLiteral2715 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_arrayLiteral2719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_objectLiteral2733 = new BitSet(new long[]{0x0000000011240000L});
    public static final BitSet FOLLOW_LT_in_objectLiteral2735 = new BitSet(new long[]{0x0000000011240000L});
    public static final BitSet FOLLOW_propertyNameAndValue_in_objectLiteral2739 = new BitSet(new long[]{0x0008000000200000L,0x0000400000000000L});
    public static final BitSet FOLLOW_LT_in_objectLiteral2742 = new BitSet(new long[]{0x0008000000200000L});
    public static final BitSet FOLLOW_51_in_objectLiteral2746 = new BitSet(new long[]{0x0000000011240000L});
    public static final BitSet FOLLOW_LT_in_objectLiteral2748 = new BitSet(new long[]{0x0000000011240000L});
    public static final BitSet FOLLOW_propertyNameAndValue_in_objectLiteral2752 = new BitSet(new long[]{0x0008000000200000L,0x0000400000000000L});
    public static final BitSet FOLLOW_LT_in_objectLiteral2756 = new BitSet(new long[]{0x0000000000200000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_objectLiteral2760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyName_in_propertyNameAndValue2773 = new BitSet(new long[]{0x0400000000200000L});
    public static final BitSet FOLLOW_LT_in_propertyNameAndValue2775 = new BitSet(new long[]{0x0400000000200000L});
    public static final BitSet FOLLOW_58_in_propertyNameAndValue2779 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_LT_in_propertyNameAndValue2781 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_assignmentExpression_in_propertyNameAndValue2785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_literal2824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_literal2830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_literal2836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_literal2842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NumericLiteral_in_literal2857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionDeclaration_in_synpred5_Javascript146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_synpred9_Javascript210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementBlock_in_synpred21_Javascript323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionStatement_in_synpred24_Javascript341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_labelledStatement_in_synpred31_Javascript383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_synpred34_Javascript416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_synpred47_Javascript548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_synpred49_Javascript579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_synpred60_Javascript698 = new BitSet(new long[]{0x0000000000200000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_synpred60_Javascript702 = new BitSet(new long[]{0x0833101011240000L,0x000087FFE75A4400L});
    public static final BitSet FOLLOW_LT_in_synpred60_Javascript704 = new BitSet(new long[]{0x0833101011240000L,0x000087FFE75A4400L});
    public static final BitSet FOLLOW_statement_in_synpred60_Javascript708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forStatement_in_synpred63_Javascript735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_synpred118_Javascript1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_synpred121_Javascript1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_synpred140_Javascript1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpressionNoIn_in_synpred143_Javascript1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callExpression_in_synpred146_Javascript1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_memberExpression_in_synpred147_Javascript1555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_synpred154_Javascript1606 = new BitSet(new long[]{0x0080000000200000L,0x0000000000000400L});
    public static final BitSet FOLLOW_memberExpressionSuffix_in_synpred154_Javascript1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_synpred158_Javascript1652 = new BitSet(new long[]{0x0080100000200000L,0x0000000000000400L});
    public static final BitSet FOLLOW_callExpressionSuffix_in_synpred158_Javascript1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_synpred256_Javascript2469 = new BitSet(new long[]{0x0011000000200000L});
    public static final BitSet FOLLOW_set_in_synpred256_Javascript2473 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_LT_in_synpred256_Javascript2483 = new BitSet(new long[]{0x0033101011240000L,0x000084AA62480400L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_synpred256_Javascript2487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_synpred280_Javascript2690 = new BitSet(new long[]{0x0000000000000002L});

}