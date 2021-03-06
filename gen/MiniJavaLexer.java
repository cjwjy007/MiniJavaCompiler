// Generated from /Users/wei/IdeaProjects/MiniJavaCompiler/src/MiniJava.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniJavaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, ID=20, INT_LITE=21, WS=22, BLOCK_COMMENT=23, LINE_COMMENT=24, 
		ASSIGN=25, GT=26, LT=27, GE=28, LE=29, PLUS=30, MINUS=31, TIMES=32, BANG=33, 
		AND=34, OR=35, L_PAREN=36, R_PAREN=37, L_BRACK=38, R_BRACK=39, L_BRACE=40, 
		R_BRACE=41, COMMA=42, DOT=43, SEMI=44;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "ID", "INT_LITE", "WS", "BLOCK_COMMENT", "LINE_COMMENT", 
		"ASSIGN", "GT", "LT", "GE", "LE", "PLUS", "MINUS", "TIMES", "BANG", "AND", 
		"OR", "L_PAREN", "R_PAREN", "L_BRACK", "R_BRACK", "L_BRACE", "R_BRACE", 
		"COMMA", "DOT", "SEMI"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'class'", "'public'", "'static'", "'void'", "'main'", "'String'", 
		"'extends'", "'return'", "'int'", "'boolean'", "'if'", "'else'", "'while'", 
		"'System.out.println'", "'length'", "'true'", "'false'", "'this'", "'new'", 
		null, null, null, null, null, "'='", "'>'", "'<'", "'>='", "'<='", "'+'", 
		"'-'", "'*'", "'!'", "'&&'", "'||'", "'('", "')'", "'['", "']'", "'{'", 
		"'}'", "','", "'.'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "ID", "INT_LITE", "WS", 
		"BLOCK_COMMENT", "LINE_COMMENT", "ASSIGN", "GT", "LT", "GE", "LE", "PLUS", 
		"MINUS", "TIMES", "BANG", "AND", "OR", "L_PAREN", "R_PAREN", "L_BRACK", 
		"R_BRACK", "L_BRACE", "R_BRACE", "COMMA", "DOT", "SEMI"
	};
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


	public MiniJavaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiniJava.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u0134\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\7\25\u00da\n\25\f\25\16\25\u00dd\13\25\3\26\3\26\3\26"+
		"\7\26\u00e2\n\26\f\26\16\26\u00e5\13\26\5\26\u00e7\n\26\3\27\6\27\u00ea"+
		"\n\27\r\27\16\27\u00eb\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u00f4\n\30\f"+
		"\30\16\30\u00f7\13\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\7\31"+
		"\u0102\n\31\f\31\16\31\u0105\13\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3"+
		"#\3#\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-"+
		"\3\u00f5\2.\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.\3\2\b\6\2&&C\\aac|\6\2\62"+
		";C\\aac|\3\2\63;\3\2\62;\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u0139\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3"+
		"\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\3[\3\2\2\2\5a\3\2\2\2\7h\3\2\2\2\to\3\2\2"+
		"\2\13t\3\2\2\2\ry\3\2\2\2\17\u0080\3\2\2\2\21\u0088\3\2\2\2\23\u008f\3"+
		"\2\2\2\25\u0093\3\2\2\2\27\u009b\3\2\2\2\31\u009e\3\2\2\2\33\u00a3\3\2"+
		"\2\2\35\u00a9\3\2\2\2\37\u00bc\3\2\2\2!\u00c3\3\2\2\2#\u00c8\3\2\2\2%"+
		"\u00ce\3\2\2\2\'\u00d3\3\2\2\2)\u00d7\3\2\2\2+\u00e6\3\2\2\2-\u00e9\3"+
		"\2\2\2/\u00ef\3\2\2\2\61\u00fd\3\2\2\2\63\u0108\3\2\2\2\65\u010a\3\2\2"+
		"\2\67\u010c\3\2\2\29\u010e\3\2\2\2;\u0111\3\2\2\2=\u0114\3\2\2\2?\u0116"+
		"\3\2\2\2A\u0118\3\2\2\2C\u011a\3\2\2\2E\u011c\3\2\2\2G\u011f\3\2\2\2I"+
		"\u0122\3\2\2\2K\u0124\3\2\2\2M\u0126\3\2\2\2O\u0128\3\2\2\2Q\u012a\3\2"+
		"\2\2S\u012c\3\2\2\2U\u012e\3\2\2\2W\u0130\3\2\2\2Y\u0132\3\2\2\2[\\\7"+
		"e\2\2\\]\7n\2\2]^\7c\2\2^_\7u\2\2_`\7u\2\2`\4\3\2\2\2ab\7r\2\2bc\7w\2"+
		"\2cd\7d\2\2de\7n\2\2ef\7k\2\2fg\7e\2\2g\6\3\2\2\2hi\7u\2\2ij\7v\2\2jk"+
		"\7c\2\2kl\7v\2\2lm\7k\2\2mn\7e\2\2n\b\3\2\2\2op\7x\2\2pq\7q\2\2qr\7k\2"+
		"\2rs\7f\2\2s\n\3\2\2\2tu\7o\2\2uv\7c\2\2vw\7k\2\2wx\7p\2\2x\f\3\2\2\2"+
		"yz\7U\2\2z{\7v\2\2{|\7t\2\2|}\7k\2\2}~\7p\2\2~\177\7i\2\2\177\16\3\2\2"+
		"\2\u0080\u0081\7g\2\2\u0081\u0082\7z\2\2\u0082\u0083\7v\2\2\u0083\u0084"+
		"\7g\2\2\u0084\u0085\7p\2\2\u0085\u0086\7f\2\2\u0086\u0087\7u\2\2\u0087"+
		"\20\3\2\2\2\u0088\u0089\7t\2\2\u0089\u008a\7g\2\2\u008a\u008b\7v\2\2\u008b"+
		"\u008c\7w\2\2\u008c\u008d\7t\2\2\u008d\u008e\7p\2\2\u008e\22\3\2\2\2\u008f"+
		"\u0090\7k\2\2\u0090\u0091\7p\2\2\u0091\u0092\7v\2\2\u0092\24\3\2\2\2\u0093"+
		"\u0094\7d\2\2\u0094\u0095\7q\2\2\u0095\u0096\7q\2\2\u0096\u0097\7n\2\2"+
		"\u0097\u0098\7g\2\2\u0098\u0099\7c\2\2\u0099\u009a\7p\2\2\u009a\26\3\2"+
		"\2\2\u009b\u009c\7k\2\2\u009c\u009d\7h\2\2\u009d\30\3\2\2\2\u009e\u009f"+
		"\7g\2\2\u009f\u00a0\7n\2\2\u00a0\u00a1\7u\2\2\u00a1\u00a2\7g\2\2\u00a2"+
		"\32\3\2\2\2\u00a3\u00a4\7y\2\2\u00a4\u00a5\7j\2\2\u00a5\u00a6\7k\2\2\u00a6"+
		"\u00a7\7n\2\2\u00a7\u00a8\7g\2\2\u00a8\34\3\2\2\2\u00a9\u00aa\7U\2\2\u00aa"+
		"\u00ab\7{\2\2\u00ab\u00ac\7u\2\2\u00ac\u00ad\7v\2\2\u00ad\u00ae\7g\2\2"+
		"\u00ae\u00af\7o\2\2\u00af\u00b0\7\60\2\2\u00b0\u00b1\7q\2\2\u00b1\u00b2"+
		"\7w\2\2\u00b2\u00b3\7v\2\2\u00b3\u00b4\7\60\2\2\u00b4\u00b5\7r\2\2\u00b5"+
		"\u00b6\7t\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8\7p\2\2\u00b8\u00b9\7v\2\2"+
		"\u00b9\u00ba\7n\2\2\u00ba\u00bb\7p\2\2\u00bb\36\3\2\2\2\u00bc\u00bd\7"+
		"n\2\2\u00bd\u00be\7g\2\2\u00be\u00bf\7p\2\2\u00bf\u00c0\7i\2\2\u00c0\u00c1"+
		"\7v\2\2\u00c1\u00c2\7j\2\2\u00c2 \3\2\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5"+
		"\7t\2\2\u00c5\u00c6\7w\2\2\u00c6\u00c7\7g\2\2\u00c7\"\3\2\2\2\u00c8\u00c9"+
		"\7h\2\2\u00c9\u00ca\7c\2\2\u00ca\u00cb\7n\2\2\u00cb\u00cc\7u\2\2\u00cc"+
		"\u00cd\7g\2\2\u00cd$\3\2\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d0\7j\2\2\u00d0"+
		"\u00d1\7k\2\2\u00d1\u00d2\7u\2\2\u00d2&\3\2\2\2\u00d3\u00d4\7p\2\2\u00d4"+
		"\u00d5\7g\2\2\u00d5\u00d6\7y\2\2\u00d6(\3\2\2\2\u00d7\u00db\t\2\2\2\u00d8"+
		"\u00da\t\3\2\2\u00d9\u00d8\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2"+
		"\2\2\u00db\u00dc\3\2\2\2\u00dc*\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00e7"+
		"\7\62\2\2\u00df\u00e3\t\4\2\2\u00e0\u00e2\t\5\2\2\u00e1\u00e0\3\2\2\2"+
		"\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e7"+
		"\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00de\3\2\2\2\u00e6\u00df\3\2\2\2\u00e7"+
		",\3\2\2\2\u00e8\u00ea\t\6\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2"+
		"\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee"+
		"\b\27\2\2\u00ee.\3\2\2\2\u00ef\u00f0\7\61\2\2\u00f0\u00f1\7,\2\2\u00f1"+
		"\u00f5\3\2\2\2\u00f2\u00f4\13\2\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3"+
		"\2\2\2\u00f5\u00f6\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f8\3\2\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f8\u00f9\7,\2\2\u00f9\u00fa\7\61\2\2\u00fa\u00fb\3\2"+
		"\2\2\u00fb\u00fc\b\30\2\2\u00fc\60\3\2\2\2\u00fd\u00fe\7\61\2\2\u00fe"+
		"\u00ff\7\61\2\2\u00ff\u0103\3\2\2\2\u0100\u0102\n\7\2\2\u0101\u0100\3"+
		"\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u0106\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0107\b\31\2\2\u0107\62\3\2\2"+
		"\2\u0108\u0109\7?\2\2\u0109\64\3\2\2\2\u010a\u010b\7@\2\2\u010b\66\3\2"+
		"\2\2\u010c\u010d\7>\2\2\u010d8\3\2\2\2\u010e\u010f\7@\2\2\u010f\u0110"+
		"\7?\2\2\u0110:\3\2\2\2\u0111\u0112\7>\2\2\u0112\u0113\7?\2\2\u0113<\3"+
		"\2\2\2\u0114\u0115\7-\2\2\u0115>\3\2\2\2\u0116\u0117\7/\2\2\u0117@\3\2"+
		"\2\2\u0118\u0119\7,\2\2\u0119B\3\2\2\2\u011a\u011b\7#\2\2\u011bD\3\2\2"+
		"\2\u011c\u011d\7(\2\2\u011d\u011e\7(\2\2\u011eF\3\2\2\2\u011f\u0120\7"+
		"~\2\2\u0120\u0121\7~\2\2\u0121H\3\2\2\2\u0122\u0123\7*\2\2\u0123J\3\2"+
		"\2\2\u0124\u0125\7+\2\2\u0125L\3\2\2\2\u0126\u0127\7]\2\2\u0127N\3\2\2"+
		"\2\u0128\u0129\7_\2\2\u0129P\3\2\2\2\u012a\u012b\7}\2\2\u012bR\3\2\2\2"+
		"\u012c\u012d\7\177\2\2\u012dT\3\2\2\2\u012e\u012f\7.\2\2\u012fV\3\2\2"+
		"\2\u0130\u0131\7\60\2\2\u0131X\3\2\2\2\u0132\u0133\7=\2\2\u0133Z\3\2\2"+
		"\2\t\2\u00db\u00e3\u00e6\u00eb\u00f5\u0103\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}