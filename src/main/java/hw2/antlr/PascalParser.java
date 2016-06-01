// Generated from /home/eugene/university/3course/parsing/src/main/java/hw2/antlr/Pascal.g4 by ANTLR 4.5.1
package hw2.antlr;

    import hw2.pascal.parser.Tree;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PascalParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, Type=5, Name=6, WS=7;
	public static final int
		RULE_start = 0, RULE_vars = 1, RULE_vars_in = 2, RULE_vars2 = 3, RULE_vars2_in = 4, 
		RULE_vars2_in2 = 5, RULE_vars3 = 6, RULE_decl = 7, RULE_names = 8, RULE_names2 = 9, 
		RULE_names2_in = 10;
	public static final String[] ruleNames = {
		"start", "vars", "vars_in", "vars2", "vars2_in", "vars2_in2", "vars3", 
		"decl", "names", "names2", "names2_in"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'var'", "':'", "';\n'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "Type", "Name", "WS"
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
	public String getGrammarFileName() { return "Pascal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    Tree root;

	public PascalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public VarsContext vars;
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(T__0);
			setState(23);
			((StartContext)_localctx).vars = vars();
			 root = new Tree("start", new Tree("var"), ((StartContext)_localctx).vars.node); 
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

	public static class VarsContext extends ParserRuleContext {
		public Tree node;
		public DeclContext decl;
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public Vars_inContext vars_in() {
			return getRuleContext(Vars_inContext.class,0);
		}
		public VarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitVars(this);
		}
	}

	public final VarsContext vars() throws RecognitionException {
		VarsContext _localctx = new VarsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_vars);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			((VarsContext)_localctx).decl = decl();
			 ((VarsContext)_localctx).node =  new Tree("vars", ((VarsContext)_localctx).decl.node); 
			setState(28);
			vars_in(_localctx.node);
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

	public static class Vars_inContext extends ParserRuleContext {
		public Tree node;
		public Vars2Context vars2;
		public Vars2Context vars2() {
			return getRuleContext(Vars2Context.class,0);
		}
		public Vars_inContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Vars_inContext(ParserRuleContext parent, int invokingState, Tree node) {
			super(parent, invokingState);
			this.node = node;
		}
		@Override public int getRuleIndex() { return RULE_vars_in; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterVars_in(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitVars_in(this);
		}
	}

	public final Vars_inContext vars_in(Tree node) throws RecognitionException {
		Vars_inContext _localctx = new Vars_inContext(_ctx, getState(), node);
		enterRule(_localctx, 4, RULE_vars_in);
		try {
			setState(34);
			switch (_input.LA(1)) {
			case T__0:
			case Name:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				((Vars_inContext)_localctx).vars2 = vars2();
				 _localctx.node.addChild(((Vars_inContext)_localctx).vars2.node); 
				}
				break;
			case EOF:
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

	public static class Vars2Context extends ParserRuleContext {
		public Tree node;
		public DeclContext decl;
		public Vars2_inContext vars2_in() {
			return getRuleContext(Vars2_inContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public Vars2_in2Context vars2_in2() {
			return getRuleContext(Vars2_in2Context.class,0);
		}
		public Vars2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterVars2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitVars2(this);
		}
	}

	public final Vars2Context vars2() throws RecognitionException {
		Vars2Context _localctx = new Vars2Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_vars2);

		                               ((Vars2Context)_localctx).node =  new Tree("vars2");
		                           
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			vars2_in(_localctx.node);
			setState(37);
			((Vars2Context)_localctx).decl = decl();
			 _localctx.node.addChild(((Vars2Context)_localctx).decl.node); 
			setState(39);
			vars2_in2(_localctx.node);
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

	public static class Vars2_inContext extends ParserRuleContext {
		public Tree node;
		public Vars2_inContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Vars2_inContext(ParserRuleContext parent, int invokingState, Tree node) {
			super(parent, invokingState);
			this.node = node;
		}
		@Override public int getRuleIndex() { return RULE_vars2_in; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterVars2_in(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitVars2_in(this);
		}
	}

	public final Vars2_inContext vars2_in(Tree node) throws RecognitionException {
		Vars2_inContext _localctx = new Vars2_inContext(_ctx, getState(), node);
		enterRule(_localctx, 8, RULE_vars2_in);
		try {
			setState(44);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				match(T__0);
				 _localctx.node.addChild(new Tree("var")); 
				}
				break;
			case Name:
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

	public static class Vars2_in2Context extends ParserRuleContext {
		public Tree node;
		public Vars3Context vars3;
		public Vars3Context vars3() {
			return getRuleContext(Vars3Context.class,0);
		}
		public Vars2_in2Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Vars2_in2Context(ParserRuleContext parent, int invokingState, Tree node) {
			super(parent, invokingState);
			this.node = node;
		}
		@Override public int getRuleIndex() { return RULE_vars2_in2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterVars2_in2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitVars2_in2(this);
		}
	}

	public final Vars2_in2Context vars2_in2(Tree node) throws RecognitionException {
		Vars2_in2Context _localctx = new Vars2_in2Context(_ctx, getState(), node);
		enterRule(_localctx, 10, RULE_vars2_in2);
		try {
			setState(50);
			switch (_input.LA(1)) {
			case T__0:
			case Name:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				((Vars2_in2Context)_localctx).vars3 = vars3();
				 _localctx.node.addChild(((Vars2_in2Context)_localctx).vars3.node); 
				}
				break;
			case EOF:
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

	public static class Vars3Context extends ParserRuleContext {
		public Tree node;
		public Vars2Context vars2;
		public Vars2Context vars2() {
			return getRuleContext(Vars2Context.class,0);
		}
		public Vars3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterVars3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitVars3(this);
		}
	}

	public final Vars3Context vars3() throws RecognitionException {
		Vars3Context _localctx = new Vars3Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_vars3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			((Vars3Context)_localctx).vars2 = vars2();
			 ((Vars3Context)_localctx).node =  ((Vars3Context)_localctx).vars2.node; 
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

	public static class DeclContext extends ParserRuleContext {
		public Tree node;
		public NamesContext names;
		public Token Type;
		public NamesContext names() {
			return getRuleContext(NamesContext.class,0);
		}
		public TerminalNode Type() { return getToken(PascalParser.Type, 0); }
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			((DeclContext)_localctx).names = names();
			setState(56);
			match(T__1);
			setState(57);
			((DeclContext)_localctx).Type = match(Type);
			setState(58);
			match(T__2);
			 ((DeclContext)_localctx).node =  new Tree("decl", ((DeclContext)_localctx).names.node, new Tree(":"), new Tree((((DeclContext)_localctx).Type!=null?((DeclContext)_localctx).Type.getText():null)), new Tree(";/n")); 
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

	public static class NamesContext extends ParserRuleContext {
		public Tree node;
		public Token Name;
		public TerminalNode Name() { return getToken(PascalParser.Name, 0); }
		public Names2_inContext names2_in() {
			return getRuleContext(Names2_inContext.class,0);
		}
		public NamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_names; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitNames(this);
		}
	}

	public final NamesContext names() throws RecognitionException {
		NamesContext _localctx = new NamesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_names);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			((NamesContext)_localctx).Name = match(Name);
			 ((NamesContext)_localctx).node =  new Tree("names", new Tree((((NamesContext)_localctx).Name!=null?((NamesContext)_localctx).Name.getText():null))); 
			setState(63);
			names2_in(_localctx.node);
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

	public static class Names2Context extends ParserRuleContext {
		public Tree node;
		public Token Name;
		public TerminalNode Name() { return getToken(PascalParser.Name, 0); }
		public Names2_inContext names2_in() {
			return getRuleContext(Names2_inContext.class,0);
		}
		public Names2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_names2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterNames2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitNames2(this);
		}
	}

	public final Names2Context names2() throws RecognitionException {
		Names2Context _localctx = new Names2Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_names2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(T__3);
			setState(66);
			((Names2Context)_localctx).Name = match(Name);
			 ((Names2Context)_localctx).node =  new Tree("names2", new Tree(","), new Tree((((Names2Context)_localctx).Name!=null?((Names2Context)_localctx).Name.getText():null))); 
			setState(68);
			names2_in(_localctx.node);
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

	public static class Names2_inContext extends ParserRuleContext {
		public Tree node;
		public Names2Context names2;
		public Names2Context names2() {
			return getRuleContext(Names2Context.class,0);
		}
		public Names2_inContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Names2_inContext(ParserRuleContext parent, int invokingState, Tree node) {
			super(parent, invokingState);
			this.node = node;
		}
		@Override public int getRuleIndex() { return RULE_names2_in; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterNames2_in(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitNames2_in(this);
		}
	}

	public final Names2_inContext names2_in(Tree node) throws RecognitionException {
		Names2_inContext _localctx = new Names2_inContext(_ctx, getState(), node);
		enterRule(_localctx, 20, RULE_names2_in);
		try {
			setState(74);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				((Names2_inContext)_localctx).names2 = names2();
				 _localctx.node.addChild(((Names2_inContext)_localctx).names2.node); 
				}
				break;
			case T__1:
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\tO\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4%\n\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\5\6/\n\6\3\7\3\7\3\7\3\7\5\7\65\n\7\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\5\fM\n\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\2G\2"+
		"\30\3\2\2\2\4\34\3\2\2\2\6$\3\2\2\2\b&\3\2\2\2\n.\3\2\2\2\f\64\3\2\2\2"+
		"\16\66\3\2\2\2\209\3\2\2\2\22?\3\2\2\2\24C\3\2\2\2\26L\3\2\2\2\30\31\7"+
		"\3\2\2\31\32\5\4\3\2\32\33\b\2\1\2\33\3\3\2\2\2\34\35\5\20\t\2\35\36\b"+
		"\3\1\2\36\37\5\6\4\2\37\5\3\2\2\2 !\5\b\5\2!\"\b\4\1\2\"%\3\2\2\2#%\3"+
		"\2\2\2$ \3\2\2\2$#\3\2\2\2%\7\3\2\2\2&\'\5\n\6\2\'(\5\20\t\2()\b\5\1\2"+
		")*\5\f\7\2*\t\3\2\2\2+,\7\3\2\2,/\b\6\1\2-/\3\2\2\2.+\3\2\2\2.-\3\2\2"+
		"\2/\13\3\2\2\2\60\61\5\16\b\2\61\62\b\7\1\2\62\65\3\2\2\2\63\65\3\2\2"+
		"\2\64\60\3\2\2\2\64\63\3\2\2\2\65\r\3\2\2\2\66\67\5\b\5\2\678\b\b\1\2"+
		"8\17\3\2\2\29:\5\22\n\2:;\7\4\2\2;<\7\7\2\2<=\7\5\2\2=>\b\t\1\2>\21\3"+
		"\2\2\2?@\7\b\2\2@A\b\n\1\2AB\5\26\f\2B\23\3\2\2\2CD\7\6\2\2DE\7\b\2\2"+
		"EF\b\13\1\2FG\5\26\f\2G\25\3\2\2\2HI\5\24\13\2IJ\b\f\1\2JM\3\2\2\2KM\3"+
		"\2\2\2LH\3\2\2\2LK\3\2\2\2M\27\3\2\2\2\6$.\64L";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}