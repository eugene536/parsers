package hw4.default_parser.main;

import hw4.default_parser.lexer.MyTag;
import hw4.default_parser.rules.parser.*;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.*;

/**
 * Created by eugene on 2016/05/25.
 */
public class ParserGenerator {
  public HashMap<String, ParserRuleInfo> name2info = new HashMap<>();
  public String curName;
  public ParserRuleInfo curInfo;
  public String members;
  public String headers;
  private PrintStream out;

  public void nextAlternative() {
    curInfo.alternatives.add(new ArrayList<>());
    curInfo.firstForAlt.add(new HashSet<>());
  }

  public void appendRule(Rule rule) {
    assert !curInfo.alternatives.isEmpty();
    curInfo.alternatives.get(curInfo.alternatives.size() - 1).add(rule);
  }

  public void setCurName(String curName) {
    this.curName = curName;
    curInfo = new ParserRuleInfo(curName);
    name2info.put(curName, curInfo);
  }

  public void setArgs(String args) {
    curInfo.args = args;
  }

  public void setReturns(String returns) {
    curInfo.returns = returns;
  }

  public void setLocals(String locals) {
    curInfo.locals = locals;
  }

  public void setInit(String init) {
    curInfo.init = init;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (Map.Entry<String, ParserRuleInfo> infoEntry : name2info.entrySet()) {
      sb.append(infoEntry.getKey())
        .append(" = ");
      ArrayList<ArrayList<Rule>> alt = infoEntry.getValue().alternatives;
      for (ArrayList<Rule> rules : alt) {
        sb.append(String.join("\n", rules))
          .append("\nOR\n");
      }
      sb.append("\n\n");
    }

    return sb.toString();
//    return name2info.toString();
  }

  public void build() {
    buildFirst();
    buildFollow();


    try (PrintStream t = new PrintStream(new FileOutputStream("/home/eugene/university/3course/parsing/src/main/java/hw4/default_parser/parser/MyParser.java"))) {
      out = t;
      createClass();
      createAllContexts();
      createLexer();
//    out.println(name2info.get("unused"));

      for (ParserRuleInfo info : name2info.values()) {
        out.println(info);
      }
      out.println("}\n");
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }

  private void createClass() {
    createHeaders();
    out.println("public class MyParser {\n");
    createMembers();
  }

  private void createMembers() {
    if (members != null)
      out.println(members);
  }

  private void createHeaders() {
    out.println("package hw4.default_parser.parser;");
    out.println("import hw4.default_parser.lexer.*;");
    out.println("import java.io.InputStream;");
    out.println("import static hw4.default_parser.lexer.MyTag.*;");
    if (headers != null)
      out.println(headers);
  }

  private void createLexer() {
    out.println("public MyLexer lexer;");
    out.println("public MyParser(InputStream is) throws MyParseException  {\n lexer = new MyLexer(is);");
    out.println("lexer.nextToken();\n}");
  }

  private void createAllContexts() {
    out.println("public static class AllContexts {\n");
    for (String key : name2info.keySet()) {
      out.println("public Context" + key + " " + key + ";\n");
    }

    for (String key : LexerGenerator.keys) {
      if (!LexerGenerator.terms.containsValue(key)) {
        out.println("public MyToken " + key + ";");
      }
    }
    out.println("}");
  }

  private void buildFollow() {

  }

  private void buildFirst() {
    boolean changed = true;
    while (changed) {
      changed = false;
      for (ParserRuleInfo rule : name2info.values()) {
        boolean prev = changed;
        for (int k = 0; k < rule.alternatives.size(); k++) {
          ArrayList<Rule> curAlt = rule.alternatives.get(k);
          HashSet<Integer> firstForCurAlt = rule.firstForAlt.get(k);

          for (int i = 0; i < curAlt.size(); i++) {
            Rule ruleInCurAlt = curAlt.get(i);

            if (ruleInCurAlt instanceof ParserRule) {
              ParserRule pRule = (ParserRule) ruleInCurAlt;
              if (pRule.epsilon) {
                assert curAlt.size() == 1;
                changed |= firstForCurAlt.add(MyTag.EPS);
//                if (changed && rule.name.equals("unused")) {
//                  System.err.println("eps: " + changed);
//                }
                break;
              }

              ParserRuleInfo infoCurRule = name2info.get(pRule.text);
              boolean p = changed;
              int prevSz = firstForCurAlt.size();
              boolean containsEps = firstForCurAlt.contains(MyTag.EPS);
              changed |= firstForCurAlt.addAll(infoCurRule.first);
//              if (!p && changed && rule.name.equals("unused")) {
//                System.err.println("parser: " + firstForCurAlt);
//                System.err.println("va: " + firstForCurAlt.addAll(infoCurRule.first));
//              }

              if (!firstForCurAlt.contains(MyTag.EPS)) {
                break;
              } else if (!containsEps && i != curAlt.size() - 1) {
                firstForCurAlt.remove(MyTag.EPS);
                changed = p | (prevSz != firstForCurAlt.size());
//                if (!p && changed && rule.name.equals("unused")) {
//                  System.err.println("eps: " + firstForCurAlt);
//                  System.err.println("va: " + firstForCurAlt.addAll(infoCurRule.first));
//                }
                continue;
              }
            } else if (ruleInCurAlt instanceof LexerRule) {
              try {
                changed |= firstForCurAlt.add(
                  (Integer) MyTag.class.getDeclaredField(ruleInCurAlt.text).get(MyTag.class)
                );
//                if (changed && rule.name.equals("unused")) {
//                  System.err.println("lexer: " + changed);
//                }
              } catch (Exception e) {
                e.printStackTrace();
              }
            } else if (ruleInCurAlt instanceof TermRule) {
              try {
                changed |= firstForCurAlt.add(
                  (Integer) MyTag.class.getDeclaredField(LexerGenerator.terms.get(ruleInCurAlt.text)).get(MyTag.class)
                );
//                if (changed && rule.name.equals("unused")) {
//                  System.err.println("term: " + changed);
//                }
              } catch (Exception e) {
                e.printStackTrace();
              }
            }
            break;
          }

//          boolean p = changed;
          changed |= rule.first.addAll(firstForCurAlt);
//          if (!p && changed && rule.name.equals("unused")) {
//            System.err.println("first: " + rule.first);
//          }
        }

//        if (!prev && changed) {
//          System.err.println(rule.name);
//        }
      }
    }
  }
}
