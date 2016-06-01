package hw4.default_parser.rules.parser;

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
  public HashMap<String, HashSet<Integer>> first = new HashMap<>();
  public HashMap<String, HashSet<Integer>> follow = new HashMap<>();
  public StringBuilder buf = new StringBuilder();

  public ParserRuleInfo(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    createContext();
    createDeclaration();

    String res = buf.toString();
    buf.setLength(0);
    args = null;
    name = null;
    returns = null;
    locals = null;
    init = null;

    return res;
  }

  private void createContext() {
    buf.append("public static class Context" + name + " {\n");
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
    buf.append("public Context" + name + " " + name + "() {\n");
    createInit();
    buf.append("}");
  }

  private void createInit() {
    if (init != null) {
      buf.append(init + "\n");
    }
  }
}
