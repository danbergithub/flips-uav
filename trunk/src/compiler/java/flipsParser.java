// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/reunice/Documents/flips-uav/src/compiler/flips.g 2010-02-03 20:44:00

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class flipsParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FLIGHTPLAN", "DEFINE", "COMMAND", "PARAMETER", "FLY", "LOITER", "EXECUTE", "DIRECTION", "TURN", "FIXED", "RELATIVE", "ROLL", "PITCH", "ALTITUDE", "SPEED", "FASTER", "SLOWER", "OPTIMAL", "THROTTLE", "TIME", "AM", "PM", "HOUR24", "DURATION", "RADIUS", "WAYPOINT", "GEOCOORDINATE", "LATITUDE", "LONGITUDE", "HOUR", "MINUTE", "SECOND", "DEGREE", "RADIAN", "DISTANCE", "KILOMETER", "METER", "NAUTICAL", "MILE", "YARD", "FOOT", "LEFT", "RIGHT", "CLOCKWISE", "COUNTERCLOCKWISE", "PERCENT", "FLIGHTLEVEL", "PRESSURE", "KILOPASCAL", "HECTOPASCAL", "PASCAL", "MINIMUM", "MAXIMUM", "CRUISE", "BAR", "MILLIBAR", "ATMOSPHERE", "CLIMB", "DESCEND", "NORTH", "SOUTH", "EAST", "WEST", "EQ", "NE", "LT", "GT", "LE", "GE", "Identifier", "To", "At", "With", "FlightLevel", "Turning", "Heading", "FloatingPointLiteral", "BinaryLiteral", "OctalLiteral", "DecimalLiteral", "HexLiteral", "Digit", "StringLiteral", "NonZeroDigit", "BinaryDigit", "HexDigit", "Exponent", "WS", "Comment", "LineComment", "'def'", "'define'", "'cmd'", "'command'", "'commands'", "'='", "'and'", "','", "'('", "')'", "'wpt'", "'waypoint'", "'waypoints'", "'fly'", "'go'", "'trn'", "'turn'", "'ltr'", "'loiter'", "'pit'", "'pitch'", "'an'", "'aoa'", "'angle of attack'", "'of'", "'rol'", "'roll'", "'alt'", "'altitude'", "'a'", "'pres'", "'pressure'", "'kpa'", "'kilopascal'", "'kilopascals'", "'hpa'", "'hectopascal'", "'hectopascals'", "'pa'", "'pascal'", "'pascals'", "'bar'", "'bars'", "'mbar'", "'millibar'", "'millibars'", "'atm'", "'atms'", "'atmosphere'", "'atmospheres'", "'in'", "'radius'", "'km'", "'kilometer'", "'kilometers'", "'m'", "'meter'", "'meters'", "'nm'", "'nautical'", "'mi'", "'mile'", "'miles'", "'statute'", "'yd'", "'yard'", "'yards'", "'ft'", "'foot'", "'feet'", "'faster'", "'slower'", "'kph'", "'mph'", "'kn'", "'kt'", "'kts'", "'knot'", "'knots'", "'/'", "'per'", "'spd'", "'speed'", "'min'", "'minimum'", "'cru'", "'cruise'", "'max'", "'maximum'", "'pwr'", "'power'", "'thr'", "'throttle'", "'am'", "'a.m.'", "'pm'", "'p.m.'", "':'", "'h'", "'hr'", "'hrs'", "'hour'", "'hours'", "'mins'", "'minute'", "'minutes'", "'s'", "'sec'", "'secs'", "'second'", "'seconds'", "'for'", "'n'", "'north'", "'south'", "'e'", "'east'", "'w'", "'west'", "'ne'", "'northeast'", "'se'", "'southeast'", "'sw'", "'southwest'", "'nw'", "'northwest'", "'nne'", "'north-northeast'", "'ene'", "'east-northeast'", "'ese'", "'east-southeast'", "'sse'", "'south-southeast'", "'ssw'", "'south-southwest'", "'wsw'", "'west-southwest'", "'wnw'", "'west-northwest'", "'nnw'", "'north-northwest'", "'u'", "'up'", "'c'", "'climb'", "'climbing'", "'ascend'", "'ascending'", "'d'", "'down'", "'descend'", "'descending'", "'l'", "'left'", "'port'", "'r'", "'right'", "'starboard'", "'cw'", "'clockwise'", "'ccw'", "'counterclockwise'", "'\\u00B0'", "'deg'", "'degs'", "'degree'", "'degrees'", "'\\''", "'rad'", "'rads'", "'radian'", "'radians'", "'+'", "'-'", "'%'", "'percent'"
    };
    public static final int DIRECTION=11;
    public static final int T__159=159;
    public static final int T__158=158;
    public static final int T__259=259;
    public static final int T__258=258;
    public static final int T__257=257;
    public static final int FIXED=13;
    public static final int T__262=262;
    public static final int T__160=160;
    public static final int T__263=263;
    public static final int GEOCOORDINATE=30;
    public static final int T__260=260;
    public static final int T__261=261;
    public static final int T__266=266;
    public static final int T__267=267;
    public static final int SOUTH=64;
    public static final int T__264=264;
    public static final int FOOT=44;
    public static final int T__265=265;
    public static final int T__167=167;
    public static final int T__168=168;
    public static final int EOF=-1;
    public static final int T__165=165;
    public static final int T__166=166;
    public static final int T__163=163;
    public static final int HECTOPASCAL=53;
    public static final int T__164=164;
    public static final int T__161=161;
    public static final int T__162=162;
    public static final int T__94=94;
    public static final int DISTANCE=38;
    public static final int FASTER=19;
    public static final int T__148=148;
    public static final int T__147=147;
    public static final int To=74;
    public static final int T__149=149;
    public static final int T__247=247;
    public static final int T__246=246;
    public static final int MINIMUM=55;
    public static final int T__249=249;
    public static final int T__248=248;
    public static final int T__250=250;
    public static final int T__251=251;
    public static final int T__252=252;
    public static final int T__253=253;
    public static final int T__254=254;
    public static final int KILOMETER=39;
    public static final int T__255=255;
    public static final int EQ=67;
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
    public static final int GE=72;
    public static final int T__137=137;
    public static final int T__136=136;
    public static final int YARD=43;
    public static final int T__141=141;
    public static final int T__142=142;
    public static final int T__140=140;
    public static final int T__145=145;
    public static final int With=76;
    public static final int DURATION=27;
    public static final int T__146=146;
    public static final int T__143=143;
    public static final int T__144=144;
    public static final int T__126=126;
    public static final int CRUISE=57;
    public static final int T__125=125;
    public static final int T__128=128;
    public static final int T__127=127;
    public static final int WS=91;
    public static final int T__129=129;
    public static final int OPTIMAL=21;
    public static final int BinaryLiteral=81;
    public static final int BinaryDigit=88;
    public static final int THROTTLE=22;
    public static final int T__269=269;
    public static final int FloatingPointLiteral=80;
    public static final int T__268=268;
    public static final int GT=70;
    public static final int T__271=271;
    public static final int METER=40;
    public static final int T__130=130;
    public static final int T__131=131;
    public static final int T__270=270;
    public static final int T__132=132;
    public static final int RADIUS=28;
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
    public static final int EXECUTE=10;
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
    public static final int HexDigit=89;
    public static final int T__223=223;
    public static final int T__222=222;
    public static final int T__221=221;
    public static final int T__220=220;
    public static final int T__202=202;
    public static final int WAYPOINT=29;
    public static final int TIME=23;
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
    public static final int LEFT=45;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int FLIGHTLEVEL=50;
    public static final int T__112=112;
    public static final int T__210=210;
    public static final int AM=24;
    public static final int T__212=212;
    public static final int T__211=211;
    public static final int HexLiteral=84;
    public static final int T__239=239;
    public static final int T__237=237;
    public static final int T__238=238;
    public static final int At=75;
    public static final int T__235=235;
    public static final int T__236=236;
    public static final int PITCH=16;
    public static final int RIGHT=46;
    public static final int RELATIVE=14;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int EAST=65;
    public static final int T__100=100;
    public static final int HOUR=33;
    public static final int T__245=245;
    public static final int T__244=244;
    public static final int T__243=243;
    public static final int ALTITUDE=17;
    public static final int T__242=242;
    public static final int T__241=241;
    public static final int T__240=240;
    public static final int StringLiteral=86;
    public static final int T__228=228;
    public static final int T__229=229;
    public static final int T__224=224;
    public static final int T__225=225;
    public static final int T__226=226;
    public static final int NAUTICAL=41;
    public static final int T__227=227;
    public static final int NonZeroDigit=87;
    public static final int NORTH=63;
    public static final int T__232=232;
    public static final int T__231=231;
    public static final int T__234=234;
    public static final int T__233=233;
    public static final int DESCEND=62;
    public static final int T__230=230;
    public static final int LT=69;
    public static final int OctalLiteral=82;
    public static final int LATITUDE=31;
    public static final int ATMOSPHERE=60;
    public static final int Identifier=73;
    public static final int COMMAND=6;
    public static final int Comment=92;
    public static final int MILLIBAR=59;
    public static final int PARAMETER=7;
    public static final int COUNTERCLOCKWISE=48;
    public static final int FlightLevel=77;
    public static final int NE=68;
    public static final int SECOND=35;
    public static final int CLIMB=61;
    public static final int ROLL=15;
    public static final int HOUR24=26;
    public static final int RADIAN=37;
    public static final int PASCAL=54;
    public static final int DEGREE=36;
    public static final int TURN=12;
    public static final int SLOWER=20;
    public static final int T__200=200;
    public static final int FLY=8;
    public static final int T__201=201;
    public static final int PM=25;
    public static final int LONGITUDE=32;
    public static final int PRESSURE=51;
    public static final int MILE=42;
    public static final int LineComment=93;
    public static final int Exponent=90;
    public static final int DEFINE=5;
    public static final int WEST=66;
    public static final int T__199=199;
    public static final int T__198=198;
    public static final int T__197=197;
    public static final int T__196=196;
    public static final int T__195=195;
    public static final int T__194=194;
    public static final int T__193=193;
    public static final int T__192=192;
    public static final int T__191=191;
    public static final int SPEED=18;
    public static final int T__190=190;
    public static final int T__184=184;
    public static final int T__183=183;
    public static final int T__186=186;
    public static final int T__185=185;
    public static final int T__188=188;
    public static final int T__187=187;
    public static final int PERCENT=49;
    public static final int T__189=189;
    public static final int Heading=79;
    public static final int T__180=180;
    public static final int T__182=182;
    public static final int T__181=181;
    public static final int Digit=85;
    public static final int DecimalLiteral=83;
    public static final int T__175=175;
    public static final int T__174=174;
    public static final int FLIGHTPLAN=4;
    public static final int T__173=173;
    public static final int T__172=172;
    public static final int Turning=78;
    public static final int T__179=179;
    public static final int T__178=178;
    public static final int KILOPASCAL=52;
    public static final int T__177=177;
    public static final int T__176=176;
    public static final int CLOCKWISE=47;
    public static final int T__171=171;
    public static final int T__170=170;
    public static final int LOITER=9;
    public static final int MAXIMUM=56;
    public static final int MINUTE=34;
    public static final int T__169=169;
    public static final int LE=71;
    public static final int BAR=58;

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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:108:1: flightPlan : ( define )* ( command )* -> ^( FLIGHTPLAN ( define )* ( command )* ) ;
    public final flipsParser.flightPlan_return flightPlan() throws RecognitionException {
        flipsParser.flightPlan_return retval = new flipsParser.flightPlan_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.define_return define1 = null;

        flipsParser.command_return command2 = null;


        RewriteRuleSubtreeStream stream_define=new RewriteRuleSubtreeStream(adaptor,"rule define");
        RewriteRuleSubtreeStream stream_command=new RewriteRuleSubtreeStream(adaptor,"rule command");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:109:2: ( ( define )* ( command )* -> ^( FLIGHTPLAN ( define )* ( command )* ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:109:4: ( define )* ( command )*
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:109:4: ( define )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=94 && LA1_0<=95)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:109:4: define
            	    {
            	    pushFollow(FOLLOW_define_in_flightPlan396);
            	    define1=define();

            	    state._fsp--;

            	    stream_define.add(define1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:109:12: ( command )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==Identifier||(LA2_0>=107 && LA2_0<=112)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:109:12: command
            	    {
            	    pushFollow(FOLLOW_command_in_flightPlan399);
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
            // 110:2: -> ^( FLIGHTPLAN ( define )* ( command )* )
            {
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:110:5: ^( FLIGHTPLAN ( define )* ( command )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FLIGHTPLAN, "FLIGHTPLAN"), root_1);

                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:110:18: ( define )*
                while ( stream_define.hasNext() ) {
                    adaptor.addChild(root_1, stream_define.nextTree());

                }
                stream_define.reset();
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:110:26: ( command )*
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:115:1: define : ( defineCommand | defineWaypoint );
    public final flipsParser.define_return define() throws RecognitionException {
        flipsParser.define_return retval = new flipsParser.define_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.defineCommand_return defineCommand3 = null;

        flipsParser.defineWaypoint_return defineWaypoint4 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:116:2: ( defineCommand | defineWaypoint )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==94) ) {
                int LA3_1 = input.LA(2);

                if ( ((LA3_1>=104 && LA3_1<=106)) ) {
                    alt3=2;
                }
                else if ( ((LA3_1>=96 && LA3_1<=98)) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==95) ) {
                int LA3_2 = input.LA(2);

                if ( ((LA3_2>=104 && LA3_2<=106)) ) {
                    alt3=2;
                }
                else if ( ((LA3_2>=96 && LA3_2<=98)) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:116:4: defineCommand
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_defineCommand_in_define426);
                    defineCommand3=defineCommand();

                    state._fsp--;

                    adaptor.addChild(root_0, defineCommand3.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:117:4: defineWaypoint
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_defineWaypoint_in_define431);
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:120:1: defineCommand : ( 'def' | 'define' ) ( 'cmd' | 'command' | 'commands' ) defineCommandValue -> defineCommandValue ;
    public final flipsParser.defineCommand_return defineCommand() throws RecognitionException {
        flipsParser.defineCommand_return retval = new flipsParser.defineCommand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal5=null;
        Token string_literal6=null;
        Token string_literal7=null;
        Token string_literal8=null;
        Token string_literal9=null;
        flipsParser.defineCommandValue_return defineCommandValue10 = null;


        CommonTree string_literal5_tree=null;
        CommonTree string_literal6_tree=null;
        CommonTree string_literal7_tree=null;
        CommonTree string_literal8_tree=null;
        CommonTree string_literal9_tree=null;
        RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
        RewriteRuleTokenStream stream_97=new RewriteRuleTokenStream(adaptor,"token 97");
        RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
        RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
        RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");
        RewriteRuleSubtreeStream stream_defineCommandValue=new RewriteRuleSubtreeStream(adaptor,"rule defineCommandValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:121:2: ( ( 'def' | 'define' ) ( 'cmd' | 'command' | 'commands' ) defineCommandValue -> defineCommandValue )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:121:4: ( 'def' | 'define' ) ( 'cmd' | 'command' | 'commands' ) defineCommandValue
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:121:4: ( 'def' | 'define' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==94) ) {
                alt4=1;
            }
            else if ( (LA4_0==95) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:121:5: 'def'
                    {
                    string_literal5=(Token)match(input,94,FOLLOW_94_in_defineCommand443);  
                    stream_94.add(string_literal5);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:121:11: 'define'
                    {
                    string_literal6=(Token)match(input,95,FOLLOW_95_in_defineCommand445);  
                    stream_95.add(string_literal6);


                    }
                    break;

            }

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:121:21: ( 'cmd' | 'command' | 'commands' )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 96:
                {
                alt5=1;
                }
                break;
            case 97:
                {
                alt5=2;
                }
                break;
            case 98:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:121:22: 'cmd'
                    {
                    string_literal7=(Token)match(input,96,FOLLOW_96_in_defineCommand449);  
                    stream_96.add(string_literal7);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:121:28: 'command'
                    {
                    string_literal8=(Token)match(input,97,FOLLOW_97_in_defineCommand451);  
                    stream_97.add(string_literal8);


                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:121:38: 'commands'
                    {
                    string_literal9=(Token)match(input,98,FOLLOW_98_in_defineCommand453);  
                    stream_98.add(string_literal9);


                    }
                    break;

            }

            pushFollow(FOLLOW_defineCommandValue_in_defineCommand456);
            defineCommandValue10=defineCommandValue();

            state._fsp--;

            stream_defineCommandValue.add(defineCommandValue10.getTree());


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
            // 122:2: -> defineCommandValue
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:125:1: defineCommandValue : ( Identifier '=' cmd= integerValue ( ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue )* -> ( ^( DEFINE Identifier ^( COMMAND $cmd) ) )+ | Identifier '=' cmd= integerValue '(' par= integerValue ')' ( ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue '(' par= integerValue ')' )* -> ( ^( DEFINE Identifier ^( COMMAND $cmd PARAMETER $par) ) )+ );
    public final flipsParser.defineCommandValue_return defineCommandValue() throws RecognitionException {
        flipsParser.defineCommandValue_return retval = new flipsParser.defineCommandValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier11=null;
        Token char_literal12=null;
        Token string_literal13=null;
        Token char_literal14=null;
        Token string_literal15=null;
        Token Identifier16=null;
        Token char_literal17=null;
        Token Identifier18=null;
        Token char_literal19=null;
        Token char_literal20=null;
        Token char_literal21=null;
        Token string_literal22=null;
        Token char_literal23=null;
        Token string_literal24=null;
        Token Identifier25=null;
        Token char_literal26=null;
        Token char_literal27=null;
        Token char_literal28=null;
        flipsParser.integerValue_return cmd = null;

        flipsParser.integerValue_return par = null;


        CommonTree Identifier11_tree=null;
        CommonTree char_literal12_tree=null;
        CommonTree string_literal13_tree=null;
        CommonTree char_literal14_tree=null;
        CommonTree string_literal15_tree=null;
        CommonTree Identifier16_tree=null;
        CommonTree char_literal17_tree=null;
        CommonTree Identifier18_tree=null;
        CommonTree char_literal19_tree=null;
        CommonTree char_literal20_tree=null;
        CommonTree char_literal21_tree=null;
        CommonTree string_literal22_tree=null;
        CommonTree char_literal23_tree=null;
        CommonTree string_literal24_tree=null;
        CommonTree Identifier25_tree=null;
        CommonTree char_literal26_tree=null;
        CommonTree char_literal27_tree=null;
        CommonTree char_literal28_tree=null;
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
        RewriteRuleSubtreeStream stream_integerValue=new RewriteRuleSubtreeStream(adaptor,"rule integerValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:126:2: ( Identifier '=' cmd= integerValue ( ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue )* -> ( ^( DEFINE Identifier ^( COMMAND $cmd) ) )+ | Identifier '=' cmd= integerValue '(' par= integerValue ')' ( ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue '(' par= integerValue ')' )* -> ( ^( DEFINE Identifier ^( COMMAND $cmd PARAMETER $par) ) )+ )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Identifier) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==99) ) {
                    int LA12_2 = input.LA(3);

                    if ( ((LA12_2>=BinaryLiteral && LA12_2<=HexLiteral)) ) {
                        int LA12_3 = input.LA(4);

                        if ( (LA12_3==102) ) {
                            alt12=2;
                        }
                        else if ( (LA12_3==EOF||LA12_3==Identifier||(LA12_3>=94 && LA12_3<=95)||(LA12_3>=100 && LA12_3<=101)||(LA12_3>=107 && LA12_3<=112)) ) {
                            alt12=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 12, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:126:4: Identifier '=' cmd= integerValue ( ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue )*
                    {
                    Identifier11=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineCommandValue472);  
                    stream_Identifier.add(Identifier11);

                    char_literal12=(Token)match(input,99,FOLLOW_99_in_defineCommandValue474);  
                    stream_99.add(char_literal12);

                    pushFollow(FOLLOW_integerValue_in_defineCommandValue478);
                    cmd=integerValue();

                    state._fsp--;

                    stream_integerValue.add(cmd.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:126:36: ( ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==Identifier) ) {
                            int LA8_2 = input.LA(2);

                            if ( (LA8_2==99) ) {
                                alt8=1;
                            }


                        }
                        else if ( ((LA8_0>=100 && LA8_0<=101)) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:126:37: ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue
                    	    {
                    	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:126:37: ( 'and' | ',' ( 'and' )? )?
                    	    int alt7=3;
                    	    int LA7_0 = input.LA(1);

                    	    if ( (LA7_0==100) ) {
                    	        alt7=1;
                    	    }
                    	    else if ( (LA7_0==101) ) {
                    	        alt7=2;
                    	    }
                    	    switch (alt7) {
                    	        case 1 :
                    	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:126:38: 'and'
                    	            {
                    	            string_literal13=(Token)match(input,100,FOLLOW_100_in_defineCommandValue482);  
                    	            stream_100.add(string_literal13);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:126:44: ',' ( 'and' )?
                    	            {
                    	            char_literal14=(Token)match(input,101,FOLLOW_101_in_defineCommandValue484);  
                    	            stream_101.add(char_literal14);

                    	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:126:48: ( 'and' )?
                    	            int alt6=2;
                    	            int LA6_0 = input.LA(1);

                    	            if ( (LA6_0==100) ) {
                    	                alt6=1;
                    	            }
                    	            switch (alt6) {
                    	                case 1 :
                    	                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:126:48: 'and'
                    	                    {
                    	                    string_literal15=(Token)match(input,100,FOLLOW_100_in_defineCommandValue486);  
                    	                    stream_100.add(string_literal15);


                    	                    }
                    	                    break;

                    	            }


                    	            }
                    	            break;

                    	    }

                    	    Identifier16=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineCommandValue491);  
                    	    stream_Identifier.add(Identifier16);

                    	    char_literal17=(Token)match(input,99,FOLLOW_99_in_defineCommandValue493);  
                    	    stream_99.add(char_literal17);

                    	    pushFollow(FOLLOW_integerValue_in_defineCommandValue497);
                    	    cmd=integerValue();

                    	    state._fsp--;

                    	    stream_integerValue.add(cmd.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
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
                    // 127:2: -> ( ^( DEFINE Identifier ^( COMMAND $cmd) ) )+
                    {
                        if ( !(stream_cmd.hasNext()||stream_Identifier.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_cmd.hasNext()||stream_Identifier.hasNext() ) {
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:127:5: ^( DEFINE Identifier ^( COMMAND $cmd) )
                            {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEFINE, "DEFINE"), root_1);

                            adaptor.addChild(root_1, stream_Identifier.nextNode());
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:127:25: ^( COMMAND $cmd)
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:128:4: Identifier '=' cmd= integerValue '(' par= integerValue ')' ( ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue '(' par= integerValue ')' )*
                    {
                    Identifier18=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineCommandValue521);  
                    stream_Identifier.add(Identifier18);

                    char_literal19=(Token)match(input,99,FOLLOW_99_in_defineCommandValue523);  
                    stream_99.add(char_literal19);

                    pushFollow(FOLLOW_integerValue_in_defineCommandValue527);
                    cmd=integerValue();

                    state._fsp--;

                    stream_integerValue.add(cmd.getTree());
                    char_literal20=(Token)match(input,102,FOLLOW_102_in_defineCommandValue529);  
                    stream_102.add(char_literal20);

                    pushFollow(FOLLOW_integerValue_in_defineCommandValue533);
                    par=integerValue();

                    state._fsp--;

                    stream_integerValue.add(par.getTree());
                    char_literal21=(Token)match(input,103,FOLLOW_103_in_defineCommandValue535);  
                    stream_103.add(char_literal21);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:128:61: ( ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue '(' par= integerValue ')' )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==Identifier) ) {
                            int LA11_2 = input.LA(2);

                            if ( (LA11_2==99) ) {
                                alt11=1;
                            }


                        }
                        else if ( ((LA11_0>=100 && LA11_0<=101)) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:128:62: ( 'and' | ',' ( 'and' )? )? Identifier '=' cmd= integerValue '(' par= integerValue ')'
                    	    {
                    	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:128:62: ( 'and' | ',' ( 'and' )? )?
                    	    int alt10=3;
                    	    int LA10_0 = input.LA(1);

                    	    if ( (LA10_0==100) ) {
                    	        alt10=1;
                    	    }
                    	    else if ( (LA10_0==101) ) {
                    	        alt10=2;
                    	    }
                    	    switch (alt10) {
                    	        case 1 :
                    	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:128:63: 'and'
                    	            {
                    	            string_literal22=(Token)match(input,100,FOLLOW_100_in_defineCommandValue539);  
                    	            stream_100.add(string_literal22);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:128:69: ',' ( 'and' )?
                    	            {
                    	            char_literal23=(Token)match(input,101,FOLLOW_101_in_defineCommandValue541);  
                    	            stream_101.add(char_literal23);

                    	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:128:73: ( 'and' )?
                    	            int alt9=2;
                    	            int LA9_0 = input.LA(1);

                    	            if ( (LA9_0==100) ) {
                    	                alt9=1;
                    	            }
                    	            switch (alt9) {
                    	                case 1 :
                    	                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:128:73: 'and'
                    	                    {
                    	                    string_literal24=(Token)match(input,100,FOLLOW_100_in_defineCommandValue543);  
                    	                    stream_100.add(string_literal24);


                    	                    }
                    	                    break;

                    	            }


                    	            }
                    	            break;

                    	    }

                    	    Identifier25=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineCommandValue548);  
                    	    stream_Identifier.add(Identifier25);

                    	    char_literal26=(Token)match(input,99,FOLLOW_99_in_defineCommandValue550);  
                    	    stream_99.add(char_literal26);

                    	    pushFollow(FOLLOW_integerValue_in_defineCommandValue554);
                    	    cmd=integerValue();

                    	    state._fsp--;

                    	    stream_integerValue.add(cmd.getTree());
                    	    char_literal27=(Token)match(input,102,FOLLOW_102_in_defineCommandValue556);  
                    	    stream_102.add(char_literal27);

                    	    pushFollow(FOLLOW_integerValue_in_defineCommandValue560);
                    	    par=integerValue();

                    	    state._fsp--;

                    	    stream_integerValue.add(par.getTree());
                    	    char_literal28=(Token)match(input,103,FOLLOW_103_in_defineCommandValue562);  
                    	    stream_103.add(char_literal28);


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
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
                    // 129:2: -> ( ^( DEFINE Identifier ^( COMMAND $cmd PARAMETER $par) ) )+
                    {
                        if ( !(stream_Identifier.hasNext()||stream_par.hasNext()||stream_cmd.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_Identifier.hasNext()||stream_par.hasNext()||stream_cmd.hasNext() ) {
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:129:5: ^( DEFINE Identifier ^( COMMAND $cmd PARAMETER $par) )
                            {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEFINE, "DEFINE"), root_1);

                            adaptor.addChild(root_1, stream_Identifier.nextNode());
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:129:25: ^( COMMAND $cmd PARAMETER $par)
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

    public static class defineWaypoint_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "defineWaypoint"
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:132:1: defineWaypoint : ( 'def' | 'define' ) ( 'wpt' | 'waypoint' | 'waypoints' ) defineWaypointValue -> defineWaypointValue ;
    public final flipsParser.defineWaypoint_return defineWaypoint() throws RecognitionException {
        flipsParser.defineWaypoint_return retval = new flipsParser.defineWaypoint_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal29=null;
        Token string_literal30=null;
        Token string_literal31=null;
        Token string_literal32=null;
        Token string_literal33=null;
        flipsParser.defineWaypointValue_return defineWaypointValue34 = null;


        CommonTree string_literal29_tree=null;
        CommonTree string_literal30_tree=null;
        CommonTree string_literal31_tree=null;
        CommonTree string_literal32_tree=null;
        CommonTree string_literal33_tree=null;
        RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
        RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleSubtreeStream stream_defineWaypointValue=new RewriteRuleSubtreeStream(adaptor,"rule defineWaypointValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:133:2: ( ( 'def' | 'define' ) ( 'wpt' | 'waypoint' | 'waypoints' ) defineWaypointValue -> defineWaypointValue )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:133:4: ( 'def' | 'define' ) ( 'wpt' | 'waypoint' | 'waypoints' ) defineWaypointValue
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:133:4: ( 'def' | 'define' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==94) ) {
                alt13=1;
            }
            else if ( (LA13_0==95) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:133:5: 'def'
                    {
                    string_literal29=(Token)match(input,94,FOLLOW_94_in_defineWaypoint598);  
                    stream_94.add(string_literal29);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:133:11: 'define'
                    {
                    string_literal30=(Token)match(input,95,FOLLOW_95_in_defineWaypoint600);  
                    stream_95.add(string_literal30);


                    }
                    break;

            }

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:133:21: ( 'wpt' | 'waypoint' | 'waypoints' )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 104:
                {
                alt14=1;
                }
                break;
            case 105:
                {
                alt14=2;
                }
                break;
            case 106:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:133:22: 'wpt'
                    {
                    string_literal31=(Token)match(input,104,FOLLOW_104_in_defineWaypoint604);  
                    stream_104.add(string_literal31);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:133:28: 'waypoint'
                    {
                    string_literal32=(Token)match(input,105,FOLLOW_105_in_defineWaypoint606);  
                    stream_105.add(string_literal32);


                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:133:39: 'waypoints'
                    {
                    string_literal33=(Token)match(input,106,FOLLOW_106_in_defineWaypoint608);  
                    stream_106.add(string_literal33);


                    }
                    break;

            }

            pushFollow(FOLLOW_defineWaypointValue_in_defineWaypoint611);
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
            // 134:2: -> defineWaypointValue
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:137:1: defineWaypointValue : Identifier '=' geoCoordinate ( ( 'and' | ',' ( 'and' )? )? Identifier '=' geoCoordinate )* -> ( ^( DEFINE Identifier geoCoordinate ) )+ ;
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
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
        RewriteRuleSubtreeStream stream_geoCoordinate=new RewriteRuleSubtreeStream(adaptor,"rule geoCoordinate");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:138:2: ( Identifier '=' geoCoordinate ( ( 'and' | ',' ( 'and' )? )? Identifier '=' geoCoordinate )* -> ( ^( DEFINE Identifier geoCoordinate ) )+ )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:138:4: Identifier '=' geoCoordinate ( ( 'and' | ',' ( 'and' )? )? Identifier '=' geoCoordinate )*
            {
            Identifier35=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineWaypointValue627);  
            stream_Identifier.add(Identifier35);

            char_literal36=(Token)match(input,99,FOLLOW_99_in_defineWaypointValue629);  
            stream_99.add(char_literal36);

            pushFollow(FOLLOW_geoCoordinate_in_defineWaypointValue631);
            geoCoordinate37=geoCoordinate();

            state._fsp--;

            stream_geoCoordinate.add(geoCoordinate37.getTree());
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:138:33: ( ( 'and' | ',' ( 'and' )? )? Identifier '=' geoCoordinate )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==Identifier) ) {
                    int LA17_2 = input.LA(2);

                    if ( (LA17_2==99) ) {
                        alt17=1;
                    }


                }
                else if ( ((LA17_0>=100 && LA17_0<=101)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:138:34: ( 'and' | ',' ( 'and' )? )? Identifier '=' geoCoordinate
            	    {
            	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:138:34: ( 'and' | ',' ( 'and' )? )?
            	    int alt16=3;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==100) ) {
            	        alt16=1;
            	    }
            	    else if ( (LA16_0==101) ) {
            	        alt16=2;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:138:35: 'and'
            	            {
            	            string_literal38=(Token)match(input,100,FOLLOW_100_in_defineWaypointValue635);  
            	            stream_100.add(string_literal38);


            	            }
            	            break;
            	        case 2 :
            	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:138:41: ',' ( 'and' )?
            	            {
            	            char_literal39=(Token)match(input,101,FOLLOW_101_in_defineWaypointValue637);  
            	            stream_101.add(char_literal39);

            	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:138:45: ( 'and' )?
            	            int alt15=2;
            	            int LA15_0 = input.LA(1);

            	            if ( (LA15_0==100) ) {
            	                alt15=1;
            	            }
            	            switch (alt15) {
            	                case 1 :
            	                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:138:45: 'and'
            	                    {
            	                    string_literal40=(Token)match(input,100,FOLLOW_100_in_defineWaypointValue639);  
            	                    stream_100.add(string_literal40);


            	                    }
            	                    break;

            	            }


            	            }
            	            break;

            	    }

            	    Identifier41=(Token)match(input,Identifier,FOLLOW_Identifier_in_defineWaypointValue644);  
            	    stream_Identifier.add(Identifier41);

            	    char_literal42=(Token)match(input,99,FOLLOW_99_in_defineWaypointValue646);  
            	    stream_99.add(char_literal42);

            	    pushFollow(FOLLOW_geoCoordinate_in_defineWaypointValue648);
            	    geoCoordinate43=geoCoordinate();

            	    state._fsp--;

            	    stream_geoCoordinate.add(geoCoordinate43.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
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
            // 139:2: -> ( ^( DEFINE Identifier geoCoordinate ) )+
            {
                if ( !(stream_geoCoordinate.hasNext()||stream_Identifier.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_geoCoordinate.hasNext()||stream_Identifier.hasNext() ) {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:139:5: ^( DEFINE Identifier geoCoordinate )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:144:1: command : ( flyCommand | turnCommand | loiterCommand | executeCommand );
    public final flipsParser.command_return command() throws RecognitionException {
        flipsParser.command_return retval = new flipsParser.command_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.flyCommand_return flyCommand44 = null;

        flipsParser.turnCommand_return turnCommand45 = null;

        flipsParser.loiterCommand_return loiterCommand46 = null;

        flipsParser.executeCommand_return executeCommand47 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:145:2: ( flyCommand | turnCommand | loiterCommand | executeCommand )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 107:
            case 108:
                {
                alt18=1;
                }
                break;
            case 109:
            case 110:
                {
                alt18=2;
                }
                break;
            case 111:
            case 112:
                {
                alt18=3;
                }
                break;
            case Identifier:
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:145:4: flyCommand
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_flyCommand_in_command675);
                    flyCommand44=flyCommand();

                    state._fsp--;

                    adaptor.addChild(root_0, flyCommand44.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:146:4: turnCommand
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_turnCommand_in_command680);
                    turnCommand45=turnCommand();

                    state._fsp--;

                    adaptor.addChild(root_0, turnCommand45.getTree());

                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:147:4: loiterCommand
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_loiterCommand_in_command685);
                    loiterCommand46=loiterCommand();

                    state._fsp--;

                    adaptor.addChild(root_0, loiterCommand46.getTree());

                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:148:4: executeCommand
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_executeCommand_in_command690);
                    executeCommand47=executeCommand();

                    state._fsp--;

                    adaptor.addChild(root_0, executeCommand47.getTree());

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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:151:1: flyCommand : ( 'fly' | 'go' ) ( flyCommandValue )* -> ^( FLY ( flyCommandValue )* ) ;
    public final flipsParser.flyCommand_return flyCommand() throws RecognitionException {
        flipsParser.flyCommand_return retval = new flipsParser.flyCommand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal48=null;
        Token string_literal49=null;
        flipsParser.flyCommandValue_return flyCommandValue50 = null;


        CommonTree string_literal48_tree=null;
        CommonTree string_literal49_tree=null;
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleSubtreeStream stream_flyCommandValue=new RewriteRuleSubtreeStream(adaptor,"rule flyCommandValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:152:2: ( ( 'fly' | 'go' ) ( flyCommandValue )* -> ^( FLY ( flyCommandValue )* ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:152:4: ( 'fly' | 'go' ) ( flyCommandValue )*
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:152:4: ( 'fly' | 'go' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==107) ) {
                alt19=1;
            }
            else if ( (LA19_0==108) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:152:5: 'fly'
                    {
                    string_literal48=(Token)match(input,107,FOLLOW_107_in_flyCommand702);  
                    stream_107.add(string_literal48);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:152:11: 'go'
                    {
                    string_literal49=(Token)match(input,108,FOLLOW_108_in_flyCommand704);  
                    stream_108.add(string_literal49);


                    }
                    break;

            }

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:152:17: ( flyCommandValue )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=To && LA20_0<=With)||(LA20_0>=Turning && LA20_0<=HexLiteral)||(LA20_0>=113 && LA20_0<=114)||(LA20_0>=116 && LA20_0<=117)||(LA20_0>=119 && LA20_0<=120)||LA20_0==200||(LA20_0>=205 && LA20_0<=253)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:152:17: flyCommandValue
            	    {
            	    pushFollow(FOLLOW_flyCommandValue_in_flyCommand707);
            	    flyCommandValue50=flyCommandValue();

            	    state._fsp--;

            	    stream_flyCommandValue.add(flyCommandValue50.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
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
            // 153:2: -> ^( FLY ( flyCommandValue )* )
            {
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:153:5: ^( FLY ( flyCommandValue )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FLY, "FLY"), root_1);

                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:153:11: ( flyCommandValue )*
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:156:1: flyCommandValue : ( time | direction | speed | distance | pitch | roll | duration | To waypoint ( ( 'and' | ',' ( 'and' )? ) waypoint )* -> ( waypoint )+ | altitude );
    public final flipsParser.flyCommandValue_return flyCommandValue() throws RecognitionException {
        flipsParser.flyCommandValue_return retval = new flipsParser.flyCommandValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token To58=null;
        Token string_literal60=null;
        Token char_literal61=null;
        Token string_literal62=null;
        flipsParser.time_return time51 = null;

        flipsParser.direction_return direction52 = null;

        flipsParser.speed_return speed53 = null;

        flipsParser.distance_return distance54 = null;

        flipsParser.pitch_return pitch55 = null;

        flipsParser.roll_return roll56 = null;

        flipsParser.duration_return duration57 = null;

        flipsParser.waypoint_return waypoint59 = null;

        flipsParser.waypoint_return waypoint63 = null;

        flipsParser.altitude_return altitude64 = null;


        CommonTree To58_tree=null;
        CommonTree string_literal60_tree=null;
        CommonTree char_literal61_tree=null;
        CommonTree string_literal62_tree=null;
        RewriteRuleTokenStream stream_To=new RewriteRuleTokenStream(adaptor,"token To");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
        RewriteRuleSubtreeStream stream_waypoint=new RewriteRuleSubtreeStream(adaptor,"rule waypoint");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:157:2: ( time | direction | speed | distance | pitch | roll | duration | To waypoint ( ( 'and' | ',' ( 'and' )? ) waypoint )* -> ( waypoint )+ | altitude )
            int alt24=9;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:157:4: time
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_time_in_flyCommandValue729);
                    time51=time();

                    state._fsp--;

                    adaptor.addChild(root_0, time51.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:158:4: direction
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_direction_in_flyCommandValue734);
                    direction52=direction();

                    state._fsp--;

                    adaptor.addChild(root_0, direction52.getTree());

                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:159:4: speed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_speed_in_flyCommandValue739);
                    speed53=speed();

                    state._fsp--;

                    adaptor.addChild(root_0, speed53.getTree());

                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:160:4: distance
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_distance_in_flyCommandValue744);
                    distance54=distance();

                    state._fsp--;

                    adaptor.addChild(root_0, distance54.getTree());

                    }
                    break;
                case 5 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:161:4: pitch
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_pitch_in_flyCommandValue749);
                    pitch55=pitch();

                    state._fsp--;

                    adaptor.addChild(root_0, pitch55.getTree());

                    }
                    break;
                case 6 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:162:4: roll
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_roll_in_flyCommandValue754);
                    roll56=roll();

                    state._fsp--;

                    adaptor.addChild(root_0, roll56.getTree());

                    }
                    break;
                case 7 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:163:4: duration
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_duration_in_flyCommandValue759);
                    duration57=duration();

                    state._fsp--;

                    adaptor.addChild(root_0, duration57.getTree());

                    }
                    break;
                case 8 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:164:4: To waypoint ( ( 'and' | ',' ( 'and' )? ) waypoint )*
                    {
                    To58=(Token)match(input,To,FOLLOW_To_in_flyCommandValue764);  
                    stream_To.add(To58);

                    pushFollow(FOLLOW_waypoint_in_flyCommandValue766);
                    waypoint59=waypoint();

                    state._fsp--;

                    stream_waypoint.add(waypoint59.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:164:16: ( ( 'and' | ',' ( 'and' )? ) waypoint )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( ((LA23_0>=100 && LA23_0<=101)) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:164:17: ( 'and' | ',' ( 'and' )? ) waypoint
                    	    {
                    	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:164:17: ( 'and' | ',' ( 'and' )? )
                    	    int alt22=2;
                    	    int LA22_0 = input.LA(1);

                    	    if ( (LA22_0==100) ) {
                    	        alt22=1;
                    	    }
                    	    else if ( (LA22_0==101) ) {
                    	        alt22=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 22, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt22) {
                    	        case 1 :
                    	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:164:18: 'and'
                    	            {
                    	            string_literal60=(Token)match(input,100,FOLLOW_100_in_flyCommandValue770);  
                    	            stream_100.add(string_literal60);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:164:24: ',' ( 'and' )?
                    	            {
                    	            char_literal61=(Token)match(input,101,FOLLOW_101_in_flyCommandValue772);  
                    	            stream_101.add(char_literal61);

                    	            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:164:28: ( 'and' )?
                    	            int alt21=2;
                    	            int LA21_0 = input.LA(1);

                    	            if ( (LA21_0==100) ) {
                    	                alt21=1;
                    	            }
                    	            switch (alt21) {
                    	                case 1 :
                    	                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:164:28: 'and'
                    	                    {
                    	                    string_literal62=(Token)match(input,100,FOLLOW_100_in_flyCommandValue774);  
                    	                    stream_100.add(string_literal62);


                    	                    }
                    	                    break;

                    	            }


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_waypoint_in_flyCommandValue778);
                    	    waypoint63=waypoint();

                    	    state._fsp--;

                    	    stream_waypoint.add(waypoint63.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop23;
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
                    // 165:2: -> ( waypoint )+
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:166:4: altitude
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_altitude_in_flyCommandValue791);
                    altitude64=altitude();

                    state._fsp--;

                    adaptor.addChild(root_0, altitude64.getTree());

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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:169:1: turnCommand : ( 'trn' | 'turn' ) ( turnCommandValue )* -> ^( FLY ( turnCommandValue )* ) ;
    public final flipsParser.turnCommand_return turnCommand() throws RecognitionException {
        flipsParser.turnCommand_return retval = new flipsParser.turnCommand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal65=null;
        Token string_literal66=null;
        flipsParser.turnCommandValue_return turnCommandValue67 = null;


        CommonTree string_literal65_tree=null;
        CommonTree string_literal66_tree=null;
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleSubtreeStream stream_turnCommandValue=new RewriteRuleSubtreeStream(adaptor,"rule turnCommandValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:170:2: ( ( 'trn' | 'turn' ) ( turnCommandValue )* -> ^( FLY ( turnCommandValue )* ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:170:4: ( 'trn' | 'turn' ) ( turnCommandValue )*
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:170:4: ( 'trn' | 'turn' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==109) ) {
                alt25=1;
            }
            else if ( (LA25_0==110) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:170:5: 'trn'
                    {
                    string_literal65=(Token)match(input,109,FOLLOW_109_in_turnCommand803);  
                    stream_109.add(string_literal65);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:170:11: 'turn'
                    {
                    string_literal66=(Token)match(input,110,FOLLOW_110_in_turnCommand805);  
                    stream_110.add(string_literal66);


                    }
                    break;

            }

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:170:19: ( turnCommandValue )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=Turning && LA26_0<=Heading)||LA26_0==200||(LA26_0>=206 && LA26_0<=236)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:170:19: turnCommandValue
            	    {
            	    pushFollow(FOLLOW_turnCommandValue_in_turnCommand808);
            	    turnCommandValue67=turnCommandValue();

            	    state._fsp--;

            	    stream_turnCommandValue.add(turnCommandValue67.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
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
            // 171:2: -> ^( FLY ( turnCommandValue )* )
            {
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:171:5: ^( FLY ( turnCommandValue )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FLY, "FLY"), root_1);

                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:171:11: ( turnCommandValue )*
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:174:1: turnCommandValue : direction ;
    public final flipsParser.turnCommandValue_return turnCommandValue() throws RecognitionException {
        flipsParser.turnCommandValue_return retval = new flipsParser.turnCommandValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.direction_return direction68 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:175:2: ( direction )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:175:4: direction
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_direction_in_turnCommandValue830);
            direction68=direction();

            state._fsp--;

            adaptor.addChild(root_0, direction68.getTree());

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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:178:1: loiterCommand : ( 'ltr' | 'loiter' ) ( loiterCommandValue )* -> ^( LOITER ( loiterCommandValue )* ) ;
    public final flipsParser.loiterCommand_return loiterCommand() throws RecognitionException {
        flipsParser.loiterCommand_return retval = new flipsParser.loiterCommand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal69=null;
        Token string_literal70=null;
        flipsParser.loiterCommandValue_return loiterCommandValue71 = null;


        CommonTree string_literal69_tree=null;
        CommonTree string_literal70_tree=null;
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleSubtreeStream stream_loiterCommandValue=new RewriteRuleSubtreeStream(adaptor,"rule loiterCommandValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:179:2: ( ( 'ltr' | 'loiter' ) ( loiterCommandValue )* -> ^( LOITER ( loiterCommandValue )* ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:179:4: ( 'ltr' | 'loiter' ) ( loiterCommandValue )*
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:179:4: ( 'ltr' | 'loiter' )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:179:5: 'ltr'
                    {
                    string_literal69=(Token)match(input,111,FOLLOW_111_in_loiterCommand842);  
                    stream_111.add(string_literal69);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:179:11: 'loiter'
                    {
                    string_literal70=(Token)match(input,112,FOLLOW_112_in_loiterCommand844);  
                    stream_112.add(string_literal70);


                    }
                    break;

            }

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:179:21: ( loiterCommandValue )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=To && LA28_0<=With)||LA28_0==Turning||(LA28_0>=FloatingPointLiteral && LA28_0<=HexLiteral)||LA28_0==123||(LA28_0>=144 && LA28_0<=145)||LA28_0==205||(LA28_0>=237 && LA28_0<=247)||(LA28_0>=254 && LA28_0<=257)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:179:21: loiterCommandValue
            	    {
            	    pushFollow(FOLLOW_loiterCommandValue_in_loiterCommand847);
            	    loiterCommandValue71=loiterCommandValue();

            	    state._fsp--;

            	    stream_loiterCommandValue.add(loiterCommandValue71.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
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
            // 180:2: -> ^( LOITER ( loiterCommandValue )* )
            {
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:180:5: ^( LOITER ( loiterCommandValue )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LOITER, "LOITER"), root_1);

                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:180:14: ( loiterCommandValue )*
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:183:1: loiterCommandValue : ( time | speed | loiterDirection | radius | duration | At waypoint -> waypoint | altitude );
    public final flipsParser.loiterCommandValue_return loiterCommandValue() throws RecognitionException {
        flipsParser.loiterCommandValue_return retval = new flipsParser.loiterCommandValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token At77=null;
        flipsParser.time_return time72 = null;

        flipsParser.speed_return speed73 = null;

        flipsParser.loiterDirection_return loiterDirection74 = null;

        flipsParser.radius_return radius75 = null;

        flipsParser.duration_return duration76 = null;

        flipsParser.waypoint_return waypoint78 = null;

        flipsParser.altitude_return altitude79 = null;


        CommonTree At77_tree=null;
        RewriteRuleTokenStream stream_At=new RewriteRuleTokenStream(adaptor,"token At");
        RewriteRuleSubtreeStream stream_waypoint=new RewriteRuleSubtreeStream(adaptor,"rule waypoint");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:184:2: ( time | speed | loiterDirection | radius | duration | At waypoint -> waypoint | altitude )
            int alt29=7;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:184:4: time
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_time_in_loiterCommandValue869);
                    time72=time();

                    state._fsp--;

                    adaptor.addChild(root_0, time72.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:185:4: speed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_speed_in_loiterCommandValue874);
                    speed73=speed();

                    state._fsp--;

                    adaptor.addChild(root_0, speed73.getTree());

                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:186:4: loiterDirection
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_loiterDirection_in_loiterCommandValue879);
                    loiterDirection74=loiterDirection();

                    state._fsp--;

                    adaptor.addChild(root_0, loiterDirection74.getTree());

                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:187:4: radius
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_radius_in_loiterCommandValue884);
                    radius75=radius();

                    state._fsp--;

                    adaptor.addChild(root_0, radius75.getTree());

                    }
                    break;
                case 5 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:188:4: duration
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_duration_in_loiterCommandValue889);
                    duration76=duration();

                    state._fsp--;

                    adaptor.addChild(root_0, duration76.getTree());

                    }
                    break;
                case 6 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:189:4: At waypoint
                    {
                    At77=(Token)match(input,At,FOLLOW_At_in_loiterCommandValue894);  
                    stream_At.add(At77);

                    pushFollow(FOLLOW_waypoint_in_loiterCommandValue896);
                    waypoint78=waypoint();

                    state._fsp--;

                    stream_waypoint.add(waypoint78.getTree());


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
                    // 190:2: -> waypoint
                    {
                        adaptor.addChild(root_0, stream_waypoint.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:191:4: altitude
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_altitude_in_loiterCommandValue906);
                    altitude79=altitude();

                    state._fsp--;

                    adaptor.addChild(root_0, altitude79.getTree());

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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:194:1: executeCommand : ( Identifier -> ^( EXECUTE Identifier ) | Identifier '(' numericValue ( ',' numericValue )* ')' -> ^( EXECUTE Identifier ( ^( PARAMETER numericValue ) )+ ) );
    public final flipsParser.executeCommand_return executeCommand() throws RecognitionException {
        flipsParser.executeCommand_return retval = new flipsParser.executeCommand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier80=null;
        Token Identifier81=null;
        Token char_literal82=null;
        Token char_literal84=null;
        Token char_literal86=null;
        flipsParser.numericValue_return numericValue83 = null;

        flipsParser.numericValue_return numericValue85 = null;


        CommonTree Identifier80_tree=null;
        CommonTree Identifier81_tree=null;
        CommonTree char_literal82_tree=null;
        CommonTree char_literal84_tree=null;
        CommonTree char_literal86_tree=null;
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleSubtreeStream stream_numericValue=new RewriteRuleSubtreeStream(adaptor,"rule numericValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:195:2: ( Identifier -> ^( EXECUTE Identifier ) | Identifier '(' numericValue ( ',' numericValue )* ')' -> ^( EXECUTE Identifier ( ^( PARAMETER numericValue ) )+ ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==Identifier) ) {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==102) ) {
                    alt31=2;
                }
                else if ( (LA31_1==EOF||LA31_1==Identifier||(LA31_1>=107 && LA31_1<=112)) ) {
                    alt31=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:195:4: Identifier
                    {
                    Identifier80=(Token)match(input,Identifier,FOLLOW_Identifier_in_executeCommand917);  
                    stream_Identifier.add(Identifier80);



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
                    // 196:2: -> ^( EXECUTE Identifier )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:196:5: ^( EXECUTE Identifier )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:197:4: Identifier '(' numericValue ( ',' numericValue )* ')'
                    {
                    Identifier81=(Token)match(input,Identifier,FOLLOW_Identifier_in_executeCommand931);  
                    stream_Identifier.add(Identifier81);

                    char_literal82=(Token)match(input,102,FOLLOW_102_in_executeCommand933);  
                    stream_102.add(char_literal82);

                    pushFollow(FOLLOW_numericValue_in_executeCommand935);
                    numericValue83=numericValue();

                    state._fsp--;

                    stream_numericValue.add(numericValue83.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:197:32: ( ',' numericValue )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==101) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:197:33: ',' numericValue
                    	    {
                    	    char_literal84=(Token)match(input,101,FOLLOW_101_in_executeCommand938);  
                    	    stream_101.add(char_literal84);

                    	    pushFollow(FOLLOW_numericValue_in_executeCommand940);
                    	    numericValue85=numericValue();

                    	    state._fsp--;

                    	    stream_numericValue.add(numericValue85.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    char_literal86=(Token)match(input,103,FOLLOW_103_in_executeCommand945);  
                    stream_103.add(char_literal86);



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
                    // 198:2: -> ^( EXECUTE Identifier ( ^( PARAMETER numericValue ) )+ )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:198:5: ^( EXECUTE Identifier ( ^( PARAMETER numericValue ) )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXECUTE, "EXECUTE"), root_1);

                        adaptor.addChild(root_1, stream_Identifier.nextNode());
                        if ( !(stream_numericValue.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_numericValue.hasNext() ) {
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:198:26: ^( PARAMETER numericValue )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:203:1: pitch : ( ( 'pit' | 'pitch' ) angularValue -> ^( PITCH angularValue ) | ( With 'an' )? ( 'aoa' | 'angle of attack' ) ( 'of' )? angularValue -> ^( PITCH angularValue ) );
    public final flipsParser.pitch_return pitch() throws RecognitionException {
        flipsParser.pitch_return retval = new flipsParser.pitch_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal87=null;
        Token string_literal88=null;
        Token With90=null;
        Token string_literal91=null;
        Token string_literal92=null;
        Token string_literal93=null;
        Token string_literal94=null;
        flipsParser.angularValue_return angularValue89 = null;

        flipsParser.angularValue_return angularValue95 = null;


        CommonTree string_literal87_tree=null;
        CommonTree string_literal88_tree=null;
        CommonTree With90_tree=null;
        CommonTree string_literal91_tree=null;
        CommonTree string_literal92_tree=null;
        CommonTree string_literal93_tree=null;
        CommonTree string_literal94_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_With=new RewriteRuleTokenStream(adaptor,"token With");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_angularValue=new RewriteRuleSubtreeStream(adaptor,"rule angularValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:204:2: ( ( 'pit' | 'pitch' ) angularValue -> ^( PITCH angularValue ) | ( With 'an' )? ( 'aoa' | 'angle of attack' ) ( 'of' )? angularValue -> ^( PITCH angularValue ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=113 && LA36_0<=114)) ) {
                alt36=1;
            }
            else if ( (LA36_0==With||(LA36_0>=116 && LA36_0<=117)) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:204:4: ( 'pit' | 'pitch' ) angularValue
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:204:4: ( 'pit' | 'pitch' )
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==113) ) {
                        alt32=1;
                    }
                    else if ( (LA32_0==114) ) {
                        alt32=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 0, input);

                        throw nvae;
                    }
                    switch (alt32) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:204:5: 'pit'
                            {
                            string_literal87=(Token)match(input,113,FOLLOW_113_in_pitch975);  
                            stream_113.add(string_literal87);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:204:11: 'pitch'
                            {
                            string_literal88=(Token)match(input,114,FOLLOW_114_in_pitch977);  
                            stream_114.add(string_literal88);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_angularValue_in_pitch980);
                    angularValue89=angularValue();

                    state._fsp--;

                    stream_angularValue.add(angularValue89.getTree());


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
                    // 205:2: -> ^( PITCH angularValue )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:205:5: ^( PITCH angularValue )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:206:4: ( With 'an' )? ( 'aoa' | 'angle of attack' ) ( 'of' )? angularValue
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:206:4: ( With 'an' )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==With) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:206:5: With 'an'
                            {
                            With90=(Token)match(input,With,FOLLOW_With_in_pitch995);  
                            stream_With.add(With90);

                            string_literal91=(Token)match(input,115,FOLLOW_115_in_pitch997);  
                            stream_115.add(string_literal91);


                            }
                            break;

                    }

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:206:17: ( 'aoa' | 'angle of attack' )
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==116) ) {
                        alt34=1;
                    }
                    else if ( (LA34_0==117) ) {
                        alt34=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 0, input);

                        throw nvae;
                    }
                    switch (alt34) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:206:18: 'aoa'
                            {
                            string_literal92=(Token)match(input,116,FOLLOW_116_in_pitch1002);  
                            stream_116.add(string_literal92);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:206:24: 'angle of attack'
                            {
                            string_literal93=(Token)match(input,117,FOLLOW_117_in_pitch1004);  
                            stream_117.add(string_literal93);


                            }
                            break;

                    }

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:206:43: ( 'of' )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==118) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:206:43: 'of'
                            {
                            string_literal94=(Token)match(input,118,FOLLOW_118_in_pitch1007);  
                            stream_118.add(string_literal94);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_angularValue_in_pitch1010);
                    angularValue95=angularValue();

                    state._fsp--;

                    stream_angularValue.add(angularValue95.getTree());


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
                    // 207:2: -> ^( PITCH angularValue )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:207:5: ^( PITCH angularValue )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:210:1: roll : ( 'rol' | 'roll' ) angularValue -> ^( ROLL angularValue ) ;
    public final flipsParser.roll_return roll() throws RecognitionException {
        flipsParser.roll_return retval = new flipsParser.roll_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal96=null;
        Token string_literal97=null;
        flipsParser.angularValue_return angularValue98 = null;


        CommonTree string_literal96_tree=null;
        CommonTree string_literal97_tree=null;
        RewriteRuleTokenStream stream_120=new RewriteRuleTokenStream(adaptor,"token 120");
        RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");
        RewriteRuleSubtreeStream stream_angularValue=new RewriteRuleSubtreeStream(adaptor,"rule angularValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:211:2: ( ( 'rol' | 'roll' ) angularValue -> ^( ROLL angularValue ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:211:4: ( 'rol' | 'roll' ) angularValue
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:211:4: ( 'rol' | 'roll' )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==119) ) {
                alt37=1;
            }
            else if ( (LA37_0==120) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:211:5: 'rol'
                    {
                    string_literal96=(Token)match(input,119,FOLLOW_119_in_roll1031);  
                    stream_119.add(string_literal96);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:211:11: 'roll'
                    {
                    string_literal97=(Token)match(input,120,FOLLOW_120_in_roll1033);  
                    stream_120.add(string_literal97);


                    }
                    break;

            }

            pushFollow(FOLLOW_angularValue_in_roll1036);
            angularValue98=angularValue();

            state._fsp--;

            stream_angularValue.add(angularValue98.getTree());


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
            // 212:2: -> ^( ROLL angularValue )
            {
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:212:5: ^( ROLL angularValue )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:217:1: altitude : ( fixedAltitude | relativeAltitude );
    public final flipsParser.altitude_return altitude() throws RecognitionException {
        flipsParser.altitude_return retval = new flipsParser.altitude_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.fixedAltitude_return fixedAltitude99 = null;

        flipsParser.relativeAltitude_return relativeAltitude100 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:218:2: ( fixedAltitude | relativeAltitude )
            int alt38=2;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:218:4: fixedAltitude
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_fixedAltitude_in_altitude1058);
                    fixedAltitude99=fixedAltitude();

                    state._fsp--;

                    adaptor.addChild(root_0, fixedAltitude99.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:219:4: relativeAltitude
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_relativeAltitude_in_altitude1063);
                    relativeAltitude100=relativeAltitude();

                    state._fsp--;

                    adaptor.addChild(root_0, relativeAltitude100.getTree());

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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:222:1: fixedAltitude : ( ( upDownDirection )? To | At | With ) ( ( ( 'an' )? ( 'alt' | 'altitude' ) | ( 'a' )? ( 'pres' | 'pressure' ) ) ( 'of' )? )? altitudeValue -> ^( ALTITUDE FIXED altitudeValue ) ;
    public final flipsParser.fixedAltitude_return fixedAltitude() throws RecognitionException {
        flipsParser.fixedAltitude_return retval = new flipsParser.fixedAltitude_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token To102=null;
        Token At103=null;
        Token With104=null;
        Token string_literal105=null;
        Token string_literal106=null;
        Token string_literal107=null;
        Token char_literal108=null;
        Token string_literal109=null;
        Token string_literal110=null;
        Token string_literal111=null;
        flipsParser.upDownDirection_return upDownDirection101 = null;

        flipsParser.altitudeValue_return altitudeValue112 = null;


        CommonTree To102_tree=null;
        CommonTree At103_tree=null;
        CommonTree With104_tree=null;
        CommonTree string_literal105_tree=null;
        CommonTree string_literal106_tree=null;
        CommonTree string_literal107_tree=null;
        CommonTree char_literal108_tree=null;
        CommonTree string_literal109_tree=null;
        CommonTree string_literal110_tree=null;
        CommonTree string_literal111_tree=null;
        RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
        RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
        RewriteRuleTokenStream stream_121=new RewriteRuleTokenStream(adaptor,"token 121");
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleTokenStream stream_At=new RewriteRuleTokenStream(adaptor,"token At");
        RewriteRuleTokenStream stream_124=new RewriteRuleTokenStream(adaptor,"token 124");
        RewriteRuleTokenStream stream_To=new RewriteRuleTokenStream(adaptor,"token To");
        RewriteRuleTokenStream stream_With=new RewriteRuleTokenStream(adaptor,"token With");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_altitudeValue=new RewriteRuleSubtreeStream(adaptor,"rule altitudeValue");
        RewriteRuleSubtreeStream stream_upDownDirection=new RewriteRuleSubtreeStream(adaptor,"rule upDownDirection");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:2: ( ( ( upDownDirection )? To | At | With ) ( ( ( 'an' )? ( 'alt' | 'altitude' ) | ( 'a' )? ( 'pres' | 'pressure' ) ) ( 'of' )? )? altitudeValue -> ^( ALTITUDE FIXED altitudeValue ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:4: ( ( upDownDirection )? To | At | With ) ( ( ( 'an' )? ( 'alt' | 'altitude' ) | ( 'a' )? ( 'pres' | 'pressure' ) ) ( 'of' )? )? altitudeValue
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:4: ( ( upDownDirection )? To | At | With )
            int alt40=3;
            switch ( input.LA(1) ) {
            case To:
            case 237:
            case 238:
            case 239:
            case 240:
            case 241:
            case 242:
            case 243:
            case 244:
            case 245:
            case 246:
            case 247:
                {
                alt40=1;
                }
                break;
            case At:
                {
                alt40=2;
                }
                break;
            case With:
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:5: ( upDownDirection )? To
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:5: ( upDownDirection )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( ((LA39_0>=237 && LA39_0<=247)) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:5: upDownDirection
                            {
                            pushFollow(FOLLOW_upDownDirection_in_fixedAltitude1075);
                            upDownDirection101=upDownDirection();

                            state._fsp--;

                            stream_upDownDirection.add(upDownDirection101.getTree());

                            }
                            break;

                    }

                    To102=(Token)match(input,To,FOLLOW_To_in_fixedAltitude1078);  
                    stream_To.add(To102);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:25: At
                    {
                    At103=(Token)match(input,At,FOLLOW_At_in_fixedAltitude1080);  
                    stream_At.add(At103);


                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:28: With
                    {
                    With104=(Token)match(input,With,FOLLOW_With_in_fixedAltitude1082);  
                    stream_With.add(With104);


                    }
                    break;

            }

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:34: ( ( ( 'an' )? ( 'alt' | 'altitude' ) | ( 'a' )? ( 'pres' | 'pressure' ) ) ( 'of' )? )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==115||(LA47_0>=121 && LA47_0<=125)) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:35: ( ( 'an' )? ( 'alt' | 'altitude' ) | ( 'a' )? ( 'pres' | 'pressure' ) ) ( 'of' )?
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:35: ( ( 'an' )? ( 'alt' | 'altitude' ) | ( 'a' )? ( 'pres' | 'pressure' ) )
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==115||(LA45_0>=121 && LA45_0<=122)) ) {
                        alt45=1;
                    }
                    else if ( ((LA45_0>=123 && LA45_0<=125)) ) {
                        alt45=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 0, input);

                        throw nvae;
                    }
                    switch (alt45) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:36: ( 'an' )? ( 'alt' | 'altitude' )
                            {
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:36: ( 'an' )?
                            int alt41=2;
                            int LA41_0 = input.LA(1);

                            if ( (LA41_0==115) ) {
                                alt41=1;
                            }
                            switch (alt41) {
                                case 1 :
                                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:36: 'an'
                                    {
                                    string_literal105=(Token)match(input,115,FOLLOW_115_in_fixedAltitude1087);  
                                    stream_115.add(string_literal105);


                                    }
                                    break;

                            }

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:42: ( 'alt' | 'altitude' )
                            int alt42=2;
                            int LA42_0 = input.LA(1);

                            if ( (LA42_0==121) ) {
                                alt42=1;
                            }
                            else if ( (LA42_0==122) ) {
                                alt42=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 42, 0, input);

                                throw nvae;
                            }
                            switch (alt42) {
                                case 1 :
                                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:43: 'alt'
                                    {
                                    string_literal106=(Token)match(input,121,FOLLOW_121_in_fixedAltitude1091);  
                                    stream_121.add(string_literal106);


                                    }
                                    break;
                                case 2 :
                                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:49: 'altitude'
                                    {
                                    string_literal107=(Token)match(input,122,FOLLOW_122_in_fixedAltitude1093);  
                                    stream_122.add(string_literal107);


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:61: ( 'a' )? ( 'pres' | 'pressure' )
                            {
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:61: ( 'a' )?
                            int alt43=2;
                            int LA43_0 = input.LA(1);

                            if ( (LA43_0==123) ) {
                                alt43=1;
                            }
                            switch (alt43) {
                                case 1 :
                                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:61: 'a'
                                    {
                                    char_literal108=(Token)match(input,123,FOLLOW_123_in_fixedAltitude1096);  
                                    stream_123.add(char_literal108);


                                    }
                                    break;

                            }

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:66: ( 'pres' | 'pressure' )
                            int alt44=2;
                            int LA44_0 = input.LA(1);

                            if ( (LA44_0==124) ) {
                                alt44=1;
                            }
                            else if ( (LA44_0==125) ) {
                                alt44=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 44, 0, input);

                                throw nvae;
                            }
                            switch (alt44) {
                                case 1 :
                                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:67: 'pres'
                                    {
                                    string_literal109=(Token)match(input,124,FOLLOW_124_in_fixedAltitude1100);  
                                    stream_124.add(string_literal109);


                                    }
                                    break;
                                case 2 :
                                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:74: 'pressure'
                                    {
                                    string_literal110=(Token)match(input,125,FOLLOW_125_in_fixedAltitude1102);  
                                    stream_125.add(string_literal110);


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:87: ( 'of' )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==118) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:223:87: 'of'
                            {
                            string_literal111=(Token)match(input,118,FOLLOW_118_in_fixedAltitude1106);  
                            stream_118.add(string_literal111);


                            }
                            break;

                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_altitudeValue_in_fixedAltitude1111);
            altitudeValue112=altitudeValue();

            state._fsp--;

            stream_altitudeValue.add(altitudeValue112.getTree());


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
            // 224:2: -> ^( ALTITUDE FIXED altitudeValue )
            {
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:224:5: ^( ALTITUDE FIXED altitudeValue )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:227:1: relativeAltitude : upDownDirection altitudeValue -> ^( ALTITUDE RELATIVE upDownDirection altitudeValue ) ;
    public final flipsParser.relativeAltitude_return relativeAltitude() throws RecognitionException {
        flipsParser.relativeAltitude_return retval = new flipsParser.relativeAltitude_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.upDownDirection_return upDownDirection113 = null;

        flipsParser.altitudeValue_return altitudeValue114 = null;


        RewriteRuleSubtreeStream stream_altitudeValue=new RewriteRuleSubtreeStream(adaptor,"rule altitudeValue");
        RewriteRuleSubtreeStream stream_upDownDirection=new RewriteRuleSubtreeStream(adaptor,"rule upDownDirection");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:228:2: ( upDownDirection altitudeValue -> ^( ALTITUDE RELATIVE upDownDirection altitudeValue ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:228:4: upDownDirection altitudeValue
            {
            pushFollow(FOLLOW_upDownDirection_in_relativeAltitude1133);
            upDownDirection113=upDownDirection();

            state._fsp--;

            stream_upDownDirection.add(upDownDirection113.getTree());
            pushFollow(FOLLOW_altitudeValue_in_relativeAltitude1135);
            altitudeValue114=altitudeValue();

            state._fsp--;

            stream_altitudeValue.add(altitudeValue114.getTree());


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
            // 229:2: -> ^( ALTITUDE RELATIVE upDownDirection altitudeValue )
            {
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:229:5: ^( ALTITUDE RELATIVE upDownDirection altitudeValue )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:232:1: altitudeValue : ( distanceValue -> DISTANCE distanceValue | pressureValue -> PRESSURE pressureValue | FlightLevel -> FLIGHTLEVEL FlightLevel );
    public final flipsParser.altitudeValue_return altitudeValue() throws RecognitionException {
        flipsParser.altitudeValue_return retval = new flipsParser.altitudeValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FlightLevel117=null;
        flipsParser.distanceValue_return distanceValue115 = null;

        flipsParser.pressureValue_return pressureValue116 = null;


        CommonTree FlightLevel117_tree=null;
        RewriteRuleTokenStream stream_FlightLevel=new RewriteRuleTokenStream(adaptor,"token FlightLevel");
        RewriteRuleSubtreeStream stream_pressureValue=new RewriteRuleSubtreeStream(adaptor,"rule pressureValue");
        RewriteRuleSubtreeStream stream_distanceValue=new RewriteRuleSubtreeStream(adaptor,"rule distanceValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:233:2: ( distanceValue -> DISTANCE distanceValue | pressureValue -> PRESSURE pressureValue | FlightLevel -> FLIGHTLEVEL FlightLevel )
            int alt48=3;
            switch ( input.LA(1) ) {
            case BinaryLiteral:
            case OctalLiteral:
            case DecimalLiteral:
            case HexLiteral:
                {
                int LA48_1 = input.LA(2);

                if ( ((LA48_1>=146 && LA48_1<=163)) ) {
                    alt48=1;
                }
                else if ( ((LA48_1>=126 && LA48_1<=143)) ) {
                    alt48=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 1, input);

                    throw nvae;
                }
                }
                break;
            case FloatingPointLiteral:
                {
                int LA48_2 = input.LA(2);

                if ( ((LA48_2>=146 && LA48_2<=163)) ) {
                    alt48=1;
                }
                else if ( ((LA48_2>=126 && LA48_2<=143)) ) {
                    alt48=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 2, input);

                    throw nvae;
                }
                }
                break;
            case FlightLevel:
                {
                alt48=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:233:4: distanceValue
                    {
                    pushFollow(FOLLOW_distanceValue_in_altitudeValue1159);
                    distanceValue115=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(distanceValue115.getTree());


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
                    // 234:2: -> DISTANCE distanceValue
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(DISTANCE, "DISTANCE"));
                        adaptor.addChild(root_0, stream_distanceValue.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:235:4: pressureValue
                    {
                    pushFollow(FOLLOW_pressureValue_in_altitudeValue1171);
                    pressureValue116=pressureValue();

                    state._fsp--;

                    stream_pressureValue.add(pressureValue116.getTree());


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
                    // 236:2: -> PRESSURE pressureValue
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(PRESSURE, "PRESSURE"));
                        adaptor.addChild(root_0, stream_pressureValue.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:237:4: FlightLevel
                    {
                    FlightLevel117=(Token)match(input,FlightLevel,FOLLOW_FlightLevel_in_altitudeValue1183);  
                    stream_FlightLevel.add(FlightLevel117);



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
                    // 238:2: -> FLIGHTLEVEL FlightLevel
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:241:1: pressureValue : numericValue pressureUnit ;
    public final flipsParser.pressureValue_return pressureValue() throws RecognitionException {
        flipsParser.pressureValue_return retval = new flipsParser.pressureValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.numericValue_return numericValue118 = null;

        flipsParser.pressureUnit_return pressureUnit119 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:242:2: ( numericValue pressureUnit )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:242:4: numericValue pressureUnit
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_numericValue_in_pressureValue1201);
            numericValue118=numericValue();

            state._fsp--;

            adaptor.addChild(root_0, numericValue118.getTree());
            pushFollow(FOLLOW_pressureUnit_in_pressureValue1203);
            pressureUnit119=pressureUnit();

            state._fsp--;

            adaptor.addChild(root_0, pressureUnit119.getTree());

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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:245:1: pressureUnit : ( ( 'kpa' | 'kilopascal' | 'kilopascals' ) -> KILOPASCAL | ( 'hpa' | 'hectopascal' | 'hectopascals' ) -> HECTOPASCAL | ( 'pa' | 'pascal' | 'pascals' ) -> PASCAL | ( 'bar' | 'bars' ) -> BAR | ( 'mbar' | 'millibar' | 'millibars' ) -> MILLIBAR | ( 'atm' | 'atms' | 'atmosphere' | 'atmospheres' ) -> ATMOSPHERE );
    public final flipsParser.pressureUnit_return pressureUnit() throws RecognitionException {
        flipsParser.pressureUnit_return retval = new flipsParser.pressureUnit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal120=null;
        Token string_literal121=null;
        Token string_literal122=null;
        Token string_literal123=null;
        Token string_literal124=null;
        Token string_literal125=null;
        Token string_literal126=null;
        Token string_literal127=null;
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

        CommonTree string_literal120_tree=null;
        CommonTree string_literal121_tree=null;
        CommonTree string_literal122_tree=null;
        CommonTree string_literal123_tree=null;
        CommonTree string_literal124_tree=null;
        CommonTree string_literal125_tree=null;
        CommonTree string_literal126_tree=null;
        CommonTree string_literal127_tree=null;
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
        RewriteRuleTokenStream stream_143=new RewriteRuleTokenStream(adaptor,"token 143");
        RewriteRuleTokenStream stream_134=new RewriteRuleTokenStream(adaptor,"token 134");
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_135=new RewriteRuleTokenStream(adaptor,"token 135");
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleTokenStream stream_132=new RewriteRuleTokenStream(adaptor,"token 132");
        RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");
        RewriteRuleTokenStream stream_133=new RewriteRuleTokenStream(adaptor,"token 133");
        RewriteRuleTokenStream stream_138=new RewriteRuleTokenStream(adaptor,"token 138");
        RewriteRuleTokenStream stream_139=new RewriteRuleTokenStream(adaptor,"token 139");
        RewriteRuleTokenStream stream_136=new RewriteRuleTokenStream(adaptor,"token 136");
        RewriteRuleTokenStream stream_137=new RewriteRuleTokenStream(adaptor,"token 137");
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleTokenStream stream_140=new RewriteRuleTokenStream(adaptor,"token 140");
        RewriteRuleTokenStream stream_131=new RewriteRuleTokenStream(adaptor,"token 131");
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
        RewriteRuleTokenStream stream_142=new RewriteRuleTokenStream(adaptor,"token 142");
        RewriteRuleTokenStream stream_141=new RewriteRuleTokenStream(adaptor,"token 141");

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:246:2: ( ( 'kpa' | 'kilopascal' | 'kilopascals' ) -> KILOPASCAL | ( 'hpa' | 'hectopascal' | 'hectopascals' ) -> HECTOPASCAL | ( 'pa' | 'pascal' | 'pascals' ) -> PASCAL | ( 'bar' | 'bars' ) -> BAR | ( 'mbar' | 'millibar' | 'millibars' ) -> MILLIBAR | ( 'atm' | 'atms' | 'atmosphere' | 'atmospheres' ) -> ATMOSPHERE )
            int alt55=6;
            switch ( input.LA(1) ) {
            case 126:
            case 127:
            case 128:
                {
                alt55=1;
                }
                break;
            case 129:
            case 130:
            case 131:
                {
                alt55=2;
                }
                break;
            case 132:
            case 133:
            case 134:
                {
                alt55=3;
                }
                break;
            case 135:
            case 136:
                {
                alt55=4;
                }
                break;
            case 137:
            case 138:
            case 139:
                {
                alt55=5;
                }
                break;
            case 140:
            case 141:
            case 142:
            case 143:
                {
                alt55=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:246:4: ( 'kpa' | 'kilopascal' | 'kilopascals' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:246:4: ( 'kpa' | 'kilopascal' | 'kilopascals' )
                    int alt49=3;
                    switch ( input.LA(1) ) {
                    case 126:
                        {
                        alt49=1;
                        }
                        break;
                    case 127:
                        {
                        alt49=2;
                        }
                        break;
                    case 128:
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
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:246:5: 'kpa'
                            {
                            string_literal120=(Token)match(input,126,FOLLOW_126_in_pressureUnit1215);  
                            stream_126.add(string_literal120);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:246:11: 'kilopascal'
                            {
                            string_literal121=(Token)match(input,127,FOLLOW_127_in_pressureUnit1217);  
                            stream_127.add(string_literal121);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:246:24: 'kilopascals'
                            {
                            string_literal122=(Token)match(input,128,FOLLOW_128_in_pressureUnit1219);  
                            stream_128.add(string_literal122);


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
                    // 247:2: -> KILOPASCAL
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(KILOPASCAL, "KILOPASCAL"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:248:4: ( 'hpa' | 'hectopascal' | 'hectopascals' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:248:4: ( 'hpa' | 'hectopascal' | 'hectopascals' )
                    int alt50=3;
                    switch ( input.LA(1) ) {
                    case 129:
                        {
                        alt50=1;
                        }
                        break;
                    case 130:
                        {
                        alt50=2;
                        }
                        break;
                    case 131:
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
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:248:5: 'hpa'
                            {
                            string_literal123=(Token)match(input,129,FOLLOW_129_in_pressureUnit1231);  
                            stream_129.add(string_literal123);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:248:11: 'hectopascal'
                            {
                            string_literal124=(Token)match(input,130,FOLLOW_130_in_pressureUnit1233);  
                            stream_130.add(string_literal124);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:248:25: 'hectopascals'
                            {
                            string_literal125=(Token)match(input,131,FOLLOW_131_in_pressureUnit1235);  
                            stream_131.add(string_literal125);


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
                    // 249:2: -> HECTOPASCAL
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(HECTOPASCAL, "HECTOPASCAL"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:250:4: ( 'pa' | 'pascal' | 'pascals' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:250:4: ( 'pa' | 'pascal' | 'pascals' )
                    int alt51=3;
                    switch ( input.LA(1) ) {
                    case 132:
                        {
                        alt51=1;
                        }
                        break;
                    case 133:
                        {
                        alt51=2;
                        }
                        break;
                    case 134:
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
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:250:5: 'pa'
                            {
                            string_literal126=(Token)match(input,132,FOLLOW_132_in_pressureUnit1247);  
                            stream_132.add(string_literal126);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:250:10: 'pascal'
                            {
                            string_literal127=(Token)match(input,133,FOLLOW_133_in_pressureUnit1249);  
                            stream_133.add(string_literal127);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:250:19: 'pascals'
                            {
                            string_literal128=(Token)match(input,134,FOLLOW_134_in_pressureUnit1251);  
                            stream_134.add(string_literal128);


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
                    // 251:2: -> PASCAL
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(PASCAL, "PASCAL"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:252:4: ( 'bar' | 'bars' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:252:4: ( 'bar' | 'bars' )
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==135) ) {
                        alt52=1;
                    }
                    else if ( (LA52_0==136) ) {
                        alt52=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 52, 0, input);

                        throw nvae;
                    }
                    switch (alt52) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:252:5: 'bar'
                            {
                            string_literal129=(Token)match(input,135,FOLLOW_135_in_pressureUnit1263);  
                            stream_135.add(string_literal129);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:252:11: 'bars'
                            {
                            string_literal130=(Token)match(input,136,FOLLOW_136_in_pressureUnit1265);  
                            stream_136.add(string_literal130);


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
                    // 253:2: -> BAR
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(BAR, "BAR"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:254:4: ( 'mbar' | 'millibar' | 'millibars' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:254:4: ( 'mbar' | 'millibar' | 'millibars' )
                    int alt53=3;
                    switch ( input.LA(1) ) {
                    case 137:
                        {
                        alt53=1;
                        }
                        break;
                    case 138:
                        {
                        alt53=2;
                        }
                        break;
                    case 139:
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
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:254:5: 'mbar'
                            {
                            string_literal131=(Token)match(input,137,FOLLOW_137_in_pressureUnit1277);  
                            stream_137.add(string_literal131);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:254:12: 'millibar'
                            {
                            string_literal132=(Token)match(input,138,FOLLOW_138_in_pressureUnit1279);  
                            stream_138.add(string_literal132);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:254:23: 'millibars'
                            {
                            string_literal133=(Token)match(input,139,FOLLOW_139_in_pressureUnit1281);  
                            stream_139.add(string_literal133);


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
                    // 255:2: -> MILLIBAR
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MILLIBAR, "MILLIBAR"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:256:4: ( 'atm' | 'atms' | 'atmosphere' | 'atmospheres' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:256:4: ( 'atm' | 'atms' | 'atmosphere' | 'atmospheres' )
                    int alt54=4;
                    switch ( input.LA(1) ) {
                    case 140:
                        {
                        alt54=1;
                        }
                        break;
                    case 141:
                        {
                        alt54=2;
                        }
                        break;
                    case 142:
                        {
                        alt54=3;
                        }
                        break;
                    case 143:
                        {
                        alt54=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 54, 0, input);

                        throw nvae;
                    }

                    switch (alt54) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:256:5: 'atm'
                            {
                            string_literal134=(Token)match(input,140,FOLLOW_140_in_pressureUnit1293);  
                            stream_140.add(string_literal134);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:256:11: 'atms'
                            {
                            string_literal135=(Token)match(input,141,FOLLOW_141_in_pressureUnit1295);  
                            stream_141.add(string_literal135);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:256:18: 'atmosphere'
                            {
                            string_literal136=(Token)match(input,142,FOLLOW_142_in_pressureUnit1297);  
                            stream_142.add(string_literal136);


                            }
                            break;
                        case 4 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:256:31: 'atmospheres'
                            {
                            string_literal137=(Token)match(input,143,FOLLOW_143_in_pressureUnit1299);  
                            stream_143.add(string_literal137);


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
                    // 257:2: -> ATMOSPHERE
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:262:1: radius : ( 'in' | With )? ( 'a' )? ( 'radius' ( 'of' )? distanceValue | distanceValue 'radius' ) -> ^( RADIUS distanceValue ) ;
    public final flipsParser.radius_return radius() throws RecognitionException {
        flipsParser.radius_return retval = new flipsParser.radius_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal138=null;
        Token With139=null;
        Token char_literal140=null;
        Token string_literal141=null;
        Token string_literal142=null;
        Token string_literal145=null;
        flipsParser.distanceValue_return distanceValue143 = null;

        flipsParser.distanceValue_return distanceValue144 = null;


        CommonTree string_literal138_tree=null;
        CommonTree With139_tree=null;
        CommonTree char_literal140_tree=null;
        CommonTree string_literal141_tree=null;
        CommonTree string_literal142_tree=null;
        CommonTree string_literal145_tree=null;
        RewriteRuleTokenStream stream_144=new RewriteRuleTokenStream(adaptor,"token 144");
        RewriteRuleTokenStream stream_145=new RewriteRuleTokenStream(adaptor,"token 145");
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleTokenStream stream_With=new RewriteRuleTokenStream(adaptor,"token With");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_distanceValue=new RewriteRuleSubtreeStream(adaptor,"rule distanceValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:263:2: ( ( 'in' | With )? ( 'a' )? ( 'radius' ( 'of' )? distanceValue | distanceValue 'radius' ) -> ^( RADIUS distanceValue ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:263:4: ( 'in' | With )? ( 'a' )? ( 'radius' ( 'of' )? distanceValue | distanceValue 'radius' )
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:263:4: ( 'in' | With )?
            int alt56=3;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==144) ) {
                alt56=1;
            }
            else if ( (LA56_0==With) ) {
                alt56=2;
            }
            switch (alt56) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:263:5: 'in'
                    {
                    string_literal138=(Token)match(input,144,FOLLOW_144_in_radius1319);  
                    stream_144.add(string_literal138);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:263:10: With
                    {
                    With139=(Token)match(input,With,FOLLOW_With_in_radius1321);  
                    stream_With.add(With139);


                    }
                    break;

            }

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:263:17: ( 'a' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==123) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:263:17: 'a'
                    {
                    char_literal140=(Token)match(input,123,FOLLOW_123_in_radius1325);  
                    stream_123.add(char_literal140);


                    }
                    break;

            }

            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:263:22: ( 'radius' ( 'of' )? distanceValue | distanceValue 'radius' )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==145) ) {
                alt59=1;
            }
            else if ( ((LA59_0>=FloatingPointLiteral && LA59_0<=HexLiteral)) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:263:23: 'radius' ( 'of' )? distanceValue
                    {
                    string_literal141=(Token)match(input,145,FOLLOW_145_in_radius1329);  
                    stream_145.add(string_literal141);

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:263:32: ( 'of' )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==118) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:263:32: 'of'
                            {
                            string_literal142=(Token)match(input,118,FOLLOW_118_in_radius1331);  
                            stream_118.add(string_literal142);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_distanceValue_in_radius1334);
                    distanceValue143=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(distanceValue143.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:263:52: distanceValue 'radius'
                    {
                    pushFollow(FOLLOW_distanceValue_in_radius1336);
                    distanceValue144=distanceValue();

                    state._fsp--;

                    stream_distanceValue.add(distanceValue144.getTree());
                    string_literal145=(Token)match(input,145,FOLLOW_145_in_radius1338);  
                    stream_145.add(string_literal145);


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
            // 264:2: -> ^( RADIUS distanceValue )
            {
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:264:5: ^( RADIUS distanceValue )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:267:1: distance : ( leftRightDirection )? distanceValue -> ^( DISTANCE ( leftRightDirection )? distanceValue ) ;
    public final flipsParser.distance_return distance() throws RecognitionException {
        flipsParser.distance_return retval = new flipsParser.distance_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.leftRightDirection_return leftRightDirection146 = null;

        flipsParser.distanceValue_return distanceValue147 = null;


        RewriteRuleSubtreeStream stream_leftRightDirection=new RewriteRuleSubtreeStream(adaptor,"rule leftRightDirection");
        RewriteRuleSubtreeStream stream_distanceValue=new RewriteRuleSubtreeStream(adaptor,"rule distanceValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:268:2: ( ( leftRightDirection )? distanceValue -> ^( DISTANCE ( leftRightDirection )? distanceValue ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:268:4: ( leftRightDirection )? distanceValue
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:268:4: ( leftRightDirection )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( ((LA60_0>=248 && LA60_0<=253)) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:268:4: leftRightDirection
                    {
                    pushFollow(FOLLOW_leftRightDirection_in_distance1359);
                    leftRightDirection146=leftRightDirection();

                    state._fsp--;

                    stream_leftRightDirection.add(leftRightDirection146.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_distanceValue_in_distance1362);
            distanceValue147=distanceValue();

            state._fsp--;

            stream_distanceValue.add(distanceValue147.getTree());


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
            // 269:2: -> ^( DISTANCE ( leftRightDirection )? distanceValue )
            {
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:269:5: ^( DISTANCE ( leftRightDirection )? distanceValue )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DISTANCE, "DISTANCE"), root_1);

                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:269:16: ( leftRightDirection )?
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:272:1: distanceValue : numericValue distanceUnit ;
    public final flipsParser.distanceValue_return distanceValue() throws RecognitionException {
        flipsParser.distanceValue_return retval = new flipsParser.distanceValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.numericValue_return numericValue148 = null;

        flipsParser.distanceUnit_return distanceUnit149 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:273:2: ( numericValue distanceUnit )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:273:4: numericValue distanceUnit
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_numericValue_in_distanceValue1385);
            numericValue148=numericValue();

            state._fsp--;

            adaptor.addChild(root_0, numericValue148.getTree());
            pushFollow(FOLLOW_distanceUnit_in_distanceValue1387);
            distanceUnit149=distanceUnit();

            state._fsp--;

            adaptor.addChild(root_0, distanceUnit149.getTree());

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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:276:1: distanceUnit : ( ( 'km' | 'kilometer' | 'kilometers' ) -> KILOMETER | ( 'm' | 'meter' | 'meters' ) -> METER | ( 'nm' | 'nautical' ( 'mi' | 'mile' | 'miles' ) ) -> NAUTICAL MILE | ( 'statute' )? ( 'mi' | 'mile' | 'miles' ) -> MILE | ( 'yd' | 'yard' | 'yards' ) -> YARD | ( 'ft' | 'foot' | 'feet' ) -> FOOT );
    public final flipsParser.distanceUnit_return distanceUnit() throws RecognitionException {
        flipsParser.distanceUnit_return retval = new flipsParser.distanceUnit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal150=null;
        Token string_literal151=null;
        Token string_literal152=null;
        Token char_literal153=null;
        Token string_literal154=null;
        Token string_literal155=null;
        Token string_literal156=null;
        Token string_literal157=null;
        Token string_literal158=null;
        Token string_literal159=null;
        Token string_literal160=null;
        Token string_literal161=null;
        Token string_literal162=null;
        Token string_literal163=null;
        Token string_literal164=null;
        Token string_literal165=null;
        Token string_literal166=null;
        Token string_literal167=null;
        Token string_literal168=null;
        Token string_literal169=null;
        Token string_literal170=null;

        CommonTree string_literal150_tree=null;
        CommonTree string_literal151_tree=null;
        CommonTree string_literal152_tree=null;
        CommonTree char_literal153_tree=null;
        CommonTree string_literal154_tree=null;
        CommonTree string_literal155_tree=null;
        CommonTree string_literal156_tree=null;
        CommonTree string_literal157_tree=null;
        CommonTree string_literal158_tree=null;
        CommonTree string_literal159_tree=null;
        CommonTree string_literal160_tree=null;
        CommonTree string_literal161_tree=null;
        CommonTree string_literal162_tree=null;
        CommonTree string_literal163_tree=null;
        CommonTree string_literal164_tree=null;
        CommonTree string_literal165_tree=null;
        CommonTree string_literal166_tree=null;
        CommonTree string_literal167_tree=null;
        CommonTree string_literal168_tree=null;
        CommonTree string_literal169_tree=null;
        CommonTree string_literal170_tree=null;
        RewriteRuleTokenStream stream_146=new RewriteRuleTokenStream(adaptor,"token 146");
        RewriteRuleTokenStream stream_147=new RewriteRuleTokenStream(adaptor,"token 147");
        RewriteRuleTokenStream stream_148=new RewriteRuleTokenStream(adaptor,"token 148");
        RewriteRuleTokenStream stream_149=new RewriteRuleTokenStream(adaptor,"token 149");
        RewriteRuleTokenStream stream_159=new RewriteRuleTokenStream(adaptor,"token 159");
        RewriteRuleTokenStream stream_158=new RewriteRuleTokenStream(adaptor,"token 158");
        RewriteRuleTokenStream stream_157=new RewriteRuleTokenStream(adaptor,"token 157");
        RewriteRuleTokenStream stream_156=new RewriteRuleTokenStream(adaptor,"token 156");
        RewriteRuleTokenStream stream_155=new RewriteRuleTokenStream(adaptor,"token 155");
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");
        RewriteRuleTokenStream stream_161=new RewriteRuleTokenStream(adaptor,"token 161");
        RewriteRuleTokenStream stream_152=new RewriteRuleTokenStream(adaptor,"token 152");
        RewriteRuleTokenStream stream_162=new RewriteRuleTokenStream(adaptor,"token 162");
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleTokenStream stream_163=new RewriteRuleTokenStream(adaptor,"token 163");
        RewriteRuleTokenStream stream_150=new RewriteRuleTokenStream(adaptor,"token 150");
        RewriteRuleTokenStream stream_151=new RewriteRuleTokenStream(adaptor,"token 151");
        RewriteRuleTokenStream stream_160=new RewriteRuleTokenStream(adaptor,"token 160");

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:277:2: ( ( 'km' | 'kilometer' | 'kilometers' ) -> KILOMETER | ( 'm' | 'meter' | 'meters' ) -> METER | ( 'nm' | 'nautical' ( 'mi' | 'mile' | 'miles' ) ) -> NAUTICAL MILE | ( 'statute' )? ( 'mi' | 'mile' | 'miles' ) -> MILE | ( 'yd' | 'yard' | 'yards' ) -> YARD | ( 'ft' | 'foot' | 'feet' ) -> FOOT )
            int alt69=6;
            switch ( input.LA(1) ) {
            case 146:
            case 147:
            case 148:
                {
                alt69=1;
                }
                break;
            case 149:
            case 150:
            case 151:
                {
                alt69=2;
                }
                break;
            case 152:
            case 153:
                {
                alt69=3;
                }
                break;
            case 154:
            case 155:
            case 156:
            case 157:
                {
                alt69=4;
                }
                break;
            case 158:
            case 159:
            case 160:
                {
                alt69=5;
                }
                break;
            case 161:
            case 162:
            case 163:
                {
                alt69=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:277:4: ( 'km' | 'kilometer' | 'kilometers' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:277:4: ( 'km' | 'kilometer' | 'kilometers' )
                    int alt61=3;
                    switch ( input.LA(1) ) {
                    case 146:
                        {
                        alt61=1;
                        }
                        break;
                    case 147:
                        {
                        alt61=2;
                        }
                        break;
                    case 148:
                        {
                        alt61=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 61, 0, input);

                        throw nvae;
                    }

                    switch (alt61) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:277:5: 'km'
                            {
                            string_literal150=(Token)match(input,146,FOLLOW_146_in_distanceUnit1399);  
                            stream_146.add(string_literal150);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:277:10: 'kilometer'
                            {
                            string_literal151=(Token)match(input,147,FOLLOW_147_in_distanceUnit1401);  
                            stream_147.add(string_literal151);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:277:22: 'kilometers'
                            {
                            string_literal152=(Token)match(input,148,FOLLOW_148_in_distanceUnit1403);  
                            stream_148.add(string_literal152);


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
                    // 278:2: -> KILOMETER
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(KILOMETER, "KILOMETER"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:279:4: ( 'm' | 'meter' | 'meters' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:279:4: ( 'm' | 'meter' | 'meters' )
                    int alt62=3;
                    switch ( input.LA(1) ) {
                    case 149:
                        {
                        alt62=1;
                        }
                        break;
                    case 150:
                        {
                        alt62=2;
                        }
                        break;
                    case 151:
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
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:279:5: 'm'
                            {
                            char_literal153=(Token)match(input,149,FOLLOW_149_in_distanceUnit1415);  
                            stream_149.add(char_literal153);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:279:9: 'meter'
                            {
                            string_literal154=(Token)match(input,150,FOLLOW_150_in_distanceUnit1417);  
                            stream_150.add(string_literal154);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:279:17: 'meters'
                            {
                            string_literal155=(Token)match(input,151,FOLLOW_151_in_distanceUnit1419);  
                            stream_151.add(string_literal155);


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
                    // 280:2: -> METER
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(METER, "METER"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:281:4: ( 'nm' | 'nautical' ( 'mi' | 'mile' | 'miles' ) )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:281:4: ( 'nm' | 'nautical' ( 'mi' | 'mile' | 'miles' ) )
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==152) ) {
                        alt64=1;
                    }
                    else if ( (LA64_0==153) ) {
                        alt64=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 64, 0, input);

                        throw nvae;
                    }
                    switch (alt64) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:281:5: 'nm'
                            {
                            string_literal156=(Token)match(input,152,FOLLOW_152_in_distanceUnit1431);  
                            stream_152.add(string_literal156);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:281:10: 'nautical' ( 'mi' | 'mile' | 'miles' )
                            {
                            string_literal157=(Token)match(input,153,FOLLOW_153_in_distanceUnit1433);  
                            stream_153.add(string_literal157);

                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:281:21: ( 'mi' | 'mile' | 'miles' )
                            int alt63=3;
                            switch ( input.LA(1) ) {
                            case 154:
                                {
                                alt63=1;
                                }
                                break;
                            case 155:
                                {
                                alt63=2;
                                }
                                break;
                            case 156:
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
                                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:281:22: 'mi'
                                    {
                                    string_literal158=(Token)match(input,154,FOLLOW_154_in_distanceUnit1436);  
                                    stream_154.add(string_literal158);


                                    }
                                    break;
                                case 2 :
                                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:281:27: 'mile'
                                    {
                                    string_literal159=(Token)match(input,155,FOLLOW_155_in_distanceUnit1438);  
                                    stream_155.add(string_literal159);


                                    }
                                    break;
                                case 3 :
                                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:281:34: 'miles'
                                    {
                                    string_literal160=(Token)match(input,156,FOLLOW_156_in_distanceUnit1440);  
                                    stream_156.add(string_literal160);


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
                    // 282:2: -> NAUTICAL MILE
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NAUTICAL, "NAUTICAL"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MILE, "MILE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:283:4: ( 'statute' )? ( 'mi' | 'mile' | 'miles' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:283:4: ( 'statute' )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==157) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:283:5: 'statute'
                            {
                            string_literal161=(Token)match(input,157,FOLLOW_157_in_distanceUnit1455);  
                            stream_157.add(string_literal161);


                            }
                            break;

                    }

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:283:17: ( 'mi' | 'mile' | 'miles' )
                    int alt66=3;
                    switch ( input.LA(1) ) {
                    case 154:
                        {
                        alt66=1;
                        }
                        break;
                    case 155:
                        {
                        alt66=2;
                        }
                        break;
                    case 156:
                        {
                        alt66=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 66, 0, input);

                        throw nvae;
                    }

                    switch (alt66) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:283:18: 'mi'
                            {
                            string_literal162=(Token)match(input,154,FOLLOW_154_in_distanceUnit1460);  
                            stream_154.add(string_literal162);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:283:23: 'mile'
                            {
                            string_literal163=(Token)match(input,155,FOLLOW_155_in_distanceUnit1462);  
                            stream_155.add(string_literal163);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:283:30: 'miles'
                            {
                            string_literal164=(Token)match(input,156,FOLLOW_156_in_distanceUnit1464);  
                            stream_156.add(string_literal164);


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
                    // 284:2: -> MILE
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MILE, "MILE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:285:4: ( 'yd' | 'yard' | 'yards' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:285:4: ( 'yd' | 'yard' | 'yards' )
                    int alt67=3;
                    switch ( input.LA(1) ) {
                    case 158:
                        {
                        alt67=1;
                        }
                        break;
                    case 159:
                        {
                        alt67=2;
                        }
                        break;
                    case 160:
                        {
                        alt67=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 67, 0, input);

                        throw nvae;
                    }

                    switch (alt67) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:285:5: 'yd'
                            {
                            string_literal165=(Token)match(input,158,FOLLOW_158_in_distanceUnit1476);  
                            stream_158.add(string_literal165);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:285:10: 'yard'
                            {
                            string_literal166=(Token)match(input,159,FOLLOW_159_in_distanceUnit1478);  
                            stream_159.add(string_literal166);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:285:17: 'yards'
                            {
                            string_literal167=(Token)match(input,160,FOLLOW_160_in_distanceUnit1480);  
                            stream_160.add(string_literal167);


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
                    // 286:2: -> YARD
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(YARD, "YARD"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:287:4: ( 'ft' | 'foot' | 'feet' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:287:4: ( 'ft' | 'foot' | 'feet' )
                    int alt68=3;
                    switch ( input.LA(1) ) {
                    case 161:
                        {
                        alt68=1;
                        }
                        break;
                    case 162:
                        {
                        alt68=2;
                        }
                        break;
                    case 163:
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
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:287:5: 'ft'
                            {
                            string_literal168=(Token)match(input,161,FOLLOW_161_in_distanceUnit1492);  
                            stream_161.add(string_literal168);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:287:10: 'foot'
                            {
                            string_literal169=(Token)match(input,162,FOLLOW_162_in_distanceUnit1494);  
                            stream_162.add(string_literal169);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:287:17: 'feet'
                            {
                            string_literal170=(Token)match(input,163,FOLLOW_163_in_distanceUnit1496);  
                            stream_163.add(string_literal170);


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
                    // 288:2: -> FOOT
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:293:1: speed : ( fixedSpeed | relativeSpeed | optimalSpeed | throttleSpeed );
    public final flipsParser.speed_return speed() throws RecognitionException {
        flipsParser.speed_return retval = new flipsParser.speed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.fixedSpeed_return fixedSpeed171 = null;

        flipsParser.relativeSpeed_return relativeSpeed172 = null;

        flipsParser.optimalSpeed_return optimalSpeed173 = null;

        flipsParser.throttleSpeed_return throttleSpeed174 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:294:2: ( fixedSpeed | relativeSpeed | optimalSpeed | throttleSpeed )
            int alt70=4;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==At) ) {
                switch ( input.LA(2) ) {
                case BinaryLiteral:
                case OctalLiteral:
                case DecimalLiteral:
                case HexLiteral:
                    {
                    int LA70_3 = input.LA(3);

                    if ( ((LA70_3>=270 && LA70_3<=271)) ) {
                        alt70=4;
                    }
                    else if ( ((LA70_3>=146 && LA70_3<=163)||(LA70_3>=166 && LA70_3<=172)) ) {
                        alt70=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 70, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case FloatingPointLiteral:
                    {
                    int LA70_4 = input.LA(3);

                    if ( ((LA70_4>=270 && LA70_4<=271)) ) {
                        alt70=4;
                    }
                    else if ( ((LA70_4>=146 && LA70_4<=163)||(LA70_4>=166 && LA70_4<=172)) ) {
                        alt70=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 70, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 177:
                case 178:
                case 179:
                case 180:
                case 181:
                case 182:
                    {
                    alt70=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 70, 1, input);

                    throw nvae;
                }

            }
            else if ( ((LA70_0>=FloatingPointLiteral && LA70_0<=HexLiteral)) ) {
                alt70=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:294:4: fixedSpeed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_fixedSpeed_in_speed1515);
                    fixedSpeed171=fixedSpeed();

                    state._fsp--;

                    adaptor.addChild(root_0, fixedSpeed171.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:295:4: relativeSpeed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_relativeSpeed_in_speed1520);
                    relativeSpeed172=relativeSpeed();

                    state._fsp--;

                    adaptor.addChild(root_0, relativeSpeed172.getTree());

                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:296:4: optimalSpeed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_optimalSpeed_in_speed1525);
                    optimalSpeed173=optimalSpeed();

                    state._fsp--;

                    adaptor.addChild(root_0, optimalSpeed173.getTree());

                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:297:4: throttleSpeed
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_throttleSpeed_in_speed1530);
                    throttleSpeed174=throttleSpeed();

                    state._fsp--;

                    adaptor.addChild(root_0, throttleSpeed174.getTree());

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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:300:1: fixedSpeed : At speedValue -> ^( SPEED FIXED speedValue ) ;
    public final flipsParser.fixedSpeed_return fixedSpeed() throws RecognitionException {
        flipsParser.fixedSpeed_return retval = new flipsParser.fixedSpeed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token At175=null;
        flipsParser.speedValue_return speedValue176 = null;


        CommonTree At175_tree=null;
        RewriteRuleTokenStream stream_At=new RewriteRuleTokenStream(adaptor,"token At");
        RewriteRuleSubtreeStream stream_speedValue=new RewriteRuleSubtreeStream(adaptor,"rule speedValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:301:2: ( At speedValue -> ^( SPEED FIXED speedValue ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:301:4: At speedValue
            {
            At175=(Token)match(input,At,FOLLOW_At_in_fixedSpeed1541);  
            stream_At.add(At175);

            pushFollow(FOLLOW_speedValue_in_fixedSpeed1543);
            speedValue176=speedValue();

            state._fsp--;

            stream_speedValue.add(speedValue176.getTree());


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
            // 302:2: -> ^( SPEED FIXED speedValue )
            {
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:302:5: ^( SPEED FIXED speedValue )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:305:1: relativeSpeed : ( speedValue 'faster' -> ^( SPEED RELATIVE FASTER speedValue ) | speedValue 'slower' -> ^( SPEED RELATIVE SLOWER speedValue ) | percentValue 'faster' -> ^( SPEED RELATIVE FASTER percentValue ) | percentValue 'slower' -> ^( SPEED RELATIVE SLOWER percentValue ) );
    public final flipsParser.relativeSpeed_return relativeSpeed() throws RecognitionException {
        flipsParser.relativeSpeed_return retval = new flipsParser.relativeSpeed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal178=null;
        Token string_literal180=null;
        Token string_literal182=null;
        Token string_literal184=null;
        flipsParser.speedValue_return speedValue177 = null;

        flipsParser.speedValue_return speedValue179 = null;

        flipsParser.percentValue_return percentValue181 = null;

        flipsParser.percentValue_return percentValue183 = null;


        CommonTree string_literal178_tree=null;
        CommonTree string_literal180_tree=null;
        CommonTree string_literal182_tree=null;
        CommonTree string_literal184_tree=null;
        RewriteRuleTokenStream stream_164=new RewriteRuleTokenStream(adaptor,"token 164");
        RewriteRuleTokenStream stream_165=new RewriteRuleTokenStream(adaptor,"token 165");
        RewriteRuleSubtreeStream stream_speedValue=new RewriteRuleSubtreeStream(adaptor,"rule speedValue");
        RewriteRuleSubtreeStream stream_percentValue=new RewriteRuleSubtreeStream(adaptor,"rule percentValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:306:2: ( speedValue 'faster' -> ^( SPEED RELATIVE FASTER speedValue ) | speedValue 'slower' -> ^( SPEED RELATIVE SLOWER speedValue ) | percentValue 'faster' -> ^( SPEED RELATIVE FASTER percentValue ) | percentValue 'slower' -> ^( SPEED RELATIVE SLOWER percentValue ) )
            int alt71=4;
            alt71 = dfa71.predict(input);
            switch (alt71) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:306:4: speedValue 'faster'
                    {
                    pushFollow(FOLLOW_speedValue_in_relativeSpeed1565);
                    speedValue177=speedValue();

                    state._fsp--;

                    stream_speedValue.add(speedValue177.getTree());
                    string_literal178=(Token)match(input,164,FOLLOW_164_in_relativeSpeed1567);  
                    stream_164.add(string_literal178);



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
                    // 307:2: -> ^( SPEED RELATIVE FASTER speedValue )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:307:5: ^( SPEED RELATIVE FASTER speedValue )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:308:4: speedValue 'slower'
                    {
                    pushFollow(FOLLOW_speedValue_in_relativeSpeed1585);
                    speedValue179=speedValue();

                    state._fsp--;

                    stream_speedValue.add(speedValue179.getTree());
                    string_literal180=(Token)match(input,165,FOLLOW_165_in_relativeSpeed1587);  
                    stream_165.add(string_literal180);



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
                    // 309:2: -> ^( SPEED RELATIVE SLOWER speedValue )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:309:5: ^( SPEED RELATIVE SLOWER speedValue )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:310:4: percentValue 'faster'
                    {
                    pushFollow(FOLLOW_percentValue_in_relativeSpeed1605);
                    percentValue181=percentValue();

                    state._fsp--;

                    stream_percentValue.add(percentValue181.getTree());
                    string_literal182=(Token)match(input,164,FOLLOW_164_in_relativeSpeed1607);  
                    stream_164.add(string_literal182);



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
                    // 311:2: -> ^( SPEED RELATIVE FASTER percentValue )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:311:5: ^( SPEED RELATIVE FASTER percentValue )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:312:4: percentValue 'slower'
                    {
                    pushFollow(FOLLOW_percentValue_in_relativeSpeed1625);
                    percentValue183=percentValue();

                    state._fsp--;

                    stream_percentValue.add(percentValue183.getTree());
                    string_literal184=(Token)match(input,165,FOLLOW_165_in_relativeSpeed1627);  
                    stream_165.add(string_literal184);



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
                    // 313:2: -> ^( SPEED RELATIVE SLOWER percentValue )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:313:5: ^( SPEED RELATIVE SLOWER percentValue )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:316:1: speedValue : numericValue speedUnit ;
    public final flipsParser.speedValue_return speedValue() throws RecognitionException {
        flipsParser.speedValue_return retval = new flipsParser.speedValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.numericValue_return numericValue185 = null;

        flipsParser.speedUnit_return speedUnit186 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:317:2: ( numericValue speedUnit )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:317:4: numericValue speedUnit
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_numericValue_in_speedValue1651);
            numericValue185=numericValue();

            state._fsp--;

            adaptor.addChild(root_0, numericValue185.getTree());
            pushFollow(FOLLOW_speedUnit_in_speedValue1653);
            speedUnit186=speedUnit();

            state._fsp--;

            adaptor.addChild(root_0, speedUnit186.getTree());

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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:320:1: speedUnit : ( 'kph' -> KILOMETER HOUR | 'mph' -> MILE HOUR | ( 'kn' | 'kt' | 'kts' | 'knot' | 'knots' ) -> NAUTICAL MILE HOUR | distanceUnit ( '/' | 'per' ) timeUnit -> distanceUnit timeUnit );
    public final flipsParser.speedUnit_return speedUnit() throws RecognitionException {
        flipsParser.speedUnit_return retval = new flipsParser.speedUnit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal187=null;
        Token string_literal188=null;
        Token string_literal189=null;
        Token string_literal190=null;
        Token string_literal191=null;
        Token string_literal192=null;
        Token string_literal193=null;
        Token char_literal195=null;
        Token string_literal196=null;
        flipsParser.distanceUnit_return distanceUnit194 = null;

        flipsParser.timeUnit_return timeUnit197 = null;


        CommonTree string_literal187_tree=null;
        CommonTree string_literal188_tree=null;
        CommonTree string_literal189_tree=null;
        CommonTree string_literal190_tree=null;
        CommonTree string_literal191_tree=null;
        CommonTree string_literal192_tree=null;
        CommonTree string_literal193_tree=null;
        CommonTree char_literal195_tree=null;
        CommonTree string_literal196_tree=null;
        RewriteRuleTokenStream stream_170=new RewriteRuleTokenStream(adaptor,"token 170");
        RewriteRuleTokenStream stream_171=new RewriteRuleTokenStream(adaptor,"token 171");
        RewriteRuleTokenStream stream_174=new RewriteRuleTokenStream(adaptor,"token 174");
        RewriteRuleTokenStream stream_172=new RewriteRuleTokenStream(adaptor,"token 172");
        RewriteRuleTokenStream stream_173=new RewriteRuleTokenStream(adaptor,"token 173");
        RewriteRuleTokenStream stream_169=new RewriteRuleTokenStream(adaptor,"token 169");
        RewriteRuleTokenStream stream_166=new RewriteRuleTokenStream(adaptor,"token 166");
        RewriteRuleTokenStream stream_168=new RewriteRuleTokenStream(adaptor,"token 168");
        RewriteRuleTokenStream stream_167=new RewriteRuleTokenStream(adaptor,"token 167");
        RewriteRuleSubtreeStream stream_timeUnit=new RewriteRuleSubtreeStream(adaptor,"rule timeUnit");
        RewriteRuleSubtreeStream stream_distanceUnit=new RewriteRuleSubtreeStream(adaptor,"rule distanceUnit");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:321:2: ( 'kph' -> KILOMETER HOUR | 'mph' -> MILE HOUR | ( 'kn' | 'kt' | 'kts' | 'knot' | 'knots' ) -> NAUTICAL MILE HOUR | distanceUnit ( '/' | 'per' ) timeUnit -> distanceUnit timeUnit )
            int alt74=4;
            switch ( input.LA(1) ) {
            case 166:
                {
                alt74=1;
                }
                break;
            case 167:
                {
                alt74=2;
                }
                break;
            case 168:
            case 169:
            case 170:
            case 171:
            case 172:
                {
                alt74=3;
                }
                break;
            case 146:
            case 147:
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
                {
                alt74=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:321:4: 'kph'
                    {
                    string_literal187=(Token)match(input,166,FOLLOW_166_in_speedUnit1664);  
                    stream_166.add(string_literal187);



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
                    // 322:2: -> KILOMETER HOUR
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(KILOMETER, "KILOMETER"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(HOUR, "HOUR"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:323:4: 'mph'
                    {
                    string_literal188=(Token)match(input,167,FOLLOW_167_in_speedUnit1676);  
                    stream_167.add(string_literal188);



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
                    // 324:2: -> MILE HOUR
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MILE, "MILE"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(HOUR, "HOUR"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:325:4: ( 'kn' | 'kt' | 'kts' | 'knot' | 'knots' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:325:4: ( 'kn' | 'kt' | 'kts' | 'knot' | 'knots' )
                    int alt72=5;
                    switch ( input.LA(1) ) {
                    case 168:
                        {
                        alt72=1;
                        }
                        break;
                    case 169:
                        {
                        alt72=2;
                        }
                        break;
                    case 170:
                        {
                        alt72=3;
                        }
                        break;
                    case 171:
                        {
                        alt72=4;
                        }
                        break;
                    case 172:
                        {
                        alt72=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 72, 0, input);

                        throw nvae;
                    }

                    switch (alt72) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:325:5: 'kn'
                            {
                            string_literal189=(Token)match(input,168,FOLLOW_168_in_speedUnit1689);  
                            stream_168.add(string_literal189);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:325:10: 'kt'
                            {
                            string_literal190=(Token)match(input,169,FOLLOW_169_in_speedUnit1691);  
                            stream_169.add(string_literal190);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:325:15: 'kts'
                            {
                            string_literal191=(Token)match(input,170,FOLLOW_170_in_speedUnit1693);  
                            stream_170.add(string_literal191);


                            }
                            break;
                        case 4 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:325:21: 'knot'
                            {
                            string_literal192=(Token)match(input,171,FOLLOW_171_in_speedUnit1695);  
                            stream_171.add(string_literal192);


                            }
                            break;
                        case 5 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:325:28: 'knots'
                            {
                            string_literal193=(Token)match(input,172,FOLLOW_172_in_speedUnit1697);  
                            stream_172.add(string_literal193);


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
                    // 326:2: -> NAUTICAL MILE HOUR
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NAUTICAL, "NAUTICAL"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MILE, "MILE"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(HOUR, "HOUR"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:327:4: distanceUnit ( '/' | 'per' ) timeUnit
                    {
                    pushFollow(FOLLOW_distanceUnit_in_speedUnit1712);
                    distanceUnit194=distanceUnit();

                    state._fsp--;

                    stream_distanceUnit.add(distanceUnit194.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:327:17: ( '/' | 'per' )
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==173) ) {
                        alt73=1;
                    }
                    else if ( (LA73_0==174) ) {
                        alt73=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 73, 0, input);

                        throw nvae;
                    }
                    switch (alt73) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:327:18: '/'
                            {
                            char_literal195=(Token)match(input,173,FOLLOW_173_in_speedUnit1715);  
                            stream_173.add(char_literal195);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:327:22: 'per'
                            {
                            string_literal196=(Token)match(input,174,FOLLOW_174_in_speedUnit1717);  
                            stream_174.add(string_literal196);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_timeUnit_in_speedUnit1720);
                    timeUnit197=timeUnit();

                    state._fsp--;

                    stream_timeUnit.add(timeUnit197.getTree());


                    // AST REWRITE
                    // elements: distanceUnit, timeUnit
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 328:2: -> distanceUnit timeUnit
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:331:1: optimalSpeed : At optimalUnit ( 'spd' | 'speed' ) -> ^( SPEED OPTIMAL optimalUnit ) ;
    public final flipsParser.optimalSpeed_return optimalSpeed() throws RecognitionException {
        flipsParser.optimalSpeed_return retval = new flipsParser.optimalSpeed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token At198=null;
        Token string_literal200=null;
        Token string_literal201=null;
        flipsParser.optimalUnit_return optimalUnit199 = null;


        CommonTree At198_tree=null;
        CommonTree string_literal200_tree=null;
        CommonTree string_literal201_tree=null;
        RewriteRuleTokenStream stream_175=new RewriteRuleTokenStream(adaptor,"token 175");
        RewriteRuleTokenStream stream_At=new RewriteRuleTokenStream(adaptor,"token At");
        RewriteRuleTokenStream stream_176=new RewriteRuleTokenStream(adaptor,"token 176");
        RewriteRuleSubtreeStream stream_optimalUnit=new RewriteRuleSubtreeStream(adaptor,"rule optimalUnit");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:332:2: ( At optimalUnit ( 'spd' | 'speed' ) -> ^( SPEED OPTIMAL optimalUnit ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:332:4: At optimalUnit ( 'spd' | 'speed' )
            {
            At198=(Token)match(input,At,FOLLOW_At_in_optimalSpeed1738);  
            stream_At.add(At198);

            pushFollow(FOLLOW_optimalUnit_in_optimalSpeed1740);
            optimalUnit199=optimalUnit();

            state._fsp--;

            stream_optimalUnit.add(optimalUnit199.getTree());
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:332:19: ( 'spd' | 'speed' )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:332:20: 'spd'
                    {
                    string_literal200=(Token)match(input,175,FOLLOW_175_in_optimalSpeed1743);  
                    stream_175.add(string_literal200);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:332:26: 'speed'
                    {
                    string_literal201=(Token)match(input,176,FOLLOW_176_in_optimalSpeed1745);  
                    stream_176.add(string_literal201);


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
            // 333:2: -> ^( SPEED OPTIMAL optimalUnit )
            {
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:333:5: ^( SPEED OPTIMAL optimalUnit )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:336:1: optimalUnit : ( ( 'min' | 'minimum' ) -> MINIMUM | ( 'cru' | 'cruise' ) -> CRUISE | ( 'max' | 'maximum' ) -> MAXIMUM );
    public final flipsParser.optimalUnit_return optimalUnit() throws RecognitionException {
        flipsParser.optimalUnit_return retval = new flipsParser.optimalUnit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal202=null;
        Token string_literal203=null;
        Token string_literal204=null;
        Token string_literal205=null;
        Token string_literal206=null;
        Token string_literal207=null;

        CommonTree string_literal202_tree=null;
        CommonTree string_literal203_tree=null;
        CommonTree string_literal204_tree=null;
        CommonTree string_literal205_tree=null;
        CommonTree string_literal206_tree=null;
        CommonTree string_literal207_tree=null;
        RewriteRuleTokenStream stream_180=new RewriteRuleTokenStream(adaptor,"token 180");
        RewriteRuleTokenStream stream_181=new RewriteRuleTokenStream(adaptor,"token 181");
        RewriteRuleTokenStream stream_182=new RewriteRuleTokenStream(adaptor,"token 182");
        RewriteRuleTokenStream stream_179=new RewriteRuleTokenStream(adaptor,"token 179");
        RewriteRuleTokenStream stream_178=new RewriteRuleTokenStream(adaptor,"token 178");
        RewriteRuleTokenStream stream_177=new RewriteRuleTokenStream(adaptor,"token 177");

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:337:2: ( ( 'min' | 'minimum' ) -> MINIMUM | ( 'cru' | 'cruise' ) -> CRUISE | ( 'max' | 'maximum' ) -> MAXIMUM )
            int alt79=3;
            switch ( input.LA(1) ) {
            case 177:
            case 178:
                {
                alt79=1;
                }
                break;
            case 179:
            case 180:
                {
                alt79=2;
                }
                break;
            case 181:
            case 182:
                {
                alt79=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }

            switch (alt79) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:337:4: ( 'min' | 'minimum' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:337:4: ( 'min' | 'minimum' )
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==177) ) {
                        alt76=1;
                    }
                    else if ( (LA76_0==178) ) {
                        alt76=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 76, 0, input);

                        throw nvae;
                    }
                    switch (alt76) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:337:5: 'min'
                            {
                            string_literal202=(Token)match(input,177,FOLLOW_177_in_optimalUnit1769);  
                            stream_177.add(string_literal202);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:337:11: 'minimum'
                            {
                            string_literal203=(Token)match(input,178,FOLLOW_178_in_optimalUnit1771);  
                            stream_178.add(string_literal203);


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
                    // 338:2: -> MINIMUM
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(MINIMUM, "MINIMUM"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:339:4: ( 'cru' | 'cruise' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:339:4: ( 'cru' | 'cruise' )
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==179) ) {
                        alt77=1;
                    }
                    else if ( (LA77_0==180) ) {
                        alt77=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 77, 0, input);

                        throw nvae;
                    }
                    switch (alt77) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:339:5: 'cru'
                            {
                            string_literal204=(Token)match(input,179,FOLLOW_179_in_optimalUnit1783);  
                            stream_179.add(string_literal204);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:339:11: 'cruise'
                            {
                            string_literal205=(Token)match(input,180,FOLLOW_180_in_optimalUnit1785);  
                            stream_180.add(string_literal205);


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
                    // 340:2: -> CRUISE
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(CRUISE, "CRUISE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:341:4: ( 'max' | 'maximum' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:341:4: ( 'max' | 'maximum' )
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==181) ) {
                        alt78=1;
                    }
                    else if ( (LA78_0==182) ) {
                        alt78=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 78, 0, input);

                        throw nvae;
                    }
                    switch (alt78) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:341:5: 'max'
                            {
                            string_literal206=(Token)match(input,181,FOLLOW_181_in_optimalUnit1797);  
                            stream_181.add(string_literal206);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:341:11: 'maximum'
                            {
                            string_literal207=(Token)match(input,182,FOLLOW_182_in_optimalUnit1799);  
                            stream_182.add(string_literal207);


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
                    // 342:2: -> MAXIMUM
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:345:1: throttleSpeed : At throttleValue ( 'pwr' | 'power' | 'thr' | 'throttle' ) -> ^( SPEED THROTTLE throttleValue ) ;
    public final flipsParser.throttleSpeed_return throttleSpeed() throws RecognitionException {
        flipsParser.throttleSpeed_return retval = new flipsParser.throttleSpeed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token At208=null;
        Token string_literal210=null;
        Token string_literal211=null;
        Token string_literal212=null;
        Token string_literal213=null;
        flipsParser.throttleValue_return throttleValue209 = null;


        CommonTree At208_tree=null;
        CommonTree string_literal210_tree=null;
        CommonTree string_literal211_tree=null;
        CommonTree string_literal212_tree=null;
        CommonTree string_literal213_tree=null;
        RewriteRuleTokenStream stream_183=new RewriteRuleTokenStream(adaptor,"token 183");
        RewriteRuleTokenStream stream_184=new RewriteRuleTokenStream(adaptor,"token 184");
        RewriteRuleTokenStream stream_At=new RewriteRuleTokenStream(adaptor,"token At");
        RewriteRuleTokenStream stream_185=new RewriteRuleTokenStream(adaptor,"token 185");
        RewriteRuleTokenStream stream_186=new RewriteRuleTokenStream(adaptor,"token 186");
        RewriteRuleSubtreeStream stream_throttleValue=new RewriteRuleSubtreeStream(adaptor,"rule throttleValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:346:2: ( At throttleValue ( 'pwr' | 'power' | 'thr' | 'throttle' ) -> ^( SPEED THROTTLE throttleValue ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:346:4: At throttleValue ( 'pwr' | 'power' | 'thr' | 'throttle' )
            {
            At208=(Token)match(input,At,FOLLOW_At_in_throttleSpeed1816);  
            stream_At.add(At208);

            pushFollow(FOLLOW_throttleValue_in_throttleSpeed1818);
            throttleValue209=throttleValue();

            state._fsp--;

            stream_throttleValue.add(throttleValue209.getTree());
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:346:21: ( 'pwr' | 'power' | 'thr' | 'throttle' )
            int alt80=4;
            switch ( input.LA(1) ) {
            case 183:
                {
                alt80=1;
                }
                break;
            case 184:
                {
                alt80=2;
                }
                break;
            case 185:
                {
                alt80=3;
                }
                break;
            case 186:
                {
                alt80=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }

            switch (alt80) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:346:22: 'pwr'
                    {
                    string_literal210=(Token)match(input,183,FOLLOW_183_in_throttleSpeed1821);  
                    stream_183.add(string_literal210);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:346:28: 'power'
                    {
                    string_literal211=(Token)match(input,184,FOLLOW_184_in_throttleSpeed1823);  
                    stream_184.add(string_literal211);


                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:346:36: 'thr'
                    {
                    string_literal212=(Token)match(input,185,FOLLOW_185_in_throttleSpeed1825);  
                    stream_185.add(string_literal212);


                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:346:42: 'throttle'
                    {
                    string_literal213=(Token)match(input,186,FOLLOW_186_in_throttleSpeed1827);  
                    stream_186.add(string_literal213);


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
            // 347:2: -> ^( SPEED THROTTLE throttleValue )
            {
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:347:5: ^( SPEED THROTTLE throttleValue )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:350:1: throttleValue : percentValue ;
    public final flipsParser.throttleValue_return throttleValue() throws RecognitionException {
        flipsParser.throttleValue_return retval = new flipsParser.throttleValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.percentValue_return percentValue214 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:351:2: ( percentValue )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:351:4: percentValue
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_percentValue_in_throttleValue1850);
            percentValue214=percentValue();

            state._fsp--;

            adaptor.addChild(root_0, percentValue214.getTree());

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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:356:1: time : At timeValue ;
    public final flipsParser.time_return time() throws RecognitionException {
        flipsParser.time_return retval = new flipsParser.time_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token At215=null;
        flipsParser.timeValue_return timeValue216 = null;


        CommonTree At215_tree=null;

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:357:2: ( At timeValue )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:357:4: At timeValue
            {
            root_0 = (CommonTree)adaptor.nil();

            At215=(Token)match(input,At,FOLLOW_At_in_time1863); 
            At215_tree = (CommonTree)adaptor.create(At215);
            adaptor.addChild(root_0, At215_tree);

            pushFollow(FOLLOW_timeValue_in_time1865);
            timeValue216=timeValue();

            state._fsp--;

            adaptor.addChild(root_0, timeValue216.getTree());

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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:360:1: timeValue : ( timeFormat ( 'am' | 'a.m.' ) -> ^( TIME timeFormat AM ) | integerValue ( 'am' | 'a.m.' ) -> ^( TIME integerValue HOUR AM ) | timeFormat ( 'pm' | 'p.m.' ) -> ^( TIME timeFormat PM ) | integerValue ( 'pm' | 'p.m.' ) -> ^( TIME integerValue HOUR PM ) | timeFormat -> ^( TIME timeFormat HOUR24 ) );
    public final flipsParser.timeValue_return timeValue() throws RecognitionException {
        flipsParser.timeValue_return retval = new flipsParser.timeValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal218=null;
        Token string_literal219=null;
        Token string_literal221=null;
        Token string_literal222=null;
        Token string_literal224=null;
        Token string_literal225=null;
        Token string_literal227=null;
        Token string_literal228=null;
        flipsParser.timeFormat_return timeFormat217 = null;

        flipsParser.integerValue_return integerValue220 = null;

        flipsParser.timeFormat_return timeFormat223 = null;

        flipsParser.integerValue_return integerValue226 = null;

        flipsParser.timeFormat_return timeFormat229 = null;


        CommonTree string_literal218_tree=null;
        CommonTree string_literal219_tree=null;
        CommonTree string_literal221_tree=null;
        CommonTree string_literal222_tree=null;
        CommonTree string_literal224_tree=null;
        CommonTree string_literal225_tree=null;
        CommonTree string_literal227_tree=null;
        CommonTree string_literal228_tree=null;
        RewriteRuleTokenStream stream_188=new RewriteRuleTokenStream(adaptor,"token 188");
        RewriteRuleTokenStream stream_187=new RewriteRuleTokenStream(adaptor,"token 187");
        RewriteRuleTokenStream stream_189=new RewriteRuleTokenStream(adaptor,"token 189");
        RewriteRuleTokenStream stream_190=new RewriteRuleTokenStream(adaptor,"token 190");
        RewriteRuleSubtreeStream stream_integerValue=new RewriteRuleSubtreeStream(adaptor,"rule integerValue");
        RewriteRuleSubtreeStream stream_timeFormat=new RewriteRuleSubtreeStream(adaptor,"rule timeFormat");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:361:2: ( timeFormat ( 'am' | 'a.m.' ) -> ^( TIME timeFormat AM ) | integerValue ( 'am' | 'a.m.' ) -> ^( TIME integerValue HOUR AM ) | timeFormat ( 'pm' | 'p.m.' ) -> ^( TIME timeFormat PM ) | integerValue ( 'pm' | 'p.m.' ) -> ^( TIME integerValue HOUR PM ) | timeFormat -> ^( TIME timeFormat HOUR24 ) )
            int alt85=5;
            alt85 = dfa85.predict(input);
            switch (alt85) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:361:4: timeFormat ( 'am' | 'a.m.' )
                    {
                    pushFollow(FOLLOW_timeFormat_in_timeValue1876);
                    timeFormat217=timeFormat();

                    state._fsp--;

                    stream_timeFormat.add(timeFormat217.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:361:15: ( 'am' | 'a.m.' )
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==187) ) {
                        alt81=1;
                    }
                    else if ( (LA81_0==188) ) {
                        alt81=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 81, 0, input);

                        throw nvae;
                    }
                    switch (alt81) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:361:16: 'am'
                            {
                            string_literal218=(Token)match(input,187,FOLLOW_187_in_timeValue1879);  
                            stream_187.add(string_literal218);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:361:21: 'a.m.'
                            {
                            string_literal219=(Token)match(input,188,FOLLOW_188_in_timeValue1881);  
                            stream_188.add(string_literal219);


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
                    // 362:2: -> ^( TIME timeFormat AM )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:362:5: ^( TIME timeFormat AM )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:363:4: integerValue ( 'am' | 'a.m.' )
                    {
                    pushFollow(FOLLOW_integerValue_in_timeValue1898);
                    integerValue220=integerValue();

                    state._fsp--;

                    stream_integerValue.add(integerValue220.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:363:17: ( 'am' | 'a.m.' )
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==187) ) {
                        alt82=1;
                    }
                    else if ( (LA82_0==188) ) {
                        alt82=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 82, 0, input);

                        throw nvae;
                    }
                    switch (alt82) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:363:18: 'am'
                            {
                            string_literal221=(Token)match(input,187,FOLLOW_187_in_timeValue1901);  
                            stream_187.add(string_literal221);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:363:23: 'a.m.'
                            {
                            string_literal222=(Token)match(input,188,FOLLOW_188_in_timeValue1903);  
                            stream_188.add(string_literal222);


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
                    // 364:2: -> ^( TIME integerValue HOUR AM )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:364:5: ^( TIME integerValue HOUR AM )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:365:4: timeFormat ( 'pm' | 'p.m.' )
                    {
                    pushFollow(FOLLOW_timeFormat_in_timeValue1922);
                    timeFormat223=timeFormat();

                    state._fsp--;

                    stream_timeFormat.add(timeFormat223.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:365:15: ( 'pm' | 'p.m.' )
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
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:365:16: 'pm'
                            {
                            string_literal224=(Token)match(input,189,FOLLOW_189_in_timeValue1925);  
                            stream_189.add(string_literal224);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:365:21: 'p.m.'
                            {
                            string_literal225=(Token)match(input,190,FOLLOW_190_in_timeValue1927);  
                            stream_190.add(string_literal225);


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
                    // 366:2: -> ^( TIME timeFormat PM )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:366:5: ^( TIME timeFormat PM )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:367:4: integerValue ( 'pm' | 'p.m.' )
                    {
                    pushFollow(FOLLOW_integerValue_in_timeValue1944);
                    integerValue226=integerValue();

                    state._fsp--;

                    stream_integerValue.add(integerValue226.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:367:17: ( 'pm' | 'p.m.' )
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
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:367:18: 'pm'
                            {
                            string_literal227=(Token)match(input,189,FOLLOW_189_in_timeValue1947);  
                            stream_189.add(string_literal227);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:367:23: 'p.m.'
                            {
                            string_literal228=(Token)match(input,190,FOLLOW_190_in_timeValue1949);  
                            stream_190.add(string_literal228);


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
                    // 368:2: -> ^( TIME integerValue HOUR PM )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:368:5: ^( TIME integerValue HOUR PM )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:369:4: timeFormat
                    {
                    pushFollow(FOLLOW_timeFormat_in_timeValue1968);
                    timeFormat229=timeFormat();

                    state._fsp--;

                    stream_timeFormat.add(timeFormat229.getTree());


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
                    // 370:2: -> ^( TIME timeFormat HOUR24 )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:370:5: ^( TIME timeFormat HOUR24 )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:373:1: timeFormat : (hr= integerValue ':' min= integerValue -> $hr HOUR $min MINUTE | hr= integerValue ':' min= integerValue ':' s= numericValue -> $hr HOUR $min MINUTE $s SECOND );
    public final flipsParser.timeFormat_return timeFormat() throws RecognitionException {
        flipsParser.timeFormat_return retval = new flipsParser.timeFormat_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal230=null;
        Token char_literal231=null;
        Token char_literal232=null;
        flipsParser.integerValue_return hr = null;

        flipsParser.integerValue_return min = null;

        flipsParser.numericValue_return s = null;


        CommonTree char_literal230_tree=null;
        CommonTree char_literal231_tree=null;
        CommonTree char_literal232_tree=null;
        RewriteRuleTokenStream stream_191=new RewriteRuleTokenStream(adaptor,"token 191");
        RewriteRuleSubtreeStream stream_integerValue=new RewriteRuleSubtreeStream(adaptor,"rule integerValue");
        RewriteRuleSubtreeStream stream_numericValue=new RewriteRuleSubtreeStream(adaptor,"rule numericValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:374:2: (hr= integerValue ':' min= integerValue -> $hr HOUR $min MINUTE | hr= integerValue ':' min= integerValue ':' s= numericValue -> $hr HOUR $min MINUTE $s SECOND )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( ((LA86_0>=BinaryLiteral && LA86_0<=HexLiteral)) ) {
                int LA86_1 = input.LA(2);

                if ( (LA86_1==191) ) {
                    int LA86_2 = input.LA(3);

                    if ( ((LA86_2>=BinaryLiteral && LA86_2<=HexLiteral)) ) {
                        int LA86_3 = input.LA(4);

                        if ( (LA86_3==EOF||(LA86_3>=Identifier && LA86_3<=With)||(LA86_3>=Turning && LA86_3<=HexLiteral)||(LA86_3>=107 && LA86_3<=114)||(LA86_3>=116 && LA86_3<=117)||(LA86_3>=119 && LA86_3<=120)||LA86_3==123||(LA86_3>=144 && LA86_3<=145)||(LA86_3>=187 && LA86_3<=190)||LA86_3==200||(LA86_3>=205 && LA86_3<=257)) ) {
                            alt86=1;
                        }
                        else if ( (LA86_3==191) ) {
                            alt86=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 86, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 86, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 86, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }
            switch (alt86) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:374:4: hr= integerValue ':' min= integerValue
                    {
                    pushFollow(FOLLOW_integerValue_in_timeFormat1992);
                    hr=integerValue();

                    state._fsp--;

                    stream_integerValue.add(hr.getTree());
                    char_literal230=(Token)match(input,191,FOLLOW_191_in_timeFormat1994);  
                    stream_191.add(char_literal230);

                    pushFollow(FOLLOW_integerValue_in_timeFormat1998);
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
                    // 375:2: -> $hr HOUR $min MINUTE
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:376:4: hr= integerValue ':' min= integerValue ':' s= numericValue
                    {
                    pushFollow(FOLLOW_integerValue_in_timeFormat2018);
                    hr=integerValue();

                    state._fsp--;

                    stream_integerValue.add(hr.getTree());
                    char_literal231=(Token)match(input,191,FOLLOW_191_in_timeFormat2020);  
                    stream_191.add(char_literal231);

                    pushFollow(FOLLOW_integerValue_in_timeFormat2024);
                    min=integerValue();

                    state._fsp--;

                    stream_integerValue.add(min.getTree());
                    char_literal232=(Token)match(input,191,FOLLOW_191_in_timeFormat2026);  
                    stream_191.add(char_literal232);

                    pushFollow(FOLLOW_numericValue_in_timeFormat2030);
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
                    // 377:2: -> $hr HOUR $min MINUTE $s SECOND
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:380:1: timeUnit : ( hour | minute | second );
    public final flipsParser.timeUnit_return timeUnit() throws RecognitionException {
        flipsParser.timeUnit_return retval = new flipsParser.timeUnit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.hour_return hour233 = null;

        flipsParser.minute_return minute234 = null;

        flipsParser.second_return second235 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:380:9: ( hour | minute | second )
            int alt87=3;
            switch ( input.LA(1) ) {
            case 192:
            case 193:
            case 194:
            case 195:
            case 196:
                {
                alt87=1;
                }
                break;
            case 177:
            case 197:
            case 198:
            case 199:
                {
                alt87=2;
                }
                break;
            case 200:
            case 201:
            case 202:
            case 203:
            case 204:
                {
                alt87=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }

            switch (alt87) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:380:11: hour
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_hour_in_timeUnit2058);
                    hour233=hour();

                    state._fsp--;

                    adaptor.addChild(root_0, hour233.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:381:4: minute
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_minute_in_timeUnit2063);
                    minute234=minute();

                    state._fsp--;

                    adaptor.addChild(root_0, minute234.getTree());

                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:382:4: second
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_second_in_timeUnit2068);
                    second235=second();

                    state._fsp--;

                    adaptor.addChild(root_0, second235.getTree());

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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:385:1: hour : ( 'h' | 'hr' | 'hrs' | 'hour' | 'hours' ) -> HOUR ;
    public final flipsParser.hour_return hour() throws RecognitionException {
        flipsParser.hour_return retval = new flipsParser.hour_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal236=null;
        Token string_literal237=null;
        Token string_literal238=null;
        Token string_literal239=null;
        Token string_literal240=null;

        CommonTree char_literal236_tree=null;
        CommonTree string_literal237_tree=null;
        CommonTree string_literal238_tree=null;
        CommonTree string_literal239_tree=null;
        CommonTree string_literal240_tree=null;
        RewriteRuleTokenStream stream_195=new RewriteRuleTokenStream(adaptor,"token 195");
        RewriteRuleTokenStream stream_194=new RewriteRuleTokenStream(adaptor,"token 194");
        RewriteRuleTokenStream stream_196=new RewriteRuleTokenStream(adaptor,"token 196");
        RewriteRuleTokenStream stream_193=new RewriteRuleTokenStream(adaptor,"token 193");
        RewriteRuleTokenStream stream_192=new RewriteRuleTokenStream(adaptor,"token 192");

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:386:2: ( ( 'h' | 'hr' | 'hrs' | 'hour' | 'hours' ) -> HOUR )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:386:4: ( 'h' | 'hr' | 'hrs' | 'hour' | 'hours' )
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:386:4: ( 'h' | 'hr' | 'hrs' | 'hour' | 'hours' )
            int alt88=5;
            switch ( input.LA(1) ) {
            case 192:
                {
                alt88=1;
                }
                break;
            case 193:
                {
                alt88=2;
                }
                break;
            case 194:
                {
                alt88=3;
                }
                break;
            case 195:
                {
                alt88=4;
                }
                break;
            case 196:
                {
                alt88=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }

            switch (alt88) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:386:5: 'h'
                    {
                    char_literal236=(Token)match(input,192,FOLLOW_192_in_hour2080);  
                    stream_192.add(char_literal236);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:386:9: 'hr'
                    {
                    string_literal237=(Token)match(input,193,FOLLOW_193_in_hour2082);  
                    stream_193.add(string_literal237);


                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:386:14: 'hrs'
                    {
                    string_literal238=(Token)match(input,194,FOLLOW_194_in_hour2084);  
                    stream_194.add(string_literal238);


                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:386:20: 'hour'
                    {
                    string_literal239=(Token)match(input,195,FOLLOW_195_in_hour2086);  
                    stream_195.add(string_literal239);


                    }
                    break;
                case 5 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:386:27: 'hours'
                    {
                    string_literal240=(Token)match(input,196,FOLLOW_196_in_hour2088);  
                    stream_196.add(string_literal240);


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
            // 387:2: -> HOUR
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:390:1: minute : ( 'min' | 'mins' | 'minute' | 'minutes' ) -> MINUTE ;
    public final flipsParser.minute_return minute() throws RecognitionException {
        flipsParser.minute_return retval = new flipsParser.minute_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal241=null;
        Token string_literal242=null;
        Token string_literal243=null;
        Token string_literal244=null;

        CommonTree string_literal241_tree=null;
        CommonTree string_literal242_tree=null;
        CommonTree string_literal243_tree=null;
        CommonTree string_literal244_tree=null;
        RewriteRuleTokenStream stream_198=new RewriteRuleTokenStream(adaptor,"token 198");
        RewriteRuleTokenStream stream_199=new RewriteRuleTokenStream(adaptor,"token 199");
        RewriteRuleTokenStream stream_197=new RewriteRuleTokenStream(adaptor,"token 197");
        RewriteRuleTokenStream stream_177=new RewriteRuleTokenStream(adaptor,"token 177");

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:391:2: ( ( 'min' | 'mins' | 'minute' | 'minutes' ) -> MINUTE )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:391:4: ( 'min' | 'mins' | 'minute' | 'minutes' )
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:391:4: ( 'min' | 'mins' | 'minute' | 'minutes' )
            int alt89=4;
            switch ( input.LA(1) ) {
            case 177:
                {
                alt89=1;
                }
                break;
            case 197:
                {
                alt89=2;
                }
                break;
            case 198:
                {
                alt89=3;
                }
                break;
            case 199:
                {
                alt89=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }

            switch (alt89) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:391:5: 'min'
                    {
                    string_literal241=(Token)match(input,177,FOLLOW_177_in_minute2106);  
                    stream_177.add(string_literal241);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:391:11: 'mins'
                    {
                    string_literal242=(Token)match(input,197,FOLLOW_197_in_minute2108);  
                    stream_197.add(string_literal242);


                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:391:18: 'minute'
                    {
                    string_literal243=(Token)match(input,198,FOLLOW_198_in_minute2110);  
                    stream_198.add(string_literal243);


                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:391:27: 'minutes'
                    {
                    string_literal244=(Token)match(input,199,FOLLOW_199_in_minute2112);  
                    stream_199.add(string_literal244);


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
            // 392:2: -> MINUTE
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:395:1: second : ( 's' | 'sec' | 'secs' | 'second' | 'seconds' ) -> SECOND ;
    public final flipsParser.second_return second() throws RecognitionException {
        flipsParser.second_return retval = new flipsParser.second_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal245=null;
        Token string_literal246=null;
        Token string_literal247=null;
        Token string_literal248=null;
        Token string_literal249=null;

        CommonTree char_literal245_tree=null;
        CommonTree string_literal246_tree=null;
        CommonTree string_literal247_tree=null;
        CommonTree string_literal248_tree=null;
        CommonTree string_literal249_tree=null;
        RewriteRuleTokenStream stream_202=new RewriteRuleTokenStream(adaptor,"token 202");
        RewriteRuleTokenStream stream_203=new RewriteRuleTokenStream(adaptor,"token 203");
        RewriteRuleTokenStream stream_204=new RewriteRuleTokenStream(adaptor,"token 204");
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleTokenStream stream_201=new RewriteRuleTokenStream(adaptor,"token 201");

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:396:2: ( ( 's' | 'sec' | 'secs' | 'second' | 'seconds' ) -> SECOND )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:396:4: ( 's' | 'sec' | 'secs' | 'second' | 'seconds' )
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:396:4: ( 's' | 'sec' | 'secs' | 'second' | 'seconds' )
            int alt90=5;
            switch ( input.LA(1) ) {
            case 200:
                {
                alt90=1;
                }
                break;
            case 201:
                {
                alt90=2;
                }
                break;
            case 202:
                {
                alt90=3;
                }
                break;
            case 203:
                {
                alt90=4;
                }
                break;
            case 204:
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:396:5: 's'
                    {
                    char_literal245=(Token)match(input,200,FOLLOW_200_in_second2130);  
                    stream_200.add(char_literal245);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:396:9: 'sec'
                    {
                    string_literal246=(Token)match(input,201,FOLLOW_201_in_second2132);  
                    stream_201.add(string_literal246);


                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:396:15: 'secs'
                    {
                    string_literal247=(Token)match(input,202,FOLLOW_202_in_second2134);  
                    stream_202.add(string_literal247);


                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:396:22: 'second'
                    {
                    string_literal248=(Token)match(input,203,FOLLOW_203_in_second2136);  
                    stream_203.add(string_literal248);


                    }
                    break;
                case 5 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:396:31: 'seconds'
                    {
                    string_literal249=(Token)match(input,204,FOLLOW_204_in_second2138);  
                    stream_204.add(string_literal249);


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
            // 397:2: -> SECOND
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:400:1: duration : 'for' durationValue -> ^( DURATION durationValue ) ;
    public final flipsParser.duration_return duration() throws RecognitionException {
        flipsParser.duration_return retval = new flipsParser.duration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal250=null;
        flipsParser.durationValue_return durationValue251 = null;


        CommonTree string_literal250_tree=null;
        RewriteRuleTokenStream stream_205=new RewriteRuleTokenStream(adaptor,"token 205");
        RewriteRuleSubtreeStream stream_durationValue=new RewriteRuleSubtreeStream(adaptor,"rule durationValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:401:2: ( 'for' durationValue -> ^( DURATION durationValue ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:401:4: 'for' durationValue
            {
            string_literal250=(Token)match(input,205,FOLLOW_205_in_duration2155);  
            stream_205.add(string_literal250);

            pushFollow(FOLLOW_durationValue_in_duration2157);
            durationValue251=durationValue();

            state._fsp--;

            stream_durationValue.add(durationValue251.getTree());


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
            // 402:2: -> ^( DURATION durationValue )
            {
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:402:5: ^( DURATION durationValue )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:405:1: durationValue : ( numericValue timeUnit | integerValue hour numericValue ( minute | second ) | integerValue hour integerValue minute numericValue second | integerValue minute numericValue second | timeFormat );
    public final flipsParser.durationValue_return durationValue() throws RecognitionException {
        flipsParser.durationValue_return retval = new flipsParser.durationValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.numericValue_return numericValue252 = null;

        flipsParser.timeUnit_return timeUnit253 = null;

        flipsParser.integerValue_return integerValue254 = null;

        flipsParser.hour_return hour255 = null;

        flipsParser.numericValue_return numericValue256 = null;

        flipsParser.minute_return minute257 = null;

        flipsParser.second_return second258 = null;

        flipsParser.integerValue_return integerValue259 = null;

        flipsParser.hour_return hour260 = null;

        flipsParser.integerValue_return integerValue261 = null;

        flipsParser.minute_return minute262 = null;

        flipsParser.numericValue_return numericValue263 = null;

        flipsParser.second_return second264 = null;

        flipsParser.integerValue_return integerValue265 = null;

        flipsParser.minute_return minute266 = null;

        flipsParser.numericValue_return numericValue267 = null;

        flipsParser.second_return second268 = null;

        flipsParser.timeFormat_return timeFormat269 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:406:2: ( numericValue timeUnit | integerValue hour numericValue ( minute | second ) | integerValue hour integerValue minute numericValue second | integerValue minute numericValue second | timeFormat )
            int alt92=5;
            alt92 = dfa92.predict(input);
            switch (alt92) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:406:4: numericValue timeUnit
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_numericValue_in_durationValue2177);
                    numericValue252=numericValue();

                    state._fsp--;

                    adaptor.addChild(root_0, numericValue252.getTree());
                    pushFollow(FOLLOW_timeUnit_in_durationValue2179);
                    timeUnit253=timeUnit();

                    state._fsp--;

                    adaptor.addChild(root_0, timeUnit253.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:407:4: integerValue hour numericValue ( minute | second )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_integerValue_in_durationValue2184);
                    integerValue254=integerValue();

                    state._fsp--;

                    adaptor.addChild(root_0, integerValue254.getTree());
                    pushFollow(FOLLOW_hour_in_durationValue2186);
                    hour255=hour();

                    state._fsp--;

                    adaptor.addChild(root_0, hour255.getTree());
                    pushFollow(FOLLOW_numericValue_in_durationValue2188);
                    numericValue256=numericValue();

                    state._fsp--;

                    adaptor.addChild(root_0, numericValue256.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:407:35: ( minute | second )
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==177||(LA91_0>=197 && LA91_0<=199)) ) {
                        alt91=1;
                    }
                    else if ( ((LA91_0>=200 && LA91_0<=204)) ) {
                        alt91=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 91, 0, input);

                        throw nvae;
                    }
                    switch (alt91) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:407:36: minute
                            {
                            pushFollow(FOLLOW_minute_in_durationValue2191);
                            minute257=minute();

                            state._fsp--;

                            adaptor.addChild(root_0, minute257.getTree());

                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:407:43: second
                            {
                            pushFollow(FOLLOW_second_in_durationValue2193);
                            second258=second();

                            state._fsp--;

                            adaptor.addChild(root_0, second258.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:408:4: integerValue hour integerValue minute numericValue second
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_integerValue_in_durationValue2199);
                    integerValue259=integerValue();

                    state._fsp--;

                    adaptor.addChild(root_0, integerValue259.getTree());
                    pushFollow(FOLLOW_hour_in_durationValue2201);
                    hour260=hour();

                    state._fsp--;

                    adaptor.addChild(root_0, hour260.getTree());
                    pushFollow(FOLLOW_integerValue_in_durationValue2203);
                    integerValue261=integerValue();

                    state._fsp--;

                    adaptor.addChild(root_0, integerValue261.getTree());
                    pushFollow(FOLLOW_minute_in_durationValue2205);
                    minute262=minute();

                    state._fsp--;

                    adaptor.addChild(root_0, minute262.getTree());
                    pushFollow(FOLLOW_numericValue_in_durationValue2207);
                    numericValue263=numericValue();

                    state._fsp--;

                    adaptor.addChild(root_0, numericValue263.getTree());
                    pushFollow(FOLLOW_second_in_durationValue2209);
                    second264=second();

                    state._fsp--;

                    adaptor.addChild(root_0, second264.getTree());

                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:409:4: integerValue minute numericValue second
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_integerValue_in_durationValue2214);
                    integerValue265=integerValue();

                    state._fsp--;

                    adaptor.addChild(root_0, integerValue265.getTree());
                    pushFollow(FOLLOW_minute_in_durationValue2216);
                    minute266=minute();

                    state._fsp--;

                    adaptor.addChild(root_0, minute266.getTree());
                    pushFollow(FOLLOW_numericValue_in_durationValue2218);
                    numericValue267=numericValue();

                    state._fsp--;

                    adaptor.addChild(root_0, numericValue267.getTree());
                    pushFollow(FOLLOW_second_in_durationValue2220);
                    second268=second();

                    state._fsp--;

                    adaptor.addChild(root_0, second268.getTree());

                    }
                    break;
                case 5 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:410:4: timeFormat
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_timeFormat_in_durationValue2225);
                    timeFormat269=timeFormat();

                    state._fsp--;

                    adaptor.addChild(root_0, timeFormat269.getTree());

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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:415:1: direction : ( fixedDirection -> ^( DIRECTION FIXED fixedDirection ) | relativeDirection -> ^( DIRECTION RELATIVE relativeDirection ) );
    public final flipsParser.direction_return direction() throws RecognitionException {
        flipsParser.direction_return retval = new flipsParser.direction_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.fixedDirection_return fixedDirection270 = null;

        flipsParser.relativeDirection_return relativeDirection271 = null;


        RewriteRuleSubtreeStream stream_fixedDirection=new RewriteRuleSubtreeStream(adaptor,"rule fixedDirection");
        RewriteRuleSubtreeStream stream_relativeDirection=new RewriteRuleSubtreeStream(adaptor,"rule relativeDirection");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:416:2: ( fixedDirection -> ^( DIRECTION FIXED fixedDirection ) | relativeDirection -> ^( DIRECTION RELATIVE relativeDirection ) )
            int alt93=2;
            switch ( input.LA(1) ) {
            case 200:
            case 206:
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
                {
                alt93=1;
                }
                break;
            case Turning:
                {
                int LA93_2 = input.LA(2);

                if ( ((LA93_2>=248 && LA93_2<=253)) ) {
                    alt93=2;
                }
                else if ( ((LA93_2>=FloatingPointLiteral && LA93_2<=HexLiteral)||LA93_2==200||(LA93_2>=206 && LA93_2<=236)) ) {
                    alt93=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 93, 2, input);

                    throw nvae;
                }
                }
                break;
            case Heading:
                {
                int LA93_3 = input.LA(2);

                if ( ((LA93_3>=FloatingPointLiteral && LA93_3<=HexLiteral)||LA93_3==200||(LA93_3>=206 && LA93_3<=236)) ) {
                    alt93=1;
                }
                else if ( ((LA93_3>=248 && LA93_3<=253)) ) {
                    alt93=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 93, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }

            switch (alt93) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:416:4: fixedDirection
                    {
                    pushFollow(FOLLOW_fixedDirection_in_direction2238);
                    fixedDirection270=fixedDirection();

                    state._fsp--;

                    stream_fixedDirection.add(fixedDirection270.getTree());


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
                    // 417:2: -> ^( DIRECTION FIXED fixedDirection )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:417:5: ^( DIRECTION FIXED fixedDirection )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:418:4: relativeDirection
                    {
                    pushFollow(FOLLOW_relativeDirection_in_direction2254);
                    relativeDirection271=relativeDirection();

                    state._fsp--;

                    stream_relativeDirection.add(relativeDirection271.getTree());


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
                    // 419:2: -> ^( DIRECTION RELATIVE relativeDirection )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:419:5: ^( DIRECTION RELATIVE relativeDirection )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:422:1: fixedDirection : ( cardinalDirection -> cardinalDirection | ordinalDirection -> ordinalDirection | subOrdinalDirection -> subOrdinalDirection | ( Turning | Heading ) ( cardinalDirection | ordinalDirection | subOrdinalDirection | angularValue ) -> ( cardinalDirection )? ( ordinalDirection )? ( subOrdinalDirection )? ( angularValue )? );
    public final flipsParser.fixedDirection_return fixedDirection() throws RecognitionException {
        flipsParser.fixedDirection_return retval = new flipsParser.fixedDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Turning275=null;
        Token Heading276=null;
        flipsParser.cardinalDirection_return cardinalDirection272 = null;

        flipsParser.ordinalDirection_return ordinalDirection273 = null;

        flipsParser.subOrdinalDirection_return subOrdinalDirection274 = null;

        flipsParser.cardinalDirection_return cardinalDirection277 = null;

        flipsParser.ordinalDirection_return ordinalDirection278 = null;

        flipsParser.subOrdinalDirection_return subOrdinalDirection279 = null;

        flipsParser.angularValue_return angularValue280 = null;


        CommonTree Turning275_tree=null;
        CommonTree Heading276_tree=null;
        RewriteRuleTokenStream stream_Turning=new RewriteRuleTokenStream(adaptor,"token Turning");
        RewriteRuleTokenStream stream_Heading=new RewriteRuleTokenStream(adaptor,"token Heading");
        RewriteRuleSubtreeStream stream_angularValue=new RewriteRuleSubtreeStream(adaptor,"rule angularValue");
        RewriteRuleSubtreeStream stream_ordinalDirection=new RewriteRuleSubtreeStream(adaptor,"rule ordinalDirection");
        RewriteRuleSubtreeStream stream_subOrdinalDirection=new RewriteRuleSubtreeStream(adaptor,"rule subOrdinalDirection");
        RewriteRuleSubtreeStream stream_cardinalDirection=new RewriteRuleSubtreeStream(adaptor,"rule cardinalDirection");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:423:2: ( cardinalDirection -> cardinalDirection | ordinalDirection -> ordinalDirection | subOrdinalDirection -> subOrdinalDirection | ( Turning | Heading ) ( cardinalDirection | ordinalDirection | subOrdinalDirection | angularValue ) -> ( cardinalDirection )? ( ordinalDirection )? ( subOrdinalDirection )? ( angularValue )? )
            int alt96=4;
            switch ( input.LA(1) ) {
            case 200:
            case 206:
            case 207:
            case 208:
            case 209:
            case 210:
            case 211:
            case 212:
                {
                alt96=1;
                }
                break;
            case 213:
            case 214:
            case 215:
            case 216:
            case 217:
            case 218:
            case 219:
            case 220:
                {
                alt96=2;
                }
                break;
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
                {
                alt96=3;
                }
                break;
            case Turning:
            case Heading:
                {
                alt96=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }

            switch (alt96) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:423:4: cardinalDirection
                    {
                    pushFollow(FOLLOW_cardinalDirection_in_fixedDirection2276);
                    cardinalDirection272=cardinalDirection();

                    state._fsp--;

                    stream_cardinalDirection.add(cardinalDirection272.getTree());


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
                    // 424:2: -> cardinalDirection
                    {
                        adaptor.addChild(root_0, stream_cardinalDirection.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:425:4: ordinalDirection
                    {
                    pushFollow(FOLLOW_ordinalDirection_in_fixedDirection2286);
                    ordinalDirection273=ordinalDirection();

                    state._fsp--;

                    stream_ordinalDirection.add(ordinalDirection273.getTree());


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
                    // 426:2: -> ordinalDirection
                    {
                        adaptor.addChild(root_0, stream_ordinalDirection.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:427:4: subOrdinalDirection
                    {
                    pushFollow(FOLLOW_subOrdinalDirection_in_fixedDirection2296);
                    subOrdinalDirection274=subOrdinalDirection();

                    state._fsp--;

                    stream_subOrdinalDirection.add(subOrdinalDirection274.getTree());


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
                    // 428:2: -> subOrdinalDirection
                    {
                        adaptor.addChild(root_0, stream_subOrdinalDirection.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:429:4: ( Turning | Heading ) ( cardinalDirection | ordinalDirection | subOrdinalDirection | angularValue )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:429:4: ( Turning | Heading )
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==Turning) ) {
                        alt94=1;
                    }
                    else if ( (LA94_0==Heading) ) {
                        alt94=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 94, 0, input);

                        throw nvae;
                    }
                    switch (alt94) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:429:5: Turning
                            {
                            Turning275=(Token)match(input,Turning,FOLLOW_Turning_in_fixedDirection2307);  
                            stream_Turning.add(Turning275);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:429:13: Heading
                            {
                            Heading276=(Token)match(input,Heading,FOLLOW_Heading_in_fixedDirection2309);  
                            stream_Heading.add(Heading276);


                            }
                            break;

                    }

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:429:22: ( cardinalDirection | ordinalDirection | subOrdinalDirection | angularValue )
                    int alt95=4;
                    switch ( input.LA(1) ) {
                    case 200:
                    case 206:
                    case 207:
                    case 208:
                    case 209:
                    case 210:
                    case 211:
                    case 212:
                        {
                        alt95=1;
                        }
                        break;
                    case 213:
                    case 214:
                    case 215:
                    case 216:
                    case 217:
                    case 218:
                    case 219:
                    case 220:
                        {
                        alt95=2;
                        }
                        break;
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
                        {
                        alt95=3;
                        }
                        break;
                    case FloatingPointLiteral:
                    case BinaryLiteral:
                    case OctalLiteral:
                    case DecimalLiteral:
                    case HexLiteral:
                        {
                        alt95=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 95, 0, input);

                        throw nvae;
                    }

                    switch (alt95) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:429:23: cardinalDirection
                            {
                            pushFollow(FOLLOW_cardinalDirection_in_fixedDirection2313);
                            cardinalDirection277=cardinalDirection();

                            state._fsp--;

                            stream_cardinalDirection.add(cardinalDirection277.getTree());

                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:429:41: ordinalDirection
                            {
                            pushFollow(FOLLOW_ordinalDirection_in_fixedDirection2315);
                            ordinalDirection278=ordinalDirection();

                            state._fsp--;

                            stream_ordinalDirection.add(ordinalDirection278.getTree());

                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:429:58: subOrdinalDirection
                            {
                            pushFollow(FOLLOW_subOrdinalDirection_in_fixedDirection2317);
                            subOrdinalDirection279=subOrdinalDirection();

                            state._fsp--;

                            stream_subOrdinalDirection.add(subOrdinalDirection279.getTree());

                            }
                            break;
                        case 4 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:429:78: angularValue
                            {
                            pushFollow(FOLLOW_angularValue_in_fixedDirection2319);
                            angularValue280=angularValue();

                            state._fsp--;

                            stream_angularValue.add(angularValue280.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: cardinalDirection, angularValue, ordinalDirection, subOrdinalDirection
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 430:2: -> ( cardinalDirection )? ( ordinalDirection )? ( subOrdinalDirection )? ( angularValue )?
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:430:5: ( cardinalDirection )?
                        if ( stream_cardinalDirection.hasNext() ) {
                            adaptor.addChild(root_0, stream_cardinalDirection.nextTree());

                        }
                        stream_cardinalDirection.reset();
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:430:24: ( ordinalDirection )?
                        if ( stream_ordinalDirection.hasNext() ) {
                            adaptor.addChild(root_0, stream_ordinalDirection.nextTree());

                        }
                        stream_ordinalDirection.reset();
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:430:42: ( subOrdinalDirection )?
                        if ( stream_subOrdinalDirection.hasNext() ) {
                            adaptor.addChild(root_0, stream_subOrdinalDirection.nextTree());

                        }
                        stream_subOrdinalDirection.reset();
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:430:63: ( angularValue )?
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:433:1: relativeDirection : ( Turning | Heading ) leftRightDirection angularValue -> leftRightDirection angularValue ;
    public final flipsParser.relativeDirection_return relativeDirection() throws RecognitionException {
        flipsParser.relativeDirection_return retval = new flipsParser.relativeDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Turning281=null;
        Token Heading282=null;
        flipsParser.leftRightDirection_return leftRightDirection283 = null;

        flipsParser.angularValue_return angularValue284 = null;


        CommonTree Turning281_tree=null;
        CommonTree Heading282_tree=null;
        RewriteRuleTokenStream stream_Turning=new RewriteRuleTokenStream(adaptor,"token Turning");
        RewriteRuleTokenStream stream_Heading=new RewriteRuleTokenStream(adaptor,"token Heading");
        RewriteRuleSubtreeStream stream_angularValue=new RewriteRuleSubtreeStream(adaptor,"rule angularValue");
        RewriteRuleSubtreeStream stream_leftRightDirection=new RewriteRuleSubtreeStream(adaptor,"rule leftRightDirection");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:434:2: ( ( Turning | Heading ) leftRightDirection angularValue -> leftRightDirection angularValue )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:434:4: ( Turning | Heading ) leftRightDirection angularValue
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:434:4: ( Turning | Heading )
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==Turning) ) {
                alt97=1;
            }
            else if ( (LA97_0==Heading) ) {
                alt97=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }
            switch (alt97) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:434:5: Turning
                    {
                    Turning281=(Token)match(input,Turning,FOLLOW_Turning_in_relativeDirection2347);  
                    stream_Turning.add(Turning281);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:434:13: Heading
                    {
                    Heading282=(Token)match(input,Heading,FOLLOW_Heading_in_relativeDirection2349);  
                    stream_Heading.add(Heading282);


                    }
                    break;

            }

            pushFollow(FOLLOW_leftRightDirection_in_relativeDirection2352);
            leftRightDirection283=leftRightDirection();

            state._fsp--;

            stream_leftRightDirection.add(leftRightDirection283.getTree());
            pushFollow(FOLLOW_angularValue_in_relativeDirection2354);
            angularValue284=angularValue();

            state._fsp--;

            stream_angularValue.add(angularValue284.getTree());


            // AST REWRITE
            // elements: angularValue, leftRightDirection
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 435:2: -> leftRightDirection angularValue
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:438:1: cardinalDirection : ( northSouthDirection | eastWestDirection );
    public final flipsParser.cardinalDirection_return cardinalDirection() throws RecognitionException {
        flipsParser.cardinalDirection_return retval = new flipsParser.cardinalDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.northSouthDirection_return northSouthDirection285 = null;

        flipsParser.eastWestDirection_return eastWestDirection286 = null;



        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:439:2: ( northSouthDirection | eastWestDirection )
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==200||(LA98_0>=206 && LA98_0<=208)) ) {
                alt98=1;
            }
            else if ( ((LA98_0>=209 && LA98_0<=212)) ) {
                alt98=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }
            switch (alt98) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:439:4: northSouthDirection
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_northSouthDirection_in_cardinalDirection2372);
                    northSouthDirection285=northSouthDirection();

                    state._fsp--;

                    adaptor.addChild(root_0, northSouthDirection285.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:440:4: eastWestDirection
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_eastWestDirection_in_cardinalDirection2377);
                    eastWestDirection286=eastWestDirection();

                    state._fsp--;

                    adaptor.addChild(root_0, eastWestDirection286.getTree());

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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:443:1: northSouthDirection : ( ( 'n' | 'north' ) -> NORTH | ( 's' | 'south' ) -> SOUTH );
    public final flipsParser.northSouthDirection_return northSouthDirection() throws RecognitionException {
        flipsParser.northSouthDirection_return retval = new flipsParser.northSouthDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal287=null;
        Token string_literal288=null;
        Token char_literal289=null;
        Token string_literal290=null;

        CommonTree char_literal287_tree=null;
        CommonTree string_literal288_tree=null;
        CommonTree char_literal289_tree=null;
        CommonTree string_literal290_tree=null;
        RewriteRuleTokenStream stream_200=new RewriteRuleTokenStream(adaptor,"token 200");
        RewriteRuleTokenStream stream_206=new RewriteRuleTokenStream(adaptor,"token 206");
        RewriteRuleTokenStream stream_207=new RewriteRuleTokenStream(adaptor,"token 207");
        RewriteRuleTokenStream stream_208=new RewriteRuleTokenStream(adaptor,"token 208");

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:444:2: ( ( 'n' | 'north' ) -> NORTH | ( 's' | 'south' ) -> SOUTH )
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( ((LA101_0>=206 && LA101_0<=207)) ) {
                alt101=1;
            }
            else if ( (LA101_0==200||LA101_0==208) ) {
                alt101=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }
            switch (alt101) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:444:4: ( 'n' | 'north' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:444:4: ( 'n' | 'north' )
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==206) ) {
                        alt99=1;
                    }
                    else if ( (LA99_0==207) ) {
                        alt99=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 99, 0, input);

                        throw nvae;
                    }
                    switch (alt99) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:444:5: 'n'
                            {
                            char_literal287=(Token)match(input,206,FOLLOW_206_in_northSouthDirection2389);  
                            stream_206.add(char_literal287);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:444:9: 'north'
                            {
                            string_literal288=(Token)match(input,207,FOLLOW_207_in_northSouthDirection2391);  
                            stream_207.add(string_literal288);


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
                    // 445:2: -> NORTH
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NORTH, "NORTH"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:446:4: ( 's' | 'south' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:446:4: ( 's' | 'south' )
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==200) ) {
                        alt100=1;
                    }
                    else if ( (LA100_0==208) ) {
                        alt100=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 100, 0, input);

                        throw nvae;
                    }
                    switch (alt100) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:446:5: 's'
                            {
                            char_literal289=(Token)match(input,200,FOLLOW_200_in_northSouthDirection2403);  
                            stream_200.add(char_literal289);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:446:9: 'south'
                            {
                            string_literal290=(Token)match(input,208,FOLLOW_208_in_northSouthDirection2405);  
                            stream_208.add(string_literal290);


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
                    // 447:2: -> SOUTH
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:450:1: eastWestDirection : ( ( 'e' | 'east' ) -> EAST | ( 'w' | 'west' ) -> WEST );
    public final flipsParser.eastWestDirection_return eastWestDirection() throws RecognitionException {
        flipsParser.eastWestDirection_return retval = new flipsParser.eastWestDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal291=null;
        Token string_literal292=null;
        Token char_literal293=null;
        Token string_literal294=null;

        CommonTree char_literal291_tree=null;
        CommonTree string_literal292_tree=null;
        CommonTree char_literal293_tree=null;
        CommonTree string_literal294_tree=null;
        RewriteRuleTokenStream stream_211=new RewriteRuleTokenStream(adaptor,"token 211");
        RewriteRuleTokenStream stream_212=new RewriteRuleTokenStream(adaptor,"token 212");
        RewriteRuleTokenStream stream_210=new RewriteRuleTokenStream(adaptor,"token 210");
        RewriteRuleTokenStream stream_209=new RewriteRuleTokenStream(adaptor,"token 209");

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:451:2: ( ( 'e' | 'east' ) -> EAST | ( 'w' | 'west' ) -> WEST )
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( ((LA104_0>=209 && LA104_0<=210)) ) {
                alt104=1;
            }
            else if ( ((LA104_0>=211 && LA104_0<=212)) ) {
                alt104=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }
            switch (alt104) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:451:4: ( 'e' | 'east' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:451:4: ( 'e' | 'east' )
                    int alt102=2;
                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==209) ) {
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
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:451:5: 'e'
                            {
                            char_literal291=(Token)match(input,209,FOLLOW_209_in_eastWestDirection2423);  
                            stream_209.add(char_literal291);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:451:9: 'east'
                            {
                            string_literal292=(Token)match(input,210,FOLLOW_210_in_eastWestDirection2425);  
                            stream_210.add(string_literal292);


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
                    // 452:2: -> EAST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:453:4: ( 'w' | 'west' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:453:4: ( 'w' | 'west' )
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==211) ) {
                        alt103=1;
                    }
                    else if ( (LA103_0==212) ) {
                        alt103=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 103, 0, input);

                        throw nvae;
                    }
                    switch (alt103) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:453:5: 'w'
                            {
                            char_literal293=(Token)match(input,211,FOLLOW_211_in_eastWestDirection2437);  
                            stream_211.add(char_literal293);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:453:9: 'west'
                            {
                            string_literal294=(Token)match(input,212,FOLLOW_212_in_eastWestDirection2439);  
                            stream_212.add(string_literal294);


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
                    // 454:2: -> WEST
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:457:1: ordinalDirection : ( ( 'ne' | 'northeast' ) -> NORTH EAST | ( 'se' | 'southeast' ) -> SOUTH EAST | ( 'sw' | 'southwest' ) -> SOUTH WEST | ( 'nw' | 'northwest' ) -> NORTH WEST );
    public final flipsParser.ordinalDirection_return ordinalDirection() throws RecognitionException {
        flipsParser.ordinalDirection_return retval = new flipsParser.ordinalDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal295=null;
        Token string_literal296=null;
        Token string_literal297=null;
        Token string_literal298=null;
        Token string_literal299=null;
        Token string_literal300=null;
        Token string_literal301=null;
        Token string_literal302=null;

        CommonTree string_literal295_tree=null;
        CommonTree string_literal296_tree=null;
        CommonTree string_literal297_tree=null;
        CommonTree string_literal298_tree=null;
        CommonTree string_literal299_tree=null;
        CommonTree string_literal300_tree=null;
        CommonTree string_literal301_tree=null;
        CommonTree string_literal302_tree=null;
        RewriteRuleTokenStream stream_220=new RewriteRuleTokenStream(adaptor,"token 220");
        RewriteRuleTokenStream stream_215=new RewriteRuleTokenStream(adaptor,"token 215");
        RewriteRuleTokenStream stream_216=new RewriteRuleTokenStream(adaptor,"token 216");
        RewriteRuleTokenStream stream_213=new RewriteRuleTokenStream(adaptor,"token 213");
        RewriteRuleTokenStream stream_214=new RewriteRuleTokenStream(adaptor,"token 214");
        RewriteRuleTokenStream stream_219=new RewriteRuleTokenStream(adaptor,"token 219");
        RewriteRuleTokenStream stream_217=new RewriteRuleTokenStream(adaptor,"token 217");
        RewriteRuleTokenStream stream_218=new RewriteRuleTokenStream(adaptor,"token 218");

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:458:2: ( ( 'ne' | 'northeast' ) -> NORTH EAST | ( 'se' | 'southeast' ) -> SOUTH EAST | ( 'sw' | 'southwest' ) -> SOUTH WEST | ( 'nw' | 'northwest' ) -> NORTH WEST )
            int alt109=4;
            switch ( input.LA(1) ) {
            case 213:
            case 214:
                {
                alt109=1;
                }
                break;
            case 215:
            case 216:
                {
                alt109=2;
                }
                break;
            case 217:
            case 218:
                {
                alt109=3;
                }
                break;
            case 219:
            case 220:
                {
                alt109=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 109, 0, input);

                throw nvae;
            }

            switch (alt109) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:458:4: ( 'ne' | 'northeast' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:458:4: ( 'ne' | 'northeast' )
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
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:458:5: 'ne'
                            {
                            string_literal295=(Token)match(input,213,FOLLOW_213_in_ordinalDirection2457);  
                            stream_213.add(string_literal295);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:458:10: 'northeast'
                            {
                            string_literal296=(Token)match(input,214,FOLLOW_214_in_ordinalDirection2459);  
                            stream_214.add(string_literal296);


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
                    // 459:2: -> NORTH EAST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NORTH, "NORTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:460:4: ( 'se' | 'southeast' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:460:4: ( 'se' | 'southeast' )
                    int alt106=2;
                    int LA106_0 = input.LA(1);

                    if ( (LA106_0==215) ) {
                        alt106=1;
                    }
                    else if ( (LA106_0==216) ) {
                        alt106=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 106, 0, input);

                        throw nvae;
                    }
                    switch (alt106) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:460:5: 'se'
                            {
                            string_literal297=(Token)match(input,215,FOLLOW_215_in_ordinalDirection2473);  
                            stream_215.add(string_literal297);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:460:10: 'southeast'
                            {
                            string_literal298=(Token)match(input,216,FOLLOW_216_in_ordinalDirection2475);  
                            stream_216.add(string_literal298);


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
                    // 461:2: -> SOUTH EAST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:462:4: ( 'sw' | 'southwest' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:462:4: ( 'sw' | 'southwest' )
                    int alt107=2;
                    int LA107_0 = input.LA(1);

                    if ( (LA107_0==217) ) {
                        alt107=1;
                    }
                    else if ( (LA107_0==218) ) {
                        alt107=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 107, 0, input);

                        throw nvae;
                    }
                    switch (alt107) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:462:5: 'sw'
                            {
                            string_literal299=(Token)match(input,217,FOLLOW_217_in_ordinalDirection2489);  
                            stream_217.add(string_literal299);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:462:10: 'southwest'
                            {
                            string_literal300=(Token)match(input,218,FOLLOW_218_in_ordinalDirection2491);  
                            stream_218.add(string_literal300);


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
                    // 463:2: -> SOUTH WEST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(WEST, "WEST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:464:4: ( 'nw' | 'northwest' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:464:4: ( 'nw' | 'northwest' )
                    int alt108=2;
                    int LA108_0 = input.LA(1);

                    if ( (LA108_0==219) ) {
                        alt108=1;
                    }
                    else if ( (LA108_0==220) ) {
                        alt108=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 108, 0, input);

                        throw nvae;
                    }
                    switch (alt108) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:464:5: 'nw'
                            {
                            string_literal301=(Token)match(input,219,FOLLOW_219_in_ordinalDirection2505);  
                            stream_219.add(string_literal301);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:464:10: 'northwest'
                            {
                            string_literal302=(Token)match(input,220,FOLLOW_220_in_ordinalDirection2507);  
                            stream_220.add(string_literal302);


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
                    // 465:2: -> NORTH WEST
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:468:1: subOrdinalDirection : ( ( 'nne' | 'north-northeast' ) -> NORTH NORTH EAST | ( 'ene' | 'east-northeast' ) -> EAST NORTH EAST | ( 'ese' | 'east-southeast' ) -> EAST SOUTH EAST | ( 'sse' | 'south-southeast' ) -> SOUTH SOUTH EAST | ( 'ssw' | 'south-southwest' ) -> SOUTH SOUTH WEST | ( 'wsw' | 'west-southwest' ) -> WEST SOUTH WEST | ( 'wnw' | 'west-northwest' ) -> WEST NORTH WEST | ( 'nnw' | 'north-northwest' ) -> NORTH NORTH WEST );
    public final flipsParser.subOrdinalDirection_return subOrdinalDirection() throws RecognitionException {
        flipsParser.subOrdinalDirection_return retval = new flipsParser.subOrdinalDirection_return();
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
        Token string_literal311=null;
        Token string_literal312=null;
        Token string_literal313=null;
        Token string_literal314=null;
        Token string_literal315=null;
        Token string_literal316=null;
        Token string_literal317=null;
        Token string_literal318=null;

        CommonTree string_literal303_tree=null;
        CommonTree string_literal304_tree=null;
        CommonTree string_literal305_tree=null;
        CommonTree string_literal306_tree=null;
        CommonTree string_literal307_tree=null;
        CommonTree string_literal308_tree=null;
        CommonTree string_literal309_tree=null;
        CommonTree string_literal310_tree=null;
        CommonTree string_literal311_tree=null;
        CommonTree string_literal312_tree=null;
        CommonTree string_literal313_tree=null;
        CommonTree string_literal314_tree=null;
        CommonTree string_literal315_tree=null;
        CommonTree string_literal316_tree=null;
        CommonTree string_literal317_tree=null;
        CommonTree string_literal318_tree=null;
        RewriteRuleTokenStream stream_221=new RewriteRuleTokenStream(adaptor,"token 221");
        RewriteRuleTokenStream stream_222=new RewriteRuleTokenStream(adaptor,"token 222");
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

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:469:2: ( ( 'nne' | 'north-northeast' ) -> NORTH NORTH EAST | ( 'ene' | 'east-northeast' ) -> EAST NORTH EAST | ( 'ese' | 'east-southeast' ) -> EAST SOUTH EAST | ( 'sse' | 'south-southeast' ) -> SOUTH SOUTH EAST | ( 'ssw' | 'south-southwest' ) -> SOUTH SOUTH WEST | ( 'wsw' | 'west-southwest' ) -> WEST SOUTH WEST | ( 'wnw' | 'west-northwest' ) -> WEST NORTH WEST | ( 'nnw' | 'north-northwest' ) -> NORTH NORTH WEST )
            int alt118=8;
            switch ( input.LA(1) ) {
            case 221:
            case 222:
                {
                alt118=1;
                }
                break;
            case 223:
            case 224:
                {
                alt118=2;
                }
                break;
            case 225:
            case 226:
                {
                alt118=3;
                }
                break;
            case 227:
            case 228:
                {
                alt118=4;
                }
                break;
            case 229:
            case 230:
                {
                alt118=5;
                }
                break;
            case 231:
            case 232:
                {
                alt118=6;
                }
                break;
            case 233:
            case 234:
                {
                alt118=7;
                }
                break;
            case 235:
            case 236:
                {
                alt118=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 118, 0, input);

                throw nvae;
            }

            switch (alt118) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:469:4: ( 'nne' | 'north-northeast' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:469:4: ( 'nne' | 'north-northeast' )
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
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:469:5: 'nne'
                            {
                            string_literal303=(Token)match(input,221,FOLLOW_221_in_subOrdinalDirection2527);  
                            stream_221.add(string_literal303);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:469:11: 'north-northeast'
                            {
                            string_literal304=(Token)match(input,222,FOLLOW_222_in_subOrdinalDirection2529);  
                            stream_222.add(string_literal304);


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
                    // 470:2: -> NORTH NORTH EAST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NORTH, "NORTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NORTH, "NORTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:471:4: ( 'ene' | 'east-northeast' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:471:4: ( 'ene' | 'east-northeast' )
                    int alt111=2;
                    int LA111_0 = input.LA(1);

                    if ( (LA111_0==223) ) {
                        alt111=1;
                    }
                    else if ( (LA111_0==224) ) {
                        alt111=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 111, 0, input);

                        throw nvae;
                    }
                    switch (alt111) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:471:5: 'ene'
                            {
                            string_literal305=(Token)match(input,223,FOLLOW_223_in_subOrdinalDirection2545);  
                            stream_223.add(string_literal305);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:471:11: 'east-northeast'
                            {
                            string_literal306=(Token)match(input,224,FOLLOW_224_in_subOrdinalDirection2547);  
                            stream_224.add(string_literal306);


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
                    // 472:2: -> EAST NORTH EAST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NORTH, "NORTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:473:4: ( 'ese' | 'east-southeast' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:473:4: ( 'ese' | 'east-southeast' )
                    int alt112=2;
                    int LA112_0 = input.LA(1);

                    if ( (LA112_0==225) ) {
                        alt112=1;
                    }
                    else if ( (LA112_0==226) ) {
                        alt112=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 112, 0, input);

                        throw nvae;
                    }
                    switch (alt112) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:473:5: 'ese'
                            {
                            string_literal307=(Token)match(input,225,FOLLOW_225_in_subOrdinalDirection2563);  
                            stream_225.add(string_literal307);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:473:11: 'east-southeast'
                            {
                            string_literal308=(Token)match(input,226,FOLLOW_226_in_subOrdinalDirection2565);  
                            stream_226.add(string_literal308);


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
                    // 474:2: -> EAST SOUTH EAST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:475:4: ( 'sse' | 'south-southeast' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:475:4: ( 'sse' | 'south-southeast' )
                    int alt113=2;
                    int LA113_0 = input.LA(1);

                    if ( (LA113_0==227) ) {
                        alt113=1;
                    }
                    else if ( (LA113_0==228) ) {
                        alt113=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 113, 0, input);

                        throw nvae;
                    }
                    switch (alt113) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:475:5: 'sse'
                            {
                            string_literal309=(Token)match(input,227,FOLLOW_227_in_subOrdinalDirection2581);  
                            stream_227.add(string_literal309);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:475:11: 'south-southeast'
                            {
                            string_literal310=(Token)match(input,228,FOLLOW_228_in_subOrdinalDirection2583);  
                            stream_228.add(string_literal310);


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
                    // 476:2: -> SOUTH SOUTH EAST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(EAST, "EAST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:477:4: ( 'ssw' | 'south-southwest' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:477:4: ( 'ssw' | 'south-southwest' )
                    int alt114=2;
                    int LA114_0 = input.LA(1);

                    if ( (LA114_0==229) ) {
                        alt114=1;
                    }
                    else if ( (LA114_0==230) ) {
                        alt114=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 114, 0, input);

                        throw nvae;
                    }
                    switch (alt114) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:477:5: 'ssw'
                            {
                            string_literal311=(Token)match(input,229,FOLLOW_229_in_subOrdinalDirection2599);  
                            stream_229.add(string_literal311);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:477:11: 'south-southwest'
                            {
                            string_literal312=(Token)match(input,230,FOLLOW_230_in_subOrdinalDirection2601);  
                            stream_230.add(string_literal312);


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
                    // 478:2: -> SOUTH SOUTH WEST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(WEST, "WEST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:479:4: ( 'wsw' | 'west-southwest' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:479:4: ( 'wsw' | 'west-southwest' )
                    int alt115=2;
                    int LA115_0 = input.LA(1);

                    if ( (LA115_0==231) ) {
                        alt115=1;
                    }
                    else if ( (LA115_0==232) ) {
                        alt115=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 115, 0, input);

                        throw nvae;
                    }
                    switch (alt115) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:479:5: 'wsw'
                            {
                            string_literal313=(Token)match(input,231,FOLLOW_231_in_subOrdinalDirection2617);  
                            stream_231.add(string_literal313);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:479:11: 'west-southwest'
                            {
                            string_literal314=(Token)match(input,232,FOLLOW_232_in_subOrdinalDirection2619);  
                            stream_232.add(string_literal314);


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
                    // 480:2: -> WEST SOUTH WEST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(WEST, "WEST"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(SOUTH, "SOUTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(WEST, "WEST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:481:4: ( 'wnw' | 'west-northwest' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:481:4: ( 'wnw' | 'west-northwest' )
                    int alt116=2;
                    int LA116_0 = input.LA(1);

                    if ( (LA116_0==233) ) {
                        alt116=1;
                    }
                    else if ( (LA116_0==234) ) {
                        alt116=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 116, 0, input);

                        throw nvae;
                    }
                    switch (alt116) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:481:5: 'wnw'
                            {
                            string_literal315=(Token)match(input,233,FOLLOW_233_in_subOrdinalDirection2635);  
                            stream_233.add(string_literal315);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:481:11: 'west-northwest'
                            {
                            string_literal316=(Token)match(input,234,FOLLOW_234_in_subOrdinalDirection2637);  
                            stream_234.add(string_literal316);


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
                    // 482:2: -> WEST NORTH WEST
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(WEST, "WEST"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(NORTH, "NORTH"));
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(WEST, "WEST"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 8 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:483:4: ( 'nnw' | 'north-northwest' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:483:4: ( 'nnw' | 'north-northwest' )
                    int alt117=2;
                    int LA117_0 = input.LA(1);

                    if ( (LA117_0==235) ) {
                        alt117=1;
                    }
                    else if ( (LA117_0==236) ) {
                        alt117=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 117, 0, input);

                        throw nvae;
                    }
                    switch (alt117) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:483:5: 'nnw'
                            {
                            string_literal317=(Token)match(input,235,FOLLOW_235_in_subOrdinalDirection2653);  
                            stream_235.add(string_literal317);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:483:11: 'north-northwest'
                            {
                            string_literal318=(Token)match(input,236,FOLLOW_236_in_subOrdinalDirection2655);  
                            stream_236.add(string_literal318);


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
                    // 484:2: -> NORTH NORTH WEST
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:487:1: loiterDirection : ( Turning )? clockDirection -> ^( DIRECTION TURN clockDirection ) ;
    public final flipsParser.loiterDirection_return loiterDirection() throws RecognitionException {
        flipsParser.loiterDirection_return retval = new flipsParser.loiterDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Turning319=null;
        flipsParser.clockDirection_return clockDirection320 = null;


        CommonTree Turning319_tree=null;
        RewriteRuleTokenStream stream_Turning=new RewriteRuleTokenStream(adaptor,"token Turning");
        RewriteRuleSubtreeStream stream_clockDirection=new RewriteRuleSubtreeStream(adaptor,"rule clockDirection");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:488:2: ( ( Turning )? clockDirection -> ^( DIRECTION TURN clockDirection ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:488:4: ( Turning )? clockDirection
            {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:488:4: ( Turning )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==Turning) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:488:4: Turning
                    {
                    Turning319=(Token)match(input,Turning,FOLLOW_Turning_in_loiterDirection2676);  
                    stream_Turning.add(Turning319);


                    }
                    break;

            }

            pushFollow(FOLLOW_clockDirection_in_loiterDirection2679);
            clockDirection320=clockDirection();

            state._fsp--;

            stream_clockDirection.add(clockDirection320.getTree());


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
            // 489:2: -> ^( DIRECTION TURN clockDirection )
            {
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:489:5: ^( DIRECTION TURN clockDirection )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:492:1: upDownDirection : ( ( 'u' | 'up' | 'c' | 'climb' | 'climbing' | 'ascend' | 'ascending' ) -> CLIMB | ( 'd' | 'down' | 'descend' | 'descending' ) -> DESCEND );
    public final flipsParser.upDownDirection_return upDownDirection() throws RecognitionException {
        flipsParser.upDownDirection_return retval = new flipsParser.upDownDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal321=null;
        Token string_literal322=null;
        Token char_literal323=null;
        Token string_literal324=null;
        Token string_literal325=null;
        Token string_literal326=null;
        Token string_literal327=null;
        Token char_literal328=null;
        Token string_literal329=null;
        Token string_literal330=null;
        Token string_literal331=null;

        CommonTree char_literal321_tree=null;
        CommonTree string_literal322_tree=null;
        CommonTree char_literal323_tree=null;
        CommonTree string_literal324_tree=null;
        CommonTree string_literal325_tree=null;
        CommonTree string_literal326_tree=null;
        CommonTree string_literal327_tree=null;
        CommonTree char_literal328_tree=null;
        CommonTree string_literal329_tree=null;
        CommonTree string_literal330_tree=null;
        CommonTree string_literal331_tree=null;
        RewriteRuleTokenStream stream_239=new RewriteRuleTokenStream(adaptor,"token 239");
        RewriteRuleTokenStream stream_240=new RewriteRuleTokenStream(adaptor,"token 240");
        RewriteRuleTokenStream stream_241=new RewriteRuleTokenStream(adaptor,"token 241");
        RewriteRuleTokenStream stream_245=new RewriteRuleTokenStream(adaptor,"token 245");
        RewriteRuleTokenStream stream_244=new RewriteRuleTokenStream(adaptor,"token 244");
        RewriteRuleTokenStream stream_243=new RewriteRuleTokenStream(adaptor,"token 243");
        RewriteRuleTokenStream stream_242=new RewriteRuleTokenStream(adaptor,"token 242");
        RewriteRuleTokenStream stream_247=new RewriteRuleTokenStream(adaptor,"token 247");
        RewriteRuleTokenStream stream_238=new RewriteRuleTokenStream(adaptor,"token 238");
        RewriteRuleTokenStream stream_246=new RewriteRuleTokenStream(adaptor,"token 246");
        RewriteRuleTokenStream stream_237=new RewriteRuleTokenStream(adaptor,"token 237");

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:493:2: ( ( 'u' | 'up' | 'c' | 'climb' | 'climbing' | 'ascend' | 'ascending' ) -> CLIMB | ( 'd' | 'down' | 'descend' | 'descending' ) -> DESCEND )
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( ((LA122_0>=237 && LA122_0<=243)) ) {
                alt122=1;
            }
            else if ( ((LA122_0>=244 && LA122_0<=247)) ) {
                alt122=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 122, 0, input);

                throw nvae;
            }
            switch (alt122) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:493:4: ( 'u' | 'up' | 'c' | 'climb' | 'climbing' | 'ascend' | 'ascending' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:493:4: ( 'u' | 'up' | 'c' | 'climb' | 'climbing' | 'ascend' | 'ascending' )
                    int alt120=7;
                    switch ( input.LA(1) ) {
                    case 237:
                        {
                        alt120=1;
                        }
                        break;
                    case 238:
                        {
                        alt120=2;
                        }
                        break;
                    case 239:
                        {
                        alt120=3;
                        }
                        break;
                    case 240:
                        {
                        alt120=4;
                        }
                        break;
                    case 241:
                        {
                        alt120=5;
                        }
                        break;
                    case 242:
                        {
                        alt120=6;
                        }
                        break;
                    case 243:
                        {
                        alt120=7;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 120, 0, input);

                        throw nvae;
                    }

                    switch (alt120) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:493:5: 'u'
                            {
                            char_literal321=(Token)match(input,237,FOLLOW_237_in_upDownDirection2702);  
                            stream_237.add(char_literal321);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:493:9: 'up'
                            {
                            string_literal322=(Token)match(input,238,FOLLOW_238_in_upDownDirection2704);  
                            stream_238.add(string_literal322);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:493:14: 'c'
                            {
                            char_literal323=(Token)match(input,239,FOLLOW_239_in_upDownDirection2706);  
                            stream_239.add(char_literal323);


                            }
                            break;
                        case 4 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:493:18: 'climb'
                            {
                            string_literal324=(Token)match(input,240,FOLLOW_240_in_upDownDirection2708);  
                            stream_240.add(string_literal324);


                            }
                            break;
                        case 5 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:493:26: 'climbing'
                            {
                            string_literal325=(Token)match(input,241,FOLLOW_241_in_upDownDirection2710);  
                            stream_241.add(string_literal325);


                            }
                            break;
                        case 6 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:493:37: 'ascend'
                            {
                            string_literal326=(Token)match(input,242,FOLLOW_242_in_upDownDirection2712);  
                            stream_242.add(string_literal326);


                            }
                            break;
                        case 7 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:493:46: 'ascending'
                            {
                            string_literal327=(Token)match(input,243,FOLLOW_243_in_upDownDirection2714);  
                            stream_243.add(string_literal327);


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
                    // 494:2: -> CLIMB
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(CLIMB, "CLIMB"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:495:4: ( 'd' | 'down' | 'descend' | 'descending' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:495:4: ( 'd' | 'down' | 'descend' | 'descending' )
                    int alt121=4;
                    switch ( input.LA(1) ) {
                    case 244:
                        {
                        alt121=1;
                        }
                        break;
                    case 245:
                        {
                        alt121=2;
                        }
                        break;
                    case 246:
                        {
                        alt121=3;
                        }
                        break;
                    case 247:
                        {
                        alt121=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 121, 0, input);

                        throw nvae;
                    }

                    switch (alt121) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:495:5: 'd'
                            {
                            char_literal328=(Token)match(input,244,FOLLOW_244_in_upDownDirection2726);  
                            stream_244.add(char_literal328);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:495:9: 'down'
                            {
                            string_literal329=(Token)match(input,245,FOLLOW_245_in_upDownDirection2728);  
                            stream_245.add(string_literal329);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:495:16: 'descend'
                            {
                            string_literal330=(Token)match(input,246,FOLLOW_246_in_upDownDirection2730);  
                            stream_246.add(string_literal330);


                            }
                            break;
                        case 4 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:495:26: 'descending'
                            {
                            string_literal331=(Token)match(input,247,FOLLOW_247_in_upDownDirection2732);  
                            stream_247.add(string_literal331);


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
                    // 496:2: -> DESCEND
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:499:1: leftRightDirection : ( ( 'l' | 'left' | 'port' ) -> LEFT | ( 'r' | 'right' | 'starboard' ) -> RIGHT );
    public final flipsParser.leftRightDirection_return leftRightDirection() throws RecognitionException {
        flipsParser.leftRightDirection_return retval = new flipsParser.leftRightDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal332=null;
        Token string_literal333=null;
        Token string_literal334=null;
        Token char_literal335=null;
        Token string_literal336=null;
        Token string_literal337=null;

        CommonTree char_literal332_tree=null;
        CommonTree string_literal333_tree=null;
        CommonTree string_literal334_tree=null;
        CommonTree char_literal335_tree=null;
        CommonTree string_literal336_tree=null;
        CommonTree string_literal337_tree=null;
        RewriteRuleTokenStream stream_250=new RewriteRuleTokenStream(adaptor,"token 250");
        RewriteRuleTokenStream stream_251=new RewriteRuleTokenStream(adaptor,"token 251");
        RewriteRuleTokenStream stream_252=new RewriteRuleTokenStream(adaptor,"token 252");
        RewriteRuleTokenStream stream_249=new RewriteRuleTokenStream(adaptor,"token 249");
        RewriteRuleTokenStream stream_253=new RewriteRuleTokenStream(adaptor,"token 253");
        RewriteRuleTokenStream stream_248=new RewriteRuleTokenStream(adaptor,"token 248");

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:500:2: ( ( 'l' | 'left' | 'port' ) -> LEFT | ( 'r' | 'right' | 'starboard' ) -> RIGHT )
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( ((LA125_0>=248 && LA125_0<=250)) ) {
                alt125=1;
            }
            else if ( ((LA125_0>=251 && LA125_0<=253)) ) {
                alt125=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 125, 0, input);

                throw nvae;
            }
            switch (alt125) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:500:4: ( 'l' | 'left' | 'port' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:500:4: ( 'l' | 'left' | 'port' )
                    int alt123=3;
                    switch ( input.LA(1) ) {
                    case 248:
                        {
                        alt123=1;
                        }
                        break;
                    case 249:
                        {
                        alt123=2;
                        }
                        break;
                    case 250:
                        {
                        alt123=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 123, 0, input);

                        throw nvae;
                    }

                    switch (alt123) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:500:5: 'l'
                            {
                            char_literal332=(Token)match(input,248,FOLLOW_248_in_leftRightDirection2750);  
                            stream_248.add(char_literal332);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:500:9: 'left'
                            {
                            string_literal333=(Token)match(input,249,FOLLOW_249_in_leftRightDirection2752);  
                            stream_249.add(string_literal333);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:500:16: 'port'
                            {
                            string_literal334=(Token)match(input,250,FOLLOW_250_in_leftRightDirection2754);  
                            stream_250.add(string_literal334);


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
                    // 501:2: -> LEFT
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(LEFT, "LEFT"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:502:4: ( 'r' | 'right' | 'starboard' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:502:4: ( 'r' | 'right' | 'starboard' )
                    int alt124=3;
                    switch ( input.LA(1) ) {
                    case 251:
                        {
                        alt124=1;
                        }
                        break;
                    case 252:
                        {
                        alt124=2;
                        }
                        break;
                    case 253:
                        {
                        alt124=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 124, 0, input);

                        throw nvae;
                    }

                    switch (alt124) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:502:5: 'r'
                            {
                            char_literal335=(Token)match(input,251,FOLLOW_251_in_leftRightDirection2766);  
                            stream_251.add(char_literal335);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:502:9: 'right'
                            {
                            string_literal336=(Token)match(input,252,FOLLOW_252_in_leftRightDirection2768);  
                            stream_252.add(string_literal336);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:502:17: 'starboard'
                            {
                            string_literal337=(Token)match(input,253,FOLLOW_253_in_leftRightDirection2770);  
                            stream_253.add(string_literal337);


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
                    // 503:2: -> RIGHT
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:506:1: clockDirection : ( ( 'cw' | 'clockwise' ) -> CLOCKWISE | ( 'ccw' | 'counterclockwise' ) -> COUNTERCLOCKWISE );
    public final flipsParser.clockDirection_return clockDirection() throws RecognitionException {
        flipsParser.clockDirection_return retval = new flipsParser.clockDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal338=null;
        Token string_literal339=null;
        Token string_literal340=null;
        Token string_literal341=null;

        CommonTree string_literal338_tree=null;
        CommonTree string_literal339_tree=null;
        CommonTree string_literal340_tree=null;
        CommonTree string_literal341_tree=null;
        RewriteRuleTokenStream stream_257=new RewriteRuleTokenStream(adaptor,"token 257");
        RewriteRuleTokenStream stream_254=new RewriteRuleTokenStream(adaptor,"token 254");
        RewriteRuleTokenStream stream_256=new RewriteRuleTokenStream(adaptor,"token 256");
        RewriteRuleTokenStream stream_255=new RewriteRuleTokenStream(adaptor,"token 255");

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:507:2: ( ( 'cw' | 'clockwise' ) -> CLOCKWISE | ( 'ccw' | 'counterclockwise' ) -> COUNTERCLOCKWISE )
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( ((LA128_0>=254 && LA128_0<=255)) ) {
                alt128=1;
            }
            else if ( ((LA128_0>=256 && LA128_0<=257)) ) {
                alt128=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 128, 0, input);

                throw nvae;
            }
            switch (alt128) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:507:4: ( 'cw' | 'clockwise' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:507:4: ( 'cw' | 'clockwise' )
                    int alt126=2;
                    int LA126_0 = input.LA(1);

                    if ( (LA126_0==254) ) {
                        alt126=1;
                    }
                    else if ( (LA126_0==255) ) {
                        alt126=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 126, 0, input);

                        throw nvae;
                    }
                    switch (alt126) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:507:5: 'cw'
                            {
                            string_literal338=(Token)match(input,254,FOLLOW_254_in_clockDirection2788);  
                            stream_254.add(string_literal338);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:507:10: 'clockwise'
                            {
                            string_literal339=(Token)match(input,255,FOLLOW_255_in_clockDirection2790);  
                            stream_255.add(string_literal339);


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
                    // 508:2: -> CLOCKWISE
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(CLOCKWISE, "CLOCKWISE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:509:4: ( 'ccw' | 'counterclockwise' )
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:509:4: ( 'ccw' | 'counterclockwise' )
                    int alt127=2;
                    int LA127_0 = input.LA(1);

                    if ( (LA127_0==256) ) {
                        alt127=1;
                    }
                    else if ( (LA127_0==257) ) {
                        alt127=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 127, 0, input);

                        throw nvae;
                    }
                    switch (alt127) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:509:5: 'ccw'
                            {
                            string_literal340=(Token)match(input,256,FOLLOW_256_in_clockDirection2802);  
                            stream_256.add(string_literal340);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:509:11: 'counterclockwise'
                            {
                            string_literal341=(Token)match(input,257,FOLLOW_257_in_clockDirection2804);  
                            stream_257.add(string_literal341);


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
                    // 510:2: -> COUNTERCLOCKWISE
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:513:1: angularValue : ( numericValue ( '\\u00B0' | 'deg' | 'degs' | 'degree' | 'degrees' ) -> numericValue DEGREE | integerValue ( '\\u00B0' | 'd' )? numericValue '\\'' -> integerValue DEGREE numericValue MINUTE | numericValue ( 'rad' | 'rads' | 'radian' | 'radians' ) -> numericValue RADIAN );
    public final flipsParser.angularValue_return angularValue() throws RecognitionException {
        flipsParser.angularValue_return retval = new flipsParser.angularValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal343=null;
        Token string_literal344=null;
        Token string_literal345=null;
        Token string_literal346=null;
        Token string_literal347=null;
        Token char_literal349=null;
        Token char_literal350=null;
        Token char_literal352=null;
        Token string_literal354=null;
        Token string_literal355=null;
        Token string_literal356=null;
        Token string_literal357=null;
        flipsParser.numericValue_return numericValue342 = null;

        flipsParser.integerValue_return integerValue348 = null;

        flipsParser.numericValue_return numericValue351 = null;

        flipsParser.numericValue_return numericValue353 = null;


        CommonTree char_literal343_tree=null;
        CommonTree string_literal344_tree=null;
        CommonTree string_literal345_tree=null;
        CommonTree string_literal346_tree=null;
        CommonTree string_literal347_tree=null;
        CommonTree char_literal349_tree=null;
        CommonTree char_literal350_tree=null;
        CommonTree char_literal352_tree=null;
        CommonTree string_literal354_tree=null;
        CommonTree string_literal355_tree=null;
        CommonTree string_literal356_tree=null;
        CommonTree string_literal357_tree=null;
        RewriteRuleTokenStream stream_262=new RewriteRuleTokenStream(adaptor,"token 262");
        RewriteRuleTokenStream stream_263=new RewriteRuleTokenStream(adaptor,"token 263");
        RewriteRuleTokenStream stream_260=new RewriteRuleTokenStream(adaptor,"token 260");
        RewriteRuleTokenStream stream_261=new RewriteRuleTokenStream(adaptor,"token 261");
        RewriteRuleTokenStream stream_258=new RewriteRuleTokenStream(adaptor,"token 258");
        RewriteRuleTokenStream stream_244=new RewriteRuleTokenStream(adaptor,"token 244");
        RewriteRuleTokenStream stream_259=new RewriteRuleTokenStream(adaptor,"token 259");
        RewriteRuleTokenStream stream_267=new RewriteRuleTokenStream(adaptor,"token 267");
        RewriteRuleTokenStream stream_266=new RewriteRuleTokenStream(adaptor,"token 266");
        RewriteRuleTokenStream stream_265=new RewriteRuleTokenStream(adaptor,"token 265");
        RewriteRuleTokenStream stream_264=new RewriteRuleTokenStream(adaptor,"token 264");
        RewriteRuleSubtreeStream stream_integerValue=new RewriteRuleSubtreeStream(adaptor,"rule integerValue");
        RewriteRuleSubtreeStream stream_numericValue=new RewriteRuleSubtreeStream(adaptor,"rule numericValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:514:2: ( numericValue ( '\\u00B0' | 'deg' | 'degs' | 'degree' | 'degrees' ) -> numericValue DEGREE | integerValue ( '\\u00B0' | 'd' )? numericValue '\\'' -> integerValue DEGREE numericValue MINUTE | numericValue ( 'rad' | 'rads' | 'radian' | 'radians' ) -> numericValue RADIAN )
            int alt132=3;
            int LA132_0 = input.LA(1);

            if ( ((LA132_0>=BinaryLiteral && LA132_0<=HexLiteral)) ) {
                switch ( input.LA(2) ) {
                case 264:
                case 265:
                case 266:
                case 267:
                    {
                    alt132=3;
                    }
                    break;
                case 258:
                    {
                    switch ( input.LA(3) ) {
                    case EOF:
                    case Identifier:
                    case To:
                    case At:
                    case With:
                    case Turning:
                    case Heading:
                    case 94:
                    case 95:
                    case 100:
                    case 101:
                    case 107:
                    case 108:
                    case 109:
                    case 110:
                    case 111:
                    case 112:
                    case 113:
                    case 114:
                    case 116:
                    case 117:
                    case 119:
                    case 120:
                    case 123:
                    case 144:
                    case 145:
                    case 200:
                    case 205:
                    case 206:
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
                    case 246:
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
                    case 268:
                    case 269:
                        {
                        alt132=1;
                        }
                        break;
                    case BinaryLiteral:
                    case OctalLiteral:
                    case DecimalLiteral:
                    case HexLiteral:
                        {
                        int LA132_7 = input.LA(4);

                        if ( (LA132_7==EOF||(LA132_7>=Identifier && LA132_7<=With)||(LA132_7>=Turning && LA132_7<=HexLiteral)||(LA132_7>=94 && LA132_7<=95)||(LA132_7>=100 && LA132_7<=101)||(LA132_7>=107 && LA132_7<=114)||(LA132_7>=116 && LA132_7<=117)||(LA132_7>=119 && LA132_7<=120)||LA132_7==123||(LA132_7>=144 && LA132_7<=163)||(LA132_7>=166 && LA132_7<=172)||LA132_7==200||(LA132_7>=205 && LA132_7<=262)||(LA132_7>=264 && LA132_7<=267)||(LA132_7>=270 && LA132_7<=271)) ) {
                            alt132=1;
                        }
                        else if ( (LA132_7==263) ) {
                            alt132=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 132, 7, input);

                            throw nvae;
                        }
                        }
                        break;
                    case FloatingPointLiteral:
                        {
                        int LA132_8 = input.LA(4);

                        if ( (LA132_8==EOF||(LA132_8>=Identifier && LA132_8<=With)||(LA132_8>=Turning && LA132_8<=HexLiteral)||(LA132_8>=94 && LA132_8<=95)||(LA132_8>=100 && LA132_8<=101)||(LA132_8>=107 && LA132_8<=114)||(LA132_8>=116 && LA132_8<=117)||(LA132_8>=119 && LA132_8<=120)||LA132_8==123||(LA132_8>=144 && LA132_8<=163)||(LA132_8>=166 && LA132_8<=172)||LA132_8==200||(LA132_8>=205 && LA132_8<=262)||(LA132_8>=264 && LA132_8<=267)||(LA132_8>=270 && LA132_8<=271)) ) {
                            alt132=1;
                        }
                        else if ( (LA132_8==263) ) {
                            alt132=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 132, 8, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 132, 4, input);

                        throw nvae;
                    }

                    }
                    break;
                case FloatingPointLiteral:
                case BinaryLiteral:
                case OctalLiteral:
                case DecimalLiteral:
                case HexLiteral:
                case 244:
                    {
                    alt132=2;
                    }
                    break;
                case 259:
                case 260:
                case 261:
                case 262:
                    {
                    alt132=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 132, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA132_0==FloatingPointLiteral) ) {
                int LA132_2 = input.LA(2);

                if ( ((LA132_2>=258 && LA132_2<=262)) ) {
                    alt132=1;
                }
                else if ( ((LA132_2>=264 && LA132_2<=267)) ) {
                    alt132=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 132, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 132, 0, input);

                throw nvae;
            }
            switch (alt132) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:514:4: numericValue ( '\\u00B0' | 'deg' | 'degs' | 'degree' | 'degrees' )
                    {
                    pushFollow(FOLLOW_numericValue_in_angularValue2821);
                    numericValue342=numericValue();

                    state._fsp--;

                    stream_numericValue.add(numericValue342.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:514:17: ( '\\u00B0' | 'deg' | 'degs' | 'degree' | 'degrees' )
                    int alt129=5;
                    switch ( input.LA(1) ) {
                    case 258:
                        {
                        alt129=1;
                        }
                        break;
                    case 259:
                        {
                        alt129=2;
                        }
                        break;
                    case 260:
                        {
                        alt129=3;
                        }
                        break;
                    case 261:
                        {
                        alt129=4;
                        }
                        break;
                    case 262:
                        {
                        alt129=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 129, 0, input);

                        throw nvae;
                    }

                    switch (alt129) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:514:18: '\\u00B0'
                            {
                            char_literal343=(Token)match(input,258,FOLLOW_258_in_angularValue2824);  
                            stream_258.add(char_literal343);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:514:27: 'deg'
                            {
                            string_literal344=(Token)match(input,259,FOLLOW_259_in_angularValue2826);  
                            stream_259.add(string_literal344);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:514:33: 'degs'
                            {
                            string_literal345=(Token)match(input,260,FOLLOW_260_in_angularValue2828);  
                            stream_260.add(string_literal345);


                            }
                            break;
                        case 4 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:514:40: 'degree'
                            {
                            string_literal346=(Token)match(input,261,FOLLOW_261_in_angularValue2830);  
                            stream_261.add(string_literal346);


                            }
                            break;
                        case 5 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:514:49: 'degrees'
                            {
                            string_literal347=(Token)match(input,262,FOLLOW_262_in_angularValue2832);  
                            stream_262.add(string_literal347);


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
                    // 515:2: -> numericValue DEGREE
                    {
                        adaptor.addChild(root_0, stream_numericValue.nextTree());
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(DEGREE, "DEGREE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:516:4: integerValue ( '\\u00B0' | 'd' )? numericValue '\\''
                    {
                    pushFollow(FOLLOW_integerValue_in_angularValue2845);
                    integerValue348=integerValue();

                    state._fsp--;

                    stream_integerValue.add(integerValue348.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:516:17: ( '\\u00B0' | 'd' )?
                    int alt130=3;
                    int LA130_0 = input.LA(1);

                    if ( (LA130_0==258) ) {
                        alt130=1;
                    }
                    else if ( (LA130_0==244) ) {
                        alt130=2;
                    }
                    switch (alt130) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:516:18: '\\u00B0'
                            {
                            char_literal349=(Token)match(input,258,FOLLOW_258_in_angularValue2848);  
                            stream_258.add(char_literal349);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:516:27: 'd'
                            {
                            char_literal350=(Token)match(input,244,FOLLOW_244_in_angularValue2850);  
                            stream_244.add(char_literal350);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_numericValue_in_angularValue2854);
                    numericValue351=numericValue();

                    state._fsp--;

                    stream_numericValue.add(numericValue351.getTree());
                    char_literal352=(Token)match(input,263,FOLLOW_263_in_angularValue2856);  
                    stream_263.add(char_literal352);



                    // AST REWRITE
                    // elements: numericValue, integerValue
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 517:2: -> integerValue DEGREE numericValue MINUTE
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:518:4: numericValue ( 'rad' | 'rads' | 'radian' | 'radians' )
                    {
                    pushFollow(FOLLOW_numericValue_in_angularValue2872);
                    numericValue353=numericValue();

                    state._fsp--;

                    stream_numericValue.add(numericValue353.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:518:17: ( 'rad' | 'rads' | 'radian' | 'radians' )
                    int alt131=4;
                    switch ( input.LA(1) ) {
                    case 264:
                        {
                        alt131=1;
                        }
                        break;
                    case 265:
                        {
                        alt131=2;
                        }
                        break;
                    case 266:
                        {
                        alt131=3;
                        }
                        break;
                    case 267:
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
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:518:18: 'rad'
                            {
                            string_literal354=(Token)match(input,264,FOLLOW_264_in_angularValue2875);  
                            stream_264.add(string_literal354);


                            }
                            break;
                        case 2 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:518:24: 'rads'
                            {
                            string_literal355=(Token)match(input,265,FOLLOW_265_in_angularValue2877);  
                            stream_265.add(string_literal355);


                            }
                            break;
                        case 3 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:518:31: 'radian'
                            {
                            string_literal356=(Token)match(input,266,FOLLOW_266_in_angularValue2879);  
                            stream_266.add(string_literal356);


                            }
                            break;
                        case 4 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:518:40: 'radians'
                            {
                            string_literal357=(Token)match(input,267,FOLLOW_267_in_angularValue2881);  
                            stream_267.add(string_literal357);


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
                    // 519:2: -> numericValue RADIAN
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:524:1: waypoint : ( geoCoordinate -> geoCoordinate | Identifier -> ^( WAYPOINT Identifier ) );
    public final flipsParser.waypoint_return waypoint() throws RecognitionException {
        flipsParser.waypoint_return retval = new flipsParser.waypoint_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier359=null;
        flipsParser.geoCoordinate_return geoCoordinate358 = null;


        CommonTree Identifier359_tree=null;
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_geoCoordinate=new RewriteRuleSubtreeStream(adaptor,"rule geoCoordinate");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:525:2: ( geoCoordinate -> geoCoordinate | Identifier -> ^( WAYPOINT Identifier ) )
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( ((LA133_0>=FloatingPointLiteral && LA133_0<=HexLiteral)||(LA133_0>=268 && LA133_0<=269)) ) {
                alt133=1;
            }
            else if ( (LA133_0==Identifier) ) {
                alt133=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 133, 0, input);

                throw nvae;
            }
            switch (alt133) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:525:4: geoCoordinate
                    {
                    pushFollow(FOLLOW_geoCoordinate_in_waypoint2902);
                    geoCoordinate358=geoCoordinate();

                    state._fsp--;

                    stream_geoCoordinate.add(geoCoordinate358.getTree());


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
                    // 526:2: -> geoCoordinate
                    {
                        adaptor.addChild(root_0, stream_geoCoordinate.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:527:4: Identifier
                    {
                    Identifier359=(Token)match(input,Identifier,FOLLOW_Identifier_in_waypoint2912);  
                    stream_Identifier.add(Identifier359);



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
                    // 528:2: -> ^( WAYPOINT Identifier )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:528:5: ^( WAYPOINT Identifier )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:531:1: geoCoordinate : latitudeLongitude -> ^( GEOCOORDINATE latitudeLongitude ) ;
    public final flipsParser.geoCoordinate_return geoCoordinate() throws RecognitionException {
        flipsParser.geoCoordinate_return retval = new flipsParser.geoCoordinate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.latitudeLongitude_return latitudeLongitude360 = null;


        RewriteRuleSubtreeStream stream_latitudeLongitude=new RewriteRuleSubtreeStream(adaptor,"rule latitudeLongitude");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:532:2: ( latitudeLongitude -> ^( GEOCOORDINATE latitudeLongitude ) )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:532:4: latitudeLongitude
            {
            pushFollow(FOLLOW_latitudeLongitude_in_geoCoordinate2932);
            latitudeLongitude360=latitudeLongitude();

            state._fsp--;

            stream_latitudeLongitude.add(latitudeLongitude360.getTree());


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
            // 533:2: -> ^( GEOCOORDINATE latitudeLongitude )
            {
                // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:533:5: ^( GEOCOORDINATE latitudeLongitude )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:536:1: latitudeLongitude : (x= latitudeLongitudeValue northSouthDirection ( ',' )? y= latitudeLongitudeValue eastWestDirection -> ^( LATITUDE $x northSouthDirection ) ^( LONGITUDE $y eastWestDirection ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y EAST ) | '-' x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y EAST ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y WEST ) | '-' x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y WEST ) );
    public final flipsParser.latitudeLongitude_return latitudeLongitude() throws RecognitionException {
        flipsParser.latitudeLongitude_return retval = new flipsParser.latitudeLongitude_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal362=null;
        Token char_literal364=null;
        Token char_literal365=null;
        Token char_literal366=null;
        Token char_literal367=null;
        Token char_literal368=null;
        Token char_literal369=null;
        Token char_literal370=null;
        Token char_literal371=null;
        Token char_literal372=null;
        Token char_literal373=null;
        Token char_literal374=null;
        Token char_literal375=null;
        flipsParser.latitudeLongitudeValue_return x = null;

        flipsParser.latitudeLongitudeValue_return y = null;

        flipsParser.northSouthDirection_return northSouthDirection361 = null;

        flipsParser.eastWestDirection_return eastWestDirection363 = null;


        CommonTree char_literal362_tree=null;
        CommonTree char_literal364_tree=null;
        CommonTree char_literal365_tree=null;
        CommonTree char_literal366_tree=null;
        CommonTree char_literal367_tree=null;
        CommonTree char_literal368_tree=null;
        CommonTree char_literal369_tree=null;
        CommonTree char_literal370_tree=null;
        CommonTree char_literal371_tree=null;
        CommonTree char_literal372_tree=null;
        CommonTree char_literal373_tree=null;
        CommonTree char_literal374_tree=null;
        CommonTree char_literal375_tree=null;
        RewriteRuleTokenStream stream_269=new RewriteRuleTokenStream(adaptor,"token 269");
        RewriteRuleTokenStream stream_268=new RewriteRuleTokenStream(adaptor,"token 268");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleSubtreeStream stream_latitudeLongitudeValue=new RewriteRuleSubtreeStream(adaptor,"rule latitudeLongitudeValue");
        RewriteRuleSubtreeStream stream_eastWestDirection=new RewriteRuleSubtreeStream(adaptor,"rule eastWestDirection");
        RewriteRuleSubtreeStream stream_northSouthDirection=new RewriteRuleSubtreeStream(adaptor,"rule northSouthDirection");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:537:2: (x= latitudeLongitudeValue northSouthDirection ( ',' )? y= latitudeLongitudeValue eastWestDirection -> ^( LATITUDE $x northSouthDirection ) ^( LONGITUDE $y eastWestDirection ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y EAST ) | '-' x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y EAST ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y WEST ) | '-' x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y WEST ) )
            int alt143=5;
            alt143 = dfa143.predict(input);
            switch (alt143) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:537:4: x= latitudeLongitudeValue northSouthDirection ( ',' )? y= latitudeLongitudeValue eastWestDirection
                    {
                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude2954);
                    x=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(x.getTree());
                    pushFollow(FOLLOW_northSouthDirection_in_latitudeLongitude2956);
                    northSouthDirection361=northSouthDirection();

                    state._fsp--;

                    stream_northSouthDirection.add(northSouthDirection361.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:537:49: ( ',' )?
                    int alt134=2;
                    int LA134_0 = input.LA(1);

                    if ( (LA134_0==101) ) {
                        alt134=1;
                    }
                    switch (alt134) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:537:49: ','
                            {
                            char_literal362=(Token)match(input,101,FOLLOW_101_in_latitudeLongitude2958);  
                            stream_101.add(char_literal362);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude2963);
                    y=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(y.getTree());
                    pushFollow(FOLLOW_eastWestDirection_in_latitudeLongitude2965);
                    eastWestDirection363=eastWestDirection();

                    state._fsp--;

                    stream_eastWestDirection.add(eastWestDirection363.getTree());


                    // AST REWRITE
                    // elements: northSouthDirection, eastWestDirection, y, x
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
                    // 538:2: -> ^( LATITUDE $x northSouthDirection ) ^( LONGITUDE $y eastWestDirection )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:538:5: ^( LATITUDE $x northSouthDirection )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LATITUDE, "LATITUDE"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, stream_northSouthDirection.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:538:40: ^( LONGITUDE $y eastWestDirection )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:539:4: ( '+' )? x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:539:4: ( '+' )?
                    int alt135=2;
                    int LA135_0 = input.LA(1);

                    if ( (LA135_0==268) ) {
                        alt135=1;
                    }
                    switch (alt135) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:539:4: '+'
                            {
                            char_literal364=(Token)match(input,268,FOLLOW_268_in_latitudeLongitude2991);  
                            stream_268.add(char_literal364);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude2996);
                    x=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(x.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:539:34: ( ',' )?
                    int alt136=2;
                    int LA136_0 = input.LA(1);

                    if ( (LA136_0==101) ) {
                        alt136=1;
                    }
                    switch (alt136) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:539:34: ','
                            {
                            char_literal365=(Token)match(input,101,FOLLOW_101_in_latitudeLongitude2998);  
                            stream_101.add(char_literal365);


                            }
                            break;

                    }

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:539:39: ( '+' )?
                    int alt137=2;
                    int LA137_0 = input.LA(1);

                    if ( (LA137_0==268) ) {
                        alt137=1;
                    }
                    switch (alt137) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:539:39: '+'
                            {
                            char_literal366=(Token)match(input,268,FOLLOW_268_in_latitudeLongitude3001);  
                            stream_268.add(char_literal366);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3006);
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
                    // 540:2: -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y EAST )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:540:5: ^( LATITUDE $x NORTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LATITUDE, "LATITUDE"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NORTH, "NORTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:540:26: ^( LONGITUDE $y EAST )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:541:4: '-' x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue
                    {
                    char_literal367=(Token)match(input,269,FOLLOW_269_in_latitudeLongitude3032);  
                    stream_269.add(char_literal367);

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3036);
                    x=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(x.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:541:33: ( ',' )?
                    int alt138=2;
                    int LA138_0 = input.LA(1);

                    if ( (LA138_0==101) ) {
                        alt138=1;
                    }
                    switch (alt138) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:541:33: ','
                            {
                            char_literal368=(Token)match(input,101,FOLLOW_101_in_latitudeLongitude3038);  
                            stream_101.add(char_literal368);


                            }
                            break;

                    }

                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:541:38: ( '+' )?
                    int alt139=2;
                    int LA139_0 = input.LA(1);

                    if ( (LA139_0==268) ) {
                        alt139=1;
                    }
                    switch (alt139) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:541:38: '+'
                            {
                            char_literal369=(Token)match(input,268,FOLLOW_268_in_latitudeLongitude3041);  
                            stream_268.add(char_literal369);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3046);
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
                    // 542:2: -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y EAST )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:542:5: ^( LATITUDE $x SOUTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LATITUDE, "LATITUDE"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(SOUTH, "SOUTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:542:26: ^( LONGITUDE $y EAST )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:543:4: ( '+' )? x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue
                    {
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:543:4: ( '+' )?
                    int alt140=2;
                    int LA140_0 = input.LA(1);

                    if ( (LA140_0==268) ) {
                        alt140=1;
                    }
                    switch (alt140) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:543:4: '+'
                            {
                            char_literal370=(Token)match(input,268,FOLLOW_268_in_latitudeLongitude3072);  
                            stream_268.add(char_literal370);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3077);
                    x=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(x.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:543:34: ( ',' )?
                    int alt141=2;
                    int LA141_0 = input.LA(1);

                    if ( (LA141_0==101) ) {
                        alt141=1;
                    }
                    switch (alt141) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:543:34: ','
                            {
                            char_literal371=(Token)match(input,101,FOLLOW_101_in_latitudeLongitude3079);  
                            stream_101.add(char_literal371);


                            }
                            break;

                    }

                    char_literal372=(Token)match(input,269,FOLLOW_269_in_latitudeLongitude3082);  
                    stream_269.add(char_literal372);

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3086);
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
                    // 544:2: -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y WEST )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:544:5: ^( LATITUDE $x NORTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LATITUDE, "LATITUDE"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(NORTH, "NORTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:544:26: ^( LONGITUDE $y WEST )
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
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:545:4: '-' x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue
                    {
                    char_literal373=(Token)match(input,269,FOLLOW_269_in_latitudeLongitude3112);  
                    stream_269.add(char_literal373);

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3116);
                    x=latitudeLongitudeValue();

                    state._fsp--;

                    stream_latitudeLongitudeValue.add(x.getTree());
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:545:33: ( ',' )?
                    int alt142=2;
                    int LA142_0 = input.LA(1);

                    if ( (LA142_0==101) ) {
                        alt142=1;
                    }
                    switch (alt142) {
                        case 1 :
                            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:545:33: ','
                            {
                            char_literal374=(Token)match(input,101,FOLLOW_101_in_latitudeLongitude3118);  
                            stream_101.add(char_literal374);


                            }
                            break;

                    }

                    char_literal375=(Token)match(input,269,FOLLOW_269_in_latitudeLongitude3121);  
                    stream_269.add(char_literal375);

                    pushFollow(FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3125);
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
                    // 546:2: -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y WEST )
                    {
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:546:5: ^( LATITUDE $x SOUTH )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LATITUDE, "LATITUDE"), root_1);

                        adaptor.addChild(root_1, stream_x.nextTree());
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(SOUTH, "SOUTH"));

                        adaptor.addChild(root_0, root_1);
                        }
                        // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:546:26: ^( LONGITUDE $y WEST )
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:549:1: latitudeLongitudeValue : ( numericValue -> numericValue DEGREE | angularValue );
    public final flipsParser.latitudeLongitudeValue_return latitudeLongitudeValue() throws RecognitionException {
        flipsParser.latitudeLongitudeValue_return retval = new flipsParser.latitudeLongitudeValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        flipsParser.numericValue_return numericValue376 = null;

        flipsParser.angularValue_return angularValue377 = null;


        RewriteRuleSubtreeStream stream_numericValue=new RewriteRuleSubtreeStream(adaptor,"rule numericValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:550:2: ( numericValue -> numericValue DEGREE | angularValue )
            int alt144=2;
            alt144 = dfa144.predict(input);
            switch (alt144) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:550:4: numericValue
                    {
                    pushFollow(FOLLOW_numericValue_in_latitudeLongitudeValue3157);
                    numericValue376=numericValue();

                    state._fsp--;

                    stream_numericValue.add(numericValue376.getTree());


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
                    // 551:2: -> numericValue DEGREE
                    {
                        adaptor.addChild(root_0, stream_numericValue.nextTree());
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(DEGREE, "DEGREE"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:552:4: angularValue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_angularValue_in_latitudeLongitudeValue3169);
                    angularValue377=angularValue();

                    state._fsp--;

                    adaptor.addChild(root_0, angularValue377.getTree());

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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:557:1: numericValue : ( integerValue | FloatingPointLiteral );
    public final flipsParser.numericValue_return numericValue() throws RecognitionException {
        flipsParser.numericValue_return retval = new flipsParser.numericValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FloatingPointLiteral379=null;
        flipsParser.integerValue_return integerValue378 = null;


        CommonTree FloatingPointLiteral379_tree=null;

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:558:2: ( integerValue | FloatingPointLiteral )
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( ((LA145_0>=BinaryLiteral && LA145_0<=HexLiteral)) ) {
                alt145=1;
            }
            else if ( (LA145_0==FloatingPointLiteral) ) {
                alt145=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 145, 0, input);

                throw nvae;
            }
            switch (alt145) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:558:4: integerValue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_integerValue_in_numericValue3182);
                    integerValue378=integerValue();

                    state._fsp--;

                    adaptor.addChild(root_0, integerValue378.getTree());

                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:559:4: FloatingPointLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    FloatingPointLiteral379=(Token)match(input,FloatingPointLiteral,FOLLOW_FloatingPointLiteral_in_numericValue3187); 
                    FloatingPointLiteral379_tree = (CommonTree)adaptor.create(FloatingPointLiteral379);
                    adaptor.addChild(root_0, FloatingPointLiteral379_tree);


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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:562:1: integerValue : ( BinaryLiteral | OctalLiteral | DecimalLiteral | HexLiteral );
    public final flipsParser.integerValue_return integerValue() throws RecognitionException {
        flipsParser.integerValue_return retval = new flipsParser.integerValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set380=null;

        CommonTree set380_tree=null;

        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:563:2: ( BinaryLiteral | OctalLiteral | DecimalLiteral | HexLiteral )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set380=(Token)input.LT(1);
            if ( (input.LA(1)>=BinaryLiteral && input.LA(1)<=HexLiteral) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set380));
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
    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:569:1: percentValue : numericValue ( '%' | 'percent' ) -> numericValue PERCENT ;
    public final flipsParser.percentValue_return percentValue() throws RecognitionException {
        flipsParser.percentValue_return retval = new flipsParser.percentValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal382=null;
        Token string_literal383=null;
        flipsParser.numericValue_return numericValue381 = null;


        CommonTree char_literal382_tree=null;
        CommonTree string_literal383_tree=null;
        RewriteRuleTokenStream stream_270=new RewriteRuleTokenStream(adaptor,"token 270");
        RewriteRuleTokenStream stream_271=new RewriteRuleTokenStream(adaptor,"token 271");
        RewriteRuleSubtreeStream stream_numericValue=new RewriteRuleSubtreeStream(adaptor,"rule numericValue");
        try {
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:570:2: ( numericValue ( '%' | 'percent' ) -> numericValue PERCENT )
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:570:4: numericValue ( '%' | 'percent' )
            {
            pushFollow(FOLLOW_numericValue_in_percentValue3224);
            numericValue381=numericValue();

            state._fsp--;

            stream_numericValue.add(numericValue381.getTree());
            // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:570:17: ( '%' | 'percent' )
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==270) ) {
                alt146=1;
            }
            else if ( (LA146_0==271) ) {
                alt146=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 146, 0, input);

                throw nvae;
            }
            switch (alt146) {
                case 1 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:570:18: '%'
                    {
                    char_literal382=(Token)match(input,270,FOLLOW_270_in_percentValue3227);  
                    stream_270.add(char_literal382);


                    }
                    break;
                case 2 :
                    // /Users/reunice/Documents/flips-uav/src/compiler/flips.g:570:22: 'percent'
                    {
                    string_literal383=(Token)match(input,271,FOLLOW_271_in_percentValue3229);  
                    stream_271.add(string_literal383);


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
            // 571:2: -> numericValue PERCENT
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


    protected DFA24 dfa24 = new DFA24(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA71 dfa71 = new DFA71(this);
    protected DFA85 dfa85 = new DFA85(this);
    protected DFA92 dfa92 = new DFA92(this);
    protected DFA143 dfa143 = new DFA143(this);
    protected DFA144 dfa144 = new DFA144(this);
    static final String DFA24_eotS =
        "\76\uffff";
    static final String DFA24_eofS =
        "\17\uffff\7\5\2\uffff\11\5\4\uffff\7\13\2\uffff\11\13\1\uffff\3"+
        "\5\3\13";
    static final String DFA24_minS =
        "\1\112\1\115\1\uffff\2\u0092\2\uffff\1\115\2\uffff\1\111\2\uffff"+
        "\2\176\7\111\2\u009a\11\111\1\164\2\120\1\uffff\7\111\2\u009a\11"+
        "\111\1\uffff\6\111";
    static final String DFA24_maxS =
        "\1\u00fd\1\u00b6\1\uffff\2\u010f\2\uffff\1\175\2\uffff\1\u010d\2"+
        "\uffff\2\u010f\7\u00fd\2\u009c\11\u00fd\1\172\2\u010d\1\uffff\7"+
        "\u00fd\2\u009c\11\u00fd\1\uffff\6\u00fd";
    static final String DFA24_acceptS =
        "\2\uffff\1\2\2\uffff\1\4\1\5\1\uffff\1\6\1\7\1\uffff\1\11\1\3\27"+
        "\uffff\1\10\22\uffff\1\1\6\uffff";
    static final String DFA24_specialS =
        "\76\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\12\1\1\1\7\1\uffff\2\2\1\4\4\3\34\uffff\2\6\1\uffff\2\6\1"+
            "\uffff\2\10\117\uffff\1\2\4\uffff\1\11\37\2\13\13\6\5",
            "\1\13\2\uffff\1\16\4\15\36\uffff\1\13\5\uffff\5\13\63\uffff"+
            "\6\14",
            "",
            "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\30\1\31\1\32\1\27"+
            "\1\33\1\34\1\35\1\36\1\37\1\40\2\uffff\7\14\141\uffff\2\14",
            "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\30\1\31\1\32\1\27"+
            "\1\33\1\34\1\35\1\36\1\37\1\40\2\uffff\7\14\141\uffff\2\14",
            "",
            "",
            "\1\13\2\uffff\5\13\36\uffff\1\41\5\uffff\5\13",
            "",
            "",
            "\1\44\3\uffff\1\13\2\uffff\1\43\4\42\36\uffff\1\13\5\uffff"+
            "\5\13\u008e\uffff\2\44",
            "",
            "",
            "\22\13\2\uffff\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\56"+
            "\1\57\1\60\1\55\1\61\1\62\1\63\1\64\1\65\1\66\2\uffff\7\14\16"+
            "\uffff\5\67\116\uffff\2\14",
            "\22\13\2\uffff\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\56"+
            "\1\57\1\60\1\55\1\61\1\62\1\63\1\64\1\65\1\66\2\uffff\7\14\141"+
            "\uffff\2\14",
            "\4\5\1\uffff\7\5\26\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\14\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\26\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\14\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\26\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\14\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\26\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\14\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\26\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\14\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\26\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\14\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\26\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\14\31\uffff\1\5\4\uffff\61\5",
            "\1\70\1\71\1\72",
            "\1\30\1\31\1\32",
            "\4\5\1\uffff\7\5\26\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\14\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\26\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\14\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\26\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\14\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\26\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\14\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\26\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\14\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\26\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\14\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\26\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\14\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\26\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\14\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\26\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\14\31\uffff\1\5\4\uffff\61\5",
            "\2\6\3\uffff\2\13",
            "\5\44\20\uffff\1\44\30\uffff\22\13\2\uffff\22\13\44\uffff\1"+
            "\44\5\uffff\3\44\43\uffff\1\44\15\uffff\5\44\1\uffff\6\44",
            "\5\44\20\uffff\1\44\30\uffff\22\13\2\uffff\22\13\44\uffff\1"+
            "\44\5\uffff\3\44\61\uffff\5\44\1\uffff\6\44",
            "",
            "\4\13\1\uffff\7\13\26\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\14\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\26\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\14\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\26\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\14\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\26\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\14\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\26\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\14\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\26\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\14\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\26\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\14\31\uffff\1\13\4\uffff\61\13",
            "\1\73\1\74\1\75",
            "\1\56\1\57\1\60",
            "\4\13\1\uffff\7\13\26\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\14\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\26\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\14\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\26\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\14\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\26\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\14\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\26\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\14\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\26\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\14\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\26\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\14\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\26\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\14\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\26\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\14\31\uffff\1\13\4\uffff\61\13",
            "",
            "\4\5\1\uffff\7\5\26\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\14\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\26\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\14\31\uffff\1\5\4\uffff\61\5",
            "\4\5\1\uffff\7\5\26\uffff\10\5\1\uffff\2\5\1\uffff\2\5\64\uffff"+
            "\2\14\31\uffff\1\5\4\uffff\61\5",
            "\4\13\1\uffff\7\13\26\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\14\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\26\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\14\31\uffff\1\13\4\uffff\61\13",
            "\4\13\1\uffff\7\13\26\uffff\10\13\1\uffff\2\13\1\uffff\2\13"+
            "\64\uffff\2\14\31\uffff\1\13\4\uffff\61\13"
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "156:1: flyCommandValue : ( time | direction | speed | distance | pitch | roll | duration | To waypoint ( ( 'and' | ',' ( 'and' )? ) waypoint )* -> ( waypoint )+ | altitude );";
        }
    }
    static final String DFA29_eotS =
        "\151\uffff";
    static final String DFA29_eofS =
        "\43\uffff\7\10\2\uffff\11\10\3\uffff\7\10\2\uffff\14\10\1\5\3\10"+
        "\2\uffff\7\10\2\uffff\11\10\1\5\3\10";
    static final String DFA29_minS =
        "\1\112\1\111\2\u0092\2\uffff\1\115\2\uffff\2\120\2\uffff\7\u0091"+
        "\2\u009a\11\u0091\1\120\2\176\1\uffff\7\111\2\u009a\11\111\3\u0091"+
        "\7\111\2\u009a\20\111\2\u0092\7\111\2\u009a\15\111";
    static final String DFA29_maxS =
        "\1\u0101\1\u010d\2\u010f\2\uffff\1\u0091\2\uffff\2\u010f\2\uffff"+
        "\7\u00ae\2\u009c\11\u00ae\1\u0091\2\u00a3\1\uffff\7\u0101\2\u009c"+
        "\11\u0101\3\u00ae\7\u0101\2\u009c\20\u0101\2\u010f\7\u0101\2\u009c"+
        "\15\u0101";
    static final String DFA29_acceptS =
        "\4\uffff\1\3\1\4\1\uffff\1\5\1\7\2\uffff\1\6\1\2\25\uffff\1\1\106"+
        "\uffff";
    static final String DFA29_specialS =
        "\151\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\10\1\1\1\6\1\uffff\1\4\1\uffff\1\3\4\2\46\uffff\1\5\24\uffff"+
            "\2\5\73\uffff\1\7\37\uffff\13\10\6\uffff\4\4",
            "\1\13\3\uffff\1\10\2\uffff\1\12\4\11\36\uffff\1\10\5\uffff"+
            "\5\10\63\uffff\6\14\125\uffff\2\13",
            "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\26\1\27\1\30\1\25"+
            "\1\31\1\32\1\33\1\34\1\35\1\36\2\uffff\7\14\141\uffff\2\14",
            "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\26\1\27\1\30\1\25"+
            "\1\31\1\32\1\33\1\34\1\35\1\36\2\uffff\7\14\141\uffff\2\14",
            "",
            "",
            "\1\10\2\uffff\1\41\4\40\36\uffff\1\10\5\uffff\2\10\1\37\2\10"+
            "\23\uffff\1\5",
            "",
            "",
            "\5\13\20\uffff\1\13\30\uffff\22\10\2\uffff\1\43\1\44\1\45\1"+
            "\46\1\47\1\50\1\51\1\52\1\54\1\55\1\56\1\53\1\57\1\60\1\61\1"+
            "\62\1\63\1\64\2\uffff\7\14\16\uffff\5\42\10\uffff\1\13\5\uffff"+
            "\3\13\43\uffff\1\13\15\uffff\5\13\1\uffff\6\13\2\14",
            "\5\13\20\uffff\1\13\30\uffff\22\10\2\uffff\1\43\1\44\1\45\1"+
            "\46\1\47\1\50\1\51\1\52\1\54\1\55\1\56\1\53\1\57\1\60\1\61\1"+
            "\62\1\63\1\64\2\uffff\7\14\33\uffff\1\13\5\uffff\3\13\61\uffff"+
            "\5\13\1\uffff\6\13\2\14",
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
            "\5\5\47\uffff\2\10\23\uffff\1\5",
            "\22\10\2\uffff\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\101"+
            "\1\102\1\103\1\100\1\104\1\105\1\106\1\107\1\110\1\111",
            "\22\10\2\uffff\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\101"+
            "\1\102\1\103\1\100\1\104\1\105\1\106\1\107\1\110\1\111",
            "",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\14\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\14\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\14\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\14\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\14\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\14\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\14\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\1\112\1\113\1\114",
            "\1\54\1\55\1\56",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\14\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\14\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\14\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\14\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\14\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\14\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\14\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\14\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\14\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\1\5\33\uffff\2\14",
            "\1\5\33\uffff\2\14",
            "\1\5\33\uffff\2\14",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\1\116\1\117\1\120",
            "\1\101\1\102\1\103",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\14\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\14\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\2\10\33\uffff\2\14\36\uffff\1\10\37\uffff\13\10\6"+
            "\uffff\4\10",
            "\4\5\1\uffff\1\5\1\uffff\1\122\4\121\26\uffff\6\5\5\uffff\1"+
            "\10\4\uffff\1\5\24\uffff\2\5\73\uffff\1\5\37\uffff\13\5\6\uffff"+
            "\4\5",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\115\73\uffff\1\10\37\uffff\13\10\6\uffff\4"+
            "\10",
            "\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\132\1\134\1\135"+
            "\1\136\1\133\1\137\1\140\1\141\1\142\1\143\1\144\2\uffff\7\5"+
            "\141\uffff\2\5",
            "\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\132\1\134\1\135"+
            "\1\136\1\133\1\137\1\140\1\141\1\142\1\143\1\144\2\uffff\7\5"+
            "\141\uffff\2\5",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\1\146\1\147\1\150",
            "\1\134\1\135\1\136",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\5\1\uffff\1\5\1\uffff\1\122\4\121\26\uffff\6\5\5\uffff\1"+
            "\10\4\uffff\1\5\24\uffff\2\5\73\uffff\1\5\37\uffff\13\5\6\uffff"+
            "\4\5",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10",
            "\4\10\1\uffff\1\10\1\uffff\5\10\26\uffff\6\10\12\uffff\1\10"+
            "\24\uffff\1\10\1\145\33\uffff\2\5\36\uffff\1\10\37\uffff\13"+
            "\10\6\uffff\4\10"
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "183:1: loiterCommandValue : ( time | speed | loiterDirection | radius | duration | At waypoint -> waypoint | altitude );";
        }
    }
    static final String DFA38_eotS =
        "\16\uffff";
    static final String DFA38_eofS =
        "\16\uffff";
    static final String DFA38_minS =
        "\14\112\2\uffff";
    static final String DFA38_maxS =
        "\1\u00f7\13\124\2\uffff";
    static final String DFA38_acceptS =
        "\14\uffff\1\1\1\2";
    static final String DFA38_specialS =
        "\16\uffff}>";
    static final String[] DFA38_transitionS = {
            "\3\14\u00a0\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12"+
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

    static final short[] DFA38_eot = DFA.unpackEncodedString(DFA38_eotS);
    static final short[] DFA38_eof = DFA.unpackEncodedString(DFA38_eofS);
    static final char[] DFA38_min = DFA.unpackEncodedStringToUnsignedChars(DFA38_minS);
    static final char[] DFA38_max = DFA.unpackEncodedStringToUnsignedChars(DFA38_maxS);
    static final short[] DFA38_accept = DFA.unpackEncodedString(DFA38_acceptS);
    static final short[] DFA38_special = DFA.unpackEncodedString(DFA38_specialS);
    static final short[][] DFA38_transition;

    static {
        int numStates = DFA38_transitionS.length;
        DFA38_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA38_transition[i] = DFA.unpackEncodedString(DFA38_transitionS[i]);
        }
    }

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = DFA38_eot;
            this.eof = DFA38_eof;
            this.min = DFA38_min;
            this.max = DFA38_max;
            this.accept = DFA38_accept;
            this.special = DFA38_special;
            this.transition = DFA38_transition;
        }
        public String getDescription() {
            return "217:1: altitude : ( fixedAltitude | relativeAltitude );";
        }
    }
    static final String DFA71_eotS =
        "\65\uffff";
    static final String DFA71_eofS =
        "\65\uffff";
    static final String DFA71_minS =
        "\1\120\2\u0092\11\u00a4\7\u00ad\2\u009a\11\u00ad\4\uffff\2\u00b1"+
        "\3\u00ad\16\u00a4";
    static final String DFA71_maxS =
        "\1\124\2\u010f\11\u00a5\7\u00ae\2\u009c\11\u00ae\4\uffff\2\u00cc"+
        "\3\u00ae\16\u00a5";
    static final String DFA71_acceptS =
        "\36\uffff\1\4\1\3\1\1\1\2\23\uffff";
    static final String DFA71_specialS =
        "\65\uffff}>";
    static final String[] DFA71_transitionS = {
            "\1\2\4\1",
            "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\25\1\26\1\27\1\24"+
            "\1\30\1\31\1\32\1\33\1\34\1\35\2\uffff\1\5\1\6\1\7\1\10\1\11"+
            "\1\12\1\13\141\uffff\1\3\1\4",
            "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\25\1\26\1\27\1\24"+
            "\1\30\1\31\1\32\1\33\1\34\1\35\2\uffff\1\5\1\6\1\7\1\10\1\11"+
            "\1\12\1\13\141\uffff\1\3\1\4",
            "\1\37\1\36",
            "\1\37\1\36",
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

    static final short[] DFA71_eot = DFA.unpackEncodedString(DFA71_eotS);
    static final short[] DFA71_eof = DFA.unpackEncodedString(DFA71_eofS);
    static final char[] DFA71_min = DFA.unpackEncodedStringToUnsignedChars(DFA71_minS);
    static final char[] DFA71_max = DFA.unpackEncodedStringToUnsignedChars(DFA71_maxS);
    static final short[] DFA71_accept = DFA.unpackEncodedString(DFA71_acceptS);
    static final short[] DFA71_special = DFA.unpackEncodedString(DFA71_specialS);
    static final short[][] DFA71_transition;

    static {
        int numStates = DFA71_transitionS.length;
        DFA71_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA71_transition[i] = DFA.unpackEncodedString(DFA71_transitionS[i]);
        }
    }

    class DFA71 extends DFA {

        public DFA71(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 71;
            this.eot = DFA71_eot;
            this.eof = DFA71_eof;
            this.min = DFA71_min;
            this.max = DFA71_max;
            this.accept = DFA71_accept;
            this.special = DFA71_special;
            this.transition = DFA71_transition;
        }
        public String getDescription() {
            return "305:1: relativeSpeed : ( speedValue 'faster' -> ^( SPEED RELATIVE FASTER speedValue ) | speedValue 'slower' -> ^( SPEED RELATIVE SLOWER speedValue ) | percentValue 'faster' -> ^( SPEED RELATIVE FASTER percentValue ) | percentValue 'slower' -> ^( SPEED RELATIVE SLOWER percentValue ) );";
        }
    }
    static final String DFA85_eotS =
        "\14\uffff";
    static final String DFA85_eofS =
        "\5\uffff\1\11\4\uffff\2\11";
    static final String DFA85_minS =
        "\1\121\1\u00bb\1\121\2\uffff\1\111\2\uffff\1\120\1\uffff\2\111";
    static final String DFA85_maxS =
        "\1\124\1\u00bf\1\124\2\uffff\1\u0101\2\uffff\1\124\1\uffff\2\u0101";
    static final String DFA85_acceptS =
        "\3\uffff\1\4\1\2\1\uffff\1\1\1\3\1\uffff\1\5\2\uffff";
    static final String DFA85_specialS =
        "\14\uffff}>";
    static final String[] DFA85_transitionS = {
            "\4\1",
            "\2\4\2\3\1\2",
            "\4\5",
            "",
            "",
            "\4\11\1\uffff\7\11\26\uffff\10\11\1\uffff\2\11\1\uffff\2\11"+
            "\2\uffff\1\11\24\uffff\2\11\51\uffff\2\6\2\7\1\10\10\uffff\1"+
            "\11\4\uffff\65\11",
            "",
            "",
            "\1\13\4\12",
            "",
            "\4\11\1\uffff\7\11\26\uffff\10\11\1\uffff\2\11\1\uffff\2\11"+
            "\2\uffff\1\11\24\uffff\2\11\51\uffff\2\6\2\7\11\uffff\1\11\4"+
            "\uffff\65\11",
            "\4\11\1\uffff\7\11\26\uffff\10\11\1\uffff\2\11\1\uffff\2\11"+
            "\2\uffff\1\11\24\uffff\2\11\51\uffff\2\6\2\7\11\uffff\1\11\4"+
            "\uffff\65\11"
    };

    static final short[] DFA85_eot = DFA.unpackEncodedString(DFA85_eotS);
    static final short[] DFA85_eof = DFA.unpackEncodedString(DFA85_eofS);
    static final char[] DFA85_min = DFA.unpackEncodedStringToUnsignedChars(DFA85_minS);
    static final char[] DFA85_max = DFA.unpackEncodedStringToUnsignedChars(DFA85_maxS);
    static final short[] DFA85_accept = DFA.unpackEncodedString(DFA85_acceptS);
    static final short[] DFA85_special = DFA.unpackEncodedString(DFA85_specialS);
    static final short[][] DFA85_transition;

    static {
        int numStates = DFA85_transitionS.length;
        DFA85_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA85_transition[i] = DFA.unpackEncodedString(DFA85_transitionS[i]);
        }
    }

    class DFA85 extends DFA {

        public DFA85(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 85;
            this.eot = DFA85_eot;
            this.eof = DFA85_eof;
            this.min = DFA85_min;
            this.max = DFA85_max;
            this.accept = DFA85_accept;
            this.special = DFA85_special;
            this.transition = DFA85_transition;
        }
        public String getDescription() {
            return "360:1: timeValue : ( timeFormat ( 'am' | 'a.m.' ) -> ^( TIME timeFormat AM ) | integerValue ( 'am' | 'a.m.' ) -> ^( TIME integerValue HOUR AM ) | timeFormat ( 'pm' | 'p.m.' ) -> ^( TIME timeFormat PM ) | integerValue ( 'pm' | 'p.m.' ) -> ^( TIME integerValue HOUR PM ) | timeFormat -> ^( TIME timeFormat HOUR24 ) );";
        }
    }
    static final String DFA92_eotS =
        "\32\uffff";
    static final String DFA92_eofS =
        "\4\uffff\11\2\4\uffff\4\25\5\uffff";
    static final String DFA92_minS =
        "\1\120\1\u00b1\2\uffff\11\111\4\u0092\4\111\2\uffff\2\u0092\1\uffff";
    static final String DFA92_maxS =
        "\1\124\1\u00cc\2\uffff\11\u0101\4\u010f\4\u0101\2\uffff\2\u010f"+
        "\1\uffff";
    static final String DFA92_acceptS =
        "\2\uffff\1\1\1\5\21\uffff\1\2\1\4\2\uffff\1\3";
    static final String DFA92_specialS =
        "\32\uffff}>";
    static final String[] DFA92_transitionS = {
            "\1\2\4\1",
            "\1\11\15\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\12\1\13\1\14\5\2",
            "",
            "",
            "\4\2\1\uffff\2\2\1\16\4\15\26\uffff\10\2\1\uffff\2\2\1\uffff"+
            "\2\2\2\uffff\1\2\24\uffff\2\2\66\uffff\1\2\4\uffff\65\2",
            "\4\2\1\uffff\2\2\1\16\4\15\26\uffff\10\2\1\uffff\2\2\1\uffff"+
            "\2\2\2\uffff\1\2\24\uffff\2\2\66\uffff\1\2\4\uffff\65\2",
            "\4\2\1\uffff\2\2\1\16\4\15\26\uffff\10\2\1\uffff\2\2\1\uffff"+
            "\2\2\2\uffff\1\2\24\uffff\2\2\66\uffff\1\2\4\uffff\65\2",
            "\4\2\1\uffff\2\2\1\16\4\15\26\uffff\10\2\1\uffff\2\2\1\uffff"+
            "\2\2\2\uffff\1\2\24\uffff\2\2\66\uffff\1\2\4\uffff\65\2",
            "\4\2\1\uffff\2\2\1\16\4\15\26\uffff\10\2\1\uffff\2\2\1\uffff"+
            "\2\2\2\uffff\1\2\24\uffff\2\2\66\uffff\1\2\4\uffff\65\2",
            "\4\2\1\uffff\2\2\1\20\4\17\26\uffff\10\2\1\uffff\2\2\1\uffff"+
            "\2\2\2\uffff\1\2\24\uffff\2\2\66\uffff\1\2\4\uffff\65\2",
            "\4\2\1\uffff\2\2\1\20\4\17\26\uffff\10\2\1\uffff\2\2\1\uffff"+
            "\2\2\2\uffff\1\2\24\uffff\2\2\66\uffff\1\2\4\uffff\65\2",
            "\4\2\1\uffff\2\2\1\20\4\17\26\uffff\10\2\1\uffff\2\2\1\uffff"+
            "\2\2\2\uffff\1\2\24\uffff\2\2\66\uffff\1\2\4\uffff\65\2",
            "\4\2\1\uffff\2\2\1\20\4\17\26\uffff\10\2\1\uffff\2\2\1\uffff"+
            "\2\2\2\uffff\1\2\24\uffff\2\2\66\uffff\1\2\4\uffff\65\2",
            "\22\2\2\uffff\7\2\4\uffff\1\21\23\uffff\1\22\1\23\1\24\5\25"+
            "\101\uffff\2\2",
            "\22\2\2\uffff\7\2\4\uffff\1\25\23\uffff\10\25\101\uffff\2\2",
            "\22\2\2\uffff\7\2\33\uffff\5\26\101\uffff\2\2",
            "\22\2\2\uffff\7\2\33\uffff\5\26\101\uffff\2\2",
            "\4\25\1\uffff\2\25\1\30\4\27\26\uffff\10\25\1\uffff\2\25\1"+
            "\uffff\2\25\2\uffff\1\25\24\uffff\2\25\66\uffff\1\25\4\uffff"+
            "\65\25",
            "\4\25\1\uffff\2\25\1\30\4\27\26\uffff\10\25\1\uffff\2\25\1"+
            "\uffff\2\25\2\uffff\1\25\24\uffff\2\25\66\uffff\1\25\4\uffff"+
            "\65\25",
            "\4\25\1\uffff\2\25\1\30\4\27\26\uffff\10\25\1\uffff\2\25\1"+
            "\uffff\2\25\2\uffff\1\25\24\uffff\2\25\66\uffff\1\25\4\uffff"+
            "\65\25",
            "\4\25\1\uffff\2\25\1\30\4\27\26\uffff\10\25\1\uffff\2\25\1"+
            "\uffff\2\25\2\uffff\1\25\24\uffff\2\25\66\uffff\1\25\4\uffff"+
            "\65\25",
            "",
            "",
            "\22\25\2\uffff\7\25\33\uffff\5\31\101\uffff\2\25",
            "\22\25\2\uffff\7\25\33\uffff\5\31\101\uffff\2\25",
            ""
    };

    static final short[] DFA92_eot = DFA.unpackEncodedString(DFA92_eotS);
    static final short[] DFA92_eof = DFA.unpackEncodedString(DFA92_eofS);
    static final char[] DFA92_min = DFA.unpackEncodedStringToUnsignedChars(DFA92_minS);
    static final char[] DFA92_max = DFA.unpackEncodedStringToUnsignedChars(DFA92_maxS);
    static final short[] DFA92_accept = DFA.unpackEncodedString(DFA92_acceptS);
    static final short[] DFA92_special = DFA.unpackEncodedString(DFA92_specialS);
    static final short[][] DFA92_transition;

    static {
        int numStates = DFA92_transitionS.length;
        DFA92_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA92_transition[i] = DFA.unpackEncodedString(DFA92_transitionS[i]);
        }
    }

    class DFA92 extends DFA {

        public DFA92(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 92;
            this.eot = DFA92_eot;
            this.eof = DFA92_eof;
            this.min = DFA92_min;
            this.max = DFA92_max;
            this.accept = DFA92_accept;
            this.special = DFA92_special;
            this.transition = DFA92_transition;
        }
        public String getDescription() {
            return "405:1: durationValue : ( numericValue timeUnit | integerValue hour numericValue ( minute | second ) | integerValue hour integerValue minute numericValue second | integerValue minute numericValue second | timeFormat );";
        }
    }
    static final String DFA143_eotS =
        "\100\uffff";
    static final String DFA143_eofS =
        "\10\uffff\2\17\25\uffff\2\17\13\uffff\2\70\22\uffff";
    static final String DFA143_minS =
        "\5\120\1\uffff\2\120\2\111\5\120\1\uffff\4\120\1\uffff\5\120\2\u0107"+
        "\3\120\2\111\13\120\2\111\5\120\1\uffff\4\120\1\uffff\1\120\2\u0107"+
        "\1\120\2\u0107\1\120";
    static final String DFA143_maxS =
        "\3\u010d\2\124\1\uffff\1\u010d\1\124\2\u010b\5\u010d\1\uffff\4\u010d"+
        "\1\uffff\5\u010d\2\u0107\2\u010d\1\124\2\u010b\12\u010d\1\124\2"+
        "\u010b\5\u010d\1\uffff\4\u010d\1\uffff\1\u010d\2\u0107\1\u010d\2"+
        "\u0107\1\u010d";
    static final String DFA143_acceptS =
        "\5\uffff\1\1\11\uffff\1\2\4\uffff\1\4\36\uffff\1\5\4\uffff\1\3\7"+
        "\uffff";
    static final String DFA143_specialS =
        "\100\uffff}>";
    static final String[] DFA143_transitionS = {
            "\1\2\4\1\u00b7\uffff\1\3\1\4",
            "\1\11\4\10\20\uffff\1\16\142\uffff\1\5\5\uffff\3\5\43\uffff"+
            "\1\7\15\uffff\1\6\1\12\1\13\1\14\1\15\1\uffff\1\20\1\21\1\22"+
            "\1\23\1\17\1\24",
            "\5\17\20\uffff\1\16\142\uffff\1\5\5\uffff\3\5\61\uffff\1\25"+
            "\1\12\1\13\1\14\1\15\1\uffff\1\20\1\21\1\22\1\23\1\17\1\24",
            "\1\27\4\26",
            "\1\31\4\30",
            "",
            "\1\11\4\10\20\uffff\1\16\142\uffff\1\5\5\uffff\3\5\73\uffff"+
            "\1\17\1\24",
            "\1\33\4\32",
            "\4\17\1\uffff\7\17\11\uffff\2\17\4\uffff\2\17\5\uffff\10\17"+
            "\1\uffff\2\17\1\uffff\2\17\2\uffff\1\17\24\uffff\2\17\66\uffff"+
            "\1\17\4\uffff\72\17\1\34\4\17",
            "\4\17\1\uffff\7\17\11\uffff\2\17\4\uffff\2\17\5\uffff\10\17"+
            "\1\uffff\2\17\1\uffff\2\17\2\uffff\1\17\24\uffff\2\17\66\uffff"+
            "\1\17\4\uffff\72\17\1\34\4\17",
            "\5\17\20\uffff\1\16\142\uffff\1\5\5\uffff\3\5\73\uffff\1\17"+
            "\1\24",
            "\5\17\20\uffff\1\16\142\uffff\1\5\5\uffff\3\5\73\uffff\1\17"+
            "\1\24",
            "\5\17\20\uffff\1\16\142\uffff\1\5\5\uffff\3\5\73\uffff\1\17"+
            "\1\24",
            "\5\17\20\uffff\1\16\142\uffff\1\5\5\uffff\3\5\73\uffff\1\17"+
            "\1\24",
            "\5\17\u00b7\uffff\1\17\1\24",
            "",
            "\5\17\20\uffff\1\16\142\uffff\1\5\5\uffff\3\5\73\uffff\1\17"+
            "\1\24",
            "\5\17\20\uffff\1\16\142\uffff\1\5\5\uffff\3\5\73\uffff\1\17"+
            "\1\24",
            "\5\17\20\uffff\1\16\142\uffff\1\5\5\uffff\3\5\73\uffff\1\17"+
            "\1\24",
            "\5\17\20\uffff\1\16\142\uffff\1\5\5\uffff\3\5\73\uffff\1\17"+
            "\1\24",
            "",
            "\5\17\20\uffff\1\16\142\uffff\1\5\5\uffff\3\5\73\uffff\1\17"+
            "\1\24",
            "\1\40\4\37\20\uffff\1\16\u008e\uffff\1\36\15\uffff\1\35\1\41"+
            "\1\42\1\43\1\44\1\uffff\1\45\1\46\1\47\1\50\1\17\1\24",
            "\5\17\20\uffff\1\16\u009c\uffff\1\51\1\41\1\42\1\43\1\44\1"+
            "\uffff\1\45\1\46\1\47\1\50\1\17\1\24",
            "\1\55\4\54\20\uffff\1\62\u008e\uffff\1\53\15\uffff\1\52\1\64"+
            "\1\65\1\66\1\67\1\uffff\1\56\1\57\1\60\1\61\1\70\1\63",
            "\5\70\20\uffff\1\62\u009c\uffff\1\71\1\64\1\65\1\66\1\67\1"+
            "\uffff\1\56\1\57\1\60\1\61\1\70\1\63",
            "\1\34",
            "\1\34",
            "\5\17\20\uffff\1\16\142\uffff\1\5\5\uffff\3\5\73\uffff\1\17"+
            "\1\24",
            "\1\40\4\37\20\uffff\1\16\u00a6\uffff\1\17\1\24",
            "\1\73\4\72",
            "\4\17\1\uffff\7\17\11\uffff\2\17\4\uffff\2\17\5\uffff\10\17"+
            "\1\uffff\2\17\1\uffff\2\17\2\uffff\1\17\24\uffff\2\17\66\uffff"+
            "\1\17\4\uffff\72\17\1\74\4\17",
            "\4\17\1\uffff\7\17\11\uffff\2\17\4\uffff\2\17\5\uffff\10\17"+
            "\1\uffff\2\17\1\uffff\2\17\2\uffff\1\17\24\uffff\2\17\66\uffff"+
            "\1\17\4\uffff\72\17\1\74\4\17",
            "\5\17\20\uffff\1\16\u00a6\uffff\1\17\1\24",
            "\5\17\20\uffff\1\16\u00a6\uffff\1\17\1\24",
            "\5\17\20\uffff\1\16\u00a6\uffff\1\17\1\24",
            "\5\17\20\uffff\1\16\u00a6\uffff\1\17\1\24",
            "\5\17\20\uffff\1\16\u00a6\uffff\1\17\1\24",
            "\5\17\20\uffff\1\16\u00a6\uffff\1\17\1\24",
            "\5\17\20\uffff\1\16\u00a6\uffff\1\17\1\24",
            "\5\17\20\uffff\1\16\u00a6\uffff\1\17\1\24",
            "\5\17\20\uffff\1\16\u00a6\uffff\1\17\1\24",
            "\1\55\4\54\20\uffff\1\62\u00a6\uffff\1\70\1\63",
            "\1\76\4\75",
            "\4\70\1\uffff\7\70\11\uffff\2\70\4\uffff\2\70\5\uffff\10\70"+
            "\1\uffff\2\70\1\uffff\2\70\2\uffff\1\70\24\uffff\2\70\66\uffff"+
            "\1\70\4\uffff\72\70\1\77\4\70",
            "\4\70\1\uffff\7\70\11\uffff\2\70\4\uffff\2\70\5\uffff\10\70"+
            "\1\uffff\2\70\1\uffff\2\70\2\uffff\1\70\24\uffff\2\70\66\uffff"+
            "\1\70\4\uffff\72\70\1\77\4\70",
            "\5\70\20\uffff\1\62\u00a6\uffff\1\70\1\63",
            "\5\70\20\uffff\1\62\u00a6\uffff\1\70\1\63",
            "\5\70\20\uffff\1\62\u00a6\uffff\1\70\1\63",
            "\5\70\20\uffff\1\62\u00a6\uffff\1\70\1\63",
            "\5\70\u00b7\uffff\1\70\1\63",
            "",
            "\5\70\20\uffff\1\62\u00a6\uffff\1\70\1\63",
            "\5\70\20\uffff\1\62\u00a6\uffff\1\70\1\63",
            "\5\70\20\uffff\1\62\u00a6\uffff\1\70\1\63",
            "\5\70\20\uffff\1\62\u00a6\uffff\1\70\1\63",
            "",
            "\5\70\20\uffff\1\62\u00a6\uffff\1\70\1\63",
            "\1\74",
            "\1\74",
            "\5\17\20\uffff\1\16\u00a6\uffff\1\17\1\24",
            "\1\77",
            "\1\77",
            "\5\70\20\uffff\1\62\u00a6\uffff\1\70\1\63"
    };

    static final short[] DFA143_eot = DFA.unpackEncodedString(DFA143_eotS);
    static final short[] DFA143_eof = DFA.unpackEncodedString(DFA143_eofS);
    static final char[] DFA143_min = DFA.unpackEncodedStringToUnsignedChars(DFA143_minS);
    static final char[] DFA143_max = DFA.unpackEncodedStringToUnsignedChars(DFA143_maxS);
    static final short[] DFA143_accept = DFA.unpackEncodedString(DFA143_acceptS);
    static final short[] DFA143_special = DFA.unpackEncodedString(DFA143_specialS);
    static final short[][] DFA143_transition;

    static {
        int numStates = DFA143_transitionS.length;
        DFA143_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA143_transition[i] = DFA.unpackEncodedString(DFA143_transitionS[i]);
        }
    }

    class DFA143 extends DFA {

        public DFA143(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 143;
            this.eot = DFA143_eot;
            this.eof = DFA143_eof;
            this.min = DFA143_min;
            this.max = DFA143_max;
            this.accept = DFA143_accept;
            this.special = DFA143_special;
            this.transition = DFA143_transition;
        }
        public String getDescription() {
            return "536:1: latitudeLongitude : (x= latitudeLongitudeValue northSouthDirection ( ',' )? y= latitudeLongitudeValue eastWestDirection -> ^( LATITUDE $x northSouthDirection ) ^( LONGITUDE $y eastWestDirection ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y EAST ) | '-' x= latitudeLongitudeValue ( ',' )? ( '+' )? y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y EAST ) | ( '+' )? x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x NORTH ) ^( LONGITUDE $y WEST ) | '-' x= latitudeLongitudeValue ( ',' )? '-' y= latitudeLongitudeValue -> ^( LATITUDE $x SOUTH ) ^( LONGITUDE $y WEST ) );";
        }
    }
    static final String DFA144_eotS =
        "\12\uffff";
    static final String DFA144_eofS =
        "\1\uffff\2\3\1\uffff\2\3\4\uffff";
    static final String DFA144_minS =
        "\1\120\2\111\1\uffff\2\111\1\112\1\uffff\2\176";
    static final String DFA144_maxS =
        "\1\124\2\u010d\1\uffff\2\u010f\1\124\1\uffff\2\u0107";
    static final String DFA144_acceptS =
        "\3\uffff\1\1\3\uffff\1\2\2\uffff";
    static final String DFA144_specialS =
        "\12\uffff}>";
    static final String[] DFA144_transitionS = {
            "\1\2\4\1",
            "\4\3\1\uffff\2\3\1\5\4\4\11\uffff\2\3\4\uffff\2\3\5\uffff\10"+
            "\3\1\uffff\2\3\1\uffff\2\3\2\uffff\1\3\24\uffff\2\3\66\uffff"+
            "\1\3\4\uffff\47\3\1\6\15\3\5\7\1\uffff\4\7\2\3",
            "\4\3\1\uffff\7\3\11\uffff\2\3\4\uffff\2\3\5\uffff\10\3\1\uffff"+
            "\2\3\1\uffff\2\3\2\uffff\1\3\24\uffff\2\3\66\uffff\1\3\4\uffff"+
            "\65\3\5\7\1\uffff\4\7\2\3",
            "",
            "\4\3\1\uffff\7\3\11\uffff\2\3\4\uffff\2\3\5\uffff\10\3\1\uffff"+
            "\2\3\1\uffff\2\3\2\uffff\1\3\24\uffff\24\3\2\uffff\7\3\33\uffff"+
            "\1\3\4\uffff\72\3\1\7\4\3\2\uffff\2\3",
            "\4\3\1\uffff\7\3\11\uffff\2\3\4\uffff\2\3\5\uffff\10\3\1\uffff"+
            "\2\3\1\uffff\2\3\2\uffff\1\3\24\uffff\24\3\2\uffff\7\3\33\uffff"+
            "\1\3\4\uffff\72\3\1\7\4\3\2\uffff\2\3",
            "\1\3\2\uffff\1\3\2\uffff\1\11\4\10",
            "",
            "\22\3\2\uffff\22\3\143\uffff\1\7",
            "\22\3\2\uffff\22\3\143\uffff\1\7"
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
            return "549:1: latitudeLongitudeValue : ( numericValue -> numericValue DEGREE | angularValue );";
        }
    }
 

    public static final BitSet FOLLOW_define_in_flightPlan396 = new BitSet(new long[]{0x0000000000000002L,0x0001F800C0000200L});
    public static final BitSet FOLLOW_command_in_flightPlan399 = new BitSet(new long[]{0x0000000000000002L,0x0001F80000000200L});
    public static final BitSet FOLLOW_defineCommand_in_define426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defineWaypoint_in_define431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_defineCommand443 = new BitSet(new long[]{0x0000000000000000L,0x0000000700000000L});
    public static final BitSet FOLLOW_95_in_defineCommand445 = new BitSet(new long[]{0x0000000000000000L,0x0000000700000000L});
    public static final BitSet FOLLOW_96_in_defineCommand449 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_97_in_defineCommand451 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_98_in_defineCommand453 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_defineCommandValue_in_defineCommand456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_defineCommandValue472 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_defineCommandValue474 = new BitSet(new long[]{0x0000000000000000L,0x00000000001E0000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue478 = new BitSet(new long[]{0x0000000000000002L,0x0000003000000200L});
    public static final BitSet FOLLOW_100_in_defineCommandValue482 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_101_in_defineCommandValue484 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000200L});
    public static final BitSet FOLLOW_100_in_defineCommandValue486 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_Identifier_in_defineCommandValue491 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_defineCommandValue493 = new BitSet(new long[]{0x0000000000000000L,0x00000000001E0000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue497 = new BitSet(new long[]{0x0000000000000002L,0x0000003000000200L});
    public static final BitSet FOLLOW_Identifier_in_defineCommandValue521 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_defineCommandValue523 = new BitSet(new long[]{0x0000000000000000L,0x00000000001E0000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue527 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_defineCommandValue529 = new BitSet(new long[]{0x0000000000000000L,0x00000000001E0000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue533 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_defineCommandValue535 = new BitSet(new long[]{0x0000000000000002L,0x0000003000000200L});
    public static final BitSet FOLLOW_100_in_defineCommandValue539 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_101_in_defineCommandValue541 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000200L});
    public static final BitSet FOLLOW_100_in_defineCommandValue543 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_Identifier_in_defineCommandValue548 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_defineCommandValue550 = new BitSet(new long[]{0x0000000000000000L,0x00000000001E0000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue554 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_defineCommandValue556 = new BitSet(new long[]{0x0000000000000000L,0x00000000001E0000L});
    public static final BitSet FOLLOW_integerValue_in_defineCommandValue560 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_defineCommandValue562 = new BitSet(new long[]{0x0000000000000002L,0x0000003000000200L});
    public static final BitSet FOLLOW_94_in_defineWaypoint598 = new BitSet(new long[]{0x0000000000000000L,0x0000070000000000L});
    public static final BitSet FOLLOW_95_in_defineWaypoint600 = new BitSet(new long[]{0x0000000000000000L,0x0000070000000000L});
    public static final BitSet FOLLOW_104_in_defineWaypoint604 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_105_in_defineWaypoint606 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_106_in_defineWaypoint608 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_defineWaypointValue_in_defineWaypoint611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_defineWaypointValue627 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_defineWaypointValue629 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L,0x0000000000000000L,0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_geoCoordinate_in_defineWaypointValue631 = new BitSet(new long[]{0x0000000000000002L,0x0000003000000200L});
    public static final BitSet FOLLOW_100_in_defineWaypointValue635 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_101_in_defineWaypointValue637 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000200L});
    public static final BitSet FOLLOW_100_in_defineWaypointValue639 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_Identifier_in_defineWaypointValue644 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_defineWaypointValue646 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L,0x0000000000000000L,0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_geoCoordinate_in_defineWaypointValue648 = new BitSet(new long[]{0x0000000000000002L,0x0000003000000200L});
    public static final BitSet FOLLOW_flyCommand_in_command675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_turnCommand_in_command680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loiterCommand_in_command685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_executeCommand_in_command690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_flyCommand702 = new BitSet(new long[]{0x0000000000000002L,0x01B60000001FDC00L,0x0000000000000000L,0x3FFFFFFFFFFFE100L});
    public static final BitSet FOLLOW_108_in_flyCommand704 = new BitSet(new long[]{0x0000000000000002L,0x01B60000001FDC00L,0x0000000000000000L,0x3FFFFFFFFFFFE100L});
    public static final BitSet FOLLOW_flyCommandValue_in_flyCommand707 = new BitSet(new long[]{0x0000000000000002L,0x01B60000001FDC00L,0x0000000000000000L,0x3FFFFFFFFFFFE100L});
    public static final BitSet FOLLOW_time_in_flyCommandValue729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_direction_in_flyCommandValue734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speed_in_flyCommandValue739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_distance_in_flyCommandValue744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pitch_in_flyCommandValue749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_roll_in_flyCommandValue754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_duration_in_flyCommandValue759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_To_in_flyCommandValue764 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0200L,0x0000000000000000L,0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_waypoint_in_flyCommandValue766 = new BitSet(new long[]{0x0000000000000002L,0x0000003000000000L});
    public static final BitSet FOLLOW_100_in_flyCommandValue770 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0200L,0x0000000000000000L,0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_101_in_flyCommandValue772 = new BitSet(new long[]{0x0000000000000000L,0x00000010001F0200L,0x0000000000000000L,0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_100_in_flyCommandValue774 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0200L,0x0000000000000000L,0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_waypoint_in_flyCommandValue778 = new BitSet(new long[]{0x0000000000000002L,0x0000003000000000L});
    public static final BitSet FOLLOW_altitude_in_flyCommandValue791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_turnCommand803 = new BitSet(new long[]{0x0000000000000002L,0x000000000000C000L,0x0000000000000000L,0x00001FFFFFFFC100L});
    public static final BitSet FOLLOW_110_in_turnCommand805 = new BitSet(new long[]{0x0000000000000002L,0x000000000000C000L,0x0000000000000000L,0x00001FFFFFFFC100L});
    public static final BitSet FOLLOW_turnCommandValue_in_turnCommand808 = new BitSet(new long[]{0x0000000000000002L,0x000000000000C000L,0x0000000000000000L,0x00001FFFFFFFC100L});
    public static final BitSet FOLLOW_direction_in_turnCommandValue830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_loiterCommand842 = new BitSet(new long[]{0x0000000000000002L,0x09B60000001FDC00L,0x0000000000030000L,0xFFFFFFFFFFFFE100L,0x0000000000000003L});
    public static final BitSet FOLLOW_112_in_loiterCommand844 = new BitSet(new long[]{0x0000000000000002L,0x09B60000001FDC00L,0x0000000000030000L,0xFFFFFFFFFFFFE100L,0x0000000000000003L});
    public static final BitSet FOLLOW_loiterCommandValue_in_loiterCommand847 = new BitSet(new long[]{0x0000000000000002L,0x09B60000001FDC00L,0x0000000000030000L,0xFFFFFFFFFFFFE100L,0x0000000000000003L});
    public static final BitSet FOLLOW_time_in_loiterCommandValue869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speed_in_loiterCommandValue874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loiterDirection_in_loiterCommandValue879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_radius_in_loiterCommandValue884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_duration_in_loiterCommandValue889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_At_in_loiterCommandValue894 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0200L,0x0000000000000000L,0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_waypoint_in_loiterCommandValue896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_altitude_in_loiterCommandValue906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_executeCommand917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_executeCommand931 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_executeCommand933 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_numericValue_in_executeCommand935 = new BitSet(new long[]{0x0000000000000000L,0x000000A000000000L});
    public static final BitSet FOLLOW_101_in_executeCommand938 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_numericValue_in_executeCommand940 = new BitSet(new long[]{0x0000000000000000L,0x000000A000000000L});
    public static final BitSet FOLLOW_103_in_executeCommand945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_pitch975 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_114_in_pitch977 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_angularValue_in_pitch980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_With_in_pitch995 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_115_in_pitch997 = new BitSet(new long[]{0x0000000000000000L,0x0030000000000000L});
    public static final BitSet FOLLOW_116_in_pitch1002 = new BitSet(new long[]{0x0000000000000000L,0x00400000001F0000L});
    public static final BitSet FOLLOW_117_in_pitch1004 = new BitSet(new long[]{0x0000000000000000L,0x00400000001F0000L});
    public static final BitSet FOLLOW_118_in_pitch1007 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_angularValue_in_pitch1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_roll1031 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_120_in_roll1033 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_angularValue_in_roll1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fixedAltitude_in_altitude1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relativeAltitude_in_altitude1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_upDownDirection_in_fixedAltitude1075 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_To_in_fixedAltitude1078 = new BitSet(new long[]{0x0000000000000000L,0x3E080000001F2000L,0x0000000000000000L,0x3F00000000000000L});
    public static final BitSet FOLLOW_At_in_fixedAltitude1080 = new BitSet(new long[]{0x0000000000000000L,0x3E080000001F2000L,0x0000000000000000L,0x3F00000000000000L});
    public static final BitSet FOLLOW_With_in_fixedAltitude1082 = new BitSet(new long[]{0x0000000000000000L,0x3E080000001F2000L,0x0000000000000000L,0x3F00000000000000L});
    public static final BitSet FOLLOW_115_in_fixedAltitude1087 = new BitSet(new long[]{0x0000000000000000L,0x0600000000000000L});
    public static final BitSet FOLLOW_121_in_fixedAltitude1091 = new BitSet(new long[]{0x0000000000000000L,0x3E480000001F2000L,0x0000000000000000L,0x3F00000000000000L});
    public static final BitSet FOLLOW_122_in_fixedAltitude1093 = new BitSet(new long[]{0x0000000000000000L,0x3E480000001F2000L,0x0000000000000000L,0x3F00000000000000L});
    public static final BitSet FOLLOW_123_in_fixedAltitude1096 = new BitSet(new long[]{0x0000000000000000L,0x3000000000000000L});
    public static final BitSet FOLLOW_124_in_fixedAltitude1100 = new BitSet(new long[]{0x0000000000000000L,0x3E480000001F2000L,0x0000000000000000L,0x3F00000000000000L});
    public static final BitSet FOLLOW_125_in_fixedAltitude1102 = new BitSet(new long[]{0x0000000000000000L,0x3E480000001F2000L,0x0000000000000000L,0x3F00000000000000L});
    public static final BitSet FOLLOW_118_in_fixedAltitude1106 = new BitSet(new long[]{0x0000000000000000L,0x3E080000001F2000L,0x0000000000000000L,0x3F00000000000000L});
    public static final BitSet FOLLOW_altitudeValue_in_fixedAltitude1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_upDownDirection_in_relativeAltitude1133 = new BitSet(new long[]{0x0000000000000000L,0x3E080000001F2000L,0x0000000000000000L,0x3F00000000000000L});
    public static final BitSet FOLLOW_altitudeValue_in_relativeAltitude1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_distanceValue_in_altitudeValue1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pressureValue_in_altitudeValue1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FlightLevel_in_altitudeValue1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_pressureValue1201 = new BitSet(new long[]{0x0000000000000000L,0xC000000000000000L,0x000000000000FFFFL});
    public static final BitSet FOLLOW_pressureUnit_in_pressureValue1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_pressureUnit1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_pressureUnit1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_pressureUnit1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_pressureUnit1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_pressureUnit1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_pressureUnit1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_pressureUnit1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_pressureUnit1249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_pressureUnit1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_pressureUnit1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_pressureUnit1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_pressureUnit1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_pressureUnit1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_pressureUnit1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_pressureUnit1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_141_in_pressureUnit1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_pressureUnit1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_143_in_pressureUnit1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_144_in_radius1319 = new BitSet(new long[]{0x0000000000000000L,0x08000000001F0000L,0x0000000000020000L,0x3F00000000000000L});
    public static final BitSet FOLLOW_With_in_radius1321 = new BitSet(new long[]{0x0000000000000000L,0x08000000001F0000L,0x0000000000020000L,0x3F00000000000000L});
    public static final BitSet FOLLOW_123_in_radius1325 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L,0x0000000000020000L,0x3F00000000000000L});
    public static final BitSet FOLLOW_145_in_radius1329 = new BitSet(new long[]{0x0000000000000000L,0x00400000001F0000L,0x0000000000000000L,0x3F00000000000000L});
    public static final BitSet FOLLOW_118_in_radius1331 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L,0x0000000000000000L,0x3F00000000000000L});
    public static final BitSet FOLLOW_distanceValue_in_radius1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_distanceValue_in_radius1336 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_145_in_radius1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_leftRightDirection_in_distance1359 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L,0x0000000000000000L,0x3F00000000000000L});
    public static final BitSet FOLLOW_distanceValue_in_distance1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_distanceValue1385 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000FFFFC0000L});
    public static final BitSet FOLLOW_distanceUnit_in_distanceValue1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_distanceUnit1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_147_in_distanceUnit1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_148_in_distanceUnit1403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_149_in_distanceUnit1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_150_in_distanceUnit1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_151_in_distanceUnit1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_152_in_distanceUnit1431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_distanceUnit1433 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000001C000000L});
    public static final BitSet FOLLOW_154_in_distanceUnit1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_155_in_distanceUnit1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_156_in_distanceUnit1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_157_in_distanceUnit1455 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000001C000000L});
    public static final BitSet FOLLOW_154_in_distanceUnit1460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_155_in_distanceUnit1462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_156_in_distanceUnit1464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_158_in_distanceUnit1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_159_in_distanceUnit1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_160_in_distanceUnit1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_161_in_distanceUnit1492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_162_in_distanceUnit1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_163_in_distanceUnit1496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fixedSpeed_in_speed1515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relativeSpeed_in_speed1520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_optimalSpeed_in_speed1525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_throttleSpeed_in_speed1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_At_in_fixedSpeed1541 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_speedValue_in_fixedSpeed1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speedValue_in_relativeSpeed1565 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_164_in_relativeSpeed1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speedValue_in_relativeSpeed1585 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_165_in_relativeSpeed1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_percentValue_in_relativeSpeed1605 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_164_in_relativeSpeed1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_percentValue_in_relativeSpeed1625 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_165_in_relativeSpeed1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_speedValue1651 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00001FCFFFFC0000L});
    public static final BitSet FOLLOW_speedUnit_in_speedValue1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_166_in_speedUnit1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_167_in_speedUnit1676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_168_in_speedUnit1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_169_in_speedUnit1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_170_in_speedUnit1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_171_in_speedUnit1695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_172_in_speedUnit1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_distanceUnit_in_speedUnit1712 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000600000000000L});
    public static final BitSet FOLLOW_173_in_speedUnit1715 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L,0x0000000000001FFFL});
    public static final BitSet FOLLOW_174_in_speedUnit1717 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L,0x0000000000001FFFL});
    public static final BitSet FOLLOW_timeUnit_in_speedUnit1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_At_in_optimalSpeed1738 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x007E000000000000L});
    public static final BitSet FOLLOW_optimalUnit_in_optimalSpeed1740 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0001800000000000L});
    public static final BitSet FOLLOW_175_in_optimalSpeed1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_176_in_optimalSpeed1745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_177_in_optimalUnit1769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_178_in_optimalUnit1771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_179_in_optimalUnit1783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_180_in_optimalUnit1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_181_in_optimalUnit1797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_182_in_optimalUnit1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_At_in_throttleSpeed1816 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_throttleValue_in_throttleSpeed1818 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0780000000000000L});
    public static final BitSet FOLLOW_183_in_throttleSpeed1821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_184_in_throttleSpeed1823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_185_in_throttleSpeed1825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_186_in_throttleSpeed1827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_percentValue_in_throttleValue1850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_At_in_time1863 = new BitSet(new long[]{0x0000000000000000L,0x00000000001E0000L});
    public static final BitSet FOLLOW_timeValue_in_time1865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeFormat_in_timeValue1876 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1800000000000000L});
    public static final BitSet FOLLOW_187_in_timeValue1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_188_in_timeValue1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_timeValue1898 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1800000000000000L});
    public static final BitSet FOLLOW_187_in_timeValue1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_188_in_timeValue1903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeFormat_in_timeValue1922 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x6000000000000000L});
    public static final BitSet FOLLOW_189_in_timeValue1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_190_in_timeValue1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_timeValue1944 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x6000000000000000L});
    public static final BitSet FOLLOW_189_in_timeValue1947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_190_in_timeValue1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeFormat_in_timeValue1968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_timeFormat1992 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_191_in_timeFormat1994 = new BitSet(new long[]{0x0000000000000000L,0x00000000001E0000L});
    public static final BitSet FOLLOW_integerValue_in_timeFormat1998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_timeFormat2018 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_191_in_timeFormat2020 = new BitSet(new long[]{0x0000000000000000L,0x00000000001E0000L});
    public static final BitSet FOLLOW_integerValue_in_timeFormat2024 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_191_in_timeFormat2026 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_numericValue_in_timeFormat2030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hour_in_timeUnit2058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_minute_in_timeUnit2063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_second_in_timeUnit2068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_192_in_hour2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_193_in_hour2082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_194_in_hour2084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_195_in_hour2086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_196_in_hour2088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_177_in_minute2106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_197_in_minute2108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_198_in_minute2110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_199_in_minute2112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_200_in_second2130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_201_in_second2132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_202_in_second2134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_203_in_second2136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_204_in_second2138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_205_in_duration2155 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_durationValue_in_duration2157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_durationValue2177 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L,0x0000000000001FFFL});
    public static final BitSet FOLLOW_timeUnit_in_durationValue2179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_durationValue2184 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_hour_in_durationValue2186 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_numericValue_in_durationValue2188 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L,0x0000000000001FFFL});
    public static final BitSet FOLLOW_minute_in_durationValue2191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_second_in_durationValue2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_durationValue2199 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_hour_in_durationValue2201 = new BitSet(new long[]{0x0000000000000000L,0x00000000001E0000L});
    public static final BitSet FOLLOW_integerValue_in_durationValue2203 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_minute_in_durationValue2205 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_numericValue_in_durationValue2207 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L,0x0000000000001FFFL});
    public static final BitSet FOLLOW_second_in_durationValue2209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_durationValue2214 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_minute_in_durationValue2216 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_numericValue_in_durationValue2218 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L,0x0000000000001FFFL});
    public static final BitSet FOLLOW_second_in_durationValue2220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeFormat_in_durationValue2225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fixedDirection_in_direction2238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relativeDirection_in_direction2254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cardinalDirection_in_fixedDirection2276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ordinalDirection_in_fixedDirection2286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subOrdinalDirection_in_fixedDirection2296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Turning_in_fixedDirection2307 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L,0x0000000000000000L,0x00001FFFFFFFC100L});
    public static final BitSet FOLLOW_Heading_in_fixedDirection2309 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L,0x0000000000000000L,0x00001FFFFFFFC100L});
    public static final BitSet FOLLOW_cardinalDirection_in_fixedDirection2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ordinalDirection_in_fixedDirection2315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subOrdinalDirection_in_fixedDirection2317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_angularValue_in_fixedDirection2319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Turning_in_relativeDirection2347 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x3F00000000000000L});
    public static final BitSet FOLLOW_Heading_in_relativeDirection2349 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x3F00000000000000L});
    public static final BitSet FOLLOW_leftRightDirection_in_relativeDirection2352 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_angularValue_in_relativeDirection2354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_northSouthDirection_in_cardinalDirection2372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eastWestDirection_in_cardinalDirection2377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_206_in_northSouthDirection2389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_207_in_northSouthDirection2391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_200_in_northSouthDirection2403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_208_in_northSouthDirection2405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_209_in_eastWestDirection2423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_210_in_eastWestDirection2425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_211_in_eastWestDirection2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_212_in_eastWestDirection2439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_213_in_ordinalDirection2457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_214_in_ordinalDirection2459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_215_in_ordinalDirection2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_216_in_ordinalDirection2475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_217_in_ordinalDirection2489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_218_in_ordinalDirection2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_219_in_ordinalDirection2505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_220_in_ordinalDirection2507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_221_in_subOrdinalDirection2527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_222_in_subOrdinalDirection2529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_223_in_subOrdinalDirection2545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_224_in_subOrdinalDirection2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_225_in_subOrdinalDirection2563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_226_in_subOrdinalDirection2565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_227_in_subOrdinalDirection2581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_228_in_subOrdinalDirection2583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_229_in_subOrdinalDirection2599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_230_in_subOrdinalDirection2601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_231_in_subOrdinalDirection2617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_232_in_subOrdinalDirection2619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_233_in_subOrdinalDirection2635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_234_in_subOrdinalDirection2637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_235_in_subOrdinalDirection2653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_236_in_subOrdinalDirection2655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Turning_in_loiterDirection2676 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L,0x0000000000000000L,0xC000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_clockDirection_in_loiterDirection2679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_237_in_upDownDirection2702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_238_in_upDownDirection2704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_239_in_upDownDirection2706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_240_in_upDownDirection2708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_241_in_upDownDirection2710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_242_in_upDownDirection2712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_243_in_upDownDirection2714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_244_in_upDownDirection2726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_245_in_upDownDirection2728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_246_in_upDownDirection2730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_247_in_upDownDirection2732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_248_in_leftRightDirection2750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_249_in_leftRightDirection2752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_250_in_leftRightDirection2754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_251_in_leftRightDirection2766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_252_in_leftRightDirection2768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_253_in_leftRightDirection2770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_254_in_clockDirection2788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_255_in_clockDirection2790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_256_in_clockDirection2802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_257_in_clockDirection2804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_angularValue2821 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000000000007CL});
    public static final BitSet FOLLOW_258_in_angularValue2824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_259_in_angularValue2826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_260_in_angularValue2828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_261_in_angularValue2830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_262_in_angularValue2832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_angularValue2845 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L,0x0000000000000000L,0x0010000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_258_in_angularValue2848 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_244_in_angularValue2850 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_numericValue_in_angularValue2854 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_263_in_angularValue2856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_angularValue2872 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000F00L});
    public static final BitSet FOLLOW_264_in_angularValue2875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_265_in_angularValue2877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_266_in_angularValue2879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_267_in_angularValue2881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_geoCoordinate_in_waypoint2902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_waypoint2912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_latitudeLongitude_in_geoCoordinate2932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude2954 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000000001C100L});
    public static final BitSet FOLLOW_northSouthDirection_in_latitudeLongitude2956 = new BitSet(new long[]{0x0000000000000000L,0x00000020001F0000L});
    public static final BitSet FOLLOW_101_in_latitudeLongitude2958 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude2963 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00000000001FC100L});
    public static final BitSet FOLLOW_eastWestDirection_in_latitudeLongitude2965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_268_in_latitudeLongitude2991 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude2996 = new BitSet(new long[]{0x0000000000000000L,0x00000020001F0000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_101_in_latitudeLongitude2998 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_268_in_latitudeLongitude3001 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_269_in_latitudeLongitude3032 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3036 = new BitSet(new long[]{0x0000000000000000L,0x00000020001F0000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_101_in_latitudeLongitude3038 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_268_in_latitudeLongitude3041 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_268_in_latitudeLongitude3072 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3077 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_101_in_latitudeLongitude3079 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_269_in_latitudeLongitude3082 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_269_in_latitudeLongitude3112 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3116 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_101_in_latitudeLongitude3118 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_269_in_latitudeLongitude3121 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_latitudeLongitudeValue_in_latitudeLongitude3125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_latitudeLongitudeValue3157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_angularValue_in_latitudeLongitudeValue3169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_numericValue3182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FloatingPointLiteral_in_numericValue3187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_integerValue0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_percentValue3224 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_270_in_percentValue3227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_271_in_percentValue3229 = new BitSet(new long[]{0x0000000000000002L});

}