// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g 2010-02-04 15:25:33

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class flipsParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FLIGHTPLAN", "DEFINE", "COMMAND", "PARAMETER", "FLY", "EXECUTE", "FIXED", "RELATIVE", "ALTITUDE", "WAYPOINT", "GEOCOORDINATE", "LATITUDE", "LONGITUDE", "MINUTE", "DEGREE", "RADIAN", "DISTANCE", "KILOMETER", "METER", "NAUTICAL", "MILE", "YARD", "FOOT", "LEFT", "RIGHT", "FLIGHTLEVEL", "PRESSURE", "KILOPASCAL", "HECTOPASCAL", "PASCAL", "BAR", "MILLIBAR", "ATMOSPHERE", "CLIMB", "DESCEND", "NORTH", "SOUTH", "EAST", "WEST", "Identifier", "To", "At", "With", "FlightLevel", "FloatingPointLiteral", "BinaryLiteral", "OctalLiteral", "DecimalLiteral", "HexLiteral", "Digit", "StringLiteral", "NonZeroDigit", "BinaryDigit", "HexDigit", "Exponent", "WS", "Comment", "LineComment", "'cmd'", "'command'", "'commands'", "'='", "'and'", "','", "'('", "')'", "'wpt'", "'waypoint'", "'waypoints'", "'fly'", "'go'", "'an'", "'alt'", "'altitude'", "'a'", "'pres'", "'pressure'", "'of'", "'kpa'", "'kilopascal'", "'kilopascals'", "'hpa'", "'hectopascal'", "'hectopascals'", "'pa'", "'pascal'", "'pascals'", "'bar'", "'bars'", "'mbar'", "'millibar'", "'millibars'", "'atm'", "'atms'", "'atmosphere'", "'atmospheres'", "'km'", "'kilometer'", "'kilometers'", "'m'", "'meter'", "'meters'", "'nm'", "'nautical'", "'mi'", "'mile'", "'miles'", "'statute'", "'yd'", "'yard'", "'yards'", "'ft'", "'foot'", "'feet'", "'n'", "'north'", "'s'", "'south'", "'e'", "'east'", "'w'", "'west'", "'u'", "'up'", "'c'", "'climb'", "'climbing'", "'ascend'", "'ascending'", "'d'", "'down'", "'descend'", "'descending'", "'l'", "'left'", "'port'", "'r'", "'right'", "'starboard'", "'deg'", "'degs'", "'degree'", "'degrees'", "'\\''", "'rad'", "'rads'", "'radian'", "'radians'", "'+'", "'-'"
    };
    public static final int OctalLiteral=50;
    public static final int LATITUDE=15;
    public static final int FIXED=10;
    public static final int ATMOSPHERE=36;
    public static final int GEOCOORDINATE=14;
    public static final int SOUTH=40;
    public static final int FOOT=26;
    public static final int EOF=-1;
    public static final int Identifier=43;
    public static final int HECTOPASCAL=32;
    public static final int COMMAND=6;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int DISTANCE=20;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__148=148;
    public static final int T__90=90;
    public static final int T__147=147;
    public static final int To=44;
    public static final int T__149=149;
    public static final int Comment=60;
    public static final int MILLIBAR=35;
    public static final int PARAMETER=7;
    public static final int FlightLevel=47;
    public static final int KILOMETER=21;
    public static final int T__99=99;
    public static final int T__150=150;
    public static final int T__98=98;
    public static final int T__151=151;
    public static final int T__97=97;
    public static final int T__152=152;
    public static final int T__96=96;
    public static final int T__153=153;
    public static final int T__95=95;
    public static final int T__139=139;
    public static final int T__138=138;
    public static final int T__137=137;
    public static final int T__136=136;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int CLIMB=37;
    public static final int YARD=25;
    public static final int T__85=85;
    public static final int T__141=141;
    public static final int T__84=84;
    public static final int T__142=142;
    public static final int T__87=87;
    public static final int RADIAN=19;
    public static final int T__86=86;
    public static final int T__140=140;
    public static final int PASCAL=33;
    public static final int DEGREE=18;
    public static final int T__89=89;
    public static final int T__145=145;
    public static final int With=46;
    public static final int T__88=88;
    public static final int T__146=146;
    public static final int T__143=143;
    public static final int T__144=144;
    public static final int T__126=126;
    public static final int T__125=125;
    public static final int T__128=128;
    public static final int T__127=127;
    public static final int WS=59;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__129=129;
    public static final int FLY=8;
    public static final int T__70=70;
    public static final int BinaryLiteral=49;
    public static final int BinaryDigit=56;
    public static final int FloatingPointLiteral=48;
    public static final int METER=22;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__130=130;
    public static final int LONGITUDE=16;
    public static final int T__73=73;
    public static final int T__131=131;
    public static final int PRESSURE=30;
    public static final int T__132=132;
    public static final int T__79=79;
    public static final int T__133=133;
    public static final int T__78=78;
    public static final int T__134=134;
    public static final int T__77=77;
    public static final int T__135=135;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__118=118;
    public static final int EXECUTE=9;
    public static final int T__119=119;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int MILE=24;
    public static final int T__115=115;
    public static final int T__124=124;
    public static final int T__123=123;
    public static final int LineComment=61;
    public static final int Exponent=58;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__120=120;
    public static final int DEFINE=5;
    public static final int HexDigit=57;
    public static final int WEST=42;
    public static final int WAYPOINT=13;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int LEFT=27;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int FLIGHTLEVEL=29;
    public static final int T__112=112;
    public static final int HexLiteral=52;
    public static final int At=45;
    public static final int RIGHT=28;
    public static final int RELATIVE=11;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int EAST=41;
    public static final int T__100=100;
    public static final int Digit=53;
    public static final int DecimalLiteral=51;
    public static final int ALTITUDE=12;
    public static final int StringLiteral=54;
    public static final int FLIGHTPLAN=4;
    public static final int KILOPASCAL=31;
    public static final int NAUTICAL=23;
    public static final int NonZeroDigit=55;
    public static final int NORTH=39;
    public static final int MINUTE=17;
    public static final int DESCEND=38;
    public static final int BAR=34;

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
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:78:1: flightPlan : ( define )* ( command )* -> ^( FLIGHTPLAN ( define )* ( command )* ) ;
    public final flipsParser.flightPlan_return flightPlan() throws RecognitionException {
        flipsParser.flightPlan_return retval = new flipsParser.flightPlan_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.define_return define1 = null;

        flipsParser.command_return command2 = null;


        RewriteRuleSubtreeStream stream_define=new RewriteRuleSubtreeStream(adaptor,"rule define");
        RewriteRuleSubtreeStream stream_command=new RewriteRuleSubtreeStream(adaptor,"rule command");
        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:79:2: ( ( define )* ( command )* -> ^( FLIGHTPLAN ( define )* ( command )* ) )
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:79:4: ( define )* ( command )*
            {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:79:4: ( define )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=62 && LA1_0<=64)||(LA1_0>=70 && LA1_0<=72)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:79:4: define
            	    {
            	    pushFollow(FOLLOW_define_in_flightPlan246);
            	    define1=define();

            	    state._fsp--;

            	    stream_define.add(define1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:79:12: ( command )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==Identifier||(LA2_0>=73 && LA2_0<=74)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:79:12: command
            	    {
            	    pushFollow(FOLLOW_command_in_flightPlan249);
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
            // 80:2: -> ^( FLIGHTPLAN ( define )* ( command )* )
            {
                // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:80:5: ^( FLIGHTPLAN ( define )* ( command )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FLIGHTPLAN, "FLIGHTPLAN"), root_1);

                // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:80:18: ( define )*
                while ( stream_define.hasNext() ) {
                    adaptor.addChild(root_1, stream_define.nextTree());

                }
                stream_define.reset();
                // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:80:26: ( command )*
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
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:85:1: define : ( defineCommand | defineWaypoint );
    public final flipsParser.define_return define() throws RecognitionException {
        flipsParser.define_return retval = new flipsParser.define_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.defineCommand_return defineCommand3 = null;

        flipsParser.defineWaypoint_return defineWaypoint4 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:86:2: ( defineCommand | defineWaypoint )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=62 && LA3_0<=64)) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=70 && LA3_0<=72)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:86:4: defineCommand
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_defineCommand_in_define276);
                    defineCommand3=defineCommand();

                    state._fsp--;

                    adaptor.addChild(root_0, defineCommand3.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:87:4: defineWaypoint
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_defineWaypoint_in_define281);
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
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:90:1: defineCommand : ( 'cmd' | 'command' | 'commands' ) defineCommandValue -> defineCommandValue ;
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
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleSubtreeStream stream_defineCommandValue=new RewriteRuleSubtreeStream(adaptor,"rule defineCommandValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:91:2: ( ( 'cmd' | 'command' | 'commands' ) defineCommandValue -> defineCommandValue )
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:91:4: ( 'cmd' | 'command' | 'commands' ) defineCommandValue
            {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:91:4: ( 'cmd' | 'command' | 'commands' )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt4=1;
                }
                break;
            case 63:
                {
                alt4=2;
                }
                break;
            case 64:
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
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:91:5: 'cmd'
                    {
                    string_literal5=(Token)match(input,62,FOLLOW_62_in_defineCommand293);  
                    stream_62.add(string_literal5);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:91:11: 'command'
                    {
                    string_literal6=(Token)match(input,63,FOLLOW_63_in_defineCommand295);  
                    stream_63.add(string_literal6);


                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:91:21: 'commands'
                    {
                    string_literal7=(Token)match(input,64,FOLLOW_64_in_defineCommand297);  
                    stream_64.add(string_literal7);


                    }
                    break;

            }

            pushFollow(FOLLOW_defineCommandValue_in_defineCommand300);
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
            // 92:2: -> defineCommandValue
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
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:95:1: defineCommandValue : ( Identifier '=' integerValue ( ( 'and' | ',' ( 'and' )? )? Identifier '=' integerValue )* -> ( ^( DEFINE Identifier ^( COMMAND integerValue ) ) )+ | Identifier '=' integerValue '(' par= integerValue ')' ( ( 'and' | ',' ( 'and' )? )? Identifier '=' integerValue '(' par= integerValue ')' )* -> ( ^( DEFINE Identifier ^( COMMAND integerValue PARAMETER $par) ) )+ );
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
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_integerValue=new RewriteRuleSubtreeStream(adaptor,"rule integerValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:96:2: ( Identifier '=' integerValue ( ( 'and' | ',' ( 'and' )? )? Identifier '=' integerValue )* -> ( ^( DEFINE Identifier ^( COMMAND integerValue ) ) )+ | Identifier '=' integerValue '(' par= integerValue ')' ( ( 'and' | ',' ( 'and' )? )? Identifier '=' integerValue '(' par= integerValue ')' )* -> ( ^( DEFINE Identifier ^( COMMAND integerValue PARAMETER $par) ) )+ )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==Identifier) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==65) ) {
                    int LA11_2 = input.LA(3);

                    if ( ((LA11_2>=BinaryLiteral && LA11_2<=HexLiteral)) ) {
                        int LA11_3 = input.LA(4);

                        if ( (LA11_3==68) ) {
                            alt11=2;
                        }
                        else if ( (LA11_3==EOF||LA11_3==Identifier||(LA11_3>=62 && LA11_3<=64)||(LA11_3>=66 && LA11_3<=67)||(LA11_3>=70 && LA11_3<=74)) ) {
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
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:96:4: Identifier '=' integerValue ( ( 'and' | ',' ( 'and' )? )? Identifier '=' integerValue )*
                    {
                    Identifier9=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineCommandValue316);  
                    stream_Identifier.add(Identifier9);

                    char_literal10=(Token)match(input,65,FOLLOW_65_in_defineCommandValue318);  
                    stream_65.add(char_literal10);

                    pushFollow(FOLLOW_integerValue_in_defineCommandValue320);
                    integerValue11=integerValue();

                    state._fsp--;

                    stream_integerValue.add(integerValue11.getTree());
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:96:32: ( ( 'and' | ',' ( 'and' )? )? Identifier '=' integerValue )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==Identifier) ) {
                            int LA7_2 = input.LA(2);

                            if ( (LA7_2==65) ) {
                                alt7=1;
                            }


                        }
                        else if ( ((LA7_0>=66 && LA7_0<=67)) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:96:33: ( 'and' | ',' ( 'and' )? )? Identifier '=' integerValue
                    	    {
                    	    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:96:33: ( 'and' | ',' ( 'and' )? )?
                    	    int alt6=3;
                    	    int LA6_0 = input.LA(1);

                    	    if ( (LA6_0==66) ) {
                    	        alt6=1;
                    	    }
                    	    else if ( (LA6_0==67) ) {
                    	        alt6=2;
                    	    }
                    	    switch (alt6) {
                    	        case 1 :
                    	            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:96:34: 'and'
                    	            {
                    	            string_literal12=(Token)match(input,66,FOLLOW_66_in_defineCommandValue324);  
                    	            stream_66.add(string_literal12);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:96:40: ',' ( 'and' )?
                    	            {
                    	            char_literal13=(Token)match(input,67,FOLLOW_67_in_defineCommandValue326);  
                    	            stream_67.add(char_literal13);

                    	            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:96:44: ( 'and' )?
                    	            int alt5=2;
                    	            int LA5_0 = input.LA(1);

                    	            if ( (LA5_0==66) ) {
                    	                alt5=1;
                    	            }
                    	            switch (alt5) {
                    	                case 1 :
                    	                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:96:44: 'and'
                    	                    {
                    	                    string_literal14=(Token)match(input,66,FOLLOW_66_in_defineCommandValue328);  
                    	                    stream_66.add(string_literal14);


                    	                    }
                    	                    break;

                    	            }


                    	            }
                    	            break;

                    	    }

                    	    Identifier15=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineCommandValue333);  
                    	    stream_Identifier.add(Identifier15);

                    	    char_literal16=(Token)match(input,65,FOLLOW_65_in_defineCommandValue335);  
                    	    stream_65.add(char_literal16);

                    	    pushFollow(FOLLOW_integerValue_in_defineCommandValue337);
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
                    // 97:2: -> ( ^( DEFINE Identifier ^( COMMAND integerValue ) ) )+
                    {
                        if ( !(stream_Identifier.hasNext()||stream_integerValue.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_Identifier.hasNext()||stream_integerValue.hasNext() ) {
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:97:5: ^( DEFINE Identifier ^( COMMAND integerValue ) )
                            {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEFINE, "DEFINE"), root_1);

                            adaptor.addChild(root_1, stream_Identifier.nextNode());
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:97:25: ^( COMMAND integerValue )
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
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:98:4: Identifier '=' integerValue '(' par= integerValue ')' ( ( 'and' | ',' ( 'and' )? )? Identifier '=' integerValue '(' par= integerValue ')' )*
                    {
                    Identifier18=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineCommandValue360);  
                    stream_Identifier.add(Identifier18);

                    char_literal19=(Token)match(input,65,FOLLOW_65_in_defineCommandValue362);  
                    stream_65.add(char_literal19);

                    pushFollow(FOLLOW_integerValue_in_defineCommandValue364);
                    integerValue20=integerValue();

                    state._fsp--;

                    stream_integerValue.add(integerValue20.getTree());
                    char_literal21=(Token)match(input,68,FOLLOW_68_in_defineCommandValue366);  
                    stream_68.add(char_literal21);

                    pushFollow(FOLLOW_integerValue_in_defineCommandValue370);
                    par=integerValue();

                    state._fsp--;

                    stream_integerValue.add(par.getTree());
                    char_literal22=(Token)match(input,69,FOLLOW_69_in_defineCommandValue372);  
                    stream_69.add(char_literal22);

                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:98:57: ( ( 'and' | ',' ( 'and' )? )? Identifier '=' integerValue '(' par= integerValue ')' )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==Identifier) ) {
                            int LA10_2 = input.LA(2);

                            if ( (LA10_2==65) ) {
                                alt10=1;
                            }


                        }
                        else if ( ((LA10_0>=66 && LA10_0<=67)) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:98:58: ( 'and' | ',' ( 'and' )? )? Identifier '=' integerValue '(' par= integerValue ')'
                    	    {
                    	    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:98:58: ( 'and' | ',' ( 'and' )? )?
                    	    int alt9=3;
                    	    int LA9_0 = input.LA(1);

                    	    if ( (LA9_0==66) ) {
                    	        alt9=1;
                    	    }
                    	    else if ( (LA9_0==67) ) {
                    	        alt9=2;
                    	    }
                    	    switch (alt9) {
                    	        case 1 :
                    	            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:98:59: 'and'
                    	            {
                    	            string_literal23=(Token)match(input,66,FOLLOW_66_in_defineCommandValue376);  
                    	            stream_66.add(string_literal23);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:98:65: ',' ( 'and' )?
                    	            {
                    	            char_literal24=(Token)match(input,67,FOLLOW_67_in_defineCommandValue378);  
                    	            stream_67.add(char_literal24);

                    	            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:98:69: ( 'and' )?
                    	            int alt8=2;
                    	            int LA8_0 = input.LA(1);

                    	            if ( (LA8_0==66) ) {
                    	                alt8=1;
                    	            }
                    	            switch (alt8) {
                    	                case 1 :
                    	                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:98:69: 'and'
                    	                    {
                    	                    string_literal25=(Token)match(input,66,FOLLOW_66_in_defineCommandValue380);  
                    	                    stream_66.add(string_literal25);


                    	                    }
                    	                    break;

                    	            }


                    	            }
                    	            break;

                    	    }

                    	    Identifier26=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineCommandValue385);  
                    	    stream_Identifier.add(Identifier26);

                    	    char_literal27=(Token)match(input,65,FOLLOW_65_in_defineCommandValue387);  
                    	    stream_65.add(char_literal27);

                    	    pushFollow(FOLLOW_integerValue_in_defineCommandValue389);
                    	    integerValue28=integerValue();

                    	    state._fsp--;

                    	    stream_integerValue.add(integerValue28.getTree());
                    	    char_literal29=(Token)match(input,68,FOLLOW_68_in_defineCommandValue391);  
                    	    stream_68.add(char_literal29);

                    	    pushFollow(FOLLOW_integerValue_in_defineCommandValue395);
                    	    par=integerValue();

                    	    state._fsp--;

                    	    stream_integerValue.add(par.getTree());
                    	    char_literal30=(Token)match(input,69,FOLLOW_69_in_defineCommandValue397);  
                    	    stream_69.add(char_literal30);


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: par, Identifier, integerValue
                    // token labels: 
                    // rule labels: par, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_par=new RewriteRuleSubtreeStream(adaptor,"rule par",par!=null?par.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 99:2: -> ( ^( DEFINE Identifier ^( COMMAND integerValue PARAMETER $par) ) )+
                    {
                        if ( !(stream_par.hasNext()||stream_Identifier.hasNext()||stream_integerValue.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_par.hasNext()||stream_Identifier.hasNext()||stream_integerValue.hasNext() ) {
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:99:5: ^( DEFINE Identifier ^( COMMAND integerValue PARAMETER $par) )
                            {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEFINE, "DEFINE"), root_1);

                            adaptor.addChild(root_1, stream_Identifier.nextNode());
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:99:25: ^( COMMAND integerValue PARAMETER $par)
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
                        stream_par.reset();
                        stream_Identifier.reset();
                        stream_integerValue.reset();

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
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:102:1: defineWaypoint : ( 'wpt' | 'waypoint' | 'waypoints' ) defineWaypointValue -> defineWaypointValue ;
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
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleSubtreeStream stream_defineWaypointValue=new RewriteRuleSubtreeStream(adaptor,"rule defineWaypointValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:103:2: ( ( 'wpt' | 'waypoint' | 'waypoints' ) defineWaypointValue -> defineWaypointValue )
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:103:4: ( 'wpt' | 'waypoint' | 'waypoints' ) defineWaypointValue
            {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:103:4: ( 'wpt' | 'waypoint' | 'waypoints' )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt12=1;
                }
                break;
            case 71:
                {
                alt12=2;
                }
                break;
            case 72:
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
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:103:5: 'wpt'
                    {
                    string_literal31=(Token)match(input,70,FOLLOW_70_in_defineWaypoint432);  
                    stream_70.add(string_literal31);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:103:11: 'waypoint'
                    {
                    string_literal32=(Token)match(input,71,FOLLOW_71_in_defineWaypoint434);  
                    stream_71.add(string_literal32);


                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:103:22: 'waypoints'
                    {
                    string_literal33=(Token)match(input,72,FOLLOW_72_in_defineWaypoint436);  
                    stream_72.add(string_literal33);


                    }
                    break;

            }

            pushFollow(FOLLOW_defineWaypointValue_in_defineWaypoint439);
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
            // 104:2: -> defineWaypointValue
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
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:107:1: defineWaypointValue : Identifier '=' geoCoordinate ( ( 'and' | ',' ( 'and' )? )? Identifier '=' geoCoordinate )* -> ( ^( DEFINE Identifier geoCoordinate ) )+ ;
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
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_geoCoordinate=new RewriteRuleSubtreeStream(adaptor,"rule geoCoordinate");
        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:108:2: ( Identifier '=' geoCoordinate ( ( 'and' | ',' ( 'and' )? )? Identifier '=' geoCoordinate )* -> ( ^( DEFINE Identifier geoCoordinate ) )+ )
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:108:4: Identifier '=' geoCoordinate ( ( 'and' | ',' ( 'and' )? )? Identifier '=' geoCoordinate )*
            {
            Identifier35=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineWaypointValue455);  
            stream_Identifier.add(Identifier35);

            char_literal36=(Token)match(input,65,FOLLOW_65_in_defineWaypointValue457);  
            stream_65.add(char_literal36);

            pushFollow(FOLLOW_geoCoordinate_in_defineWaypointValue459);
            geoCoordinate37=geoCoordinate();

            state._fsp--;

            stream_geoCoordinate.add(geoCoordinate37.getTree());
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:108:33: ( ( 'and' | ',' ( 'and' )? )? Identifier '=' geoCoordinate )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==Identifier) ) {
                    int LA15_2 = input.LA(2);

                    if ( (LA15_2==65) ) {
                        alt15=1;
                    }


                }
                else if ( ((LA15_0>=66 && LA15_0<=67)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:108:34: ( 'and' | ',' ( 'and' )? )? Identifier '=' geoCoordinate
            	    {
            	    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:108:34: ( 'and' | ',' ( 'and' )? )?
            	    int alt14=3;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==66) ) {
            	        alt14=1;
            	    }
            	    else if ( (LA14_0==67) ) {
            	        alt14=2;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:108:35: 'and'
            	            {
            	            string_literal38=(Token)match(input,66,FOLLOW_66_in_defineWaypointValue463);  
            	            stream_66.add(string_literal38);


            	            }
            	            break;
            	        case 2 :
            	            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:108:41: ',' ( 'and' )?
            	            {
            	            char_literal39=(Token)match(input,67,FOLLOW_67_in_defineWaypointValue465);  
            	            stream_67.add(char_literal39);

            	            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:108:45: ( 'and' )?
            	            int alt13=2;
            	            int LA13_0 = input.LA(1);

            	            if ( (LA13_0==66) ) {
            	                alt13=1;
            	            }
            	            switch (alt13) {
            	                case 1 :
            	                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:108:45: 'and'
            	                    {
            	                    string_literal40=(Token)match(input,66,FOLLOW_66_in_defineWaypointValue467);  
            	                    stream_66.add(string_literal40);


            	                    }
            	                    break;

            	            }


            	            }
            	            break;

            	    }

            	    Identifier41=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineWaypointValue472);  
            	    stream_Identifier.add(Identifier41);

            	    char_literal42=(Token)match(input,65,FOLLOW_65_in_defineWaypointValue474);  
            	    stream_65.add(char_literal42);

            	    pushFollow(FOLLOW_geoCoordinate_in_defineWaypointValue476);
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
            // elements: geoCoordinate, Identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 109:2: -> ( ^( DEFINE Identifier geoCoordinate ) )+
            {
                if ( !(stream_geoCoordinate.hasNext()||stream_Identifier.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_geoCoordinate.hasNext()||stream_Identifier.hasNext() ) {
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:109:5: ^( DEFINE Identifier geoCoordinate )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEFINE, "DEFINE"), root_1);

                    adaptor.addChild(root_1, stream_Identifier.nextNode());
                    adaptor.addChild(root_1, stream_geoCoordinate.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_geoCoordinate.reset();
                stream_Identifier.reset();

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
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:114:1: command : ( flyCommand | executeCommand );
    public final flipsParser.command_return command() throws RecognitionException {
        flipsParser.command_return retval = new flipsParser.command_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.flyCommand_return flyCommand44 = null;

        flipsParser.executeCommand_return executeCommand45 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:115:2: ( flyCommand | executeCommand )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=73 && LA16_0<=74)) ) {
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
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:115:4: flyCommand
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_flyCommand_in_command503);
                    flyCommand44=flyCommand();

                    state._fsp--;

                    adaptor.addChild(root_0, flyCommand44.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:116:4: executeCommand
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_executeCommand_in_command508);
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
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:119:1: flyCommand : ( 'fly' | 'go' ) ( flyCommandValue )* -> ^( FLY ( flyCommandValue )* ) ;
    public final flipsParser.flyCommand_return flyCommand() throws RecognitionException {
        flipsParser.flyCommand_return retval = new flipsParser.flyCommand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal46=null;
        Token string_literal47=null;
        flipsParser.flyCommandValue_return flyCommandValue48 = null;


        CommonTree string_literal46_tree=null;
        CommonTree string_literal47_tree=null;
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleSubtreeStream stream_flyCommandValue=new RewriteRuleSubtreeStream(adaptor,"rule flyCommandValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:120:2: ( ( 'fly' | 'go' ) ( flyCommandValue )* -> ^( FLY ( flyCommandValue )* ) )
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:120:4: ( 'fly' | 'go' ) ( flyCommandValue )*
            {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:120:4: ( 'fly' | 'go' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==73) ) {
                alt17=1;
            }
            else if ( (LA17_0==74) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:120:5: 'fly'
                    {
                    string_literal46=(Token)match(input,73,FOLLOW_73_in_flyCommand520);  
                    stream_73.add(string_literal46);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:120:11: 'go'
                    {
                    string_literal47=(Token)match(input,74,FOLLOW_74_in_flyCommand522);  
                    stream_74.add(string_literal47);


                    }
                    break;

            }

            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:120:17: ( flyCommandValue )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=To && LA18_0<=With)||(LA18_0>=FloatingPointLiteral && LA18_0<=HexLiteral)||(LA18_0>=126 && LA18_0<=142)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:120:17: flyCommandValue
            	    {
            	    pushFollow(FOLLOW_flyCommandValue_in_flyCommand525);
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
            // 121:2: -> ^( FLY ( flyCommandValue )* )
            {
                // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:121:5: ^( FLY ( flyCommandValue )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FLY, "FLY"), root_1);

                // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:121:11: ( flyCommandValue )*
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
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:124:1: flyCommandValue : ( distance | To waypoint ( ( 'and' | ',' ( 'and' )? ) waypoint )* -> ( waypoint )+ | altitude );
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
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_To=new RewriteRuleTokenStream(adaptor,"token To");
        RewriteRuleSubtreeStream stream_waypoint=new RewriteRuleSubtreeStream(adaptor,"rule waypoint");
        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:125:2: ( distance | To waypoint ( ( 'and' | ',' ( 'and' )? ) waypoint )* -> ( waypoint )+ | altitude )
            int alt22=3;
            switch ( input.LA(1) ) {
            case FloatingPointLiteral:
            case BinaryLiteral:
            case OctalLiteral:
            case DecimalLiteral:
            case HexLiteral:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
                {
                alt22=1;
                }
                break;
            case To:
                {
                switch ( input.LA(2) ) {
                case FlightLevel:
                case 75:
                case 76:
                case 77:
                case 78:
                case 79:
                case 80:
                    {
                    alt22=3;
                    }
                    break;
                case BinaryLiteral:
                case OctalLiteral:
                case DecimalLiteral:
                case HexLiteral:
                    {
                    int LA22_4 = input.LA(3);

                    if ( ((LA22_4>=82 && LA22_4<=117)) ) {
                        alt22=3;
                    }
                    else if ( ((LA22_4>=FloatingPointLiteral && LA22_4<=HexLiteral)||LA22_4==67||(LA22_4>=118 && LA22_4<=121)||LA22_4==133||(LA22_4>=143 && LA22_4<=146)||(LA22_4>=148 && LA22_4<=153)) ) {
                        alt22=2;
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

                    if ( ((LA22_5>=FloatingPointLiteral && LA22_5<=HexLiteral)||LA22_5==67||(LA22_5>=118 && LA22_5<=121)||(LA22_5>=143 && LA22_5<=146)||(LA22_5>=148 && LA22_5<=153)) ) {
                        alt22=2;
                    }
                    else if ( ((LA22_5>=82 && LA22_5<=117)) ) {
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
                case 152:
                case 153:
                    {
                    alt22=2;
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
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
            case 136:
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
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:125:4: distance
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_distance_in_flyCommandValue547);
                    distance49=distance();

                    state._fsp--;

                    adaptor.addChild(root_0, distance49.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:126:4: To waypoint ( ( 'and' | ',' ( 'and' )? ) waypoint )*
                    {
                    To50=(Token)match(input,To,FOLLOW_To_in_flyCommandValue552);  
                    stream_To.add(To50);

                    pushFollow(FOLLOW_waypoint_in_flyCommandValue554);
                    waypoint51=waypoint();

                    state._fsp--;

                    stream_waypoint.add(waypoint51.getTree());
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:126:16: ( ( 'and' | ',' ( 'and' )? ) waypoint )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( ((LA21_0>=66 && LA21_0<=67)) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:126:17: ( 'and' | ',' ( 'and' )? ) waypoint
                    	    {
                    	    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:126:17: ( 'and' | ',' ( 'and' )? )
                    	    int alt20=2;
                    	    int LA20_0 = input.LA(1);

                    	    if ( (LA20_0==66) ) {
                    	        alt20=1;
                    	    }
                    	    else if ( (LA20_0==67) ) {
                    	        alt20=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 20, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt20) {
                    	        case 1 :
                    	            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:126:18: 'and'
                    	            {
                    	            string_literal52=(Token)match(input,66,FOLLOW_66_in_flyCommandValue558);  
                    	            stream_66.add(string_literal52);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:126:24: ',' ( 'and' )?
                    	            {
                    	            char_literal53=(Token)match(input,67,FOLLOW_67_in_flyCommandValue560);  
                    	            stream_67.add(char_literal53);

                    	            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:126:28: ( 'and' )?
                    	            int alt19=2;
                    	            int LA19_0 = input.LA(1);

                    	            if ( (LA19_0==66) ) {
                    	                alt19=1;
                    	            }
                    	            switch (alt19) {
                    	                case 1 :
                    	                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:126:28: 'and'
                    	                    {
                    	                    string_literal54=(Token)match(input,66,FOLLOW_66_in_flyCommandValue562);  
                    	                    stream_66.add(string_literal54);


                    	                    }
                    	                    break;

                    	            }


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_waypoint_in_flyCommandValue566);
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
                    // 127:2: -> ( waypoint )+
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
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:128:4: altitude
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_altitude_in_flyCommandValue579);
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
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:131:1: executeCommand : ( Identifier -> ^( EXECUTE Identifier ) | Identifier '(' numericValue ( ',' numericValue )* ')' -> ^( EXECUTE Identifier ( ^( PARAMETER numericValue ) )+ ) );
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
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_numericValue=new RewriteRuleSubtreeStream(adaptor,"rule numericValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:132:2: ( Identifier -> ^( EXECUTE Identifier ) | Identifier '(' numericValue ( ',' numericValue )* ')' -> ^( EXECUTE Identifier ( ^( PARAMETER numericValue ) )+ ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==Identifier) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==68) ) {
                    alt24=2;
                }
                else if ( (LA24_1==EOF||LA24_1==Identifier||(LA24_1>=73 && LA24_1<=74)) ) {
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
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:132:4: Identifier
                    {
                    Identifier57=(Token)match(input,Identifier,FOLLOW_Identifier_in_executeCommand590);  
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
                    // 133:2: -> ^( EXECUTE Identifier )
                    {
                        // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:133:5: ^( EXECUTE Identifier )
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
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:134:4: Identifier '(' numericValue ( ',' numericValue )* ')'
                    {
                    Identifier58=(Token)match(input,Identifier,FOLLOW_Identifier_in_executeCommand604);  
                    stream_Identifier.add(Identifier58);

                    char_literal59=(Token)match(input,68,FOLLOW_68_in_executeCommand606);  
                    stream_68.add(char_literal59);

                    pushFollow(FOLLOW_numericValue_in_executeCommand608);
                    numericValue60=numericValue();

                    state._fsp--;

                    stream_numericValue.add(numericValue60.getTree());
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:134:32: ( ',' numericValue )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==67) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:134:33: ',' numericValue
                    	    {
                    	    char_literal61=(Token)match(input,67,FOLLOW_67_in_executeCommand611);  
                    	    stream_67.add(char_literal61);

                    	    pushFollow(FOLLOW_numericValue_in_executeCommand613);
                    	    numericValue62=numericValue();

                    	    state._fsp--;

                    	    stream_numericValue.add(numericValue62.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    char_literal63=(Token)match(input,69,FOLLOW_69_in_executeCommand618);  
                    stream_69.add(char_literal63);



                    // AST REWRITE
                    // elements: Identifier, numericValue
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 135:2: -> ^( EXECUTE Identifier ( ^( PARAMETER numericValue ) )+ )
                    {
                        // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:135:5: ^( EXECUTE Identifier ( ^( PARAMETER numericValue ) )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXECUTE, "EXECUTE"), root_1);

                        adaptor.addChild(root_1, stream_Identifier.nextNode());
                        if ( !(stream_numericValue.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_numericValue.hasNext() ) {
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:135:26: ^( PARAMETER numericValue )
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
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:140:1: altitude : ( fixedAltitude | relativeAltitude );
    public final flipsParser.altitude_return altitude() throws RecognitionException {
        flipsParser.altitude_return retval = new flipsParser.altitude_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.fixedAltitude_return fixedAltitude64 = null;

        flipsParser.relativeAltitude_return relativeAltitude65 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:141:2: ( fixedAltitude | relativeAltitude )
            int alt25=2;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:141:4: fixedAltitude
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_fixedAltitude_in_altitude647);
                    fixedAltitude64=fixedAltitude();

                    state._fsp--;

                    adaptor.addChild(root_0, fixedAltitude64.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:142:4: relativeAltitude
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_relativeAltitude_in_altitude652);
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
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:145:1: fixedAltitude : ( ( upDownDirection )? To | At | With ) ( ( ( 'an' )? ( 'alt' | 'altitude' ) | ( 'a' )? ( 'pres' | 'pressure' ) ) ( 'of' )? )? altitudeValue -> ^( ALTITUDE FIXED altitudeValue ) ;
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
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_At=new RewriteRuleTokenStream(adaptor,"token At");
        RewriteRuleTokenStream stream_To=new RewriteRuleTokenStream(adaptor,"token To");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleTokenStream stream_With=new RewriteRuleTokenStream(adaptor,"token With");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_altitudeValue=new RewriteRuleSubtreeStream(adaptor,"rule altitudeValue");
        RewriteRuleSubtreeStream stream_upDownDirection=new RewriteRuleSubtreeStream(adaptor,"rule upDownDirection");
        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:146:2: ( ( ( upDownDirection )? To | At | With ) ( ( ( 'an' )? ( 'alt' | 'altitude' ) | ( 'a' )? ( 'pres' | 'pressure' ) ) ( 'of' )? )? altitudeValue -> ^( ALTITUDE FIXED altitudeValue ) )
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:146:4: ( ( upDownDirection )? To | At | With ) ( ( ( 'an' )? ( 'alt' | 'altitude' ) | ( 'a' )? ( 'pres' | 'pressure' ) ) ( 'of' )? )? altitudeValue
            {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:146:4: ( ( upDownDirection )? To | At | With )
            int alt27=3;
            switch ( input.LA(1) ) {
            case To:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
            case 136:
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
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:146:5: ( upDownDirection )? To
                    {
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:146:5: ( upDownDirection )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( ((LA26_0>=126 && LA26_0<=136)) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:146:5: upDownDirection
                            {
                            pushFollow(FOLLOW_upDownDirection_in_fixedAltitude664);
                            upDownDirection66=upDownDirection();

                            state._fsp--;

                            stream_upDownDirection.add(upDownDirection66.getTree());

                            }
                            break;

                    }

                    To67=(Token)match(input,To,FOLLOW_To_in_fixedAltitude667);  
                    stream_To.add(To67);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:146:25: At
                    {
                    At68=(Token)match(input,At,FOLLOW_At_in_fixedAltitude669);  
                    stream_At.add(At68);


                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:146:28: With
                    {
                    With69=(Token)match(input,With,FOLLOW_With_in_fixedAltitude671);  
                    stream_With.add(With69);


                    }
                    break;

            }

            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:146:34: ( ( ( 'an' )? ( 'alt' | 'altitude' ) | ( 'a' )? ( 'pres' | 'pressure' ) ) ( 'of' )? )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=75 && LA34_0<=80)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:146:35: ( ( 'an' )? ( 'alt' | 'altitude' ) | ( 'a' )? ( 'pres' | 'pressure' ) ) ( 'of' )?
                    {
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:146:35: ( ( 'an' )? ( 'alt' | 'altitude' ) | ( 'a' )? ( 'pres' | 'pressure' ) )
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( ((LA32_0>=75 && LA32_0<=77)) ) {
                        alt32=1;
                    }
                    else if ( ((LA32_0>=78 && LA32_0<=80)) ) {
                        alt32=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 0, input);

                        throw nvae;
                    }
                    switch (alt32) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:146:36: ( 'an' )? ( 'alt' | 'altitude' )
                            {
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:146:36: ( 'an' )?
                            int alt28=2;
                            int LA28_0 = input.LA(1);

                            if ( (LA28_0==75) ) {
                                alt28=1;
                            }
                            switch (alt28) {
                                case 1 :
                                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:146:36: 'an'
                                    {
                                    string_literal70=(Token)match(input,75,FOLLOW_75_in_fixedAltitude676);  
                                    stream_75.add(string_literal70);


                                    }
                                    break;

                            }

                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:146:42: ( 'alt' | 'altitude' )
                            int alt29=2;
                            int LA29_0 = input.LA(1);

                            if ( (LA29_0==76) ) {
                                alt29=1;
                            }
                            else if ( (LA29_0==77) ) {
                                alt29=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 29, 0, input);

                                throw nvae;
                            }
                            switch (alt29) {
                                case 1 :
                                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:146:43: 'alt'
                                    {
                                    string_literal71=(Token)match(input,76,FOLLOW_76_in_fixedAltitude680);  
                                    stream_76.add(string_literal71);


                                    }
                                    break;
                                case 2 :
                                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:146:49: 'altitude'
                                    {
                                    string_literal72=(Token)match(input,77,FOLLOW_77_in_fixedAltitude682);  
                                    stream_77.add(string_literal72);


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:146:61: ( 'a' )? ( 'pres' | 'pressure' )
                            {
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:146:61: ( 'a' )?
                            int alt30=2;
                            int LA30_0 = input.LA(1);

                            if ( (LA30_0==78) ) {
                                alt30=1;
                            }
                            switch (alt30) {
                                case 1 :
                                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:146:61: 'a'
                                    {
                                    char_literal73=(Token)match(input,78,FOLLOW_78_in_fixedAltitude685);  
                                    stream_78.add(char_literal73);


                                    }
                                    break;

                            }

                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:146:66: ( 'pres' | 'pressure' )
                            int alt31=2;
                            int LA31_0 = input.LA(1);

                            if ( (LA31_0==79) ) {
                                alt31=1;
                            }
                            else if ( (LA31_0==80) ) {
                                alt31=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 31, 0, input);

                                throw nvae;
                            }
                            switch (alt31) {
                                case 1 :
                                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:146:67: 'pres'
                                    {
                                    string_literal74=(Token)match(input,79,FOLLOW_79_in_fixedAltitude689);  
                                    stream_79.add(string_literal74);


                                    }
                                    break;
                                case 2 :
                                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:146:74: 'pressure'
                                    {
                                    string_literal75=(Token)match(input,80,FOLLOW_80_in_fixedAltitude691);  
                                    stream_80.add(string_literal75);


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:146:87: ( 'of' )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==81) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:146:87: 'of'
                            {
                            string_literal76=(Token)match(input,81,FOLLOW_81_in_fixedAltitude695);  
                            stream_81.add(string_literal76);


                            }
                            break;

                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_altitudeValue_in_fixedAltitude700);
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
            // 147:2: -> ^( ALTITUDE FIXED altitudeValue )
            {
                // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:147:5: ^( ALTITUDE FIXED altitudeValue )
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
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:150:1: relativeAltitude : upDownDirection altitudeValue -> ^( ALTITUDE RELATIVE upDownDirection altitudeValue ) ;
    public final flipsParser.relativeAltitude_return relativeAltitude() throws RecognitionException {
        flipsParser.relativeAltitude_return retval = new flipsParser.relativeAltitude_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.upDownDirection_return upDownDirection78 = null;

        flipsParser.altitudeValue_return altitudeValue79 = null;


        RewriteRuleSubtreeStream stream_altitudeValue=new RewriteRuleSubtreeStream(adaptor,"rule altitudeValue");
        RewriteRuleSubtreeStream stream_upDownDirection=new RewriteRuleSubtreeStream(adaptor,"rule upDownDirection");
        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:151:2: ( upDownDirection altitudeValue -> ^( ALTITUDE RELATIVE upDownDirection altitudeValue ) )
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:151:4: upDownDirection altitudeValue
            {
            pushFollow(FOLLOW_upDownDirection_in_relativeAltitude722);
            upDownDirection78=upDownDirection();

            state._fsp--;

            stream_upDownDirection.add(upDownDirection78.getTree());
            pushFollow(FOLLOW_altitudeValue_in_relativeAltitude724);
            altitudeValue79=altitudeValue();

            state._fsp--;

            stream_altitudeValue.add(altitudeValue79.getTree());


            // AST REWRITE
            // elements: upDownDirection, altitudeValue
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 152:2: -> ^( ALTITUDE RELATIVE upDownDirection altitudeValue )
            {
                // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:152:5: ^( ALTITUDE RELATIVE upDownDirection altitudeValue )
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
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:155:1: altitudeValue : ( distanceValue -> DISTANCE distanceValue | pressureValue -> PRESSURE pressureValue | FlightLevel -> FLIGHTLEVEL FlightLevel );
    public final flipsParser.altitudeValue_return altitudeValue() throws RecognitionException {
        flipsParser.altitudeValue_return retval = new flipsParser.altitudeValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FlightLevel82=null;
        flipsParser.distanceValue_return distanceValue80 = null;

        flipsParser.pressureValue_return pressureValue81 = null;


        CommonTree FlightLevel82_tree=null;
        RewriteRuleTokenStream stream_FlightLevel=new RewriteRuleTokenStream(adaptor,"token FlightLevel");
        RewriteRuleSubtreeStream stream_pressureValue=new RewriteRuleSubtreeStream(adaptor,"rule pressureValue");
        RewriteRuleSubtreeStream stream_distanceValue=new RewriteRuleSubtreeStream(adaptor,"rule distanceValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:156:2: ( distanceValue -> DISTANCE distanceValue | pressureValue -> PRESSURE pressureValue | FlightLevel -> FLIGHTLEVEL FlightLevel )
            int alt35=3;
            switch ( input.LA(1) ) {
            case BinaryLiteral:
            case OctalLiteral:
            case DecimalLiteral:
            case HexLiteral:
                {
                int LA35_1 = input.LA(2);

                if ( ((LA35_1>=82 && LA35_1<=99)) ) {
                    alt35=2;
                }
                else if ( ((LA35_1>=100 && LA35_1<=117)) ) {
                    alt35=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 1, input);

                    throw nvae;
                }
                }
                break;
            case FloatingPointLiteral:
                {
                int LA35_2 = input.LA(2);

                if ( ((LA35_2>=100 && LA35_2<=117)) ) {
                    alt35=1;
                }
                else if ( ((LA35_2>=82 && LA35_2<=99)) ) {
                    alt35=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 2, input);

                    throw nvae;
                }
                }
                break;
            case FlightLevel:
                {
                alt35=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:156:4: distanceValue
                    {
                    pushFollow(FOLLOW_distanceValue_in_altitudeValue748);
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
                    // 157:2: -> DISTANCE distanceValue
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(DISTANCE, "DISTANCE"));
                        adaptor.addChild(root_0, stream_distanceValue.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:158:4: pressureValue
                    {
                    pushFollow(FOLLOW_pressureValue_in_altitudeValue760);
                    pressureValue81=pressureValue();

                    state._fsp--;

                    stream_pressureValue.add(pressureValue81.getTree());


                    // AST REWRITE
                    // elements: pressureValue
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 159:2: -> PRESSURE pressureValue
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(PRESSURE, "PRESSURE"));
                        adaptor.addChild(root_0, stream_pressureValue.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:160:4: FlightLevel
                    {
                    FlightLevel82=(Token)match(input,FlightLevel,FOLLOW_FlightLevel_in_altitudeValue772);  
                    stream_FlightLevel.add(FlightLevel82);



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
                    // 161:2: -> FLIGHTLEVEL FlightLevel
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

    public static class pressureValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pressureValue"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:164:1: pressureValue : numericValue pressureUnit ;
    public final flipsParser.pressureValue_return pressureValue() throws RecognitionException {
        flipsParser.pressureValue_return retval = new flipsParser.pressureValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.numericValue_return numericValue83 = null;

        flipsParser.pressureUnit_return pressureUnit84 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:165:2: ( numericValue pressureUnit )
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:165:4: numericValue pressureUnit
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_numericValue_in_pressureValue790);
            numericValue83=numericValue();

            state._fsp--;

            adaptor.addChild(root_0, numericValue83.getTree());
            pushFollow(FOLLOW_pressureUnit_in_pressureValue792);
            pressureUnit84=pressureUnit();

            state._fsp--;

            adaptor.addChild(root_0, pressureUnit84.getTree());

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
    // $ANTLR end "pressureValue"

    public static class pressureUnit_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pressureUnit"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:168:1: pressureUnit : ( ( 'kpa' | 'kilopascal' | 'kilopascals' ) -> KILOPASCAL | ( 'hpa' | 'hectopascal' | 'hectopascals' ) -> HECTOPASCAL | ( 'pa' | 'pascal' | 'pascals' ) -> PASCAL | ( 'bar' | 'bars' ) -> BAR | ( 'mbar' | 'millibar' | 'millibars' ) -> MILLIBAR | ( 'atm' | 'atms' | 'atmosphere' | 'atmospheres' ) -> ATMOSPHERE );
    public final flipsParser.pressureUnit_return pressureUnit() throws RecognitionException {
        flipsParser.pressureUnit_return retval = new flipsParser.pressureUnit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal85=null;
        Token string_literal86=null;
        Token string_literal87=null;
        Token string_literal88=null;
        Token string_literal89=null;
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

        CommonTree string_literal85_tree=null;
        CommonTree string_literal86_tree=null;
        CommonTree string_literal87_tree=null;
        CommonTree string_literal88_tree=null;
        CommonTree string_literal89_tree=null;
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
        RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
        RewriteRuleTokenStream stream_97=new RewriteRuleTokenStream(adaptor,"token 97");
        RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
        RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
        RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");

        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:169:2: ( ( 'kpa' | 'kilopascal' | 'kilopascals' ) -> KILOPASCAL | ( 'hpa' | 'hectopascal' | 'hectopascals' ) -> HECTOPASCAL | ( 'pa' | 'pascal' | 'pascals' ) -> PASCAL | ( 'bar' | 'bars' ) -> BAR | ( 'mbar' | 'millibar' | 'millibars' ) -> MILLIBAR | ( 'atm' | 'atms' | 'atmosphere' | 'atmospheres' ) -> ATMOSPHERE )
            int alt42=6;
            switch ( input.LA(1) ) {
            case 82:
            case 83:
            case 84:
                {
                alt42=1;
                }
                break;
            case 85:
            case 86:
            case 87:
                {
                alt42=2;
                }
                break;
            case 88:
            case 89:
            case 90:
                {
                alt42=3;
                }
                break;
            case 91:
            case 92:
                {
                alt42=4;
                }
                break;
            case 93:
            case 94:
            case 95:
                {
                alt42=5;
                }
                break;
            case 96:
            case 97:
            case 98:
            case 99:
                {
                alt42=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:169:4: ( 'kpa' | 'kilopascal' | 'kilopascals' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:169:4: ( 'kpa' | 'kilopascal' | 'kilopascals' )
                    int alt36=3;
                    switch ( input.LA(1) ) {
                    case 82:
                        {
                        alt36=1;
                        }
                        break;
                    case 83:
                        {
                        alt36=2;
                        }
                        break;
                    case 84:
                        {
                        alt36=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 0, input);

                        throw nvae;
                    }

                    switch (alt36) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:169:5: 'kpa'
                            {
                            string_literal85=(Token)match(input,82,FOLLOW_82_in_pressureUnit804);  
                            stream_82.add(string_literal85);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:169:11: 'kilopascal'
                            {
                            string_literal86=(Token)match(input,83,FOLLOW_83_in_pressureUnit806);  
                            stream_83.add(string_literal86);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:169:24: 'kilopascals'
                            {
                            string_literal87=(Token)match(input,84,FOLLOW_84_in_pressureUnit808);  
                            stream_84.add(string_literal87);


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
                    // 170:2: -> KILOPASCAL
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(KILOPASCAL, "KILOPASCAL"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:171:4: ( 'hpa' | 'hectopascal' | 'hectopascals' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:171:4: ( 'hpa' | 'hectopascal' | 'hectopascals' )
                    int alt37=3;
                    switch ( input.LA(1) ) {
                    case 85:
                        {
                        alt37=1;
                        }
                        break;
                    case 86:
                        {
                        alt37=2;
                        }
                        break;
                    case 87:
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
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:171:5: 'hpa'
                            {
                            string_literal88=(Token)match(input,85,FOLLOW_85_in_pressureUnit820);  
                            stream_85.add(string_literal88);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:171:11: 'hectopascal'
                            {
                            string_literal89=(Token)match(input,86,FOLLOW_86_in_pressureUnit822);  
                            stream_86.add(string_literal89);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:171:25: 'hectopascals'
                            {
                            string_literal90=(Token)match(input,87,FOLLOW_87_in_pressureUnit824);  
                            stream_87.add(string_literal90);


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
                    // 172:2: -> HECTOPASCAL
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(HECTOPASCAL, "HECTOPASCAL"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:173:4: ( 'pa' | 'pascal' | 'pascals' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:173:4: ( 'pa' | 'pascal' | 'pascals' )
                    int alt38=3;
                    switch ( input.LA(1) ) {
                    case 88:
                        {
                        alt38=1;
                        }
                        break;
                    case 89:
                        {
                        alt38=2;
                        }
                        break;
                    case 90:
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
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:173:5: 'pa'
                            {
                            string_literal91=(Token)match(input,88,FOLLOW_88_in_pressureUnit836);  
                            stream_88.add(string_literal91);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:173:10: 'pascal'
                            {
                            string_literal92=(Token)match(input,89,FOLLOW_89_in_pressureUnit838);  
                            stream_89.add(string_literal92);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:173:19: 'pascals'
                            {
                            string_literal93=(Token)match(input,90,FOLLOW_90_in_pressureUnit840);  
                            stream_90.add(string_literal93);


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
                    // 174:2: -> PASCAL
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(PASCAL, "PASCAL"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:175:4: ( 'bar' | 'bars' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:175:4: ( 'bar' | 'bars' )
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==91) ) {
                        alt39=1;
                    }
                    else if ( (LA39_0==92) ) {
                        alt39=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 39, 0, input);

                        throw nvae;
                    }
                    switch (alt39) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:175:5: 'bar'
                            {
                            string_literal94=(Token)match(input,91,FOLLOW_91_in_pressureUnit852);  
                            stream_91.add(string_literal94);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:175:11: 'bars'
                            {
                            string_literal95=(Token)match(input,92,FOLLOW_92_in_pressureUnit854);  
                            stream_92.add(string_literal95);


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
                    // 176:2: -> BAR
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(BAR, "BAR"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:177:4: ( 'mbar' | 'millibar' | 'millibars' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:177:4: ( 'mbar' | 'millibar' | 'millibars' )
                    int alt40=3;
                    switch ( input.LA(1) ) {
                    case 93:
                        {
                        alt40=1;
                        }
                        break;
                    case 94:
                        {
                        alt40=2;
                        }
                        break;
                    case 95:
                        {
                        alt40=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 0, input);

                        throw nvae;
                    }

                    switch (alt40) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:177:5: 'mbar'
                            {
                            string_literal96=(Token)match(input,93,FOLLOW_93_in_pressureUnit866);  
                            stream_93.add(string_literal96);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:177:12: 'millibar'
                            {
                            string_literal97=(Token)match(input,94,FOLLOW_94_in_pressureUnit868);  
                            stream_94.add(string_literal97);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:177:23: 'millibars'
                            {
                            string_literal98=(Token)match(input,95,FOLLOW_95_in_pressureUnit870);  
                            stream_95.add(string_literal98);


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
                    // 178:2: -> MILLIBAR
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MILLIBAR, "MILLIBAR"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:179:4: ( 'atm' | 'atms' | 'atmosphere' | 'atmospheres' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:179:4: ( 'atm' | 'atms' | 'atmosphere' | 'atmospheres' )
                    int alt41=4;
                    switch ( input.LA(1) ) {
                    case 96:
                        {
                        alt41=1;
                        }
                        break;
                    case 97:
                        {
                        alt41=2;
                        }
                        break;
                    case 98:
                        {
                        alt41=3;
                        }
                        break;
                    case 99:
                        {
                        alt41=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 0, input);

                        throw nvae;
                    }

                    switch (alt41) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:179:5: 'atm'
                            {
                            string_literal99=(Token)match(input,96,FOLLOW_96_in_pressureUnit882);  
                            stream_96.add(string_literal99);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:179:11: 'atms'
                            {
                            string_literal100=(Token)match(input,97,FOLLOW_97_in_pressureUnit884);  
                            stream_97.add(string_literal100);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:179:18: 'atmosphere'
                            {
                            string_literal101=(Token)match(input,98,FOLLOW_98_in_pressureUnit886);  
                            stream_98.add(string_literal101);


                            }
                            break;
                        case 4 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:179:31: 'atmospheres'
                            {
                            string_literal102=(Token)match(input,99,FOLLOW_99_in_pressureUnit888);  
                            stream_99.add(string_literal102);


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
                    // 180:2: -> ATMOSPHERE
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(ATMOSPHERE, "ATMOSPHERE"));

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
    // $ANTLR end "pressureUnit"

    public static class distance_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "distance"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:185:1: distance : ( leftRightDirection )? distanceValue -> ^( DISTANCE ( leftRightDirection )? distanceValue ) ;
    public final flipsParser.distance_return distance() throws RecognitionException {
        flipsParser.distance_return retval = new flipsParser.distance_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.leftRightDirection_return leftRightDirection103 = null;

        flipsParser.distanceValue_return distanceValue104 = null;


        RewriteRuleSubtreeStream stream_leftRightDirection=new RewriteRuleSubtreeStream(adaptor,"rule leftRightDirection");
        RewriteRuleSubtreeStream stream_distanceValue=new RewriteRuleSubtreeStream(adaptor,"rule distanceValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:186:2: ( ( leftRightDirection )? distanceValue -> ^( DISTANCE ( leftRightDirection )? distanceValue ) )
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:186:4: ( leftRightDirection )? distanceValue
            {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:186:4: ( leftRightDirection )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=137 && LA43_0<=142)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:186:4: leftRightDirection
                    {
                    pushFollow(FOLLOW_leftRightDirection_in_distance907);
                    leftRightDirection103=leftRightDirection();

                    state._fsp--;

                    stream_leftRightDirection.add(leftRightDirection103.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_distanceValue_in_distance910);
            distanceValue104=distanceValue();

            state._fsp--;

            stream_distanceValue.add(distanceValue104.getTree());


            // AST REWRITE
            // elements: distanceValue, leftRightDirection
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 187:2: -> ^( DISTANCE ( leftRightDirection )? distanceValue )
            {
                // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:187:5: ^( DISTANCE ( leftRightDirection )? distanceValue )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DISTANCE, "DISTANCE"), root_1);

                // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:187:16: ( leftRightDirection )?
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
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:190:1: distanceValue : numericValue distanceUnit ;
    public final flipsParser.distanceValue_return distanceValue() throws RecognitionException {
        flipsParser.distanceValue_return retval = new flipsParser.distanceValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.numericValue_return numericValue105 = null;

        flipsParser.distanceUnit_return distanceUnit106 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:191:2: ( numericValue distanceUnit )
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:191:4: numericValue distanceUnit
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_numericValue_in_distanceValue933);
            numericValue105=numericValue();

            state._fsp--;

            adaptor.addChild(root_0, numericValue105.getTree());
            pushFollow(FOLLOW_distanceUnit_in_distanceValue935);
            distanceUnit106=distanceUnit();

            state._fsp--;

            adaptor.addChild(root_0, distanceUnit106.getTree());

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
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:194:1: distanceUnit : ( ( 'km' | 'kilometer' | 'kilometers' ) -> KILOMETER | ( 'm' | 'meter' | 'meters' ) -> METER | ( 'nm' | 'nautical' ( 'mi' | 'mile' | 'miles' ) ) -> NAUTICAL MILE | ( 'statute' )? ( 'mi' | 'mile' | 'miles' ) -> MILE | ( 'yd' | 'yard' | 'yards' ) -> YARD | ( 'ft' | 'foot' | 'feet' ) -> FOOT );
    public final flipsParser.distanceUnit_return distanceUnit() throws RecognitionException {
        flipsParser.distanceUnit_return retval = new flipsParser.distanceUnit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal107=null;
        Token string_literal108=null;
        Token string_literal109=null;
        Token char_literal110=null;
        Token string_literal111=null;
        Token string_literal112=null;
        Token string_literal113=null;
        Token string_literal114=null;
        Token string_literal115=null;
        Token string_literal116=null;
        Token string_literal117=null;
        Token string_literal118=null;
        Token string_literal119=null;
        Token string_literal120=null;
        Token string_literal121=null;
        Token string_literal122=null;
        Token string_literal123=null;
        Token string_literal124=null;
        Token string_literal125=null;
        Token string_literal126=null;
        Token string_literal127=null;

        CommonTree string_literal107_tree=null;
        CommonTree string_literal108_tree=null;
        CommonTree string_literal109_tree=null;
        CommonTree char_literal110_tree=null;
        CommonTree string_literal111_tree=null;
        CommonTree string_literal112_tree=null;
        CommonTree string_literal113_tree=null;
        CommonTree string_literal114_tree=null;
        CommonTree string_literal115_tree=null;
        CommonTree string_literal116_tree=null;
        CommonTree string_literal117_tree=null;
        CommonTree string_literal118_tree=null;
        CommonTree string_literal119_tree=null;
        CommonTree string_literal120_tree=null;
        CommonTree string_literal121_tree=null;
        CommonTree string_literal122_tree=null;
        CommonTree string_literal123_tree=null;
        CommonTree string_literal124_tree=null;
        CommonTree string_literal125_tree=null;
        CommonTree string_literal126_tree=null;
        CommonTree string_literal127_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");

        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:195:2: ( ( 'km' | 'kilometer' | 'kilometers' ) -> KILOMETER | ( 'm' | 'meter' | 'meters' ) -> METER | ( 'nm' | 'nautical' ( 'mi' | 'mile' | 'miles' ) ) -> NAUTICAL MILE | ( 'statute' )? ( 'mi' | 'mile' | 'miles' ) -> MILE | ( 'yd' | 'yard' | 'yards' ) -> YARD | ( 'ft' | 'foot' | 'feet' ) -> FOOT )
            int alt52=6;
            switch ( input.LA(1) ) {
            case 100:
            case 101:
            case 102:
                {
                alt52=1;
                }
                break;
            case 103:
            case 104:
            case 105:
                {
                alt52=2;
                }
                break;
            case 106:
            case 107:
                {
                alt52=3;
                }
                break;
            case 108:
            case 109:
            case 110:
            case 111:
                {
                alt52=4;
                }
                break;
            case 112:
            case 113:
            case 114:
                {
                alt52=5;
                }
                break;
            case 115:
            case 116:
            case 117:
                {
                alt52=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:195:4: ( 'km' | 'kilometer' | 'kilometers' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:195:4: ( 'km' | 'kilometer' | 'kilometers' )
                    int alt44=3;
                    switch ( input.LA(1) ) {
                    case 100:
                        {
                        alt44=1;
                        }
                        break;
                    case 101:
                        {
                        alt44=2;
                        }
                        break;
                    case 102:
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
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:195:5: 'km'
                            {
                            string_literal107=(Token)match(input,100,FOLLOW_100_in_distanceUnit947);  
                            stream_100.add(string_literal107);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:195:10: 'kilometer'
                            {
                            string_literal108=(Token)match(input,101,FOLLOW_101_in_distanceUnit949);  
                            stream_101.add(string_literal108);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:195:22: 'kilometers'
                            {
                            string_literal109=(Token)match(input,102,FOLLOW_102_in_distanceUnit951);  
                            stream_102.add(string_literal109);


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
                    // 196:2: -> KILOMETER
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(KILOMETER, "KILOMETER"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:197:4: ( 'm' | 'meter' | 'meters' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:197:4: ( 'm' | 'meter' | 'meters' )
                    int alt45=3;
                    switch ( input.LA(1) ) {
                    case 103:
                        {
                        alt45=1;
                        }
                        break;
                    case 104:
                        {
                        alt45=2;
                        }
                        break;
                    case 105:
                        {
                        alt45=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 0, input);

                        throw nvae;
                    }

                    switch (alt45) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:197:5: 'm'
                            {
                            char_literal110=(Token)match(input,103,FOLLOW_103_in_distanceUnit963);  
                            stream_103.add(char_literal110);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:197:9: 'meter'
                            {
                            string_literal111=(Token)match(input,104,FOLLOW_104_in_distanceUnit965);  
                            stream_104.add(string_literal111);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:197:17: 'meters'
                            {
                            string_literal112=(Token)match(input,105,FOLLOW_105_in_distanceUnit967);  
                            stream_105.add(string_literal112);


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
                    // 198:2: -> METER
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(METER, "METER"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:199:4: ( 'nm' | 'nautical' ( 'mi' | 'mile' | 'miles' ) )
                    {
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:199:4: ( 'nm' | 'nautical' ( 'mi' | 'mile' | 'miles' ) )
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==106) ) {
                        alt47=1;
                    }
                    else if ( (LA47_0==107) ) {
                        alt47=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 47, 0, input);

                        throw nvae;
                    }
                    switch (alt47) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:199:5: 'nm'
                            {
                            string_literal113=(Token)match(input,106,FOLLOW_106_in_distanceUnit979);  
                            stream_106.add(string_literal113);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:199:10: 'nautical' ( 'mi' | 'mile' | 'miles' )
                            {
                            string_literal114=(Token)match(input,107,FOLLOW_107_in_distanceUnit981);  
                            stream_107.add(string_literal114);

                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:199:21: ( 'mi' | 'mile' | 'miles' )
                            int alt46=3;
                            switch ( input.LA(1) ) {
                            case 108:
                                {
                                alt46=1;
                                }
                                break;
                            case 109:
                                {
                                alt46=2;
                                }
                                break;
                            case 110:
                                {
                                alt46=3;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 46, 0, input);

                                throw nvae;
                            }

                            switch (alt46) {
                                case 1 :
                                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:199:22: 'mi'
                                    {
                                    string_literal115=(Token)match(input,108,FOLLOW_108_in_distanceUnit984);  
                                    stream_108.add(string_literal115);


                                    }
                                    break;
                                case 2 :
                                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:199:27: 'mile'
                                    {
                                    string_literal116=(Token)match(input,109,FOLLOW_109_in_distanceUnit986);  
                                    stream_109.add(string_literal116);


                                    }
                                    break;
                                case 3 :
                                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:199:34: 'miles'
                                    {
                                    string_literal117=(Token)match(input,110,FOLLOW_110_in_distanceUnit988);  
                                    stream_110.add(string_literal117);


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
                    // 200:2: -> NAUTICAL MILE
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NAUTICAL, "NAUTICAL"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MILE, "MILE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:201:4: ( 'statute' )? ( 'mi' | 'mile' | 'miles' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:201:4: ( 'statute' )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==111) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:201:5: 'statute'
                            {
                            string_literal118=(Token)match(input,111,FOLLOW_111_in_distanceUnit1003);  
                            stream_111.add(string_literal118);


                            }
                            break;

                    }

                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:201:17: ( 'mi' | 'mile' | 'miles' )
                    int alt49=3;
                    switch ( input.LA(1) ) {
                    case 108:
                        {
                        alt49=1;
                        }
                        break;
                    case 109:
                        {
                        alt49=2;
                        }
                        break;
                    case 110:
                        {
                        alt49=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 49, 0, input);

                        throw nvae;
                    }

                    switch (alt49) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:201:18: 'mi'
                            {
                            string_literal119=(Token)match(input,108,FOLLOW_108_in_distanceUnit1008);  
                            stream_108.add(string_literal119);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:201:23: 'mile'
                            {
                            string_literal120=(Token)match(input,109,FOLLOW_109_in_distanceUnit1010);  
                            stream_109.add(string_literal120);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:201:30: 'miles'
                            {
                            string_literal121=(Token)match(input,110,FOLLOW_110_in_distanceUnit1012);  
                            stream_110.add(string_literal121);


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
                    // 202:2: -> MILE
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MILE, "MILE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:203:4: ( 'yd' | 'yard' | 'yards' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:203:4: ( 'yd' | 'yard' | 'yards' )
                    int alt50=3;
                    switch ( input.LA(1) ) {
                    case 112:
                        {
                        alt50=1;
                        }
                        break;
                    case 113:
                        {
                        alt50=2;
                        }
                        break;
                    case 114:
                        {
                        alt50=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 50, 0, input);

                        throw nvae;
                    }

                    switch (alt50) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:203:5: 'yd'
                            {
                            string_literal122=(Token)match(input,112,FOLLOW_112_in_distanceUnit1024);  
                            stream_112.add(string_literal122);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:203:10: 'yard'
                            {
                            string_literal123=(Token)match(input,113,FOLLOW_113_in_distanceUnit1026);  
                            stream_113.add(string_literal123);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:203:17: 'yards'
                            {
                            string_literal124=(Token)match(input,114,FOLLOW_114_in_distanceUnit1028);  
                            stream_114.add(string_literal124);


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
                    // 204:2: -> YARD
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(YARD, "YARD"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:205:4: ( 'ft' | 'foot' | 'feet' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:205:4: ( 'ft' | 'foot' | 'feet' )
                    int alt51=3;
                    switch ( input.LA(1) ) {
                    case 115:
                        {
                        alt51=1;
                        }
                        break;
                    case 116:
                        {
                        alt51=2;
                        }
                        break;
                    case 117:
                        {
                        alt51=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 51, 0, input);

                        throw nvae;
                    }

                    switch (alt51) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:205:5: 'ft'
                            {
                            string_literal125=(Token)match(input,115,FOLLOW_115_in_distanceUnit1040);  
                            stream_115.add(string_literal125);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:205:10: 'foot'
                            {
                            string_literal126=(Token)match(input,116,FOLLOW_116_in_distanceUnit1042);  
                            stream_116.add(string_literal126);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:205:17: 'feet'
                            {
                            string_literal127=(Token)match(input,117,FOLLOW_117_in_distanceUnit1044);  
                            stream_117.add(string_literal127);


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
                    // 206:2: -> FOOT
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
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:209:1: northSouthDirection : ( ( 'n' | 'north' ) -> NORTH | ( 's' | 'south' ) -> SOUTH );
    public final flipsParser.northSouthDirection_return northSouthDirection() throws RecognitionException {
        flipsParser.northSouthDirection_return retval = new flipsParser.northSouthDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal128=null;
        Token string_literal129=null;
        Token char_literal130=null;
        Token string_literal131=null;

        CommonTree char_literal128_tree=null;
        CommonTree string_literal129_tree=null;
        CommonTree char_literal130_tree=null;
        CommonTree string_literal131_tree=null;
        RewriteRuleTokenStream stream_121=new RewriteRuleTokenStream(adaptor,"token 121");
        RewriteRuleTokenStream stream_120=new RewriteRuleTokenStream(adaptor,"token 120");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");

        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:210:2: ( ( 'n' | 'north' ) -> NORTH | ( 's' | 'south' ) -> SOUTH )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=118 && LA55_0<=119)) ) {
                alt55=1;
            }
            else if ( ((LA55_0>=120 && LA55_0<=121)) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:210:4: ( 'n' | 'north' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:210:4: ( 'n' | 'north' )
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==118) ) {
                        alt53=1;
                    }
                    else if ( (LA53_0==119) ) {
                        alt53=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 53, 0, input);

                        throw nvae;
                    }
                    switch (alt53) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:210:5: 'n'
                            {
                            char_literal128=(Token)match(input,118,FOLLOW_118_in_northSouthDirection1062);  
                            stream_118.add(char_literal128);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:210:9: 'north'
                            {
                            string_literal129=(Token)match(input,119,FOLLOW_119_in_northSouthDirection1064);  
                            stream_119.add(string_literal129);


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
                    // 211:2: -> NORTH
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NORTH, "NORTH"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:212:4: ( 's' | 'south' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:212:4: ( 's' | 'south' )
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==120) ) {
                        alt54=1;
                    }
                    else if ( (LA54_0==121) ) {
                        alt54=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 54, 0, input);

                        throw nvae;
                    }
                    switch (alt54) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:212:5: 's'
                            {
                            char_literal130=(Token)match(input,120,FOLLOW_120_in_northSouthDirection1076);  
                            stream_120.add(char_literal130);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:212:9: 'south'
                            {
                            string_literal131=(Token)match(input,121,FOLLOW_121_in_northSouthDirection1078);  
                            stream_121.add(string_literal131);


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
                    // 213:2: -> SOUTH
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
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:216:1: eastWestDirection : ( ( 'e' | 'east' ) -> EAST | ( 'w' | 'west' ) -> WEST );
    public final flipsParser.eastWestDirection_return eastWestDirection() throws RecognitionException {
        flipsParser.eastWestDirection_return retval = new flipsParser.eastWestDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal132=null;
        Token string_literal133=null;
        Token char_literal134=null;
        Token string_literal135=null;

        CommonTree char_literal132_tree=null;
        CommonTree string_literal133_tree=null;
        CommonTree char_literal134_tree=null;
        CommonTree string_literal135_tree=null;
        RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleTokenStream stream_124=new RewriteRuleTokenStream(adaptor,"token 124");

        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:217:2: ( ( 'e' | 'east' ) -> EAST | ( 'w' | 'west' ) -> WEST )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=122 && LA58_0<=123)) ) {
                alt58=1;
            }
            else if ( ((LA58_0>=124 && LA58_0<=125)) ) {
                alt58=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:217:4: ( 'e' | 'east' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:217:4: ( 'e' | 'east' )
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==122) ) {
                        alt56=1;
                    }
                    else if ( (LA56_0==123) ) {
                        alt56=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 56, 0, input);

                        throw nvae;
                    }
                    switch (alt56) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:217:5: 'e'
                            {
                            char_literal132=(Token)match(input,122,FOLLOW_122_in_eastWestDirection1096);  
                            stream_122.add(char_literal132);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:217:9: 'east'
                            {
                            string_literal133=(Token)match(input,123,FOLLOW_123_in_eastWestDirection1098);  
                            stream_123.add(string_literal133);


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
                    // 218:2: -> EAST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:219:4: ( 'w' | 'west' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:219:4: ( 'w' | 'west' )
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==124) ) {
                        alt57=1;
                    }
                    else if ( (LA57_0==125) ) {
                        alt57=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 57, 0, input);

                        throw nvae;
                    }
                    switch (alt57) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:219:5: 'w'
                            {
                            char_literal134=(Token)match(input,124,FOLLOW_124_in_eastWestDirection1110);  
                            stream_124.add(char_literal134);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:219:9: 'west'
                            {
                            string_literal135=(Token)match(input,125,FOLLOW_125_in_eastWestDirection1112);  
                            stream_125.add(string_literal135);


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
                    // 220:2: -> WEST
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
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:223:1: upDownDirection : ( ( 'u' | 'up' | 'c' | 'climb' | 'climbing' | 'ascend' | 'ascending' ) -> CLIMB | ( 'd' | 'down' | 'descend' | 'descending' ) -> DESCEND );
    public final flipsParser.upDownDirection_return upDownDirection() throws RecognitionException {
        flipsParser.upDownDirection_return retval = new flipsParser.upDownDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal136=null;
        Token string_literal137=null;
        Token char_literal138=null;
        Token string_literal139=null;
        Token string_literal140=null;
        Token string_literal141=null;
        Token string_literal142=null;
        Token char_literal143=null;
        Token string_literal144=null;
        Token string_literal145=null;
        Token string_literal146=null;

        CommonTree char_literal136_tree=null;
        CommonTree string_literal137_tree=null;
        CommonTree char_literal138_tree=null;
        CommonTree string_literal139_tree=null;
        CommonTree string_literal140_tree=null;
        CommonTree string_literal141_tree=null;
        CommonTree string_literal142_tree=null;
        CommonTree char_literal143_tree=null;
        CommonTree string_literal144_tree=null;
        CommonTree string_literal145_tree=null;
        CommonTree string_literal146_tree=null;
        RewriteRuleTokenStream stream_134=new RewriteRuleTokenStream(adaptor,"token 134");
        RewriteRuleTokenStream stream_135=new RewriteRuleTokenStream(adaptor,"token 135");
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleTokenStream stream_132=new RewriteRuleTokenStream(adaptor,"token 132");
        RewriteRuleTokenStream stream_133=new RewriteRuleTokenStream(adaptor,"token 133");
        RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");
        RewriteRuleTokenStream stream_136=new RewriteRuleTokenStream(adaptor,"token 136");
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleTokenStream stream_131=new RewriteRuleTokenStream(adaptor,"token 131");
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");

        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:224:2: ( ( 'u' | 'up' | 'c' | 'climb' | 'climbing' | 'ascend' | 'ascending' ) -> CLIMB | ( 'd' | 'down' | 'descend' | 'descending' ) -> DESCEND )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( ((LA61_0>=126 && LA61_0<=132)) ) {
                alt61=1;
            }
            else if ( ((LA61_0>=133 && LA61_0<=136)) ) {
                alt61=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:224:4: ( 'u' | 'up' | 'c' | 'climb' | 'climbing' | 'ascend' | 'ascending' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:224:4: ( 'u' | 'up' | 'c' | 'climb' | 'climbing' | 'ascend' | 'ascending' )
                    int alt59=7;
                    switch ( input.LA(1) ) {
                    case 126:
                        {
                        alt59=1;
                        }
                        break;
                    case 127:
                        {
                        alt59=2;
                        }
                        break;
                    case 128:
                        {
                        alt59=3;
                        }
                        break;
                    case 129:
                        {
                        alt59=4;
                        }
                        break;
                    case 130:
                        {
                        alt59=5;
                        }
                        break;
                    case 131:
                        {
                        alt59=6;
                        }
                        break;
                    case 132:
                        {
                        alt59=7;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 59, 0, input);

                        throw nvae;
                    }

                    switch (alt59) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:224:5: 'u'
                            {
                            char_literal136=(Token)match(input,126,FOLLOW_126_in_upDownDirection1130);  
                            stream_126.add(char_literal136);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:224:9: 'up'
                            {
                            string_literal137=(Token)match(input,127,FOLLOW_127_in_upDownDirection1132);  
                            stream_127.add(string_literal137);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:224:14: 'c'
                            {
                            char_literal138=(Token)match(input,128,FOLLOW_128_in_upDownDirection1134);  
                            stream_128.add(char_literal138);


                            }
                            break;
                        case 4 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:224:18: 'climb'
                            {
                            string_literal139=(Token)match(input,129,FOLLOW_129_in_upDownDirection1136);  
                            stream_129.add(string_literal139);


                            }
                            break;
                        case 5 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:224:26: 'climbing'
                            {
                            string_literal140=(Token)match(input,130,FOLLOW_130_in_upDownDirection1138);  
                            stream_130.add(string_literal140);


                            }
                            break;
                        case 6 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:224:37: 'ascend'
                            {
                            string_literal141=(Token)match(input,131,FOLLOW_131_in_upDownDirection1140);  
                            stream_131.add(string_literal141);


                            }
                            break;
                        case 7 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:224:46: 'ascending'
                            {
                            string_literal142=(Token)match(input,132,FOLLOW_132_in_upDownDirection1142);  
                            stream_132.add(string_literal142);


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
                    // 225:2: -> CLIMB
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(CLIMB, "CLIMB"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:226:4: ( 'd' | 'down' | 'descend' | 'descending' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:226:4: ( 'd' | 'down' | 'descend' | 'descending' )
                    int alt60=4;
                    switch ( input.LA(1) ) {
                    case 133:
                        {
                        alt60=1;
                        }
                        break;
                    case 134:
                        {
                        alt60=2;
                        }
                        break;
                    case 135:
                        {
                        alt60=3;
                        }
                        break;
                    case 136:
                        {
                        alt60=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 60, 0, input);

                        throw nvae;
                    }

                    switch (alt60) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:226:5: 'd'
                            {
                            char_literal143=(Token)match(input,133,FOLLOW_133_in_upDownDirection1154);  
                            stream_133.add(char_literal143);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:226:9: 'down'
                            {
                            string_literal144=(Token)match(input,134,FOLLOW_134_in_upDownDirection1156);  
                            stream_134.add(string_literal144);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:226:16: 'descend'
                            {
                            string_literal145=(Token)match(input,135,FOLLOW_135_in_upDownDirection1158);  
                            stream_135.add(string_literal145);


                            }
                            break;
                        case 4 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:226:26: 'descending'
                            {
                            string_literal146=(Token)match(input,136,FOLLOW_136_in_upDownDirection1160);  
                            stream_136.add(string_literal146);


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
                    // 227:2: -> DESCEND
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
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:230:1: leftRightDirection : ( ( 'l' | 'left' | 'port' ) -> LEFT | ( 'r' | 'right' | 'starboard' ) -> RIGHT );
    public final flipsParser.leftRightDirection_return leftRightDirection() throws RecognitionException {
        flipsParser.leftRightDirection_return retval = new flipsParser.leftRightDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal147=null;
        Token string_literal148=null;
        Token string_literal149=null;
        Token char_literal150=null;
        Token string_literal151=null;
        Token string_literal152=null;

        CommonTree char_literal147_tree=null;
        CommonTree string_literal148_tree=null;
        CommonTree string_literal149_tree=null;
        CommonTree char_literal150_tree=null;
        CommonTree string_literal151_tree=null;
        CommonTree string_literal152_tree=null;
        RewriteRuleTokenStream stream_138=new RewriteRuleTokenStream(adaptor,"token 138");
        RewriteRuleTokenStream stream_139=new RewriteRuleTokenStream(adaptor,"token 139");
        RewriteRuleTokenStream stream_137=new RewriteRuleTokenStream(adaptor,"token 137");
        RewriteRuleTokenStream stream_140=new RewriteRuleTokenStream(adaptor,"token 140");
        RewriteRuleTokenStream stream_142=new RewriteRuleTokenStream(adaptor,"token 142");
        RewriteRuleTokenStream stream_141=new RewriteRuleTokenStream(adaptor,"token 141");

        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:231:2: ( ( 'l' | 'left' | 'port' ) -> LEFT | ( 'r' | 'right' | 'starboard' ) -> RIGHT )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( ((LA64_0>=137 && LA64_0<=139)) ) {
                alt64=1;
            }
            else if ( ((LA64_0>=140 && LA64_0<=142)) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:231:4: ( 'l' | 'left' | 'port' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:231:4: ( 'l' | 'left' | 'port' )
                    int alt62=3;
                    switch ( input.LA(1) ) {
                    case 137:
                        {
                        alt62=1;
                        }
                        break;
                    case 138:
                        {
                        alt62=2;
                        }
                        break;
                    case 139:
                        {
                        alt62=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 62, 0, input);

                        throw nvae;
                    }

                    switch (alt62) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:231:5: 'l'
                            {
                            char_literal147=(Token)match(input,137,FOLLOW_137_in_leftRightDirection1178);  
                            stream_137.add(char_literal147);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:231:9: 'left'
                            {
                            string_literal148=(Token)match(input,138,FOLLOW_138_in_leftRightDirection1180);  
                            stream_138.add(string_literal148);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:231:16: 'port'
                            {
                            string_literal149=(Token)match(input,139,FOLLOW_139_in_leftRightDirection1182);  
                            stream_139.add(string_literal149);


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
                    // 232:2: -> LEFT
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(LEFT, "LEFT"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:233:4: ( 'r' | 'right' | 'starboard' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:233:4: ( 'r' | 'right' | 'starboard' )
                    int alt63=3;
                    switch ( input.LA(1) ) {
                    case 140:
                        {
                        alt63=1;
                        }
                        break;
                    case 141:
                        {
                        alt63=2;
                        }
                        break;
                    case 142:
                        {
                        alt63=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 63, 0, input);

                        throw nvae;
                    }

                    switch (alt63) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:233:5: 'r'
                            {
                            char_literal150=(Token)match(input,140,FOLLOW_140_in_leftRightDirection1194);  
                            stream_140.add(char_literal150);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:233:9: 'right'
                            {
                            string_literal151=(Token)match(input,141,FOLLOW_141_in_leftRightDirection1196);  
                            stream_141.add(string_literal151);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:233:17: 'starboard'
                            {
                            string_literal152=(Token)match(input,142,FOLLOW_142_in_leftRightDirection1198);  
                            stream_142.add(string_literal152);


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
                    // 234:2: -> RIGHT
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
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:237:1: angularValue : ( numericValue ( 'deg' | 'degs' | 'degree' | 'degrees' ) -> numericValue DEGREE | integerValue 'd' numericValue '\\'' -> integerValue DEGREE numericValue MINUTE | numericValue ( 'rad' | 'rads' | 'radian' | 'radians' ) -> numericValue RADIAN );
    public final flipsParser.angularValue_return angularValue() throws RecognitionException {
        flipsParser.angularValue_return retval = new flipsParser.angularValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal154=null;
        Token string_literal155=null;
        Token string_literal156=null;
        Token string_literal157=null;
        Token char_literal159=null;
        Token char_literal161=null;
        Token string_literal163=null;
        Token string_literal164=null;
        Token string_literal165=null;
        Token string_literal166=null;
        flipsParser.numericValue_return numericValue153 = null;

        flipsParser.integerValue_return integerValue158 = null;

        flipsParser.numericValue_return numericValue160 = null;

        flipsParser.numericValue_return numericValue162 = null;


        CommonTree string_literal154_tree=null;
        CommonTree string_literal155_tree=null;
        CommonTree string_literal156_tree=null;
        CommonTree string_literal157_tree=null;
        CommonTree char_literal159_tree=null;
        CommonTree char_literal161_tree=null;
        CommonTree string_literal163_tree=null;
        CommonTree string_literal164_tree=null;
        CommonTree string_literal165_tree=null;
        CommonTree string_literal166_tree=null;
        RewriteRuleTokenStream stream_143=new RewriteRuleTokenStream(adaptor,"token 143");
        RewriteRuleTokenStream stream_144=new RewriteRuleTokenStream(adaptor,"token 144");
        RewriteRuleTokenStream stream_150=new RewriteRuleTokenStream(adaptor,"token 150");
        RewriteRuleTokenStream stream_145=new RewriteRuleTokenStream(adaptor,"token 145");
        RewriteRuleTokenStream stream_151=new RewriteRuleTokenStream(adaptor,"token 151");
        RewriteRuleTokenStream stream_133=new RewriteRuleTokenStream(adaptor,"token 133");
        RewriteRuleTokenStream stream_146=new RewriteRuleTokenStream(adaptor,"token 146");
        RewriteRuleTokenStream stream_147=new RewriteRuleTokenStream(adaptor,"token 147");
        RewriteRuleTokenStream stream_148=new RewriteRuleTokenStream(adaptor,"token 148");
        RewriteRuleTokenStream stream_149=new RewriteRuleTokenStream(adaptor,"token 149");
        RewriteRuleSubtreeStream stream_integerValue=new RewriteRuleSubtreeStream(adaptor,"rule integerValue");
        RewriteRuleSubtreeStream stream_numericValue=new RewriteRuleSubtreeStream(adaptor,"rule numericValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:238:2: ( numericValue ( 'deg' | 'degs' | 'degree' | 'degrees' ) -> numericValue DEGREE | integerValue 'd' numericValue '\\'' -> integerValue DEGREE numericValue MINUTE | numericValue ( 'rad' | 'rads' | 'radian' | 'radians' ) -> numericValue RADIAN )
            int alt67=3;
            int LA67_0 = input.LA(1);

            if ( ((LA67_0>=BinaryLiteral && LA67_0<=HexLiteral)) ) {
                switch ( input.LA(2) ) {
                case 133:
                    {
                    alt67=2;
                    }
                    break;
                case 148:
                case 149:
                case 150:
                case 151:
                    {
                    alt67=3;
                    }
                    break;
                case 143:
                case 144:
                case 145:
                case 146:
                    {
                    alt67=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 67, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA67_0==FloatingPointLiteral) ) {
                int LA67_2 = input.LA(2);

                if ( ((LA67_2>=148 && LA67_2<=151)) ) {
                    alt67=3;
                }
                else if ( ((LA67_2>=143 && LA67_2<=146)) ) {
                    alt67=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 67, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:238:4: numericValue ( 'deg' | 'degs' | 'degree' | 'degrees' )
                    {
                    pushFollow(FOLLOW_numericValue_in_angularValue1215);
                    numericValue153=numericValue();

                    state._fsp--;

                    stream_numericValue.add(numericValue153.getTree());
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:238:17: ( 'deg' | 'degs' | 'degree' | 'degrees' )
                    int alt65=4;
                    switch ( input.LA(1) ) {
                    case 143:
                        {
                        alt65=1;
                        }
                        break;
                    case 144:
                        {
                        alt65=2;
                        }
                        break;
                    case 145:
                        {
                        alt65=3;
                        }
                        break;
                    case 146:
                        {
                        alt65=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 65, 0, input);

                        throw nvae;
                    }

                    switch (alt65) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:238:18: 'deg'
                            {
                            string_literal154=(Token)match(input,143,FOLLOW_143_in_angularValue1218);  
                            stream_143.add(string_literal154);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:238:24: 'degs'
                            {
                            string_literal155=(Token)match(input,144,FOLLOW_144_in_angularValue1220);  
                            stream_144.add(string_literal155);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:238:31: 'degree'
                            {
                            string_literal156=(Token)match(input,145,FOLLOW_145_in_angularValue1222);  
                            stream_145.add(string_literal156);


                            }
                            break;
                        case 4 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:238:40: 'degrees'
                            {
                            string_literal157=(Token)match(input,146,FOLLOW_146_in_angularValue1224);  
                            stream_146.add(string_literal157);


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
                    // 239:2: -> numericValue DEGREE
                    {
                        adaptor.addChild(root_0, stream_numericValue.nextTree());
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(DEGREE, "DEGREE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:240:4: integerValue 'd' numericValue '\\''
                    {
                    pushFollow(FOLLOW_integerValue_in_angularValue1237);
                    integerValue158=integerValue();

                    state._fsp--;

                    stream_integerValue.add(integerValue158.getTree());
                    char_literal159=(Token)match(input,133,FOLLOW_133_in_angularValue1239);  
                    stream_133.add(char_literal159);

                    pushFollow(FOLLOW_numericValue_in_angularValue1241);
                    numericValue160=numericValue();

                    state._fsp--;

                    stream_numericValue.add(numericValue160.getTree());
                    char_literal161=(Token)match(input,147,FOLLOW_147_in_angularValue1243);  
                    stream_147.add(char_literal161);



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
                    // 241:2: -> integerValue DEGREE numericValue MINUTE
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
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:242:4: numericValue ( 'rad' | 'rads' | 'radian' | 'radians' )
                    {
                    pushFollow(FOLLOW_numericValue_in_angularValue1259);
                    numericValue162=numericValue();

                    state._fsp--;

                    stream_numericValue.add(numericValue162.getTree());
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:242:17: ( 'rad' | 'rads' | 'radian' | 'radians' )
                    int alt66=4;
                    switch ( input.LA(1) ) {
                    case 148:
                        {
                        alt66=1;
                        }
                        break;
                    case 149:
                        {
                        alt66=2;
                        }
                        break;
                    case 150:
                        {
                        alt66=3;
                        }
                        break;
                    case 151:
                        {
                        alt66=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 66, 0, input);

                        throw nvae;
                    }

                    switch (alt66) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:242:18: 'rad'
                            {
                            string_literal163=(Token)match(input,148,FOLLOW_148_in_angularValue1262);  
                            stream_148.add(string_literal163);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:242:24: 'rads'
                            {
                            string_literal164=(Token)match(input,149,FOLLOW_149_in_angularValue1264);  
                            stream_149.add(string_literal164);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:242:31: 'radian'
                            {
                            string_literal165=(Token)match(input,150,FOLLOW_150_in_angularValue1266);  
                            stream_150.add(string_literal165);


                            }
                            break;
                        case 4 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:242:40: 'radians'
                            {
                            string_literal166=(Token)match(input,151,FOLLOW_151_in_angularValue1268);  
                            stream_151.add(string_literal166);


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
                    // 243:2: -> numericValue RADIAN
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
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:248:1: waypoint : ( geoCoordinate -> geoCoordinate | Identifier -> ^( WAYPOINT Identifier ) );
    public final flipsParser.waypoint_return waypoint() throws RecognitionException {
        flipsParser.waypoint_return retval = new flipsParser.waypoint_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier168=null;
        flipsParser.geoCoordinate_return geoCoordinate167 = null;


        CommonTree Identifier168_tree=null;
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_geoCoordinate=new RewriteRuleSubtreeStream(adaptor,"rule geoCoordinate");
        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:249:2: ( geoCoordinate -> geoCoordinate | Identifier -> ^( WAYPOINT Identifier ) )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( ((LA68_0>=FloatingPointLiteral && LA68_0<=HexLiteral)||(LA68_0>=152 && LA68_0<=153)) ) {
                alt68=1;
            }
            else if ( (LA68_0==Identifier) ) {
                alt68=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:249:4: geoCoordinate
                    {
                    pushFollow(FOLLOW_geoCoordinate_in_waypoint1289);
                    geoCoordinate167=geoCoordinate();

                    state._fsp--;

                    stream_geoCoordinate.add(geoCoordinate167.getTree());


                    // AST REWRITE
                    // elements: geoCoordinate
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 250:2: -> geoCoordinate
                    {
                        adaptor.addChild(root_0, stream_geoCoordinate.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:251:4: Identifier
                    {
                    Identifier168=(Token)match(input,Identifier,FOLLOW_Identifier_in_waypoint1299);  
                    stream_Identifier.add(Identifier168);



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
                    // 252:2: -> ^( WAYPOINT Identifier )
                    {
                        // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:252:5: ^( WAYPOINT Identifier )
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
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:255:1: geoCoordinate : latitudeLongitude -> ^( GEOCOORDINATE latitudeLongitude ) ;
    public final flipsParser.geoCoordinate_return geoCoordinate() throws RecognitionException {
        flipsParser.geoCoordinate_return retval = new flipsParser.geoCoordinate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.latitudeLongitude_return latitudeLongitude169 = null;


        RewriteRuleSubtreeStream stream_latitudeLongitude=new RewriteRuleSubtreeStream(adaptor,"rule latitudeLongitude");
        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:256:2: ( latitudeLongitude -> ^( GEOCOORDINATE latitudeLongitude ) )
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:256:4: latitudeLongitude
            {
            pushFollow(FOLLOW_latitudeLongitude_in_geoCoordinate1319);
            latitudeLongitude169=latitudeLongitude();

            state._fsp--;

            stream_latitudeLongitude.add(latitudeLongitude169.getTree());


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
            // 257:2: -> ^( GEOCOORDINATE latitudeLongitude )
            {
                // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:257:5: ^( GEOCOORDINATE latitudeLongitude )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GEOCOORDINATE, "GEOCOORDINATE"), root_1);

                adaptor.addChild(root_1, stream_latitudeLongitude.nextTree());

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
    // $ANTLR end "geoCoordinate"

    public static class latitudeLongitude_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "latitudeLongitude"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:260:1: latitudeLongitude : (x= latitudeLongitudeValue northSouthDirection ( ',' )? y= latitudeLongitudeValue eastWestDirection -> ^( LATITUDE $x northSouthDirection ) ^( LONGITUDE $y eastWestDirection ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y EAST ) | '-' x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y EAST ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y WEST ) | '-' x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y WEST ) );
    public final flipsParser.latitudeLongitude_return latitudeLongitude() throws RecognitionException {
        flipsParser.latitudeLongitude_return retval = new flipsParser.latitudeLongitude_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal171=null;
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
        flipsParser.latitudeLongitudeValue_return x = null;

        flipsParser.latitudeLongitudeValue_return y = null;

        flipsParser.northSouthDirection_return northSouthDirection170 = null;

        flipsParser.eastWestDirection_return eastWestDirection172 = null;


        CommonTree char_literal171_tree=null;
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
        RewriteRuleTokenStream stream_152=new RewriteRuleTokenStream(adaptor,"token 152");
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleSubtreeStream stream_latitudeLongitudeValue=new RewriteRuleSubtreeStream(adaptor,"rule latitudeLongitudeValue");
        RewriteRuleSubtreeStream stream_eastWestDirection=new RewriteRuleSubtreeStream(adaptor,"rule eastWestDirection");
        RewriteRuleSubtreeStream stream_northSouthDirection=new RewriteRuleSubtreeStream(adaptor,"rule northSouthDirection");
        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:261:2: (x= latitudeLongitudeValue northSouthDirection ( ',' )? y= latitudeLongitudeValue eastWestDirection -> ^( LATITUDE $x northSouthDirection ) ^( LONGITUDE $y eastWestDirection ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y EAST ) | '-' x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y EAST ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y WEST ) | '-' x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y WEST ) )
            int alt78=5;
            alt78 = dfa78.predict(input);
            switch (alt78) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:261:4: x= latitudeLongitudeValue northSouthDirection ( ',' )? y= latitudeLongitudeValue eastWestDirection
                    {
                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude1341);
                    x=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(x.getTree());
                    pushFollow(FOLLOW_northSouthDirection_in_latitudeLongitude1343);
                    northSouthDirection170=northSouthDirection();

                    state._fsp--;

                    stream_northSouthDirection.add(northSouthDirection170.getTree());
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:261:49: ( ',' )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==67) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:261:49: ','
                            {
                            char_literal171=(Token)match(input,67,FOLLOW_67_in_latitudeLongitude1345);  
                            stream_67.add(char_literal171);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude1350);
                    y=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(y.getTree());
                    pushFollow(FOLLOW_eastWestDirection_in_latitudeLongitude1352);
                    eastWestDirection172=eastWestDirection();

                    state._fsp--;

                    stream_eastWestDirection.add(eastWestDirection172.getTree());


                    // AST REWRITE
                    // elements: x, eastWestDirection, y, northSouthDirection
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
                    // 262:2: -> ^( LATITUDE $x northSouthDirection ) ^( LONGITUDE $y eastWestDirection )
                    {
                        // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:262:5: ^( LATITUDE $x northSouthDirection )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LATITUDE, "LATITUDE"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, stream_northSouthDirection.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }
                        // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:262:40: ^( LONGITUDE $y eastWestDirection )
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
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:263:4: ( '+' )? x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue
                    {
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:263:4: ( '+' )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==152) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:263:4: '+'
                            {
                            char_literal173=(Token)match(input,152,FOLLOW_152_in_latitudeLongitude1378);  
                            stream_152.add(char_literal173);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude1383);
                    x=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(x.getTree());
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:263:34: ( ',' )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==67) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:263:34: ','
                            {
                            char_literal174=(Token)match(input,67,FOLLOW_67_in_latitudeLongitude1385);  
                            stream_67.add(char_literal174);


                            }
                            break;

                    }

                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:263:39: ( '+' )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==152) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:263:39: '+'
                            {
                            char_literal175=(Token)match(input,152,FOLLOW_152_in_latitudeLongitude1388);  
                            stream_152.add(char_literal175);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude1393);
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
                    // 264:2: -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y EAST )
                    {
                        // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:264:5: ^( LATITUDE $x NORTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LATITUDE, "LATITUDE"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NORTH, "NORTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:264:26: ^( LONGITUDE $y EAST )
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
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:265:4: '-' x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue
                    {
                    char_literal176=(Token)match(input,153,FOLLOW_153_in_latitudeLongitude1419);  
                    stream_153.add(char_literal176);

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude1423);
                    x=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(x.getTree());
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:265:33: ( ',' )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==67) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:265:33: ','
                            {
                            char_literal177=(Token)match(input,67,FOLLOW_67_in_latitudeLongitude1425);  
                            stream_67.add(char_literal177);


                            }
                            break;

                    }

                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:265:38: ( '+' )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==152) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:265:38: '+'
                            {
                            char_literal178=(Token)match(input,152,FOLLOW_152_in_latitudeLongitude1428);  
                            stream_152.add(char_literal178);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude1433);
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
                    // 266:2: -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y EAST )
                    {
                        // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:266:5: ^( LATITUDE $x SOUTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LATITUDE, "LATITUDE"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(SOUTH, "SOUTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:266:26: ^( LONGITUDE $y EAST )
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
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:267:4: ( '+' )? x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue
                    {
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:267:4: ( '+' )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==152) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:267:4: '+'
                            {
                            char_literal179=(Token)match(input,152,FOLLOW_152_in_latitudeLongitude1459);  
                            stream_152.add(char_literal179);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude1464);
                    x=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(x.getTree());
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:267:34: ( ',' )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==67) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:267:34: ','
                            {
                            char_literal180=(Token)match(input,67,FOLLOW_67_in_latitudeLongitude1466);  
                            stream_67.add(char_literal180);


                            }
                            break;

                    }

                    char_literal181=(Token)match(input,153,FOLLOW_153_in_latitudeLongitude1469);  
                    stream_153.add(char_literal181);

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude1473);
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
                    // 268:2: -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y WEST )
                    {
                        // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:268:5: ^( LATITUDE $x NORTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LATITUDE, "LATITUDE"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NORTH, "NORTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:268:26: ^( LONGITUDE $y WEST )
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
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:269:4: '-' x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue
                    {
                    char_literal182=(Token)match(input,153,FOLLOW_153_in_latitudeLongitude1499);  
                    stream_153.add(char_literal182);

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude1503);
                    x=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(x.getTree());
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:269:33: ( ',' )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==67) ) {
                        alt77=1;
                    }
                    switch (alt77) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:269:33: ','
                            {
                            char_literal183=(Token)match(input,67,FOLLOW_67_in_latitudeLongitude1505);  
                            stream_67.add(char_literal183);


                            }
                            break;

                    }

                    char_literal184=(Token)match(input,153,FOLLOW_153_in_latitudeLongitude1508);  
                    stream_153.add(char_literal184);

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude1512);
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
                    // 270:2: -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y WEST )
                    {
                        // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:270:5: ^( LATITUDE $x SOUTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LATITUDE, "LATITUDE"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(SOUTH, "SOUTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:270:26: ^( LONGITUDE $y WEST )
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
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:273:1: latitudeLongitudeValue : ( numericValue -> numericValue DEGREE | angularValue );
    public final flipsParser.latitudeLongitudeValue_return latitudeLongitudeValue() throws RecognitionException {
        flipsParser.latitudeLongitudeValue_return retval = new flipsParser.latitudeLongitudeValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.numericValue_return numericValue185 = null;

        flipsParser.angularValue_return angularValue186 = null;


        RewriteRuleSubtreeStream stream_numericValue=new RewriteRuleSubtreeStream(adaptor,"rule numericValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:274:2: ( numericValue -> numericValue DEGREE | angularValue )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( ((LA79_0>=BinaryLiteral && LA79_0<=HexLiteral)) ) {
                switch ( input.LA(2) ) {
                case 143:
                case 144:
                case 145:
                case 146:
                case 148:
                case 149:
                case 150:
                case 151:
                    {
                    alt79=2;
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
                case 62:
                case 63:
                case 64:
                case 66:
                case 67:
                case 70:
                case 71:
                case 72:
                case 73:
                case 74:
                case 118:
                case 119:
                case 120:
                case 121:
                case 122:
                case 123:
                case 124:
                case 125:
                case 126:
                case 127:
                case 128:
                case 129:
                case 130:
                case 131:
                case 132:
                case 134:
                case 135:
                case 136:
                case 137:
                case 138:
                case 139:
                case 140:
                case 141:
                case 142:
                case 152:
                case 153:
                    {
                    alt79=1;
                    }
                    break;
                case 133:
                    {
                    switch ( input.LA(3) ) {
                    case BinaryLiteral:
                    case OctalLiteral:
                    case DecimalLiteral:
                    case HexLiteral:
                        {
                        int LA79_6 = input.LA(4);

                        if ( ((LA79_6>=82 && LA79_6<=117)) ) {
                            alt79=1;
                        }
                        else if ( (LA79_6==147) ) {
                            alt79=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 79, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    case FloatingPointLiteral:
                        {
                        int LA79_7 = input.LA(4);

                        if ( (LA79_7==147) ) {
                            alt79=2;
                        }
                        else if ( ((LA79_7>=82 && LA79_7<=117)) ) {
                            alt79=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 79, 7, input);

                            throw nvae;
                        }
                        }
                        break;
                    case To:
                    case FlightLevel:
                        {
                        alt79=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 79, 5, input);

                        throw nvae;
                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 79, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA79_0==FloatingPointLiteral) ) {
                int LA79_2 = input.LA(2);

                if ( (LA79_2==EOF||(LA79_2>=Identifier && LA79_2<=With)||(LA79_2>=FloatingPointLiteral && LA79_2<=HexLiteral)||(LA79_2>=62 && LA79_2<=64)||(LA79_2>=66 && LA79_2<=67)||(LA79_2>=70 && LA79_2<=74)||(LA79_2>=118 && LA79_2<=142)||(LA79_2>=152 && LA79_2<=153)) ) {
                    alt79=1;
                }
                else if ( ((LA79_2>=143 && LA79_2<=146)||(LA79_2>=148 && LA79_2<=151)) ) {
                    alt79=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 79, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:274:4: numericValue
                    {
                    pushFollow(FOLLOW_numericValue_in_latitudeLongitudeValue1544);
                    numericValue185=numericValue();

                    state._fsp--;

                    stream_numericValue.add(numericValue185.getTree());


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
                    // 275:2: -> numericValue DEGREE
                    {
                        adaptor.addChild(root_0, stream_numericValue.nextTree());
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(DEGREE, "DEGREE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:276:4: angularValue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_angularValue_in_latitudeLongitudeValue1556);
                    angularValue186=angularValue();

                    state._fsp--;

                    adaptor.addChild(root_0, angularValue186.getTree());

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

    public static class numericValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numericValue"
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:281:1: numericValue : ( integerValue | FloatingPointLiteral );
    public final flipsParser.numericValue_return numericValue() throws RecognitionException {
        flipsParser.numericValue_return retval = new flipsParser.numericValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FloatingPointLiteral188=null;
        flipsParser.integerValue_return integerValue187 = null;


        CommonTree FloatingPointLiteral188_tree=null;

        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:282:2: ( integerValue | FloatingPointLiteral )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( ((LA80_0>=BinaryLiteral && LA80_0<=HexLiteral)) ) {
                alt80=1;
            }
            else if ( (LA80_0==FloatingPointLiteral) ) {
                alt80=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:282:4: integerValue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_integerValue_in_numericValue1569);
                    integerValue187=integerValue();

                    state._fsp--;

                    adaptor.addChild(root_0, integerValue187.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:283:4: FloatingPointLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    FloatingPointLiteral188=(Token)match(input,FloatingPointLiteral,FOLLOW_FloatingPointLiteral_in_numericValue1574); 
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
    // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:286:1: integerValue : ( BinaryLiteral | OctalLiteral | DecimalLiteral | HexLiteral );
    public final flipsParser.integerValue_return integerValue() throws RecognitionException {
        flipsParser.integerValue_return retval = new flipsParser.integerValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set189=null;

        CommonTree set189_tree=null;

        try {
            // /Users/reunice/Documents/flips-uav/src/targets/matrixpilot/flips.g:287:2: ( BinaryLiteral | OctalLiteral | DecimalLiteral | HexLiteral )
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
    protected DFA78 dfa78 = new DFA78(this);
    static final String DFA25_eotS =
        "\16\uffff";
    static final String DFA25_eofS =
        "\16\uffff";
    static final String DFA25_minS =
        "\14\54\2\uffff";
    static final String DFA25_maxS =
        "\1\u0088\13\64\2\uffff";
    static final String DFA25_acceptS =
        "\14\uffff\1\1\1\2";
    static final String DFA25_specialS =
        "\16\uffff}>";
    static final String[] DFA25_transitionS = {
            "\3\14\117\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1"+
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
            return "140:1: altitude : ( fixedAltitude | relativeAltitude );";
        }
    }
    static final String DFA78_eotS =
        "\64\uffff";
    static final String DFA78_eofS =
        "\64\uffff";
    static final String DFA78_minS =
        "\16\60\1\uffff\1\60\2\uffff\4\60\2\u0093\12\60\1\uffff\4\60\1\uffff"+
        "\6\60\4\u0093\2\60";
    static final String DFA78_maxS =
        "\3\u0099\2\64\11\u0099\1\uffff\1\64\2\uffff\4\u0099\2\u0093\10\u0099"+
        "\1\64\1\u0099\1\uffff\4\u0099\1\uffff\4\u0099\1\64\1\u0099\4\u0093"+
        "\2\u0099";
    static final String DFA78_acceptS =
        "\16\uffff\1\4\1\uffff\1\1\1\2\20\uffff\1\3\4\uffff\1\5\14\uffff";
    static final String DFA78_specialS =
        "\64\uffff}>";
    static final String[] DFA78_transitionS = {
            "\1\2\4\1\143\uffff\1\3\1\4",
            "\5\21\16\uffff\1\15\62\uffff\4\20\13\uffff\1\17\11\uffff\1"+
            "\5\1\6\1\7\1\10\1\uffff\1\11\1\12\1\13\1\14\1\21\1\16",
            "\5\21\16\uffff\1\15\62\uffff\4\20\25\uffff\1\5\1\6\1\7\1\10"+
            "\1\uffff\1\11\1\12\1\13\1\14\1\21\1\16",
            "\1\23\4\22",
            "\1\25\4\24",
            "\5\21\16\uffff\1\15\62\uffff\4\20\36\uffff\1\21\1\16",
            "\5\21\16\uffff\1\15\62\uffff\4\20\36\uffff\1\21\1\16",
            "\5\21\16\uffff\1\15\62\uffff\4\20\36\uffff\1\21\1\16",
            "\5\21\16\uffff\1\15\62\uffff\4\20\36\uffff\1\21\1\16",
            "\5\21\16\uffff\1\15\62\uffff\4\20\36\uffff\1\21\1\16",
            "\5\21\16\uffff\1\15\62\uffff\4\20\36\uffff\1\21\1\16",
            "\5\21\16\uffff\1\15\62\uffff\4\20\36\uffff\1\21\1\16",
            "\5\21\16\uffff\1\15\62\uffff\4\20\36\uffff\1\21\1\16",
            "\5\21\143\uffff\1\21\1\16",
            "",
            "\1\27\4\26",
            "",
            "",
            "\5\21\16\uffff\1\15\101\uffff\1\40\11\uffff\1\30\1\31\1\32"+
            "\1\33\1\uffff\1\34\1\35\1\36\1\37\1\21\1\16",
            "\5\21\16\uffff\1\15\113\uffff\1\30\1\31\1\32\1\33\1\uffff\1"+
            "\34\1\35\1\36\1\37\1\21\1\16",
            "\5\42\16\uffff\1\41\101\uffff\1\54\11\uffff\1\43\1\44\1\45"+
            "\1\46\1\uffff\1\50\1\51\1\52\1\53\1\42\1\47",
            "\5\42\16\uffff\1\41\113\uffff\1\43\1\44\1\45\1\46\1\uffff\1"+
            "\50\1\51\1\52\1\53\1\42\1\47",
            "\1\55",
            "\1\55",
            "\5\21\16\uffff\1\15\124\uffff\1\21\1\16",
            "\5\21\16\uffff\1\15\124\uffff\1\21\1\16",
            "\5\21\16\uffff\1\15\124\uffff\1\21\1\16",
            "\5\21\16\uffff\1\15\124\uffff\1\21\1\16",
            "\5\21\16\uffff\1\15\124\uffff\1\21\1\16",
            "\5\21\16\uffff\1\15\124\uffff\1\21\1\16",
            "\5\21\16\uffff\1\15\124\uffff\1\21\1\16",
            "\5\21\16\uffff\1\15\124\uffff\1\21\1\16",
            "\1\57\4\56",
            "\5\42\143\uffff\1\42\1\47",
            "",
            "\5\42\16\uffff\1\41\124\uffff\1\42\1\47",
            "\5\42\16\uffff\1\41\124\uffff\1\42\1\47",
            "\5\42\16\uffff\1\41\124\uffff\1\42\1\47",
            "\5\42\16\uffff\1\41\124\uffff\1\42\1\47",
            "",
            "\5\42\16\uffff\1\41\124\uffff\1\42\1\47",
            "\5\42\16\uffff\1\41\124\uffff\1\42\1\47",
            "\5\42\16\uffff\1\41\124\uffff\1\42\1\47",
            "\5\42\16\uffff\1\41\124\uffff\1\42\1\47",
            "\1\61\4\60",
            "\5\21\16\uffff\1\15\62\uffff\4\20\36\uffff\1\21\1\16",
            "\1\62",
            "\1\62",
            "\1\63",
            "\1\63",
            "\5\21\16\uffff\1\15\124\uffff\1\21\1\16",
            "\5\42\16\uffff\1\41\124\uffff\1\42\1\47"
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
            return "260:1: latitudeLongitude : (x= latitudeLongitudeValue northSouthDirection ( ',' )? y= latitudeLongitudeValue eastWestDirection -> ^( LATITUDE $x northSouthDirection ) ^( LONGITUDE $y eastWestDirection ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y EAST ) | '-' x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y EAST ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y WEST ) | '-' x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y WEST ) );";
        }
    }
 

    public static final BitSet FOLLOW_define_in_flightPlan246 = new BitSet(new long[]{0xC000080000000002L,0x00000000000007C1L});
    public static final BitSet FOLLOW_command_in_flightPlan249 = new BitSet(new long[]{0x0000080000000002L,0x0000000000000600L});
    public static final BitSet FOLLOW_defineCommand_in_define276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defineWaypoint_in_define281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_defineCommand293 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_63_in_defineCommand295 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_64_in_defineCommand297 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_defineCommandValue_in_defineCommand300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_defineCommandValue316 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_defineCommandValue318 = new BitSet(new long[]{0x001E000000000000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue320 = new BitSet(new long[]{0x0000080000000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_66_in_defineCommandValue324 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_67_in_defineCommandValue326 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_defineCommandValue328 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_Identifier_in_defineCommandValue333 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_defineCommandValue335 = new BitSet(new long[]{0x001E000000000000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue337 = new BitSet(new long[]{0x0000080000000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_Identifier_in_defineCommandValue360 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_defineCommandValue362 = new BitSet(new long[]{0x001E000000000000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue364 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_defineCommandValue366 = new BitSet(new long[]{0x001E000000000000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue370 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_defineCommandValue372 = new BitSet(new long[]{0x0000080000000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_66_in_defineCommandValue376 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_67_in_defineCommandValue378 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_defineCommandValue380 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_Identifier_in_defineCommandValue385 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_defineCommandValue387 = new BitSet(new long[]{0x001E000000000000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue389 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_defineCommandValue391 = new BitSet(new long[]{0x001E000000000000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue395 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_defineCommandValue397 = new BitSet(new long[]{0x0000080000000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_70_in_defineWaypoint432 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_71_in_defineWaypoint434 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_72_in_defineWaypoint436 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_defineWaypointValue_in_defineWaypoint439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_defineWaypointValue455 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_defineWaypointValue457 = new BitSet(new long[]{0x001F000000000000L,0x0000000000000000L,0x0000000003000000L});
    public static final BitSet FOLLOW_geoCoordinate_in_defineWaypointValue459 = new BitSet(new long[]{0x0000080000000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_66_in_defineWaypointValue463 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_67_in_defineWaypointValue465 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_defineWaypointValue467 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_Identifier_in_defineWaypointValue472 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_defineWaypointValue474 = new BitSet(new long[]{0x001F000000000000L,0x0000000000000000L,0x0000000003000000L});
    public static final BitSet FOLLOW_geoCoordinate_in_defineWaypointValue476 = new BitSet(new long[]{0x0000080000000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_flyCommand_in_command503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_executeCommand_in_command508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_flyCommand520 = new BitSet(new long[]{0x001F700000000002L,0xC000000000000000L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_74_in_flyCommand522 = new BitSet(new long[]{0x001F700000000002L,0xC000000000000000L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_flyCommandValue_in_flyCommand525 = new BitSet(new long[]{0x001F700000000002L,0xC000000000000000L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_distance_in_flyCommandValue547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_To_in_flyCommandValue552 = new BitSet(new long[]{0x001F080000000000L,0x0000000000000000L,0x0000000003000000L});
    public static final BitSet FOLLOW_waypoint_in_flyCommandValue554 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_66_in_flyCommandValue558 = new BitSet(new long[]{0x001F080000000000L,0x0000000000000000L,0x0000000003000000L});
    public static final BitSet FOLLOW_67_in_flyCommandValue560 = new BitSet(new long[]{0x001F080000000000L,0x0000000000000004L,0x0000000003000000L});
    public static final BitSet FOLLOW_66_in_flyCommandValue562 = new BitSet(new long[]{0x001F080000000000L,0x0000000000000000L,0x0000000003000000L});
    public static final BitSet FOLLOW_waypoint_in_flyCommandValue566 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_altitude_in_flyCommandValue579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_executeCommand590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_executeCommand604 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_executeCommand606 = new BitSet(new long[]{0x001F000000000000L});
    public static final BitSet FOLLOW_numericValue_in_executeCommand608 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_67_in_executeCommand611 = new BitSet(new long[]{0x001F000000000000L});
    public static final BitSet FOLLOW_numericValue_in_executeCommand613 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_69_in_executeCommand618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fixedAltitude_in_altitude647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relativeAltitude_in_altitude652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_upDownDirection_in_fixedAltitude664 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_To_in_fixedAltitude667 = new BitSet(new long[]{0x001F800000000000L,0x000000000001F800L,0x0000000000007E00L});
    public static final BitSet FOLLOW_At_in_fixedAltitude669 = new BitSet(new long[]{0x001F800000000000L,0x000000000001F800L,0x0000000000007E00L});
    public static final BitSet FOLLOW_With_in_fixedAltitude671 = new BitSet(new long[]{0x001F800000000000L,0x000000000001F800L,0x0000000000007E00L});
    public static final BitSet FOLLOW_75_in_fixedAltitude676 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_76_in_fixedAltitude680 = new BitSet(new long[]{0x001F800000000000L,0x000000000003F800L,0x0000000000007E00L});
    public static final BitSet FOLLOW_77_in_fixedAltitude682 = new BitSet(new long[]{0x001F800000000000L,0x000000000003F800L,0x0000000000007E00L});
    public static final BitSet FOLLOW_78_in_fixedAltitude685 = new BitSet(new long[]{0x0000000000000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_79_in_fixedAltitude689 = new BitSet(new long[]{0x001F800000000000L,0x000000000003F800L,0x0000000000007E00L});
    public static final BitSet FOLLOW_80_in_fixedAltitude691 = new BitSet(new long[]{0x001F800000000000L,0x000000000003F800L,0x0000000000007E00L});
    public static final BitSet FOLLOW_81_in_fixedAltitude695 = new BitSet(new long[]{0x001F800000000000L,0x000000000001F800L,0x0000000000007E00L});
    public static final BitSet FOLLOW_altitudeValue_in_fixedAltitude700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_upDownDirection_in_relativeAltitude722 = new BitSet(new long[]{0x001F800000000000L,0x000000000001F800L,0x0000000000007E00L});
    public static final BitSet FOLLOW_altitudeValue_in_relativeAltitude724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_distanceValue_in_altitudeValue748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pressureValue_in_altitudeValue760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FlightLevel_in_altitudeValue772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_pressureValue790 = new BitSet(new long[]{0x0000000000000000L,0x0000000FFFFC0000L});
    public static final BitSet FOLLOW_pressureUnit_in_pressureValue792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_pressureUnit804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_pressureUnit806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_pressureUnit808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_pressureUnit820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_pressureUnit822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_pressureUnit824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_pressureUnit836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_pressureUnit838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_pressureUnit840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_pressureUnit852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_pressureUnit854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_pressureUnit866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_pressureUnit868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_pressureUnit870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_pressureUnit882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_pressureUnit884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_pressureUnit886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_pressureUnit888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_leftRightDirection_in_distance907 = new BitSet(new long[]{0x001F000000000000L,0x0000000000000000L,0x0000000000007E00L});
    public static final BitSet FOLLOW_distanceValue_in_distance910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_distanceValue933 = new BitSet(new long[]{0x0000000000000000L,0x003FFFF000000000L});
    public static final BitSet FOLLOW_distanceUnit_in_distanceValue935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_distanceUnit947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_distanceUnit949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_distanceUnit951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_distanceUnit963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_distanceUnit965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_distanceUnit967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_distanceUnit979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_distanceUnit981 = new BitSet(new long[]{0x0000000000000000L,0x0000700000000000L});
    public static final BitSet FOLLOW_108_in_distanceUnit984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_distanceUnit986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_distanceUnit988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_distanceUnit1003 = new BitSet(new long[]{0x0000000000000000L,0x0000700000000000L});
    public static final BitSet FOLLOW_108_in_distanceUnit1008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_distanceUnit1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_distanceUnit1012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_distanceUnit1024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_distanceUnit1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_distanceUnit1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_distanceUnit1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_distanceUnit1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_distanceUnit1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_northSouthDirection1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_northSouthDirection1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_northSouthDirection1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_northSouthDirection1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_eastWestDirection1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_eastWestDirection1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_eastWestDirection1110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_eastWestDirection1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_upDownDirection1130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_upDownDirection1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_upDownDirection1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_upDownDirection1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_upDownDirection1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_upDownDirection1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_upDownDirection1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_upDownDirection1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_upDownDirection1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_upDownDirection1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_upDownDirection1160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_leftRightDirection1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_leftRightDirection1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_leftRightDirection1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_leftRightDirection1194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_141_in_leftRightDirection1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_leftRightDirection1198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_angularValue1215 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000078000L});
    public static final BitSet FOLLOW_143_in_angularValue1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_144_in_angularValue1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_145_in_angularValue1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_angularValue1224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_angularValue1237 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_133_in_angularValue1239 = new BitSet(new long[]{0x001F000000000000L});
    public static final BitSet FOLLOW_numericValue_in_angularValue1241 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_147_in_angularValue1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_angularValue1259 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000F00000L});
    public static final BitSet FOLLOW_148_in_angularValue1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_149_in_angularValue1264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_150_in_angularValue1266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_151_in_angularValue1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_geoCoordinate_in_waypoint1289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_waypoint1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_latitudeLongitude_in_geoCoordinate1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude1341 = new BitSet(new long[]{0x0000000000000000L,0x03C0000000000000L});
    public static final BitSet FOLLOW_northSouthDirection_in_latitudeLongitude1343 = new BitSet(new long[]{0x001F000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_latitudeLongitude1345 = new BitSet(new long[]{0x001F000000000000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude1350 = new BitSet(new long[]{0x0000000000000000L,0x3C00000000000000L});
    public static final BitSet FOLLOW_eastWestDirection_in_latitudeLongitude1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_152_in_latitudeLongitude1378 = new BitSet(new long[]{0x001F000000000000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude1383 = new BitSet(new long[]{0x001F000000000000L,0x0000000000000008L,0x0000000001000000L});
    public static final BitSet FOLLOW_67_in_latitudeLongitude1385 = new BitSet(new long[]{0x001F000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_152_in_latitudeLongitude1388 = new BitSet(new long[]{0x001F000000000000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_latitudeLongitude1419 = new BitSet(new long[]{0x001F000000000000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude1423 = new BitSet(new long[]{0x001F000000000000L,0x0000000000000008L,0x0000000001000000L});
    public static final BitSet FOLLOW_67_in_latitudeLongitude1425 = new BitSet(new long[]{0x001F000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_152_in_latitudeLongitude1428 = new BitSet(new long[]{0x001F000000000000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_152_in_latitudeLongitude1459 = new BitSet(new long[]{0x001F000000000000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude1464 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L,0x0000000002000000L});
    public static final BitSet FOLLOW_67_in_latitudeLongitude1466 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_153_in_latitudeLongitude1469 = new BitSet(new long[]{0x001F000000000000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_latitudeLongitude1499 = new BitSet(new long[]{0x001F000000000000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude1503 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L,0x0000000002000000L});
    public static final BitSet FOLLOW_67_in_latitudeLongitude1505 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_153_in_latitudeLongitude1508 = new BitSet(new long[]{0x001F000000000000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude1512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_latitudeLongitudeValue1544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_angularValue_in_latitudeLongitudeValue1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_numericValue1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FloatingPointLiteral_in_numericValue1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_integerValue0 = new BitSet(new long[]{0x0000000000000002L});

}