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
		ID=60, WS=61;
	public static final int
		RULE_main = 0, RULE_linearMotif = 1, RULE_linearMotifDuration = 2, RULE_linearMotifPitch = 3, 
		RULE_linearMotifPitchMove = 4, RULE_pitch = 5, RULE_absolutePitch = 6, 
		RULE_relativePitch = 7, RULE_simplePitch = 8, RULE_pitchName = 9, RULE_octaveNumber = 10, 
		RULE_octaveModifier = 11, RULE_pitchMove = 12, RULE_pitchMoveNumber = 13, 
		RULE_duration = 14, RULE_compoundDuration = 15, RULE_simpleDuration = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "linearMotif", "linearMotifDuration", "linearMotifPitch", "linearMotifPitchMove", 
			"pitch", "absolutePitch", "relativePitch", "simplePitch", "pitchName", 
			"octaveNumber", "octaveModifier", "pitchMove", "pitchMoveNumber", "duration", 
			"compoundDuration", "simpleDuration"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'.'", "'a'", "'aes'", "'ais'", "'b'", "'bes'", "'bis'", 
			"'c'", "'ces'", "'cis'", "'d'", "'des'", "'dis'", "'e'", "'ees'", "'eis'", 
			"'f'", "'fes'", "'fis'", "'g'", "'ges'", "'gis'", "'r'", "'o0'", "'o1'", 
			"'o2'", "'o3'", "'o4'", "'o5'", "'o6'", "'o7'", "'o+'", "'o++'", "'o-'", 
			"'o--'", "'m'", "'-7'", "'-6'", "'-5'", "'-4'", "'-3'", "'-2'", "'-1'", 
			"'0'", "'1'", "'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'['", "']'", 
			"'8'", "'16'", "'32'", "'64'"
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
			"ID", "WS"
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
		public LinearMotifContext linearMotif() {
			return getRuleContext(LinearMotifContext.class,0);
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
			setState(34);
			linearMotif();
			setState(35);
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
	public static class LinearMotifContext extends ParserRuleContext {
		public LinearMotifDurationContext linearMotifDuration() {
			return getRuleContext(LinearMotifDurationContext.class,0);
		}
		public LinearMotifPitchContext linearMotifPitch() {
			return getRuleContext(LinearMotifPitchContext.class,0);
		}
		public LinearMotifPitchMoveContext linearMotifPitchMove() {
			return getRuleContext(LinearMotifPitchMoveContext.class,0);
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
		enterRule(_localctx, 2, RULE_linearMotif);
		try {
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				linearMotifDuration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				linearMotifPitch();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				linearMotifPitchMove();
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
		public List<DurationContext> duration() {
			return getRuleContexts(DurationContext.class);
		}
		public DurationContext duration(int i) {
			return getRuleContext(DurationContext.class,i);
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
		enterRule(_localctx, 4, RULE_linearMotifDuration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(T__0);
			setState(44); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(43);
				duration();
				}
				}
				setState(46); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1100426421450309632L) != 0) );
			setState(48);
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
		enterRule(_localctx, 6, RULE_linearMotifPitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__0);
			setState(52); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(51);
				pitch();
				}
				}
				setState(54); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 67108848L) != 0) );
			setState(56);
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
	public static class LinearMotifPitchMoveContext extends ParserRuleContext {
		public List<PitchMoveContext> pitchMove() {
			return getRuleContexts(PitchMoveContext.class);
		}
		public PitchMoveContext pitchMove(int i) {
			return getRuleContext(PitchMoveContext.class,i);
		}
		public LinearMotifPitchMoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linearMotifPitchMove; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof motifGrammarListener ) ((motifGrammarListener)listener).enterLinearMotifPitchMove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof motifGrammarListener ) ((motifGrammarListener)listener).exitLinearMotifPitchMove(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof motifGrammarVisitor ) return ((motifGrammarVisitor<? extends T>)visitor).visitLinearMotifPitchMove(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinearMotifPitchMoveContext linearMotifPitchMove() throws RecognitionException {
		LinearMotifPitchMoveContext _localctx = new LinearMotifPitchMoveContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_linearMotifPitchMove);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(T__0);
			setState(60); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(59);
				pitchMove();
				}
				}
				setState(62); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__37 );
			setState(64);
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
		enterRule(_localctx, 10, RULE_pitch);
		try {
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				absolutePitch();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				relativePitch();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
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
		enterRule(_localctx, 12, RULE_absolutePitch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			pitchName();
			setState(72);
			match(T__2);
			setState(73);
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
		enterRule(_localctx, 14, RULE_relativePitch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			pitchName();
			setState(76);
			match(T__2);
			setState(77);
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
		enterRule(_localctx, 16, RULE_simplePitch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
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
		enterRule(_localctx, 18, RULE_pitchName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 67108848L) != 0)) ) {
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
		enterRule(_localctx, 20, RULE_octaveNumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 17112760320L) != 0)) ) {
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
		enterRule(_localctx, 22, RULE_octaveModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 257698037760L) != 0)) ) {
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
	public static class PitchMoveContext extends ParserRuleContext {
		public PitchMoveNumberContext pitchMoveNumber() {
			return getRuleContext(PitchMoveNumberContext.class,0);
		}
		public PitchMoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pitchMove; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof motifGrammarListener ) ((motifGrammarListener)listener).enterPitchMove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof motifGrammarListener ) ((motifGrammarListener)listener).exitPitchMove(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof motifGrammarVisitor ) return ((motifGrammarVisitor<? extends T>)visitor).visitPitchMove(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PitchMoveContext pitchMove() throws RecognitionException {
		PitchMoveContext _localctx = new PitchMoveContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_pitchMove);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__37);
			setState(88);
			pitchMoveNumber();
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
	public static class PitchMoveNumberContext extends ParserRuleContext {
		public PitchMoveNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pitchMoveNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof motifGrammarListener ) ((motifGrammarListener)listener).enterPitchMoveNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof motifGrammarListener ) ((motifGrammarListener)listener).exitPitchMoveNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof motifGrammarVisitor ) return ((motifGrammarVisitor<? extends T>)visitor).visitPitchMoveNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PitchMoveNumberContext pitchMoveNumber() throws RecognitionException {
		PitchMoveNumberContext _localctx = new PitchMoveNumberContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_pitchMoveNumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 18013848753668096L) != 0)) ) {
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
		enterRule(_localctx, 28, RULE_duration);
		try {
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__46:
			case T__47:
			case T__49:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				simpleDuration();
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
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
		enterRule(_localctx, 30, RULE_compoundDuration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(T__53);
			setState(98); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(97);
				simpleDuration();
				}
				}
				setState(100); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1082412022940827648L) != 0) );
			setState(102);
			match(T__54);
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
		enterRule(_localctx, 32, RULE_simpleDuration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1082412022940827648L) != 0)) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001=k\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007"+
		"\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002\f\u0007"+
		"\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f\u0002"+
		"\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001)\b\u0001\u0001\u0002\u0001\u0002\u0004"+
		"\u0002-\b\u0002\u000b\u0002\f\u0002.\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0004\u00035\b\u0003\u000b\u0003\f\u00036\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0004\u0004=\b\u0004\u000b\u0004\f\u0004"+
		">\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"F\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0003\u000e_\b\u000e\u0001\u000f\u0001\u000f"+
		"\u0004\u000fc\b\u000f\u000b\u000f\f\u000fd\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0000\u0000\u0011\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \u0000\u0005"+
		"\u0001\u0000\u0004\u0019\u0001\u0000\u001a!\u0001\u0000\"%\u0001\u0000"+
		"\'5\u0003\u0000/0228;b\u0000\"\u0001\u0000\u0000\u0000\u0002(\u0001\u0000"+
		"\u0000\u0000\u0004*\u0001\u0000\u0000\u0000\u00062\u0001\u0000\u0000\u0000"+
		"\b:\u0001\u0000\u0000\u0000\nE\u0001\u0000\u0000\u0000\fG\u0001\u0000"+
		"\u0000\u0000\u000eK\u0001\u0000\u0000\u0000\u0010O\u0001\u0000\u0000\u0000"+
		"\u0012Q\u0001\u0000\u0000\u0000\u0014S\u0001\u0000\u0000\u0000\u0016U"+
		"\u0001\u0000\u0000\u0000\u0018W\u0001\u0000\u0000\u0000\u001aZ\u0001\u0000"+
		"\u0000\u0000\u001c^\u0001\u0000\u0000\u0000\u001e`\u0001\u0000\u0000\u0000"+
		" h\u0001\u0000\u0000\u0000\"#\u0003\u0002\u0001\u0000#$\u0005\u0000\u0000"+
		"\u0001$\u0001\u0001\u0000\u0000\u0000%)\u0003\u0004\u0002\u0000&)\u0003"+
		"\u0006\u0003\u0000\')\u0003\b\u0004\u0000(%\u0001\u0000\u0000\u0000(&"+
		"\u0001\u0000\u0000\u0000(\'\u0001\u0000\u0000\u0000)\u0003\u0001\u0000"+
		"\u0000\u0000*,\u0005\u0001\u0000\u0000+-\u0003\u001c\u000e\u0000,+\u0001"+
		"\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000"+
		"./\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u000001\u0005\u0002\u0000"+
		"\u00001\u0005\u0001\u0000\u0000\u000024\u0005\u0001\u0000\u000035\u0003"+
		"\n\u0005\u000043\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u000064\u0001"+
		"\u0000\u0000\u000067\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u0000"+
		"89\u0005\u0002\u0000\u00009\u0007\u0001\u0000\u0000\u0000:<\u0005\u0001"+
		"\u0000\u0000;=\u0003\u0018\f\u0000<;\u0001\u0000\u0000\u0000=>\u0001\u0000"+
		"\u0000\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?@\u0001"+
		"\u0000\u0000\u0000@A\u0005\u0002\u0000\u0000A\t\u0001\u0000\u0000\u0000"+
		"BF\u0003\f\u0006\u0000CF\u0003\u000e\u0007\u0000DF\u0003\u0010\b\u0000"+
		"EB\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000ED\u0001\u0000\u0000"+
		"\u0000F\u000b\u0001\u0000\u0000\u0000GH\u0003\u0012\t\u0000HI\u0005\u0003"+
		"\u0000\u0000IJ\u0003\u0014\n\u0000J\r\u0001\u0000\u0000\u0000KL\u0003"+
		"\u0012\t\u0000LM\u0005\u0003\u0000\u0000MN\u0003\u0016\u000b\u0000N\u000f"+
		"\u0001\u0000\u0000\u0000OP\u0003\u0012\t\u0000P\u0011\u0001\u0000\u0000"+
		"\u0000QR\u0007\u0000\u0000\u0000R\u0013\u0001\u0000\u0000\u0000ST\u0007"+
		"\u0001\u0000\u0000T\u0015\u0001\u0000\u0000\u0000UV\u0007\u0002\u0000"+
		"\u0000V\u0017\u0001\u0000\u0000\u0000WX\u0005&\u0000\u0000XY\u0003\u001a"+
		"\r\u0000Y\u0019\u0001\u0000\u0000\u0000Z[\u0007\u0003\u0000\u0000[\u001b"+
		"\u0001\u0000\u0000\u0000\\_\u0003 \u0010\u0000]_\u0003\u001e\u000f\u0000"+
		"^\\\u0001\u0000\u0000\u0000^]\u0001\u0000\u0000\u0000_\u001d\u0001\u0000"+
		"\u0000\u0000`b\u00056\u0000\u0000ac\u0003 \u0010\u0000ba\u0001\u0000\u0000"+
		"\u0000cd\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000"+
		"\u0000\u0000ef\u0001\u0000\u0000\u0000fg\u00057\u0000\u0000g\u001f\u0001"+
		"\u0000\u0000\u0000hi\u0007\u0004\u0000\u0000i!\u0001\u0000\u0000\u0000"+
		"\u0007(.6>E^d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}