// Generated from /home/eugene/university/3course/parsing/src/main/java/hw4/fake_antlr/Test.g4 by ANTLR 4.5.1
package hw4.my_parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TestParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, NUM=5, WS=6;
	public static final int
		RULE_e = 0, RULE_e2 = 1, RULE_t = 2, RULE_t2 = 3, RULE_f = 4;
	public static final String[] ruleNames = {
		"e", "e2", "t", "t2", "f"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'", "'*'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "NUM", "WS"
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

	@Override
	public String getGrammarFileName() { return "Test.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	  protected ANTLRErrorStrategy _errHandler = new DefaultErrorStrategy() {
	      @Override
	      public void reportError(Parser recognizer, RecognitionException e) {
	        super.reportError(recognizer, e);
	        throw e;
	      }
	  };

	public TestParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class EContext extends ParserRuleContext {
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public E2Context e2() {
			return getRuleContext(E2Context.class,0);
		}
		public EContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitE(this);
		}
	}

	public final EContext e() throws RecognitionException {
		EContext _localctx = new EContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_e);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			t();
			setState(11);
			e2();
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

	public static class E2Context extends ParserRuleContext {
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public E2Context e2() {
			return getRuleContext(E2Context.class,0);
		}
		public E2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterE2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitE2(this);
		}
	}

	public final E2Context e2() throws RecognitionException {
		E2Context _localctx = new E2Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_e2);
		try {
			setState(18);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(13);
				match(T__0);
				setState(14);
				t();
				setState(15);
				e2();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class TContext extends ParserRuleContext {
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public T2Context t2() {
			return getRuleContext(T2Context.class,0);
		}
		public TContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitT(this);
		}
	}

	public final TContext t() throws RecognitionException {
		TContext _localctx = new TContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			f();
			setState(21);
			t2();
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

	public static class T2Context extends ParserRuleContext {
		public T2Context t2() {
			return getRuleContext(T2Context.class,0);
		}
		public T2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterT2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitT2(this);
		}
	}

	public final T2Context t2() throws RecognitionException {
		T2Context _localctx = new T2Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_t2);
		try {
			setState(26);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(23);
				match(T__1);
				setState(24);
				t2();
				}
				break;
			case T__0:
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class FContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(TestParser.NUM, 0); }
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public FContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitF(this);
		}
	}

	public final FContext f() throws RecognitionException {
		FContext _localctx = new FContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_f);
		try {
			setState(33);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				match(NUM);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				match(T__2);
				setState(30);
				e();
				setState(31);
				match(T__3);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\b&\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3\25\n\3"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\5\5\35\n\5\3\6\3\6\3\6\3\6\3\6\5\6$\n\6\3\6\2"+
		"\2\7\2\4\6\b\n\2\2#\2\f\3\2\2\2\4\24\3\2\2\2\6\26\3\2\2\2\b\34\3\2\2\2"+
		"\n#\3\2\2\2\f\r\5\6\4\2\r\16\5\4\3\2\16\3\3\2\2\2\17\20\7\3\2\2\20\21"+
		"\5\6\4\2\21\22\5\4\3\2\22\25\3\2\2\2\23\25\3\2\2\2\24\17\3\2\2\2\24\23"+
		"\3\2\2\2\25\5\3\2\2\2\26\27\5\n\6\2\27\30\5\b\5\2\30\7\3\2\2\2\31\32\7"+
		"\4\2\2\32\35\5\b\5\2\33\35\3\2\2\2\34\31\3\2\2\2\34\33\3\2\2\2\35\t\3"+
		"\2\2\2\36$\7\7\2\2\37 \7\5\2\2 !\5\2\2\2!\"\7\6\2\2\"$\3\2\2\2#\36\3\2"+
		"\2\2#\37\3\2\2\2$\13\3\2\2\2\5\24\34#";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}