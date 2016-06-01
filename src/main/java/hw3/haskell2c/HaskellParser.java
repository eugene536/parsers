// Generated from /home/eugene/university/3course/parsing/src/main/java/hw3/haskell2c/Haskell.g4 by ANTLR 4.5.1
package hw3.haskell2c;

    import java.util.HashMap;
    import java.lang.StringBuilder;
    import hw3.haskell2c.Func;
    import hw3.haskell2c.Arg;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HaskellParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, CONST=16, TYPE=17, 
		NAME=18, WS=19;
	public static final int
		RULE_program = 0, RULE_func = 1, RULE_func_decl = 2, RULE_func_def = 3, 
		RULE_arg = 4, RULE_cond = 5, RULE_expr = 6, RULE_fact = 7, RULE_unit = 8, 
		RULE_argsi = 9, RULE_func_call = 10;
	public static final String[] ruleNames = {
		"program", "func", "func_decl", "func_def", "arg", "cond", "expr", "fact", 
		"unit", "argsi", "func_call"
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

	@Override
	public String getGrammarFileName() { return "Haskell.g4"; }

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

	  public HashMap<String, Func> funcs = new HashMap<>();
	  public ArrayList<String> funcNames = new ArrayList<String>();

	public HaskellParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				func();
				}
				}
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NAME );
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

	public static class FuncContext extends ParserRuleContext {
		public Func_declContext func_decl;
		public Func_declContext func_decl() {
			return getRuleContext(Func_declContext.class,0);
		}
		public List<Func_defContext> func_def() {
			return getRuleContexts(Func_defContext.class);
		}
		public Func_defContext func_def(int i) {
			return getRuleContext(Func_defContext.class,i);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitFunc(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_func);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			((FuncContext)_localctx).func_decl = func_decl();
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(28);
				match(T__0);
				}
				}
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );

			                                                        funcs.get(((FuncContext)_localctx).func_decl.v).printDeclaration();
			                                                        funcNames.add(((FuncContext)_localctx).func_decl.v);
			                                                     
			setState(40); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(34);
					func_def(((FuncContext)_localctx).func_decl.v);
					setState(36); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(35);
						match(T__0);
						}
						}
						setState(38); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__0 );
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(42); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Func_declContext extends ParserRuleContext {
		public String v;
		public ArrayList<String> type =  new ArrayList<>();
		public Token NAME;
		public Token TYPE;
		public TerminalNode NAME() { return getToken(HaskellParser.NAME, 0); }
		public List<TerminalNode> TYPE() { return getTokens(HaskellParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(HaskellParser.TYPE, i);
		}
		public Func_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterFunc_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitFunc_decl(this);
		}
	}

	public final Func_declContext func_decl() throws RecognitionException {
		Func_declContext _localctx = new Func_declContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_func_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(44);
			((Func_declContext)_localctx).NAME = match(NAME);
			setState(45);
			if (!( !funcs.containsKey((((Func_declContext)_localctx).NAME!=null?((Func_declContext)_localctx).NAME.getText():null)) )) throw new FailedPredicateException(this, " !funcs.containsKey($NAME.text) ", "multiple function declaration: " + (((Func_declContext)_localctx).NAME!=null?((Func_declContext)_localctx).NAME.getText():null));
			setState(46);
			match(T__1);
			setState(47);
			((Func_declContext)_localctx).TYPE = match(TYPE);
			 _localctx.type.add((((Func_declContext)_localctx).TYPE!=null?((Func_declContext)_localctx).TYPE.getText():null)); 
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(49);
				match(T__2);
				setState(50);
				((Func_declContext)_localctx).TYPE = match(TYPE);
				 _localctx.type.add((((Func_declContext)_localctx).TYPE!=null?((Func_declContext)_localctx).TYPE.getText():null)); 
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}

			                                                         ((Func_declContext)_localctx).v =  (((Func_declContext)_localctx).NAME!=null?((Func_declContext)_localctx).NAME.getText():null);
			                                                         funcs.put((((Func_declContext)_localctx).NAME!=null?((Func_declContext)_localctx).NAME.getText():null), new Func((((Func_declContext)_localctx).NAME!=null?((Func_declContext)_localctx).NAME.getText():null), _localctx.type));
			                                                     
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

	public static class Func_defContext extends ParserRuleContext {
		public String name;
		public ArrayList<Arg> args =  new ArrayList<>();
		public HashMap<String, Arg> toGen =  new HashMap<>();
		public Token NAME;
		public ExprContext expr;
		public CondContext cond;
		public TerminalNode NAME() { return getToken(HaskellParser.NAME, 0); }
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public Func_defContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Func_defContext(ParserRuleContext parent, int invokingState, String name) {
			super(parent, invokingState);
			this.name = name;
		}
		@Override public int getRuleIndex() { return RULE_func_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterFunc_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitFunc_def(this);
		}
	}

	public final Func_defContext func_def(String name) throws RecognitionException {
		Func_defContext _localctx = new Func_defContext(_ctx, getState(), name);
		enterRule(_localctx, 6, RULE_func_def);

		                                                         Func func = funcs.get(_localctx.name);
		                                                     
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			((Func_defContext)_localctx).NAME = match(NAME);
			setState(60);
			if (!( (((Func_defContext)_localctx).NAME!=null?((Func_defContext)_localctx).NAME.getText():null).equals(_localctx.name) )) throw new FailedPredicateException(this, " $NAME.text.equals($name) ");
			setState(64);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(61);
					arg(func.genArgs, _localctx.args, _localctx.toGen);
					}
					} 
				}
				setState(66);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(84);
			switch (_input.LA(1)) {
			case T__3:
				{
				{
				setState(67);
				match(T__3);
				setState(68);
				((Func_defContext)_localctx).expr = expr(_localctx.toGen);
				}
				 funcs.get(_localctx.name).printDefinition(_localctx.args, ((Func_defContext)_localctx).expr.text); 
				}
				break;
			case T__0:
				{
				setState(80); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						{
						setState(72);
						match(T__0);
						setState(73);
						match(T__4);
						setState(74);
						((Func_defContext)_localctx).cond = cond(_localctx.toGen);
						setState(75);
						match(T__3);
						setState(76);
						((Func_defContext)_localctx).expr = expr(_localctx.toGen);
						}
						 funcs.get(_localctx.name).printDefinition(((Func_defContext)_localctx).cond.text, ((Func_defContext)_localctx).expr.text); 
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(82); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ArgContext extends ParserRuleContext {
		public ArrayList<String> genArgs;
		public ArrayList<Arg> args;
		public HashMap<String, Arg> toGen;
		public Token CONST;
		public Token NAME;
		public TerminalNode CONST() { return getToken(HaskellParser.CONST, 0); }
		public TerminalNode NAME() { return getToken(HaskellParser.NAME, 0); }
		public ArgContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ArgContext(ParserRuleContext parent, int invokingState, ArrayList<String> genArgs, ArrayList<Arg> args, HashMap<String, Arg> toGen) {
			super(parent, invokingState);
			this.genArgs = genArgs;
			this.args = args;
			this.toGen = toGen;
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitArg(this);
		}
	}

	public final ArgContext arg(ArrayList<String> genArgs,ArrayList<Arg> args,HashMap<String, Arg> toGen) throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState(), genArgs, args, toGen);
		enterRule(_localctx, 8, RULE_arg);
		try {
			setState(91);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				((ArgContext)_localctx).CONST = match(CONST);
				 _localctx.args.add(new Arg((((ArgContext)_localctx).CONST!=null?((ArgContext)_localctx).CONST.getText():null), true)); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				if (!( _localctx.args.size() <= _localctx.toGen.size() )) throw new FailedPredicateException(this, " $args.size() <= $toGen.size() ");
				setState(89);
				((ArgContext)_localctx).NAME = match(NAME);

				                                                         _localctx.args.add(new Arg(genArgs.get(_localctx.args.size()), false));
				                                                         _localctx.toGen.put((((ArgContext)_localctx).NAME!=null?((ArgContext)_localctx).NAME.getText():null), args.get(args.size() - 1));
				                                                     
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

	public static class CondContext extends ParserRuleContext {
		public HashMap<String, Arg> toGen;
		public String text;
		public ExprContext lhs;
		public Token sign;
		public ExprContext rhs;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CondContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CondContext(ParserRuleContext parent, int invokingState, HashMap<String, Arg> toGen) {
			super(parent, invokingState);
			this.toGen = toGen;
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitCond(this);
		}
	}

	public final CondContext cond(HashMap<String, Arg> toGen) throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState(), toGen);
		enterRule(_localctx, 10, RULE_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			((CondContext)_localctx).lhs = expr(_localctx.toGen);
			setState(94);
			((CondContext)_localctx).sign = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) ) {
				((CondContext)_localctx).sign = (Token)_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(95);
			((CondContext)_localctx).rhs = expr(_localctx.toGen);
			 ((CondContext)_localctx).text =  ((CondContext)_localctx).lhs.text + (((CondContext)_localctx).sign!=null?((CondContext)_localctx).sign.getText():null) + ((CondContext)_localctx).rhs.text; 
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

	public static class ExprContext extends ParserRuleContext {
		public HashMap<String, Arg> toGen;
		public String text;
		public StringBuilder sb =  new StringBuilder();
		public FactContext fact;
		public Token sign;
		public List<FactContext> fact() {
			return getRuleContexts(FactContext.class);
		}
		public FactContext fact(int i) {
			return getRuleContext(FactContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExprContext(ParserRuleContext parent, int invokingState, HashMap<String, Arg> toGen) {
			super(parent, invokingState);
			this.toGen = toGen;
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr(HashMap<String, Arg> toGen) throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState(), toGen);
		enterRule(_localctx, 12, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			((ExprContext)_localctx).fact = fact(_localctx.toGen);
			 _localctx.sb.append(((ExprContext)_localctx).fact.text); 
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8 || _la==T__9) {
				{
				{
				setState(100);
				((ExprContext)_localctx).sign = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__8 || _la==T__9) ) {
					((ExprContext)_localctx).sign = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(101);
				((ExprContext)_localctx).fact = fact(_localctx.toGen);
				 _localctx.sb.append((((ExprContext)_localctx).sign!=null?((ExprContext)_localctx).sign.getText():null)).append(((ExprContext)_localctx).fact.text); 
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 ((ExprContext)_localctx).text =  _localctx.sb.toString(); 
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

	public static class FactContext extends ParserRuleContext {
		public HashMap<String, Arg> toGen;
		public String text;
		public StringBuilder sb =  new StringBuilder();
		public UnitContext unit;
		public Token sign;
		public List<UnitContext> unit() {
			return getRuleContexts(UnitContext.class);
		}
		public UnitContext unit(int i) {
			return getRuleContext(UnitContext.class,i);
		}
		public FactContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public FactContext(ParserRuleContext parent, int invokingState, HashMap<String, Arg> toGen) {
			super(parent, invokingState);
			this.toGen = toGen;
		}
		@Override public int getRuleIndex() { return RULE_fact; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterFact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitFact(this);
		}
	}

	public final FactContext fact(HashMap<String, Arg> toGen) throws RecognitionException {
		FactContext _localctx = new FactContext(_ctx, getState(), toGen);
		enterRule(_localctx, 14, RULE_fact);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			((FactContext)_localctx).unit = unit(_localctx.toGen);
			 _localctx.sb.append(((FactContext)_localctx).unit.text); 
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) {
				{
				{
				setState(113);
				((FactContext)_localctx).sign = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) ) {
					((FactContext)_localctx).sign = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(114);
				((FactContext)_localctx).unit = unit(_localctx.toGen);
				 _localctx.sb.append((((FactContext)_localctx).sign!=null?((FactContext)_localctx).sign.getText():null)).append(((FactContext)_localctx).unit.text);
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 ((FactContext)_localctx).text =  _localctx.sb.toString(); 
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

	public static class UnitContext extends ParserRuleContext {
		public HashMap<String, Arg> toGen;
		public String text;
		public Token CONST;
		public ExprContext expr;
		public ArgsiContext argsi;
		public Func_callContext func_call;
		public TerminalNode CONST() { return getToken(HaskellParser.CONST, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArgsiContext argsi() {
			return getRuleContext(ArgsiContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public UnitContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public UnitContext(ParserRuleContext parent, int invokingState, HashMap<String, Arg> toGen) {
			super(parent, invokingState);
			this.toGen = toGen;
		}
		@Override public int getRuleIndex() { return RULE_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitUnit(this);
		}
	}

	public final UnitContext unit(HashMap<String, Arg> toGen) throws RecognitionException {
		UnitContext _localctx = new UnitContext(_ctx, getState(), toGen);
		enterRule(_localctx, 16, RULE_unit);
		try {
			setState(139);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				((UnitContext)_localctx).CONST = match(CONST);
				 ((UnitContext)_localctx).text =  (((UnitContext)_localctx).CONST!=null?((UnitContext)_localctx).CONST.getText():null); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				match(T__13);
				setState(127);
				((UnitContext)_localctx).expr = expr(_localctx.toGen);
				setState(128);
				match(T__14);
				 ((UnitContext)_localctx).text =  "(" + ((UnitContext)_localctx).expr.text + ")"; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				if (!(_localctx.toGen.containsKey(getCurrentToken().getText()) )) throw new FailedPredicateException(this, "$toGen.containsKey(getCurrentToken().getText()) ");
				setState(132);
				((UnitContext)_localctx).argsi = argsi(_localctx.toGen);
				 ((UnitContext)_localctx).text =  ((UnitContext)_localctx).argsi.text;  
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(135);
				if (!( funcs.containsKey(getCurrentToken().getText()) )) throw new FailedPredicateException(this, " funcs.containsKey(getCurrentToken().getText()) ");
				setState(136);
				((UnitContext)_localctx).func_call = func_call(_localctx.toGen);
				 ((UnitContext)_localctx).text =  ((UnitContext)_localctx).func_call.text; 
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

	public static class ArgsiContext extends ParserRuleContext {
		public HashMap<String, Arg> toGen;
		public String text;
		public Token NAME;
		public TerminalNode NAME() { return getToken(HaskellParser.NAME, 0); }
		public ArgsiContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ArgsiContext(ParserRuleContext parent, int invokingState, HashMap<String, Arg> toGen) {
			super(parent, invokingState);
			this.toGen = toGen;
		}
		@Override public int getRuleIndex() { return RULE_argsi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterArgsi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitArgsi(this);
		}
	}

	public final ArgsiContext argsi(HashMap<String, Arg> toGen) throws RecognitionException {
		ArgsiContext _localctx = new ArgsiContext(_ctx, getState(), toGen);
		enterRule(_localctx, 18, RULE_argsi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			((ArgsiContext)_localctx).NAME = match(NAME);
			setState(142);
			if (!( _localctx.toGen.containsKey((((ArgsiContext)_localctx).NAME!=null?((ArgsiContext)_localctx).NAME.getText():null)) )) throw new FailedPredicateException(this, " $toGen.containsKey($NAME.text) ");
			 ((ArgsiContext)_localctx).text =  _localctx.toGen.get((((ArgsiContext)_localctx).NAME!=null?((ArgsiContext)_localctx).NAME.getText():null)).name;
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

	public static class Func_callContext extends ParserRuleContext {
		public HashMap<String, Arg> toGen;
		public String text;
		public StringBuilder res =  new StringBuilder();
		public String ex =  new String();
		public Token NAME;
		public Token CONST;
		public ArgsiContext argsi;
		public ExprContext expr;
		public TerminalNode NAME() { return getToken(HaskellParser.NAME, 0); }
		public List<TerminalNode> CONST() { return getTokens(HaskellParser.CONST); }
		public TerminalNode CONST(int i) {
			return getToken(HaskellParser.CONST, i);
		}
		public List<ArgsiContext> argsi() {
			return getRuleContexts(ArgsiContext.class);
		}
		public ArgsiContext argsi(int i) {
			return getRuleContext(ArgsiContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Func_callContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Func_callContext(ParserRuleContext parent, int invokingState, HashMap<String, Arg> toGen) {
			super(parent, invokingState);
			this.toGen = toGen;
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterFunc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitFunc_call(this);
		}
	}

	public final Func_callContext func_call(HashMap<String, Arg> toGen) throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState(), toGen);
		enterRule(_localctx, 20, RULE_func_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			((Func_callContext)_localctx).NAME = match(NAME);
			setState(146);
			if (!( funcs.containsKey((((Func_callContext)_localctx).NAME!=null?((Func_callContext)_localctx).NAME.getText():null)) )) throw new FailedPredicateException(this, " funcs.containsKey($NAME.text) ", "function " + (((Func_callContext)_localctx).NAME!=null?((Func_callContext)_localctx).NAME.getText():null) + " is not defined");
			 _localctx.res.append((((Func_callContext)_localctx).NAME!=null?((Func_callContext)_localctx).NAME.getText():null) + "("); 
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << CONST) | (1L << NAME))) != 0)) {
				{
				{
				setState(158);
				switch (_input.LA(1)) {
				case CONST:
					{
					setState(148);
					((Func_callContext)_localctx).CONST = match(CONST);
					 ((Func_callContext)_localctx).ex =  (((Func_callContext)_localctx).CONST!=null?((Func_callContext)_localctx).CONST.getText():null); 
					}
					break;
				case NAME:
					{
					setState(150);
					((Func_callContext)_localctx).argsi = argsi(_localctx.toGen);
					 ((Func_callContext)_localctx).ex =  ((Func_callContext)_localctx).argsi.text; 
					}
					break;
				case T__13:
					{
					setState(153);
					match(T__13);
					setState(154);
					((Func_callContext)_localctx).expr = expr(_localctx.toGen);
					setState(155);
					match(T__14);
					 ((Func_callContext)_localctx).ex =  "(" + ((Func_callContext)_localctx).expr.text + ")"; 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				 _localctx.res.append(_localctx.ex + ", "); 
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			                                                        if (_localctx.res.length() > 2 && _localctx.res.charAt(_localctx.res.length() - 2) == ',') {
			                                                            _localctx.res.delete(_localctx.res.length() - 2, _localctx.res.length());
			                                                        }
			                                                        _localctx.res.append(')');
			                                                        ((Func_callContext)_localctx).text =  _localctx.res.toString();
			                                                     
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return func_decl_sempred((Func_declContext)_localctx, predIndex);
		case 3:
			return func_def_sempred((Func_defContext)_localctx, predIndex);
		case 4:
			return arg_sempred((ArgContext)_localctx, predIndex);
		case 8:
			return unit_sempred((UnitContext)_localctx, predIndex);
		case 9:
			return argsi_sempred((ArgsiContext)_localctx, predIndex);
		case 10:
			return func_call_sempred((Func_callContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean func_decl_sempred(Func_declContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return  !funcs.containsKey((((Func_declContext)_localctx).NAME!=null?((Func_declContext)_localctx).NAME.getText():null)) ;
		}
		return true;
	}
	private boolean func_def_sempred(Func_defContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return  (((Func_defContext)_localctx).NAME!=null?((Func_defContext)_localctx).NAME.getText():null).equals(_localctx.name) ;
		}
		return true;
	}
	private boolean arg_sempred(ArgContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return  _localctx.args.size() <= _localctx.toGen.size() ;
		}
		return true;
	}
	private boolean unit_sempred(UnitContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return _localctx.toGen.containsKey(getCurrentToken().getText()) ;
		case 4:
			return  funcs.containsKey(getCurrentToken().getText()) ;
		}
		return true;
	}
	private boolean argsi_sempred(ArgsiContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return  _localctx.toGen.containsKey((((ArgsiContext)_localctx).NAME!=null?((ArgsiContext)_localctx).NAME.getText():null)) ;
		}
		return true;
	}
	private boolean func_call_sempred(Func_callContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return  funcs.containsKey((((Func_callContext)_localctx).NAME!=null?((Func_callContext)_localctx).NAME.getText():null)) ;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\25\u00ab\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\6\2\32\n\2\r\2\16\2\33\3\3\3\3\6\3 \n\3\r\3\16\3!\3"+
		"\3\3\3\3\3\6\3\'\n\3\r\3\16\3(\6\3+\n\3\r\3\16\3,\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\7\4\67\n\4\f\4\16\4:\13\4\3\4\3\4\3\5\3\5\3\5\7\5A\n\5\f"+
		"\5\16\5D\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5"+
		"S\n\5\r\5\16\5T\5\5W\n\5\3\6\3\6\3\6\3\6\3\6\5\6^\n\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\7\bk\n\b\f\b\16\bn\13\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\7\tx\n\t\f\t\16\t{\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u008e\n\n\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00a1\n\f\3\f"+
		"\7\f\u00a4\n\f\f\f\16\f\u00a7\13\f\3\f\3\f\3\f\2\2\r\2\4\6\b\n\f\16\20"+
		"\22\24\26\2\5\3\2\b\n\3\2\13\f\3\2\r\17\u00b0\2\31\3\2\2\2\4\35\3\2\2"+
		"\2\6.\3\2\2\2\b=\3\2\2\2\n]\3\2\2\2\f_\3\2\2\2\16d\3\2\2\2\20q\3\2\2\2"+
		"\22\u008d\3\2\2\2\24\u008f\3\2\2\2\26\u0093\3\2\2\2\30\32\5\4\3\2\31\30"+
		"\3\2\2\2\32\33\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\3\3\2\2\2\35\37"+
		"\5\6\4\2\36 \7\3\2\2\37\36\3\2\2\2 !\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\""+
		"#\3\2\2\2#*\b\3\1\2$&\5\b\5\2%\'\7\3\2\2&%\3\2\2\2\'(\3\2\2\2(&\3\2\2"+
		"\2()\3\2\2\2)+\3\2\2\2*$\3\2\2\2+,\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\5\3\2"+
		"\2\2./\7\24\2\2/\60\6\4\2\3\60\61\7\4\2\2\61\62\7\23\2\2\628\b\4\1\2\63"+
		"\64\7\5\2\2\64\65\7\23\2\2\65\67\b\4\1\2\66\63\3\2\2\2\67:\3\2\2\28\66"+
		"\3\2\2\289\3\2\2\29;\3\2\2\2:8\3\2\2\2;<\b\4\1\2<\7\3\2\2\2=>\7\24\2\2"+
		">B\6\5\3\3?A\5\n\6\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CV\3\2\2\2"+
		"DB\3\2\2\2EF\7\6\2\2FG\5\16\b\2GH\3\2\2\2HI\b\5\1\2IW\3\2\2\2JK\7\3\2"+
		"\2KL\7\7\2\2LM\5\f\7\2MN\7\6\2\2NO\5\16\b\2OP\3\2\2\2PQ\b\5\1\2QS\3\2"+
		"\2\2RJ\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VE\3\2\2\2VR\3\2"+
		"\2\2W\t\3\2\2\2XY\7\22\2\2Y^\b\6\1\2Z[\6\6\4\3[\\\7\24\2\2\\^\b\6\1\2"+
		"]X\3\2\2\2]Z\3\2\2\2^\13\3\2\2\2_`\5\16\b\2`a\t\2\2\2ab\5\16\b\2bc\b\7"+
		"\1\2c\r\3\2\2\2de\5\20\t\2el\b\b\1\2fg\t\3\2\2gh\5\20\t\2hi\b\b\1\2ik"+
		"\3\2\2\2jf\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2nl\3\2\2\2o"+
		"p\b\b\1\2p\17\3\2\2\2qr\5\22\n\2ry\b\t\1\2st\t\4\2\2tu\5\22\n\2uv\b\t"+
		"\1\2vx\3\2\2\2ws\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2"+
		"\2\2|}\b\t\1\2}\21\3\2\2\2~\177\7\22\2\2\177\u008e\b\n\1\2\u0080\u0081"+
		"\7\20\2\2\u0081\u0082\5\16\b\2\u0082\u0083\7\21\2\2\u0083\u0084\b\n\1"+
		"\2\u0084\u008e\3\2\2\2\u0085\u0086\6\n\5\3\u0086\u0087\5\24\13\2\u0087"+
		"\u0088\b\n\1\2\u0088\u008e\3\2\2\2\u0089\u008a\6\n\6\2\u008a\u008b\5\26"+
		"\f\2\u008b\u008c\b\n\1\2\u008c\u008e\3\2\2\2\u008d~\3\2\2\2\u008d\u0080"+
		"\3\2\2\2\u008d\u0085\3\2\2\2\u008d\u0089\3\2\2\2\u008e\23\3\2\2\2\u008f"+
		"\u0090\7\24\2\2\u0090\u0091\6\13\7\3\u0091\u0092\b\13\1\2\u0092\25\3\2"+
		"\2\2\u0093\u0094\7\24\2\2\u0094\u0095\6\f\b\3\u0095\u00a5\b\f\1\2\u0096"+
		"\u0097\7\22\2\2\u0097\u00a1\b\f\1\2\u0098\u0099\5\24\13\2\u0099\u009a"+
		"\b\f\1\2\u009a\u00a1\3\2\2\2\u009b\u009c\7\20\2\2\u009c\u009d\5\16\b\2"+
		"\u009d\u009e\7\21\2\2\u009e\u009f\b\f\1\2\u009f\u00a1\3\2\2\2\u00a0\u0096"+
		"\3\2\2\2\u00a0\u0098\3\2\2\2\u00a0\u009b\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a4\b\f\1\2\u00a3\u00a0\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2"+
		"\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8"+
		"\u00a9\b\f\1\2\u00a9\27\3\2\2\2\20\33!(,8BTV]ly\u008d\u00a0\u00a5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}