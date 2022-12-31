// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class DartLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASS=1, OPEN_CLASS=2, LIST=3, OPEN_LIST=4, WS=5, NEWLINE=6, COMMA=7, 
		CLOSE_LIST=8, LIST_INT=9, INTGER=10, EQUAL=11, PLUS=12, VOID=13, OPEN_B=14, 
		COLSE_B=15, FOR=16, SMALLER=17, DOT=18, LENGTH=19, PRINT=20, SMEI=21, 
		ARRAY_STRING_VALUE=22, LETTER=23, CLOSE_CLASS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CLASS", "OPEN_CLASS", "LIST", "OPEN_LIST", "WS", "NEWLINE", "COMMA", 
			"CLOSE_LIST", "LIST_INT", "INTGER", "EQUAL", "PLUS", "VOID", "OPEN_B", 
			"COLSE_B", "FOR", "SMALLER", "DOT", "LENGTH", "PRINT", "SMEI", "ARRAY_STRING_VALUE", 
			"LETTER", "CLOSE_CLASS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'{'", "'List'", "'['", null, null, "','", "']'", null, 
			"'int'", "'='", "'+'", "'void'", "'('", "')'", "'for'", "'<'", "'.'", 
			"'length'", "'print'", "';'", null, null, "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLASS", "OPEN_CLASS", "LIST", "OPEN_LIST", "WS", "NEWLINE", "COMMA", 
			"CLOSE_LIST", "LIST_INT", "INTGER", "EQUAL", "PLUS", "VOID", "OPEN_B", 
			"COLSE_B", "FOR", "SMALLER", "DOT", "LENGTH", "PRINT", "SMEI", "ARRAY_STRING_VALUE", 
			"LETTER", "CLOSE_CLASS"
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


	public DartLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DartLexer.g4"; }

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
		"\u0004\u0000\u0018\u0088\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0004\u0004B\b\u0004"+
		"\u000b\u0004\f\u0004C\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0004\bQ\b\b\u000b\b\f\bR\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0004\u0015~\b\u0015\u000b"+
		"\u0015\f\u0015\u007f\u0001\u0015\u0003\u0015\u0083\b\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0000\u0000\u0018\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u0018\u0001\u0000"+
		"\u0004\u0002\u0000\t\t  \u0002\u0000\n\n\r\r\u0001\u000009\u0002\u0000"+
		"AZaz\u008b\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
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
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00011\u0001\u0000\u0000\u0000\u0003"+
		"7\u0001\u0000\u0000\u0000\u00059\u0001\u0000\u0000\u0000\u0007>\u0001"+
		"\u0000\u0000\u0000\tA\u0001\u0000\u0000\u0000\u000bG\u0001\u0000\u0000"+
		"\u0000\rK\u0001\u0000\u0000\u0000\u000fM\u0001\u0000\u0000\u0000\u0011"+
		"P\u0001\u0000\u0000\u0000\u0013T\u0001\u0000\u0000\u0000\u0015X\u0001"+
		"\u0000\u0000\u0000\u0017Z\u0001\u0000\u0000\u0000\u0019\\\u0001\u0000"+
		"\u0000\u0000\u001ba\u0001\u0000\u0000\u0000\u001dc\u0001\u0000\u0000\u0000"+
		"\u001fe\u0001\u0000\u0000\u0000!i\u0001\u0000\u0000\u0000#k\u0001\u0000"+
		"\u0000\u0000%m\u0001\u0000\u0000\u0000\'t\u0001\u0000\u0000\u0000)z\u0001"+
		"\u0000\u0000\u0000+\u0082\u0001\u0000\u0000\u0000-\u0084\u0001\u0000\u0000"+
		"\u0000/\u0086\u0001\u0000\u0000\u000012\u0005c\u0000\u000023\u0005l\u0000"+
		"\u000034\u0005a\u0000\u000045\u0005s\u0000\u000056\u0005s\u0000\u0000"+
		"6\u0002\u0001\u0000\u0000\u000078\u0005{\u0000\u00008\u0004\u0001\u0000"+
		"\u0000\u00009:\u0005L\u0000\u0000:;\u0005i\u0000\u0000;<\u0005s\u0000"+
		"\u0000<=\u0005t\u0000\u0000=\u0006\u0001\u0000\u0000\u0000>?\u0005[\u0000"+
		"\u0000?\b\u0001\u0000\u0000\u0000@B\u0007\u0000\u0000\u0000A@\u0001\u0000"+
		"\u0000\u0000BC\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001"+
		"\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EF\u0006\u0004\u0000\u0000"+
		"F\n\u0001\u0000\u0000\u0000GH\u0007\u0001\u0000\u0000HI\u0001\u0000\u0000"+
		"\u0000IJ\u0006\u0005\u0001\u0000J\f\u0001\u0000\u0000\u0000KL\u0005,\u0000"+
		"\u0000L\u000e\u0001\u0000\u0000\u0000MN\u0005]\u0000\u0000N\u0010\u0001"+
		"\u0000\u0000\u0000OQ\u0007\u0002\u0000\u0000PO\u0001\u0000\u0000\u0000"+
		"QR\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000"+
		"\u0000S\u0012\u0001\u0000\u0000\u0000TU\u0005i\u0000\u0000UV\u0005n\u0000"+
		"\u0000VW\u0005t\u0000\u0000W\u0014\u0001\u0000\u0000\u0000XY\u0005=\u0000"+
		"\u0000Y\u0016\u0001\u0000\u0000\u0000Z[\u0005+\u0000\u0000[\u0018\u0001"+
		"\u0000\u0000\u0000\\]\u0005v\u0000\u0000]^\u0005o\u0000\u0000^_\u0005"+
		"i\u0000\u0000_`\u0005d\u0000\u0000`\u001a\u0001\u0000\u0000\u0000ab\u0005"+
		"(\u0000\u0000b\u001c\u0001\u0000\u0000\u0000cd\u0005)\u0000\u0000d\u001e"+
		"\u0001\u0000\u0000\u0000ef\u0005f\u0000\u0000fg\u0005o\u0000\u0000gh\u0005"+
		"r\u0000\u0000h \u0001\u0000\u0000\u0000ij\u0005<\u0000\u0000j\"\u0001"+
		"\u0000\u0000\u0000kl\u0005.\u0000\u0000l$\u0001\u0000\u0000\u0000mn\u0005"+
		"l\u0000\u0000no\u0005e\u0000\u0000op\u0005n\u0000\u0000pq\u0005g\u0000"+
		"\u0000qr\u0005t\u0000\u0000rs\u0005h\u0000\u0000s&\u0001\u0000\u0000\u0000"+
		"tu\u0005p\u0000\u0000uv\u0005r\u0000\u0000vw\u0005i\u0000\u0000wx\u0005"+
		"n\u0000\u0000xy\u0005t\u0000\u0000y(\u0001\u0000\u0000\u0000z{\u0005;"+
		"\u0000\u0000{*\u0001\u0000\u0000\u0000|~\u0007\u0003\u0000\u0000}|\u0001"+
		"\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0083\u0001\u0000\u0000"+
		"\u0000\u0081\u0083\u0003-\u0016\u0000\u0082}\u0001\u0000\u0000\u0000\u0082"+
		"\u0081\u0001\u0000\u0000\u0000\u0083,\u0001\u0000\u0000\u0000\u0084\u0085"+
		"\u0007\u0003\u0000\u0000\u0085.\u0001\u0000\u0000\u0000\u0086\u0087\u0005"+
		"}\u0000\u0000\u00870\u0001\u0000\u0000\u0000\u0005\u0000CR\u007f\u0082"+
		"\u0002\u0000\u0001\u0000\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}