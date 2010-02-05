// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/reunice/Documents/flips-uav/src/compiler/flips.g 2010-02-04 22:41:23

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class flipsParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FLIGHTPLAN", "DEFINE", "COMMAND", "PARAMETER", "SENSOR", "FLY", "LOITER", "EXECUTE", "DIRECTION", "TURN", "FIXED", "RELATIVE", "ROLL", "PITCH", "ALTITUDE", "SPEED", "FASTER", "SLOWER", "OPTIMAL", "THROTTLE", "TIME", "AM", "PM", "HOUR24", "DURATION", "RADIUS", "WAYPOINT", "GEOCOORDINATE", "LATITUDE", "LONGITUDE", "HOUR", "MINUTE", "SECOND", "DEGREE", "RADIAN", "DISTANCE", "KILOMETER", "METER", "NAUTICAL", "MILE", "YARD", "FOOT", "LEFT", "RIGHT", "CLOCKWISE", "COUNTERCLOCKWISE", "PERCENT", "FLIGHTLEVEL", "PRESSURE", "KILOPASCAL", "HECTOPASCAL", "PASCAL", "MINIMUM", "MAXIMUM", "CRUISE", "BAR", "MILLIBAR", "ATMOSPHERE", "CLIMB", "DESCEND", "NORTH", "SOUTH", "EAST", "WEST", "EQ", "NE", "LT", "GT", "LE", "GE", "Identifier", "To", "At", "With", "FlightLevel", "Turning", "Heading", "FloatingPointLiteral", "BinaryLiteral", "OctalLiteral", "DecimalLiteral", "HexLiteral", "Digit", "StringLiteral", "NonZeroDigit", "BinaryDigit", "HexDigit", "Exponent", "WS", "Comment", "LineComment", "'cmd'", "'command'", "'commands'", "'='", "'and'", "','", "'('", "')'", "'sen'", "'sensor'", "'sensors'", "'wpt'", "'waypoint'", "'waypoints'", "'fly'", "'go'", "'trn'", "'turn'", "'ltr'", "'loiter'", "'pit'", "'pitch'", "'an'", "'aoa'", "'angle of attack'", "'of'", "'rol'", "'roll'", "'alt'", "'altitude'", "'a'", "'pres'", "'pressure'", "'kpa'", "'kilopascal'", "'kilopascals'", "'hpa'", "'hectopascal'", "'hectopascals'", "'pa'", "'pascal'", "'pascals'", "'bar'", "'bars'", "'mbar'", "'millibar'", "'millibars'", "'atm'", "'atms'", "'atmosphere'", "'atmospheres'", "'in'", "'radius'", "'km'", "'kilometer'", "'kilometers'", "'m'", "'meter'", "'meters'", "'nm'", "'nautical'", "'mi'", "'mile'", "'miles'", "'statute'", "'yd'", "'yard'", "'yards'", "'ft'", "'foot'", "'feet'", "'faster'", "'slower'", "'kph'", "'mph'", "'kn'", "'kt'", "'kts'", "'knot'", "'knots'", "'/'", "'per'", "'spd'", "'speed'", "'min'", "'minimum'", "'cru'", "'cruise'", "'max'", "'maximum'", "'pwr'", "'power'", "'thr'", "'throttle'", "'am'", "'a.m.'", "'pm'", "'p.m.'", "':'", "'h'", "'hr'", "'hrs'", "'hour'", "'hours'", "'mins'", "'minute'", "'minutes'", "'s'", "'sec'", "'secs'", "'second'", "'seconds'", "'for'", "'n'", "'north'", "'south'", "'e'", "'east'", "'w'", "'west'", "'ne'", "'northeast'", "'se'", "'southeast'", "'sw'", "'southwest'", "'nw'", "'northwest'", "'nne'", "'north-northeast'", "'ene'", "'east-northeast'", "'ese'", "'east-southeast'", "'sse'", "'south-southeast'", "'ssw'", "'south-southwest'", "'wsw'", "'west-southwest'", "'wnw'", "'west-northwest'", "'nnw'", "'north-northwest'", "'u'", "'up'", "'c'", "'climb'", "'climbing'", "'ascend'", "'ascending'", "'d'", "'down'", "'descend'", "'descending'", "'l'", "'left'", "'port'", "'r'", "'right'", "'starboard'", "'cw'", "'clockwise'", "'ccw'", "'counterclockwise'", "'deg'", "'degs'", "'degree'", "'degrees'", "'\\''", "'rad'", "'rads'", "'radian'", "'radians'", "'+'", "'-'", "'%'", "'percent'"
    };
    public static final int DIRECTION=12;
    public static final int T__159=159;
    public static final int T__158=158;
    public static final int T__259=259;
    public static final int T__258=258;
    public static final int T__257=257;
    public static final int FIXED=14;
    public static final int T__262=262;
    public static final int T__160=160;
    public static final int T__263=263;
    public static final int GEOCOORDINATE=31;
    public static final int T__260=260;
    public static final int T__261=261;
    public static final int T__266=266;
    public static final int T__267=267;
    public static final int SOUTH=65;
    public static final int T__264=264;
    public static final int FOOT=45;
    public static final int T__265=265;
    public static final int T__167=167;
    public static final int T__168=168;
    public static final int EOF=-1;
    public static final int T__165=165;
    public static final int T__166=166;
    public static final int T__163=163;
    public static final int HECTOPASCAL=54;
    public static final int T__164=164;
    public static final int T__161=161;
    public static final int T__162=162;
    public static final int DISTANCE=39;
    public static final int FASTER=20;
    public static final int T__148=148;
    public static final int T__147=147;
    public static final int To=75;
    public static final int T__149=149;
    public static final int T__247=247;
    public static final int T__246=246;
    public static final int MINIMUM=56;
    public static final int T__249=249;
    public static final int T__248=248;
    public static final int T__250=250;
    public static final int T__251=251;
    public static final int T__252=252;
    public static final int T__253=253;
    public static final int T__254=254;
    public static final int KILOMETER=40;
    public static final int T__255=255;
    public static final int EQ=68;
    public static final int T__256=256;
    public static final int T__154=154;
    public static final int T__155=155;
    public static final int T__156=156;
    public static final int T__157=157;
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
    public static final int SENSOR=8;
    public static final int GE=73;
    public static final int T__137=137;
    public static final int T__136=136;
    public static final int YARD=44;
    public static final int T__141=141;
    public static final int T__142=142;
    public static final int T__140=140;
    public static final int T__145=145;
    public static final int With=77;
    public static final int DURATION=28;
    public static final int T__146=146;
    public static final int T__143=143;
    public static final int T__144=144;
    public static final int T__126=126;
    public static final int CRUISE=58;
    public static final int T__125=125;
    public static final int T__128=128;
    public static final int T__127=127;
    public static final int WS=92;
    public static final int T__129=129;
    public static final int OPTIMAL=22;
    public static final int BinaryLiteral=82;
    public static final int BinaryDigit=89;
    public static final int THROTTLE=23;
    public static final int T__269=269;
    public static final int FloatingPointLiteral=81;
    public static final int T__268=268;
    public static final int GT=71;
    public static final int T__271=271;
    public static final int METER=41;
    public static final int T__272=272;
    public static final int T__130=130;
    public static final int T__131=131;
    public static final int T__270=270;
    public static final int T__132=132;
    public static final int RADIUS=29;
    public static final int T__133=133;
    public static final int T__134=134;
    public static final int T__135=135;
    public static final int T__215=215;
    public static final int T__216=216;
    public static final int T__213=213;
    public static final int T__214=214;
    public static final int T__219=219;
    public static final int T__217=217;
    public static final int T__218=218;
    public static final int T__118=118;
    public static final int EXECUTE=11;
    public static final int T__119=119;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__124=124;
    public static final int T__123=123;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__120=120;
    public static final int HexDigit=90;
    public static final int T__223=223;
    public static final int T__222=222;
    public static final int T__221=221;
    public static final int T__220=220;
    public static final int T__202=202;
    public static final int WAYPOINT=30;
    public static final int TIME=24;
    public static final int T__203=203;
    public static final int T__204=204;
    public static final int T__205=205;
    public static final int T__206=206;
    public static final int T__207=207;
    public static final int T__208=208;
    public static final int T__209=209;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int LEFT=46;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int FLIGHTLEVEL=51;
    public static final int T__112=112;
    public static final int T__210=210;
    public static final int AM=25;
    public static final int T__212=212;
    public static final int T__211=211;
    public static final int HexLiteral=85;
    public static final int T__239=239;
    public static final int T__237=237;
    public static final int T__238=238;
    public static final int At=76;
    public static final int T__235=235;
    public static final int T__236=236;
    public static final int PITCH=17;
    public static final int RIGHT=47;
    public static final int RELATIVE=15;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int EAST=66;
    public static final int T__100=100;
    public static final int HOUR=34;
    public static final int T__245=245;
    public static final int T__244=244;
    public static final int T__243=243;
    public static final int ALTITUDE=18;
    public static final int T__242=242;
    public static final int T__241=241;
    public static final int T__240=240;
    public static final int StringLiteral=87;
    public static final int T__228=228;
    public static final int T__229=229;
    public static final int T__224=224;
    public static final int T__225=225;
    public static final int T__226=226;
    public static final int NAUTICAL=42;
    public static final int T__227=227;
    public static final int NonZeroDigit=88;
    public static final int NORTH=64;
    public static final int T__232=232;
    public static final int T__231=231;
    public static final int T__234=234;
    public static final int T__233=233;
    public static final int DESCEND=63;
    public static final int T__230=230;
    public static final int LT=70;
    public static final int OctalLiteral=83;
    public static final int LATITUDE=32;
    public static final int ATMOSPHERE=61;
    public static final int Identifier=74;
    public static final int COMMAND=6;
    public static final int Comment=93;
    public static final int MILLIBAR=60;
    public static final int PARAMETER=7;
    public static final int COUNTERCLOCKWISE=49;
    public static final int FlightLevel=78;
    public static final int NE=69;
    public static final int SECOND=36;
    public static final int CLIMB=62;
    public static final int ROLL=16;
    public static final int HOUR24=27;
    public static final int RADIAN=38;
    public static final int PASCAL=55;
    public static final int DEGREE=37;
    public static final int TURN=13;
    public static final int SLOWER=21;
    public static final int T__200=200;
    public static final int FLY=9;
    public static final int T__201=201;
    public static final int PM=26;
    public static final int LONGITUDE=33;
    public static final int PRESSURE=52;
    public static final int MILE=43;
    public static final int LineComment=94;
    public static final int Exponent=91;
    public static final int DEFINE=5;
    public static final int WEST=67;
    public static final int T__199=199;
    public static final int T__198=198;
    public static final int T__197=197;
    public static final int T__196=196;
    public static final int T__195=195;
    public static final int T__194=194;
    public static final int T__193=193;
    public static final int T__192=192;
    public static final int T__191=191;
    public static final int SPEED=19;
    public static final int T__190=190;
    public static final int T__184=184;
    public static final int T__183=183;
    public static final int T__186=186;
    public static final int T__185=185;
    public static final int T__188=188;
    public static final int T__187=187;
    public static final int PERCENT=50;
    public static final int T__189=189;
    public static final int Heading=80;
    public static final int T__180=180;
    public static final int T__182=182;
    public static final int T__181=181;
    public static final int Digit=86;
    public static final int DecimalLiteral=84;
    public static final int T__175=175;
    public static final int T__174=174;
    public static final int FLIGHTPLAN=4;
    public static final int T__173=173;
    public static final int T__172=172;
    public static final int Turning=79;
    public static final int T__179=179;
    public static final int T__178=178;
    public static final int KILOPASCAL=53;
    public static final int T__177=177;
    public static final int T__176=176;
    public static final int CLOCKWISE=48;
    public static final int T__171=171;
    public static final int T__170=170;
    public static final int LOITER=10;
    public static final int MAXIMUM=57;
    public static final int MINUTE=35;
    public static final int T__169=169;
    public static final int LE=72;
    public static final int BAR=59;

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
    public String getGrammarFileName() { return "/Users/reunice/Documents/flips-uav/src/compiler/flips.g"; }


    public static class flightPlan_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "flightPlan"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:109:1: flightPlan : ( define )* ( command )* -> ^( FLIGHTPLAN ( define )* ( command )* ) ;
    public final flipsParser.flightPlan_return flightPlan() throws RecognitionException {
        flipsParser.flightPlan_return retval = new flipsParser.flightPlan_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.define_return define1 = null;

        flipsParser.command_return command2 = null;


        RewriteRuleSubtreeStream stream_define=new RewriteRuleSubtreeStream(adaptor,"rule define");
        RewriteRuleSubtreeStream stream_command=new RewriteRuleSubtreeStream(adaptor,"rule command");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:110:2: ( ( define )* ( command )* -> ^( FLIGHTPLAN ( define )* ( command )* ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:110:4: ( define )* ( command )*
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:110:4: ( define )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=95 && LA1_0<=97)||(LA1_0>=103 && LA1_0<=108)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:110:4: define
            	    {
            	    pushFollow(FOLLOW_define_in_flightPlan401);
            	    define1=define();

            	    state._fsp--;

            	    stream_define.add(define1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:110:12: ( command )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==Identifier||(LA2_0>=109 && LA2_0<=114)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:110:12: command
            	    {
            	    pushFollow(FOLLOW_command_in_flightPlan404);
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
            // 111:2: -> ^( FLIGHTPLAN ( define )* ( command )* )
            {
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:111:5: ^( FLIGHTPLAN ( define )* ( command )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FLIGHTPLAN, "FLIGHTPLAN"), root_1);

                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:111:18: ( define )*
                while ( stream_define.hasNext() ) {
                    adaptor.addChild(root_1, stream_define.nextTree());

                }
                stream_define.reset();
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:111:26: ( command )*
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:116:1: define : ( defineCommand | defineSensor | defineWaypoint );
    public final flipsParser.define_return define() throws RecognitionException {
        flipsParser.define_return retval = new flipsParser.define_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.defineCommand_return defineCommand3 = null;

        flipsParser.defineSensor_return defineSensor4 = null;

        flipsParser.defineWaypoint_return defineWaypoint5 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:117:2: ( defineCommand | defineSensor | defineWaypoint )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 95:
            case 96:
            case 97:
                {
                alt3=1;
                }
                break;
            case 103:
            case 104:
            case 105:
                {
                alt3=2;
                }
                break;
            case 106:
            case 107:
            case 108:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:117:4: defineCommand
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_defineCommand_in_define431);
                    defineCommand3=defineCommand();

                    state._fsp--;

                    adaptor.addChild(root_0, defineCommand3.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:118:4: defineSensor
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_defineSensor_in_define436);
                    defineSensor4=defineSensor();

                    state._fsp--;

                    adaptor.addChild(root_0, defineSensor4.getTree());

                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:119:4: defineWaypoint
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_defineWaypoint_in_define441);
                    defineWaypoint5=defineWaypoint();

                    state._fsp--;

                    adaptor.addChild(root_0, defineWaypoint5.getTree());

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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:122:1: defineCommand : ( 'cmd' | 'command' | 'commands' ) defineCommandValue -> defineCommandValue ;
    public final flipsParser.defineCommand_return defineCommand() throws RecognitionException {
        flipsParser.defineCommand_return retval = new flipsParser.defineCommand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal6=null;
        Token string_literal7=null;
        Token string_literal8=null;
        flipsParser.defineCommandValue_return defineCommandValue9 = null;


        CommonTree string_literal6_tree=null;
        CommonTree string_literal7_tree=null;
        CommonTree string_literal8_tree=null;
        RewriteRuleTokenStream stream_97=new RewriteRuleTokenStream(adaptor,"token 97");
        RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
        RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
        RewriteRuleSubtreeStream stream_defineCommandValue=new RewriteRuleSubtreeStream(adaptor,"rule defineCommandValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:123:2: ( ( 'cmd' | 'command' | 'commands' ) defineCommandValue -> defineCommandValue )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:123:4: ( 'cmd' | 'command' | 'commands' ) defineCommandValue
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:123:4: ( 'cmd' | 'command' | 'commands' )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 95:
                {
                alt4=1;
                }
                break;
            case 96:
                {
                alt4=2;
                }
                break;
            case 97:
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:123:5: 'cmd'
                    {
                    string_literal6=(Token)match(input,95,FOLLOW_95_in_defineCommand453);  
                    stream_95.add(string_literal6);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:123:11: 'command'
                    {
                    string_literal7=(Token)match(input,96,FOLLOW_96_in_defineCommand455);  
                    stream_96.add(string_literal7);


                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:123:21: 'commands'
                    {
                    string_literal8=(Token)match(input,97,FOLLOW_97_in_defineCommand457);  
                    stream_97.add(string_literal8);


                    }
                    break;

            }

            pushFollow(FOLLOW_defineCommandValue_in_defineCommand460);
            defineCommandValue9=defineCommandValue();

            state._fsp--;

            stream_defineCommandValue.add(defineCommandValue9.getTree());


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
            // 124:2: -> defineCommandValue
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:127:1: defineCommandValue : ( Identifier '=' integerValue ( ( 'and' | ',' ( 'and' )? )? Identifier '=' integerValue )* -> ( ^( DEFINE Identifier ^( COMMAND integerValue ) ) )+ | Identifier '=' cmd= integerValue '(' par= integerValue ')' ( ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue '(' par= integerValue ')' )* -> ( ^( DEFINE Identifier ^( COMMAND $cmd PARAMETER $par) ) )+ );
    public final flipsParser.defineCommandValue_return defineCommandValue() throws RecognitionException {
        flipsParser.defineCommandValue_return retval = new flipsParser.defineCommandValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier10=null;
        Token char_literal11=null;
        Token string_literal13=null;
        Token char_literal14=null;
        Token string_literal15=null;
        Token Identifier16=null;
        Token char_literal17=null;
        Token Identifier19=null;
        Token char_literal20=null;
        Token char_literal21=null;
        Token char_literal22=null;
        Token string_literal23=null;
        Token char_literal24=null;
        Token string_literal25=null;
        Token Identifier26=null;
        Token char_literal27=null;
        Token char_literal28=null;
        Token char_literal29=null;
        flipsParser.integerValue_return cmd = null;

        flipsParser.integerValue_return par = null;

        flipsParser.integerValue_return integerValue12 = null;

        flipsParser.integerValue_return integerValue18 = null;


        CommonTree Identifier10_tree=null;
        CommonTree char_literal11_tree=null;
        CommonTree string_literal13_tree=null;
        CommonTree char_literal14_tree=null;
        CommonTree string_literal15_tree=null;
        CommonTree Identifier16_tree=null;
        CommonTree char_literal17_tree=null;
        CommonTree Identifier19_tree=null;
        CommonTree char_literal20_tree=null;
        CommonTree char_literal21_tree=null;
        CommonTree char_literal22_tree=null;
        CommonTree string_literal23_tree=null;
        CommonTree char_literal24_tree=null;
        CommonTree string_literal25_tree=null;
        CommonTree Identifier26_tree=null;
        CommonTree char_literal27_tree=null;
        CommonTree char_literal28_tree=null;
        CommonTree char_literal29_tree=null;
        RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
        RewriteRuleSubtreeStream stream_integerValue=new RewriteRuleSubtreeStream(adaptor,"rule integerValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:128:2: ( Identifier '=' integerValue ( ( 'and' | ',' ( 'and' )? )? Identifier '=' integerValue )* -> ( ^( DEFINE Identifier ^( COMMAND integerValue ) ) )+ | Identifier '=' cmd= integerValue '(' par= integerValue ')' ( ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue '(' par= integerValue ')' )* -> ( ^( DEFINE Identifier ^( COMMAND $cmd PARAMETER $par) ) )+ )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==Identifier) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==98) ) {
                    int LA11_2 = input.LA(3);

                    if ( ((LA11_2>=BinaryLiteral && LA11_2<=HexLiteral)) ) {
                        int LA11_3 = input.LA(4);

                        if ( (LA11_3==101) ) {
                            alt11=2;
                        }
                        else if ( (LA11_3==EOF||LA11_3==Identifier||(LA11_3>=95 && LA11_3<=97)||(LA11_3>=99 && LA11_3<=100)||(LA11_3>=103 && LA11_3<=114)) ) {
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:128:4: Identifier '=' integerValue ( ( 'and' | ',' ( 'and' )? )? Identifier '=' integerValue )*
                    {
                    Identifier10=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineCommandValue476);  
                    stream_Identifier.add(Identifier10);

                    char_literal11=(Token)match(input,98,FOLLOW_98_in_defineCommandValue478);  
                    stream_98.add(char_literal11);

                    pushFollow(FOLLOW_integerValue_in_defineCommandValue480);
                    integerValue12=integerValue();

                    state._fsp--;

                    stream_integerValue.add(integerValue12.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:128:32: ( ( 'and' | ',' ( 'and' )? )? Identifier '=' integerValue )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==Identifier) ) {
                            int LA7_2 = input.LA(2);

                            if ( (LA7_2==98) ) {
                                alt7=1;
                            }


                        }
                        else if ( ((LA7_0>=99 && LA7_0<=100)) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:128:33: ( 'and' | ',' ( 'and' )? )? Identifier '=' integerValue
                    	    {
                    	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:128:33: ( 'and' | ',' ( 'and' )? )?
                    	    int alt6=3;
                    	    int LA6_0 = input.LA(1);

                    	    if ( (LA6_0==99) ) {
                    	        alt6=1;
                    	    }
                    	    else if ( (LA6_0==100) ) {
                    	        alt6=2;
                    	    }
                    	    switch (alt6) {
                    	        case 1 :
                    	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:128:34: 'and'
                    	            {
                    	            string_literal13=(Token)match(input,99,FOLLOW_99_in_defineCommandValue484);  
                    	            stream_99.add(string_literal13);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:128:40: ',' ( 'and' )?
                    	            {
                    	            char_literal14=(Token)match(input,100,FOLLOW_100_in_defineCommandValue486);  
                    	            stream_100.add(char_literal14);

                    	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:128:44: ( 'and' )?
                    	            int alt5=2;
                    	            int LA5_0 = input.LA(1);

                    	            if ( (LA5_0==99) ) {
                    	                alt5=1;
                    	            }
                    	            switch (alt5) {
                    	                case 1 :
                    	                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:128:44: 'and'
                    	                    {
                    	                    string_literal15=(Token)match(input,99,FOLLOW_99_in_defineCommandValue488);  
                    	                    stream_99.add(string_literal15);


                    	                    }
                    	                    break;

                    	            }


                    	            }
                    	            break;

                    	    }

                    	    Identifier16=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineCommandValue493);  
                    	    stream_Identifier.add(Identifier16);

                    	    char_literal17=(Token)match(input,98,FOLLOW_98_in_defineCommandValue495);  
                    	    stream_98.add(char_literal17);

                    	    pushFollow(FOLLOW_integerValue_in_defineCommandValue497);
                    	    integerValue18=integerValue();

                    	    state._fsp--;

                    	    stream_integerValue.add(integerValue18.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: integerValue, Identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 129:2: -> ( ^( DEFINE Identifier ^( COMMAND integerValue ) ) )+
                    {
                        if ( !(stream_integerValue.hasNext()||stream_Identifier.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_integerValue.hasNext()||stream_Identifier.hasNext() ) {
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:129:5: ^( DEFINE Identifier ^( COMMAND integerValue ) )
                            {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEFINE, "DEFINE"), root_1);

                            adaptor.addChild(root_1, stream_Identifier.nextNode());
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:129:25: ^( COMMAND integerValue )
                            {
                            CommonTree root_2 = (CommonTree)adaptor.nil();
                            root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMMAND, "COMMAND"), root_2);

                            adaptor.addChild(root_2, stream_integerValue.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                            adaptor.addChild(root_0, root_1);
                            }

                        }
                        stream_integerValue.reset();
                        stream_Identifier.reset();

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:130:4: Identifier '=' cmd= integerValue '(' par= integerValue ')' ( ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue '(' par= integerValue ')' )*
                    {
                    Identifier19=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineCommandValue520);  
                    stream_Identifier.add(Identifier19);

                    char_literal20=(Token)match(input,98,FOLLOW_98_in_defineCommandValue522);  
                    stream_98.add(char_literal20);

                    pushFollow(FOLLOW_integerValue_in_defineCommandValue526);
                    cmd=integerValue();

                    state._fsp--;

                    stream_integerValue.add(cmd.getTree());
                    char_literal21=(Token)match(input,101,FOLLOW_101_in_defineCommandValue528);  
                    stream_101.add(char_literal21);

                    pushFollow(FOLLOW_integerValue_in_defineCommandValue532);
                    par=integerValue();

                    state._fsp--;

                    stream_integerValue.add(par.getTree());
                    char_literal22=(Token)match(input,102,FOLLOW_102_in_defineCommandValue534);  
                    stream_102.add(char_literal22);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:130:61: ( ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue '(' par= integerValue ')' )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==Identifier) ) {
                            int LA10_2 = input.LA(2);

                            if ( (LA10_2==98) ) {
                                alt10=1;
                            }


                        }
                        else if ( ((LA10_0>=99 && LA10_0<=100)) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:130:62: ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue '(' par= integerValue ')'
                    	    {
                    	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:130:62: ( 'and' | ',' ( 'and' )? )?
                    	    int alt9=3;
                    	    int LA9_0 = input.LA(1);

                    	    if ( (LA9_0==99) ) {
                    	        alt9=1;
                    	    }
                    	    else if ( (LA9_0==100) ) {
                    	        alt9=2;
                    	    }
                    	    switch (alt9) {
                    	        case 1 :
                    	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:130:63: 'and'
                    	            {
                    	            string_literal23=(Token)match(input,99,FOLLOW_99_in_defineCommandValue538);  
                    	            stream_99.add(string_literal23);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:130:69: ',' ( 'and' )?
                    	            {
                    	            char_literal24=(Token)match(input,100,FOLLOW_100_in_defineCommandValue540);  
                    	            stream_100.add(char_literal24);

                    	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:130:73: ( 'and' )?
                    	            int alt8=2;
                    	            int LA8_0 = input.LA(1);

                    	            if ( (LA8_0==99) ) {
                    	                alt8=1;
                    	            }
                    	            switch (alt8) {
                    	                case 1 :
                    	                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:130:73: 'and'
                    	                    {
                    	                    string_literal25=(Token)match(input,99,FOLLOW_99_in_defineCommandValue542);  
                    	                    stream_99.add(string_literal25);


                    	                    }
                    	                    break;

                    	            }


                    	            }
                    	            break;

                    	    }

                    	    Identifier26=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineCommandValue547);  
                    	    stream_Identifier.add(Identifier26);

                    	    char_literal27=(Token)match(input,98,FOLLOW_98_in_defineCommandValue549);  
                    	    stream_98.add(char_literal27);

                    	    pushFollow(FOLLOW_integerValue_in_defineCommandValue553);
                    	    cmd=integerValue();

                    	    state._fsp--;

                    	    stream_integerValue.add(cmd.getTree());
                    	    char_literal28=(Token)match(input,101,FOLLOW_101_in_defineCommandValue555);  
                    	    stream_101.add(char_literal28);

                    	    pushFollow(FOLLOW_integerValue_in_defineCommandValue559);
                    	    par=integerValue();

                    	    state._fsp--;

                    	    stream_integerValue.add(par.getTree());
                    	    char_literal29=(Token)match(input,102,FOLLOW_102_in_defineCommandValue561);  
                    	    stream_102.add(char_literal29);


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: Identifier, par, cmd
                    // token labels: 
                    // rule labels: par, retval, cmd
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_par=new RewriteRuleSubtreeStream(adaptor,"rule par",par!=null?par.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_cmd=new RewriteRuleSubtreeStream(adaptor,"rule cmd",cmd!=null?cmd.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 131:2: -> ( ^( DEFINE Identifier ^( COMMAND $cmd PARAMETER $par) ) )+
                    {
                        if ( !(stream_Identifier.hasNext()||stream_par.hasNext()||stream_cmd.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_Identifier.hasNext()||stream_par.hasNext()||stream_cmd.hasNext() ) {
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:131:5: ^( DEFINE Identifier ^( COMMAND $cmd PARAMETER $par) )
                            {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEFINE, "DEFINE"), root_1);

                            adaptor.addChild(root_1, stream_Identifier.nextNode());
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:131:25: ^( COMMAND $cmd PARAMETER $par)
                            {
                            CommonTree root_2 = (CommonTree)adaptor.nil();
                            root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMMAND, "COMMAND"), root_2);

                            adaptor.addChild(root_2, stream_cmd.nextTree());
                            adaptor.addChild(root_2, (CommonTree)adaptor.create(PARAMETER, "PARAMETER"));
                            adaptor.addChild(root_2, stream_par.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                            adaptor.addChild(root_0, root_1);
                            }

                        }
                        stream_Identifier.reset();
                        stream_par.reset();
                        stream_cmd.reset();

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

    public static class defineSensor_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "defineSensor"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:134:1: defineSensor : ( 'sen' | 'sensor' | 'sensors' ) defineSensorValue -> defineSensorValue ;
    public final flipsParser.defineSensor_return defineSensor() throws RecognitionException {
        flipsParser.defineSensor_return retval = new flipsParser.defineSensor_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal30=null;
        Token string_literal31=null;
        Token string_literal32=null;
        flipsParser.defineSensorValue_return defineSensorValue33 = null;


        CommonTree string_literal30_tree=null;
        CommonTree string_literal31_tree=null;
        CommonTree string_literal32_tree=null;
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleSubtreeStream stream_defineSensorValue=new RewriteRuleSubtreeStream(adaptor,"rule defineSensorValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:135:2: ( ( 'sen' | 'sensor' | 'sensors' ) defineSensorValue -> defineSensorValue )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:135:4: ( 'sen' | 'sensor' | 'sensors' ) defineSensorValue
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:135:4: ( 'sen' | 'sensor' | 'sensors' )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 103:
                {
                alt12=1;
                }
                break;
            case 104:
                {
                alt12=2;
                }
                break;
            case 105:
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:135:5: 'sen'
                    {
                    string_literal30=(Token)match(input,103,FOLLOW_103_in_defineSensor597);  
                    stream_103.add(string_literal30);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:135:11: 'sensor'
                    {
                    string_literal31=(Token)match(input,104,FOLLOW_104_in_defineSensor599);  
                    stream_104.add(string_literal31);


                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:135:20: 'sensors'
                    {
                    string_literal32=(Token)match(input,105,FOLLOW_105_in_defineSensor601);  
                    stream_105.add(string_literal32);


                    }
                    break;

            }

            pushFollow(FOLLOW_defineSensorValue_in_defineSensor604);
            defineSensorValue33=defineSensorValue();

            state._fsp--;

            stream_defineSensorValue.add(defineSensorValue33.getTree());


            // AST REWRITE
            // elements: defineSensorValue
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 136:2: -> defineSensorValue
            {
                adaptor.addChild(root_0, stream_defineSensorValue.nextTree());

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
    // $ANTLR end "defineSensor"

    public static class defineSensorValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "defineSensorValue"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:139:1: defineSensorValue : Identifier '=' sen= integerValue ( ( 'and' | ',' ( 'and' )? )? Identifier '=' sen= integerValue )* -> ( ^( DEFINE Identifier ^( SENSOR $sen) ) )+ ;
    public final flipsParser.defineSensorValue_return defineSensorValue() throws RecognitionException {
        flipsParser.defineSensorValue_return retval = new flipsParser.defineSensorValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier34=null;
        Token char_literal35=null;
        Token string_literal36=null;
        Token char_literal37=null;
        Token string_literal38=null;
        Token Identifier39=null;
        Token char_literal40=null;
        flipsParser.integerValue_return sen = null;


        CommonTree Identifier34_tree=null;
        CommonTree char_literal35_tree=null;
        CommonTree string_literal36_tree=null;
        CommonTree char_literal37_tree=null;
        CommonTree string_literal38_tree=null;
        CommonTree Identifier39_tree=null;
        CommonTree char_literal40_tree=null;
        RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
        RewriteRuleSubtreeStream stream_integerValue=new RewriteRuleSubtreeStream(adaptor,"rule integerValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:140:2: ( Identifier '=' sen= integerValue ( ( 'and' | ',' ( 'and' )? )? Identifier '=' sen= integerValue )* -> ( ^( DEFINE Identifier ^( SENSOR $sen) ) )+ )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:140:4: Identifier '=' sen= integerValue ( ( 'and' | ',' ( 'and' )? )? Identifier '=' sen= integerValue )*
            {
            Identifier34=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineSensorValue620);  
            stream_Identifier.add(Identifier34);

            char_literal35=(Token)match(input,98,FOLLOW_98_in_defineSensorValue622);  
            stream_98.add(char_literal35);

            pushFollow(FOLLOW_integerValue_in_defineSensorValue626);
            sen=integerValue();

            state._fsp--;

            stream_integerValue.add(sen.getTree());
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:140:36: ( ( 'and' | ',' ( 'and' )? )? Identifier '=' sen= integerValue )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==Identifier) ) {
                    int LA15_2 = input.LA(2);

                    if ( (LA15_2==98) ) {
                        alt15=1;
                    }


                }
                else if ( ((LA15_0>=99 && LA15_0<=100)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:140:37: ( 'and' | ',' ( 'and' )? )? Identifier '=' sen= integerValue
            	    {
            	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:140:37: ( 'and' | ',' ( 'and' )? )?
            	    int alt14=3;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==99) ) {
            	        alt14=1;
            	    }
            	    else if ( (LA14_0==100) ) {
            	        alt14=2;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:140:38: 'and'
            	            {
            	            string_literal36=(Token)match(input,99,FOLLOW_99_in_defineSensorValue630);  
            	            stream_99.add(string_literal36);


            	            }
            	            break;
            	        case 2 :
            	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:140:44: ',' ( 'and' )?
            	            {
            	            char_literal37=(Token)match(input,100,FOLLOW_100_in_defineSensorValue632);  
            	            stream_100.add(char_literal37);

            	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:140:48: ( 'and' )?
            	            int alt13=2;
            	            int LA13_0 = input.LA(1);

            	            if ( (LA13_0==99) ) {
            	                alt13=1;
            	            }
            	            switch (alt13) {
            	                case 1 :
            	                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:140:48: 'and'
            	                    {
            	                    string_literal38=(Token)match(input,99,FOLLOW_99_in_defineSensorValue634);  
            	                    stream_99.add(string_literal38);


            	                    }
            	                    break;

            	            }


            	            }
            	            break;

            	    }

            	    Identifier39=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineSensorValue639);  
            	    stream_Identifier.add(Identifier39);

            	    char_literal40=(Token)match(input,98,FOLLOW_98_in_defineSensorValue641);  
            	    stream_98.add(char_literal40);

            	    pushFollow(FOLLOW_integerValue_in_defineSensorValue645);
            	    sen=integerValue();

            	    state._fsp--;

            	    stream_integerValue.add(sen.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);



            // AST REWRITE
            // elements: Identifier, sen
            // token labels: 
            // rule labels: retval, sen
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_sen=new RewriteRuleSubtreeStream(adaptor,"rule sen",sen!=null?sen.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 141:2: -> ( ^( DEFINE Identifier ^( SENSOR $sen) ) )+
            {
                if ( !(stream_Identifier.hasNext()||stream_sen.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_Identifier.hasNext()||stream_sen.hasNext() ) {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:141:5: ^( DEFINE Identifier ^( SENSOR $sen) )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEFINE, "DEFINE"), root_1);

                    adaptor.addChild(root_1, stream_Identifier.nextNode());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:141:25: ^( SENSOR $sen)
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SENSOR, "SENSOR"), root_2);

                    adaptor.addChild(root_2, stream_sen.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_Identifier.reset();
                stream_sen.reset();

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
    // $ANTLR end "defineSensorValue"

    public static class defineWaypoint_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "defineWaypoint"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:144:1: defineWaypoint : ( 'wpt' | 'waypoint' | 'waypoints' ) defineWaypointValue -> defineWaypointValue ;
    public final flipsParser.defineWaypoint_return defineWaypoint() throws RecognitionException {
        flipsParser.defineWaypoint_return retval = new flipsParser.defineWaypoint_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal41=null;
        Token string_literal42=null;
        Token string_literal43=null;
        flipsParser.defineWaypointValue_return defineWaypointValue44 = null;


        CommonTree string_literal41_tree=null;
        CommonTree string_literal42_tree=null;
        CommonTree string_literal43_tree=null;
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleSubtreeStream stream_defineWaypointValue=new RewriteRuleSubtreeStream(adaptor,"rule defineWaypointValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:145:2: ( ( 'wpt' | 'waypoint' | 'waypoints' ) defineWaypointValue -> defineWaypointValue )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:145:4: ( 'wpt' | 'waypoint' | 'waypoints' ) defineWaypointValue
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:145:4: ( 'wpt' | 'waypoint' | 'waypoints' )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 106:
                {
                alt16=1;
                }
                break;
            case 107:
                {
                alt16=2;
                }
                break;
            case 108:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:145:5: 'wpt'
                    {
                    string_literal41=(Token)match(input,106,FOLLOW_106_in_defineWaypoint676);  
                    stream_106.add(string_literal41);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:145:11: 'waypoint'
                    {
                    string_literal42=(Token)match(input,107,FOLLOW_107_in_defineWaypoint678);  
                    stream_107.add(string_literal42);


                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:145:22: 'waypoints'
                    {
                    string_literal43=(Token)match(input,108,FOLLOW_108_in_defineWaypoint680);  
                    stream_108.add(string_literal43);


                    }
                    break;

            }

            pushFollow(FOLLOW_defineWaypointValue_in_defineWaypoint683);
            defineWaypointValue44=defineWaypointValue();

            state._fsp--;

            stream_defineWaypointValue.add(defineWaypointValue44.getTree());


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
            // 146:2: -> defineWaypointValue
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:149:1: defineWaypointValue : Identifier '=' geoCoordinate ( ( 'and' | ',' ( 'and' )? )? Identifier '=' geoCoordinate )* -> ( ^( DEFINE Identifier geoCoordinate ) )+ ;
    public final flipsParser.defineWaypointValue_return defineWaypointValue() throws RecognitionException {
        flipsParser.defineWaypointValue_return retval = new flipsParser.defineWaypointValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier45=null;
        Token char_literal46=null;
        Token string_literal48=null;
        Token char_literal49=null;
        Token string_literal50=null;
        Token Identifier51=null;
        Token char_literal52=null;
        flipsParser.geoCoordinate_return geoCoordinate47 = null;

        flipsParser.geoCoordinate_return geoCoordinate53 = null;


        CommonTree Identifier45_tree=null;
        CommonTree char_literal46_tree=null;
        CommonTree string_literal48_tree=null;
        CommonTree char_literal49_tree=null;
        CommonTree string_literal50_tree=null;
        CommonTree Identifier51_tree=null;
        CommonTree char_literal52_tree=null;
        RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
        RewriteRuleSubtreeStream stream_geoCoordinate=new RewriteRuleSubtreeStream(adaptor,"rule geoCoordinate");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:150:2: ( Identifier '=' geoCoordinate ( ( 'and' | ',' ( 'and' )? )? Identifier '=' geoCoordinate )* -> ( ^( DEFINE Identifier geoCoordinate ) )+ )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:150:4: Identifier '=' geoCoordinate ( ( 'and' | ',' ( 'and' )? )? Identifier '=' geoCoordinate )*
            {
            Identifier45=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineWaypointValue699);  
            stream_Identifier.add(Identifier45);

            char_literal46=(Token)match(input,98,FOLLOW_98_in_defineWaypointValue701);  
            stream_98.add(char_literal46);

            pushFollow(FOLLOW_geoCoordinate_in_defineWaypointValue703);
            geoCoordinate47=geoCoordinate();

            state._fsp--;

            stream_geoCoordinate.add(geoCoordinate47.getTree());
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:150:33: ( ( 'and' | ',' ( 'and' )? )? Identifier '=' geoCoordinate )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==Identifier) ) {
                    int LA19_2 = input.LA(2);

                    if ( (LA19_2==98) ) {
                        alt19=1;
                    }


                }
                else if ( ((LA19_0>=99 && LA19_0<=100)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:150:34: ( 'and' | ',' ( 'and' )? )? Identifier '=' geoCoordinate
            	    {
            	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:150:34: ( 'and' | ',' ( 'and' )? )?
            	    int alt18=3;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==99) ) {
            	        alt18=1;
            	    }
            	    else if ( (LA18_0==100) ) {
            	        alt18=2;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:150:35: 'and'
            	            {
            	            string_literal48=(Token)match(input,99,FOLLOW_99_in_defineWaypointValue707);  
            	            stream_99.add(string_literal48);


            	            }
            	            break;
            	        case 2 :
            	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:150:41: ',' ( 'and' )?
            	            {
            	            char_literal49=(Token)match(input,100,FOLLOW_100_in_defineWaypointValue709);  
            	            stream_100.add(char_literal49);

            	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:150:45: ( 'and' )?
            	            int alt17=2;
            	            int LA17_0 = input.LA(1);

            	            if ( (LA17_0==99) ) {
            	                alt17=1;
            	            }
            	            switch (alt17) {
            	                case 1 :
            	                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:150:45: 'and'
            	                    {
            	                    string_literal50=(Token)match(input,99,FOLLOW_99_in_defineWaypointValue711);  
            	                    stream_99.add(string_literal50);


            	                    }
            	                    break;

            	            }


            	            }
            	            break;

            	    }

            	    Identifier51=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineWaypointValue716);  
            	    stream_Identifier.add(Identifier51);

            	    char_literal52=(Token)match(input,98,FOLLOW_98_in_defineWaypointValue718);  
            	    stream_98.add(char_literal52);

            	    pushFollow(FOLLOW_geoCoordinate_in_defineWaypointValue720);
            	    geoCoordinate53=geoCoordinate();

            	    state._fsp--;

            	    stream_geoCoordinate.add(geoCoordinate53.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
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
            // 151:2: -> ( ^( DEFINE Identifier geoCoordinate ) )+
            {
                if ( !(stream_Identifier.hasNext()||stream_geoCoordinate.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_Identifier.hasNext()||stream_geoCoordinate.hasNext() ) {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:151:5: ^( DEFINE Identifier geoCoordinate )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:156:1: command : ( flyCommand | turnCommand | loiterCommand | executeCommand );
    public final flipsParser.command_return command() throws RecognitionException {
        flipsParser.command_return retval = new flipsParser.command_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.flyCommand_return flyCommand54 = null;

        flipsParser.turnCommand_return turnCommand55 = null;

        flipsParser.loiterCommand_return loiterCommand56 = null;

        flipsParser.executeCommand_return executeCommand57 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:157:2: ( flyCommand | turnCommand | loiterCommand | executeCommand )
            int alt20=4;
            switch ( input.LA(1) ) {
            case 109:
            case 110:
                {
                alt20=1;
                }
                break;
            case 111:
            case 112:
                {
                alt20=2;
                }
                break;
            case 113:
            case 114:
                {
                alt20=3;
                }
                break;
            case Identifier:
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:157:4: flyCommand
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_flyCommand_in_command747);
                    flyCommand54=flyCommand();

                    state._fsp--;

                    adaptor.addChild(root_0, flyCommand54.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:158:4: turnCommand
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_turnCommand_in_command752);
                    turnCommand55=turnCommand();

                    state._fsp--;

                    adaptor.addChild(root_0, turnCommand55.getTree());

                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:159:4: loiterCommand
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_loiterCommand_in_command757);
                    loiterCommand56=loiterCommand();

                    state._fsp--;

                    adaptor.addChild(root_0, loiterCommand56.getTree());

                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:160:4: executeCommand
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_executeCommand_in_command762);
                    executeCommand57=executeCommand();

                    state._fsp--;

                    adaptor.addChild(root_0, executeCommand57.getTree());

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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:163:1: flyCommand : ( 'fly' | 'go' ) ( flyCommandValue )* -> ^( FLY ( flyCommandValue )* ) ;
    public final flipsParser.flyCommand_return flyCommand() throws RecognitionException {
        flipsParser.flyCommand_return retval = new flipsParser.flyCommand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal58=null;
        Token string_literal59=null;
        flipsParser.flyCommandValue_return flyCommandValue60 = null;


        CommonTree string_literal58_tree=null;
        CommonTree string_literal59_tree=null;
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleSubtreeStream stream_flyCommandValue=new RewriteRuleSubtreeStream(adaptor,"rule flyCommandValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:164:2: ( ( 'fly' | 'go' ) ( flyCommandValue )* -> ^( FLY ( flyCommandValue )* ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:164:4: ( 'fly' | 'go' ) ( flyCommandValue )*
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:164:4: ( 'fly' | 'go' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==109) ) {
                alt21=1;
            }
            else if ( (LA21_0==110) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:164:5: 'fly'
                    {
                    string_literal58=(Token)match(input,109,FOLLOW_109_in_flyCommand774);  
                    stream_109.add(string_literal58);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:164:11: 'go'
                    {
                    string_literal59=(Token)match(input,110,FOLLOW_110_in_flyCommand776);  
                    stream_110.add(string_literal59);


                    }
                    break;

            }

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:164:17: ( flyCommandValue )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=To && LA22_0<=With)||(LA22_0>=Turning && LA22_0<=HexLiteral)||(LA22_0>=115 && LA22_0<=116)||(LA22_0>=118 && LA22_0<=119)||(LA22_0>=121 && LA22_0<=122)||LA22_0==202||(LA22_0>=207 && LA22_0<=255)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:164:17: flyCommandValue
            	    {
            	    pushFollow(FOLLOW_flyCommandValue_in_flyCommand779);
            	    flyCommandValue60=flyCommandValue();

            	    state._fsp--;

            	    stream_flyCommandValue.add(flyCommandValue60.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
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
            // 165:2: -> ^( FLY ( flyCommandValue )* )
            {
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:165:5: ^( FLY ( flyCommandValue )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FLY, "FLY"), root_1);

                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:165:11: ( flyCommandValue )*
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:168:1: flyCommandValue : ( time | direction | speed | distance | pitch | roll | duration | To waypoint ( ( 'and' | ',' ( 'and' )? ) waypoint )* -> ( waypoint )+ | altitude );
    public final flipsParser.flyCommandValue_return flyCommandValue() throws RecognitionException {
        flipsParser.flyCommandValue_return retval = new flipsParser.flyCommandValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token To68=null;
        Token string_literal70=null;
        Token char_literal71=null;
        Token string_literal72=null;
        flipsParser.time_return time61 = null;

        flipsParser.direction_return direction62 = null;

        flipsParser.speed_return speed63 = null;

        flipsParser.distance_return distance64 = null;

        flipsParser.pitch_return pitch65 = null;

        flipsParser.roll_return roll66 = null;

        flipsParser.duration_return duration67 = null;

        flipsParser.waypoint_return waypoint69 = null;

        flipsParser.waypoint_return waypoint73 = null;

        flipsParser.altitude_return altitude74 = null;


        CommonTree To68_tree=null;
        CommonTree string_literal70_tree=null;
        CommonTree char_literal71_tree=null;
        CommonTree string_literal72_tree=null;
        RewriteRuleTokenStream stream_To=new RewriteRuleTokenStream(adaptor,"token To");
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
        RewriteRuleSubtreeStream stream_waypoint=new RewriteRuleSubtreeStream(adaptor,"rule waypoint");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:169:2: ( time | direction | speed | distance | pitch | roll | duration | To waypoint ( ( 'and' | ',' ( 'and' )? ) waypoint )* -> ( waypoint )+ | altitude )
            int alt26=9;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:169:4: time
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_time_in_flyCommandValue801);
                    time61=time();

                    state._fsp--;

                    adaptor.addChild(root_0, time61.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:170:4: direction
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_direction_in_flyCommandValue806);
                    direction62=direction();

                    state._fsp--;

                    adaptor.addChild(root_0, direction62.getTree());

                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:171:4: speed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_speed_in_flyCommandValue811);
                    speed63=speed();

                    state._fsp--;

                    adaptor.addChild(root_0, speed63.getTree());

                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:172:4: distance
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_distance_in_flyCommandValue816);
                    distance64=distance();

                    state._fsp--;

                    adaptor.addChild(root_0, distance64.getTree());

                    }
                    break;
                case 5 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:173:4: pitch
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_pitch_in_flyCommandValue821);
                    pitch65=pitch();

                    state._fsp--;

                    adaptor.addChild(root_0, pitch65.getTree());

                    }
                    break;
                case 6 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:174:4: roll
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_roll_in_flyCommandValue826);
                    roll66=roll();

                    state._fsp--;

                    adaptor.addChild(root_0, roll66.getTree());

                    }
                    break;
                case 7 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:175:4: duration
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_duration_in_flyCommandValue831);
                    duration67=duration();

                    state._fsp--;

                    adaptor.addChild(root_0, duration67.getTree());

                    }
                    break;
                case 8 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:176:4: To waypoint ( ( 'and' | ',' ( 'and' )? ) waypoint )*
                    {
                    To68=(Token)match(input,To,FOLLOW_To_in_flyCommandValue836);  
                    stream_To.add(To68);

                    pushFollow(FOLLOW_waypoint_in_flyCommandValue838);
                    waypoint69=waypoint();

                    state._fsp--;

                    stream_waypoint.add(waypoint69.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:176:16: ( ( 'and' | ',' ( 'and' )? ) waypoint )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( ((LA25_0>=99 && LA25_0<=100)) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:176:17: ( 'and' | ',' ( 'and' )? ) waypoint
                    	    {
                    	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:176:17: ( 'and' | ',' ( 'and' )? )
                    	    int alt24=2;
                    	    int LA24_0 = input.LA(1);

                    	    if ( (LA24_0==99) ) {
                    	        alt24=1;
                    	    }
                    	    else if ( (LA24_0==100) ) {
                    	        alt24=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 24, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt24) {
                    	        case 1 :
                    	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:176:18: 'and'
                    	            {
                    	            string_literal70=(Token)match(input,99,FOLLOW_99_in_flyCommandValue842);  
                    	            stream_99.add(string_literal70);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:176:24: ',' ( 'and' )?
                    	            {
                    	            char_literal71=(Token)match(input,100,FOLLOW_100_in_flyCommandValue844);  
                    	            stream_100.add(char_literal71);

                    	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:176:28: ( 'and' )?
                    	            int alt23=2;
                    	            int LA23_0 = input.LA(1);

                    	            if ( (LA23_0==99) ) {
                    	                alt23=1;
                    	            }
                    	            switch (alt23) {
                    	                case 1 :
                    	                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:176:28: 'and'
                    	                    {
                    	                    string_literal72=(Token)match(input,99,FOLLOW_99_in_flyCommandValue846);  
                    	                    stream_99.add(string_literal72);


                    	                    }
                    	                    break;

                    	            }


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_waypoint_in_flyCommandValue850);
                    	    waypoint73=waypoint();

                    	    state._fsp--;

                    	    stream_waypoint.add(waypoint73.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop25;
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
                    // 177:2: -> ( waypoint )+
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
                case 9 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:178:4: altitude
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_altitude_in_flyCommandValue863);
                    altitude74=altitude();

                    state._fsp--;

                    adaptor.addChild(root_0, altitude74.getTree());

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

    public static class turnCommand_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "turnCommand"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:181:1: turnCommand : ( 'trn' | 'turn' ) ( turnCommandValue )* -> ^( FLY ( turnCommandValue )* ) ;
    public final flipsParser.turnCommand_return turnCommand() throws RecognitionException {
        flipsParser.turnCommand_return retval = new flipsParser.turnCommand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal75=null;
        Token string_literal76=null;
        flipsParser.turnCommandValue_return turnCommandValue77 = null;


        CommonTree string_literal75_tree=null;
        CommonTree string_literal76_tree=null;
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleSubtreeStream stream_turnCommandValue=new RewriteRuleSubtreeStream(adaptor,"rule turnCommandValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:182:2: ( ( 'trn' | 'turn' ) ( turnCommandValue )* -> ^( FLY ( turnCommandValue )* ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:182:4: ( 'trn' | 'turn' ) ( turnCommandValue )*
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:182:4: ( 'trn' | 'turn' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==111) ) {
                alt27=1;
            }
            else if ( (LA27_0==112) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:182:5: 'trn'
                    {
                    string_literal75=(Token)match(input,111,FOLLOW_111_in_turnCommand875);  
                    stream_111.add(string_literal75);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:182:11: 'turn'
                    {
                    string_literal76=(Token)match(input,112,FOLLOW_112_in_turnCommand877);  
                    stream_112.add(string_literal76);


                    }
                    break;

            }

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:182:19: ( turnCommandValue )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=Turning && LA28_0<=Heading)||LA28_0==202||(LA28_0>=208 && LA28_0<=238)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:182:19: turnCommandValue
            	    {
            	    pushFollow(FOLLOW_turnCommandValue_in_turnCommand880);
            	    turnCommandValue77=turnCommandValue();

            	    state._fsp--;

            	    stream_turnCommandValue.add(turnCommandValue77.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);



            // AST REWRITE
            // elements: turnCommandValue
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 183:2: -> ^( FLY ( turnCommandValue )* )
            {
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:183:5: ^( FLY ( turnCommandValue )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FLY, "FLY"), root_1);

                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:183:11: ( turnCommandValue )*
                while ( stream_turnCommandValue.hasNext() ) {
                    adaptor.addChild(root_1, stream_turnCommandValue.nextTree());

                }
                stream_turnCommandValue.reset();

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
    // $ANTLR end "turnCommand"

    public static class turnCommandValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "turnCommandValue"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:186:1: turnCommandValue : direction ;
    public final flipsParser.turnCommandValue_return turnCommandValue() throws RecognitionException {
        flipsParser.turnCommandValue_return retval = new flipsParser.turnCommandValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.direction_return direction78 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:187:2: ( direction )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:187:4: direction
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_direction_in_turnCommandValue902);
            direction78=direction();

            state._fsp--;

            adaptor.addChild(root_0, direction78.getTree());

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
    // $ANTLR end "turnCommandValue"

    public static class loiterCommand_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "loiterCommand"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:190:1: loiterCommand : ( 'ltr' | 'loiter' ) ( loiterCommandValue )* -> ^( LOITER ( loiterCommandValue )* ) ;
    public final flipsParser.loiterCommand_return loiterCommand() throws RecognitionException {
        flipsParser.loiterCommand_return retval = new flipsParser.loiterCommand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal79=null;
        Token string_literal80=null;
        flipsParser.loiterCommandValue_return loiterCommandValue81 = null;


        CommonTree string_literal79_tree=null;
        CommonTree string_literal80_tree=null;
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleSubtreeStream stream_loiterCommandValue=new RewriteRuleSubtreeStream(adaptor,"rule loiterCommandValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:191:2: ( ( 'ltr' | 'loiter' ) ( loiterCommandValue )* -> ^( LOITER ( loiterCommandValue )* ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:191:4: ( 'ltr' | 'loiter' ) ( loiterCommandValue )*
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:191:4: ( 'ltr' | 'loiter' )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==113) ) {
                alt29=1;
            }
            else if ( (LA29_0==114) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:191:5: 'ltr'
                    {
                    string_literal79=(Token)match(input,113,FOLLOW_113_in_loiterCommand914);  
                    stream_113.add(string_literal79);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:191:11: 'loiter'
                    {
                    string_literal80=(Token)match(input,114,FOLLOW_114_in_loiterCommand916);  
                    stream_114.add(string_literal80);


                    }
                    break;

            }

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:191:21: ( loiterCommandValue )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=To && LA30_0<=With)||LA30_0==Turning||(LA30_0>=FloatingPointLiteral && LA30_0<=HexLiteral)||LA30_0==125||(LA30_0>=146 && LA30_0<=147)||LA30_0==207||(LA30_0>=239 && LA30_0<=249)||(LA30_0>=256 && LA30_0<=259)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:191:21: loiterCommandValue
            	    {
            	    pushFollow(FOLLOW_loiterCommandValue_in_loiterCommand919);
            	    loiterCommandValue81=loiterCommandValue();

            	    state._fsp--;

            	    stream_loiterCommandValue.add(loiterCommandValue81.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);



            // AST REWRITE
            // elements: loiterCommandValue
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 192:2: -> ^( LOITER ( loiterCommandValue )* )
            {
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:192:5: ^( LOITER ( loiterCommandValue )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LOITER, "LOITER"), root_1);

                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:192:14: ( loiterCommandValue )*
                while ( stream_loiterCommandValue.hasNext() ) {
                    adaptor.addChild(root_1, stream_loiterCommandValue.nextTree());

                }
                stream_loiterCommandValue.reset();

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
    // $ANTLR end "loiterCommand"

    public static class loiterCommandValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "loiterCommandValue"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:195:1: loiterCommandValue : ( time | speed | loiterDirection | radius | duration | At waypoint -> waypoint | altitude );
    public final flipsParser.loiterCommandValue_return loiterCommandValue() throws RecognitionException {
        flipsParser.loiterCommandValue_return retval = new flipsParser.loiterCommandValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token At87=null;
        flipsParser.time_return time82 = null;

        flipsParser.speed_return speed83 = null;

        flipsParser.loiterDirection_return loiterDirection84 = null;

        flipsParser.radius_return radius85 = null;

        flipsParser.duration_return duration86 = null;

        flipsParser.waypoint_return waypoint88 = null;

        flipsParser.altitude_return altitude89 = null;


        CommonTree At87_tree=null;
        RewriteRuleTokenStream stream_At=new RewriteRuleTokenStream(adaptor,"token At");
        RewriteRuleSubtreeStream stream_waypoint=new RewriteRuleSubtreeStream(adaptor,"rule waypoint");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:196:2: ( time | speed | loiterDirection | radius | duration | At waypoint -> waypoint | altitude )
            int alt31=7;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:196:4: time
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_time_in_loiterCommandValue941);
                    time82=time();

                    state._fsp--;

                    adaptor.addChild(root_0, time82.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:197:4: speed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_speed_in_loiterCommandValue946);
                    speed83=speed();

                    state._fsp--;

                    adaptor.addChild(root_0, speed83.getTree());

                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:198:4: loiterDirection
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_loiterDirection_in_loiterCommandValue951);
                    loiterDirection84=loiterDirection();

                    state._fsp--;

                    adaptor.addChild(root_0, loiterDirection84.getTree());

                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:199:4: radius
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_radius_in_loiterCommandValue956);
                    radius85=radius();

                    state._fsp--;

                    adaptor.addChild(root_0, radius85.getTree());

                    }
                    break;
                case 5 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:200:4: duration
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_duration_in_loiterCommandValue961);
                    duration86=duration();

                    state._fsp--;

                    adaptor.addChild(root_0, duration86.getTree());

                    }
                    break;
                case 6 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:201:4: At waypoint
                    {
                    At87=(Token)match(input,At,FOLLOW_At_in_loiterCommandValue966);  
                    stream_At.add(At87);

                    pushFollow(FOLLOW_waypoint_in_loiterCommandValue968);
                    waypoint88=waypoint();

                    state._fsp--;

                    stream_waypoint.add(waypoint88.getTree());


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
                    // 202:2: -> waypoint
                    {
                        adaptor.addChild(root_0, stream_waypoint.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:203:4: altitude
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_altitude_in_loiterCommandValue978);
                    altitude89=altitude();

                    state._fsp--;

                    adaptor.addChild(root_0, altitude89.getTree());

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
    // $ANTLR end "loiterCommandValue"

    public static class executeCommand_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "executeCommand"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:206:1: executeCommand : ( Identifier -> ^( EXECUTE Identifier ) | Identifier '(' numericValue ( ',' numericValue )* ')' -> ^( EXECUTE Identifier ( ^( PARAMETER numericValue ) )+ ) );
    public final flipsParser.executeCommand_return executeCommand() throws RecognitionException {
        flipsParser.executeCommand_return retval = new flipsParser.executeCommand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier90=null;
        Token Identifier91=null;
        Token char_literal92=null;
        Token char_literal94=null;
        Token char_literal96=null;
        flipsParser.numericValue_return numericValue93 = null;

        flipsParser.numericValue_return numericValue95 = null;


        CommonTree Identifier90_tree=null;
        CommonTree Identifier91_tree=null;
        CommonTree char_literal92_tree=null;
        CommonTree char_literal94_tree=null;
        CommonTree char_literal96_tree=null;
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
        RewriteRuleSubtreeStream stream_numericValue=new RewriteRuleSubtreeStream(adaptor,"rule numericValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:207:2: ( Identifier -> ^( EXECUTE Identifier ) | Identifier '(' numericValue ( ',' numericValue )* ')' -> ^( EXECUTE Identifier ( ^( PARAMETER numericValue ) )+ ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==Identifier) ) {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==101) ) {
                    alt33=2;
                }
                else if ( (LA33_1==EOF||LA33_1==Identifier||(LA33_1>=109 && LA33_1<=114)) ) {
                    alt33=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:207:4: Identifier
                    {
                    Identifier90=(Token)match(input,Identifier,FOLLOW_Identifier_in_executeCommand989);  
                    stream_Identifier.add(Identifier90);



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
                    // 208:2: -> ^( EXECUTE Identifier )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:208:5: ^( EXECUTE Identifier )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:209:4: Identifier '(' numericValue ( ',' numericValue )* ')'
                    {
                    Identifier91=(Token)match(input,Identifier,FOLLOW_Identifier_in_executeCommand1003);  
                    stream_Identifier.add(Identifier91);

                    char_literal92=(Token)match(input,101,FOLLOW_101_in_executeCommand1005);  
                    stream_101.add(char_literal92);

                    pushFollow(FOLLOW_numericValue_in_executeCommand1007);
                    numericValue93=numericValue();

                    state._fsp--;

                    stream_numericValue.add(numericValue93.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:209:32: ( ',' numericValue )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==100) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:209:33: ',' numericValue
                    	    {
                    	    char_literal94=(Token)match(input,100,FOLLOW_100_in_executeCommand1010);  
                    	    stream_100.add(char_literal94);

                    	    pushFollow(FOLLOW_numericValue_in_executeCommand1012);
                    	    numericValue95=numericValue();

                    	    state._fsp--;

                    	    stream_numericValue.add(numericValue95.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    char_literal96=(Token)match(input,102,FOLLOW_102_in_executeCommand1017);  
                    stream_102.add(char_literal96);



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
                    // 210:2: -> ^( EXECUTE Identifier ( ^( PARAMETER numericValue ) )+ )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:210:5: ^( EXECUTE Identifier ( ^( PARAMETER numericValue ) )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXECUTE, "EXECUTE"), root_1);

                        adaptor.addChild(root_1, stream_Identifier.nextNode());
                        if ( !(stream_numericValue.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_numericValue.hasNext() ) {
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:210:26: ^( PARAMETER numericValue )
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

    public static class pitch_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pitch"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:215:1: pitch : ( ( 'pit' | 'pitch' ) angularValue -> ^( PITCH angularValue ) | ( With 'an' )? ( 'aoa' | 'angle of attack' ) ( 'of' )? angularValue -> ^( PITCH angularValue ) );
    public final flipsParser.pitch_return pitch() throws RecognitionException {
        flipsParser.pitch_return retval = new flipsParser.pitch_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal97=null;
        Token string_literal98=null;
        Token With100=null;
        Token string_literal101=null;
        Token string_literal102=null;
        Token string_literal103=null;
        Token string_literal104=null;
        flipsParser.angularValue_return angularValue99 = null;

        flipsParser.angularValue_return angularValue105 = null;


        CommonTree string_literal97_tree=null;
        CommonTree string_literal98_tree=null;
        CommonTree With100_tree=null;
        CommonTree string_literal101_tree=null;
        CommonTree string_literal102_tree=null;
        CommonTree string_literal103_tree=null;
        CommonTree string_literal104_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
        RewriteRuleTokenStream stream_120=new RewriteRuleTokenStream(adaptor,"token 120");
        RewriteRuleTokenStream stream_With=new RewriteRuleTokenStream(adaptor,"token With");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");
        RewriteRuleSubtreeStream stream_angularValue=new RewriteRuleSubtreeStream(adaptor,"rule angularValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:216:2: ( ( 'pit' | 'pitch' ) angularValue -> ^( PITCH angularValue ) | ( With 'an' )? ( 'aoa' | 'angle of attack' ) ( 'of' )? angularValue -> ^( PITCH angularValue ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=115 && LA38_0<=116)) ) {
                alt38=1;
            }
            else if ( (LA38_0==With||(LA38_0>=118 && LA38_0<=119)) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:216:4: ( 'pit' | 'pitch' ) angularValue
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:216:4: ( 'pit' | 'pitch' )
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==115) ) {
                        alt34=1;
                    }
                    else if ( (LA34_0==116) ) {
                        alt34=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 0, input);

                        throw nvae;
                    }
                    switch (alt34) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:216:5: 'pit'
                            {
                            string_literal97=(Token)match(input,115,FOLLOW_115_in_pitch1047);  
                            stream_115.add(string_literal97);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:216:11: 'pitch'
                            {
                            string_literal98=(Token)match(input,116,FOLLOW_116_in_pitch1049);  
                            stream_116.add(string_literal98);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_angularValue_in_pitch1052);
                    angularValue99=angularValue();

                    state._fsp--;

                    stream_angularValue.add(angularValue99.getTree());


                    // AST REWRITE
                    // elements: angularValue
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 217:2: -> ^( PITCH angularValue )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:217:5: ^( PITCH angularValue )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PITCH, "PITCH"), root_1);

                        adaptor.addChild(root_1, stream_angularValue.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:218:4: ( With 'an' )? ( 'aoa' | 'angle of attack' ) ( 'of' )? angularValue
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:218:4: ( With 'an' )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==With) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:218:5: With 'an'
                            {
                            With100=(Token)match(input,With,FOLLOW_With_in_pitch1067);  
                            stream_With.add(With100);

                            string_literal101=(Token)match(input,117,FOLLOW_117_in_pitch1069);  
                            stream_117.add(string_literal101);


                            }
                            break;

                    }

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:218:17: ( 'aoa' | 'angle of attack' )
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==118) ) {
                        alt36=1;
                    }
                    else if ( (LA36_0==119) ) {
                        alt36=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 0, input);

                        throw nvae;
                    }
                    switch (alt36) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:218:18: 'aoa'
                            {
                            string_literal102=(Token)match(input,118,FOLLOW_118_in_pitch1074);  
                            stream_118.add(string_literal102);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:218:24: 'angle of attack'
                            {
                            string_literal103=(Token)match(input,119,FOLLOW_119_in_pitch1076);  
                            stream_119.add(string_literal103);


                            }
                            break;

                    }

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:218:43: ( 'of' )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==120) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:218:43: 'of'
                            {
                            string_literal104=(Token)match(input,120,FOLLOW_120_in_pitch1079);  
                            stream_120.add(string_literal104);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_angularValue_in_pitch1082);
                    angularValue105=angularValue();

                    state._fsp--;

                    stream_angularValue.add(angularValue105.getTree());


                    // AST REWRITE
                    // elements: angularValue
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 219:2: -> ^( PITCH angularValue )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:219:5: ^( PITCH angularValue )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PITCH, "PITCH"), root_1);

                        adaptor.addChild(root_1, stream_angularValue.nextTree());

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
    // $ANTLR end "pitch"

    public static class roll_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "roll"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:222:1: roll : ( 'rol' | 'roll' ) angularValue -> ^( ROLL angularValue ) ;
    public final flipsParser.roll_return roll() throws RecognitionException {
        flipsParser.roll_return retval = new flipsParser.roll_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal106=null;
        Token string_literal107=null;
        flipsParser.angularValue_return angularValue108 = null;


        CommonTree string_literal106_tree=null;
        CommonTree string_literal107_tree=null;
        RewriteRuleTokenStream stream_121=new RewriteRuleTokenStream(adaptor,"token 121");
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleSubtreeStream stream_angularValue=new RewriteRuleSubtreeStream(adaptor,"rule angularValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:2: ( ( 'rol' | 'roll' ) angularValue -> ^( ROLL angularValue ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:4: ( 'rol' | 'roll' ) angularValue
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:4: ( 'rol' | 'roll' )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==121) ) {
                alt39=1;
            }
            else if ( (LA39_0==122) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:5: 'rol'
                    {
                    string_literal106=(Token)match(input,121,FOLLOW_121_in_roll1103);  
                    stream_121.add(string_literal106);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:11: 'roll'
                    {
                    string_literal107=(Token)match(input,122,FOLLOW_122_in_roll1105);  
                    stream_122.add(string_literal107);


                    }
                    break;

            }

            pushFollow(FOLLOW_angularValue_in_roll1108);
            angularValue108=angularValue();

            state._fsp--;

            stream_angularValue.add(angularValue108.getTree());


            // AST REWRITE
            // elements: angularValue
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 224:2: -> ^( ROLL angularValue )
            {
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:224:5: ^( ROLL angularValue )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ROLL, "ROLL"), root_1);

                adaptor.addChild(root_1, stream_angularValue.nextTree());

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
    // $ANTLR end "roll"

    public static class altitude_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "altitude"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:229:1: altitude : ( fixedAltitude | relativeAltitude );
    public final flipsParser.altitude_return altitude() throws RecognitionException {
        flipsParser.altitude_return retval = new flipsParser.altitude_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.fixedAltitude_return fixedAltitude109 = null;

        flipsParser.relativeAltitude_return relativeAltitude110 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:230:2: ( fixedAltitude | relativeAltitude )
            int alt40=2;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:230:4: fixedAltitude
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_fixedAltitude_in_altitude1130);
                    fixedAltitude109=fixedAltitude();

                    state._fsp--;

                    adaptor.addChild(root_0, fixedAltitude109.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:231:4: relativeAltitude
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_relativeAltitude_in_altitude1135);
                    relativeAltitude110=relativeAltitude();

                    state._fsp--;

                    adaptor.addChild(root_0, relativeAltitude110.getTree());

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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:234:1: fixedAltitude : ( ( upDownDirection )? To | At | With ) ( ( ( 'an' )? ( 'alt' | 'altitude' ) | ( 'a' )? ( 'pres' | 'pressure' ) ) ( 'of' )? )? altitudeValue -> ^( ALTITUDE FIXED altitudeValue ) ;
    public final flipsParser.fixedAltitude_return fixedAltitude() throws RecognitionException {
        flipsParser.fixedAltitude_return retval = new flipsParser.fixedAltitude_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token To112=null;
        Token At113=null;
        Token With114=null;
        Token string_literal115=null;
        Token string_literal116=null;
        Token string_literal117=null;
        Token char_literal118=null;
        Token string_literal119=null;
        Token string_literal120=null;
        Token string_literal121=null;
        flipsParser.upDownDirection_return upDownDirection111 = null;

        flipsParser.altitudeValue_return altitudeValue122 = null;


        CommonTree To112_tree=null;
        CommonTree At113_tree=null;
        CommonTree With114_tree=null;
        CommonTree string_literal115_tree=null;
        CommonTree string_literal116_tree=null;
        CommonTree string_literal117_tree=null;
        CommonTree char_literal118_tree=null;
        CommonTree string_literal119_tree=null;
        CommonTree string_literal120_tree=null;
        CommonTree string_literal121_tree=null;
        RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleTokenStream stream_At=new RewriteRuleTokenStream(adaptor,"token At");
        RewriteRuleTokenStream stream_To=new RewriteRuleTokenStream(adaptor,"token To");
        RewriteRuleTokenStream stream_124=new RewriteRuleTokenStream(adaptor,"token 124");
        RewriteRuleTokenStream stream_120=new RewriteRuleTokenStream(adaptor,"token 120");
        RewriteRuleTokenStream stream_With=new RewriteRuleTokenStream(adaptor,"token With");
        RewriteRuleSubtreeStream stream_altitudeValue=new RewriteRuleSubtreeStream(adaptor,"rule altitudeValue");
        RewriteRuleSubtreeStream stream_upDownDirection=new RewriteRuleSubtreeStream(adaptor,"rule upDownDirection");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:235:2: ( ( ( upDownDirection )? To | At | With ) ( ( ( 'an' )? ( 'alt' | 'altitude' ) | ( 'a' )? ( 'pres' | 'pressure' ) ) ( 'of' )? )? altitudeValue -> ^( ALTITUDE FIXED altitudeValue ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:235:4: ( ( upDownDirection )? To | At | With ) ( ( ( 'an' )? ( 'alt' | 'altitude' ) | ( 'a' )? ( 'pres' | 'pressure' ) ) ( 'of' )? )? altitudeValue
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:235:4: ( ( upDownDirection )? To | At | With )
            int alt42=3;
            switch ( input.LA(1) ) {
            case To:
            case 239:
            case 240:
            case 241:
            case 242:
            case 243:
            case 244:
            case 245:
            case 246:
            case 247:
            case 248:
            case 249:
                {
                alt42=1;
                }
                break;
            case At:
                {
                alt42=2;
                }
                break;
            case With:
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:235:5: ( upDownDirection )? To
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:235:5: ( upDownDirection )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( ((LA41_0>=239 && LA41_0<=249)) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:235:5: upDownDirection
                            {
                            pushFollow(FOLLOW_upDownDirection_in_fixedAltitude1147);
                            upDownDirection111=upDownDirection();

                            state._fsp--;

                            stream_upDownDirection.add(upDownDirection111.getTree());

                            }
                            break;

                    }

                    To112=(Token)match(input,To,FOLLOW_To_in_fixedAltitude1150);  
                    stream_To.add(To112);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:235:25: At
                    {
                    At113=(Token)match(input,At,FOLLOW_At_in_fixedAltitude1152);  
                    stream_At.add(At113);


                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:235:28: With
                    {
                    With114=(Token)match(input,With,FOLLOW_With_in_fixedAltitude1154);  
                    stream_With.add(With114);


                    }
                    break;

            }

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:235:34: ( ( ( 'an' )? ( 'alt' | 'altitude' ) | ( 'a' )? ( 'pres' | 'pressure' ) ) ( 'of' )? )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==117||(LA49_0>=123 && LA49_0<=127)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:235:35: ( ( 'an' )? ( 'alt' | 'altitude' ) | ( 'a' )? ( 'pres' | 'pressure' ) ) ( 'of' )?
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:235:35: ( ( 'an' )? ( 'alt' | 'altitude' ) | ( 'a' )? ( 'pres' | 'pressure' ) )
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==117||(LA47_0>=123 && LA47_0<=124)) ) {
                        alt47=1;
                    }
                    else if ( ((LA47_0>=125 && LA47_0<=127)) ) {
                        alt47=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 47, 0, input);

                        throw nvae;
                    }
                    switch (alt47) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:235:36: ( 'an' )? ( 'alt' | 'altitude' )
                            {
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:235:36: ( 'an' )?
                            int alt43=2;
                            int LA43_0 = input.LA(1);

                            if ( (LA43_0==117) ) {
                                alt43=1;
                            }
                            switch (alt43) {
                                case 1 :
                                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:235:36: 'an'
                                    {
                                    string_literal115=(Token)match(input,117,FOLLOW_117_in_fixedAltitude1159);  
                                    stream_117.add(string_literal115);


                                    }
                                    break;

                            }

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:235:42: ( 'alt' | 'altitude' )
                            int alt44=2;
                            int LA44_0 = input.LA(1);

                            if ( (LA44_0==123) ) {
                                alt44=1;
                            }
                            else if ( (LA44_0==124) ) {
                                alt44=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 44, 0, input);

                                throw nvae;
                            }
                            switch (alt44) {
                                case 1 :
                                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:235:43: 'alt'
                                    {
                                    string_literal116=(Token)match(input,123,FOLLOW_123_in_fixedAltitude1163);  
                                    stream_123.add(string_literal116);


                                    }
                                    break;
                                case 2 :
                                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:235:49: 'altitude'
                                    {
                                    string_literal117=(Token)match(input,124,FOLLOW_124_in_fixedAltitude1165);  
                                    stream_124.add(string_literal117);


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:235:61: ( 'a' )? ( 'pres' | 'pressure' )
                            {
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:235:61: ( 'a' )?
                            int alt45=2;
                            int LA45_0 = input.LA(1);

                            if ( (LA45_0==125) ) {
                                alt45=1;
                            }
                            switch (alt45) {
                                case 1 :
                                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:235:61: 'a'
                                    {
                                    char_literal118=(Token)match(input,125,FOLLOW_125_in_fixedAltitude1168);  
                                    stream_125.add(char_literal118);


                                    }
                                    break;

                            }

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:235:66: ( 'pres' | 'pressure' )
                            int alt46=2;
                            int LA46_0 = input.LA(1);

                            if ( (LA46_0==126) ) {
                                alt46=1;
                            }
                            else if ( (LA46_0==127) ) {
                                alt46=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 46, 0, input);

                                throw nvae;
                            }
                            switch (alt46) {
                                case 1 :
                                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:235:67: 'pres'
                                    {
                                    string_literal119=(Token)match(input,126,FOLLOW_126_in_fixedAltitude1172);  
                                    stream_126.add(string_literal119);


                                    }
                                    break;
                                case 2 :
                                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:235:74: 'pressure'
                                    {
                                    string_literal120=(Token)match(input,127,FOLLOW_127_in_fixedAltitude1174);  
                                    stream_127.add(string_literal120);


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:235:87: ( 'of' )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==120) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:235:87: 'of'
                            {
                            string_literal121=(Token)match(input,120,FOLLOW_120_in_fixedAltitude1178);  
                            stream_120.add(string_literal121);


                            }
                            break;

                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_altitudeValue_in_fixedAltitude1183);
            altitudeValue122=altitudeValue();

            state._fsp--;

            stream_altitudeValue.add(altitudeValue122.getTree());


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
            // 236:2: -> ^( ALTITUDE FIXED altitudeValue )
            {
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:236:5: ^( ALTITUDE FIXED altitudeValue )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:239:1: relativeAltitude : upDownDirection altitudeValue -> ^( ALTITUDE RELATIVE upDownDirection altitudeValue ) ;
    public final flipsParser.relativeAltitude_return relativeAltitude() throws RecognitionException {
        flipsParser.relativeAltitude_return retval = new flipsParser.relativeAltitude_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.upDownDirection_return upDownDirection123 = null;

        flipsParser.altitudeValue_return altitudeValue124 = null;


        RewriteRuleSubtreeStream stream_altitudeValue=new RewriteRuleSubtreeStream(adaptor,"rule altitudeValue");
        RewriteRuleSubtreeStream stream_upDownDirection=new RewriteRuleSubtreeStream(adaptor,"rule upDownDirection");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:240:2: ( upDownDirection altitudeValue -> ^( ALTITUDE RELATIVE upDownDirection altitudeValue ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:240:4: upDownDirection altitudeValue
            {
            pushFollow(FOLLOW_upDownDirection_in_relativeAltitude1205);
            upDownDirection123=upDownDirection();

            state._fsp--;

            stream_upDownDirection.add(upDownDirection123.getTree());
            pushFollow(FOLLOW_altitudeValue_in_relativeAltitude1207);
            altitudeValue124=altitudeValue();

            state._fsp--;

            stream_altitudeValue.add(altitudeValue124.getTree());


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
            // 241:2: -> ^( ALTITUDE RELATIVE upDownDirection altitudeValue )
            {
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:241:5: ^( ALTITUDE RELATIVE upDownDirection altitudeValue )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:244:1: altitudeValue : ( distanceValue -> DISTANCE distanceValue | pressureValue -> PRESSURE pressureValue | FlightLevel -> FLIGHTLEVEL FlightLevel );
    public final flipsParser.altitudeValue_return altitudeValue() throws RecognitionException {
        flipsParser.altitudeValue_return retval = new flipsParser.altitudeValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FlightLevel127=null;
        flipsParser.distanceValue_return distanceValue125 = null;

        flipsParser.pressureValue_return pressureValue126 = null;


        CommonTree FlightLevel127_tree=null;
        RewriteRuleTokenStream stream_FlightLevel=new RewriteRuleTokenStream(adaptor,"token FlightLevel");
        RewriteRuleSubtreeStream stream_pressureValue=new RewriteRuleSubtreeStream(adaptor,"rule pressureValue");
        RewriteRuleSubtreeStream stream_distanceValue=new RewriteRuleSubtreeStream(adaptor,"rule distanceValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:245:2: ( distanceValue -> DISTANCE distanceValue | pressureValue -> PRESSURE pressureValue | FlightLevel -> FLIGHTLEVEL FlightLevel )
            int alt50=3;
            switch ( input.LA(1) ) {
            case BinaryLiteral:
            case OctalLiteral:
            case DecimalLiteral:
            case HexLiteral:
                {
                int LA50_1 = input.LA(2);

                if ( ((LA50_1>=148 && LA50_1<=165)) ) {
                    alt50=1;
                }
                else if ( ((LA50_1>=128 && LA50_1<=145)) ) {
                    alt50=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 1, input);

                    throw nvae;
                }
                }
                break;
            case FloatingPointLiteral:
                {
                int LA50_2 = input.LA(2);

                if ( ((LA50_2>=148 && LA50_2<=165)) ) {
                    alt50=1;
                }
                else if ( ((LA50_2>=128 && LA50_2<=145)) ) {
                    alt50=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 2, input);

                    throw nvae;
                }
                }
                break;
            case FlightLevel:
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:245:4: distanceValue
                    {
                    pushFollow(FOLLOW_distanceValue_in_altitudeValue1231);
                    distanceValue125=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(distanceValue125.getTree());


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
                    // 246:2: -> DISTANCE distanceValue
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(DISTANCE, "DISTANCE"));
                        adaptor.addChild(root_0, stream_distanceValue.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:247:4: pressureValue
                    {
                    pushFollow(FOLLOW_pressureValue_in_altitudeValue1243);
                    pressureValue126=pressureValue();

                    state._fsp--;

                    stream_pressureValue.add(pressureValue126.getTree());


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
                    // 248:2: -> PRESSURE pressureValue
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(PRESSURE, "PRESSURE"));
                        adaptor.addChild(root_0, stream_pressureValue.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:249:4: FlightLevel
                    {
                    FlightLevel127=(Token)match(input,FlightLevel,FOLLOW_FlightLevel_in_altitudeValue1255);  
                    stream_FlightLevel.add(FlightLevel127);



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
                    // 250:2: -> FLIGHTLEVEL FlightLevel
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:253:1: pressureValue : numericValue pressureUnit ;
    public final flipsParser.pressureValue_return pressureValue() throws RecognitionException {
        flipsParser.pressureValue_return retval = new flipsParser.pressureValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.numericValue_return numericValue128 = null;

        flipsParser.pressureUnit_return pressureUnit129 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:254:2: ( numericValue pressureUnit )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:254:4: numericValue pressureUnit
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_numericValue_in_pressureValue1273);
            numericValue128=numericValue();

            state._fsp--;

            adaptor.addChild(root_0, numericValue128.getTree());
            pushFollow(FOLLOW_pressureUnit_in_pressureValue1275);
            pressureUnit129=pressureUnit();

            state._fsp--;

            adaptor.addChild(root_0, pressureUnit129.getTree());

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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:257:1: pressureUnit : ( ( 'kpa' | 'kilopascal' | 'kilopascals' ) -> KILOPASCAL | ( 'hpa' | 'hectopascal' | 'hectopascals' ) -> HECTOPASCAL | ( 'pa' | 'pascal' | 'pascals' ) -> PASCAL | ( 'bar' | 'bars' ) -> BAR | ( 'mbar' | 'millibar' | 'millibars' ) -> MILLIBAR | ( 'atm' | 'atms' | 'atmosphere' | 'atmospheres' ) -> ATMOSPHERE );
    public final flipsParser.pressureUnit_return pressureUnit() throws RecognitionException {
        flipsParser.pressureUnit_return retval = new flipsParser.pressureUnit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal130=null;
        Token string_literal131=null;
        Token string_literal132=null;
        Token string_literal133=null;
        Token string_literal134=null;
        Token string_literal135=null;
        Token string_literal136=null;
        Token string_literal137=null;
        Token string_literal138=null;
        Token string_literal139=null;
        Token string_literal140=null;
        Token string_literal141=null;
        Token string_literal142=null;
        Token string_literal143=null;
        Token string_literal144=null;
        Token string_literal145=null;
        Token string_literal146=null;
        Token string_literal147=null;

        CommonTree string_literal130_tree=null;
        CommonTree string_literal131_tree=null;
        CommonTree string_literal132_tree=null;
        CommonTree string_literal133_tree=null;
        CommonTree string_literal134_tree=null;
        CommonTree string_literal135_tree=null;
        CommonTree string_literal136_tree=null;
        CommonTree string_literal137_tree=null;
        CommonTree string_literal138_tree=null;
        CommonTree string_literal139_tree=null;
        CommonTree string_literal140_tree=null;
        CommonTree string_literal141_tree=null;
        CommonTree string_literal142_tree=null;
        CommonTree string_literal143_tree=null;
        CommonTree string_literal144_tree=null;
        CommonTree string_literal145_tree=null;
        CommonTree string_literal146_tree=null;
        CommonTree string_literal147_tree=null;
        RewriteRuleTokenStream stream_143=new RewriteRuleTokenStream(adaptor,"token 143");
        RewriteRuleTokenStream stream_134=new RewriteRuleTokenStream(adaptor,"token 134");
        RewriteRuleTokenStream stream_144=new RewriteRuleTokenStream(adaptor,"token 144");
        RewriteRuleTokenStream stream_135=new RewriteRuleTokenStream(adaptor,"token 135");
        RewriteRuleTokenStream stream_145=new RewriteRuleTokenStream(adaptor,"token 145");
        RewriteRuleTokenStream stream_132=new RewriteRuleTokenStream(adaptor,"token 132");
        RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");
        RewriteRuleTokenStream stream_133=new RewriteRuleTokenStream(adaptor,"token 133");
        RewriteRuleTokenStream stream_138=new RewriteRuleTokenStream(adaptor,"token 138");
        RewriteRuleTokenStream stream_139=new RewriteRuleTokenStream(adaptor,"token 139");
        RewriteRuleTokenStream stream_136=new RewriteRuleTokenStream(adaptor,"token 136");
        RewriteRuleTokenStream stream_137=new RewriteRuleTokenStream(adaptor,"token 137");
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleTokenStream stream_131=new RewriteRuleTokenStream(adaptor,"token 131");
        RewriteRuleTokenStream stream_140=new RewriteRuleTokenStream(adaptor,"token 140");
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
        RewriteRuleTokenStream stream_142=new RewriteRuleTokenStream(adaptor,"token 142");
        RewriteRuleTokenStream stream_141=new RewriteRuleTokenStream(adaptor,"token 141");

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:258:2: ( ( 'kpa' | 'kilopascal' | 'kilopascals' ) -> KILOPASCAL | ( 'hpa' | 'hectopascal' | 'hectopascals' ) -> HECTOPASCAL | ( 'pa' | 'pascal' | 'pascals' ) -> PASCAL | ( 'bar' | 'bars' ) -> BAR | ( 'mbar' | 'millibar' | 'millibars' ) -> MILLIBAR | ( 'atm' | 'atms' | 'atmosphere' | 'atmospheres' ) -> ATMOSPHERE )
            int alt57=6;
            switch ( input.LA(1) ) {
            case 128:
            case 129:
            case 130:
                {
                alt57=1;
                }
                break;
            case 131:
            case 132:
            case 133:
                {
                alt57=2;
                }
                break;
            case 134:
            case 135:
            case 136:
                {
                alt57=3;
                }
                break;
            case 137:
            case 138:
                {
                alt57=4;
                }
                break;
            case 139:
            case 140:
            case 141:
                {
                alt57=5;
                }
                break;
            case 142:
            case 143:
            case 144:
            case 145:
                {
                alt57=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:258:4: ( 'kpa' | 'kilopascal' | 'kilopascals' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:258:4: ( 'kpa' | 'kilopascal' | 'kilopascals' )
                    int alt51=3;
                    switch ( input.LA(1) ) {
                    case 128:
                        {
                        alt51=1;
                        }
                        break;
                    case 129:
                        {
                        alt51=2;
                        }
                        break;
                    case 130:
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
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:258:5: 'kpa'
                            {
                            string_literal130=(Token)match(input,128,FOLLOW_128_in_pressureUnit1287);  
                            stream_128.add(string_literal130);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:258:11: 'kilopascal'
                            {
                            string_literal131=(Token)match(input,129,FOLLOW_129_in_pressureUnit1289);  
                            stream_129.add(string_literal131);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:258:24: 'kilopascals'
                            {
                            string_literal132=(Token)match(input,130,FOLLOW_130_in_pressureUnit1291);  
                            stream_130.add(string_literal132);


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
                    // 259:2: -> KILOPASCAL
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(KILOPASCAL, "KILOPASCAL"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:260:4: ( 'hpa' | 'hectopascal' | 'hectopascals' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:260:4: ( 'hpa' | 'hectopascal' | 'hectopascals' )
                    int alt52=3;
                    switch ( input.LA(1) ) {
                    case 131:
                        {
                        alt52=1;
                        }
                        break;
                    case 132:
                        {
                        alt52=2;
                        }
                        break;
                    case 133:
                        {
                        alt52=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 52, 0, input);

                        throw nvae;
                    }

                    switch (alt52) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:260:5: 'hpa'
                            {
                            string_literal133=(Token)match(input,131,FOLLOW_131_in_pressureUnit1303);  
                            stream_131.add(string_literal133);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:260:11: 'hectopascal'
                            {
                            string_literal134=(Token)match(input,132,FOLLOW_132_in_pressureUnit1305);  
                            stream_132.add(string_literal134);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:260:25: 'hectopascals'
                            {
                            string_literal135=(Token)match(input,133,FOLLOW_133_in_pressureUnit1307);  
                            stream_133.add(string_literal135);


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
                    // 261:2: -> HECTOPASCAL
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(HECTOPASCAL, "HECTOPASCAL"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:262:4: ( 'pa' | 'pascal' | 'pascals' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:262:4: ( 'pa' | 'pascal' | 'pascals' )
                    int alt53=3;
                    switch ( input.LA(1) ) {
                    case 134:
                        {
                        alt53=1;
                        }
                        break;
                    case 135:
                        {
                        alt53=2;
                        }
                        break;
                    case 136:
                        {
                        alt53=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 53, 0, input);

                        throw nvae;
                    }

                    switch (alt53) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:262:5: 'pa'
                            {
                            string_literal136=(Token)match(input,134,FOLLOW_134_in_pressureUnit1319);  
                            stream_134.add(string_literal136);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:262:10: 'pascal'
                            {
                            string_literal137=(Token)match(input,135,FOLLOW_135_in_pressureUnit1321);  
                            stream_135.add(string_literal137);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:262:19: 'pascals'
                            {
                            string_literal138=(Token)match(input,136,FOLLOW_136_in_pressureUnit1323);  
                            stream_136.add(string_literal138);


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
                    // 263:2: -> PASCAL
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(PASCAL, "PASCAL"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:264:4: ( 'bar' | 'bars' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:264:4: ( 'bar' | 'bars' )
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==137) ) {
                        alt54=1;
                    }
                    else if ( (LA54_0==138) ) {
                        alt54=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 54, 0, input);

                        throw nvae;
                    }
                    switch (alt54) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:264:5: 'bar'
                            {
                            string_literal139=(Token)match(input,137,FOLLOW_137_in_pressureUnit1335);  
                            stream_137.add(string_literal139);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:264:11: 'bars'
                            {
                            string_literal140=(Token)match(input,138,FOLLOW_138_in_pressureUnit1337);  
                            stream_138.add(string_literal140);


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
                    // 265:2: -> BAR
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(BAR, "BAR"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:266:4: ( 'mbar' | 'millibar' | 'millibars' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:266:4: ( 'mbar' | 'millibar' | 'millibars' )
                    int alt55=3;
                    switch ( input.LA(1) ) {
                    case 139:
                        {
                        alt55=1;
                        }
                        break;
                    case 140:
                        {
                        alt55=2;
                        }
                        break;
                    case 141:
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
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:266:5: 'mbar'
                            {
                            string_literal141=(Token)match(input,139,FOLLOW_139_in_pressureUnit1349);  
                            stream_139.add(string_literal141);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:266:12: 'millibar'
                            {
                            string_literal142=(Token)match(input,140,FOLLOW_140_in_pressureUnit1351);  
                            stream_140.add(string_literal142);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:266:23: 'millibars'
                            {
                            string_literal143=(Token)match(input,141,FOLLOW_141_in_pressureUnit1353);  
                            stream_141.add(string_literal143);


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
                    // 267:2: -> MILLIBAR
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MILLIBAR, "MILLIBAR"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:268:4: ( 'atm' | 'atms' | 'atmosphere' | 'atmospheres' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:268:4: ( 'atm' | 'atms' | 'atmosphere' | 'atmospheres' )
                    int alt56=4;
                    switch ( input.LA(1) ) {
                    case 142:
                        {
                        alt56=1;
                        }
                        break;
                    case 143:
                        {
                        alt56=2;
                        }
                        break;
                    case 144:
                        {
                        alt56=3;
                        }
                        break;
                    case 145:
                        {
                        alt56=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 56, 0, input);

                        throw nvae;
                    }

                    switch (alt56) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:268:5: 'atm'
                            {
                            string_literal144=(Token)match(input,142,FOLLOW_142_in_pressureUnit1365);  
                            stream_142.add(string_literal144);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:268:11: 'atms'
                            {
                            string_literal145=(Token)match(input,143,FOLLOW_143_in_pressureUnit1367);  
                            stream_143.add(string_literal145);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:268:18: 'atmosphere'
                            {
                            string_literal146=(Token)match(input,144,FOLLOW_144_in_pressureUnit1369);  
                            stream_144.add(string_literal146);


                            }
                            break;
                        case 4 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:268:31: 'atmospheres'
                            {
                            string_literal147=(Token)match(input,145,FOLLOW_145_in_pressureUnit1371);  
                            stream_145.add(string_literal147);


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
                    // 269:2: -> ATMOSPHERE
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

    public static class radius_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "radius"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:274:1: radius : ( 'in' | With )? ( 'a' )? ( 'radius' ( 'of' )? distanceValue | distanceValue 'radius' ) -> ^( RADIUS distanceValue ) ;
    public final flipsParser.radius_return radius() throws RecognitionException {
        flipsParser.radius_return retval = new flipsParser.radius_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal148=null;
        Token With149=null;
        Token char_literal150=null;
        Token string_literal151=null;
        Token string_literal152=null;
        Token string_literal155=null;
        flipsParser.distanceValue_return distanceValue153 = null;

        flipsParser.distanceValue_return distanceValue154 = null;


        CommonTree string_literal148_tree=null;
        CommonTree With149_tree=null;
        CommonTree char_literal150_tree=null;
        CommonTree string_literal151_tree=null;
        CommonTree string_literal152_tree=null;
        CommonTree string_literal155_tree=null;
        RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
        RewriteRuleTokenStream stream_146=new RewriteRuleTokenStream(adaptor,"token 146");
        RewriteRuleTokenStream stream_147=new RewriteRuleTokenStream(adaptor,"token 147");
        RewriteRuleTokenStream stream_120=new RewriteRuleTokenStream(adaptor,"token 120");
        RewriteRuleTokenStream stream_With=new RewriteRuleTokenStream(adaptor,"token With");
        RewriteRuleSubtreeStream stream_distanceValue=new RewriteRuleSubtreeStream(adaptor,"rule distanceValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:275:2: ( ( 'in' | With )? ( 'a' )? ( 'radius' ( 'of' )? distanceValue | distanceValue 'radius' ) -> ^( RADIUS distanceValue ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:275:4: ( 'in' | With )? ( 'a' )? ( 'radius' ( 'of' )? distanceValue | distanceValue 'radius' )
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:275:4: ( 'in' | With )?
            int alt58=3;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==146) ) {
                alt58=1;
            }
            else if ( (LA58_0==With) ) {
                alt58=2;
            }
            switch (alt58) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:275:5: 'in'
                    {
                    string_literal148=(Token)match(input,146,FOLLOW_146_in_radius1391);  
                    stream_146.add(string_literal148);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:275:10: With
                    {
                    With149=(Token)match(input,With,FOLLOW_With_in_radius1393);  
                    stream_With.add(With149);


                    }
                    break;

            }

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:275:17: ( 'a' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==125) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:275:17: 'a'
                    {
                    char_literal150=(Token)match(input,125,FOLLOW_125_in_radius1397);  
                    stream_125.add(char_literal150);


                    }
                    break;

            }

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:275:22: ( 'radius' ( 'of' )? distanceValue | distanceValue 'radius' )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==147) ) {
                alt61=1;
            }
            else if ( ((LA61_0>=FloatingPointLiteral && LA61_0<=HexLiteral)) ) {
                alt61=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:275:23: 'radius' ( 'of' )? distanceValue
                    {
                    string_literal151=(Token)match(input,147,FOLLOW_147_in_radius1401);  
                    stream_147.add(string_literal151);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:275:32: ( 'of' )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==120) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:275:32: 'of'
                            {
                            string_literal152=(Token)match(input,120,FOLLOW_120_in_radius1403);  
                            stream_120.add(string_literal152);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_distanceValue_in_radius1406);
                    distanceValue153=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(distanceValue153.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:275:52: distanceValue 'radius'
                    {
                    pushFollow(FOLLOW_distanceValue_in_radius1408);
                    distanceValue154=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(distanceValue154.getTree());
                    string_literal155=(Token)match(input,147,FOLLOW_147_in_radius1410);  
                    stream_147.add(string_literal155);


                    }
                    break;

            }



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
            // 276:2: -> ^( RADIUS distanceValue )
            {
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:276:5: ^( RADIUS distanceValue )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RADIUS, "RADIUS"), root_1);

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
    // $ANTLR end "radius"

    public static class distance_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "distance"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:279:1: distance : ( leftRightDirection )? distanceValue -> ^( DISTANCE ( leftRightDirection )? distanceValue ) ;
    public final flipsParser.distance_return distance() throws RecognitionException {
        flipsParser.distance_return retval = new flipsParser.distance_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.leftRightDirection_return leftRightDirection156 = null;

        flipsParser.distanceValue_return distanceValue157 = null;


        RewriteRuleSubtreeStream stream_leftRightDirection=new RewriteRuleSubtreeStream(adaptor,"rule leftRightDirection");
        RewriteRuleSubtreeStream stream_distanceValue=new RewriteRuleSubtreeStream(adaptor,"rule distanceValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:280:2: ( ( leftRightDirection )? distanceValue -> ^( DISTANCE ( leftRightDirection )? distanceValue ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:280:4: ( leftRightDirection )? distanceValue
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:280:4: ( leftRightDirection )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( ((LA62_0>=250 && LA62_0<=255)) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:280:4: leftRightDirection
                    {
                    pushFollow(FOLLOW_leftRightDirection_in_distance1431);
                    leftRightDirection156=leftRightDirection();

                    state._fsp--;

                    stream_leftRightDirection.add(leftRightDirection156.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_distanceValue_in_distance1434);
            distanceValue157=distanceValue();

            state._fsp--;

            stream_distanceValue.add(distanceValue157.getTree());


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
            // 281:2: -> ^( DISTANCE ( leftRightDirection )? distanceValue )
            {
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:281:5: ^( DISTANCE ( leftRightDirection )? distanceValue )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DISTANCE, "DISTANCE"), root_1);

                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:281:16: ( leftRightDirection )?
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:284:1: distanceValue : numericValue distanceUnit ;
    public final flipsParser.distanceValue_return distanceValue() throws RecognitionException {
        flipsParser.distanceValue_return retval = new flipsParser.distanceValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.numericValue_return numericValue158 = null;

        flipsParser.distanceUnit_return distanceUnit159 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:285:2: ( numericValue distanceUnit )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:285:4: numericValue distanceUnit
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_numericValue_in_distanceValue1457);
            numericValue158=numericValue();

            state._fsp--;

            adaptor.addChild(root_0, numericValue158.getTree());
            pushFollow(FOLLOW_distanceUnit_in_distanceValue1459);
            distanceUnit159=distanceUnit();

            state._fsp--;

            adaptor.addChild(root_0, distanceUnit159.getTree());

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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:288:1: distanceUnit : ( ( 'km' | 'kilometer' | 'kilometers' ) -> KILOMETER | ( 'm' | 'meter' | 'meters' ) -> METER | ( 'nm' | 'nautical' ( 'mi' | 'mile' | 'miles' ) ) -> NAUTICAL MILE | ( 'statute' )? ( 'mi' | 'mile' | 'miles' ) -> MILE | ( 'yd' | 'yard' | 'yards' ) -> YARD | ( 'ft' | 'foot' | 'feet' ) -> FOOT );
    public final flipsParser.distanceUnit_return distanceUnit() throws RecognitionException {
        flipsParser.distanceUnit_return retval = new flipsParser.distanceUnit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal160=null;
        Token string_literal161=null;
        Token string_literal162=null;
        Token char_literal163=null;
        Token string_literal164=null;
        Token string_literal165=null;
        Token string_literal166=null;
        Token string_literal167=null;
        Token string_literal168=null;
        Token string_literal169=null;
        Token string_literal170=null;
        Token string_literal171=null;
        Token string_literal172=null;
        Token string_literal173=null;
        Token string_literal174=null;
        Token string_literal175=null;
        Token string_literal176=null;
        Token string_literal177=null;
        Token string_literal178=null;
        Token string_literal179=null;
        Token string_literal180=null;

        CommonTree string_literal160_tree=null;
        CommonTree string_literal161_tree=null;
        CommonTree string_literal162_tree=null;
        CommonTree char_literal163_tree=null;
        CommonTree string_literal164_tree=null;
        CommonTree string_literal165_tree=null;
        CommonTree string_literal166_tree=null;
        CommonTree string_literal167_tree=null;
        CommonTree string_literal168_tree=null;
        CommonTree string_literal169_tree=null;
        CommonTree string_literal170_tree=null;
        CommonTree string_literal171_tree=null;
        CommonTree string_literal172_tree=null;
        CommonTree string_literal173_tree=null;
        CommonTree string_literal174_tree=null;
        CommonTree string_literal175_tree=null;
        CommonTree string_literal176_tree=null;
        CommonTree string_literal177_tree=null;
        CommonTree string_literal178_tree=null;
        CommonTree string_literal179_tree=null;
        CommonTree string_literal180_tree=null;
        RewriteRuleTokenStream stream_148=new RewriteRuleTokenStream(adaptor,"token 148");
        RewriteRuleTokenStream stream_149=new RewriteRuleTokenStream(adaptor,"token 149");
        RewriteRuleTokenStream stream_159=new RewriteRuleTokenStream(adaptor,"token 159");
        RewriteRuleTokenStream stream_158=new RewriteRuleTokenStream(adaptor,"token 158");
        RewriteRuleTokenStream stream_157=new RewriteRuleTokenStream(adaptor,"token 157");
        RewriteRuleTokenStream stream_165=new RewriteRuleTokenStream(adaptor,"token 165");
        RewriteRuleTokenStream stream_156=new RewriteRuleTokenStream(adaptor,"token 156");
        RewriteRuleTokenStream stream_155=new RewriteRuleTokenStream(adaptor,"token 155");
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");
        RewriteRuleTokenStream stream_161=new RewriteRuleTokenStream(adaptor,"token 161");
        RewriteRuleTokenStream stream_152=new RewriteRuleTokenStream(adaptor,"token 152");
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleTokenStream stream_162=new RewriteRuleTokenStream(adaptor,"token 162");
        RewriteRuleTokenStream stream_163=new RewriteRuleTokenStream(adaptor,"token 163");
        RewriteRuleTokenStream stream_150=new RewriteRuleTokenStream(adaptor,"token 150");
        RewriteRuleTokenStream stream_164=new RewriteRuleTokenStream(adaptor,"token 164");
        RewriteRuleTokenStream stream_151=new RewriteRuleTokenStream(adaptor,"token 151");
        RewriteRuleTokenStream stream_160=new RewriteRuleTokenStream(adaptor,"token 160");

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:289:2: ( ( 'km' | 'kilometer' | 'kilometers' ) -> KILOMETER | ( 'm' | 'meter' | 'meters' ) -> METER | ( 'nm' | 'nautical' ( 'mi' | 'mile' | 'miles' ) ) -> NAUTICAL MILE | ( 'statute' )? ( 'mi' | 'mile' | 'miles' ) -> MILE | ( 'yd' | 'yard' | 'yards' ) -> YARD | ( 'ft' | 'foot' | 'feet' ) -> FOOT )
            int alt71=6;
            switch ( input.LA(1) ) {
            case 148:
            case 149:
            case 150:
                {
                alt71=1;
                }
                break;
            case 151:
            case 152:
            case 153:
                {
                alt71=2;
                }
                break;
            case 154:
            case 155:
                {
                alt71=3;
                }
                break;
            case 156:
            case 157:
            case 158:
            case 159:
                {
                alt71=4;
                }
                break;
            case 160:
            case 161:
            case 162:
                {
                alt71=5;
                }
                break;
            case 163:
            case 164:
            case 165:
                {
                alt71=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:289:4: ( 'km' | 'kilometer' | 'kilometers' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:289:4: ( 'km' | 'kilometer' | 'kilometers' )
                    int alt63=3;
                    switch ( input.LA(1) ) {
                    case 148:
                        {
                        alt63=1;
                        }
                        break;
                    case 149:
                        {
                        alt63=2;
                        }
                        break;
                    case 150:
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
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:289:5: 'km'
                            {
                            string_literal160=(Token)match(input,148,FOLLOW_148_in_distanceUnit1471);  
                            stream_148.add(string_literal160);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:289:10: 'kilometer'
                            {
                            string_literal161=(Token)match(input,149,FOLLOW_149_in_distanceUnit1473);  
                            stream_149.add(string_literal161);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:289:22: 'kilometers'
                            {
                            string_literal162=(Token)match(input,150,FOLLOW_150_in_distanceUnit1475);  
                            stream_150.add(string_literal162);


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
                    // 290:2: -> KILOMETER
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(KILOMETER, "KILOMETER"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:291:4: ( 'm' | 'meter' | 'meters' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:291:4: ( 'm' | 'meter' | 'meters' )
                    int alt64=3;
                    switch ( input.LA(1) ) {
                    case 151:
                        {
                        alt64=1;
                        }
                        break;
                    case 152:
                        {
                        alt64=2;
                        }
                        break;
                    case 153:
                        {
                        alt64=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 64, 0, input);

                        throw nvae;
                    }

                    switch (alt64) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:291:5: 'm'
                            {
                            char_literal163=(Token)match(input,151,FOLLOW_151_in_distanceUnit1487);  
                            stream_151.add(char_literal163);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:291:9: 'meter'
                            {
                            string_literal164=(Token)match(input,152,FOLLOW_152_in_distanceUnit1489);  
                            stream_152.add(string_literal164);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:291:17: 'meters'
                            {
                            string_literal165=(Token)match(input,153,FOLLOW_153_in_distanceUnit1491);  
                            stream_153.add(string_literal165);


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
                    // 292:2: -> METER
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(METER, "METER"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:293:4: ( 'nm' | 'nautical' ( 'mi' | 'mile' | 'miles' ) )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:293:4: ( 'nm' | 'nautical' ( 'mi' | 'mile' | 'miles' ) )
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==154) ) {
                        alt66=1;
                    }
                    else if ( (LA66_0==155) ) {
                        alt66=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 66, 0, input);

                        throw nvae;
                    }
                    switch (alt66) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:293:5: 'nm'
                            {
                            string_literal166=(Token)match(input,154,FOLLOW_154_in_distanceUnit1503);  
                            stream_154.add(string_literal166);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:293:10: 'nautical' ( 'mi' | 'mile' | 'miles' )
                            {
                            string_literal167=(Token)match(input,155,FOLLOW_155_in_distanceUnit1505);  
                            stream_155.add(string_literal167);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:293:21: ( 'mi' | 'mile' | 'miles' )
                            int alt65=3;
                            switch ( input.LA(1) ) {
                            case 156:
                                {
                                alt65=1;
                                }
                                break;
                            case 157:
                                {
                                alt65=2;
                                }
                                break;
                            case 158:
                                {
                                alt65=3;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 65, 0, input);

                                throw nvae;
                            }

                            switch (alt65) {
                                case 1 :
                                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:293:22: 'mi'
                                    {
                                    string_literal168=(Token)match(input,156,FOLLOW_156_in_distanceUnit1508);  
                                    stream_156.add(string_literal168);


                                    }
                                    break;
                                case 2 :
                                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:293:27: 'mile'
                                    {
                                    string_literal169=(Token)match(input,157,FOLLOW_157_in_distanceUnit1510);  
                                    stream_157.add(string_literal169);


                                    }
                                    break;
                                case 3 :
                                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:293:34: 'miles'
                                    {
                                    string_literal170=(Token)match(input,158,FOLLOW_158_in_distanceUnit1512);  
                                    stream_158.add(string_literal170);


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
                    // 294:2: -> NAUTICAL MILE
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NAUTICAL, "NAUTICAL"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MILE, "MILE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:295:4: ( 'statute' )? ( 'mi' | 'mile' | 'miles' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:295:4: ( 'statute' )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==159) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:295:5: 'statute'
                            {
                            string_literal171=(Token)match(input,159,FOLLOW_159_in_distanceUnit1527);  
                            stream_159.add(string_literal171);


                            }
                            break;

                    }

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:295:17: ( 'mi' | 'mile' | 'miles' )
                    int alt68=3;
                    switch ( input.LA(1) ) {
                    case 156:
                        {
                        alt68=1;
                        }
                        break;
                    case 157:
                        {
                        alt68=2;
                        }
                        break;
                    case 158:
                        {
                        alt68=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 68, 0, input);

                        throw nvae;
                    }

                    switch (alt68) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:295:18: 'mi'
                            {
                            string_literal172=(Token)match(input,156,FOLLOW_156_in_distanceUnit1532);  
                            stream_156.add(string_literal172);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:295:23: 'mile'
                            {
                            string_literal173=(Token)match(input,157,FOLLOW_157_in_distanceUnit1534);  
                            stream_157.add(string_literal173);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:295:30: 'miles'
                            {
                            string_literal174=(Token)match(input,158,FOLLOW_158_in_distanceUnit1536);  
                            stream_158.add(string_literal174);


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
                    // 296:2: -> MILE
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MILE, "MILE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:297:4: ( 'yd' | 'yard' | 'yards' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:297:4: ( 'yd' | 'yard' | 'yards' )
                    int alt69=3;
                    switch ( input.LA(1) ) {
                    case 160:
                        {
                        alt69=1;
                        }
                        break;
                    case 161:
                        {
                        alt69=2;
                        }
                        break;
                    case 162:
                        {
                        alt69=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 69, 0, input);

                        throw nvae;
                    }

                    switch (alt69) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:297:5: 'yd'
                            {
                            string_literal175=(Token)match(input,160,FOLLOW_160_in_distanceUnit1548);  
                            stream_160.add(string_literal175);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:297:10: 'yard'
                            {
                            string_literal176=(Token)match(input,161,FOLLOW_161_in_distanceUnit1550);  
                            stream_161.add(string_literal176);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:297:17: 'yards'
                            {
                            string_literal177=(Token)match(input,162,FOLLOW_162_in_distanceUnit1552);  
                            stream_162.add(string_literal177);


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
                    // 298:2: -> YARD
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(YARD, "YARD"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:299:4: ( 'ft' | 'foot' | 'feet' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:299:4: ( 'ft' | 'foot' | 'feet' )
                    int alt70=3;
                    switch ( input.LA(1) ) {
                    case 163:
                        {
                        alt70=1;
                        }
                        break;
                    case 164:
                        {
                        alt70=2;
                        }
                        break;
                    case 165:
                        {
                        alt70=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 70, 0, input);

                        throw nvae;
                    }

                    switch (alt70) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:299:5: 'ft'
                            {
                            string_literal178=(Token)match(input,163,FOLLOW_163_in_distanceUnit1564);  
                            stream_163.add(string_literal178);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:299:10: 'foot'
                            {
                            string_literal179=(Token)match(input,164,FOLLOW_164_in_distanceUnit1566);  
                            stream_164.add(string_literal179);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:299:17: 'feet'
                            {
                            string_literal180=(Token)match(input,165,FOLLOW_165_in_distanceUnit1568);  
                            stream_165.add(string_literal180);


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
                    // 300:2: -> FOOT
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

    public static class speed_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "speed"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:305:1: speed : ( fixedSpeed | relativeSpeed | optimalSpeed | throttleSpeed );
    public final flipsParser.speed_return speed() throws RecognitionException {
        flipsParser.speed_return retval = new flipsParser.speed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.fixedSpeed_return fixedSpeed181 = null;

        flipsParser.relativeSpeed_return relativeSpeed182 = null;

        flipsParser.optimalSpeed_return optimalSpeed183 = null;

        flipsParser.throttleSpeed_return throttleSpeed184 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:306:2: ( fixedSpeed | relativeSpeed | optimalSpeed | throttleSpeed )
            int alt72=4;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==At) ) {
                switch ( input.LA(2) ) {
                case BinaryLiteral:
                case OctalLiteral:
                case DecimalLiteral:
                case HexLiteral:
                    {
                    int LA72_3 = input.LA(3);

                    if ( ((LA72_3>=271 && LA72_3<=272)) ) {
                        alt72=4;
                    }
                    else if ( ((LA72_3>=148 && LA72_3<=165)||(LA72_3>=168 && LA72_3<=174)) ) {
                        alt72=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 72, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case FloatingPointLiteral:
                    {
                    int LA72_4 = input.LA(3);

                    if ( ((LA72_4>=271 && LA72_4<=272)) ) {
                        alt72=4;
                    }
                    else if ( ((LA72_4>=148 && LA72_4<=165)||(LA72_4>=168 && LA72_4<=174)) ) {
                        alt72=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 72, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 179:
                case 180:
                case 181:
                case 182:
                case 183:
                case 184:
                    {
                    alt72=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 72, 1, input);

                    throw nvae;
                }

            }
            else if ( ((LA72_0>=FloatingPointLiteral && LA72_0<=HexLiteral)) ) {
                alt72=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:306:4: fixedSpeed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_fixedSpeed_in_speed1587);
                    fixedSpeed181=fixedSpeed();

                    state._fsp--;

                    adaptor.addChild(root_0, fixedSpeed181.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:307:4: relativeSpeed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_relativeSpeed_in_speed1592);
                    relativeSpeed182=relativeSpeed();

                    state._fsp--;

                    adaptor.addChild(root_0, relativeSpeed182.getTree());

                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:308:4: optimalSpeed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_optimalSpeed_in_speed1597);
                    optimalSpeed183=optimalSpeed();

                    state._fsp--;

                    adaptor.addChild(root_0, optimalSpeed183.getTree());

                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:309:4: throttleSpeed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_throttleSpeed_in_speed1602);
                    throttleSpeed184=throttleSpeed();

                    state._fsp--;

                    adaptor.addChild(root_0, throttleSpeed184.getTree());

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
    // $ANTLR end "speed"

    public static class fixedSpeed_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fixedSpeed"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:312:1: fixedSpeed : At speedValue -> ^( SPEED FIXED speedValue ) ;
    public final flipsParser.fixedSpeed_return fixedSpeed() throws RecognitionException {
        flipsParser.fixedSpeed_return retval = new flipsParser.fixedSpeed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token At185=null;
        flipsParser.speedValue_return speedValue186 = null;


        CommonTree At185_tree=null;
        RewriteRuleTokenStream stream_At=new RewriteRuleTokenStream(adaptor,"token At");
        RewriteRuleSubtreeStream stream_speedValue=new RewriteRuleSubtreeStream(adaptor,"rule speedValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:313:2: ( At speedValue -> ^( SPEED FIXED speedValue ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:313:4: At speedValue
            {
            At185=(Token)match(input,At,FOLLOW_At_in_fixedSpeed1613);  
            stream_At.add(At185);

            pushFollow(FOLLOW_speedValue_in_fixedSpeed1615);
            speedValue186=speedValue();

            state._fsp--;

            stream_speedValue.add(speedValue186.getTree());


            // AST REWRITE
            // elements: speedValue
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 314:2: -> ^( SPEED FIXED speedValue )
            {
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:314:5: ^( SPEED FIXED speedValue )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SPEED, "SPEED"), root_1);

                adaptor.addChild(root_1, (CommonTree)adaptor.create(FIXED, "FIXED"));
                adaptor.addChild(root_1, stream_speedValue.nextTree());

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
    // $ANTLR end "fixedSpeed"

    public static class relativeSpeed_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relativeSpeed"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:317:1: relativeSpeed : ( speedValue 'faster' -> ^( SPEED RELATIVE FASTER speedValue ) | speedValue 'slower' -> ^( SPEED RELATIVE SLOWER speedValue ) | percentValue 'faster' -> ^( SPEED RELATIVE FASTER percentValue ) | percentValue 'slower' -> ^( SPEED RELATIVE SLOWER percentValue ) );
    public final flipsParser.relativeSpeed_return relativeSpeed() throws RecognitionException {
        flipsParser.relativeSpeed_return retval = new flipsParser.relativeSpeed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal188=null;
        Token string_literal190=null;
        Token string_literal192=null;
        Token string_literal194=null;
        flipsParser.speedValue_return speedValue187 = null;

        flipsParser.speedValue_return speedValue189 = null;

        flipsParser.percentValue_return percentValue191 = null;

        flipsParser.percentValue_return percentValue193 = null;


        CommonTree string_literal188_tree=null;
        CommonTree string_literal190_tree=null;
        CommonTree string_literal192_tree=null;
        CommonTree string_literal194_tree=null;
        RewriteRuleTokenStream stream_166=new RewriteRuleTokenStream(adaptor,"token 166");
        RewriteRuleTokenStream stream_167=new RewriteRuleTokenStream(adaptor,"token 167");
        RewriteRuleSubtreeStream stream_speedValue=new RewriteRuleSubtreeStream(adaptor,"rule speedValue");
        RewriteRuleSubtreeStream stream_percentValue=new RewriteRuleSubtreeStream(adaptor,"rule percentValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:318:2: ( speedValue 'faster' -> ^( SPEED RELATIVE FASTER speedValue ) | speedValue 'slower' -> ^( SPEED RELATIVE SLOWER speedValue ) | percentValue 'faster' -> ^( SPEED RELATIVE FASTER percentValue ) | percentValue 'slower' -> ^( SPEED RELATIVE SLOWER percentValue ) )
            int alt73=4;
            alt73 = dfa73.predict(input);
            switch (alt73) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:318:4: speedValue 'faster'
                    {
                    pushFollow(FOLLOW_speedValue_in_relativeSpeed1637);
                    speedValue187=speedValue();

                    state._fsp--;

                    stream_speedValue.add(speedValue187.getTree());
                    string_literal188=(Token)match(input,166,FOLLOW_166_in_relativeSpeed1639);  
                    stream_166.add(string_literal188);



                    // AST REWRITE
                    // elements: speedValue
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 319:2: -> ^( SPEED RELATIVE FASTER speedValue )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:319:5: ^( SPEED RELATIVE FASTER speedValue )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SPEED, "SPEED"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(RELATIVE, "RELATIVE"));
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(FASTER, "FASTER"));
                        adaptor.addChild(root_1, stream_speedValue.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:320:4: speedValue 'slower'
                    {
                    pushFollow(FOLLOW_speedValue_in_relativeSpeed1657);
                    speedValue189=speedValue();

                    state._fsp--;

                    stream_speedValue.add(speedValue189.getTree());
                    string_literal190=(Token)match(input,167,FOLLOW_167_in_relativeSpeed1659);  
                    stream_167.add(string_literal190);



                    // AST REWRITE
                    // elements: speedValue
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 321:2: -> ^( SPEED RELATIVE SLOWER speedValue )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:321:5: ^( SPEED RELATIVE SLOWER speedValue )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SPEED, "SPEED"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(RELATIVE, "RELATIVE"));
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(SLOWER, "SLOWER"));
                        adaptor.addChild(root_1, stream_speedValue.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:322:4: percentValue 'faster'
                    {
                    pushFollow(FOLLOW_percentValue_in_relativeSpeed1677);
                    percentValue191=percentValue();

                    state._fsp--;

                    stream_percentValue.add(percentValue191.getTree());
                    string_literal192=(Token)match(input,166,FOLLOW_166_in_relativeSpeed1679);  
                    stream_166.add(string_literal192);



                    // AST REWRITE
                    // elements: percentValue
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 323:2: -> ^( SPEED RELATIVE FASTER percentValue )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:323:5: ^( SPEED RELATIVE FASTER percentValue )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SPEED, "SPEED"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(RELATIVE, "RELATIVE"));
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(FASTER, "FASTER"));
                        adaptor.addChild(root_1, stream_percentValue.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:324:4: percentValue 'slower'
                    {
                    pushFollow(FOLLOW_percentValue_in_relativeSpeed1697);
                    percentValue193=percentValue();

                    state._fsp--;

                    stream_percentValue.add(percentValue193.getTree());
                    string_literal194=(Token)match(input,167,FOLLOW_167_in_relativeSpeed1699);  
                    stream_167.add(string_literal194);



                    // AST REWRITE
                    // elements: percentValue
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 325:2: -> ^( SPEED RELATIVE SLOWER percentValue )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:325:5: ^( SPEED RELATIVE SLOWER percentValue )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SPEED, "SPEED"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(RELATIVE, "RELATIVE"));
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(SLOWER, "SLOWER"));
                        adaptor.addChild(root_1, stream_percentValue.nextTree());

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
    // $ANTLR end "relativeSpeed"

    public static class speedValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "speedValue"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:328:1: speedValue : numericValue speedUnit ;
    public final flipsParser.speedValue_return speedValue() throws RecognitionException {
        flipsParser.speedValue_return retval = new flipsParser.speedValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.numericValue_return numericValue195 = null;

        flipsParser.speedUnit_return speedUnit196 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:329:2: ( numericValue speedUnit )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:329:4: numericValue speedUnit
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_numericValue_in_speedValue1723);
            numericValue195=numericValue();

            state._fsp--;

            adaptor.addChild(root_0, numericValue195.getTree());
            pushFollow(FOLLOW_speedUnit_in_speedValue1725);
            speedUnit196=speedUnit();

            state._fsp--;

            adaptor.addChild(root_0, speedUnit196.getTree());

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
    // $ANTLR end "speedValue"

    public static class speedUnit_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "speedUnit"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:332:1: speedUnit : ( 'kph' -> KILOMETER HOUR | 'mph' -> MILE HOUR | ( 'kn' | 'kt' | 'kts' | 'knot' | 'knots' ) -> NAUTICAL MILE HOUR | distanceUnit ( '/' | 'per' ) timeUnit -> distanceUnit timeUnit );
    public final flipsParser.speedUnit_return speedUnit() throws RecognitionException {
        flipsParser.speedUnit_return retval = new flipsParser.speedUnit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal197=null;
        Token string_literal198=null;
        Token string_literal199=null;
        Token string_literal200=null;
        Token string_literal201=null;
        Token string_literal202=null;
        Token string_literal203=null;
        Token char_literal205=null;
        Token string_literal206=null;
        flipsParser.distanceUnit_return distanceUnit204 = null;

        flipsParser.timeUnit_return timeUnit207 = null;


        CommonTree string_literal197_tree=null;
        CommonTree string_literal198_tree=null;
        CommonTree string_literal199_tree=null;
        CommonTree string_literal200_tree=null;
        CommonTree string_literal201_tree=null;
        CommonTree string_literal202_tree=null;
        CommonTree string_literal203_tree=null;
        CommonTree char_literal205_tree=null;
        CommonTree string_literal206_tree=null;
        RewriteRuleTokenStream stream_170=new RewriteRuleTokenStream(adaptor,"token 170");
        RewriteRuleTokenStream stream_171=new RewriteRuleTokenStream(adaptor,"token 171");
        RewriteRuleTokenStream stream_174=new RewriteRuleTokenStream(adaptor,"token 174");
        RewriteRuleTokenStream stream_175=new RewriteRuleTokenStream(adaptor,"token 175");
        RewriteRuleTokenStream stream_172=new RewriteRuleTokenStream(adaptor,"token 172");
        RewriteRuleTokenStream stream_173=new RewriteRuleTokenStream(adaptor,"token 173");
        RewriteRuleTokenStream stream_169=new RewriteRuleTokenStream(adaptor,"token 169");
        RewriteRuleTokenStream stream_176=new RewriteRuleTokenStream(adaptor,"token 176");
        RewriteRuleTokenStream stream_168=new RewriteRuleTokenStream(adaptor,"token 168");
        RewriteRuleSubtreeStream stream_timeUnit=new RewriteRuleSubtreeStream(adaptor,"rule timeUnit");
        RewriteRuleSubtreeStream stream_distanceUnit=new RewriteRuleSubtreeStream(adaptor,"rule distanceUnit");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:333:2: ( 'kph' -> KILOMETER HOUR | 'mph' -> MILE HOUR | ( 'kn' | 'kt' | 'kts' | 'knot' | 'knots' ) -> NAUTICAL MILE HOUR | distanceUnit ( '/' | 'per' ) timeUnit -> distanceUnit timeUnit )
            int alt76=4;
            switch ( input.LA(1) ) {
            case 168:
                {
                alt76=1;
                }
                break;
            case 169:
                {
                alt76=2;
                }
                break;
            case 170:
            case 171:
            case 172:
            case 173:
            case 174:
                {
                alt76=3;
                }
                break;
            case 148:
            case 149:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
            case 160:
            case 161:
            case 162:
            case 163:
            case 164:
            case 165:
                {
                alt76=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:333:4: 'kph'
                    {
                    string_literal197=(Token)match(input,168,FOLLOW_168_in_speedUnit1736);  
                    stream_168.add(string_literal197);



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
                    // 334:2: -> KILOMETER HOUR
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(KILOMETER, "KILOMETER"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(HOUR, "HOUR"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:335:4: 'mph'
                    {
                    string_literal198=(Token)match(input,169,FOLLOW_169_in_speedUnit1748);  
                    stream_169.add(string_literal198);



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
                    // 336:2: -> MILE HOUR
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MILE, "MILE"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(HOUR, "HOUR"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:337:4: ( 'kn' | 'kt' | 'kts' | 'knot' | 'knots' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:337:4: ( 'kn' | 'kt' | 'kts' | 'knot' | 'knots' )
                    int alt74=5;
                    switch ( input.LA(1) ) {
                    case 170:
                        {
                        alt74=1;
                        }
                        break;
                    case 171:
                        {
                        alt74=2;
                        }
                        break;
                    case 172:
                        {
                        alt74=3;
                        }
                        break;
                    case 173:
                        {
                        alt74=4;
                        }
                        break;
                    case 174:
                        {
                        alt74=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 74, 0, input);

                        throw nvae;
                    }

                    switch (alt74) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:337:5: 'kn'
                            {
                            string_literal199=(Token)match(input,170,FOLLOW_170_in_speedUnit1761);  
                            stream_170.add(string_literal199);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:337:10: 'kt'
                            {
                            string_literal200=(Token)match(input,171,FOLLOW_171_in_speedUnit1763);  
                            stream_171.add(string_literal200);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:337:15: 'kts'
                            {
                            string_literal201=(Token)match(input,172,FOLLOW_172_in_speedUnit1765);  
                            stream_172.add(string_literal201);


                            }
                            break;
                        case 4 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:337:21: 'knot'
                            {
                            string_literal202=(Token)match(input,173,FOLLOW_173_in_speedUnit1767);  
                            stream_173.add(string_literal202);


                            }
                            break;
                        case 5 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:337:28: 'knots'
                            {
                            string_literal203=(Token)match(input,174,FOLLOW_174_in_speedUnit1769);  
                            stream_174.add(string_literal203);


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
                    // 338:2: -> NAUTICAL MILE HOUR
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NAUTICAL, "NAUTICAL"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MILE, "MILE"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(HOUR, "HOUR"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:339:4: distanceUnit ( '/' | 'per' ) timeUnit
                    {
                    pushFollow(FOLLOW_distanceUnit_in_speedUnit1784);
                    distanceUnit204=distanceUnit();

                    state._fsp--;

                    stream_distanceUnit.add(distanceUnit204.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:339:17: ( '/' | 'per' )
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==175) ) {
                        alt75=1;
                    }
                    else if ( (LA75_0==176) ) {
                        alt75=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 75, 0, input);

                        throw nvae;
                    }
                    switch (alt75) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:339:18: '/'
                            {
                            char_literal205=(Token)match(input,175,FOLLOW_175_in_speedUnit1787);  
                            stream_175.add(char_literal205);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:339:22: 'per'
                            {
                            string_literal206=(Token)match(input,176,FOLLOW_176_in_speedUnit1789);  
                            stream_176.add(string_literal206);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_timeUnit_in_speedUnit1792);
                    timeUnit207=timeUnit();

                    state._fsp--;

                    stream_timeUnit.add(timeUnit207.getTree());


                    // AST REWRITE
                    // elements: timeUnit, distanceUnit
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 340:2: -> distanceUnit timeUnit
                    {
                        adaptor.addChild(root_0, stream_distanceUnit.nextTree());
                        adaptor.addChild(root_0, stream_timeUnit.nextTree());

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
    // $ANTLR end "speedUnit"

    public static class optimalSpeed_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "optimalSpeed"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:343:1: optimalSpeed : At optimalUnit ( 'spd' | 'speed' ) -> ^( SPEED OPTIMAL optimalUnit ) ;
    public final flipsParser.optimalSpeed_return optimalSpeed() throws RecognitionException {
        flipsParser.optimalSpeed_return retval = new flipsParser.optimalSpeed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token At208=null;
        Token string_literal210=null;
        Token string_literal211=null;
        flipsParser.optimalUnit_return optimalUnit209 = null;


        CommonTree At208_tree=null;
        CommonTree string_literal210_tree=null;
        CommonTree string_literal211_tree=null;
        RewriteRuleTokenStream stream_At=new RewriteRuleTokenStream(adaptor,"token At");
        RewriteRuleTokenStream stream_178=new RewriteRuleTokenStream(adaptor,"token 178");
        RewriteRuleTokenStream stream_177=new RewriteRuleTokenStream(adaptor,"token 177");
        RewriteRuleSubtreeStream stream_optimalUnit=new RewriteRuleSubtreeStream(adaptor,"rule optimalUnit");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:344:2: ( At optimalUnit ( 'spd' | 'speed' ) -> ^( SPEED OPTIMAL optimalUnit ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:344:4: At optimalUnit ( 'spd' | 'speed' )
            {
            At208=(Token)match(input,At,FOLLOW_At_in_optimalSpeed1810);  
            stream_At.add(At208);

            pushFollow(FOLLOW_optimalUnit_in_optimalSpeed1812);
            optimalUnit209=optimalUnit();

            state._fsp--;

            stream_optimalUnit.add(optimalUnit209.getTree());
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:344:19: ( 'spd' | 'speed' )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==177) ) {
                alt77=1;
            }
            else if ( (LA77_0==178) ) {
                alt77=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:344:20: 'spd'
                    {
                    string_literal210=(Token)match(input,177,FOLLOW_177_in_optimalSpeed1815);  
                    stream_177.add(string_literal210);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:344:26: 'speed'
                    {
                    string_literal211=(Token)match(input,178,FOLLOW_178_in_optimalSpeed1817);  
                    stream_178.add(string_literal211);


                    }
                    break;

            }



            // AST REWRITE
            // elements: optimalUnit
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 345:2: -> ^( SPEED OPTIMAL optimalUnit )
            {
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:345:5: ^( SPEED OPTIMAL optimalUnit )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SPEED, "SPEED"), root_1);

                adaptor.addChild(root_1, (CommonTree)adaptor.create(OPTIMAL, "OPTIMAL"));
                adaptor.addChild(root_1, stream_optimalUnit.nextTree());

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
    // $ANTLR end "optimalSpeed"

    public static class optimalUnit_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "optimalUnit"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:348:1: optimalUnit : ( ( 'min' | 'minimum' ) -> MINIMUM | ( 'cru' | 'cruise' ) -> CRUISE | ( 'max' | 'maximum' ) -> MAXIMUM );
    public final flipsParser.optimalUnit_return optimalUnit() throws RecognitionException {
        flipsParser.optimalUnit_return retval = new flipsParser.optimalUnit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal212=null;
        Token string_literal213=null;
        Token string_literal214=null;
        Token string_literal215=null;
        Token string_literal216=null;
        Token string_literal217=null;

        CommonTree string_literal212_tree=null;
        CommonTree string_literal213_tree=null;
        CommonTree string_literal214_tree=null;
        CommonTree string_literal215_tree=null;
        CommonTree string_literal216_tree=null;
        CommonTree string_literal217_tree=null;
        RewriteRuleTokenStream stream_180=new RewriteRuleTokenStream(adaptor,"token 180");
        RewriteRuleTokenStream stream_181=new RewriteRuleTokenStream(adaptor,"token 181");
        RewriteRuleTokenStream stream_182=new RewriteRuleTokenStream(adaptor,"token 182");
        RewriteRuleTokenStream stream_183=new RewriteRuleTokenStream(adaptor,"token 183");
        RewriteRuleTokenStream stream_184=new RewriteRuleTokenStream(adaptor,"token 184");
        RewriteRuleTokenStream stream_179=new RewriteRuleTokenStream(adaptor,"token 179");

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:349:2: ( ( 'min' | 'minimum' ) -> MINIMUM | ( 'cru' | 'cruise' ) -> CRUISE | ( 'max' | 'maximum' ) -> MAXIMUM )
            int alt81=3;
            switch ( input.LA(1) ) {
            case 179:
            case 180:
                {
                alt81=1;
                }
                break;
            case 181:
            case 182:
                {
                alt81=2;
                }
                break;
            case 183:
            case 184:
                {
                alt81=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }

            switch (alt81) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:349:4: ( 'min' | 'minimum' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:349:4: ( 'min' | 'minimum' )
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==179) ) {
                        alt78=1;
                    }
                    else if ( (LA78_0==180) ) {
                        alt78=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 78, 0, input);

                        throw nvae;
                    }
                    switch (alt78) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:349:5: 'min'
                            {
                            string_literal212=(Token)match(input,179,FOLLOW_179_in_optimalUnit1841);  
                            stream_179.add(string_literal212);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:349:11: 'minimum'
                            {
                            string_literal213=(Token)match(input,180,FOLLOW_180_in_optimalUnit1843);  
                            stream_180.add(string_literal213);


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
                    // 350:2: -> MINIMUM
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MINIMUM, "MINIMUM"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:351:4: ( 'cru' | 'cruise' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:351:4: ( 'cru' | 'cruise' )
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==181) ) {
                        alt79=1;
                    }
                    else if ( (LA79_0==182) ) {
                        alt79=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 79, 0, input);

                        throw nvae;
                    }
                    switch (alt79) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:351:5: 'cru'
                            {
                            string_literal214=(Token)match(input,181,FOLLOW_181_in_optimalUnit1855);  
                            stream_181.add(string_literal214);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:351:11: 'cruise'
                            {
                            string_literal215=(Token)match(input,182,FOLLOW_182_in_optimalUnit1857);  
                            stream_182.add(string_literal215);


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
                    // 352:2: -> CRUISE
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(CRUISE, "CRUISE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:353:4: ( 'max' | 'maximum' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:353:4: ( 'max' | 'maximum' )
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==183) ) {
                        alt80=1;
                    }
                    else if ( (LA80_0==184) ) {
                        alt80=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 80, 0, input);

                        throw nvae;
                    }
                    switch (alt80) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:353:5: 'max'
                            {
                            string_literal216=(Token)match(input,183,FOLLOW_183_in_optimalUnit1869);  
                            stream_183.add(string_literal216);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:353:11: 'maximum'
                            {
                            string_literal217=(Token)match(input,184,FOLLOW_184_in_optimalUnit1871);  
                            stream_184.add(string_literal217);


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
                    // 354:2: -> MAXIMUM
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MAXIMUM, "MAXIMUM"));

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
    // $ANTLR end "optimalUnit"

    public static class throttleSpeed_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "throttleSpeed"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:357:1: throttleSpeed : At throttleValue ( 'pwr' | 'power' | 'thr' | 'throttle' ) -> ^( SPEED THROTTLE throttleValue ) ;
    public final flipsParser.throttleSpeed_return throttleSpeed() throws RecognitionException {
        flipsParser.throttleSpeed_return retval = new flipsParser.throttleSpeed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token At218=null;
        Token string_literal220=null;
        Token string_literal221=null;
        Token string_literal222=null;
        Token string_literal223=null;
        flipsParser.throttleValue_return throttleValue219 = null;


        CommonTree At218_tree=null;
        CommonTree string_literal220_tree=null;
        CommonTree string_literal221_tree=null;
        CommonTree string_literal222_tree=null;
        CommonTree string_literal223_tree=null;
        RewriteRuleTokenStream stream_185=new RewriteRuleTokenStream(adaptor,"token 185");
        RewriteRuleTokenStream stream_At=new RewriteRuleTokenStream(adaptor,"token At");
        RewriteRuleTokenStream stream_186=new RewriteRuleTokenStream(adaptor,"token 186");
        RewriteRuleTokenStream stream_188=new RewriteRuleTokenStream(adaptor,"token 188");
        RewriteRuleTokenStream stream_187=new RewriteRuleTokenStream(adaptor,"token 187");
        RewriteRuleSubtreeStream stream_throttleValue=new RewriteRuleSubtreeStream(adaptor,"rule throttleValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:358:2: ( At throttleValue ( 'pwr' | 'power' | 'thr' | 'throttle' ) -> ^( SPEED THROTTLE throttleValue ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:358:4: At throttleValue ( 'pwr' | 'power' | 'thr' | 'throttle' )
            {
            At218=(Token)match(input,At,FOLLOW_At_in_throttleSpeed1888);  
            stream_At.add(At218);

            pushFollow(FOLLOW_throttleValue_in_throttleSpeed1890);
            throttleValue219=throttleValue();

            state._fsp--;

            stream_throttleValue.add(throttleValue219.getTree());
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:358:21: ( 'pwr' | 'power' | 'thr' | 'throttle' )
            int alt82=4;
            switch ( input.LA(1) ) {
            case 185:
                {
                alt82=1;
                }
                break;
            case 186:
                {
                alt82=2;
                }
                break;
            case 187:
                {
                alt82=3;
                }
                break;
            case 188:
                {
                alt82=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:358:22: 'pwr'
                    {
                    string_literal220=(Token)match(input,185,FOLLOW_185_in_throttleSpeed1893);  
                    stream_185.add(string_literal220);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:358:28: 'power'
                    {
                    string_literal221=(Token)match(input,186,FOLLOW_186_in_throttleSpeed1895);  
                    stream_186.add(string_literal221);


                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:358:36: 'thr'
                    {
                    string_literal222=(Token)match(input,187,FOLLOW_187_in_throttleSpeed1897);  
                    stream_187.add(string_literal222);


                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:358:42: 'throttle'
                    {
                    string_literal223=(Token)match(input,188,FOLLOW_188_in_throttleSpeed1899);  
                    stream_188.add(string_literal223);


                    }
                    break;

            }



            // AST REWRITE
            // elements: throttleValue
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 359:2: -> ^( SPEED THROTTLE throttleValue )
            {
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:359:5: ^( SPEED THROTTLE throttleValue )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SPEED, "SPEED"), root_1);

                adaptor.addChild(root_1, (CommonTree)adaptor.create(THROTTLE, "THROTTLE"));
                adaptor.addChild(root_1, stream_throttleValue.nextTree());

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
    // $ANTLR end "throttleSpeed"

    public static class throttleValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "throttleValue"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:362:1: throttleValue : percentValue ;
    public final flipsParser.throttleValue_return throttleValue() throws RecognitionException {
        flipsParser.throttleValue_return retval = new flipsParser.throttleValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.percentValue_return percentValue224 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:363:2: ( percentValue )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:363:4: percentValue
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_percentValue_in_throttleValue1922);
            percentValue224=percentValue();

            state._fsp--;

            adaptor.addChild(root_0, percentValue224.getTree());

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
    // $ANTLR end "throttleValue"

    public static class time_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "time"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:368:1: time : At timeValue ;
    public final flipsParser.time_return time() throws RecognitionException {
        flipsParser.time_return retval = new flipsParser.time_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token At225=null;
        flipsParser.timeValue_return timeValue226 = null;


        CommonTree At225_tree=null;

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:369:2: ( At timeValue )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:369:4: At timeValue
            {
            root_0 = (CommonTree)adaptor.nil();

            At225=(Token)match(input,At,FOLLOW_At_in_time1935); 
            At225_tree = (CommonTree)adaptor.create(At225);
            adaptor.addChild(root_0, At225_tree);

            pushFollow(FOLLOW_timeValue_in_time1937);
            timeValue226=timeValue();

            state._fsp--;

            adaptor.addChild(root_0, timeValue226.getTree());

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
    // $ANTLR end "time"

    public static class timeValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "timeValue"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:372:1: timeValue : ( timeFormat ( 'am' | 'a.m.' ) -> ^( TIME timeFormat AM ) | integerValue ( 'am' | 'a.m.' ) -> ^( TIME integerValue HOUR AM ) | timeFormat ( 'pm' | 'p.m.' ) -> ^( TIME timeFormat PM ) | integerValue ( 'pm' | 'p.m.' ) -> ^( TIME integerValue HOUR PM ) | timeFormat -> ^( TIME timeFormat HOUR24 ) );
    public final flipsParser.timeValue_return timeValue() throws RecognitionException {
        flipsParser.timeValue_return retval = new flipsParser.timeValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal228=null;
        Token string_literal229=null;
        Token string_literal231=null;
        Token string_literal232=null;
        Token string_literal234=null;
        Token string_literal235=null;
        Token string_literal237=null;
        Token string_literal238=null;
        flipsParser.timeFormat_return timeFormat227 = null;

        flipsParser.integerValue_return integerValue230 = null;

        flipsParser.timeFormat_return timeFormat233 = null;

        flipsParser.integerValue_return integerValue236 = null;

        flipsParser.timeFormat_return timeFormat239 = null;


        CommonTree string_literal228_tree=null;
        CommonTree string_literal229_tree=null;
        CommonTree string_literal231_tree=null;
        CommonTree string_literal232_tree=null;
        CommonTree string_literal234_tree=null;
        CommonTree string_literal235_tree=null;
        CommonTree string_literal237_tree=null;
        CommonTree string_literal238_tree=null;
        RewriteRuleTokenStream stream_189=new RewriteRuleTokenStream(adaptor,"token 189");
        RewriteRuleTokenStream stream_191=new RewriteRuleTokenStream(adaptor,"token 191");
        RewriteRuleTokenStream stream_190=new RewriteRuleTokenStream(adaptor,"token 190");
        RewriteRuleTokenStream stream_192=new RewriteRuleTokenStream(adaptor,"token 192");
        RewriteRuleSubtreeStream stream_integerValue=new RewriteRuleSubtreeStream(adaptor,"rule integerValue");
        RewriteRuleSubtreeStream stream_timeFormat=new RewriteRuleSubtreeStream(adaptor,"rule timeFormat");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:373:2: ( timeFormat ( 'am' | 'a.m.' ) -> ^( TIME timeFormat AM ) | integerValue ( 'am' | 'a.m.' ) -> ^( TIME integerValue HOUR AM ) | timeFormat ( 'pm' | 'p.m.' ) -> ^( TIME timeFormat PM ) | integerValue ( 'pm' | 'p.m.' ) -> ^( TIME integerValue HOUR PM ) | timeFormat -> ^( TIME timeFormat HOUR24 ) )
            int alt87=5;
            alt87 = dfa87.predict(input);
            switch (alt87) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:373:4: timeFormat ( 'am' | 'a.m.' )
                    {
                    pushFollow(FOLLOW_timeFormat_in_timeValue1948);
                    timeFormat227=timeFormat();

                    state._fsp--;

                    stream_timeFormat.add(timeFormat227.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:373:15: ( 'am' | 'a.m.' )
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==189) ) {
                        alt83=1;
                    }
                    else if ( (LA83_0==190) ) {
                        alt83=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 83, 0, input);

                        throw nvae;
                    }
                    switch (alt83) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:373:16: 'am'
                            {
                            string_literal228=(Token)match(input,189,FOLLOW_189_in_timeValue1951);  
                            stream_189.add(string_literal228);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:373:21: 'a.m.'
                            {
                            string_literal229=(Token)match(input,190,FOLLOW_190_in_timeValue1953);  
                            stream_190.add(string_literal229);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: timeFormat
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 374:2: -> ^( TIME timeFormat AM )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:374:5: ^( TIME timeFormat AM )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TIME, "TIME"), root_1);

                        adaptor.addChild(root_1, stream_timeFormat.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(AM, "AM"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:375:4: integerValue ( 'am' | 'a.m.' )
                    {
                    pushFollow(FOLLOW_integerValue_in_timeValue1970);
                    integerValue230=integerValue();

                    state._fsp--;

                    stream_integerValue.add(integerValue230.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:375:17: ( 'am' | 'a.m.' )
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==189) ) {
                        alt84=1;
                    }
                    else if ( (LA84_0==190) ) {
                        alt84=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 84, 0, input);

                        throw nvae;
                    }
                    switch (alt84) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:375:18: 'am'
                            {
                            string_literal231=(Token)match(input,189,FOLLOW_189_in_timeValue1973);  
                            stream_189.add(string_literal231);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:375:23: 'a.m.'
                            {
                            string_literal232=(Token)match(input,190,FOLLOW_190_in_timeValue1975);  
                            stream_190.add(string_literal232);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: integerValue
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 376:2: -> ^( TIME integerValue HOUR AM )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:376:5: ^( TIME integerValue HOUR AM )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TIME, "TIME"), root_1);

                        adaptor.addChild(root_1, stream_integerValue.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(HOUR, "HOUR"));
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(AM, "AM"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:377:4: timeFormat ( 'pm' | 'p.m.' )
                    {
                    pushFollow(FOLLOW_timeFormat_in_timeValue1994);
                    timeFormat233=timeFormat();

                    state._fsp--;

                    stream_timeFormat.add(timeFormat233.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:377:15: ( 'pm' | 'p.m.' )
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==191) ) {
                        alt85=1;
                    }
                    else if ( (LA85_0==192) ) {
                        alt85=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 85, 0, input);

                        throw nvae;
                    }
                    switch (alt85) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:377:16: 'pm'
                            {
                            string_literal234=(Token)match(input,191,FOLLOW_191_in_timeValue1997);  
                            stream_191.add(string_literal234);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:377:21: 'p.m.'
                            {
                            string_literal235=(Token)match(input,192,FOLLOW_192_in_timeValue1999);  
                            stream_192.add(string_literal235);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: timeFormat
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 378:2: -> ^( TIME timeFormat PM )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:378:5: ^( TIME timeFormat PM )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TIME, "TIME"), root_1);

                        adaptor.addChild(root_1, stream_timeFormat.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(PM, "PM"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:379:4: integerValue ( 'pm' | 'p.m.' )
                    {
                    pushFollow(FOLLOW_integerValue_in_timeValue2016);
                    integerValue236=integerValue();

                    state._fsp--;

                    stream_integerValue.add(integerValue236.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:379:17: ( 'pm' | 'p.m.' )
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==191) ) {
                        alt86=1;
                    }
                    else if ( (LA86_0==192) ) {
                        alt86=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 86, 0, input);

                        throw nvae;
                    }
                    switch (alt86) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:379:18: 'pm'
                            {
                            string_literal237=(Token)match(input,191,FOLLOW_191_in_timeValue2019);  
                            stream_191.add(string_literal237);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:379:23: 'p.m.'
                            {
                            string_literal238=(Token)match(input,192,FOLLOW_192_in_timeValue2021);  
                            stream_192.add(string_literal238);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: integerValue
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 380:2: -> ^( TIME integerValue HOUR PM )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:380:5: ^( TIME integerValue HOUR PM )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TIME, "TIME"), root_1);

                        adaptor.addChild(root_1, stream_integerValue.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(HOUR, "HOUR"));
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(PM, "PM"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:381:4: timeFormat
                    {
                    pushFollow(FOLLOW_timeFormat_in_timeValue2040);
                    timeFormat239=timeFormat();

                    state._fsp--;

                    stream_timeFormat.add(timeFormat239.getTree());


                    // AST REWRITE
                    // elements: timeFormat
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 382:2: -> ^( TIME timeFormat HOUR24 )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:382:5: ^( TIME timeFormat HOUR24 )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TIME, "TIME"), root_1);

                        adaptor.addChild(root_1, stream_timeFormat.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(HOUR24, "HOUR24"));

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
    // $ANTLR end "timeValue"

    public static class timeFormat_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "timeFormat"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:385:1: timeFormat : (hr= integerValue ':' min= integerValue -> $hr HOUR $min MINUTE | hr= integerValue ':' min= integerValue ':' s= numericValue -> $hr HOUR $min MINUTE $s SECOND );
    public final flipsParser.timeFormat_return timeFormat() throws RecognitionException {
        flipsParser.timeFormat_return retval = new flipsParser.timeFormat_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal240=null;
        Token char_literal241=null;
        Token char_literal242=null;
        flipsParser.integerValue_return hr = null;

        flipsParser.integerValue_return min = null;

        flipsParser.numericValue_return s = null;


        CommonTree char_literal240_tree=null;
        CommonTree char_literal241_tree=null;
        CommonTree char_literal242_tree=null;
        RewriteRuleTokenStream stream_193=new RewriteRuleTokenStream(adaptor,"token 193");
        RewriteRuleSubtreeStream stream_integerValue=new RewriteRuleSubtreeStream(adaptor,"rule integerValue");
        RewriteRuleSubtreeStream stream_numericValue=new RewriteRuleSubtreeStream(adaptor,"rule numericValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:386:2: (hr= integerValue ':' min= integerValue -> $hr HOUR $min MINUTE | hr= integerValue ':' min= integerValue ':' s= numericValue -> $hr HOUR $min MINUTE $s SECOND )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( ((LA88_0>=BinaryLiteral && LA88_0<=HexLiteral)) ) {
                int LA88_1 = input.LA(2);

                if ( (LA88_1==193) ) {
                    int LA88_2 = input.LA(3);

                    if ( ((LA88_2>=BinaryLiteral && LA88_2<=HexLiteral)) ) {
                        int LA88_3 = input.LA(4);

                        if ( (LA88_3==EOF||(LA88_3>=Identifier && LA88_3<=With)||(LA88_3>=Turning && LA88_3<=HexLiteral)||(LA88_3>=109 && LA88_3<=116)||(LA88_3>=118 && LA88_3<=119)||(LA88_3>=121 && LA88_3<=122)||LA88_3==125||(LA88_3>=146 && LA88_3<=147)||(LA88_3>=189 && LA88_3<=192)||LA88_3==202||(LA88_3>=207 && LA88_3<=259)) ) {
                            alt88=1;
                        }
                        else if ( (LA88_3==193) ) {
                            alt88=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 88, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 88, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 88, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:386:4: hr= integerValue ':' min= integerValue
                    {
                    pushFollow(FOLLOW_integerValue_in_timeFormat2064);
                    hr=integerValue();

                    state._fsp--;

                    stream_integerValue.add(hr.getTree());
                    char_literal240=(Token)match(input,193,FOLLOW_193_in_timeFormat2066);  
                    stream_193.add(char_literal240);

                    pushFollow(FOLLOW_integerValue_in_timeFormat2070);
                    min=integerValue();

                    state._fsp--;

                    stream_integerValue.add(min.getTree());


                    // AST REWRITE
                    // elements: min, hr
                    // token labels: 
                    // rule labels: hr, min, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_hr=new RewriteRuleSubtreeStream(adaptor,"rule hr",hr!=null?hr.tree:null);
                    RewriteRuleSubtreeStream stream_min=new RewriteRuleSubtreeStream(adaptor,"rule min",min!=null?min.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 387:2: -> $hr HOUR $min MINUTE
                    {
                        adaptor.addChild(root_0, stream_hr.nextTree());
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(HOUR, "HOUR"));
                        adaptor.addChild(root_0, stream_min.nextTree());
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MINUTE, "MINUTE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:388:4: hr= integerValue ':' min= integerValue ':' s= numericValue
                    {
                    pushFollow(FOLLOW_integerValue_in_timeFormat2090);
                    hr=integerValue();

                    state._fsp--;

                    stream_integerValue.add(hr.getTree());
                    char_literal241=(Token)match(input,193,FOLLOW_193_in_timeFormat2092);  
                    stream_193.add(char_literal241);

                    pushFollow(FOLLOW_integerValue_in_timeFormat2096);
                    min=integerValue();

                    state._fsp--;

                    stream_integerValue.add(min.getTree());
                    char_literal242=(Token)match(input,193,FOLLOW_193_in_timeFormat2098);  
                    stream_193.add(char_literal242);

                    pushFollow(FOLLOW_numericValue_in_timeFormat2102);
                    s=numericValue();

                    state._fsp--;

                    stream_numericValue.add(s.getTree());


                    // AST REWRITE
                    // elements: min, s, hr
                    // token labels: 
                    // rule labels: hr, min, retval, s
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_hr=new RewriteRuleSubtreeStream(adaptor,"rule hr",hr!=null?hr.tree:null);
                    RewriteRuleSubtreeStream stream_min=new RewriteRuleSubtreeStream(adaptor,"rule min",min!=null?min.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_s=new RewriteRuleSubtreeStream(adaptor,"rule s",s!=null?s.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 389:2: -> $hr HOUR $min MINUTE $s SECOND
                    {
                        adaptor.addChild(root_0, stream_hr.nextTree());
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(HOUR, "HOUR"));
                        adaptor.addChild(root_0, stream_min.nextTree());
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MINUTE, "MINUTE"));
                        adaptor.addChild(root_0, stream_s.nextTree());
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SECOND, "SECOND"));

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
    // $ANTLR end "timeFormat"

    public static class timeUnit_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "timeUnit"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:392:1: timeUnit : ( hour | minute | second );
    public final flipsParser.timeUnit_return timeUnit() throws RecognitionException {
        flipsParser.timeUnit_return retval = new flipsParser.timeUnit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.hour_return hour243 = null;

        flipsParser.minute_return minute244 = null;

        flipsParser.second_return second245 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:392:9: ( hour | minute | second )
            int alt89=3;
            switch ( input.LA(1) ) {
            case 194:
            case 195:
            case 196:
            case 197:
            case 198:
                {
                alt89=1;
                }
                break;
            case 179:
            case 199:
            case 200:
            case 201:
                {
                alt89=2;
                }
                break;
            case 202:
            case 203:
            case 204:
            case 205:
            case 206:
                {
                alt89=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }

            switch (alt89) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:392:11: hour
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_hour_in_timeUnit2130);
                    hour243=hour();

                    state._fsp--;

                    adaptor.addChild(root_0, hour243.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:393:4: minute
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_minute_in_timeUnit2135);
                    minute244=minute();

                    state._fsp--;

                    adaptor.addChild(root_0, minute244.getTree());

                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:394:4: second
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_second_in_timeUnit2140);
                    second245=second();

                    state._fsp--;

                    adaptor.addChild(root_0, second245.getTree());

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
    // $ANTLR end "timeUnit"

    public static class hour_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "hour"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:397:1: hour : ( 'h' | 'hr' | 'hrs' | 'hour' | 'hours' ) -> HOUR ;
    public final flipsParser.hour_return hour() throws RecognitionException {
        flipsParser.hour_return retval = new flipsParser.hour_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal246=null;
        Token string_literal247=null;
        Token string_literal248=null;
        Token string_literal249=null;
        Token string_literal250=null;

        CommonTree char_literal246_tree=null;
        CommonTree string_literal247_tree=null;
        CommonTree string_literal248_tree=null;
        CommonTree string_literal249_tree=null;
        CommonTree string_literal250_tree=null;
        RewriteRuleTokenStream stream_198=new RewriteRuleTokenStream(adaptor,"token 198");
        RewriteRuleTokenStream stream_195=new RewriteRuleTokenStream(adaptor,"token 195");
        RewriteRuleTokenStream stream_194=new RewriteRuleTokenStream(adaptor,"token 194");
        RewriteRuleTokenStream stream_197=new RewriteRuleTokenStream(adaptor,"token 197");
        RewriteRuleTokenStream stream_196=new RewriteRuleTokenStream(adaptor,"token 196");

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:398:2: ( ( 'h' | 'hr' | 'hrs' | 'hour' | 'hours' ) -> HOUR )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:398:4: ( 'h' | 'hr' | 'hrs' | 'hour' | 'hours' )
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:398:4: ( 'h' | 'hr' | 'hrs' | 'hour' | 'hours' )
            int alt90=5;
            switch ( input.LA(1) ) {
            case 194:
                {
                alt90=1;
                }
                break;
            case 195:
                {
                alt90=2;
                }
                break;
            case 196:
                {
                alt90=3;
                }
                break;
            case 197:
                {
                alt90=4;
                }
                break;
            case 198:
                {
                alt90=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }

            switch (alt90) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:398:5: 'h'
                    {
                    char_literal246=(Token)match(input,194,FOLLOW_194_in_hour2152);  
                    stream_194.add(char_literal246);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:398:9: 'hr'
                    {
                    string_literal247=(Token)match(input,195,FOLLOW_195_in_hour2154);  
                    stream_195.add(string_literal247);


                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:398:14: 'hrs'
                    {
                    string_literal248=(Token)match(input,196,FOLLOW_196_in_hour2156);  
                    stream_196.add(string_literal248);


                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:398:20: 'hour'
                    {
                    string_literal249=(Token)match(input,197,FOLLOW_197_in_hour2158);  
                    stream_197.add(string_literal249);


                    }
                    break;
                case 5 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:398:27: 'hours'
                    {
                    string_literal250=(Token)match(input,198,FOLLOW_198_in_hour2160);  
                    stream_198.add(string_literal250);


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
            // 399:2: -> HOUR
            {
                adaptor.addChild(root_0, (CommonTree)adaptor.create(HOUR, "HOUR"));

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
    // $ANTLR end "hour"

    public static class minute_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "minute"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:402:1: minute : ( 'min' | 'mins' | 'minute' | 'minutes' ) -> MINUTE ;
    public final flipsParser.minute_return minute() throws RecognitionException {
        flipsParser.minute_return retval = new flipsParser.minute_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal251=null;
        Token string_literal252=null;
        Token string_literal253=null;
        Token string_literal254=null;

        CommonTree string_literal251_tree=null;
        CommonTree string_literal252_tree=null;
        CommonTree string_literal253_tree=null;
        CommonTree string_literal254_tree=null;
        RewriteRuleTokenStream stream_199=new RewriteRuleTokenStream(adaptor,"token 199");
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleTokenStream stream_201=new RewriteRuleTokenStream(adaptor,"token 201");
        RewriteRuleTokenStream stream_179=new RewriteRuleTokenStream(adaptor,"token 179");

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:403:2: ( ( 'min' | 'mins' | 'minute' | 'minutes' ) -> MINUTE )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:403:4: ( 'min' | 'mins' | 'minute' | 'minutes' )
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:403:4: ( 'min' | 'mins' | 'minute' | 'minutes' )
            int alt91=4;
            switch ( input.LA(1) ) {
            case 179:
                {
                alt91=1;
                }
                break;
            case 199:
                {
                alt91=2;
                }
                break;
            case 200:
                {
                alt91=3;
                }
                break;
            case 201:
                {
                alt91=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }

            switch (alt91) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:403:5: 'min'
                    {
                    string_literal251=(Token)match(input,179,FOLLOW_179_in_minute2178);  
                    stream_179.add(string_literal251);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:403:11: 'mins'
                    {
                    string_literal252=(Token)match(input,199,FOLLOW_199_in_minute2180);  
                    stream_199.add(string_literal252);


                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:403:18: 'minute'
                    {
                    string_literal253=(Token)match(input,200,FOLLOW_200_in_minute2182);  
                    stream_200.add(string_literal253);


                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:403:27: 'minutes'
                    {
                    string_literal254=(Token)match(input,201,FOLLOW_201_in_minute2184);  
                    stream_201.add(string_literal254);


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
            // 404:2: -> MINUTE
            {
                adaptor.addChild(root_0, (CommonTree)adaptor.create(MINUTE, "MINUTE"));

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
    // $ANTLR end "minute"

    public static class second_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "second"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:407:1: second : ( 's' | 'sec' | 'secs' | 'second' | 'seconds' ) -> SECOND ;
    public final flipsParser.second_return second() throws RecognitionException {
        flipsParser.second_return retval = new flipsParser.second_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal255=null;
        Token string_literal256=null;
        Token string_literal257=null;
        Token string_literal258=null;
        Token string_literal259=null;

        CommonTree char_literal255_tree=null;
        CommonTree string_literal256_tree=null;
        CommonTree string_literal257_tree=null;
        CommonTree string_literal258_tree=null;
        CommonTree string_literal259_tree=null;
        RewriteRuleTokenStream stream_202=new RewriteRuleTokenStream(adaptor,"token 202");
        RewriteRuleTokenStream stream_203=new RewriteRuleTokenStream(adaptor,"token 203");
        RewriteRuleTokenStream stream_204=new RewriteRuleTokenStream(adaptor,"token 204");
        RewriteRuleTokenStream stream_205=new RewriteRuleTokenStream(adaptor,"token 205");
        RewriteRuleTokenStream stream_206=new RewriteRuleTokenStream(adaptor,"token 206");

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:408:2: ( ( 's' | 'sec' | 'secs' | 'second' | 'seconds' ) -> SECOND )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:408:4: ( 's' | 'sec' | 'secs' | 'second' | 'seconds' )
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:408:4: ( 's' | 'sec' | 'secs' | 'second' | 'seconds' )
            int alt92=5;
            switch ( input.LA(1) ) {
            case 202:
                {
                alt92=1;
                }
                break;
            case 203:
                {
                alt92=2;
                }
                break;
            case 204:
                {
                alt92=3;
                }
                break;
            case 205:
                {
                alt92=4;
                }
                break;
            case 206:
                {
                alt92=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }

            switch (alt92) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:408:5: 's'
                    {
                    char_literal255=(Token)match(input,202,FOLLOW_202_in_second2202);  
                    stream_202.add(char_literal255);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:408:9: 'sec'
                    {
                    string_literal256=(Token)match(input,203,FOLLOW_203_in_second2204);  
                    stream_203.add(string_literal256);


                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:408:15: 'secs'
                    {
                    string_literal257=(Token)match(input,204,FOLLOW_204_in_second2206);  
                    stream_204.add(string_literal257);


                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:408:22: 'second'
                    {
                    string_literal258=(Token)match(input,205,FOLLOW_205_in_second2208);  
                    stream_205.add(string_literal258);


                    }
                    break;
                case 5 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:408:31: 'seconds'
                    {
                    string_literal259=(Token)match(input,206,FOLLOW_206_in_second2210);  
                    stream_206.add(string_literal259);


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
            // 409:2: -> SECOND
            {
                adaptor.addChild(root_0, (CommonTree)adaptor.create(SECOND, "SECOND"));

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
    // $ANTLR end "second"

    public static class duration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "duration"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:412:1: duration : 'for' durationValue -> ^( DURATION durationValue ) ;
    public final flipsParser.duration_return duration() throws RecognitionException {
        flipsParser.duration_return retval = new flipsParser.duration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal260=null;
        flipsParser.durationValue_return durationValue261 = null;


        CommonTree string_literal260_tree=null;
        RewriteRuleTokenStream stream_207=new RewriteRuleTokenStream(adaptor,"token 207");
        RewriteRuleSubtreeStream stream_durationValue=new RewriteRuleSubtreeStream(adaptor,"rule durationValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:413:2: ( 'for' durationValue -> ^( DURATION durationValue ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:413:4: 'for' durationValue
            {
            string_literal260=(Token)match(input,207,FOLLOW_207_in_duration2227);  
            stream_207.add(string_literal260);

            pushFollow(FOLLOW_durationValue_in_duration2229);
            durationValue261=durationValue();

            state._fsp--;

            stream_durationValue.add(durationValue261.getTree());


            // AST REWRITE
            // elements: durationValue
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 414:2: -> ^( DURATION durationValue )
            {
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:414:5: ^( DURATION durationValue )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DURATION, "DURATION"), root_1);

                adaptor.addChild(root_1, stream_durationValue.nextTree());

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
    // $ANTLR end "duration"

    public static class durationValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "durationValue"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:417:1: durationValue : ( numericValue timeUnit | integerValue hour numericValue ( minute | second ) | integerValue hour integerValue minute numericValue second | integerValue minute numericValue second | timeFormat );
    public final flipsParser.durationValue_return durationValue() throws RecognitionException {
        flipsParser.durationValue_return retval = new flipsParser.durationValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.numericValue_return numericValue262 = null;

        flipsParser.timeUnit_return timeUnit263 = null;

        flipsParser.integerValue_return integerValue264 = null;

        flipsParser.hour_return hour265 = null;

        flipsParser.numericValue_return numericValue266 = null;

        flipsParser.minute_return minute267 = null;

        flipsParser.second_return second268 = null;

        flipsParser.integerValue_return integerValue269 = null;

        flipsParser.hour_return hour270 = null;

        flipsParser.integerValue_return integerValue271 = null;

        flipsParser.minute_return minute272 = null;

        flipsParser.numericValue_return numericValue273 = null;

        flipsParser.second_return second274 = null;

        flipsParser.integerValue_return integerValue275 = null;

        flipsParser.minute_return minute276 = null;

        flipsParser.numericValue_return numericValue277 = null;

        flipsParser.second_return second278 = null;

        flipsParser.timeFormat_return timeFormat279 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:418:2: ( numericValue timeUnit | integerValue hour numericValue ( minute | second ) | integerValue hour integerValue minute numericValue second | integerValue minute numericValue second | timeFormat )
            int alt94=5;
            alt94 = dfa94.predict(input);
            switch (alt94) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:418:4: numericValue timeUnit
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_numericValue_in_durationValue2249);
                    numericValue262=numericValue();

                    state._fsp--;

                    adaptor.addChild(root_0, numericValue262.getTree());
                    pushFollow(FOLLOW_timeUnit_in_durationValue2251);
                    timeUnit263=timeUnit();

                    state._fsp--;

                    adaptor.addChild(root_0, timeUnit263.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:419:4: integerValue hour numericValue ( minute | second )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_integerValue_in_durationValue2256);
                    integerValue264=integerValue();

                    state._fsp--;

                    adaptor.addChild(root_0, integerValue264.getTree());
                    pushFollow(FOLLOW_hour_in_durationValue2258);
                    hour265=hour();

                    state._fsp--;

                    adaptor.addChild(root_0, hour265.getTree());
                    pushFollow(FOLLOW_numericValue_in_durationValue2260);
                    numericValue266=numericValue();

                    state._fsp--;

                    adaptor.addChild(root_0, numericValue266.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:419:35: ( minute | second )
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==179||(LA93_0>=199 && LA93_0<=201)) ) {
                        alt93=1;
                    }
                    else if ( ((LA93_0>=202 && LA93_0<=206)) ) {
                        alt93=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 93, 0, input);

                        throw nvae;
                    }
                    switch (alt93) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:419:36: minute
                            {
                            pushFollow(FOLLOW_minute_in_durationValue2263);
                            minute267=minute();

                            state._fsp--;

                            adaptor.addChild(root_0, minute267.getTree());

                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:419:43: second
                            {
                            pushFollow(FOLLOW_second_in_durationValue2265);
                            second268=second();

                            state._fsp--;

                            adaptor.addChild(root_0, second268.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:420:4: integerValue hour integerValue minute numericValue second
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_integerValue_in_durationValue2271);
                    integerValue269=integerValue();

                    state._fsp--;

                    adaptor.addChild(root_0, integerValue269.getTree());
                    pushFollow(FOLLOW_hour_in_durationValue2273);
                    hour270=hour();

                    state._fsp--;

                    adaptor.addChild(root_0, hour270.getTree());
                    pushFollow(FOLLOW_integerValue_in_durationValue2275);
                    integerValue271=integerValue();

                    state._fsp--;

                    adaptor.addChild(root_0, integerValue271.getTree());
                    pushFollow(FOLLOW_minute_in_durationValue2277);
                    minute272=minute();

                    state._fsp--;

                    adaptor.addChild(root_0, minute272.getTree());
                    pushFollow(FOLLOW_numericValue_in_durationValue2279);
                    numericValue273=numericValue();

                    state._fsp--;

                    adaptor.addChild(root_0, numericValue273.getTree());
                    pushFollow(FOLLOW_second_in_durationValue2281);
                    second274=second();

                    state._fsp--;

                    adaptor.addChild(root_0, second274.getTree());

                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:421:4: integerValue minute numericValue second
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_integerValue_in_durationValue2286);
                    integerValue275=integerValue();

                    state._fsp--;

                    adaptor.addChild(root_0, integerValue275.getTree());
                    pushFollow(FOLLOW_minute_in_durationValue2288);
                    minute276=minute();

                    state._fsp--;

                    adaptor.addChild(root_0, minute276.getTree());
                    pushFollow(FOLLOW_numericValue_in_durationValue2290);
                    numericValue277=numericValue();

                    state._fsp--;

                    adaptor.addChild(root_0, numericValue277.getTree());
                    pushFollow(FOLLOW_second_in_durationValue2292);
                    second278=second();

                    state._fsp--;

                    adaptor.addChild(root_0, second278.getTree());

                    }
                    break;
                case 5 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:422:4: timeFormat
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_timeFormat_in_durationValue2297);
                    timeFormat279=timeFormat();

                    state._fsp--;

                    adaptor.addChild(root_0, timeFormat279.getTree());

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
    // $ANTLR end "durationValue"

    public static class direction_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "direction"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:427:1: direction : ( fixedDirection -> ^( DIRECTION FIXED fixedDirection ) | relativeDirection -> ^( DIRECTION RELATIVE relativeDirection ) );
    public final flipsParser.direction_return direction() throws RecognitionException {
        flipsParser.direction_return retval = new flipsParser.direction_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.fixedDirection_return fixedDirection280 = null;

        flipsParser.relativeDirection_return relativeDirection281 = null;


        RewriteRuleSubtreeStream stream_fixedDirection=new RewriteRuleSubtreeStream(adaptor,"rule fixedDirection");
        RewriteRuleSubtreeStream stream_relativeDirection=new RewriteRuleSubtreeStream(adaptor,"rule relativeDirection");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:428:2: ( fixedDirection -> ^( DIRECTION FIXED fixedDirection ) | relativeDirection -> ^( DIRECTION RELATIVE relativeDirection ) )
            int alt95=2;
            switch ( input.LA(1) ) {
            case 202:
            case 208:
            case 209:
            case 210:
            case 211:
            case 212:
            case 213:
            case 214:
            case 215:
            case 216:
            case 217:
            case 218:
            case 219:
            case 220:
            case 221:
            case 222:
            case 223:
            case 224:
            case 225:
            case 226:
            case 227:
            case 228:
            case 229:
            case 230:
            case 231:
            case 232:
            case 233:
            case 234:
            case 235:
            case 236:
            case 237:
            case 238:
                {
                alt95=1;
                }
                break;
            case Turning:
                {
                int LA95_2 = input.LA(2);

                if ( ((LA95_2>=250 && LA95_2<=255)) ) {
                    alt95=2;
                }
                else if ( ((LA95_2>=FloatingPointLiteral && LA95_2<=HexLiteral)||LA95_2==202||(LA95_2>=208 && LA95_2<=238)) ) {
                    alt95=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 95, 2, input);

                    throw nvae;
                }
                }
                break;
            case Heading:
                {
                int LA95_3 = input.LA(2);

                if ( ((LA95_3>=FloatingPointLiteral && LA95_3<=HexLiteral)||LA95_3==202||(LA95_3>=208 && LA95_3<=238)) ) {
                    alt95=1;
                }
                else if ( ((LA95_3>=250 && LA95_3<=255)) ) {
                    alt95=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 95, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }

            switch (alt95) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:428:4: fixedDirection
                    {
                    pushFollow(FOLLOW_fixedDirection_in_direction2310);
                    fixedDirection280=fixedDirection();

                    state._fsp--;

                    stream_fixedDirection.add(fixedDirection280.getTree());


                    // AST REWRITE
                    // elements: fixedDirection
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 429:2: -> ^( DIRECTION FIXED fixedDirection )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:429:5: ^( DIRECTION FIXED fixedDirection )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DIRECTION, "DIRECTION"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(FIXED, "FIXED"));
                        adaptor.addChild(root_1, stream_fixedDirection.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:430:4: relativeDirection
                    {
                    pushFollow(FOLLOW_relativeDirection_in_direction2326);
                    relativeDirection281=relativeDirection();

                    state._fsp--;

                    stream_relativeDirection.add(relativeDirection281.getTree());


                    // AST REWRITE
                    // elements: relativeDirection
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 431:2: -> ^( DIRECTION RELATIVE relativeDirection )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:431:5: ^( DIRECTION RELATIVE relativeDirection )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DIRECTION, "DIRECTION"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(RELATIVE, "RELATIVE"));
                        adaptor.addChild(root_1, stream_relativeDirection.nextTree());

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
    // $ANTLR end "direction"

    public static class fixedDirection_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fixedDirection"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:434:1: fixedDirection : ( cardinalDirection -> cardinalDirection | ordinalDirection -> ordinalDirection | subOrdinalDirection -> subOrdinalDirection | ( Turning | Heading ) ( cardinalDirection | ordinalDirection | subOrdinalDirection | angularValue ) -> ( cardinalDirection )? ( ordinalDirection )? ( subOrdinalDirection )? ( angularValue )? );
    public final flipsParser.fixedDirection_return fixedDirection() throws RecognitionException {
        flipsParser.fixedDirection_return retval = new flipsParser.fixedDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Turning285=null;
        Token Heading286=null;
        flipsParser.cardinalDirection_return cardinalDirection282 = null;

        flipsParser.ordinalDirection_return ordinalDirection283 = null;

        flipsParser.subOrdinalDirection_return subOrdinalDirection284 = null;

        flipsParser.cardinalDirection_return cardinalDirection287 = null;

        flipsParser.ordinalDirection_return ordinalDirection288 = null;

        flipsParser.subOrdinalDirection_return subOrdinalDirection289 = null;

        flipsParser.angularValue_return angularValue290 = null;


        CommonTree Turning285_tree=null;
        CommonTree Heading286_tree=null;
        RewriteRuleTokenStream stream_Turning=new RewriteRuleTokenStream(adaptor,"token Turning");
        RewriteRuleTokenStream stream_Heading=new RewriteRuleTokenStream(adaptor,"token Heading");
        RewriteRuleSubtreeStream stream_angularValue=new RewriteRuleSubtreeStream(adaptor,"rule angularValue");
        RewriteRuleSubtreeStream stream_ordinalDirection=new RewriteRuleSubtreeStream(adaptor,"rule ordinalDirection");
        RewriteRuleSubtreeStream stream_subOrdinalDirection=new RewriteRuleSubtreeStream(adaptor,"rule subOrdinalDirection");
        RewriteRuleSubtreeStream stream_cardinalDirection=new RewriteRuleSubtreeStream(adaptor,"rule cardinalDirection");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:435:2: ( cardinalDirection -> cardinalDirection | ordinalDirection -> ordinalDirection | subOrdinalDirection -> subOrdinalDirection | ( Turning | Heading ) ( cardinalDirection | ordinalDirection | subOrdinalDirection | angularValue ) -> ( cardinalDirection )? ( ordinalDirection )? ( subOrdinalDirection )? ( angularValue )? )
            int alt98=4;
            switch ( input.LA(1) ) {
            case 202:
            case 208:
            case 209:
            case 210:
            case 211:
            case 212:
            case 213:
            case 214:
                {
                alt98=1;
                }
                break;
            case 215:
            case 216:
            case 217:
            case 218:
            case 219:
            case 220:
            case 221:
            case 222:
                {
                alt98=2;
                }
                break;
            case 223:
            case 224:
            case 225:
            case 226:
            case 227:
            case 228:
            case 229:
            case 230:
            case 231:
            case 232:
            case 233:
            case 234:
            case 235:
            case 236:
            case 237:
            case 238:
                {
                alt98=3;
                }
                break;
            case Turning:
            case Heading:
                {
                alt98=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }

            switch (alt98) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:435:4: cardinalDirection
                    {
                    pushFollow(FOLLOW_cardinalDirection_in_fixedDirection2348);
                    cardinalDirection282=cardinalDirection();

                    state._fsp--;

                    stream_cardinalDirection.add(cardinalDirection282.getTree());


                    // AST REWRITE
                    // elements: cardinalDirection
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 436:2: -> cardinalDirection
                    {
                        adaptor.addChild(root_0, stream_cardinalDirection.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:437:4: ordinalDirection
                    {
                    pushFollow(FOLLOW_ordinalDirection_in_fixedDirection2358);
                    ordinalDirection283=ordinalDirection();

                    state._fsp--;

                    stream_ordinalDirection.add(ordinalDirection283.getTree());


                    // AST REWRITE
                    // elements: ordinalDirection
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 438:2: -> ordinalDirection
                    {
                        adaptor.addChild(root_0, stream_ordinalDirection.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:439:4: subOrdinalDirection
                    {
                    pushFollow(FOLLOW_subOrdinalDirection_in_fixedDirection2368);
                    subOrdinalDirection284=subOrdinalDirection();

                    state._fsp--;

                    stream_subOrdinalDirection.add(subOrdinalDirection284.getTree());


                    // AST REWRITE
                    // elements: subOrdinalDirection
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 440:2: -> subOrdinalDirection
                    {
                        adaptor.addChild(root_0, stream_subOrdinalDirection.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:441:4: ( Turning | Heading ) ( cardinalDirection | ordinalDirection | subOrdinalDirection | angularValue )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:441:4: ( Turning | Heading )
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==Turning) ) {
                        alt96=1;
                    }
                    else if ( (LA96_0==Heading) ) {
                        alt96=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 96, 0, input);

                        throw nvae;
                    }
                    switch (alt96) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:441:5: Turning
                            {
                            Turning285=(Token)match(input,Turning,FOLLOW_Turning_in_fixedDirection2379);  
                            stream_Turning.add(Turning285);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:441:13: Heading
                            {
                            Heading286=(Token)match(input,Heading,FOLLOW_Heading_in_fixedDirection2381);  
                            stream_Heading.add(Heading286);


                            }
                            break;

                    }

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:441:22: ( cardinalDirection | ordinalDirection | subOrdinalDirection | angularValue )
                    int alt97=4;
                    switch ( input.LA(1) ) {
                    case 202:
                    case 208:
                    case 209:
                    case 210:
                    case 211:
                    case 212:
                    case 213:
                    case 214:
                        {
                        alt97=1;
                        }
                        break;
                    case 215:
                    case 216:
                    case 217:
                    case 218:
                    case 219:
                    case 220:
                    case 221:
                    case 222:
                        {
                        alt97=2;
                        }
                        break;
                    case 223:
                    case 224:
                    case 225:
                    case 226:
                    case 227:
                    case 228:
                    case 229:
                    case 230:
                    case 231:
                    case 232:
                    case 233:
                    case 234:
                    case 235:
                    case 236:
                    case 237:
                    case 238:
                        {
                        alt97=3;
                        }
                        break;
                    case FloatingPointLiteral:
                    case BinaryLiteral:
                    case OctalLiteral:
                    case DecimalLiteral:
                    case HexLiteral:
                        {
                        alt97=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 97, 0, input);

                        throw nvae;
                    }

                    switch (alt97) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:441:23: cardinalDirection
                            {
                            pushFollow(FOLLOW_cardinalDirection_in_fixedDirection2385);
                            cardinalDirection287=cardinalDirection();

                            state._fsp--;

                            stream_cardinalDirection.add(cardinalDirection287.getTree());

                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:441:41: ordinalDirection
                            {
                            pushFollow(FOLLOW_ordinalDirection_in_fixedDirection2387);
                            ordinalDirection288=ordinalDirection();

                            state._fsp--;

                            stream_ordinalDirection.add(ordinalDirection288.getTree());

                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:441:58: subOrdinalDirection
                            {
                            pushFollow(FOLLOW_subOrdinalDirection_in_fixedDirection2389);
                            subOrdinalDirection289=subOrdinalDirection();

                            state._fsp--;

                            stream_subOrdinalDirection.add(subOrdinalDirection289.getTree());

                            }
                            break;
                        case 4 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:441:78: angularValue
                            {
                            pushFollow(FOLLOW_angularValue_in_fixedDirection2391);
                            angularValue290=angularValue();

                            state._fsp--;

                            stream_angularValue.add(angularValue290.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: cardinalDirection, ordinalDirection, subOrdinalDirection, angularValue
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 442:2: -> ( cardinalDirection )? ( ordinalDirection )? ( subOrdinalDirection )? ( angularValue )?
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:442:5: ( cardinalDirection )?
                        if ( stream_cardinalDirection.hasNext() ) {
                            adaptor.addChild(root_0, stream_cardinalDirection.nextTree());

                        }
                        stream_cardinalDirection.reset();
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:442:24: ( ordinalDirection )?
                        if ( stream_ordinalDirection.hasNext() ) {
                            adaptor.addChild(root_0, stream_ordinalDirection.nextTree());

                        }
                        stream_ordinalDirection.reset();
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:442:42: ( subOrdinalDirection )?
                        if ( stream_subOrdinalDirection.hasNext() ) {
                            adaptor.addChild(root_0, stream_subOrdinalDirection.nextTree());

                        }
                        stream_subOrdinalDirection.reset();
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:442:63: ( angularValue )?
                        if ( stream_angularValue.hasNext() ) {
                            adaptor.addChild(root_0, stream_angularValue.nextTree());

                        }
                        stream_angularValue.reset();

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
    // $ANTLR end "fixedDirection"

    public static class relativeDirection_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relativeDirection"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:445:1: relativeDirection : ( Turning | Heading ) leftRightDirection angularValue -> leftRightDirection angularValue ;
    public final flipsParser.relativeDirection_return relativeDirection() throws RecognitionException {
        flipsParser.relativeDirection_return retval = new flipsParser.relativeDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Turning291=null;
        Token Heading292=null;
        flipsParser.leftRightDirection_return leftRightDirection293 = null;

        flipsParser.angularValue_return angularValue294 = null;


        CommonTree Turning291_tree=null;
        CommonTree Heading292_tree=null;
        RewriteRuleTokenStream stream_Turning=new RewriteRuleTokenStream(adaptor,"token Turning");
        RewriteRuleTokenStream stream_Heading=new RewriteRuleTokenStream(adaptor,"token Heading");
        RewriteRuleSubtreeStream stream_angularValue=new RewriteRuleSubtreeStream(adaptor,"rule angularValue");
        RewriteRuleSubtreeStream stream_leftRightDirection=new RewriteRuleSubtreeStream(adaptor,"rule leftRightDirection");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:446:2: ( ( Turning | Heading ) leftRightDirection angularValue -> leftRightDirection angularValue )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:446:4: ( Turning | Heading ) leftRightDirection angularValue
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:446:4: ( Turning | Heading )
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==Turning) ) {
                alt99=1;
            }
            else if ( (LA99_0==Heading) ) {
                alt99=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }
            switch (alt99) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:446:5: Turning
                    {
                    Turning291=(Token)match(input,Turning,FOLLOW_Turning_in_relativeDirection2419);  
                    stream_Turning.add(Turning291);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:446:13: Heading
                    {
                    Heading292=(Token)match(input,Heading,FOLLOW_Heading_in_relativeDirection2421);  
                    stream_Heading.add(Heading292);


                    }
                    break;

            }

            pushFollow(FOLLOW_leftRightDirection_in_relativeDirection2424);
            leftRightDirection293=leftRightDirection();

            state._fsp--;

            stream_leftRightDirection.add(leftRightDirection293.getTree());
            pushFollow(FOLLOW_angularValue_in_relativeDirection2426);
            angularValue294=angularValue();

            state._fsp--;

            stream_angularValue.add(angularValue294.getTree());


            // AST REWRITE
            // elements: leftRightDirection, angularValue
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 447:2: -> leftRightDirection angularValue
            {
                adaptor.addChild(root_0, stream_leftRightDirection.nextTree());
                adaptor.addChild(root_0, stream_angularValue.nextTree());

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
    // $ANTLR end "relativeDirection"

    public static class cardinalDirection_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cardinalDirection"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:450:1: cardinalDirection : ( northSouthDirection | eastWestDirection );
    public final flipsParser.cardinalDirection_return cardinalDirection() throws RecognitionException {
        flipsParser.cardinalDirection_return retval = new flipsParser.cardinalDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.northSouthDirection_return northSouthDirection295 = null;

        flipsParser.eastWestDirection_return eastWestDirection296 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:451:2: ( northSouthDirection | eastWestDirection )
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==202||(LA100_0>=208 && LA100_0<=210)) ) {
                alt100=1;
            }
            else if ( ((LA100_0>=211 && LA100_0<=214)) ) {
                alt100=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }
            switch (alt100) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:451:4: northSouthDirection
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_northSouthDirection_in_cardinalDirection2444);
                    northSouthDirection295=northSouthDirection();

                    state._fsp--;

                    adaptor.addChild(root_0, northSouthDirection295.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:452:4: eastWestDirection
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_eastWestDirection_in_cardinalDirection2449);
                    eastWestDirection296=eastWestDirection();

                    state._fsp--;

                    adaptor.addChild(root_0, eastWestDirection296.getTree());

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
    // $ANTLR end "cardinalDirection"

    public static class northSouthDirection_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "northSouthDirection"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:455:1: northSouthDirection : ( ( 'n' | 'north' ) -> NORTH | ( 's' | 'south' ) -> SOUTH );
    public final flipsParser.northSouthDirection_return northSouthDirection() throws RecognitionException {
        flipsParser.northSouthDirection_return retval = new flipsParser.northSouthDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal297=null;
        Token string_literal298=null;
        Token char_literal299=null;
        Token string_literal300=null;

        CommonTree char_literal297_tree=null;
        CommonTree string_literal298_tree=null;
        CommonTree char_literal299_tree=null;
        CommonTree string_literal300_tree=null;
        RewriteRuleTokenStream stream_202=new RewriteRuleTokenStream(adaptor,"token 202");
        RewriteRuleTokenStream stream_210=new RewriteRuleTokenStream(adaptor,"token 210");
        RewriteRuleTokenStream stream_208=new RewriteRuleTokenStream(adaptor,"token 208");
        RewriteRuleTokenStream stream_209=new RewriteRuleTokenStream(adaptor,"token 209");

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:456:2: ( ( 'n' | 'north' ) -> NORTH | ( 's' | 'south' ) -> SOUTH )
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( ((LA103_0>=208 && LA103_0<=209)) ) {
                alt103=1;
            }
            else if ( (LA103_0==202||LA103_0==210) ) {
                alt103=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }
            switch (alt103) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:456:4: ( 'n' | 'north' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:456:4: ( 'n' | 'north' )
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==208) ) {
                        alt101=1;
                    }
                    else if ( (LA101_0==209) ) {
                        alt101=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 101, 0, input);

                        throw nvae;
                    }
                    switch (alt101) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:456:5: 'n'
                            {
                            char_literal297=(Token)match(input,208,FOLLOW_208_in_northSouthDirection2461);  
                            stream_208.add(char_literal297);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:456:9: 'north'
                            {
                            string_literal298=(Token)match(input,209,FOLLOW_209_in_northSouthDirection2463);  
                            stream_209.add(string_literal298);


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
                    // 457:2: -> NORTH
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NORTH, "NORTH"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:458:4: ( 's' | 'south' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:458:4: ( 's' | 'south' )
                    int alt102=2;
                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==202) ) {
                        alt102=1;
                    }
                    else if ( (LA102_0==210) ) {
                        alt102=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 102, 0, input);

                        throw nvae;
                    }
                    switch (alt102) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:458:5: 's'
                            {
                            char_literal299=(Token)match(input,202,FOLLOW_202_in_northSouthDirection2475);  
                            stream_202.add(char_literal299);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:458:9: 'south'
                            {
                            string_literal300=(Token)match(input,210,FOLLOW_210_in_northSouthDirection2477);  
                            stream_210.add(string_literal300);


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
                    // 459:2: -> SOUTH
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:462:1: eastWestDirection : ( ( 'e' | 'east' ) -> EAST | ( 'w' | 'west' ) -> WEST );
    public final flipsParser.eastWestDirection_return eastWestDirection() throws RecognitionException {
        flipsParser.eastWestDirection_return retval = new flipsParser.eastWestDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal301=null;
        Token string_literal302=null;
        Token char_literal303=null;
        Token string_literal304=null;

        CommonTree char_literal301_tree=null;
        CommonTree string_literal302_tree=null;
        CommonTree char_literal303_tree=null;
        CommonTree string_literal304_tree=null;
        RewriteRuleTokenStream stream_211=new RewriteRuleTokenStream(adaptor,"token 211");
        RewriteRuleTokenStream stream_212=new RewriteRuleTokenStream(adaptor,"token 212");
        RewriteRuleTokenStream stream_213=new RewriteRuleTokenStream(adaptor,"token 213");
        RewriteRuleTokenStream stream_214=new RewriteRuleTokenStream(adaptor,"token 214");

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:463:2: ( ( 'e' | 'east' ) -> EAST | ( 'w' | 'west' ) -> WEST )
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( ((LA106_0>=211 && LA106_0<=212)) ) {
                alt106=1;
            }
            else if ( ((LA106_0>=213 && LA106_0<=214)) ) {
                alt106=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }
            switch (alt106) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:463:4: ( 'e' | 'east' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:463:4: ( 'e' | 'east' )
                    int alt104=2;
                    int LA104_0 = input.LA(1);

                    if ( (LA104_0==211) ) {
                        alt104=1;
                    }
                    else if ( (LA104_0==212) ) {
                        alt104=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 104, 0, input);

                        throw nvae;
                    }
                    switch (alt104) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:463:5: 'e'
                            {
                            char_literal301=(Token)match(input,211,FOLLOW_211_in_eastWestDirection2495);  
                            stream_211.add(char_literal301);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:463:9: 'east'
                            {
                            string_literal302=(Token)match(input,212,FOLLOW_212_in_eastWestDirection2497);  
                            stream_212.add(string_literal302);


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
                    // 464:2: -> EAST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:465:4: ( 'w' | 'west' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:465:4: ( 'w' | 'west' )
                    int alt105=2;
                    int LA105_0 = input.LA(1);

                    if ( (LA105_0==213) ) {
                        alt105=1;
                    }
                    else if ( (LA105_0==214) ) {
                        alt105=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 105, 0, input);

                        throw nvae;
                    }
                    switch (alt105) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:465:5: 'w'
                            {
                            char_literal303=(Token)match(input,213,FOLLOW_213_in_eastWestDirection2509);  
                            stream_213.add(char_literal303);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:465:9: 'west'
                            {
                            string_literal304=(Token)match(input,214,FOLLOW_214_in_eastWestDirection2511);  
                            stream_214.add(string_literal304);


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
                    // 466:2: -> WEST
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

    public static class ordinalDirection_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ordinalDirection"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:469:1: ordinalDirection : ( ( 'ne' | 'northeast' ) -> NORTH EAST | ( 'se' | 'southeast' ) -> SOUTH EAST | ( 'sw' | 'southwest' ) -> SOUTH WEST | ( 'nw' | 'northwest' ) -> NORTH WEST );
    public final flipsParser.ordinalDirection_return ordinalDirection() throws RecognitionException {
        flipsParser.ordinalDirection_return retval = new flipsParser.ordinalDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal305=null;
        Token string_literal306=null;
        Token string_literal307=null;
        Token string_literal308=null;
        Token string_literal309=null;
        Token string_literal310=null;
        Token string_literal311=null;
        Token string_literal312=null;

        CommonTree string_literal305_tree=null;
        CommonTree string_literal306_tree=null;
        CommonTree string_literal307_tree=null;
        CommonTree string_literal308_tree=null;
        CommonTree string_literal309_tree=null;
        CommonTree string_literal310_tree=null;
        CommonTree string_literal311_tree=null;
        CommonTree string_literal312_tree=null;
        RewriteRuleTokenStream stream_220=new RewriteRuleTokenStream(adaptor,"token 220");
        RewriteRuleTokenStream stream_221=new RewriteRuleTokenStream(adaptor,"token 221");
        RewriteRuleTokenStream stream_222=new RewriteRuleTokenStream(adaptor,"token 222");
        RewriteRuleTokenStream stream_215=new RewriteRuleTokenStream(adaptor,"token 215");
        RewriteRuleTokenStream stream_216=new RewriteRuleTokenStream(adaptor,"token 216");
        RewriteRuleTokenStream stream_219=new RewriteRuleTokenStream(adaptor,"token 219");
        RewriteRuleTokenStream stream_217=new RewriteRuleTokenStream(adaptor,"token 217");
        RewriteRuleTokenStream stream_218=new RewriteRuleTokenStream(adaptor,"token 218");

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:470:2: ( ( 'ne' | 'northeast' ) -> NORTH EAST | ( 'se' | 'southeast' ) -> SOUTH EAST | ( 'sw' | 'southwest' ) -> SOUTH WEST | ( 'nw' | 'northwest' ) -> NORTH WEST )
            int alt111=4;
            switch ( input.LA(1) ) {
            case 215:
            case 216:
                {
                alt111=1;
                }
                break;
            case 217:
            case 218:
                {
                alt111=2;
                }
                break;
            case 219:
            case 220:
                {
                alt111=3;
                }
                break;
            case 221:
            case 222:
                {
                alt111=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;
            }

            switch (alt111) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:470:4: ( 'ne' | 'northeast' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:470:4: ( 'ne' | 'northeast' )
                    int alt107=2;
                    int LA107_0 = input.LA(1);

                    if ( (LA107_0==215) ) {
                        alt107=1;
                    }
                    else if ( (LA107_0==216) ) {
                        alt107=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 107, 0, input);

                        throw nvae;
                    }
                    switch (alt107) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:470:5: 'ne'
                            {
                            string_literal305=(Token)match(input,215,FOLLOW_215_in_ordinalDirection2529);  
                            stream_215.add(string_literal305);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:470:10: 'northeast'
                            {
                            string_literal306=(Token)match(input,216,FOLLOW_216_in_ordinalDirection2531);  
                            stream_216.add(string_literal306);


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
                    // 471:2: -> NORTH EAST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NORTH, "NORTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:472:4: ( 'se' | 'southeast' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:472:4: ( 'se' | 'southeast' )
                    int alt108=2;
                    int LA108_0 = input.LA(1);

                    if ( (LA108_0==217) ) {
                        alt108=1;
                    }
                    else if ( (LA108_0==218) ) {
                        alt108=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 108, 0, input);

                        throw nvae;
                    }
                    switch (alt108) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:472:5: 'se'
                            {
                            string_literal307=(Token)match(input,217,FOLLOW_217_in_ordinalDirection2545);  
                            stream_217.add(string_literal307);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:472:10: 'southeast'
                            {
                            string_literal308=(Token)match(input,218,FOLLOW_218_in_ordinalDirection2547);  
                            stream_218.add(string_literal308);


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
                    // 473:2: -> SOUTH EAST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:474:4: ( 'sw' | 'southwest' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:474:4: ( 'sw' | 'southwest' )
                    int alt109=2;
                    int LA109_0 = input.LA(1);

                    if ( (LA109_0==219) ) {
                        alt109=1;
                    }
                    else if ( (LA109_0==220) ) {
                        alt109=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 109, 0, input);

                        throw nvae;
                    }
                    switch (alt109) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:474:5: 'sw'
                            {
                            string_literal309=(Token)match(input,219,FOLLOW_219_in_ordinalDirection2561);  
                            stream_219.add(string_literal309);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:474:10: 'southwest'
                            {
                            string_literal310=(Token)match(input,220,FOLLOW_220_in_ordinalDirection2563);  
                            stream_220.add(string_literal310);


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
                    // 475:2: -> SOUTH WEST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(WEST, "WEST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:476:4: ( 'nw' | 'northwest' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:476:4: ( 'nw' | 'northwest' )
                    int alt110=2;
                    int LA110_0 = input.LA(1);

                    if ( (LA110_0==221) ) {
                        alt110=1;
                    }
                    else if ( (LA110_0==222) ) {
                        alt110=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 110, 0, input);

                        throw nvae;
                    }
                    switch (alt110) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:476:5: 'nw'
                            {
                            string_literal311=(Token)match(input,221,FOLLOW_221_in_ordinalDirection2577);  
                            stream_221.add(string_literal311);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:476:10: 'northwest'
                            {
                            string_literal312=(Token)match(input,222,FOLLOW_222_in_ordinalDirection2579);  
                            stream_222.add(string_literal312);


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
                    // 477:2: -> NORTH WEST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NORTH, "NORTH"));
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
    // $ANTLR end "ordinalDirection"

    public static class subOrdinalDirection_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "subOrdinalDirection"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:480:1: subOrdinalDirection : ( ( 'nne' | 'north-northeast' ) -> NORTH NORTH EAST | ( 'ene' | 'east-northeast' ) -> EAST NORTH EAST | ( 'ese' | 'east-southeast' ) -> EAST SOUTH EAST | ( 'sse' | 'south-southeast' ) -> SOUTH SOUTH EAST | ( 'ssw' | 'south-southwest' ) -> SOUTH SOUTH WEST | ( 'wsw' | 'west-southwest' ) -> WEST SOUTH WEST | ( 'wnw' | 'west-northwest' ) -> WEST NORTH WEST | ( 'nnw' | 'north-northwest' ) -> NORTH NORTH WEST );
    public final flipsParser.subOrdinalDirection_return subOrdinalDirection() throws RecognitionException {
        flipsParser.subOrdinalDirection_return retval = new flipsParser.subOrdinalDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal313=null;
        Token string_literal314=null;
        Token string_literal315=null;
        Token string_literal316=null;
        Token string_literal317=null;
        Token string_literal318=null;
        Token string_literal319=null;
        Token string_literal320=null;
        Token string_literal321=null;
        Token string_literal322=null;
        Token string_literal323=null;
        Token string_literal324=null;
        Token string_literal325=null;
        Token string_literal326=null;
        Token string_literal327=null;
        Token string_literal328=null;

        CommonTree string_literal313_tree=null;
        CommonTree string_literal314_tree=null;
        CommonTree string_literal315_tree=null;
        CommonTree string_literal316_tree=null;
        CommonTree string_literal317_tree=null;
        CommonTree string_literal318_tree=null;
        CommonTree string_literal319_tree=null;
        CommonTree string_literal320_tree=null;
        CommonTree string_literal321_tree=null;
        CommonTree string_literal322_tree=null;
        CommonTree string_literal323_tree=null;
        CommonTree string_literal324_tree=null;
        CommonTree string_literal325_tree=null;
        CommonTree string_literal326_tree=null;
        CommonTree string_literal327_tree=null;
        CommonTree string_literal328_tree=null;
        RewriteRuleTokenStream stream_223=new RewriteRuleTokenStream(adaptor,"token 223");
        RewriteRuleTokenStream stream_224=new RewriteRuleTokenStream(adaptor,"token 224");
        RewriteRuleTokenStream stream_225=new RewriteRuleTokenStream(adaptor,"token 225");
        RewriteRuleTokenStream stream_226=new RewriteRuleTokenStream(adaptor,"token 226");
        RewriteRuleTokenStream stream_227=new RewriteRuleTokenStream(adaptor,"token 227");
        RewriteRuleTokenStream stream_230=new RewriteRuleTokenStream(adaptor,"token 230");
        RewriteRuleTokenStream stream_228=new RewriteRuleTokenStream(adaptor,"token 228");
        RewriteRuleTokenStream stream_229=new RewriteRuleTokenStream(adaptor,"token 229");
        RewriteRuleTokenStream stream_232=new RewriteRuleTokenStream(adaptor,"token 232");
        RewriteRuleTokenStream stream_231=new RewriteRuleTokenStream(adaptor,"token 231");
        RewriteRuleTokenStream stream_234=new RewriteRuleTokenStream(adaptor,"token 234");
        RewriteRuleTokenStream stream_233=new RewriteRuleTokenStream(adaptor,"token 233");
        RewriteRuleTokenStream stream_236=new RewriteRuleTokenStream(adaptor,"token 236");
        RewriteRuleTokenStream stream_235=new RewriteRuleTokenStream(adaptor,"token 235");
        RewriteRuleTokenStream stream_238=new RewriteRuleTokenStream(adaptor,"token 238");
        RewriteRuleTokenStream stream_237=new RewriteRuleTokenStream(adaptor,"token 237");

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:481:2: ( ( 'nne' | 'north-northeast' ) -> NORTH NORTH EAST | ( 'ene' | 'east-northeast' ) -> EAST NORTH EAST | ( 'ese' | 'east-southeast' ) -> EAST SOUTH EAST | ( 'sse' | 'south-southeast' ) -> SOUTH SOUTH EAST | ( 'ssw' | 'south-southwest' ) -> SOUTH SOUTH WEST | ( 'wsw' | 'west-southwest' ) -> WEST SOUTH WEST | ( 'wnw' | 'west-northwest' ) -> WEST NORTH WEST | ( 'nnw' | 'north-northwest' ) -> NORTH NORTH WEST )
            int alt120=8;
            switch ( input.LA(1) ) {
            case 223:
            case 224:
                {
                alt120=1;
                }
                break;
            case 225:
            case 226:
                {
                alt120=2;
                }
                break;
            case 227:
            case 228:
                {
                alt120=3;
                }
                break;
            case 229:
            case 230:
                {
                alt120=4;
                }
                break;
            case 231:
            case 232:
                {
                alt120=5;
                }
                break;
            case 233:
            case 234:
                {
                alt120=6;
                }
                break;
            case 235:
            case 236:
                {
                alt120=7;
                }
                break;
            case 237:
            case 238:
                {
                alt120=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 0, input);

                throw nvae;
            }

            switch (alt120) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:481:4: ( 'nne' | 'north-northeast' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:481:4: ( 'nne' | 'north-northeast' )
                    int alt112=2;
                    int LA112_0 = input.LA(1);

                    if ( (LA112_0==223) ) {
                        alt112=1;
                    }
                    else if ( (LA112_0==224) ) {
                        alt112=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 112, 0, input);

                        throw nvae;
                    }
                    switch (alt112) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:481:5: 'nne'
                            {
                            string_literal313=(Token)match(input,223,FOLLOW_223_in_subOrdinalDirection2599);  
                            stream_223.add(string_literal313);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:481:11: 'north-northeast'
                            {
                            string_literal314=(Token)match(input,224,FOLLOW_224_in_subOrdinalDirection2601);  
                            stream_224.add(string_literal314);


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
                    // 482:2: -> NORTH NORTH EAST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NORTH, "NORTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NORTH, "NORTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:483:4: ( 'ene' | 'east-northeast' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:483:4: ( 'ene' | 'east-northeast' )
                    int alt113=2;
                    int LA113_0 = input.LA(1);

                    if ( (LA113_0==225) ) {
                        alt113=1;
                    }
                    else if ( (LA113_0==226) ) {
                        alt113=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 113, 0, input);

                        throw nvae;
                    }
                    switch (alt113) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:483:5: 'ene'
                            {
                            string_literal315=(Token)match(input,225,FOLLOW_225_in_subOrdinalDirection2617);  
                            stream_225.add(string_literal315);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:483:11: 'east-northeast'
                            {
                            string_literal316=(Token)match(input,226,FOLLOW_226_in_subOrdinalDirection2619);  
                            stream_226.add(string_literal316);


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
                    // 484:2: -> EAST NORTH EAST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NORTH, "NORTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:485:4: ( 'ese' | 'east-southeast' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:485:4: ( 'ese' | 'east-southeast' )
                    int alt114=2;
                    int LA114_0 = input.LA(1);

                    if ( (LA114_0==227) ) {
                        alt114=1;
                    }
                    else if ( (LA114_0==228) ) {
                        alt114=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 114, 0, input);

                        throw nvae;
                    }
                    switch (alt114) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:485:5: 'ese'
                            {
                            string_literal317=(Token)match(input,227,FOLLOW_227_in_subOrdinalDirection2635);  
                            stream_227.add(string_literal317);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:485:11: 'east-southeast'
                            {
                            string_literal318=(Token)match(input,228,FOLLOW_228_in_subOrdinalDirection2637);  
                            stream_228.add(string_literal318);


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
                    // 486:2: -> EAST SOUTH EAST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:487:4: ( 'sse' | 'south-southeast' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:487:4: ( 'sse' | 'south-southeast' )
                    int alt115=2;
                    int LA115_0 = input.LA(1);

                    if ( (LA115_0==229) ) {
                        alt115=1;
                    }
                    else if ( (LA115_0==230) ) {
                        alt115=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 115, 0, input);

                        throw nvae;
                    }
                    switch (alt115) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:487:5: 'sse'
                            {
                            string_literal319=(Token)match(input,229,FOLLOW_229_in_subOrdinalDirection2653);  
                            stream_229.add(string_literal319);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:487:11: 'south-southeast'
                            {
                            string_literal320=(Token)match(input,230,FOLLOW_230_in_subOrdinalDirection2655);  
                            stream_230.add(string_literal320);


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
                    // 488:2: -> SOUTH SOUTH EAST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:489:4: ( 'ssw' | 'south-southwest' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:489:4: ( 'ssw' | 'south-southwest' )
                    int alt116=2;
                    int LA116_0 = input.LA(1);

                    if ( (LA116_0==231) ) {
                        alt116=1;
                    }
                    else if ( (LA116_0==232) ) {
                        alt116=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 116, 0, input);

                        throw nvae;
                    }
                    switch (alt116) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:489:5: 'ssw'
                            {
                            string_literal321=(Token)match(input,231,FOLLOW_231_in_subOrdinalDirection2671);  
                            stream_231.add(string_literal321);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:489:11: 'south-southwest'
                            {
                            string_literal322=(Token)match(input,232,FOLLOW_232_in_subOrdinalDirection2673);  
                            stream_232.add(string_literal322);


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
                    // 490:2: -> SOUTH SOUTH WEST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(WEST, "WEST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:491:4: ( 'wsw' | 'west-southwest' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:491:4: ( 'wsw' | 'west-southwest' )
                    int alt117=2;
                    int LA117_0 = input.LA(1);

                    if ( (LA117_0==233) ) {
                        alt117=1;
                    }
                    else if ( (LA117_0==234) ) {
                        alt117=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 117, 0, input);

                        throw nvae;
                    }
                    switch (alt117) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:491:5: 'wsw'
                            {
                            string_literal323=(Token)match(input,233,FOLLOW_233_in_subOrdinalDirection2689);  
                            stream_233.add(string_literal323);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:491:11: 'west-southwest'
                            {
                            string_literal324=(Token)match(input,234,FOLLOW_234_in_subOrdinalDirection2691);  
                            stream_234.add(string_literal324);


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
                    // 492:2: -> WEST SOUTH WEST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(WEST, "WEST"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(WEST, "WEST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:493:4: ( 'wnw' | 'west-northwest' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:493:4: ( 'wnw' | 'west-northwest' )
                    int alt118=2;
                    int LA118_0 = input.LA(1);

                    if ( (LA118_0==235) ) {
                        alt118=1;
                    }
                    else if ( (LA118_0==236) ) {
                        alt118=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 118, 0, input);

                        throw nvae;
                    }
                    switch (alt118) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:493:5: 'wnw'
                            {
                            string_literal325=(Token)match(input,235,FOLLOW_235_in_subOrdinalDirection2707);  
                            stream_235.add(string_literal325);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:493:11: 'west-northwest'
                            {
                            string_literal326=(Token)match(input,236,FOLLOW_236_in_subOrdinalDirection2709);  
                            stream_236.add(string_literal326);


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
                    // 494:2: -> WEST NORTH WEST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(WEST, "WEST"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NORTH, "NORTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(WEST, "WEST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 8 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:495:4: ( 'nnw' | 'north-northwest' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:495:4: ( 'nnw' | 'north-northwest' )
                    int alt119=2;
                    int LA119_0 = input.LA(1);

                    if ( (LA119_0==237) ) {
                        alt119=1;
                    }
                    else if ( (LA119_0==238) ) {
                        alt119=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 119, 0, input);

                        throw nvae;
                    }
                    switch (alt119) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:495:5: 'nnw'
                            {
                            string_literal327=(Token)match(input,237,FOLLOW_237_in_subOrdinalDirection2725);  
                            stream_237.add(string_literal327);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:495:11: 'north-northwest'
                            {
                            string_literal328=(Token)match(input,238,FOLLOW_238_in_subOrdinalDirection2727);  
                            stream_238.add(string_literal328);


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
                    // 496:2: -> NORTH NORTH WEST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NORTH, "NORTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NORTH, "NORTH"));
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
    // $ANTLR end "subOrdinalDirection"

    public static class loiterDirection_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "loiterDirection"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:499:1: loiterDirection : ( Turning )? clockDirection -> ^( DIRECTION TURN clockDirection ) ;
    public final flipsParser.loiterDirection_return loiterDirection() throws RecognitionException {
        flipsParser.loiterDirection_return retval = new flipsParser.loiterDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Turning329=null;
        flipsParser.clockDirection_return clockDirection330 = null;


        CommonTree Turning329_tree=null;
        RewriteRuleTokenStream stream_Turning=new RewriteRuleTokenStream(adaptor,"token Turning");
        RewriteRuleSubtreeStream stream_clockDirection=new RewriteRuleSubtreeStream(adaptor,"rule clockDirection");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:500:2: ( ( Turning )? clockDirection -> ^( DIRECTION TURN clockDirection ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:500:4: ( Turning )? clockDirection
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:500:4: ( Turning )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==Turning) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:500:4: Turning
                    {
                    Turning329=(Token)match(input,Turning,FOLLOW_Turning_in_loiterDirection2748);  
                    stream_Turning.add(Turning329);


                    }
                    break;

            }

            pushFollow(FOLLOW_clockDirection_in_loiterDirection2751);
            clockDirection330=clockDirection();

            state._fsp--;

            stream_clockDirection.add(clockDirection330.getTree());


            // AST REWRITE
            // elements: clockDirection
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 501:2: -> ^( DIRECTION TURN clockDirection )
            {
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:501:5: ^( DIRECTION TURN clockDirection )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DIRECTION, "DIRECTION"), root_1);

                adaptor.addChild(root_1, (CommonTree)adaptor.create(TURN, "TURN"));
                adaptor.addChild(root_1, stream_clockDirection.nextTree());

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
    // $ANTLR end "loiterDirection"

    public static class upDownDirection_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "upDownDirection"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:504:1: upDownDirection : ( ( 'u' | 'up' | 'c' | 'climb' | 'climbing' | 'ascend' | 'ascending' ) -> CLIMB | ( 'd' | 'down' | 'descend' | 'descending' ) -> DESCEND );
    public final flipsParser.upDownDirection_return upDownDirection() throws RecognitionException {
        flipsParser.upDownDirection_return retval = new flipsParser.upDownDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal331=null;
        Token string_literal332=null;
        Token char_literal333=null;
        Token string_literal334=null;
        Token string_literal335=null;
        Token string_literal336=null;
        Token string_literal337=null;
        Token char_literal338=null;
        Token string_literal339=null;
        Token string_literal340=null;
        Token string_literal341=null;

        CommonTree char_literal331_tree=null;
        CommonTree string_literal332_tree=null;
        CommonTree char_literal333_tree=null;
        CommonTree string_literal334_tree=null;
        CommonTree string_literal335_tree=null;
        CommonTree string_literal336_tree=null;
        CommonTree string_literal337_tree=null;
        CommonTree char_literal338_tree=null;
        CommonTree string_literal339_tree=null;
        CommonTree string_literal340_tree=null;
        CommonTree string_literal341_tree=null;
        RewriteRuleTokenStream stream_239=new RewriteRuleTokenStream(adaptor,"token 239");
        RewriteRuleTokenStream stream_240=new RewriteRuleTokenStream(adaptor,"token 240");
        RewriteRuleTokenStream stream_241=new RewriteRuleTokenStream(adaptor,"token 241");
        RewriteRuleTokenStream stream_245=new RewriteRuleTokenStream(adaptor,"token 245");
        RewriteRuleTokenStream stream_244=new RewriteRuleTokenStream(adaptor,"token 244");
        RewriteRuleTokenStream stream_243=new RewriteRuleTokenStream(adaptor,"token 243");
        RewriteRuleTokenStream stream_242=new RewriteRuleTokenStream(adaptor,"token 242");
        RewriteRuleTokenStream stream_249=new RewriteRuleTokenStream(adaptor,"token 249");
        RewriteRuleTokenStream stream_248=new RewriteRuleTokenStream(adaptor,"token 248");
        RewriteRuleTokenStream stream_247=new RewriteRuleTokenStream(adaptor,"token 247");
        RewriteRuleTokenStream stream_246=new RewriteRuleTokenStream(adaptor,"token 246");

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:505:2: ( ( 'u' | 'up' | 'c' | 'climb' | 'climbing' | 'ascend' | 'ascending' ) -> CLIMB | ( 'd' | 'down' | 'descend' | 'descending' ) -> DESCEND )
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( ((LA124_0>=239 && LA124_0<=245)) ) {
                alt124=1;
            }
            else if ( ((LA124_0>=246 && LA124_0<=249)) ) {
                alt124=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 124, 0, input);

                throw nvae;
            }
            switch (alt124) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:505:4: ( 'u' | 'up' | 'c' | 'climb' | 'climbing' | 'ascend' | 'ascending' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:505:4: ( 'u' | 'up' | 'c' | 'climb' | 'climbing' | 'ascend' | 'ascending' )
                    int alt122=7;
                    switch ( input.LA(1) ) {
                    case 239:
                        {
                        alt122=1;
                        }
                        break;
                    case 240:
                        {
                        alt122=2;
                        }
                        break;
                    case 241:
                        {
                        alt122=3;
                        }
                        break;
                    case 242:
                        {
                        alt122=4;
                        }
                        break;
                    case 243:
                        {
                        alt122=5;
                        }
                        break;
                    case 244:
                        {
                        alt122=6;
                        }
                        break;
                    case 245:
                        {
                        alt122=7;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 122, 0, input);

                        throw nvae;
                    }

                    switch (alt122) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:505:5: 'u'
                            {
                            char_literal331=(Token)match(input,239,FOLLOW_239_in_upDownDirection2774);  
                            stream_239.add(char_literal331);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:505:9: 'up'
                            {
                            string_literal332=(Token)match(input,240,FOLLOW_240_in_upDownDirection2776);  
                            stream_240.add(string_literal332);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:505:14: 'c'
                            {
                            char_literal333=(Token)match(input,241,FOLLOW_241_in_upDownDirection2778);  
                            stream_241.add(char_literal333);


                            }
                            break;
                        case 4 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:505:18: 'climb'
                            {
                            string_literal334=(Token)match(input,242,FOLLOW_242_in_upDownDirection2780);  
                            stream_242.add(string_literal334);


                            }
                            break;
                        case 5 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:505:26: 'climbing'
                            {
                            string_literal335=(Token)match(input,243,FOLLOW_243_in_upDownDirection2782);  
                            stream_243.add(string_literal335);


                            }
                            break;
                        case 6 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:505:37: 'ascend'
                            {
                            string_literal336=(Token)match(input,244,FOLLOW_244_in_upDownDirection2784);  
                            stream_244.add(string_literal336);


                            }
                            break;
                        case 7 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:505:46: 'ascending'
                            {
                            string_literal337=(Token)match(input,245,FOLLOW_245_in_upDownDirection2786);  
                            stream_245.add(string_literal337);


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
                    // 506:2: -> CLIMB
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(CLIMB, "CLIMB"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:507:4: ( 'd' | 'down' | 'descend' | 'descending' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:507:4: ( 'd' | 'down' | 'descend' | 'descending' )
                    int alt123=4;
                    switch ( input.LA(1) ) {
                    case 246:
                        {
                        alt123=1;
                        }
                        break;
                    case 247:
                        {
                        alt123=2;
                        }
                        break;
                    case 248:
                        {
                        alt123=3;
                        }
                        break;
                    case 249:
                        {
                        alt123=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 123, 0, input);

                        throw nvae;
                    }

                    switch (alt123) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:507:5: 'd'
                            {
                            char_literal338=(Token)match(input,246,FOLLOW_246_in_upDownDirection2798);  
                            stream_246.add(char_literal338);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:507:9: 'down'
                            {
                            string_literal339=(Token)match(input,247,FOLLOW_247_in_upDownDirection2800);  
                            stream_247.add(string_literal339);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:507:16: 'descend'
                            {
                            string_literal340=(Token)match(input,248,FOLLOW_248_in_upDownDirection2802);  
                            stream_248.add(string_literal340);


                            }
                            break;
                        case 4 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:507:26: 'descending'
                            {
                            string_literal341=(Token)match(input,249,FOLLOW_249_in_upDownDirection2804);  
                            stream_249.add(string_literal341);


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
                    // 508:2: -> DESCEND
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:511:1: leftRightDirection : ( ( 'l' | 'left' | 'port' ) -> LEFT | ( 'r' | 'right' | 'starboard' ) -> RIGHT );
    public final flipsParser.leftRightDirection_return leftRightDirection() throws RecognitionException {
        flipsParser.leftRightDirection_return retval = new flipsParser.leftRightDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal342=null;
        Token string_literal343=null;
        Token string_literal344=null;
        Token char_literal345=null;
        Token string_literal346=null;
        Token string_literal347=null;

        CommonTree char_literal342_tree=null;
        CommonTree string_literal343_tree=null;
        CommonTree string_literal344_tree=null;
        CommonTree char_literal345_tree=null;
        CommonTree string_literal346_tree=null;
        CommonTree string_literal347_tree=null;
        RewriteRuleTokenStream stream_250=new RewriteRuleTokenStream(adaptor,"token 250");
        RewriteRuleTokenStream stream_251=new RewriteRuleTokenStream(adaptor,"token 251");
        RewriteRuleTokenStream stream_252=new RewriteRuleTokenStream(adaptor,"token 252");
        RewriteRuleTokenStream stream_254=new RewriteRuleTokenStream(adaptor,"token 254");
        RewriteRuleTokenStream stream_253=new RewriteRuleTokenStream(adaptor,"token 253");
        RewriteRuleTokenStream stream_255=new RewriteRuleTokenStream(adaptor,"token 255");

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:512:2: ( ( 'l' | 'left' | 'port' ) -> LEFT | ( 'r' | 'right' | 'starboard' ) -> RIGHT )
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( ((LA127_0>=250 && LA127_0<=252)) ) {
                alt127=1;
            }
            else if ( ((LA127_0>=253 && LA127_0<=255)) ) {
                alt127=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 127, 0, input);

                throw nvae;
            }
            switch (alt127) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:512:4: ( 'l' | 'left' | 'port' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:512:4: ( 'l' | 'left' | 'port' )
                    int alt125=3;
                    switch ( input.LA(1) ) {
                    case 250:
                        {
                        alt125=1;
                        }
                        break;
                    case 251:
                        {
                        alt125=2;
                        }
                        break;
                    case 252:
                        {
                        alt125=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 125, 0, input);

                        throw nvae;
                    }

                    switch (alt125) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:512:5: 'l'
                            {
                            char_literal342=(Token)match(input,250,FOLLOW_250_in_leftRightDirection2822);  
                            stream_250.add(char_literal342);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:512:9: 'left'
                            {
                            string_literal343=(Token)match(input,251,FOLLOW_251_in_leftRightDirection2824);  
                            stream_251.add(string_literal343);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:512:16: 'port'
                            {
                            string_literal344=(Token)match(input,252,FOLLOW_252_in_leftRightDirection2826);  
                            stream_252.add(string_literal344);


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
                    // 513:2: -> LEFT
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(LEFT, "LEFT"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:514:4: ( 'r' | 'right' | 'starboard' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:514:4: ( 'r' | 'right' | 'starboard' )
                    int alt126=3;
                    switch ( input.LA(1) ) {
                    case 253:
                        {
                        alt126=1;
                        }
                        break;
                    case 254:
                        {
                        alt126=2;
                        }
                        break;
                    case 255:
                        {
                        alt126=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 126, 0, input);

                        throw nvae;
                    }

                    switch (alt126) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:514:5: 'r'
                            {
                            char_literal345=(Token)match(input,253,FOLLOW_253_in_leftRightDirection2838);  
                            stream_253.add(char_literal345);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:514:9: 'right'
                            {
                            string_literal346=(Token)match(input,254,FOLLOW_254_in_leftRightDirection2840);  
                            stream_254.add(string_literal346);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:514:17: 'starboard'
                            {
                            string_literal347=(Token)match(input,255,FOLLOW_255_in_leftRightDirection2842);  
                            stream_255.add(string_literal347);


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
                    // 515:2: -> RIGHT
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

    public static class clockDirection_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "clockDirection"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:518:1: clockDirection : ( ( 'cw' | 'clockwise' ) -> CLOCKWISE | ( 'ccw' | 'counterclockwise' ) -> COUNTERCLOCKWISE );
    public final flipsParser.clockDirection_return clockDirection() throws RecognitionException {
        flipsParser.clockDirection_return retval = new flipsParser.clockDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal348=null;
        Token string_literal349=null;
        Token string_literal350=null;
        Token string_literal351=null;

        CommonTree string_literal348_tree=null;
        CommonTree string_literal349_tree=null;
        CommonTree string_literal350_tree=null;
        CommonTree string_literal351_tree=null;
        RewriteRuleTokenStream stream_258=new RewriteRuleTokenStream(adaptor,"token 258");
        RewriteRuleTokenStream stream_257=new RewriteRuleTokenStream(adaptor,"token 257");
        RewriteRuleTokenStream stream_259=new RewriteRuleTokenStream(adaptor,"token 259");
        RewriteRuleTokenStream stream_256=new RewriteRuleTokenStream(adaptor,"token 256");

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:519:2: ( ( 'cw' | 'clockwise' ) -> CLOCKWISE | ( 'ccw' | 'counterclockwise' ) -> COUNTERCLOCKWISE )
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( ((LA130_0>=256 && LA130_0<=257)) ) {
                alt130=1;
            }
            else if ( ((LA130_0>=258 && LA130_0<=259)) ) {
                alt130=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 130, 0, input);

                throw nvae;
            }
            switch (alt130) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:519:4: ( 'cw' | 'clockwise' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:519:4: ( 'cw' | 'clockwise' )
                    int alt128=2;
                    int LA128_0 = input.LA(1);

                    if ( (LA128_0==256) ) {
                        alt128=1;
                    }
                    else if ( (LA128_0==257) ) {
                        alt128=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 128, 0, input);

                        throw nvae;
                    }
                    switch (alt128) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:519:5: 'cw'
                            {
                            string_literal348=(Token)match(input,256,FOLLOW_256_in_clockDirection2860);  
                            stream_256.add(string_literal348);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:519:10: 'clockwise'
                            {
                            string_literal349=(Token)match(input,257,FOLLOW_257_in_clockDirection2862);  
                            stream_257.add(string_literal349);


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
                    // 520:2: -> CLOCKWISE
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(CLOCKWISE, "CLOCKWISE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:521:4: ( 'ccw' | 'counterclockwise' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:521:4: ( 'ccw' | 'counterclockwise' )
                    int alt129=2;
                    int LA129_0 = input.LA(1);

                    if ( (LA129_0==258) ) {
                        alt129=1;
                    }
                    else if ( (LA129_0==259) ) {
                        alt129=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 129, 0, input);

                        throw nvae;
                    }
                    switch (alt129) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:521:5: 'ccw'
                            {
                            string_literal350=(Token)match(input,258,FOLLOW_258_in_clockDirection2874);  
                            stream_258.add(string_literal350);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:521:11: 'counterclockwise'
                            {
                            string_literal351=(Token)match(input,259,FOLLOW_259_in_clockDirection2876);  
                            stream_259.add(string_literal351);


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
                    // 522:2: -> COUNTERCLOCKWISE
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(COUNTERCLOCKWISE, "COUNTERCLOCKWISE"));

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
    // $ANTLR end "clockDirection"

    public static class angularValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "angularValue"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:525:1: angularValue : ( numericValue ( 'deg' | 'degs' | 'degree' | 'degrees' ) -> numericValue DEGREE | integerValue 'd' numericValue '\\'' -> integerValue DEGREE numericValue MINUTE | numericValue ( 'rad' | 'rads' | 'radian' | 'radians' ) -> numericValue RADIAN );
    public final flipsParser.angularValue_return angularValue() throws RecognitionException {
        flipsParser.angularValue_return retval = new flipsParser.angularValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal353=null;
        Token string_literal354=null;
        Token string_literal355=null;
        Token string_literal356=null;
        Token char_literal358=null;
        Token char_literal360=null;
        Token string_literal362=null;
        Token string_literal363=null;
        Token string_literal364=null;
        Token string_literal365=null;
        flipsParser.numericValue_return numericValue352 = null;

        flipsParser.integerValue_return integerValue357 = null;

        flipsParser.numericValue_return numericValue359 = null;

        flipsParser.numericValue_return numericValue361 = null;


        CommonTree string_literal353_tree=null;
        CommonTree string_literal354_tree=null;
        CommonTree string_literal355_tree=null;
        CommonTree string_literal356_tree=null;
        CommonTree char_literal358_tree=null;
        CommonTree char_literal360_tree=null;
        CommonTree string_literal362_tree=null;
        CommonTree string_literal363_tree=null;
        CommonTree string_literal364_tree=null;
        CommonTree string_literal365_tree=null;
        RewriteRuleTokenStream stream_262=new RewriteRuleTokenStream(adaptor,"token 262");
        RewriteRuleTokenStream stream_263=new RewriteRuleTokenStream(adaptor,"token 263");
        RewriteRuleTokenStream stream_260=new RewriteRuleTokenStream(adaptor,"token 260");
        RewriteRuleTokenStream stream_261=new RewriteRuleTokenStream(adaptor,"token 261");
        RewriteRuleTokenStream stream_268=new RewriteRuleTokenStream(adaptor,"token 268");
        RewriteRuleTokenStream stream_267=new RewriteRuleTokenStream(adaptor,"token 267");
        RewriteRuleTokenStream stream_266=new RewriteRuleTokenStream(adaptor,"token 266");
        RewriteRuleTokenStream stream_265=new RewriteRuleTokenStream(adaptor,"token 265");
        RewriteRuleTokenStream stream_264=new RewriteRuleTokenStream(adaptor,"token 264");
        RewriteRuleTokenStream stream_246=new RewriteRuleTokenStream(adaptor,"token 246");
        RewriteRuleSubtreeStream stream_integerValue=new RewriteRuleSubtreeStream(adaptor,"rule integerValue");
        RewriteRuleSubtreeStream stream_numericValue=new RewriteRuleSubtreeStream(adaptor,"rule numericValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:526:2: ( numericValue ( 'deg' | 'degs' | 'degree' | 'degrees' ) -> numericValue DEGREE | integerValue 'd' numericValue '\\'' -> integerValue DEGREE numericValue MINUTE | numericValue ( 'rad' | 'rads' | 'radian' | 'radians' ) -> numericValue RADIAN )
            int alt133=3;
            int LA133_0 = input.LA(1);

            if ( ((LA133_0>=BinaryLiteral && LA133_0<=HexLiteral)) ) {
                switch ( input.LA(2) ) {
                case 265:
                case 266:
                case 267:
                case 268:
                    {
                    alt133=3;
                    }
                    break;
                case 246:
                    {
                    alt133=2;
                    }
                    break;
                case 260:
                case 261:
                case 262:
                case 263:
                    {
                    alt133=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 133, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA133_0==FloatingPointLiteral) ) {
                int LA133_2 = input.LA(2);

                if ( ((LA133_2>=260 && LA133_2<=263)) ) {
                    alt133=1;
                }
                else if ( ((LA133_2>=265 && LA133_2<=268)) ) {
                    alt133=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 133, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 133, 0, input);

                throw nvae;
            }
            switch (alt133) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:526:4: numericValue ( 'deg' | 'degs' | 'degree' | 'degrees' )
                    {
                    pushFollow(FOLLOW_numericValue_in_angularValue2893);
                    numericValue352=numericValue();

                    state._fsp--;

                    stream_numericValue.add(numericValue352.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:526:17: ( 'deg' | 'degs' | 'degree' | 'degrees' )
                    int alt131=4;
                    switch ( input.LA(1) ) {
                    case 260:
                        {
                        alt131=1;
                        }
                        break;
                    case 261:
                        {
                        alt131=2;
                        }
                        break;
                    case 262:
                        {
                        alt131=3;
                        }
                        break;
                    case 263:
                        {
                        alt131=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 131, 0, input);

                        throw nvae;
                    }

                    switch (alt131) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:526:18: 'deg'
                            {
                            string_literal353=(Token)match(input,260,FOLLOW_260_in_angularValue2896);  
                            stream_260.add(string_literal353);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:526:24: 'degs'
                            {
                            string_literal354=(Token)match(input,261,FOLLOW_261_in_angularValue2898);  
                            stream_261.add(string_literal354);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:526:31: 'degree'
                            {
                            string_literal355=(Token)match(input,262,FOLLOW_262_in_angularValue2900);  
                            stream_262.add(string_literal355);


                            }
                            break;
                        case 4 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:526:40: 'degrees'
                            {
                            string_literal356=(Token)match(input,263,FOLLOW_263_in_angularValue2902);  
                            stream_263.add(string_literal356);


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
                    // 527:2: -> numericValue DEGREE
                    {
                        adaptor.addChild(root_0, stream_numericValue.nextTree());
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(DEGREE, "DEGREE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:528:4: integerValue 'd' numericValue '\\''
                    {
                    pushFollow(FOLLOW_integerValue_in_angularValue2915);
                    integerValue357=integerValue();

                    state._fsp--;

                    stream_integerValue.add(integerValue357.getTree());
                    char_literal358=(Token)match(input,246,FOLLOW_246_in_angularValue2917);  
                    stream_246.add(char_literal358);

                    pushFollow(FOLLOW_numericValue_in_angularValue2919);
                    numericValue359=numericValue();

                    state._fsp--;

                    stream_numericValue.add(numericValue359.getTree());
                    char_literal360=(Token)match(input,264,FOLLOW_264_in_angularValue2921);  
                    stream_264.add(char_literal360);



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
                    // 529:2: -> integerValue DEGREE numericValue MINUTE
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:530:4: numericValue ( 'rad' | 'rads' | 'radian' | 'radians' )
                    {
                    pushFollow(FOLLOW_numericValue_in_angularValue2937);
                    numericValue361=numericValue();

                    state._fsp--;

                    stream_numericValue.add(numericValue361.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:530:17: ( 'rad' | 'rads' | 'radian' | 'radians' )
                    int alt132=4;
                    switch ( input.LA(1) ) {
                    case 265:
                        {
                        alt132=1;
                        }
                        break;
                    case 266:
                        {
                        alt132=2;
                        }
                        break;
                    case 267:
                        {
                        alt132=3;
                        }
                        break;
                    case 268:
                        {
                        alt132=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 132, 0, input);

                        throw nvae;
                    }

                    switch (alt132) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:530:18: 'rad'
                            {
                            string_literal362=(Token)match(input,265,FOLLOW_265_in_angularValue2940);  
                            stream_265.add(string_literal362);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:530:24: 'rads'
                            {
                            string_literal363=(Token)match(input,266,FOLLOW_266_in_angularValue2942);  
                            stream_266.add(string_literal363);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:530:31: 'radian'
                            {
                            string_literal364=(Token)match(input,267,FOLLOW_267_in_angularValue2944);  
                            stream_267.add(string_literal364);


                            }
                            break;
                        case 4 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:530:40: 'radians'
                            {
                            string_literal365=(Token)match(input,268,FOLLOW_268_in_angularValue2946);  
                            stream_268.add(string_literal365);


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
                    // 531:2: -> numericValue RADIAN
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:536:1: waypoint : ( geoCoordinate | Identifier -> ^( WAYPOINT Identifier ) );
    public final flipsParser.waypoint_return waypoint() throws RecognitionException {
        flipsParser.waypoint_return retval = new flipsParser.waypoint_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier367=null;
        flipsParser.geoCoordinate_return geoCoordinate366 = null;


        CommonTree Identifier367_tree=null;
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:537:2: ( geoCoordinate | Identifier -> ^( WAYPOINT Identifier ) )
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( ((LA134_0>=FloatingPointLiteral && LA134_0<=HexLiteral)||LA134_0==101||(LA134_0>=269 && LA134_0<=270)) ) {
                alt134=1;
            }
            else if ( (LA134_0==Identifier) ) {
                alt134=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 134, 0, input);

                throw nvae;
            }
            switch (alt134) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:537:4: geoCoordinate
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_geoCoordinate_in_waypoint2967);
                    geoCoordinate366=geoCoordinate();

                    state._fsp--;

                    adaptor.addChild(root_0, geoCoordinate366.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:538:4: Identifier
                    {
                    Identifier367=(Token)match(input,Identifier,FOLLOW_Identifier_in_waypoint2972);  
                    stream_Identifier.add(Identifier367);



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
                    // 539:2: -> ^( WAYPOINT Identifier )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:539:5: ^( WAYPOINT Identifier )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:542:1: geoCoordinate : ( latitudeLongitude -> ^( GEOCOORDINATE latitudeLongitude ) | distanceCoordinate -> ^( GEOCOORDINATE distanceCoordinate ) );
    public final flipsParser.geoCoordinate_return geoCoordinate() throws RecognitionException {
        flipsParser.geoCoordinate_return retval = new flipsParser.geoCoordinate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.latitudeLongitude_return latitudeLongitude368 = null;

        flipsParser.distanceCoordinate_return distanceCoordinate369 = null;


        RewriteRuleSubtreeStream stream_distanceCoordinate=new RewriteRuleSubtreeStream(adaptor,"rule distanceCoordinate");
        RewriteRuleSubtreeStream stream_latitudeLongitude=new RewriteRuleSubtreeStream(adaptor,"rule latitudeLongitude");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:543:2: ( latitudeLongitude -> ^( GEOCOORDINATE latitudeLongitude ) | distanceCoordinate -> ^( GEOCOORDINATE distanceCoordinate ) )
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( ((LA135_0>=FloatingPointLiteral && LA135_0<=HexLiteral)||(LA135_0>=269 && LA135_0<=270)) ) {
                alt135=1;
            }
            else if ( (LA135_0==101) ) {
                alt135=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 135, 0, input);

                throw nvae;
            }
            switch (alt135) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:543:4: latitudeLongitude
                    {
                    pushFollow(FOLLOW_latitudeLongitude_in_geoCoordinate2992);
                    latitudeLongitude368=latitudeLongitude();

                    state._fsp--;

                    stream_latitudeLongitude.add(latitudeLongitude368.getTree());


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
                    // 544:2: -> ^( GEOCOORDINATE latitudeLongitude )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:544:5: ^( GEOCOORDINATE latitudeLongitude )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:545:4: distanceCoordinate
                    {
                    pushFollow(FOLLOW_distanceCoordinate_in_geoCoordinate3006);
                    distanceCoordinate369=distanceCoordinate();

                    state._fsp--;

                    stream_distanceCoordinate.add(distanceCoordinate369.getTree());


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
                    // 546:2: -> ^( GEOCOORDINATE distanceCoordinate )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:546:5: ^( GEOCOORDINATE distanceCoordinate )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:549:1: latitudeLongitude : (x= latitudeLongitudeValue northSouthDirection ( ',' )? y= latitudeLongitudeValue eastWestDirection -> ^( LATITUDE $x northSouthDirection ) ^( LONGITUDE $y eastWestDirection ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y EAST ) | '-' x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y EAST ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y WEST ) | '-' x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y WEST ) );
    public final flipsParser.latitudeLongitude_return latitudeLongitude() throws RecognitionException {
        flipsParser.latitudeLongitude_return retval = new flipsParser.latitudeLongitude_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal371=null;
        Token char_literal373=null;
        Token char_literal374=null;
        Token char_literal375=null;
        Token char_literal376=null;
        Token char_literal377=null;
        Token char_literal378=null;
        Token char_literal379=null;
        Token char_literal380=null;
        Token char_literal381=null;
        Token char_literal382=null;
        Token char_literal383=null;
        Token char_literal384=null;
        flipsParser.latitudeLongitudeValue_return x = null;

        flipsParser.latitudeLongitudeValue_return y = null;

        flipsParser.northSouthDirection_return northSouthDirection370 = null;

        flipsParser.eastWestDirection_return eastWestDirection372 = null;


        CommonTree char_literal371_tree=null;
        CommonTree char_literal373_tree=null;
        CommonTree char_literal374_tree=null;
        CommonTree char_literal375_tree=null;
        CommonTree char_literal376_tree=null;
        CommonTree char_literal377_tree=null;
        CommonTree char_literal378_tree=null;
        CommonTree char_literal379_tree=null;
        CommonTree char_literal380_tree=null;
        CommonTree char_literal381_tree=null;
        CommonTree char_literal382_tree=null;
        CommonTree char_literal383_tree=null;
        CommonTree char_literal384_tree=null;
        RewriteRuleTokenStream stream_270=new RewriteRuleTokenStream(adaptor,"token 270");
        RewriteRuleTokenStream stream_269=new RewriteRuleTokenStream(adaptor,"token 269");
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
        RewriteRuleSubtreeStream stream_latitudeLongitudeValue=new RewriteRuleSubtreeStream(adaptor,"rule latitudeLongitudeValue");
        RewriteRuleSubtreeStream stream_eastWestDirection=new RewriteRuleSubtreeStream(adaptor,"rule eastWestDirection");
        RewriteRuleSubtreeStream stream_northSouthDirection=new RewriteRuleSubtreeStream(adaptor,"rule northSouthDirection");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:550:2: (x= latitudeLongitudeValue northSouthDirection ( ',' )? y= latitudeLongitudeValue eastWestDirection -> ^( LATITUDE $x northSouthDirection ) ^( LONGITUDE $y eastWestDirection ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y EAST ) | '-' x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y EAST ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y WEST ) | '-' x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y WEST ) )
            int alt145=5;
            alt145 = dfa145.predict(input);
            switch (alt145) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:550:4: x= latitudeLongitudeValue northSouthDirection ( ',' )? y= latitudeLongitudeValue eastWestDirection
                    {
                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3028);
                    x=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(x.getTree());
                    pushFollow(FOLLOW_northSouthDirection_in_latitudeLongitude3030);
                    northSouthDirection370=northSouthDirection();

                    state._fsp--;

                    stream_northSouthDirection.add(northSouthDirection370.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:550:49: ( ',' )?
                    int alt136=2;
                    int LA136_0 = input.LA(1);

                    if ( (LA136_0==100) ) {
                        alt136=1;
                    }
                    switch (alt136) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:550:49: ','
                            {
                            char_literal371=(Token)match(input,100,FOLLOW_100_in_latitudeLongitude3032);  
                            stream_100.add(char_literal371);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3037);
                    y=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(y.getTree());
                    pushFollow(FOLLOW_eastWestDirection_in_latitudeLongitude3039);
                    eastWestDirection372=eastWestDirection();

                    state._fsp--;

                    stream_eastWestDirection.add(eastWestDirection372.getTree());


                    // AST REWRITE
                    // elements: northSouthDirection, y, x, eastWestDirection
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
                    // 551:2: -> ^( LATITUDE $x northSouthDirection ) ^( LONGITUDE $y eastWestDirection )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:551:5: ^( LATITUDE $x northSouthDirection )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LATITUDE, "LATITUDE"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, stream_northSouthDirection.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:551:40: ^( LONGITUDE $y eastWestDirection )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:552:4: ( '+' )? x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:552:4: ( '+' )?
                    int alt137=2;
                    int LA137_0 = input.LA(1);

                    if ( (LA137_0==269) ) {
                        alt137=1;
                    }
                    switch (alt137) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:552:4: '+'
                            {
                            char_literal373=(Token)match(input,269,FOLLOW_269_in_latitudeLongitude3065);  
                            stream_269.add(char_literal373);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3070);
                    x=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(x.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:552:34: ( ',' )?
                    int alt138=2;
                    int LA138_0 = input.LA(1);

                    if ( (LA138_0==100) ) {
                        alt138=1;
                    }
                    switch (alt138) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:552:34: ','
                            {
                            char_literal374=(Token)match(input,100,FOLLOW_100_in_latitudeLongitude3072);  
                            stream_100.add(char_literal374);


                            }
                            break;

                    }

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:552:39: ( '+' )?
                    int alt139=2;
                    int LA139_0 = input.LA(1);

                    if ( (LA139_0==269) ) {
                        alt139=1;
                    }
                    switch (alt139) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:552:39: '+'
                            {
                            char_literal375=(Token)match(input,269,FOLLOW_269_in_latitudeLongitude3075);  
                            stream_269.add(char_literal375);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3080);
                    y=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(y.getTree());


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
                    // 553:2: -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y EAST )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:553:5: ^( LATITUDE $x NORTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LATITUDE, "LATITUDE"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NORTH, "NORTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:553:26: ^( LONGITUDE $y EAST )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:554:4: '-' x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue
                    {
                    char_literal376=(Token)match(input,270,FOLLOW_270_in_latitudeLongitude3106);  
                    stream_270.add(char_literal376);

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3110);
                    x=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(x.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:554:33: ( ',' )?
                    int alt140=2;
                    int LA140_0 = input.LA(1);

                    if ( (LA140_0==100) ) {
                        alt140=1;
                    }
                    switch (alt140) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:554:33: ','
                            {
                            char_literal377=(Token)match(input,100,FOLLOW_100_in_latitudeLongitude3112);  
                            stream_100.add(char_literal377);


                            }
                            break;

                    }

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:554:38: ( '+' )?
                    int alt141=2;
                    int LA141_0 = input.LA(1);

                    if ( (LA141_0==269) ) {
                        alt141=1;
                    }
                    switch (alt141) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:554:38: '+'
                            {
                            char_literal378=(Token)match(input,269,FOLLOW_269_in_latitudeLongitude3115);  
                            stream_269.add(char_literal378);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3120);
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
                    // 555:2: -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y EAST )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:555:5: ^( LATITUDE $x SOUTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LATITUDE, "LATITUDE"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(SOUTH, "SOUTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:555:26: ^( LONGITUDE $y EAST )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:556:4: ( '+' )? x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:556:4: ( '+' )?
                    int alt142=2;
                    int LA142_0 = input.LA(1);

                    if ( (LA142_0==269) ) {
                        alt142=1;
                    }
                    switch (alt142) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:556:4: '+'
                            {
                            char_literal379=(Token)match(input,269,FOLLOW_269_in_latitudeLongitude3146);  
                            stream_269.add(char_literal379);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3151);
                    x=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(x.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:556:34: ( ',' )?
                    int alt143=2;
                    int LA143_0 = input.LA(1);

                    if ( (LA143_0==100) ) {
                        alt143=1;
                    }
                    switch (alt143) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:556:34: ','
                            {
                            char_literal380=(Token)match(input,100,FOLLOW_100_in_latitudeLongitude3153);  
                            stream_100.add(char_literal380);


                            }
                            break;

                    }

                    char_literal381=(Token)match(input,270,FOLLOW_270_in_latitudeLongitude3156);  
                    stream_270.add(char_literal381);

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3160);
                    y=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(y.getTree());


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
                    // 557:2: -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y WEST )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:557:5: ^( LATITUDE $x NORTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LATITUDE, "LATITUDE"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NORTH, "NORTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:557:26: ^( LONGITUDE $y WEST )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:558:4: '-' x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue
                    {
                    char_literal382=(Token)match(input,270,FOLLOW_270_in_latitudeLongitude3186);  
                    stream_270.add(char_literal382);

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3190);
                    x=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(x.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:558:33: ( ',' )?
                    int alt144=2;
                    int LA144_0 = input.LA(1);

                    if ( (LA144_0==100) ) {
                        alt144=1;
                    }
                    switch (alt144) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:558:33: ','
                            {
                            char_literal383=(Token)match(input,100,FOLLOW_100_in_latitudeLongitude3192);  
                            stream_100.add(char_literal383);


                            }
                            break;

                    }

                    char_literal384=(Token)match(input,270,FOLLOW_270_in_latitudeLongitude3195);  
                    stream_270.add(char_literal384);

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3199);
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
                    // 559:2: -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y WEST )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:559:5: ^( LATITUDE $x SOUTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LATITUDE, "LATITUDE"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(SOUTH, "SOUTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:559:26: ^( LONGITUDE $y WEST )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:562:1: latitudeLongitudeValue : ( numericValue -> numericValue DEGREE | angularValue );
    public final flipsParser.latitudeLongitudeValue_return latitudeLongitudeValue() throws RecognitionException {
        flipsParser.latitudeLongitudeValue_return retval = new flipsParser.latitudeLongitudeValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.numericValue_return numericValue385 = null;

        flipsParser.angularValue_return angularValue386 = null;


        RewriteRuleSubtreeStream stream_numericValue=new RewriteRuleSubtreeStream(adaptor,"rule numericValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:563:2: ( numericValue -> numericValue DEGREE | angularValue )
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( ((LA146_0>=BinaryLiteral && LA146_0<=HexLiteral)) ) {
                switch ( input.LA(2) ) {
                case 246:
                    {
                    switch ( input.LA(3) ) {
                    case BinaryLiteral:
                    case OctalLiteral:
                    case DecimalLiteral:
                    case HexLiteral:
                        {
                        int LA146_6 = input.LA(4);

                        if ( ((LA146_6>=128 && LA146_6<=145)||(LA146_6>=148 && LA146_6<=165)) ) {
                            alt146=1;
                        }
                        else if ( (LA146_6==264) ) {
                            alt146=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 146, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    case FloatingPointLiteral:
                        {
                        int LA146_7 = input.LA(4);

                        if ( (LA146_7==264) ) {
                            alt146=2;
                        }
                        else if ( ((LA146_7>=128 && LA146_7<=145)||(LA146_7>=148 && LA146_7<=165)) ) {
                            alt146=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 146, 7, input);

                            throw nvae;
                        }
                        }
                        break;
                    case To:
                    case FlightLevel:
                        {
                        alt146=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 146, 3, input);

                        throw nvae;
                    }

                    }
                    break;
                case 260:
                case 261:
                case 262:
                case 263:
                case 265:
                case 266:
                case 267:
                case 268:
                    {
                    alt146=2;
                    }
                    break;
                case EOF:
                case Identifier:
                case To:
                case At:
                case With:
                case Turning:
                case Heading:
                case FloatingPointLiteral:
                case BinaryLiteral:
                case OctalLiteral:
                case DecimalLiteral:
                case HexLiteral:
                case 95:
                case 96:
                case 97:
                case 99:
                case 100:
                case 103:
                case 104:
                case 105:
                case 106:
                case 107:
                case 108:
                case 109:
                case 110:
                case 111:
                case 112:
                case 113:
                case 114:
                case 115:
                case 116:
                case 118:
                case 119:
                case 121:
                case 122:
                case 125:
                case 146:
                case 147:
                case 202:
                case 207:
                case 208:
                case 209:
                case 210:
                case 211:
                case 212:
                case 213:
                case 214:
                case 215:
                case 216:
                case 217:
                case 218:
                case 219:
                case 220:
                case 221:
                case 222:
                case 223:
                case 224:
                case 225:
                case 226:
                case 227:
                case 228:
                case 229:
                case 230:
                case 231:
                case 232:
                case 233:
                case 234:
                case 235:
                case 236:
                case 237:
                case 238:
                case 239:
                case 240:
                case 241:
                case 242:
                case 243:
                case 244:
                case 245:
                case 247:
                case 248:
                case 249:
                case 250:
                case 251:
                case 252:
                case 253:
                case 254:
                case 255:
                case 256:
                case 257:
                case 258:
                case 259:
                case 269:
                case 270:
                    {
                    alt146=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 146, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA146_0==FloatingPointLiteral) ) {
                int LA146_2 = input.LA(2);

                if ( ((LA146_2>=260 && LA146_2<=263)||(LA146_2>=265 && LA146_2<=268)) ) {
                    alt146=2;
                }
                else if ( (LA146_2==EOF||(LA146_2>=Identifier && LA146_2<=With)||(LA146_2>=Turning && LA146_2<=HexLiteral)||(LA146_2>=95 && LA146_2<=97)||(LA146_2>=99 && LA146_2<=100)||(LA146_2>=103 && LA146_2<=116)||(LA146_2>=118 && LA146_2<=119)||(LA146_2>=121 && LA146_2<=122)||LA146_2==125||(LA146_2>=146 && LA146_2<=147)||LA146_2==202||(LA146_2>=207 && LA146_2<=259)||(LA146_2>=269 && LA146_2<=270)) ) {
                    alt146=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 146, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 146, 0, input);

                throw nvae;
            }
            switch (alt146) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:563:4: numericValue
                    {
                    pushFollow(FOLLOW_numericValue_in_latitudeLongitudeValue3231);
                    numericValue385=numericValue();

                    state._fsp--;

                    stream_numericValue.add(numericValue385.getTree());


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
                    // 564:2: -> numericValue DEGREE
                    {
                        adaptor.addChild(root_0, stream_numericValue.nextTree());
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(DEGREE, "DEGREE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:565:4: angularValue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_angularValue_in_latitudeLongitudeValue3243);
                    angularValue386=angularValue();

                    state._fsp--;

                    adaptor.addChild(root_0, angularValue386.getTree());

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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:568:1: distanceCoordinate : ( '(' ( '+' )? x= distanceValue ',' ( '+' )? y= distanceValue ')' -> ^( DISTANCE $y NORTH ) ^( DISTANCE $x EAST ) | '(' '-' x= distanceValue ',' ( '+' )? y= distanceValue ')' -> ^( DISTANCE $y NORTH ) ^( DISTANCE $x WEST ) | '(' ( '+' )? x= distanceValue ',' '-' y= distanceValue ')' -> ^( DISTANCE $y SOUTH ) ^( DISTANCE $x EAST ) | '(' '-' x= distanceValue ',' '-' y= distanceValue ')' -> ^( DISTANCE $y SOUTH ) ^( DISTANCE $x WEST ) );
    public final flipsParser.distanceCoordinate_return distanceCoordinate() throws RecognitionException {
        flipsParser.distanceCoordinate_return retval = new flipsParser.distanceCoordinate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal387=null;
        Token char_literal388=null;
        Token char_literal389=null;
        Token char_literal390=null;
        Token char_literal391=null;
        Token char_literal392=null;
        Token char_literal393=null;
        Token char_literal394=null;
        Token char_literal395=null;
        Token char_literal396=null;
        Token char_literal397=null;
        Token char_literal398=null;
        Token char_literal399=null;
        Token char_literal400=null;
        Token char_literal401=null;
        Token char_literal402=null;
        Token char_literal403=null;
        Token char_literal404=null;
        Token char_literal405=null;
        Token char_literal406=null;
        flipsParser.distanceValue_return x = null;

        flipsParser.distanceValue_return y = null;


        CommonTree char_literal387_tree=null;
        CommonTree char_literal388_tree=null;
        CommonTree char_literal389_tree=null;
        CommonTree char_literal390_tree=null;
        CommonTree char_literal391_tree=null;
        CommonTree char_literal392_tree=null;
        CommonTree char_literal393_tree=null;
        CommonTree char_literal394_tree=null;
        CommonTree char_literal395_tree=null;
        CommonTree char_literal396_tree=null;
        CommonTree char_literal397_tree=null;
        CommonTree char_literal398_tree=null;
        CommonTree char_literal399_tree=null;
        CommonTree char_literal400_tree=null;
        CommonTree char_literal401_tree=null;
        CommonTree char_literal402_tree=null;
        CommonTree char_literal403_tree=null;
        CommonTree char_literal404_tree=null;
        CommonTree char_literal405_tree=null;
        CommonTree char_literal406_tree=null;
        RewriteRuleTokenStream stream_270=new RewriteRuleTokenStream(adaptor,"token 270");
        RewriteRuleTokenStream stream_269=new RewriteRuleTokenStream(adaptor,"token 269");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
        RewriteRuleSubtreeStream stream_distanceValue=new RewriteRuleSubtreeStream(adaptor,"rule distanceValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:569:2: ( '(' ( '+' )? x= distanceValue ',' ( '+' )? y= distanceValue ')' -> ^( DISTANCE $y NORTH ) ^( DISTANCE $x EAST ) | '(' '-' x= distanceValue ',' ( '+' )? y= distanceValue ')' -> ^( DISTANCE $y NORTH ) ^( DISTANCE $x WEST ) | '(' ( '+' )? x= distanceValue ',' '-' y= distanceValue ')' -> ^( DISTANCE $y SOUTH ) ^( DISTANCE $x EAST ) | '(' '-' x= distanceValue ',' '-' y= distanceValue ')' -> ^( DISTANCE $y SOUTH ) ^( DISTANCE $x WEST ) )
            int alt151=4;
            alt151 = dfa151.predict(input);
            switch (alt151) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:569:4: '(' ( '+' )? x= distanceValue ',' ( '+' )? y= distanceValue ')'
                    {
                    char_literal387=(Token)match(input,101,FOLLOW_101_in_distanceCoordinate3254);  
                    stream_101.add(char_literal387);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:569:8: ( '+' )?
                    int alt147=2;
                    int LA147_0 = input.LA(1);

                    if ( (LA147_0==269) ) {
                        alt147=1;
                    }
                    switch (alt147) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:569:8: '+'
                            {
                            char_literal388=(Token)match(input,269,FOLLOW_269_in_distanceCoordinate3256);  
                            stream_269.add(char_literal388);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_distanceValue_in_distanceCoordinate3261);
                    x=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(x.getTree());
                    char_literal389=(Token)match(input,100,FOLLOW_100_in_distanceCoordinate3263);  
                    stream_100.add(char_literal389);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:569:33: ( '+' )?
                    int alt148=2;
                    int LA148_0 = input.LA(1);

                    if ( (LA148_0==269) ) {
                        alt148=1;
                    }
                    switch (alt148) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:569:33: '+'
                            {
                            char_literal390=(Token)match(input,269,FOLLOW_269_in_distanceCoordinate3265);  
                            stream_269.add(char_literal390);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_distanceValue_in_distanceCoordinate3270);
                    y=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(y.getTree());
                    char_literal391=(Token)match(input,102,FOLLOW_102_in_distanceCoordinate3272);  
                    stream_102.add(char_literal391);



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
                    // 570:2: -> ^( DISTANCE $y NORTH ) ^( DISTANCE $x EAST )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:570:5: ^( DISTANCE $y NORTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DISTANCE, "DISTANCE"), root_1);

                        adaptor.addChild(root_1, stream_y.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NORTH, "NORTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:570:26: ^( DISTANCE $x EAST )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:571:4: '(' '-' x= distanceValue ',' ( '+' )? y= distanceValue ')'
                    {
                    char_literal392=(Token)match(input,101,FOLLOW_101_in_distanceCoordinate3298);  
                    stream_101.add(char_literal392);

                    char_literal393=(Token)match(input,270,FOLLOW_270_in_distanceCoordinate3300);  
                    stream_270.add(char_literal393);

                    pushFollow(FOLLOW_distanceValue_in_distanceCoordinate3304);
                    x=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(x.getTree());
                    char_literal394=(Token)match(input,100,FOLLOW_100_in_distanceCoordinate3306);  
                    stream_100.add(char_literal394);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:571:32: ( '+' )?
                    int alt149=2;
                    int LA149_0 = input.LA(1);

                    if ( (LA149_0==269) ) {
                        alt149=1;
                    }
                    switch (alt149) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:571:32: '+'
                            {
                            char_literal395=(Token)match(input,269,FOLLOW_269_in_distanceCoordinate3308);  
                            stream_269.add(char_literal395);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_distanceValue_in_distanceCoordinate3313);
                    y=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(y.getTree());
                    char_literal396=(Token)match(input,102,FOLLOW_102_in_distanceCoordinate3315);  
                    stream_102.add(char_literal396);



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
                    // 572:2: -> ^( DISTANCE $y NORTH ) ^( DISTANCE $x WEST )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:572:5: ^( DISTANCE $y NORTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DISTANCE, "DISTANCE"), root_1);

                        adaptor.addChild(root_1, stream_y.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NORTH, "NORTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:572:26: ^( DISTANCE $x WEST )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:573:4: '(' ( '+' )? x= distanceValue ',' '-' y= distanceValue ')'
                    {
                    char_literal397=(Token)match(input,101,FOLLOW_101_in_distanceCoordinate3341);  
                    stream_101.add(char_literal397);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:573:8: ( '+' )?
                    int alt150=2;
                    int LA150_0 = input.LA(1);

                    if ( (LA150_0==269) ) {
                        alt150=1;
                    }
                    switch (alt150) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:573:8: '+'
                            {
                            char_literal398=(Token)match(input,269,FOLLOW_269_in_distanceCoordinate3343);  
                            stream_269.add(char_literal398);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_distanceValue_in_distanceCoordinate3348);
                    x=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(x.getTree());
                    char_literal399=(Token)match(input,100,FOLLOW_100_in_distanceCoordinate3350);  
                    stream_100.add(char_literal399);

                    char_literal400=(Token)match(input,270,FOLLOW_270_in_distanceCoordinate3352);  
                    stream_270.add(char_literal400);

                    pushFollow(FOLLOW_distanceValue_in_distanceCoordinate3356);
                    y=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(y.getTree());
                    char_literal401=(Token)match(input,102,FOLLOW_102_in_distanceCoordinate3358);  
                    stream_102.add(char_literal401);



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
                    // 574:2: -> ^( DISTANCE $y SOUTH ) ^( DISTANCE $x EAST )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:574:5: ^( DISTANCE $y SOUTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DISTANCE, "DISTANCE"), root_1);

                        adaptor.addChild(root_1, stream_y.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(SOUTH, "SOUTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:574:26: ^( DISTANCE $x EAST )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:575:4: '(' '-' x= distanceValue ',' '-' y= distanceValue ')'
                    {
                    char_literal402=(Token)match(input,101,FOLLOW_101_in_distanceCoordinate3384);  
                    stream_101.add(char_literal402);

                    char_literal403=(Token)match(input,270,FOLLOW_270_in_distanceCoordinate3386);  
                    stream_270.add(char_literal403);

                    pushFollow(FOLLOW_distanceValue_in_distanceCoordinate3390);
                    x=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(x.getTree());
                    char_literal404=(Token)match(input,100,FOLLOW_100_in_distanceCoordinate3392);  
                    stream_100.add(char_literal404);

                    char_literal405=(Token)match(input,270,FOLLOW_270_in_distanceCoordinate3394);  
                    stream_270.add(char_literal405);

                    pushFollow(FOLLOW_distanceValue_in_distanceCoordinate3398);
                    y=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(y.getTree());
                    char_literal406=(Token)match(input,102,FOLLOW_102_in_distanceCoordinate3400);  
                    stream_102.add(char_literal406);



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
                    // 576:2: -> ^( DISTANCE $y SOUTH ) ^( DISTANCE $x WEST )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:576:5: ^( DISTANCE $y SOUTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DISTANCE, "DISTANCE"), root_1);

                        adaptor.addChild(root_1, stream_y.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(SOUTH, "SOUTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:576:26: ^( DISTANCE $x WEST )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:581:1: numericValue : ( integerValue | FloatingPointLiteral );
    public final flipsParser.numericValue_return numericValue() throws RecognitionException {
        flipsParser.numericValue_return retval = new flipsParser.numericValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FloatingPointLiteral408=null;
        flipsParser.integerValue_return integerValue407 = null;


        CommonTree FloatingPointLiteral408_tree=null;

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:582:2: ( integerValue | FloatingPointLiteral )
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( ((LA152_0>=BinaryLiteral && LA152_0<=HexLiteral)) ) {
                alt152=1;
            }
            else if ( (LA152_0==FloatingPointLiteral) ) {
                alt152=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 152, 0, input);

                throw nvae;
            }
            switch (alt152) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:582:4: integerValue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_integerValue_in_numericValue3434);
                    integerValue407=integerValue();

                    state._fsp--;

                    adaptor.addChild(root_0, integerValue407.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:583:4: FloatingPointLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    FloatingPointLiteral408=(Token)match(input,FloatingPointLiteral,FOLLOW_FloatingPointLiteral_in_numericValue3439); 
                    FloatingPointLiteral408_tree = (CommonTree)adaptor.create(FloatingPointLiteral408);
                    adaptor.addChild(root_0, FloatingPointLiteral408_tree);


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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:586:1: integerValue : ( BinaryLiteral | OctalLiteral | DecimalLiteral | HexLiteral );
    public final flipsParser.integerValue_return integerValue() throws RecognitionException {
        flipsParser.integerValue_return retval = new flipsParser.integerValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set409=null;

        CommonTree set409_tree=null;

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:587:2: ( BinaryLiteral | OctalLiteral | DecimalLiteral | HexLiteral )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set409=(Token)input.LT(1);
            if ( (input.LA(1)>=BinaryLiteral && input.LA(1)<=HexLiteral) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set409));
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

    public static class percentValue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "percentValue"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:593:1: percentValue : numericValue ( '%' | 'percent' ) -> numericValue PERCENT ;
    public final flipsParser.percentValue_return percentValue() throws RecognitionException {
        flipsParser.percentValue_return retval = new flipsParser.percentValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal411=null;
        Token string_literal412=null;
        flipsParser.numericValue_return numericValue410 = null;


        CommonTree char_literal411_tree=null;
        CommonTree string_literal412_tree=null;
        RewriteRuleTokenStream stream_272=new RewriteRuleTokenStream(adaptor,"token 272");
        RewriteRuleTokenStream stream_271=new RewriteRuleTokenStream(adaptor,"token 271");
        RewriteRuleSubtreeStream stream_numericValue=new RewriteRuleSubtreeStream(adaptor,"rule numericValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:594:2: ( numericValue ( '%' | 'percent' ) -> numericValue PERCENT )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:594:4: numericValue ( '%' | 'percent' )
            {
            pushFollow(FOLLOW_numericValue_in_percentValue3476);
            numericValue410=numericValue();

            state._fsp--;

            stream_numericValue.add(numericValue410.getTree());
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:594:17: ( '%' | 'percent' )
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==271) ) {
                alt153=1;
            }
            else if ( (LA153_0==272) ) {
                alt153=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 153, 0, input);

                throw nvae;
            }
            switch (alt153) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:594:18: '%'
                    {
                    char_literal411=(Token)match(input,271,FOLLOW_271_in_percentValue3479);  
                    stream_271.add(char_literal411);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:594:22: 'percent'
                    {
                    string_literal412=(Token)match(input,272,FOLLOW_272_in_percentValue3481);  
                    stream_272.add(string_literal412);


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
            // 595:2: -> numericValue PERCENT
            {
                adaptor.addChild(root_0, stream_numericValue.nextTree());
                adaptor.addChild(root_0, (CommonTree)adaptor.create(PERCENT, "PERCENT"));

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
    // $ANTLR end "percentValue"

    // Delegated rules


    protected DFA26 dfa26 = new DFA26(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA40 dfa40 = new DFA40(this);
    protected DFA73 dfa73 = new DFA73(this);
    protected DFA87 dfa87 = new DFA87(this);
    protected DFA94 dfa94 = new DFA94(this);
    protected DFA145 dfa145 = new DFA145(this);
    protected DFA151 dfa151 = new DFA151(this);
    static final String DFA26_eotS =
        "\76\uffff";
    static final String DFA26_eofS =
        "\17\uffff\7\5\2\uffff\11\5\5\uffff\7\13\2\uffff\11\13\3\5\3\13";
    static final String DFA26_minS =
        "\1\113\1\116\1\uffff\2\u0094\2\uffff\1\116\2\uffff\1\112\1\uffff"+
        "\2\u0080\1\uffff\7\112\2\u009c\11\112\1\166\2\121\2\uffff\7\112"+
        "\2\u009c\17\112";
    static final String DFA26_maxS =
        "\1\u00ff\1\u00b8\1\uffff\2\u0110\2\uffff\1\177\2\uffff\1\u010e\1"+
        "\uffff\2\u0110\1\uffff\7\u00ff\2\u009e\11\u00ff\1\174\2\u010e\2"+
        "\uffff\7\u00ff\2\u009e\17\u00ff";
    static final String DFA26_acceptS =
        "\2\uffff\1\2\2\uffff\1\4\1\5\1\uffff\1\6\1\7\1\uffff\1\11\2\uffff"+
        "\1\3\25\uffff\1\10\1\1\30\uffff";
    static final String DFA26_specialS =
        "\76\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\12\1\1\1\7\1\uffff\2\2\1\4\4\3\35\uffff\2\6\1\uffff\2\6\1"+
            "\uffff\2\10\117\uffff\1\2\4\uffff\1\11\37\2\13\13\6\5",
            "\1\13\2\uffff\1\15\4\14\37\uffff\1\13\5\uffff\5\13\63\uffff"+
            "\6\16",
            "",
            "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\30\1\31\1\32\1\27"+
            "\1\33\1\34\1\35\1\36\1\37\1\40\2\uffff\7\16\140\uffff\2\16",
            "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\30\1\31\1\32\1\27"+
            "\1\33\1\34\1\35\1\36\1\37\1\40\2\uffff\7\16\140\uffff\2\16",
            "",
            "",
            "\1\13\2\uffff\5\13\37\uffff\1\41\5\uffff\5\13",
            "",
            "",
            "\1\44\3\uffff\1\13\2\uffff\1\43\4\42\17\uffff\1\44\17\uffff"+
            "\1\13\5\uffff\5\13\u008d\uffff\2\44",
            "",
            "\22\13\2\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\57"+
            "\1\60\1\61\1\56\1\62\1\63\1\64\1\65\1\66\1\67\2\uffff\7\16\16"+
            "\uffff\5\45\115\uffff\2\16",
            "\22\13\2\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\57"+
            "\1\60\1\61\1\56\1\62\1\63\1\64\1\65\1\66\1\67\2\uffff\7\16\140"+
            "\uffff\2\16",
            "",
            "\4\5\1\uffff\7\5\27\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\16\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\27\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\16\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\27\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\16\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\27\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\16\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\27\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\16\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\27\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\16\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\27\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\16\31\uffff\1\5\4\uffff\61\5",
            "\1\70\1\71\1\72",
            "\1\30\1\31\1\32",
            "\4\5\1\uffff\7\5\27\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\16\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\27\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\16\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\27\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\16\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\27\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\16\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\27\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\16\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\27\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\16\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\27\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\16\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\27\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\16\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\27\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\16\31\uffff\1\5\4\uffff\61\5",
            "\2\6\3\uffff\2\13",
            "\5\44\16\uffff\1\44\33\uffff\22\13\2\uffff\22\13\44\uffff\1"+
            "\44\5\uffff\3\44\43\uffff\1\44\15\uffff\4\44\1\uffff\6\44",
            "\5\44\16\uffff\1\44\33\uffff\22\13\2\uffff\22\13\44\uffff\1"+
            "\44\5\uffff\3\44\61\uffff\4\44\1\uffff\6\44",
            "",
            "",
            "\4\13\1\uffff\7\13\27\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\16\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\27\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\16\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\27\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\16\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\27\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\16\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\27\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\16\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\27\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\16\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\27\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\16\31\uffff\1\13\4\uffff\61\13",
            "\1\73\1\74\1\75",
            "\1\57\1\60\1\61",
            "\4\13\1\uffff\7\13\27\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\16\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\27\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\16\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\27\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\16\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\27\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\16\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\27\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\16\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\27\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\16\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\27\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\16\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\27\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\16\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\27\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\16\31\uffff\1\13\4\uffff\61\13",
            "\4\5\1\uffff\7\5\27\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\16\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\27\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\16\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\27\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\16\31\uffff\1\5\4\uffff\61\5",
            "\4\13\1\uffff\7\13\27\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\16\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\27\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\16\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\27\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\16\31\uffff\1\13\4\uffff\61\13"
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
            return "168:1: flyCommandValue : ( time | direction | speed | distance | pitch | roll | duration | To waypoint ( ( 'and' | ',' ( 'and' )? ) waypoint )* -> ( waypoint )+ | altitude );";
        }
    }
    static final String DFA31_eotS =
        "\151\uffff";
    static final String DFA31_eofS =
        "\43\uffff\7\10\2\uffff\11\10\3\uffff\7\10\2\uffff\14\10\1\5\3\10"+
        "\2\uffff\7\10\2\uffff\11\10\1\5\3\10";
    static final String DFA31_minS =
        "\1\113\1\112\2\u0094\2\uffff\1\116\2\uffff\2\121\2\uffff\7\u0093"+
        "\2\u009c\11\u0093\1\121\2\u0080\1\uffff\7\112\2\u009c\11\112\3\u0093"+
        "\7\112\2\u009c\20\112\2\u0094\7\112\2\u009c\15\112";
    static final String DFA31_maxS =
        "\1\u0103\1\u010e\2\u0110\2\uffff\1\u0093\2\uffff\2\u0110\2\uffff"+
        "\7\u00b0\2\u009e\11\u00b0\1\u0093\2\u00a5\1\uffff\7\u0103\2\u009e"+
        "\11\u0103\3\u00b0\7\u0103\2\u009e\20\u0103\2\u0110\7\u0103\2\u009e"+
        "\15\u0103";
    static final String DFA31_acceptS =
        "\4\uffff\1\3\1\4\1\uffff\1\5\1\7\2\uffff\1\2\1\6\25\uffff\1\1\106"+
        "\uffff";
    static final String DFA31_specialS =
        "\151\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\10\1\1\1\6\1\uffff\1\4\1\uffff\1\3\4\2\47\uffff\1\5\24\uffff"+
            "\2\5\73\uffff\1\7\37\uffff\13\10\6\uffff\4\4",
            "\1\14\3\uffff\1\10\2\uffff\1\12\4\11\17\uffff\1\14\17\uffff"+
            "\1\10\5\uffff\5\10\63\uffff\6\13\124\uffff\2\14",
            "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\26\1\27\1\30\1\25"+
            "\1\31\1\32\1\33\1\34\1\35\1\36\2\uffff\7\13\140\uffff\2\13",
            "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\26\1\27\1\30\1\25"+
            "\1\31\1\32\1\33\1\34\1\35\1\36\2\uffff\7\13\140\uffff\2\13",
            "",
            "",
            "\1\10\2\uffff\1\41\4\40\37\uffff\1\10\5\uffff\2\10\1\37\2\10"+
            "\23\uffff\1\5",
            "",
            "",
            "\5\14\16\uffff\1\14\33\uffff\22\10\2\uffff\1\43\1\44\1\45\1"+
            "\46\1\47\1\50\1\51\1\52\1\54\1\55\1\56\1\53\1\57\1\60\1\61\1"+
            "\62\1\63\1\64\2\uffff\7\13\16\uffff\5\42\10\uffff\1\14\5\uffff"+
            "\3\14\43\uffff\1\14\15\uffff\4\14\1\uffff\6\14\2\13",
            "\5\14\16\uffff\1\14\33\uffff\22\10\2\uffff\1\43\1\44\1\45\1"+
            "\46\1\47\1\50\1\51\1\52\1\54\1\55\1\56\1\53\1\57\1\60\1\61\1"+
            "\62\1\63\1\64\2\uffff\7\13\33\uffff\1\14\5\uffff\3\14\61\uffff"+
            "\4\14\1\uffff\6\14\2\13",
            "",
            "",
            "\1\5\33\uffff\2\13",
            "\1\5\33\uffff\2\13",
            "\1\5\33\uffff\2\13",
            "\1\5\33\uffff\2\13",
            "\1\5\33\uffff\2\13",
            "\1\5\33\uffff\2\13",
            "\1\5\33\uffff\2\13",
            "\1\65\1\66\1\67",
            "\1\26\1\27\1\30",
            "\1\5\33\uffff\2\13",
            "\1\5\33\uffff\2\13",
            "\1\5\33\uffff\2\13",
            "\1\5\33\uffff\2\13",
            "\1\5\33\uffff\2\13",
            "\1\5\33\uffff\2\13",
            "\1\5\33\uffff\2\13",
            "\1\5\33\uffff\2\13",
            "\1\5\33\uffff\2\13",
            "\5\5\50\uffff\2\10\23\uffff\1\5",
            "\22\10\2\uffff\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\101"+
            "\1\102\1\103\1\100\1\104\1\105\1\106\1\107\1\110\1\111",
            "\22\10\2\uffff\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\101"+
            "\1\102\1\103\1\100\1\104\1\105\1\106\1\107\1\110\1\111",
            "",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\13\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\13\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\13\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\13\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\13\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\13\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\13\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\1\112\1\113\1\114",
            "\1\54\1\55\1\56",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\13\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\13\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\13\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\13\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\13\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\13\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\13\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\13\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\13\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\1\5\33\uffff\2\13",
            "\1\5\33\uffff\2\13",
            "\1\5\33\uffff\2\13",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\1\116\1\117\1\120",
            "\1\101\1\102\1\103",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\13\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\13\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\13\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\5\1\uffff\1\5\1\uffff\1\122\4\121\27\uffff\6\5\5\uffff\1"+
            "\10\4\uffff\1\5\24\uffff\2\5\73\uffff\1\5\37\uffff\13\5\6\uffff"+
            "\4\5",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\132\1\134\1\135"+
            "\1\136\1\133\1\137\1\140\1\141\1\142\1\143\1\144\2\uffff\7\5"+
            "\140\uffff\2\5",
            "\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\132\1\134\1\135"+
            "\1\136\1\133\1\137\1\140\1\141\1\142\1\143\1\144\2\uffff\7\5"+
            "\140\uffff\2\5",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\1\146\1\147\1\150",
            "\1\134\1\135\1\136",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\5\1\uffff\1\5\1\uffff\1\122\4\121\27\uffff\6\5\5\uffff\1"+
            "\10\4\uffff\1\5\24\uffff\2\5\73\uffff\1\5\37\uffff\13\5\6\uffff"+
            "\4\5",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10"
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "195:1: loiterCommandValue : ( time | speed | loiterDirection | radius | duration | At waypoint -> waypoint | altitude );";
        }
    }
    static final String DFA40_eotS =
        "\16\uffff";
    static final String DFA40_eofS =
        "\16\uffff";
    static final String DFA40_minS =
        "\14\113\2\uffff";
    static final String DFA40_maxS =
        "\1\u00f9\13\125\2\uffff";
    static final String DFA40_acceptS =
        "\14\uffff\1\1\1\2";
    static final String DFA40_specialS =
        "\16\uffff}>";
    static final String[] DFA40_transitionS = {
            "\3\14\u00a1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12"+
            "\1\13",
            "\1\14\2\uffff\1\15\2\uffff\5\15",
            "\1\14\2\uffff\1\15\2\uffff\5\15",
            "\1\14\2\uffff\1\15\2\uffff\5\15",
            "\1\14\2\uffff\1\15\2\uffff\5\15",
            "\1\14\2\uffff\1\15\2\uffff\5\15",
            "\1\14\2\uffff\1\15\2\uffff\5\15",
            "\1\14\2\uffff\1\15\2\uffff\5\15",
            "\1\14\2\uffff\1\15\2\uffff\5\15",
            "\1\14\2\uffff\1\15\2\uffff\5\15",
            "\1\14\2\uffff\1\15\2\uffff\5\15",
            "\1\14\2\uffff\1\15\2\uffff\5\15",
            "",
            ""
    };

    static final short[] DFA40_eot = DFA.unpackEncodedString(DFA40_eotS);
    static final short[] DFA40_eof = DFA.unpackEncodedString(DFA40_eofS);
    static final char[] DFA40_min = DFA.unpackEncodedStringToUnsignedChars(DFA40_minS);
    static final char[] DFA40_max = DFA.unpackEncodedStringToUnsignedChars(DFA40_maxS);
    static final short[] DFA40_accept = DFA.unpackEncodedString(DFA40_acceptS);
    static final short[] DFA40_special = DFA.unpackEncodedString(DFA40_specialS);
    static final short[][] DFA40_transition;

    static {
        int numStates = DFA40_transitionS.length;
        DFA40_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA40_transition[i] = DFA.unpackEncodedString(DFA40_transitionS[i]);
        }
    }

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = DFA40_eot;
            this.eof = DFA40_eof;
            this.min = DFA40_min;
            this.max = DFA40_max;
            this.accept = DFA40_accept;
            this.special = DFA40_special;
            this.transition = DFA40_transition;
        }
        public String getDescription() {
            return "229:1: altitude : ( fixedAltitude | relativeAltitude );";
        }
    }
    static final String DFA73_eotS =
        "\65\uffff";
    static final String DFA73_eofS =
        "\65\uffff";
    static final String DFA73_minS =
        "\1\121\2\u0094\7\u00a6\7\u00af\2\u009c\11\u00af\2\u00a6\2\uffff"+
        "\2\u00b3\3\u00af\2\uffff\16\u00a6";
    static final String DFA73_maxS =
        "\1\125\2\u0110\7\u00a7\7\u00b0\2\u009e\11\u00b0\2\u00a7\2\uffff"+
        "\2\u00ce\3\u00b0\2\uffff\16\u00a7";
    static final String DFA73_acceptS =
        "\36\uffff\1\1\1\2\5\uffff\1\4\1\3\16\uffff";
    static final String DFA73_specialS =
        "\65\uffff}>";
    static final String[] DFA73_transitionS = {
            "\1\2\4\1",
            "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\23\1\24\1\25\1\22"+
            "\1\26\1\27\1\30\1\31\1\32\1\33\2\uffff\1\3\1\4\1\5\1\6\1\7\1"+
            "\10\1\11\140\uffff\1\34\1\35",
            "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\23\1\24\1\25\1\22"+
            "\1\26\1\27\1\30\1\31\1\32\1\33\2\uffff\1\3\1\4\1\5\1\6\1\7\1"+
            "\10\1\11\140\uffff\1\34\1\35",
            "\1\36\1\37",
            "\1\36\1\37",
            "\1\36\1\37",
            "\1\36\1\37",
            "\1\36\1\37",
            "\1\36\1\37",
            "\1\36\1\37",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\42\1\43\1\44",
            "\1\23\1\24\1\25",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\46\1\45",
            "\1\46\1\45",
            "",
            "",
            "\1\54\16\uffff\1\47\1\50\1\51\1\52\1\53\1\55\1\56\1\57\1\60"+
            "\1\61\1\62\1\63\1\64",
            "\1\54\16\uffff\1\47\1\50\1\51\1\52\1\53\1\55\1\56\1\57\1\60"+
            "\1\61\1\62\1\63\1\64",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "",
            "",
            "\1\36\1\37",
            "\1\36\1\37",
            "\1\36\1\37",
            "\1\36\1\37",
            "\1\36\1\37",
            "\1\36\1\37",
            "\1\36\1\37",
            "\1\36\1\37",
            "\1\36\1\37",
            "\1\36\1\37",
            "\1\36\1\37",
            "\1\36\1\37",
            "\1\36\1\37",
            "\1\36\1\37"
    };

    static final short[] DFA73_eot = DFA.unpackEncodedString(DFA73_eotS);
    static final short[] DFA73_eof = DFA.unpackEncodedString(DFA73_eofS);
    static final char[] DFA73_min = DFA.unpackEncodedStringToUnsignedChars(DFA73_minS);
    static final char[] DFA73_max = DFA.unpackEncodedStringToUnsignedChars(DFA73_maxS);
    static final short[] DFA73_accept = DFA.unpackEncodedString(DFA73_acceptS);
    static final short[] DFA73_special = DFA.unpackEncodedString(DFA73_specialS);
    static final short[][] DFA73_transition;

    static {
        int numStates = DFA73_transitionS.length;
        DFA73_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA73_transition[i] = DFA.unpackEncodedString(DFA73_transitionS[i]);
        }
    }

    class DFA73 extends DFA {

        public DFA73(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 73;
            this.eot = DFA73_eot;
            this.eof = DFA73_eof;
            this.min = DFA73_min;
            this.max = DFA73_max;
            this.accept = DFA73_accept;
            this.special = DFA73_special;
            this.transition = DFA73_transition;
        }
        public String getDescription() {
            return "317:1: relativeSpeed : ( speedValue 'faster' -> ^( SPEED RELATIVE FASTER speedValue ) | speedValue 'slower' -> ^( SPEED RELATIVE SLOWER speedValue ) | percentValue 'faster' -> ^( SPEED RELATIVE FASTER percentValue ) | percentValue 'slower' -> ^( SPEED RELATIVE SLOWER percentValue ) );";
        }
    }
    static final String DFA87_eotS =
        "\14\uffff";
    static final String DFA87_eofS =
        "\5\uffff\1\10\4\uffff\2\10";
    static final String DFA87_minS =
        "\1\122\1\u00bd\1\122\2\uffff\1\112\1\uffff\1\121\2\uffff\2\112";
    static final String DFA87_maxS =
        "\1\125\1\u00c1\1\125\2\uffff\1\u0103\1\uffff\1\125\2\uffff\2\u0103";
    static final String DFA87_acceptS =
        "\3\uffff\1\4\1\2\1\uffff\1\3\1\uffff\1\5\1\1\2\uffff";
    static final String DFA87_specialS =
        "\14\uffff}>";
    static final String[] DFA87_transitionS = {
            "\4\1",
            "\2\4\2\3\1\2",
            "\4\5",
            "",
            "",
            "\4\10\1\uffff\7\10\27\uffff\10\10\1\uffff\2\10\1\uffff\2\10"+
            "\2\uffff\1\10\24\uffff\2\10\51\uffff\2\11\2\6\1\7\10\uffff\1"+
            "\10\4\uffff\65\10",
            "",
            "\1\13\4\12",
            "",
            "",
            "\4\10\1\uffff\7\10\27\uffff\10\10\1\uffff\2\10\1\uffff\2\10"+
            "\2\uffff\1\10\24\uffff\2\10\51\uffff\2\11\2\6\11\uffff\1\10"+
            "\4\uffff\65\10",
            "\4\10\1\uffff\7\10\27\uffff\10\10\1\uffff\2\10\1\uffff\2\10"+
            "\2\uffff\1\10\24\uffff\2\10\51\uffff\2\11\2\6\11\uffff\1\10"+
            "\4\uffff\65\10"
    };

    static final short[] DFA87_eot = DFA.unpackEncodedString(DFA87_eotS);
    static final short[] DFA87_eof = DFA.unpackEncodedString(DFA87_eofS);
    static final char[] DFA87_min = DFA.unpackEncodedStringToUnsignedChars(DFA87_minS);
    static final char[] DFA87_max = DFA.unpackEncodedStringToUnsignedChars(DFA87_maxS);
    static final short[] DFA87_accept = DFA.unpackEncodedString(DFA87_acceptS);
    static final short[] DFA87_special = DFA.unpackEncodedString(DFA87_specialS);
    static final short[][] DFA87_transition;

    static {
        int numStates = DFA87_transitionS.length;
        DFA87_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA87_transition[i] = DFA.unpackEncodedString(DFA87_transitionS[i]);
        }
    }

    class DFA87 extends DFA {

        public DFA87(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 87;
            this.eot = DFA87_eot;
            this.eof = DFA87_eof;
            this.min = DFA87_min;
            this.max = DFA87_max;
            this.accept = DFA87_accept;
            this.special = DFA87_special;
            this.transition = DFA87_transition;
        }
        public String getDescription() {
            return "372:1: timeValue : ( timeFormat ( 'am' | 'a.m.' ) -> ^( TIME timeFormat AM ) | integerValue ( 'am' | 'a.m.' ) -> ^( TIME integerValue HOUR AM ) | timeFormat ( 'pm' | 'p.m.' ) -> ^( TIME timeFormat PM ) | integerValue ( 'pm' | 'p.m.' ) -> ^( TIME integerValue HOUR PM ) | timeFormat -> ^( TIME timeFormat HOUR24 ) );";
        }
    }
    static final String DFA94_eotS =
        "\32\uffff";
    static final String DFA94_eofS =
        "\3\uffff\11\2\5\uffff\4\25\5\uffff";
    static final String DFA94_minS =
        "\1\121\1\u00b3\1\uffff\11\112\1\uffff\4\u0094\4\112\2\uffff\2\u0094"+
        "\1\uffff";
    static final String DFA94_maxS =
        "\1\125\1\u00ce\1\uffff\11\u0103\1\uffff\4\u0110\4\u0103\2\uffff"+
        "\2\u0110\1\uffff";
    static final String DFA94_acceptS =
        "\2\uffff\1\1\11\uffff\1\5\10\uffff\1\2\1\4\2\uffff\1\3";
    static final String DFA94_specialS =
        "\32\uffff}>";
    static final String[] DFA94_transitionS = {
            "\1\2\4\1",
            "\1\10\15\uffff\1\14\1\3\1\4\1\5\1\6\1\7\1\11\1\12\1\13\5\2",
            "",
            "\4\2\1\uffff\2\2\1\16\4\15\27\uffff\10\2\1\uffff\2\2\1\uffff"+
            "\2\2\2\uffff\1\2\24\uffff\2\2\66\uffff\1\2\4\uffff\65\2",
            "\4\2\1\uffff\2\2\1\16\4\15\27\uffff\10\2\1\uffff\2\2\1\uffff"+
            "\2\2\2\uffff\1\2\24\uffff\2\2\66\uffff\1\2\4\uffff\65\2",
            "\4\2\1\uffff\2\2\1\16\4\15\27\uffff\10\2\1\uffff\2\2\1\uffff"+
            "\2\2\2\uffff\1\2\24\uffff\2\2\66\uffff\1\2\4\uffff\65\2",
            "\4\2\1\uffff\2\2\1\16\4\15\27\uffff\10\2\1\uffff\2\2\1\uffff"+
            "\2\2\2\uffff\1\2\24\uffff\2\2\66\uffff\1\2\4\uffff\65\2",
            "\4\2\1\uffff\2\2\1\16\4\15\27\uffff\10\2\1\uffff\2\2\1\uffff"+
            "\2\2\2\uffff\1\2\24\uffff\2\2\66\uffff\1\2\4\uffff\65\2",
            "\4\2\1\uffff\2\2\1\20\4\17\27\uffff\10\2\1\uffff\2\2\1\uffff"+
            "\2\2\2\uffff\1\2\24\uffff\2\2\66\uffff\1\2\4\uffff\65\2",
            "\4\2\1\uffff\2\2\1\20\4\17\27\uffff\10\2\1\uffff\2\2\1\uffff"+
            "\2\2\2\uffff\1\2\24\uffff\2\2\66\uffff\1\2\4\uffff\65\2",
            "\4\2\1\uffff\2\2\1\20\4\17\27\uffff\10\2\1\uffff\2\2\1\uffff"+
            "\2\2\2\uffff\1\2\24\uffff\2\2\66\uffff\1\2\4\uffff\65\2",
            "\4\2\1\uffff\2\2\1\20\4\17\27\uffff\10\2\1\uffff\2\2\1\uffff"+
            "\2\2\2\uffff\1\2\24\uffff\2\2\66\uffff\1\2\4\uffff\65\2",
            "",
            "\22\2\2\uffff\7\2\4\uffff\1\21\23\uffff\1\22\1\23\1\24\5\25"+
            "\100\uffff\2\2",
            "\22\2\2\uffff\7\2\4\uffff\1\25\23\uffff\10\25\100\uffff\2\2",
            "\22\2\2\uffff\7\2\33\uffff\5\26\100\uffff\2\2",
            "\22\2\2\uffff\7\2\33\uffff\5\26\100\uffff\2\2",
            "\4\25\1\uffff\2\25\1\30\4\27\27\uffff\10\25\1\uffff\2\25\1"+
            "\uffff\2\25\2\uffff\1\25\24\uffff\2\25\66\uffff\1\25\4\uffff"+
            "\65\25",
            "\4\25\1\uffff\2\25\1\30\4\27\27\uffff\10\25\1\uffff\2\25\1"+
            "\uffff\2\25\2\uffff\1\25\24\uffff\2\25\66\uffff\1\25\4\uffff"+
            "\65\25",
            "\4\25\1\uffff\2\25\1\30\4\27\27\uffff\10\25\1\uffff\2\25\1"+
            "\uffff\2\25\2\uffff\1\25\24\uffff\2\25\66\uffff\1\25\4\uffff"+
            "\65\25",
            "\4\25\1\uffff\2\25\1\30\4\27\27\uffff\10\25\1\uffff\2\25\1"+
            "\uffff\2\25\2\uffff\1\25\24\uffff\2\25\66\uffff\1\25\4\uffff"+
            "\65\25",
            "",
            "",
            "\22\25\2\uffff\7\25\33\uffff\5\31\100\uffff\2\25",
            "\22\25\2\uffff\7\25\33\uffff\5\31\100\uffff\2\25",
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
            return "417:1: durationValue : ( numericValue timeUnit | integerValue hour numericValue ( minute | second ) | integerValue hour integerValue minute numericValue second | integerValue minute numericValue second | timeFormat );";
        }
    }
    static final String DFA145_eotS =
        "\64\uffff";
    static final String DFA145_eofS =
        "\64\uffff";
    static final String DFA145_minS =
        "\6\121\1\uffff\4\121\2\uffff\11\121\2\u0108\17\121\2\uffff\5\121"+
        "\4\u0108\2\121";
    static final String DFA145_maxS =
        "\3\u010e\2\125\1\u010e\1\uffff\4\u010e\2\uffff\1\125\10\u010e\2"+
        "\u0108\4\u010e\1\125\4\u010e\1\125\5\u010e\2\uffff\5\u010e\4\u0108"+
        "\2\u010e";
    static final String DFA145_acceptS =
        "\6\uffff\1\2\4\uffff\1\4\1\1\32\uffff\1\3\1\5\13\uffff";
    static final String DFA145_specialS =
        "\64\uffff}>";
    static final String[] DFA145_transitionS = {
            "\1\2\4\1\u00b7\uffff\1\3\1\4",
            "\5\6\16\uffff\1\5\145\uffff\1\14\5\uffff\3\14\43\uffff\1\15"+
            "\15\uffff\1\7\1\10\1\11\1\12\1\uffff\1\16\1\17\1\20\1\21\1\6"+
            "\1\13",
            "\5\6\16\uffff\1\5\145\uffff\1\14\5\uffff\3\14\61\uffff\1\7"+
            "\1\10\1\11\1\12\1\uffff\1\16\1\17\1\20\1\21\1\6\1\13",
            "\1\23\4\22",
            "\1\25\4\24",
            "\5\6\u00b7\uffff\1\6\1\13",
            "",
            "\5\6\16\uffff\1\5\145\uffff\1\14\5\uffff\3\14\72\uffff\1\6"+
            "\1\13",
            "\5\6\16\uffff\1\5\145\uffff\1\14\5\uffff\3\14\72\uffff\1\6"+
            "\1\13",
            "\5\6\16\uffff\1\5\145\uffff\1\14\5\uffff\3\14\72\uffff\1\6"+
            "\1\13",
            "\5\6\16\uffff\1\5\145\uffff\1\14\5\uffff\3\14\72\uffff\1\6"+
            "\1\13",
            "",
            "",
            "\1\27\4\26",
            "\5\6\16\uffff\1\5\145\uffff\1\14\5\uffff\3\14\72\uffff\1\6"+
            "\1\13",
            "\5\6\16\uffff\1\5\145\uffff\1\14\5\uffff\3\14\72\uffff\1\6"+
            "\1\13",
            "\5\6\16\uffff\1\5\145\uffff\1\14\5\uffff\3\14\72\uffff\1\6"+
            "\1\13",
            "\5\6\16\uffff\1\5\145\uffff\1\14\5\uffff\3\14\72\uffff\1\6"+
            "\1\13",
            "\5\6\16\uffff\1\5\u0091\uffff\1\34\15\uffff\1\30\1\31\1\32"+
            "\1\33\1\uffff\1\35\1\36\1\37\1\40\1\6\1\13",
            "\5\6\16\uffff\1\5\u009f\uffff\1\30\1\31\1\32\1\33\1\uffff\1"+
            "\35\1\36\1\37\1\40\1\6\1\13",
            "\5\47\16\uffff\1\46\u0091\uffff\1\41\15\uffff\1\51\1\52\1\53"+
            "\1\54\1\uffff\1\42\1\43\1\44\1\45\1\47\1\50",
            "\5\47\16\uffff\1\46\u009f\uffff\1\51\1\52\1\53\1\54\1\uffff"+
            "\1\42\1\43\1\44\1\45\1\47\1\50",
            "\1\55",
            "\1\55",
            "\5\6\16\uffff\1\5\u00a8\uffff\1\6\1\13",
            "\5\6\16\uffff\1\5\u00a8\uffff\1\6\1\13",
            "\5\6\16\uffff\1\5\u00a8\uffff\1\6\1\13",
            "\5\6\16\uffff\1\5\u00a8\uffff\1\6\1\13",
            "\1\57\4\56",
            "\5\6\16\uffff\1\5\u00a8\uffff\1\6\1\13",
            "\5\6\16\uffff\1\5\u00a8\uffff\1\6\1\13",
            "\5\6\16\uffff\1\5\u00a8\uffff\1\6\1\13",
            "\5\6\16\uffff\1\5\u00a8\uffff\1\6\1\13",
            "\1\61\4\60",
            "\5\47\16\uffff\1\46\u00a8\uffff\1\47\1\50",
            "\5\47\16\uffff\1\46\u00a8\uffff\1\47\1\50",
            "\5\47\16\uffff\1\46\u00a8\uffff\1\47\1\50",
            "\5\47\16\uffff\1\46\u00a8\uffff\1\47\1\50",
            "\5\47\u00b7\uffff\1\47\1\50",
            "",
            "",
            "\5\47\16\uffff\1\46\u00a8\uffff\1\47\1\50",
            "\5\47\16\uffff\1\46\u00a8\uffff\1\47\1\50",
            "\5\47\16\uffff\1\46\u00a8\uffff\1\47\1\50",
            "\5\47\16\uffff\1\46\u00a8\uffff\1\47\1\50",
            "\5\6\16\uffff\1\5\145\uffff\1\14\5\uffff\3\14\72\uffff\1\6"+
            "\1\13",
            "\1\62",
            "\1\62",
            "\1\63",
            "\1\63",
            "\5\6\16\uffff\1\5\u00a8\uffff\1\6\1\13",
            "\5\47\16\uffff\1\46\u00a8\uffff\1\47\1\50"
    };

    static final short[] DFA145_eot = DFA.unpackEncodedString(DFA145_eotS);
    static final short[] DFA145_eof = DFA.unpackEncodedString(DFA145_eofS);
    static final char[] DFA145_min = DFA.unpackEncodedStringToUnsignedChars(DFA145_minS);
    static final char[] DFA145_max = DFA.unpackEncodedStringToUnsignedChars(DFA145_maxS);
    static final short[] DFA145_accept = DFA.unpackEncodedString(DFA145_acceptS);
    static final short[] DFA145_special = DFA.unpackEncodedString(DFA145_specialS);
    static final short[][] DFA145_transition;

    static {
        int numStates = DFA145_transitionS.length;
        DFA145_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA145_transition[i] = DFA.unpackEncodedString(DFA145_transitionS[i]);
        }
    }

    class DFA145 extends DFA {

        public DFA145(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 145;
            this.eot = DFA145_eot;
            this.eof = DFA145_eof;
            this.min = DFA145_min;
            this.max = DFA145_max;
            this.accept = DFA145_accept;
            this.special = DFA145_special;
            this.transition = DFA145_transition;
        }
        public String getDescription() {
            return "549:1: latitudeLongitude : (x= latitudeLongitudeValue northSouthDirection ( ',' )? y= latitudeLongitudeValue eastWestDirection -> ^( LATITUDE $x northSouthDirection ) ^( LONGITUDE $y eastWestDirection ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y EAST ) | '-' x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y EAST ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y WEST ) | '-' x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y WEST ) );";
        }
    }
    static final String DFA151_eotS =
        "\70\uffff";
    static final String DFA151_eofS =
        "\70\uffff";
    static final String DFA151_minS =
        "\1\145\3\121\4\u0094\7\144\2\u009c\20\144\2\u009c\11\144\1\121\3"+
        "\144\1\121\3\144\4\uffff";
    static final String DFA151_maxS =
        "\1\145\1\u010e\2\125\4\u00a5\7\144\2\u009e\20\144\2\u009e\11\144"+
        "\1\u010e\3\144\1\u010e\3\144\4\uffff";
    static final String DFA151_acceptS =
        "\64\uffff\1\3\1\1\1\4\1\2";
    static final String DFA151_specialS =
        "\70\uffff}>";
    static final String[] DFA151_transitionS = {
            "\1\1",
            "\1\5\4\4\u00b7\uffff\1\3\1\2",
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
            "\5\65\u00b7\uffff\1\65\1\64",
            "\1\54",
            "\1\54",
            "\1\54",
            "\5\67\u00b7\uffff\1\67\1\66",
            "\1\60",
            "\1\60",
            "\1\60",
            "",
            "",
            "",
            ""
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
            return "568:1: distanceCoordinate : ( '(' ( '+' )? x= distanceValue ',' ( '+' )? y= distanceValue ')' -> ^( DISTANCE $y NORTH ) ^( DISTANCE $x EAST ) | '(' '-' x= distanceValue ',' ( '+' )? y= distanceValue ')' -> ^( DISTANCE $y NORTH ) ^( DISTANCE $x WEST ) | '(' ( '+' )? x= distanceValue ',' '-' y= distanceValue ')' -> ^( DISTANCE $y SOUTH ) ^( DISTANCE $x EAST ) | '(' '-' x= distanceValue ',' '-' y= distanceValue ')' -> ^( DISTANCE $y SOUTH ) ^( DISTANCE $x WEST ) );";
        }
    }
 

    public static final BitSet FOLLOW_define_in_flightPlan401 = new BitSet(new long[]{0x0000000000000002L,0x0007FF8380000400L});
    public static final BitSet FOLLOW_command_in_flightPlan404 = new BitSet(new long[]{0x0000000000000002L,0x0007E00000000400L});
    public static final BitSet FOLLOW_defineCommand_in_define431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defineSensor_in_define436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defineWaypoint_in_define441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_defineCommand453 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_96_in_defineCommand455 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_97_in_defineCommand457 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_defineCommandValue_in_defineCommand460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_defineCommandValue476 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_defineCommandValue478 = new BitSet(new long[]{0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue480 = new BitSet(new long[]{0x0000000000000002L,0x0000001800000400L});
    public static final BitSet FOLLOW_99_in_defineCommandValue484 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_100_in_defineCommandValue486 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000400L});
    public static final BitSet FOLLOW_99_in_defineCommandValue488 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_Identifier_in_defineCommandValue493 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_defineCommandValue495 = new BitSet(new long[]{0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue497 = new BitSet(new long[]{0x0000000000000002L,0x0000001800000400L});
    public static final BitSet FOLLOW_Identifier_in_defineCommandValue520 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_defineCommandValue522 = new BitSet(new long[]{0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue526 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_defineCommandValue528 = new BitSet(new long[]{0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue532 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_defineCommandValue534 = new BitSet(new long[]{0x0000000000000002L,0x0000001800000400L});
    public static final BitSet FOLLOW_99_in_defineCommandValue538 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_100_in_defineCommandValue540 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000400L});
    public static final BitSet FOLLOW_99_in_defineCommandValue542 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_Identifier_in_defineCommandValue547 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_defineCommandValue549 = new BitSet(new long[]{0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue553 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_defineCommandValue555 = new BitSet(new long[]{0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue559 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_defineCommandValue561 = new BitSet(new long[]{0x0000000000000002L,0x0000001800000400L});
    public static final BitSet FOLLOW_103_in_defineSensor597 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_104_in_defineSensor599 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_105_in_defineSensor601 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_defineSensorValue_in_defineSensor604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_defineSensorValue620 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_defineSensorValue622 = new BitSet(new long[]{0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_integerValue_in_defineSensorValue626 = new BitSet(new long[]{0x0000000000000002L,0x0000001800000400L});
    public static final BitSet FOLLOW_99_in_defineSensorValue630 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_100_in_defineSensorValue632 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000400L});
    public static final BitSet FOLLOW_99_in_defineSensorValue634 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_Identifier_in_defineSensorValue639 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_defineSensorValue641 = new BitSet(new long[]{0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_integerValue_in_defineSensorValue645 = new BitSet(new long[]{0x0000000000000002L,0x0000001800000400L});
    public static final BitSet FOLLOW_106_in_defineWaypoint676 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_107_in_defineWaypoint678 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_108_in_defineWaypoint680 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_defineWaypointValue_in_defineWaypoint683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_defineWaypointValue699 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_defineWaypointValue701 = new BitSet(new long[]{0x0000000000000000L,0x00000020003E0000L,0x0000000000000000L,0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_geoCoordinate_in_defineWaypointValue703 = new BitSet(new long[]{0x0000000000000002L,0x0000001800000400L});
    public static final BitSet FOLLOW_99_in_defineWaypointValue707 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_100_in_defineWaypointValue709 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000400L});
    public static final BitSet FOLLOW_99_in_defineWaypointValue711 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_Identifier_in_defineWaypointValue716 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_defineWaypointValue718 = new BitSet(new long[]{0x0000000000000000L,0x00000020003E0000L,0x0000000000000000L,0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_geoCoordinate_in_defineWaypointValue720 = new BitSet(new long[]{0x0000000000000002L,0x0000001800000400L});
    public static final BitSet FOLLOW_flyCommand_in_command747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_turnCommand_in_command752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loiterCommand_in_command757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_executeCommand_in_command762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_flyCommand774 = new BitSet(new long[]{0x0000000000000002L,0x06D80000003FB800L,0x0000000000000000L,0xFFFFFFFFFFFF8400L});
    public static final BitSet FOLLOW_110_in_flyCommand776 = new BitSet(new long[]{0x0000000000000002L,0x06D80000003FB800L,0x0000000000000000L,0xFFFFFFFFFFFF8400L});
    public static final BitSet FOLLOW_flyCommandValue_in_flyCommand779 = new BitSet(new long[]{0x0000000000000002L,0x06D80000003FB800L,0x0000000000000000L,0xFFFFFFFFFFFF8400L});
    public static final BitSet FOLLOW_time_in_flyCommandValue801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_direction_in_flyCommandValue806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speed_in_flyCommandValue811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_distance_in_flyCommandValue816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pitch_in_flyCommandValue821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_roll_in_flyCommandValue826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_duration_in_flyCommandValue831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_To_in_flyCommandValue836 = new BitSet(new long[]{0x0000000000000000L,0x00000020003E0400L,0x0000000000000000L,0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_waypoint_in_flyCommandValue838 = new BitSet(new long[]{0x0000000000000002L,0x0000001800000000L});
    public static final BitSet FOLLOW_99_in_flyCommandValue842 = new BitSet(new long[]{0x0000000000000000L,0x00000020003E0400L,0x0000000000000000L,0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_100_in_flyCommandValue844 = new BitSet(new long[]{0x0000000000000000L,0x00000028003E0400L,0x0000000000000000L,0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_99_in_flyCommandValue846 = new BitSet(new long[]{0x0000000000000000L,0x00000020003E0400L,0x0000000000000000L,0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_waypoint_in_flyCommandValue850 = new BitSet(new long[]{0x0000000000000002L,0x0000001800000000L});
    public static final BitSet FOLLOW_altitude_in_flyCommandValue863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_turnCommand875 = new BitSet(new long[]{0x0000000000000002L,0x0000000000018000L,0x0000000000000000L,0x00007FFFFFFF0400L});
    public static final BitSet FOLLOW_112_in_turnCommand877 = new BitSet(new long[]{0x0000000000000002L,0x0000000000018000L,0x0000000000000000L,0x00007FFFFFFF0400L});
    public static final BitSet FOLLOW_turnCommandValue_in_turnCommand880 = new BitSet(new long[]{0x0000000000000002L,0x0000000000018000L,0x0000000000000000L,0x00007FFFFFFF0400L});
    public static final BitSet FOLLOW_direction_in_turnCommandValue902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_loiterCommand914 = new BitSet(new long[]{0x0000000000000002L,0x26D80000003FB800L,0x00000000000C0000L,0xFFFFFFFFFFFF8400L,0x000000000000000FL});
    public static final BitSet FOLLOW_114_in_loiterCommand916 = new BitSet(new long[]{0x0000000000000002L,0x26D80000003FB800L,0x00000000000C0000L,0xFFFFFFFFFFFF8400L,0x000000000000000FL});
    public static final BitSet FOLLOW_loiterCommandValue_in_loiterCommand919 = new BitSet(new long[]{0x0000000000000002L,0x26D80000003FB800L,0x00000000000C0000L,0xFFFFFFFFFFFF8400L,0x000000000000000FL});
    public static final BitSet FOLLOW_time_in_loiterCommandValue941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speed_in_loiterCommandValue946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loiterDirection_in_loiterCommandValue951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_radius_in_loiterCommandValue956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_duration_in_loiterCommandValue961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_At_in_loiterCommandValue966 = new BitSet(new long[]{0x0000000000000000L,0x00000020003E0400L,0x0000000000000000L,0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_waypoint_in_loiterCommandValue968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_altitude_in_loiterCommandValue978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_executeCommand989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_executeCommand1003 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_executeCommand1005 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_numericValue_in_executeCommand1007 = new BitSet(new long[]{0x0000000000000000L,0x0000005000000000L});
    public static final BitSet FOLLOW_100_in_executeCommand1010 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_numericValue_in_executeCommand1012 = new BitSet(new long[]{0x0000000000000000L,0x0000005000000000L});
    public static final BitSet FOLLOW_102_in_executeCommand1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_pitch1047 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_116_in_pitch1049 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_angularValue_in_pitch1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_With_in_pitch1067 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_pitch1069 = new BitSet(new long[]{0x0000000000000000L,0x00C0000000000000L});
    public static final BitSet FOLLOW_118_in_pitch1074 = new BitSet(new long[]{0x0000000000000000L,0x01000000003E0000L});
    public static final BitSet FOLLOW_119_in_pitch1076 = new BitSet(new long[]{0x0000000000000000L,0x01000000003E0000L});
    public static final BitSet FOLLOW_120_in_pitch1079 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_angularValue_in_pitch1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_roll1103 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_122_in_roll1105 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_angularValue_in_roll1108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fixedAltitude_in_altitude1130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relativeAltitude_in_altitude1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_upDownDirection_in_fixedAltitude1147 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_To_in_fixedAltitude1150 = new BitSet(new long[]{0x0000000000000000L,0xF8200000003E4000L,0x0000000000000000L,0xFC00000000000000L});
    public static final BitSet FOLLOW_At_in_fixedAltitude1152 = new BitSet(new long[]{0x0000000000000000L,0xF8200000003E4000L,0x0000000000000000L,0xFC00000000000000L});
    public static final BitSet FOLLOW_With_in_fixedAltitude1154 = new BitSet(new long[]{0x0000000000000000L,0xF8200000003E4000L,0x0000000000000000L,0xFC00000000000000L});
    public static final BitSet FOLLOW_117_in_fixedAltitude1159 = new BitSet(new long[]{0x0000000000000000L,0x1800000000000000L});
    public static final BitSet FOLLOW_123_in_fixedAltitude1163 = new BitSet(new long[]{0x0000000000000000L,0xF9200000003E4000L,0x0000000000000000L,0xFC00000000000000L});
    public static final BitSet FOLLOW_124_in_fixedAltitude1165 = new BitSet(new long[]{0x0000000000000000L,0xF9200000003E4000L,0x0000000000000000L,0xFC00000000000000L});
    public static final BitSet FOLLOW_125_in_fixedAltitude1168 = new BitSet(new long[]{0x0000000000000000L,0xC000000000000000L});
    public static final BitSet FOLLOW_126_in_fixedAltitude1172 = new BitSet(new long[]{0x0000000000000000L,0xF9200000003E4000L,0x0000000000000000L,0xFC00000000000000L});
    public static final BitSet FOLLOW_127_in_fixedAltitude1174 = new BitSet(new long[]{0x0000000000000000L,0xF9200000003E4000L,0x0000000000000000L,0xFC00000000000000L});
    public static final BitSet FOLLOW_120_in_fixedAltitude1178 = new BitSet(new long[]{0x0000000000000000L,0xF8200000003E4000L,0x0000000000000000L,0xFC00000000000000L});
    public static final BitSet FOLLOW_altitudeValue_in_fixedAltitude1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_upDownDirection_in_relativeAltitude1205 = new BitSet(new long[]{0x0000000000000000L,0xF8200000003E4000L,0x0000000000000000L,0xFC00000000000000L});
    public static final BitSet FOLLOW_altitudeValue_in_relativeAltitude1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_distanceValue_in_altitudeValue1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pressureValue_in_altitudeValue1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FlightLevel_in_altitudeValue1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_pressureValue1273 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_pressureUnit_in_pressureValue1275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_pressureUnit1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_pressureUnit1289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_pressureUnit1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_pressureUnit1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_pressureUnit1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_pressureUnit1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_pressureUnit1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_pressureUnit1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_pressureUnit1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_pressureUnit1335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_pressureUnit1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_pressureUnit1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_pressureUnit1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_141_in_pressureUnit1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_pressureUnit1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_143_in_pressureUnit1367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_144_in_pressureUnit1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_145_in_pressureUnit1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_radius1391 = new BitSet(new long[]{0x0000000000000000L,0x20000000003E0000L,0x0000000000080000L,0xFC00000000000000L});
    public static final BitSet FOLLOW_With_in_radius1393 = new BitSet(new long[]{0x0000000000000000L,0x20000000003E0000L,0x0000000000080000L,0xFC00000000000000L});
    public static final BitSet FOLLOW_125_in_radius1397 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L,0x0000000000080000L,0xFC00000000000000L});
    public static final BitSet FOLLOW_147_in_radius1401 = new BitSet(new long[]{0x0000000000000000L,0x01000000003E0000L,0x0000000000000000L,0xFC00000000000000L});
    public static final BitSet FOLLOW_120_in_radius1403 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L,0x0000000000000000L,0xFC00000000000000L});
    public static final BitSet FOLLOW_distanceValue_in_radius1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_distanceValue_in_radius1408 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_147_in_radius1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_leftRightDirection_in_distance1431 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L,0x0000000000000000L,0xFC00000000000000L});
    public static final BitSet FOLLOW_distanceValue_in_distance1434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_distanceValue1457 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000003FFFF00000L});
    public static final BitSet FOLLOW_distanceUnit_in_distanceValue1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_148_in_distanceUnit1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_149_in_distanceUnit1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_150_in_distanceUnit1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_151_in_distanceUnit1487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_152_in_distanceUnit1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_distanceUnit1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_154_in_distanceUnit1503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_155_in_distanceUnit1505 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000070000000L});
    public static final BitSet FOLLOW_156_in_distanceUnit1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_157_in_distanceUnit1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_158_in_distanceUnit1512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_159_in_distanceUnit1527 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000070000000L});
    public static final BitSet FOLLOW_156_in_distanceUnit1532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_157_in_distanceUnit1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_158_in_distanceUnit1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_160_in_distanceUnit1548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_161_in_distanceUnit1550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_162_in_distanceUnit1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_163_in_distanceUnit1564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_164_in_distanceUnit1566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_165_in_distanceUnit1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fixedSpeed_in_speed1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relativeSpeed_in_speed1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_optimalSpeed_in_speed1597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_throttleSpeed_in_speed1602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_At_in_fixedSpeed1613 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_speedValue_in_fixedSpeed1615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speedValue_in_relativeSpeed1637 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_166_in_relativeSpeed1639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speedValue_in_relativeSpeed1657 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_167_in_relativeSpeed1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_percentValue_in_relativeSpeed1677 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_166_in_relativeSpeed1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_percentValue_in_relativeSpeed1697 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_167_in_relativeSpeed1699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_speedValue1723 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00007F3FFFF00000L});
    public static final BitSet FOLLOW_speedUnit_in_speedValue1725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_168_in_speedUnit1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_169_in_speedUnit1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_170_in_speedUnit1761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_171_in_speedUnit1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_172_in_speedUnit1765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_173_in_speedUnit1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_174_in_speedUnit1769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_distanceUnit_in_speedUnit1784 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0001800000000000L});
    public static final BitSet FOLLOW_175_in_speedUnit1787 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L,0x0000000000007FFCL});
    public static final BitSet FOLLOW_176_in_speedUnit1789 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L,0x0000000000007FFCL});
    public static final BitSet FOLLOW_timeUnit_in_speedUnit1792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_At_in_optimalSpeed1810 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x01F8000000000000L});
    public static final BitSet FOLLOW_optimalUnit_in_optimalSpeed1812 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0006000000000000L});
    public static final BitSet FOLLOW_177_in_optimalSpeed1815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_178_in_optimalSpeed1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_179_in_optimalUnit1841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_180_in_optimalUnit1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_181_in_optimalUnit1855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_182_in_optimalUnit1857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_183_in_optimalUnit1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_184_in_optimalUnit1871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_At_in_throttleSpeed1888 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_throttleValue_in_throttleSpeed1890 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1E00000000000000L});
    public static final BitSet FOLLOW_185_in_throttleSpeed1893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_186_in_throttleSpeed1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_187_in_throttleSpeed1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_188_in_throttleSpeed1899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_percentValue_in_throttleValue1922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_At_in_time1935 = new BitSet(new long[]{0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_timeValue_in_time1937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeFormat_in_timeValue1948 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x6000000000000000L});
    public static final BitSet FOLLOW_189_in_timeValue1951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_190_in_timeValue1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_timeValue1970 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x6000000000000000L});
    public static final BitSet FOLLOW_189_in_timeValue1973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_190_in_timeValue1975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeFormat_in_timeValue1994 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_191_in_timeValue1997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_192_in_timeValue1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_timeValue2016 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_191_in_timeValue2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_192_in_timeValue2021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeFormat_in_timeValue2040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_timeFormat2064 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_193_in_timeFormat2066 = new BitSet(new long[]{0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_integerValue_in_timeFormat2070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_timeFormat2090 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_193_in_timeFormat2092 = new BitSet(new long[]{0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_integerValue_in_timeFormat2096 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_193_in_timeFormat2098 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_numericValue_in_timeFormat2102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hour_in_timeUnit2130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_minute_in_timeUnit2135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_second_in_timeUnit2140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_194_in_hour2152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_195_in_hour2154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_196_in_hour2156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_197_in_hour2158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_198_in_hour2160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_179_in_minute2178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_199_in_minute2180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_200_in_minute2182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_201_in_minute2184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_202_in_second2202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_203_in_second2204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_204_in_second2206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_205_in_second2208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_206_in_second2210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_207_in_duration2227 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_durationValue_in_duration2229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_durationValue2249 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L,0x0000000000007FFCL});
    public static final BitSet FOLLOW_timeUnit_in_durationValue2251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_durationValue2256 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000000000007CL});
    public static final BitSet FOLLOW_hour_in_durationValue2258 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_numericValue_in_durationValue2260 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L,0x0000000000007FFCL});
    public static final BitSet FOLLOW_minute_in_durationValue2263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_second_in_durationValue2265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_durationValue2271 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000000000007CL});
    public static final BitSet FOLLOW_hour_in_durationValue2273 = new BitSet(new long[]{0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_integerValue_in_durationValue2275 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L,0x0000000000000380L});
    public static final BitSet FOLLOW_minute_in_durationValue2277 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_numericValue_in_durationValue2279 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L,0x0000000000007FFCL});
    public static final BitSet FOLLOW_second_in_durationValue2281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_durationValue2286 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L,0x0000000000000380L});
    public static final BitSet FOLLOW_minute_in_durationValue2288 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_numericValue_in_durationValue2290 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L,0x0000000000007FFCL});
    public static final BitSet FOLLOW_second_in_durationValue2292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeFormat_in_durationValue2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fixedDirection_in_direction2310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relativeDirection_in_direction2326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cardinalDirection_in_fixedDirection2348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ordinalDirection_in_fixedDirection2358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subOrdinalDirection_in_fixedDirection2368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Turning_in_fixedDirection2379 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L,0x0000000000000000L,0x00007FFFFFFF0400L});
    public static final BitSet FOLLOW_Heading_in_fixedDirection2381 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L,0x0000000000000000L,0x00007FFFFFFF0400L});
    public static final BitSet FOLLOW_cardinalDirection_in_fixedDirection2385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ordinalDirection_in_fixedDirection2387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subOrdinalDirection_in_fixedDirection2389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_angularValue_in_fixedDirection2391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Turning_in_relativeDirection2419 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0xFC00000000000000L});
    public static final BitSet FOLLOW_Heading_in_relativeDirection2421 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0xFC00000000000000L});
    public static final BitSet FOLLOW_leftRightDirection_in_relativeDirection2424 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_angularValue_in_relativeDirection2426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_northSouthDirection_in_cardinalDirection2444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eastWestDirection_in_cardinalDirection2449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_208_in_northSouthDirection2461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_209_in_northSouthDirection2463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_202_in_northSouthDirection2475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_210_in_northSouthDirection2477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_211_in_eastWestDirection2495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_212_in_eastWestDirection2497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_213_in_eastWestDirection2509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_214_in_eastWestDirection2511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_215_in_ordinalDirection2529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_216_in_ordinalDirection2531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_217_in_ordinalDirection2545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_218_in_ordinalDirection2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_219_in_ordinalDirection2561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_220_in_ordinalDirection2563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_221_in_ordinalDirection2577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_222_in_ordinalDirection2579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_223_in_subOrdinalDirection2599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_224_in_subOrdinalDirection2601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_225_in_subOrdinalDirection2617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_226_in_subOrdinalDirection2619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_227_in_subOrdinalDirection2635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_228_in_subOrdinalDirection2637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_229_in_subOrdinalDirection2653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_230_in_subOrdinalDirection2655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_231_in_subOrdinalDirection2671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_232_in_subOrdinalDirection2673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_233_in_subOrdinalDirection2689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_234_in_subOrdinalDirection2691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_235_in_subOrdinalDirection2707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_236_in_subOrdinalDirection2709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_237_in_subOrdinalDirection2725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_238_in_subOrdinalDirection2727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Turning_in_loiterDirection2748 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L,0x0000000000000000L,0x0000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_clockDirection_in_loiterDirection2751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_239_in_upDownDirection2774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_240_in_upDownDirection2776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_241_in_upDownDirection2778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_242_in_upDownDirection2780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_243_in_upDownDirection2782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_244_in_upDownDirection2784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_245_in_upDownDirection2786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_246_in_upDownDirection2798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_247_in_upDownDirection2800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_248_in_upDownDirection2802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_249_in_upDownDirection2804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_250_in_leftRightDirection2822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_251_in_leftRightDirection2824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_252_in_leftRightDirection2826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_253_in_leftRightDirection2838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_254_in_leftRightDirection2840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_255_in_leftRightDirection2842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_256_in_clockDirection2860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_257_in_clockDirection2862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_258_in_clockDirection2874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_259_in_clockDirection2876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_angularValue2893 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_260_in_angularValue2896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_261_in_angularValue2898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_262_in_angularValue2900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_263_in_angularValue2902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_angularValue2915 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_246_in_angularValue2917 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_numericValue_in_angularValue2919 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_264_in_angularValue2921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_angularValue2937 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001E00L});
    public static final BitSet FOLLOW_265_in_angularValue2940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_266_in_angularValue2942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_267_in_angularValue2944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_268_in_angularValue2946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_geoCoordinate_in_waypoint2967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_waypoint2972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_latitudeLongitude_in_geoCoordinate2992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_distanceCoordinate_in_geoCoordinate3006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3028 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000070400L});
    public static final BitSet FOLLOW_northSouthDirection_in_latitudeLongitude3030 = new BitSet(new long[]{0x0000000000000000L,0x00000010003E0000L});
    public static final BitSet FOLLOW_100_in_latitudeLongitude3032 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3037 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00000000007F0400L});
    public static final BitSet FOLLOW_eastWestDirection_in_latitudeLongitude3039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_269_in_latitudeLongitude3065 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3070 = new BitSet(new long[]{0x0000000000000000L,0x00000010003E0000L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_100_in_latitudeLongitude3072 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_269_in_latitudeLongitude3075 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_270_in_latitudeLongitude3106 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3110 = new BitSet(new long[]{0x0000000000000000L,0x00000010003E0000L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_100_in_latitudeLongitude3112 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_269_in_latitudeLongitude3115 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_269_in_latitudeLongitude3146 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3151 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_100_in_latitudeLongitude3153 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_270_in_latitudeLongitude3156 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_270_in_latitudeLongitude3186 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3190 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_100_in_latitudeLongitude3192 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_270_in_latitudeLongitude3195 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_latitudeLongitudeValue3231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_angularValue_in_latitudeLongitudeValue3243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_distanceCoordinate3254 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L,0x0000000000000000L,0xFC00000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_269_in_distanceCoordinate3256 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L,0x0000000000000000L,0xFC00000000000000L});
    public static final BitSet FOLLOW_distanceValue_in_distanceCoordinate3261 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_distanceCoordinate3263 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L,0x0000000000000000L,0xFC00000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_269_in_distanceCoordinate3265 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L,0x0000000000000000L,0xFC00000000000000L});
    public static final BitSet FOLLOW_distanceValue_in_distanceCoordinate3270 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_distanceCoordinate3272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_distanceCoordinate3298 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_270_in_distanceCoordinate3300 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L,0x0000000000000000L,0xFC00000000000000L});
    public static final BitSet FOLLOW_distanceValue_in_distanceCoordinate3304 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_distanceCoordinate3306 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L,0x0000000000000000L,0xFC00000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_269_in_distanceCoordinate3308 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L,0x0000000000000000L,0xFC00000000000000L});
    public static final BitSet FOLLOW_distanceValue_in_distanceCoordinate3313 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_distanceCoordinate3315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_distanceCoordinate3341 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L,0x0000000000000000L,0xFC00000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_269_in_distanceCoordinate3343 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L,0x0000000000000000L,0xFC00000000000000L});
    public static final BitSet FOLLOW_distanceValue_in_distanceCoordinate3348 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_distanceCoordinate3350 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_270_in_distanceCoordinate3352 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L,0x0000000000000000L,0xFC00000000000000L});
    public static final BitSet FOLLOW_distanceValue_in_distanceCoordinate3356 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_distanceCoordinate3358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_distanceCoordinate3384 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_270_in_distanceCoordinate3386 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L,0x0000000000000000L,0xFC00000000000000L});
    public static final BitSet FOLLOW_distanceValue_in_distanceCoordinate3390 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_distanceCoordinate3392 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_270_in_distanceCoordinate3394 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L,0x0000000000000000L,0xFC00000000000000L});
    public static final BitSet FOLLOW_distanceValue_in_distanceCoordinate3398 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_distanceCoordinate3400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_numericValue3434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FloatingPointLiteral_in_numericValue3439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_integerValue0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_percentValue3476 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_271_in_percentValue3479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_272_in_percentValue3481 = new BitSet(new long[]{0x0000000000000002L});

}