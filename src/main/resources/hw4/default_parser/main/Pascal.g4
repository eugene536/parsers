grammar Pascal;

@parser::header {
    import hw2.pascal.parser.Tree;
}

@parser::members {
    public Tree root;
}

start
    : 'var' vars           { root = new Tree("start", new Tree("var"), $vars.node); }
    ;

vars                       returns [Tree node]
    : decl                 { $node = new Tree("vars", $decl.node); }
      vars_in[$node]
    ;

vars_in                   [Tree node]
    : vars2               { $node.addChild($vars2.node); }
     | /*eps*/
    ;

vars2                      returns [Tree node]
                           @init {
                               $node = new Tree("vars2");
                           }

    : vars2_in[$node]
      decl               { $node.addChild($decl.node); }
      vars2_in2[$node]
    ;

vars2_in                 [Tree node]
    : 'var'              { $node.addChild(new Tree("var")); }
      | // eps
      ;

vars2_in2                [Tree node]
    : vars3              { $node.addChild($vars3.node); }
      |
    ;

vars3                      returns [Tree node]
    : vars2                { $node = $vars2.node; }
    ;

decl                       returns [Tree node]
    : names ':' Type ';\n' { $node = new Tree("decl", $names.node, new Tree(":"), new Tree($Type.text), new Tree(";/n")); }
    ;

names                      returns [Tree node]
    : Name       { $node = new Tree("names", new Tree($Name.text)); }
      names2_in[$node]
    ;

names2                     returns [Tree node]
    : ',' Name             { $node = new Tree("names2", new Tree(","), new Tree($Name.text)); }
      names2_in[$node]
    ;

names2_in                  [Tree node]
    : names2               { $node.addChild($names2.node); }
      |/*eps*/
    ;

unused                     [Tree node, String res]
                           returns [Tree n]
                           @init {
                              $n = new Tree("asdf");
                           }
    : ';\n'
    | names2_in[node] vars_in[node] ';' ','
    ;

Type     : 'integer' | 'char' | 'double';
Name     : [a-z_][a-z0-9_]*;

