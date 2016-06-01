parser grammar ANTLRv4Parser;

options {
	tokenVocab = ANTLRv4Lexer ;
}

@parser::header {
    import hw4.default_parser.main.*;
    import hw4.default_parser.rules.parser.*;
}

@parser::members {
  protected ANTLRErrorStrategy _errHandler = new DefaultErrorStrategy() {
      @Override
      public void reportError(Parser recognizer, RecognitionException e) {
        super.reportError(recognizer, e);
        throw e;
      }
  };

  public ParserGenerator parserGenr = new ParserGenerator();
  public LexerGenerator lexerGenr = new LexerGenerator();
}

// The main entry point for parsing a v4 grammar.
grammarSpec
	:	DOC_COMMENT?
		grammarType identifier SEMI
		prequelConstruct*
		rules
		modeSpec*
		EOF
	;

grammarType
	:	(	LEXER GRAMMAR
		|	PARSER GRAMMAR
		|	GRAMMAR
		)
	;

// This is the list of all constructs that can be declared before
// the set of rules that compose the grammar, and is invoked 0..n
// times by the grammarPrequel rule.
prequelConstruct
	:	delegateGrammars
	|	tokensSpec
	|	channelsSpec
	|	action
	;


// ------------
// Options - things that affect analysis and/or code generation

option
	:	identifier ASSIGN optionValue
	;

optionValue
	:	identifier (DOT identifier)*
	|	STRING_LITERAL
	|	actionBlock			// TODO: is this valid?
	|	INT
	;

// ------------
// Delegates

delegateGrammars
	:	IMPORT delegateGrammar (COMMA delegateGrammar)* SEMI
	;

delegateGrammar
	:	identifier ASSIGN identifier
	|	identifier
	;


// ------------
// Tokens & Channels

tokensSpec
	:	TOKENS LBRACE idList? RBRACE
	;

channelsSpec
	:	CHANNELS LBRACE idList? RBRACE
	;

idList
	: identifier ( COMMA identifier )* COMMA?
	;


// Match stuff like @parser::members {int i;}
action
	:	AT (actionScopeName COLONCOLON)? identifier actionBlock
	;

// Scope names could collide with keywords; allow them as ids for action scopes
actionScopeName
	:	identifier
	|	LEXER
	|	PARSER
	;

actionBlock returns [String res]
                @init {
                    $res = "";
                }
	:	BEGIN_ACTION (ACTION_CONTENT {$res = $res + $ACTION_CONTENT.text; })* END_ACTION
	;

argActionBlock  returns [String res]
                @init { $res = ""; }
	:	BEGIN_ARGUMENT // [
        (ARGUMENT_CONTENT {$res = $res + $ARGUMENT_CONTENT.text;}) *
        END_ARGUMENT   // ]
	;

modeSpec
	:	MODE identifier SEMI lexerRuleSpec*
	;

rules
	:	ruleSpec*
	;







// HERE





ruleSpec
	:	parserRuleSpec //{ System.out.println(parserGenr); }
	|	lexerRuleSpec
	;

parserRuleSpec
	:	DOC_COMMENT?
		ruleModifiers?
		    RULE_REF        { parserGenr.setCurName($RULE_REF.text); }
		    (argActionBlock { parserGenr.setArgs($argActionBlock.res); })?
		    (ruleReturns    { parserGenr.setReturns($ruleReturns.res); })?
		    (localsSpec     { parserGenr.setLocals($localsSpec.res); })?
		rulePrequel* // init
		COLON
		ruleBlock
		SEMI
	;


finallyClause
	:	FINALLY actionBlock
	;

rulePrequel
	:	ruleAction
	;

ruleReturns returns [String res]
	:	RETURNS argActionBlock { $res = $argActionBlock.res; }
	;

// --------------
// Exception spec

localsSpec returns [String res]
	:	LOCALS argActionBlock { $res = $argActionBlock.res; }
	;

/** Match stuff like @init {int i;} */
ruleAction
	:	AT identifier actionBlock { parserGenr.setInit($actionBlock.res); }
	;

ruleModifiers
	:	ruleModifier+
	;

// An individual access modifier for a rule. The 'fragment' modifier
// is an internal indication for lexer rules that they do not match
// from the input but are like subroutines for other lexer rules to
// reuse for certain lexical patterns. The other modifiers are passed
// to the code generation templates and may be ignored by the template
// if they are of no use in that language.
ruleModifier
	:	PUBLIC
	|	PRIVATE
	|	PROTECTED
	|	FRAGMENT
	;

