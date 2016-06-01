grammar Test;

@parser::members {
  protected ANTLRErrorStrategy _errHandler = new DefaultErrorStrategy() {
      @Override
      public void reportError(Parser recognizer, RecognitionException e) {
        super.reportError(recognizer, e);
        throw e;
      }
  };
}

e : t e2;

e2: '+' t e2 | ;

t : f t2;

t2: '*' t2 | ;

f : NUM | '(' e ')';

NUM : [0] | [1-9][0-9]*;

WS
    :   [ \t\r]+ -> skip
    ;



rule
    : parser_rule
//    | lexer_rule
    ;

parser_rule
    : ParserName '\n'* rule_inner_values ':' '\n'* rule_body ';'
    ;

//CONST                                        { $text = $CONST.text; }
//| '(' expr[toGen] ')'                        { $text = "(" + $expr.text + ")"; }
//
//| {$toGen.containsKey(getCurrentToken().getText()) }?
//  argsi[toGen]                               { $text = $argsi.text;  }
//
rule_body
    :
    ;

// '(' expr[toGen] ')'                        { $text = "(" + $expr.text + ")"; }
one_alternative
    : ParserName ('[' args_i ']')
    | LexerName
    | '\'' Word '\''
    ;

// [HashMap<String, Arg> toGen]
// locals  [StringBuilder sb = new StringBuilder()]
// returns [String text]
rule_inner_values
    : (arg_i '\n'+)? (local_i '\n'+)? (return_i '\n'+)?
    ;

// returns [String text]
return_i
    : 'returns' '[' Type ParserName ']'
    ;

// locals  [StringBuilder sb = new StringBuilder()]
local_i
    : 'locals' '[' locals_i ']'
    ;

locals_i
    : local_one (',' local_one)*
    ;

local_one
    : Type ParserName '=' 'new' Type '(' (ParserName (',' ParserName)*)? ')'
    ;

// [HashMap<String, Arg> toGen]
arg_i
    : '[' args_i ']'
    ;

args_i
    : arg_one (',' arg_one)*
    ;

arg_one               // HashMap<String, Arg> toGen
    : Type ParserName
    ;


Type
    : [A-Z][a-zA-Z]* ('<' [A-Za-z, ]* '>')?
    ;

ParserName
    : [a-z][A-Za-z0-9_]*
    ;

LexerName
    : [A-Z][A-Za-z0-9_]*
    ;

//unit                                                 [HashMap<String, Arg> toGen]
//                                                     locals  [StringBuilder sb = new StringBuilder()]
//                                                     returns [String text]
//    :   CONST                                        { $text = $CONST.text; }
//        | '(' expr[toGen] ')'                        { $text = "(" + $expr.text + ")"; }
//
//        | {$toGen.containsKey(getCurrentToken().getText()) }?
//          argsi[toGen]                               { $text = $argsi.text;  }
//
//
//        | { funcs.containsKey(getCurrentToken().getText()) }?
//        func_call[toGen]                             { $text = $func_call.text; }
//    ;

