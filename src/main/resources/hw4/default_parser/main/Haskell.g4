grammar Hello;

@parser::header {
    import java.util.HashMap;
    import java.lang.StringBuilder;
    import hw3.haskell2c.Func;
    import hw3.haskell2c.Arg;
}

@parser::members {
  protected ANTLRErrorStrategy _errHandler = new DefaultErrorStrategy() {
      @Override
      public void reportError(Parser recognizer, RecognitionException e) {
        super.reportError(recognizer, e);
        throw e;
      }
  };

  public HashMap<String, Func> funcs = new HashMap<>();
  public ArrayList<String> funcNames = new ArrayList<String>();
}

program
    :   func+
    ;

func
    :   func_decl  '\n'+                             {
                                                        funcs.get($func_decl.v).printDeclaration();
                                                        funcNames.add($func_decl.v);
                                                     }
        (func_def[$func_decl.v] '\n'+)+
    ;

func_decl                                            returns [String v]
                                                     locals  [ArrayList<String> type = new ArrayList<>()]

    :   (
            NAME                                     { !funcs.containsKey($NAME.text) }?


            '::'
            TYPE                                     { $type.add($TYPE.text); }
            ('->' TYPE                               { $type.add($TYPE.text); }
            )*
        )
                                                     {
                                                         $v = $NAME.text;
                                                         funcs.put($NAME.text, new Func($NAME.text, $type));
                                                     }
    ;

func_def                                             [String name]
                                                     locals [ArrayList<Arg> args = new ArrayList<>(),
                                                             HashMap<String, Arg> toGen = new HashMap<>()]

                                                     @init {
                                                         Func func = funcs.get($name);
                                                     }

    :   NAME                                         { $NAME.text.equals($name) }?

        (arg[func.genArgs, $args, $toGen])*
        (
            ('=' expr[$toGen])                          { funcs.get($name).printDefinition($args, $expr.text); }
            | (('\n' '|' cond[$toGen] '=' expr[$toGen]) { funcs.get($name).printDefinition($cond.text, $expr.text); }
               )+
        )
    ;

arg                                                  [ArrayList<String> genArgs,
                                                      ArrayList<Arg> args,
                                                      HashMap<String, Arg> toGen]
    :   CONST                                        { $args.add(new Arg($CONST.text, true)); }
        |                                            { $args.size() <= $toGen.size() }?
        NAME                                         {
                                                         $args.add(new Arg(genArgs.get($args.size()), false));
                                                         $toGen.put($NAME.text, args.get(args.size() - 1));
                                                     };

cond                                                 [HashMap<String, Arg> toGen]
                                                     returns [String text]
    :   lhs = expr[$toGen]
        sign = ('==' | '>' | '<')
        rhs = expr[$toGen]                           { $text = $lhs.text + $sign.text + $rhs.text; }
    ;

expr                                                 [HashMap<String, Arg> toGen]
                                                     returns [String text]
                                                     locals  [StringBuilder sb = new StringBuilder()]
    :   fact[$toGen]                                 { $sb.append($fact.text); }
        (sign = ('+' | '-') fact[$toGen]             { $sb.append($sign.text).append($fact.text); }
        )*
                                                     { $text = $sb.toString(); }
    ;

fact                                                 [HashMap<String, Arg> toGen]
                                                     returns [String text]
                                                     locals  [StringBuilder sb = new StringBuilder()]
    :   unit[$toGen]                                 { $sb.append($unit.text); }
        (sign = ('*' | '/' | '%') unit[$toGen]       { $sb.append($sign.text).append($unit.text); }
        )*
                                                     { $text = $sb.toString(); }
    ;


unit                                                 [HashMap<String, Arg> toGen]
                                                     returns [String text]
    :   CONST                                        { $text = $CONST.text; }
        | '(' expr[$toGen] ')'                       { $text = "(" + $expr.text + ")"; }

        | {$toGen.containsKey(getCurrentToken().getText()) }?
          argsi[$toGen]                              { $text = $argsi.text;  }


        | { funcs.containsKey(getCurrentToken().getText()) }?
        func_call[$toGen]                            { $text = $func_call.text; }
    ;

argsi                                                [HashMap<String, Arg> toGen]
                                                     returns [String text]
    : NAME
                                                     { $toGen.containsKey($NAME.text) }?
                                                     { $text = $toGen.get($NAME.text).name;}
    ;

func_call                                            [HashMap<String, Arg> toGen]
                                                     returns [String text]
                                                     locals  [StringBuilder res = new StringBuilder(),
                                                              String ex = new String()]
    : NAME
                                                     { $res.append($NAME.text + "("); }
      ((CONST                                        { $ex = $CONST.text; }
       | argsi[$toGen]                               { $ex = $argsi.text; }
       | '(' expr[$toGen] ')'                        { $ex = "(" + $expr.text + ")"; }
      )                                              { $res.append($ex + ", "); }
      )*                                             {
                                                        if ($res.length() > 2 && $res.charAt($res.length() - 2) == ',') {
                                                            $res.delete($res.length() - 2, $res.length());
                                                        }
                                                        $res.append(')');
                                                        $text = $res.toString();
                                                     }
    ;

CONST : [0] | [1-9][0-9]*;

TYPE
    :   'Integer'                                    { setText("int"); }
        | 'Fractional'                               { setText("double"); }
        | 'Bool'                                     { setText("bool"); };

NAME  : [a-zA-Z_][a-zA-Z0-9_]*;

WS
    :   [ \t\r]+ -> skip
    ;

