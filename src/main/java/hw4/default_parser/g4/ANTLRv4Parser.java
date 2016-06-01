// Generated from /home/eugene/university/3course/parsing/src/main/java/hw4/default_parser/g4/ANTLRv4Parser.g4 by ANTLR 4.5.1
package hw4.default_parser.g4;

    import hw4.default_parser.main.*;
    import hw4.default_parser.rules.parser.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ANTLRv4Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TOKEN_REF=1, RULE_REF=2, LEXER_CHAR_SET=3, DOC_COMMENT=4, BLOCK_COMMENT=5, 
		LINE_COMMENT=6, INT=7, STRING_LITERAL=8, UNTERMINATED_STRING_LITERAL=9, 
		BEGIN_ARGUMENT=10, BEGIN_ACTION=11, OPTIONS=12, TOKENS=13, CHANNELS=14, 
		IMPORT=15, FRAGMENT=16, LEXER=17, PARSER=18, GRAMMAR=19, PROTECTED=20, 
		PUBLIC=21, PRIVATE=22, RETURNS=23, LOCALS=24, THROWS=25, CATCH=26, FINALLY=27, 
		MODE=28, COLON=29, COLONCOLON=30, COMMA=31, SEMI=32, LPAREN=33, RPAREN=34, 
		LBRACE=35, RBRACE=36, RARROW=37, LT=38, GT=39, ASSIGN=40, QUESTION=41, 
		STAR=42, PLUS_ASSIGN=43, PLUS=44, OR=45, DOLLAR=46, RANGE=47, DOT=48, 
		AT=49, POUND=50, NOT=51, ID=52, WS=53, ERRCHAR=54, END_ARGUMENT=55, UNTERMINATED_ARGUMENT=56, 
		ARGUMENT_CONTENT=57, END_ACTION=58, UNTERMINATED_ACTION=59, ACTION_CONTENT=60, 
		UNTERMINATED_CHAR_SET=61;
	public static final int
		RULE_grammarSpec = 0, RULE_grammarType = 1, RULE_prequelConstruct = 2, 
		RULE_option = 3, RULE_optionValue = 4, RULE_delegateGrammars = 5, RULE_delegateGrammar = 6, 
		RULE_tokensSpec = 7, RULE_channelsSpec = 8, RULE_idList = 9, RULE_action = 10, 
		RULE_actionScopeName = 11, RULE_actionBlock = 12, RULE_argActionBlock = 13, 
		RULE_modeSpec = 14, RULE_rules = 15, RULE_ruleSpec = 16, RULE_parserRuleSpec = 17, 
		RULE_finallyClause = 18, RULE_rulePrequel = 19, RULE_ruleReturns = 20, 
		RULE_localsSpec = 21, RULE_ruleAction = 22, RULE_ruleModifiers = 23, RULE_ruleModifier = 24, 
		RULE_ruleBlock = 25, RULE_lexerRuleSpec = 26, RULE_lexerRuleBlock = 27, 
		RULE_lexerAltList = 28, RULE_lexerAlt = 29, RULE_lexerElements = 30, RULE_lexerElement = 31, 
		RULE_lexerCommands = 32, RULE_lexerCommand = 33, RULE_lexerCommandName = 34, 
		RULE_lexerCommandExpr = 35, RULE_altList = 36, RULE_alternative = 37, 
		RULE_element = 38, RULE_labeledElement = 39, RULE_ebnf = 40, RULE_blockSuffix = 41, 
		RULE_ebnfSuffix = 42, RULE_lexerAtom = 43, RULE_atom = 44, RULE_notSet = 45, 
		RULE_blockSet = 46, RULE_setElement = 47, RULE_block = 48, RULE_ruleref = 49, 
		RULE_terminal = 50, RULE_elementOption = 51, RULE_identifier = 52;
	public static final String[] ruleNames = {
		"grammarSpec", "grammarType", "prequelConstruct", "option", "optionValue", 
		"delegateGrammars", "delegateGrammar", "tokensSpec", "channelsSpec", "idList", 
		"action", "actionScopeName", "actionBlock", "argActionBlock", "modeSpec", 
		"rules", "ruleSpec", "parserRuleSpec", "finallyClause", "rulePrequel", 
		"ruleReturns", "localsSpec", "ruleAction", "ruleModifiers", "ruleModifier", 
		"ruleBlock", "lexerRuleSpec", "lexerRuleBlock", "lexerAltList", "lexerAlt", 
		"lexerElements", "lexerElement", "lexerCommands", "lexerCommand", "lexerCommandName", 
		"lexerCommandExpr", "altList", "alternative", "element", "labeledElement", 
		"ebnf", "blockSuffix", "ebnfSuffix", "lexerAtom", "atom", "notSet", "blockSet", 
		"setElement", "block", "ruleref", "terminal", "elementOption", "identifier"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"'options'", "'tokens'", "'channels'", "'import'", "'fragment'", "'lexer'", 
		"'parser'", "'grammar'", "'protected'", "'public'", "'private'", "'returns'", 
		"'locals'", "'throws'", "'catch'", "'finally'", "'mode'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TOKEN_REF", "RULE_REF", "LEXER_CHAR_SET", "DOC_COMMENT", "BLOCK_COMMENT", 
		"LINE_COMMENT", "INT", "STRING_LITERAL", "UNTERMINATED_STRING_LITERAL", 
		"BEGIN_ARGUMENT", "BEGIN_ACTION", "OPTIONS", "TOKENS", "CHANNELS", "IMPORT", 
		"FRAGMENT", "LEXER", "PARSER", "GRAMMAR", "PROTECTED", "PUBLIC", "PRIVATE", 
		"RETURNS", "LOCALS", "THROWS", "CATCH", "FINALLY", "MODE", "COLON", "COLONCOLON", 
		"COMMA", "SEMI", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "RARROW", "LT", 
		"GT", "ASSIGN", "QUESTION", "STAR", "PLUS_ASSIGN", "PLUS", "OR", "DOLLAR", 
		"RANGE", "DOT", "AT", "POUND", "NOT", "ID", "WS", "ERRCHAR", "END_ARGUMENT", 
		"UNTERMINATED_ARGUMENT", "ARGUMENT_CONTENT", "END_ACTION", "UNTERMINATED_ACTION", 
		"ACTION_CONTENT", "UNTERMINATED_CHAR_SET"
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
	public String getGrammarFileName() { return "ANTLRv4Parser.g4"; }

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

	  public ParserGenerator parserGenr = new ParserGenerator();
	  public LexerGenerator lexerGenr = new LexerGenerator();

	public ANTLRv4Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GrammarSpecContext extends ParserRuleContext {
		public GrammarTypeContext grammarType() {
			return getRuleContext(GrammarTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ANTLRv4Parser.SEMI, 0); }
		public RulesContext rules() {
			return getRuleContext(RulesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ANTLRv4Parser.EOF, 0); }
		public TerminalNode DOC_COMMENT() { return getToken(ANTLRv4Parser.DOC_COMMENT, 0); }
		public List<PrequelConstructContext> prequelConstruct() {
			return getRuleContexts(PrequelConstructContext.class);
		}
		public PrequelConstructContext prequelConstruct(int i) {
			return getRuleContext(PrequelConstructContext.class,i);
		}
		public List<ModeSpecContext> modeSpec() {
			return getRuleContexts(ModeSpecContext.class);
		}
		public ModeSpecContext modeSpec(int i) {
			return getRuleContext(ModeSpecContext.class,i);
		}
		public GrammarSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarSpec; }
	}

	public final GrammarSpecContext grammarSpec() throws RecognitionException {
		GrammarSpecContext _localctx = new GrammarSpecContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_grammarSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_la = _input.LA(1);
			if (_la==DOC_COMMENT) {
				{
				setState(106);
				match(DOC_COMMENT);
				}
			}

			setState(109);
			grammarType();
			setState(110);
			identifier();
			setState(111);
			match(SEMI);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOKENS) | (1L << CHANNELS) | (1L << IMPORT) | (1L << AT))) != 0)) {
				{
				{
				setState(112);
				prequelConstruct();
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			rules();
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODE) {
				{
				{
				setState(119);
				modeSpec();
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
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

	public static class GrammarTypeContext extends ParserRuleContext {
		public TerminalNode LEXER() { return getToken(ANTLRv4Parser.LEXER, 0); }
		public TerminalNode GRAMMAR() { return getToken(ANTLRv4Parser.GRAMMAR, 0); }
		public TerminalNode PARSER() { return getToken(ANTLRv4Parser.PARSER, 0); }
		public GrammarTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarType; }
	}

	public final GrammarTypeContext grammarType() throws RecognitionException {
		GrammarTypeContext _localctx = new GrammarTypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_grammarType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			switch (_input.LA(1)) {
			case LEXER:
				{
				setState(127);
				match(LEXER);
				setState(128);
				match(GRAMMAR);
				}
				break;
			case PARSER:
				{
				setState(129);
				match(PARSER);
				setState(130);
				match(GRAMMAR);
				}
				break;
			case GRAMMAR:
				{
				setState(131);
				match(GRAMMAR);
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

	public static class PrequelConstructContext extends ParserRuleContext {
		public DelegateGrammarsContext delegateGrammars() {
			return getRuleContext(DelegateGrammarsContext.class,0);
		}
		public TokensSpecContext tokensSpec() {
			return getRuleContext(TokensSpecContext.class,0);
		}
		public ChannelsSpecContext channelsSpec() {
			return getRuleContext(ChannelsSpecContext.class,0);
		}
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public PrequelConstructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prequelConstruct; }
	}

	public final PrequelConstructContext prequelConstruct() throws RecognitionException {
		PrequelConstructContext _localctx = new PrequelConstructContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_prequelConstruct);
		try {
			setState(138);
			switch (_input.LA(1)) {
			case IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				delegateGrammars();
				}
				break;
			case TOKENS:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				tokensSpec();
				}
				break;
			case CHANNELS:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				channelsSpec();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 4);
				{
				setState(137);
				action();
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

	public static class OptionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ANTLRv4Parser.ASSIGN, 0); }
		public OptionValueContext optionValue() {
			return getRuleContext(OptionValueContext.class,0);
		}
		public OptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option; }
	}

	public final OptionContext option() throws RecognitionException {
		OptionContext _localctx = new OptionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_option);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			identifier();
			setState(141);
			match(ASSIGN);
			setState(142);
			optionValue();
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

	public static class OptionValueContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(ANTLRv4Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ANTLRv4Parser.DOT, i);
		}
		public TerminalNode STRING_LITERAL() { return getToken(ANTLRv4Parser.STRING_LITERAL, 0); }
		public ActionBlockContext actionBlock() {
			return getRuleContext(ActionBlockContext.class,0);
		}
		public TerminalNode INT() { return getToken(ANTLRv4Parser.INT, 0); }
		public OptionValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionValue; }
	}

	public final OptionValueContext optionValue() throws RecognitionException {
		OptionValueContext _localctx = new OptionValueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_optionValue);
		int _la;
		try {
			setState(155);
			switch (_input.LA(1)) {
			case TOKEN_REF:
			case RULE_REF:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				identifier();
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(145);
					match(DOT);
					setState(146);
					identifier();
					}
					}
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(STRING_LITERAL);
				}
				break;
			case BEGIN_ACTION:
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				actionBlock();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 4);
				{
				setState(154);
				match(INT);
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

	public static class DelegateGrammarsContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(ANTLRv4Parser.IMPORT, 0); }
		public List<DelegateGrammarContext> delegateGrammar() {
			return getRuleContexts(DelegateGrammarContext.class);
		}
		public DelegateGrammarContext delegateGrammar(int i) {
			return getRuleContext(DelegateGrammarContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(ANTLRv4Parser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ANTLRv4Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ANTLRv4Parser.COMMA, i);
		}
		public DelegateGrammarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delegateGrammars; }
	}

	public final DelegateGrammarsContext delegateGrammars() throws RecognitionException {
		DelegateGrammarsContext _localctx = new DelegateGrammarsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_delegateGrammars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(IMPORT);
			setState(158);
			delegateGrammar();
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(159);
				match(COMMA);
				setState(160);
				delegateGrammar();
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(166);
			match(SEMI);
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

	public static class DelegateGrammarContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(ANTLRv4Parser.ASSIGN, 0); }
		public DelegateGrammarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delegateGrammar; }
	}

	public final DelegateGrammarContext delegateGrammar() throws RecognitionException {
		DelegateGrammarContext _localctx = new DelegateGrammarContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_delegateGrammar);
		try {
			setState(173);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				identifier();
				setState(169);
				match(ASSIGN);
				setState(170);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				identifier();
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

	public static class TokensSpecContext extends ParserRuleContext {
		public TerminalNode TOKENS() { return getToken(ANTLRv4Parser.TOKENS, 0); }
		public TerminalNode LBRACE() { return getToken(ANTLRv4Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ANTLRv4Parser.RBRACE, 0); }
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public TokensSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokensSpec; }
	}

	public final TokensSpecContext tokensSpec() throws RecognitionException {
		TokensSpecContext _localctx = new TokensSpecContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tokensSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(TOKENS);
			setState(176);
			match(LBRACE);
			setState(178);
			_la = _input.LA(1);
			if (_la==TOKEN_REF || _la==RULE_REF) {
				{
				setState(177);
				idList();
				}
			}

			setState(180);
			match(RBRACE);
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

	public static class ChannelsSpecContext extends ParserRuleContext {
		public TerminalNode CHANNELS() { return getToken(ANTLRv4Parser.CHANNELS, 0); }
		public TerminalNode LBRACE() { return getToken(ANTLRv4Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ANTLRv4Parser.RBRACE, 0); }
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public ChannelsSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_channelsSpec; }
	}

	public final ChannelsSpecContext channelsSpec() throws RecognitionException {
		ChannelsSpecContext _localctx = new ChannelsSpecContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_channelsSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(CHANNELS);
			setState(183);
			match(LBRACE);
			setState(185);
			_la = _input.LA(1);
			if (_la==TOKEN_REF || _la==RULE_REF) {
				{
				setState(184);
				idList();
				}
			}

			setState(187);
			match(RBRACE);
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

	public static class IdListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ANTLRv4Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ANTLRv4Parser.COMMA, i);
		}
		public IdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idList; }
	}

	public final IdListContext idList() throws RecognitionException {
		IdListContext _localctx = new IdListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_idList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			identifier();
			setState(194);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(190);
					match(COMMA);
					setState(191);
					identifier();
					}
					} 
				}
				setState(196);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(198);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(197);
				match(COMMA);
				}
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

	public static class ActionContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(ANTLRv4Parser.AT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ActionBlockContext actionBlock() {
			return getRuleContext(ActionBlockContext.class,0);
		}
		public ActionScopeNameContext actionScopeName() {
			return getRuleContext(ActionScopeNameContext.class,0);
		}
		public TerminalNode COLONCOLON() { return getToken(ANTLRv4Parser.COLONCOLON, 0); }
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(AT);
			setState(204);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(201);
				actionScopeName();
				setState(202);
				match(COLONCOLON);
				}
				break;
			}
			setState(206);
			identifier();
			setState(207);
			actionBlock();
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

	public static class ActionScopeNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LEXER() { return getToken(ANTLRv4Parser.LEXER, 0); }
		public TerminalNode PARSER() { return getToken(ANTLRv4Parser.PARSER, 0); }
		public ActionScopeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionScopeName; }
	}

	public final ActionScopeNameContext actionScopeName() throws RecognitionException {
		ActionScopeNameContext _localctx = new ActionScopeNameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_actionScopeName);
		try {
			setState(212);
			switch (_input.LA(1)) {
			case TOKEN_REF:
			case RULE_REF:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				identifier();
				}
				break;
			case LEXER:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				match(LEXER);
				}
				break;
			case PARSER:
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				match(PARSER);
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

	public static class ActionBlockContext extends ParserRuleContext {
		public String res;
		public Token ACTION_CONTENT;
		public TerminalNode BEGIN_ACTION() { return getToken(ANTLRv4Parser.BEGIN_ACTION, 0); }
		public TerminalNode END_ACTION() { return getToken(ANTLRv4Parser.END_ACTION, 0); }
		public List<TerminalNode> ACTION_CONTENT() { return getTokens(ANTLRv4Parser.ACTION_CONTENT); }
		public TerminalNode ACTION_CONTENT(int i) {
			return getToken(ANTLRv4Parser.ACTION_CONTENT, i);
		}
		public ActionBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionBlock; }
	}

	public final ActionBlockContext actionBlock() throws RecognitionException {
		ActionBlockContext _localctx = new ActionBlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_actionBlock);

		                    ((ActionBlockContext)_localctx).res =  "";
		                
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(BEGIN_ACTION);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ACTION_CONTENT) {
				{
				{
				setState(215);
				((ActionBlockContext)_localctx).ACTION_CONTENT = match(ACTION_CONTENT);
				((ActionBlockContext)_localctx).res =  _localctx.res + (((ActionBlockContext)_localctx).ACTION_CONTENT!=null?((ActionBlockContext)_localctx).ACTION_CONTENT.getText():null); 
				}
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(222);
			match(END_ACTION);
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

	public static class ArgActionBlockContext extends ParserRuleContext {
		public String res;
		public Token ARGUMENT_CONTENT;
		public TerminalNode BEGIN_ARGUMENT() { return getToken(ANTLRv4Parser.BEGIN_ARGUMENT, 0); }
		public TerminalNode END_ARGUMENT() { return getToken(ANTLRv4Parser.END_ARGUMENT, 0); }
		public List<TerminalNode> ARGUMENT_CONTENT() { return getTokens(ANTLRv4Parser.ARGUMENT_CONTENT); }
		public TerminalNode ARGUMENT_CONTENT(int i) {
			return getToken(ANTLRv4Parser.ARGUMENT_CONTENT, i);
		}
		public ArgActionBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argActionBlock; }
	}

	public final ArgActionBlockContext argActionBlock() throws RecognitionException {
		ArgActionBlockContext _localctx = new ArgActionBlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_argActionBlock);
		 ((ArgActionBlockContext)_localctx).res =  ""; 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(BEGIN_ARGUMENT);
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ARGUMENT_CONTENT) {
				{
				{
				setState(225);
				((ArgActionBlockContext)_localctx).ARGUMENT_CONTENT = match(ARGUMENT_CONTENT);
				((ArgActionBlockContext)_localctx).res =  _localctx.res + (((ArgActionBlockContext)_localctx).ARGUMENT_CONTENT!=null?((ArgActionBlockContext)_localctx).ARGUMENT_CONTENT.getText():null);
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(232);
			match(END_ARGUMENT);
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

	public static class ModeSpecContext extends ParserRuleContext {
		public TerminalNode MODE() { return getToken(ANTLRv4Parser.MODE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ANTLRv4Parser.SEMI, 0); }
		public List<LexerRuleSpecContext> lexerRuleSpec() {
			return getRuleContexts(LexerRuleSpecContext.class);
		}
		public LexerRuleSpecContext lexerRuleSpec(int i) {
			return getRuleContext(LexerRuleSpecContext.class,i);
		}
		public ModeSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modeSpec; }
	}

	public final ModeSpecContext modeSpec() throws RecognitionException {
		ModeSpecContext _localctx = new ModeSpecContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_modeSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(MODE);
			setState(235);
			identifier();
			setState(236);
			match(SEMI);
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_REF) {
				{
				{
				setState(237);
				lexerRuleSpec();
				}
				}
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class RulesContext extends ParserRuleContext {
		public List<RuleSpecContext> ruleSpec() {
			return getRuleContexts(RuleSpecContext.class);
		}
		public RuleSpecContext ruleSpec(int i) {
			return getRuleContext(RuleSpecContext.class,i);
		}
		public RulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rules; }
	}

	public final RulesContext rules() throws RecognitionException {
		RulesContext _localctx = new RulesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_rules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOKEN_REF) | (1L << RULE_REF) | (1L << DOC_COMMENT) | (1L << FRAGMENT) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << PRIVATE))) != 0)) {
				{
				{
				setState(243);
				ruleSpec();
				}
				}
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class RuleSpecContext extends ParserRuleContext {
		public ParserRuleSpecContext parserRuleSpec() {
			return getRuleContext(ParserRuleSpecContext.class,0);
		}
		public LexerRuleSpecContext lexerRuleSpec() {
			return getRuleContext(LexerRuleSpecContext.class,0);
		}
		public RuleSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleSpec; }
	}

	public final RuleSpecContext ruleSpec() throws RecognitionException {
		RuleSpecContext _localctx = new RuleSpecContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ruleSpec);
		try {
			setState(251);
			switch (_input.LA(1)) {
			case RULE_REF:
			case DOC_COMMENT:
			case FRAGMENT:
			case PROTECTED:
			case PUBLIC:
			case PRIVATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				parserRuleSpec();
				}
				break;
			case TOKEN_REF:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				lexerRuleSpec();
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

	public static class ParserRuleSpecContext extends ParserRuleContext {
		public Token RULE_REF;
		public ArgActionBlockContext argActionBlock;
		public RuleReturnsContext ruleReturns;
		public LocalsSpecContext localsSpec;
		public TerminalNode RULE_REF() { return getToken(ANTLRv4Parser.RULE_REF, 0); }
		public TerminalNode COLON() { return getToken(ANTLRv4Parser.COLON, 0); }
		public RuleBlockContext ruleBlock() {
			return getRuleContext(RuleBlockContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ANTLRv4Parser.SEMI, 0); }
		public TerminalNode DOC_COMMENT() { return getToken(ANTLRv4Parser.DOC_COMMENT, 0); }
		public RuleModifiersContext ruleModifiers() {
			return getRuleContext(RuleModifiersContext.class,0);
		}
		public ArgActionBlockContext argActionBlock() {
			return getRuleContext(ArgActionBlockContext.class,0);
		}
		public RuleReturnsContext ruleReturns() {
			return getRuleContext(RuleReturnsContext.class,0);
		}
		public LocalsSpecContext localsSpec() {
			return getRuleContext(LocalsSpecContext.class,0);
		}
		public List<RulePrequelContext> rulePrequel() {
			return getRuleContexts(RulePrequelContext.class);
		}
		public RulePrequelContext rulePrequel(int i) {
			return getRuleContext(RulePrequelContext.class,i);
		}
		public ParserRuleSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parserRuleSpec; }
	}

	public final ParserRuleSpecContext parserRuleSpec() throws RecognitionException {
		ParserRuleSpecContext _localctx = new ParserRuleSpecContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_parserRuleSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			_la = _input.LA(1);
			if (_la==DOC_COMMENT) {
				{
				setState(253);
				match(DOC_COMMENT);
				}
			}

			setState(257);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FRAGMENT) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << PRIVATE))) != 0)) {
				{
				setState(256);
				ruleModifiers();
				}
			}

			setState(259);
			((ParserRuleSpecContext)_localctx).RULE_REF = match(RULE_REF);
			 parserGenr.setCurName((((ParserRuleSpecContext)_localctx).RULE_REF!=null?((ParserRuleSpecContext)_localctx).RULE_REF.getText():null)); 
			setState(264);
			_la = _input.LA(1);
			if (_la==BEGIN_ARGUMENT) {
				{
				setState(261);
				((ParserRuleSpecContext)_localctx).argActionBlock = argActionBlock();
				 parserGenr.setArgs(((ParserRuleSpecContext)_localctx).argActionBlock.res); 
				}
			}

			setState(269);
			_la = _input.LA(1);
			if (_la==RETURNS) {
				{
				setState(266);
				((ParserRuleSpecContext)_localctx).ruleReturns = ruleReturns();
				 parserGenr.setReturns(((ParserRuleSpecContext)_localctx).ruleReturns.res); 
				}
			}

			setState(274);
			_la = _input.LA(1);
			if (_la==LOCALS) {
				{
				setState(271);
				((ParserRuleSpecContext)_localctx).localsSpec = localsSpec();
				 parserGenr.setLocals(((ParserRuleSpecContext)_localctx).localsSpec.res); 
				}
			}

			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(276);
				rulePrequel();
				}
				}
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(282);
			match(COLON);
			setState(283);
			ruleBlock();
			setState(284);
			match(SEMI);
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

	public static class FinallyClauseContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(ANTLRv4Parser.FINALLY, 0); }
		public ActionBlockContext actionBlock() {
			return getRuleContext(ActionBlockContext.class,0);
		}
		public FinallyClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyClause; }
	}

	public final FinallyClauseContext finallyClause() throws RecognitionException {
		FinallyClauseContext _localctx = new FinallyClauseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_finallyClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(FINALLY);
			setState(287);
			actionBlock();
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

	public static class RulePrequelContext extends ParserRuleContext {
		public RuleActionContext ruleAction() {
			return getRuleContext(RuleActionContext.class,0);
		}
		public RulePrequelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rulePrequel; }
	}

	public final RulePrequelContext rulePrequel() throws RecognitionException {
		RulePrequelContext _localctx = new RulePrequelContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_rulePrequel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			ruleAction();
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

	public static class RuleReturnsContext extends ParserRuleContext {
		public String res;
		public ArgActionBlockContext argActionBlock;
		public TerminalNode RETURNS() { return getToken(ANTLRv4Parser.RETURNS, 0); }
		public ArgActionBlockContext argActionBlock() {
			return getRuleContext(ArgActionBlockContext.class,0);
		}
		public RuleReturnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleReturns; }
	}

	public final RuleReturnsContext ruleReturns() throws RecognitionException {
		RuleReturnsContext _localctx = new RuleReturnsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ruleReturns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(RETURNS);
			setState(292);
			((RuleReturnsContext)_localctx).argActionBlock = argActionBlock();
			 ((RuleReturnsContext)_localctx).res =  ((RuleReturnsContext)_localctx).argActionBlock.res; 
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

	public static class LocalsSpecContext extends ParserRuleContext {
		public String res;
		public ArgActionBlockContext argActionBlock;
		public TerminalNode LOCALS() { return getToken(ANTLRv4Parser.LOCALS, 0); }
		public ArgActionBlockContext argActionBlock() {
			return getRuleContext(ArgActionBlockContext.class,0);
		}
		public LocalsSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localsSpec; }
	}

	public final LocalsSpecContext localsSpec() throws RecognitionException {
		LocalsSpecContext _localctx = new LocalsSpecContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_localsSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(LOCALS);
			setState(296);
			((LocalsSpecContext)_localctx).argActionBlock = argActionBlock();
			 ((LocalsSpecContext)_localctx).res =  ((LocalsSpecContext)_localctx).argActionBlock.res; 
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

	public static class RuleActionContext extends ParserRuleContext {
		public ActionBlockContext actionBlock;
		public TerminalNode AT() { return getToken(ANTLRv4Parser.AT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ActionBlockContext actionBlock() {
			return getRuleContext(ActionBlockContext.class,0);
		}
		public RuleActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleAction; }
	}

	public final RuleActionContext ruleAction() throws RecognitionException {
		RuleActionContext _localctx = new RuleActionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_ruleAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(AT);
			setState(300);
			identifier();
			setState(301);
			((RuleActionContext)_localctx).actionBlock = actionBlock();
			 parserGenr.setInit(((RuleActionContext)_localctx).actionBlock.res); 
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

	public static class RuleModifiersContext extends ParserRuleContext {
		public List<RuleModifierContext> ruleModifier() {
			return getRuleContexts(RuleModifierContext.class);
		}
		public RuleModifierContext ruleModifier(int i) {
			return getRuleContext(RuleModifierContext.class,i);
		}
		public RuleModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleModifiers; }
	}

	public final RuleModifiersContext ruleModifiers() throws RecognitionException {
		RuleModifiersContext _localctx = new RuleModifiersContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ruleModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(304);
				ruleModifier();
				}
				}
				setState(307); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FRAGMENT) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << PRIVATE))) != 0) );
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

	public static class RuleModifierContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(ANTLRv4Parser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(ANTLRv4Parser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(ANTLRv4Parser.PROTECTED, 0); }
		public TerminalNode FRAGMENT() { return getToken(ANTLRv4Parser.FRAGMENT, 0); }
		public RuleModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleModifier; }
	}

	public final RuleModifierContext ruleModifier() throws RecognitionException {
		RuleModifierContext _localctx = new RuleModifierContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_ruleModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FRAGMENT) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << PRIVATE))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class RuleBlockContext extends ParserRuleContext {
		public AltListContext altList() {
			return getRuleContext(AltListContext.class,0);
		}
		public RuleBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleBlock; }
	}

	public final RuleBlockContext ruleBlock() throws RecognitionException {
		RuleBlockContext _localctx = new RuleBlockContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ruleBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			altList();
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

	public static class LexerRuleSpecContext extends ParserRuleContext {
		public Token TOKEN_REF;
		public TerminalNode TOKEN_REF() { return getToken(ANTLRv4Parser.TOKEN_REF, 0); }
		public TerminalNode COLON() { return getToken(ANTLRv4Parser.COLON, 0); }
		public LexerRuleBlockContext lexerRuleBlock() {
			return getRuleContext(LexerRuleBlockContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ANTLRv4Parser.SEMI, 0); }
		public LexerRuleSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerRuleSpec; }
	}

	public final LexerRuleSpecContext lexerRuleSpec() throws RecognitionException {
		LexerRuleSpecContext _localctx = new LexerRuleSpecContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_lexerRuleSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			((LexerRuleSpecContext)_localctx).TOKEN_REF = match(TOKEN_REF);
			 lexerGenr.curRule = (((LexerRuleSpecContext)_localctx).TOKEN_REF!=null?((LexerRuleSpecContext)_localctx).TOKEN_REF.getText():null); 
			setState(315);
			match(COLON);
			setState(316);
			lexerRuleBlock();
			 
			setState(318);
			match(SEMI);
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

	public static class LexerRuleBlockContext extends ParserRuleContext {
		public LexerAltListContext lexerAltList() {
			return getRuleContext(LexerAltListContext.class,0);
		}
		public LexerRuleBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerRuleBlock; }
	}

	public final LexerRuleBlockContext lexerRuleBlock() throws RecognitionException {
		LexerRuleBlockContext _localctx = new LexerRuleBlockContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_lexerRuleBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			lexerAltList();
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

	public static class LexerAltListContext extends ParserRuleContext {
		public List<LexerAltContext> lexerAlt() {
			return getRuleContexts(LexerAltContext.class);
		}
		public LexerAltContext lexerAlt(int i) {
			return getRuleContext(LexerAltContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(ANTLRv4Parser.OR); }
		public TerminalNode OR(int i) {
			return getToken(ANTLRv4Parser.OR, i);
		}
		public LexerAltListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerAltList; }
	}

	public final LexerAltListContext lexerAltList() throws RecognitionException {
		LexerAltListContext _localctx = new LexerAltListContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_lexerAltList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			lexerAlt();
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(323);
				match(OR);
				setState(324);
				lexerAlt();
				}
				}
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class LexerAltContext extends ParserRuleContext {
		public LexerElementsContext lexerElements;
		public LexerElementsContext lexerElements() {
			return getRuleContext(LexerElementsContext.class,0);
		}
		public LexerCommandsContext lexerCommands() {
			return getRuleContext(LexerCommandsContext.class,0);
		}
		public LexerAltContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerAlt; }
	}

	public final LexerAltContext lexerAlt() throws RecognitionException {
		LexerAltContext _localctx = new LexerAltContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_lexerAlt);
		int _la;
		try {
			setState(336);
			switch (_input.LA(1)) {
			case TOKEN_REF:
			case LEXER_CHAR_SET:
			case STRING_LITERAL:
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				((LexerAltContext)_localctx).lexerElements = lexerElements();
				 lexerGenr.addAlternative((((LexerAltContext)_localctx).lexerElements!=null?_input.getText(((LexerAltContext)_localctx).lexerElements.start,((LexerAltContext)_localctx).lexerElements.stop):null)); 
				setState(333);
				_la = _input.LA(1);
				if (_la==RARROW) {
					{
					setState(332);
					lexerCommands();
					}
				}

				}
				break;
			case SEMI:
			case OR:
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

	public static class LexerElementsContext extends ParserRuleContext {
		public List<LexerElementContext> lexerElement() {
			return getRuleContexts(LexerElementContext.class);
		}
		public LexerElementContext lexerElement(int i) {
			return getRuleContext(LexerElementContext.class,i);
		}
		public LexerElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerElements; }
	}

	public final LexerElementsContext lexerElements() throws RecognitionException {
		LexerElementsContext _localctx = new LexerElementsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_lexerElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(338);
				lexerElement();
				}
				}
				setState(341); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOKEN_REF) | (1L << LEXER_CHAR_SET) | (1L << STRING_LITERAL) | (1L << DOT))) != 0) );
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

	public static class LexerElementContext extends ParserRuleContext {
		public LexerAtomContext lexerAtom() {
			return getRuleContext(LexerAtomContext.class,0);
		}
		public EbnfSuffixContext ebnfSuffix() {
			return getRuleContext(EbnfSuffixContext.class,0);
		}
		public LexerElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerElement; }
	}

	public final LexerElementContext lexerElement() throws RecognitionException {
		LexerElementContext _localctx = new LexerElementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_lexerElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			lexerAtom();
			setState(345);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QUESTION) | (1L << STAR) | (1L << PLUS))) != 0)) {
				{
				setState(344);
				ebnfSuffix();
				}
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

	public static class LexerCommandsContext extends ParserRuleContext {
		public TerminalNode RARROW() { return getToken(ANTLRv4Parser.RARROW, 0); }
		public List<LexerCommandContext> lexerCommand() {
			return getRuleContexts(LexerCommandContext.class);
		}
		public LexerCommandContext lexerCommand(int i) {
			return getRuleContext(LexerCommandContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ANTLRv4Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ANTLRv4Parser.COMMA, i);
		}
		public LexerCommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerCommands; }
	}

	public final LexerCommandsContext lexerCommands() throws RecognitionException {
		LexerCommandsContext _localctx = new LexerCommandsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_lexerCommands);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(RARROW);
			setState(348);
			lexerCommand();
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(349);
				match(COMMA);
				setState(350);
				lexerCommand();
				}
				}
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class LexerCommandContext extends ParserRuleContext {
		public LexerCommandNameContext lexerCommandName() {
			return getRuleContext(LexerCommandNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ANTLRv4Parser.LPAREN, 0); }
		public LexerCommandExprContext lexerCommandExpr() {
			return getRuleContext(LexerCommandExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ANTLRv4Parser.RPAREN, 0); }
		public LexerCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerCommand; }
	}

	public final LexerCommandContext lexerCommand() throws RecognitionException {
		LexerCommandContext _localctx = new LexerCommandContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_lexerCommand);
		try {
			setState(362);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(356);
				lexerCommandName();
				setState(357);
				match(LPAREN);
				setState(358);
				lexerCommandExpr();
				setState(359);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
				lexerCommandName();
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

	public static class LexerCommandNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode MODE() { return getToken(ANTLRv4Parser.MODE, 0); }
		public LexerCommandNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerCommandName; }
	}

	public final LexerCommandNameContext lexerCommandName() throws RecognitionException {
		LexerCommandNameContext _localctx = new LexerCommandNameContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_lexerCommandName);
		try {
			setState(366);
			switch (_input.LA(1)) {
			case TOKEN_REF:
			case RULE_REF:
				enterOuterAlt(_localctx, 1);
				{
				setState(364);
				identifier();
				}
				break;
			case MODE:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
				match(MODE);
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

	public static class LexerCommandExprContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode INT() { return getToken(ANTLRv4Parser.INT, 0); }
		public LexerCommandExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerCommandExpr; }
	}

	public final LexerCommandExprContext lexerCommandExpr() throws RecognitionException {
		LexerCommandExprContext _localctx = new LexerCommandExprContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_lexerCommandExpr);
		try {
			setState(370);
			switch (_input.LA(1)) {
			case TOKEN_REF:
			case RULE_REF:
				enterOuterAlt(_localctx, 1);
				{
				setState(368);
				identifier();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(369);
				match(INT);
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

	public static class AltListContext extends ParserRuleContext {
		public List<AlternativeContext> alternative() {
			return getRuleContexts(AlternativeContext.class);
		}
		public AlternativeContext alternative(int i) {
			return getRuleContext(AlternativeContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(ANTLRv4Parser.OR); }
		public TerminalNode OR(int i) {
			return getToken(ANTLRv4Parser.OR, i);
		}
		public AltListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_altList; }
	}

	public final AltListContext altList() throws RecognitionException {
		AltListContext _localctx = new AltListContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_altList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			alternative();
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(373);
				match(OR);
				setState(374);
				alternative();
				}
				}
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class AlternativeContext extends ParserRuleContext {
		public ElementContext element;
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public AlternativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alternative; }
	}

	public final AlternativeContext alternative() throws RecognitionException {
		AlternativeContext _localctx = new AlternativeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_alternative);

		                        parserGenr.nextAlternative();
		                    
		int _la;
		try {
			setState(388);
			switch (_input.LA(1)) {
			case TOKEN_REF:
			case RULE_REF:
			case STRING_LITERAL:
			case BEGIN_ACTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(383); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(380);
					((AlternativeContext)_localctx).element = element();
					 parserGenr.appendRule(((AlternativeContext)_localctx).element.rule); 
					}
					}
					setState(385); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOKEN_REF) | (1L << RULE_REF) | (1L << STRING_LITERAL) | (1L << BEGIN_ACTION))) != 0) );
				}
				break;
			case SEMI:
			case RPAREN:
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				 parserGenr.appendRule(new ParserRule(true)); 
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

	public static class ElementContext extends ParserRuleContext {
		public Rule rule;
		public AtomContext atom;
		public ActionBlockContext actionBlock;
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ActionBlockContext actionBlock() {
			return getRuleContext(ActionBlockContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_element);
		try {
			setState(396);
			switch (_input.LA(1)) {
			case TOKEN_REF:
			case RULE_REF:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(390);
				((ElementContext)_localctx).atom = atom();
				 ((ElementContext)_localctx).rule =  ((ElementContext)_localctx).atom.rule; 
				}
				break;
			case BEGIN_ACTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(393);
				((ElementContext)_localctx).actionBlock = actionBlock();
				 ((ElementContext)_localctx).rule =  new ActionRule((((ElementContext)_localctx).actionBlock!=null?_input.getText(((ElementContext)_localctx).actionBlock.start,((ElementContext)_localctx).actionBlock.stop):null)); 
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

	public static class LabeledElementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ANTLRv4Parser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(ANTLRv4Parser.PLUS_ASSIGN, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LabeledElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledElement; }
	}

	public final LabeledElementContext labeledElement() throws RecognitionException {
		LabeledElementContext _localctx = new LabeledElementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_labeledElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			identifier();
			setState(399);
			_la = _input.LA(1);
			if ( !(_la==ASSIGN || _la==PLUS_ASSIGN) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(402);
			switch (_input.LA(1)) {
			case TOKEN_REF:
			case RULE_REF:
			case STRING_LITERAL:
				{
				setState(400);
				atom();
				}
				break;
			case LPAREN:
				{
				setState(401);
				block();
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

	public static class EbnfContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public EbnfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ebnf; }
	}

	public final EbnfContext ebnf() throws RecognitionException {
		EbnfContext _localctx = new EbnfContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_ebnf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			block();
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

	public static class BlockSuffixContext extends ParserRuleContext {
		public EbnfSuffixContext ebnfSuffix() {
			return getRuleContext(EbnfSuffixContext.class,0);
		}
		public BlockSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockSuffix; }
	}

	public final BlockSuffixContext blockSuffix() throws RecognitionException {
		BlockSuffixContext _localctx = new BlockSuffixContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_blockSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			ebnfSuffix();
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

	public static class EbnfSuffixContext extends ParserRuleContext {
		public TerminalNode QUESTION() { return getToken(ANTLRv4Parser.QUESTION, 0); }
		public TerminalNode STAR() { return getToken(ANTLRv4Parser.STAR, 0); }
		public TerminalNode PLUS() { return getToken(ANTLRv4Parser.PLUS, 0); }
		public EbnfSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ebnfSuffix; }
	}

	public final EbnfSuffixContext ebnfSuffix() throws RecognitionException {
		EbnfSuffixContext _localctx = new EbnfSuffixContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_ebnfSuffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QUESTION) | (1L << STAR) | (1L << PLUS))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class LexerAtomContext extends ParserRuleContext {
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public TerminalNode LEXER_CHAR_SET() { return getToken(ANTLRv4Parser.LEXER_CHAR_SET, 0); }
		public TerminalNode DOT() { return getToken(ANTLRv4Parser.DOT, 0); }
		public LexerAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerAtom; }
	}

	public final LexerAtomContext lexerAtom() throws RecognitionException {
		LexerAtomContext _localctx = new LexerAtomContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_lexerAtom);
		try {
			setState(413);
			switch (_input.LA(1)) {
			case TOKEN_REF:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(410);
				terminal();
				}
				break;
			case LEXER_CHAR_SET:
				enterOuterAlt(_localctx, 2);
				{
				setState(411);
				match(LEXER_CHAR_SET);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(412);
				match(DOT);
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

	public static class AtomContext extends ParserRuleContext {
		public Rule rule;
		public TerminalContext terminal;
		public RulerefContext ruleref;
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public RulerefContext ruleref() {
			return getRuleContext(RulerefContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_atom);
		try {
			setState(421);
			switch (_input.LA(1)) {
			case TOKEN_REF:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(415);
				((AtomContext)_localctx).terminal = terminal();
				 ((AtomContext)_localctx).rule =  ((AtomContext)_localctx).terminal.rule;
				                 
				}
				break;
			case RULE_REF:
				enterOuterAlt(_localctx, 2);
				{
				setState(418);
				((AtomContext)_localctx).ruleref = ruleref();
				 ((AtomContext)_localctx).rule =  ((AtomContext)_localctx).ruleref.rule; 
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

	public static class NotSetContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(ANTLRv4Parser.NOT, 0); }
		public SetElementContext setElement() {
			return getRuleContext(SetElementContext.class,0);
		}
		public BlockSetContext blockSet() {
			return getRuleContext(BlockSetContext.class,0);
		}
		public NotSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notSet; }
	}

	public final NotSetContext notSet() throws RecognitionException {
		NotSetContext _localctx = new NotSetContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_notSet);
		try {
			setState(427);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(423);
				match(NOT);
				setState(424);
				setElement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(425);
				match(NOT);
				setState(426);
				blockSet();
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

	public static class BlockSetContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ANTLRv4Parser.LPAREN, 0); }
		public List<SetElementContext> setElement() {
			return getRuleContexts(SetElementContext.class);
		}
		public SetElementContext setElement(int i) {
			return getRuleContext(SetElementContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ANTLRv4Parser.RPAREN, 0); }
		public List<TerminalNode> OR() { return getTokens(ANTLRv4Parser.OR); }
		public TerminalNode OR(int i) {
			return getToken(ANTLRv4Parser.OR, i);
		}
		public BlockSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockSet; }
	}

	public final BlockSetContext blockSet() throws RecognitionException {
		BlockSetContext _localctx = new BlockSetContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_blockSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(LPAREN);
			setState(430);
			setElement();
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(431);
				match(OR);
				setState(432);
				setElement();
				}
				}
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(438);
			match(RPAREN);
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

	public static class SetElementContext extends ParserRuleContext {
		public TerminalNode TOKEN_REF() { return getToken(ANTLRv4Parser.TOKEN_REF, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ANTLRv4Parser.STRING_LITERAL, 0); }
		public TerminalNode LEXER_CHAR_SET() { return getToken(ANTLRv4Parser.LEXER_CHAR_SET, 0); }
		public SetElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setElement; }
	}

	public final SetElementContext setElement() throws RecognitionException {
		SetElementContext _localctx = new SetElementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_setElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOKEN_REF) | (1L << LEXER_CHAR_SET) | (1L << STRING_LITERAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ANTLRv4Parser.LPAREN, 0); }
		public AltListContext altList() {
			return getRuleContext(AltListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ANTLRv4Parser.RPAREN, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			match(LPAREN);
			setState(443);
			altList();
			setState(444);
			match(RPAREN);
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

	public static class RulerefContext extends ParserRuleContext {
		public ParserRule rule;
		public Token RULE_REF;
		public ArgActionBlockContext argActionBlock;
		public TerminalNode RULE_REF() { return getToken(ANTLRv4Parser.RULE_REF, 0); }
		public ArgActionBlockContext argActionBlock() {
			return getRuleContext(ArgActionBlockContext.class,0);
		}
		public RulerefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleref; }
	}

	public final RulerefContext ruleref() throws RecognitionException {
		RulerefContext _localctx = new RulerefContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_ruleref);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			((RulerefContext)_localctx).RULE_REF = match(RULE_REF);
			 ((RulerefContext)_localctx).rule =  new ParserRule((((RulerefContext)_localctx).RULE_REF!=null?((RulerefContext)_localctx).RULE_REF.getText():null)); 
			setState(451);
			_la = _input.LA(1);
			if (_la==BEGIN_ARGUMENT) {
				{
				setState(448);
				((RulerefContext)_localctx).argActionBlock = argActionBlock();
				 _localctx.rule.addArgs(((RulerefContext)_localctx).argActionBlock.res); 
				}
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

	public static class TerminalContext extends ParserRuleContext {
		public Rule rule;
		public Token TOKEN_REF;
		public Token STRING_LITERAL;
		public TerminalNode TOKEN_REF() { return getToken(ANTLRv4Parser.TOKEN_REF, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ANTLRv4Parser.STRING_LITERAL, 0); }
		public TerminalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminal; }
	}

	public final TerminalContext terminal() throws RecognitionException {
		TerminalContext _localctx = new TerminalContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_terminal);
		try {
			setState(457);
			switch (_input.LA(1)) {
			case TOKEN_REF:
				enterOuterAlt(_localctx, 1);
				{
				setState(453);
				((TerminalContext)_localctx).TOKEN_REF = match(TOKEN_REF);
				 ((TerminalContext)_localctx).rule =  new LexerRule((((TerminalContext)_localctx).TOKEN_REF!=null?((TerminalContext)_localctx).TOKEN_REF.getText():null)); 
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(455);
				((TerminalContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);

					                     String s = (((TerminalContext)_localctx).STRING_LITERAL!=null?((TerminalContext)_localctx).STRING_LITERAL.getText():null);
					                     s = s.substring(1, s.length() - 1);
					                     ((TerminalContext)_localctx).rule =  new TermRule(s);
				                         lexerGenr.addTerm(_localctx.rule.text);
					                   
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

	public static class ElementOptionContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(ANTLRv4Parser.ASSIGN, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ANTLRv4Parser.STRING_LITERAL, 0); }
		public ElementOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementOption; }
	}

	public final ElementOptionContext elementOption() throws RecognitionException {
		ElementOptionContext _localctx = new ElementOptionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_elementOption);
		try {
			setState(466);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(459);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(460);
				identifier();
				setState(461);
				match(ASSIGN);
				setState(464);
				switch (_input.LA(1)) {
				case TOKEN_REF:
				case RULE_REF:
					{
					setState(462);
					identifier();
					}
					break;
				case STRING_LITERAL:
					{
					setState(463);
					match(STRING_LITERAL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode RULE_REF() { return getToken(ANTLRv4Parser.RULE_REF, 0); }
		public TerminalNode TOKEN_REF() { return getToken(ANTLRv4Parser.TOKEN_REF, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			_la = _input.LA(1);
			if ( !(_la==TOKEN_REF || _la==RULE_REF) ) {
			_errHandler.recoverInline(this);
			} else {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3?\u01d9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\3\2\5\2n\n\2\3\2\3\2\3\2\3\2\7\2t\n\2\f\2\16\2"+
		"w\13\2\3\2\3\2\7\2{\n\2\f\2\16\2~\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3"+
		"\u0087\n\3\3\4\3\4\3\4\3\4\5\4\u008d\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\7"+
		"\6\u0096\n\6\f\6\16\6\u0099\13\6\3\6\3\6\3\6\5\6\u009e\n\6\3\7\3\7\3\7"+
		"\3\7\7\7\u00a4\n\7\f\7\16\7\u00a7\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\b"+
		"\u00b0\n\b\3\t\3\t\3\t\5\t\u00b5\n\t\3\t\3\t\3\n\3\n\3\n\5\n\u00bc\n\n"+
		"\3\n\3\n\3\13\3\13\3\13\7\13\u00c3\n\13\f\13\16\13\u00c6\13\13\3\13\5"+
		"\13\u00c9\n\13\3\f\3\f\3\f\3\f\5\f\u00cf\n\f\3\f\3\f\3\f\3\r\3\r\3\r\5"+
		"\r\u00d7\n\r\3\16\3\16\3\16\7\16\u00dc\n\16\f\16\16\16\u00df\13\16\3\16"+
		"\3\16\3\17\3\17\3\17\7\17\u00e6\n\17\f\17\16\17\u00e9\13\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\7\20\u00f1\n\20\f\20\16\20\u00f4\13\20\3\21\7\21"+
		"\u00f7\n\21\f\21\16\21\u00fa\13\21\3\22\3\22\5\22\u00fe\n\22\3\23\5\23"+
		"\u0101\n\23\3\23\5\23\u0104\n\23\3\23\3\23\3\23\3\23\3\23\5\23\u010b\n"+
		"\23\3\23\3\23\3\23\5\23\u0110\n\23\3\23\3\23\3\23\5\23\u0115\n\23\3\23"+
		"\7\23\u0118\n\23\f\23\16\23\u011b\13\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\6\31\u0134\n\31\r\31\16\31\u0135\3\32\3\32\3\33\3\33\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\7\36\u0148"+
		"\n\36\f\36\16\36\u014b\13\36\3\37\3\37\3\37\5\37\u0150\n\37\3\37\5\37"+
		"\u0153\n\37\3 \6 \u0156\n \r \16 \u0157\3!\3!\5!\u015c\n!\3\"\3\"\3\""+
		"\3\"\7\"\u0162\n\"\f\"\16\"\u0165\13\"\3#\3#\3#\3#\3#\3#\5#\u016d\n#\3"+
		"$\3$\5$\u0171\n$\3%\3%\5%\u0175\n%\3&\3&\3&\7&\u017a\n&\f&\16&\u017d\13"+
		"&\3\'\3\'\3\'\6\'\u0182\n\'\r\'\16\'\u0183\3\'\5\'\u0187\n\'\3(\3(\3("+
		"\3(\3(\3(\5(\u018f\n(\3)\3)\3)\3)\5)\u0195\n)\3*\3*\3+\3+\3,\3,\3-\3-"+
		"\3-\5-\u01a0\n-\3.\3.\3.\3.\3.\3.\5.\u01a8\n.\3/\3/\3/\3/\5/\u01ae\n/"+
		"\3\60\3\60\3\60\3\60\7\60\u01b4\n\60\f\60\16\60\u01b7\13\60\3\60\3\60"+
		"\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\5\63\u01c6\n\63"+
		"\3\64\3\64\3\64\3\64\5\64\u01cc\n\64\3\65\3\65\3\65\3\65\3\65\5\65\u01d3"+
		"\n\65\5\65\u01d5\n\65\3\66\3\66\3\66\2\2\67\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhj\2\7\4\2\22"+
		"\22\26\30\4\2**--\4\2+,..\5\2\3\3\5\5\n\n\3\2\3\4\u01db\2m\3\2\2\2\4\u0086"+
		"\3\2\2\2\6\u008c\3\2\2\2\b\u008e\3\2\2\2\n\u009d\3\2\2\2\f\u009f\3\2\2"+
		"\2\16\u00af\3\2\2\2\20\u00b1\3\2\2\2\22\u00b8\3\2\2\2\24\u00bf\3\2\2\2"+
		"\26\u00ca\3\2\2\2\30\u00d6\3\2\2\2\32\u00d8\3\2\2\2\34\u00e2\3\2\2\2\36"+
		"\u00ec\3\2\2\2 \u00f8\3\2\2\2\"\u00fd\3\2\2\2$\u0100\3\2\2\2&\u0120\3"+
		"\2\2\2(\u0123\3\2\2\2*\u0125\3\2\2\2,\u0129\3\2\2\2.\u012d\3\2\2\2\60"+
		"\u0133\3\2\2\2\62\u0137\3\2\2\2\64\u0139\3\2\2\2\66\u013b\3\2\2\28\u0142"+
		"\3\2\2\2:\u0144\3\2\2\2<\u0152\3\2\2\2>\u0155\3\2\2\2@\u0159\3\2\2\2B"+
		"\u015d\3\2\2\2D\u016c\3\2\2\2F\u0170\3\2\2\2H\u0174\3\2\2\2J\u0176\3\2"+
		"\2\2L\u0186\3\2\2\2N\u018e\3\2\2\2P\u0190\3\2\2\2R\u0196\3\2\2\2T\u0198"+
		"\3\2\2\2V\u019a\3\2\2\2X\u019f\3\2\2\2Z\u01a7\3\2\2\2\\\u01ad\3\2\2\2"+
		"^\u01af\3\2\2\2`\u01ba\3\2\2\2b\u01bc\3\2\2\2d\u01c0\3\2\2\2f\u01cb\3"+
		"\2\2\2h\u01d4\3\2\2\2j\u01d6\3\2\2\2ln\7\6\2\2ml\3\2\2\2mn\3\2\2\2no\3"+
		"\2\2\2op\5\4\3\2pq\5j\66\2qu\7\"\2\2rt\5\6\4\2sr\3\2\2\2tw\3\2\2\2us\3"+
		"\2\2\2uv\3\2\2\2vx\3\2\2\2wu\3\2\2\2x|\5 \21\2y{\5\36\20\2zy\3\2\2\2{"+
		"~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0080\7\2\2\3"+
		"\u0080\3\3\2\2\2\u0081\u0082\7\23\2\2\u0082\u0087\7\25\2\2\u0083\u0084"+
		"\7\24\2\2\u0084\u0087\7\25\2\2\u0085\u0087\7\25\2\2\u0086\u0081\3\2\2"+
		"\2\u0086\u0083\3\2\2\2\u0086\u0085\3\2\2\2\u0087\5\3\2\2\2\u0088\u008d"+
		"\5\f\7\2\u0089\u008d\5\20\t\2\u008a\u008d\5\22\n\2\u008b\u008d\5\26\f"+
		"\2\u008c\u0088\3\2\2\2\u008c\u0089\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008b"+
		"\3\2\2\2\u008d\7\3\2\2\2\u008e\u008f\5j\66\2\u008f\u0090\7*\2\2\u0090"+
		"\u0091\5\n\6\2\u0091\t\3\2\2\2\u0092\u0097\5j\66\2\u0093\u0094\7\62\2"+
		"\2\u0094\u0096\5j\66\2\u0095\u0093\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095"+
		"\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009e\3\2\2\2\u0099\u0097\3\2\2\2\u009a"+
		"\u009e\7\n\2\2\u009b\u009e\5\32\16\2\u009c\u009e\7\t\2\2\u009d\u0092\3"+
		"\2\2\2\u009d\u009a\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009c\3\2\2\2\u009e"+
		"\13\3\2\2\2\u009f\u00a0\7\21\2\2\u00a0\u00a5\5\16\b\2\u00a1\u00a2\7!\2"+
		"\2\u00a2\u00a4\5\16\b\2\u00a3\u00a1\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a5\3\2"+
		"\2\2\u00a8\u00a9\7\"\2\2\u00a9\r\3\2\2\2\u00aa\u00ab\5j\66\2\u00ab\u00ac"+
		"\7*\2\2\u00ac\u00ad\5j\66\2\u00ad\u00b0\3\2\2\2\u00ae\u00b0\5j\66\2\u00af"+
		"\u00aa\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0\17\3\2\2\2\u00b1\u00b2\7\17\2"+
		"\2\u00b2\u00b4\7%\2\2\u00b3\u00b5\5\24\13\2\u00b4\u00b3\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\7&\2\2\u00b7\21\3\2\2\2"+
		"\u00b8\u00b9\7\20\2\2\u00b9\u00bb\7%\2\2\u00ba\u00bc\5\24\13\2\u00bb\u00ba"+
		"\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\7&\2\2\u00be"+
		"\23\3\2\2\2\u00bf\u00c4\5j\66\2\u00c0\u00c1\7!\2\2\u00c1\u00c3\5j\66\2"+
		"\u00c2\u00c0\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5"+
		"\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c9\7!\2\2\u00c8"+
		"\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\25\3\2\2\2\u00ca\u00ce\7\63\2"+
		"\2\u00cb\u00cc\5\30\r\2\u00cc\u00cd\7 \2\2\u00cd\u00cf\3\2\2\2\u00ce\u00cb"+
		"\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\5j\66\2\u00d1"+
		"\u00d2\5\32\16\2\u00d2\27\3\2\2\2\u00d3\u00d7\5j\66\2\u00d4\u00d7\7\23"+
		"\2\2\u00d5\u00d7\7\24\2\2\u00d6\u00d3\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6"+
		"\u00d5\3\2\2\2\u00d7\31\3\2\2\2\u00d8\u00dd\7\r\2\2\u00d9\u00da\7>\2\2"+
		"\u00da\u00dc\b\16\1\2\u00db\u00d9\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db"+
		"\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e0\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0"+
		"\u00e1\7<\2\2\u00e1\33\3\2\2\2\u00e2\u00e7\7\f\2\2\u00e3\u00e4\7;\2\2"+
		"\u00e4\u00e6\b\17\1\2\u00e5\u00e3\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5"+
		"\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea"+
		"\u00eb\79\2\2\u00eb\35\3\2\2\2\u00ec\u00ed\7\36\2\2\u00ed\u00ee\5j\66"+
		"\2\u00ee\u00f2\7\"\2\2\u00ef\u00f1\5\66\34\2\u00f0\u00ef\3\2\2\2\u00f1"+
		"\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\37\3\2\2"+
		"\2\u00f4\u00f2\3\2\2\2\u00f5\u00f7\5\"\22\2\u00f6\u00f5\3\2\2\2\u00f7"+
		"\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9!\3\2\2\2"+
		"\u00fa\u00f8\3\2\2\2\u00fb\u00fe\5$\23\2\u00fc\u00fe\5\66\34\2\u00fd\u00fb"+
		"\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe#\3\2\2\2\u00ff\u0101\7\6\2\2\u0100"+
		"\u00ff\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\3\2\2\2\u0102\u0104\5\60"+
		"\31\2\u0103\u0102\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\u0106\7\4\2\2\u0106\u010a\b\23\1\2\u0107\u0108\5\34\17\2\u0108\u0109"+
		"\b\23\1\2\u0109\u010b\3\2\2\2\u010a\u0107\3\2\2\2\u010a\u010b\3\2\2\2"+
		"\u010b\u010f\3\2\2\2\u010c\u010d\5*\26\2\u010d\u010e\b\23\1\2\u010e\u0110"+
		"\3\2\2\2\u010f\u010c\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0114\3\2\2\2\u0111"+
		"\u0112\5,\27\2\u0112\u0113\b\23\1\2\u0113\u0115\3\2\2\2\u0114\u0111\3"+
		"\2\2\2\u0114\u0115\3\2\2\2\u0115\u0119\3\2\2\2\u0116\u0118\5(\25\2\u0117"+
		"\u0116\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2"+
		"\2\2\u011a\u011c\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u011d\7\37\2\2\u011d"+
		"\u011e\5\64\33\2\u011e\u011f\7\"\2\2\u011f%\3\2\2\2\u0120\u0121\7\35\2"+
		"\2\u0121\u0122\5\32\16\2\u0122\'\3\2\2\2\u0123\u0124\5.\30\2\u0124)\3"+
		"\2\2\2\u0125\u0126\7\31\2\2\u0126\u0127\5\34\17\2\u0127\u0128\b\26\1\2"+
		"\u0128+\3\2\2\2\u0129\u012a\7\32\2\2\u012a\u012b\5\34\17\2\u012b\u012c"+
		"\b\27\1\2\u012c-\3\2\2\2\u012d\u012e\7\63\2\2\u012e\u012f\5j\66\2\u012f"+
		"\u0130\5\32\16\2\u0130\u0131\b\30\1\2\u0131/\3\2\2\2\u0132\u0134\5\62"+
		"\32\2\u0133\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0133\3\2\2\2\u0135"+
		"\u0136\3\2\2\2\u0136\61\3\2\2\2\u0137\u0138\t\2\2\2\u0138\63\3\2\2\2\u0139"+
		"\u013a\5J&\2\u013a\65\3\2\2\2\u013b\u013c\7\3\2\2\u013c\u013d\b\34\1\2"+
		"\u013d\u013e\7\37\2\2\u013e\u013f\58\35\2\u013f\u0140\b\34\1\2\u0140\u0141"+
		"\7\"\2\2\u0141\67\3\2\2\2\u0142\u0143\5:\36\2\u01439\3\2\2\2\u0144\u0149"+
		"\5<\37\2\u0145\u0146\7/\2\2\u0146\u0148\5<\37\2\u0147\u0145\3\2\2\2\u0148"+
		"\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a;\3\2\2\2"+
		"\u014b\u0149\3\2\2\2\u014c\u014d\5> \2\u014d\u014f\b\37\1\2\u014e\u0150"+
		"\5B\"\2\u014f\u014e\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0153\3\2\2\2\u0151"+
		"\u0153\3\2\2\2\u0152\u014c\3\2\2\2\u0152\u0151\3\2\2\2\u0153=\3\2\2\2"+
		"\u0154\u0156\5@!\2\u0155\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0155"+
		"\3\2\2\2\u0157\u0158\3\2\2\2\u0158?\3\2\2\2\u0159\u015b\5X-\2\u015a\u015c"+
		"\5V,\2\u015b\u015a\3\2\2\2\u015b\u015c\3\2\2\2\u015cA\3\2\2\2\u015d\u015e"+
		"\7\'\2\2\u015e\u0163\5D#\2\u015f\u0160\7!\2\2\u0160\u0162\5D#\2\u0161"+
		"\u015f\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2"+
		"\2\2\u0164C\3\2\2\2\u0165\u0163\3\2\2\2\u0166\u0167\5F$\2\u0167\u0168"+
		"\7#\2\2\u0168\u0169\5H%\2\u0169\u016a\7$\2\2\u016a\u016d\3\2\2\2\u016b"+
		"\u016d\5F$\2\u016c\u0166\3\2\2\2\u016c\u016b\3\2\2\2\u016dE\3\2\2\2\u016e"+
		"\u0171\5j\66\2\u016f\u0171\7\36\2\2\u0170\u016e\3\2\2\2\u0170\u016f\3"+
		"\2\2\2\u0171G\3\2\2\2\u0172\u0175\5j\66\2\u0173\u0175\7\t\2\2\u0174\u0172"+
		"\3\2\2\2\u0174\u0173\3\2\2\2\u0175I\3\2\2\2\u0176\u017b\5L\'\2\u0177\u0178"+
		"\7/\2\2\u0178\u017a\5L\'\2\u0179\u0177\3\2\2\2\u017a\u017d\3\2\2\2\u017b"+
		"\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017cK\3\2\2\2\u017d\u017b\3\2\2\2"+
		"\u017e\u017f\5N(\2\u017f\u0180\b\'\1\2\u0180\u0182\3\2\2\2\u0181\u017e"+
		"\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184"+
		"\u0187\3\2\2\2\u0185\u0187\b\'\1\2\u0186\u0181\3\2\2\2\u0186\u0185\3\2"+
		"\2\2\u0187M\3\2\2\2\u0188\u0189\5Z.\2\u0189\u018a\b(\1\2\u018a\u018f\3"+
		"\2\2\2\u018b\u018c\5\32\16\2\u018c\u018d\b(\1\2\u018d\u018f\3\2\2\2\u018e"+
		"\u0188\3\2\2\2\u018e\u018b\3\2\2\2\u018fO\3\2\2\2\u0190\u0191\5j\66\2"+
		"\u0191\u0194\t\3\2\2\u0192\u0195\5Z.\2\u0193\u0195\5b\62\2\u0194\u0192"+
		"\3\2\2\2\u0194\u0193\3\2\2\2\u0195Q\3\2\2\2\u0196\u0197\5b\62\2\u0197"+
		"S\3\2\2\2\u0198\u0199\5V,\2\u0199U\3\2\2\2\u019a\u019b\t\4\2\2\u019bW"+
		"\3\2\2\2\u019c\u01a0\5f\64\2\u019d\u01a0\7\5\2\2\u019e\u01a0\7\62\2\2"+
		"\u019f\u019c\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u019e\3\2\2\2\u01a0Y\3"+
		"\2\2\2\u01a1\u01a2\5f\64\2\u01a2\u01a3\b.\1\2\u01a3\u01a8\3\2\2\2\u01a4"+
		"\u01a5\5d\63\2\u01a5\u01a6\b.\1\2\u01a6\u01a8\3\2\2\2\u01a7\u01a1\3\2"+
		"\2\2\u01a7\u01a4\3\2\2\2\u01a8[\3\2\2\2\u01a9\u01aa\7\65\2\2\u01aa\u01ae"+
		"\5`\61\2\u01ab\u01ac\7\65\2\2\u01ac\u01ae\5^\60\2\u01ad\u01a9\3\2\2\2"+
		"\u01ad\u01ab\3\2\2\2\u01ae]\3\2\2\2\u01af\u01b0\7#\2\2\u01b0\u01b5\5`"+
		"\61\2\u01b1\u01b2\7/\2\2\u01b2\u01b4\5`\61\2\u01b3\u01b1\3\2\2\2\u01b4"+
		"\u01b7\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b8\3\2"+
		"\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01b9\7$\2\2\u01b9_\3\2\2\2\u01ba\u01bb"+
		"\t\5\2\2\u01bba\3\2\2\2\u01bc\u01bd\7#\2\2\u01bd\u01be\5J&\2\u01be\u01bf"+
		"\7$\2\2\u01bfc\3\2\2\2\u01c0\u01c1\7\4\2\2\u01c1\u01c5\b\63\1\2\u01c2"+
		"\u01c3\5\34\17\2\u01c3\u01c4\b\63\1\2\u01c4\u01c6\3\2\2\2\u01c5\u01c2"+
		"\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6e\3\2\2\2\u01c7\u01c8\7\3\2\2\u01c8"+
		"\u01cc\b\64\1\2\u01c9\u01ca\7\n\2\2\u01ca\u01cc\b\64\1\2\u01cb\u01c7\3"+
		"\2\2\2\u01cb\u01c9\3\2\2\2\u01ccg\3\2\2\2\u01cd\u01d5\5j\66\2\u01ce\u01cf"+
		"\5j\66\2\u01cf\u01d2\7*\2\2\u01d0\u01d3\5j\66\2\u01d1\u01d3\7\n\2\2\u01d2"+
		"\u01d0\3\2\2\2\u01d2\u01d1\3\2\2\2\u01d3\u01d5\3\2\2\2\u01d4\u01cd\3\2"+
		"\2\2\u01d4\u01ce\3\2\2\2\u01d5i\3\2\2\2\u01d6\u01d7\t\6\2\2\u01d7k\3\2"+
		"\2\2\63mu|\u0086\u008c\u0097\u009d\u00a5\u00af\u00b4\u00bb\u00c4\u00c8"+
		"\u00ce\u00d6\u00dd\u00e7\u00f2\u00f8\u00fd\u0100\u0103\u010a\u010f\u0114"+
		"\u0119\u0135\u0149\u014f\u0152\u0157\u015b\u0163\u016c\u0170\u0174\u017b"+
		"\u0183\u0186\u018e\u0194\u019f\u01a7\u01ad\u01b5\u01c5\u01cb\u01d2\u01d4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}