// Generated from C:/Users/eva/Documents/MusicSoftware/Esquisse/src/main/java/format/durationGrammar/motifGrammar.g4 by ANTLR 4.13.1
package format.durationGrammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class motifGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, ID=64, WS=65, INTEGER=66;
	public static final int
		RULE_main = 0, RULE_motif = 1, RULE_seriesMotif = 2, RULE_orMotif = 3, 
		RULE_loopMotif = 4, RULE_loopNumber = 5, RULE_linearMotif = 6, RULE_linearMotifDuration = 7, 
		RULE_linearMotifPitch = 8, RULE_linearMotifMove = 9, RULE_pitch = 10, 
		RULE_absolutePitch = 11, RULE_relativePitch = 12, RULE_simplePitch = 13, 
		RULE_pitchName = 14, RULE_octaveNumber = 15, RULE_octaveModifier = 16, 
		RULE_move = 17, RULE_moveNumber = 18, RULE_durationSpec = 19, RULE_duration = 20, 
		RULE_compoundDuration = 21, RULE_simpleDuration = 22, RULE_mute = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "motif", "seriesMotif", "orMotif", "loopMotif", "loopNumber", 
			"linearMotif", "linearMotifDuration", "linearMotifPitch", "linearMotifMove", 
			"pitch", "absolutePitch", "relativePitch", "simplePitch", "pitchName", 
			"octaveNumber", "octaveModifier", "move", "moveNumber", "durationSpec", 
			"duration", "compoundDuration", "simpleDuration", "mute"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'OR'", "'LOOP'", "'0'", "'1'", "'2'", "'3'", "'4'", 
			"'5'", "'6'", "'7'", "'8'", "'9'", "'.'", "'a'", "'aes'", "'ais'", "'b'", 
			"'bes'", "'bis'", "'c'", "'ces'", "'cis'", "'d'", "'des'", "'dis'", "'e'", 
			"'ees'", "'eis'", "'f'", "'fes'", "'fis'", "'g'", "'ges'", "'gis'", "'r'", 
			"'o0'", "'o1'", "'o2'", "'o3'", "'o4'", "'o5'", "'o6'", "'o7'", "'o+'", 
			"'o++'", "'o-'", "'o--'", "'m'", "'-7'", "'-6'", "'-5'", "'-4'", "'-3'", 
			"'-2'", "'-1'", "'['", "']'", "'16'", "'32'", "'64'", "'mute'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "ID", "WS", "INTEGER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "motifGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public motifGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public MotifContext motif() {
			return getRuleContext(MotifContext.class,0);
		}
		public TerminalNode EOF() { return getToken(motifGrammarParser.EOF, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof motifGrammarListener ) ((motifGrammarListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof motifGrammarListener ) ((motifGrammarListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof motifGrammarVisitor ) return ((motifGrammarVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			motif();
			setState(49);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MotifContext extends ParserRuleContext {
		public LinearMotifContext linearMotif() {
			return getRuleContext(LinearMotifContext.class,0);
		}
		public SeriesMotifContext seriesMotif() {
			return getRuleContext(SeriesMotifContext.class,0);
		}
		public OrMotifContext orMotif() {
			return getRuleContext(OrMotifContext.class,0);
		}
		public LoopMotifContext loopMotif() {
			return getRuleContext(LoopMotifContext.class,0);
		}
		public MotifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_motif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof motifGrammarListener ) ((motifGrammarListener)listener).enterMotif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof motifGrammarListener ) ((motifGrammarListener)listener).exitMotif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof motifGrammarVisitor ) return ((motifGrammarVisitor<? extends T>)visitor).visitMotif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MotifContext motif() throws RecognitionException {
		MotifContext _localctx = new MotifContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_motif);
		try {
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				linearMotif();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				seriesMotif();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
				orMotif();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(54);
				loopMotif();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SeriesMotifContext extends ParserRuleContext {
		public List<MotifContext> motif() {
			return getRuleContexts(MotifContext.class);
		}
		public MotifContext motif(int i) {
			return getRuleContext(MotifContext.class,i);
		}
		public SeriesMotifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seriesMotif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof motifGrammarListener ) ((motifGrammarListener)listener).enterSeriesMotif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof motifGrammarListener ) ((motifGrammarListener)listener).exitSeriesMotif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof motifGrammarVisitor ) return ((motifGrammarVisitor<? extends T>)visitor).visitSeriesMotif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeriesMotifContext seriesMotif() throws RecognitionException {
		SeriesMotifContext _localctx = new SeriesMotifContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_seriesMotif);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(T__0);
			setState(59); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(58);
				motif();
				}
				}
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(63);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrMotifContext extends ParserRuleContext {
		public List<MotifContext> motif() {
			return getRuleContexts(MotifContext.class);
		}
		public MotifContext motif(int i) {
			return getRuleContext(MotifContext.class,i);
		}
		public OrMotifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orMotif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof motifGrammarListener ) ((motifGrammarListener)listener).enterOrMotif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof motifGrammarListener ) ((motifGrammarListener)listener).exitOrMotif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof motifGrammarVisitor ) return ((motifGrammarVisitor<? extends T>)visitor).visitOrMotif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrMotifContext orMotif() throws RecognitionException {
		OrMotifContext _localctx = new OrMotifContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_orMotif);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(T__0);
			setState(66);
			match(T__2);
			setState(68); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(67);
				motif();
				}
				}
				setState(70); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(72);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LoopMotifContext extends ParserRuleContext {
		public LoopNumberContext loopNumber() {
			return getRuleContext(LoopNumberContext.class,0);
		}
		public MotifContext motif() {
			return getRuleContext(MotifContext.class,0);
		}
		public LoopMotifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopMotif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof motifGrammarListener ) ((motifGrammarListener)listener).enterLoopMotif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof motifGrammarListener ) ((motifGrammarListener)listener).exitLoopMotif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof motifGrammarVisitor ) return ((motifGrammarVisitor<? extends T>)visitor).visitLoopMotif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopMotifContext loopMotif() throws RecognitionException {
		LoopMotifContext _localctx = new LoopMotifContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_loopMotif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(T__0);
			setState(75);
			match(T__3);
			setState(76);
			loopNumber();
			setState(77);
			motif();
			setState(78);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LoopNumberContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(motifGrammarParser.INTEGER, 0); }
		public LoopNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof motifGrammarListener ) ((motifGrammarListener)listener).enterLoopNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof motifGrammarListener ) ((motifGrammarListener)listener).exitLoopNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof motifGrammarVisitor ) return ((motifGrammarVisitor<? extends T>)visitor).visitLoopNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopNumberContext loopNumber() throws RecognitionException {
		LoopNumberContext _localctx = new LoopNumberContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_loopNumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_la = _input.LA(1);
			if ( !(((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & 2305843009213694975L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LinearMotifContext extends ParserRuleContext {
		public LinearMotifDurationContext linearMotifDuration() {
			return getRuleContext(LinearMotifDurationContext.class,0);
		}
		public LinearMotifPitchContext linearMotifPitch() {
			return getRuleContext(LinearMotifPitchContext.class,0);
		}
		public LinearMotifMoveContext linearMotifMove() {
			return getRuleContext(LinearMotifMoveContext.class,0);
		}
		public LinearMotifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linearMotif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof motifGrammarListener ) ((motifGrammarListener)listener).enterLinearMotif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof motifGrammarListener ) ((motifGrammarListener)listener).exitLinearMotif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof motifGrammarVisitor ) return ((motifGrammarVisitor<? extends T>)visitor).visitLinearMotif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinearMotifContext linearMotif() throws RecognitionException {
		LinearMotifContext _localctx = new LinearMotifContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_linearMotif);
		try {
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				linearMotifDuration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				linearMotifPitch();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				linearMotifMove();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LinearMotifDurationContext extends ParserRuleContext {
		public List<DurationSpecContext> durationSpec() {
			return getRuleContexts(DurationSpecContext.class);
		}
		public DurationSpecContext durationSpec(int i) {
			return getRuleContext(DurationSpecContext.class,i);
		}
		public LinearMotifDurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linearMotifDuration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof motifGrammarListener ) ((motifGrammarListener)listener).enterLinearMotifDuration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof motifGrammarListener ) ((motifGrammarListener)listener).exitLinearMotifDuration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof motifGrammarVisitor ) return ((motifGrammarVisitor<? extends T>)visitor).visitLinearMotifDuration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinearMotifDurationContext linearMotifDuration() throws RecognitionException {
		LinearMotifDurationContext _localctx = new LinearMotifDurationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_linearMotifDuration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__0);
			setState(89); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(88);
				durationSpec();
				}
				}
				setState(91); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8358680908399649472L) != 0) );
			setState(93);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LinearMotifPitchContext extends ParserRuleContext {
		public List<PitchContext> pitch() {
			return getRuleContexts(PitchContext.class);
		}
		public PitchContext pitch(int i) {
			return getRuleContext(PitchContext.class,i);
		}
		public LinearMotifPitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linearMotifPitch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof motifGrammarListener ) ((motifGrammarListener)listener).enterLinearMotifPitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof motifGrammarListener ) ((motifGrammarListener)listener).exitLinearMotifPitch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof motifGrammarVisitor ) return ((motifGrammarVisitor<? extends T>)visitor).visitLinearMotifPitch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinearMotifPitchContext linearMotifPitch() throws RecognitionException {
		LinearMotifPitchContext _localctx = new LinearMotifPitchContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_linearMotifPitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T__0);
			setState(97); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(96);
				pitch();
				}
				}
				setState(99); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 274877841408L) != 0) );
			setState(101);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LinearMotifMoveContext extends ParserRuleContext {
		public List<MoveContext> move() {
			return getRuleContexts(MoveContext.class);
		}
		public MoveContext move(int i) {
			return getRuleContext(MoveContext.class,i);
		}
		public LinearMotifMoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linearMotifMove; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof motifGrammarListener ) ((motifGrammarListener)listener).enterLinearMotifMove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof motifGrammarListener ) ((motifGrammarListener)listener).exitLinearMotifMove(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof motifGrammarVisitor ) return ((motifGrammarVisitor<? extends T>)visitor).visitLinearMotifMove(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinearMotifMoveContext linearMotifMove() throws RecognitionException {
		LinearMotifMoveContext _localctx = new LinearMotifMoveContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_linearMotifMove);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__0);
			setState(105); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(104);
				move();
				}
				}
				setState(107); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__49 );
			setState(109);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PitchContext extends ParserRuleContext {
		public AbsolutePitchContext absolutePitch() {
			return getRuleContext(AbsolutePitchContext.class,0);
		}
		public RelativePitchContext relativePitch() {
			return getRuleContext(RelativePitchContext.class,0);
		}
		public SimplePitchContext simplePitch() {
			return getRuleContext(SimplePitchContext.class,0);
		}
		public PitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pitch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof motifGrammarListener ) ((motifGrammarListener)listener).enterPitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof motifGrammarListener ) ((motifGrammarListener)listener).exitPitch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof motifGrammarVisitor ) return ((motifGrammarVisitor<? extends T>)visitor).visitPitch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PitchContext pitch() throws RecognitionException {
		PitchContext _localctx = new PitchContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_pitch);
		try {
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				absolutePitch();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				relativePitch();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				simplePitch();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AbsolutePitchContext extends ParserRuleContext {
		public PitchNameContext pitchName() {
			return getRuleContext(PitchNameContext.class,0);
		}
		public OctaveNumberContext octaveNumber() {
			return getRuleContext(OctaveNumberContext.class,0);
		}
		public AbsolutePitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_absolutePitch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof motifGrammarListener ) ((motifGrammarListener)listener).enterAbsolutePitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof motifGrammarListener ) ((motifGrammarListener)listener).exitAbsolutePitch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof motifGrammarVisitor ) return ((motifGrammarVisitor<? extends T>)visitor).visitAbsolutePitch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbsolutePitchContext absolutePitch() throws RecognitionException {
		AbsolutePitchContext _localctx = new AbsolutePitchContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_absolutePitch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			pitchName();
			setState(117);
			match(T__14);
			setState(118);
			octaveNumber();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelativePitchContext extends ParserRuleContext {
		public PitchNameContext pitchName() {
			return getRuleContext(PitchNameContext.class,0);
		}
		public OctaveModifierContext octaveModifier() {
			return getRuleContext(OctaveModifierContext.class,0);
		}
		public RelativePitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relativePitch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof motifGrammarListener ) ((motifGrammarListener)listener).enterRelativePitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof motifGrammarListener ) ((motifGrammarListener)listener).exitRelativePitch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof motifGrammarVisitor ) return ((motifGrammarVisitor<? extends T>)visitor).visitRelativePitch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelativePitchContext relativePitch() throws RecognitionException {
		RelativePitchContext _localctx = new RelativePitchContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_relativePitch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			pitchName();
			setState(121);
			match(T__14);
			setState(122);
			octaveModifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimplePitchContext extends ParserRuleContext {
		public PitchNameContext pitchName() {
			return getRuleContext(PitchNameContext.class,0);
		}
		public SimplePitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simplePitch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof motifGrammarListener ) ((motifGrammarListener)listener).enterSimplePitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof motifGrammarListener ) ((motifGrammarListener)listener).exitSimplePitch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof motifGrammarVisitor ) return ((motifGrammarVisitor<? extends T>)visitor).visitSimplePitch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimplePitchContext simplePitch() throws RecognitionException {
		SimplePitchContext _localctx = new SimplePitchContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_simplePitch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			pitchName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PitchNameContext extends ParserRuleContext {
		public PitchNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pitchName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof motifGrammarListener ) ((motifGrammarListener)listener).enterPitchName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof motifGrammarListener ) ((motifGrammarListener)listener).exitPitchName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof motifGrammarVisitor ) return ((motifGrammarVisitor<? extends T>)visitor).visitPitchName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PitchNameContext pitchName() throws RecognitionException {
		PitchNameContext _localctx = new PitchNameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_pitchName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 274877841408L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OctaveNumberContext extends ParserRuleContext {
		public OctaveNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_octaveNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof motifGrammarListener ) ((motifGrammarListener)listener).enterOctaveNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof motifGrammarListener ) ((motifGrammarListener)listener).exitOctaveNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof motifGrammarVisitor ) return ((motifGrammarVisitor<? extends T>)visitor).visitOctaveNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OctaveNumberContext octaveNumber() throws RecognitionException {
		OctaveNumberContext _localctx = new OctaveNumberContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_octaveNumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 70093866270720L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OctaveModifierContext extends ParserRuleContext {
		public OctaveModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_octaveModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof motifGrammarListener ) ((motifGrammarListener)listener).enterOctaveModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof motifGrammarListener ) ((motifGrammarListener)listener).exitOctaveModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof motifGrammarVisitor ) return ((motifGrammarVisitor<? extends T>)visitor).visitOctaveModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OctaveModifierContext octaveModifier() throws RecognitionException {
		OctaveModifierContext _localctx = new OctaveModifierContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_octaveModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1055531162664960L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MoveContext extends ParserRuleContext {
		public MoveNumberContext moveNumber() {
			return getRuleContext(MoveNumberContext.class,0);
		}
		public MoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof motifGrammarListener ) ((motifGrammarListener)listener).enterMove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof motifGrammarListener ) ((motifGrammarListener)listener).exitMove(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof motifGrammarVisitor ) return ((motifGrammarVisitor<? extends T>)visitor).visitMove(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoveContext move() throws RecognitionException {
		MoveContext _localctx = new MoveContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_move);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(T__49);
			setState(133);
			moveNumber();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MoveNumberContext extends ParserRuleContext {
		public MoveNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moveNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof motifGrammarListener ) ((motifGrammarListener)listener).enterMoveNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof motifGrammarListener ) ((motifGrammarListener)listener).exitMoveNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof motifGrammarVisitor ) return ((motifGrammarVisitor<? extends T>)visitor).visitMoveNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoveNumberContext moveNumber() throws RecognitionException {
		MoveNumberContext _localctx = new MoveNumberContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_moveNumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 285978576338034656L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DurationSpecContext extends ParserRuleContext {
		public DurationContext duration() {
			return getRuleContext(DurationContext.class,0);
		}
		public MuteContext mute() {
			return getRuleContext(MuteContext.class,0);
		}
		public DurationSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_durationSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof motifGrammarListener ) ((motifGrammarListener)listener).enterDurationSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof motifGrammarListener ) ((motifGrammarListener)listener).exitDurationSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof motifGrammarVisitor ) return ((motifGrammarVisitor<? extends T>)visitor).visitDurationSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DurationSpecContext durationSpec() throws RecognitionException {
		DurationSpecContext _localctx = new DurationSpecContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_durationSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			duration();
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__62) {
				{
				setState(138);
				mute();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DurationContext extends ParserRuleContext {
		public SimpleDurationContext simpleDuration() {
			return getRuleContext(SimpleDurationContext.class,0);
		}
		public CompoundDurationContext compoundDuration() {
			return getRuleContext(CompoundDurationContext.class,0);
		}
		public DurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_duration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof motifGrammarListener ) ((motifGrammarListener)listener).enterDuration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof motifGrammarListener ) ((motifGrammarListener)listener).exitDuration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof motifGrammarVisitor ) return ((motifGrammarVisitor<? extends T>)visitor).visitDuration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DurationContext duration() throws RecognitionException {
		DurationContext _localctx = new DurationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_duration);
		try {
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
			case T__8:
			case T__12:
			case T__59:
			case T__60:
			case T__61:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				simpleDuration();
				}
				break;
			case T__57:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				compoundDuration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompoundDurationContext extends ParserRuleContext {
		public List<SimpleDurationContext> simpleDuration() {
			return getRuleContexts(SimpleDurationContext.class);
		}
		public SimpleDurationContext simpleDuration(int i) {
			return getRuleContext(SimpleDurationContext.class,i);
		}
		public CompoundDurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundDuration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof motifGrammarListener ) ((motifGrammarListener)listener).enterCompoundDuration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof motifGrammarListener ) ((motifGrammarListener)listener).exitCompoundDuration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof motifGrammarVisitor ) return ((motifGrammarVisitor<? extends T>)visitor).visitCompoundDuration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundDurationContext compoundDuration() throws RecognitionException {
		CompoundDurationContext _localctx = new CompoundDurationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_compoundDuration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__57);
			setState(147); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(146);
				simpleDuration();
				}
				}
				setState(149); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8070450532247937728L) != 0) );
			setState(151);
			match(T__58);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleDurationContext extends ParserRuleContext {
		public SimpleDurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleDuration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof motifGrammarListener ) ((motifGrammarListener)listener).enterSimpleDuration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof motifGrammarListener ) ((motifGrammarListener)listener).exitSimpleDuration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof motifGrammarVisitor ) return ((motifGrammarVisitor<? extends T>)visitor).visitSimpleDuration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleDurationContext simpleDuration() throws RecognitionException {
		SimpleDurationContext _localctx = new SimpleDurationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_simpleDuration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8070450532247937728L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MuteContext extends ParserRuleContext {
		public MuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof motifGrammarListener ) ((motifGrammarListener)listener).enterMute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof motifGrammarListener ) ((motifGrammarListener)listener).exitMute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof motifGrammarVisitor ) return ((motifGrammarVisitor<? extends T>)visitor).visitMute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MuteContext mute() throws RecognitionException {
		MuteContext _localctx = new MuteContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_mute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(T__62);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001B\u009e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"8\b\u0001\u0001\u0002\u0001\u0002\u0004\u0002<\b\u0002\u000b\u0002\f\u0002"+
		"=\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003"+
		"E\b\u0003\u000b\u0003\f\u0003F\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006V\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0004\u0007Z\b\u0007\u000b\u0007\f\u0007[\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0004\bb\b\b\u000b\b\f\bc\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0004\tj\b\t\u000b\t\f\tk\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0003\ns\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u008c\b\u0013\u0001\u0014\u0001\u0014\u0003\u0014\u0090\b\u0014\u0001"+
		"\u0015\u0001\u0015\u0004\u0015\u0094\b\u0015\u000b\u0015\f\u0015\u0095"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0000\u0000\u0018\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.\u0000\u0006\u0002"+
		"\u0000\u0005\u000eBB\u0001\u0000\u0010%\u0001\u0000&-\u0001\u0000.1\u0002"+
		"\u0000\u0005\f39\u0004\u0000\u0006\u0007\t\t\r\r<>\u0094\u00000\u0001"+
		"\u0000\u0000\u0000\u00027\u0001\u0000\u0000\u0000\u00049\u0001\u0000\u0000"+
		"\u0000\u0006A\u0001\u0000\u0000\u0000\bJ\u0001\u0000\u0000\u0000\nP\u0001"+
		"\u0000\u0000\u0000\fU\u0001\u0000\u0000\u0000\u000eW\u0001\u0000\u0000"+
		"\u0000\u0010_\u0001\u0000\u0000\u0000\u0012g\u0001\u0000\u0000\u0000\u0014"+
		"r\u0001\u0000\u0000\u0000\u0016t\u0001\u0000\u0000\u0000\u0018x\u0001"+
		"\u0000\u0000\u0000\u001a|\u0001\u0000\u0000\u0000\u001c~\u0001\u0000\u0000"+
		"\u0000\u001e\u0080\u0001\u0000\u0000\u0000 \u0082\u0001\u0000\u0000\u0000"+
		"\"\u0084\u0001\u0000\u0000\u0000$\u0087\u0001\u0000\u0000\u0000&\u0089"+
		"\u0001\u0000\u0000\u0000(\u008f\u0001\u0000\u0000\u0000*\u0091\u0001\u0000"+
		"\u0000\u0000,\u0099\u0001\u0000\u0000\u0000.\u009b\u0001\u0000\u0000\u0000"+
		"01\u0003\u0002\u0001\u000012\u0005\u0000\u0000\u00012\u0001\u0001\u0000"+
		"\u0000\u000038\u0003\f\u0006\u000048\u0003\u0004\u0002\u000058\u0003\u0006"+
		"\u0003\u000068\u0003\b\u0004\u000073\u0001\u0000\u0000\u000074\u0001\u0000"+
		"\u0000\u000075\u0001\u0000\u0000\u000076\u0001\u0000\u0000\u00008\u0003"+
		"\u0001\u0000\u0000\u00009;\u0005\u0001\u0000\u0000:<\u0003\u0002\u0001"+
		"\u0000;:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=;\u0001\u0000"+
		"\u0000\u0000=>\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?@\u0005"+
		"\u0002\u0000\u0000@\u0005\u0001\u0000\u0000\u0000AB\u0005\u0001\u0000"+
		"\u0000BD\u0005\u0003\u0000\u0000CE\u0003\u0002\u0001\u0000DC\u0001\u0000"+
		"\u0000\u0000EF\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001"+
		"\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HI\u0005\u0002\u0000\u0000"+
		"I\u0007\u0001\u0000\u0000\u0000JK\u0005\u0001\u0000\u0000KL\u0005\u0004"+
		"\u0000\u0000LM\u0003\n\u0005\u0000MN\u0003\u0002\u0001\u0000NO\u0005\u0002"+
		"\u0000\u0000O\t\u0001\u0000\u0000\u0000PQ\u0007\u0000\u0000\u0000Q\u000b"+
		"\u0001\u0000\u0000\u0000RV\u0003\u000e\u0007\u0000SV\u0003\u0010\b\u0000"+
		"TV\u0003\u0012\t\u0000UR\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000"+
		"UT\u0001\u0000\u0000\u0000V\r\u0001\u0000\u0000\u0000WY\u0005\u0001\u0000"+
		"\u0000XZ\u0003&\u0013\u0000YX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000"+
		"\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\]\u0001\u0000"+
		"\u0000\u0000]^\u0005\u0002\u0000\u0000^\u000f\u0001\u0000\u0000\u0000"+
		"_a\u0005\u0001\u0000\u0000`b\u0003\u0014\n\u0000a`\u0001\u0000\u0000\u0000"+
		"bc\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000"+
		"\u0000de\u0001\u0000\u0000\u0000ef\u0005\u0002\u0000\u0000f\u0011\u0001"+
		"\u0000\u0000\u0000gi\u0005\u0001\u0000\u0000hj\u0003\"\u0011\u0000ih\u0001"+
		"\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000"+
		"kl\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mn\u0005\u0002\u0000"+
		"\u0000n\u0013\u0001\u0000\u0000\u0000os\u0003\u0016\u000b\u0000ps\u0003"+
		"\u0018\f\u0000qs\u0003\u001a\r\u0000ro\u0001\u0000\u0000\u0000rp\u0001"+
		"\u0000\u0000\u0000rq\u0001\u0000\u0000\u0000s\u0015\u0001\u0000\u0000"+
		"\u0000tu\u0003\u001c\u000e\u0000uv\u0005\u000f\u0000\u0000vw\u0003\u001e"+
		"\u000f\u0000w\u0017\u0001\u0000\u0000\u0000xy\u0003\u001c\u000e\u0000"+
		"yz\u0005\u000f\u0000\u0000z{\u0003 \u0010\u0000{\u0019\u0001\u0000\u0000"+
		"\u0000|}\u0003\u001c\u000e\u0000}\u001b\u0001\u0000\u0000\u0000~\u007f"+
		"\u0007\u0001\u0000\u0000\u007f\u001d\u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0007\u0002\u0000\u0000\u0081\u001f\u0001\u0000\u0000\u0000\u0082\u0083"+
		"\u0007\u0003\u0000\u0000\u0083!\u0001\u0000\u0000\u0000\u0084\u0085\u0005"+
		"2\u0000\u0000\u0085\u0086\u0003$\u0012\u0000\u0086#\u0001\u0000\u0000"+
		"\u0000\u0087\u0088\u0007\u0004\u0000\u0000\u0088%\u0001\u0000\u0000\u0000"+
		"\u0089\u008b\u0003(\u0014\u0000\u008a\u008c\u0003.\u0017\u0000\u008b\u008a"+
		"\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\'\u0001"+
		"\u0000\u0000\u0000\u008d\u0090\u0003,\u0016\u0000\u008e\u0090\u0003*\u0015"+
		"\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u008e\u0001\u0000\u0000"+
		"\u0000\u0090)\u0001\u0000\u0000\u0000\u0091\u0093\u0005:\u0000\u0000\u0092"+
		"\u0094\u0003,\u0016\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0094\u0095"+
		"\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095\u0096"+
		"\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0098"+
		"\u0005;\u0000\u0000\u0098+\u0001\u0000\u0000\u0000\u0099\u009a\u0007\u0005"+
		"\u0000\u0000\u009a-\u0001\u0000\u0000\u0000\u009b\u009c\u0005?\u0000\u0000"+
		"\u009c/\u0001\u0000\u0000\u0000\u000b7=FU[ckr\u008b\u008f\u0095";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}