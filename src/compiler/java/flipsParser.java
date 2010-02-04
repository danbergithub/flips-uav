// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/reunice/Documents/flips-uav/src/compiler/flips.g 2010-02-03 23:33:44

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
            // elements: define, command
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:127:1: defineCommandValue : ( Identifier '=' cmd= integerValue ( ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue )* -> ( ^( DEFINE Identifier ^( COMMAND $cmd) ) )+ | Identifier '=' cmd= integerValue '(' par= integerValue ')' ( ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue '(' par= integerValue ')' )* -> ( ^( DEFINE Identifier ^( COMMAND $cmd PARAMETER $par) ) )+ );
    public final flipsParser.defineCommandValue_return defineCommandValue() throws RecognitionException {
        flipsParser.defineCommandValue_return retval = new flipsParser.defineCommandValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier10=null;
        Token char_literal11=null;
        Token string_literal12=null;
        Token char_literal13=null;
        Token string_literal14=null;
        Token Identifier15=null;
        Token char_literal16=null;
        Token Identifier17=null;
        Token char_literal18=null;
        Token char_literal19=null;
        Token char_literal20=null;
        Token string_literal21=null;
        Token char_literal22=null;
        Token string_literal23=null;
        Token Identifier24=null;
        Token char_literal25=null;
        Token char_literal26=null;
        Token char_literal27=null;
        flipsParser.integerValue_return cmd = null;

        flipsParser.integerValue_return par = null;


        CommonTree Identifier10_tree=null;
        CommonTree char_literal11_tree=null;
        CommonTree string_literal12_tree=null;
        CommonTree char_literal13_tree=null;
        CommonTree string_literal14_tree=null;
        CommonTree Identifier15_tree=null;
        CommonTree char_literal16_tree=null;
        CommonTree Identifier17_tree=null;
        CommonTree char_literal18_tree=null;
        CommonTree char_literal19_tree=null;
        CommonTree char_literal20_tree=null;
        CommonTree string_literal21_tree=null;
        CommonTree char_literal22_tree=null;
        CommonTree string_literal23_tree=null;
        CommonTree Identifier24_tree=null;
        CommonTree char_literal25_tree=null;
        CommonTree char_literal26_tree=null;
        CommonTree char_literal27_tree=null;
        RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
        RewriteRuleSubtreeStream stream_integerValue=new RewriteRuleSubtreeStream(adaptor,"rule integerValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:128:2: ( Identifier '=' cmd= integerValue ( ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue )* -> ( ^( DEFINE Identifier ^( COMMAND $cmd) ) )+ | Identifier '=' cmd= integerValue '(' par= integerValue ')' ( ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue '(' par= integerValue ')' )* -> ( ^( DEFINE Identifier ^( COMMAND $cmd PARAMETER $par) ) )+ )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:128:4: Identifier '=' cmd= integerValue ( ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue )*
                    {
                    Identifier10=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineCommandValue476);  
                    stream_Identifier.add(Identifier10);

                    char_literal11=(Token)match(input,98,FOLLOW_98_in_defineCommandValue478);  
                    stream_98.add(char_literal11);

                    pushFollow(FOLLOW_integerValue_in_defineCommandValue482);
                    cmd=integerValue();

                    state._fsp--;

                    stream_integerValue.add(cmd.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:128:36: ( ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue )*
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
                    	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:128:37: ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue
                    	    {
                    	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:128:37: ( 'and' | ',' ( 'and' )? )?
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
                    	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:128:38: 'and'
                    	            {
                    	            string_literal12=(Token)match(input,99,FOLLOW_99_in_defineCommandValue486);  
                    	            stream_99.add(string_literal12);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:128:44: ',' ( 'and' )?
                    	            {
                    	            char_literal13=(Token)match(input,100,FOLLOW_100_in_defineCommandValue488);  
                    	            stream_100.add(char_literal13);

                    	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:128:48: ( 'and' )?
                    	            int alt5=2;
                    	            int LA5_0 = input.LA(1);

                    	            if ( (LA5_0==99) ) {
                    	                alt5=1;
                    	            }
                    	            switch (alt5) {
                    	                case 1 :
                    	                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:128:48: 'and'
                    	                    {
                    	                    string_literal14=(Token)match(input,99,FOLLOW_99_in_defineCommandValue490);  
                    	                    stream_99.add(string_literal14);


                    	                    }
                    	                    break;

                    	            }


                    	            }
                    	            break;

                    	    }

                    	    Identifier15=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineCommandValue495);  
                    	    stream_Identifier.add(Identifier15);

                    	    char_literal16=(Token)match(input,98,FOLLOW_98_in_defineCommandValue497);  
                    	    stream_98.add(char_literal16);

                    	    pushFollow(FOLLOW_integerValue_in_defineCommandValue501);
                    	    cmd=integerValue();

                    	    state._fsp--;

                    	    stream_integerValue.add(cmd.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: cmd, Identifier
                    // token labels: 
                    // rule labels: retval, cmd
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_cmd=new RewriteRuleSubtreeStream(adaptor,"rule cmd",cmd!=null?cmd.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 129:2: -> ( ^( DEFINE Identifier ^( COMMAND $cmd) ) )+
                    {
                        if ( !(stream_cmd.hasNext()||stream_Identifier.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_cmd.hasNext()||stream_Identifier.hasNext() ) {
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:129:5: ^( DEFINE Identifier ^( COMMAND $cmd) )
                            {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEFINE, "DEFINE"), root_1);

                            adaptor.addChild(root_1, stream_Identifier.nextNode());
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:129:25: ^( COMMAND $cmd)
                            {
                            CommonTree root_2 = (CommonTree)adaptor.nil();
                            root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMMAND, "COMMAND"), root_2);

                            adaptor.addChild(root_2, stream_cmd.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                            adaptor.addChild(root_0, root_1);
                            }

                        }
                        stream_cmd.reset();
                        stream_Identifier.reset();

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:130:4: Identifier '=' cmd= integerValue '(' par= integerValue ')' ( ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue '(' par= integerValue ')' )*
                    {
                    Identifier17=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineCommandValue525);  
                    stream_Identifier.add(Identifier17);

                    char_literal18=(Token)match(input,98,FOLLOW_98_in_defineCommandValue527);  
                    stream_98.add(char_literal18);

                    pushFollow(FOLLOW_integerValue_in_defineCommandValue531);
                    cmd=integerValue();

                    state._fsp--;

                    stream_integerValue.add(cmd.getTree());
                    char_literal19=(Token)match(input,101,FOLLOW_101_in_defineCommandValue533);  
                    stream_101.add(char_literal19);

                    pushFollow(FOLLOW_integerValue_in_defineCommandValue537);
                    par=integerValue();

                    state._fsp--;

                    stream_integerValue.add(par.getTree());
                    char_literal20=(Token)match(input,102,FOLLOW_102_in_defineCommandValue539);  
                    stream_102.add(char_literal20);

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
                    	            string_literal21=(Token)match(input,99,FOLLOW_99_in_defineCommandValue543);  
                    	            stream_99.add(string_literal21);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:130:69: ',' ( 'and' )?
                    	            {
                    	            char_literal22=(Token)match(input,100,FOLLOW_100_in_defineCommandValue545);  
                    	            stream_100.add(char_literal22);

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
                    	                    string_literal23=(Token)match(input,99,FOLLOW_99_in_defineCommandValue547);  
                    	                    stream_99.add(string_literal23);


                    	                    }
                    	                    break;

                    	            }


                    	            }
                    	            break;

                    	    }

                    	    Identifier24=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineCommandValue552);  
                    	    stream_Identifier.add(Identifier24);

                    	    char_literal25=(Token)match(input,98,FOLLOW_98_in_defineCommandValue554);  
                    	    stream_98.add(char_literal25);

                    	    pushFollow(FOLLOW_integerValue_in_defineCommandValue558);
                    	    cmd=integerValue();

                    	    state._fsp--;

                    	    stream_integerValue.add(cmd.getTree());
                    	    char_literal26=(Token)match(input,101,FOLLOW_101_in_defineCommandValue560);  
                    	    stream_101.add(char_literal26);

                    	    pushFollow(FOLLOW_integerValue_in_defineCommandValue564);
                    	    par=integerValue();

                    	    state._fsp--;

                    	    stream_integerValue.add(par.getTree());
                    	    char_literal27=(Token)match(input,102,FOLLOW_102_in_defineCommandValue566);  
                    	    stream_102.add(char_literal27);


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: par, cmd, Identifier
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
                        if ( !(stream_par.hasNext()||stream_cmd.hasNext()||stream_Identifier.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_par.hasNext()||stream_cmd.hasNext()||stream_Identifier.hasNext() ) {
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
                        stream_par.reset();
                        stream_cmd.reset();
                        stream_Identifier.reset();

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

        Token string_literal28=null;
        Token string_literal29=null;
        Token string_literal30=null;
        flipsParser.defineSensorValue_return defineSensorValue31 = null;


        CommonTree string_literal28_tree=null;
        CommonTree string_literal29_tree=null;
        CommonTree string_literal30_tree=null;
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
                    string_literal28=(Token)match(input,103,FOLLOW_103_in_defineSensor602);  
                    stream_103.add(string_literal28);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:135:11: 'sensor'
                    {
                    string_literal29=(Token)match(input,104,FOLLOW_104_in_defineSensor604);  
                    stream_104.add(string_literal29);


                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:135:20: 'sensors'
                    {
                    string_literal30=(Token)match(input,105,FOLLOW_105_in_defineSensor606);  
                    stream_105.add(string_literal30);


                    }
                    break;

            }

            pushFollow(FOLLOW_defineSensorValue_in_defineSensor609);
            defineSensorValue31=defineSensorValue();

            state._fsp--;

            stream_defineSensorValue.add(defineSensorValue31.getTree());


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

        Token Identifier32=null;
        Token char_literal33=null;
        Token string_literal34=null;
        Token char_literal35=null;
        Token string_literal36=null;
        Token Identifier37=null;
        Token char_literal38=null;
        flipsParser.integerValue_return sen = null;


        CommonTree Identifier32_tree=null;
        CommonTree char_literal33_tree=null;
        CommonTree string_literal34_tree=null;
        CommonTree char_literal35_tree=null;
        CommonTree string_literal36_tree=null;
        CommonTree Identifier37_tree=null;
        CommonTree char_literal38_tree=null;
        RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
        RewriteRuleSubtreeStream stream_integerValue=new RewriteRuleSubtreeStream(adaptor,"rule integerValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:140:2: ( Identifier '=' sen= integerValue ( ( 'and' | ',' ( 'and' )? )? Identifier '=' sen= integerValue )* -> ( ^( DEFINE Identifier ^( SENSOR $sen) ) )+ )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:140:4: Identifier '=' sen= integerValue ( ( 'and' | ',' ( 'and' )? )? Identifier '=' sen= integerValue )*
            {
            Identifier32=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineSensorValue625);  
            stream_Identifier.add(Identifier32);

            char_literal33=(Token)match(input,98,FOLLOW_98_in_defineSensorValue627);  
            stream_98.add(char_literal33);

            pushFollow(FOLLOW_integerValue_in_defineSensorValue631);
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
            	            string_literal34=(Token)match(input,99,FOLLOW_99_in_defineSensorValue635);  
            	            stream_99.add(string_literal34);


            	            }
            	            break;
            	        case 2 :
            	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:140:44: ',' ( 'and' )?
            	            {
            	            char_literal35=(Token)match(input,100,FOLLOW_100_in_defineSensorValue637);  
            	            stream_100.add(char_literal35);

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
            	                    string_literal36=(Token)match(input,99,FOLLOW_99_in_defineSensorValue639);  
            	                    stream_99.add(string_literal36);


            	                    }
            	                    break;

            	            }


            	            }
            	            break;

            	    }

            	    Identifier37=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineSensorValue644);  
            	    stream_Identifier.add(Identifier37);

            	    char_literal38=(Token)match(input,98,FOLLOW_98_in_defineSensorValue646);  
            	    stream_98.add(char_literal38);

            	    pushFollow(FOLLOW_integerValue_in_defineSensorValue650);
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

        Token string_literal39=null;
        Token string_literal40=null;
        Token string_literal41=null;
        flipsParser.defineWaypointValue_return defineWaypointValue42 = null;


        CommonTree string_literal39_tree=null;
        CommonTree string_literal40_tree=null;
        CommonTree string_literal41_tree=null;
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
                    string_literal39=(Token)match(input,106,FOLLOW_106_in_defineWaypoint681);  
                    stream_106.add(string_literal39);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:145:11: 'waypoint'
                    {
                    string_literal40=(Token)match(input,107,FOLLOW_107_in_defineWaypoint683);  
                    stream_107.add(string_literal40);


                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:145:22: 'waypoints'
                    {
                    string_literal41=(Token)match(input,108,FOLLOW_108_in_defineWaypoint685);  
                    stream_108.add(string_literal41);


                    }
                    break;

            }

            pushFollow(FOLLOW_defineWaypointValue_in_defineWaypoint688);
            defineWaypointValue42=defineWaypointValue();

            state._fsp--;

            stream_defineWaypointValue.add(defineWaypointValue42.getTree());


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

        Token Identifier43=null;
        Token char_literal44=null;
        Token string_literal46=null;
        Token char_literal47=null;
        Token string_literal48=null;
        Token Identifier49=null;
        Token char_literal50=null;
        flipsParser.geoCoordinate_return geoCoordinate45 = null;

        flipsParser.geoCoordinate_return geoCoordinate51 = null;


        CommonTree Identifier43_tree=null;
        CommonTree char_literal44_tree=null;
        CommonTree string_literal46_tree=null;
        CommonTree char_literal47_tree=null;
        CommonTree string_literal48_tree=null;
        CommonTree Identifier49_tree=null;
        CommonTree char_literal50_tree=null;
        RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
        RewriteRuleSubtreeStream stream_geoCoordinate=new RewriteRuleSubtreeStream(adaptor,"rule geoCoordinate");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:150:2: ( Identifier '=' geoCoordinate ( ( 'and' | ',' ( 'and' )? )? Identifier '=' geoCoordinate )* -> ( ^( DEFINE Identifier geoCoordinate ) )+ )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:150:4: Identifier '=' geoCoordinate ( ( 'and' | ',' ( 'and' )? )? Identifier '=' geoCoordinate )*
            {
            Identifier43=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineWaypointValue704);  
            stream_Identifier.add(Identifier43);

            char_literal44=(Token)match(input,98,FOLLOW_98_in_defineWaypointValue706);  
            stream_98.add(char_literal44);

            pushFollow(FOLLOW_geoCoordinate_in_defineWaypointValue708);
            geoCoordinate45=geoCoordinate();

            state._fsp--;

            stream_geoCoordinate.add(geoCoordinate45.getTree());
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
            	            string_literal46=(Token)match(input,99,FOLLOW_99_in_defineWaypointValue712);  
            	            stream_99.add(string_literal46);


            	            }
            	            break;
            	        case 2 :
            	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:150:41: ',' ( 'and' )?
            	            {
            	            char_literal47=(Token)match(input,100,FOLLOW_100_in_defineWaypointValue714);  
            	            stream_100.add(char_literal47);

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
            	                    string_literal48=(Token)match(input,99,FOLLOW_99_in_defineWaypointValue716);  
            	                    stream_99.add(string_literal48);


            	                    }
            	                    break;

            	            }


            	            }
            	            break;

            	    }

            	    Identifier49=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineWaypointValue721);  
            	    stream_Identifier.add(Identifier49);

            	    char_literal50=(Token)match(input,98,FOLLOW_98_in_defineWaypointValue723);  
            	    stream_98.add(char_literal50);

            	    pushFollow(FOLLOW_geoCoordinate_in_defineWaypointValue725);
            	    geoCoordinate51=geoCoordinate();

            	    state._fsp--;

            	    stream_geoCoordinate.add(geoCoordinate51.getTree());

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

        flipsParser.flyCommand_return flyCommand52 = null;

        flipsParser.turnCommand_return turnCommand53 = null;

        flipsParser.loiterCommand_return loiterCommand54 = null;

        flipsParser.executeCommand_return executeCommand55 = null;



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

                    pushFollow(FOLLOW_flyCommand_in_command752);
                    flyCommand52=flyCommand();

                    state._fsp--;

                    adaptor.addChild(root_0, flyCommand52.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:158:4: turnCommand
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_turnCommand_in_command757);
                    turnCommand53=turnCommand();

                    state._fsp--;

                    adaptor.addChild(root_0, turnCommand53.getTree());

                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:159:4: loiterCommand
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_loiterCommand_in_command762);
                    loiterCommand54=loiterCommand();

                    state._fsp--;

                    adaptor.addChild(root_0, loiterCommand54.getTree());

                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:160:4: executeCommand
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_executeCommand_in_command767);
                    executeCommand55=executeCommand();

                    state._fsp--;

                    adaptor.addChild(root_0, executeCommand55.getTree());

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

        Token string_literal56=null;
        Token string_literal57=null;
        flipsParser.flyCommandValue_return flyCommandValue58 = null;


        CommonTree string_literal56_tree=null;
        CommonTree string_literal57_tree=null;
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
                    string_literal56=(Token)match(input,109,FOLLOW_109_in_flyCommand779);  
                    stream_109.add(string_literal56);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:164:11: 'go'
                    {
                    string_literal57=(Token)match(input,110,FOLLOW_110_in_flyCommand781);  
                    stream_110.add(string_literal57);


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
            	    pushFollow(FOLLOW_flyCommandValue_in_flyCommand784);
            	    flyCommandValue58=flyCommandValue();

            	    state._fsp--;

            	    stream_flyCommandValue.add(flyCommandValue58.getTree());

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

        Token To66=null;
        Token string_literal68=null;
        Token char_literal69=null;
        Token string_literal70=null;
        flipsParser.time_return time59 = null;

        flipsParser.direction_return direction60 = null;

        flipsParser.speed_return speed61 = null;

        flipsParser.distance_return distance62 = null;

        flipsParser.pitch_return pitch63 = null;

        flipsParser.roll_return roll64 = null;

        flipsParser.duration_return duration65 = null;

        flipsParser.waypoint_return waypoint67 = null;

        flipsParser.waypoint_return waypoint71 = null;

        flipsParser.altitude_return altitude72 = null;


        CommonTree To66_tree=null;
        CommonTree string_literal68_tree=null;
        CommonTree char_literal69_tree=null;
        CommonTree string_literal70_tree=null;
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

                    pushFollow(FOLLOW_time_in_flyCommandValue806);
                    time59=time();

                    state._fsp--;

                    adaptor.addChild(root_0, time59.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:170:4: direction
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_direction_in_flyCommandValue811);
                    direction60=direction();

                    state._fsp--;

                    adaptor.addChild(root_0, direction60.getTree());

                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:171:4: speed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_speed_in_flyCommandValue816);
                    speed61=speed();

                    state._fsp--;

                    adaptor.addChild(root_0, speed61.getTree());

                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:172:4: distance
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_distance_in_flyCommandValue821);
                    distance62=distance();

                    state._fsp--;

                    adaptor.addChild(root_0, distance62.getTree());

                    }
                    break;
                case 5 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:173:4: pitch
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_pitch_in_flyCommandValue826);
                    pitch63=pitch();

                    state._fsp--;

                    adaptor.addChild(root_0, pitch63.getTree());

                    }
                    break;
                case 6 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:174:4: roll
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_roll_in_flyCommandValue831);
                    roll64=roll();

                    state._fsp--;

                    adaptor.addChild(root_0, roll64.getTree());

                    }
                    break;
                case 7 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:175:4: duration
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_duration_in_flyCommandValue836);
                    duration65=duration();

                    state._fsp--;

                    adaptor.addChild(root_0, duration65.getTree());

                    }
                    break;
                case 8 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:176:4: To waypoint ( ( 'and' | ',' ( 'and' )? ) waypoint )*
                    {
                    To66=(Token)match(input,To,FOLLOW_To_in_flyCommandValue841);  
                    stream_To.add(To66);

                    pushFollow(FOLLOW_waypoint_in_flyCommandValue843);
                    waypoint67=waypoint();

                    state._fsp--;

                    stream_waypoint.add(waypoint67.getTree());
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
                    	            string_literal68=(Token)match(input,99,FOLLOW_99_in_flyCommandValue847);  
                    	            stream_99.add(string_literal68);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:176:24: ',' ( 'and' )?
                    	            {
                    	            char_literal69=(Token)match(input,100,FOLLOW_100_in_flyCommandValue849);  
                    	            stream_100.add(char_literal69);

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
                    	                    string_literal70=(Token)match(input,99,FOLLOW_99_in_flyCommandValue851);  
                    	                    stream_99.add(string_literal70);


                    	                    }
                    	                    break;

                    	            }


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_waypoint_in_flyCommandValue855);
                    	    waypoint71=waypoint();

                    	    state._fsp--;

                    	    stream_waypoint.add(waypoint71.getTree());

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

                    pushFollow(FOLLOW_altitude_in_flyCommandValue868);
                    altitude72=altitude();

                    state._fsp--;

                    adaptor.addChild(root_0, altitude72.getTree());

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

        Token string_literal73=null;
        Token string_literal74=null;
        flipsParser.turnCommandValue_return turnCommandValue75 = null;


        CommonTree string_literal73_tree=null;
        CommonTree string_literal74_tree=null;
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
                    string_literal73=(Token)match(input,111,FOLLOW_111_in_turnCommand880);  
                    stream_111.add(string_literal73);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:182:11: 'turn'
                    {
                    string_literal74=(Token)match(input,112,FOLLOW_112_in_turnCommand882);  
                    stream_112.add(string_literal74);


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
            	    pushFollow(FOLLOW_turnCommandValue_in_turnCommand885);
            	    turnCommandValue75=turnCommandValue();

            	    state._fsp--;

            	    stream_turnCommandValue.add(turnCommandValue75.getTree());

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

        flipsParser.direction_return direction76 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:187:2: ( direction )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:187:4: direction
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_direction_in_turnCommandValue907);
            direction76=direction();

            state._fsp--;

            adaptor.addChild(root_0, direction76.getTree());

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

        Token string_literal77=null;
        Token string_literal78=null;
        flipsParser.loiterCommandValue_return loiterCommandValue79 = null;


        CommonTree string_literal77_tree=null;
        CommonTree string_literal78_tree=null;
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
                    string_literal77=(Token)match(input,113,FOLLOW_113_in_loiterCommand919);  
                    stream_113.add(string_literal77);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:191:11: 'loiter'
                    {
                    string_literal78=(Token)match(input,114,FOLLOW_114_in_loiterCommand921);  
                    stream_114.add(string_literal78);


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
            	    pushFollow(FOLLOW_loiterCommandValue_in_loiterCommand924);
            	    loiterCommandValue79=loiterCommandValue();

            	    state._fsp--;

            	    stream_loiterCommandValue.add(loiterCommandValue79.getTree());

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

        Token At85=null;
        flipsParser.time_return time80 = null;

        flipsParser.speed_return speed81 = null;

        flipsParser.loiterDirection_return loiterDirection82 = null;

        flipsParser.radius_return radius83 = null;

        flipsParser.duration_return duration84 = null;

        flipsParser.waypoint_return waypoint86 = null;

        flipsParser.altitude_return altitude87 = null;


        CommonTree At85_tree=null;
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

                    pushFollow(FOLLOW_time_in_loiterCommandValue946);
                    time80=time();

                    state._fsp--;

                    adaptor.addChild(root_0, time80.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:197:4: speed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_speed_in_loiterCommandValue951);
                    speed81=speed();

                    state._fsp--;

                    adaptor.addChild(root_0, speed81.getTree());

                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:198:4: loiterDirection
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_loiterDirection_in_loiterCommandValue956);
                    loiterDirection82=loiterDirection();

                    state._fsp--;

                    adaptor.addChild(root_0, loiterDirection82.getTree());

                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:199:4: radius
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_radius_in_loiterCommandValue961);
                    radius83=radius();

                    state._fsp--;

                    adaptor.addChild(root_0, radius83.getTree());

                    }
                    break;
                case 5 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:200:4: duration
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_duration_in_loiterCommandValue966);
                    duration84=duration();

                    state._fsp--;

                    adaptor.addChild(root_0, duration84.getTree());

                    }
                    break;
                case 6 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:201:4: At waypoint
                    {
                    At85=(Token)match(input,At,FOLLOW_At_in_loiterCommandValue971);  
                    stream_At.add(At85);

                    pushFollow(FOLLOW_waypoint_in_loiterCommandValue973);
                    waypoint86=waypoint();

                    state._fsp--;

                    stream_waypoint.add(waypoint86.getTree());


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

                    pushFollow(FOLLOW_altitude_in_loiterCommandValue983);
                    altitude87=altitude();

                    state._fsp--;

                    adaptor.addChild(root_0, altitude87.getTree());

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

        Token Identifier88=null;
        Token Identifier89=null;
        Token char_literal90=null;
        Token char_literal92=null;
        Token char_literal94=null;
        flipsParser.numericValue_return numericValue91 = null;

        flipsParser.numericValue_return numericValue93 = null;


        CommonTree Identifier88_tree=null;
        CommonTree Identifier89_tree=null;
        CommonTree char_literal90_tree=null;
        CommonTree char_literal92_tree=null;
        CommonTree char_literal94_tree=null;
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
                    Identifier88=(Token)match(input,Identifier,FOLLOW_Identifier_in_executeCommand994);  
                    stream_Identifier.add(Identifier88);



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
                    Identifier89=(Token)match(input,Identifier,FOLLOW_Identifier_in_executeCommand1008);  
                    stream_Identifier.add(Identifier89);

                    char_literal90=(Token)match(input,101,FOLLOW_101_in_executeCommand1010);  
                    stream_101.add(char_literal90);

                    pushFollow(FOLLOW_numericValue_in_executeCommand1012);
                    numericValue91=numericValue();

                    state._fsp--;

                    stream_numericValue.add(numericValue91.getTree());
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
                    	    char_literal92=(Token)match(input,100,FOLLOW_100_in_executeCommand1015);  
                    	    stream_100.add(char_literal92);

                    	    pushFollow(FOLLOW_numericValue_in_executeCommand1017);
                    	    numericValue93=numericValue();

                    	    state._fsp--;

                    	    stream_numericValue.add(numericValue93.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    char_literal94=(Token)match(input,102,FOLLOW_102_in_executeCommand1022);  
                    stream_102.add(char_literal94);



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

        Token string_literal95=null;
        Token string_literal96=null;
        Token With98=null;
        Token string_literal99=null;
        Token string_literal100=null;
        Token string_literal101=null;
        Token string_literal102=null;
        flipsParser.angularValue_return angularValue97 = null;

        flipsParser.angularValue_return angularValue103 = null;


        CommonTree string_literal95_tree=null;
        CommonTree string_literal96_tree=null;
        CommonTree With98_tree=null;
        CommonTree string_literal99_tree=null;
        CommonTree string_literal100_tree=null;
        CommonTree string_literal101_tree=null;
        CommonTree string_literal102_tree=null;
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
                            string_literal95=(Token)match(input,115,FOLLOW_115_in_pitch1052);  
                            stream_115.add(string_literal95);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:216:11: 'pitch'
                            {
                            string_literal96=(Token)match(input,116,FOLLOW_116_in_pitch1054);  
                            stream_116.add(string_literal96);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_angularValue_in_pitch1057);
                    angularValue97=angularValue();

                    state._fsp--;

                    stream_angularValue.add(angularValue97.getTree());


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
                            With98=(Token)match(input,With,FOLLOW_With_in_pitch1072);  
                            stream_With.add(With98);

                            string_literal99=(Token)match(input,117,FOLLOW_117_in_pitch1074);  
                            stream_117.add(string_literal99);


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
                            string_literal100=(Token)match(input,118,FOLLOW_118_in_pitch1079);  
                            stream_118.add(string_literal100);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:218:24: 'angle of attack'
                            {
                            string_literal101=(Token)match(input,119,FOLLOW_119_in_pitch1081);  
                            stream_119.add(string_literal101);


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
                            string_literal102=(Token)match(input,120,FOLLOW_120_in_pitch1084);  
                            stream_120.add(string_literal102);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_angularValue_in_pitch1087);
                    angularValue103=angularValue();

                    state._fsp--;

                    stream_angularValue.add(angularValue103.getTree());


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

        Token string_literal104=null;
        Token string_literal105=null;
        flipsParser.angularValue_return angularValue106 = null;


        CommonTree string_literal104_tree=null;
        CommonTree string_literal105_tree=null;
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
                    string_literal104=(Token)match(input,121,FOLLOW_121_in_roll1108);  
                    stream_121.add(string_literal104);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:11: 'roll'
                    {
                    string_literal105=(Token)match(input,122,FOLLOW_122_in_roll1110);  
                    stream_122.add(string_literal105);


                    }
                    break;

            }

            pushFollow(FOLLOW_angularValue_in_roll1113);
            angularValue106=angularValue();

            state._fsp--;

            stream_angularValue.add(angularValue106.getTree());


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

        flipsParser.fixedAltitude_return fixedAltitude107 = null;

        flipsParser.relativeAltitude_return relativeAltitude108 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:230:2: ( fixedAltitude | relativeAltitude )
            int alt40=2;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:230:4: fixedAltitude
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_fixedAltitude_in_altitude1135);
                    fixedAltitude107=fixedAltitude();

                    state._fsp--;

                    adaptor.addChild(root_0, fixedAltitude107.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:231:4: relativeAltitude
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_relativeAltitude_in_altitude1140);
                    relativeAltitude108=relativeAltitude();

                    state._fsp--;

                    adaptor.addChild(root_0, relativeAltitude108.getTree());

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

        Token To110=null;
        Token At111=null;
        Token With112=null;
        Token string_literal113=null;
        Token string_literal114=null;
        Token string_literal115=null;
        Token char_literal116=null;
        Token string_literal117=null;
        Token string_literal118=null;
        Token string_literal119=null;
        flipsParser.upDownDirection_return upDownDirection109 = null;

        flipsParser.altitudeValue_return altitudeValue120 = null;


        CommonTree To110_tree=null;
        CommonTree At111_tree=null;
        CommonTree With112_tree=null;
        CommonTree string_literal113_tree=null;
        CommonTree string_literal114_tree=null;
        CommonTree string_literal115_tree=null;
        CommonTree char_literal116_tree=null;
        CommonTree string_literal117_tree=null;
        CommonTree string_literal118_tree=null;
        CommonTree string_literal119_tree=null;
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
                            pushFollow(FOLLOW_upDownDirection_in_fixedAltitude1152);
                            upDownDirection109=upDownDirection();

                            state._fsp--;

                            stream_upDownDirection.add(upDownDirection109.getTree());

                            }
                            break;

                    }

                    To110=(Token)match(input,To,FOLLOW_To_in_fixedAltitude1155);  
                    stream_To.add(To110);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:235:25: At
                    {
                    At111=(Token)match(input,At,FOLLOW_At_in_fixedAltitude1157);  
                    stream_At.add(At111);


                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:235:28: With
                    {
                    With112=(Token)match(input,With,FOLLOW_With_in_fixedAltitude1159);  
                    stream_With.add(With112);


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
                                    string_literal113=(Token)match(input,117,FOLLOW_117_in_fixedAltitude1164);  
                                    stream_117.add(string_literal113);


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
                                    string_literal114=(Token)match(input,123,FOLLOW_123_in_fixedAltitude1168);  
                                    stream_123.add(string_literal114);


                                    }
                                    break;
                                case 2 :
                                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:235:49: 'altitude'
                                    {
                                    string_literal115=(Token)match(input,124,FOLLOW_124_in_fixedAltitude1170);  
                                    stream_124.add(string_literal115);


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
                                    char_literal116=(Token)match(input,125,FOLLOW_125_in_fixedAltitude1173);  
                                    stream_125.add(char_literal116);


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
                                    string_literal117=(Token)match(input,126,FOLLOW_126_in_fixedAltitude1177);  
                                    stream_126.add(string_literal117);


                                    }
                                    break;
                                case 2 :
                                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:235:74: 'pressure'
                                    {
                                    string_literal118=(Token)match(input,127,FOLLOW_127_in_fixedAltitude1179);  
                                    stream_127.add(string_literal118);


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
                            string_literal119=(Token)match(input,120,FOLLOW_120_in_fixedAltitude1183);  
                            stream_120.add(string_literal119);


                            }
                            break;

                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_altitudeValue_in_fixedAltitude1188);
            altitudeValue120=altitudeValue();

            state._fsp--;

            stream_altitudeValue.add(altitudeValue120.getTree());


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

        flipsParser.upDownDirection_return upDownDirection121 = null;

        flipsParser.altitudeValue_return altitudeValue122 = null;


        RewriteRuleSubtreeStream stream_altitudeValue=new RewriteRuleSubtreeStream(adaptor,"rule altitudeValue");
        RewriteRuleSubtreeStream stream_upDownDirection=new RewriteRuleSubtreeStream(adaptor,"rule upDownDirection");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:240:2: ( upDownDirection altitudeValue -> ^( ALTITUDE RELATIVE upDownDirection altitudeValue ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:240:4: upDownDirection altitudeValue
            {
            pushFollow(FOLLOW_upDownDirection_in_relativeAltitude1210);
            upDownDirection121=upDownDirection();

            state._fsp--;

            stream_upDownDirection.add(upDownDirection121.getTree());
            pushFollow(FOLLOW_altitudeValue_in_relativeAltitude1212);
            altitudeValue122=altitudeValue();

            state._fsp--;

            stream_altitudeValue.add(altitudeValue122.getTree());


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

        Token FlightLevel125=null;
        flipsParser.distanceValue_return distanceValue123 = null;

        flipsParser.pressureValue_return pressureValue124 = null;


        CommonTree FlightLevel125_tree=null;
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

                if ( ((LA50_2>=128 && LA50_2<=145)) ) {
                    alt50=2;
                }
                else if ( ((LA50_2>=148 && LA50_2<=165)) ) {
                    alt50=1;
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
                    pushFollow(FOLLOW_distanceValue_in_altitudeValue1236);
                    distanceValue123=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(distanceValue123.getTree());


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
                    pushFollow(FOLLOW_pressureValue_in_altitudeValue1248);
                    pressureValue124=pressureValue();

                    state._fsp--;

                    stream_pressureValue.add(pressureValue124.getTree());


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
                    FlightLevel125=(Token)match(input,FlightLevel,FOLLOW_FlightLevel_in_altitudeValue1260);  
                    stream_FlightLevel.add(FlightLevel125);



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

        flipsParser.numericValue_return numericValue126 = null;

        flipsParser.pressureUnit_return pressureUnit127 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:254:2: ( numericValue pressureUnit )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:254:4: numericValue pressureUnit
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_numericValue_in_pressureValue1278);
            numericValue126=numericValue();

            state._fsp--;

            adaptor.addChild(root_0, numericValue126.getTree());
            pushFollow(FOLLOW_pressureUnit_in_pressureValue1280);
            pressureUnit127=pressureUnit();

            state._fsp--;

            adaptor.addChild(root_0, pressureUnit127.getTree());

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

        Token string_literal128=null;
        Token string_literal129=null;
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

        CommonTree string_literal128_tree=null;
        CommonTree string_literal129_tree=null;
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
                            string_literal128=(Token)match(input,128,FOLLOW_128_in_pressureUnit1292);  
                            stream_128.add(string_literal128);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:258:11: 'kilopascal'
                            {
                            string_literal129=(Token)match(input,129,FOLLOW_129_in_pressureUnit1294);  
                            stream_129.add(string_literal129);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:258:24: 'kilopascals'
                            {
                            string_literal130=(Token)match(input,130,FOLLOW_130_in_pressureUnit1296);  
                            stream_130.add(string_literal130);


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
                            string_literal131=(Token)match(input,131,FOLLOW_131_in_pressureUnit1308);  
                            stream_131.add(string_literal131);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:260:11: 'hectopascal'
                            {
                            string_literal132=(Token)match(input,132,FOLLOW_132_in_pressureUnit1310);  
                            stream_132.add(string_literal132);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:260:25: 'hectopascals'
                            {
                            string_literal133=(Token)match(input,133,FOLLOW_133_in_pressureUnit1312);  
                            stream_133.add(string_literal133);


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
                            string_literal134=(Token)match(input,134,FOLLOW_134_in_pressureUnit1324);  
                            stream_134.add(string_literal134);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:262:10: 'pascal'
                            {
                            string_literal135=(Token)match(input,135,FOLLOW_135_in_pressureUnit1326);  
                            stream_135.add(string_literal135);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:262:19: 'pascals'
                            {
                            string_literal136=(Token)match(input,136,FOLLOW_136_in_pressureUnit1328);  
                            stream_136.add(string_literal136);


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
                            string_literal137=(Token)match(input,137,FOLLOW_137_in_pressureUnit1340);  
                            stream_137.add(string_literal137);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:264:11: 'bars'
                            {
                            string_literal138=(Token)match(input,138,FOLLOW_138_in_pressureUnit1342);  
                            stream_138.add(string_literal138);


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
                            string_literal139=(Token)match(input,139,FOLLOW_139_in_pressureUnit1354);  
                            stream_139.add(string_literal139);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:266:12: 'millibar'
                            {
                            string_literal140=(Token)match(input,140,FOLLOW_140_in_pressureUnit1356);  
                            stream_140.add(string_literal140);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:266:23: 'millibars'
                            {
                            string_literal141=(Token)match(input,141,FOLLOW_141_in_pressureUnit1358);  
                            stream_141.add(string_literal141);


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
                            string_literal142=(Token)match(input,142,FOLLOW_142_in_pressureUnit1370);  
                            stream_142.add(string_literal142);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:268:11: 'atms'
                            {
                            string_literal143=(Token)match(input,143,FOLLOW_143_in_pressureUnit1372);  
                            stream_143.add(string_literal143);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:268:18: 'atmosphere'
                            {
                            string_literal144=(Token)match(input,144,FOLLOW_144_in_pressureUnit1374);  
                            stream_144.add(string_literal144);


                            }
                            break;
                        case 4 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:268:31: 'atmospheres'
                            {
                            string_literal145=(Token)match(input,145,FOLLOW_145_in_pressureUnit1376);  
                            stream_145.add(string_literal145);


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

        Token string_literal146=null;
        Token With147=null;
        Token char_literal148=null;
        Token string_literal149=null;
        Token string_literal150=null;
        Token string_literal153=null;
        flipsParser.distanceValue_return distanceValue151 = null;

        flipsParser.distanceValue_return distanceValue152 = null;


        CommonTree string_literal146_tree=null;
        CommonTree With147_tree=null;
        CommonTree char_literal148_tree=null;
        CommonTree string_literal149_tree=null;
        CommonTree string_literal150_tree=null;
        CommonTree string_literal153_tree=null;
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
                    string_literal146=(Token)match(input,146,FOLLOW_146_in_radius1396);  
                    stream_146.add(string_literal146);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:275:10: With
                    {
                    With147=(Token)match(input,With,FOLLOW_With_in_radius1398);  
                    stream_With.add(With147);


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
                    char_literal148=(Token)match(input,125,FOLLOW_125_in_radius1402);  
                    stream_125.add(char_literal148);


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
                    string_literal149=(Token)match(input,147,FOLLOW_147_in_radius1406);  
                    stream_147.add(string_literal149);

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
                            string_literal150=(Token)match(input,120,FOLLOW_120_in_radius1408);  
                            stream_120.add(string_literal150);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_distanceValue_in_radius1411);
                    distanceValue151=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(distanceValue151.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:275:52: distanceValue 'radius'
                    {
                    pushFollow(FOLLOW_distanceValue_in_radius1413);
                    distanceValue152=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(distanceValue152.getTree());
                    string_literal153=(Token)match(input,147,FOLLOW_147_in_radius1415);  
                    stream_147.add(string_literal153);


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

        flipsParser.leftRightDirection_return leftRightDirection154 = null;

        flipsParser.distanceValue_return distanceValue155 = null;


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
                    pushFollow(FOLLOW_leftRightDirection_in_distance1436);
                    leftRightDirection154=leftRightDirection();

                    state._fsp--;

                    stream_leftRightDirection.add(leftRightDirection154.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_distanceValue_in_distance1439);
            distanceValue155=distanceValue();

            state._fsp--;

            stream_distanceValue.add(distanceValue155.getTree());


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

        flipsParser.numericValue_return numericValue156 = null;

        flipsParser.distanceUnit_return distanceUnit157 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:285:2: ( numericValue distanceUnit )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:285:4: numericValue distanceUnit
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_numericValue_in_distanceValue1462);
            numericValue156=numericValue();

            state._fsp--;

            adaptor.addChild(root_0, numericValue156.getTree());
            pushFollow(FOLLOW_distanceUnit_in_distanceValue1464);
            distanceUnit157=distanceUnit();

            state._fsp--;

            adaptor.addChild(root_0, distanceUnit157.getTree());

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

        Token string_literal158=null;
        Token string_literal159=null;
        Token string_literal160=null;
        Token char_literal161=null;
        Token string_literal162=null;
        Token string_literal163=null;
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

        CommonTree string_literal158_tree=null;
        CommonTree string_literal159_tree=null;
        CommonTree string_literal160_tree=null;
        CommonTree char_literal161_tree=null;
        CommonTree string_literal162_tree=null;
        CommonTree string_literal163_tree=null;
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
                            string_literal158=(Token)match(input,148,FOLLOW_148_in_distanceUnit1476);  
                            stream_148.add(string_literal158);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:289:10: 'kilometer'
                            {
                            string_literal159=(Token)match(input,149,FOLLOW_149_in_distanceUnit1478);  
                            stream_149.add(string_literal159);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:289:22: 'kilometers'
                            {
                            string_literal160=(Token)match(input,150,FOLLOW_150_in_distanceUnit1480);  
                            stream_150.add(string_literal160);


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
                            char_literal161=(Token)match(input,151,FOLLOW_151_in_distanceUnit1492);  
                            stream_151.add(char_literal161);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:291:9: 'meter'
                            {
                            string_literal162=(Token)match(input,152,FOLLOW_152_in_distanceUnit1494);  
                            stream_152.add(string_literal162);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:291:17: 'meters'
                            {
                            string_literal163=(Token)match(input,153,FOLLOW_153_in_distanceUnit1496);  
                            stream_153.add(string_literal163);


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
                            string_literal164=(Token)match(input,154,FOLLOW_154_in_distanceUnit1508);  
                            stream_154.add(string_literal164);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:293:10: 'nautical' ( 'mi' | 'mile' | 'miles' )
                            {
                            string_literal165=(Token)match(input,155,FOLLOW_155_in_distanceUnit1510);  
                            stream_155.add(string_literal165);

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
                                    string_literal166=(Token)match(input,156,FOLLOW_156_in_distanceUnit1513);  
                                    stream_156.add(string_literal166);


                                    }
                                    break;
                                case 2 :
                                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:293:27: 'mile'
                                    {
                                    string_literal167=(Token)match(input,157,FOLLOW_157_in_distanceUnit1515);  
                                    stream_157.add(string_literal167);


                                    }
                                    break;
                                case 3 :
                                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:293:34: 'miles'
                                    {
                                    string_literal168=(Token)match(input,158,FOLLOW_158_in_distanceUnit1517);  
                                    stream_158.add(string_literal168);


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
                            string_literal169=(Token)match(input,159,FOLLOW_159_in_distanceUnit1532);  
                            stream_159.add(string_literal169);


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
                            string_literal170=(Token)match(input,156,FOLLOW_156_in_distanceUnit1537);  
                            stream_156.add(string_literal170);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:295:23: 'mile'
                            {
                            string_literal171=(Token)match(input,157,FOLLOW_157_in_distanceUnit1539);  
                            stream_157.add(string_literal171);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:295:30: 'miles'
                            {
                            string_literal172=(Token)match(input,158,FOLLOW_158_in_distanceUnit1541);  
                            stream_158.add(string_literal172);


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
                            string_literal173=(Token)match(input,160,FOLLOW_160_in_distanceUnit1553);  
                            stream_160.add(string_literal173);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:297:10: 'yard'
                            {
                            string_literal174=(Token)match(input,161,FOLLOW_161_in_distanceUnit1555);  
                            stream_161.add(string_literal174);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:297:17: 'yards'
                            {
                            string_literal175=(Token)match(input,162,FOLLOW_162_in_distanceUnit1557);  
                            stream_162.add(string_literal175);


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
                            string_literal176=(Token)match(input,163,FOLLOW_163_in_distanceUnit1569);  
                            stream_163.add(string_literal176);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:299:10: 'foot'
                            {
                            string_literal177=(Token)match(input,164,FOLLOW_164_in_distanceUnit1571);  
                            stream_164.add(string_literal177);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:299:17: 'feet'
                            {
                            string_literal178=(Token)match(input,165,FOLLOW_165_in_distanceUnit1573);  
                            stream_165.add(string_literal178);


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

        flipsParser.fixedSpeed_return fixedSpeed179 = null;

        flipsParser.relativeSpeed_return relativeSpeed180 = null;

        flipsParser.optimalSpeed_return optimalSpeed181 = null;

        flipsParser.throttleSpeed_return throttleSpeed182 = null;



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

                    if ( ((LA72_4>=148 && LA72_4<=165)||(LA72_4>=168 && LA72_4<=174)) ) {
                        alt72=1;
                    }
                    else if ( ((LA72_4>=271 && LA72_4<=272)) ) {
                        alt72=4;
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

                    pushFollow(FOLLOW_fixedSpeed_in_speed1592);
                    fixedSpeed179=fixedSpeed();

                    state._fsp--;

                    adaptor.addChild(root_0, fixedSpeed179.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:307:4: relativeSpeed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_relativeSpeed_in_speed1597);
                    relativeSpeed180=relativeSpeed();

                    state._fsp--;

                    adaptor.addChild(root_0, relativeSpeed180.getTree());

                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:308:4: optimalSpeed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_optimalSpeed_in_speed1602);
                    optimalSpeed181=optimalSpeed();

                    state._fsp--;

                    adaptor.addChild(root_0, optimalSpeed181.getTree());

                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:309:4: throttleSpeed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_throttleSpeed_in_speed1607);
                    throttleSpeed182=throttleSpeed();

                    state._fsp--;

                    adaptor.addChild(root_0, throttleSpeed182.getTree());

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

        Token At183=null;
        flipsParser.speedValue_return speedValue184 = null;


        CommonTree At183_tree=null;
        RewriteRuleTokenStream stream_At=new RewriteRuleTokenStream(adaptor,"token At");
        RewriteRuleSubtreeStream stream_speedValue=new RewriteRuleSubtreeStream(adaptor,"rule speedValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:313:2: ( At speedValue -> ^( SPEED FIXED speedValue ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:313:4: At speedValue
            {
            At183=(Token)match(input,At,FOLLOW_At_in_fixedSpeed1618);  
            stream_At.add(At183);

            pushFollow(FOLLOW_speedValue_in_fixedSpeed1620);
            speedValue184=speedValue();

            state._fsp--;

            stream_speedValue.add(speedValue184.getTree());


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

        Token string_literal186=null;
        Token string_literal188=null;
        Token string_literal190=null;
        Token string_literal192=null;
        flipsParser.speedValue_return speedValue185 = null;

        flipsParser.speedValue_return speedValue187 = null;

        flipsParser.percentValue_return percentValue189 = null;

        flipsParser.percentValue_return percentValue191 = null;


        CommonTree string_literal186_tree=null;
        CommonTree string_literal188_tree=null;
        CommonTree string_literal190_tree=null;
        CommonTree string_literal192_tree=null;
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
                    pushFollow(FOLLOW_speedValue_in_relativeSpeed1642);
                    speedValue185=speedValue();

                    state._fsp--;

                    stream_speedValue.add(speedValue185.getTree());
                    string_literal186=(Token)match(input,166,FOLLOW_166_in_relativeSpeed1644);  
                    stream_166.add(string_literal186);



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
                    pushFollow(FOLLOW_speedValue_in_relativeSpeed1662);
                    speedValue187=speedValue();

                    state._fsp--;

                    stream_speedValue.add(speedValue187.getTree());
                    string_literal188=(Token)match(input,167,FOLLOW_167_in_relativeSpeed1664);  
                    stream_167.add(string_literal188);



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
                    pushFollow(FOLLOW_percentValue_in_relativeSpeed1682);
                    percentValue189=percentValue();

                    state._fsp--;

                    stream_percentValue.add(percentValue189.getTree());
                    string_literal190=(Token)match(input,166,FOLLOW_166_in_relativeSpeed1684);  
                    stream_166.add(string_literal190);



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
                    pushFollow(FOLLOW_percentValue_in_relativeSpeed1702);
                    percentValue191=percentValue();

                    state._fsp--;

                    stream_percentValue.add(percentValue191.getTree());
                    string_literal192=(Token)match(input,167,FOLLOW_167_in_relativeSpeed1704);  
                    stream_167.add(string_literal192);



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

        flipsParser.numericValue_return numericValue193 = null;

        flipsParser.speedUnit_return speedUnit194 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:329:2: ( numericValue speedUnit )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:329:4: numericValue speedUnit
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_numericValue_in_speedValue1728);
            numericValue193=numericValue();

            state._fsp--;

            adaptor.addChild(root_0, numericValue193.getTree());
            pushFollow(FOLLOW_speedUnit_in_speedValue1730);
            speedUnit194=speedUnit();

            state._fsp--;

            adaptor.addChild(root_0, speedUnit194.getTree());

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

        Token string_literal195=null;
        Token string_literal196=null;
        Token string_literal197=null;
        Token string_literal198=null;
        Token string_literal199=null;
        Token string_literal200=null;
        Token string_literal201=null;
        Token char_literal203=null;
        Token string_literal204=null;
        flipsParser.distanceUnit_return distanceUnit202 = null;

        flipsParser.timeUnit_return timeUnit205 = null;


        CommonTree string_literal195_tree=null;
        CommonTree string_literal196_tree=null;
        CommonTree string_literal197_tree=null;
        CommonTree string_literal198_tree=null;
        CommonTree string_literal199_tree=null;
        CommonTree string_literal200_tree=null;
        CommonTree string_literal201_tree=null;
        CommonTree char_literal203_tree=null;
        CommonTree string_literal204_tree=null;
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
                    string_literal195=(Token)match(input,168,FOLLOW_168_in_speedUnit1741);  
                    stream_168.add(string_literal195);



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
                    string_literal196=(Token)match(input,169,FOLLOW_169_in_speedUnit1753);  
                    stream_169.add(string_literal196);



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
                            string_literal197=(Token)match(input,170,FOLLOW_170_in_speedUnit1766);  
                            stream_170.add(string_literal197);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:337:10: 'kt'
                            {
                            string_literal198=(Token)match(input,171,FOLLOW_171_in_speedUnit1768);  
                            stream_171.add(string_literal198);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:337:15: 'kts'
                            {
                            string_literal199=(Token)match(input,172,FOLLOW_172_in_speedUnit1770);  
                            stream_172.add(string_literal199);


                            }
                            break;
                        case 4 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:337:21: 'knot'
                            {
                            string_literal200=(Token)match(input,173,FOLLOW_173_in_speedUnit1772);  
                            stream_173.add(string_literal200);


                            }
                            break;
                        case 5 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:337:28: 'knots'
                            {
                            string_literal201=(Token)match(input,174,FOLLOW_174_in_speedUnit1774);  
                            stream_174.add(string_literal201);


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
                    pushFollow(FOLLOW_distanceUnit_in_speedUnit1789);
                    distanceUnit202=distanceUnit();

                    state._fsp--;

                    stream_distanceUnit.add(distanceUnit202.getTree());
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
                            char_literal203=(Token)match(input,175,FOLLOW_175_in_speedUnit1792);  
                            stream_175.add(char_literal203);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:339:22: 'per'
                            {
                            string_literal204=(Token)match(input,176,FOLLOW_176_in_speedUnit1794);  
                            stream_176.add(string_literal204);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_timeUnit_in_speedUnit1797);
                    timeUnit205=timeUnit();

                    state._fsp--;

                    stream_timeUnit.add(timeUnit205.getTree());


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

        Token At206=null;
        Token string_literal208=null;
        Token string_literal209=null;
        flipsParser.optimalUnit_return optimalUnit207 = null;


        CommonTree At206_tree=null;
        CommonTree string_literal208_tree=null;
        CommonTree string_literal209_tree=null;
        RewriteRuleTokenStream stream_At=new RewriteRuleTokenStream(adaptor,"token At");
        RewriteRuleTokenStream stream_178=new RewriteRuleTokenStream(adaptor,"token 178");
        RewriteRuleTokenStream stream_177=new RewriteRuleTokenStream(adaptor,"token 177");
        RewriteRuleSubtreeStream stream_optimalUnit=new RewriteRuleSubtreeStream(adaptor,"rule optimalUnit");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:344:2: ( At optimalUnit ( 'spd' | 'speed' ) -> ^( SPEED OPTIMAL optimalUnit ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:344:4: At optimalUnit ( 'spd' | 'speed' )
            {
            At206=(Token)match(input,At,FOLLOW_At_in_optimalSpeed1815);  
            stream_At.add(At206);

            pushFollow(FOLLOW_optimalUnit_in_optimalSpeed1817);
            optimalUnit207=optimalUnit();

            state._fsp--;

            stream_optimalUnit.add(optimalUnit207.getTree());
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
                    string_literal208=(Token)match(input,177,FOLLOW_177_in_optimalSpeed1820);  
                    stream_177.add(string_literal208);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:344:26: 'speed'
                    {
                    string_literal209=(Token)match(input,178,FOLLOW_178_in_optimalSpeed1822);  
                    stream_178.add(string_literal209);


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

        Token string_literal210=null;
        Token string_literal211=null;
        Token string_literal212=null;
        Token string_literal213=null;
        Token string_literal214=null;
        Token string_literal215=null;

        CommonTree string_literal210_tree=null;
        CommonTree string_literal211_tree=null;
        CommonTree string_literal212_tree=null;
        CommonTree string_literal213_tree=null;
        CommonTree string_literal214_tree=null;
        CommonTree string_literal215_tree=null;
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
                            string_literal210=(Token)match(input,179,FOLLOW_179_in_optimalUnit1846);  
                            stream_179.add(string_literal210);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:349:11: 'minimum'
                            {
                            string_literal211=(Token)match(input,180,FOLLOW_180_in_optimalUnit1848);  
                            stream_180.add(string_literal211);


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
                            string_literal212=(Token)match(input,181,FOLLOW_181_in_optimalUnit1860);  
                            stream_181.add(string_literal212);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:351:11: 'cruise'
                            {
                            string_literal213=(Token)match(input,182,FOLLOW_182_in_optimalUnit1862);  
                            stream_182.add(string_literal213);


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
                            string_literal214=(Token)match(input,183,FOLLOW_183_in_optimalUnit1874);  
                            stream_183.add(string_literal214);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:353:11: 'maximum'
                            {
                            string_literal215=(Token)match(input,184,FOLLOW_184_in_optimalUnit1876);  
                            stream_184.add(string_literal215);


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

        Token At216=null;
        Token string_literal218=null;
        Token string_literal219=null;
        Token string_literal220=null;
        Token string_literal221=null;
        flipsParser.throttleValue_return throttleValue217 = null;


        CommonTree At216_tree=null;
        CommonTree string_literal218_tree=null;
        CommonTree string_literal219_tree=null;
        CommonTree string_literal220_tree=null;
        CommonTree string_literal221_tree=null;
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
            At216=(Token)match(input,At,FOLLOW_At_in_throttleSpeed1893);  
            stream_At.add(At216);

            pushFollow(FOLLOW_throttleValue_in_throttleSpeed1895);
            throttleValue217=throttleValue();

            state._fsp--;

            stream_throttleValue.add(throttleValue217.getTree());
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
                    string_literal218=(Token)match(input,185,FOLLOW_185_in_throttleSpeed1898);  
                    stream_185.add(string_literal218);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:358:28: 'power'
                    {
                    string_literal219=(Token)match(input,186,FOLLOW_186_in_throttleSpeed1900);  
                    stream_186.add(string_literal219);


                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:358:36: 'thr'
                    {
                    string_literal220=(Token)match(input,187,FOLLOW_187_in_throttleSpeed1902);  
                    stream_187.add(string_literal220);


                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:358:42: 'throttle'
                    {
                    string_literal221=(Token)match(input,188,FOLLOW_188_in_throttleSpeed1904);  
                    stream_188.add(string_literal221);


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

        flipsParser.percentValue_return percentValue222 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:363:2: ( percentValue )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:363:4: percentValue
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_percentValue_in_throttleValue1927);
            percentValue222=percentValue();

            state._fsp--;

            adaptor.addChild(root_0, percentValue222.getTree());

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

        Token At223=null;
        flipsParser.timeValue_return timeValue224 = null;


        CommonTree At223_tree=null;

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:369:2: ( At timeValue )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:369:4: At timeValue
            {
            root_0 = (CommonTree)adaptor.nil();

            At223=(Token)match(input,At,FOLLOW_At_in_time1940); 
            At223_tree = (CommonTree)adaptor.create(At223);
            adaptor.addChild(root_0, At223_tree);

            pushFollow(FOLLOW_timeValue_in_time1942);
            timeValue224=timeValue();

            state._fsp--;

            adaptor.addChild(root_0, timeValue224.getTree());

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

        Token string_literal226=null;
        Token string_literal227=null;
        Token string_literal229=null;
        Token string_literal230=null;
        Token string_literal232=null;
        Token string_literal233=null;
        Token string_literal235=null;
        Token string_literal236=null;
        flipsParser.timeFormat_return timeFormat225 = null;

        flipsParser.integerValue_return integerValue228 = null;

        flipsParser.timeFormat_return timeFormat231 = null;

        flipsParser.integerValue_return integerValue234 = null;

        flipsParser.timeFormat_return timeFormat237 = null;


        CommonTree string_literal226_tree=null;
        CommonTree string_literal227_tree=null;
        CommonTree string_literal229_tree=null;
        CommonTree string_literal230_tree=null;
        CommonTree string_literal232_tree=null;
        CommonTree string_literal233_tree=null;
        CommonTree string_literal235_tree=null;
        CommonTree string_literal236_tree=null;
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
                    pushFollow(FOLLOW_timeFormat_in_timeValue1953);
                    timeFormat225=timeFormat();

                    state._fsp--;

                    stream_timeFormat.add(timeFormat225.getTree());
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
                            string_literal226=(Token)match(input,189,FOLLOW_189_in_timeValue1956);  
                            stream_189.add(string_literal226);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:373:21: 'a.m.'
                            {
                            string_literal227=(Token)match(input,190,FOLLOW_190_in_timeValue1958);  
                            stream_190.add(string_literal227);


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
                    pushFollow(FOLLOW_integerValue_in_timeValue1975);
                    integerValue228=integerValue();

                    state._fsp--;

                    stream_integerValue.add(integerValue228.getTree());
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
                            string_literal229=(Token)match(input,189,FOLLOW_189_in_timeValue1978);  
                            stream_189.add(string_literal229);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:375:23: 'a.m.'
                            {
                            string_literal230=(Token)match(input,190,FOLLOW_190_in_timeValue1980);  
                            stream_190.add(string_literal230);


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
                    pushFollow(FOLLOW_timeFormat_in_timeValue1999);
                    timeFormat231=timeFormat();

                    state._fsp--;

                    stream_timeFormat.add(timeFormat231.getTree());
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
                            string_literal232=(Token)match(input,191,FOLLOW_191_in_timeValue2002);  
                            stream_191.add(string_literal232);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:377:21: 'p.m.'
                            {
                            string_literal233=(Token)match(input,192,FOLLOW_192_in_timeValue2004);  
                            stream_192.add(string_literal233);


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
                    pushFollow(FOLLOW_integerValue_in_timeValue2021);
                    integerValue234=integerValue();

                    state._fsp--;

                    stream_integerValue.add(integerValue234.getTree());
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
                            string_literal235=(Token)match(input,191,FOLLOW_191_in_timeValue2024);  
                            stream_191.add(string_literal235);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:379:23: 'p.m.'
                            {
                            string_literal236=(Token)match(input,192,FOLLOW_192_in_timeValue2026);  
                            stream_192.add(string_literal236);


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
                    pushFollow(FOLLOW_timeFormat_in_timeValue2045);
                    timeFormat237=timeFormat();

                    state._fsp--;

                    stream_timeFormat.add(timeFormat237.getTree());


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

        Token char_literal238=null;
        Token char_literal239=null;
        Token char_literal240=null;
        flipsParser.integerValue_return hr = null;

        flipsParser.integerValue_return min = null;

        flipsParser.numericValue_return s = null;


        CommonTree char_literal238_tree=null;
        CommonTree char_literal239_tree=null;
        CommonTree char_literal240_tree=null;
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
                    pushFollow(FOLLOW_integerValue_in_timeFormat2069);
                    hr=integerValue();

                    state._fsp--;

                    stream_integerValue.add(hr.getTree());
                    char_literal238=(Token)match(input,193,FOLLOW_193_in_timeFormat2071);  
                    stream_193.add(char_literal238);

                    pushFollow(FOLLOW_integerValue_in_timeFormat2075);
                    min=integerValue();

                    state._fsp--;

                    stream_integerValue.add(min.getTree());


                    // AST REWRITE
                    // elements: hr, min
                    // token labels: 
                    // rule labels: min, hr, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_min=new RewriteRuleSubtreeStream(adaptor,"rule min",min!=null?min.tree:null);
                    RewriteRuleSubtreeStream stream_hr=new RewriteRuleSubtreeStream(adaptor,"rule hr",hr!=null?hr.tree:null);
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
                    pushFollow(FOLLOW_integerValue_in_timeFormat2095);
                    hr=integerValue();

                    state._fsp--;

                    stream_integerValue.add(hr.getTree());
                    char_literal239=(Token)match(input,193,FOLLOW_193_in_timeFormat2097);  
                    stream_193.add(char_literal239);

                    pushFollow(FOLLOW_integerValue_in_timeFormat2101);
                    min=integerValue();

                    state._fsp--;

                    stream_integerValue.add(min.getTree());
                    char_literal240=(Token)match(input,193,FOLLOW_193_in_timeFormat2103);  
                    stream_193.add(char_literal240);

                    pushFollow(FOLLOW_numericValue_in_timeFormat2107);
                    s=numericValue();

                    state._fsp--;

                    stream_numericValue.add(s.getTree());


                    // AST REWRITE
                    // elements: s, hr, min
                    // token labels: 
                    // rule labels: min, hr, retval, s
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_min=new RewriteRuleSubtreeStream(adaptor,"rule min",min!=null?min.tree:null);
                    RewriteRuleSubtreeStream stream_hr=new RewriteRuleSubtreeStream(adaptor,"rule hr",hr!=null?hr.tree:null);
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

        flipsParser.hour_return hour241 = null;

        flipsParser.minute_return minute242 = null;

        flipsParser.second_return second243 = null;



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

                    pushFollow(FOLLOW_hour_in_timeUnit2135);
                    hour241=hour();

                    state._fsp--;

                    adaptor.addChild(root_0, hour241.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:393:4: minute
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_minute_in_timeUnit2140);
                    minute242=minute();

                    state._fsp--;

                    adaptor.addChild(root_0, minute242.getTree());

                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:394:4: second
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_second_in_timeUnit2145);
                    second243=second();

                    state._fsp--;

                    adaptor.addChild(root_0, second243.getTree());

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

        Token char_literal244=null;
        Token string_literal245=null;
        Token string_literal246=null;
        Token string_literal247=null;
        Token string_literal248=null;

        CommonTree char_literal244_tree=null;
        CommonTree string_literal245_tree=null;
        CommonTree string_literal246_tree=null;
        CommonTree string_literal247_tree=null;
        CommonTree string_literal248_tree=null;
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
                    char_literal244=(Token)match(input,194,FOLLOW_194_in_hour2157);  
                    stream_194.add(char_literal244);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:398:9: 'hr'
                    {
                    string_literal245=(Token)match(input,195,FOLLOW_195_in_hour2159);  
                    stream_195.add(string_literal245);


                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:398:14: 'hrs'
                    {
                    string_literal246=(Token)match(input,196,FOLLOW_196_in_hour2161);  
                    stream_196.add(string_literal246);


                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:398:20: 'hour'
                    {
                    string_literal247=(Token)match(input,197,FOLLOW_197_in_hour2163);  
                    stream_197.add(string_literal247);


                    }
                    break;
                case 5 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:398:27: 'hours'
                    {
                    string_literal248=(Token)match(input,198,FOLLOW_198_in_hour2165);  
                    stream_198.add(string_literal248);


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

        Token string_literal249=null;
        Token string_literal250=null;
        Token string_literal251=null;
        Token string_literal252=null;

        CommonTree string_literal249_tree=null;
        CommonTree string_literal250_tree=null;
        CommonTree string_literal251_tree=null;
        CommonTree string_literal252_tree=null;
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
                    string_literal249=(Token)match(input,179,FOLLOW_179_in_minute2183);  
                    stream_179.add(string_literal249);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:403:11: 'mins'
                    {
                    string_literal250=(Token)match(input,199,FOLLOW_199_in_minute2185);  
                    stream_199.add(string_literal250);


                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:403:18: 'minute'
                    {
                    string_literal251=(Token)match(input,200,FOLLOW_200_in_minute2187);  
                    stream_200.add(string_literal251);


                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:403:27: 'minutes'
                    {
                    string_literal252=(Token)match(input,201,FOLLOW_201_in_minute2189);  
                    stream_201.add(string_literal252);


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

        Token char_literal253=null;
        Token string_literal254=null;
        Token string_literal255=null;
        Token string_literal256=null;
        Token string_literal257=null;

        CommonTree char_literal253_tree=null;
        CommonTree string_literal254_tree=null;
        CommonTree string_literal255_tree=null;
        CommonTree string_literal256_tree=null;
        CommonTree string_literal257_tree=null;
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
                    char_literal253=(Token)match(input,202,FOLLOW_202_in_second2207);  
                    stream_202.add(char_literal253);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:408:9: 'sec'
                    {
                    string_literal254=(Token)match(input,203,FOLLOW_203_in_second2209);  
                    stream_203.add(string_literal254);


                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:408:15: 'secs'
                    {
                    string_literal255=(Token)match(input,204,FOLLOW_204_in_second2211);  
                    stream_204.add(string_literal255);


                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:408:22: 'second'
                    {
                    string_literal256=(Token)match(input,205,FOLLOW_205_in_second2213);  
                    stream_205.add(string_literal256);


                    }
                    break;
                case 5 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:408:31: 'seconds'
                    {
                    string_literal257=(Token)match(input,206,FOLLOW_206_in_second2215);  
                    stream_206.add(string_literal257);


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

        Token string_literal258=null;
        flipsParser.durationValue_return durationValue259 = null;


        CommonTree string_literal258_tree=null;
        RewriteRuleTokenStream stream_207=new RewriteRuleTokenStream(adaptor,"token 207");
        RewriteRuleSubtreeStream stream_durationValue=new RewriteRuleSubtreeStream(adaptor,"rule durationValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:413:2: ( 'for' durationValue -> ^( DURATION durationValue ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:413:4: 'for' durationValue
            {
            string_literal258=(Token)match(input,207,FOLLOW_207_in_duration2232);  
            stream_207.add(string_literal258);

            pushFollow(FOLLOW_durationValue_in_duration2234);
            durationValue259=durationValue();

            state._fsp--;

            stream_durationValue.add(durationValue259.getTree());


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

        flipsParser.numericValue_return numericValue260 = null;

        flipsParser.timeUnit_return timeUnit261 = null;

        flipsParser.integerValue_return integerValue262 = null;

        flipsParser.hour_return hour263 = null;

        flipsParser.numericValue_return numericValue264 = null;

        flipsParser.minute_return minute265 = null;

        flipsParser.second_return second266 = null;

        flipsParser.integerValue_return integerValue267 = null;

        flipsParser.hour_return hour268 = null;

        flipsParser.integerValue_return integerValue269 = null;

        flipsParser.minute_return minute270 = null;

        flipsParser.numericValue_return numericValue271 = null;

        flipsParser.second_return second272 = null;

        flipsParser.integerValue_return integerValue273 = null;

        flipsParser.minute_return minute274 = null;

        flipsParser.numericValue_return numericValue275 = null;

        flipsParser.second_return second276 = null;

        flipsParser.timeFormat_return timeFormat277 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:418:2: ( numericValue timeUnit | integerValue hour numericValue ( minute | second ) | integerValue hour integerValue minute numericValue second | integerValue minute numericValue second | timeFormat )
            int alt94=5;
            alt94 = dfa94.predict(input);
            switch (alt94) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:418:4: numericValue timeUnit
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_numericValue_in_durationValue2254);
                    numericValue260=numericValue();

                    state._fsp--;

                    adaptor.addChild(root_0, numericValue260.getTree());
                    pushFollow(FOLLOW_timeUnit_in_durationValue2256);
                    timeUnit261=timeUnit();

                    state._fsp--;

                    adaptor.addChild(root_0, timeUnit261.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:419:4: integerValue hour numericValue ( minute | second )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_integerValue_in_durationValue2261);
                    integerValue262=integerValue();

                    state._fsp--;

                    adaptor.addChild(root_0, integerValue262.getTree());
                    pushFollow(FOLLOW_hour_in_durationValue2263);
                    hour263=hour();

                    state._fsp--;

                    adaptor.addChild(root_0, hour263.getTree());
                    pushFollow(FOLLOW_numericValue_in_durationValue2265);
                    numericValue264=numericValue();

                    state._fsp--;

                    adaptor.addChild(root_0, numericValue264.getTree());
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
                            pushFollow(FOLLOW_minute_in_durationValue2268);
                            minute265=minute();

                            state._fsp--;

                            adaptor.addChild(root_0, minute265.getTree());

                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:419:43: second
                            {
                            pushFollow(FOLLOW_second_in_durationValue2270);
                            second266=second();

                            state._fsp--;

                            adaptor.addChild(root_0, second266.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:420:4: integerValue hour integerValue minute numericValue second
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_integerValue_in_durationValue2276);
                    integerValue267=integerValue();

                    state._fsp--;

                    adaptor.addChild(root_0, integerValue267.getTree());
                    pushFollow(FOLLOW_hour_in_durationValue2278);
                    hour268=hour();

                    state._fsp--;

                    adaptor.addChild(root_0, hour268.getTree());
                    pushFollow(FOLLOW_integerValue_in_durationValue2280);
                    integerValue269=integerValue();

                    state._fsp--;

                    adaptor.addChild(root_0, integerValue269.getTree());
                    pushFollow(FOLLOW_minute_in_durationValue2282);
                    minute270=minute();

                    state._fsp--;

                    adaptor.addChild(root_0, minute270.getTree());
                    pushFollow(FOLLOW_numericValue_in_durationValue2284);
                    numericValue271=numericValue();

                    state._fsp--;

                    adaptor.addChild(root_0, numericValue271.getTree());
                    pushFollow(FOLLOW_second_in_durationValue2286);
                    second272=second();

                    state._fsp--;

                    adaptor.addChild(root_0, second272.getTree());

                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:421:4: integerValue minute numericValue second
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_integerValue_in_durationValue2291);
                    integerValue273=integerValue();

                    state._fsp--;

                    adaptor.addChild(root_0, integerValue273.getTree());
                    pushFollow(FOLLOW_minute_in_durationValue2293);
                    minute274=minute();

                    state._fsp--;

                    adaptor.addChild(root_0, minute274.getTree());
                    pushFollow(FOLLOW_numericValue_in_durationValue2295);
                    numericValue275=numericValue();

                    state._fsp--;

                    adaptor.addChild(root_0, numericValue275.getTree());
                    pushFollow(FOLLOW_second_in_durationValue2297);
                    second276=second();

                    state._fsp--;

                    adaptor.addChild(root_0, second276.getTree());

                    }
                    break;
                case 5 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:422:4: timeFormat
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_timeFormat_in_durationValue2302);
                    timeFormat277=timeFormat();

                    state._fsp--;

                    adaptor.addChild(root_0, timeFormat277.getTree());

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

        flipsParser.fixedDirection_return fixedDirection278 = null;

        flipsParser.relativeDirection_return relativeDirection279 = null;


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

                if ( ((LA95_2>=FloatingPointLiteral && LA95_2<=HexLiteral)||LA95_2==202||(LA95_2>=208 && LA95_2<=238)) ) {
                    alt95=1;
                }
                else if ( ((LA95_2>=250 && LA95_2<=255)) ) {
                    alt95=2;
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

                if ( ((LA95_3>=250 && LA95_3<=255)) ) {
                    alt95=2;
                }
                else if ( ((LA95_3>=FloatingPointLiteral && LA95_3<=HexLiteral)||LA95_3==202||(LA95_3>=208 && LA95_3<=238)) ) {
                    alt95=1;
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
                    pushFollow(FOLLOW_fixedDirection_in_direction2315);
                    fixedDirection278=fixedDirection();

                    state._fsp--;

                    stream_fixedDirection.add(fixedDirection278.getTree());


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
                    pushFollow(FOLLOW_relativeDirection_in_direction2331);
                    relativeDirection279=relativeDirection();

                    state._fsp--;

                    stream_relativeDirection.add(relativeDirection279.getTree());


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

        Token Turning283=null;
        Token Heading284=null;
        flipsParser.cardinalDirection_return cardinalDirection280 = null;

        flipsParser.ordinalDirection_return ordinalDirection281 = null;

        flipsParser.subOrdinalDirection_return subOrdinalDirection282 = null;

        flipsParser.cardinalDirection_return cardinalDirection285 = null;

        flipsParser.ordinalDirection_return ordinalDirection286 = null;

        flipsParser.subOrdinalDirection_return subOrdinalDirection287 = null;

        flipsParser.angularValue_return angularValue288 = null;


        CommonTree Turning283_tree=null;
        CommonTree Heading284_tree=null;
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
                    pushFollow(FOLLOW_cardinalDirection_in_fixedDirection2353);
                    cardinalDirection280=cardinalDirection();

                    state._fsp--;

                    stream_cardinalDirection.add(cardinalDirection280.getTree());


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
                    pushFollow(FOLLOW_ordinalDirection_in_fixedDirection2363);
                    ordinalDirection281=ordinalDirection();

                    state._fsp--;

                    stream_ordinalDirection.add(ordinalDirection281.getTree());


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
                    pushFollow(FOLLOW_subOrdinalDirection_in_fixedDirection2373);
                    subOrdinalDirection282=subOrdinalDirection();

                    state._fsp--;

                    stream_subOrdinalDirection.add(subOrdinalDirection282.getTree());


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
                            Turning283=(Token)match(input,Turning,FOLLOW_Turning_in_fixedDirection2384);  
                            stream_Turning.add(Turning283);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:441:13: Heading
                            {
                            Heading284=(Token)match(input,Heading,FOLLOW_Heading_in_fixedDirection2386);  
                            stream_Heading.add(Heading284);


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
                            pushFollow(FOLLOW_cardinalDirection_in_fixedDirection2390);
                            cardinalDirection285=cardinalDirection();

                            state._fsp--;

                            stream_cardinalDirection.add(cardinalDirection285.getTree());

                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:441:41: ordinalDirection
                            {
                            pushFollow(FOLLOW_ordinalDirection_in_fixedDirection2392);
                            ordinalDirection286=ordinalDirection();

                            state._fsp--;

                            stream_ordinalDirection.add(ordinalDirection286.getTree());

                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:441:58: subOrdinalDirection
                            {
                            pushFollow(FOLLOW_subOrdinalDirection_in_fixedDirection2394);
                            subOrdinalDirection287=subOrdinalDirection();

                            state._fsp--;

                            stream_subOrdinalDirection.add(subOrdinalDirection287.getTree());

                            }
                            break;
                        case 4 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:441:78: angularValue
                            {
                            pushFollow(FOLLOW_angularValue_in_fixedDirection2396);
                            angularValue288=angularValue();

                            state._fsp--;

                            stream_angularValue.add(angularValue288.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: subOrdinalDirection, angularValue, cardinalDirection, ordinalDirection
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

        Token Turning289=null;
        Token Heading290=null;
        flipsParser.leftRightDirection_return leftRightDirection291 = null;

        flipsParser.angularValue_return angularValue292 = null;


        CommonTree Turning289_tree=null;
        CommonTree Heading290_tree=null;
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
                    Turning289=(Token)match(input,Turning,FOLLOW_Turning_in_relativeDirection2424);  
                    stream_Turning.add(Turning289);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:446:13: Heading
                    {
                    Heading290=(Token)match(input,Heading,FOLLOW_Heading_in_relativeDirection2426);  
                    stream_Heading.add(Heading290);


                    }
                    break;

            }

            pushFollow(FOLLOW_leftRightDirection_in_relativeDirection2429);
            leftRightDirection291=leftRightDirection();

            state._fsp--;

            stream_leftRightDirection.add(leftRightDirection291.getTree());
            pushFollow(FOLLOW_angularValue_in_relativeDirection2431);
            angularValue292=angularValue();

            state._fsp--;

            stream_angularValue.add(angularValue292.getTree());


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

        flipsParser.northSouthDirection_return northSouthDirection293 = null;

        flipsParser.eastWestDirection_return eastWestDirection294 = null;



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

                    pushFollow(FOLLOW_northSouthDirection_in_cardinalDirection2449);
                    northSouthDirection293=northSouthDirection();

                    state._fsp--;

                    adaptor.addChild(root_0, northSouthDirection293.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:452:4: eastWestDirection
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_eastWestDirection_in_cardinalDirection2454);
                    eastWestDirection294=eastWestDirection();

                    state._fsp--;

                    adaptor.addChild(root_0, eastWestDirection294.getTree());

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

        Token char_literal295=null;
        Token string_literal296=null;
        Token char_literal297=null;
        Token string_literal298=null;

        CommonTree char_literal295_tree=null;
        CommonTree string_literal296_tree=null;
        CommonTree char_literal297_tree=null;
        CommonTree string_literal298_tree=null;
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
                            char_literal295=(Token)match(input,208,FOLLOW_208_in_northSouthDirection2466);  
                            stream_208.add(char_literal295);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:456:9: 'north'
                            {
                            string_literal296=(Token)match(input,209,FOLLOW_209_in_northSouthDirection2468);  
                            stream_209.add(string_literal296);


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
                            char_literal297=(Token)match(input,202,FOLLOW_202_in_northSouthDirection2480);  
                            stream_202.add(char_literal297);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:458:9: 'south'
                            {
                            string_literal298=(Token)match(input,210,FOLLOW_210_in_northSouthDirection2482);  
                            stream_210.add(string_literal298);


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

        Token char_literal299=null;
        Token string_literal300=null;
        Token char_literal301=null;
        Token string_literal302=null;

        CommonTree char_literal299_tree=null;
        CommonTree string_literal300_tree=null;
        CommonTree char_literal301_tree=null;
        CommonTree string_literal302_tree=null;
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
                            char_literal299=(Token)match(input,211,FOLLOW_211_in_eastWestDirection2500);  
                            stream_211.add(char_literal299);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:463:9: 'east'
                            {
                            string_literal300=(Token)match(input,212,FOLLOW_212_in_eastWestDirection2502);  
                            stream_212.add(string_literal300);


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
                            char_literal301=(Token)match(input,213,FOLLOW_213_in_eastWestDirection2514);  
                            stream_213.add(char_literal301);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:465:9: 'west'
                            {
                            string_literal302=(Token)match(input,214,FOLLOW_214_in_eastWestDirection2516);  
                            stream_214.add(string_literal302);


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

        Token string_literal303=null;
        Token string_literal304=null;
        Token string_literal305=null;
        Token string_literal306=null;
        Token string_literal307=null;
        Token string_literal308=null;
        Token string_literal309=null;
        Token string_literal310=null;

        CommonTree string_literal303_tree=null;
        CommonTree string_literal304_tree=null;
        CommonTree string_literal305_tree=null;
        CommonTree string_literal306_tree=null;
        CommonTree string_literal307_tree=null;
        CommonTree string_literal308_tree=null;
        CommonTree string_literal309_tree=null;
        CommonTree string_literal310_tree=null;
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
                            string_literal303=(Token)match(input,215,FOLLOW_215_in_ordinalDirection2534);  
                            stream_215.add(string_literal303);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:470:10: 'northeast'
                            {
                            string_literal304=(Token)match(input,216,FOLLOW_216_in_ordinalDirection2536);  
                            stream_216.add(string_literal304);


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
                            string_literal305=(Token)match(input,217,FOLLOW_217_in_ordinalDirection2550);  
                            stream_217.add(string_literal305);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:472:10: 'southeast'
                            {
                            string_literal306=(Token)match(input,218,FOLLOW_218_in_ordinalDirection2552);  
                            stream_218.add(string_literal306);


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
                            string_literal307=(Token)match(input,219,FOLLOW_219_in_ordinalDirection2566);  
                            stream_219.add(string_literal307);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:474:10: 'southwest'
                            {
                            string_literal308=(Token)match(input,220,FOLLOW_220_in_ordinalDirection2568);  
                            stream_220.add(string_literal308);


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
                            string_literal309=(Token)match(input,221,FOLLOW_221_in_ordinalDirection2582);  
                            stream_221.add(string_literal309);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:476:10: 'northwest'
                            {
                            string_literal310=(Token)match(input,222,FOLLOW_222_in_ordinalDirection2584);  
                            stream_222.add(string_literal310);


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

        Token string_literal311=null;
        Token string_literal312=null;
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

        CommonTree string_literal311_tree=null;
        CommonTree string_literal312_tree=null;
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
                            string_literal311=(Token)match(input,223,FOLLOW_223_in_subOrdinalDirection2604);  
                            stream_223.add(string_literal311);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:481:11: 'north-northeast'
                            {
                            string_literal312=(Token)match(input,224,FOLLOW_224_in_subOrdinalDirection2606);  
                            stream_224.add(string_literal312);


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
                            string_literal313=(Token)match(input,225,FOLLOW_225_in_subOrdinalDirection2622);  
                            stream_225.add(string_literal313);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:483:11: 'east-northeast'
                            {
                            string_literal314=(Token)match(input,226,FOLLOW_226_in_subOrdinalDirection2624);  
                            stream_226.add(string_literal314);


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
                            string_literal315=(Token)match(input,227,FOLLOW_227_in_subOrdinalDirection2640);  
                            stream_227.add(string_literal315);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:485:11: 'east-southeast'
                            {
                            string_literal316=(Token)match(input,228,FOLLOW_228_in_subOrdinalDirection2642);  
                            stream_228.add(string_literal316);


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
                            string_literal317=(Token)match(input,229,FOLLOW_229_in_subOrdinalDirection2658);  
                            stream_229.add(string_literal317);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:487:11: 'south-southeast'
                            {
                            string_literal318=(Token)match(input,230,FOLLOW_230_in_subOrdinalDirection2660);  
                            stream_230.add(string_literal318);


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
                            string_literal319=(Token)match(input,231,FOLLOW_231_in_subOrdinalDirection2676);  
                            stream_231.add(string_literal319);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:489:11: 'south-southwest'
                            {
                            string_literal320=(Token)match(input,232,FOLLOW_232_in_subOrdinalDirection2678);  
                            stream_232.add(string_literal320);


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
                            string_literal321=(Token)match(input,233,FOLLOW_233_in_subOrdinalDirection2694);  
                            stream_233.add(string_literal321);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:491:11: 'west-southwest'
                            {
                            string_literal322=(Token)match(input,234,FOLLOW_234_in_subOrdinalDirection2696);  
                            stream_234.add(string_literal322);


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
                            string_literal323=(Token)match(input,235,FOLLOW_235_in_subOrdinalDirection2712);  
                            stream_235.add(string_literal323);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:493:11: 'west-northwest'
                            {
                            string_literal324=(Token)match(input,236,FOLLOW_236_in_subOrdinalDirection2714);  
                            stream_236.add(string_literal324);


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
                            string_literal325=(Token)match(input,237,FOLLOW_237_in_subOrdinalDirection2730);  
                            stream_237.add(string_literal325);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:495:11: 'north-northwest'
                            {
                            string_literal326=(Token)match(input,238,FOLLOW_238_in_subOrdinalDirection2732);  
                            stream_238.add(string_literal326);


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

        Token Turning327=null;
        flipsParser.clockDirection_return clockDirection328 = null;


        CommonTree Turning327_tree=null;
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
                    Turning327=(Token)match(input,Turning,FOLLOW_Turning_in_loiterDirection2753);  
                    stream_Turning.add(Turning327);


                    }
                    break;

            }

            pushFollow(FOLLOW_clockDirection_in_loiterDirection2756);
            clockDirection328=clockDirection();

            state._fsp--;

            stream_clockDirection.add(clockDirection328.getTree());


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

        Token char_literal329=null;
        Token string_literal330=null;
        Token char_literal331=null;
        Token string_literal332=null;
        Token string_literal333=null;
        Token string_literal334=null;
        Token string_literal335=null;
        Token char_literal336=null;
        Token string_literal337=null;
        Token string_literal338=null;
        Token string_literal339=null;

        CommonTree char_literal329_tree=null;
        CommonTree string_literal330_tree=null;
        CommonTree char_literal331_tree=null;
        CommonTree string_literal332_tree=null;
        CommonTree string_literal333_tree=null;
        CommonTree string_literal334_tree=null;
        CommonTree string_literal335_tree=null;
        CommonTree char_literal336_tree=null;
        CommonTree string_literal337_tree=null;
        CommonTree string_literal338_tree=null;
        CommonTree string_literal339_tree=null;
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
                            char_literal329=(Token)match(input,239,FOLLOW_239_in_upDownDirection2779);  
                            stream_239.add(char_literal329);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:505:9: 'up'
                            {
                            string_literal330=(Token)match(input,240,FOLLOW_240_in_upDownDirection2781);  
                            stream_240.add(string_literal330);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:505:14: 'c'
                            {
                            char_literal331=(Token)match(input,241,FOLLOW_241_in_upDownDirection2783);  
                            stream_241.add(char_literal331);


                            }
                            break;
                        case 4 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:505:18: 'climb'
                            {
                            string_literal332=(Token)match(input,242,FOLLOW_242_in_upDownDirection2785);  
                            stream_242.add(string_literal332);


                            }
                            break;
                        case 5 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:505:26: 'climbing'
                            {
                            string_literal333=(Token)match(input,243,FOLLOW_243_in_upDownDirection2787);  
                            stream_243.add(string_literal333);


                            }
                            break;
                        case 6 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:505:37: 'ascend'
                            {
                            string_literal334=(Token)match(input,244,FOLLOW_244_in_upDownDirection2789);  
                            stream_244.add(string_literal334);


                            }
                            break;
                        case 7 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:505:46: 'ascending'
                            {
                            string_literal335=(Token)match(input,245,FOLLOW_245_in_upDownDirection2791);  
                            stream_245.add(string_literal335);


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
                            char_literal336=(Token)match(input,246,FOLLOW_246_in_upDownDirection2803);  
                            stream_246.add(char_literal336);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:507:9: 'down'
                            {
                            string_literal337=(Token)match(input,247,FOLLOW_247_in_upDownDirection2805);  
                            stream_247.add(string_literal337);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:507:16: 'descend'
                            {
                            string_literal338=(Token)match(input,248,FOLLOW_248_in_upDownDirection2807);  
                            stream_248.add(string_literal338);


                            }
                            break;
                        case 4 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:507:26: 'descending'
                            {
                            string_literal339=(Token)match(input,249,FOLLOW_249_in_upDownDirection2809);  
                            stream_249.add(string_literal339);


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

        Token char_literal340=null;
        Token string_literal341=null;
        Token string_literal342=null;
        Token char_literal343=null;
        Token string_literal344=null;
        Token string_literal345=null;

        CommonTree char_literal340_tree=null;
        CommonTree string_literal341_tree=null;
        CommonTree string_literal342_tree=null;
        CommonTree char_literal343_tree=null;
        CommonTree string_literal344_tree=null;
        CommonTree string_literal345_tree=null;
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
                            char_literal340=(Token)match(input,250,FOLLOW_250_in_leftRightDirection2827);  
                            stream_250.add(char_literal340);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:512:9: 'left'
                            {
                            string_literal341=(Token)match(input,251,FOLLOW_251_in_leftRightDirection2829);  
                            stream_251.add(string_literal341);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:512:16: 'port'
                            {
                            string_literal342=(Token)match(input,252,FOLLOW_252_in_leftRightDirection2831);  
                            stream_252.add(string_literal342);


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
                            char_literal343=(Token)match(input,253,FOLLOW_253_in_leftRightDirection2843);  
                            stream_253.add(char_literal343);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:514:9: 'right'
                            {
                            string_literal344=(Token)match(input,254,FOLLOW_254_in_leftRightDirection2845);  
                            stream_254.add(string_literal344);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:514:17: 'starboard'
                            {
                            string_literal345=(Token)match(input,255,FOLLOW_255_in_leftRightDirection2847);  
                            stream_255.add(string_literal345);


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

        Token string_literal346=null;
        Token string_literal347=null;
        Token string_literal348=null;
        Token string_literal349=null;

        CommonTree string_literal346_tree=null;
        CommonTree string_literal347_tree=null;
        CommonTree string_literal348_tree=null;
        CommonTree string_literal349_tree=null;
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
                            string_literal346=(Token)match(input,256,FOLLOW_256_in_clockDirection2865);  
                            stream_256.add(string_literal346);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:519:10: 'clockwise'
                            {
                            string_literal347=(Token)match(input,257,FOLLOW_257_in_clockDirection2867);  
                            stream_257.add(string_literal347);


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
                            string_literal348=(Token)match(input,258,FOLLOW_258_in_clockDirection2879);  
                            stream_258.add(string_literal348);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:521:11: 'counterclockwise'
                            {
                            string_literal349=(Token)match(input,259,FOLLOW_259_in_clockDirection2881);  
                            stream_259.add(string_literal349);


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

        Token string_literal351=null;
        Token string_literal352=null;
        Token string_literal353=null;
        Token string_literal354=null;
        Token char_literal356=null;
        Token char_literal358=null;
        Token string_literal360=null;
        Token string_literal361=null;
        Token string_literal362=null;
        Token string_literal363=null;
        flipsParser.numericValue_return numericValue350 = null;

        flipsParser.integerValue_return integerValue355 = null;

        flipsParser.numericValue_return numericValue357 = null;

        flipsParser.numericValue_return numericValue359 = null;


        CommonTree string_literal351_tree=null;
        CommonTree string_literal352_tree=null;
        CommonTree string_literal353_tree=null;
        CommonTree string_literal354_tree=null;
        CommonTree char_literal356_tree=null;
        CommonTree char_literal358_tree=null;
        CommonTree string_literal360_tree=null;
        CommonTree string_literal361_tree=null;
        CommonTree string_literal362_tree=null;
        CommonTree string_literal363_tree=null;
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
                case 260:
                case 261:
                case 262:
                case 263:
                    {
                    alt133=1;
                    }
                    break;
                case 246:
                    {
                    alt133=2;
                    }
                    break;
                case 265:
                case 266:
                case 267:
                case 268:
                    {
                    alt133=3;
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
                    pushFollow(FOLLOW_numericValue_in_angularValue2898);
                    numericValue350=numericValue();

                    state._fsp--;

                    stream_numericValue.add(numericValue350.getTree());
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
                            string_literal351=(Token)match(input,260,FOLLOW_260_in_angularValue2901);  
                            stream_260.add(string_literal351);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:526:24: 'degs'
                            {
                            string_literal352=(Token)match(input,261,FOLLOW_261_in_angularValue2903);  
                            stream_261.add(string_literal352);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:526:31: 'degree'
                            {
                            string_literal353=(Token)match(input,262,FOLLOW_262_in_angularValue2905);  
                            stream_262.add(string_literal353);


                            }
                            break;
                        case 4 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:526:40: 'degrees'
                            {
                            string_literal354=(Token)match(input,263,FOLLOW_263_in_angularValue2907);  
                            stream_263.add(string_literal354);


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
                    pushFollow(FOLLOW_integerValue_in_angularValue2920);
                    integerValue355=integerValue();

                    state._fsp--;

                    stream_integerValue.add(integerValue355.getTree());
                    char_literal356=(Token)match(input,246,FOLLOW_246_in_angularValue2922);  
                    stream_246.add(char_literal356);

                    pushFollow(FOLLOW_numericValue_in_angularValue2924);
                    numericValue357=numericValue();

                    state._fsp--;

                    stream_numericValue.add(numericValue357.getTree());
                    char_literal358=(Token)match(input,264,FOLLOW_264_in_angularValue2926);  
                    stream_264.add(char_literal358);



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
                    pushFollow(FOLLOW_numericValue_in_angularValue2942);
                    numericValue359=numericValue();

                    state._fsp--;

                    stream_numericValue.add(numericValue359.getTree());
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
                            string_literal360=(Token)match(input,265,FOLLOW_265_in_angularValue2945);  
                            stream_265.add(string_literal360);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:530:24: 'rads'
                            {
                            string_literal361=(Token)match(input,266,FOLLOW_266_in_angularValue2947);  
                            stream_266.add(string_literal361);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:530:31: 'radian'
                            {
                            string_literal362=(Token)match(input,267,FOLLOW_267_in_angularValue2949);  
                            stream_267.add(string_literal362);


                            }
                            break;
                        case 4 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:530:40: 'radians'
                            {
                            string_literal363=(Token)match(input,268,FOLLOW_268_in_angularValue2951);  
                            stream_268.add(string_literal363);


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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:536:1: waypoint : ( geoCoordinate -> geoCoordinate | Identifier -> ^( WAYPOINT Identifier ) );
    public final flipsParser.waypoint_return waypoint() throws RecognitionException {
        flipsParser.waypoint_return retval = new flipsParser.waypoint_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier365=null;
        flipsParser.geoCoordinate_return geoCoordinate364 = null;


        CommonTree Identifier365_tree=null;
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_geoCoordinate=new RewriteRuleSubtreeStream(adaptor,"rule geoCoordinate");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:537:2: ( geoCoordinate -> geoCoordinate | Identifier -> ^( WAYPOINT Identifier ) )
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( ((LA134_0>=FloatingPointLiteral && LA134_0<=HexLiteral)||(LA134_0>=269 && LA134_0<=270)) ) {
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
                    pushFollow(FOLLOW_geoCoordinate_in_waypoint2972);
                    geoCoordinate364=geoCoordinate();

                    state._fsp--;

                    stream_geoCoordinate.add(geoCoordinate364.getTree());


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
                    // 538:2: -> geoCoordinate
                    {
                        adaptor.addChild(root_0, stream_geoCoordinate.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:539:4: Identifier
                    {
                    Identifier365=(Token)match(input,Identifier,FOLLOW_Identifier_in_waypoint2982);  
                    stream_Identifier.add(Identifier365);



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
                    // 540:2: -> ^( WAYPOINT Identifier )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:540:5: ^( WAYPOINT Identifier )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:543:1: geoCoordinate : latitudeLongitude -> ^( GEOCOORDINATE latitudeLongitude ) ;
    public final flipsParser.geoCoordinate_return geoCoordinate() throws RecognitionException {
        flipsParser.geoCoordinate_return retval = new flipsParser.geoCoordinate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.latitudeLongitude_return latitudeLongitude366 = null;


        RewriteRuleSubtreeStream stream_latitudeLongitude=new RewriteRuleSubtreeStream(adaptor,"rule latitudeLongitude");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:544:2: ( latitudeLongitude -> ^( GEOCOORDINATE latitudeLongitude ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:544:4: latitudeLongitude
            {
            pushFollow(FOLLOW_latitudeLongitude_in_geoCoordinate3002);
            latitudeLongitude366=latitudeLongitude();

            state._fsp--;

            stream_latitudeLongitude.add(latitudeLongitude366.getTree());


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
            // 545:2: -> ^( GEOCOORDINATE latitudeLongitude )
            {
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:545:5: ^( GEOCOORDINATE latitudeLongitude )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:548:1: latitudeLongitude : (x= latitudeLongitudeValue northSouthDirection ( ',' )? y= latitudeLongitudeValue eastWestDirection -> ^( LATITUDE $x northSouthDirection ) ^( LONGITUDE $y eastWestDirection ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y EAST ) | '-' x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y EAST ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y WEST ) | '-' x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y WEST ) );
    public final flipsParser.latitudeLongitude_return latitudeLongitude() throws RecognitionException {
        flipsParser.latitudeLongitude_return retval = new flipsParser.latitudeLongitude_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal368=null;
        Token char_literal370=null;
        Token char_literal371=null;
        Token char_literal372=null;
        Token char_literal373=null;
        Token char_literal374=null;
        Token char_literal375=null;
        Token char_literal376=null;
        Token char_literal377=null;
        Token char_literal378=null;
        Token char_literal379=null;
        Token char_literal380=null;
        Token char_literal381=null;
        flipsParser.latitudeLongitudeValue_return x = null;

        flipsParser.latitudeLongitudeValue_return y = null;

        flipsParser.northSouthDirection_return northSouthDirection367 = null;

        flipsParser.eastWestDirection_return eastWestDirection369 = null;


        CommonTree char_literal368_tree=null;
        CommonTree char_literal370_tree=null;
        CommonTree char_literal371_tree=null;
        CommonTree char_literal372_tree=null;
        CommonTree char_literal373_tree=null;
        CommonTree char_literal374_tree=null;
        CommonTree char_literal375_tree=null;
        CommonTree char_literal376_tree=null;
        CommonTree char_literal377_tree=null;
        CommonTree char_literal378_tree=null;
        CommonTree char_literal379_tree=null;
        CommonTree char_literal380_tree=null;
        CommonTree char_literal381_tree=null;
        RewriteRuleTokenStream stream_270=new RewriteRuleTokenStream(adaptor,"token 270");
        RewriteRuleTokenStream stream_269=new RewriteRuleTokenStream(adaptor,"token 269");
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
        RewriteRuleSubtreeStream stream_latitudeLongitudeValue=new RewriteRuleSubtreeStream(adaptor,"rule latitudeLongitudeValue");
        RewriteRuleSubtreeStream stream_eastWestDirection=new RewriteRuleSubtreeStream(adaptor,"rule eastWestDirection");
        RewriteRuleSubtreeStream stream_northSouthDirection=new RewriteRuleSubtreeStream(adaptor,"rule northSouthDirection");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:549:2: (x= latitudeLongitudeValue northSouthDirection ( ',' )? y= latitudeLongitudeValue eastWestDirection -> ^( LATITUDE $x northSouthDirection ) ^( LONGITUDE $y eastWestDirection ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y EAST ) | '-' x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y EAST ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y WEST ) | '-' x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y WEST ) )
            int alt144=5;
            alt144 = dfa144.predict(input);
            switch (alt144) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:549:4: x= latitudeLongitudeValue northSouthDirection ( ',' )? y= latitudeLongitudeValue eastWestDirection
                    {
                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3024);
                    x=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(x.getTree());
                    pushFollow(FOLLOW_northSouthDirection_in_latitudeLongitude3026);
                    northSouthDirection367=northSouthDirection();

                    state._fsp--;

                    stream_northSouthDirection.add(northSouthDirection367.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:549:49: ( ',' )?
                    int alt135=2;
                    int LA135_0 = input.LA(1);

                    if ( (LA135_0==100) ) {
                        alt135=1;
                    }
                    switch (alt135) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:549:49: ','
                            {
                            char_literal368=(Token)match(input,100,FOLLOW_100_in_latitudeLongitude3028);  
                            stream_100.add(char_literal368);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3033);
                    y=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(y.getTree());
                    pushFollow(FOLLOW_eastWestDirection_in_latitudeLongitude3035);
                    eastWestDirection369=eastWestDirection();

                    state._fsp--;

                    stream_eastWestDirection.add(eastWestDirection369.getTree());


                    // AST REWRITE
                    // elements: northSouthDirection, x, eastWestDirection, y
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
                    // 550:2: -> ^( LATITUDE $x northSouthDirection ) ^( LONGITUDE $y eastWestDirection )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:550:5: ^( LATITUDE $x northSouthDirection )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LATITUDE, "LATITUDE"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, stream_northSouthDirection.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:550:40: ^( LONGITUDE $y eastWestDirection )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:551:4: ( '+' )? x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:551:4: ( '+' )?
                    int alt136=2;
                    int LA136_0 = input.LA(1);

                    if ( (LA136_0==269) ) {
                        alt136=1;
                    }
                    switch (alt136) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:551:4: '+'
                            {
                            char_literal370=(Token)match(input,269,FOLLOW_269_in_latitudeLongitude3061);  
                            stream_269.add(char_literal370);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3066);
                    x=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(x.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:551:34: ( ',' )?
                    int alt137=2;
                    int LA137_0 = input.LA(1);

                    if ( (LA137_0==100) ) {
                        alt137=1;
                    }
                    switch (alt137) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:551:34: ','
                            {
                            char_literal371=(Token)match(input,100,FOLLOW_100_in_latitudeLongitude3068);  
                            stream_100.add(char_literal371);


                            }
                            break;

                    }

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:551:39: ( '+' )?
                    int alt138=2;
                    int LA138_0 = input.LA(1);

                    if ( (LA138_0==269) ) {
                        alt138=1;
                    }
                    switch (alt138) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:551:39: '+'
                            {
                            char_literal372=(Token)match(input,269,FOLLOW_269_in_latitudeLongitude3071);  
                            stream_269.add(char_literal372);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3076);
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
                    // 552:2: -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y EAST )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:552:5: ^( LATITUDE $x NORTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LATITUDE, "LATITUDE"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NORTH, "NORTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:552:26: ^( LONGITUDE $y EAST )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:553:4: '-' x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue
                    {
                    char_literal373=(Token)match(input,270,FOLLOW_270_in_latitudeLongitude3102);  
                    stream_270.add(char_literal373);

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3106);
                    x=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(x.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:553:33: ( ',' )?
                    int alt139=2;
                    int LA139_0 = input.LA(1);

                    if ( (LA139_0==100) ) {
                        alt139=1;
                    }
                    switch (alt139) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:553:33: ','
                            {
                            char_literal374=(Token)match(input,100,FOLLOW_100_in_latitudeLongitude3108);  
                            stream_100.add(char_literal374);


                            }
                            break;

                    }

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:553:38: ( '+' )?
                    int alt140=2;
                    int LA140_0 = input.LA(1);

                    if ( (LA140_0==269) ) {
                        alt140=1;
                    }
                    switch (alt140) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:553:38: '+'
                            {
                            char_literal375=(Token)match(input,269,FOLLOW_269_in_latitudeLongitude3111);  
                            stream_269.add(char_literal375);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3116);
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
                    // 554:2: -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y EAST )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:554:5: ^( LATITUDE $x SOUTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LATITUDE, "LATITUDE"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(SOUTH, "SOUTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:554:26: ^( LONGITUDE $y EAST )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:555:4: ( '+' )? x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:555:4: ( '+' )?
                    int alt141=2;
                    int LA141_0 = input.LA(1);

                    if ( (LA141_0==269) ) {
                        alt141=1;
                    }
                    switch (alt141) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:555:4: '+'
                            {
                            char_literal376=(Token)match(input,269,FOLLOW_269_in_latitudeLongitude3142);  
                            stream_269.add(char_literal376);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3147);
                    x=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(x.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:555:34: ( ',' )?
                    int alt142=2;
                    int LA142_0 = input.LA(1);

                    if ( (LA142_0==100) ) {
                        alt142=1;
                    }
                    switch (alt142) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:555:34: ','
                            {
                            char_literal377=(Token)match(input,100,FOLLOW_100_in_latitudeLongitude3149);  
                            stream_100.add(char_literal377);


                            }
                            break;

                    }

                    char_literal378=(Token)match(input,270,FOLLOW_270_in_latitudeLongitude3152);  
                    stream_270.add(char_literal378);

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3156);
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
                    // 556:2: -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y WEST )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:556:5: ^( LATITUDE $x NORTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LATITUDE, "LATITUDE"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NORTH, "NORTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:556:26: ^( LONGITUDE $y WEST )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:557:4: '-' x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue
                    {
                    char_literal379=(Token)match(input,270,FOLLOW_270_in_latitudeLongitude3182);  
                    stream_270.add(char_literal379);

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3186);
                    x=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(x.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:557:33: ( ',' )?
                    int alt143=2;
                    int LA143_0 = input.LA(1);

                    if ( (LA143_0==100) ) {
                        alt143=1;
                    }
                    switch (alt143) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:557:33: ','
                            {
                            char_literal380=(Token)match(input,100,FOLLOW_100_in_latitudeLongitude3188);  
                            stream_100.add(char_literal380);


                            }
                            break;

                    }

                    char_literal381=(Token)match(input,270,FOLLOW_270_in_latitudeLongitude3191);  
                    stream_270.add(char_literal381);

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3195);
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
                    // 558:2: -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y WEST )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:558:5: ^( LATITUDE $x SOUTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LATITUDE, "LATITUDE"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(SOUTH, "SOUTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:558:26: ^( LONGITUDE $y WEST )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:561:1: latitudeLongitudeValue : ( numericValue -> numericValue DEGREE | angularValue );
    public final flipsParser.latitudeLongitudeValue_return latitudeLongitudeValue() throws RecognitionException {
        flipsParser.latitudeLongitudeValue_return retval = new flipsParser.latitudeLongitudeValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.numericValue_return numericValue382 = null;

        flipsParser.angularValue_return angularValue383 = null;


        RewriteRuleSubtreeStream stream_numericValue=new RewriteRuleSubtreeStream(adaptor,"rule numericValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:562:2: ( numericValue -> numericValue DEGREE | angularValue )
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( ((LA145_0>=BinaryLiteral && LA145_0<=HexLiteral)) ) {
                switch ( input.LA(2) ) {
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
                    alt145=1;
                    }
                    break;
                case 246:
                    {
                    switch ( input.LA(3) ) {
                    case To:
                    case FlightLevel:
                        {
                        alt145=1;
                        }
                        break;
                    case BinaryLiteral:
                    case OctalLiteral:
                    case DecimalLiteral:
                    case HexLiteral:
                        {
                        int LA145_6 = input.LA(4);

                        if ( ((LA145_6>=128 && LA145_6<=145)||(LA145_6>=148 && LA145_6<=165)) ) {
                            alt145=1;
                        }
                        else if ( (LA145_6==264) ) {
                            alt145=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 145, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    case FloatingPointLiteral:
                        {
                        int LA145_7 = input.LA(4);

                        if ( ((LA145_7>=128 && LA145_7<=145)||(LA145_7>=148 && LA145_7<=165)) ) {
                            alt145=1;
                        }
                        else if ( (LA145_7==264) ) {
                            alt145=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 145, 7, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 145, 4, input);

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
                    alt145=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 145, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA145_0==FloatingPointLiteral) ) {
                int LA145_2 = input.LA(2);

                if ( ((LA145_2>=260 && LA145_2<=263)||(LA145_2>=265 && LA145_2<=268)) ) {
                    alt145=2;
                }
                else if ( (LA145_2==EOF||(LA145_2>=Identifier && LA145_2<=With)||(LA145_2>=Turning && LA145_2<=HexLiteral)||(LA145_2>=95 && LA145_2<=97)||(LA145_2>=99 && LA145_2<=100)||(LA145_2>=103 && LA145_2<=116)||(LA145_2>=118 && LA145_2<=119)||(LA145_2>=121 && LA145_2<=122)||LA145_2==125||(LA145_2>=146 && LA145_2<=147)||LA145_2==202||(LA145_2>=207 && LA145_2<=259)||(LA145_2>=269 && LA145_2<=270)) ) {
                    alt145=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 145, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 145, 0, input);

                throw nvae;
            }
            switch (alt145) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:562:4: numericValue
                    {
                    pushFollow(FOLLOW_numericValue_in_latitudeLongitudeValue3227);
                    numericValue382=numericValue();

                    state._fsp--;

                    stream_numericValue.add(numericValue382.getTree());


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
                    // 563:2: -> numericValue DEGREE
                    {
                        adaptor.addChild(root_0, stream_numericValue.nextTree());
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(DEGREE, "DEGREE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:564:4: angularValue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_angularValue_in_latitudeLongitudeValue3239);
                    angularValue383=angularValue();

                    state._fsp--;

                    adaptor.addChild(root_0, angularValue383.getTree());

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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:569:1: numericValue : ( integerValue | FloatingPointLiteral );
    public final flipsParser.numericValue_return numericValue() throws RecognitionException {
        flipsParser.numericValue_return retval = new flipsParser.numericValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FloatingPointLiteral385=null;
        flipsParser.integerValue_return integerValue384 = null;


        CommonTree FloatingPointLiteral385_tree=null;

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:570:2: ( integerValue | FloatingPointLiteral )
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( ((LA146_0>=BinaryLiteral && LA146_0<=HexLiteral)) ) {
                alt146=1;
            }
            else if ( (LA146_0==FloatingPointLiteral) ) {
                alt146=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 146, 0, input);

                throw nvae;
            }
            switch (alt146) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:570:4: integerValue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_integerValue_in_numericValue3252);
                    integerValue384=integerValue();

                    state._fsp--;

                    adaptor.addChild(root_0, integerValue384.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:571:4: FloatingPointLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    FloatingPointLiteral385=(Token)match(input,FloatingPointLiteral,FOLLOW_FloatingPointLiteral_in_numericValue3257); 
                    FloatingPointLiteral385_tree = (CommonTree)adaptor.create(FloatingPointLiteral385);
                    adaptor.addChild(root_0, FloatingPointLiteral385_tree);


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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:574:1: integerValue : ( BinaryLiteral | OctalLiteral | DecimalLiteral | HexLiteral );
    public final flipsParser.integerValue_return integerValue() throws RecognitionException {
        flipsParser.integerValue_return retval = new flipsParser.integerValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set386=null;

        CommonTree set386_tree=null;

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:575:2: ( BinaryLiteral | OctalLiteral | DecimalLiteral | HexLiteral )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set386=(Token)input.LT(1);
            if ( (input.LA(1)>=BinaryLiteral && input.LA(1)<=HexLiteral) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set386));
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:581:1: percentValue : numericValue ( '%' | 'percent' ) -> numericValue PERCENT ;
    public final flipsParser.percentValue_return percentValue() throws RecognitionException {
        flipsParser.percentValue_return retval = new flipsParser.percentValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal388=null;
        Token string_literal389=null;
        flipsParser.numericValue_return numericValue387 = null;


        CommonTree char_literal388_tree=null;
        CommonTree string_literal389_tree=null;
        RewriteRuleTokenStream stream_272=new RewriteRuleTokenStream(adaptor,"token 272");
        RewriteRuleTokenStream stream_271=new RewriteRuleTokenStream(adaptor,"token 271");
        RewriteRuleSubtreeStream stream_numericValue=new RewriteRuleSubtreeStream(adaptor,"rule numericValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:582:2: ( numericValue ( '%' | 'percent' ) -> numericValue PERCENT )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:582:4: numericValue ( '%' | 'percent' )
            {
            pushFollow(FOLLOW_numericValue_in_percentValue3294);
            numericValue387=numericValue();

            state._fsp--;

            stream_numericValue.add(numericValue387.getTree());
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:582:17: ( '%' | 'percent' )
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==271) ) {
                alt147=1;
            }
            else if ( (LA147_0==272) ) {
                alt147=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 147, 0, input);

                throw nvae;
            }
            switch (alt147) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:582:18: '%'
                    {
                    char_literal388=(Token)match(input,271,FOLLOW_271_in_percentValue3297);  
                    stream_271.add(char_literal388);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:582:22: 'percent'
                    {
                    string_literal389=(Token)match(input,272,FOLLOW_272_in_percentValue3299);  
                    stream_272.add(string_literal389);


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
            // 583:2: -> numericValue PERCENT
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
    protected DFA144 dfa144 = new DFA144(this);
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
            "\1\44\3\uffff\1\13\2\uffff\1\43\4\42\37\uffff\1\13\5\uffff"+
            "\5\13\u008d\uffff\2\44",
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
        "\42\uffff\7\10\2\uffff\11\10\4\uffff\7\10\2\uffff\14\10\1\5\3\10"+
        "\2\uffff\7\10\2\uffff\11\10\1\5\3\10";
    static final String DFA31_minS =
        "\1\113\1\112\2\u0094\2\uffff\1\116\2\uffff\2\121\2\uffff\7\u0093"+
        "\2\u009c\11\u0093\1\121\2\u0080\7\112\2\u009c\11\112\1\uffff\3\u0093"+
        "\7\112\2\u009c\20\112\2\u0094\7\112\2\u009c\15\112";
    static final String DFA31_maxS =
        "\1\u0103\1\u010e\2\u0110\2\uffff\1\u0093\2\uffff\2\u0110\2\uffff"+
        "\7\u00b0\2\u009e\11\u00b0\1\u0093\2\u00a5\7\u0103\2\u009e\11\u0103"+
        "\1\uffff\3\u00b0\7\u0103\2\u009e\20\u0103\2\u0110\7\u0103\2\u009e"+
        "\15\u0103";
    static final String DFA31_acceptS =
        "\4\uffff\1\3\1\4\1\uffff\1\5\1\7\2\uffff\1\6\1\2\47\uffff\1\1\64"+
        "\uffff";
    static final String DFA31_specialS =
        "\151\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\10\1\1\1\6\1\uffff\1\4\1\uffff\1\3\4\2\47\uffff\1\5\24\uffff"+
            "\2\5\73\uffff\1\7\37\uffff\13\10\6\uffff\4\4",
            "\1\13\3\uffff\1\10\2\uffff\1\12\4\11\37\uffff\1\10\5\uffff"+
            "\5\10\63\uffff\6\14\124\uffff\2\13",
            "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\26\1\27\1\30\1\25"+
            "\1\31\1\32\1\33\1\34\1\35\1\36\2\uffff\7\14\140\uffff\2\14",
            "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\26\1\27\1\30\1\25"+
            "\1\31\1\32\1\33\1\34\1\35\1\36\2\uffff\7\14\140\uffff\2\14",
            "",
            "",
            "\1\10\2\uffff\1\41\4\40\37\uffff\1\10\5\uffff\2\10\1\37\2\10"+
            "\23\uffff\1\5",
            "",
            "",
            "\5\13\16\uffff\1\13\33\uffff\22\10\2\uffff\1\42\1\43\1\44\1"+
            "\45\1\46\1\47\1\50\1\51\1\53\1\54\1\55\1\52\1\56\1\57\1\60\1"+
            "\61\1\62\1\63\2\uffff\7\14\16\uffff\5\64\10\uffff\1\13\5\uffff"+
            "\3\13\43\uffff\1\13\15\uffff\4\13\1\uffff\6\13\2\14",
            "\5\13\16\uffff\1\13\33\uffff\22\10\2\uffff\1\42\1\43\1\44\1"+
            "\45\1\46\1\47\1\50\1\51\1\53\1\54\1\55\1\52\1\56\1\57\1\60\1"+
            "\61\1\62\1\63\2\uffff\7\14\33\uffff\1\13\5\uffff\3\13\61\uffff"+
            "\4\13\1\uffff\6\13\2\14",
            "",
            "",
            "\1\5\33\uffff\2\14",
            "\1\5\33\uffff\2\14",
            "\1\5\33\uffff\2\14",
            "\1\5\33\uffff\2\14",
            "\1\5\33\uffff\2\14",
            "\1\5\33\uffff\2\14",
            "\1\5\33\uffff\2\14",
            "\1\65\1\66\1\67",
            "\1\26\1\27\1\30",
            "\1\5\33\uffff\2\14",
            "\1\5\33\uffff\2\14",
            "\1\5\33\uffff\2\14",
            "\1\5\33\uffff\2\14",
            "\1\5\33\uffff\2\14",
            "\1\5\33\uffff\2\14",
            "\1\5\33\uffff\2\14",
            "\1\5\33\uffff\2\14",
            "\1\5\33\uffff\2\14",
            "\5\5\50\uffff\2\10\23\uffff\1\5",
            "\22\10\2\uffff\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\101"+
            "\1\102\1\103\1\100\1\104\1\105\1\106\1\107\1\110\1\111",
            "\22\10\2\uffff\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\101"+
            "\1\102\1\103\1\100\1\104\1\105\1\106\1\107\1\110\1\111",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\14\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\14\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\14\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\14\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\14\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\14\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\14\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\1\112\1\113\1\114",
            "\1\53\1\54\1\55",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\14\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\14\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\14\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\14\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\14\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\14\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\14\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\14\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\14\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "",
            "\1\5\33\uffff\2\14",
            "\1\5\33\uffff\2\14",
            "\1\5\33\uffff\2\14",
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
            "\24\uffff\2\10\33\uffff\2\14\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\14\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\27\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\14\36\uffff\1\10\37\uffff\13\10\6"+
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
        "\1\121\2\u0094\11\u00a6\7\u00af\2\u009c\11\u00af\4\uffff\2\u00b3"+
        "\3\u00af\16\u00a6";
    static final String DFA73_maxS =
        "\1\125\2\u0110\11\u00a7\7\u00b0\2\u009e\11\u00b0\4\uffff\2\u00ce"+
        "\3\u00b0\16\u00a7";
    static final String DFA73_acceptS =
        "\36\uffff\1\3\1\4\1\1\1\2\23\uffff";
    static final String DFA73_specialS =
        "\65\uffff}>";
    static final String[] DFA73_transitionS = {
            "\1\2\4\1",
            "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\25\1\26\1\27\1\24"+
            "\1\30\1\31\1\32\1\33\1\34\1\35\2\uffff\1\5\1\6\1\7\1\10\1\11"+
            "\1\12\1\13\140\uffff\1\3\1\4",
            "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\25\1\26\1\27\1\24"+
            "\1\30\1\31\1\32\1\33\1\34\1\35\2\uffff\1\5\1\6\1\7\1\10\1\11"+
            "\1\12\1\13\140\uffff\1\3\1\4",
            "\1\36\1\37",
            "\1\36\1\37",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\42\1\43",
            "\1\42\1\43",
            "\1\42\1\43",
            "\1\42\1\43",
            "\1\42\1\43",
            "\1\42\1\43",
            "\1\42\1\43",
            "\1\44\1\45\1\46",
            "\1\25\1\26\1\27",
            "\1\42\1\43",
            "\1\42\1\43",
            "\1\42\1\43",
            "\1\42\1\43",
            "\1\42\1\43",
            "\1\42\1\43",
            "\1\42\1\43",
            "\1\42\1\43",
            "\1\42\1\43",
            "",
            "",
            "",
            "",
            "\1\54\16\uffff\1\47\1\50\1\51\1\52\1\53\1\55\1\56\1\57\1\60"+
            "\1\61\1\62\1\63\1\64",
            "\1\54\16\uffff\1\47\1\50\1\51\1\52\1\53\1\55\1\56\1\57\1\60"+
            "\1\61\1\62\1\63\1\64",
            "\1\42\1\43",
            "\1\42\1\43",
            "\1\42\1\43",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41",
            "\1\40\1\41"
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
        "\5\uffff\1\11\4\uffff\2\11";
    static final String DFA87_minS =
        "\1\122\1\u00bd\1\122\2\uffff\1\112\1\121\3\uffff\2\112";
    static final String DFA87_maxS =
        "\1\125\1\u00c1\1\125\2\uffff\1\u0103\1\125\3\uffff\2\u0103";
    static final String DFA87_acceptS =
        "\3\uffff\1\4\1\2\2\uffff\1\3\1\1\1\5\2\uffff";
    static final String DFA87_specialS =
        "\14\uffff}>";
    static final String[] DFA87_transitionS = {
            "\4\1",
            "\2\4\2\3\1\2",
            "\4\5",
            "",
            "",
            "\4\11\1\uffff\7\11\27\uffff\10\11\1\uffff\2\11\1\uffff\2\11"+
            "\2\uffff\1\11\24\uffff\2\11\51\uffff\2\10\2\7\1\6\10\uffff\1"+
            "\11\4\uffff\65\11",
            "\1\13\4\12",
            "",
            "",
            "",
            "\4\11\1\uffff\7\11\27\uffff\10\11\1\uffff\2\11\1\uffff\2\11"+
            "\2\uffff\1\11\24\uffff\2\11\51\uffff\2\10\2\7\11\uffff\1\11"+
            "\4\uffff\65\11",
            "\4\11\1\uffff\7\11\27\uffff\10\11\1\uffff\2\11\1\uffff\2\11"+
            "\2\uffff\1\11\24\uffff\2\11\51\uffff\2\10\2\7\11\uffff\1\11"+
            "\4\uffff\65\11"
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
    static final String DFA144_eotS =
        "\64\uffff";
    static final String DFA144_eofS =
        "\64\uffff";
    static final String DFA144_minS =
        "\6\121\1\uffff\11\121\2\uffff\4\121\2\u0108\13\121\1\uffff\4\121"+
        "\1\uffff\5\121\4\u0108\2\121";
    static final String DFA144_maxS =
        "\3\u010e\2\125\1\u010e\1\uffff\4\u010e\1\125\4\u010e\2\uffff\4\u010e"+
        "\2\u0108\4\u010e\1\125\4\u010e\1\125\1\u010e\1\uffff\4\u010e\1\uffff"+
        "\5\u010e\4\u0108\2\u010e";
    static final String DFA144_acceptS =
        "\6\uffff\1\2\11\uffff\1\4\1\1\21\uffff\1\3\4\uffff\1\5\13\uffff";
    static final String DFA144_specialS =
        "\64\uffff}>";
    static final String[] DFA144_transitionS = {
            "\1\2\4\1\u00b7\uffff\1\3\1\4",
            "\5\6\16\uffff\1\5\145\uffff\1\21\5\uffff\3\21\43\uffff\1\13"+
            "\15\uffff\1\14\1\15\1\16\1\17\1\uffff\1\7\1\10\1\11\1\12\1\6"+
            "\1\20",
            "\5\6\16\uffff\1\5\145\uffff\1\21\5\uffff\3\21\61\uffff\1\14"+
            "\1\15\1\16\1\17\1\uffff\1\7\1\10\1\11\1\12\1\6\1\20",
            "\1\23\4\22",
            "\1\25\4\24",
            "\5\6\u00b7\uffff\1\6\1\20",
            "",
            "\5\6\16\uffff\1\5\145\uffff\1\21\5\uffff\3\21\72\uffff\1\6"+
            "\1\20",
            "\5\6\16\uffff\1\5\145\uffff\1\21\5\uffff\3\21\72\uffff\1\6"+
            "\1\20",
            "\5\6\16\uffff\1\5\145\uffff\1\21\5\uffff\3\21\72\uffff\1\6"+
            "\1\20",
            "\5\6\16\uffff\1\5\145\uffff\1\21\5\uffff\3\21\72\uffff\1\6"+
            "\1\20",
            "\1\27\4\26",
            "\5\6\16\uffff\1\5\145\uffff\1\21\5\uffff\3\21\72\uffff\1\6"+
            "\1\20",
            "\5\6\16\uffff\1\5\145\uffff\1\21\5\uffff\3\21\72\uffff\1\6"+
            "\1\20",
            "\5\6\16\uffff\1\5\145\uffff\1\21\5\uffff\3\21\72\uffff\1\6"+
            "\1\20",
            "\5\6\16\uffff\1\5\145\uffff\1\21\5\uffff\3\21\72\uffff\1\6"+
            "\1\20",
            "",
            "",
            "\5\6\16\uffff\1\5\u0091\uffff\1\34\15\uffff\1\35\1\36\1\37"+
            "\1\40\1\uffff\1\30\1\31\1\32\1\33\1\6\1\20",
            "\5\6\16\uffff\1\5\u009f\uffff\1\35\1\36\1\37\1\40\1\uffff\1"+
            "\30\1\31\1\32\1\33\1\6\1\20",
            "\5\43\16\uffff\1\42\u0091\uffff\1\41\15\uffff\1\51\1\52\1\53"+
            "\1\54\1\uffff\1\44\1\45\1\46\1\47\1\43\1\50",
            "\5\43\16\uffff\1\42\u009f\uffff\1\51\1\52\1\53\1\54\1\uffff"+
            "\1\44\1\45\1\46\1\47\1\43\1\50",
            "\1\55",
            "\1\55",
            "\5\6\16\uffff\1\5\u00a8\uffff\1\6\1\20",
            "\5\6\16\uffff\1\5\u00a8\uffff\1\6\1\20",
            "\5\6\16\uffff\1\5\u00a8\uffff\1\6\1\20",
            "\5\6\16\uffff\1\5\u00a8\uffff\1\6\1\20",
            "\1\57\4\56",
            "\5\6\16\uffff\1\5\u00a8\uffff\1\6\1\20",
            "\5\6\16\uffff\1\5\u00a8\uffff\1\6\1\20",
            "\5\6\16\uffff\1\5\u00a8\uffff\1\6\1\20",
            "\5\6\16\uffff\1\5\u00a8\uffff\1\6\1\20",
            "\1\61\4\60",
            "\5\43\u00b7\uffff\1\43\1\50",
            "",
            "\5\43\16\uffff\1\42\u00a8\uffff\1\43\1\50",
            "\5\43\16\uffff\1\42\u00a8\uffff\1\43\1\50",
            "\5\43\16\uffff\1\42\u00a8\uffff\1\43\1\50",
            "\5\43\16\uffff\1\42\u00a8\uffff\1\43\1\50",
            "",
            "\5\43\16\uffff\1\42\u00a8\uffff\1\43\1\50",
            "\5\43\16\uffff\1\42\u00a8\uffff\1\43\1\50",
            "\5\43\16\uffff\1\42\u00a8\uffff\1\43\1\50",
            "\5\43\16\uffff\1\42\u00a8\uffff\1\43\1\50",
            "\5\6\16\uffff\1\5\145\uffff\1\21\5\uffff\3\21\72\uffff\1\6"+
            "\1\20",
            "\1\62",
            "\1\62",
            "\1\63",
            "\1\63",
            "\5\6\16\uffff\1\5\u00a8\uffff\1\6\1\20",
            "\5\43\16\uffff\1\42\u00a8\uffff\1\43\1\50"
    };

    static final short[] DFA144_eot = DFA.unpackEncodedString(DFA144_eotS);
    static final short[] DFA144_eof = DFA.unpackEncodedString(DFA144_eofS);
    static final char[] DFA144_min = DFA.unpackEncodedStringToUnsignedChars(DFA144_minS);
    static final char[] DFA144_max = DFA.unpackEncodedStringToUnsignedChars(DFA144_maxS);
    static final short[] DFA144_accept = DFA.unpackEncodedString(DFA144_acceptS);
    static final short[] DFA144_special = DFA.unpackEncodedString(DFA144_specialS);
    static final short[][] DFA144_transition;

    static {
        int numStates = DFA144_transitionS.length;
        DFA144_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA144_transition[i] = DFA.unpackEncodedString(DFA144_transitionS[i]);
        }
    }

    class DFA144 extends DFA {

        public DFA144(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 144;
            this.eot = DFA144_eot;
            this.eof = DFA144_eof;
            this.min = DFA144_min;
            this.max = DFA144_max;
            this.accept = DFA144_accept;
            this.special = DFA144_special;
            this.transition = DFA144_transition;
        }
        public String getDescription() {
            return "548:1: latitudeLongitude : (x= latitudeLongitudeValue northSouthDirection ( ',' )? y= latitudeLongitudeValue eastWestDirection -> ^( LATITUDE $x northSouthDirection ) ^( LONGITUDE $y eastWestDirection ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y EAST ) | '-' x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y EAST ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y WEST ) | '-' x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y WEST ) );";
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
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue482 = new BitSet(new long[]{0x0000000000000002L,0x0000001800000400L});
    public static final BitSet FOLLOW_99_in_defineCommandValue486 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_100_in_defineCommandValue488 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000400L});
    public static final BitSet FOLLOW_99_in_defineCommandValue490 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_Identifier_in_defineCommandValue495 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_defineCommandValue497 = new BitSet(new long[]{0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue501 = new BitSet(new long[]{0x0000000000000002L,0x0000001800000400L});
    public static final BitSet FOLLOW_Identifier_in_defineCommandValue525 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_defineCommandValue527 = new BitSet(new long[]{0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue531 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_defineCommandValue533 = new BitSet(new long[]{0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue537 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_defineCommandValue539 = new BitSet(new long[]{0x0000000000000002L,0x0000001800000400L});
    public static final BitSet FOLLOW_99_in_defineCommandValue543 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_100_in_defineCommandValue545 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000400L});
    public static final BitSet FOLLOW_99_in_defineCommandValue547 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_Identifier_in_defineCommandValue552 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_defineCommandValue554 = new BitSet(new long[]{0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue558 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_defineCommandValue560 = new BitSet(new long[]{0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue564 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_defineCommandValue566 = new BitSet(new long[]{0x0000000000000002L,0x0000001800000400L});
    public static final BitSet FOLLOW_103_in_defineSensor602 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_104_in_defineSensor604 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_105_in_defineSensor606 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_defineSensorValue_in_defineSensor609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_defineSensorValue625 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_defineSensorValue627 = new BitSet(new long[]{0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_integerValue_in_defineSensorValue631 = new BitSet(new long[]{0x0000000000000002L,0x0000001800000400L});
    public static final BitSet FOLLOW_99_in_defineSensorValue635 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_100_in_defineSensorValue637 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000400L});
    public static final BitSet FOLLOW_99_in_defineSensorValue639 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_Identifier_in_defineSensorValue644 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_defineSensorValue646 = new BitSet(new long[]{0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_integerValue_in_defineSensorValue650 = new BitSet(new long[]{0x0000000000000002L,0x0000001800000400L});
    public static final BitSet FOLLOW_106_in_defineWaypoint681 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_107_in_defineWaypoint683 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_108_in_defineWaypoint685 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_defineWaypointValue_in_defineWaypoint688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_defineWaypointValue704 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_defineWaypointValue706 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L,0x0000000000000000L,0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_geoCoordinate_in_defineWaypointValue708 = new BitSet(new long[]{0x0000000000000002L,0x0000001800000400L});
    public static final BitSet FOLLOW_99_in_defineWaypointValue712 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_100_in_defineWaypointValue714 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000400L});
    public static final BitSet FOLLOW_99_in_defineWaypointValue716 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_Identifier_in_defineWaypointValue721 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_defineWaypointValue723 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L,0x0000000000000000L,0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_geoCoordinate_in_defineWaypointValue725 = new BitSet(new long[]{0x0000000000000002L,0x0000001800000400L});
    public static final BitSet FOLLOW_flyCommand_in_command752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_turnCommand_in_command757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loiterCommand_in_command762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_executeCommand_in_command767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_flyCommand779 = new BitSet(new long[]{0x0000000000000002L,0x06D80000003FB800L,0x0000000000000000L,0xFFFFFFFFFFFF8400L});
    public static final BitSet FOLLOW_110_in_flyCommand781 = new BitSet(new long[]{0x0000000000000002L,0x06D80000003FB800L,0x0000000000000000L,0xFFFFFFFFFFFF8400L});
    public static final BitSet FOLLOW_flyCommandValue_in_flyCommand784 = new BitSet(new long[]{0x0000000000000002L,0x06D80000003FB800L,0x0000000000000000L,0xFFFFFFFFFFFF8400L});
    public static final BitSet FOLLOW_time_in_flyCommandValue806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_direction_in_flyCommandValue811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speed_in_flyCommandValue816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_distance_in_flyCommandValue821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pitch_in_flyCommandValue826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_roll_in_flyCommandValue831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_duration_in_flyCommandValue836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_To_in_flyCommandValue841 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0400L,0x0000000000000000L,0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_waypoint_in_flyCommandValue843 = new BitSet(new long[]{0x0000000000000002L,0x0000001800000000L});
    public static final BitSet FOLLOW_99_in_flyCommandValue847 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0400L,0x0000000000000000L,0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_100_in_flyCommandValue849 = new BitSet(new long[]{0x0000000000000000L,0x00000008003E0400L,0x0000000000000000L,0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_99_in_flyCommandValue851 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0400L,0x0000000000000000L,0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_waypoint_in_flyCommandValue855 = new BitSet(new long[]{0x0000000000000002L,0x0000001800000000L});
    public static final BitSet FOLLOW_altitude_in_flyCommandValue868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_turnCommand880 = new BitSet(new long[]{0x0000000000000002L,0x0000000000018000L,0x0000000000000000L,0x00007FFFFFFF0400L});
    public static final BitSet FOLLOW_112_in_turnCommand882 = new BitSet(new long[]{0x0000000000000002L,0x0000000000018000L,0x0000000000000000L,0x00007FFFFFFF0400L});
    public static final BitSet FOLLOW_turnCommandValue_in_turnCommand885 = new BitSet(new long[]{0x0000000000000002L,0x0000000000018000L,0x0000000000000000L,0x00007FFFFFFF0400L});
    public static final BitSet FOLLOW_direction_in_turnCommandValue907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_loiterCommand919 = new BitSet(new long[]{0x0000000000000002L,0x26D80000003FB800L,0x00000000000C0000L,0xFFFFFFFFFFFF8400L,0x000000000000000FL});
    public static final BitSet FOLLOW_114_in_loiterCommand921 = new BitSet(new long[]{0x0000000000000002L,0x26D80000003FB800L,0x00000000000C0000L,0xFFFFFFFFFFFF8400L,0x000000000000000FL});
    public static final BitSet FOLLOW_loiterCommandValue_in_loiterCommand924 = new BitSet(new long[]{0x0000000000000002L,0x26D80000003FB800L,0x00000000000C0000L,0xFFFFFFFFFFFF8400L,0x000000000000000FL});
    public static final BitSet FOLLOW_time_in_loiterCommandValue946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speed_in_loiterCommandValue951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loiterDirection_in_loiterCommandValue956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_radius_in_loiterCommandValue961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_duration_in_loiterCommandValue966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_At_in_loiterCommandValue971 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0400L,0x0000000000000000L,0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_waypoint_in_loiterCommandValue973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_altitude_in_loiterCommandValue983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_executeCommand994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_executeCommand1008 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_executeCommand1010 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_numericValue_in_executeCommand1012 = new BitSet(new long[]{0x0000000000000000L,0x0000005000000000L});
    public static final BitSet FOLLOW_100_in_executeCommand1015 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_numericValue_in_executeCommand1017 = new BitSet(new long[]{0x0000000000000000L,0x0000005000000000L});
    public static final BitSet FOLLOW_102_in_executeCommand1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_pitch1052 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_116_in_pitch1054 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_angularValue_in_pitch1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_With_in_pitch1072 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_pitch1074 = new BitSet(new long[]{0x0000000000000000L,0x00C0000000000000L});
    public static final BitSet FOLLOW_118_in_pitch1079 = new BitSet(new long[]{0x0000000000000000L,0x01000000003E0000L});
    public static final BitSet FOLLOW_119_in_pitch1081 = new BitSet(new long[]{0x0000000000000000L,0x01000000003E0000L});
    public static final BitSet FOLLOW_120_in_pitch1084 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_angularValue_in_pitch1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_roll1108 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_122_in_roll1110 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_angularValue_in_roll1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fixedAltitude_in_altitude1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relativeAltitude_in_altitude1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_upDownDirection_in_fixedAltitude1152 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_To_in_fixedAltitude1155 = new BitSet(new long[]{0x0000000000000000L,0xF8200000003E4000L,0x0000000000000000L,0xFC00000000000000L});
    public static final BitSet FOLLOW_At_in_fixedAltitude1157 = new BitSet(new long[]{0x0000000000000000L,0xF8200000003E4000L,0x0000000000000000L,0xFC00000000000000L});
    public static final BitSet FOLLOW_With_in_fixedAltitude1159 = new BitSet(new long[]{0x0000000000000000L,0xF8200000003E4000L,0x0000000000000000L,0xFC00000000000000L});
    public static final BitSet FOLLOW_117_in_fixedAltitude1164 = new BitSet(new long[]{0x0000000000000000L,0x1800000000000000L});
    public static final BitSet FOLLOW_123_in_fixedAltitude1168 = new BitSet(new long[]{0x0000000000000000L,0xF9200000003E4000L,0x0000000000000000L,0xFC00000000000000L});
    public static final BitSet FOLLOW_124_in_fixedAltitude1170 = new BitSet(new long[]{0x0000000000000000L,0xF9200000003E4000L,0x0000000000000000L,0xFC00000000000000L});
    public static final BitSet FOLLOW_125_in_fixedAltitude1173 = new BitSet(new long[]{0x0000000000000000L,0xC000000000000000L});
    public static final BitSet FOLLOW_126_in_fixedAltitude1177 = new BitSet(new long[]{0x0000000000000000L,0xF9200000003E4000L,0x0000000000000000L,0xFC00000000000000L});
    public static final BitSet FOLLOW_127_in_fixedAltitude1179 = new BitSet(new long[]{0x0000000000000000L,0xF9200000003E4000L,0x0000000000000000L,0xFC00000000000000L});
    public static final BitSet FOLLOW_120_in_fixedAltitude1183 = new BitSet(new long[]{0x0000000000000000L,0xF8200000003E4000L,0x0000000000000000L,0xFC00000000000000L});
    public static final BitSet FOLLOW_altitudeValue_in_fixedAltitude1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_upDownDirection_in_relativeAltitude1210 = new BitSet(new long[]{0x0000000000000000L,0xF8200000003E4000L,0x0000000000000000L,0xFC00000000000000L});
    public static final BitSet FOLLOW_altitudeValue_in_relativeAltitude1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_distanceValue_in_altitudeValue1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pressureValue_in_altitudeValue1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FlightLevel_in_altitudeValue1260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_pressureValue1278 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000003FFFFL});
    public static final BitSet FOLLOW_pressureUnit_in_pressureValue1280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_pressureUnit1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_pressureUnit1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_pressureUnit1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_pressureUnit1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_pressureUnit1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_pressureUnit1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_pressureUnit1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_pressureUnit1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_pressureUnit1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_pressureUnit1340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_pressureUnit1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_pressureUnit1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_pressureUnit1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_141_in_pressureUnit1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_pressureUnit1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_143_in_pressureUnit1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_144_in_pressureUnit1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_145_in_pressureUnit1376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_radius1396 = new BitSet(new long[]{0x0000000000000000L,0x20000000003E0000L,0x0000000000080000L,0xFC00000000000000L});
    public static final BitSet FOLLOW_With_in_radius1398 = new BitSet(new long[]{0x0000000000000000L,0x20000000003E0000L,0x0000000000080000L,0xFC00000000000000L});
    public static final BitSet FOLLOW_125_in_radius1402 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L,0x0000000000080000L,0xFC00000000000000L});
    public static final BitSet FOLLOW_147_in_radius1406 = new BitSet(new long[]{0x0000000000000000L,0x01000000003E0000L,0x0000000000000000L,0xFC00000000000000L});
    public static final BitSet FOLLOW_120_in_radius1408 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L,0x0000000000000000L,0xFC00000000000000L});
    public static final BitSet FOLLOW_distanceValue_in_radius1411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_distanceValue_in_radius1413 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_147_in_radius1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_leftRightDirection_in_distance1436 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L,0x0000000000000000L,0xFC00000000000000L});
    public static final BitSet FOLLOW_distanceValue_in_distance1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_distanceValue1462 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000003FFFF00000L});
    public static final BitSet FOLLOW_distanceUnit_in_distanceValue1464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_148_in_distanceUnit1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_149_in_distanceUnit1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_150_in_distanceUnit1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_151_in_distanceUnit1492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_152_in_distanceUnit1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_distanceUnit1496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_154_in_distanceUnit1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_155_in_distanceUnit1510 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000070000000L});
    public static final BitSet FOLLOW_156_in_distanceUnit1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_157_in_distanceUnit1515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_158_in_distanceUnit1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_159_in_distanceUnit1532 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000070000000L});
    public static final BitSet FOLLOW_156_in_distanceUnit1537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_157_in_distanceUnit1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_158_in_distanceUnit1541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_160_in_distanceUnit1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_161_in_distanceUnit1555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_162_in_distanceUnit1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_163_in_distanceUnit1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_164_in_distanceUnit1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_165_in_distanceUnit1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fixedSpeed_in_speed1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relativeSpeed_in_speed1597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_optimalSpeed_in_speed1602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_throttleSpeed_in_speed1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_At_in_fixedSpeed1618 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_speedValue_in_fixedSpeed1620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speedValue_in_relativeSpeed1642 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_166_in_relativeSpeed1644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speedValue_in_relativeSpeed1662 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_167_in_relativeSpeed1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_percentValue_in_relativeSpeed1682 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_166_in_relativeSpeed1684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_percentValue_in_relativeSpeed1702 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_167_in_relativeSpeed1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_speedValue1728 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00007F3FFFF00000L});
    public static final BitSet FOLLOW_speedUnit_in_speedValue1730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_168_in_speedUnit1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_169_in_speedUnit1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_170_in_speedUnit1766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_171_in_speedUnit1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_172_in_speedUnit1770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_173_in_speedUnit1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_174_in_speedUnit1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_distanceUnit_in_speedUnit1789 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0001800000000000L});
    public static final BitSet FOLLOW_175_in_speedUnit1792 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L,0x0000000000007FFCL});
    public static final BitSet FOLLOW_176_in_speedUnit1794 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L,0x0000000000007FFCL});
    public static final BitSet FOLLOW_timeUnit_in_speedUnit1797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_At_in_optimalSpeed1815 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x01F8000000000000L});
    public static final BitSet FOLLOW_optimalUnit_in_optimalSpeed1817 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0006000000000000L});
    public static final BitSet FOLLOW_177_in_optimalSpeed1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_178_in_optimalSpeed1822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_179_in_optimalUnit1846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_180_in_optimalUnit1848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_181_in_optimalUnit1860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_182_in_optimalUnit1862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_183_in_optimalUnit1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_184_in_optimalUnit1876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_At_in_throttleSpeed1893 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_throttleValue_in_throttleSpeed1895 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1E00000000000000L});
    public static final BitSet FOLLOW_185_in_throttleSpeed1898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_186_in_throttleSpeed1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_187_in_throttleSpeed1902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_188_in_throttleSpeed1904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_percentValue_in_throttleValue1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_At_in_time1940 = new BitSet(new long[]{0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_timeValue_in_time1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeFormat_in_timeValue1953 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x6000000000000000L});
    public static final BitSet FOLLOW_189_in_timeValue1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_190_in_timeValue1958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_timeValue1975 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x6000000000000000L});
    public static final BitSet FOLLOW_189_in_timeValue1978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_190_in_timeValue1980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeFormat_in_timeValue1999 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_191_in_timeValue2002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_192_in_timeValue2004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_timeValue2021 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_191_in_timeValue2024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_192_in_timeValue2026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeFormat_in_timeValue2045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_timeFormat2069 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_193_in_timeFormat2071 = new BitSet(new long[]{0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_integerValue_in_timeFormat2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_timeFormat2095 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_193_in_timeFormat2097 = new BitSet(new long[]{0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_integerValue_in_timeFormat2101 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_193_in_timeFormat2103 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_numericValue_in_timeFormat2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hour_in_timeUnit2135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_minute_in_timeUnit2140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_second_in_timeUnit2145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_194_in_hour2157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_195_in_hour2159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_196_in_hour2161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_197_in_hour2163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_198_in_hour2165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_179_in_minute2183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_199_in_minute2185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_200_in_minute2187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_201_in_minute2189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_202_in_second2207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_203_in_second2209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_204_in_second2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_205_in_second2213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_206_in_second2215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_207_in_duration2232 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_durationValue_in_duration2234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_durationValue2254 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L,0x0000000000007FFCL});
    public static final BitSet FOLLOW_timeUnit_in_durationValue2256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_durationValue2261 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000000000007CL});
    public static final BitSet FOLLOW_hour_in_durationValue2263 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_numericValue_in_durationValue2265 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L,0x0000000000007FFCL});
    public static final BitSet FOLLOW_minute_in_durationValue2268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_second_in_durationValue2270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_durationValue2276 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000000000007CL});
    public static final BitSet FOLLOW_hour_in_durationValue2278 = new BitSet(new long[]{0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_integerValue_in_durationValue2280 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L,0x0000000000000380L});
    public static final BitSet FOLLOW_minute_in_durationValue2282 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_numericValue_in_durationValue2284 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L,0x0000000000007FFCL});
    public static final BitSet FOLLOW_second_in_durationValue2286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_durationValue2291 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L,0x0000000000000380L});
    public static final BitSet FOLLOW_minute_in_durationValue2293 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_numericValue_in_durationValue2295 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L,0x0000000000007FFCL});
    public static final BitSet FOLLOW_second_in_durationValue2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeFormat_in_durationValue2302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fixedDirection_in_direction2315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relativeDirection_in_direction2331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cardinalDirection_in_fixedDirection2353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ordinalDirection_in_fixedDirection2363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subOrdinalDirection_in_fixedDirection2373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Turning_in_fixedDirection2384 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L,0x0000000000000000L,0x00007FFFFFFF0400L});
    public static final BitSet FOLLOW_Heading_in_fixedDirection2386 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L,0x0000000000000000L,0x00007FFFFFFF0400L});
    public static final BitSet FOLLOW_cardinalDirection_in_fixedDirection2390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ordinalDirection_in_fixedDirection2392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subOrdinalDirection_in_fixedDirection2394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_angularValue_in_fixedDirection2396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Turning_in_relativeDirection2424 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0xFC00000000000000L});
    public static final BitSet FOLLOW_Heading_in_relativeDirection2426 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0xFC00000000000000L});
    public static final BitSet FOLLOW_leftRightDirection_in_relativeDirection2429 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_angularValue_in_relativeDirection2431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_northSouthDirection_in_cardinalDirection2449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eastWestDirection_in_cardinalDirection2454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_208_in_northSouthDirection2466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_209_in_northSouthDirection2468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_202_in_northSouthDirection2480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_210_in_northSouthDirection2482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_211_in_eastWestDirection2500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_212_in_eastWestDirection2502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_213_in_eastWestDirection2514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_214_in_eastWestDirection2516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_215_in_ordinalDirection2534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_216_in_ordinalDirection2536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_217_in_ordinalDirection2550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_218_in_ordinalDirection2552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_219_in_ordinalDirection2566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_220_in_ordinalDirection2568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_221_in_ordinalDirection2582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_222_in_ordinalDirection2584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_223_in_subOrdinalDirection2604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_224_in_subOrdinalDirection2606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_225_in_subOrdinalDirection2622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_226_in_subOrdinalDirection2624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_227_in_subOrdinalDirection2640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_228_in_subOrdinalDirection2642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_229_in_subOrdinalDirection2658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_230_in_subOrdinalDirection2660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_231_in_subOrdinalDirection2676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_232_in_subOrdinalDirection2678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_233_in_subOrdinalDirection2694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_234_in_subOrdinalDirection2696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_235_in_subOrdinalDirection2712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_236_in_subOrdinalDirection2714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_237_in_subOrdinalDirection2730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_238_in_subOrdinalDirection2732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Turning_in_loiterDirection2753 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L,0x0000000000000000L,0x0000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_clockDirection_in_loiterDirection2756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_239_in_upDownDirection2779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_240_in_upDownDirection2781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_241_in_upDownDirection2783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_242_in_upDownDirection2785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_243_in_upDownDirection2787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_244_in_upDownDirection2789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_245_in_upDownDirection2791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_246_in_upDownDirection2803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_247_in_upDownDirection2805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_248_in_upDownDirection2807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_249_in_upDownDirection2809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_250_in_leftRightDirection2827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_251_in_leftRightDirection2829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_252_in_leftRightDirection2831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_253_in_leftRightDirection2843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_254_in_leftRightDirection2845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_255_in_leftRightDirection2847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_256_in_clockDirection2865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_257_in_clockDirection2867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_258_in_clockDirection2879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_259_in_clockDirection2881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_angularValue2898 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_260_in_angularValue2901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_261_in_angularValue2903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_262_in_angularValue2905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_263_in_angularValue2907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_angularValue2920 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_246_in_angularValue2922 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_numericValue_in_angularValue2924 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_264_in_angularValue2926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_angularValue2942 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001E00L});
    public static final BitSet FOLLOW_265_in_angularValue2945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_266_in_angularValue2947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_267_in_angularValue2949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_268_in_angularValue2951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_geoCoordinate_in_waypoint2972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_waypoint2982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_latitudeLongitude_in_geoCoordinate3002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3024 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000070400L});
    public static final BitSet FOLLOW_northSouthDirection_in_latitudeLongitude3026 = new BitSet(new long[]{0x0000000000000000L,0x00000010003E0000L});
    public static final BitSet FOLLOW_100_in_latitudeLongitude3028 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3033 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00000000007F0400L});
    public static final BitSet FOLLOW_eastWestDirection_in_latitudeLongitude3035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_269_in_latitudeLongitude3061 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3066 = new BitSet(new long[]{0x0000000000000000L,0x00000010003E0000L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_100_in_latitudeLongitude3068 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_269_in_latitudeLongitude3071 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_270_in_latitudeLongitude3102 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3106 = new BitSet(new long[]{0x0000000000000000L,0x00000010003E0000L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_100_in_latitudeLongitude3108 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_269_in_latitudeLongitude3111 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_269_in_latitudeLongitude3142 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3147 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_100_in_latitudeLongitude3149 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_270_in_latitudeLongitude3152 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_270_in_latitudeLongitude3182 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3186 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_100_in_latitudeLongitude3188 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_270_in_latitudeLongitude3191 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E0000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_latitudeLongitudeValue3227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_angularValue_in_latitudeLongitudeValue3239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_numericValue3252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FloatingPointLiteral_in_numericValue3257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_integerValue0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_percentValue3294 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_271_in_percentValue3297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_272_in_percentValue3299 = new BitSet(new long[]{0x0000000000000002L});

}