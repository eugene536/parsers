// Generated from /home/eugene/university/3course/parsing/src/main/java/hw3/haskell2c/Haskell.g4 by ANTLR 4.5.1
package hw3.haskell2c;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HaskellLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, CONST=16, TYPE=17, 
		NAME=18, WS=19;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "CONST", "TYPE", 
		"NAME", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\n'", "'::'", "'->'", "'='", "'|'", "'=='", "'>'", "'<'", "'+'", 
		"'-'", "'*'", "'/'", "'%'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "CONST", "TYPE", "NAME", "WS"
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


	public HaskellLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Haskell.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 16:
			TYPE_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void TYPE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 setText("int"); 
			break;
		case 1:
			 setText("double"); 
			break;
		case 2:
			 setText("bool"); 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\25\177\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3"+
		"\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\21\7\21N\n\21\f\21\16\21Q\13\21\5\21"+
		"S\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22p\n\22\3\23\3\23\7\23t\n\23\f\23\16\23w\13\23\3\24\6\24z\n\24\r\24"+
		"\16\24{\3\24\3\24\2\2\25\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25\3\2\b\3\2\62\62\3\2\63"+
		";\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\13\17\17\"\"\u0084\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5+\3\2\2\2\7.\3\2\2\2\t\61\3\2\2\2\13\63"+
		"\3\2\2\2\r\65\3\2\2\2\178\3\2\2\2\21:\3\2\2\2\23<\3\2\2\2\25>\3\2\2\2"+
		"\27@\3\2\2\2\31B\3\2\2\2\33D\3\2\2\2\35F\3\2\2\2\37H\3\2\2\2!R\3\2\2\2"+
		"#o\3\2\2\2%q\3\2\2\2\'y\3\2\2\2)*\7\f\2\2*\4\3\2\2\2+,\7<\2\2,-\7<\2\2"+
		"-\6\3\2\2\2./\7/\2\2/\60\7@\2\2\60\b\3\2\2\2\61\62\7?\2\2\62\n\3\2\2\2"+
		"\63\64\7~\2\2\64\f\3\2\2\2\65\66\7?\2\2\66\67\7?\2\2\67\16\3\2\2\289\7"+
		"@\2\29\20\3\2\2\2:;\7>\2\2;\22\3\2\2\2<=\7-\2\2=\24\3\2\2\2>?\7/\2\2?"+
		"\26\3\2\2\2@A\7,\2\2A\30\3\2\2\2BC\7\61\2\2C\32\3\2\2\2DE\7\'\2\2E\34"+
		"\3\2\2\2FG\7*\2\2G\36\3\2\2\2HI\7+\2\2I \3\2\2\2JS\t\2\2\2KO\t\3\2\2L"+
		"N\t\4\2\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PS\3\2\2\2QO\3\2\2\2"+
		"RJ\3\2\2\2RK\3\2\2\2S\"\3\2\2\2TU\7K\2\2UV\7p\2\2VW\7v\2\2WX\7g\2\2XY"+
		"\7i\2\2YZ\7g\2\2Z[\7t\2\2[\\\3\2\2\2\\p\b\22\2\2]^\7H\2\2^_\7t\2\2_`\7"+
		"c\2\2`a\7e\2\2ab\7v\2\2bc\7k\2\2cd\7q\2\2de\7p\2\2ef\7c\2\2fg\7n\2\2g"+
		"h\3\2\2\2hp\b\22\3\2ij\7D\2\2jk\7q\2\2kl\7q\2\2lm\7n\2\2mn\3\2\2\2np\b"+
		"\22\4\2oT\3\2\2\2o]\3\2\2\2oi\3\2\2\2p$\3\2\2\2qu\t\5\2\2rt\t\6\2\2sr"+
		"\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v&\3\2\2\2wu\3\2\2\2xz\t\7\2\2y"+
		"x\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\b\24\5\2~(\3\2\2\2"+
		"\b\2ORou{\6\3\22\2\3\22\3\3\22\4\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}