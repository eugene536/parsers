package hw4.default_parser.rules.parser;

import hw4.default_parser.lexer.MyTag;
import hw4.default_parser.main.LexerGenerator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by eugene on 2016/05/29.
 */
public class ParserRuleInfo {
  public String name;
  public String args;
  public String returns;
  public String locals;
  public String init;
  public ArrayList<ArrayList<Rule>> alternatives = new ArrayList<>();
  public HashSet<Integer> first = new HashSet<>();
  public ArrayList<HashSet<Integer>> firstForAlt = new ArrayList<>();
  public HashSet<Integer> follow = new HashSet<>();
  public StringBuilder buf = new StringBuilder();

  public ParserRuleInfo(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    createContext();
    createDeclaration();
    return buf.toString();
  }

  private void createContext() {
    buf.append("public static class Context" + name + " extends AllContexts {\n");
    createContext(args);
    createContext(returns);
    createContext(locals);

    buf.append("}\n");
  }

  private void createContext(String params) {
    if (params != null) {
      StringBuilder sb = new StringBuilder(params);
      replaceCommas(sb);
      buf.append(sb);
    }
  }

  private void replaceCommas(StringBuilder sb) {
    int balance = 0;
    for (int i = 0; i < sb.length(); i++) {
      if (Character.isWhitespace(sb.charAt(i))) continue;
      if (sb.charAt(i) == '<') {
        balance++;
      } else if (sb.charAt(i) == '>') {
        balance--;
      } else if (balance == 0 && sb.charAt(i) == ',') {
        sb.replace(i, i + 1, ";\n");
      }
    }
    sb.append(";\n");
  }

  private void trim(StringBuilder sb) {
    String temp = sb.toString().trim();
    sb.setLength(0);
    sb.append(temp);
  }

  private void createDeclaration() {
    buf.append("public Context" + name + " " + name + "() throws MyParseException {\n");
    createInit();
    createLocalContext();
    createSwitch();

    createReturn();
    buf.append("}");
  }

  private void createSwitch() {
    assertAlternatives();
    buf.append("switch (lexer.getLastToken().tag) {\n");
    for (int i = 0; i < alternatives.size(); i++) {
      for (Integer token : firstForAlt.get(i)) {
        if (token == -1) continue;
        String t = LexerGenerator.num2key.get(token);
        buf.append("case " + t + ": \n");
      }
      boolean printed = false;
      for (Rule r : alternatives.get(i)) {
        if (r instanceof ParserRule) {
          if (((ParserRule) r).epsilon) continue;
          //TODO: add inherited args
          buf.append("lctx.")
            .append(r.text)
            .append(" = ")
            .append(r.text)
            .append("();\n");
        } else if (r instanceof ActionRule) {
          buf.append(r.text.replaceAll("\\$", "lctx."));
        } else if (r instanceof LexerRule) {
          //TODO: assert token
          buf.append("lctx.")
            .append(r.text)
            .append(" = ")
            .append("lexer.getLastToken();\n");
          buf.append("lexer.nextToken();\n");
        } else {
          buf.append("lexer.nextToken();\n");
        }
        printed = true;

      }
      if (printed)
        buf.append("break;\n");
    }
    //TODO follow
    if (!first.contains(MyTag.EPS))
      buf.append("default: throw new MyParseException(\"can't parse\", lexer.getCurPos());");
    buf.append("}\n");
  }

  private void assertAlternatives() {
    for (int i = 0; i < firstForAlt.size(); i++) {
      for (int j = i + 1; j < firstForAlt.size(); j++) {
        HashSet<Integer> inter = new HashSet<>(firstForAlt.get(i));
        inter.retainAll(firstForAlt.get(j));
        assert inter.size() == 0;
      }
    }
  }

  private void createReturn() {
    buf.append("return lctx; \n");
  }

  private void createLocalContext() {
    buf.append("Context" + name + " lctx = new Context" + name + "();\n");
  }

  //TODO: init $ dependent
  private void createInit() {
//    if (init != null) {
//      buf.append(init + "\n");
//    }
  }
}
