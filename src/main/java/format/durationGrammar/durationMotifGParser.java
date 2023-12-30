// Generated from C:/Users/eva/Documents/MusicSoftware/Esquisse/src/main/java/format/durationGrammar/durationMotifG.g4 by ANTLR 4.13.1
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
public class durationMotifGParser extends Parser {
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
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, ID=44, WS=45;
	public static final int
		RULE_main = 0, RULE_linearMotif = 1, RULE_generator = 2, RULE_singleEvent = 3, 
		RULE_pitch = 4, RULE_duration = 5, RULE_compoundDuration = 6, RULE_absoluteDegre = 7, 
		RULE_relativeDegree = 8, RULE_accidental = 9, RULE_simpleDuration = 10, 
		RULE_octaveNumber = 11, RULE_dodecaNumber = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "linearMotif", "generator", "singleEvent", "pitch", "duration", 
			"compoundDuration", "absoluteDegre", "relativeDegree", "accidental", 
			"simpleDuration", "octaveNumber", "dodecaNumber"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'a'", "'aes'", "'ais'", "'b'", "'bes'", "'bis'", 
			"'c'", "'ces'", "'cis'", "'d'", "'des'", "'dis'", "'e'", "'ees'", "'eis'", 
			"'f'", "'fes'", "'fis'", "'g'", "'ges'", "'gis'", "'r'", "'\\u00B0'", 
			"'+'", "'#'", "'1'", "'2'", "'4'", "'8'", "'16'", "'32'", "'64'", "'0'", 
			"'3'", "'5'", "'6'", "'7'", "'9'", "'10'", "'11'", "'12'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "ID", "WS"
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
	public String getGrammarFileName() { return "durationMotifG.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public durationMotifGParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public LinearMotifContext linearMotif() {
			return getRuleContext(LinearMotifContext.class,0);
		}
		public TerminalNode EOF() { return getToken(durationMotifGParser.EOF, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof durationMotifGListener ) ((durationMotifGListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof durationMotifGListener ) ((durationMotifGListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof durationMotifGVisitor ) return ((durationMotifGVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			linearMotif();
			setState(27);
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
		public List<DurationContext> duration() {
			return getRuleContexts(DurationContext.class);
		}
		public DurationContext duration(int i) {
			return getRuleContext(DurationContext.class,i);
		}
		public LinearMotifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linearMotif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof durationMotifGListener ) ((durationMotifGListener)listener).enterLinearMotif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof durationMotifGListener ) ((durationMotifGListener)listener).exitLinearMotif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof durationMotifGVisitor ) return ((durationMotifGVisitor<? extends T>)visitor).visitLinearMotif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinearMotifContext linearMotif() throws RecognitionException {
		LinearMotifContext _localctx = new LinearMotifContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_linearMotif);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(T__0);
			setState(31); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(30);
				duration();
				}
				}
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 34091302914L) != 0) );
			setState(35);
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
	public static class GeneratorContext extends ParserRuleContext {
		public GeneratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generator; }
	 
		public GeneratorContext() { }
		public void copyFrom(GeneratorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleEventGeneratorContext extends GeneratorContext {
		public SingleEventContext singleEvent() {
			return getRuleContext(SingleEventContext.class,0);
		}
		public SingleEventGeneratorContext(GeneratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof durationMotifGListener ) ((durationMotifGListener)listener).enterSingleEventGenerator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof durationMotifGListener ) ((durationMotifGListener)listener).exitSingleEventGenerator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof durationMotifGVisitor ) return ((durationMotifGVisitor<? extends T>)visitor).visitSingleEventGenerator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeneratorContext generator() throws RecognitionException {
		GeneratorContext _localctx = new GeneratorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_generator);
		try {
			_localctx = new SingleEventGeneratorContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			singleEvent();
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
	public static class SingleEventContext extends ParserRuleContext {
		public SingleEventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleEvent; }
	 
		public SingleEventContext() { }
		public void copyFrom(SingleEventContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelativeEventDegreCaseContext extends SingleEventContext {
		public RelativeDegreeContext relativeDegree() {
			return getRuleContext(RelativeDegreeContext.class,0);
		}
		public DurationContext duration() {
			return getRuleContext(DurationContext.class,0);
		}
		public RelativeEventDegreCaseContext(SingleEventContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof durationMotifGListener ) ((durationMotifGListener)listener).enterRelativeEventDegreCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof durationMotifGListener ) ((durationMotifGListener)listener).exitRelativeEventDegreCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof durationMotifGVisitor ) return ((durationMotifGVisitor<? extends T>)visitor).visitRelativeEventDegreCase(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleEventDegreCaseContext extends SingleEventContext {
		public AbsoluteDegreContext absoluteDegre() {
			return getRuleContext(AbsoluteDegreContext.class,0);
		}
		public DurationContext duration() {
			return getRuleContext(DurationContext.class,0);
		}
		public SingleEventDegreCaseContext(SingleEventContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof durationMotifGListener ) ((durationMotifGListener)listener).enterSingleEventDegreCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof durationMotifGListener ) ((durationMotifGListener)listener).exitSingleEventDegreCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof durationMotifGVisitor ) return ((durationMotifGVisitor<? extends T>)visitor).visitSingleEventDegreCase(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleEventPitchCaseContext extends SingleEventContext {
		public PitchContext pitch() {
			return getRuleContext(PitchContext.class,0);
		}
		public DurationContext duration() {
			return getRuleContext(DurationContext.class,0);
		}
		public SingleEventPitchCaseContext(SingleEventContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof durationMotifGListener ) ((durationMotifGListener)listener).enterSingleEventPitchCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof durationMotifGListener ) ((durationMotifGListener)listener).exitSingleEventPitchCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof durationMotifGVisitor ) return ((durationMotifGVisitor<? extends T>)visitor).visitSingleEventPitchCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleEventContext singleEvent() throws RecognitionException {
		SingleEventContext _localctx = new SingleEventContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_singleEvent);
		int _la;
		try {
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
				_localctx = new SingleEventPitchCaseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				pitch();
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34091302914L) != 0)) {
					{
					setState(40);
					duration();
					}
				}

				}
				break;
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
				_localctx = new SingleEventDegreCaseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				absoluteDegre();
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34091302914L) != 0)) {
					{
					setState(44);
					duration();
					}
				}

				}
				break;
			case T__25:
				_localctx = new RelativeEventDegreCaseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				relativeDegree();
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34091302914L) != 0)) {
					{
					setState(48);
					duration();
					}
				}

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
	public static class PitchContext extends ParserRuleContext {
		public PitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pitch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof durationMotifGListener ) ((durationMotifGListener)listener).enterPitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof durationMotifGListener ) ((durationMotifGListener)listener).exitPitch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof durationMotifGVisitor ) return ((durationMotifGVisitor<? extends T>)visitor).visitPitch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PitchContext pitch() throws RecognitionException {
		PitchContext _localctx = new PitchContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 33554424L) != 0)) ) {
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
		public DurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_duration; }
	 
		public DurationContext() { }
		public void copyFrom(DurationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleDurationCaseContext extends DurationContext {
		public SimpleDurationContext simpleDuration() {
			return getRuleContext(SimpleDurationContext.class,0);
		}
		public SimpleDurationCaseContext(DurationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof durationMotifGListener ) ((durationMotifGListener)listener).enterSimpleDurationCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof durationMotifGListener ) ((durationMotifGListener)listener).exitSimpleDurationCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof durationMotifGVisitor ) return ((durationMotifGVisitor<? extends T>)visitor).visitSimpleDurationCase(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompoundDurationCaseContext extends DurationContext {
		public CompoundDurationContext compoundDuration() {
			return getRuleContext(CompoundDurationContext.class,0);
		}
		public CompoundDurationCaseContext(DurationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof durationMotifGListener ) ((durationMotifGListener)listener).enterCompoundDurationCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof durationMotifGListener ) ((durationMotifGListener)listener).exitCompoundDurationCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof durationMotifGVisitor ) return ((durationMotifGVisitor<? extends T>)visitor).visitCompoundDurationCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DurationContext duration() throws RecognitionException {
		DurationContext _localctx = new DurationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_duration);
		try {
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
				_localctx = new SimpleDurationCaseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				simpleDuration();
				}
				break;
			case T__0:
				_localctx = new CompoundDurationCaseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
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
			if ( listener instanceof durationMotifGListener ) ((durationMotifGListener)listener).enterCompoundDuration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof durationMotifGListener ) ((durationMotifGListener)listener).exitCompoundDuration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof durationMotifGVisitor ) return ((durationMotifGVisitor<? extends T>)visitor).visitCompoundDuration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundDurationContext compoundDuration() throws RecognitionException {
		CompoundDurationContext _localctx = new CompoundDurationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_compoundDuration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(T__0);
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(60);
				simpleDuration();
				}
				}
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 34091302912L) != 0) );
			setState(65);
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
	public static class AbsoluteDegreContext extends ParserRuleContext {
		public DodecaNumberContext dodecaNumber() {
			return getRuleContext(DodecaNumberContext.class,0);
		}
		public AccidentalContext accidental() {
			return getRuleContext(AccidentalContext.class,0);
		}
		public AbsoluteDegreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_absoluteDegre; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof durationMotifGListener ) ((durationMotifGListener)listener).enterAbsoluteDegre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof durationMotifGListener ) ((durationMotifGListener)listener).exitAbsoluteDegre(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof durationMotifGVisitor ) return ((durationMotifGVisitor<? extends T>)visitor).visitAbsoluteDegre(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbsoluteDegreContext absoluteDegre() throws RecognitionException {
		AbsoluteDegreContext _localctx = new AbsoluteDegreContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_absoluteDegre);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			dodecaNumber();
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5 || _la==T__26) {
				{
				setState(68);
				accidental();
				}
			}

			setState(71);
			match(T__24);
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
	public static class RelativeDegreeContext extends ParserRuleContext {
		public DodecaNumberContext dodecaNumber() {
			return getRuleContext(DodecaNumberContext.class,0);
		}
		public AccidentalContext accidental() {
			return getRuleContext(AccidentalContext.class,0);
		}
		public RelativeDegreeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relativeDegree; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof durationMotifGListener ) ((durationMotifGListener)listener).enterRelativeDegree(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof durationMotifGListener ) ((durationMotifGListener)listener).exitRelativeDegree(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof durationMotifGVisitor ) return ((durationMotifGVisitor<? extends T>)visitor).visitRelativeDegree(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelativeDegreeContext relativeDegree() throws RecognitionException {
		RelativeDegreeContext _localctx = new RelativeDegreeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_relativeDegree);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__25);
			setState(74);
			dodecaNumber();
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5 || _la==T__26) {
				{
				setState(75);
				accidental();
				}
			}

			setState(78);
			match(T__24);
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
	public static class AccidentalContext extends ParserRuleContext {
		public AccidentalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accidental; }
	 
		public AccidentalContext() { }
		public void copyFrom(AccidentalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DieseCaseContext extends AccidentalContext {
		public DieseCaseContext(AccidentalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof durationMotifGListener ) ((durationMotifGListener)listener).enterDieseCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof durationMotifGListener ) ((durationMotifGListener)listener).exitDieseCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof durationMotifGVisitor ) return ((durationMotifGVisitor<? extends T>)visitor).visitDieseCase(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BemolCaseContext extends AccidentalContext {
		public BemolCaseContext(AccidentalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof durationMotifGListener ) ((durationMotifGListener)listener).enterBemolCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof durationMotifGListener ) ((durationMotifGListener)listener).exitBemolCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof durationMotifGVisitor ) return ((durationMotifGVisitor<? extends T>)visitor).visitBemolCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccidentalContext accidental() throws RecognitionException {
		AccidentalContext _localctx = new AccidentalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_accidental);
		try {
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				_localctx = new DieseCaseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(T__26);
				}
				break;
			case T__5:
				_localctx = new BemolCaseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				match(T__5);
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
	public static class SimpleDurationContext extends ParserRuleContext {
		public SimpleDurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleDuration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof durationMotifGListener ) ((durationMotifGListener)listener).enterSimpleDuration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof durationMotifGListener ) ((durationMotifGListener)listener).exitSimpleDuration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof durationMotifGVisitor ) return ((durationMotifGVisitor<? extends T>)visitor).visitSimpleDuration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleDurationContext simpleDuration() throws RecognitionException {
		SimpleDurationContext _localctx = new SimpleDurationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_simpleDuration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 34091302912L) != 0)) ) {
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
			if ( listener instanceof durationMotifGListener ) ((durationMotifGListener)listener).enterOctaveNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof durationMotifGListener ) ((durationMotifGListener)listener).exitOctaveNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof durationMotifGVisitor ) return ((durationMotifGVisitor<? extends T>)visitor).visitOctaveNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OctaveNumberContext octaveNumber() throws RecognitionException {
		OctaveNumberContext _localctx = new OctaveNumberContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_octaveNumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1067030937600L) != 0)) ) {
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
	public static class DodecaNumberContext extends ParserRuleContext {
		public DodecaNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dodecaNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof durationMotifGListener ) ((durationMotifGListener)listener).enterDodecaNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof durationMotifGListener ) ((durationMotifGListener)listener).exitDodecaNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof durationMotifGVisitor ) return ((durationMotifGVisitor<? extends T>)visitor).visitDodecaNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DodecaNumberContext dodecaNumber() throws RecognitionException {
		DodecaNumberContext _localctx = new DodecaNumberContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_dodecaNumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 17561852837888L) != 0)) ) {
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
		"\u0004\u0001-[\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007"+
		"\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002\f\u0007"+
		"\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0004\u0001"+
		" \b\u0001\u000b\u0001\f\u0001!\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0003\u0003*\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003.\b\u0003\u0001\u0003\u0001\u0003\u0003\u00032\b\u0003"+
		"\u0003\u00034\b\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0003\u0005:\b\u0005\u0001\u0006\u0001\u0006\u0004\u0006>\b\u0006\u000b"+
		"\u0006\f\u0006?\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0003"+
		"\u0007F\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0003"+
		"\bM\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0003\tS\b\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0000\u0000\r\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000\u0004\u0001\u0000"+
		"\u0003\u0018\u0001\u0000\u001c\"\u0002\u0000\u001c\u001e#\'\u0002\u0000"+
		"\u001c\u001f#+X\u0000\u001a\u0001\u0000\u0000\u0000\u0002\u001d\u0001"+
		"\u0000\u0000\u0000\u0004%\u0001\u0000\u0000\u0000\u00063\u0001\u0000\u0000"+
		"\u0000\b5\u0001\u0000\u0000\u0000\n9\u0001\u0000\u0000\u0000\f;\u0001"+
		"\u0000\u0000\u0000\u000eC\u0001\u0000\u0000\u0000\u0010I\u0001\u0000\u0000"+
		"\u0000\u0012R\u0001\u0000\u0000\u0000\u0014T\u0001\u0000\u0000\u0000\u0016"+
		"V\u0001\u0000\u0000\u0000\u0018X\u0001\u0000\u0000\u0000\u001a\u001b\u0003"+
		"\u0002\u0001\u0000\u001b\u001c\u0005\u0000\u0000\u0001\u001c\u0001\u0001"+
		"\u0000\u0000\u0000\u001d\u001f\u0005\u0001\u0000\u0000\u001e \u0003\n"+
		"\u0005\u0000\u001f\u001e\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000"+
		"!\u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"#\u0001\u0000"+
		"\u0000\u0000#$\u0005\u0002\u0000\u0000$\u0003\u0001\u0000\u0000\u0000"+
		"%&\u0003\u0006\u0003\u0000&\u0005\u0001\u0000\u0000\u0000\')\u0003\b\u0004"+
		"\u0000(*\u0003\n\u0005\u0000)(\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000"+
		"\u0000*4\u0001\u0000\u0000\u0000+-\u0003\u000e\u0007\u0000,.\u0003\n\u0005"+
		"\u0000-,\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.4\u0001\u0000"+
		"\u0000\u0000/1\u0003\u0010\b\u000002\u0003\n\u0005\u000010\u0001\u0000"+
		"\u0000\u000012\u0001\u0000\u0000\u000024\u0001\u0000\u0000\u00003\'\u0001"+
		"\u0000\u0000\u00003+\u0001\u0000\u0000\u00003/\u0001\u0000\u0000\u0000"+
		"4\u0007\u0001\u0000\u0000\u000056\u0007\u0000\u0000\u00006\t\u0001\u0000"+
		"\u0000\u00007:\u0003\u0014\n\u00008:\u0003\f\u0006\u000097\u0001\u0000"+
		"\u0000\u000098\u0001\u0000\u0000\u0000:\u000b\u0001\u0000\u0000\u0000"+
		";=\u0005\u0001\u0000\u0000<>\u0003\u0014\n\u0000=<\u0001\u0000\u0000\u0000"+
		">?\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000"+
		"\u0000@A\u0001\u0000\u0000\u0000AB\u0005\u0002\u0000\u0000B\r\u0001\u0000"+
		"\u0000\u0000CE\u0003\u0018\f\u0000DF\u0003\u0012\t\u0000ED\u0001\u0000"+
		"\u0000\u0000EF\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GH\u0005"+
		"\u0019\u0000\u0000H\u000f\u0001\u0000\u0000\u0000IJ\u0005\u001a\u0000"+
		"\u0000JL\u0003\u0018\f\u0000KM\u0003\u0012\t\u0000LK\u0001\u0000\u0000"+
		"\u0000LM\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NO\u0005\u0019"+
		"\u0000\u0000O\u0011\u0001\u0000\u0000\u0000PS\u0005\u001b\u0000\u0000"+
		"QS\u0005\u0006\u0000\u0000RP\u0001\u0000\u0000\u0000RQ\u0001\u0000\u0000"+
		"\u0000S\u0013\u0001\u0000\u0000\u0000TU\u0007\u0001\u0000\u0000U\u0015"+
		"\u0001\u0000\u0000\u0000VW\u0007\u0002\u0000\u0000W\u0017\u0001\u0000"+
		"\u0000\u0000XY\u0007\u0003\u0000\u0000Y\u0019\u0001\u0000\u0000\u0000"+
		"\n!)-139?ELR";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}