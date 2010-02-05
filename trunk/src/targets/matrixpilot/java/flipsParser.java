// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g 2010-02-04 23:23:52

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class flipsParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FLIGHTPLAN", "DEFINE", "COMMAND", "PARAMETER", "FLY", "EXECUTE", "FIXED", "RELATIVE", "ALTITUDE", "WAYPOINT", "GEOCOORDINATE", "LATITUDE", "LONGITUDE", "MINUTE", "DEGREE", "RADIAN", "DISTANCE", "KILOMETER", "METER", "NAUTICAL", "MILE", "YARD", "FOOT", "LEFT", "RIGHT", "FLIGHTLEVEL", "CLIMB", "DESCEND", "NORTH", "SOUTH", "EAST", "WEST", "Identifier", "To", "At", "With", "FlightLevel", "FloatingPointLiteral", "BinaryLiteral", "OctalLiteral", "DecimalLiteral", "HexLiteral", "Digit", "StringLiteral", "NonZeroDigit", "BinaryDigit", "HexDigit", "Exponent", "WS", "Comment", "LineComment", "'cmd'", "'command'", "'commands'", "'='", "'and'", "','", "'('", "')'", "'wpt'", "'waypoint'", "'waypoints'", "'fly'", "'go'", "'an'", "'alt'", "'altitude'", "'a'", "'pres'", "'pressure'", "'of'", "'km'", "'kilometer'", "'kilometers'", "'m'", "'meter'", "'meters'", "'nm'", "'nautical'", "'mi'", "'mile'", "'miles'", "'statute'", "'yd'", "'yard'", "'yards'", "'ft'", "'foot'", "'feet'", "'n'", "'north'", "'s'", "'south'", "'e'", "'east'", "'w'", "'west'", "'u'", "'up'", "'c'", "'climb'", "'climbing'", "'ascend'", "'ascending'", "'d'", "'down'", "'descend'", "'descending'", "'l'", "'left'", "'port'", "'r'", "'right'", "'starboard'", "'deg'", "'degs'", "'degree'", "'degrees'", "'\\''", "'rad'", "'rads'", "'radian'", "'radians'", "'+'", "'-'"
    };
    public static final int OctalLiteral=43;
    public static final int FIXED=10;
    public static final int LATITUDE=15;
    public static final int GEOCOORDINATE=14;
    public static final int SOUTH=33;
    public static final int FOOT=26;
    public static final int EOF=-1;
    public static final int Identifier=36;
    public static final int COMMAND=6;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int DISTANCE=20;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__90=90;
    public static final int To=37;
    public static final int Comment=53;
    public static final int PARAMETER=7;
    public static final int FlightLevel=40;
    public static final int KILOMETER=21;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int CLIMB=30;
    public static final int YARD=25;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int RADIAN=19;
    public static final int T__86=86;
    public static final int DEGREE=18;
    public static final int T__89=89;
    public static final int With=39;
    public static final int T__88=88;
    public static final int T__126=126;
    public static final int T__125=125;
    public static final int T__128=128;
    public static final int T__127=127;
    public static final int WS=52;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int FLY=8;
    public static final int T__70=70;
    public static final int BinaryLiteral=42;
    public static final int BinaryDigit=49;
    public static final int FloatingPointLiteral=41;
    public static final int METER=22;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int LONGITUDE=16;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int EXECUTE=9;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int MILE=24;
    public static final int T__115=115;
    public static final int T__124=124;
    public static final int T__123=123;
    public static final int LineComment=54;
    public static final int Exponent=51;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__120=120;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int DEFINE=5;
    public static final int HexDigit=50;
    public static final int WEST=35;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int WAYPOINT=13;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int LEFT=27;
    public static final int T__59=59;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int FLIGHTLEVEL=29;
    public static final int T__112=112;
    public static final int HexLiteral=45;
    public static final int At=38;
    public static final int RIGHT=28;
    public static final int T__102=102;
    public static final int RELATIVE=11;
    public static final int T__101=101;
    public static final int EAST=34;
    public static final int T__100=100;
    public static final int Digit=46;
    public static final int DecimalLiteral=44;
    public static final int ALTITUDE=12;
    public static final int StringLiteral=47;
    public static final int FLIGHTPLAN=4;
    public static final int NAUTICAL=23;
    public static final int NonZeroDigit=48;
    public static final int NORTH=32;
    public static final int MINUTE=17;
    public static final int DESCEND=31;

    // delegates
    // delegators


        public flipsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public flipsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return flipsParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g"; }


    public static class flightPlan_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "flightPlan"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:71:1: flightPlan : ( define )* ( command )* -> ^( FLIGHTPLAN ( define )* ( command )* ) ;
    public final flipsParser.flightPlan_return flightPlan() throws RecognitionException {
        flipsParser.flightPlan_return retval = new flipsParser.flightPlan_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.define_return define1 = null;

        flipsParser.command_return command2 = null;


        RewriteRuleSubtreeStream stream_define=new RewriteRuleSubtreeStream(adaptor,"rule define");
        RewriteRuleSubtreeStream stream_command=new RewriteRuleSubtreeStream(adaptor,"rule command");
        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:72:2: ( ( define )* ( command )* -> ^( FLIGHTPLAN ( define )* ( command )* ) )
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:72:4: ( define )* ( command )*
            {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:72:4: ( define )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=55 && LA1_0<=57)||(LA1_0>=63 && LA1_0<=65)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:72:4: define
            	    {
            	    pushFollow(FOLLOW_define_in_flightPlan211);
            	    define1=define();

            	    state._fsp--;

            	    stream_define.add(define1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:72:12: ( command )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==Identifier||(LA2_0>=66 && LA2_0<=67)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:72:12: command
            	    {
            	    pushFollow(FOLLOW_command_in_flightPlan214);
            	    command2=command();

            	    state._fsp--;

            	    stream_command.add(command2.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);



            // AST REWRITE
            // elements: command, define
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 73:2: -> ^( FLIGHTPLAN ( define )* ( command )* )
            {
                // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:73:5: ^( FLIGHTPLAN ( define )* ( command )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FLIGHTPLAN, "FLIGHTPLAN"), root_1);

                // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:73:18: ( define )*
                while ( stream_define.hasNext() ) {
                    adaptor.addChild(root_1, stream_define.nextTree());

                }
                stream_define.reset();
                // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:73:26: ( command )*
                while ( stream_command.hasNext() ) {
                    adaptor.addChild(root_1, stream_command.nextTree());

                }
                stream_command.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "flightPlan"

    public static class define_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "define"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:78:1: define : ( defineCommand | defineWaypoint );
    public final flipsParser.define_return define() throws RecognitionException {
        flipsParser.define_return retval = new flipsParser.define_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.defineCommand_return defineCommand3 = null;

        flipsParser.defineWaypoint_return defineWaypoint4 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:79:2: ( defineCommand | defineWaypoint )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=55 && LA3_0<=57)) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=63 && LA3_0<=65)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:79:4: defineCommand
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_defineCommand_in_define241);
                    defineCommand3=defineCommand();

                    state._fsp--;

                    adaptor.addChild(root_0, defineCommand3.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:80:4: defineWaypoint
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_defineWaypoint_in_define246);
                    defineWaypoint4=defineWaypoint();

                    state._fsp--;

                    adaptor.addChild(root_0, defineWaypoint4.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "define"

    public static class defineCommand_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "defineCommand"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:83:1: defineCommand : ( 'cmd' | 'command' | 'commands' ) defineCommandValue -> defineCommandValue ;
    public final flipsParser.defineCommand_return defineCommand() throws RecognitionException {
        flipsParser.defineCommand_return retval = new flipsParser.defineCommand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal5=null;
        Token string_literal6=null;
        Token string_literal7=null;
        flipsParser.defineCommandValue_return defineCommandValue8 = null;


        CommonTree string_literal5_tree=null;
        CommonTree string_literal6_tree=null;
        CommonTree string_literal7_tree=null;
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleSubtreeStream stream_defineCommandValue=new RewriteRuleSubtreeStream(adaptor,"rule defineCommandValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:84:2: ( ( 'cmd' | 'command' | 'commands' ) defineCommandValue -> defineCommandValue )
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:84:4: ( 'cmd' | 'command' | 'commands' ) defineCommandValue
            {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:84:4: ( 'cmd' | 'command' | 'commands' )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt4=1;
                }
                break;
            case 56:
                {
                alt4=2;
                }
                break;
            case 57:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:84:5: 'cmd'
                    {
                    string_literal5=(Token)match(input,55,FOLLOW_55_in_defineCommand258);  
                    stream_55.add(string_literal5);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:84:11: 'command'
                    {
                    string_literal6=(Token)match(input,56,FOLLOW_56_in_defineCommand260);  
                    stream_56.add(string_literal6);


                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:84:21: 'commands'
                    {
                    string_literal7=(Token)match(input,57,FOLLOW_57_in_defineCommand262);  
                    stream_57.add(string_literal7);


                    }
                    break;

            }

            pushFollow(FOLLOW_defineCommandValue_in_defineCommand265);
            defineCommandValue8=defineCommandValue();

            state._fsp--;

            stream_defineCommandValue.add(defineCommandValue8.getTree());


            // AST REWRITE
            // elements: defineCommandValue
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 85:2: -> defineCommandValue
            {
                adaptor.addChild(root_0, stream_defineCommandValue.nextTree());

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "defineCommand"

    public static class defineCommandValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "defineCommandValue"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:88:1: defineCommandValue : ( Identifier '=' integerValue ( ( 'and' | ',' ( 'and' )? )? Identifier '=' integerValue )* -> ( ^( DEFINE Identifier ^( COMMAND integerValue ) ) )+ | Identifier '=' integerValue '(' par= integerValue ')' ( ( 'and' | ',' ( 'and' )? )? Identifier '=' integerValue '(' par= integerValue ')' )* -> ( ^( DEFINE Identifier ^( COMMAND integerValue PARAMETER $par) ) )+ );
    public final flipsParser.defineCommandValue_return defineCommandValue() throws RecognitionException {
        flipsParser.defineCommandValue_return retval = new flipsParser.defineCommandValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier9=null;
        Token char_literal10=null;
        Token string_literal12=null;
        Token char_literal13=null;
        Token string_literal14=null;
        Token Identifier15=null;
        Token char_literal16=null;
        Token Identifier18=null;
        Token char_literal19=null;
        Token char_literal21=null;
        Token char_literal22=null;
        Token string_literal23=null;
        Token char_literal24=null;
        Token string_literal25=null;
        Token Identifier26=null;
        Token char_literal27=null;
        Token char_literal29=null;
        Token char_literal30=null;
        flipsParser.integerValue_return par = null;

        flipsParser.integerValue_return integerValue11 = null;

        flipsParser.integerValue_return integerValue17 = null;

        flipsParser.integerValue_return integerValue20 = null;

        flipsParser.integerValue_return integerValue28 = null;


        CommonTree Identifier9_tree=null;
        CommonTree char_literal10_tree=null;
        CommonTree string_literal12_tree=null;
        CommonTree char_literal13_tree=null;
        CommonTree string_literal14_tree=null;
        CommonTree Identifier15_tree=null;
        CommonTree char_literal16_tree=null;
        CommonTree Identifier18_tree=null;
        CommonTree char_literal19_tree=null;
        CommonTree char_literal21_tree=null;
        CommonTree char_literal22_tree=null;
        CommonTree string_literal23_tree=null;
        CommonTree char_literal24_tree=null;
        CommonTree string_literal25_tree=null;
        CommonTree Identifier26_tree=null;
        CommonTree char_literal27_tree=null;
        CommonTree char_literal29_tree=null;
        CommonTree char_literal30_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleSubtreeStream stream_integerValue=new RewriteRuleSubtreeStream(adaptor,"rule integerValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:89:2: ( Identifier '=' integerValue ( ( 'and' | ',' ( 'and' )? )? Identifier '=' integerValue )* -> ( ^( DEFINE Identifier ^( COMMAND integerValue ) ) )+ | Identifier '=' integerValue '(' par= integerValue ')' ( ( 'and' | ',' ( 'and' )? )? Identifier '=' integerValue '(' par= integerValue ')' )* -> ( ^( DEFINE Identifier ^( COMMAND integerValue PARAMETER $par) ) )+ )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==Identifier) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==58) ) {
                    int LA11_2 = input.LA(3);

                    if ( ((LA11_2>=BinaryLiteral && LA11_2<=HexLiteral)) ) {
                        int LA11_3 = input.LA(4);

                        if ( (LA11_3==61) ) {
                            alt11=2;
                        }
                        else if ( (LA11_3==EOF||LA11_3==Identifier||(LA11_3>=55 && LA11_3<=57)||(LA11_3>=59 && LA11_3<=60)||(LA11_3>=63 && LA11_3<=67)) ) {
                            alt11=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 11, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:89:4: Identifier '=' integerValue ( ( 'and' | ',' ( 'and' )? )? Identifier '=' integerValue )*
                    {
                    Identifier9=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineCommandValue281);  
                    stream_Identifier.add(Identifier9);

                    char_literal10=(Token)match(input,58,FOLLOW_58_in_defineCommandValue283);  
                    stream_58.add(char_literal10);

                    pushFollow(FOLLOW_integerValue_in_defineCommandValue285);
                    integerValue11=integerValue();

                    state._fsp--;

                    stream_integerValue.add(integerValue11.getTree());
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:89:32: ( ( 'and' | ',' ( 'and' )? )? Identifier '=' integerValue )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==Identifier) ) {
                            int LA7_2 = input.LA(2);

                            if ( (LA7_2==58) ) {
                                alt7=1;
                            }


                        }
                        else if ( ((LA7_0>=59 && LA7_0<=60)) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:89:33: ( 'and' | ',' ( 'and' )? )? Identifier '=' integerValue
                    	    {
                    	    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:89:33: ( 'and' | ',' ( 'and' )? )?
                    	    int alt6=3;
                    	    int LA6_0 = input.LA(1);

                    	    if ( (LA6_0==59) ) {
                    	        alt6=1;
                    	    }
                    	    else if ( (LA6_0==60) ) {
                    	        alt6=2;
                    	    }
                    	    switch (alt6) {
                    	        case 1 :
                    	            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:89:34: 'and'
                    	            {
                    	            string_literal12=(Token)match(input,59,FOLLOW_59_in_defineCommandValue289);  
                    	            stream_59.add(string_literal12);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:89:40: ',' ( 'and' )?
                    	            {
                    	            char_literal13=(Token)match(input,60,FOLLOW_60_in_defineCommandValue291);  
                    	            stream_60.add(char_literal13);

                    	            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:89:44: ( 'and' )?
                    	            int alt5=2;
                    	            int LA5_0 = input.LA(1);

                    	            if ( (LA5_0==59) ) {
                    	                alt5=1;
                    	            }
                    	            switch (alt5) {
                    	                case 1 :
                    	                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:89:44: 'and'
                    	                    {
                    	                    string_literal14=(Token)match(input,59,FOLLOW_59_in_defineCommandValue293);  
                    	                    stream_59.add(string_literal14);


                    	                    }
                    	                    break;

                    	            }


                    	            }
                    	            break;

                    	    }

                    	    Identifier15=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineCommandValue298);  
                    	    stream_Identifier.add(Identifier15);

                    	    char_literal16=(Token)match(input,58,FOLLOW_58_in_defineCommandValue300);  
                    	    stream_58.add(char_literal16);

                    	    pushFollow(FOLLOW_integerValue_in_defineCommandValue302);
                    	    integerValue17=integerValue();

                    	    state._fsp--;

                    	    stream_integerValue.add(integerValue17.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: Identifier, integerValue
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 90:2: -> ( ^( DEFINE Identifier ^( COMMAND integerValue ) ) )+
                    {
                        if ( !(stream_Identifier.hasNext()||stream_integerValue.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_Identifier.hasNext()||stream_integerValue.hasNext() ) {
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:90:5: ^( DEFINE Identifier ^( COMMAND integerValue ) )
                            {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEFINE, "DEFINE"), root_1);

                            adaptor.addChild(root_1, stream_Identifier.nextNode());
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:90:25: ^( COMMAND integerValue )
                            {
                            CommonTree root_2 = (CommonTree)adaptor.nil();
                            root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMMAND, "COMMAND"), root_2);

                            adaptor.addChild(root_2, stream_integerValue.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                            adaptor.addChild(root_0, root_1);
                            }

                        }
                        stream_Identifier.reset();
                        stream_integerValue.reset();

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:91:4: Identifier '=' integerValue '(' par= integerValue ')' ( ( 'and' | ',' ( 'and' )? )? Identifier '=' integerValue '(' par= integerValue ')' )*
                    {
                    Identifier18=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineCommandValue325);  
                    stream_Identifier.add(Identifier18);

                    char_literal19=(Token)match(input,58,FOLLOW_58_in_defineCommandValue327);  
                    stream_58.add(char_literal19);

                    pushFollow(FOLLOW_integerValue_in_defineCommandValue329);
                    integerValue20=integerValue();

                    state._fsp--;

                    stream_integerValue.add(integerValue20.getTree());
                    char_literal21=(Token)match(input,61,FOLLOW_61_in_defineCommandValue331);  
                    stream_61.add(char_literal21);

                    pushFollow(FOLLOW_integerValue_in_defineCommandValue335);
                    par=integerValue();

                    state._fsp--;

                    stream_integerValue.add(par.getTree());
                    char_literal22=(Token)match(input,62,FOLLOW_62_in_defineCommandValue337);  
                    stream_62.add(char_literal22);

                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:91:57: ( ( 'and' | ',' ( 'and' )? )? Identifier '=' integerValue '(' par= integerValue ')' )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==Identifier) ) {
                            int LA10_2 = input.LA(2);

                            if ( (LA10_2==58) ) {
                                alt10=1;
                            }


                        }
                        else if ( ((LA10_0>=59 && LA10_0<=60)) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:91:58: ( 'and' | ',' ( 'and' )? )? Identifier '=' integerValue '(' par= integerValue ')'
                    	    {
                    	    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:91:58: ( 'and' | ',' ( 'and' )? )?
                    	    int alt9=3;
                    	    int LA9_0 = input.LA(1);

                    	    if ( (LA9_0==59) ) {
                    	        alt9=1;
                    	    }
                    	    else if ( (LA9_0==60) ) {
                    	        alt9=2;
                    	    }
                    	    switch (alt9) {
                    	        case 1 :
                    	            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:91:59: 'and'
                    	            {
                    	            string_literal23=(Token)match(input,59,FOLLOW_59_in_defineCommandValue341);  
                    	            stream_59.add(string_literal23);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:91:65: ',' ( 'and' )?
                    	            {
                    	            char_literal24=(Token)match(input,60,FOLLOW_60_in_defineCommandValue343);  
                    	            stream_60.add(char_literal24);

                    	            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:91:69: ( 'and' )?
                    	            int alt8=2;
                    	            int LA8_0 = input.LA(1);

                    	            if ( (LA8_0==59) ) {
                    	                alt8=1;
                    	            }
                    	            switch (alt8) {
                    	                case 1 :
                    	                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:91:69: 'and'
                    	                    {
                    	                    string_literal25=(Token)match(input,59,FOLLOW_59_in_defineCommandValue345);  
                    	                    stream_59.add(string_literal25);


                    	                    }
                    	                    break;

                    	            }


                    	            }
                    	            break;

                    	    }

                    	    Identifier26=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineCommandValue350);  
                    	    stream_Identifier.add(Identifier26);

                    	    char_literal27=(Token)match(input,58,FOLLOW_58_in_defineCommandValue352);  
                    	    stream_58.add(char_literal27);

                    	    pushFollow(FOLLOW_integerValue_in_defineCommandValue354);
                    	    integerValue28=integerValue();

                    	    state._fsp--;

                    	    stream_integerValue.add(integerValue28.getTree());
                    	    char_literal29=(Token)match(input,61,FOLLOW_61_in_defineCommandValue356);  
                    	    stream_61.add(char_literal29);

                    	    pushFollow(FOLLOW_integerValue_in_defineCommandValue360);
                    	    par=integerValue();

                    	    state._fsp--;

                    	    stream_integerValue.add(par.getTree());
                    	    char_literal30=(Token)match(input,62,FOLLOW_62_in_defineCommandValue362);  
                    	    stream_62.add(char_literal30);


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: integerValue, Identifier, par
                    // token labels: 
                    // rule labels: par, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_par=new RewriteRuleSubtreeStream(adaptor,"rule par",par!=null?par.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 92:2: -> ( ^( DEFINE Identifier ^( COMMAND integerValue PARAMETER $par) ) )+
                    {
                        if ( !(stream_integerValue.hasNext()||stream_Identifier.hasNext()||stream_par.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_integerValue.hasNext()||stream_Identifier.hasNext()||stream_par.hasNext() ) {
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:92:5: ^( DEFINE Identifier ^( COMMAND integerValue PARAMETER $par) )
                            {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEFINE, "DEFINE"), root_1);

                            adaptor.addChild(root_1, stream_Identifier.nextNode());
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:92:25: ^( COMMAND integerValue PARAMETER $par)
                            {
                            CommonTree root_2 = (CommonTree)adaptor.nil();
                            root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMMAND, "COMMAND"), root_2);

                            adaptor.addChild(root_2, stream_integerValue.nextTree());
                            adaptor.addChild(root_2, (CommonTree)adaptor.create(PARAMETER, "PARAMETER"));
                            adaptor.addChild(root_2, stream_par.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                            adaptor.addChild(root_0, root_1);
                            }

                        }
                        stream_integerValue.reset();
                        stream_Identifier.reset();
                        stream_par.reset();

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "defineCommandValue"

    public static class defineWaypoint_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "defineWaypoint"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:95:1: defineWaypoint : ( 'wpt' | 'waypoint' | 'waypoints' ) defineWaypointValue -> defineWaypointValue ;
    public final flipsParser.defineWaypoint_return defineWaypoint() throws RecognitionException {
        flipsParser.defineWaypoint_return retval = new flipsParser.defineWaypoint_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal31=null;
        Token string_literal32=null;
        Token string_literal33=null;
        flipsParser.defineWaypointValue_return defineWaypointValue34 = null;


        CommonTree string_literal31_tree=null;
        CommonTree string_literal32_tree=null;
        CommonTree string_literal33_tree=null;
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleSubtreeStream stream_defineWaypointValue=new RewriteRuleSubtreeStream(adaptor,"rule defineWaypointValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:96:2: ( ( 'wpt' | 'waypoint' | 'waypoints' ) defineWaypointValue -> defineWaypointValue )
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:96:4: ( 'wpt' | 'waypoint' | 'waypoints' ) defineWaypointValue
            {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:96:4: ( 'wpt' | 'waypoint' | 'waypoints' )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt12=1;
                }
                break;
            case 64:
                {
                alt12=2;
                }
                break;
            case 65:
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
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:96:5: 'wpt'
                    {
                    string_literal31=(Token)match(input,63,FOLLOW_63_in_defineWaypoint397);  
                    stream_63.add(string_literal31);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:96:11: 'waypoint'
                    {
                    string_literal32=(Token)match(input,64,FOLLOW_64_in_defineWaypoint399);  
                    stream_64.add(string_literal32);


                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:96:22: 'waypoints'
                    {
                    string_literal33=(Token)match(input,65,FOLLOW_65_in_defineWaypoint401);  
                    stream_65.add(string_literal33);


                    }
                    break;

            }

            pushFollow(FOLLOW_defineWaypointValue_in_defineWaypoint404);
            defineWaypointValue34=defineWaypointValue();

            state._fsp--;

            stream_defineWaypointValue.add(defineWaypointValue34.getTree());


            // AST REWRITE
            // elements: defineWaypointValue
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 97:2: -> defineWaypointValue
            {
                adaptor.addChild(root_0, stream_defineWaypointValue.nextTree());

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "defineWaypoint"

    public static class defineWaypointValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "defineWaypointValue"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:100:1: defineWaypointValue : Identifier '=' geoCoordinate ( ( 'and' | ',' ( 'and' )? )? Identifier '=' geoCoordinate )* -> ( ^( DEFINE Identifier geoCoordinate ) )+ ;
    public final flipsParser.defineWaypointValue_return defineWaypointValue() throws RecognitionException {
        flipsParser.defineWaypointValue_return retval = new flipsParser.defineWaypointValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier35=null;
        Token char_literal36=null;
        Token string_literal38=null;
        Token char_literal39=null;
        Token string_literal40=null;
        Token Identifier41=null;
        Token char_literal42=null;
        flipsParser.geoCoordinate_return geoCoordinate37 = null;

        flipsParser.geoCoordinate_return geoCoordinate43 = null;


        CommonTree Identifier35_tree=null;
        CommonTree char_literal36_tree=null;
        CommonTree string_literal38_tree=null;
        CommonTree char_literal39_tree=null;
        CommonTree string_literal40_tree=null;
        CommonTree Identifier41_tree=null;
        CommonTree char_literal42_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleSubtreeStream stream_geoCoordinate=new RewriteRuleSubtreeStream(adaptor,"rule geoCoordinate");
        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:101:2: ( Identifier '=' geoCoordinate ( ( 'and' | ',' ( 'and' )? )? Identifier '=' geoCoordinate )* -> ( ^( DEFINE Identifier geoCoordinate ) )+ )
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:101:4: Identifier '=' geoCoordinate ( ( 'and' | ',' ( 'and' )? )? Identifier '=' geoCoordinate )*
            {
            Identifier35=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineWaypointValue420);  
            stream_Identifier.add(Identifier35);

            char_literal36=(Token)match(input,58,FOLLOW_58_in_defineWaypointValue422);  
            stream_58.add(char_literal36);

            pushFollow(FOLLOW_geoCoordinate_in_defineWaypointValue424);
            geoCoordinate37=geoCoordinate();

            state._fsp--;

            stream_geoCoordinate.add(geoCoordinate37.getTree());
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:101:33: ( ( 'and' | ',' ( 'and' )? )? Identifier '=' geoCoordinate )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==Identifier) ) {
                    int LA15_2 = input.LA(2);

                    if ( (LA15_2==58) ) {
                        alt15=1;
                    }


                }
                else if ( ((LA15_0>=59 && LA15_0<=60)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:101:34: ( 'and' | ',' ( 'and' )? )? Identifier '=' geoCoordinate
            	    {
            	    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:101:34: ( 'and' | ',' ( 'and' )? )?
            	    int alt14=3;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==59) ) {
            	        alt14=1;
            	    }
            	    else if ( (LA14_0==60) ) {
            	        alt14=2;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:101:35: 'and'
            	            {
            	            string_literal38=(Token)match(input,59,FOLLOW_59_in_defineWaypointValue428);  
            	            stream_59.add(string_literal38);


            	            }
            	            break;
            	        case 2 :
            	            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:101:41: ',' ( 'and' )?
            	            {
            	            char_literal39=(Token)match(input,60,FOLLOW_60_in_defineWaypointValue430);  
            	            stream_60.add(char_literal39);

            	            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:101:45: ( 'and' )?
            	            int alt13=2;
            	            int LA13_0 = input.LA(1);

            	            if ( (LA13_0==59) ) {
            	                alt13=1;
            	            }
            	            switch (alt13) {
            	                case 1 :
            	                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:101:45: 'and'
            	                    {
            	                    string_literal40=(Token)match(input,59,FOLLOW_59_in_defineWaypointValue432);  
            	                    stream_59.add(string_literal40);


            	                    }
            	                    break;

            	            }


            	            }
            	            break;

            	    }

            	    Identifier41=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineWaypointValue437);  
            	    stream_Identifier.add(Identifier41);

            	    char_literal42=(Token)match(input,58,FOLLOW_58_in_defineWaypointValue439);  
            	    stream_58.add(char_literal42);

            	    pushFollow(FOLLOW_geoCoordinate_in_defineWaypointValue441);
            	    geoCoordinate43=geoCoordinate();

            	    state._fsp--;

            	    stream_geoCoordinate.add(geoCoordinate43.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);



            // AST REWRITE
            // elements: Identifier, geoCoordinate
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 102:2: -> ( ^( DEFINE Identifier geoCoordinate ) )+
            {
                if ( !(stream_Identifier.hasNext()||stream_geoCoordinate.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_Identifier.hasNext()||stream_geoCoordinate.hasNext() ) {
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:102:5: ^( DEFINE Identifier geoCoordinate )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEFINE, "DEFINE"), root_1);

                    adaptor.addChild(root_1, stream_Identifier.nextNode());
                    adaptor.addChild(root_1, stream_geoCoordinate.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_Identifier.reset();
                stream_geoCoordinate.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "defineWaypointValue"

    public static class command_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "command"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:107:1: command : ( flyCommand | executeCommand );
    public final flipsParser.command_return command() throws RecognitionException {
        flipsParser.command_return retval = new flipsParser.command_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.flyCommand_return flyCommand44 = null;

        flipsParser.executeCommand_return executeCommand45 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:108:2: ( flyCommand | executeCommand )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=66 && LA16_0<=67)) ) {
                alt16=1;
            }
            else if ( (LA16_0==Identifier) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:108:4: flyCommand
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_flyCommand_in_command468);
                    flyCommand44=flyCommand();

                    state._fsp--;

                    adaptor.addChild(root_0, flyCommand44.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:109:4: executeCommand
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_executeCommand_in_command473);
                    executeCommand45=executeCommand();

                    state._fsp--;

                    adaptor.addChild(root_0, executeCommand45.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "command"

    public static class flyCommand_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "flyCommand"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:112:1: flyCommand : ( 'fly' | 'go' ) ( flyCommandValue )* -> ^( FLY ( flyCommandValue )* ) ;
    public final flipsParser.flyCommand_return flyCommand() throws RecognitionException {
        flipsParser.flyCommand_return retval = new flipsParser.flyCommand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal46=null;
        Token string_literal47=null;
        flipsParser.flyCommandValue_return flyCommandValue48 = null;


        CommonTree string_literal46_tree=null;
        CommonTree string_literal47_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleSubtreeStream stream_flyCommandValue=new RewriteRuleSubtreeStream(adaptor,"rule flyCommandValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:113:2: ( ( 'fly' | 'go' ) ( flyCommandValue )* -> ^( FLY ( flyCommandValue )* ) )
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:113:4: ( 'fly' | 'go' ) ( flyCommandValue )*
            {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:113:4: ( 'fly' | 'go' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==66) ) {
                alt17=1;
            }
            else if ( (LA17_0==67) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:113:5: 'fly'
                    {
                    string_literal46=(Token)match(input,66,FOLLOW_66_in_flyCommand485);  
                    stream_66.add(string_literal46);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:113:11: 'go'
                    {
                    string_literal47=(Token)match(input,67,FOLLOW_67_in_flyCommand487);  
                    stream_67.add(string_literal47);


                    }
                    break;

            }

            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:113:17: ( flyCommandValue )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=To && LA18_0<=With)||(LA18_0>=FloatingPointLiteral && LA18_0<=HexLiteral)||(LA18_0>=101 && LA18_0<=117)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:113:17: flyCommandValue
            	    {
            	    pushFollow(FOLLOW_flyCommandValue_in_flyCommand490);
            	    flyCommandValue48=flyCommandValue();

            	    state._fsp--;

            	    stream_flyCommandValue.add(flyCommandValue48.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);



            // AST REWRITE
            // elements: flyCommandValue
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 114:2: -> ^( FLY ( flyCommandValue )* )
            {
                // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:114:5: ^( FLY ( flyCommandValue )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FLY, "FLY"), root_1);

                // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:114:11: ( flyCommandValue )*
                while ( stream_flyCommandValue.hasNext() ) {
                    adaptor.addChild(root_1, stream_flyCommandValue.nextTree());

                }
                stream_flyCommandValue.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "flyCommand"

    public static class flyCommandValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "flyCommandValue"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:117:1: flyCommandValue : ( distance | To waypoint ( ( 'and' | ',' ( 'and' )? ) waypoint )* -> ( waypoint )+ | altitude );
    public final flipsParser.flyCommandValue_return flyCommandValue() throws RecognitionException {
        flipsParser.flyCommandValue_return retval = new flipsParser.flyCommandValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token To50=null;
        Token string_literal52=null;
        Token char_literal53=null;
        Token string_literal54=null;
        flipsParser.distance_return distance49 = null;

        flipsParser.waypoint_return waypoint51 = null;

        flipsParser.waypoint_return waypoint55 = null;

        flipsParser.altitude_return altitude56 = null;


        CommonTree To50_tree=null;
        CommonTree string_literal52_tree=null;
        CommonTree char_literal53_tree=null;
        CommonTree string_literal54_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_To=new RewriteRuleTokenStream(adaptor,"token To");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleSubtreeStream stream_waypoint=new RewriteRuleSubtreeStream(adaptor,"rule waypoint");
        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:118:2: ( distance | To waypoint ( ( 'and' | ',' ( 'and' )? ) waypoint )* -> ( waypoint )+ | altitude )
            int alt22=3;
            switch ( input.LA(1) ) {
            case FloatingPointLiteral:
            case BinaryLiteral:
            case OctalLiteral:
            case DecimalLiteral:
            case HexLiteral:
            case 112:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
                {
                alt22=1;
                }
                break;
            case To:
                {
                switch ( input.LA(2) ) {
                case BinaryLiteral:
                case OctalLiteral:
                case DecimalLiteral:
                case HexLiteral:
                    {
                    int LA22_4 = input.LA(3);

                    if ( ((LA22_4>=FloatingPointLiteral && LA22_4<=HexLiteral)||LA22_4==60||(LA22_4>=93 && LA22_4<=96)||LA22_4==108||(LA22_4>=118 && LA22_4<=121)||(LA22_4>=123 && LA22_4<=128)) ) {
                        alt22=2;
                    }
                    else if ( ((LA22_4>=75 && LA22_4<=92)) ) {
                        alt22=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case FloatingPointLiteral:
                    {
                    int LA22_5 = input.LA(3);

                    if ( ((LA22_5>=FloatingPointLiteral && LA22_5<=HexLiteral)||LA22_5==60||(LA22_5>=93 && LA22_5<=96)||(LA22_5>=118 && LA22_5<=121)||(LA22_5>=123 && LA22_5<=128)) ) {
                        alt22=2;
                    }
                    else if ( ((LA22_5>=75 && LA22_5<=92)) ) {
                        alt22=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case Identifier:
                case 61:
                case 127:
                case 128:
                    {
                    alt22=2;
                    }
                    break;
                case FlightLevel:
                case 68:
                case 69:
                case 70:
                case 71:
                case 72:
                case 73:
                    {
                    alt22=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 2, input);

                    throw nvae;
                }

                }
                break;
            case At:
            case With:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
            case 110:
            case 111:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:118:4: distance
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_distance_in_flyCommandValue512);
                    distance49=distance();

                    state._fsp--;

                    adaptor.addChild(root_0, distance49.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:119:4: To waypoint ( ( 'and' | ',' ( 'and' )? ) waypoint )*
                    {
                    To50=(Token)match(input,To,FOLLOW_To_in_flyCommandValue517);  
                    stream_To.add(To50);

                    pushFollow(FOLLOW_waypoint_in_flyCommandValue519);
                    waypoint51=waypoint();

                    state._fsp--;

                    stream_waypoint.add(waypoint51.getTree());
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:119:16: ( ( 'and' | ',' ( 'and' )? ) waypoint )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( ((LA21_0>=59 && LA21_0<=60)) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:119:17: ( 'and' | ',' ( 'and' )? ) waypoint
                    	    {
                    	    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:119:17: ( 'and' | ',' ( 'and' )? )
                    	    int alt20=2;
                    	    int LA20_0 = input.LA(1);

                    	    if ( (LA20_0==59) ) {
                    	        alt20=1;
                    	    }
                    	    else if ( (LA20_0==60) ) {
                    	        alt20=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 20, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt20) {
                    	        case 1 :
                    	            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:119:18: 'and'
                    	            {
                    	            string_literal52=(Token)match(input,59,FOLLOW_59_in_flyCommandValue523);  
                    	            stream_59.add(string_literal52);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:119:24: ',' ( 'and' )?
                    	            {
                    	            char_literal53=(Token)match(input,60,FOLLOW_60_in_flyCommandValue525);  
                    	            stream_60.add(char_literal53);

                    	            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:119:28: ( 'and' )?
                    	            int alt19=2;
                    	            int LA19_0 = input.LA(1);

                    	            if ( (LA19_0==59) ) {
                    	                alt19=1;
                    	            }
                    	            switch (alt19) {
                    	                case 1 :
                    	                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:119:28: 'and'
                    	                    {
                    	                    string_literal54=(Token)match(input,59,FOLLOW_59_in_flyCommandValue527);  
                    	                    stream_59.add(string_literal54);


                    	                    }
                    	                    break;

                    	            }


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_waypoint_in_flyCommandValue531);
                    	    waypoint55=waypoint();

                    	    state._fsp--;

                    	    stream_waypoint.add(waypoint55.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: waypoint
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 120:2: -> ( waypoint )+
                    {
                        if ( !(stream_waypoint.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_waypoint.hasNext() ) {
                            adaptor.addChild(root_0, stream_waypoint.nextTree());

                        }
                        stream_waypoint.reset();

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:121:4: altitude
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_altitude_in_flyCommandValue544);
                    altitude56=altitude();

                    state._fsp--;

                    adaptor.addChild(root_0, altitude56.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "flyCommandValue"

    public static class executeCommand_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "executeCommand"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:124:1: executeCommand : ( Identifier -> ^( EXECUTE Identifier ) | Identifier '(' numericValue ( ',' numericValue )* ')' -> ^( EXECUTE Identifier ( ^( PARAMETER numericValue ) )+ ) );
    public final flipsParser.executeCommand_return executeCommand() throws RecognitionException {
        flipsParser.executeCommand_return retval = new flipsParser.executeCommand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier57=null;
        Token Identifier58=null;
        Token char_literal59=null;
        Token char_literal61=null;
        Token char_literal63=null;
        flipsParser.numericValue_return numericValue60 = null;

        flipsParser.numericValue_return numericValue62 = null;


        CommonTree Identifier57_tree=null;
        CommonTree Identifier58_tree=null;
        CommonTree char_literal59_tree=null;
        CommonTree char_literal61_tree=null;
        CommonTree char_literal63_tree=null;
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleSubtreeStream stream_numericValue=new RewriteRuleSubtreeStream(adaptor,"rule numericValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:125:2: ( Identifier -> ^( EXECUTE Identifier ) | Identifier '(' numericValue ( ',' numericValue )* ')' -> ^( EXECUTE Identifier ( ^( PARAMETER numericValue ) )+ ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==Identifier) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==61) ) {
                    alt24=2;
                }
                else if ( (LA24_1==EOF||LA24_1==Identifier||(LA24_1>=66 && LA24_1<=67)) ) {
                    alt24=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:125:4: Identifier
                    {
                    Identifier57=(Token)match(input,Identifier,FOLLOW_Identifier_in_executeCommand555);  
                    stream_Identifier.add(Identifier57);



                    // AST REWRITE
                    // elements: Identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 126:2: -> ^( EXECUTE Identifier )
                    {
                        // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:126:5: ^( EXECUTE Identifier )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXECUTE, "EXECUTE"), root_1);

                        adaptor.addChild(root_1, stream_Identifier.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:127:4: Identifier '(' numericValue ( ',' numericValue )* ')'
                    {
                    Identifier58=(Token)match(input,Identifier,FOLLOW_Identifier_in_executeCommand569);  
                    stream_Identifier.add(Identifier58);

                    char_literal59=(Token)match(input,61,FOLLOW_61_in_executeCommand571);  
                    stream_61.add(char_literal59);

                    pushFollow(FOLLOW_numericValue_in_executeCommand573);
                    numericValue60=numericValue();

                    state._fsp--;

                    stream_numericValue.add(numericValue60.getTree());
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:127:32: ( ',' numericValue )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==60) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:127:33: ',' numericValue
                    	    {
                    	    char_literal61=(Token)match(input,60,FOLLOW_60_in_executeCommand576);  
                    	    stream_60.add(char_literal61);

                    	    pushFollow(FOLLOW_numericValue_in_executeCommand578);
                    	    numericValue62=numericValue();

                    	    state._fsp--;

                    	    stream_numericValue.add(numericValue62.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    char_literal63=(Token)match(input,62,FOLLOW_62_in_executeCommand583);  
                    stream_62.add(char_literal63);



                    // AST REWRITE
                    // elements: numericValue, Identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 128:2: -> ^( EXECUTE Identifier ( ^( PARAMETER numericValue ) )+ )
                    {
                        // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:128:5: ^( EXECUTE Identifier ( ^( PARAMETER numericValue ) )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXECUTE, "EXECUTE"), root_1);

                        adaptor.addChild(root_1, stream_Identifier.nextNode());
                        if ( !(stream_numericValue.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_numericValue.hasNext() ) {
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:128:26: ^( PARAMETER numericValue )
                            {
                            CommonTree root_2 = (CommonTree)adaptor.nil();
                            root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAMETER, "PARAMETER"), root_2);

                            adaptor.addChild(root_2, stream_numericValue.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_numericValue.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "executeCommand"

    public static class altitude_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "altitude"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:133:1: altitude : ( fixedAltitude | relativeAltitude );
    public final flipsParser.altitude_return altitude() throws RecognitionException {
        flipsParser.altitude_return retval = new flipsParser.altitude_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.fixedAltitude_return fixedAltitude64 = null;

        flipsParser.relativeAltitude_return relativeAltitude65 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:134:2: ( fixedAltitude | relativeAltitude )
            int alt25=2;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:134:4: fixedAltitude
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_fixedAltitude_in_altitude612);
                    fixedAltitude64=fixedAltitude();

                    state._fsp--;

                    adaptor.addChild(root_0, fixedAltitude64.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:135:4: relativeAltitude
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_relativeAltitude_in_altitude617);
                    relativeAltitude65=relativeAltitude();

                    state._fsp--;

                    adaptor.addChild(root_0, relativeAltitude65.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "altitude"

    public static class fixedAltitude_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fixedAltitude"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:138:1: fixedAltitude : ( ( upDownDirection )? To | At | With ) ( ( ( 'an' )? ( 'alt' | 'altitude' ) | ( 'a' )? ( 'pres' | 'pressure' ) ) ( 'of' )? )? altitudeValue -> ^( ALTITUDE FIXED altitudeValue ) ;
    public final flipsParser.fixedAltitude_return fixedAltitude() throws RecognitionException {
        flipsParser.fixedAltitude_return retval = new flipsParser.fixedAltitude_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token To67=null;
        Token At68=null;
        Token With69=null;
        Token string_literal70=null;
        Token string_literal71=null;
        Token string_literal72=null;
        Token char_literal73=null;
        Token string_literal74=null;
        Token string_literal75=null;
        Token string_literal76=null;
        flipsParser.upDownDirection_return upDownDirection66 = null;

        flipsParser.altitudeValue_return altitudeValue77 = null;


        CommonTree To67_tree=null;
        CommonTree At68_tree=null;
        CommonTree With69_tree=null;
        CommonTree string_literal70_tree=null;
        CommonTree string_literal71_tree=null;
        CommonTree string_literal72_tree=null;
        CommonTree char_literal73_tree=null;
        CommonTree string_literal74_tree=null;
        CommonTree string_literal75_tree=null;
        CommonTree string_literal76_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_At=new RewriteRuleTokenStream(adaptor,"token At");
        RewriteRuleTokenStream stream_To=new RewriteRuleTokenStream(adaptor,"token To");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleTokenStream stream_With=new RewriteRuleTokenStream(adaptor,"token With");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleSubtreeStream stream_altitudeValue=new RewriteRuleSubtreeStream(adaptor,"rule altitudeValue");
        RewriteRuleSubtreeStream stream_upDownDirection=new RewriteRuleSubtreeStream(adaptor,"rule upDownDirection");
        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:139:2: ( ( ( upDownDirection )? To | At | With ) ( ( ( 'an' )? ( 'alt' | 'altitude' ) | ( 'a' )? ( 'pres' | 'pressure' ) ) ( 'of' )? )? altitudeValue -> ^( ALTITUDE FIXED altitudeValue ) )
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:139:4: ( ( upDownDirection )? To | At | With ) ( ( ( 'an' )? ( 'alt' | 'altitude' ) | ( 'a' )? ( 'pres' | 'pressure' ) ) ( 'of' )? )? altitudeValue
            {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:139:4: ( ( upDownDirection )? To | At | With )
            int alt27=3;
            switch ( input.LA(1) ) {
            case To:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
            case 110:
            case 111:
                {
                alt27=1;
                }
                break;
            case At:
                {
                alt27=2;
                }
                break;
            case With:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:139:5: ( upDownDirection )? To
                    {
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:139:5: ( upDownDirection )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( ((LA26_0>=101 && LA26_0<=111)) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:139:5: upDownDirection
                            {
                            pushFollow(FOLLOW_upDownDirection_in_fixedAltitude629);
                            upDownDirection66=upDownDirection();

                            state._fsp--;

                            stream_upDownDirection.add(upDownDirection66.getTree());

                            }
                            break;

                    }

                    To67=(Token)match(input,To,FOLLOW_To_in_fixedAltitude632);  
                    stream_To.add(To67);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:139:25: At
                    {
                    At68=(Token)match(input,At,FOLLOW_At_in_fixedAltitude634);  
                    stream_At.add(At68);


                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:139:28: With
                    {
                    With69=(Token)match(input,With,FOLLOW_With_in_fixedAltitude636);  
                    stream_With.add(With69);


                    }
                    break;

            }

            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:139:34: ( ( ( 'an' )? ( 'alt' | 'altitude' ) | ( 'a' )? ( 'pres' | 'pressure' ) ) ( 'of' )? )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=68 && LA34_0<=73)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:139:35: ( ( 'an' )? ( 'alt' | 'altitude' ) | ( 'a' )? ( 'pres' | 'pressure' ) ) ( 'of' )?
                    {
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:139:35: ( ( 'an' )? ( 'alt' | 'altitude' ) | ( 'a' )? ( 'pres' | 'pressure' ) )
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( ((LA32_0>=68 && LA32_0<=70)) ) {
                        alt32=1;
                    }
                    else if ( ((LA32_0>=71 && LA32_0<=73)) ) {
                        alt32=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 0, input);

                        throw nvae;
                    }
                    switch (alt32) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:139:36: ( 'an' )? ( 'alt' | 'altitude' )
                            {
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:139:36: ( 'an' )?
                            int alt28=2;
                            int LA28_0 = input.LA(1);

                            if ( (LA28_0==68) ) {
                                alt28=1;
                            }
                            switch (alt28) {
                                case 1 :
                                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:139:36: 'an'
                                    {
                                    string_literal70=(Token)match(input,68,FOLLOW_68_in_fixedAltitude641);  
                                    stream_68.add(string_literal70);


                                    }
                                    break;

                            }

                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:139:42: ( 'alt' | 'altitude' )
                            int alt29=2;
                            int LA29_0 = input.LA(1);

                            if ( (LA29_0==69) ) {
                                alt29=1;
                            }
                            else if ( (LA29_0==70) ) {
                                alt29=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 29, 0, input);

                                throw nvae;
                            }
                            switch (alt29) {
                                case 1 :
                                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:139:43: 'alt'
                                    {
                                    string_literal71=(Token)match(input,69,FOLLOW_69_in_fixedAltitude645);  
                                    stream_69.add(string_literal71);


                                    }
                                    break;
                                case 2 :
                                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:139:49: 'altitude'
                                    {
                                    string_literal72=(Token)match(input,70,FOLLOW_70_in_fixedAltitude647);  
                                    stream_70.add(string_literal72);


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:139:61: ( 'a' )? ( 'pres' | 'pressure' )
                            {
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:139:61: ( 'a' )?
                            int alt30=2;
                            int LA30_0 = input.LA(1);

                            if ( (LA30_0==71) ) {
                                alt30=1;
                            }
                            switch (alt30) {
                                case 1 :
                                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:139:61: 'a'
                                    {
                                    char_literal73=(Token)match(input,71,FOLLOW_71_in_fixedAltitude650);  
                                    stream_71.add(char_literal73);


                                    }
                                    break;

                            }

                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:139:66: ( 'pres' | 'pressure' )
                            int alt31=2;
                            int LA31_0 = input.LA(1);

                            if ( (LA31_0==72) ) {
                                alt31=1;
                            }
                            else if ( (LA31_0==73) ) {
                                alt31=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 31, 0, input);

                                throw nvae;
                            }
                            switch (alt31) {
                                case 1 :
                                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:139:67: 'pres'
                                    {
                                    string_literal74=(Token)match(input,72,FOLLOW_72_in_fixedAltitude654);  
                                    stream_72.add(string_literal74);


                                    }
                                    break;
                                case 2 :
                                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:139:74: 'pressure'
                                    {
                                    string_literal75=(Token)match(input,73,FOLLOW_73_in_fixedAltitude656);  
                                    stream_73.add(string_literal75);


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:139:87: ( 'of' )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==74) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:139:87: 'of'
                            {
                            string_literal76=(Token)match(input,74,FOLLOW_74_in_fixedAltitude660);  
                            stream_74.add(string_literal76);


                            }
                            break;

                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_altitudeValue_in_fixedAltitude665);
            altitudeValue77=altitudeValue();

            state._fsp--;

            stream_altitudeValue.add(altitudeValue77.getTree());


            // AST REWRITE
            // elements: altitudeValue
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 140:2: -> ^( ALTITUDE FIXED altitudeValue )
            {
                // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:140:5: ^( ALTITUDE FIXED altitudeValue )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ALTITUDE, "ALTITUDE"), root_1);

                adaptor.addChild(root_1, (CommonTree)adaptor.create(FIXED, "FIXED"));
                adaptor.addChild(root_1, stream_altitudeValue.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fixedAltitude"

    public static class relativeAltitude_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relativeAltitude"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:143:1: relativeAltitude : upDownDirection altitudeValue -> ^( ALTITUDE RELATIVE upDownDirection altitudeValue ) ;
    public final flipsParser.relativeAltitude_return relativeAltitude() throws RecognitionException {
        flipsParser.relativeAltitude_return retval = new flipsParser.relativeAltitude_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.upDownDirection_return upDownDirection78 = null;

        flipsParser.altitudeValue_return altitudeValue79 = null;


        RewriteRuleSubtreeStream stream_altitudeValue=new RewriteRuleSubtreeStream(adaptor,"rule altitudeValue");
        RewriteRuleSubtreeStream stream_upDownDirection=new RewriteRuleSubtreeStream(adaptor,"rule upDownDirection");
        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:144:2: ( upDownDirection altitudeValue -> ^( ALTITUDE RELATIVE upDownDirection altitudeValue ) )
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:144:4: upDownDirection altitudeValue
            {
            pushFollow(FOLLOW_upDownDirection_in_relativeAltitude687);
            upDownDirection78=upDownDirection();

            state._fsp--;

            stream_upDownDirection.add(upDownDirection78.getTree());
            pushFollow(FOLLOW_altitudeValue_in_relativeAltitude689);
            altitudeValue79=altitudeValue();

            state._fsp--;

            stream_altitudeValue.add(altitudeValue79.getTree());


            // AST REWRITE
            // elements: altitudeValue, upDownDirection
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 145:2: -> ^( ALTITUDE RELATIVE upDownDirection altitudeValue )
            {
                // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:145:5: ^( ALTITUDE RELATIVE upDownDirection altitudeValue )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ALTITUDE, "ALTITUDE"), root_1);

                adaptor.addChild(root_1, (CommonTree)adaptor.create(RELATIVE, "RELATIVE"));
                adaptor.addChild(root_1, stream_upDownDirection.nextTree());
                adaptor.addChild(root_1, stream_altitudeValue.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "relativeAltitude"

    public static class altitudeValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "altitudeValue"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:148:1: altitudeValue : ( distanceValue -> DISTANCE distanceValue | FlightLevel -> FLIGHTLEVEL FlightLevel );
    public final flipsParser.altitudeValue_return altitudeValue() throws RecognitionException {
        flipsParser.altitudeValue_return retval = new flipsParser.altitudeValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FlightLevel81=null;
        flipsParser.distanceValue_return distanceValue80 = null;


        CommonTree FlightLevel81_tree=null;
        RewriteRuleTokenStream stream_FlightLevel=new RewriteRuleTokenStream(adaptor,"token FlightLevel");
        RewriteRuleSubtreeStream stream_distanceValue=new RewriteRuleSubtreeStream(adaptor,"rule distanceValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:149:2: ( distanceValue -> DISTANCE distanceValue | FlightLevel -> FLIGHTLEVEL FlightLevel )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=FloatingPointLiteral && LA35_0<=HexLiteral)) ) {
                alt35=1;
            }
            else if ( (LA35_0==FlightLevel) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:149:4: distanceValue
                    {
                    pushFollow(FOLLOW_distanceValue_in_altitudeValue713);
                    distanceValue80=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(distanceValue80.getTree());


                    // AST REWRITE
                    // elements: distanceValue
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 150:2: -> DISTANCE distanceValue
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(DISTANCE, "DISTANCE"));
                        adaptor.addChild(root_0, stream_distanceValue.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:151:4: FlightLevel
                    {
                    FlightLevel81=(Token)match(input,FlightLevel,FOLLOW_FlightLevel_in_altitudeValue725);  
                    stream_FlightLevel.add(FlightLevel81);



                    // AST REWRITE
                    // elements: FlightLevel
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 152:2: -> FLIGHTLEVEL FlightLevel
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(FLIGHTLEVEL, "FLIGHTLEVEL"));
                        adaptor.addChild(root_0, stream_FlightLevel.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "altitudeValue"

    public static class distance_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "distance"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:157:1: distance : ( leftRightDirection )? distanceValue -> ^( DISTANCE ( leftRightDirection )? distanceValue ) ;
    public final flipsParser.distance_return distance() throws RecognitionException {
        flipsParser.distance_return retval = new flipsParser.distance_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.leftRightDirection_return leftRightDirection82 = null;

        flipsParser.distanceValue_return distanceValue83 = null;


        RewriteRuleSubtreeStream stream_leftRightDirection=new RewriteRuleSubtreeStream(adaptor,"rule leftRightDirection");
        RewriteRuleSubtreeStream stream_distanceValue=new RewriteRuleSubtreeStream(adaptor,"rule distanceValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:158:2: ( ( leftRightDirection )? distanceValue -> ^( DISTANCE ( leftRightDirection )? distanceValue ) )
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:158:4: ( leftRightDirection )? distanceValue
            {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:158:4: ( leftRightDirection )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=112 && LA36_0<=117)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:158:4: leftRightDirection
                    {
                    pushFollow(FOLLOW_leftRightDirection_in_distance745);
                    leftRightDirection82=leftRightDirection();

                    state._fsp--;

                    stream_leftRightDirection.add(leftRightDirection82.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_distanceValue_in_distance748);
            distanceValue83=distanceValue();

            state._fsp--;

            stream_distanceValue.add(distanceValue83.getTree());


            // AST REWRITE
            // elements: leftRightDirection, distanceValue
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 159:2: -> ^( DISTANCE ( leftRightDirection )? distanceValue )
            {
                // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:159:5: ^( DISTANCE ( leftRightDirection )? distanceValue )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DISTANCE, "DISTANCE"), root_1);

                // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:159:16: ( leftRightDirection )?
                if ( stream_leftRightDirection.hasNext() ) {
                    adaptor.addChild(root_1, stream_leftRightDirection.nextTree());

                }
                stream_leftRightDirection.reset();
                adaptor.addChild(root_1, stream_distanceValue.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "distance"

    public static class distanceValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "distanceValue"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:162:1: distanceValue : numericValue distanceUnit ;
    public final flipsParser.distanceValue_return distanceValue() throws RecognitionException {
        flipsParser.distanceValue_return retval = new flipsParser.distanceValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.numericValue_return numericValue84 = null;

        flipsParser.distanceUnit_return distanceUnit85 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:163:2: ( numericValue distanceUnit )
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:163:4: numericValue distanceUnit
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_numericValue_in_distanceValue771);
            numericValue84=numericValue();

            state._fsp--;

            adaptor.addChild(root_0, numericValue84.getTree());
            pushFollow(FOLLOW_distanceUnit_in_distanceValue773);
            distanceUnit85=distanceUnit();

            state._fsp--;

            adaptor.addChild(root_0, distanceUnit85.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "distanceValue"

    public static class distanceUnit_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "distanceUnit"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:166:1: distanceUnit : ( ( 'km' | 'kilometer' | 'kilometers' ) -> KILOMETER | ( 'm' | 'meter' | 'meters' ) -> METER | ( 'nm' | 'nautical' ( 'mi' | 'mile' | 'miles' ) ) -> NAUTICAL MILE | ( 'statute' )? ( 'mi' | 'mile' | 'miles' ) -> MILE | ( 'yd' | 'yard' | 'yards' ) -> YARD | ( 'ft' | 'foot' | 'feet' ) -> FOOT );
    public final flipsParser.distanceUnit_return distanceUnit() throws RecognitionException {
        flipsParser.distanceUnit_return retval = new flipsParser.distanceUnit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal86=null;
        Token string_literal87=null;
        Token string_literal88=null;
        Token char_literal89=null;
        Token string_literal90=null;
        Token string_literal91=null;
        Token string_literal92=null;
        Token string_literal93=null;
        Token string_literal94=null;
        Token string_literal95=null;
        Token string_literal96=null;
        Token string_literal97=null;
        Token string_literal98=null;
        Token string_literal99=null;
        Token string_literal100=null;
        Token string_literal101=null;
        Token string_literal102=null;
        Token string_literal103=null;
        Token string_literal104=null;
        Token string_literal105=null;
        Token string_literal106=null;

        CommonTree string_literal86_tree=null;
        CommonTree string_literal87_tree=null;
        CommonTree string_literal88_tree=null;
        CommonTree char_literal89_tree=null;
        CommonTree string_literal90_tree=null;
        CommonTree string_literal91_tree=null;
        CommonTree string_literal92_tree=null;
        CommonTree string_literal93_tree=null;
        CommonTree string_literal94_tree=null;
        CommonTree string_literal95_tree=null;
        CommonTree string_literal96_tree=null;
        CommonTree string_literal97_tree=null;
        CommonTree string_literal98_tree=null;
        CommonTree string_literal99_tree=null;
        CommonTree string_literal100_tree=null;
        CommonTree string_literal101_tree=null;
        CommonTree string_literal102_tree=null;
        CommonTree string_literal103_tree=null;
        CommonTree string_literal104_tree=null;
        CommonTree string_literal105_tree=null;
        CommonTree string_literal106_tree=null;
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
        RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");

        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:167:2: ( ( 'km' | 'kilometer' | 'kilometers' ) -> KILOMETER | ( 'm' | 'meter' | 'meters' ) -> METER | ( 'nm' | 'nautical' ( 'mi' | 'mile' | 'miles' ) ) -> NAUTICAL MILE | ( 'statute' )? ( 'mi' | 'mile' | 'miles' ) -> MILE | ( 'yd' | 'yard' | 'yards' ) -> YARD | ( 'ft' | 'foot' | 'feet' ) -> FOOT )
            int alt45=6;
            switch ( input.LA(1) ) {
            case 75:
            case 76:
            case 77:
                {
                alt45=1;
                }
                break;
            case 78:
            case 79:
            case 80:
                {
                alt45=2;
                }
                break;
            case 81:
            case 82:
                {
                alt45=3;
                }
                break;
            case 83:
            case 84:
            case 85:
            case 86:
                {
                alt45=4;
                }
                break;
            case 87:
            case 88:
            case 89:
                {
                alt45=5;
                }
                break;
            case 90:
            case 91:
            case 92:
                {
                alt45=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:167:4: ( 'km' | 'kilometer' | 'kilometers' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:167:4: ( 'km' | 'kilometer' | 'kilometers' )
                    int alt37=3;
                    switch ( input.LA(1) ) {
                    case 75:
                        {
                        alt37=1;
                        }
                        break;
                    case 76:
                        {
                        alt37=2;
                        }
                        break;
                    case 77:
                        {
                        alt37=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 0, input);

                        throw nvae;
                    }

                    switch (alt37) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:167:5: 'km'
                            {
                            string_literal86=(Token)match(input,75,FOLLOW_75_in_distanceUnit785);  
                            stream_75.add(string_literal86);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:167:10: 'kilometer'
                            {
                            string_literal87=(Token)match(input,76,FOLLOW_76_in_distanceUnit787);  
                            stream_76.add(string_literal87);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:167:22: 'kilometers'
                            {
                            string_literal88=(Token)match(input,77,FOLLOW_77_in_distanceUnit789);  
                            stream_77.add(string_literal88);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 168:2: -> KILOMETER
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(KILOMETER, "KILOMETER"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:169:4: ( 'm' | 'meter' | 'meters' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:169:4: ( 'm' | 'meter' | 'meters' )
                    int alt38=3;
                    switch ( input.LA(1) ) {
                    case 78:
                        {
                        alt38=1;
                        }
                        break;
                    case 79:
                        {
                        alt38=2;
                        }
                        break;
                    case 80:
                        {
                        alt38=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 0, input);

                        throw nvae;
                    }

                    switch (alt38) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:169:5: 'm'
                            {
                            char_literal89=(Token)match(input,78,FOLLOW_78_in_distanceUnit801);  
                            stream_78.add(char_literal89);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:169:9: 'meter'
                            {
                            string_literal90=(Token)match(input,79,FOLLOW_79_in_distanceUnit803);  
                            stream_79.add(string_literal90);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:169:17: 'meters'
                            {
                            string_literal91=(Token)match(input,80,FOLLOW_80_in_distanceUnit805);  
                            stream_80.add(string_literal91);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 170:2: -> METER
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(METER, "METER"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:171:4: ( 'nm' | 'nautical' ( 'mi' | 'mile' | 'miles' ) )
                    {
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:171:4: ( 'nm' | 'nautical' ( 'mi' | 'mile' | 'miles' ) )
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==81) ) {
                        alt40=1;
                    }
                    else if ( (LA40_0==82) ) {
                        alt40=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 0, input);

                        throw nvae;
                    }
                    switch (alt40) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:171:5: 'nm'
                            {
                            string_literal92=(Token)match(input,81,FOLLOW_81_in_distanceUnit817);  
                            stream_81.add(string_literal92);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:171:10: 'nautical' ( 'mi' | 'mile' | 'miles' )
                            {
                            string_literal93=(Token)match(input,82,FOLLOW_82_in_distanceUnit819);  
                            stream_82.add(string_literal93);

                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:171:21: ( 'mi' | 'mile' | 'miles' )
                            int alt39=3;
                            switch ( input.LA(1) ) {
                            case 83:
                                {
                                alt39=1;
                                }
                                break;
                            case 84:
                                {
                                alt39=2;
                                }
                                break;
                            case 85:
                                {
                                alt39=3;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 39, 0, input);

                                throw nvae;
                            }

                            switch (alt39) {
                                case 1 :
                                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:171:22: 'mi'
                                    {
                                    string_literal94=(Token)match(input,83,FOLLOW_83_in_distanceUnit822);  
                                    stream_83.add(string_literal94);


                                    }
                                    break;
                                case 2 :
                                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:171:27: 'mile'
                                    {
                                    string_literal95=(Token)match(input,84,FOLLOW_84_in_distanceUnit824);  
                                    stream_84.add(string_literal95);


                                    }
                                    break;
                                case 3 :
                                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:171:34: 'miles'
                                    {
                                    string_literal96=(Token)match(input,85,FOLLOW_85_in_distanceUnit826);  
                                    stream_85.add(string_literal96);


                                    }
                                    break;

                            }


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 172:2: -> NAUTICAL MILE
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NAUTICAL, "NAUTICAL"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MILE, "MILE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:173:4: ( 'statute' )? ( 'mi' | 'mile' | 'miles' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:173:4: ( 'statute' )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==86) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:173:5: 'statute'
                            {
                            string_literal97=(Token)match(input,86,FOLLOW_86_in_distanceUnit841);  
                            stream_86.add(string_literal97);


                            }
                            break;

                    }

                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:173:17: ( 'mi' | 'mile' | 'miles' )
                    int alt42=3;
                    switch ( input.LA(1) ) {
                    case 83:
                        {
                        alt42=1;
                        }
                        break;
                    case 84:
                        {
                        alt42=2;
                        }
                        break;
                    case 85:
                        {
                        alt42=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 0, input);

                        throw nvae;
                    }

                    switch (alt42) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:173:18: 'mi'
                            {
                            string_literal98=(Token)match(input,83,FOLLOW_83_in_distanceUnit846);  
                            stream_83.add(string_literal98);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:173:23: 'mile'
                            {
                            string_literal99=(Token)match(input,84,FOLLOW_84_in_distanceUnit848);  
                            stream_84.add(string_literal99);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:173:30: 'miles'
                            {
                            string_literal100=(Token)match(input,85,FOLLOW_85_in_distanceUnit850);  
                            stream_85.add(string_literal100);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 174:2: -> MILE
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MILE, "MILE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:175:4: ( 'yd' | 'yard' | 'yards' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:175:4: ( 'yd' | 'yard' | 'yards' )
                    int alt43=3;
                    switch ( input.LA(1) ) {
                    case 87:
                        {
                        alt43=1;
                        }
                        break;
                    case 88:
                        {
                        alt43=2;
                        }
                        break;
                    case 89:
                        {
                        alt43=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 0, input);

                        throw nvae;
                    }

                    switch (alt43) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:175:5: 'yd'
                            {
                            string_literal101=(Token)match(input,87,FOLLOW_87_in_distanceUnit862);  
                            stream_87.add(string_literal101);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:175:10: 'yard'
                            {
                            string_literal102=(Token)match(input,88,FOLLOW_88_in_distanceUnit864);  
                            stream_88.add(string_literal102);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:175:17: 'yards'
                            {
                            string_literal103=(Token)match(input,89,FOLLOW_89_in_distanceUnit866);  
                            stream_89.add(string_literal103);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 176:2: -> YARD
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(YARD, "YARD"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:177:4: ( 'ft' | 'foot' | 'feet' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:177:4: ( 'ft' | 'foot' | 'feet' )
                    int alt44=3;
                    switch ( input.LA(1) ) {
                    case 90:
                        {
                        alt44=1;
                        }
                        break;
                    case 91:
                        {
                        alt44=2;
                        }
                        break;
                    case 92:
                        {
                        alt44=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 44, 0, input);

                        throw nvae;
                    }

                    switch (alt44) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:177:5: 'ft'
                            {
                            string_literal104=(Token)match(input,90,FOLLOW_90_in_distanceUnit878);  
                            stream_90.add(string_literal104);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:177:10: 'foot'
                            {
                            string_literal105=(Token)match(input,91,FOLLOW_91_in_distanceUnit880);  
                            stream_91.add(string_literal105);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:177:17: 'feet'
                            {
                            string_literal106=(Token)match(input,92,FOLLOW_92_in_distanceUnit882);  
                            stream_92.add(string_literal106);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 178:2: -> FOOT
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(FOOT, "FOOT"));

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "distanceUnit"

    public static class northSouthDirection_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "northSouthDirection"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:181:1: northSouthDirection : ( ( 'n' | 'north' ) -> NORTH | ( 's' | 'south' ) -> SOUTH );
    public final flipsParser.northSouthDirection_return northSouthDirection() throws RecognitionException {
        flipsParser.northSouthDirection_return retval = new flipsParser.northSouthDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal107=null;
        Token string_literal108=null;
        Token char_literal109=null;
        Token string_literal110=null;

        CommonTree char_literal107_tree=null;
        CommonTree string_literal108_tree=null;
        CommonTree char_literal109_tree=null;
        CommonTree string_literal110_tree=null;
        RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
        RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
        RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");

        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:182:2: ( ( 'n' | 'north' ) -> NORTH | ( 's' | 'south' ) -> SOUTH )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=93 && LA48_0<=94)) ) {
                alt48=1;
            }
            else if ( ((LA48_0>=95 && LA48_0<=96)) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:182:4: ( 'n' | 'north' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:182:4: ( 'n' | 'north' )
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==93) ) {
                        alt46=1;
                    }
                    else if ( (LA46_0==94) ) {
                        alt46=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 46, 0, input);

                        throw nvae;
                    }
                    switch (alt46) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:182:5: 'n'
                            {
                            char_literal107=(Token)match(input,93,FOLLOW_93_in_northSouthDirection900);  
                            stream_93.add(char_literal107);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:182:9: 'north'
                            {
                            string_literal108=(Token)match(input,94,FOLLOW_94_in_northSouthDirection902);  
                            stream_94.add(string_literal108);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 183:2: -> NORTH
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NORTH, "NORTH"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:184:4: ( 's' | 'south' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:184:4: ( 's' | 'south' )
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==95) ) {
                        alt47=1;
                    }
                    else if ( (LA47_0==96) ) {
                        alt47=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 47, 0, input);

                        throw nvae;
                    }
                    switch (alt47) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:184:5: 's'
                            {
                            char_literal109=(Token)match(input,95,FOLLOW_95_in_northSouthDirection914);  
                            stream_95.add(char_literal109);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:184:9: 'south'
                            {
                            string_literal110=(Token)match(input,96,FOLLOW_96_in_northSouthDirection916);  
                            stream_96.add(string_literal110);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 185:2: -> SOUTH
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "northSouthDirection"

    public static class eastWestDirection_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "eastWestDirection"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:188:1: eastWestDirection : ( ( 'e' | 'east' ) -> EAST | ( 'w' | 'west' ) -> WEST );
    public final flipsParser.eastWestDirection_return eastWestDirection() throws RecognitionException {
        flipsParser.eastWestDirection_return retval = new flipsParser.eastWestDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal111=null;
        Token string_literal112=null;
        Token char_literal113=null;
        Token string_literal114=null;

        CommonTree char_literal111_tree=null;
        CommonTree string_literal112_tree=null;
        CommonTree char_literal113_tree=null;
        CommonTree string_literal114_tree=null;
        RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
        RewriteRuleTokenStream stream_97=new RewriteRuleTokenStream(adaptor,"token 97");
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");

        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:189:2: ( ( 'e' | 'east' ) -> EAST | ( 'w' | 'west' ) -> WEST )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=97 && LA51_0<=98)) ) {
                alt51=1;
            }
            else if ( ((LA51_0>=99 && LA51_0<=100)) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:189:4: ( 'e' | 'east' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:189:4: ( 'e' | 'east' )
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==97) ) {
                        alt49=1;
                    }
                    else if ( (LA49_0==98) ) {
                        alt49=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 49, 0, input);

                        throw nvae;
                    }
                    switch (alt49) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:189:5: 'e'
                            {
                            char_literal111=(Token)match(input,97,FOLLOW_97_in_eastWestDirection934);  
                            stream_97.add(char_literal111);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:189:9: 'east'
                            {
                            string_literal112=(Token)match(input,98,FOLLOW_98_in_eastWestDirection936);  
                            stream_98.add(string_literal112);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 190:2: -> EAST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:191:4: ( 'w' | 'west' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:191:4: ( 'w' | 'west' )
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==99) ) {
                        alt50=1;
                    }
                    else if ( (LA50_0==100) ) {
                        alt50=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 50, 0, input);

                        throw nvae;
                    }
                    switch (alt50) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:191:5: 'w'
                            {
                            char_literal113=(Token)match(input,99,FOLLOW_99_in_eastWestDirection948);  
                            stream_99.add(char_literal113);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:191:9: 'west'
                            {
                            string_literal114=(Token)match(input,100,FOLLOW_100_in_eastWestDirection950);  
                            stream_100.add(string_literal114);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 192:2: -> WEST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(WEST, "WEST"));

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "eastWestDirection"

    public static class upDownDirection_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "upDownDirection"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:195:1: upDownDirection : ( ( 'u' | 'up' | 'c' | 'climb' | 'climbing' | 'ascend' | 'ascending' ) -> CLIMB | ( 'd' | 'down' | 'descend' | 'descending' ) -> DESCEND );
    public final flipsParser.upDownDirection_return upDownDirection() throws RecognitionException {
        flipsParser.upDownDirection_return retval = new flipsParser.upDownDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal115=null;
        Token string_literal116=null;
        Token char_literal117=null;
        Token string_literal118=null;
        Token string_literal119=null;
        Token string_literal120=null;
        Token string_literal121=null;
        Token char_literal122=null;
        Token string_literal123=null;
        Token string_literal124=null;
        Token string_literal125=null;

        CommonTree char_literal115_tree=null;
        CommonTree string_literal116_tree=null;
        CommonTree char_literal117_tree=null;
        CommonTree string_literal118_tree=null;
        CommonTree string_literal119_tree=null;
        CommonTree string_literal120_tree=null;
        CommonTree string_literal121_tree=null;
        CommonTree char_literal122_tree=null;
        CommonTree string_literal123_tree=null;
        CommonTree string_literal124_tree=null;
        CommonTree string_literal125_tree=null;
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");

        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:196:2: ( ( 'u' | 'up' | 'c' | 'climb' | 'climbing' | 'ascend' | 'ascending' ) -> CLIMB | ( 'd' | 'down' | 'descend' | 'descending' ) -> DESCEND )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=101 && LA54_0<=107)) ) {
                alt54=1;
            }
            else if ( ((LA54_0>=108 && LA54_0<=111)) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:196:4: ( 'u' | 'up' | 'c' | 'climb' | 'climbing' | 'ascend' | 'ascending' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:196:4: ( 'u' | 'up' | 'c' | 'climb' | 'climbing' | 'ascend' | 'ascending' )
                    int alt52=7;
                    switch ( input.LA(1) ) {
                    case 101:
                        {
                        alt52=1;
                        }
                        break;
                    case 102:
                        {
                        alt52=2;
                        }
                        break;
                    case 103:
                        {
                        alt52=3;
                        }
                        break;
                    case 104:
                        {
                        alt52=4;
                        }
                        break;
                    case 105:
                        {
                        alt52=5;
                        }
                        break;
                    case 106:
                        {
                        alt52=6;
                        }
                        break;
                    case 107:
                        {
                        alt52=7;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 52, 0, input);

                        throw nvae;
                    }

                    switch (alt52) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:196:5: 'u'
                            {
                            char_literal115=(Token)match(input,101,FOLLOW_101_in_upDownDirection968);  
                            stream_101.add(char_literal115);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:196:9: 'up'
                            {
                            string_literal116=(Token)match(input,102,FOLLOW_102_in_upDownDirection970);  
                            stream_102.add(string_literal116);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:196:14: 'c'
                            {
                            char_literal117=(Token)match(input,103,FOLLOW_103_in_upDownDirection972);  
                            stream_103.add(char_literal117);


                            }
                            break;
                        case 4 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:196:18: 'climb'
                            {
                            string_literal118=(Token)match(input,104,FOLLOW_104_in_upDownDirection974);  
                            stream_104.add(string_literal118);


                            }
                            break;
                        case 5 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:196:26: 'climbing'
                            {
                            string_literal119=(Token)match(input,105,FOLLOW_105_in_upDownDirection976);  
                            stream_105.add(string_literal119);


                            }
                            break;
                        case 6 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:196:37: 'ascend'
                            {
                            string_literal120=(Token)match(input,106,FOLLOW_106_in_upDownDirection978);  
                            stream_106.add(string_literal120);


                            }
                            break;
                        case 7 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:196:46: 'ascending'
                            {
                            string_literal121=(Token)match(input,107,FOLLOW_107_in_upDownDirection980);  
                            stream_107.add(string_literal121);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 197:2: -> CLIMB
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(CLIMB, "CLIMB"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:198:4: ( 'd' | 'down' | 'descend' | 'descending' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:198:4: ( 'd' | 'down' | 'descend' | 'descending' )
                    int alt53=4;
                    switch ( input.LA(1) ) {
                    case 108:
                        {
                        alt53=1;
                        }
                        break;
                    case 109:
                        {
                        alt53=2;
                        }
                        break;
                    case 110:
                        {
                        alt53=3;
                        }
                        break;
                    case 111:
                        {
                        alt53=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 53, 0, input);

                        throw nvae;
                    }

                    switch (alt53) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:198:5: 'd'
                            {
                            char_literal122=(Token)match(input,108,FOLLOW_108_in_upDownDirection992);  
                            stream_108.add(char_literal122);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:198:9: 'down'
                            {
                            string_literal123=(Token)match(input,109,FOLLOW_109_in_upDownDirection994);  
                            stream_109.add(string_literal123);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:198:16: 'descend'
                            {
                            string_literal124=(Token)match(input,110,FOLLOW_110_in_upDownDirection996);  
                            stream_110.add(string_literal124);


                            }
                            break;
                        case 4 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:198:26: 'descending'
                            {
                            string_literal125=(Token)match(input,111,FOLLOW_111_in_upDownDirection998);  
                            stream_111.add(string_literal125);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 199:2: -> DESCEND
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(DESCEND, "DESCEND"));

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "upDownDirection"

    public static class leftRightDirection_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "leftRightDirection"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:202:1: leftRightDirection : ( ( 'l' | 'left' | 'port' ) -> LEFT | ( 'r' | 'right' | 'starboard' ) -> RIGHT );
    public final flipsParser.leftRightDirection_return leftRightDirection() throws RecognitionException {
        flipsParser.leftRightDirection_return retval = new flipsParser.leftRightDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal126=null;
        Token string_literal127=null;
        Token string_literal128=null;
        Token char_literal129=null;
        Token string_literal130=null;
        Token string_literal131=null;

        CommonTree char_literal126_tree=null;
        CommonTree string_literal127_tree=null;
        CommonTree string_literal128_tree=null;
        CommonTree char_literal129_tree=null;
        CommonTree string_literal130_tree=null;
        CommonTree string_literal131_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");

        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:203:2: ( ( 'l' | 'left' | 'port' ) -> LEFT | ( 'r' | 'right' | 'starboard' ) -> RIGHT )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=112 && LA57_0<=114)) ) {
                alt57=1;
            }
            else if ( ((LA57_0>=115 && LA57_0<=117)) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:203:4: ( 'l' | 'left' | 'port' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:203:4: ( 'l' | 'left' | 'port' )
                    int alt55=3;
                    switch ( input.LA(1) ) {
                    case 112:
                        {
                        alt55=1;
                        }
                        break;
                    case 113:
                        {
                        alt55=2;
                        }
                        break;
                    case 114:
                        {
                        alt55=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 55, 0, input);

                        throw nvae;
                    }

                    switch (alt55) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:203:5: 'l'
                            {
                            char_literal126=(Token)match(input,112,FOLLOW_112_in_leftRightDirection1016);  
                            stream_112.add(char_literal126);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:203:9: 'left'
                            {
                            string_literal127=(Token)match(input,113,FOLLOW_113_in_leftRightDirection1018);  
                            stream_113.add(string_literal127);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:203:16: 'port'
                            {
                            string_literal128=(Token)match(input,114,FOLLOW_114_in_leftRightDirection1020);  
                            stream_114.add(string_literal128);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 204:2: -> LEFT
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(LEFT, "LEFT"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:205:4: ( 'r' | 'right' | 'starboard' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:205:4: ( 'r' | 'right' | 'starboard' )
                    int alt56=3;
                    switch ( input.LA(1) ) {
                    case 115:
                        {
                        alt56=1;
                        }
                        break;
                    case 116:
                        {
                        alt56=2;
                        }
                        break;
                    case 117:
                        {
                        alt56=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 56, 0, input);

                        throw nvae;
                    }

                    switch (alt56) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:205:5: 'r'
                            {
                            char_literal129=(Token)match(input,115,FOLLOW_115_in_leftRightDirection1032);  
                            stream_115.add(char_literal129);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:205:9: 'right'
                            {
                            string_literal130=(Token)match(input,116,FOLLOW_116_in_leftRightDirection1034);  
                            stream_116.add(string_literal130);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:205:17: 'starboard'
                            {
                            string_literal131=(Token)match(input,117,FOLLOW_117_in_leftRightDirection1036);  
                            stream_117.add(string_literal131);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 206:2: -> RIGHT
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(RIGHT, "RIGHT"));

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "leftRightDirection"

    public static class angularValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "angularValue"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:209:1: angularValue : ( numericValue ( 'deg' | 'degs' | 'degree' | 'degrees' ) -> numericValue DEGREE | integerValue 'd' numericValue '\\'' -> integerValue DEGREE numericValue MINUTE | numericValue ( 'rad' | 'rads' | 'radian' | 'radians' ) -> numericValue RADIAN );
    public final flipsParser.angularValue_return angularValue() throws RecognitionException {
        flipsParser.angularValue_return retval = new flipsParser.angularValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal133=null;
        Token string_literal134=null;
        Token string_literal135=null;
        Token string_literal136=null;
        Token char_literal138=null;
        Token char_literal140=null;
        Token string_literal142=null;
        Token string_literal143=null;
        Token string_literal144=null;
        Token string_literal145=null;
        flipsParser.numericValue_return numericValue132 = null;

        flipsParser.integerValue_return integerValue137 = null;

        flipsParser.numericValue_return numericValue139 = null;

        flipsParser.numericValue_return numericValue141 = null;


        CommonTree string_literal133_tree=null;
        CommonTree string_literal134_tree=null;
        CommonTree string_literal135_tree=null;
        CommonTree string_literal136_tree=null;
        CommonTree char_literal138_tree=null;
        CommonTree char_literal140_tree=null;
        CommonTree string_literal142_tree=null;
        CommonTree string_literal143_tree=null;
        CommonTree string_literal144_tree=null;
        CommonTree string_literal145_tree=null;
        RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_121=new RewriteRuleTokenStream(adaptor,"token 121");
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleTokenStream stream_124=new RewriteRuleTokenStream(adaptor,"token 124");
        RewriteRuleTokenStream stream_120=new RewriteRuleTokenStream(adaptor,"token 120");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");
        RewriteRuleSubtreeStream stream_integerValue=new RewriteRuleSubtreeStream(adaptor,"rule integerValue");
        RewriteRuleSubtreeStream stream_numericValue=new RewriteRuleSubtreeStream(adaptor,"rule numericValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:210:2: ( numericValue ( 'deg' | 'degs' | 'degree' | 'degrees' ) -> numericValue DEGREE | integerValue 'd' numericValue '\\'' -> integerValue DEGREE numericValue MINUTE | numericValue ( 'rad' | 'rads' | 'radian' | 'radians' ) -> numericValue RADIAN )
            int alt60=3;
            int LA60_0 = input.LA(1);

            if ( ((LA60_0>=BinaryLiteral && LA60_0<=HexLiteral)) ) {
                switch ( input.LA(2) ) {
                case 108:
                    {
                    alt60=2;
                    }
                    break;
                case 118:
                case 119:
                case 120:
                case 121:
                    {
                    alt60=1;
                    }
                    break;
                case 123:
                case 124:
                case 125:
                case 126:
                    {
                    alt60=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 60, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA60_0==FloatingPointLiteral) ) {
                int LA60_2 = input.LA(2);

                if ( ((LA60_2>=123 && LA60_2<=126)) ) {
                    alt60=3;
                }
                else if ( ((LA60_2>=118 && LA60_2<=121)) ) {
                    alt60=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 60, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:210:4: numericValue ( 'deg' | 'degs' | 'degree' | 'degrees' )
                    {
                    pushFollow(FOLLOW_numericValue_in_angularValue1053);
                    numericValue132=numericValue();

                    state._fsp--;

                    stream_numericValue.add(numericValue132.getTree());
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:210:17: ( 'deg' | 'degs' | 'degree' | 'degrees' )
                    int alt58=4;
                    switch ( input.LA(1) ) {
                    case 118:
                        {
                        alt58=1;
                        }
                        break;
                    case 119:
                        {
                        alt58=2;
                        }
                        break;
                    case 120:
                        {
                        alt58=3;
                        }
                        break;
                    case 121:
                        {
                        alt58=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 58, 0, input);

                        throw nvae;
                    }

                    switch (alt58) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:210:18: 'deg'
                            {
                            string_literal133=(Token)match(input,118,FOLLOW_118_in_angularValue1056);  
                            stream_118.add(string_literal133);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:210:24: 'degs'
                            {
                            string_literal134=(Token)match(input,119,FOLLOW_119_in_angularValue1058);  
                            stream_119.add(string_literal134);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:210:31: 'degree'
                            {
                            string_literal135=(Token)match(input,120,FOLLOW_120_in_angularValue1060);  
                            stream_120.add(string_literal135);


                            }
                            break;
                        case 4 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:210:40: 'degrees'
                            {
                            string_literal136=(Token)match(input,121,FOLLOW_121_in_angularValue1062);  
                            stream_121.add(string_literal136);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: numericValue
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 211:2: -> numericValue DEGREE
                    {
                        adaptor.addChild(root_0, stream_numericValue.nextTree());
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(DEGREE, "DEGREE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:212:4: integerValue 'd' numericValue '\\''
                    {
                    pushFollow(FOLLOW_integerValue_in_angularValue1075);
                    integerValue137=integerValue();

                    state._fsp--;

                    stream_integerValue.add(integerValue137.getTree());
                    char_literal138=(Token)match(input,108,FOLLOW_108_in_angularValue1077);  
                    stream_108.add(char_literal138);

                    pushFollow(FOLLOW_numericValue_in_angularValue1079);
                    numericValue139=numericValue();

                    state._fsp--;

                    stream_numericValue.add(numericValue139.getTree());
                    char_literal140=(Token)match(input,122,FOLLOW_122_in_angularValue1081);  
                    stream_122.add(char_literal140);



                    // AST REWRITE
                    // elements: integerValue, numericValue
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 213:2: -> integerValue DEGREE numericValue MINUTE
                    {
                        adaptor.addChild(root_0, stream_integerValue.nextTree());
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(DEGREE, "DEGREE"));
                        adaptor.addChild(root_0, stream_numericValue.nextTree());
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MINUTE, "MINUTE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:214:4: numericValue ( 'rad' | 'rads' | 'radian' | 'radians' )
                    {
                    pushFollow(FOLLOW_numericValue_in_angularValue1097);
                    numericValue141=numericValue();

                    state._fsp--;

                    stream_numericValue.add(numericValue141.getTree());
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:214:17: ( 'rad' | 'rads' | 'radian' | 'radians' )
                    int alt59=4;
                    switch ( input.LA(1) ) {
                    case 123:
                        {
                        alt59=1;
                        }
                        break;
                    case 124:
                        {
                        alt59=2;
                        }
                        break;
                    case 125:
                        {
                        alt59=3;
                        }
                        break;
                    case 126:
                        {
                        alt59=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 59, 0, input);

                        throw nvae;
                    }

                    switch (alt59) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:214:18: 'rad'
                            {
                            string_literal142=(Token)match(input,123,FOLLOW_123_in_angularValue1100);  
                            stream_123.add(string_literal142);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:214:24: 'rads'
                            {
                            string_literal143=(Token)match(input,124,FOLLOW_124_in_angularValue1102);  
                            stream_124.add(string_literal143);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:214:31: 'radian'
                            {
                            string_literal144=(Token)match(input,125,FOLLOW_125_in_angularValue1104);  
                            stream_125.add(string_literal144);


                            }
                            break;
                        case 4 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:214:40: 'radians'
                            {
                            string_literal145=(Token)match(input,126,FOLLOW_126_in_angularValue1106);  
                            stream_126.add(string_literal145);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: numericValue
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 215:2: -> numericValue RADIAN
                    {
                        adaptor.addChild(root_0, stream_numericValue.nextTree());
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(RADIAN, "RADIAN"));

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "angularValue"

    public static class waypoint_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "waypoint"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:220:1: waypoint : ( geoCoordinate | Identifier -> ^( WAYPOINT Identifier ) );
    public final flipsParser.waypoint_return waypoint() throws RecognitionException {
        flipsParser.waypoint_return retval = new flipsParser.waypoint_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier147=null;
        flipsParser.geoCoordinate_return geoCoordinate146 = null;


        CommonTree Identifier147_tree=null;
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:221:2: ( geoCoordinate | Identifier -> ^( WAYPOINT Identifier ) )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( ((LA61_0>=FloatingPointLiteral && LA61_0<=HexLiteral)||LA61_0==61||(LA61_0>=127 && LA61_0<=128)) ) {
                alt61=1;
            }
            else if ( (LA61_0==Identifier) ) {
                alt61=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:221:4: geoCoordinate
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_geoCoordinate_in_waypoint1127);
                    geoCoordinate146=geoCoordinate();

                    state._fsp--;

                    adaptor.addChild(root_0, geoCoordinate146.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:222:4: Identifier
                    {
                    Identifier147=(Token)match(input,Identifier,FOLLOW_Identifier_in_waypoint1132);  
                    stream_Identifier.add(Identifier147);



                    // AST REWRITE
                    // elements: Identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 223:2: -> ^( WAYPOINT Identifier )
                    {
                        // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:223:5: ^( WAYPOINT Identifier )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(WAYPOINT, "WAYPOINT"), root_1);

                        adaptor.addChild(root_1, stream_Identifier.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "waypoint"

    public static class geoCoordinate_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "geoCoordinate"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:226:1: geoCoordinate : ( latitudeLongitude -> ^( GEOCOORDINATE latitudeLongitude ) | distanceCoordinate -> ^( GEOCOORDINATE distanceCoordinate ) );
    public final flipsParser.geoCoordinate_return geoCoordinate() throws RecognitionException {
        flipsParser.geoCoordinate_return retval = new flipsParser.geoCoordinate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.latitudeLongitude_return latitudeLongitude148 = null;

        flipsParser.distanceCoordinate_return distanceCoordinate149 = null;


        RewriteRuleSubtreeStream stream_distanceCoordinate=new RewriteRuleSubtreeStream(adaptor,"rule distanceCoordinate");
        RewriteRuleSubtreeStream stream_latitudeLongitude=new RewriteRuleSubtreeStream(adaptor,"rule latitudeLongitude");
        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:227:2: ( latitudeLongitude -> ^( GEOCOORDINATE latitudeLongitude ) | distanceCoordinate -> ^( GEOCOORDINATE distanceCoordinate ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( ((LA62_0>=FloatingPointLiteral && LA62_0<=HexLiteral)||(LA62_0>=127 && LA62_0<=128)) ) {
                alt62=1;
            }
            else if ( (LA62_0==61) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:227:4: latitudeLongitude
                    {
                    pushFollow(FOLLOW_latitudeLongitude_in_geoCoordinate1152);
                    latitudeLongitude148=latitudeLongitude();

                    state._fsp--;

                    stream_latitudeLongitude.add(latitudeLongitude148.getTree());


                    // AST REWRITE
                    // elements: latitudeLongitude
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 228:2: -> ^( GEOCOORDINATE latitudeLongitude )
                    {
                        // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:228:5: ^( GEOCOORDINATE latitudeLongitude )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GEOCOORDINATE, "GEOCOORDINATE"), root_1);

                        adaptor.addChild(root_1, stream_latitudeLongitude.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:229:4: distanceCoordinate
                    {
                    pushFollow(FOLLOW_distanceCoordinate_in_geoCoordinate1166);
                    distanceCoordinate149=distanceCoordinate();

                    state._fsp--;

                    stream_distanceCoordinate.add(distanceCoordinate149.getTree());


                    // AST REWRITE
                    // elements: distanceCoordinate
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 230:2: -> ^( GEOCOORDINATE distanceCoordinate )
                    {
                        // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:230:5: ^( GEOCOORDINATE distanceCoordinate )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GEOCOORDINATE, "GEOCOORDINATE"), root_1);

                        adaptor.addChild(root_1, stream_distanceCoordinate.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "geoCoordinate"

    public static class latitudeLongitude_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "latitudeLongitude"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:233:1: latitudeLongitude : (x= latitudeLongitudeValue northSouthDirection ( ',' )? y= latitudeLongitudeValue eastWestDirection -> ^( LATITUDE $x northSouthDirection ) ^( LONGITUDE $y eastWestDirection ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y EAST ) | '-' x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y EAST ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y WEST ) | '-' x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y WEST ) );
    public final flipsParser.latitudeLongitude_return latitudeLongitude() throws RecognitionException {
        flipsParser.latitudeLongitude_return retval = new flipsParser.latitudeLongitude_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal151=null;
        Token char_literal153=null;
        Token char_literal154=null;
        Token char_literal155=null;
        Token char_literal156=null;
        Token char_literal157=null;
        Token char_literal158=null;
        Token char_literal159=null;
        Token char_literal160=null;
        Token char_literal161=null;
        Token char_literal162=null;
        Token char_literal163=null;
        Token char_literal164=null;
        flipsParser.latitudeLongitudeValue_return x = null;

        flipsParser.latitudeLongitudeValue_return y = null;

        flipsParser.northSouthDirection_return northSouthDirection150 = null;

        flipsParser.eastWestDirection_return eastWestDirection152 = null;


        CommonTree char_literal151_tree=null;
        CommonTree char_literal153_tree=null;
        CommonTree char_literal154_tree=null;
        CommonTree char_literal155_tree=null;
        CommonTree char_literal156_tree=null;
        CommonTree char_literal157_tree=null;
        CommonTree char_literal158_tree=null;
        CommonTree char_literal159_tree=null;
        CommonTree char_literal160_tree=null;
        CommonTree char_literal161_tree=null;
        CommonTree char_literal162_tree=null;
        CommonTree char_literal163_tree=null;
        CommonTree char_literal164_tree=null;
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleSubtreeStream stream_latitudeLongitudeValue=new RewriteRuleSubtreeStream(adaptor,"rule latitudeLongitudeValue");
        RewriteRuleSubtreeStream stream_eastWestDirection=new RewriteRuleSubtreeStream(adaptor,"rule eastWestDirection");
        RewriteRuleSubtreeStream stream_northSouthDirection=new RewriteRuleSubtreeStream(adaptor,"rule northSouthDirection");
        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:234:2: (x= latitudeLongitudeValue northSouthDirection ( ',' )? y= latitudeLongitudeValue eastWestDirection -> ^( LATITUDE $x northSouthDirection ) ^( LONGITUDE $y eastWestDirection ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y EAST ) | '-' x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y EAST ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y WEST ) | '-' x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y WEST ) )
            int alt72=5;
            alt72 = dfa72.predict(input);
            switch (alt72) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:234:4: x= latitudeLongitudeValue northSouthDirection ( ',' )? y= latitudeLongitudeValue eastWestDirection
                    {
                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude1188);
                    x=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(x.getTree());
                    pushFollow(FOLLOW_northSouthDirection_in_latitudeLongitude1190);
                    northSouthDirection150=northSouthDirection();

                    state._fsp--;

                    stream_northSouthDirection.add(northSouthDirection150.getTree());
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:234:49: ( ',' )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==60) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:234:49: ','
                            {
                            char_literal151=(Token)match(input,60,FOLLOW_60_in_latitudeLongitude1192);  
                            stream_60.add(char_literal151);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude1197);
                    y=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(y.getTree());
                    pushFollow(FOLLOW_eastWestDirection_in_latitudeLongitude1199);
                    eastWestDirection152=eastWestDirection();

                    state._fsp--;

                    stream_eastWestDirection.add(eastWestDirection152.getTree());


                    // AST REWRITE
                    // elements: eastWestDirection, x, northSouthDirection, y
                    // token labels: 
                    // rule labels: retval, y, x
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 235:2: -> ^( LATITUDE $x northSouthDirection ) ^( LONGITUDE $y eastWestDirection )
                    {
                        // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:235:5: ^( LATITUDE $x northSouthDirection )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LATITUDE, "LATITUDE"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, stream_northSouthDirection.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }
                        // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:235:40: ^( LONGITUDE $y eastWestDirection )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LONGITUDE, "LONGITUDE"), root_1);

                        adaptor.addChild(root_1, stream_y.nextTree());
                        adaptor.addChild(root_1, stream_eastWestDirection.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:236:4: ( '+' )? x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue
                    {
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:236:4: ( '+' )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==127) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:236:4: '+'
                            {
                            char_literal153=(Token)match(input,127,FOLLOW_127_in_latitudeLongitude1225);  
                            stream_127.add(char_literal153);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude1230);
                    x=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(x.getTree());
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:236:34: ( ',' )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==60) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:236:34: ','
                            {
                            char_literal154=(Token)match(input,60,FOLLOW_60_in_latitudeLongitude1232);  
                            stream_60.add(char_literal154);


                            }
                            break;

                    }

                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:236:39: ( '+' )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==127) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:236:39: '+'
                            {
                            char_literal155=(Token)match(input,127,FOLLOW_127_in_latitudeLongitude1235);  
                            stream_127.add(char_literal155);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude1240);
                    y=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(y.getTree());


                    // AST REWRITE
                    // elements: y, x
                    // token labels: 
                    // rule labels: retval, y, x
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 237:2: -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y EAST )
                    {
                        // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:237:5: ^( LATITUDE $x NORTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LATITUDE, "LATITUDE"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NORTH, "NORTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:237:26: ^( LONGITUDE $y EAST )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LONGITUDE, "LONGITUDE"), root_1);

                        adaptor.addChild(root_1, stream_y.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(EAST, "EAST"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:238:4: '-' x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue
                    {
                    char_literal156=(Token)match(input,128,FOLLOW_128_in_latitudeLongitude1266);  
                    stream_128.add(char_literal156);

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude1270);
                    x=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(x.getTree());
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:238:33: ( ',' )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==60) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:238:33: ','
                            {
                            char_literal157=(Token)match(input,60,FOLLOW_60_in_latitudeLongitude1272);  
                            stream_60.add(char_literal157);


                            }
                            break;

                    }

                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:238:38: ( '+' )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==127) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:238:38: '+'
                            {
                            char_literal158=(Token)match(input,127,FOLLOW_127_in_latitudeLongitude1275);  
                            stream_127.add(char_literal158);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude1280);
                    y=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(y.getTree());


                    // AST REWRITE
                    // elements: y, x
                    // token labels: 
                    // rule labels: retval, y, x
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 239:2: -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y EAST )
                    {
                        // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:239:5: ^( LATITUDE $x SOUTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LATITUDE, "LATITUDE"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(SOUTH, "SOUTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:239:26: ^( LONGITUDE $y EAST )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LONGITUDE, "LONGITUDE"), root_1);

                        adaptor.addChild(root_1, stream_y.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(EAST, "EAST"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:240:4: ( '+' )? x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue
                    {
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:240:4: ( '+' )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==127) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:240:4: '+'
                            {
                            char_literal159=(Token)match(input,127,FOLLOW_127_in_latitudeLongitude1306);  
                            stream_127.add(char_literal159);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude1311);
                    x=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(x.getTree());
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:240:34: ( ',' )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==60) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:240:34: ','
                            {
                            char_literal160=(Token)match(input,60,FOLLOW_60_in_latitudeLongitude1313);  
                            stream_60.add(char_literal160);


                            }
                            break;

                    }

                    char_literal161=(Token)match(input,128,FOLLOW_128_in_latitudeLongitude1316);  
                    stream_128.add(char_literal161);

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude1320);
                    y=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(y.getTree());


                    // AST REWRITE
                    // elements: y, x
                    // token labels: 
                    // rule labels: retval, y, x
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 241:2: -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y WEST )
                    {
                        // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:241:5: ^( LATITUDE $x NORTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LATITUDE, "LATITUDE"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NORTH, "NORTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:241:26: ^( LONGITUDE $y WEST )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LONGITUDE, "LONGITUDE"), root_1);

                        adaptor.addChild(root_1, stream_y.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(WEST, "WEST"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:242:4: '-' x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue
                    {
                    char_literal162=(Token)match(input,128,FOLLOW_128_in_latitudeLongitude1346);  
                    stream_128.add(char_literal162);

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude1350);
                    x=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(x.getTree());
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:242:33: ( ',' )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==60) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:242:33: ','
                            {
                            char_literal163=(Token)match(input,60,FOLLOW_60_in_latitudeLongitude1352);  
                            stream_60.add(char_literal163);


                            }
                            break;

                    }

                    char_literal164=(Token)match(input,128,FOLLOW_128_in_latitudeLongitude1355);  
                    stream_128.add(char_literal164);

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude1359);
                    y=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(y.getTree());


                    // AST REWRITE
                    // elements: y, x
                    // token labels: 
                    // rule labels: retval, y, x
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 243:2: -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y WEST )
                    {
                        // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:243:5: ^( LATITUDE $x SOUTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LATITUDE, "LATITUDE"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(SOUTH, "SOUTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:243:26: ^( LONGITUDE $y WEST )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LONGITUDE, "LONGITUDE"), root_1);

                        adaptor.addChild(root_1, stream_y.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(WEST, "WEST"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "latitudeLongitude"

    public static class latitudeLongitudeValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "latitudeLongitudeValue"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:246:1: latitudeLongitudeValue : ( numericValue -> numericValue DEGREE | angularValue );
    public final flipsParser.latitudeLongitudeValue_return latitudeLongitudeValue() throws RecognitionException {
        flipsParser.latitudeLongitudeValue_return retval = new flipsParser.latitudeLongitudeValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.numericValue_return numericValue165 = null;

        flipsParser.angularValue_return angularValue166 = null;


        RewriteRuleSubtreeStream stream_numericValue=new RewriteRuleSubtreeStream(adaptor,"rule numericValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:247:2: ( numericValue -> numericValue DEGREE | angularValue )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( ((LA73_0>=BinaryLiteral && LA73_0<=HexLiteral)) ) {
                switch ( input.LA(2) ) {
                case 118:
                case 119:
                case 120:
                case 121:
                case 123:
                case 124:
                case 125:
                case 126:
                    {
                    alt73=2;
                    }
                    break;
                case EOF:
                case Identifier:
                case To:
                case At:
                case With:
                case FloatingPointLiteral:
                case BinaryLiteral:
                case OctalLiteral:
                case DecimalLiteral:
                case HexLiteral:
                case 55:
                case 56:
                case 57:
                case 59:
                case 60:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 93:
                case 94:
                case 95:
                case 96:
                case 97:
                case 98:
                case 99:
                case 100:
                case 101:
                case 102:
                case 103:
                case 104:
                case 105:
                case 106:
                case 107:
                case 109:
                case 110:
                case 111:
                case 112:
                case 113:
                case 114:
                case 115:
                case 116:
                case 117:
                case 127:
                case 128:
                    {
                    alt73=1;
                    }
                    break;
                case 108:
                    {
                    switch ( input.LA(3) ) {
                    case To:
                    case FlightLevel:
                        {
                        alt73=1;
                        }
                        break;
                    case BinaryLiteral:
                    case OctalLiteral:
                    case DecimalLiteral:
                    case HexLiteral:
                        {
                        int LA73_6 = input.LA(4);

                        if ( (LA73_6==122) ) {
                            alt73=2;
                        }
                        else if ( ((LA73_6>=75 && LA73_6<=92)) ) {
                            alt73=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 73, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    case FloatingPointLiteral:
                        {
                        int LA73_7 = input.LA(4);

                        if ( ((LA73_7>=75 && LA73_7<=92)) ) {
                            alt73=1;
                        }
                        else if ( (LA73_7==122) ) {
                            alt73=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 73, 7, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 73, 5, input);

                        throw nvae;
                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 73, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA73_0==FloatingPointLiteral) ) {
                int LA73_2 = input.LA(2);

                if ( ((LA73_2>=118 && LA73_2<=121)||(LA73_2>=123 && LA73_2<=126)) ) {
                    alt73=2;
                }
                else if ( (LA73_2==EOF||(LA73_2>=Identifier && LA73_2<=With)||(LA73_2>=FloatingPointLiteral && LA73_2<=HexLiteral)||(LA73_2>=55 && LA73_2<=57)||(LA73_2>=59 && LA73_2<=60)||(LA73_2>=63 && LA73_2<=67)||(LA73_2>=93 && LA73_2<=117)||(LA73_2>=127 && LA73_2<=128)) ) {
                    alt73=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 73, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:247:4: numericValue
                    {
                    pushFollow(FOLLOW_numericValue_in_latitudeLongitudeValue1391);
                    numericValue165=numericValue();

                    state._fsp--;

                    stream_numericValue.add(numericValue165.getTree());


                    // AST REWRITE
                    // elements: numericValue
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 248:2: -> numericValue DEGREE
                    {
                        adaptor.addChild(root_0, stream_numericValue.nextTree());
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(DEGREE, "DEGREE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:249:4: angularValue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_angularValue_in_latitudeLongitudeValue1403);
                    angularValue166=angularValue();

                    state._fsp--;

                    adaptor.addChild(root_0, angularValue166.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "latitudeLongitudeValue"

    public static class distanceCoordinate_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "distanceCoordinate"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:252:1: distanceCoordinate : ( '(' ( '+' )? x= distanceValue ',' ( '+' )? y= distanceValue ')' -> ^( DISTANCE $y NORTH ) ^( DISTANCE $x EAST ) | '(' '-' x= distanceValue ',' ( '+' )? y= distanceValue ')' -> ^( DISTANCE $y NORTH ) ^( DISTANCE $x WEST ) | '(' ( '+' )? x= distanceValue ',' '-' y= distanceValue ')' -> ^( DISTANCE $y SOUTH ) ^( DISTANCE $x EAST ) | '(' '-' x= distanceValue ',' '-' y= distanceValue ')' -> ^( DISTANCE $y SOUTH ) ^( DISTANCE $x WEST ) );
    public final flipsParser.distanceCoordinate_return distanceCoordinate() throws RecognitionException {
        flipsParser.distanceCoordinate_return retval = new flipsParser.distanceCoordinate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal167=null;
        Token char_literal168=null;
        Token char_literal169=null;
        Token char_literal170=null;
        Token char_literal171=null;
        Token char_literal172=null;
        Token char_literal173=null;
        Token char_literal174=null;
        Token char_literal175=null;
        Token char_literal176=null;
        Token char_literal177=null;
        Token char_literal178=null;
        Token char_literal179=null;
        Token char_literal180=null;
        Token char_literal181=null;
        Token char_literal182=null;
        Token char_literal183=null;
        Token char_literal184=null;
        Token char_literal185=null;
        Token char_literal186=null;
        flipsParser.distanceValue_return x = null;

        flipsParser.distanceValue_return y = null;


        CommonTree char_literal167_tree=null;
        CommonTree char_literal168_tree=null;
        CommonTree char_literal169_tree=null;
        CommonTree char_literal170_tree=null;
        CommonTree char_literal171_tree=null;
        CommonTree char_literal172_tree=null;
        CommonTree char_literal173_tree=null;
        CommonTree char_literal174_tree=null;
        CommonTree char_literal175_tree=null;
        CommonTree char_literal176_tree=null;
        CommonTree char_literal177_tree=null;
        CommonTree char_literal178_tree=null;
        CommonTree char_literal179_tree=null;
        CommonTree char_literal180_tree=null;
        CommonTree char_literal181_tree=null;
        CommonTree char_literal182_tree=null;
        CommonTree char_literal183_tree=null;
        CommonTree char_literal184_tree=null;
        CommonTree char_literal185_tree=null;
        CommonTree char_literal186_tree=null;
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleSubtreeStream stream_distanceValue=new RewriteRuleSubtreeStream(adaptor,"rule distanceValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:253:2: ( '(' ( '+' )? x= distanceValue ',' ( '+' )? y= distanceValue ')' -> ^( DISTANCE $y NORTH ) ^( DISTANCE $x EAST ) | '(' '-' x= distanceValue ',' ( '+' )? y= distanceValue ')' -> ^( DISTANCE $y NORTH ) ^( DISTANCE $x WEST ) | '(' ( '+' )? x= distanceValue ',' '-' y= distanceValue ')' -> ^( DISTANCE $y SOUTH ) ^( DISTANCE $x EAST ) | '(' '-' x= distanceValue ',' '-' y= distanceValue ')' -> ^( DISTANCE $y SOUTH ) ^( DISTANCE $x WEST ) )
            int alt78=4;
            alt78 = dfa78.predict(input);
            switch (alt78) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:253:4: '(' ( '+' )? x= distanceValue ',' ( '+' )? y= distanceValue ')'
                    {
                    char_literal167=(Token)match(input,61,FOLLOW_61_in_distanceCoordinate1414);  
                    stream_61.add(char_literal167);

                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:253:8: ( '+' )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==127) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:253:8: '+'
                            {
                            char_literal168=(Token)match(input,127,FOLLOW_127_in_distanceCoordinate1416);  
                            stream_127.add(char_literal168);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_distanceValue_in_distanceCoordinate1421);
                    x=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(x.getTree());
                    char_literal169=(Token)match(input,60,FOLLOW_60_in_distanceCoordinate1423);  
                    stream_60.add(char_literal169);

                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:253:33: ( '+' )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==127) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:253:33: '+'
                            {
                            char_literal170=(Token)match(input,127,FOLLOW_127_in_distanceCoordinate1425);  
                            stream_127.add(char_literal170);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_distanceValue_in_distanceCoordinate1430);
                    y=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(y.getTree());
                    char_literal171=(Token)match(input,62,FOLLOW_62_in_distanceCoordinate1432);  
                    stream_62.add(char_literal171);



                    // AST REWRITE
                    // elements: x, y
                    // token labels: 
                    // rule labels: retval, y, x
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 254:2: -> ^( DISTANCE $y NORTH ) ^( DISTANCE $x EAST )
                    {
                        // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:254:5: ^( DISTANCE $y NORTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DISTANCE, "DISTANCE"), root_1);

                        adaptor.addChild(root_1, stream_y.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NORTH, "NORTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:254:26: ^( DISTANCE $x EAST )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DISTANCE, "DISTANCE"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(EAST, "EAST"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:255:4: '(' '-' x= distanceValue ',' ( '+' )? y= distanceValue ')'
                    {
                    char_literal172=(Token)match(input,61,FOLLOW_61_in_distanceCoordinate1458);  
                    stream_61.add(char_literal172);

                    char_literal173=(Token)match(input,128,FOLLOW_128_in_distanceCoordinate1460);  
                    stream_128.add(char_literal173);

                    pushFollow(FOLLOW_distanceValue_in_distanceCoordinate1464);
                    x=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(x.getTree());
                    char_literal174=(Token)match(input,60,FOLLOW_60_in_distanceCoordinate1466);  
                    stream_60.add(char_literal174);

                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:255:32: ( '+' )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==127) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:255:32: '+'
                            {
                            char_literal175=(Token)match(input,127,FOLLOW_127_in_distanceCoordinate1468);  
                            stream_127.add(char_literal175);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_distanceValue_in_distanceCoordinate1473);
                    y=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(y.getTree());
                    char_literal176=(Token)match(input,62,FOLLOW_62_in_distanceCoordinate1475);  
                    stream_62.add(char_literal176);



                    // AST REWRITE
                    // elements: x, y
                    // token labels: 
                    // rule labels: retval, y, x
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 256:2: -> ^( DISTANCE $y NORTH ) ^( DISTANCE $x WEST )
                    {
                        // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:256:5: ^( DISTANCE $y NORTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DISTANCE, "DISTANCE"), root_1);

                        adaptor.addChild(root_1, stream_y.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NORTH, "NORTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:256:26: ^( DISTANCE $x WEST )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DISTANCE, "DISTANCE"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(WEST, "WEST"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:257:4: '(' ( '+' )? x= distanceValue ',' '-' y= distanceValue ')'
                    {
                    char_literal177=(Token)match(input,61,FOLLOW_61_in_distanceCoordinate1501);  
                    stream_61.add(char_literal177);

                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:257:8: ( '+' )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==127) ) {
                        alt77=1;
                    }
                    switch (alt77) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:257:8: '+'
                            {
                            char_literal178=(Token)match(input,127,FOLLOW_127_in_distanceCoordinate1503);  
                            stream_127.add(char_literal178);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_distanceValue_in_distanceCoordinate1508);
                    x=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(x.getTree());
                    char_literal179=(Token)match(input,60,FOLLOW_60_in_distanceCoordinate1510);  
                    stream_60.add(char_literal179);

                    char_literal180=(Token)match(input,128,FOLLOW_128_in_distanceCoordinate1512);  
                    stream_128.add(char_literal180);

                    pushFollow(FOLLOW_distanceValue_in_distanceCoordinate1516);
                    y=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(y.getTree());
                    char_literal181=(Token)match(input,62,FOLLOW_62_in_distanceCoordinate1518);  
                    stream_62.add(char_literal181);



                    // AST REWRITE
                    // elements: x, y
                    // token labels: 
                    // rule labels: retval, y, x
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 258:2: -> ^( DISTANCE $y SOUTH ) ^( DISTANCE $x EAST )
                    {
                        // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:258:5: ^( DISTANCE $y SOUTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DISTANCE, "DISTANCE"), root_1);

                        adaptor.addChild(root_1, stream_y.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(SOUTH, "SOUTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:258:26: ^( DISTANCE $x EAST )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DISTANCE, "DISTANCE"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(EAST, "EAST"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:259:4: '(' '-' x= distanceValue ',' '-' y= distanceValue ')'
                    {
                    char_literal182=(Token)match(input,61,FOLLOW_61_in_distanceCoordinate1544);  
                    stream_61.add(char_literal182);

                    char_literal183=(Token)match(input,128,FOLLOW_128_in_distanceCoordinate1546);  
                    stream_128.add(char_literal183);

                    pushFollow(FOLLOW_distanceValue_in_distanceCoordinate1550);
                    x=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(x.getTree());
                    char_literal184=(Token)match(input,60,FOLLOW_60_in_distanceCoordinate1552);  
                    stream_60.add(char_literal184);

                    char_literal185=(Token)match(input,128,FOLLOW_128_in_distanceCoordinate1554);  
                    stream_128.add(char_literal185);

                    pushFollow(FOLLOW_distanceValue_in_distanceCoordinate1558);
                    y=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(y.getTree());
                    char_literal186=(Token)match(input,62,FOLLOW_62_in_distanceCoordinate1560);  
                    stream_62.add(char_literal186);



                    // AST REWRITE
                    // elements: x, y
                    // token labels: 
                    // rule labels: retval, y, x
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"rule y",y!=null?y.tree:null);
                    RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 260:2: -> ^( DISTANCE $y SOUTH ) ^( DISTANCE $x WEST )
                    {
                        // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:260:5: ^( DISTANCE $y SOUTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DISTANCE, "DISTANCE"), root_1);

                        adaptor.addChild(root_1, stream_y.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(SOUTH, "SOUTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:260:26: ^( DISTANCE $x WEST )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DISTANCE, "DISTANCE"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(WEST, "WEST"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "distanceCoordinate"

    public static class numericValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numericValue"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:265:1: numericValue : ( integerValue | FloatingPointLiteral );
    public final flipsParser.numericValue_return numericValue() throws RecognitionException {
        flipsParser.numericValue_return retval = new flipsParser.numericValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FloatingPointLiteral188=null;
        flipsParser.integerValue_return integerValue187 = null;


        CommonTree FloatingPointLiteral188_tree=null;

        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:266:2: ( integerValue | FloatingPointLiteral )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( ((LA79_0>=BinaryLiteral && LA79_0<=HexLiteral)) ) {
                alt79=1;
            }
            else if ( (LA79_0==FloatingPointLiteral) ) {
                alt79=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:266:4: integerValue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_integerValue_in_numericValue1594);
                    integerValue187=integerValue();

                    state._fsp--;

                    adaptor.addChild(root_0, integerValue187.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:267:4: FloatingPointLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    FloatingPointLiteral188=(Token)match(input,FloatingPointLiteral,FOLLOW_FloatingPointLiteral_in_numericValue1599); 
                    FloatingPointLiteral188_tree = (CommonTree)adaptor.create(FloatingPointLiteral188);
                    adaptor.addChild(root_0, FloatingPointLiteral188_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "numericValue"

    public static class integerValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "integerValue"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:270:1: integerValue : ( BinaryLiteral | OctalLiteral | DecimalLiteral | HexLiteral );
    public final flipsParser.integerValue_return integerValue() throws RecognitionException {
        flipsParser.integerValue_return retval = new flipsParser.integerValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set189=null;

        CommonTree set189_tree=null;

        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:271:2: ( BinaryLiteral | OctalLiteral | DecimalLiteral | HexLiteral )
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set189=(Token)input.LT(1);
            if ( (input.LA(1)>=BinaryLiteral && input.LA(1)<=HexLiteral) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set189));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "integerValue"

    // Delegated rules


    protected DFA25 dfa25 = new DFA25(this);
    protected DFA72 dfa72 = new DFA72(this);
    protected DFA78 dfa78 = new DFA78(this);
    static final String DFA25_eotS =
        "\16\uffff";
    static final String DFA25_eofS =
        "\16\uffff";
    static final String DFA25_minS =
        "\14\45\2\uffff";
    static final String DFA25_maxS =
        "\1\157\13\55\2\uffff";
    static final String DFA25_acceptS =
        "\14\uffff\1\1\1\2";
    static final String DFA25_specialS =
        "\16\uffff}>";
    static final String[] DFA25_transitionS = {
            "\3\14\75\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1"+
            "\13",
            "\1\14\2\uffff\6\15",
            "\1\14\2\uffff\6\15",
            "\1\14\2\uffff\6\15",
            "\1\14\2\uffff\6\15",
            "\1\14\2\uffff\6\15",
            "\1\14\2\uffff\6\15",
            "\1\14\2\uffff\6\15",
            "\1\14\2\uffff\6\15",
            "\1\14\2\uffff\6\15",
            "\1\14\2\uffff\6\15",
            "\1\14\2\uffff\6\15",
            "",
            ""
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "133:1: altitude : ( fixedAltitude | relativeAltitude );";
        }
    }
    static final String DFA72_eotS =
        "\64\uffff";
    static final String DFA72_eofS =
        "\64\uffff";
    static final String DFA72_minS =
        "\16\51\1\uffff\1\51\2\uffff\4\51\2\172\17\51\1\uffff\4\51\1\uffff"+
        "\1\51\4\172\2\51";
    static final String DFA72_maxS =
        "\3\u0080\2\55\11\u0080\1\uffff\1\55\2\uffff\4\u0080\2\172\10\u0080"+
        "\2\55\5\u0080\1\uffff\4\u0080\1\uffff\1\u0080\4\172\2\u0080";
    static final String DFA72_acceptS =
        "\16\uffff\1\4\1\uffff\1\2\1\1\25\uffff\1\5\4\uffff\1\3\7\uffff";
    static final String DFA72_specialS =
        "\64\uffff}>";
    static final String[] DFA72_transitionS = {
            "\1\2\4\1\121\uffff\1\3\1\4",
            "\5\20\16\uffff\1\15\40\uffff\4\21\13\uffff\1\17\11\uffff\1"+
            "\11\1\12\1\13\1\14\1\uffff\1\5\1\6\1\7\1\10\1\20\1\16",
            "\5\20\16\uffff\1\15\40\uffff\4\21\25\uffff\1\11\1\12\1\13\1"+
            "\14\1\uffff\1\5\1\6\1\7\1\10\1\20\1\16",
            "\1\23\4\22",
            "\1\25\4\24",
            "\5\20\16\uffff\1\15\40\uffff\4\21\36\uffff\1\20\1\16",
            "\5\20\16\uffff\1\15\40\uffff\4\21\36\uffff\1\20\1\16",
            "\5\20\16\uffff\1\15\40\uffff\4\21\36\uffff\1\20\1\16",
            "\5\20\16\uffff\1\15\40\uffff\4\21\36\uffff\1\20\1\16",
            "\5\20\16\uffff\1\15\40\uffff\4\21\36\uffff\1\20\1\16",
            "\5\20\16\uffff\1\15\40\uffff\4\21\36\uffff\1\20\1\16",
            "\5\20\16\uffff\1\15\40\uffff\4\21\36\uffff\1\20\1\16",
            "\5\20\16\uffff\1\15\40\uffff\4\21\36\uffff\1\20\1\16",
            "\5\20\121\uffff\1\20\1\16",
            "",
            "\1\27\4\26",
            "",
            "",
            "\5\20\16\uffff\1\15\57\uffff\1\40\11\uffff\1\34\1\35\1\36\1"+
            "\37\1\uffff\1\30\1\31\1\32\1\33\1\20\1\16",
            "\5\20\16\uffff\1\15\71\uffff\1\34\1\35\1\36\1\37\1\uffff\1"+
            "\30\1\31\1\32\1\33\1\20\1\16",
            "\5\54\16\uffff\1\46\57\uffff\1\41\11\uffff\1\50\1\51\1\52\1"+
            "\53\1\uffff\1\42\1\43\1\44\1\45\1\54\1\47",
            "\5\54\16\uffff\1\46\71\uffff\1\50\1\51\1\52\1\53\1\uffff\1"+
            "\42\1\43\1\44\1\45\1\54\1\47",
            "\1\55",
            "\1\55",
            "\5\20\16\uffff\1\15\102\uffff\1\20\1\16",
            "\5\20\16\uffff\1\15\102\uffff\1\20\1\16",
            "\5\20\16\uffff\1\15\102\uffff\1\20\1\16",
            "\5\20\16\uffff\1\15\102\uffff\1\20\1\16",
            "\5\20\16\uffff\1\15\102\uffff\1\20\1\16",
            "\5\20\16\uffff\1\15\102\uffff\1\20\1\16",
            "\5\20\16\uffff\1\15\102\uffff\1\20\1\16",
            "\5\20\16\uffff\1\15\102\uffff\1\20\1\16",
            "\1\57\4\56",
            "\1\61\4\60",
            "\5\54\16\uffff\1\46\102\uffff\1\54\1\47",
            "\5\54\16\uffff\1\46\102\uffff\1\54\1\47",
            "\5\54\16\uffff\1\46\102\uffff\1\54\1\47",
            "\5\54\16\uffff\1\46\102\uffff\1\54\1\47",
            "\5\54\121\uffff\1\54\1\47",
            "",
            "\5\54\16\uffff\1\46\102\uffff\1\54\1\47",
            "\5\54\16\uffff\1\46\102\uffff\1\54\1\47",
            "\5\54\16\uffff\1\46\102\uffff\1\54\1\47",
            "\5\54\16\uffff\1\46\102\uffff\1\54\1\47",
            "",
            "\5\20\16\uffff\1\15\40\uffff\4\21\36\uffff\1\20\1\16",
            "\1\62",
            "\1\62",
            "\1\63",
            "\1\63",
            "\5\20\16\uffff\1\15\102\uffff\1\20\1\16",
            "\5\54\16\uffff\1\46\102\uffff\1\54\1\47"
    };

    static final short[] DFA72_eot = DFA.unpackEncodedString(DFA72_eotS);
    static final short[] DFA72_eof = DFA.unpackEncodedString(DFA72_eofS);
    static final char[] DFA72_min = DFA.unpackEncodedStringToUnsignedChars(DFA72_minS);
    static final char[] DFA72_max = DFA.unpackEncodedStringToUnsignedChars(DFA72_maxS);
    static final short[] DFA72_accept = DFA.unpackEncodedString(DFA72_acceptS);
    static final short[] DFA72_special = DFA.unpackEncodedString(DFA72_specialS);
    static final short[][] DFA72_transition;

    static {
        int numStates = DFA72_transitionS.length;
        DFA72_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA72_transition[i] = DFA.unpackEncodedString(DFA72_transitionS[i]);
        }
    }

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = DFA72_eot;
            this.eof = DFA72_eof;
            this.min = DFA72_min;
            this.max = DFA72_max;
            this.accept = DFA72_accept;
            this.special = DFA72_special;
            this.transition = DFA72_transition;
        }
        public String getDescription() {
            return "233:1: latitudeLongitude : (x= latitudeLongitudeValue northSouthDirection ( ',' )? y= latitudeLongitudeValue eastWestDirection -> ^( LATITUDE $x northSouthDirection ) ^( LONGITUDE $y eastWestDirection ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y EAST ) | '-' x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y EAST ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y WEST ) | '-' x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y WEST ) );";
        }
    }
    static final String DFA78_eotS =
        "\70\uffff";
    static final String DFA78_eofS =
        "\70\uffff";
    static final String DFA78_minS =
        "\1\75\3\51\4\113\7\74\2\123\20\74\2\123\11\74\1\51\3\74\1\51\3\74"+
        "\4\uffff";
    static final String DFA78_maxS =
        "\1\75\1\u0080\2\55\4\134\7\74\2\125\20\74\2\125\11\74\1\u0080\3"+
        "\74\1\u0080\3\74\4\uffff";
    static final String DFA78_acceptS =
        "\64\uffff\1\3\1\1\1\4\1\2";
    static final String DFA78_specialS =
        "\70\uffff}>";
    static final String[] DFA78_transitionS = {
            "\1\1",
            "\1\5\4\4\121\uffff\1\3\1\2",
            "\1\7\4\6",
            "\1\5\4\4",
            "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\21\1\22\1\23\1\20"+
            "\1\24\1\25\1\26\1\27\1\30\1\31",
            "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\21\1\22\1\23\1\20"+
            "\1\24\1\25\1\26\1\27\1\30\1\31",
            "\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\43\1\44\1\45\1\42"+
            "\1\46\1\47\1\50\1\51\1\52\1\53",
            "\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\43\1\44\1\45\1\42"+
            "\1\46\1\47\1\50\1\51\1\52\1\53",
            "\1\54",
            "\1\54",
            "\1\54",
            "\1\54",
            "\1\54",
            "\1\54",
            "\1\54",
            "\1\55\1\56\1\57",
            "\1\21\1\22\1\23",
            "\1\54",
            "\1\54",
            "\1\54",
            "\1\54",
            "\1\54",
            "\1\54",
            "\1\54",
            "\1\54",
            "\1\54",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\61\1\62\1\63",
            "\1\43\1\44\1\45",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\60",
            "\5\65\121\uffff\1\65\1\64",
            "\1\54",
            "\1\54",
            "\1\54",
            "\5\67\121\uffff\1\67\1\66",
            "\1\60",
            "\1\60",
            "\1\60",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA78_eot = DFA.unpackEncodedString(DFA78_eotS);
    static final short[] DFA78_eof = DFA.unpackEncodedString(DFA78_eofS);
    static final char[] DFA78_min = DFA.unpackEncodedStringToUnsignedChars(DFA78_minS);
    static final char[] DFA78_max = DFA.unpackEncodedStringToUnsignedChars(DFA78_maxS);
    static final short[] DFA78_accept = DFA.unpackEncodedString(DFA78_acceptS);
    static final short[] DFA78_special = DFA.unpackEncodedString(DFA78_specialS);
    static final short[][] DFA78_transition;

    static {
        int numStates = DFA78_transitionS.length;
        DFA78_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA78_transition[i] = DFA.unpackEncodedString(DFA78_transitionS[i]);
        }
    }

    class DFA78 extends DFA {

        public DFA78(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 78;
            this.eot = DFA78_eot;
            this.eof = DFA78_eof;
            this.min = DFA78_min;
            this.max = DFA78_max;
            this.accept = DFA78_accept;
            this.special = DFA78_special;
            this.transition = DFA78_transition;
        }
        public String getDescription() {
            return "252:1: distanceCoordinate : ( '(' ( '+' )? x= distanceValue ',' ( '+' )? y= distanceValue ')' -> ^( DISTANCE $y NORTH ) ^( DISTANCE $x EAST ) | '(' '-' x= distanceValue ',' ( '+' )? y= distanceValue ')' -> ^( DISTANCE $y NORTH ) ^( DISTANCE $x WEST ) | '(' ( '+' )? x= distanceValue ',' '-' y= distanceValue ')' -> ^( DISTANCE $y SOUTH ) ^( DISTANCE $x EAST ) | '(' '-' x= distanceValue ',' '-' y= distanceValue ')' -> ^( DISTANCE $y SOUTH ) ^( DISTANCE $x WEST ) );";
        }
    }
 

    public static final BitSet FOLLOW_define_in_flightPlan211 = new BitSet(new long[]{0x8380001000000002L,0x000000000000000FL});
    public static final BitSet FOLLOW_command_in_flightPlan214 = new BitSet(new long[]{0x0000001000000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_defineCommand_in_define241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defineWaypoint_in_define246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_defineCommand258 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_56_in_defineCommand260 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_57_in_defineCommand262 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_defineCommandValue_in_defineCommand265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_defineCommandValue281 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_defineCommandValue283 = new BitSet(new long[]{0x00003C0000000000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue285 = new BitSet(new long[]{0x1800001000000002L});
    public static final BitSet FOLLOW_59_in_defineCommandValue289 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_60_in_defineCommandValue291 = new BitSet(new long[]{0x0800001000000000L});
    public static final BitSet FOLLOW_59_in_defineCommandValue293 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_Identifier_in_defineCommandValue298 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_defineCommandValue300 = new BitSet(new long[]{0x00003C0000000000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue302 = new BitSet(new long[]{0x1800001000000002L});
    public static final BitSet FOLLOW_Identifier_in_defineCommandValue325 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_defineCommandValue327 = new BitSet(new long[]{0x00003C0000000000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue329 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_defineCommandValue331 = new BitSet(new long[]{0x00003C0000000000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue335 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_defineCommandValue337 = new BitSet(new long[]{0x1800001000000002L});
    public static final BitSet FOLLOW_59_in_defineCommandValue341 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_60_in_defineCommandValue343 = new BitSet(new long[]{0x0800001000000000L});
    public static final BitSet FOLLOW_59_in_defineCommandValue345 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_Identifier_in_defineCommandValue350 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_defineCommandValue352 = new BitSet(new long[]{0x00003C0000000000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue354 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_defineCommandValue356 = new BitSet(new long[]{0x00003C0000000000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue360 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_defineCommandValue362 = new BitSet(new long[]{0x1800001000000002L});
    public static final BitSet FOLLOW_63_in_defineWaypoint397 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_64_in_defineWaypoint399 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_65_in_defineWaypoint401 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_defineWaypointValue_in_defineWaypoint404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_defineWaypointValue420 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_defineWaypointValue422 = new BitSet(new long[]{0x20003E0000000000L,0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_geoCoordinate_in_defineWaypointValue424 = new BitSet(new long[]{0x1800001000000002L});
    public static final BitSet FOLLOW_59_in_defineWaypointValue428 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_60_in_defineWaypointValue430 = new BitSet(new long[]{0x0800001000000000L});
    public static final BitSet FOLLOW_59_in_defineWaypointValue432 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_Identifier_in_defineWaypointValue437 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_defineWaypointValue439 = new BitSet(new long[]{0x20003E0000000000L,0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_geoCoordinate_in_defineWaypointValue441 = new BitSet(new long[]{0x1800001000000002L});
    public static final BitSet FOLLOW_flyCommand_in_command468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_executeCommand_in_command473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_flyCommand485 = new BitSet(new long[]{0x00003EE000000002L,0x003FFFE000000000L});
    public static final BitSet FOLLOW_67_in_flyCommand487 = new BitSet(new long[]{0x00003EE000000002L,0x003FFFE000000000L});
    public static final BitSet FOLLOW_flyCommandValue_in_flyCommand490 = new BitSet(new long[]{0x00003EE000000002L,0x003FFFE000000000L});
    public static final BitSet FOLLOW_distance_in_flyCommandValue512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_To_in_flyCommandValue517 = new BitSet(new long[]{0x20003E1000000000L,0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_waypoint_in_flyCommandValue519 = new BitSet(new long[]{0x1800000000000002L});
    public static final BitSet FOLLOW_59_in_flyCommandValue523 = new BitSet(new long[]{0x20003E1000000000L,0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_60_in_flyCommandValue525 = new BitSet(new long[]{0x28003E1000000000L,0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_59_in_flyCommandValue527 = new BitSet(new long[]{0x20003E1000000000L,0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_waypoint_in_flyCommandValue531 = new BitSet(new long[]{0x1800000000000002L});
    public static final BitSet FOLLOW_altitude_in_flyCommandValue544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_executeCommand555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_executeCommand569 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_executeCommand571 = new BitSet(new long[]{0x00003E0000000000L});
    public static final BitSet FOLLOW_numericValue_in_executeCommand573 = new BitSet(new long[]{0x5000000000000000L});
    public static final BitSet FOLLOW_60_in_executeCommand576 = new BitSet(new long[]{0x00003E0000000000L});
    public static final BitSet FOLLOW_numericValue_in_executeCommand578 = new BitSet(new long[]{0x5000000000000000L});
    public static final BitSet FOLLOW_62_in_executeCommand583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fixedAltitude_in_altitude612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relativeAltitude_in_altitude617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_upDownDirection_in_fixedAltitude629 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_To_in_fixedAltitude632 = new BitSet(new long[]{0x00003F0000000000L,0x003F0000000003F0L});
    public static final BitSet FOLLOW_At_in_fixedAltitude634 = new BitSet(new long[]{0x00003F0000000000L,0x003F0000000003F0L});
    public static final BitSet FOLLOW_With_in_fixedAltitude636 = new BitSet(new long[]{0x00003F0000000000L,0x003F0000000003F0L});
    public static final BitSet FOLLOW_68_in_fixedAltitude641 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_69_in_fixedAltitude645 = new BitSet(new long[]{0x00003F0000000000L,0x003F0000000007F0L});
    public static final BitSet FOLLOW_70_in_fixedAltitude647 = new BitSet(new long[]{0x00003F0000000000L,0x003F0000000007F0L});
    public static final BitSet FOLLOW_71_in_fixedAltitude650 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_72_in_fixedAltitude654 = new BitSet(new long[]{0x00003F0000000000L,0x003F0000000007F0L});
    public static final BitSet FOLLOW_73_in_fixedAltitude656 = new BitSet(new long[]{0x00003F0000000000L,0x003F0000000007F0L});
    public static final BitSet FOLLOW_74_in_fixedAltitude660 = new BitSet(new long[]{0x00003F0000000000L,0x003F0000000003F0L});
    public static final BitSet FOLLOW_altitudeValue_in_fixedAltitude665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_upDownDirection_in_relativeAltitude687 = new BitSet(new long[]{0x00003F0000000000L,0x003F0000000003F0L});
    public static final BitSet FOLLOW_altitudeValue_in_relativeAltitude689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_distanceValue_in_altitudeValue713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FlightLevel_in_altitudeValue725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_leftRightDirection_in_distance745 = new BitSet(new long[]{0x00003E0000000000L,0x003F000000000000L});
    public static final BitSet FOLLOW_distanceValue_in_distance748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_distanceValue771 = new BitSet(new long[]{0x0000000000000000L,0x000000001FFFF800L});
    public static final BitSet FOLLOW_distanceUnit_in_distanceValue773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_distanceUnit785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_distanceUnit787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_distanceUnit789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_distanceUnit801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_distanceUnit803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_distanceUnit805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_distanceUnit817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_distanceUnit819 = new BitSet(new long[]{0x0000000000000000L,0x0000000000380000L});
    public static final BitSet FOLLOW_83_in_distanceUnit822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_distanceUnit824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_distanceUnit826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_distanceUnit841 = new BitSet(new long[]{0x0000000000000000L,0x0000000000380000L});
    public static final BitSet FOLLOW_83_in_distanceUnit846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_distanceUnit848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_distanceUnit850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_distanceUnit862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_distanceUnit864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_distanceUnit866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_distanceUnit878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_distanceUnit880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_distanceUnit882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_northSouthDirection900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_northSouthDirection902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_northSouthDirection914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_northSouthDirection916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_eastWestDirection934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_eastWestDirection936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_eastWestDirection948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_eastWestDirection950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_upDownDirection968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_upDownDirection970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_upDownDirection972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_upDownDirection974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_upDownDirection976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_upDownDirection978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_upDownDirection980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_upDownDirection992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_upDownDirection994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_upDownDirection996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_upDownDirection998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_leftRightDirection1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_leftRightDirection1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_leftRightDirection1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_leftRightDirection1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_leftRightDirection1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_leftRightDirection1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_angularValue1053 = new BitSet(new long[]{0x0000000000000000L,0x03C0000000000000L});
    public static final BitSet FOLLOW_118_in_angularValue1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_angularValue1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_angularValue1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_angularValue1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_angularValue1075 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_108_in_angularValue1077 = new BitSet(new long[]{0x00003E0000000000L});
    public static final BitSet FOLLOW_numericValue_in_angularValue1079 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_angularValue1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_angularValue1097 = new BitSet(new long[]{0x0000000000000000L,0x7800000000000000L});
    public static final BitSet FOLLOW_123_in_angularValue1100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_angularValue1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_angularValue1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_angularValue1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_geoCoordinate_in_waypoint1127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_waypoint1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_latitudeLongitude_in_geoCoordinate1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_distanceCoordinate_in_geoCoordinate1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude1188 = new BitSet(new long[]{0x0000000000000000L,0x00000001E0000000L});
    public static final BitSet FOLLOW_northSouthDirection_in_latitudeLongitude1190 = new BitSet(new long[]{0x10003E0000000000L});
    public static final BitSet FOLLOW_60_in_latitudeLongitude1192 = new BitSet(new long[]{0x00003E0000000000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude1197 = new BitSet(new long[]{0x0000000000000000L,0x0000001E00000000L});
    public static final BitSet FOLLOW_eastWestDirection_in_latitudeLongitude1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_latitudeLongitude1225 = new BitSet(new long[]{0x00003E0000000000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude1230 = new BitSet(new long[]{0x10003E0000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_60_in_latitudeLongitude1232 = new BitSet(new long[]{0x00003E0000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_latitudeLongitude1235 = new BitSet(new long[]{0x00003E0000000000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_latitudeLongitude1266 = new BitSet(new long[]{0x00003E0000000000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude1270 = new BitSet(new long[]{0x10003E0000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_60_in_latitudeLongitude1272 = new BitSet(new long[]{0x00003E0000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_latitudeLongitude1275 = new BitSet(new long[]{0x00003E0000000000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude1280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_latitudeLongitude1306 = new BitSet(new long[]{0x00003E0000000000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude1311 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_60_in_latitudeLongitude1313 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_128_in_latitudeLongitude1316 = new BitSet(new long[]{0x00003E0000000000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_latitudeLongitude1346 = new BitSet(new long[]{0x00003E0000000000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude1350 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_60_in_latitudeLongitude1352 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_128_in_latitudeLongitude1355 = new BitSet(new long[]{0x00003E0000000000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_latitudeLongitudeValue1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_angularValue_in_latitudeLongitudeValue1403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_distanceCoordinate1414 = new BitSet(new long[]{0x00003E0000000000L,0x803F000000000000L});
    public static final BitSet FOLLOW_127_in_distanceCoordinate1416 = new BitSet(new long[]{0x00003E0000000000L,0x003F000000000000L});
    public static final BitSet FOLLOW_distanceValue_in_distanceCoordinate1421 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_distanceCoordinate1423 = new BitSet(new long[]{0x00003E0000000000L,0x803F000000000000L});
    public static final BitSet FOLLOW_127_in_distanceCoordinate1425 = new BitSet(new long[]{0x00003E0000000000L,0x003F000000000000L});
    public static final BitSet FOLLOW_distanceValue_in_distanceCoordinate1430 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_distanceCoordinate1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_distanceCoordinate1458 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_128_in_distanceCoordinate1460 = new BitSet(new long[]{0x00003E0000000000L,0x003F000000000000L});
    public static final BitSet FOLLOW_distanceValue_in_distanceCoordinate1464 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_distanceCoordinate1466 = new BitSet(new long[]{0x00003E0000000000L,0x803F000000000000L});
    public static final BitSet FOLLOW_127_in_distanceCoordinate1468 = new BitSet(new long[]{0x00003E0000000000L,0x003F000000000000L});
    public static final BitSet FOLLOW_distanceValue_in_distanceCoordinate1473 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_distanceCoordinate1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_distanceCoordinate1501 = new BitSet(new long[]{0x00003E0000000000L,0x803F000000000000L});
    public static final BitSet FOLLOW_127_in_distanceCoordinate1503 = new BitSet(new long[]{0x00003E0000000000L,0x003F000000000000L});
    public static final BitSet FOLLOW_distanceValue_in_distanceCoordinate1508 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_distanceCoordinate1510 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_128_in_distanceCoordinate1512 = new BitSet(new long[]{0x00003E0000000000L,0x003F000000000000L});
    public static final BitSet FOLLOW_distanceValue_in_distanceCoordinate1516 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_distanceCoordinate1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_distanceCoordinate1544 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_128_in_distanceCoordinate1546 = new BitSet(new long[]{0x00003E0000000000L,0x003F000000000000L});
    public static final BitSet FOLLOW_distanceValue_in_distanceCoordinate1550 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_distanceCoordinate1552 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_128_in_distanceCoordinate1554 = new BitSet(new long[]{0x00003E0000000000L,0x003F000000000000L});
    public static final BitSet FOLLOW_distanceValue_in_distanceCoordinate1558 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_distanceCoordinate1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_numericValue1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FloatingPointLiteral_in_numericValue1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_integerValue0 = new BitSet(new long[]{0x0000000000000002L});

}