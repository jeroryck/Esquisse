// Generated from C:/Users/eva/Documents/MusicSoftware/Esquisse/src/main/java/format/durationGrammar/motifGrammar.g4 by ANTLR 4.13.1
package format.durationGrammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class motifGrammarLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
			"T__41", "T__42", "ID", "WS"
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


	public motifGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "motifGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000-\u00e0\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001"+
		" \u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001"+
		"%\u0001%\u0001&\u0001&\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001)\u0001"+
		")\u0001)\u0001*\u0001*\u0001*\u0001+\u0001+\u0004+\u00d6\b+\u000b+\f+"+
		"\u00d7\u0001,\u0004,\u00db\b,\u000b,\f,\u00dc\u0001,\u0001,\u0000\u0000"+
		"-\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017"+
		"/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\"E#G$I%"+
		"K&M\'O(Q)S*U+W,Y-\u0001\u0000\u0002\u0002\u0000AZaz\u0003\u0000\t\n\r"+
		"\r  \u00e1\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u0000"+
		"3\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001"+
		"\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000"+
		"\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000"+
		"A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001"+
		"\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001\u0000\u0000"+
		"\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000\u0000\u0000"+
		"O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000\u0000S\u0001"+
		"\u0000\u0000\u0000\u0000U\u0001\u0000\u0000\u0000\u0000W\u0001\u0000\u0000"+
		"\u0000\u0000Y\u0001\u0000\u0000\u0000\u0001[\u0001\u0000\u0000\u0000\u0003"+
		"]\u0001\u0000\u0000\u0000\u0005_\u0001\u0000\u0000\u0000\u0007a\u0001"+
		"\u0000\u0000\u0000\te\u0001\u0000\u0000\u0000\u000bi\u0001\u0000\u0000"+
		"\u0000\rk\u0001\u0000\u0000\u0000\u000fo\u0001\u0000\u0000\u0000\u0011"+
		"s\u0001\u0000\u0000\u0000\u0013u\u0001\u0000\u0000\u0000\u0015y\u0001"+
		"\u0000\u0000\u0000\u0017}\u0001\u0000\u0000\u0000\u0019\u007f\u0001\u0000"+
		"\u0000\u0000\u001b\u0083\u0001\u0000\u0000\u0000\u001d\u0087\u0001\u0000"+
		"\u0000\u0000\u001f\u0089\u0001\u0000\u0000\u0000!\u008d\u0001\u0000\u0000"+
		"\u0000#\u0091\u0001\u0000\u0000\u0000%\u0093\u0001\u0000\u0000\u0000\'"+
		"\u0097\u0001\u0000\u0000\u0000)\u009b\u0001\u0000\u0000\u0000+\u009d\u0001"+
		"\u0000\u0000\u0000-\u00a1\u0001\u0000\u0000\u0000/\u00a5\u0001\u0000\u0000"+
		"\u00001\u00a7\u0001\u0000\u0000\u00003\u00a9\u0001\u0000\u0000\u00005"+
		"\u00ab\u0001\u0000\u0000\u00007\u00ad\u0001\u0000\u0000\u00009\u00af\u0001"+
		"\u0000\u0000\u0000;\u00b1\u0001\u0000\u0000\u0000=\u00b3\u0001\u0000\u0000"+
		"\u0000?\u00b5\u0001\u0000\u0000\u0000A\u00b8\u0001\u0000\u0000\u0000C"+
		"\u00bb\u0001\u0000\u0000\u0000E\u00be\u0001\u0000\u0000\u0000G\u00c0\u0001"+
		"\u0000\u0000\u0000I\u00c2\u0001\u0000\u0000\u0000K\u00c4\u0001\u0000\u0000"+
		"\u0000M\u00c6\u0001\u0000\u0000\u0000O\u00c8\u0001\u0000\u0000\u0000Q"+
		"\u00ca\u0001\u0000\u0000\u0000S\u00cd\u0001\u0000\u0000\u0000U\u00d0\u0001"+
		"\u0000\u0000\u0000W\u00d3\u0001\u0000\u0000\u0000Y\u00da\u0001\u0000\u0000"+
		"\u0000[\\\u0005(\u0000\u0000\\\u0002\u0001\u0000\u0000\u0000]^\u0005)"+
		"\u0000\u0000^\u0004\u0001\u0000\u0000\u0000_`\u0005a\u0000\u0000`\u0006"+
		"\u0001\u0000\u0000\u0000ab\u0005a\u0000\u0000bc\u0005e\u0000\u0000cd\u0005"+
		"s\u0000\u0000d\b\u0001\u0000\u0000\u0000ef\u0005a\u0000\u0000fg\u0005"+
		"i\u0000\u0000gh\u0005s\u0000\u0000h\n\u0001\u0000\u0000\u0000ij\u0005"+
		"b\u0000\u0000j\f\u0001\u0000\u0000\u0000kl\u0005b\u0000\u0000lm\u0005"+
		"e\u0000\u0000mn\u0005s\u0000\u0000n\u000e\u0001\u0000\u0000\u0000op\u0005"+
		"b\u0000\u0000pq\u0005i\u0000\u0000qr\u0005s\u0000\u0000r\u0010\u0001\u0000"+
		"\u0000\u0000st\u0005c\u0000\u0000t\u0012\u0001\u0000\u0000\u0000uv\u0005"+
		"c\u0000\u0000vw\u0005e\u0000\u0000wx\u0005s\u0000\u0000x\u0014\u0001\u0000"+
		"\u0000\u0000yz\u0005c\u0000\u0000z{\u0005i\u0000\u0000{|\u0005s\u0000"+
		"\u0000|\u0016\u0001\u0000\u0000\u0000}~\u0005d\u0000\u0000~\u0018\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0005d\u0000\u0000\u0080\u0081\u0005e\u0000"+
		"\u0000\u0081\u0082\u0005s\u0000\u0000\u0082\u001a\u0001\u0000\u0000\u0000"+
		"\u0083\u0084\u0005d\u0000\u0000\u0084\u0085\u0005i\u0000\u0000\u0085\u0086"+
		"\u0005s\u0000\u0000\u0086\u001c\u0001\u0000\u0000\u0000\u0087\u0088\u0005"+
		"e\u0000\u0000\u0088\u001e\u0001\u0000\u0000\u0000\u0089\u008a\u0005e\u0000"+
		"\u0000\u008a\u008b\u0005e\u0000\u0000\u008b\u008c\u0005s\u0000\u0000\u008c"+
		" \u0001\u0000\u0000\u0000\u008d\u008e\u0005e\u0000\u0000\u008e\u008f\u0005"+
		"i\u0000\u0000\u008f\u0090\u0005s\u0000\u0000\u0090\"\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0005f\u0000\u0000\u0092$\u0001\u0000\u0000\u0000\u0093"+
		"\u0094\u0005f\u0000\u0000\u0094\u0095\u0005e\u0000\u0000\u0095\u0096\u0005"+
		"s\u0000\u0000\u0096&\u0001\u0000\u0000\u0000\u0097\u0098\u0005f\u0000"+
		"\u0000\u0098\u0099\u0005i\u0000\u0000\u0099\u009a\u0005s\u0000\u0000\u009a"+
		"(\u0001\u0000\u0000\u0000\u009b\u009c\u0005g\u0000\u0000\u009c*\u0001"+
		"\u0000\u0000\u0000\u009d\u009e\u0005g\u0000\u0000\u009e\u009f\u0005e\u0000"+
		"\u0000\u009f\u00a0\u0005s\u0000\u0000\u00a0,\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a2\u0005g\u0000\u0000\u00a2\u00a3\u0005i\u0000\u0000\u00a3\u00a4\u0005"+
		"s\u0000\u0000\u00a4.\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005r\u0000"+
		"\u0000\u00a60\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005\u00b0\u0000\u0000"+
		"\u00a82\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005+\u0000\u0000\u00aa4"+
		"\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005#\u0000\u0000\u00ac6\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ae\u00051\u0000\u0000\u00ae8\u0001\u0000\u0000\u0000"+
		"\u00af\u00b0\u00052\u0000\u0000\u00b0:\u0001\u0000\u0000\u0000\u00b1\u00b2"+
		"\u00054\u0000\u0000\u00b2<\u0001\u0000\u0000\u0000\u00b3\u00b4\u00058"+
		"\u0000\u0000\u00b4>\u0001\u0000\u0000\u0000\u00b5\u00b6\u00051\u0000\u0000"+
		"\u00b6\u00b7\u00056\u0000\u0000\u00b7@\u0001\u0000\u0000\u0000\u00b8\u00b9"+
		"\u00053\u0000\u0000\u00b9\u00ba\u00052\u0000\u0000\u00baB\u0001\u0000"+
		"\u0000\u0000\u00bb\u00bc\u00056\u0000\u0000\u00bc\u00bd\u00054\u0000\u0000"+
		"\u00bdD\u0001\u0000\u0000\u0000\u00be\u00bf\u00050\u0000\u0000\u00bfF"+
		"\u0001\u0000\u0000\u0000\u00c0\u00c1\u00053\u0000\u0000\u00c1H\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c3\u00055\u0000\u0000\u00c3J\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c5\u00056\u0000\u0000\u00c5L\u0001\u0000\u0000\u0000\u00c6\u00c7"+
		"\u00057\u0000\u0000\u00c7N\u0001\u0000\u0000\u0000\u00c8\u00c9\u00059"+
		"\u0000\u0000\u00c9P\u0001\u0000\u0000\u0000\u00ca\u00cb\u00051\u0000\u0000"+
		"\u00cb\u00cc\u00050\u0000\u0000\u00ccR\u0001\u0000\u0000\u0000\u00cd\u00ce"+
		"\u00051\u0000\u0000\u00ce\u00cf\u00051\u0000\u0000\u00cfT\u0001\u0000"+
		"\u0000\u0000\u00d0\u00d1\u00051\u0000\u0000\u00d1\u00d2\u00052\u0000\u0000"+
		"\u00d2V\u0001\u0000\u0000\u0000\u00d3\u00d5\u0007\u0000\u0000\u0000\u00d4"+
		"\u00d6\u0007\u0000\u0000\u0000\u00d5\u00d4\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d8\u0001\u0000\u0000\u0000\u00d8X\u0001\u0000\u0000\u0000\u00d9\u00db"+
		"\u0007\u0001\u0000\u0000\u00da\u00d9\u0001\u0000\u0000\u0000\u00db\u00dc"+
		"\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc\u00dd"+
		"\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u00df"+
		"\u0006,\u0000\u0000\u00dfZ\u0001\u0000\u0000\u0000\u0003\u0000\u00d7\u00dc"+
		"\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}