ruleBlock
	:	altList
	;

// --------------------
// Lexer rules

lexerRuleSpec
	:   TOKEN_REF      { lexerGenr.curRule = $TOKEN_REF.text; }
        COLON
        lexerRuleBlock { }
        SEMI
	;

lexerRuleBlock
	:	lexerAltList
	;

lexerAltList
	:	lexerAlt (OR lexerAlt)*
	;

lexerAlt
	:	lexerElements { lexerGenr.addAlternative($lexerElements.text); } lexerCommands?
	|									// explicitly allow empty alts
	;

lexerElements
	:	lexerElement+
	;

lexerElement
	:	lexerAtom ebnfSuffix?
	;							// but preds can be anywhere

// E.g., channel(HIDDEN), skip, more, mode(INSIDE), push(INSIDE), pop
lexerCommands
	:	RARROW lexerCommand (COMMA lexerCommand)*
	;

lexerCommand
	:	lexerCommandName LPAREN lexerCommandExpr RPAREN
	|	lexerCommandName
	;

lexerCommandName
	:	identifier
	|	MODE
	;

lexerCommandExpr
	:	identifier
	|	INT
	;

// --------------------
// Rule Alts

altList
	:	alternative (OR alternative)*
	;

alternative
                    @init {
                        parserGenr.nextAlternative();
                    }
	:	(
	        element { parserGenr.appendRule($element.rule); }
        )+
	| /*eps, explicitly allow empty alts */  { parserGenr.appendRule(new ParserRule(true)); }
	;

element             returns [Rule rule]
	:
//	labeledElement
//	|

    // atom: func_def[$func_decl.v]
    // atom: '\n'
	 	atom        { $rule = $atom.rule; }

	 	// HERE don't use it
//		ebnfSuffix ?           //      { System.out.println("atom: " + $atom.text); }

    // (...)*
//	|	ebnf                        { System.out.println("ebnf: " + $ebnf.text); }

    // {..}
	|	actionBlock { $rule = new ActionRule($actionBlock.text); }
	// HERE QUESTION needed in haskel.g4
//	QUESTION?		{ System.out.println("actionBlock: " + $actionBlock.text); }
	// SEMPRED is actionBlock followed by QUESTION
	;

labeledElement
	:	identifier ( ASSIGN | PLUS_ASSIGN )
		(	atom
		|	block
		)
	;

// --------------------
// EBNF and blocks

// (...)*
ebnf
	:	block             // (...)
//        blockSuffix?      // *, +, ?
	;

blockSuffix
	:	ebnfSuffix 		// Standard EBNF
	;

ebnfSuffix :	QUESTION |	STAR |	PLUS ;

lexerAtom
	:	terminal
	|	LEXER_CHAR_SET
	|	DOT
	;

// atom: func_def[$func_decl.v]
// atom: '\n'
atom    returns [Rule rule]
	:	terminal { $rule = $terminal.rule; }
	|	ruleref  { $rule = $ruleref.rule; }
	;

// --------------------
// Inverted element set

notSet
	:	NOT setElement
	|	NOT blockSet
	;

blockSet
	:	LPAREN setElement (OR setElement)* RPAREN
	;

setElement
	:	TOKEN_REF
	|	STRING_LITERAL
	|	LEXER_CHAR_SET
	;

// -------------
// Grammar Block

block
	:	LPAREN
		altList
		RPAREN
	;

// ----------------
// Parser rule ref

ruleref returns [ParserRule rule]
	:	RULE_REF { $rule = new ParserRule($RULE_REF.text); }
	(argActionBlock { $rule.addArgs($argActionBlock.res); }) ?
	;

// ---------------
// Character Range

terminal returns [Rule rule]
	:   TOKEN_REF      { $rule = new LexerRule($TOKEN_REF.text); }
	|   STRING_LITERAL {
	                     String s = $STRING_LITERAL.text;
	                     s = s.substring(1, s.length() - 1);
	                     $rule = new TermRule(s);
                         lexerGenr.addTerm($rule.text);
	                   }
	;

elementOption
	:	identifier 									// default node option
	|	identifier ASSIGN (identifier | STRING_LITERAL)		// option assignment
	;

identifier
	:	RULE_REF
	|	TOKEN_REF
	;