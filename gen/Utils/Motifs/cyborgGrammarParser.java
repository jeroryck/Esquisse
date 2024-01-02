// Generated from C:/Users/eva/Documents/MusicSoftware/Esquisse/src/main/java/Utils/Motifs\cyborgGrammar.g4 by ANTLR 4.12.0
package Utils.Motifs;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class cyborgGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

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
		RULE_main = 0, RULE_declareVoice = 1, RULE_assign = 2, RULE_expr = 3, 
		RULE_sequence = 4, RULE_parallel = 5, RULE_repeat = 6, RULE_repeatSpec = 7, 
		RULE_context = 8, RULE_voice = 9, RULE_octave = 10, RULE_modespec = 11, 
		RULE_scaleSpec = 12, RULE_generator = 13, RULE_singleEvent = 14, RULE_pitch = 15, 
		RULE_duration = 16, RULE_compoundDuration = 17, RULE_absoluteDegre = 18, 
		RULE_relativeDegree = 19, RULE_accidental = 20, RULE_simpleDuration = 21, 
		RULE_octaveNumber = 22, RULE_dodecaNumber = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "declareVoice", "assign", "expr", "sequence", "parallel", "repeat", 
			"repeatSpec", "context", "voice", "octave", "modespec", "scaleSpec", 
			"generator", "singleEvent", "pitch", "duration", "compoundDuration", 
			"absoluteDegre", "relativeDegree", "accidental", "simpleDuration", "octaveNumber", 
			"dodecaNumber"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'declareVoice'", "'channel'", "'='", "'<'", "'>'", "'{'", "'}'", 
			"'&('", "')'", "'*'", "'('", "'*('", "'voice'", "'o'", "'o+'", "'o-'", 
			"'mode'", "'scale'", "'a'", "'aes'", "'ais'", "'b'", "'bes'", "'bis'", 
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
	public String getGrammarFileName() { return "cyborgGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public cyborgGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public SequenceContext sequence() {
			return getRuleContext(SequenceContext.class,0);
		}
		public TerminalNode EOF() { return getToken(cyborgGrammarParser.EOF, 0); }
		public List<DeclareVoiceContext> declareVoice() {
			return getRuleContexts(DeclareVoiceContext.class);
		}
		public DeclareVoiceContext declareVoice(int i) {
			return getRuleContext(DeclareVoiceContext.class,i);
		}
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cyborgGrammarVisitor ) return ((cyborgGrammarVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(48);
				declareVoice();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(54);
				assign();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			sequence();
			setState(61);
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
	public static class DeclareVoiceContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(cyborgGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(cyborgGrammarParser.ID, i);
		}
		public DeclareVoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareVoice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).enterDeclareVoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).exitDeclareVoice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cyborgGrammarVisitor ) return ((cyborgGrammarVisitor<? extends T>)visitor).visitDeclareVoice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareVoiceContext declareVoice() throws RecognitionException {
		DeclareVoiceContext _localctx = new DeclareVoiceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declareVoice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(T__0);
			setState(64);
			match(ID);
			setState(65);
			match(T__1);
			setState(66);
			match(ID);
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
	public static class AssignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(cyborgGrammarParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cyborgGrammarVisitor ) return ((cyborgGrammarVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(ID);
			setState(69);
			match(T__2);
			setState(70);
			expr();
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
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NamedExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(cyborgGrammarParser.ID, 0); }
		public NamedExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).enterNamedExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).exitNamedExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cyborgGrammarVisitor ) return ((cyborgGrammarVisitor<? extends T>)visitor).visitNamedExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ContextExprContext extends ExprContext {
		public ContextContext context() {
			return getRuleContext(ContextContext.class,0);
		}
		public ContextExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).enterContextExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).exitContextExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cyborgGrammarVisitor ) return ((cyborgGrammarVisitor<? extends T>)visitor).visitContextExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParallelExprContext extends ExprContext {
		public ParallelContext parallel() {
			return getRuleContext(ParallelContext.class,0);
		}
		public ParallelExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).enterParallelExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).exitParallelExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cyborgGrammarVisitor ) return ((cyborgGrammarVisitor<? extends T>)visitor).visitParallelExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GeneratorExprContext extends ExprContext {
		public GeneratorContext generator() {
			return getRuleContext(GeneratorContext.class,0);
		}
		public GeneratorExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).enterGeneratorExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).exitGeneratorExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cyborgGrammarVisitor ) return ((cyborgGrammarVisitor<? extends T>)visitor).visitGeneratorExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RepeatExprContext extends ExprContext {
		public RepeatContext repeat() {
			return getRuleContext(RepeatContext.class,0);
		}
		public RepeatExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).enterRepeatExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).exitRepeatExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cyborgGrammarVisitor ) return ((cyborgGrammarVisitor<? extends T>)visitor).visitRepeatExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SequenceExprContext extends ExprContext {
		public SequenceContext sequence() {
			return getRuleContext(SequenceContext.class,0);
		}
		public SequenceExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).enterSequenceExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).exitSequenceExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cyborgGrammarVisitor ) return ((cyborgGrammarVisitor<? extends T>)visitor).visitSequenceExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expr);
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
				_localctx = new ContextExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				context();
				}
				break;
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__41:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
				_localctx = new GeneratorExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				generator();
				}
				break;
			case T__5:
				_localctx = new SequenceExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				sequence();
				}
				break;
			case T__7:
				_localctx = new ParallelExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				parallel();
				}
				break;
			case T__9:
			case T__11:
				_localctx = new RepeatExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(76);
				repeat();
				}
				break;
			case T__3:
				_localctx = new NamedExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(77);
				match(T__3);
				setState(78);
				match(ID);
				setState(79);
				match(T__4);
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
	public static class SequenceContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).enterSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).exitSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cyborgGrammarVisitor ) return ((cyborgGrammarVisitor<? extends T>)visitor).visitSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequenceContext sequence() throws RecognitionException {
		SequenceContext _localctx = new SequenceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__5);
			setState(84); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(83);
				expr();
				}
				}
				setState(86); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1150940184653591888L) != 0) );
			setState(88);
			match(T__6);
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
	public static class ParallelContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ParallelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parallel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).enterParallel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).exitParallel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cyborgGrammarVisitor ) return ((cyborgGrammarVisitor<? extends T>)visitor).visitParallel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParallelContext parallel() throws RecognitionException {
		ParallelContext _localctx = new ParallelContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parallel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__7);
			setState(92); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(91);
				expr();
				}
				}
				setState(94); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1150940184653591888L) != 0) );
			setState(96);
			match(T__8);
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
	public static class RepeatContext extends ParserRuleContext {
		public RepeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat; }
	 
		public RepeatContext() { }
		public void copyFrom(RepeatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ChoiceRepeatContext extends RepeatContext {
		public List<RepeatSpecContext> repeatSpec() {
			return getRuleContexts(RepeatSpecContext.class);
		}
		public RepeatSpecContext repeatSpec(int i) {
			return getRuleContext(RepeatSpecContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ChoiceRepeatContext(RepeatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).enterChoiceRepeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).exitChoiceRepeat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cyborgGrammarVisitor ) return ((cyborgGrammarVisitor<? extends T>)visitor).visitChoiceRepeat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExplicitRepeatContext extends RepeatContext {
		public DodecaNumberContext dodecaNumber() {
			return getRuleContext(DodecaNumberContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExplicitRepeatContext(RepeatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).enterExplicitRepeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).exitExplicitRepeat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cyborgGrammarVisitor ) return ((cyborgGrammarVisitor<? extends T>)visitor).visitExplicitRepeat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatContext repeat() throws RecognitionException {
		RepeatContext _localctx = new RepeatContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_repeat);
		int _la;
		try {
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				_localctx = new ExplicitRepeatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match(T__9);
				setState(99);
				dodecaNumber();
				setState(100);
				match(T__10);
				setState(102); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(101);
					expr();
					}
					}
					setState(104); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1150940184653591888L) != 0) );
				setState(106);
				match(T__8);
				}
				break;
			case T__11:
				_localctx = new ChoiceRepeatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				match(T__11);
				setState(110); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(109);
					repeatSpec();
					}
					}
					setState(112); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__10 );
				setState(114);
				match(T__8);
				setState(115);
				match(T__10);
				setState(117); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(116);
					expr();
					}
					}
					setState(119); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1150940184653591888L) != 0) );
				setState(121);
				match(T__8);
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
	public static class RepeatSpecContext extends ParserRuleContext {
		public List<DodecaNumberContext> dodecaNumber() {
			return getRuleContexts(DodecaNumberContext.class);
		}
		public DodecaNumberContext dodecaNumber(int i) {
			return getRuleContext(DodecaNumberContext.class,i);
		}
		public RepeatSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).enterRepeatSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).exitRepeatSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cyborgGrammarVisitor ) return ((cyborgGrammarVisitor<? extends T>)visitor).visitRepeatSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatSpecContext repeatSpec() throws RecognitionException {
		RepeatSpecContext _localctx = new RepeatSpecContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_repeatSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(T__10);
			setState(126);
			dodecaNumber();
			setState(127);
			dodecaNumber();
			setState(128);
			match(T__8);
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
	public static class ContextContext extends ParserRuleContext {
		public ContextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_context; }
	 
		public ContextContext() { }
		public void copyFrom(ContextContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ScaleContextContext extends ContextContext {
		public ScaleSpecContext scaleSpec() {
			return getRuleContext(ScaleSpecContext.class,0);
		}
		public ScaleContextContext(ContextContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).enterScaleContext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).exitScaleContext(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cyborgGrammarVisitor ) return ((cyborgGrammarVisitor<? extends T>)visitor).visitScaleContext(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VoiceContextContext extends ContextContext {
		public VoiceContext voice() {
			return getRuleContext(VoiceContext.class,0);
		}
		public VoiceContextContext(ContextContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).enterVoiceContext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).exitVoiceContext(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cyborgGrammarVisitor ) return ((cyborgGrammarVisitor<? extends T>)visitor).visitVoiceContext(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OctaveContextContext extends ContextContext {
		public OctaveContext octave() {
			return getRuleContext(OctaveContext.class,0);
		}
		public OctaveContextContext(ContextContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).enterOctaveContext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).exitOctaveContext(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cyborgGrammarVisitor ) return ((cyborgGrammarVisitor<? extends T>)visitor).visitOctaveContext(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ModeContextContext extends ContextContext {
		public ModespecContext modespec() {
			return getRuleContext(ModespecContext.class,0);
		}
		public ModeContextContext(ContextContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).enterModeContext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).exitModeContext(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cyborgGrammarVisitor ) return ((cyborgGrammarVisitor<? extends T>)visitor).visitModeContext(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContextContext context() throws RecognitionException {
		ContextContext _localctx = new ContextContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_context);
		try {
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				_localctx = new VoiceContextContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				voice();
				}
				break;
			case T__13:
			case T__14:
			case T__15:
				_localctx = new OctaveContextContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				octave();
				}
				break;
			case T__16:
				_localctx = new ModeContextContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				modespec();
				}
				break;
			case T__17:
				_localctx = new ScaleContextContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(133);
				scaleSpec();
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
	public static class VoiceContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(cyborgGrammarParser.ID, 0); }
		public VoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).enterVoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).exitVoice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cyborgGrammarVisitor ) return ((cyborgGrammarVisitor<? extends T>)visitor).visitVoice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoiceContext voice() throws RecognitionException {
		VoiceContext _localctx = new VoiceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_voice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(T__12);
			setState(137);
			match(ID);
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
	public static class OctaveContext extends ParserRuleContext {
		public OctaveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_octave; }
	 
		public OctaveContext() { }
		public void copyFrom(OctaveContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OctaveExplicitContext extends OctaveContext {
		public OctaveNumberContext octaveNumber() {
			return getRuleContext(OctaveNumberContext.class,0);
		}
		public OctaveExplicitContext(OctaveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).enterOctaveExplicit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).exitOctaveExplicit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cyborgGrammarVisitor ) return ((cyborgGrammarVisitor<? extends T>)visitor).visitOctaveExplicit(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OctaveMinusContext extends OctaveContext {
		public OctaveMinusContext(OctaveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).enterOctaveMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).exitOctaveMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cyborgGrammarVisitor ) return ((cyborgGrammarVisitor<? extends T>)visitor).visitOctaveMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OctavePlusContext extends OctaveContext {
		public OctavePlusContext(OctaveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).enterOctavePlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).exitOctavePlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cyborgGrammarVisitor ) return ((cyborgGrammarVisitor<? extends T>)visitor).visitOctavePlus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OctaveContext octave() throws RecognitionException {
		OctaveContext _localctx = new OctaveContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_octave);
		try {
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				_localctx = new OctaveExplicitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				match(T__13);
				setState(140);
				octaveNumber();
				}
				break;
			case T__14:
				_localctx = new OctavePlusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(T__14);
				}
				break;
			case T__15:
				_localctx = new OctaveMinusContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				match(T__15);
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
	public static class ModespecContext extends ParserRuleContext {
		public List<DodecaNumberContext> dodecaNumber() {
			return getRuleContexts(DodecaNumberContext.class);
		}
		public DodecaNumberContext dodecaNumber(int i) {
			return getRuleContext(DodecaNumberContext.class,i);
		}
		public ModespecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modespec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).enterModespec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).exitModespec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cyborgGrammarVisitor ) return ((cyborgGrammarVisitor<? extends T>)visitor).visitModespec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModespecContext modespec() throws RecognitionException {
		ModespecContext _localctx = new ModespecContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_modespec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__16);
			setState(146);
			match(T__10);
			setState(148); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(147);
				dodecaNumber();
				}
				}
				setState(150); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1150933587583827968L) != 0) );
			setState(152);
			match(T__8);
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
	public static class ScaleSpecContext extends ParserRuleContext {
		public PitchContext pitch() {
			return getRuleContext(PitchContext.class,0);
		}
		public ScaleSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scaleSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).enterScaleSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).exitScaleSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cyborgGrammarVisitor ) return ((cyborgGrammarVisitor<? extends T>)visitor).visitScaleSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScaleSpecContext scaleSpec() throws RecognitionException {
		ScaleSpecContext _localctx = new ScaleSpecContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_scaleSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(T__17);
			setState(155);
			pitch();
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
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).enterSingleEventGenerator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).exitSingleEventGenerator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cyborgGrammarVisitor ) return ((cyborgGrammarVisitor<? extends T>)visitor).visitSingleEventGenerator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeneratorContext generator() throws RecognitionException {
		GeneratorContext _localctx = new GeneratorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_generator);
		try {
			_localctx = new SingleEventGeneratorContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
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
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).enterRelativeEventDegreCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).exitRelativeEventDegreCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cyborgGrammarVisitor ) return ((cyborgGrammarVisitor<? extends T>)visitor).visitRelativeEventDegreCase(this);
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
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).enterSingleEventDegreCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).exitSingleEventDegreCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cyborgGrammarVisitor ) return ((cyborgGrammarVisitor<? extends T>)visitor).visitSingleEventDegreCase(this);
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
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).enterSingleEventPitchCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).exitSingleEventPitchCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cyborgGrammarVisitor ) return ((cyborgGrammarVisitor<? extends T>)visitor).visitSingleEventPitchCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleEventContext singleEvent() throws RecognitionException {
		SingleEventContext _localctx = new SingleEventContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_singleEvent);
		try {
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
				_localctx = new SingleEventPitchCaseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				pitch();
				setState(161);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(160);
					duration();
					}
					break;
				}
				}
				break;
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
				_localctx = new SingleEventDegreCaseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				absoluteDegre();
				setState(165);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(164);
					duration();
					}
					break;
				}
				}
				break;
			case T__41:
				_localctx = new RelativeEventDegreCaseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				relativeDegree();
				setState(169);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(168);
					duration();
					}
					break;
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
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).enterPitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).exitPitch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cyborgGrammarVisitor ) return ((cyborgGrammarVisitor<? extends T>)visitor).visitPitch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PitchContext pitch() throws RecognitionException {
		PitchContext _localctx = new PitchContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_pitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2199022731264L) != 0)) ) {
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
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).enterSimpleDurationCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).exitSimpleDurationCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cyborgGrammarVisitor ) return ((cyborgGrammarVisitor<? extends T>)visitor).visitSimpleDurationCase(this);
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
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).enterCompoundDurationCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).exitCompoundDurationCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cyborgGrammarVisitor ) return ((cyborgGrammarVisitor<? extends T>)visitor).visitCompoundDurationCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DurationContext duration() throws RecognitionException {
		DurationContext _localctx = new DurationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_duration);
		try {
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
				_localctx = new SimpleDurationCaseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				simpleDuration();
				}
				break;
			case T__10:
				_localctx = new CompoundDurationCaseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
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
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).enterCompoundDuration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).exitCompoundDuration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cyborgGrammarVisitor ) return ((cyborgGrammarVisitor<? extends T>)visitor).visitCompoundDuration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundDurationContext compoundDuration() throws RecognitionException {
		CompoundDurationContext _localctx = new CompoundDurationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_compoundDuration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(T__10);
			setState(181); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(180);
				simpleDuration();
				}
				}
				setState(183); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2234207627640832L) != 0) );
			setState(185);
			match(T__8);
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
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).enterAbsoluteDegre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).exitAbsoluteDegre(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cyborgGrammarVisitor ) return ((cyborgGrammarVisitor<? extends T>)visitor).visitAbsoluteDegre(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbsoluteDegreContext absoluteDegre() throws RecognitionException {
		AbsoluteDegreContext _localctx = new AbsoluteDegreContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_absoluteDegre);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			dodecaNumber();
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21 || _la==T__42) {
				{
				setState(188);
				accidental();
				}
			}

			setState(191);
			match(T__40);
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
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).enterRelativeDegree(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).exitRelativeDegree(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cyborgGrammarVisitor ) return ((cyborgGrammarVisitor<? extends T>)visitor).visitRelativeDegree(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelativeDegreeContext relativeDegree() throws RecognitionException {
		RelativeDegreeContext _localctx = new RelativeDegreeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_relativeDegree);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(T__41);
			setState(194);
			dodecaNumber();
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21 || _la==T__42) {
				{
				setState(195);
				accidental();
				}
			}

			setState(198);
			match(T__40);
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
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).enterDieseCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).exitDieseCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cyborgGrammarVisitor ) return ((cyborgGrammarVisitor<? extends T>)visitor).visitDieseCase(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BemolCaseContext extends AccidentalContext {
		public BemolCaseContext(AccidentalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).enterBemolCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).exitBemolCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cyborgGrammarVisitor ) return ((cyborgGrammarVisitor<? extends T>)visitor).visitBemolCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccidentalContext accidental() throws RecognitionException {
		AccidentalContext _localctx = new AccidentalContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_accidental);
		try {
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__42:
				_localctx = new DieseCaseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				match(T__42);
				}
				break;
			case T__21:
				_localctx = new BemolCaseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				match(T__21);
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
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).enterSimpleDuration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).exitSimpleDuration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cyborgGrammarVisitor ) return ((cyborgGrammarVisitor<? extends T>)visitor).visitSimpleDuration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleDurationContext simpleDuration() throws RecognitionException {
		SimpleDurationContext _localctx = new SimpleDurationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_simpleDuration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2234207627640832L) != 0)) ) {
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
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).enterOctaveNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).exitOctaveNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cyborgGrammarVisitor ) return ((cyborgGrammarVisitor<? extends T>)visitor).visitOctaveNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OctaveNumberContext octaveNumber() throws RecognitionException {
		OctaveNumberContext _localctx = new OctaveNumberContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_octaveNumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 69928939526553600L) != 0)) ) {
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
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).enterDodecaNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cyborgGrammarListener ) ((cyborgGrammarListener)listener).exitDodecaNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cyborgGrammarVisitor ) return ((cyborgGrammarVisitor<? extends T>)visitor).visitDodecaNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DodecaNumberContext dodecaNumber() throws RecognitionException {
		DodecaNumberContext _localctx = new DodecaNumberContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_dodecaNumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1150933587583827968L) != 0)) ) {
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
		"\u0004\u0001=\u00d3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001\u0000\u0005\u0000"+
		"2\b\u0000\n\u0000\f\u00005\t\u0000\u0001\u0000\u0005\u00008\b\u0000\n"+
		"\u0000\f\u0000;\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003Q\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0004\u0004U\b\u0004\u000b\u0004\f\u0004V\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0004\u0005]\b\u0005\u000b"+
		"\u0005\f\u0005^\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0004\u0006g\b\u0006\u000b\u0006\f\u0006h\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006o\b\u0006\u000b\u0006"+
		"\f\u0006p\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006v\b\u0006\u000b"+
		"\u0006\f\u0006w\u0001\u0006\u0001\u0006\u0003\u0006|\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u0087\b\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u0090\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0004"+
		"\u000b\u0095\b\u000b\u000b\u000b\f\u000b\u0096\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u00a2\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00a6\b\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u00aa\b\u000e\u0003\u000e\u00ac\b"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0003\u0010\u00b2"+
		"\b\u0010\u0001\u0011\u0001\u0011\u0004\u0011\u00b6\b\u0011\u000b\u0011"+
		"\f\u0011\u00b7\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u00be\b\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u00c5\b\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u00cb\b\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0000\u0000\u0018\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.\u0000\u0004\u0001\u0000\u0013(\u0001\u0000,2\u0002\u0000,.37\u0002"+
		"\u0000,/3;\u00d7\u00003\u0001\u0000\u0000\u0000\u0002?\u0001\u0000\u0000"+
		"\u0000\u0004D\u0001\u0000\u0000\u0000\u0006P\u0001\u0000\u0000\u0000\b"+
		"R\u0001\u0000\u0000\u0000\nZ\u0001\u0000\u0000\u0000\f{\u0001\u0000\u0000"+
		"\u0000\u000e}\u0001\u0000\u0000\u0000\u0010\u0086\u0001\u0000\u0000\u0000"+
		"\u0012\u0088\u0001\u0000\u0000\u0000\u0014\u008f\u0001\u0000\u0000\u0000"+
		"\u0016\u0091\u0001\u0000\u0000\u0000\u0018\u009a\u0001\u0000\u0000\u0000"+
		"\u001a\u009d\u0001\u0000\u0000\u0000\u001c\u00ab\u0001\u0000\u0000\u0000"+
		"\u001e\u00ad\u0001\u0000\u0000\u0000 \u00b1\u0001\u0000\u0000\u0000\""+
		"\u00b3\u0001\u0000\u0000\u0000$\u00bb\u0001\u0000\u0000\u0000&\u00c1\u0001"+
		"\u0000\u0000\u0000(\u00ca\u0001\u0000\u0000\u0000*\u00cc\u0001\u0000\u0000"+
		"\u0000,\u00ce\u0001\u0000\u0000\u0000.\u00d0\u0001\u0000\u0000\u00000"+
		"2\u0003\u0002\u0001\u000010\u0001\u0000\u0000\u000025\u0001\u0000\u0000"+
		"\u000031\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u000049\u0001\u0000"+
		"\u0000\u000053\u0001\u0000\u0000\u000068\u0003\u0004\u0002\u000076\u0001"+
		"\u0000\u0000\u00008;\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u0000"+
		"9:\u0001\u0000\u0000\u0000:<\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000"+
		"\u0000<=\u0003\b\u0004\u0000=>\u0005\u0000\u0000\u0001>\u0001\u0001\u0000"+
		"\u0000\u0000?@\u0005\u0001\u0000\u0000@A\u0005<\u0000\u0000AB\u0005\u0002"+
		"\u0000\u0000BC\u0005<\u0000\u0000C\u0003\u0001\u0000\u0000\u0000DE\u0005"+
		"<\u0000\u0000EF\u0005\u0003\u0000\u0000FG\u0003\u0006\u0003\u0000G\u0005"+
		"\u0001\u0000\u0000\u0000HQ\u0003\u0010\b\u0000IQ\u0003\u001a\r\u0000J"+
		"Q\u0003\b\u0004\u0000KQ\u0003\n\u0005\u0000LQ\u0003\f\u0006\u0000MN\u0005"+
		"\u0004\u0000\u0000NO\u0005<\u0000\u0000OQ\u0005\u0005\u0000\u0000PH\u0001"+
		"\u0000\u0000\u0000PI\u0001\u0000\u0000\u0000PJ\u0001\u0000\u0000\u0000"+
		"PK\u0001\u0000\u0000\u0000PL\u0001\u0000\u0000\u0000PM\u0001\u0000\u0000"+
		"\u0000Q\u0007\u0001\u0000\u0000\u0000RT\u0005\u0006\u0000\u0000SU\u0003"+
		"\u0006\u0003\u0000TS\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000"+
		"VT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000"+
		"\u0000XY\u0005\u0007\u0000\u0000Y\t\u0001\u0000\u0000\u0000Z\\\u0005\b"+
		"\u0000\u0000[]\u0003\u0006\u0003\u0000\\[\u0001\u0000\u0000\u0000]^\u0001"+
		"\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000"+
		"_`\u0001\u0000\u0000\u0000`a\u0005\t\u0000\u0000a\u000b\u0001\u0000\u0000"+
		"\u0000bc\u0005\n\u0000\u0000cd\u0003.\u0017\u0000df\u0005\u000b\u0000"+
		"\u0000eg\u0003\u0006\u0003\u0000fe\u0001\u0000\u0000\u0000gh\u0001\u0000"+
		"\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ij\u0001"+
		"\u0000\u0000\u0000jk\u0005\t\u0000\u0000k|\u0001\u0000\u0000\u0000ln\u0005"+
		"\f\u0000\u0000mo\u0003\u000e\u0007\u0000nm\u0001\u0000\u0000\u0000op\u0001"+
		"\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000"+
		"qr\u0001\u0000\u0000\u0000rs\u0005\t\u0000\u0000su\u0005\u000b\u0000\u0000"+
		"tv\u0003\u0006\u0003\u0000ut\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000"+
		"\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xy\u0001\u0000"+
		"\u0000\u0000yz\u0005\t\u0000\u0000z|\u0001\u0000\u0000\u0000{b\u0001\u0000"+
		"\u0000\u0000{l\u0001\u0000\u0000\u0000|\r\u0001\u0000\u0000\u0000}~\u0005"+
		"\u000b\u0000\u0000~\u007f\u0003.\u0017\u0000\u007f\u0080\u0003.\u0017"+
		"\u0000\u0080\u0081\u0005\t\u0000\u0000\u0081\u000f\u0001\u0000\u0000\u0000"+
		"\u0082\u0087\u0003\u0012\t\u0000\u0083\u0087\u0003\u0014\n\u0000\u0084"+
		"\u0087\u0003\u0016\u000b\u0000\u0085\u0087\u0003\u0018\f\u0000\u0086\u0082"+
		"\u0001\u0000\u0000\u0000\u0086\u0083\u0001\u0000\u0000\u0000\u0086\u0084"+
		"\u0001\u0000\u0000\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0087\u0011"+
		"\u0001\u0000\u0000\u0000\u0088\u0089\u0005\r\u0000\u0000\u0089\u008a\u0005"+
		"<\u0000\u0000\u008a\u0013\u0001\u0000\u0000\u0000\u008b\u008c\u0005\u000e"+
		"\u0000\u0000\u008c\u0090\u0003,\u0016\u0000\u008d\u0090\u0005\u000f\u0000"+
		"\u0000\u008e\u0090\u0005\u0010\u0000\u0000\u008f\u008b\u0001\u0000\u0000"+
		"\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u008e\u0001\u0000\u0000"+
		"\u0000\u0090\u0015\u0001\u0000\u0000\u0000\u0091\u0092\u0005\u0011\u0000"+
		"\u0000\u0092\u0094\u0005\u000b\u0000\u0000\u0093\u0095\u0003.\u0017\u0000"+
		"\u0094\u0093\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000"+
		"\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000"+
		"\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0099\u0005\t\u0000\u0000\u0099"+
		"\u0017\u0001\u0000\u0000\u0000\u009a\u009b\u0005\u0012\u0000\u0000\u009b"+
		"\u009c\u0003\u001e\u000f\u0000\u009c\u0019\u0001\u0000\u0000\u0000\u009d"+
		"\u009e\u0003\u001c\u000e\u0000\u009e\u001b\u0001\u0000\u0000\u0000\u009f"+
		"\u00a1\u0003\u001e\u000f\u0000\u00a0\u00a2\u0003 \u0010\u0000\u00a1\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00ac"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a5\u0003$\u0012\u0000\u00a4\u00a6\u0003"+
		" \u0010\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a6\u00ac\u0001\u0000\u0000\u0000\u00a7\u00a9\u0003&\u0013"+
		"\u0000\u00a8\u00aa\u0003 \u0010\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000"+
		"\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ac\u0001\u0000\u0000\u0000"+
		"\u00ab\u009f\u0001\u0000\u0000\u0000\u00ab\u00a3\u0001\u0000\u0000\u0000"+
		"\u00ab\u00a7\u0001\u0000\u0000\u0000\u00ac\u001d\u0001\u0000\u0000\u0000"+
		"\u00ad\u00ae\u0007\u0000\u0000\u0000\u00ae\u001f\u0001\u0000\u0000\u0000"+
		"\u00af\u00b2\u0003*\u0015\u0000\u00b0\u00b2\u0003\"\u0011\u0000\u00b1"+
		"\u00af\u0001\u0000\u0000\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b2"+
		"!\u0001\u0000\u0000\u0000\u00b3\u00b5\u0005\u000b\u0000\u0000\u00b4\u00b6"+
		"\u0003*\u0015\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005"+
		"\t\u0000\u0000\u00ba#\u0001\u0000\u0000\u0000\u00bb\u00bd\u0003.\u0017"+
		"\u0000\u00bc\u00be\u0003(\u0014\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000"+
		"\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000"+
		"\u00bf\u00c0\u0005)\u0000\u0000\u00c0%\u0001\u0000\u0000\u0000\u00c1\u00c2"+
		"\u0005*\u0000\u0000\u00c2\u00c4\u0003.\u0017\u0000\u00c3\u00c5\u0003("+
		"\u0014\u0000\u00c4\u00c3\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005)\u0000"+
		"\u0000\u00c7\'\u0001\u0000\u0000\u0000\u00c8\u00cb\u0005+\u0000\u0000"+
		"\u00c9\u00cb\u0005\u0016\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000"+
		"\u00ca\u00c9\u0001\u0000\u0000\u0000\u00cb)\u0001\u0000\u0000\u0000\u00cc"+
		"\u00cd\u0007\u0001\u0000\u0000\u00cd+\u0001\u0000\u0000\u0000\u00ce\u00cf"+
		"\u0007\u0002\u0000\u0000\u00cf-\u0001\u0000\u0000\u0000\u00d0\u00d1\u0007"+
		"\u0003\u0000\u0000\u00d1/\u0001\u0000\u0000\u0000\u001539PV^hpw{\u0086"+
		"\u008f\u0096\u00a1\u00a5\u00a9\u00ab\u00b1\u00b7\u00bd\u00c4\u00ca";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}