grammar PlainGrammar;

program   : func+ ;
func      : func_decl '\n'+ (func_def LF)+;
func_decl : (NAME '::' TYPE ('->'TYPE )*) ;
func_def  : NAME (arg)* (('='expr) | (('\n' '|' cond'='expr) )+ ) ;
arg       : CONST | NAME;
cond      : expr ('=='|'>'|'<') expr ;
expr      : fact (('+'|'-')fact )* ;
fact      : unit (('*'|'/'|'%')unit )* ;
unit      : CONST |'('expr')' | argsi | func_call ;
argsi     : NAME ;
func_call : NAME ((CONST |argsi |'('expr')' ) )* ;
LF        : '\n'+ ;
CONST     : [0]|[1-9][0-9]*;
TYPE      : 'Integer' |'Fractional' |'Bool';
NAME      : [a-zA-Z_][a-zA-Z0-9_]*;
WS        : [\t\r]+->skip ;

