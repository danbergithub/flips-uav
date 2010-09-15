// $ANTLR 3.2 Sep 23, 2009 12:02:23 flipsUnitConversion.g 2010-09-14 21:41:52

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class flipsUnitConversion extends TreeRewriter {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FLIGHTPLAN", "DEFINE", "REQUIRE", "COMMAND", "PARAMETER", "SENSOR", "FLY", "LOITER", "EXECUTE", "DIRECTION", "TURN", "FIXED", "RELATIVE", "PITCH", "ROLL", "YAW", "STRAIGHT", "LEVEL", "ALTITUDE", "SPEED", "FASTER", "SLOWER", "THROTTLE", "REVOLUTION", "TIME", "AM", "PM", "HOUR24", "DURATION", "RADIUS", "WAYPOINT", "GEOCOORDINATE", "LATITUDE", "LONGITUDE", "YEAR", "FORTNIGHT", "WEEK", "DAY", "HOUR", "MINUTE", "SECOND", "MILLISECOND", "ANGLE", "DEGREE", "RADIAN", "DISTANCE", "KILOMETER", "METER", "CENTIMETER", "NAUTICAL", "MILE", "FURLONG", "YARD", "FOOT", "INCH", "LEFT", "RIGHT", "CLOCKWISE", "COUNTERCLOCKWISE", "PERCENT", "FLIGHTLEVEL", "PRESSURE", "KILOPASCAL", "HECTOPASCAL", "PASCAL", "BAR", "MILLIBAR", "ATMOSPHERE", "CLIMB", "DESCEND", "NORTH", "SOUTH", "EAST", "WEST", "EQ", "NE", "LT", "GT", "LE", "GE", "POSITIVE", "NEGATIVE", "FORWARD", "BACKWARD", "X", "Y", "Z", "REPEAT", "CONDITION", "FOREVER", "StringLiteral", "And", "Identifier", "For", "To", "At", "With", "FlightLevel", "Per", "Turning", "Heading", "FloatingPointLiteral", "BinaryLiteral", "OctalLiteral", "DecimalLiteral", "HexLiteral", "Digit", "PlusOrMinus", "NonZeroDigit", "BinaryDigit", "HexDigit", "Exponent", "WS", "Comment", "LineComment", "'req'", "'require'", "'requires'", "','", "'fp'", "'flightplan'", "'flightplans'", "'='", "'cmd'", "'command'", "'commands'", "'('", "')'", "'sen'", "'sensor'", "'sensors'", "'wpt'", "'waypoint'", "'waypoints'", "'rpt'", "'repeat'", "'end'", "'x'", "'time'", "'times'", "'forever'", "'fly'", "'go'", "'trn'", "'turn'", "'ltr'", "'loiter'", "'pit'", "'pitch'", "'an'", "'aoa'", "'angle of attack'", "'of'", "'rol'", "'roll'", "'lvl'", "'level'", "'alt'", "'altitude'", "'a'", "'pres'", "'pressure'", "'kpa'", "'kilopascal'", "'kilopascals'", "'hpa'", "'hectopascal'", "'hectopascals'", "'pa'", "'pascal'", "'pascals'", "'bar'", "'bars'", "'mbar'", "'millibar'", "'millibars'", "'atm'", "'atms'", "'atmosphere'", "'atmospheres'", "'in'", "'radius'", "'km'", "'kilometer'", "'kilometers'", "'m'", "'meter'", "'meters'", "'cm'", "'centimeter'", "'centimeters'", "'nm'", "'nautical'", "'mi'", "'mile'", "'miles'", "'statute'", "'f'", "'fur'", "'furlong'", "'furlongs'", "'yd'", "'yard'", "'yards'", "'ft'", "'foot'", "'feet'", "'inch'", "'inches'", "'faster'", "'slower'", "'kph'", "'mph'", "'kn'", "'kt'", "'kts'", "'knot'", "'knots'", "'fpf'", "'fpm'", "'fps'", "'pwr'", "'power'", "'thr'", "'throttle'", "'am'", "'a.m.'", "'pm'", "'p.m.'", "':'", "'y'", "'yr'", "'yrs'", "'year'", "'years'", "'fortnight'", "'fortnights'", "'wk'", "'wks'", "'week'", "'weeks'", "'d'", "'day'", "'days'", "'ms'", "'millisecond'", "'milliseconds'", "'h'", "'hr'", "'hrs'", "'hour'", "'hours'", "'min'", "'mins'", "'minute'", "'minutes'", "'s'", "'sec'", "'secs'", "'second'", "'seconds'", "'str'", "'straight'", "'n'", "'north'", "'south'", "'e'", "'east'", "'w'", "'west'", "'ne'", "'northeast'", "'se'", "'southeast'", "'sw'", "'southwest'", "'nw'", "'northwest'", "'nne'", "'north-northeast'", "'ene'", "'east-northeast'", "'ese'", "'east-southeast'", "'sse'", "'south-southeast'", "'ssw'", "'south-southwest'", "'wsw'", "'west-southwest'", "'wnw'", "'west-northwest'", "'nnw'", "'north-northwest'", "'u'", "'up'", "'c'", "'climb'", "'climbing'", "'ascend'", "'ascending'", "'down'", "'descend'", "'descending'", "'fwd'", "'forward'", "'bwd'", "'backward'", "'back'", "'l'", "'left'", "'port'", "'r'", "'right'", "'starboard'", "'cw'", "'clockwise'", "'ccw'", "'counterclockwise'", "'rpm'", "'hz'", "'hertz'", "'rev'", "'revs'", "'revolution'", "'revolutions'", "'''", "'deg'", "'degs'", "'degree'", "'degrees'", "'rad'", "'rads'", "'radian'", "'radians'", "'%'", "'percent'", "'+'", "'-'"
    };
    public static final int DIRECTION=13;
    public static final int T__159=159;
    public static final int T__158=158;
    public static final int T__259=259;
    public static final int T__258=258;
    public static final int T__257=257;
    public static final int FIXED=15;
    public static final int T__262=262;
    public static final int T__263=263;
    public static final int T__160=160;
    public static final int T__260=260;
    public static final int GEOCOORDINATE=35;
    public static final int T__261=261;
    public static final int CONDITION=92;
    public static final int T__266=266;
    public static final int T__267=267;
    public static final int SOUTH=75;
    public static final int T__264=264;
    public static final int FOOT=57;
    public static final int T__265=265;
    public static final int T__167=167;
    public static final int EOF=-1;
    public static final int T__168=168;
    public static final int REQUIRE=6;
    public static final int T__165=165;
    public static final int T__166=166;
    public static final int T__163=163;
    public static final int T__300=300;
    public static final int HECTOPASCAL=67;
    public static final int T__164=164;
    public static final int T__161=161;
    public static final int T__162=162;
    public static final int DISTANCE=49;
    public static final int FASTER=24;
    public static final int T__148=148;
    public static final int T__147=147;
    public static final int To=98;
    public static final int T__149=149;
    public static final int T__247=247;
    public static final int T__246=246;
    public static final int T__249=249;
    public static final int T__248=248;
    public static final int T__250=250;
    public static final int T__251=251;
    public static final int T__252=252;
    public static final int T__253=253;
    public static final int T__254=254;
    public static final int T__255=255;
    public static final int KILOMETER=50;
    public static final int T__256=256;
    public static final int EQ=78;
    public static final int T__154=154;
    public static final int T__155=155;
    public static final int T__156=156;
    public static final int T__157=157;
    public static final int T__150=150;
    public static final int T__151=151;
    public static final int T__152=152;
    public static final int T__153=153;
    public static final int T__139=139;
    public static final int T__318=318;
    public static final int T__138=138;
    public static final int T__319=319;
    public static final int SENSOR=9;
    public static final int POSITIVE=84;
    public static final int T__137=137;
    public static final int T__316=316;
    public static final int GE=83;
    public static final int T__136=136;
    public static final int T__317=317;
    public static final int T__314=314;
    public static final int T__315=315;
    public static final int T__312=312;
    public static final int T__313=313;
    public static final int FORTNIGHT=39;
    public static final int T__279=279;
    public static final int T__288=288;
    public static final int T__289=289;
    public static final int T__286=286;
    public static final int T__287=287;
    public static final int T__284=284;
    public static final int T__285=285;
    public static final int T__282=282;
    public static final int YARD=56;
    public static final int T__283=283;
    public static final int T__280=280;
    public static final int T__141=141;
    public static final int T__322=322;
    public static final int T__321=321;
    public static final int T__142=142;
    public static final int T__281=281;
    public static final int T__320=320;
    public static final int T__140=140;
    public static final int Y=89;
    public static final int T__145=145;
    public static final int With=100;
    public static final int X=88;
    public static final int DURATION=32;
    public static final int T__146=146;
    public static final int T__143=143;
    public static final int Z=90;
    public static final int T__144=144;
    public static final int T__305=305;
    public static final int T__126=126;
    public static final int T__306=306;
    public static final int T__125=125;
    public static final int T__307=307;
    public static final int T__128=128;
    public static final int T__308=308;
    public static final int T__127=127;
    public static final int WS=116;
    public static final int T__301=301;
    public static final int T__129=129;
    public static final int T__302=302;
    public static final int STRAIGHT=20;
    public static final int T__303=303;
    public static final int T__304=304;
    public static final int LEVEL=21;
    public static final int BinaryLiteral=106;
    public static final int BinaryDigit=113;
    public static final int THROTTLE=26;
    public static final int T__309=309;
    public static final int T__269=269;
    public static final int FloatingPointLiteral=105;
    public static final int T__268=268;
    public static final int T__275=275;
    public static final int T__276=276;
    public static final int GT=81;
    public static final int T__277=277;
    public static final int T__278=278;
    public static final int REPEAT=91;
    public static final int T__271=271;
    public static final int METER=51;
    public static final int T__272=272;
    public static final int T__273=273;
    public static final int T__274=274;
    public static final int T__311=311;
    public static final int T__130=130;
    public static final int T__310=310;
    public static final int T__131=131;
    public static final int T__270=270;
    public static final int T__132=132;
    public static final int RADIUS=33;
    public static final int T__133=133;
    public static final int T__134=134;
    public static final int T__135=135;
    public static final int T__215=215;
    public static final int T__216=216;
    public static final int T__213=213;
    public static final int T__214=214;
    public static final int T__219=219;
    public static final int T__217=217;
    public static final int MILLISECOND=45;
    public static final int T__218=218;
    public static final int EXECUTE=12;
    public static final int T__119=119;
    public static final int T__124=124;
    public static final int PlusOrMinus=111;
    public static final int T__123=123;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__120=120;
    public static final int FOREVER=93;
    public static final int HexDigit=114;
    public static final int T__223=223;
    public static final int T__222=222;
    public static final int T__221=221;
    public static final int T__220=220;
    public static final int T__202=202;
    public static final int WAYPOINT=34;
    public static final int TIME=28;
    public static final int T__203=203;
    public static final int T__204=204;
    public static final int T__205=205;
    public static final int T__206=206;
    public static final int T__207=207;
    public static final int T__208=208;
    public static final int T__209=209;
    public static final int LEFT=59;
    public static final int FLIGHTLEVEL=64;
    public static final int CENTIMETER=52;
    public static final int T__210=210;
    public static final int AM=29;
    public static final int T__212=212;
    public static final int T__211=211;
    public static final int HexLiteral=109;
    public static final int T__239=239;
    public static final int T__237=237;
    public static final int T__238=238;
    public static final int T__235=235;
    public static final int At=99;
    public static final int T__236=236;
    public static final int PITCH=17;
    public static final int RIGHT=60;
    public static final int RELATIVE=16;
    public static final int EAST=76;
    public static final int T__245=245;
    public static final int HOUR=42;
    public static final int T__244=244;
    public static final int T__243=243;
    public static final int T__242=242;
    public static final int ALTITUDE=22;
    public static final int T__241=241;
    public static final int T__240=240;
    public static final int T__228=228;
    public static final int StringLiteral=94;
    public static final int T__229=229;
    public static final int T__224=224;
    public static final int T__225=225;
    public static final int T__226=226;
    public static final int T__227=227;
    public static final int NAUTICAL=53;
    public static final int NonZeroDigit=112;
    public static final int NORTH=74;
    public static final int REVOLUTION=27;
    public static final int T__232=232;
    public static final int T__231=231;
    public static final int T__234=234;
    public static final int T__233=233;
    public static final int DESCEND=73;
    public static final int T__230=230;
    public static final int WEEK=40;
    public static final int LT=80;
    public static final int OctalLiteral=107;
    public static final int LATITUDE=36;
    public static final int ATMOSPHERE=71;
    public static final int Per=102;
    public static final int DAY=41;
    public static final int Identifier=96;
    public static final int COMMAND=7;
    public static final int Comment=117;
    public static final int MILLIBAR=70;
    public static final int PARAMETER=8;
    public static final int COUNTERCLOCKWISE=62;
    public static final int FlightLevel=101;
    public static final int INCH=58;
    public static final int NE=79;
    public static final int SECOND=44;
    public static final int CLIMB=72;
    public static final int ROLL=18;
    public static final int HOUR24=31;
    public static final int RADIAN=48;
    public static final int TURN=14;
    public static final int DEGREE=47;
    public static final int PASCAL=68;
    public static final int T__200=200;
    public static final int FLY=10;
    public static final int SLOWER=25;
    public static final int T__201=201;
    public static final int PM=30;
    public static final int FURLONG=55;
    public static final int LONGITUDE=37;
    public static final int PRESSURE=65;
    public static final int T__332=332;
    public static final int T__333=333;
    public static final int T__330=330;
    public static final int T__331=331;
    public static final int FORWARD=86;
    public static final int YEAR=38;
    public static final int MILE=54;
    public static final int Exponent=115;
    public static final int LineComment=118;
    public static final int YAW=19;
    public static final int T__329=329;
    public static final int DEFINE=5;
    public static final int T__328=328;
    public static final int T__327=327;
    public static final int T__326=326;
    public static final int T__325=325;
    public static final int T__324=324;
    public static final int T__323=323;
    public static final int T__341=341;
    public static final int WEST=77;
    public static final int T__342=342;
    public static final int T__199=199;
    public static final int T__198=198;
    public static final int T__292=292;
    public static final int T__197=197;
    public static final int T__291=291;
    public static final int T__196=196;
    public static final int T__290=290;
    public static final int T__195=195;
    public static final int T__194=194;
    public static final int T__340=340;
    public static final int T__296=296;
    public static final int T__193=193;
    public static final int T__295=295;
    public static final int T__192=192;
    public static final int T__294=294;
    public static final int T__191=191;
    public static final int T__293=293;
    public static final int T__190=190;
    public static final int SPEED=23;
    public static final int T__299=299;
    public static final int T__298=298;
    public static final int T__297=297;
    public static final int T__339=339;
    public static final int T__338=338;
    public static final int T__335=335;
    public static final int T__334=334;
    public static final int T__337=337;
    public static final int And=95;
    public static final int T__336=336;
    public static final int T__184=184;
    public static final int T__183=183;
    public static final int T__186=186;
    public static final int T__185=185;
    public static final int T__188=188;
    public static final int T__187=187;
    public static final int ANGLE=46;
    public static final int PERCENT=63;
    public static final int T__189=189;
    public static final int Heading=104;
    public static final int T__180=180;
    public static final int NEGATIVE=85;
    public static final int T__182=182;
    public static final int T__181=181;
    public static final int BACKWARD=87;
    public static final int Digit=110;
    public static final int DecimalLiteral=108;
    public static final int For=97;
    public static final int T__175=175;
    public static final int T__174=174;
    public static final int FLIGHTPLAN=4;
    public static final int T__173=173;
    public static final int T__172=172;
    public static final int T__179=179;
    public static final int Turning=103;
    public static final int T__178=178;
    public static final int T__177=177;
    public static final int KILOPASCAL=66;
    public static final int T__176=176;
    public static final int CLOCKWISE=61;
    public static final int T__171=171;
    public static final int T__170=170;
    public static final int LOITER=11;
    public static final int MINUTE=43;
    public static final int T__169=169;
    public static final int BAR=69;
    public static final int LE=82;

    // delegates
    // delegators


        public flipsUnitConversion(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public flipsUnitConversion(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return flipsUnitConversion.tokenNames; }
    public String getGrammarFileName() { return "flipsUnitConversion.g"; }


    public static class topdown_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "topdown"
    // flipsUnitConversion.g:39:1: topdown : ( convertParameter | convertTime | convertDistance | convertAltitude | convertRelativeDistance | convertRelativeAltitude | convertFlightLevel | convertPressure | convertSpeed | convertRelativeSpeed | convertFixedThrottle | convertRelativeThrottle | convertAngle | convertAngularRate | convertDirection | convertRelativeDirection );
    public final flipsUnitConversion.topdown_return topdown() throws RecognitionException {
        flipsUnitConversion.topdown_return retval = new flipsUnitConversion.topdown_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        flipsUnitConversion.convertParameter_return convertParameter1 = null;

        flipsUnitConversion.convertTime_return convertTime2 = null;

        flipsUnitConversion.convertDistance_return convertDistance3 = null;

        flipsUnitConversion.convertAltitude_return convertAltitude4 = null;

        flipsUnitConversion.convertRelativeDistance_return convertRelativeDistance5 = null;

        flipsUnitConversion.convertRelativeAltitude_return convertRelativeAltitude6 = null;

        flipsUnitConversion.convertFlightLevel_return convertFlightLevel7 = null;

        flipsUnitConversion.convertPressure_return convertPressure8 = null;

        flipsUnitConversion.convertSpeed_return convertSpeed9 = null;

        flipsUnitConversion.convertRelativeSpeed_return convertRelativeSpeed10 = null;

        flipsUnitConversion.convertFixedThrottle_return convertFixedThrottle11 = null;

        flipsUnitConversion.convertRelativeThrottle_return convertRelativeThrottle12 = null;

        flipsUnitConversion.convertAngle_return convertAngle13 = null;

        flipsUnitConversion.convertAngularRate_return convertAngularRate14 = null;

        flipsUnitConversion.convertDirection_return convertDirection15 = null;

        flipsUnitConversion.convertRelativeDirection_return convertRelativeDirection16 = null;



        try {
            // flipsUnitConversion.g:40:2: ( convertParameter | convertTime | convertDistance | convertAltitude | convertRelativeDistance | convertRelativeAltitude | convertFlightLevel | convertPressure | convertSpeed | convertRelativeSpeed | convertFixedThrottle | convertRelativeThrottle | convertAngle | convertAngularRate | convertDirection | convertRelativeDirection )
            int alt1=16;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // flipsUnitConversion.g:40:4: convertParameter
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_convertParameter_in_topdown75);
                    convertParameter1=convertParameter();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) 
                     
                    if ( _first_0==null ) _first_0 = convertParameter1.tree;

                    if ( state.backtracking==1 ) {
                    retval.tree = (CommonTree)_first_0;
                    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                        retval.tree = (CommonTree)adaptor.getParent(retval.tree);}
                    }
                    break;
                case 2 :
                    // flipsUnitConversion.g:41:4: convertTime
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_convertTime_in_topdown80);
                    convertTime2=convertTime();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) 
                     
                    if ( _first_0==null ) _first_0 = convertTime2.tree;

                    if ( state.backtracking==1 ) {
                    retval.tree = (CommonTree)_first_0;
                    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                        retval.tree = (CommonTree)adaptor.getParent(retval.tree);}
                    }
                    break;
                case 3 :
                    // flipsUnitConversion.g:42:4: convertDistance
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_convertDistance_in_topdown85);
                    convertDistance3=convertDistance();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) 
                     
                    if ( _first_0==null ) _first_0 = convertDistance3.tree;

                    if ( state.backtracking==1 ) {
                    retval.tree = (CommonTree)_first_0;
                    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                        retval.tree = (CommonTree)adaptor.getParent(retval.tree);}
                    }
                    break;
                case 4 :
                    // flipsUnitConversion.g:43:4: convertAltitude
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_convertAltitude_in_topdown90);
                    convertAltitude4=convertAltitude();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) 
                     
                    if ( _first_0==null ) _first_0 = convertAltitude4.tree;

                    if ( state.backtracking==1 ) {
                    retval.tree = (CommonTree)_first_0;
                    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                        retval.tree = (CommonTree)adaptor.getParent(retval.tree);}
                    }
                    break;
                case 5 :
                    // flipsUnitConversion.g:44:4: convertRelativeDistance
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_convertRelativeDistance_in_topdown95);
                    convertRelativeDistance5=convertRelativeDistance();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) 
                     
                    if ( _first_0==null ) _first_0 = convertRelativeDistance5.tree;

                    if ( state.backtracking==1 ) {
                    retval.tree = (CommonTree)_first_0;
                    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                        retval.tree = (CommonTree)adaptor.getParent(retval.tree);}
                    }
                    break;
                case 6 :
                    // flipsUnitConversion.g:45:4: convertRelativeAltitude
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_convertRelativeAltitude_in_topdown100);
                    convertRelativeAltitude6=convertRelativeAltitude();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) 
                     
                    if ( _first_0==null ) _first_0 = convertRelativeAltitude6.tree;

                    if ( state.backtracking==1 ) {
                    retval.tree = (CommonTree)_first_0;
                    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                        retval.tree = (CommonTree)adaptor.getParent(retval.tree);}
                    }
                    break;
                case 7 :
                    // flipsUnitConversion.g:46:4: convertFlightLevel
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_convertFlightLevel_in_topdown105);
                    convertFlightLevel7=convertFlightLevel();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) 
                     
                    if ( _first_0==null ) _first_0 = convertFlightLevel7.tree;

                    if ( state.backtracking==1 ) {
                    retval.tree = (CommonTree)_first_0;
                    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                        retval.tree = (CommonTree)adaptor.getParent(retval.tree);}
                    }
                    break;
                case 8 :
                    // flipsUnitConversion.g:47:4: convertPressure
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_convertPressure_in_topdown110);
                    convertPressure8=convertPressure();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) 
                     
                    if ( _first_0==null ) _first_0 = convertPressure8.tree;

                    if ( state.backtracking==1 ) {
                    retval.tree = (CommonTree)_first_0;
                    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                        retval.tree = (CommonTree)adaptor.getParent(retval.tree);}
                    }
                    break;
                case 9 :
                    // flipsUnitConversion.g:48:4: convertSpeed
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_convertSpeed_in_topdown115);
                    convertSpeed9=convertSpeed();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) 
                     
                    if ( _first_0==null ) _first_0 = convertSpeed9.tree;

                    if ( state.backtracking==1 ) {
                    retval.tree = (CommonTree)_first_0;
                    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                        retval.tree = (CommonTree)adaptor.getParent(retval.tree);}
                    }
                    break;
                case 10 :
                    // flipsUnitConversion.g:49:4: convertRelativeSpeed
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_convertRelativeSpeed_in_topdown120);
                    convertRelativeSpeed10=convertRelativeSpeed();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) 
                     
                    if ( _first_0==null ) _first_0 = convertRelativeSpeed10.tree;

                    if ( state.backtracking==1 ) {
                    retval.tree = (CommonTree)_first_0;
                    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                        retval.tree = (CommonTree)adaptor.getParent(retval.tree);}
                    }
                    break;
                case 11 :
                    // flipsUnitConversion.g:50:4: convertFixedThrottle
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_convertFixedThrottle_in_topdown125);
                    convertFixedThrottle11=convertFixedThrottle();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) 
                     
                    if ( _first_0==null ) _first_0 = convertFixedThrottle11.tree;

                    if ( state.backtracking==1 ) {
                    retval.tree = (CommonTree)_first_0;
                    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                        retval.tree = (CommonTree)adaptor.getParent(retval.tree);}
                    }
                    break;
                case 12 :
                    // flipsUnitConversion.g:51:4: convertRelativeThrottle
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_convertRelativeThrottle_in_topdown130);
                    convertRelativeThrottle12=convertRelativeThrottle();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) 
                     
                    if ( _first_0==null ) _first_0 = convertRelativeThrottle12.tree;

                    if ( state.backtracking==1 ) {
                    retval.tree = (CommonTree)_first_0;
                    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                        retval.tree = (CommonTree)adaptor.getParent(retval.tree);}
                    }
                    break;
                case 13 :
                    // flipsUnitConversion.g:52:4: convertAngle
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_convertAngle_in_topdown135);
                    convertAngle13=convertAngle();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) 
                     
                    if ( _first_0==null ) _first_0 = convertAngle13.tree;

                    if ( state.backtracking==1 ) {
                    retval.tree = (CommonTree)_first_0;
                    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                        retval.tree = (CommonTree)adaptor.getParent(retval.tree);}
                    }
                    break;
                case 14 :
                    // flipsUnitConversion.g:53:4: convertAngularRate
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_convertAngularRate_in_topdown140);
                    convertAngularRate14=convertAngularRate();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) 
                     
                    if ( _first_0==null ) _first_0 = convertAngularRate14.tree;

                    if ( state.backtracking==1 ) {
                    retval.tree = (CommonTree)_first_0;
                    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                        retval.tree = (CommonTree)adaptor.getParent(retval.tree);}
                    }
                    break;
                case 15 :
                    // flipsUnitConversion.g:54:4: convertDirection
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_convertDirection_in_topdown145);
                    convertDirection15=convertDirection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) 
                     
                    if ( _first_0==null ) _first_0 = convertDirection15.tree;

                    if ( state.backtracking==1 ) {
                    retval.tree = (CommonTree)_first_0;
                    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                        retval.tree = (CommonTree)adaptor.getParent(retval.tree);}
                    }
                    break;
                case 16 :
                    // flipsUnitConversion.g:55:4: convertRelativeDirection
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_convertRelativeDirection_in_topdown150);
                    convertRelativeDirection16=convertRelativeDirection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) 
                     
                    if ( _first_0==null ) _first_0 = convertRelativeDirection16.tree;

                    if ( state.backtracking==1 ) {
                    retval.tree = (CommonTree)_first_0;
                    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                        retval.tree = (CommonTree)adaptor.getParent(retval.tree);}
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "topdown"

    public static class convertParameter_return extends TreeRuleReturnScope {
        public double r;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "convertParameter"
    // flipsUnitConversion.g:59:1: convertParameter returns [double r] : ^( PARAMETER x= numericValue ) -> ^( PARAMETER FloatingPointLiteral[String.valueOf($r)] ) ;
    public final flipsUnitConversion.convertParameter_return convertParameter() throws RecognitionException {
        flipsUnitConversion.convertParameter_return retval = new flipsUnitConversion.convertParameter_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree PARAMETER17=null;
        flipsUnitConversion.numericValue_return x = null;


        CommonTree PARAMETER17_tree=null;
        RewriteRuleNodeStream stream_PARAMETER=new RewriteRuleNodeStream(adaptor,"token PARAMETER");
        RewriteRuleSubtreeStream stream_numericValue=new RewriteRuleSubtreeStream(adaptor,"rule numericValue");
        try {
            // flipsUnitConversion.g:60:2: ( ^( PARAMETER x= numericValue ) -> ^( PARAMETER FloatingPointLiteral[String.valueOf($r)] ) )
            // flipsUnitConversion.g:60:4: ^( PARAMETER x= numericValue )
            {
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            _last = (CommonTree)input.LT(1);
            PARAMETER17=(CommonTree)match(input,PARAMETER,FOLLOW_PARAMETER_in_convertParameter167); if (state.failed) return retval; 
            if ( state.backtracking==1 ) stream_PARAMETER.add(PARAMETER17);


            if ( state.backtracking==1 )
            if ( _first_0==null ) _first_0 = PARAMETER17;
            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_numericValue_in_convertParameter171);
            x=numericValue();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==1 ) stream_numericValue.add(x.getTree());

            match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_1;
            }

            if ( state.backtracking==1 ) {
              retval.r = x.r;
            }


            // AST REWRITE
            // elements: PARAMETER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==1 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 62:2: -> ^( PARAMETER FloatingPointLiteral[String.valueOf($r)] )
            {
                // flipsUnitConversion.g:62:5: ^( PARAMETER FloatingPointLiteral[String.valueOf($r)] )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_PARAMETER.nextNode(), root_1);

                adaptor.addChild(root_1, (CommonTree)adaptor.create(FloatingPointLiteral, String.valueOf(retval.r)));

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            input.replaceChildren(adaptor.getParent(retval.start),
                                  adaptor.getChildIndex(retval.start),
                                  adaptor.getChildIndex(_last),
                                  retval.tree);}
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "convertParameter"

    public static class convertTime_return extends TreeRuleReturnScope {
        public double r;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "convertTime"
    // flipsUnitConversion.g:68:1: convertTime returns [double r] : ( ^( TIME x= numericValuePositive y= convertTimeUnit ) -> ^( TIME FloatingPointLiteral[String.valueOf($r)] SECOND ) | ^( TIME ^( HOUR hr= integerValue ) ^( MINUTE minn= numericValuePositive ) ) -> ^( TIME FloatingPointLiteral[String.valueOf($r)] SECOND ) | ^( TIME ^( HOUR hr= integerValue ) ^( SECOND s= numericValuePositive ) ) -> ^( TIME FloatingPointLiteral[String.valueOf($r)] SECOND ) | ^( TIME ^( HOUR hr= integerValue ) ^( MINUTE min= integerValue ) ^( SECOND s= numericValuePositive ) ) -> ^( TIME FloatingPointLiteral[String.valueOf($r)] SECOND ) | ^( TIME ^( MINUTE min= integerValue ) ^( SECOND s= numericValuePositive ) ) -> ^( TIME FloatingPointLiteral[String.valueOf($r)] SECOND ) );
    public final flipsUnitConversion.convertTime_return convertTime() throws RecognitionException {
        flipsUnitConversion.convertTime_return retval = new flipsUnitConversion.convertTime_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree TIME18=null;
        CommonTree TIME19=null;
        CommonTree HOUR20=null;
        CommonTree MINUTE21=null;
        CommonTree TIME22=null;
        CommonTree HOUR23=null;
        CommonTree SECOND24=null;
        CommonTree TIME25=null;
        CommonTree HOUR26=null;
        CommonTree MINUTE27=null;
        CommonTree SECOND28=null;
        CommonTree TIME29=null;
        CommonTree MINUTE30=null;
        CommonTree SECOND31=null;
        flipsUnitConversion.numericValuePositive_return x = null;

        flipsUnitConversion.convertTimeUnit_return y = null;

        flipsUnitConversion.integerValue_return hr = null;

        flipsUnitConversion.numericValuePositive_return minn = null;

        flipsUnitConversion.numericValuePositive_return s = null;

        flipsUnitConversion.integerValue_return min = null;


        CommonTree TIME18_tree=null;
        CommonTree TIME19_tree=null;
        CommonTree HOUR20_tree=null;
        CommonTree MINUTE21_tree=null;
        CommonTree TIME22_tree=null;
        CommonTree HOUR23_tree=null;
        CommonTree SECOND24_tree=null;
        CommonTree TIME25_tree=null;
        CommonTree HOUR26_tree=null;
        CommonTree MINUTE27_tree=null;
        CommonTree SECOND28_tree=null;
        CommonTree TIME29_tree=null;
        CommonTree MINUTE30_tree=null;
        CommonTree SECOND31_tree=null;
        RewriteRuleNodeStream stream_TIME=new RewriteRuleNodeStream(adaptor,"token TIME");
        RewriteRuleNodeStream stream_SECOND=new RewriteRuleNodeStream(adaptor,"token SECOND");
        RewriteRuleNodeStream stream_HOUR=new RewriteRuleNodeStream(adaptor,"token HOUR");
        RewriteRuleNodeStream stream_MINUTE=new RewriteRuleNodeStream(adaptor,"token MINUTE");
        RewriteRuleSubtreeStream stream_convertTimeUnit=new RewriteRuleSubtreeStream(adaptor,"rule convertTimeUnit");
        RewriteRuleSubtreeStream stream_numericValuePositive=new RewriteRuleSubtreeStream(adaptor,"rule numericValuePositive");
        RewriteRuleSubtreeStream stream_integerValue=new RewriteRuleSubtreeStream(adaptor,"rule integerValue");
        try {
            // flipsUnitConversion.g:69:2: ( ^( TIME x= numericValuePositive y= convertTimeUnit ) -> ^( TIME FloatingPointLiteral[String.valueOf($r)] SECOND ) | ^( TIME ^( HOUR hr= integerValue ) ^( MINUTE minn= numericValuePositive ) ) -> ^( TIME FloatingPointLiteral[String.valueOf($r)] SECOND ) | ^( TIME ^( HOUR hr= integerValue ) ^( SECOND s= numericValuePositive ) ) -> ^( TIME FloatingPointLiteral[String.valueOf($r)] SECOND ) | ^( TIME ^( HOUR hr= integerValue ) ^( MINUTE min= integerValue ) ^( SECOND s= numericValuePositive ) ) -> ^( TIME FloatingPointLiteral[String.valueOf($r)] SECOND ) | ^( TIME ^( MINUTE min= integerValue ) ^( SECOND s= numericValuePositive ) ) -> ^( TIME FloatingPointLiteral[String.valueOf($r)] SECOND ) )
            int alt2=5;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // flipsUnitConversion.g:69:4: ^( TIME x= numericValuePositive y= convertTimeUnit )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    _last = (CommonTree)input.LT(1);
                    TIME18=(CommonTree)match(input,TIME,FOLLOW_TIME_in_convertTime205); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_TIME.add(TIME18);


                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = TIME18;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_numericValuePositive_in_convertTime209);
                    x=numericValuePositive();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) stream_numericValuePositive.add(x.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_convertTimeUnit_in_convertTime213);
                    y=convertTimeUnit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) stream_convertTimeUnit.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_1;
                    }

                    if ( state.backtracking==1 ) {
                      retval.r = x.r * y.r;
                    }


                    // AST REWRITE
                    // elements: TIME
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 71:2: -> ^( TIME FloatingPointLiteral[String.valueOf($r)] SECOND )
                    {
                        // flipsUnitConversion.g:71:5: ^( TIME FloatingPointLiteral[String.valueOf($r)] SECOND )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_TIME.nextNode(), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(FloatingPointLiteral, String.valueOf(retval.r)));
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(SECOND, "SECOND"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);}
                    }
                    break;
                case 2 :
                    // flipsUnitConversion.g:72:4: ^( TIME ^( HOUR hr= integerValue ) ^( MINUTE minn= numericValuePositive ) )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    _last = (CommonTree)input.LT(1);
                    TIME19=(CommonTree)match(input,TIME,FOLLOW_TIME_in_convertTime236); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_TIME.add(TIME19);


                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = TIME19;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    _last = (CommonTree)input.LT(1);
                    HOUR20=(CommonTree)match(input,HOUR,FOLLOW_HOUR_in_convertTime239); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_HOUR.add(HOUR20);


                    if ( state.backtracking==1 )
                    if ( _first_1==null ) _first_1 = HOUR20;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_integerValue_in_convertTime243);
                    hr=integerValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) stream_integerValue.add(hr.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_2;
                    }

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    _last = (CommonTree)input.LT(1);
                    MINUTE21=(CommonTree)match(input,MINUTE,FOLLOW_MINUTE_in_convertTime247); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_MINUTE.add(MINUTE21);


                    if ( state.backtracking==1 )
                    if ( _first_1==null ) _first_1 = MINUTE21;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_numericValuePositive_in_convertTime251);
                    minn=numericValuePositive();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) stream_numericValuePositive.add(minn.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_1;
                    }

                    if ( state.backtracking==1 ) {
                      retval.r = hr.r * 3600d + minn.r * 60d;
                    }


                    // AST REWRITE
                    // elements: TIME
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 74:2: -> ^( TIME FloatingPointLiteral[String.valueOf($r)] SECOND )
                    {
                        // flipsUnitConversion.g:74:5: ^( TIME FloatingPointLiteral[String.valueOf($r)] SECOND )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_TIME.nextNode(), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(FloatingPointLiteral, String.valueOf(retval.r)));
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(SECOND, "SECOND"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);}
                    }
                    break;
                case 3 :
                    // flipsUnitConversion.g:75:4: ^( TIME ^( HOUR hr= integerValue ) ^( SECOND s= numericValuePositive ) )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    _last = (CommonTree)input.LT(1);
                    TIME22=(CommonTree)match(input,TIME,FOLLOW_TIME_in_convertTime275); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_TIME.add(TIME22);


                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = TIME22;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    _last = (CommonTree)input.LT(1);
                    HOUR23=(CommonTree)match(input,HOUR,FOLLOW_HOUR_in_convertTime278); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_HOUR.add(HOUR23);


                    if ( state.backtracking==1 )
                    if ( _first_1==null ) _first_1 = HOUR23;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_integerValue_in_convertTime282);
                    hr=integerValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) stream_integerValue.add(hr.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_2;
                    }

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    _last = (CommonTree)input.LT(1);
                    SECOND24=(CommonTree)match(input,SECOND,FOLLOW_SECOND_in_convertTime286); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_SECOND.add(SECOND24);


                    if ( state.backtracking==1 )
                    if ( _first_1==null ) _first_1 = SECOND24;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_numericValuePositive_in_convertTime290);
                    s=numericValuePositive();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) stream_numericValuePositive.add(s.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_1;
                    }

                    if ( state.backtracking==1 ) {
                      retval.r = hr.r * 3600d + s.r;
                    }


                    // AST REWRITE
                    // elements: TIME, SECOND
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 77:2: -> ^( TIME FloatingPointLiteral[String.valueOf($r)] SECOND )
                    {
                        // flipsUnitConversion.g:77:5: ^( TIME FloatingPointLiteral[String.valueOf($r)] SECOND )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_TIME.nextNode(), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(FloatingPointLiteral, String.valueOf(retval.r)));
                        adaptor.addChild(root_1, stream_SECOND.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);}
                    }
                    break;
                case 4 :
                    // flipsUnitConversion.g:78:4: ^( TIME ^( HOUR hr= integerValue ) ^( MINUTE min= integerValue ) ^( SECOND s= numericValuePositive ) )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    _last = (CommonTree)input.LT(1);
                    TIME25=(CommonTree)match(input,TIME,FOLLOW_TIME_in_convertTime314); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_TIME.add(TIME25);


                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = TIME25;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    _last = (CommonTree)input.LT(1);
                    HOUR26=(CommonTree)match(input,HOUR,FOLLOW_HOUR_in_convertTime317); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_HOUR.add(HOUR26);


                    if ( state.backtracking==1 )
                    if ( _first_1==null ) _first_1 = HOUR26;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_integerValue_in_convertTime321);
                    hr=integerValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) stream_integerValue.add(hr.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_2;
                    }

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    _last = (CommonTree)input.LT(1);
                    MINUTE27=(CommonTree)match(input,MINUTE,FOLLOW_MINUTE_in_convertTime325); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_MINUTE.add(MINUTE27);


                    if ( state.backtracking==1 )
                    if ( _first_1==null ) _first_1 = MINUTE27;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_integerValue_in_convertTime329);
                    min=integerValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) stream_integerValue.add(min.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_2;
                    }

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    _last = (CommonTree)input.LT(1);
                    SECOND28=(CommonTree)match(input,SECOND,FOLLOW_SECOND_in_convertTime333); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_SECOND.add(SECOND28);


                    if ( state.backtracking==1 )
                    if ( _first_1==null ) _first_1 = SECOND28;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_numericValuePositive_in_convertTime337);
                    s=numericValuePositive();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) stream_numericValuePositive.add(s.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_1;
                    }

                    if ( state.backtracking==1 ) {
                      retval.r = hr.r * 3600d + min.r * 60d + s.r;
                    }


                    // AST REWRITE
                    // elements: TIME, SECOND
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 80:2: -> ^( TIME FloatingPointLiteral[String.valueOf($r)] SECOND )
                    {
                        // flipsUnitConversion.g:80:5: ^( TIME FloatingPointLiteral[String.valueOf($r)] SECOND )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_TIME.nextNode(), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(FloatingPointLiteral, String.valueOf(retval.r)));
                        adaptor.addChild(root_1, stream_SECOND.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);}
                    }
                    break;
                case 5 :
                    // flipsUnitConversion.g:81:4: ^( TIME ^( MINUTE min= integerValue ) ^( SECOND s= numericValuePositive ) )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    _last = (CommonTree)input.LT(1);
                    TIME29=(CommonTree)match(input,TIME,FOLLOW_TIME_in_convertTime361); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_TIME.add(TIME29);


                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = TIME29;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    _last = (CommonTree)input.LT(1);
                    MINUTE30=(CommonTree)match(input,MINUTE,FOLLOW_MINUTE_in_convertTime364); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_MINUTE.add(MINUTE30);


                    if ( state.backtracking==1 )
                    if ( _first_1==null ) _first_1 = MINUTE30;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_integerValue_in_convertTime368);
                    min=integerValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) stream_integerValue.add(min.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_2;
                    }

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    _last = (CommonTree)input.LT(1);
                    SECOND31=(CommonTree)match(input,SECOND,FOLLOW_SECOND_in_convertTime372); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_SECOND.add(SECOND31);


                    if ( state.backtracking==1 )
                    if ( _first_1==null ) _first_1 = SECOND31;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_numericValuePositive_in_convertTime376);
                    s=numericValuePositive();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) stream_numericValuePositive.add(s.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_1;
                    }

                    if ( state.backtracking==1 ) {
                      retval.r = min.r * 60d + s.r;
                    }


                    // AST REWRITE
                    // elements: TIME, SECOND
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 83:2: -> ^( TIME FloatingPointLiteral[String.valueOf($r)] SECOND )
                    {
                        // flipsUnitConversion.g:83:5: ^( TIME FloatingPointLiteral[String.valueOf($r)] SECOND )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_TIME.nextNode(), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(FloatingPointLiteral, String.valueOf(retval.r)));
                        adaptor.addChild(root_1, stream_SECOND.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);}
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "convertTime"

    public static class convertTimeUnit_return extends TreeRuleReturnScope {
        public double r;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "convertTimeUnit"
    // flipsUnitConversion.g:87:1: convertTimeUnit returns [double r] : ( YEAR | FORTNIGHT | WEEK | DAY | HOUR | MINUTE | SECOND | MILLISECOND );
    public final flipsUnitConversion.convertTimeUnit_return convertTimeUnit() throws RecognitionException {
        flipsUnitConversion.convertTimeUnit_return retval = new flipsUnitConversion.convertTimeUnit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree YEAR32=null;
        CommonTree FORTNIGHT33=null;
        CommonTree WEEK34=null;
        CommonTree DAY35=null;
        CommonTree HOUR36=null;
        CommonTree MINUTE37=null;
        CommonTree SECOND38=null;
        CommonTree MILLISECOND39=null;

        CommonTree YEAR32_tree=null;
        CommonTree FORTNIGHT33_tree=null;
        CommonTree WEEK34_tree=null;
        CommonTree DAY35_tree=null;
        CommonTree HOUR36_tree=null;
        CommonTree MINUTE37_tree=null;
        CommonTree SECOND38_tree=null;
        CommonTree MILLISECOND39_tree=null;

        try {
            // flipsUnitConversion.g:88:2: ( YEAR | FORTNIGHT | WEEK | DAY | HOUR | MINUTE | SECOND | MILLISECOND )
            int alt3=8;
            switch ( input.LA(1) ) {
            case YEAR:
                {
                alt3=1;
                }
                break;
            case FORTNIGHT:
                {
                alt3=2;
                }
                break;
            case WEEK:
                {
                alt3=3;
                }
                break;
            case DAY:
                {
                alt3=4;
                }
                break;
            case HOUR:
                {
                alt3=5;
                }
                break;
            case MINUTE:
                {
                alt3=6;
                }
                break;
            case SECOND:
                {
                alt3=7;
                }
                break;
            case MILLISECOND:
                {
                alt3=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // flipsUnitConversion.g:88:4: YEAR
                    {
                    _last = (CommonTree)input.LT(1);
                    YEAR32=(CommonTree)match(input,YEAR,FOLLOW_YEAR_in_convertTimeUnit410); if (state.failed) return retval;
                     
                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = YEAR32;
                    if ( state.backtracking==1 ) {
                      retval.r = 31557600d;
                    }

                    if ( state.backtracking==1 ) {
                    retval.tree = (CommonTree)_first_0;
                    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                        retval.tree = (CommonTree)adaptor.getParent(retval.tree);}
                    }
                    break;
                case 2 :
                    // flipsUnitConversion.g:90:4: FORTNIGHT
                    {
                    _last = (CommonTree)input.LT(1);
                    FORTNIGHT33=(CommonTree)match(input,FORTNIGHT,FOLLOW_FORTNIGHT_in_convertTimeUnit419); if (state.failed) return retval;
                     
                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = FORTNIGHT33;
                    if ( state.backtracking==1 ) {
                      retval.r = 1209600d;
                    }

                    if ( state.backtracking==1 ) {
                    retval.tree = (CommonTree)_first_0;
                    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                        retval.tree = (CommonTree)adaptor.getParent(retval.tree);}
                    }
                    break;
                case 3 :
                    // flipsUnitConversion.g:92:4: WEEK
                    {
                    _last = (CommonTree)input.LT(1);
                    WEEK34=(CommonTree)match(input,WEEK,FOLLOW_WEEK_in_convertTimeUnit428); if (state.failed) return retval;
                     
                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = WEEK34;
                    if ( state.backtracking==1 ) {
                      retval.r = 604800d;
                    }

                    if ( state.backtracking==1 ) {
                    retval.tree = (CommonTree)_first_0;
                    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                        retval.tree = (CommonTree)adaptor.getParent(retval.tree);}
                    }
                    break;
                case 4 :
                    // flipsUnitConversion.g:94:4: DAY
                    {
                    _last = (CommonTree)input.LT(1);
                    DAY35=(CommonTree)match(input,DAY,FOLLOW_DAY_in_convertTimeUnit437); if (state.failed) return retval;
                     
                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = DAY35;
                    if ( state.backtracking==1 ) {
                      retval.r = 86400d;
                    }

                    if ( state.backtracking==1 ) {
                    retval.tree = (CommonTree)_first_0;
                    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                        retval.tree = (CommonTree)adaptor.getParent(retval.tree);}
                    }
                    break;
                case 5 :
                    // flipsUnitConversion.g:96:4: HOUR
                    {
                    _last = (CommonTree)input.LT(1);
                    HOUR36=(CommonTree)match(input,HOUR,FOLLOW_HOUR_in_convertTimeUnit446); if (state.failed) return retval;
                     
                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = HOUR36;
                    if ( state.backtracking==1 ) {
                      retval.r = 3600d;
                    }

                    if ( state.backtracking==1 ) {
                    retval.tree = (CommonTree)_first_0;
                    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                        retval.tree = (CommonTree)adaptor.getParent(retval.tree);}
                    }
                    break;
                case 6 :
                    // flipsUnitConversion.g:98:4: MINUTE
                    {
                    _last = (CommonTree)input.LT(1);
                    MINUTE37=(CommonTree)match(input,MINUTE,FOLLOW_MINUTE_in_convertTimeUnit455); if (state.failed) return retval;
                     
                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = MINUTE37;
                    if ( state.backtracking==1 ) {
                      retval.r = 60d;
                    }

                    if ( state.backtracking==1 ) {
                    retval.tree = (CommonTree)_first_0;
                    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                        retval.tree = (CommonTree)adaptor.getParent(retval.tree);}
                    }
                    break;
                case 7 :
                    // flipsUnitConversion.g:100:4: SECOND
                    {
                    _last = (CommonTree)input.LT(1);
                    SECOND38=(CommonTree)match(input,SECOND,FOLLOW_SECOND_in_convertTimeUnit464); if (state.failed) return retval;
                     
                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = SECOND38;
                    if ( state.backtracking==1 ) {
                      retval.r = 1d;
                    }

                    if ( state.backtracking==1 ) {
                    retval.tree = (CommonTree)_first_0;
                    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                        retval.tree = (CommonTree)adaptor.getParent(retval.tree);}
                    }
                    break;
                case 8 :
                    // flipsUnitConversion.g:102:4: MILLISECOND
                    {
                    _last = (CommonTree)input.LT(1);
                    MILLISECOND39=(CommonTree)match(input,MILLISECOND,FOLLOW_MILLISECOND_in_convertTimeUnit473); if (state.failed) return retval;
                     
                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = MILLISECOND39;
                    if ( state.backtracking==1 ) {
                      retval.r = 0.001d;
                    }

                    if ( state.backtracking==1 ) {
                    retval.tree = (CommonTree)_first_0;
                    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                        retval.tree = (CommonTree)adaptor.getParent(retval.tree);}
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "convertTimeUnit"

    public static class convertDistance_return extends TreeRuleReturnScope {
        public double r;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "convertDistance"
    // flipsUnitConversion.g:107:1: convertDistance returns [double r] : ^( DISTANCE x= numericValue y= convertDistanceUnit ) -> ^( DISTANCE FloatingPointLiteral[String.valueOf($r)] METER ) ;
    public final flipsUnitConversion.convertDistance_return convertDistance() throws RecognitionException {
        flipsUnitConversion.convertDistance_return retval = new flipsUnitConversion.convertDistance_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DISTANCE40=null;
        flipsUnitConversion.numericValue_return x = null;

        flipsUnitConversion.convertDistanceUnit_return y = null;


        CommonTree DISTANCE40_tree=null;
        RewriteRuleNodeStream stream_DISTANCE=new RewriteRuleNodeStream(adaptor,"token DISTANCE");
        RewriteRuleSubtreeStream stream_numericValue=new RewriteRuleSubtreeStream(adaptor,"rule numericValue");
        RewriteRuleSubtreeStream stream_convertDistanceUnit=new RewriteRuleSubtreeStream(adaptor,"rule convertDistanceUnit");
        try {
            // flipsUnitConversion.g:108:2: ( ^( DISTANCE x= numericValue y= convertDistanceUnit ) -> ^( DISTANCE FloatingPointLiteral[String.valueOf($r)] METER ) )
            // flipsUnitConversion.g:108:4: ^( DISTANCE x= numericValue y= convertDistanceUnit )
            {
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            _last = (CommonTree)input.LT(1);
            DISTANCE40=(CommonTree)match(input,DISTANCE,FOLLOW_DISTANCE_in_convertDistance494); if (state.failed) return retval; 
            if ( state.backtracking==1 ) stream_DISTANCE.add(DISTANCE40);


            if ( state.backtracking==1 )
            if ( _first_0==null ) _first_0 = DISTANCE40;
            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_numericValue_in_convertDistance498);
            x=numericValue();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==1 ) stream_numericValue.add(x.getTree());
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_convertDistanceUnit_in_convertDistance502);
            y=convertDistanceUnit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==1 ) stream_convertDistanceUnit.add(y.getTree());

            match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_1;
            }

            if ( state.backtracking==1 ) {
              retval.r = x.r * y.r;
            }


            // AST REWRITE
            // elements: DISTANCE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==1 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 110:2: -> ^( DISTANCE FloatingPointLiteral[String.valueOf($r)] METER )
            {
                // flipsUnitConversion.g:110:5: ^( DISTANCE FloatingPointLiteral[String.valueOf($r)] METER )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_DISTANCE.nextNode(), root_1);

                adaptor.addChild(root_1, (CommonTree)adaptor.create(FloatingPointLiteral, String.valueOf(retval.r)));
                adaptor.addChild(root_1, (CommonTree)adaptor.create(METER, "METER"));

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            input.replaceChildren(adaptor.getParent(retval.start),
                                  adaptor.getChildIndex(retval.start),
                                  adaptor.getChildIndex(_last),
                                  retval.tree);}
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "convertDistance"

    public static class convertDistanceUnit_return extends TreeRuleReturnScope {
        public double r;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "convertDistanceUnit"
    // flipsUnitConversion.g:114:1: convertDistanceUnit returns [double r] : ( KILOMETER | METER | CENTIMETER | NAUTICAL MILE | MILE | FURLONG | YARD | FOOT | INCH );
    public final flipsUnitConversion.convertDistanceUnit_return convertDistanceUnit() throws RecognitionException {
        flipsUnitConversion.convertDistanceUnit_return retval = new flipsUnitConversion.convertDistanceUnit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree KILOMETER41=null;
        CommonTree METER42=null;
        CommonTree CENTIMETER43=null;
        CommonTree NAUTICAL44=null;
        CommonTree MILE45=null;
        CommonTree MILE46=null;
        CommonTree FURLONG47=null;
        CommonTree YARD48=null;
        CommonTree FOOT49=null;
        CommonTree INCH50=null;

        CommonTree KILOMETER41_tree=null;
        CommonTree METER42_tree=null;
        CommonTree CENTIMETER43_tree=null;
        CommonTree NAUTICAL44_tree=null;
        CommonTree MILE45_tree=null;
        CommonTree MILE46_tree=null;
        CommonTree FURLONG47_tree=null;
        CommonTree YARD48_tree=null;
        CommonTree FOOT49_tree=null;
        CommonTree INCH50_tree=null;

        try {
            // flipsUnitConversion.g:115:2: ( KILOMETER | METER | CENTIMETER | NAUTICAL MILE | MILE | FURLONG | YARD | FOOT | INCH )
            int alt4=9;
            switch ( input.LA(1) ) {
            case KILOMETER:
                {
                alt4=1;
                }
                break;
            case METER:
                {
                alt4=2;
                }
                break;
            case CENTIMETER:
                {
                alt4=3;
                }
                break;
            case NAUTICAL:
                {
                alt4=4;
                }
                break;
            case MILE:
                {
                alt4=5;
                }
                break;
            case FURLONG:
                {
                alt4=6;
                }
                break;
            case YARD:
                {
                alt4=7;
                }
                break;
            case FOOT:
                {
                alt4=8;
                }
                break;
            case INCH:
                {
                alt4=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // flipsUnitConversion.g:115:4: KILOMETER
                    {
                    _last = (CommonTree)input.LT(1);
                    KILOMETER41=(CommonTree)match(input,KILOMETER,FOLLOW_KILOMETER_in_convertDistanceUnit535); if (state.failed) return retval;
                     
                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = KILOMETER41;
                    if ( state.backtracking==1 ) {
                      retval.r = 1000d;
                    }

                    if ( state.backtracking==1 ) {
                    retval.tree = (CommonTree)_first_0;
                    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                        retval.tree = (CommonTree)adaptor.getParent(retval.tree);}
                    }
                    break;
                case 2 :
                    // flipsUnitConversion.g:117:4: METER
                    {
                    _last = (CommonTree)input.LT(1);
                    METER42=(CommonTree)match(input,METER,FOLLOW_METER_in_convertDistanceUnit544); if (state.failed) return retval;
                     
                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = METER42;
                    if ( state.backtracking==1 ) {
                      retval.r = 1d;
                    }

                    if ( state.backtracking==1 ) {
                    retval.tree = (CommonTree)_first_0;
                    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                        retval.tree = (CommonTree)adaptor.getParent(retval.tree);}
                    }
                    break;
                case 3 :
                    // flipsUnitConversion.g:119:4: CENTIMETER
                    {
                    _last = (CommonTree)input.LT(1);
                    CENTIMETER43=(CommonTree)match(input,CENTIMETER,FOLLOW_CENTIMETER_in_convertDistanceUnit553); if (state.failed) return retval;
                     
                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = CENTIMETER43;
                    if ( state.backtracking==1 ) {
                      retval.r = 0.01d;
                    }

                    if ( state.backtracking==1 ) {
                    retval.tree = (CommonTree)_first_0;
                    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                        retval.tree = (CommonTree)adaptor.getParent(retval.tree);}
                    }
                    break;
                case 4 :
                    // flipsUnitConversion.g:121:4: NAUTICAL MILE
                    {
                    _last = (CommonTree)input.LT(1);
                    NAUTICAL44=(CommonTree)match(input,NAUTICAL,FOLLOW_NAUTICAL_in_convertDistanceUnit562); if (state.failed) return retval;
                     
                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = NAUTICAL44;
                    _last = (CommonTree)input.LT(1);
                    MILE45=(CommonTree)match(input,MILE,FOLLOW_MILE_in_convertDistanceUnit564); if (state.failed) return retval;
                     
                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = MILE45;
                    if ( state.backtracking==1 ) {
                      retval.r = 1852d;
                    }

                    if ( state.backtracking==1 ) {
                    retval.tree = (CommonTree)_first_0;
                    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                        retval.tree = (CommonTree)adaptor.getParent(retval.tree);}
                    }
                    break;
                case 5 :
                    // flipsUnitConversion.g:123:4: MILE
                    {
                    _last = (CommonTree)input.LT(1);
                    MILE46=(CommonTree)match(input,MILE,FOLLOW_MILE_in_convertDistanceUnit573); if (state.failed) return retval;
                     
                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = MILE46;
                    if ( state.backtracking==1 ) {
                      retval.r = 1609.344d;
                    }

                    if ( state.backtracking==1 ) {
                    retval.tree = (CommonTree)_first_0;
                    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                        retval.tree = (CommonTree)adaptor.getParent(retval.tree);}
                    }
                    break;
                case 6 :
                    // flipsUnitConversion.g:125:4: FURLONG
                    {
                    _last = (CommonTree)input.LT(1);
                    FURLONG47=(CommonTree)match(input,FURLONG,FOLLOW_FURLONG_in_convertDistanceUnit582); if (state.failed) return retval;
                     
                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = FURLONG47;
                    if ( state.backtracking==1 ) {
                      retval.r = 201.168d;
                    }

                    if ( state.backtracking==1 ) {
                    retval.tree = (CommonTree)_first_0;
                    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                        retval.tree = (CommonTree)adaptor.getParent(retval.tree);}
                    }
                    break;
                case 7 :
                    // flipsUnitConversion.g:127:4: YARD
                    {
                    _last = (CommonTree)input.LT(1);
                    YARD48=(CommonTree)match(input,YARD,FOLLOW_YARD_in_convertDistanceUnit591); if (state.failed) return retval;
                     
                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = YARD48;
                    if ( state.backtracking==1 ) {
                      retval.r = 0.9144d;
                    }

                    if ( state.backtracking==1 ) {
                    retval.tree = (CommonTree)_first_0;
                    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                        retval.tree = (CommonTree)adaptor.getParent(retval.tree);}
                    }
                    break;
                case 8 :
                    // flipsUnitConversion.g:129:4: FOOT
                    {
                    _last = (CommonTree)input.LT(1);
                    FOOT49=(CommonTree)match(input,FOOT,FOLLOW_FOOT_in_convertDistanceUnit600); if (state.failed) return retval;
                     
                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = FOOT49;
                    if ( state.backtracking==1 ) {
                      retval.r = 0.3048d;
                    }

                    if ( state.backtracking==1 ) {
                    retval.tree = (CommonTree)_first_0;
                    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                        retval.tree = (CommonTree)adaptor.getParent(retval.tree);}
                    }
                    break;
                case 9 :
                    // flipsUnitConversion.g:131:4: INCH
                    {
                    _last = (CommonTree)input.LT(1);
                    INCH50=(CommonTree)match(input,INCH,FOLLOW_INCH_in_convertDistanceUnit609); if (state.failed) return retval;
                     
                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = INCH50;
                    if ( state.backtracking==1 ) {
                      retval.r = 0.0254d;
                    }

                    if ( state.backtracking==1 ) {
                    retval.tree = (CommonTree)_first_0;
                    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                        retval.tree = (CommonTree)adaptor.getParent(retval.tree);}
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "convertDistanceUnit"

    public static class convertAltitude_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "convertAltitude"
    // flipsUnitConversion.g:136:1: convertAltitude : ^( DISTANCE FIXED Z x= convertDistance ) -> ^( DISTANCE FIXED Z ^( DISTANCE FloatingPointLiteral[String.valueOf(-x.r)] METER ) ) ;
    public final flipsUnitConversion.convertAltitude_return convertAltitude() throws RecognitionException {
        flipsUnitConversion.convertAltitude_return retval = new flipsUnitConversion.convertAltitude_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DISTANCE51=null;
        CommonTree FIXED52=null;
        CommonTree Z53=null;
        flipsUnitConversion.convertDistance_return x = null;


        CommonTree DISTANCE51_tree=null;
        CommonTree FIXED52_tree=null;
        CommonTree Z53_tree=null;
        RewriteRuleNodeStream stream_DISTANCE=new RewriteRuleNodeStream(adaptor,"token DISTANCE");
        RewriteRuleNodeStream stream_FIXED=new RewriteRuleNodeStream(adaptor,"token FIXED");
        RewriteRuleNodeStream stream_Z=new RewriteRuleNodeStream(adaptor,"token Z");
        RewriteRuleSubtreeStream stream_convertDistance=new RewriteRuleSubtreeStream(adaptor,"rule convertDistance");
        try {
            // flipsUnitConversion.g:137:2: ( ^( DISTANCE FIXED Z x= convertDistance ) -> ^( DISTANCE FIXED Z ^( DISTANCE FloatingPointLiteral[String.valueOf(-x.r)] METER ) ) )
            // flipsUnitConversion.g:137:4: ^( DISTANCE FIXED Z x= convertDistance )
            {
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            _last = (CommonTree)input.LT(1);
            DISTANCE51=(CommonTree)match(input,DISTANCE,FOLLOW_DISTANCE_in_convertAltitude626); if (state.failed) return retval; 
            if ( state.backtracking==1 ) stream_DISTANCE.add(DISTANCE51);


            if ( state.backtracking==1 )
            if ( _first_0==null ) _first_0 = DISTANCE51;
            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            FIXED52=(CommonTree)match(input,FIXED,FOLLOW_FIXED_in_convertAltitude628); if (state.failed) return retval; 
            if ( state.backtracking==1 ) stream_FIXED.add(FIXED52);

            _last = (CommonTree)input.LT(1);
            Z53=(CommonTree)match(input,Z,FOLLOW_Z_in_convertAltitude630); if (state.failed) return retval; 
            if ( state.backtracking==1 ) stream_Z.add(Z53);

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_convertDistance_in_convertAltitude634);
            x=convertDistance();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==1 ) stream_convertDistance.add(x.getTree());

            match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_1;
            }



            // AST REWRITE
            // elements: DISTANCE, Z, FIXED, DISTANCE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==1 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 138:2: -> ^( DISTANCE FIXED Z ^( DISTANCE FloatingPointLiteral[String.valueOf(-x.r)] METER ) )
            {
                // flipsUnitConversion.g:138:5: ^( DISTANCE FIXED Z ^( DISTANCE FloatingPointLiteral[String.valueOf(-x.r)] METER ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_DISTANCE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_FIXED.nextNode());
                adaptor.addChild(root_1, stream_Z.nextNode());
                // flipsUnitConversion.g:138:24: ^( DISTANCE FloatingPointLiteral[String.valueOf(-x.r)] METER )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_DISTANCE.nextNode(), root_2);

                adaptor.addChild(root_2, (CommonTree)adaptor.create(FloatingPointLiteral, String.valueOf(-x.r)));
                adaptor.addChild(root_2, (CommonTree)adaptor.create(METER, "METER"));

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            input.replaceChildren(adaptor.getParent(retval.start),
                                  adaptor.getChildIndex(retval.start),
                                  adaptor.getChildIndex(_last),
                                  retval.tree);}
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "convertAltitude"

    public static class convertRelativeDistance_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "convertRelativeDistance"
    // flipsUnitConversion.g:142:1: convertRelativeDistance : ( ^( DISTANCE RELATIVE X FORWARD x= convertDistance ) -> ^( DISTANCE RELATIVE X ^( DISTANCE FloatingPointLiteral[String.valueOf(x.r)] METER ) ) | ^( DISTANCE RELATIVE X BACKWARD x= convertDistance ) -> ^( DISTANCE RELATIVE X ^( DISTANCE FloatingPointLiteral[String.valueOf(-x.r)] METER ) ) | ^( DISTANCE RELATIVE Y LEFT x= convertDistance ) -> ^( DISTANCE RELATIVE Y ^( DISTANCE FloatingPointLiteral[String.valueOf(-x.r)] METER ) ) | ^( DISTANCE RELATIVE Y RIGHT x= convertDistance ) -> ^( DISTANCE RELATIVE Y ^( DISTANCE FloatingPointLiteral[String.valueOf(x.r)] METER ) ) );
    public final flipsUnitConversion.convertRelativeDistance_return convertRelativeDistance() throws RecognitionException {
        flipsUnitConversion.convertRelativeDistance_return retval = new flipsUnitConversion.convertRelativeDistance_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DISTANCE54=null;
        CommonTree RELATIVE55=null;
        CommonTree X56=null;
        CommonTree FORWARD57=null;
        CommonTree DISTANCE58=null;
        CommonTree RELATIVE59=null;
        CommonTree X60=null;
        CommonTree BACKWARD61=null;
        CommonTree DISTANCE62=null;
        CommonTree RELATIVE63=null;
        CommonTree Y64=null;
        CommonTree LEFT65=null;
        CommonTree DISTANCE66=null;
        CommonTree RELATIVE67=null;
        CommonTree Y68=null;
        CommonTree RIGHT69=null;
        flipsUnitConversion.convertDistance_return x = null;


        CommonTree DISTANCE54_tree=null;
        CommonTree RELATIVE55_tree=null;
        CommonTree X56_tree=null;
        CommonTree FORWARD57_tree=null;
        CommonTree DISTANCE58_tree=null;
        CommonTree RELATIVE59_tree=null;
        CommonTree X60_tree=null;
        CommonTree BACKWARD61_tree=null;
        CommonTree DISTANCE62_tree=null;
        CommonTree RELATIVE63_tree=null;
        CommonTree Y64_tree=null;
        CommonTree LEFT65_tree=null;
        CommonTree DISTANCE66_tree=null;
        CommonTree RELATIVE67_tree=null;
        CommonTree Y68_tree=null;
        CommonTree RIGHT69_tree=null;
        RewriteRuleNodeStream stream_DISTANCE=new RewriteRuleNodeStream(adaptor,"token DISTANCE");
        RewriteRuleNodeStream stream_RIGHT=new RewriteRuleNodeStream(adaptor,"token RIGHT");
        RewriteRuleNodeStream stream_RELATIVE=new RewriteRuleNodeStream(adaptor,"token RELATIVE");
        RewriteRuleNodeStream stream_FORWARD=new RewriteRuleNodeStream(adaptor,"token FORWARD");
        RewriteRuleNodeStream stream_LEFT=new RewriteRuleNodeStream(adaptor,"token LEFT");
        RewriteRuleNodeStream stream_Y=new RewriteRuleNodeStream(adaptor,"token Y");
        RewriteRuleNodeStream stream_X=new RewriteRuleNodeStream(adaptor,"token X");
        RewriteRuleNodeStream stream_BACKWARD=new RewriteRuleNodeStream(adaptor,"token BACKWARD");
        RewriteRuleSubtreeStream stream_convertDistance=new RewriteRuleSubtreeStream(adaptor,"rule convertDistance");
        try {
            // flipsUnitConversion.g:143:2: ( ^( DISTANCE RELATIVE X FORWARD x= convertDistance ) -> ^( DISTANCE RELATIVE X ^( DISTANCE FloatingPointLiteral[String.valueOf(x.r)] METER ) ) | ^( DISTANCE RELATIVE X BACKWARD x= convertDistance ) -> ^( DISTANCE RELATIVE X ^( DISTANCE FloatingPointLiteral[String.valueOf(-x.r)] METER ) ) | ^( DISTANCE RELATIVE Y LEFT x= convertDistance ) -> ^( DISTANCE RELATIVE Y ^( DISTANCE FloatingPointLiteral[String.valueOf(-x.r)] METER ) ) | ^( DISTANCE RELATIVE Y RIGHT x= convertDistance ) -> ^( DISTANCE RELATIVE Y ^( DISTANCE FloatingPointLiteral[String.valueOf(x.r)] METER ) ) )
            int alt5=4;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // flipsUnitConversion.g:143:4: ^( DISTANCE RELATIVE X FORWARD x= convertDistance )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    _last = (CommonTree)input.LT(1);
                    DISTANCE54=(CommonTree)match(input,DISTANCE,FOLLOW_DISTANCE_in_convertRelativeDistance668); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_DISTANCE.add(DISTANCE54);


                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = DISTANCE54;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    RELATIVE55=(CommonTree)match(input,RELATIVE,FOLLOW_RELATIVE_in_convertRelativeDistance670); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_RELATIVE.add(RELATIVE55);

                    _last = (CommonTree)input.LT(1);
                    X56=(CommonTree)match(input,X,FOLLOW_X_in_convertRelativeDistance672); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_X.add(X56);

                    _last = (CommonTree)input.LT(1);
                    FORWARD57=(CommonTree)match(input,FORWARD,FOLLOW_FORWARD_in_convertRelativeDistance674); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_FORWARD.add(FORWARD57);

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_convertDistance_in_convertRelativeDistance678);
                    x=convertDistance();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) stream_convertDistance.add(x.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: X, DISTANCE, RELATIVE, DISTANCE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 144:2: -> ^( DISTANCE RELATIVE X ^( DISTANCE FloatingPointLiteral[String.valueOf(x.r)] METER ) )
                    {
                        // flipsUnitConversion.g:144:5: ^( DISTANCE RELATIVE X ^( DISTANCE FloatingPointLiteral[String.valueOf(x.r)] METER ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_DISTANCE.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_RELATIVE.nextNode());
                        adaptor.addChild(root_1, stream_X.nextNode());
                        // flipsUnitConversion.g:144:27: ^( DISTANCE FloatingPointLiteral[String.valueOf(x.r)] METER )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(stream_DISTANCE.nextNode(), root_2);

                        adaptor.addChild(root_2, (CommonTree)adaptor.create(FloatingPointLiteral, String.valueOf(x.r)));
                        adaptor.addChild(root_2, (CommonTree)adaptor.create(METER, "METER"));

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);}
                    }
                    break;
                case 2 :
                    // flipsUnitConversion.g:145:4: ^( DISTANCE RELATIVE X BACKWARD x= convertDistance )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    _last = (CommonTree)input.LT(1);
                    DISTANCE58=(CommonTree)match(input,DISTANCE,FOLLOW_DISTANCE_in_convertRelativeDistance705); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_DISTANCE.add(DISTANCE58);


                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = DISTANCE58;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    RELATIVE59=(CommonTree)match(input,RELATIVE,FOLLOW_RELATIVE_in_convertRelativeDistance707); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_RELATIVE.add(RELATIVE59);

                    _last = (CommonTree)input.LT(1);
                    X60=(CommonTree)match(input,X,FOLLOW_X_in_convertRelativeDistance709); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_X.add(X60);

                    _last = (CommonTree)input.LT(1);
                    BACKWARD61=(CommonTree)match(input,BACKWARD,FOLLOW_BACKWARD_in_convertRelativeDistance711); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_BACKWARD.add(BACKWARD61);

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_convertDistance_in_convertRelativeDistance715);
                    x=convertDistance();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) stream_convertDistance.add(x.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: X, RELATIVE, DISTANCE, DISTANCE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 146:2: -> ^( DISTANCE RELATIVE X ^( DISTANCE FloatingPointLiteral[String.valueOf(-x.r)] METER ) )
                    {
                        // flipsUnitConversion.g:146:5: ^( DISTANCE RELATIVE X ^( DISTANCE FloatingPointLiteral[String.valueOf(-x.r)] METER ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_DISTANCE.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_RELATIVE.nextNode());
                        adaptor.addChild(root_1, stream_X.nextNode());
                        // flipsUnitConversion.g:146:27: ^( DISTANCE FloatingPointLiteral[String.valueOf(-x.r)] METER )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(stream_DISTANCE.nextNode(), root_2);

                        adaptor.addChild(root_2, (CommonTree)adaptor.create(FloatingPointLiteral, String.valueOf(-x.r)));
                        adaptor.addChild(root_2, (CommonTree)adaptor.create(METER, "METER"));

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);}
                    }
                    break;
                case 3 :
                    // flipsUnitConversion.g:147:4: ^( DISTANCE RELATIVE Y LEFT x= convertDistance )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    _last = (CommonTree)input.LT(1);
                    DISTANCE62=(CommonTree)match(input,DISTANCE,FOLLOW_DISTANCE_in_convertRelativeDistance742); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_DISTANCE.add(DISTANCE62);


                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = DISTANCE62;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    RELATIVE63=(CommonTree)match(input,RELATIVE,FOLLOW_RELATIVE_in_convertRelativeDistance744); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_RELATIVE.add(RELATIVE63);

                    _last = (CommonTree)input.LT(1);
                    Y64=(CommonTree)match(input,Y,FOLLOW_Y_in_convertRelativeDistance746); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_Y.add(Y64);

                    _last = (CommonTree)input.LT(1);
                    LEFT65=(CommonTree)match(input,LEFT,FOLLOW_LEFT_in_convertRelativeDistance748); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_LEFT.add(LEFT65);

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_convertDistance_in_convertRelativeDistance752);
                    x=convertDistance();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) stream_convertDistance.add(x.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: DISTANCE, Y, DISTANCE, RELATIVE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 148:2: -> ^( DISTANCE RELATIVE Y ^( DISTANCE FloatingPointLiteral[String.valueOf(-x.r)] METER ) )
                    {
                        // flipsUnitConversion.g:148:5: ^( DISTANCE RELATIVE Y ^( DISTANCE FloatingPointLiteral[String.valueOf(-x.r)] METER ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_DISTANCE.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_RELATIVE.nextNode());
                        adaptor.addChild(root_1, stream_Y.nextNode());
                        // flipsUnitConversion.g:148:27: ^( DISTANCE FloatingPointLiteral[String.valueOf(-x.r)] METER )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(stream_DISTANCE.nextNode(), root_2);

                        adaptor.addChild(root_2, (CommonTree)adaptor.create(FloatingPointLiteral, String.valueOf(-x.r)));
                        adaptor.addChild(root_2, (CommonTree)adaptor.create(METER, "METER"));

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);}
                    }
                    break;
                case 4 :
                    // flipsUnitConversion.g:149:4: ^( DISTANCE RELATIVE Y RIGHT x= convertDistance )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    _last = (CommonTree)input.LT(1);
                    DISTANCE66=(CommonTree)match(input,DISTANCE,FOLLOW_DISTANCE_in_convertRelativeDistance779); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_DISTANCE.add(DISTANCE66);


                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = DISTANCE66;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    RELATIVE67=(CommonTree)match(input,RELATIVE,FOLLOW_RELATIVE_in_convertRelativeDistance781); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_RELATIVE.add(RELATIVE67);

                    _last = (CommonTree)input.LT(1);
                    Y68=(CommonTree)match(input,Y,FOLLOW_Y_in_convertRelativeDistance783); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_Y.add(Y68);

                    _last = (CommonTree)input.LT(1);
                    RIGHT69=(CommonTree)match(input,RIGHT,FOLLOW_RIGHT_in_convertRelativeDistance785); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_RIGHT.add(RIGHT69);

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_convertDistance_in_convertRelativeDistance789);
                    x=convertDistance();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) stream_convertDistance.add(x.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: Y, RELATIVE, DISTANCE, DISTANCE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 150:2: -> ^( DISTANCE RELATIVE Y ^( DISTANCE FloatingPointLiteral[String.valueOf(x.r)] METER ) )
                    {
                        // flipsUnitConversion.g:150:5: ^( DISTANCE RELATIVE Y ^( DISTANCE FloatingPointLiteral[String.valueOf(x.r)] METER ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_DISTANCE.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_RELATIVE.nextNode());
                        adaptor.addChild(root_1, stream_Y.nextNode());
                        // flipsUnitConversion.g:150:27: ^( DISTANCE FloatingPointLiteral[String.valueOf(x.r)] METER )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(stream_DISTANCE.nextNode(), root_2);

                        adaptor.addChild(root_2, (CommonTree)adaptor.create(FloatingPointLiteral, String.valueOf(x.r)));
                        adaptor.addChild(root_2, (CommonTree)adaptor.create(METER, "METER"));

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);}
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "convertRelativeDistance"

    public static class convertRelativeAltitude_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "convertRelativeAltitude"
    // flipsUnitConversion.g:154:1: convertRelativeAltitude : ( ^( DISTANCE RELATIVE Z CLIMB x= convertDistance ) -> ^( DISTANCE RELATIVE Z ^( DISTANCE FloatingPointLiteral[String.valueOf(-x.r)] METER ) ) | ^( DISTANCE RELATIVE Z DESCEND x= convertDistance ) -> ^( DISTANCE RELATIVE Z ^( DISTANCE FloatingPointLiteral[String.valueOf(x.r)] METER ) ) | ^( DISTANCE RELATIVE Z CLIMB y= convertPressure ) -> ^( DISTANCE RELATIVE Z ^( PRESSURE FloatingPointLiteral[String.valueOf(-y.r)] PASCAL ) ) | ^( DISTANCE RELATIVE Z DESCEND y= convertPressure ) -> ^( DISTANCE RELATIVE Z ^( PRESSURE FloatingPointLiteral[String.valueOf(y.r)] PASCAL ) ) );
    public final flipsUnitConversion.convertRelativeAltitude_return convertRelativeAltitude() throws RecognitionException {
        flipsUnitConversion.convertRelativeAltitude_return retval = new flipsUnitConversion.convertRelativeAltitude_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DISTANCE70=null;
        CommonTree RELATIVE71=null;
        CommonTree Z72=null;
        CommonTree CLIMB73=null;
        CommonTree DISTANCE74=null;
        CommonTree RELATIVE75=null;
        CommonTree Z76=null;
        CommonTree DESCEND77=null;
        CommonTree DISTANCE78=null;
        CommonTree RELATIVE79=null;
        CommonTree Z80=null;
        CommonTree CLIMB81=null;
        CommonTree DISTANCE82=null;
        CommonTree RELATIVE83=null;
        CommonTree Z84=null;
        CommonTree DESCEND85=null;
        flipsUnitConversion.convertDistance_return x = null;

        flipsUnitConversion.convertPressure_return y = null;


        CommonTree DISTANCE70_tree=null;
        CommonTree RELATIVE71_tree=null;
        CommonTree Z72_tree=null;
        CommonTree CLIMB73_tree=null;
        CommonTree DISTANCE74_tree=null;
        CommonTree RELATIVE75_tree=null;
        CommonTree Z76_tree=null;
        CommonTree DESCEND77_tree=null;
        CommonTree DISTANCE78_tree=null;
        CommonTree RELATIVE79_tree=null;
        CommonTree Z80_tree=null;
        CommonTree CLIMB81_tree=null;
        CommonTree DISTANCE82_tree=null;
        CommonTree RELATIVE83_tree=null;
        CommonTree Z84_tree=null;
        CommonTree DESCEND85_tree=null;
        RewriteRuleNodeStream stream_DISTANCE=new RewriteRuleNodeStream(adaptor,"token DISTANCE");
        RewriteRuleNodeStream stream_RELATIVE=new RewriteRuleNodeStream(adaptor,"token RELATIVE");
        RewriteRuleNodeStream stream_CLIMB=new RewriteRuleNodeStream(adaptor,"token CLIMB");
        RewriteRuleNodeStream stream_DESCEND=new RewriteRuleNodeStream(adaptor,"token DESCEND");
        RewriteRuleNodeStream stream_Z=new RewriteRuleNodeStream(adaptor,"token Z");
        RewriteRuleSubtreeStream stream_convertDistance=new RewriteRuleSubtreeStream(adaptor,"rule convertDistance");
        RewriteRuleSubtreeStream stream_convertPressure=new RewriteRuleSubtreeStream(adaptor,"rule convertPressure");
        try {
            // flipsUnitConversion.g:155:2: ( ^( DISTANCE RELATIVE Z CLIMB x= convertDistance ) -> ^( DISTANCE RELATIVE Z ^( DISTANCE FloatingPointLiteral[String.valueOf(-x.r)] METER ) ) | ^( DISTANCE RELATIVE Z DESCEND x= convertDistance ) -> ^( DISTANCE RELATIVE Z ^( DISTANCE FloatingPointLiteral[String.valueOf(x.r)] METER ) ) | ^( DISTANCE RELATIVE Z CLIMB y= convertPressure ) -> ^( DISTANCE RELATIVE Z ^( PRESSURE FloatingPointLiteral[String.valueOf(-y.r)] PASCAL ) ) | ^( DISTANCE RELATIVE Z DESCEND y= convertPressure ) -> ^( DISTANCE RELATIVE Z ^( PRESSURE FloatingPointLiteral[String.valueOf(y.r)] PASCAL ) ) )
            int alt6=4;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // flipsUnitConversion.g:155:4: ^( DISTANCE RELATIVE Z CLIMB x= convertDistance )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    _last = (CommonTree)input.LT(1);
                    DISTANCE70=(CommonTree)match(input,DISTANCE,FOLLOW_DISTANCE_in_convertRelativeAltitude823); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_DISTANCE.add(DISTANCE70);


                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = DISTANCE70;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    RELATIVE71=(CommonTree)match(input,RELATIVE,FOLLOW_RELATIVE_in_convertRelativeAltitude825); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_RELATIVE.add(RELATIVE71);

                    _last = (CommonTree)input.LT(1);
                    Z72=(CommonTree)match(input,Z,FOLLOW_Z_in_convertRelativeAltitude827); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_Z.add(Z72);

                    _last = (CommonTree)input.LT(1);
                    CLIMB73=(CommonTree)match(input,CLIMB,FOLLOW_CLIMB_in_convertRelativeAltitude829); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_CLIMB.add(CLIMB73);

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_convertDistance_in_convertRelativeAltitude833);
                    x=convertDistance();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) stream_convertDistance.add(x.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: DISTANCE, Z, DISTANCE, RELATIVE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 156:2: -> ^( DISTANCE RELATIVE Z ^( DISTANCE FloatingPointLiteral[String.valueOf(-x.r)] METER ) )
                    {
                        // flipsUnitConversion.g:156:5: ^( DISTANCE RELATIVE Z ^( DISTANCE FloatingPointLiteral[String.valueOf(-x.r)] METER ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_DISTANCE.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_RELATIVE.nextNode());
                        adaptor.addChild(root_1, stream_Z.nextNode());
                        // flipsUnitConversion.g:156:27: ^( DISTANCE FloatingPointLiteral[String.valueOf(-x.r)] METER )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(stream_DISTANCE.nextNode(), root_2);

                        adaptor.addChild(root_2, (CommonTree)adaptor.create(FloatingPointLiteral, String.valueOf(-x.r)));
                        adaptor.addChild(root_2, (CommonTree)adaptor.create(METER, "METER"));

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);}
                    }
                    break;
                case 2 :
                    // flipsUnitConversion.g:157:4: ^( DISTANCE RELATIVE Z DESCEND x= convertDistance )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    _last = (CommonTree)input.LT(1);
                    DISTANCE74=(CommonTree)match(input,DISTANCE,FOLLOW_DISTANCE_in_convertRelativeAltitude860); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_DISTANCE.add(DISTANCE74);


                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = DISTANCE74;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    RELATIVE75=(CommonTree)match(input,RELATIVE,FOLLOW_RELATIVE_in_convertRelativeAltitude862); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_RELATIVE.add(RELATIVE75);

                    _last = (CommonTree)input.LT(1);
                    Z76=(CommonTree)match(input,Z,FOLLOW_Z_in_convertRelativeAltitude864); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_Z.add(Z76);

                    _last = (CommonTree)input.LT(1);
                    DESCEND77=(CommonTree)match(input,DESCEND,FOLLOW_DESCEND_in_convertRelativeAltitude866); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_DESCEND.add(DESCEND77);

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_convertDistance_in_convertRelativeAltitude870);
                    x=convertDistance();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) stream_convertDistance.add(x.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: DISTANCE, Z, RELATIVE, DISTANCE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 158:2: -> ^( DISTANCE RELATIVE Z ^( DISTANCE FloatingPointLiteral[String.valueOf(x.r)] METER ) )
                    {
                        // flipsUnitConversion.g:158:5: ^( DISTANCE RELATIVE Z ^( DISTANCE FloatingPointLiteral[String.valueOf(x.r)] METER ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_DISTANCE.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_RELATIVE.nextNode());
                        adaptor.addChild(root_1, stream_Z.nextNode());
                        // flipsUnitConversion.g:158:27: ^( DISTANCE FloatingPointLiteral[String.valueOf(x.r)] METER )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(stream_DISTANCE.nextNode(), root_2);

                        adaptor.addChild(root_2, (CommonTree)adaptor.create(FloatingPointLiteral, String.valueOf(x.r)));
                        adaptor.addChild(root_2, (CommonTree)adaptor.create(METER, "METER"));

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);}
                    }
                    break;
                case 3 :
                    // flipsUnitConversion.g:159:4: ^( DISTANCE RELATIVE Z CLIMB y= convertPressure )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    _last = (CommonTree)input.LT(1);
                    DISTANCE78=(CommonTree)match(input,DISTANCE,FOLLOW_DISTANCE_in_convertRelativeAltitude897); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_DISTANCE.add(DISTANCE78);


                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = DISTANCE78;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    RELATIVE79=(CommonTree)match(input,RELATIVE,FOLLOW_RELATIVE_in_convertRelativeAltitude899); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_RELATIVE.add(RELATIVE79);

                    _last = (CommonTree)input.LT(1);
                    Z80=(CommonTree)match(input,Z,FOLLOW_Z_in_convertRelativeAltitude901); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_Z.add(Z80);

                    _last = (CommonTree)input.LT(1);
                    CLIMB81=(CommonTree)match(input,CLIMB,FOLLOW_CLIMB_in_convertRelativeAltitude903); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_CLIMB.add(CLIMB81);

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_convertPressure_in_convertRelativeAltitude907);
                    y=convertPressure();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) stream_convertPressure.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: Z, DISTANCE, RELATIVE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 160:2: -> ^( DISTANCE RELATIVE Z ^( PRESSURE FloatingPointLiteral[String.valueOf(-y.r)] PASCAL ) )
                    {
                        // flipsUnitConversion.g:160:5: ^( DISTANCE RELATIVE Z ^( PRESSURE FloatingPointLiteral[String.valueOf(-y.r)] PASCAL ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_DISTANCE.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_RELATIVE.nextNode());
                        adaptor.addChild(root_1, stream_Z.nextNode());
                        // flipsUnitConversion.g:160:27: ^( PRESSURE FloatingPointLiteral[String.valueOf(-y.r)] PASCAL )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PRESSURE, "PRESSURE"), root_2);

                        adaptor.addChild(root_2, (CommonTree)adaptor.create(FloatingPointLiteral, String.valueOf(-y.r)));
                        adaptor.addChild(root_2, (CommonTree)adaptor.create(PASCAL, "PASCAL"));

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);}
                    }
                    break;
                case 4 :
                    // flipsUnitConversion.g:161:4: ^( DISTANCE RELATIVE Z DESCEND y= convertPressure )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    _last = (CommonTree)input.LT(1);
                    DISTANCE82=(CommonTree)match(input,DISTANCE,FOLLOW_DISTANCE_in_convertRelativeAltitude934); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_DISTANCE.add(DISTANCE82);


                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = DISTANCE82;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    RELATIVE83=(CommonTree)match(input,RELATIVE,FOLLOW_RELATIVE_in_convertRelativeAltitude936); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_RELATIVE.add(RELATIVE83);

                    _last = (CommonTree)input.LT(1);
                    Z84=(CommonTree)match(input,Z,FOLLOW_Z_in_convertRelativeAltitude938); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_Z.add(Z84);

                    _last = (CommonTree)input.LT(1);
                    DESCEND85=(CommonTree)match(input,DESCEND,FOLLOW_DESCEND_in_convertRelativeAltitude940); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_DESCEND.add(DESCEND85);

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_convertPressure_in_convertRelativeAltitude944);
                    y=convertPressure();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) stream_convertPressure.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: Z, RELATIVE, DISTANCE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 162:2: -> ^( DISTANCE RELATIVE Z ^( PRESSURE FloatingPointLiteral[String.valueOf(y.r)] PASCAL ) )
                    {
                        // flipsUnitConversion.g:162:5: ^( DISTANCE RELATIVE Z ^( PRESSURE FloatingPointLiteral[String.valueOf(y.r)] PASCAL ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_DISTANCE.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_RELATIVE.nextNode());
                        adaptor.addChild(root_1, stream_Z.nextNode());
                        // flipsUnitConversion.g:162:27: ^( PRESSURE FloatingPointLiteral[String.valueOf(y.r)] PASCAL )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PRESSURE, "PRESSURE"), root_2);

                        adaptor.addChild(root_2, (CommonTree)adaptor.create(FloatingPointLiteral, String.valueOf(y.r)));
                        adaptor.addChild(root_2, (CommonTree)adaptor.create(PASCAL, "PASCAL"));

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);}
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "convertRelativeAltitude"

    public static class convertFlightLevel_return extends TreeRuleReturnScope {
        public double r;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "convertFlightLevel"
    // flipsUnitConversion.g:166:1: convertFlightLevel returns [double r] : ^( FLIGHTLEVEL x= FlightLevel ) -> ^( DISTANCE FloatingPointLiteral[String.valueOf(-$r)] METER ) ;
    public final flipsUnitConversion.convertFlightLevel_return convertFlightLevel() throws RecognitionException {
        flipsUnitConversion.convertFlightLevel_return retval = new flipsUnitConversion.convertFlightLevel_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree x=null;
        CommonTree FLIGHTLEVEL86=null;

        CommonTree x_tree=null;
        CommonTree FLIGHTLEVEL86_tree=null;
        RewriteRuleNodeStream stream_FLIGHTLEVEL=new RewriteRuleNodeStream(adaptor,"token FLIGHTLEVEL");
        RewriteRuleNodeStream stream_FlightLevel=new RewriteRuleNodeStream(adaptor,"token FlightLevel");

        try {
            // flipsUnitConversion.g:167:2: ( ^( FLIGHTLEVEL x= FlightLevel ) -> ^( DISTANCE FloatingPointLiteral[String.valueOf(-$r)] METER ) )
            // flipsUnitConversion.g:167:4: ^( FLIGHTLEVEL x= FlightLevel )
            {
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            _last = (CommonTree)input.LT(1);
            FLIGHTLEVEL86=(CommonTree)match(input,FLIGHTLEVEL,FOLLOW_FLIGHTLEVEL_in_convertFlightLevel982); if (state.failed) return retval; 
            if ( state.backtracking==1 ) stream_FLIGHTLEVEL.add(FLIGHTLEVEL86);


            if ( state.backtracking==1 )
            if ( _first_0==null ) _first_0 = FLIGHTLEVEL86;
            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            x=(CommonTree)match(input,FlightLevel,FOLLOW_FlightLevel_in_convertFlightLevel986); if (state.failed) return retval; 
            if ( state.backtracking==1 ) stream_FlightLevel.add(x);


            match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_1;
            }

            if ( state.backtracking==1 ) {

              		 String y = x.toString().replaceAll("fl","").replaceAll("ight level","").replaceAll(" ","");
              		 retval.r = Double.parseDouble(y) * 100d * 0.3048d;
              		
            }


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==1 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 172:2: -> ^( DISTANCE FloatingPointLiteral[String.valueOf(-$r)] METER )
            {
                // flipsUnitConversion.g:172:5: ^( DISTANCE FloatingPointLiteral[String.valueOf(-$r)] METER )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DISTANCE, "DISTANCE"), root_1);

                adaptor.addChild(root_1, (CommonTree)adaptor.create(FloatingPointLiteral, String.valueOf(-retval.r)));
                adaptor.addChild(root_1, (CommonTree)adaptor.create(METER, "METER"));

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            input.replaceChildren(adaptor.getParent(retval.start),
                                  adaptor.getChildIndex(retval.start),
                                  adaptor.getChildIndex(_last),
                                  retval.tree);}
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "convertFlightLevel"

    public static class convertPressure_return extends TreeRuleReturnScope {
        public double r;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "convertPressure"
    // flipsUnitConversion.g:176:1: convertPressure returns [double r] : ^( PRESSURE x= numericValue y= convertPressureUnit ) -> ^( PRESSURE FloatingPointLiteral[String.valueOf($r)] PASCAL ) ;
    public final flipsUnitConversion.convertPressure_return convertPressure() throws RecognitionException {
        flipsUnitConversion.convertPressure_return retval = new flipsUnitConversion.convertPressure_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree PRESSURE87=null;
        flipsUnitConversion.numericValue_return x = null;

        flipsUnitConversion.convertPressureUnit_return y = null;


        CommonTree PRESSURE87_tree=null;
        RewriteRuleNodeStream stream_PRESSURE=new RewriteRuleNodeStream(adaptor,"token PRESSURE");
        RewriteRuleSubtreeStream stream_convertPressureUnit=new RewriteRuleSubtreeStream(adaptor,"rule convertPressureUnit");
        RewriteRuleSubtreeStream stream_numericValue=new RewriteRuleSubtreeStream(adaptor,"rule numericValue");
        try {
            // flipsUnitConversion.g:177:2: ( ^( PRESSURE x= numericValue y= convertPressureUnit ) -> ^( PRESSURE FloatingPointLiteral[String.valueOf($r)] PASCAL ) )
            // flipsUnitConversion.g:177:4: ^( PRESSURE x= numericValue y= convertPressureUnit )
            {
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            _last = (CommonTree)input.LT(1);
            PRESSURE87=(CommonTree)match(input,PRESSURE,FOLLOW_PRESSURE_in_convertPressure1020); if (state.failed) return retval; 
            if ( state.backtracking==1 ) stream_PRESSURE.add(PRESSURE87);


            if ( state.backtracking==1 )
            if ( _first_0==null ) _first_0 = PRESSURE87;
            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_numericValue_in_convertPressure1024);
            x=numericValue();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==1 ) stream_numericValue.add(x.getTree());
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_convertPressureUnit_in_convertPressure1028);
            y=convertPressureUnit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==1 ) stream_convertPressureUnit.add(y.getTree());

            match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_1;
            }

            if ( state.backtracking==1 ) {
              retval.r = x.r * y.r;
            }


            // AST REWRITE
            // elements: PRESSURE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==1 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 179:2: -> ^( PRESSURE FloatingPointLiteral[String.valueOf($r)] PASCAL )
            {
                // flipsUnitConversion.g:179:5: ^( PRESSURE FloatingPointLiteral[String.valueOf($r)] PASCAL )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_PRESSURE.nextNode(), root_1);

                adaptor.addChild(root_1, (CommonTree)adaptor.create(FloatingPointLiteral, String.valueOf(retval.r)));
                adaptor.addChild(root_1, (CommonTree)adaptor.create(PASCAL, "PASCAL"));

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            input.replaceChildren(adaptor.getParent(retval.start),
                                  adaptor.getChildIndex(retval.start),
                                  adaptor.getChildIndex(_last),
                                  retval.tree);}
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "convertPressure"

    public static class convertPressureUnit_return extends TreeRuleReturnScope {
        public double r;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "convertPressureUnit"
    // flipsUnitConversion.g:183:1: convertPressureUnit returns [double r] : ( KILOPASCAL | HECTOPASCAL | PASCAL | BAR | MILLIBAR | ATMOSPHERE );
    public final flipsUnitConversion.convertPressureUnit_return convertPressureUnit() throws RecognitionException {
        flipsUnitConversion.convertPressureUnit_return retval = new flipsUnitConversion.convertPressureUnit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree KILOPASCAL88=null;
        CommonTree HECTOPASCAL89=null;
        CommonTree PASCAL90=null;
        CommonTree BAR91=null;
        CommonTree MILLIBAR92=null;
        CommonTree ATMOSPHERE93=null;

        CommonTree KILOPASCAL88_tree=null;
        CommonTree HECTOPASCAL89_tree=null;
        CommonTree PASCAL90_tree=null;
        CommonTree BAR91_tree=null;
        CommonTree MILLIBAR92_tree=null;
        CommonTree ATMOSPHERE93_tree=null;

        try {
            // flipsUnitConversion.g:184:2: ( KILOPASCAL | HECTOPASCAL | PASCAL | BAR | MILLIBAR | ATMOSPHERE )
            int alt7=6;
            switch ( input.LA(1) ) {
            case KILOPASCAL:
                {
                alt7=1;
                }
                break;
            case HECTOPASCAL:
                {
                alt7=2;
                }
                break;
            case PASCAL:
                {
                alt7=3;
                }
                break;
            case BAR:
                {
                alt7=4;
                }
                break;
            case MILLIBAR:
                {
                alt7=5;
                }
                break;
            case ATMOSPHERE:
                {
                alt7=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // flipsUnitConversion.g:184:4: KILOPASCAL
                    {
                    _last = (CommonTree)input.LT(1);
                    KILOPASCAL88=(CommonTree)match(input,KILOPASCAL,FOLLOW_KILOPASCAL_in_convertPressureUnit1061); if (state.failed) return retval;
                     
                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = KILOPASCAL88;
                    if ( state.backtracking==1 ) {
                      retval.r = 1000d;
                    }

                    if ( state.backtracking==1 ) {
                    retval.tree = (CommonTree)_first_0;
                    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                        retval.tree = (CommonTree)adaptor.getParent(retval.tree);}
                    }
                    break;
                case 2 :
                    // flipsUnitConversion.g:186:4: HECTOPASCAL
                    {
                    _last = (CommonTree)input.LT(1);
                    HECTOPASCAL89=(CommonTree)match(input,HECTOPASCAL,FOLLOW_HECTOPASCAL_in_convertPressureUnit1070); if (state.failed) return retval;
                     
                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = HECTOPASCAL89;
                    if ( state.backtracking==1 ) {
                      retval.r = 100d;
                    }

                    if ( state.backtracking==1 ) {
                    retval.tree = (CommonTree)_first_0;
                    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                        retval.tree = (CommonTree)adaptor.getParent(retval.tree);}
                    }
                    break;
                case 3 :
                    // flipsUnitConversion.g:188:4: PASCAL
                    {
                    _last = (CommonTree)input.LT(1);
                    PASCAL90=(CommonTree)match(input,PASCAL,FOLLOW_PASCAL_in_convertPressureUnit1079); if (state.failed) return retval;
                     
                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = PASCAL90;
                    if ( state.backtracking==1 ) {
                      retval.r = 1d;
                    }

                    if ( state.backtracking==1 ) {
                    retval.tree = (CommonTree)_first_0;
                    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                        retval.tree = (CommonTree)adaptor.getParent(retval.tree);}
                    }
                    break;
                case 4 :
                    // flipsUnitConversion.g:190:4: BAR
                    {
                    _last = (CommonTree)input.LT(1);
                    BAR91=(CommonTree)match(input,BAR,FOLLOW_BAR_in_convertPressureUnit1088); if (state.failed) return retval;
                     
                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = BAR91;
                    if ( state.backtracking==1 ) {
                      retval.r = 100000d;
                    }

                    if ( state.backtracking==1 ) {
                    retval.tree = (CommonTree)_first_0;
                    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                        retval.tree = (CommonTree)adaptor.getParent(retval.tree);}
                    }
                    break;
                case 5 :
                    // flipsUnitConversion.g:192:4: MILLIBAR
                    {
                    _last = (CommonTree)input.LT(1);
                    MILLIBAR92=(CommonTree)match(input,MILLIBAR,FOLLOW_MILLIBAR_in_convertPressureUnit1097); if (state.failed) return retval;
                     
                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = MILLIBAR92;
                    if ( state.backtracking==1 ) {
                      retval.r = 100d;
                    }

                    if ( state.backtracking==1 ) {
                    retval.tree = (CommonTree)_first_0;
                    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                        retval.tree = (CommonTree)adaptor.getParent(retval.tree);}
                    }
                    break;
                case 6 :
                    // flipsUnitConversion.g:194:4: ATMOSPHERE
                    {
                    _last = (CommonTree)input.LT(1);
                    ATMOSPHERE93=(CommonTree)match(input,ATMOSPHERE,FOLLOW_ATMOSPHERE_in_convertPressureUnit1106); if (state.failed) return retval;
                     
                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = ATMOSPHERE93;
                    if ( state.backtracking==1 ) {
                      retval.r = 101325d;
                    }

                    if ( state.backtracking==1 ) {
                    retval.tree = (CommonTree)_first_0;
                    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                        retval.tree = (CommonTree)adaptor.getParent(retval.tree);}
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "convertPressureUnit"

    public static class convertSpeed_return extends TreeRuleReturnScope {
        public double r;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "convertSpeed"
    // flipsUnitConversion.g:199:1: convertSpeed returns [double r] : ^( SPEED x= numericValue y= convertDistanceUnit z= convertTimeUnit ) -> ^( SPEED FloatingPointLiteral[String.valueOf($r)] METER SECOND ) ;
    public final flipsUnitConversion.convertSpeed_return convertSpeed() throws RecognitionException {
        flipsUnitConversion.convertSpeed_return retval = new flipsUnitConversion.convertSpeed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SPEED94=null;
        flipsUnitConversion.numericValue_return x = null;

        flipsUnitConversion.convertDistanceUnit_return y = null;

        flipsUnitConversion.convertTimeUnit_return z = null;


        CommonTree SPEED94_tree=null;
        RewriteRuleNodeStream stream_SPEED=new RewriteRuleNodeStream(adaptor,"token SPEED");
        RewriteRuleSubtreeStream stream_convertTimeUnit=new RewriteRuleSubtreeStream(adaptor,"rule convertTimeUnit");
        RewriteRuleSubtreeStream stream_numericValue=new RewriteRuleSubtreeStream(adaptor,"rule numericValue");
        RewriteRuleSubtreeStream stream_convertDistanceUnit=new RewriteRuleSubtreeStream(adaptor,"rule convertDistanceUnit");
        try {
            // flipsUnitConversion.g:200:2: ( ^( SPEED x= numericValue y= convertDistanceUnit z= convertTimeUnit ) -> ^( SPEED FloatingPointLiteral[String.valueOf($r)] METER SECOND ) )
            // flipsUnitConversion.g:200:4: ^( SPEED x= numericValue y= convertDistanceUnit z= convertTimeUnit )
            {
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            _last = (CommonTree)input.LT(1);
            SPEED94=(CommonTree)match(input,SPEED,FOLLOW_SPEED_in_convertSpeed1127); if (state.failed) return retval; 
            if ( state.backtracking==1 ) stream_SPEED.add(SPEED94);


            if ( state.backtracking==1 )
            if ( _first_0==null ) _first_0 = SPEED94;
            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_numericValue_in_convertSpeed1131);
            x=numericValue();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==1 ) stream_numericValue.add(x.getTree());
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_convertDistanceUnit_in_convertSpeed1135);
            y=convertDistanceUnit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==1 ) stream_convertDistanceUnit.add(y.getTree());
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_convertTimeUnit_in_convertSpeed1139);
            z=convertTimeUnit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==1 ) stream_convertTimeUnit.add(z.getTree());

            match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_1;
            }

            if ( state.backtracking==1 ) {
              retval.r = x.r * y.r / z.r;
            }


            // AST REWRITE
            // elements: SPEED
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==1 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 202:2: -> ^( SPEED FloatingPointLiteral[String.valueOf($r)] METER SECOND )
            {
                // flipsUnitConversion.g:202:5: ^( SPEED FloatingPointLiteral[String.valueOf($r)] METER SECOND )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_SPEED.nextNode(), root_1);

                adaptor.addChild(root_1, (CommonTree)adaptor.create(FloatingPointLiteral, String.valueOf(retval.r)));
                adaptor.addChild(root_1, (CommonTree)adaptor.create(METER, "METER"));
                adaptor.addChild(root_1, (CommonTree)adaptor.create(SECOND, "SECOND"));

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            input.replaceChildren(adaptor.getParent(retval.start),
                                  adaptor.getChildIndex(retval.start),
                                  adaptor.getChildIndex(_last),
                                  retval.tree);}
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "convertSpeed"

    public static class convertRelativeSpeed_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "convertRelativeSpeed"
    // flipsUnitConversion.g:206:1: convertRelativeSpeed : ( ^( SPEED RELATIVE FASTER x= convertSpeed ) -> ^( SPEED RELATIVE ^( SPEED FloatingPointLiteral[String.valueOf(x.r)] METER SECOND ) ) | ^( SPEED RELATIVE SLOWER x= convertSpeed ) -> ^( SPEED RELATIVE ^( SPEED FloatingPointLiteral[String.valueOf(-x.r)] METER SECOND ) ) | ^( SPEED RELATIVE FASTER ^( SPEED y= percentValue ) ) -> ^( SPEED RELATIVE ^( SPEED FloatingPointLiteral[String.valueOf(y.r)] PERCENT ) ) | ^( SPEED RELATIVE SLOWER ^( SPEED y= percentValue ) ) -> ^( SPEED RELATIVE ^( SPEED FloatingPointLiteral[String.valueOf(-y.r)] PERCENT ) ) );
    public final flipsUnitConversion.convertRelativeSpeed_return convertRelativeSpeed() throws RecognitionException {
        flipsUnitConversion.convertRelativeSpeed_return retval = new flipsUnitConversion.convertRelativeSpeed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SPEED95=null;
        CommonTree RELATIVE96=null;
        CommonTree FASTER97=null;
        CommonTree SPEED98=null;
        CommonTree RELATIVE99=null;
        CommonTree SLOWER100=null;
        CommonTree SPEED101=null;
        CommonTree RELATIVE102=null;
        CommonTree FASTER103=null;
        CommonTree SPEED104=null;
        CommonTree SPEED105=null;
        CommonTree RELATIVE106=null;
        CommonTree SLOWER107=null;
        CommonTree SPEED108=null;
        flipsUnitConversion.convertSpeed_return x = null;

        flipsUnitConversion.percentValue_return y = null;


        CommonTree SPEED95_tree=null;
        CommonTree RELATIVE96_tree=null;
        CommonTree FASTER97_tree=null;
        CommonTree SPEED98_tree=null;
        CommonTree RELATIVE99_tree=null;
        CommonTree SLOWER100_tree=null;
        CommonTree SPEED101_tree=null;
        CommonTree RELATIVE102_tree=null;
        CommonTree FASTER103_tree=null;
        CommonTree SPEED104_tree=null;
        CommonTree SPEED105_tree=null;
        CommonTree RELATIVE106_tree=null;
        CommonTree SLOWER107_tree=null;
        CommonTree SPEED108_tree=null;
        RewriteRuleNodeStream stream_FASTER=new RewriteRuleNodeStream(adaptor,"token FASTER");
        RewriteRuleNodeStream stream_RELATIVE=new RewriteRuleNodeStream(adaptor,"token RELATIVE");
        RewriteRuleNodeStream stream_SLOWER=new RewriteRuleNodeStream(adaptor,"token SLOWER");
        RewriteRuleNodeStream stream_SPEED=new RewriteRuleNodeStream(adaptor,"token SPEED");
        RewriteRuleSubtreeStream stream_percentValue=new RewriteRuleSubtreeStream(adaptor,"rule percentValue");
        RewriteRuleSubtreeStream stream_convertSpeed=new RewriteRuleSubtreeStream(adaptor,"rule convertSpeed");
        try {
            // flipsUnitConversion.g:207:2: ( ^( SPEED RELATIVE FASTER x= convertSpeed ) -> ^( SPEED RELATIVE ^( SPEED FloatingPointLiteral[String.valueOf(x.r)] METER SECOND ) ) | ^( SPEED RELATIVE SLOWER x= convertSpeed ) -> ^( SPEED RELATIVE ^( SPEED FloatingPointLiteral[String.valueOf(-x.r)] METER SECOND ) ) | ^( SPEED RELATIVE FASTER ^( SPEED y= percentValue ) ) -> ^( SPEED RELATIVE ^( SPEED FloatingPointLiteral[String.valueOf(y.r)] PERCENT ) ) | ^( SPEED RELATIVE SLOWER ^( SPEED y= percentValue ) ) -> ^( SPEED RELATIVE ^( SPEED FloatingPointLiteral[String.valueOf(-y.r)] PERCENT ) ) )
            int alt8=4;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // flipsUnitConversion.g:207:4: ^( SPEED RELATIVE FASTER x= convertSpeed )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    _last = (CommonTree)input.LT(1);
                    SPEED95=(CommonTree)match(input,SPEED,FOLLOW_SPEED_in_convertRelativeSpeed1171); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_SPEED.add(SPEED95);


                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = SPEED95;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    RELATIVE96=(CommonTree)match(input,RELATIVE,FOLLOW_RELATIVE_in_convertRelativeSpeed1173); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_RELATIVE.add(RELATIVE96);

                    _last = (CommonTree)input.LT(1);
                    FASTER97=(CommonTree)match(input,FASTER,FOLLOW_FASTER_in_convertRelativeSpeed1175); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_FASTER.add(FASTER97);

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_convertSpeed_in_convertRelativeSpeed1179);
                    x=convertSpeed();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) stream_convertSpeed.add(x.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: SPEED, SPEED, RELATIVE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 208:2: -> ^( SPEED RELATIVE ^( SPEED FloatingPointLiteral[String.valueOf(x.r)] METER SECOND ) )
                    {
                        // flipsUnitConversion.g:208:5: ^( SPEED RELATIVE ^( SPEED FloatingPointLiteral[String.valueOf(x.r)] METER SECOND ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_SPEED.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_RELATIVE.nextNode());
                        // flipsUnitConversion.g:208:22: ^( SPEED FloatingPointLiteral[String.valueOf(x.r)] METER SECOND )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(stream_SPEED.nextNode(), root_2);

                        adaptor.addChild(root_2, (CommonTree)adaptor.create(FloatingPointLiteral, String.valueOf(x.r)));
                        adaptor.addChild(root_2, (CommonTree)adaptor.create(METER, "METER"));
                        adaptor.addChild(root_2, (CommonTree)adaptor.create(SECOND, "SECOND"));

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);}
                    }
                    break;
                case 2 :
                    // flipsUnitConversion.g:209:4: ^( SPEED RELATIVE SLOWER x= convertSpeed )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    _last = (CommonTree)input.LT(1);
                    SPEED98=(CommonTree)match(input,SPEED,FOLLOW_SPEED_in_convertRelativeSpeed1206); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_SPEED.add(SPEED98);


                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = SPEED98;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    RELATIVE99=(CommonTree)match(input,RELATIVE,FOLLOW_RELATIVE_in_convertRelativeSpeed1208); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_RELATIVE.add(RELATIVE99);

                    _last = (CommonTree)input.LT(1);
                    SLOWER100=(CommonTree)match(input,SLOWER,FOLLOW_SLOWER_in_convertRelativeSpeed1210); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_SLOWER.add(SLOWER100);

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_convertSpeed_in_convertRelativeSpeed1214);
                    x=convertSpeed();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) stream_convertSpeed.add(x.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: SPEED, RELATIVE, SPEED
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 210:2: -> ^( SPEED RELATIVE ^( SPEED FloatingPointLiteral[String.valueOf(-x.r)] METER SECOND ) )
                    {
                        // flipsUnitConversion.g:210:5: ^( SPEED RELATIVE ^( SPEED FloatingPointLiteral[String.valueOf(-x.r)] METER SECOND ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_SPEED.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_RELATIVE.nextNode());
                        // flipsUnitConversion.g:210:22: ^( SPEED FloatingPointLiteral[String.valueOf(-x.r)] METER SECOND )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(stream_SPEED.nextNode(), root_2);

                        adaptor.addChild(root_2, (CommonTree)adaptor.create(FloatingPointLiteral, String.valueOf(-x.r)));
                        adaptor.addChild(root_2, (CommonTree)adaptor.create(METER, "METER"));
                        adaptor.addChild(root_2, (CommonTree)adaptor.create(SECOND, "SECOND"));

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);}
                    }
                    break;
                case 3 :
                    // flipsUnitConversion.g:211:4: ^( SPEED RELATIVE FASTER ^( SPEED y= percentValue ) )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    _last = (CommonTree)input.LT(1);
                    SPEED101=(CommonTree)match(input,SPEED,FOLLOW_SPEED_in_convertRelativeSpeed1241); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_SPEED.add(SPEED101);


                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = SPEED101;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    RELATIVE102=(CommonTree)match(input,RELATIVE,FOLLOW_RELATIVE_in_convertRelativeSpeed1243); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_RELATIVE.add(RELATIVE102);

                    _last = (CommonTree)input.LT(1);
                    FASTER103=(CommonTree)match(input,FASTER,FOLLOW_FASTER_in_convertRelativeSpeed1245); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_FASTER.add(FASTER103);

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    _last = (CommonTree)input.LT(1);
                    SPEED104=(CommonTree)match(input,SPEED,FOLLOW_SPEED_in_convertRelativeSpeed1248); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_SPEED.add(SPEED104);


                    if ( state.backtracking==1 )
                    if ( _first_1==null ) _first_1 = SPEED104;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_percentValue_in_convertRelativeSpeed1252);
                    y=percentValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) stream_percentValue.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: SPEED, SPEED, RELATIVE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 212:2: -> ^( SPEED RELATIVE ^( SPEED FloatingPointLiteral[String.valueOf(y.r)] PERCENT ) )
                    {
                        // flipsUnitConversion.g:212:5: ^( SPEED RELATIVE ^( SPEED FloatingPointLiteral[String.valueOf(y.r)] PERCENT ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_SPEED.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_RELATIVE.nextNode());
                        // flipsUnitConversion.g:212:22: ^( SPEED FloatingPointLiteral[String.valueOf(y.r)] PERCENT )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(stream_SPEED.nextNode(), root_2);

                        adaptor.addChild(root_2, (CommonTree)adaptor.create(FloatingPointLiteral, String.valueOf(y.r)));
                        adaptor.addChild(root_2, (CommonTree)adaptor.create(PERCENT, "PERCENT"));

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);}
                    }
                    break;
                case 4 :
                    // flipsUnitConversion.g:213:4: ^( SPEED RELATIVE SLOWER ^( SPEED y= percentValue ) )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    _last = (CommonTree)input.LT(1);
                    SPEED105=(CommonTree)match(input,SPEED,FOLLOW_SPEED_in_convertRelativeSpeed1278); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_SPEED.add(SPEED105);


                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = SPEED105;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    RELATIVE106=(CommonTree)match(input,RELATIVE,FOLLOW_RELATIVE_in_convertRelativeSpeed1280); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_RELATIVE.add(RELATIVE106);

                    _last = (CommonTree)input.LT(1);
                    SLOWER107=(CommonTree)match(input,SLOWER,FOLLOW_SLOWER_in_convertRelativeSpeed1282); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_SLOWER.add(SLOWER107);

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    _last = (CommonTree)input.LT(1);
                    SPEED108=(CommonTree)match(input,SPEED,FOLLOW_SPEED_in_convertRelativeSpeed1285); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_SPEED.add(SPEED108);


                    if ( state.backtracking==1 )
                    if ( _first_1==null ) _first_1 = SPEED108;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_percentValue_in_convertRelativeSpeed1289);
                    y=percentValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) stream_percentValue.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: SPEED, SPEED, RELATIVE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 214:2: -> ^( SPEED RELATIVE ^( SPEED FloatingPointLiteral[String.valueOf(-y.r)] PERCENT ) )
                    {
                        // flipsUnitConversion.g:214:5: ^( SPEED RELATIVE ^( SPEED FloatingPointLiteral[String.valueOf(-y.r)] PERCENT ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_SPEED.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_RELATIVE.nextNode());
                        // flipsUnitConversion.g:214:22: ^( SPEED FloatingPointLiteral[String.valueOf(-y.r)] PERCENT )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(stream_SPEED.nextNode(), root_2);

                        adaptor.addChild(root_2, (CommonTree)adaptor.create(FloatingPointLiteral, String.valueOf(-y.r)));
                        adaptor.addChild(root_2, (CommonTree)adaptor.create(PERCENT, "PERCENT"));

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);}
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "convertRelativeSpeed"

    public static class convertFixedThrottle_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "convertFixedThrottle"
    // flipsUnitConversion.g:218:1: convertFixedThrottle : ^( THROTTLE FIXED ^( SPEED x= percentValue ) ) -> ^( THROTTLE FIXED ^( SPEED FloatingPointLiteral[String.valueOf(x.r)] PERCENT ) ) ;
    public final flipsUnitConversion.convertFixedThrottle_return convertFixedThrottle() throws RecognitionException {
        flipsUnitConversion.convertFixedThrottle_return retval = new flipsUnitConversion.convertFixedThrottle_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree THROTTLE109=null;
        CommonTree FIXED110=null;
        CommonTree SPEED111=null;
        flipsUnitConversion.percentValue_return x = null;


        CommonTree THROTTLE109_tree=null;
        CommonTree FIXED110_tree=null;
        CommonTree SPEED111_tree=null;
        RewriteRuleNodeStream stream_SPEED=new RewriteRuleNodeStream(adaptor,"token SPEED");
        RewriteRuleNodeStream stream_THROTTLE=new RewriteRuleNodeStream(adaptor,"token THROTTLE");
        RewriteRuleNodeStream stream_FIXED=new RewriteRuleNodeStream(adaptor,"token FIXED");
        RewriteRuleSubtreeStream stream_percentValue=new RewriteRuleSubtreeStream(adaptor,"rule percentValue");
        try {
            // flipsUnitConversion.g:219:2: ( ^( THROTTLE FIXED ^( SPEED x= percentValue ) ) -> ^( THROTTLE FIXED ^( SPEED FloatingPointLiteral[String.valueOf(x.r)] PERCENT ) ) )
            // flipsUnitConversion.g:219:4: ^( THROTTLE FIXED ^( SPEED x= percentValue ) )
            {
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            _last = (CommonTree)input.LT(1);
            THROTTLE109=(CommonTree)match(input,THROTTLE,FOLLOW_THROTTLE_in_convertFixedThrottle1322); if (state.failed) return retval; 
            if ( state.backtracking==1 ) stream_THROTTLE.add(THROTTLE109);


            if ( state.backtracking==1 )
            if ( _first_0==null ) _first_0 = THROTTLE109;
            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            FIXED110=(CommonTree)match(input,FIXED,FOLLOW_FIXED_in_convertFixedThrottle1324); if (state.failed) return retval; 
            if ( state.backtracking==1 ) stream_FIXED.add(FIXED110);

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            _last = (CommonTree)input.LT(1);
            SPEED111=(CommonTree)match(input,SPEED,FOLLOW_SPEED_in_convertFixedThrottle1327); if (state.failed) return retval; 
            if ( state.backtracking==1 ) stream_SPEED.add(SPEED111);


            if ( state.backtracking==1 )
            if ( _first_1==null ) _first_1 = SPEED111;
            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_percentValue_in_convertFixedThrottle1331);
            x=percentValue();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==1 ) stream_percentValue.add(x.getTree());

            match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_2;
            }


            match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_1;
            }



            // AST REWRITE
            // elements: THROTTLE, FIXED, SPEED
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==1 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 220:2: -> ^( THROTTLE FIXED ^( SPEED FloatingPointLiteral[String.valueOf(x.r)] PERCENT ) )
            {
                // flipsUnitConversion.g:220:5: ^( THROTTLE FIXED ^( SPEED FloatingPointLiteral[String.valueOf(x.r)] PERCENT ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_THROTTLE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_FIXED.nextNode());
                // flipsUnitConversion.g:220:22: ^( SPEED FloatingPointLiteral[String.valueOf(x.r)] PERCENT )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_SPEED.nextNode(), root_2);

                adaptor.addChild(root_2, (CommonTree)adaptor.create(FloatingPointLiteral, String.valueOf(x.r)));
                adaptor.addChild(root_2, (CommonTree)adaptor.create(PERCENT, "PERCENT"));

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            input.replaceChildren(adaptor.getParent(retval.start),
                                  adaptor.getChildIndex(retval.start),
                                  adaptor.getChildIndex(_last),
                                  retval.tree);}
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "convertFixedThrottle"

    public static class convertRelativeThrottle_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "convertRelativeThrottle"
    // flipsUnitConversion.g:224:1: convertRelativeThrottle : ( ^( THROTTLE RELATIVE FASTER ^( SPEED x= percentValue ) ) -> ^( THROTTLE RELATIVE ^( SPEED FloatingPointLiteral[String.valueOf(x.r)] PERCENT ) ) | ^( THROTTLE RELATIVE SLOWER ^( SPEED x= percentValue ) ) -> ^( THROTTLE RELATIVE ^( SPEED FloatingPointLiteral[String.valueOf(-x.r)] PERCENT ) ) | ^( THROTTLE RELATIVE FASTER y= convertAngularRate ) -> ^( THROTTLE RELATIVE ^( SPEED FloatingPointLiteral[String.valueOf(y.r)] DEGREE SECOND ) ) | ^( THROTTLE RELATIVE SLOWER y= convertAngularRate ) -> ^( THROTTLE RELATIVE ^( SPEED FloatingPointLiteral[String.valueOf(-y.r)] DEGREE SECOND ) ) );
    public final flipsUnitConversion.convertRelativeThrottle_return convertRelativeThrottle() throws RecognitionException {
        flipsUnitConversion.convertRelativeThrottle_return retval = new flipsUnitConversion.convertRelativeThrottle_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree THROTTLE112=null;
        CommonTree RELATIVE113=null;
        CommonTree FASTER114=null;
        CommonTree SPEED115=null;
        CommonTree THROTTLE116=null;
        CommonTree RELATIVE117=null;
        CommonTree SLOWER118=null;
        CommonTree SPEED119=null;
        CommonTree THROTTLE120=null;
        CommonTree RELATIVE121=null;
        CommonTree FASTER122=null;
        CommonTree THROTTLE123=null;
        CommonTree RELATIVE124=null;
        CommonTree SLOWER125=null;
        flipsUnitConversion.percentValue_return x = null;

        flipsUnitConversion.convertAngularRate_return y = null;


        CommonTree THROTTLE112_tree=null;
        CommonTree RELATIVE113_tree=null;
        CommonTree FASTER114_tree=null;
        CommonTree SPEED115_tree=null;
        CommonTree THROTTLE116_tree=null;
        CommonTree RELATIVE117_tree=null;
        CommonTree SLOWER118_tree=null;
        CommonTree SPEED119_tree=null;
        CommonTree THROTTLE120_tree=null;
        CommonTree RELATIVE121_tree=null;
        CommonTree FASTER122_tree=null;
        CommonTree THROTTLE123_tree=null;
        CommonTree RELATIVE124_tree=null;
        CommonTree SLOWER125_tree=null;
        RewriteRuleNodeStream stream_FASTER=new RewriteRuleNodeStream(adaptor,"token FASTER");
        RewriteRuleNodeStream stream_RELATIVE=new RewriteRuleNodeStream(adaptor,"token RELATIVE");
        RewriteRuleNodeStream stream_SLOWER=new RewriteRuleNodeStream(adaptor,"token SLOWER");
        RewriteRuleNodeStream stream_SPEED=new RewriteRuleNodeStream(adaptor,"token SPEED");
        RewriteRuleNodeStream stream_THROTTLE=new RewriteRuleNodeStream(adaptor,"token THROTTLE");
        RewriteRuleSubtreeStream stream_percentValue=new RewriteRuleSubtreeStream(adaptor,"rule percentValue");
        RewriteRuleSubtreeStream stream_convertAngularRate=new RewriteRuleSubtreeStream(adaptor,"rule convertAngularRate");
        try {
            // flipsUnitConversion.g:225:2: ( ^( THROTTLE RELATIVE FASTER ^( SPEED x= percentValue ) ) -> ^( THROTTLE RELATIVE ^( SPEED FloatingPointLiteral[String.valueOf(x.r)] PERCENT ) ) | ^( THROTTLE RELATIVE SLOWER ^( SPEED x= percentValue ) ) -> ^( THROTTLE RELATIVE ^( SPEED FloatingPointLiteral[String.valueOf(-x.r)] PERCENT ) ) | ^( THROTTLE RELATIVE FASTER y= convertAngularRate ) -> ^( THROTTLE RELATIVE ^( SPEED FloatingPointLiteral[String.valueOf(y.r)] DEGREE SECOND ) ) | ^( THROTTLE RELATIVE SLOWER y= convertAngularRate ) -> ^( THROTTLE RELATIVE ^( SPEED FloatingPointLiteral[String.valueOf(-y.r)] DEGREE SECOND ) ) )
            int alt9=4;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // flipsUnitConversion.g:225:4: ^( THROTTLE RELATIVE FASTER ^( SPEED x= percentValue ) )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    _last = (CommonTree)input.LT(1);
                    THROTTLE112=(CommonTree)match(input,THROTTLE,FOLLOW_THROTTLE_in_convertRelativeThrottle1364); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_THROTTLE.add(THROTTLE112);


                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = THROTTLE112;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    RELATIVE113=(CommonTree)match(input,RELATIVE,FOLLOW_RELATIVE_in_convertRelativeThrottle1366); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_RELATIVE.add(RELATIVE113);

                    _last = (CommonTree)input.LT(1);
                    FASTER114=(CommonTree)match(input,FASTER,FOLLOW_FASTER_in_convertRelativeThrottle1368); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_FASTER.add(FASTER114);

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    _last = (CommonTree)input.LT(1);
                    SPEED115=(CommonTree)match(input,SPEED,FOLLOW_SPEED_in_convertRelativeThrottle1371); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_SPEED.add(SPEED115);


                    if ( state.backtracking==1 )
                    if ( _first_1==null ) _first_1 = SPEED115;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_percentValue_in_convertRelativeThrottle1375);
                    x=percentValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) stream_percentValue.add(x.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: SPEED, RELATIVE, THROTTLE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 226:2: -> ^( THROTTLE RELATIVE ^( SPEED FloatingPointLiteral[String.valueOf(x.r)] PERCENT ) )
                    {
                        // flipsUnitConversion.g:226:5: ^( THROTTLE RELATIVE ^( SPEED FloatingPointLiteral[String.valueOf(x.r)] PERCENT ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_THROTTLE.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_RELATIVE.nextNode());
                        // flipsUnitConversion.g:226:25: ^( SPEED FloatingPointLiteral[String.valueOf(x.r)] PERCENT )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(stream_SPEED.nextNode(), root_2);

                        adaptor.addChild(root_2, (CommonTree)adaptor.create(FloatingPointLiteral, String.valueOf(x.r)));
                        adaptor.addChild(root_2, (CommonTree)adaptor.create(PERCENT, "PERCENT"));

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);}
                    }
                    break;
                case 2 :
                    // flipsUnitConversion.g:227:4: ^( THROTTLE RELATIVE SLOWER ^( SPEED x= percentValue ) )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    _last = (CommonTree)input.LT(1);
                    THROTTLE116=(CommonTree)match(input,THROTTLE,FOLLOW_THROTTLE_in_convertRelativeThrottle1401); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_THROTTLE.add(THROTTLE116);


                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = THROTTLE116;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    RELATIVE117=(CommonTree)match(input,RELATIVE,FOLLOW_RELATIVE_in_convertRelativeThrottle1403); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_RELATIVE.add(RELATIVE117);

                    _last = (CommonTree)input.LT(1);
                    SLOWER118=(CommonTree)match(input,SLOWER,FOLLOW_SLOWER_in_convertRelativeThrottle1405); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_SLOWER.add(SLOWER118);

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    _last = (CommonTree)input.LT(1);
                    SPEED119=(CommonTree)match(input,SPEED,FOLLOW_SPEED_in_convertRelativeThrottle1408); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_SPEED.add(SPEED119);


                    if ( state.backtracking==1 )
                    if ( _first_1==null ) _first_1 = SPEED119;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_percentValue_in_convertRelativeThrottle1412);
                    x=percentValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) stream_percentValue.add(x.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: RELATIVE, SPEED, THROTTLE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 228:2: -> ^( THROTTLE RELATIVE ^( SPEED FloatingPointLiteral[String.valueOf(-x.r)] PERCENT ) )
                    {
                        // flipsUnitConversion.g:228:5: ^( THROTTLE RELATIVE ^( SPEED FloatingPointLiteral[String.valueOf(-x.r)] PERCENT ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_THROTTLE.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_RELATIVE.nextNode());
                        // flipsUnitConversion.g:228:25: ^( SPEED FloatingPointLiteral[String.valueOf(-x.r)] PERCENT )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(stream_SPEED.nextNode(), root_2);

                        adaptor.addChild(root_2, (CommonTree)adaptor.create(FloatingPointLiteral, String.valueOf(-x.r)));
                        adaptor.addChild(root_2, (CommonTree)adaptor.create(PERCENT, "PERCENT"));

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);}
                    }
                    break;
                case 3 :
                    // flipsUnitConversion.g:229:4: ^( THROTTLE RELATIVE FASTER y= convertAngularRate )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    _last = (CommonTree)input.LT(1);
                    THROTTLE120=(CommonTree)match(input,THROTTLE,FOLLOW_THROTTLE_in_convertRelativeThrottle1438); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_THROTTLE.add(THROTTLE120);


                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = THROTTLE120;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    RELATIVE121=(CommonTree)match(input,RELATIVE,FOLLOW_RELATIVE_in_convertRelativeThrottle1440); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_RELATIVE.add(RELATIVE121);

                    _last = (CommonTree)input.LT(1);
                    FASTER122=(CommonTree)match(input,FASTER,FOLLOW_FASTER_in_convertRelativeThrottle1442); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_FASTER.add(FASTER122);

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_convertAngularRate_in_convertRelativeThrottle1446);
                    y=convertAngularRate();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) stream_convertAngularRate.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: RELATIVE, THROTTLE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 230:2: -> ^( THROTTLE RELATIVE ^( SPEED FloatingPointLiteral[String.valueOf(y.r)] DEGREE SECOND ) )
                    {
                        // flipsUnitConversion.g:230:5: ^( THROTTLE RELATIVE ^( SPEED FloatingPointLiteral[String.valueOf(y.r)] DEGREE SECOND ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_THROTTLE.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_RELATIVE.nextNode());
                        // flipsUnitConversion.g:230:25: ^( SPEED FloatingPointLiteral[String.valueOf(y.r)] DEGREE SECOND )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SPEED, "SPEED"), root_2);

                        adaptor.addChild(root_2, (CommonTree)adaptor.create(FloatingPointLiteral, String.valueOf(y.r)));
                        adaptor.addChild(root_2, (CommonTree)adaptor.create(DEGREE, "DEGREE"));
                        adaptor.addChild(root_2, (CommonTree)adaptor.create(SECOND, "SECOND"));

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);}
                    }
                    break;
                case 4 :
                    // flipsUnitConversion.g:231:4: ^( THROTTLE RELATIVE SLOWER y= convertAngularRate )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    _last = (CommonTree)input.LT(1);
                    THROTTLE123=(CommonTree)match(input,THROTTLE,FOLLOW_THROTTLE_in_convertRelativeThrottle1473); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_THROTTLE.add(THROTTLE123);


                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = THROTTLE123;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    RELATIVE124=(CommonTree)match(input,RELATIVE,FOLLOW_RELATIVE_in_convertRelativeThrottle1475); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_RELATIVE.add(RELATIVE124);

                    _last = (CommonTree)input.LT(1);
                    SLOWER125=(CommonTree)match(input,SLOWER,FOLLOW_SLOWER_in_convertRelativeThrottle1477); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_SLOWER.add(SLOWER125);

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_convertAngularRate_in_convertRelativeThrottle1481);
                    y=convertAngularRate();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) stream_convertAngularRate.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: RELATIVE, THROTTLE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 232:2: -> ^( THROTTLE RELATIVE ^( SPEED FloatingPointLiteral[String.valueOf(-y.r)] DEGREE SECOND ) )
                    {
                        // flipsUnitConversion.g:232:5: ^( THROTTLE RELATIVE ^( SPEED FloatingPointLiteral[String.valueOf(-y.r)] DEGREE SECOND ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_THROTTLE.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_RELATIVE.nextNode());
                        // flipsUnitConversion.g:232:25: ^( SPEED FloatingPointLiteral[String.valueOf(-y.r)] DEGREE SECOND )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SPEED, "SPEED"), root_2);

                        adaptor.addChild(root_2, (CommonTree)adaptor.create(FloatingPointLiteral, String.valueOf(-y.r)));
                        adaptor.addChild(root_2, (CommonTree)adaptor.create(DEGREE, "DEGREE"));
                        adaptor.addChild(root_2, (CommonTree)adaptor.create(SECOND, "SECOND"));

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);}
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "convertRelativeThrottle"

    public static class convertAngle_return extends TreeRuleReturnScope {
        public double r;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "convertAngle"
    // flipsUnitConversion.g:236:1: convertAngle returns [double r] : ( ^( ANGLE x= numericValue DEGREE ) -> ^( ANGLE FloatingPointLiteral[String.valueOf($r)] DEGREE ) | ^( ANGLE x= numericValue RADIAN ) -> ^( ANGLE FloatingPointLiteral[String.valueOf($r)] DEGREE ) | ^( ANGLE POSITIVE deg= numericValuePositive DEGREE minNum= numericValuePositive MINUTE ) -> ^( ANGLE FloatingPointLiteral[String.valueOf($r)] DEGREE ) | ^( ANGLE POSITIVE deg= numericValuePositive DEGREE minInt= integerValue MINUTE sec= numericValuePositive SECOND ) -> ^( ANGLE FloatingPointLiteral[String.valueOf($r)] DEGREE ) | ^( ANGLE NEGATIVE deg= numericValuePositive DEGREE minNum= numericValuePositive MINUTE ) -> ^( ANGLE FloatingPointLiteral[String.valueOf($r)] DEGREE ) | ^( ANGLE NEGATIVE deg= numericValuePositive DEGREE minInt= integerValue MINUTE sec= numericValuePositive SECOND ) -> ^( ANGLE FloatingPointLiteral[String.valueOf($r)] DEGREE ) | STRAIGHT -> ^( ANGLE FloatingPointLiteral[\"0\"] DEGREE ) | LEVEL -> ^( ANGLE FloatingPointLiteral[\"0\"] DEGREE ) );
    public final flipsUnitConversion.convertAngle_return convertAngle() throws RecognitionException {
        flipsUnitConversion.convertAngle_return retval = new flipsUnitConversion.convertAngle_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ANGLE126=null;
        CommonTree DEGREE127=null;
        CommonTree ANGLE128=null;
        CommonTree RADIAN129=null;
        CommonTree ANGLE130=null;
        CommonTree POSITIVE131=null;
        CommonTree DEGREE132=null;
        CommonTree MINUTE133=null;
        CommonTree ANGLE134=null;
        CommonTree POSITIVE135=null;
        CommonTree DEGREE136=null;
        CommonTree MINUTE137=null;
        CommonTree SECOND138=null;
        CommonTree ANGLE139=null;
        CommonTree NEGATIVE140=null;
        CommonTree DEGREE141=null;
        CommonTree MINUTE142=null;
        CommonTree ANGLE143=null;
        CommonTree NEGATIVE144=null;
        CommonTree DEGREE145=null;
        CommonTree MINUTE146=null;
        CommonTree SECOND147=null;
        CommonTree STRAIGHT148=null;
        CommonTree LEVEL149=null;
        flipsUnitConversion.numericValue_return x = null;

        flipsUnitConversion.numericValuePositive_return deg = null;

        flipsUnitConversion.numericValuePositive_return minNum = null;

        flipsUnitConversion.integerValue_return minInt = null;

        flipsUnitConversion.numericValuePositive_return sec = null;


        CommonTree ANGLE126_tree=null;
        CommonTree DEGREE127_tree=null;
        CommonTree ANGLE128_tree=null;
        CommonTree RADIAN129_tree=null;
        CommonTree ANGLE130_tree=null;
        CommonTree POSITIVE131_tree=null;
        CommonTree DEGREE132_tree=null;
        CommonTree MINUTE133_tree=null;
        CommonTree ANGLE134_tree=null;
        CommonTree POSITIVE135_tree=null;
        CommonTree DEGREE136_tree=null;
        CommonTree MINUTE137_tree=null;
        CommonTree SECOND138_tree=null;
        CommonTree ANGLE139_tree=null;
        CommonTree NEGATIVE140_tree=null;
        CommonTree DEGREE141_tree=null;
        CommonTree MINUTE142_tree=null;
        CommonTree ANGLE143_tree=null;
        CommonTree NEGATIVE144_tree=null;
        CommonTree DEGREE145_tree=null;
        CommonTree MINUTE146_tree=null;
        CommonTree SECOND147_tree=null;
        CommonTree STRAIGHT148_tree=null;
        CommonTree LEVEL149_tree=null;
        RewriteRuleNodeStream stream_POSITIVE=new RewriteRuleNodeStream(adaptor,"token POSITIVE");
        RewriteRuleNodeStream stream_SECOND=new RewriteRuleNodeStream(adaptor,"token SECOND");
        RewriteRuleNodeStream stream_STRAIGHT=new RewriteRuleNodeStream(adaptor,"token STRAIGHT");
        RewriteRuleNodeStream stream_ANGLE=new RewriteRuleNodeStream(adaptor,"token ANGLE");
        RewriteRuleNodeStream stream_LEVEL=new RewriteRuleNodeStream(adaptor,"token LEVEL");
        RewriteRuleNodeStream stream_MINUTE=new RewriteRuleNodeStream(adaptor,"token MINUTE");
        RewriteRuleNodeStream stream_RADIAN=new RewriteRuleNodeStream(adaptor,"token RADIAN");
        RewriteRuleNodeStream stream_DEGREE=new RewriteRuleNodeStream(adaptor,"token DEGREE");
        RewriteRuleNodeStream stream_NEGATIVE=new RewriteRuleNodeStream(adaptor,"token NEGATIVE");
        RewriteRuleSubtreeStream stream_numericValuePositive=new RewriteRuleSubtreeStream(adaptor,"rule numericValuePositive");
        RewriteRuleSubtreeStream stream_integerValue=new RewriteRuleSubtreeStream(adaptor,"rule integerValue");
        RewriteRuleSubtreeStream stream_numericValue=new RewriteRuleSubtreeStream(adaptor,"rule numericValue");
        try {
            // flipsUnitConversion.g:237:2: ( ^( ANGLE x= numericValue DEGREE ) -> ^( ANGLE FloatingPointLiteral[String.valueOf($r)] DEGREE ) | ^( ANGLE x= numericValue RADIAN ) -> ^( ANGLE FloatingPointLiteral[String.valueOf($r)] DEGREE ) | ^( ANGLE POSITIVE deg= numericValuePositive DEGREE minNum= numericValuePositive MINUTE ) -> ^( ANGLE FloatingPointLiteral[String.valueOf($r)] DEGREE ) | ^( ANGLE POSITIVE deg= numericValuePositive DEGREE minInt= integerValue MINUTE sec= numericValuePositive SECOND ) -> ^( ANGLE FloatingPointLiteral[String.valueOf($r)] DEGREE ) | ^( ANGLE NEGATIVE deg= numericValuePositive DEGREE minNum= numericValuePositive MINUTE ) -> ^( ANGLE FloatingPointLiteral[String.valueOf($r)] DEGREE ) | ^( ANGLE NEGATIVE deg= numericValuePositive DEGREE minInt= integerValue MINUTE sec= numericValuePositive SECOND ) -> ^( ANGLE FloatingPointLiteral[String.valueOf($r)] DEGREE ) | STRAIGHT -> ^( ANGLE FloatingPointLiteral[\"0\"] DEGREE ) | LEVEL -> ^( ANGLE FloatingPointLiteral[\"0\"] DEGREE ) )
            int alt10=8;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // flipsUnitConversion.g:237:4: ^( ANGLE x= numericValue DEGREE )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    _last = (CommonTree)input.LT(1);
                    ANGLE126=(CommonTree)match(input,ANGLE,FOLLOW_ANGLE_in_convertAngle1519); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_ANGLE.add(ANGLE126);


                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = ANGLE126;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_numericValue_in_convertAngle1523);
                    x=numericValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) stream_numericValue.add(x.getTree());
                    _last = (CommonTree)input.LT(1);
                    DEGREE127=(CommonTree)match(input,DEGREE,FOLLOW_DEGREE_in_convertAngle1525); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_DEGREE.add(DEGREE127);


                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_1;
                    }

                    if ( state.backtracking==1 ) {
                      retval.r = x.r;
                    }


                    // AST REWRITE
                    // elements: DEGREE, ANGLE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 239:2: -> ^( ANGLE FloatingPointLiteral[String.valueOf($r)] DEGREE )
                    {
                        // flipsUnitConversion.g:239:5: ^( ANGLE FloatingPointLiteral[String.valueOf($r)] DEGREE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_ANGLE.nextNode(), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(FloatingPointLiteral, String.valueOf(retval.r)));
                        adaptor.addChild(root_1, stream_DEGREE.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);}
                    }
                    break;
                case 2 :
                    // flipsUnitConversion.g:240:4: ^( ANGLE x= numericValue RADIAN )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    _last = (CommonTree)input.LT(1);
                    ANGLE128=(CommonTree)match(input,ANGLE,FOLLOW_ANGLE_in_convertAngle1548); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_ANGLE.add(ANGLE128);


                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = ANGLE128;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_numericValue_in_convertAngle1552);
                    x=numericValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) stream_numericValue.add(x.getTree());
                    _last = (CommonTree)input.LT(1);
                    RADIAN129=(CommonTree)match(input,RADIAN,FOLLOW_RADIAN_in_convertAngle1554); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_RADIAN.add(RADIAN129);


                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_1;
                    }

                    if ( state.backtracking==1 ) {
                      retval.r = x.r * 180d / Math.PI;
                    }


                    // AST REWRITE
                    // elements: ANGLE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 242:2: -> ^( ANGLE FloatingPointLiteral[String.valueOf($r)] DEGREE )
                    {
                        // flipsUnitConversion.g:242:5: ^( ANGLE FloatingPointLiteral[String.valueOf($r)] DEGREE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_ANGLE.nextNode(), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(FloatingPointLiteral, String.valueOf(retval.r)));
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(DEGREE, "DEGREE"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);}
                    }
                    break;
                case 3 :
                    // flipsUnitConversion.g:243:4: ^( ANGLE POSITIVE deg= numericValuePositive DEGREE minNum= numericValuePositive MINUTE )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    _last = (CommonTree)input.LT(1);
                    ANGLE130=(CommonTree)match(input,ANGLE,FOLLOW_ANGLE_in_convertAngle1577); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_ANGLE.add(ANGLE130);


                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = ANGLE130;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    POSITIVE131=(CommonTree)match(input,POSITIVE,FOLLOW_POSITIVE_in_convertAngle1579); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_POSITIVE.add(POSITIVE131);

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_numericValuePositive_in_convertAngle1583);
                    deg=numericValuePositive();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) stream_numericValuePositive.add(deg.getTree());
                    _last = (CommonTree)input.LT(1);
                    DEGREE132=(CommonTree)match(input,DEGREE,FOLLOW_DEGREE_in_convertAngle1585); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_DEGREE.add(DEGREE132);

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_numericValuePositive_in_convertAngle1589);
                    minNum=numericValuePositive();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) stream_numericValuePositive.add(minNum.getTree());
                    _last = (CommonTree)input.LT(1);
                    MINUTE133=(CommonTree)match(input,MINUTE,FOLLOW_MINUTE_in_convertAngle1591); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_MINUTE.add(MINUTE133);


                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_1;
                    }

                    if ( state.backtracking==1 ) {
                      retval.r = deg.r + minNum.r/60d;
                    }


                    // AST REWRITE
                    // elements: DEGREE, ANGLE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 245:2: -> ^( ANGLE FloatingPointLiteral[String.valueOf($r)] DEGREE )
                    {
                        // flipsUnitConversion.g:245:5: ^( ANGLE FloatingPointLiteral[String.valueOf($r)] DEGREE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_ANGLE.nextNode(), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(FloatingPointLiteral, String.valueOf(retval.r)));
                        adaptor.addChild(root_1, stream_DEGREE.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);}
                    }
                    break;
                case 4 :
                    // flipsUnitConversion.g:246:4: ^( ANGLE POSITIVE deg= numericValuePositive DEGREE minInt= integerValue MINUTE sec= numericValuePositive SECOND )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    _last = (CommonTree)input.LT(1);
                    ANGLE134=(CommonTree)match(input,ANGLE,FOLLOW_ANGLE_in_convertAngle1614); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_ANGLE.add(ANGLE134);


                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = ANGLE134;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    POSITIVE135=(CommonTree)match(input,POSITIVE,FOLLOW_POSITIVE_in_convertAngle1616); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_POSITIVE.add(POSITIVE135);

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_numericValuePositive_in_convertAngle1620);
                    deg=numericValuePositive();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) stream_numericValuePositive.add(deg.getTree());
                    _last = (CommonTree)input.LT(1);
                    DEGREE136=(CommonTree)match(input,DEGREE,FOLLOW_DEGREE_in_convertAngle1622); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_DEGREE.add(DEGREE136);

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_integerValue_in_convertAngle1626);
                    minInt=integerValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) stream_integerValue.add(minInt.getTree());
                    _last = (CommonTree)input.LT(1);
                    MINUTE137=(CommonTree)match(input,MINUTE,FOLLOW_MINUTE_in_convertAngle1628); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_MINUTE.add(MINUTE137);

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_numericValuePositive_in_convertAngle1632);
                    sec=numericValuePositive();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) stream_numericValuePositive.add(sec.getTree());
                    _last = (CommonTree)input.LT(1);
                    SECOND138=(CommonTree)match(input,SECOND,FOLLOW_SECOND_in_convertAngle1634); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_SECOND.add(SECOND138);


                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_1;
                    }

                    if ( state.backtracking==1 ) {
                      retval.r = deg.r + minInt.r/60d + sec.r/3600d;
                    }


                    // AST REWRITE
                    // elements: DEGREE, ANGLE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 248:2: -> ^( ANGLE FloatingPointLiteral[String.valueOf($r)] DEGREE )
                    {
                        // flipsUnitConversion.g:248:5: ^( ANGLE FloatingPointLiteral[String.valueOf($r)] DEGREE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_ANGLE.nextNode(), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(FloatingPointLiteral, String.valueOf(retval.r)));
                        adaptor.addChild(root_1, stream_DEGREE.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);}
                    }
                    break;
                case 5 :
                    // flipsUnitConversion.g:249:4: ^( ANGLE NEGATIVE deg= numericValuePositive DEGREE minNum= numericValuePositive MINUTE )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    _last = (CommonTree)input.LT(1);
                    ANGLE139=(CommonTree)match(input,ANGLE,FOLLOW_ANGLE_in_convertAngle1657); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_ANGLE.add(ANGLE139);


                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = ANGLE139;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    NEGATIVE140=(CommonTree)match(input,NEGATIVE,FOLLOW_NEGATIVE_in_convertAngle1659); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_NEGATIVE.add(NEGATIVE140);

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_numericValuePositive_in_convertAngle1663);
                    deg=numericValuePositive();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) stream_numericValuePositive.add(deg.getTree());
                    _last = (CommonTree)input.LT(1);
                    DEGREE141=(CommonTree)match(input,DEGREE,FOLLOW_DEGREE_in_convertAngle1665); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_DEGREE.add(DEGREE141);

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_numericValuePositive_in_convertAngle1669);
                    minNum=numericValuePositive();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) stream_numericValuePositive.add(minNum.getTree());
                    _last = (CommonTree)input.LT(1);
                    MINUTE142=(CommonTree)match(input,MINUTE,FOLLOW_MINUTE_in_convertAngle1671); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_MINUTE.add(MINUTE142);


                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_1;
                    }

                    if ( state.backtracking==1 ) {
                      retval.r = -deg.r - minNum.r/60d;
                    }


                    // AST REWRITE
                    // elements: ANGLE, DEGREE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 251:2: -> ^( ANGLE FloatingPointLiteral[String.valueOf($r)] DEGREE )
                    {
                        // flipsUnitConversion.g:251:5: ^( ANGLE FloatingPointLiteral[String.valueOf($r)] DEGREE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_ANGLE.nextNode(), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(FloatingPointLiteral, String.valueOf(retval.r)));
                        adaptor.addChild(root_1, stream_DEGREE.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);}
                    }
                    break;
                case 6 :
                    // flipsUnitConversion.g:252:4: ^( ANGLE NEGATIVE deg= numericValuePositive DEGREE minInt= integerValue MINUTE sec= numericValuePositive SECOND )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    _last = (CommonTree)input.LT(1);
                    ANGLE143=(CommonTree)match(input,ANGLE,FOLLOW_ANGLE_in_convertAngle1694); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_ANGLE.add(ANGLE143);


                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = ANGLE143;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    NEGATIVE144=(CommonTree)match(input,NEGATIVE,FOLLOW_NEGATIVE_in_convertAngle1696); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_NEGATIVE.add(NEGATIVE144);

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_numericValuePositive_in_convertAngle1700);
                    deg=numericValuePositive();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) stream_numericValuePositive.add(deg.getTree());
                    _last = (CommonTree)input.LT(1);
                    DEGREE145=(CommonTree)match(input,DEGREE,FOLLOW_DEGREE_in_convertAngle1702); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_DEGREE.add(DEGREE145);

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_integerValue_in_convertAngle1706);
                    minInt=integerValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) stream_integerValue.add(minInt.getTree());
                    _last = (CommonTree)input.LT(1);
                    MINUTE146=(CommonTree)match(input,MINUTE,FOLLOW_MINUTE_in_convertAngle1708); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_MINUTE.add(MINUTE146);

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_numericValuePositive_in_convertAngle1712);
                    sec=numericValuePositive();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) stream_numericValuePositive.add(sec.getTree());
                    _last = (CommonTree)input.LT(1);
                    SECOND147=(CommonTree)match(input,SECOND,FOLLOW_SECOND_in_convertAngle1714); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_SECOND.add(SECOND147);


                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_1;
                    }

                    if ( state.backtracking==1 ) {
                      retval.r = -deg.r - minInt.r/60d - sec.r/3600d;
                    }


                    // AST REWRITE
                    // elements: DEGREE, ANGLE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 254:2: -> ^( ANGLE FloatingPointLiteral[String.valueOf($r)] DEGREE )
                    {
                        // flipsUnitConversion.g:254:5: ^( ANGLE FloatingPointLiteral[String.valueOf($r)] DEGREE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_ANGLE.nextNode(), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(FloatingPointLiteral, String.valueOf(retval.r)));
                        adaptor.addChild(root_1, stream_DEGREE.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);}
                    }
                    break;
                case 7 :
                    // flipsUnitConversion.g:255:4: STRAIGHT
                    {
                    _last = (CommonTree)input.LT(1);
                    STRAIGHT148=(CommonTree)match(input,STRAIGHT,FOLLOW_STRAIGHT_in_convertAngle1736); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_STRAIGHT.add(STRAIGHT148);

                    if ( state.backtracking==1 ) {
                      retval.r = 0d;
                    }


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 257:2: -> ^( ANGLE FloatingPointLiteral[\"0\"] DEGREE )
                    {
                        // flipsUnitConversion.g:257:5: ^( ANGLE FloatingPointLiteral[\"0\"] DEGREE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ANGLE, "ANGLE"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(FloatingPointLiteral, "0"));
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(DEGREE, "DEGREE"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);}
                    }
                    break;
                case 8 :
                    // flipsUnitConversion.g:258:4: LEVEL
                    {
                    _last = (CommonTree)input.LT(1);
                    LEVEL149=(CommonTree)match(input,LEVEL,FOLLOW_LEVEL_in_convertAngle1757); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_LEVEL.add(LEVEL149);

                    if ( state.backtracking==1 ) {
                      retval.r = 0d;
                    }


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 260:2: -> ^( ANGLE FloatingPointLiteral[\"0\"] DEGREE )
                    {
                        // flipsUnitConversion.g:260:5: ^( ANGLE FloatingPointLiteral[\"0\"] DEGREE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ANGLE, "ANGLE"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(FloatingPointLiteral, "0"));
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(DEGREE, "DEGREE"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);}
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "convertAngle"

    public static class convertAngularRate_return extends TreeRuleReturnScope {
        public double r;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "convertAngularRate"
    // flipsUnitConversion.g:264:1: convertAngularRate returns [double r] : ( ^( SPEED x= convertAngle y= convertTimeUnit ) -> ^( SPEED FloatingPointLiteral[String.valueOf($r)] DEGREE SECOND ) | ^( SPEED z= numericValue REVOLUTION y= convertTimeUnit ) -> ^( SPEED FloatingPointLiteral[String.valueOf($r)] DEGREE SECOND ) );
    public final flipsUnitConversion.convertAngularRate_return convertAngularRate() throws RecognitionException {
        flipsUnitConversion.convertAngularRate_return retval = new flipsUnitConversion.convertAngularRate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SPEED150=null;
        CommonTree SPEED151=null;
        CommonTree REVOLUTION152=null;
        flipsUnitConversion.convertAngle_return x = null;

        flipsUnitConversion.convertTimeUnit_return y = null;

        flipsUnitConversion.numericValue_return z = null;


        CommonTree SPEED150_tree=null;
        CommonTree SPEED151_tree=null;
        CommonTree REVOLUTION152_tree=null;
        RewriteRuleNodeStream stream_REVOLUTION=new RewriteRuleNodeStream(adaptor,"token REVOLUTION");
        RewriteRuleNodeStream stream_SPEED=new RewriteRuleNodeStream(adaptor,"token SPEED");
        RewriteRuleSubtreeStream stream_convertTimeUnit=new RewriteRuleSubtreeStream(adaptor,"rule convertTimeUnit");
        RewriteRuleSubtreeStream stream_numericValue=new RewriteRuleSubtreeStream(adaptor,"rule numericValue");
        RewriteRuleSubtreeStream stream_convertAngle=new RewriteRuleSubtreeStream(adaptor,"rule convertAngle");
        try {
            // flipsUnitConversion.g:265:2: ( ^( SPEED x= convertAngle y= convertTimeUnit ) -> ^( SPEED FloatingPointLiteral[String.valueOf($r)] DEGREE SECOND ) | ^( SPEED z= numericValue REVOLUTION y= convertTimeUnit ) -> ^( SPEED FloatingPointLiteral[String.valueOf($r)] DEGREE SECOND ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==SPEED) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==DOWN) ) {
                    int LA11_2 = input.LA(3);

                    if ( ((LA11_2>=POSITIVE && LA11_2<=NEGATIVE)) ) {
                        alt11=2;
                    }
                    else if ( ((LA11_2>=STRAIGHT && LA11_2<=LEVEL)||LA11_2==ANGLE) ) {
                        alt11=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // flipsUnitConversion.g:265:4: ^( SPEED x= convertAngle y= convertTimeUnit )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    _last = (CommonTree)input.LT(1);
                    SPEED150=(CommonTree)match(input,SPEED,FOLLOW_SPEED_in_convertAngularRate1790); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_SPEED.add(SPEED150);


                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = SPEED150;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_convertAngle_in_convertAngularRate1794);
                    x=convertAngle();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) stream_convertAngle.add(x.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_convertTimeUnit_in_convertAngularRate1798);
                    y=convertTimeUnit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) stream_convertTimeUnit.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_1;
                    }

                    if ( state.backtracking==1 ) {
                      retval.r = x.r / y.r;
                    }


                    // AST REWRITE
                    // elements: SPEED
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 267:2: -> ^( SPEED FloatingPointLiteral[String.valueOf($r)] DEGREE SECOND )
                    {
                        // flipsUnitConversion.g:267:5: ^( SPEED FloatingPointLiteral[String.valueOf($r)] DEGREE SECOND )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_SPEED.nextNode(), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(FloatingPointLiteral, String.valueOf(retval.r)));
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(DEGREE, "DEGREE"));
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(SECOND, "SECOND"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);}
                    }
                    break;
                case 2 :
                    // flipsUnitConversion.g:268:4: ^( SPEED z= numericValue REVOLUTION y= convertTimeUnit )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    _last = (CommonTree)input.LT(1);
                    SPEED151=(CommonTree)match(input,SPEED,FOLLOW_SPEED_in_convertAngularRate1823); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_SPEED.add(SPEED151);


                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = SPEED151;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_numericValue_in_convertAngularRate1827);
                    z=numericValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) stream_numericValue.add(z.getTree());
                    _last = (CommonTree)input.LT(1);
                    REVOLUTION152=(CommonTree)match(input,REVOLUTION,FOLLOW_REVOLUTION_in_convertAngularRate1829); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_REVOLUTION.add(REVOLUTION152);

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_convertTimeUnit_in_convertAngularRate1833);
                    y=convertTimeUnit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) stream_convertTimeUnit.add(y.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_1;
                    }

                    if ( state.backtracking==1 ) {
                      retval.r = z.r / y.r * 360d;
                    }


                    // AST REWRITE
                    // elements: SPEED
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 270:2: -> ^( SPEED FloatingPointLiteral[String.valueOf($r)] DEGREE SECOND )
                    {
                        // flipsUnitConversion.g:270:5: ^( SPEED FloatingPointLiteral[String.valueOf($r)] DEGREE SECOND )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_SPEED.nextNode(), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(FloatingPointLiteral, String.valueOf(retval.r)));
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(DEGREE, "DEGREE"));
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(SECOND, "SECOND"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);}
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "convertAngularRate"

    public static class convertDirection_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "convertDirection"
    // flipsUnitConversion.g:274:1: convertDirection : ( ^( DIRECTION convertCardinalDirection ) -> convertCardinalDirection | ^( DIRECTION convertOrdinalDirection ) -> convertOrdinalDirection | ^( DIRECTION convertSubOrdinalDirection ) -> convertSubOrdinalDirection );
    public final flipsUnitConversion.convertDirection_return convertDirection() throws RecognitionException {
        flipsUnitConversion.convertDirection_return retval = new flipsUnitConversion.convertDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DIRECTION153=null;
        CommonTree DIRECTION155=null;
        CommonTree DIRECTION157=null;
        flipsUnitConversion.convertCardinalDirection_return convertCardinalDirection154 = null;

        flipsUnitConversion.convertOrdinalDirection_return convertOrdinalDirection156 = null;

        flipsUnitConversion.convertSubOrdinalDirection_return convertSubOrdinalDirection158 = null;


        CommonTree DIRECTION153_tree=null;
        CommonTree DIRECTION155_tree=null;
        CommonTree DIRECTION157_tree=null;
        RewriteRuleNodeStream stream_DIRECTION=new RewriteRuleNodeStream(adaptor,"token DIRECTION");
        RewriteRuleSubtreeStream stream_convertSubOrdinalDirection=new RewriteRuleSubtreeStream(adaptor,"rule convertSubOrdinalDirection");
        RewriteRuleSubtreeStream stream_convertOrdinalDirection=new RewriteRuleSubtreeStream(adaptor,"rule convertOrdinalDirection");
        RewriteRuleSubtreeStream stream_convertCardinalDirection=new RewriteRuleSubtreeStream(adaptor,"rule convertCardinalDirection");
        try {
            // flipsUnitConversion.g:275:2: ( ^( DIRECTION convertCardinalDirection ) -> convertCardinalDirection | ^( DIRECTION convertOrdinalDirection ) -> convertOrdinalDirection | ^( DIRECTION convertSubOrdinalDirection ) -> convertSubOrdinalDirection )
            int alt12=3;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // flipsUnitConversion.g:275:4: ^( DIRECTION convertCardinalDirection )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    _last = (CommonTree)input.LT(1);
                    DIRECTION153=(CommonTree)match(input,DIRECTION,FOLLOW_DIRECTION_in_convertDirection1865); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_DIRECTION.add(DIRECTION153);


                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = DIRECTION153;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_convertCardinalDirection_in_convertDirection1867);
                    convertCardinalDirection154=convertCardinalDirection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) stream_convertCardinalDirection.add(convertCardinalDirection154.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: convertCardinalDirection
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 276:2: -> convertCardinalDirection
                    {
                        adaptor.addChild(root_0, stream_convertCardinalDirection.nextTree());

                    }

                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);}
                    }
                    break;
                case 2 :
                    // flipsUnitConversion.g:277:4: ^( DIRECTION convertOrdinalDirection )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    _last = (CommonTree)input.LT(1);
                    DIRECTION155=(CommonTree)match(input,DIRECTION,FOLLOW_DIRECTION_in_convertDirection1879); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_DIRECTION.add(DIRECTION155);


                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = DIRECTION155;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_convertOrdinalDirection_in_convertDirection1881);
                    convertOrdinalDirection156=convertOrdinalDirection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) stream_convertOrdinalDirection.add(convertOrdinalDirection156.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: convertOrdinalDirection
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 278:2: -> convertOrdinalDirection
                    {
                        adaptor.addChild(root_0, stream_convertOrdinalDirection.nextTree());

                    }

                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);}
                    }
                    break;
                case 3 :
                    // flipsUnitConversion.g:279:4: ^( DIRECTION convertSubOrdinalDirection )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    _last = (CommonTree)input.LT(1);
                    DIRECTION157=(CommonTree)match(input,DIRECTION,FOLLOW_DIRECTION_in_convertDirection1893); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_DIRECTION.add(DIRECTION157);


                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = DIRECTION157;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_convertSubOrdinalDirection_in_convertDirection1895);
                    convertSubOrdinalDirection158=convertSubOrdinalDirection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) stream_convertSubOrdinalDirection.add(convertSubOrdinalDirection158.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: convertSubOrdinalDirection
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 280:2: -> convertSubOrdinalDirection
                    {
                        adaptor.addChild(root_0, stream_convertSubOrdinalDirection.nextTree());

                    }

                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);}
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "convertDirection"

    public static class convertRelativeDirection_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "convertRelativeDirection"
    // flipsUnitConversion.g:284:1: convertRelativeDirection : ( ^( DIRECTION RELATIVE LEFT x= convertAngle ) -> ^( DIRECTION RELATIVE ^( ANGLE FloatingPointLiteral[String.valueOf(-x.r)] DEGREE ) ) | ^( DIRECTION RELATIVE RIGHT x= convertAngle ) -> ^( DIRECTION RELATIVE ^( ANGLE FloatingPointLiteral[String.valueOf(x.r)] DEGREE ) ) );
    public final flipsUnitConversion.convertRelativeDirection_return convertRelativeDirection() throws RecognitionException {
        flipsUnitConversion.convertRelativeDirection_return retval = new flipsUnitConversion.convertRelativeDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DIRECTION159=null;
        CommonTree RELATIVE160=null;
        CommonTree LEFT161=null;
        CommonTree DIRECTION162=null;
        CommonTree RELATIVE163=null;
        CommonTree RIGHT164=null;
        flipsUnitConversion.convertAngle_return x = null;


        CommonTree DIRECTION159_tree=null;
        CommonTree RELATIVE160_tree=null;
        CommonTree LEFT161_tree=null;
        CommonTree DIRECTION162_tree=null;
        CommonTree RELATIVE163_tree=null;
        CommonTree RIGHT164_tree=null;
        RewriteRuleNodeStream stream_DIRECTION=new RewriteRuleNodeStream(adaptor,"token DIRECTION");
        RewriteRuleNodeStream stream_RIGHT=new RewriteRuleNodeStream(adaptor,"token RIGHT");
        RewriteRuleNodeStream stream_RELATIVE=new RewriteRuleNodeStream(adaptor,"token RELATIVE");
        RewriteRuleNodeStream stream_LEFT=new RewriteRuleNodeStream(adaptor,"token LEFT");
        RewriteRuleSubtreeStream stream_convertAngle=new RewriteRuleSubtreeStream(adaptor,"rule convertAngle");
        try {
            // flipsUnitConversion.g:285:2: ( ^( DIRECTION RELATIVE LEFT x= convertAngle ) -> ^( DIRECTION RELATIVE ^( ANGLE FloatingPointLiteral[String.valueOf(-x.r)] DEGREE ) ) | ^( DIRECTION RELATIVE RIGHT x= convertAngle ) -> ^( DIRECTION RELATIVE ^( ANGLE FloatingPointLiteral[String.valueOf(x.r)] DEGREE ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==DIRECTION) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==DOWN) ) {
                    int LA13_2 = input.LA(3);

                    if ( (LA13_2==RELATIVE) ) {
                        int LA13_3 = input.LA(4);

                        if ( (LA13_3==LEFT) ) {
                            alt13=1;
                        }
                        else if ( (LA13_3==RIGHT) ) {
                            alt13=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // flipsUnitConversion.g:285:4: ^( DIRECTION RELATIVE LEFT x= convertAngle )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    _last = (CommonTree)input.LT(1);
                    DIRECTION159=(CommonTree)match(input,DIRECTION,FOLLOW_DIRECTION_in_convertRelativeDirection1914); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_DIRECTION.add(DIRECTION159);


                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = DIRECTION159;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    RELATIVE160=(CommonTree)match(input,RELATIVE,FOLLOW_RELATIVE_in_convertRelativeDirection1916); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_RELATIVE.add(RELATIVE160);

                    _last = (CommonTree)input.LT(1);
                    LEFT161=(CommonTree)match(input,LEFT,FOLLOW_LEFT_in_convertRelativeDirection1918); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_LEFT.add(LEFT161);

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_convertAngle_in_convertRelativeDirection1922);
                    x=convertAngle();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) stream_convertAngle.add(x.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: RELATIVE, DIRECTION
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 286:2: -> ^( DIRECTION RELATIVE ^( ANGLE FloatingPointLiteral[String.valueOf(-x.r)] DEGREE ) )
                    {
                        // flipsUnitConversion.g:286:5: ^( DIRECTION RELATIVE ^( ANGLE FloatingPointLiteral[String.valueOf(-x.r)] DEGREE ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_DIRECTION.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_RELATIVE.nextNode());
                        // flipsUnitConversion.g:286:26: ^( ANGLE FloatingPointLiteral[String.valueOf(-x.r)] DEGREE )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ANGLE, "ANGLE"), root_2);

                        adaptor.addChild(root_2, (CommonTree)adaptor.create(FloatingPointLiteral, String.valueOf(-x.r)));
                        adaptor.addChild(root_2, (CommonTree)adaptor.create(DEGREE, "DEGREE"));

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);}
                    }
                    break;
                case 2 :
                    // flipsUnitConversion.g:287:4: ^( DIRECTION RELATIVE RIGHT x= convertAngle )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    _last = (CommonTree)input.LT(1);
                    DIRECTION162=(CommonTree)match(input,DIRECTION,FOLLOW_DIRECTION_in_convertRelativeDirection1947); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_DIRECTION.add(DIRECTION162);


                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = DIRECTION162;
                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    RELATIVE163=(CommonTree)match(input,RELATIVE,FOLLOW_RELATIVE_in_convertRelativeDirection1949); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_RELATIVE.add(RELATIVE163);

                    _last = (CommonTree)input.LT(1);
                    RIGHT164=(CommonTree)match(input,RIGHT,FOLLOW_RIGHT_in_convertRelativeDirection1951); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_RIGHT.add(RIGHT164);

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_convertAngle_in_convertRelativeDirection1955);
                    x=convertAngle();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) stream_convertAngle.add(x.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;_last = _save_last_1;
                    }



                    // AST REWRITE
                    // elements: DIRECTION, RELATIVE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 288:2: -> ^( DIRECTION RELATIVE ^( ANGLE FloatingPointLiteral[String.valueOf(x.r)] DEGREE ) )
                    {
                        // flipsUnitConversion.g:288:5: ^( DIRECTION RELATIVE ^( ANGLE FloatingPointLiteral[String.valueOf(x.r)] DEGREE ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_DIRECTION.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_RELATIVE.nextNode());
                        // flipsUnitConversion.g:288:26: ^( ANGLE FloatingPointLiteral[String.valueOf(x.r)] DEGREE )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ANGLE, "ANGLE"), root_2);

                        adaptor.addChild(root_2, (CommonTree)adaptor.create(FloatingPointLiteral, String.valueOf(x.r)));
                        adaptor.addChild(root_2, (CommonTree)adaptor.create(DEGREE, "DEGREE"));

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);}
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "convertRelativeDirection"

    public static class convertCardinalDirection_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "convertCardinalDirection"
    // flipsUnitConversion.g:292:1: convertCardinalDirection : ( NORTH -> ^( ANGLE FloatingPointLiteral[\"0\"] DEGREE ) | EAST -> ^( ANGLE FloatingPointLiteral[\"90\"] DEGREE ) | SOUTH -> ^( ANGLE FloatingPointLiteral[\"180\"] DEGREE ) | WEST -> ^( ANGLE FloatingPointLiteral[\"270\"] DEGREE ) );
    public final flipsUnitConversion.convertCardinalDirection_return convertCardinalDirection() throws RecognitionException {
        flipsUnitConversion.convertCardinalDirection_return retval = new flipsUnitConversion.convertCardinalDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree NORTH165=null;
        CommonTree EAST166=null;
        CommonTree SOUTH167=null;
        CommonTree WEST168=null;

        CommonTree NORTH165_tree=null;
        CommonTree EAST166_tree=null;
        CommonTree SOUTH167_tree=null;
        CommonTree WEST168_tree=null;
        RewriteRuleNodeStream stream_WEST=new RewriteRuleNodeStream(adaptor,"token WEST");
        RewriteRuleNodeStream stream_NORTH=new RewriteRuleNodeStream(adaptor,"token NORTH");
        RewriteRuleNodeStream stream_SOUTH=new RewriteRuleNodeStream(adaptor,"token SOUTH");
        RewriteRuleNodeStream stream_EAST=new RewriteRuleNodeStream(adaptor,"token EAST");

        try {
            // flipsUnitConversion.g:293:2: ( NORTH -> ^( ANGLE FloatingPointLiteral[\"0\"] DEGREE ) | EAST -> ^( ANGLE FloatingPointLiteral[\"90\"] DEGREE ) | SOUTH -> ^( ANGLE FloatingPointLiteral[\"180\"] DEGREE ) | WEST -> ^( ANGLE FloatingPointLiteral[\"270\"] DEGREE ) )
            int alt14=4;
            switch ( input.LA(1) ) {
            case NORTH:
                {
                alt14=1;
                }
                break;
            case EAST:
                {
                alt14=2;
                }
                break;
            case SOUTH:
                {
                alt14=3;
                }
                break;
            case WEST:
                {
                alt14=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // flipsUnitConversion.g:293:4: NORTH
                    {
                    _last = (CommonTree)input.LT(1);
                    NORTH165=(CommonTree)match(input,NORTH,FOLLOW_NORTH_in_convertCardinalDirection1986); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_NORTH.add(NORTH165);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 294:2: -> ^( ANGLE FloatingPointLiteral[\"0\"] DEGREE )
                    {
                        // flipsUnitConversion.g:294:5: ^( ANGLE FloatingPointLiteral[\"0\"] DEGREE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ANGLE, "ANGLE"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(FloatingPointLiteral, "0"));
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(DEGREE, "DEGREE"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);}
                    }
                    break;
                case 2 :
                    // flipsUnitConversion.g:295:4: EAST
                    {
                    _last = (CommonTree)input.LT(1);
                    EAST166=(CommonTree)match(input,EAST,FOLLOW_EAST_in_convertCardinalDirection2003); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_EAST.add(EAST166);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 296:2: -> ^( ANGLE FloatingPointLiteral[\"90\"] DEGREE )
                    {
                        // flipsUnitConversion.g:296:5: ^( ANGLE FloatingPointLiteral[\"90\"] DEGREE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ANGLE, "ANGLE"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(FloatingPointLiteral, "90"));
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(DEGREE, "DEGREE"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);}
                    }
                    break;
                case 3 :
                    // flipsUnitConversion.g:297:4: SOUTH
                    {
                    _last = (CommonTree)input.LT(1);
                    SOUTH167=(CommonTree)match(input,SOUTH,FOLLOW_SOUTH_in_convertCardinalDirection2020); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_SOUTH.add(SOUTH167);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 298:2: -> ^( ANGLE FloatingPointLiteral[\"180\"] DEGREE )
                    {
                        // flipsUnitConversion.g:298:5: ^( ANGLE FloatingPointLiteral[\"180\"] DEGREE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ANGLE, "ANGLE"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(FloatingPointLiteral, "180"));
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(DEGREE, "DEGREE"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);}
                    }
                    break;
                case 4 :
                    // flipsUnitConversion.g:299:4: WEST
                    {
                    _last = (CommonTree)input.LT(1);
                    WEST168=(CommonTree)match(input,WEST,FOLLOW_WEST_in_convertCardinalDirection2037); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_WEST.add(WEST168);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 300:2: -> ^( ANGLE FloatingPointLiteral[\"270\"] DEGREE )
                    {
                        // flipsUnitConversion.g:300:5: ^( ANGLE FloatingPointLiteral[\"270\"] DEGREE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ANGLE, "ANGLE"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(FloatingPointLiteral, "270"));
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(DEGREE, "DEGREE"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);}
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "convertCardinalDirection"

    public static class convertOrdinalDirection_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "convertOrdinalDirection"
    // flipsUnitConversion.g:304:1: convertOrdinalDirection : ( NORTH EAST -> ^( ANGLE FloatingPointLiteral[\"45\"] DEGREE ) | SOUTH EAST -> ^( ANGLE FloatingPointLiteral[\"135\"] DEGREE ) | SOUTH WEST -> ^( ANGLE FloatingPointLiteral[\"225\"] DEGREE ) | NORTH WEST -> ^( ANGLE FloatingPointLiteral[\"315\"] DEGREE ) );
    public final flipsUnitConversion.convertOrdinalDirection_return convertOrdinalDirection() throws RecognitionException {
        flipsUnitConversion.convertOrdinalDirection_return retval = new flipsUnitConversion.convertOrdinalDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree NORTH169=null;
        CommonTree EAST170=null;
        CommonTree SOUTH171=null;
        CommonTree EAST172=null;
        CommonTree SOUTH173=null;
        CommonTree WEST174=null;
        CommonTree NORTH175=null;
        CommonTree WEST176=null;

        CommonTree NORTH169_tree=null;
        CommonTree EAST170_tree=null;
        CommonTree SOUTH171_tree=null;
        CommonTree EAST172_tree=null;
        CommonTree SOUTH173_tree=null;
        CommonTree WEST174_tree=null;
        CommonTree NORTH175_tree=null;
        CommonTree WEST176_tree=null;
        RewriteRuleNodeStream stream_WEST=new RewriteRuleNodeStream(adaptor,"token WEST");
        RewriteRuleNodeStream stream_NORTH=new RewriteRuleNodeStream(adaptor,"token NORTH");
        RewriteRuleNodeStream stream_SOUTH=new RewriteRuleNodeStream(adaptor,"token SOUTH");
        RewriteRuleNodeStream stream_EAST=new RewriteRuleNodeStream(adaptor,"token EAST");

        try {
            // flipsUnitConversion.g:305:2: ( NORTH EAST -> ^( ANGLE FloatingPointLiteral[\"45\"] DEGREE ) | SOUTH EAST -> ^( ANGLE FloatingPointLiteral[\"135\"] DEGREE ) | SOUTH WEST -> ^( ANGLE FloatingPointLiteral[\"225\"] DEGREE ) | NORTH WEST -> ^( ANGLE FloatingPointLiteral[\"315\"] DEGREE ) )
            int alt15=4;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==NORTH) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==EAST) ) {
                    alt15=1;
                }
                else if ( (LA15_1==WEST) ) {
                    alt15=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA15_0==SOUTH) ) {
                int LA15_2 = input.LA(2);

                if ( (LA15_2==EAST) ) {
                    alt15=2;
                }
                else if ( (LA15_2==WEST) ) {
                    alt15=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // flipsUnitConversion.g:305:4: NORTH EAST
                    {
                    _last = (CommonTree)input.LT(1);
                    NORTH169=(CommonTree)match(input,NORTH,FOLLOW_NORTH_in_convertOrdinalDirection2061); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_NORTH.add(NORTH169);

                    _last = (CommonTree)input.LT(1);
                    EAST170=(CommonTree)match(input,EAST,FOLLOW_EAST_in_convertOrdinalDirection2063); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_EAST.add(EAST170);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 306:2: -> ^( ANGLE FloatingPointLiteral[\"45\"] DEGREE )
                    {
                        // flipsUnitConversion.g:306:5: ^( ANGLE FloatingPointLiteral[\"45\"] DEGREE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ANGLE, "ANGLE"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(FloatingPointLiteral, "45"));
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(DEGREE, "DEGREE"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);}
                    }
                    break;
                case 2 :
                    // flipsUnitConversion.g:307:4: SOUTH EAST
                    {
                    _last = (CommonTree)input.LT(1);
                    SOUTH171=(CommonTree)match(input,SOUTH,FOLLOW_SOUTH_in_convertOrdinalDirection2080); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_SOUTH.add(SOUTH171);

                    _last = (CommonTree)input.LT(1);
                    EAST172=(CommonTree)match(input,EAST,FOLLOW_EAST_in_convertOrdinalDirection2082); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_EAST.add(EAST172);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 308:2: -> ^( ANGLE FloatingPointLiteral[\"135\"] DEGREE )
                    {
                        // flipsUnitConversion.g:308:5: ^( ANGLE FloatingPointLiteral[\"135\"] DEGREE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ANGLE, "ANGLE"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(FloatingPointLiteral, "135"));
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(DEGREE, "DEGREE"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);}
                    }
                    break;
                case 3 :
                    // flipsUnitConversion.g:309:4: SOUTH WEST
                    {
                    _last = (CommonTree)input.LT(1);
                    SOUTH173=(CommonTree)match(input,SOUTH,FOLLOW_SOUTH_in_convertOrdinalDirection2099); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_SOUTH.add(SOUTH173);

                    _last = (CommonTree)input.LT(1);
                    WEST174=(CommonTree)match(input,WEST,FOLLOW_WEST_in_convertOrdinalDirection2101); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_WEST.add(WEST174);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 310:2: -> ^( ANGLE FloatingPointLiteral[\"225\"] DEGREE )
                    {
                        // flipsUnitConversion.g:310:5: ^( ANGLE FloatingPointLiteral[\"225\"] DEGREE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ANGLE, "ANGLE"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(FloatingPointLiteral, "225"));
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(DEGREE, "DEGREE"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);}
                    }
                    break;
                case 4 :
                    // flipsUnitConversion.g:311:4: NORTH WEST
                    {
                    _last = (CommonTree)input.LT(1);
                    NORTH175=(CommonTree)match(input,NORTH,FOLLOW_NORTH_in_convertOrdinalDirection2118); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_NORTH.add(NORTH175);

                    _last = (CommonTree)input.LT(1);
                    WEST176=(CommonTree)match(input,WEST,FOLLOW_WEST_in_convertOrdinalDirection2120); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_WEST.add(WEST176);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 312:2: -> ^( ANGLE FloatingPointLiteral[\"315\"] DEGREE )
                    {
                        // flipsUnitConversion.g:312:5: ^( ANGLE FloatingPointLiteral[\"315\"] DEGREE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ANGLE, "ANGLE"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(FloatingPointLiteral, "315"));
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(DEGREE, "DEGREE"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);}
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "convertOrdinalDirection"

    public static class convertSubOrdinalDirection_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "convertSubOrdinalDirection"
    // flipsUnitConversion.g:316:1: convertSubOrdinalDirection : ( NORTH NORTH EAST -> ^( ANGLE FloatingPointLiteral[\"22.5\"] DEGREE ) | EAST NORTH EAST -> ^( ANGLE FloatingPointLiteral[\"67.5\"] DEGREE ) | EAST SOUTH EAST -> ^( ANGLE FloatingPointLiteral[\"112.5\"] DEGREE ) | SOUTH SOUTH EAST -> ^( ANGLE FloatingPointLiteral[\"157.5\"] DEGREE ) | SOUTH SOUTH WEST -> ^( ANGLE FloatingPointLiteral[\"202.5\"] DEGREE ) | WEST SOUTH WEST -> ^( ANGLE FloatingPointLiteral[\"247.5\"] DEGREE ) | WEST NORTH WEST -> ^( ANGLE FloatingPointLiteral[\"292.5\"] DEGREE ) | NORTH NORTH WEST -> ^( ANGLE FloatingPointLiteral[\"337.5\"] DEGREE ) );
    public final flipsUnitConversion.convertSubOrdinalDirection_return convertSubOrdinalDirection() throws RecognitionException {
        flipsUnitConversion.convertSubOrdinalDirection_return retval = new flipsUnitConversion.convertSubOrdinalDirection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree NORTH177=null;
        CommonTree NORTH178=null;
        CommonTree EAST179=null;
        CommonTree EAST180=null;
        CommonTree NORTH181=null;
        CommonTree EAST182=null;
        CommonTree EAST183=null;
        CommonTree SOUTH184=null;
        CommonTree EAST185=null;
        CommonTree SOUTH186=null;
        CommonTree SOUTH187=null;
        CommonTree EAST188=null;
        CommonTree SOUTH189=null;
        CommonTree SOUTH190=null;
        CommonTree WEST191=null;
        CommonTree WEST192=null;
        CommonTree SOUTH193=null;
        CommonTree WEST194=null;
        CommonTree WEST195=null;
        CommonTree NORTH196=null;
        CommonTree WEST197=null;
        CommonTree NORTH198=null;
        CommonTree NORTH199=null;
        CommonTree WEST200=null;

        CommonTree NORTH177_tree=null;
        CommonTree NORTH178_tree=null;
        CommonTree EAST179_tree=null;
        CommonTree EAST180_tree=null;
        CommonTree NORTH181_tree=null;
        CommonTree EAST182_tree=null;
        CommonTree EAST183_tree=null;
        CommonTree SOUTH184_tree=null;
        CommonTree EAST185_tree=null;
        CommonTree SOUTH186_tree=null;
        CommonTree SOUTH187_tree=null;
        CommonTree EAST188_tree=null;
        CommonTree SOUTH189_tree=null;
        CommonTree SOUTH190_tree=null;
        CommonTree WEST191_tree=null;
        CommonTree WEST192_tree=null;
        CommonTree SOUTH193_tree=null;
        CommonTree WEST194_tree=null;
        CommonTree WEST195_tree=null;
        CommonTree NORTH196_tree=null;
        CommonTree WEST197_tree=null;
        CommonTree NORTH198_tree=null;
        CommonTree NORTH199_tree=null;
        CommonTree WEST200_tree=null;
        RewriteRuleNodeStream stream_WEST=new RewriteRuleNodeStream(adaptor,"token WEST");
        RewriteRuleNodeStream stream_NORTH=new RewriteRuleNodeStream(adaptor,"token NORTH");
        RewriteRuleNodeStream stream_SOUTH=new RewriteRuleNodeStream(adaptor,"token SOUTH");
        RewriteRuleNodeStream stream_EAST=new RewriteRuleNodeStream(adaptor,"token EAST");

        try {
            // flipsUnitConversion.g:317:2: ( NORTH NORTH EAST -> ^( ANGLE FloatingPointLiteral[\"22.5\"] DEGREE ) | EAST NORTH EAST -> ^( ANGLE FloatingPointLiteral[\"67.5\"] DEGREE ) | EAST SOUTH EAST -> ^( ANGLE FloatingPointLiteral[\"112.5\"] DEGREE ) | SOUTH SOUTH EAST -> ^( ANGLE FloatingPointLiteral[\"157.5\"] DEGREE ) | SOUTH SOUTH WEST -> ^( ANGLE FloatingPointLiteral[\"202.5\"] DEGREE ) | WEST SOUTH WEST -> ^( ANGLE FloatingPointLiteral[\"247.5\"] DEGREE ) | WEST NORTH WEST -> ^( ANGLE FloatingPointLiteral[\"292.5\"] DEGREE ) | NORTH NORTH WEST -> ^( ANGLE FloatingPointLiteral[\"337.5\"] DEGREE ) )
            int alt16=8;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // flipsUnitConversion.g:317:4: NORTH NORTH EAST
                    {
                    _last = (CommonTree)input.LT(1);
                    NORTH177=(CommonTree)match(input,NORTH,FOLLOW_NORTH_in_convertSubOrdinalDirection2144); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_NORTH.add(NORTH177);

                    _last = (CommonTree)input.LT(1);
                    NORTH178=(CommonTree)match(input,NORTH,FOLLOW_NORTH_in_convertSubOrdinalDirection2146); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_NORTH.add(NORTH178);

                    _last = (CommonTree)input.LT(1);
                    EAST179=(CommonTree)match(input,EAST,FOLLOW_EAST_in_convertSubOrdinalDirection2148); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_EAST.add(EAST179);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 318:2: -> ^( ANGLE FloatingPointLiteral[\"22.5\"] DEGREE )
                    {
                        // flipsUnitConversion.g:318:5: ^( ANGLE FloatingPointLiteral[\"22.5\"] DEGREE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ANGLE, "ANGLE"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(FloatingPointLiteral, "22.5"));
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(DEGREE, "DEGREE"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);}
                    }
                    break;
                case 2 :
                    // flipsUnitConversion.g:319:4: EAST NORTH EAST
                    {
                    _last = (CommonTree)input.LT(1);
                    EAST180=(CommonTree)match(input,EAST,FOLLOW_EAST_in_convertSubOrdinalDirection2165); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_EAST.add(EAST180);

                    _last = (CommonTree)input.LT(1);
                    NORTH181=(CommonTree)match(input,NORTH,FOLLOW_NORTH_in_convertSubOrdinalDirection2167); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_NORTH.add(NORTH181);

                    _last = (CommonTree)input.LT(1);
                    EAST182=(CommonTree)match(input,EAST,FOLLOW_EAST_in_convertSubOrdinalDirection2169); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_EAST.add(EAST182);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 320:2: -> ^( ANGLE FloatingPointLiteral[\"67.5\"] DEGREE )
                    {
                        // flipsUnitConversion.g:320:5: ^( ANGLE FloatingPointLiteral[\"67.5\"] DEGREE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ANGLE, "ANGLE"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(FloatingPointLiteral, "67.5"));
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(DEGREE, "DEGREE"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);}
                    }
                    break;
                case 3 :
                    // flipsUnitConversion.g:321:4: EAST SOUTH EAST
                    {
                    _last = (CommonTree)input.LT(1);
                    EAST183=(CommonTree)match(input,EAST,FOLLOW_EAST_in_convertSubOrdinalDirection2186); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_EAST.add(EAST183);

                    _last = (CommonTree)input.LT(1);
                    SOUTH184=(CommonTree)match(input,SOUTH,FOLLOW_SOUTH_in_convertSubOrdinalDirection2188); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_SOUTH.add(SOUTH184);

                    _last = (CommonTree)input.LT(1);
                    EAST185=(CommonTree)match(input,EAST,FOLLOW_EAST_in_convertSubOrdinalDirection2190); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_EAST.add(EAST185);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 322:2: -> ^( ANGLE FloatingPointLiteral[\"112.5\"] DEGREE )
                    {
                        // flipsUnitConversion.g:322:5: ^( ANGLE FloatingPointLiteral[\"112.5\"] DEGREE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ANGLE, "ANGLE"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(FloatingPointLiteral, "112.5"));
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(DEGREE, "DEGREE"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);}
                    }
                    break;
                case 4 :
                    // flipsUnitConversion.g:323:4: SOUTH SOUTH EAST
                    {
                    _last = (CommonTree)input.LT(1);
                    SOUTH186=(CommonTree)match(input,SOUTH,FOLLOW_SOUTH_in_convertSubOrdinalDirection2207); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_SOUTH.add(SOUTH186);

                    _last = (CommonTree)input.LT(1);
                    SOUTH187=(CommonTree)match(input,SOUTH,FOLLOW_SOUTH_in_convertSubOrdinalDirection2209); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_SOUTH.add(SOUTH187);

                    _last = (CommonTree)input.LT(1);
                    EAST188=(CommonTree)match(input,EAST,FOLLOW_EAST_in_convertSubOrdinalDirection2211); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_EAST.add(EAST188);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 324:2: -> ^( ANGLE FloatingPointLiteral[\"157.5\"] DEGREE )
                    {
                        // flipsUnitConversion.g:324:5: ^( ANGLE FloatingPointLiteral[\"157.5\"] DEGREE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ANGLE, "ANGLE"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(FloatingPointLiteral, "157.5"));
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(DEGREE, "DEGREE"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);}
                    }
                    break;
                case 5 :
                    // flipsUnitConversion.g:325:4: SOUTH SOUTH WEST
                    {
                    _last = (CommonTree)input.LT(1);
                    SOUTH189=(CommonTree)match(input,SOUTH,FOLLOW_SOUTH_in_convertSubOrdinalDirection2228); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_SOUTH.add(SOUTH189);

                    _last = (CommonTree)input.LT(1);
                    SOUTH190=(CommonTree)match(input,SOUTH,FOLLOW_SOUTH_in_convertSubOrdinalDirection2230); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_SOUTH.add(SOUTH190);

                    _last = (CommonTree)input.LT(1);
                    WEST191=(CommonTree)match(input,WEST,FOLLOW_WEST_in_convertSubOrdinalDirection2232); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_WEST.add(WEST191);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 326:2: -> ^( ANGLE FloatingPointLiteral[\"202.5\"] DEGREE )
                    {
                        // flipsUnitConversion.g:326:5: ^( ANGLE FloatingPointLiteral[\"202.5\"] DEGREE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ANGLE, "ANGLE"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(FloatingPointLiteral, "202.5"));
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(DEGREE, "DEGREE"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);}
                    }
                    break;
                case 6 :
                    // flipsUnitConversion.g:327:4: WEST SOUTH WEST
                    {
                    _last = (CommonTree)input.LT(1);
                    WEST192=(CommonTree)match(input,WEST,FOLLOW_WEST_in_convertSubOrdinalDirection2249); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_WEST.add(WEST192);

                    _last = (CommonTree)input.LT(1);
                    SOUTH193=(CommonTree)match(input,SOUTH,FOLLOW_SOUTH_in_convertSubOrdinalDirection2251); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_SOUTH.add(SOUTH193);

                    _last = (CommonTree)input.LT(1);
                    WEST194=(CommonTree)match(input,WEST,FOLLOW_WEST_in_convertSubOrdinalDirection2253); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_WEST.add(WEST194);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 328:2: -> ^( ANGLE FloatingPointLiteral[\"247.5\"] DEGREE )
                    {
                        // flipsUnitConversion.g:328:5: ^( ANGLE FloatingPointLiteral[\"247.5\"] DEGREE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ANGLE, "ANGLE"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(FloatingPointLiteral, "247.5"));
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(DEGREE, "DEGREE"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);}
                    }
                    break;
                case 7 :
                    // flipsUnitConversion.g:329:4: WEST NORTH WEST
                    {
                    _last = (CommonTree)input.LT(1);
                    WEST195=(CommonTree)match(input,WEST,FOLLOW_WEST_in_convertSubOrdinalDirection2270); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_WEST.add(WEST195);

                    _last = (CommonTree)input.LT(1);
                    NORTH196=(CommonTree)match(input,NORTH,FOLLOW_NORTH_in_convertSubOrdinalDirection2272); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_NORTH.add(NORTH196);

                    _last = (CommonTree)input.LT(1);
                    WEST197=(CommonTree)match(input,WEST,FOLLOW_WEST_in_convertSubOrdinalDirection2274); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_WEST.add(WEST197);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 330:2: -> ^( ANGLE FloatingPointLiteral[\"292.5\"] DEGREE )
                    {
                        // flipsUnitConversion.g:330:5: ^( ANGLE FloatingPointLiteral[\"292.5\"] DEGREE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ANGLE, "ANGLE"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(FloatingPointLiteral, "292.5"));
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(DEGREE, "DEGREE"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);}
                    }
                    break;
                case 8 :
                    // flipsUnitConversion.g:331:4: NORTH NORTH WEST
                    {
                    _last = (CommonTree)input.LT(1);
                    NORTH198=(CommonTree)match(input,NORTH,FOLLOW_NORTH_in_convertSubOrdinalDirection2291); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_NORTH.add(NORTH198);

                    _last = (CommonTree)input.LT(1);
                    NORTH199=(CommonTree)match(input,NORTH,FOLLOW_NORTH_in_convertSubOrdinalDirection2293); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_NORTH.add(NORTH199);

                    _last = (CommonTree)input.LT(1);
                    WEST200=(CommonTree)match(input,WEST,FOLLOW_WEST_in_convertSubOrdinalDirection2295); if (state.failed) return retval; 
                    if ( state.backtracking==1 ) stream_WEST.add(WEST200);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==1 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 332:2: -> ^( ANGLE FloatingPointLiteral[\"337.5\"] DEGREE )
                    {
                        // flipsUnitConversion.g:332:5: ^( ANGLE FloatingPointLiteral[\"337.5\"] DEGREE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ANGLE, "ANGLE"), root_1);

                        adaptor.addChild(root_1, (CommonTree)adaptor.create(FloatingPointLiteral, "337.5"));
                        adaptor.addChild(root_1, (CommonTree)adaptor.create(DEGREE, "DEGREE"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
                    input.replaceChildren(adaptor.getParent(retval.start),
                                          adaptor.getChildIndex(retval.start),
                                          adaptor.getChildIndex(_last),
                                          retval.tree);}
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "convertSubOrdinalDirection"

    public static class percentValue_return extends TreeRuleReturnScope {
        public double r;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "percentValue"
    // flipsUnitConversion.g:336:1: percentValue returns [double r] : x= numericValue PERCENT ;
    public final flipsUnitConversion.percentValue_return percentValue() throws RecognitionException {
        flipsUnitConversion.percentValue_return retval = new flipsUnitConversion.percentValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree PERCENT201=null;
        flipsUnitConversion.numericValue_return x = null;


        CommonTree PERCENT201_tree=null;

        try {
            // flipsUnitConversion.g:337:2: (x= numericValue PERCENT )
            // flipsUnitConversion.g:337:4: x= numericValue PERCENT
            {
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_numericValue_in_percentValue2325);
            x=numericValue();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==1 ) 
             
            if ( _first_0==null ) _first_0 = x.tree;
            _last = (CommonTree)input.LT(1);
            PERCENT201=(CommonTree)match(input,PERCENT,FOLLOW_PERCENT_in_percentValue2327); if (state.failed) return retval;
             
            if ( state.backtracking==1 )
            if ( _first_0==null ) _first_0 = PERCENT201;
            if ( state.backtracking==1 ) {
              retval.r = x.r;
            }

            if ( state.backtracking==1 ) {
            retval.tree = (CommonTree)_first_0;
            if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                retval.tree = (CommonTree)adaptor.getParent(retval.tree);}
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "percentValue"

    public static class numericValue_return extends TreeRuleReturnScope {
        public double r;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numericValue"
    // flipsUnitConversion.g:342:1: numericValue returns [double r] : ( POSITIVE x= integerValue | NEGATIVE x= integerValue | POSITIVE y= FloatingPointLiteral | NEGATIVE y= FloatingPointLiteral );
    public final flipsUnitConversion.numericValue_return numericValue() throws RecognitionException {
        flipsUnitConversion.numericValue_return retval = new flipsUnitConversion.numericValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree y=null;
        CommonTree POSITIVE202=null;
        CommonTree NEGATIVE203=null;
        CommonTree POSITIVE204=null;
        CommonTree NEGATIVE205=null;
        flipsUnitConversion.integerValue_return x = null;


        CommonTree y_tree=null;
        CommonTree POSITIVE202_tree=null;
        CommonTree NEGATIVE203_tree=null;
        CommonTree POSITIVE204_tree=null;
        CommonTree NEGATIVE205_tree=null;

        try {
            // flipsUnitConversion.g:343:2: ( POSITIVE x= integerValue | NEGATIVE x= integerValue | POSITIVE y= FloatingPointLiteral | NEGATIVE y= FloatingPointLiteral )
            int alt17=4;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==POSITIVE) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==FloatingPointLiteral) ) {
                    alt17=3;
                }
                else if ( ((LA17_1>=BinaryLiteral && LA17_1<=HexLiteral)) ) {
                    alt17=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA17_0==NEGATIVE) ) {
                int LA17_2 = input.LA(2);

                if ( (LA17_2==FloatingPointLiteral) ) {
                    alt17=4;
                }
                else if ( ((LA17_2>=BinaryLiteral && LA17_2<=HexLiteral)) ) {
                    alt17=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // flipsUnitConversion.g:343:4: POSITIVE x= integerValue
                    {
                    _last = (CommonTree)input.LT(1);
                    POSITIVE202=(CommonTree)match(input,POSITIVE,FOLLOW_POSITIVE_in_numericValue2347); if (state.failed) return retval;
                     
                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = POSITIVE202;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_integerValue_in_numericValue2351);
                    x=integerValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) 
                     
                    if ( _first_0==null ) _first_0 = x.tree;
                    if ( state.backtracking==1 ) {
                      retval.r = (double) x.r;
                    }

                    if ( state.backtracking==1 ) {
                    retval.tree = (CommonTree)_first_0;
                    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                        retval.tree = (CommonTree)adaptor.getParent(retval.tree);}
                    }
                    break;
                case 2 :
                    // flipsUnitConversion.g:345:4: NEGATIVE x= integerValue
                    {
                    _last = (CommonTree)input.LT(1);
                    NEGATIVE203=(CommonTree)match(input,NEGATIVE,FOLLOW_NEGATIVE_in_numericValue2360); if (state.failed) return retval;
                     
                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = NEGATIVE203;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_integerValue_in_numericValue2364);
                    x=integerValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) 
                     
                    if ( _first_0==null ) _first_0 = x.tree;
                    if ( state.backtracking==1 ) {
                      retval.r = -(double) x.r;
                    }

                    if ( state.backtracking==1 ) {
                    retval.tree = (CommonTree)_first_0;
                    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                        retval.tree = (CommonTree)adaptor.getParent(retval.tree);}
                    }
                    break;
                case 3 :
                    // flipsUnitConversion.g:347:4: POSITIVE y= FloatingPointLiteral
                    {
                    _last = (CommonTree)input.LT(1);
                    POSITIVE204=(CommonTree)match(input,POSITIVE,FOLLOW_POSITIVE_in_numericValue2373); if (state.failed) return retval;
                     
                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = POSITIVE204;
                    _last = (CommonTree)input.LT(1);
                    y=(CommonTree)match(input,FloatingPointLiteral,FOLLOW_FloatingPointLiteral_in_numericValue2377); if (state.failed) return retval;
                     
                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = y;
                    if ( state.backtracking==1 ) {
                      retval.r = Double.parseDouble(y.getText());
                    }

                    if ( state.backtracking==1 ) {
                    retval.tree = (CommonTree)_first_0;
                    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                        retval.tree = (CommonTree)adaptor.getParent(retval.tree);}
                    }
                    break;
                case 4 :
                    // flipsUnitConversion.g:349:4: NEGATIVE y= FloatingPointLiteral
                    {
                    _last = (CommonTree)input.LT(1);
                    NEGATIVE205=(CommonTree)match(input,NEGATIVE,FOLLOW_NEGATIVE_in_numericValue2386); if (state.failed) return retval;
                     
                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = NEGATIVE205;
                    _last = (CommonTree)input.LT(1);
                    y=(CommonTree)match(input,FloatingPointLiteral,FOLLOW_FloatingPointLiteral_in_numericValue2390); if (state.failed) return retval;
                     
                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = y;
                    if ( state.backtracking==1 ) {
                      retval.r = -Double.parseDouble(y.getText());
                    }

                    if ( state.backtracking==1 ) {
                    retval.tree = (CommonTree)_first_0;
                    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                        retval.tree = (CommonTree)adaptor.getParent(retval.tree);}
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "numericValue"

    public static class numericValuePositive_return extends TreeRuleReturnScope {
        public double r;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numericValuePositive"
    // flipsUnitConversion.g:354:1: numericValuePositive returns [double r] : (x= integerValue | y= FloatingPointLiteral );
    public final flipsUnitConversion.numericValuePositive_return numericValuePositive() throws RecognitionException {
        flipsUnitConversion.numericValuePositive_return retval = new flipsUnitConversion.numericValuePositive_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree y=null;
        flipsUnitConversion.integerValue_return x = null;


        CommonTree y_tree=null;

        try {
            // flipsUnitConversion.g:355:2: (x= integerValue | y= FloatingPointLiteral )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=BinaryLiteral && LA18_0<=HexLiteral)) ) {
                alt18=1;
            }
            else if ( (LA18_0==FloatingPointLiteral) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // flipsUnitConversion.g:355:4: x= integerValue
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_integerValue_in_numericValuePositive2412);
                    x=integerValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==1 ) 
                     
                    if ( _first_0==null ) _first_0 = x.tree;
                    if ( state.backtracking==1 ) {
                      retval.r = (double) x.r;
                    }

                    if ( state.backtracking==1 ) {
                    retval.tree = (CommonTree)_first_0;
                    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                        retval.tree = (CommonTree)adaptor.getParent(retval.tree);}
                    }
                    break;
                case 2 :
                    // flipsUnitConversion.g:357:4: y= FloatingPointLiteral
                    {
                    _last = (CommonTree)input.LT(1);
                    y=(CommonTree)match(input,FloatingPointLiteral,FOLLOW_FloatingPointLiteral_in_numericValuePositive2423); if (state.failed) return retval;
                     
                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = y;
                    if ( state.backtracking==1 ) {
                      retval.r = Double.parseDouble(y.getText());
                    }

                    if ( state.backtracking==1 ) {
                    retval.tree = (CommonTree)_first_0;
                    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                        retval.tree = (CommonTree)adaptor.getParent(retval.tree);}
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "numericValuePositive"

    public static class integerValue_return extends TreeRuleReturnScope {
        public int r;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "integerValue"
    // flipsUnitConversion.g:361:1: integerValue returns [int r] : (x= BinaryLiteral | x= OctalLiteral | x= DecimalLiteral | x= HexLiteral );
    public final flipsUnitConversion.integerValue_return integerValue() throws RecognitionException {
        flipsUnitConversion.integerValue_return retval = new flipsUnitConversion.integerValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree x=null;

        CommonTree x_tree=null;

        try {
            // flipsUnitConversion.g:362:2: (x= BinaryLiteral | x= OctalLiteral | x= DecimalLiteral | x= HexLiteral )
            int alt19=4;
            switch ( input.LA(1) ) {
            case BinaryLiteral:
                {
                alt19=1;
                }
                break;
            case OctalLiteral:
                {
                alt19=2;
                }
                break;
            case DecimalLiteral:
                {
                alt19=3;
                }
                break;
            case HexLiteral:
                {
                alt19=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // flipsUnitConversion.g:362:4: x= BinaryLiteral
                    {
                    _last = (CommonTree)input.LT(1);
                    x=(CommonTree)match(input,BinaryLiteral,FOLLOW_BinaryLiteral_in_integerValue2444); if (state.failed) return retval;
                     
                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = x;
                    if ( state.backtracking==1 ) {
                      retval.r = Integer.parseInt(x.getText().substring(2),2);
                    }

                    if ( state.backtracking==1 ) {
                    retval.tree = (CommonTree)_first_0;
                    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                        retval.tree = (CommonTree)adaptor.getParent(retval.tree);}
                    }
                    break;
                case 2 :
                    // flipsUnitConversion.g:364:4: x= OctalLiteral
                    {
                    _last = (CommonTree)input.LT(1);
                    x=(CommonTree)match(input,OctalLiteral,FOLLOW_OctalLiteral_in_integerValue2455); if (state.failed) return retval;
                     
                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = x;
                    if ( state.backtracking==1 ) {
                      retval.r = Integer.parseInt(x.getText().substring(1),8);
                    }

                    if ( state.backtracking==1 ) {
                    retval.tree = (CommonTree)_first_0;
                    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                        retval.tree = (CommonTree)adaptor.getParent(retval.tree);}
                    }
                    break;
                case 3 :
                    // flipsUnitConversion.g:366:4: x= DecimalLiteral
                    {
                    _last = (CommonTree)input.LT(1);
                    x=(CommonTree)match(input,DecimalLiteral,FOLLOW_DecimalLiteral_in_integerValue2466); if (state.failed) return retval;
                     
                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = x;
                    if ( state.backtracking==1 ) {
                      retval.r = Integer.parseInt(x.getText());
                    }

                    if ( state.backtracking==1 ) {
                    retval.tree = (CommonTree)_first_0;
                    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                        retval.tree = (CommonTree)adaptor.getParent(retval.tree);}
                    }
                    break;
                case 4 :
                    // flipsUnitConversion.g:368:4: x= HexLiteral
                    {
                    _last = (CommonTree)input.LT(1);
                    x=(CommonTree)match(input,HexLiteral,FOLLOW_HexLiteral_in_integerValue2477); if (state.failed) return retval;
                     
                    if ( state.backtracking==1 )
                    if ( _first_0==null ) _first_0 = x;
                    if ( state.backtracking==1 ) {
                      retval.r = Integer.parseInt(x.getText().substring(2),16);
                    }

                    if ( state.backtracking==1 ) {
                    retval.tree = (CommonTree)_first_0;
                    if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
                        retval.tree = (CommonTree)adaptor.getParent(retval.tree);}
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "integerValue"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA2 dfa2 = new DFA2(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA1_eotS =
        "\46\uffff";
    static final String DFA1_eofS =
        "\46\uffff";
    static final String DFA1_minS =
        "\1\10\2\uffff\1\2\2\uffff\2\2\1\uffff\1\2\1\17\1\20\1\17\1\20\1"+
        "\uffff\1\130\2\uffff\2\151\7\uffff\12\33\1\uffff";
    static final String DFA1_maxS =
        "\1\101\2\uffff\1\2\2\uffff\2\2\1\uffff\1\2\2\125\1\20\1\115\1\uffff"+
        "\1\132\2\uffff\2\155\7\uffff\12\72\1\uffff";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\7\1\10\2\uffff\1\15\5\uffff\1\4\1\uffff"+
        "\1\3\1\12\2\uffff\1\16\1\13\1\14\1\20\1\17\1\5\1\6\12\uffff\1\11";
    static final String DFA1_specialS =
        "\46\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1\4\uffff\1\11\6\uffff\2\10\1\uffff\1\6\2\uffff\1\7\1\uffff"+
            "\1\2\21\uffff\1\10\2\uffff\1\3\16\uffff\1\4\1\5",
            "",
            "",
            "\1\12",
            "",
            "",
            "\1\13",
            "\1\14",
            "",
            "\1\15",
            "\1\16\1\17\103\uffff\2\20",
            "\1\21\3\uffff\2\24\30\uffff\1\24\45\uffff\1\22\1\23",
            "\1\25\1\26",
            "\1\27\71\uffff\4\30",
            "",
            "\2\31\1\32",
            "",
            "",
            "\1\33\1\34\1\35\1\36\1\37",
            "\1\40\1\41\1\42\1\43\1\44",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\24\26\uffff\11\45",
            "\1\24\26\uffff\11\45",
            "\1\24\26\uffff\11\45",
            "\1\24\26\uffff\11\45",
            "\1\24\26\uffff\11\45",
            "\1\24\26\uffff\11\45",
            "\1\24\26\uffff\11\45",
            "\1\24\26\uffff\11\45",
            "\1\24\26\uffff\11\45",
            "\1\24\26\uffff\11\45",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "39:1: topdown : ( convertParameter | convertTime | convertDistance | convertAltitude | convertRelativeDistance | convertRelativeAltitude | convertFlightLevel | convertPressure | convertSpeed | convertRelativeSpeed | convertFixedThrottle | convertRelativeThrottle | convertAngle | convertAngularRate | convertDirection | convertRelativeDirection );";
        }
    }
    static final String DFA2_eotS =
        "\26\uffff";
    static final String DFA2_eofS =
        "\26\uffff";
    static final String DFA2_minS =
        "\1\34\1\2\1\52\1\2\2\uffff\1\152\4\3\1\53\1\2\1\uffff\1\151\4\3"+
        "\1\uffff\1\3\1\uffff";
    static final String DFA2_maxS =
        "\1\34\1\2\1\155\1\2\2\uffff\1\155\4\3\1\54\1\2\1\uffff\1\155\4\3"+
        "\1\uffff\1\54\1\uffff";
    static final String DFA2_acceptS =
        "\4\uffff\1\5\1\1\7\uffff\1\3\5\uffff\1\2\1\uffff\1\4";
    static final String DFA2_specialS =
        "\26\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3\1\4\75\uffff\5\5",
            "\1\6",
            "",
            "",
            "\1\7\1\10\1\11\1\12",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\14\1\15",
            "\1\16",
            "",
            "\1\23\1\17\1\20\1\21\1\22",
            "\1\24",
            "\1\24",
            "\1\24",
            "\1\24",
            "",
            "\1\23\50\uffff\1\25",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "68:1: convertTime returns [double r] : ( ^( TIME x= numericValuePositive y= convertTimeUnit ) -> ^( TIME FloatingPointLiteral[String.valueOf($r)] SECOND ) | ^( TIME ^( HOUR hr= integerValue ) ^( MINUTE minn= numericValuePositive ) ) -> ^( TIME FloatingPointLiteral[String.valueOf($r)] SECOND ) | ^( TIME ^( HOUR hr= integerValue ) ^( SECOND s= numericValuePositive ) ) -> ^( TIME FloatingPointLiteral[String.valueOf($r)] SECOND ) | ^( TIME ^( HOUR hr= integerValue ) ^( MINUTE min= integerValue ) ^( SECOND s= numericValuePositive ) ) -> ^( TIME FloatingPointLiteral[String.valueOf($r)] SECOND ) | ^( TIME ^( MINUTE min= integerValue ) ^( SECOND s= numericValuePositive ) ) -> ^( TIME FloatingPointLiteral[String.valueOf($r)] SECOND ) );";
        }
    }
    static final String DFA5_eotS =
        "\12\uffff";
    static final String DFA5_eofS =
        "\12\uffff";
    static final String DFA5_minS =
        "\1\61\1\2\1\20\1\130\1\126\1\73\4\uffff";
    static final String DFA5_maxS =
        "\1\61\1\2\1\20\1\131\1\127\1\74\4\uffff";
    static final String DFA5_acceptS =
        "\6\uffff\1\1\1\2\1\3\1\4";
    static final String DFA5_specialS =
        "\12\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4\1\5",
            "\1\6\1\7",
            "\1\10\1\11",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "142:1: convertRelativeDistance : ( ^( DISTANCE RELATIVE X FORWARD x= convertDistance ) -> ^( DISTANCE RELATIVE X ^( DISTANCE FloatingPointLiteral[String.valueOf(x.r)] METER ) ) | ^( DISTANCE RELATIVE X BACKWARD x= convertDistance ) -> ^( DISTANCE RELATIVE X ^( DISTANCE FloatingPointLiteral[String.valueOf(-x.r)] METER ) ) | ^( DISTANCE RELATIVE Y LEFT x= convertDistance ) -> ^( DISTANCE RELATIVE Y ^( DISTANCE FloatingPointLiteral[String.valueOf(-x.r)] METER ) ) | ^( DISTANCE RELATIVE Y RIGHT x= convertDistance ) -> ^( DISTANCE RELATIVE Y ^( DISTANCE FloatingPointLiteral[String.valueOf(x.r)] METER ) ) );";
        }
    }
    static final String DFA6_eotS =
        "\13\uffff";
    static final String DFA6_eofS =
        "\13\uffff";
    static final String DFA6_minS =
        "\1\61\1\2\1\20\1\132\1\110\2\61\4\uffff";
    static final String DFA6_maxS =
        "\1\61\1\2\1\20\1\132\1\111\2\101\4\uffff";
    static final String DFA6_acceptS =
        "\7\uffff\1\3\1\1\1\4\1\2";
    static final String DFA6_specialS =
        "\13\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4",
            "\1\5\1\6",
            "\1\10\17\uffff\1\7",
            "\1\12\17\uffff\1\11",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "154:1: convertRelativeAltitude : ( ^( DISTANCE RELATIVE Z CLIMB x= convertDistance ) -> ^( DISTANCE RELATIVE Z ^( DISTANCE FloatingPointLiteral[String.valueOf(-x.r)] METER ) ) | ^( DISTANCE RELATIVE Z DESCEND x= convertDistance ) -> ^( DISTANCE RELATIVE Z ^( DISTANCE FloatingPointLiteral[String.valueOf(x.r)] METER ) ) | ^( DISTANCE RELATIVE Z CLIMB y= convertPressure ) -> ^( DISTANCE RELATIVE Z ^( PRESSURE FloatingPointLiteral[String.valueOf(-y.r)] PASCAL ) ) | ^( DISTANCE RELATIVE Z DESCEND y= convertPressure ) -> ^( DISTANCE RELATIVE Z ^( PRESSURE FloatingPointLiteral[String.valueOf(y.r)] PASCAL ) ) );";
        }
    }
    static final String DFA8_eotS =
        "\46\uffff";
    static final String DFA8_eofS =
        "\46\uffff";
    static final String DFA8_minS =
        "\1\27\1\2\1\20\1\30\2\27\2\2\2\124\4\151\24\62\4\uffff";
    static final String DFA8_maxS =
        "\1\27\1\2\1\20\1\31\2\27\2\2\2\125\4\155\24\77\4\uffff";
    static final String DFA8_acceptS =
        "\42\uffff\1\3\1\1\1\4\1\2";
    static final String DFA8_specialS =
        "\46\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4\1\5",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\12\1\13",
            "\1\14\1\15",
            "\1\16\1\17\1\20\1\21\1\22",
            "\1\23\1\24\1\25\1\26\1\27",
            "\1\30\1\31\1\32\1\33\1\34",
            "\1\35\1\36\1\37\1\40\1\41",
            "\11\43\4\uffff\1\42",
            "\11\43\4\uffff\1\42",
            "\11\43\4\uffff\1\42",
            "\11\43\4\uffff\1\42",
            "\11\43\4\uffff\1\42",
            "\11\43\4\uffff\1\42",
            "\11\43\4\uffff\1\42",
            "\11\43\4\uffff\1\42",
            "\11\43\4\uffff\1\42",
            "\11\43\4\uffff\1\42",
            "\11\45\4\uffff\1\44",
            "\11\45\4\uffff\1\44",
            "\11\45\4\uffff\1\44",
            "\11\45\4\uffff\1\44",
            "\11\45\4\uffff\1\44",
            "\11\45\4\uffff\1\44",
            "\11\45\4\uffff\1\44",
            "\11\45\4\uffff\1\44",
            "\11\45\4\uffff\1\44",
            "\11\45\4\uffff\1\44",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "206:1: convertRelativeSpeed : ( ^( SPEED RELATIVE FASTER x= convertSpeed ) -> ^( SPEED RELATIVE ^( SPEED FloatingPointLiteral[String.valueOf(x.r)] METER SECOND ) ) | ^( SPEED RELATIVE SLOWER x= convertSpeed ) -> ^( SPEED RELATIVE ^( SPEED FloatingPointLiteral[String.valueOf(-x.r)] METER SECOND ) ) | ^( SPEED RELATIVE FASTER ^( SPEED y= percentValue ) ) -> ^( SPEED RELATIVE ^( SPEED FloatingPointLiteral[String.valueOf(y.r)] PERCENT ) ) | ^( SPEED RELATIVE SLOWER ^( SPEED y= percentValue ) ) -> ^( SPEED RELATIVE ^( SPEED FloatingPointLiteral[String.valueOf(-y.r)] PERCENT ) ) );";
        }
    }
    static final String DFA9_eotS =
        "\46\uffff";
    static final String DFA9_eofS =
        "\46\uffff";
    static final String DFA9_minS =
        "\1\32\1\2\1\20\1\30\2\27\2\2\2\24\2\151\2\uffff\2\151\24\33\2\uffff";
    static final String DFA9_maxS =
        "\1\32\1\2\1\20\1\31\2\27\2\2\2\125\2\155\2\uffff\2\155\24\77\2\uffff";
    static final String DFA9_acceptS =
        "\14\uffff\1\3\1\4\26\uffff\1\1\1\2";
    static final String DFA9_specialS =
        "\46\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4\1\5",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "\2\14\30\uffff\1\14\45\uffff\1\12\1\13",
            "\2\15\30\uffff\1\15\45\uffff\1\16\1\17",
            "\1\20\1\21\1\22\1\23\1\24",
            "\1\25\1\26\1\27\1\30\1\31",
            "",
            "",
            "\1\32\1\33\1\34\1\35\1\36",
            "\1\37\1\40\1\41\1\42\1\43",
            "\1\14\43\uffff\1\44",
            "\1\14\43\uffff\1\44",
            "\1\14\43\uffff\1\44",
            "\1\14\43\uffff\1\44",
            "\1\14\43\uffff\1\44",
            "\1\14\43\uffff\1\44",
            "\1\14\43\uffff\1\44",
            "\1\14\43\uffff\1\44",
            "\1\14\43\uffff\1\44",
            "\1\14\43\uffff\1\44",
            "\1\15\43\uffff\1\45",
            "\1\15\43\uffff\1\45",
            "\1\15\43\uffff\1\45",
            "\1\15\43\uffff\1\45",
            "\1\15\43\uffff\1\45",
            "\1\15\43\uffff\1\45",
            "\1\15\43\uffff\1\45",
            "\1\15\43\uffff\1\45",
            "\1\15\43\uffff\1\45",
            "\1\15\43\uffff\1\45",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "224:1: convertRelativeThrottle : ( ^( THROTTLE RELATIVE FASTER ^( SPEED x= percentValue ) ) -> ^( THROTTLE RELATIVE ^( SPEED FloatingPointLiteral[String.valueOf(x.r)] PERCENT ) ) | ^( THROTTLE RELATIVE SLOWER ^( SPEED x= percentValue ) ) -> ^( THROTTLE RELATIVE ^( SPEED FloatingPointLiteral[String.valueOf(-x.r)] PERCENT ) ) | ^( THROTTLE RELATIVE FASTER y= convertAngularRate ) -> ^( THROTTLE RELATIVE ^( SPEED FloatingPointLiteral[String.valueOf(y.r)] DEGREE SECOND ) ) | ^( THROTTLE RELATIVE SLOWER y= convertAngularRate ) -> ^( THROTTLE RELATIVE ^( SPEED FloatingPointLiteral[String.valueOf(-y.r)] DEGREE SECOND ) ) );";
        }
    }
    static final String DFA10_eotS =
        "\43\uffff";
    static final String DFA10_eofS =
        "\43\uffff";
    static final String DFA10_minS =
        "\1\24\1\2\2\uffff\1\124\2\151\12\57\1\uffff\2\3\1\uffff\4\53\1\uffff"+
        "\4\53\1\uffff\2\3\2\uffff";
    static final String DFA10_maxS =
        "\1\56\1\2\2\uffff\1\125\2\155\12\60\1\uffff\2\155\1\uffff\4\53\1"+
        "\uffff\4\53\1\uffff\2\155\2\uffff";
    static final String DFA10_acceptS =
        "\2\uffff\1\7\1\10\15\uffff\1\2\2\uffff\1\1\4\uffff\1\3\4\uffff\1"+
        "\5\2\uffff\1\4\1\6";
    static final String DFA10_specialS =
        "\43\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\2\1\3\30\uffff\1\1",
            "\1\4",
            "",
            "",
            "\1\5\1\6",
            "\1\7\1\10\1\11\1\12\1\13",
            "\1\14\1\15\1\16\1\17\1\20",
            "\1\22\1\21",
            "\1\22\1\21",
            "\1\22\1\21",
            "\1\22\1\21",
            "\1\22\1\21",
            "\1\23\1\21",
            "\1\23\1\21",
            "\1\23\1\21",
            "\1\23\1\21",
            "\1\23\1\21",
            "",
            "\1\24\145\uffff\1\31\1\25\1\26\1\27\1\30",
            "\1\24\145\uffff\1\36\1\32\1\33\1\34\1\35",
            "",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\37",
            "",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\40",
            "",
            "\1\31\145\uffff\5\41",
            "\1\36\145\uffff\5\42",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "236:1: convertAngle returns [double r] : ( ^( ANGLE x= numericValue DEGREE ) -> ^( ANGLE FloatingPointLiteral[String.valueOf($r)] DEGREE ) | ^( ANGLE x= numericValue RADIAN ) -> ^( ANGLE FloatingPointLiteral[String.valueOf($r)] DEGREE ) | ^( ANGLE POSITIVE deg= numericValuePositive DEGREE minNum= numericValuePositive MINUTE ) -> ^( ANGLE FloatingPointLiteral[String.valueOf($r)] DEGREE ) | ^( ANGLE POSITIVE deg= numericValuePositive DEGREE minInt= integerValue MINUTE sec= numericValuePositive SECOND ) -> ^( ANGLE FloatingPointLiteral[String.valueOf($r)] DEGREE ) | ^( ANGLE NEGATIVE deg= numericValuePositive DEGREE minNum= numericValuePositive MINUTE ) -> ^( ANGLE FloatingPointLiteral[String.valueOf($r)] DEGREE ) | ^( ANGLE NEGATIVE deg= numericValuePositive DEGREE minInt= integerValue MINUTE sec= numericValuePositive SECOND ) -> ^( ANGLE FloatingPointLiteral[String.valueOf($r)] DEGREE ) | STRAIGHT -> ^( ANGLE FloatingPointLiteral[\"0\"] DEGREE ) | LEVEL -> ^( ANGLE FloatingPointLiteral[\"0\"] DEGREE ) );";
        }
    }
    static final String DFA12_eotS =
        "\12\uffff";
    static final String DFA12_eofS =
        "\12\uffff";
    static final String DFA12_minS =
        "\1\15\1\2\1\112\4\3\3\uffff";
    static final String DFA12_maxS =
        "\1\15\1\2\3\115\2\113\3\uffff";
    static final String DFA12_acceptS =
        "\7\uffff\1\2\1\3\1\1";
    static final String DFA12_specialS =
        "\12\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3\1\4\1\5\1\6",
            "\1\11\106\uffff\1\10\1\uffff\2\7",
            "\1\11\107\uffff\1\10\2\7",
            "\1\11\106\uffff\2\10",
            "\1\11\106\uffff\2\10",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "274:1: convertDirection : ( ^( DIRECTION convertCardinalDirection ) -> convertCardinalDirection | ^( DIRECTION convertOrdinalDirection ) -> convertOrdinalDirection | ^( DIRECTION convertSubOrdinalDirection ) -> convertSubOrdinalDirection );";
        }
    }
    static final String DFA16_eotS =
        "\17\uffff";
    static final String DFA16_eofS =
        "\17\uffff";
    static final String DFA16_minS =
        "\3\112\1\113\1\112\1\114\2\uffff\1\114\6\uffff";
    static final String DFA16_maxS =
        "\1\115\1\112\3\113\1\115\2\uffff\1\115\6\uffff";
    static final String DFA16_acceptS =
        "\6\uffff\1\2\1\3\1\uffff\1\6\1\7\1\1\1\10\1\4\1\5";
    static final String DFA16_specialS =
        "\17\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\1\1\3\1\2\1\4",
            "\1\5",
            "\1\6\1\7",
            "\1\10",
            "\1\12\1\11",
            "\1\13\1\14",
            "",
            "",
            "\1\15\1\16",
            "",
            "",
            "",
            "",
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
            return "316:1: convertSubOrdinalDirection : ( NORTH NORTH EAST -> ^( ANGLE FloatingPointLiteral[\"22.5\"] DEGREE ) | EAST NORTH EAST -> ^( ANGLE FloatingPointLiteral[\"67.5\"] DEGREE ) | EAST SOUTH EAST -> ^( ANGLE FloatingPointLiteral[\"112.5\"] DEGREE ) | SOUTH SOUTH EAST -> ^( ANGLE FloatingPointLiteral[\"157.5\"] DEGREE ) | SOUTH SOUTH WEST -> ^( ANGLE FloatingPointLiteral[\"202.5\"] DEGREE ) | WEST SOUTH WEST -> ^( ANGLE FloatingPointLiteral[\"247.5\"] DEGREE ) | WEST NORTH WEST -> ^( ANGLE FloatingPointLiteral[\"292.5\"] DEGREE ) | NORTH NORTH WEST -> ^( ANGLE FloatingPointLiteral[\"337.5\"] DEGREE ) );";
        }
    }
 

    public static final BitSet FOLLOW_convertParameter_in_topdown75 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_convertTime_in_topdown80 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_convertDistance_in_topdown85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_convertAltitude_in_topdown90 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_convertRelativeDistance_in_topdown95 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_convertRelativeAltitude_in_topdown100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_convertFlightLevel_in_topdown105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_convertPressure_in_topdown110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_convertSpeed_in_topdown115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_convertRelativeSpeed_in_topdown120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_convertFixedThrottle_in_topdown125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_convertRelativeThrottle_in_topdown130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_convertAngle_in_topdown135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_convertAngularRate_in_topdown140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_convertDirection_in_topdown145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_convertRelativeDirection_in_topdown150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARAMETER_in_convertParameter167 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_numericValue_in_convertParameter171 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIME_in_convertTime205 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_numericValuePositive_in_convertTime209 = new BitSet(new long[]{0x00003FC000000000L});
    public static final BitSet FOLLOW_convertTimeUnit_in_convertTime213 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIME_in_convertTime236 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_HOUR_in_convertTime239 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_integerValue_in_convertTime243 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUTE_in_convertTime247 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_numericValuePositive_in_convertTime251 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIME_in_convertTime275 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_HOUR_in_convertTime278 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_integerValue_in_convertTime282 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SECOND_in_convertTime286 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_numericValuePositive_in_convertTime290 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIME_in_convertTime314 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_HOUR_in_convertTime317 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_integerValue_in_convertTime321 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUTE_in_convertTime325 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_integerValue_in_convertTime329 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SECOND_in_convertTime333 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_numericValuePositive_in_convertTime337 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIME_in_convertTime361 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MINUTE_in_convertTime364 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_integerValue_in_convertTime368 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SECOND_in_convertTime372 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_numericValuePositive_in_convertTime376 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_YEAR_in_convertTimeUnit410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FORTNIGHT_in_convertTimeUnit419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WEEK_in_convertTimeUnit428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DAY_in_convertTimeUnit437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOUR_in_convertTimeUnit446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUTE_in_convertTimeUnit455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SECOND_in_convertTimeUnit464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MILLISECOND_in_convertTimeUnit473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DISTANCE_in_convertDistance494 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_numericValue_in_convertDistance498 = new BitSet(new long[]{0x07FC000000000000L});
    public static final BitSet FOLLOW_convertDistanceUnit_in_convertDistance502 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_KILOMETER_in_convertDistanceUnit535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METER_in_convertDistanceUnit544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CENTIMETER_in_convertDistanceUnit553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAUTICAL_in_convertDistanceUnit562 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_MILE_in_convertDistanceUnit564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MILE_in_convertDistanceUnit573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FURLONG_in_convertDistanceUnit582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YARD_in_convertDistanceUnit591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOOT_in_convertDistanceUnit600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INCH_in_convertDistanceUnit609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DISTANCE_in_convertAltitude626 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_convertAltitude628 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_Z_in_convertAltitude630 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_convertDistance_in_convertAltitude634 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISTANCE_in_convertRelativeDistance668 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_convertRelativeDistance670 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_X_in_convertRelativeDistance672 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_FORWARD_in_convertRelativeDistance674 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_convertDistance_in_convertRelativeDistance678 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISTANCE_in_convertRelativeDistance705 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_convertRelativeDistance707 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_X_in_convertRelativeDistance709 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_BACKWARD_in_convertRelativeDistance711 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_convertDistance_in_convertRelativeDistance715 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISTANCE_in_convertRelativeDistance742 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_convertRelativeDistance744 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_Y_in_convertRelativeDistance746 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_LEFT_in_convertRelativeDistance748 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_convertDistance_in_convertRelativeDistance752 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISTANCE_in_convertRelativeDistance779 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_convertRelativeDistance781 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_Y_in_convertRelativeDistance783 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_RIGHT_in_convertRelativeDistance785 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_convertDistance_in_convertRelativeDistance789 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISTANCE_in_convertRelativeAltitude823 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_convertRelativeAltitude825 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_Z_in_convertRelativeAltitude827 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_CLIMB_in_convertRelativeAltitude829 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_convertDistance_in_convertRelativeAltitude833 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISTANCE_in_convertRelativeAltitude860 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_convertRelativeAltitude862 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_Z_in_convertRelativeAltitude864 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_DESCEND_in_convertRelativeAltitude866 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_convertDistance_in_convertRelativeAltitude870 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISTANCE_in_convertRelativeAltitude897 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_convertRelativeAltitude899 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_Z_in_convertRelativeAltitude901 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_CLIMB_in_convertRelativeAltitude903 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_convertPressure_in_convertRelativeAltitude907 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISTANCE_in_convertRelativeAltitude934 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_convertRelativeAltitude936 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_Z_in_convertRelativeAltitude938 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_DESCEND_in_convertRelativeAltitude940 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_convertPressure_in_convertRelativeAltitude944 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FLIGHTLEVEL_in_convertFlightLevel982 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FlightLevel_in_convertFlightLevel986 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRESSURE_in_convertPressure1020 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_numericValue_in_convertPressure1024 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000FCL});
    public static final BitSet FOLLOW_convertPressureUnit_in_convertPressure1028 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_KILOPASCAL_in_convertPressureUnit1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HECTOPASCAL_in_convertPressureUnit1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PASCAL_in_convertPressureUnit1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BAR_in_convertPressureUnit1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MILLIBAR_in_convertPressureUnit1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATMOSPHERE_in_convertPressureUnit1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPEED_in_convertSpeed1127 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_numericValue_in_convertSpeed1131 = new BitSet(new long[]{0x07FC000000000000L});
    public static final BitSet FOLLOW_convertDistanceUnit_in_convertSpeed1135 = new BitSet(new long[]{0x00003FC000000000L});
    public static final BitSet FOLLOW_convertTimeUnit_in_convertSpeed1139 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SPEED_in_convertRelativeSpeed1171 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_convertRelativeSpeed1173 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_FASTER_in_convertRelativeSpeed1175 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_convertSpeed_in_convertRelativeSpeed1179 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SPEED_in_convertRelativeSpeed1206 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_convertRelativeSpeed1208 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_SLOWER_in_convertRelativeSpeed1210 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_convertSpeed_in_convertRelativeSpeed1214 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SPEED_in_convertRelativeSpeed1241 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_convertRelativeSpeed1243 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_FASTER_in_convertRelativeSpeed1245 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_SPEED_in_convertRelativeSpeed1248 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_percentValue_in_convertRelativeSpeed1252 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SPEED_in_convertRelativeSpeed1278 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_convertRelativeSpeed1280 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_SLOWER_in_convertRelativeSpeed1282 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_SPEED_in_convertRelativeSpeed1285 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_percentValue_in_convertRelativeSpeed1289 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_THROTTLE_in_convertFixedThrottle1322 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIXED_in_convertFixedThrottle1324 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_SPEED_in_convertFixedThrottle1327 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_percentValue_in_convertFixedThrottle1331 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_THROTTLE_in_convertRelativeThrottle1364 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_convertRelativeThrottle1366 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_FASTER_in_convertRelativeThrottle1368 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_SPEED_in_convertRelativeThrottle1371 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_percentValue_in_convertRelativeThrottle1375 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_THROTTLE_in_convertRelativeThrottle1401 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_convertRelativeThrottle1403 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_SLOWER_in_convertRelativeThrottle1405 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_SPEED_in_convertRelativeThrottle1408 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_percentValue_in_convertRelativeThrottle1412 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_THROTTLE_in_convertRelativeThrottle1438 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_convertRelativeThrottle1440 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_FASTER_in_convertRelativeThrottle1442 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_convertAngularRate_in_convertRelativeThrottle1446 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_THROTTLE_in_convertRelativeThrottle1473 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_convertRelativeThrottle1475 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_SLOWER_in_convertRelativeThrottle1477 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_convertAngularRate_in_convertRelativeThrottle1481 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ANGLE_in_convertAngle1519 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_numericValue_in_convertAngle1523 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_DEGREE_in_convertAngle1525 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ANGLE_in_convertAngle1548 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_numericValue_in_convertAngle1552 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_RADIAN_in_convertAngle1554 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ANGLE_in_convertAngle1577 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_POSITIVE_in_convertAngle1579 = new BitSet(new long[]{0x0000000000000000L,0x00003E0000000000L});
    public static final BitSet FOLLOW_numericValuePositive_in_convertAngle1583 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_DEGREE_in_convertAngle1585 = new BitSet(new long[]{0x0000000000000000L,0x00003E0000000000L});
    public static final BitSet FOLLOW_numericValuePositive_in_convertAngle1589 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_MINUTE_in_convertAngle1591 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ANGLE_in_convertAngle1614 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_POSITIVE_in_convertAngle1616 = new BitSet(new long[]{0x0000000000000000L,0x00003E0000000000L});
    public static final BitSet FOLLOW_numericValuePositive_in_convertAngle1620 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_DEGREE_in_convertAngle1622 = new BitSet(new long[]{0x0000000000000000L,0x00003C0000000000L});
    public static final BitSet FOLLOW_integerValue_in_convertAngle1626 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_MINUTE_in_convertAngle1628 = new BitSet(new long[]{0x0000000000000000L,0x00003E0000000000L});
    public static final BitSet FOLLOW_numericValuePositive_in_convertAngle1632 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_SECOND_in_convertAngle1634 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ANGLE_in_convertAngle1657 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NEGATIVE_in_convertAngle1659 = new BitSet(new long[]{0x0000000000000000L,0x00003E0000000000L});
    public static final BitSet FOLLOW_numericValuePositive_in_convertAngle1663 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_DEGREE_in_convertAngle1665 = new BitSet(new long[]{0x0000000000000000L,0x00003E0000000000L});
    public static final BitSet FOLLOW_numericValuePositive_in_convertAngle1669 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_MINUTE_in_convertAngle1671 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ANGLE_in_convertAngle1694 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NEGATIVE_in_convertAngle1696 = new BitSet(new long[]{0x0000000000000000L,0x00003E0000000000L});
    public static final BitSet FOLLOW_numericValuePositive_in_convertAngle1700 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_DEGREE_in_convertAngle1702 = new BitSet(new long[]{0x0000000000000000L,0x00003C0000000000L});
    public static final BitSet FOLLOW_integerValue_in_convertAngle1706 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_MINUTE_in_convertAngle1708 = new BitSet(new long[]{0x0000000000000000L,0x00003E0000000000L});
    public static final BitSet FOLLOW_numericValuePositive_in_convertAngle1712 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_SECOND_in_convertAngle1714 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRAIGHT_in_convertAngle1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEVEL_in_convertAngle1757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPEED_in_convertAngularRate1790 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertAngle_in_convertAngularRate1794 = new BitSet(new long[]{0x00003FC000000000L});
    public static final BitSet FOLLOW_convertTimeUnit_in_convertAngularRate1798 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SPEED_in_convertAngularRate1823 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_numericValue_in_convertAngularRate1827 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_REVOLUTION_in_convertAngularRate1829 = new BitSet(new long[]{0x00003FC000000000L});
    public static final BitSet FOLLOW_convertTimeUnit_in_convertAngularRate1833 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTION_in_convertDirection1865 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertCardinalDirection_in_convertDirection1867 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTION_in_convertDirection1879 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertOrdinalDirection_in_convertDirection1881 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTION_in_convertDirection1893 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_convertSubOrdinalDirection_in_convertDirection1895 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTION_in_convertRelativeDirection1914 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_convertRelativeDirection1916 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_LEFT_in_convertRelativeDirection1918 = new BitSet(new long[]{0x0000400000300000L});
    public static final BitSet FOLLOW_convertAngle_in_convertRelativeDirection1922 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTION_in_convertRelativeDirection1947 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RELATIVE_in_convertRelativeDirection1949 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_RIGHT_in_convertRelativeDirection1951 = new BitSet(new long[]{0x0000400000300000L});
    public static final BitSet FOLLOW_convertAngle_in_convertRelativeDirection1955 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NORTH_in_convertCardinalDirection1986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EAST_in_convertCardinalDirection2003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SOUTH_in_convertCardinalDirection2020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WEST_in_convertCardinalDirection2037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NORTH_in_convertOrdinalDirection2061 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_EAST_in_convertOrdinalDirection2063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SOUTH_in_convertOrdinalDirection2080 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_EAST_in_convertOrdinalDirection2082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SOUTH_in_convertOrdinalDirection2099 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_WEST_in_convertOrdinalDirection2101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NORTH_in_convertOrdinalDirection2118 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_WEST_in_convertOrdinalDirection2120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NORTH_in_convertSubOrdinalDirection2144 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_NORTH_in_convertSubOrdinalDirection2146 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_EAST_in_convertSubOrdinalDirection2148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EAST_in_convertSubOrdinalDirection2165 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_NORTH_in_convertSubOrdinalDirection2167 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_EAST_in_convertSubOrdinalDirection2169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EAST_in_convertSubOrdinalDirection2186 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_SOUTH_in_convertSubOrdinalDirection2188 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_EAST_in_convertSubOrdinalDirection2190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SOUTH_in_convertSubOrdinalDirection2207 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_SOUTH_in_convertSubOrdinalDirection2209 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_EAST_in_convertSubOrdinalDirection2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SOUTH_in_convertSubOrdinalDirection2228 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_SOUTH_in_convertSubOrdinalDirection2230 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_WEST_in_convertSubOrdinalDirection2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WEST_in_convertSubOrdinalDirection2249 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_SOUTH_in_convertSubOrdinalDirection2251 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_WEST_in_convertSubOrdinalDirection2253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WEST_in_convertSubOrdinalDirection2270 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_NORTH_in_convertSubOrdinalDirection2272 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_WEST_in_convertSubOrdinalDirection2274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NORTH_in_convertSubOrdinalDirection2291 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_NORTH_in_convertSubOrdinalDirection2293 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_WEST_in_convertSubOrdinalDirection2295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericValue_in_percentValue2325 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_PERCENT_in_percentValue2327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POSITIVE_in_numericValue2347 = new BitSet(new long[]{0x0000000000000000L,0x00003C0000000000L});
    public static final BitSet FOLLOW_integerValue_in_numericValue2351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEGATIVE_in_numericValue2360 = new BitSet(new long[]{0x0000000000000000L,0x00003C0000000000L});
    public static final BitSet FOLLOW_integerValue_in_numericValue2364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POSITIVE_in_numericValue2373 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_FloatingPointLiteral_in_numericValue2377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEGATIVE_in_numericValue2386 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_FloatingPointLiteral_in_numericValue2390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerValue_in_numericValuePositive2412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FloatingPointLiteral_in_numericValuePositive2423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BinaryLiteral_in_integerValue2444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OctalLiteral_in_integerValue2455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DecimalLiteral_in_integerValue2466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HexLiteral_in_integerValue2477 = new BitSet(new long[]{0x0000000000000002L});

}