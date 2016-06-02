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
    createConstructor();

    buf.append("}\n");
  }

  private void createConstructor() {
    buf.append("public Context" + name + "(");
    if (args != null)
      buf.append(args);
    buf.append(") {\n");
    if (args != null) {
      ArrayList<String> ar = getArgsSplit();
//      System.err.println(args + ": ");
      for (String a: ar) {
        buf.append("this." + a + " = " + a + ";\n");
//        System.err.println(a);
      }
    }
    buf.append("}\n");

  }

  private void createContext(String params) {
    if (params != null) {
      StringBuilder sb = new StringBuilder(params);
      replaceCommas(sb);
      buf.append(sb);
    }
  }

  private ArrayList<String> getArgsSplit() {
    ArrayList<String> res = new ArrayList<>();
    int balance = 0;
    for (int i = 0; i < args.length(); i++) {
      if (Character.isWhitespace(args.charAt(i))) continue;
      if (args.charAt(i) == '<') {
        balance++;
      } else if (args.charAt(i) == '>') {
        balance--;
      } else if (balance == 0 && args.charAt(i) == ',') {
        String r = "";
        int j = i - 1;
        for (; args.charAt(j) == ' '; j--);
        for (; args.charAt(j) != ' '; j--) {
          r = args.charAt(j) + r;
        }
        res.add(r);
      }
    }

    String r = "";
    int j = args.length() - 1;
    for (; args.charAt(j) == ' '; j--);
    for (; args.charAt(j) != ' '; j--) {
      r = args.charAt(j) + r;
    }
    res.add(r);

    return res;
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
    buf.append("public Context" + name + " " + name + "(");
    if (args != null)
      buf.append(args);
    buf.append(") throws MyParseException {\n");
    createLocalContext();
    createInit();
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
          buf.append("lctx.")
            .append(r.text)
            .append(" = ")
            .append(r.text)
            .append("(");
          if (((ParserRule) r).args != null)
            buf.append(((ParserRule) r).args.replaceAll("\\$", "lctx."));
          buf.append(");\n");
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
    buf.append("Context" + name + " lctx = new Context" + name + "(");
    if (args != null) {
      for (String a: getArgsSplit())
        buf.append(a + ", ");
      buf.delete(buf.length() - 2, buf.length());
    }
    buf.append(");\n");
  }

  private void createInit() {
    if (init != null) {
      buf.append(init.replaceAll("\\$", "lctx.") + "\n");
    }
  }
}
