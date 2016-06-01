package hw4.default_parser.main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

/**
 * Created by eugene on 2016/05/29.
 */
public class LexerGenerator {
  public static HashMap<String, ArrayList<String>> alternatives = new HashMap<>();
  public static HashMap<String, String> terms = new HashMap<>();
  public static ArrayList<String> keys = new ArrayList<>();
  public static HashMap<Integer, String> num2key = new HashMap<>();
  public String curRule;
  public int genNum = 0;

//  public static ArrayList<Integer> getTags(String key) {
//    return alternatives.get(key);
//  }

  public void addTerm(String value) {
    if (curRule != null) return;
    if (!terms.containsKey(value)) {
      terms.put(value, "T__" + genNum);
      ArrayList<String> l = new ArrayList<>();
      l.add(value);
      alternatives.put("T__" + genNum, l);
      keys.add("T__" + genNum);
      genNum++;
    }
  }

  public void addAlternative(String alter) {
    ArrayList<String> alts = alternatives.get(curRule);

    if (alts == null) {
      alts = new ArrayList<>();
      alternatives.put(curRule, alts);
      keys.add(curRule);
    }

    if (alter.charAt(0) == '\'') {
      alter = alter.substring(1, alter.length() - 1);
    }

    alts.add(alter);
  }

  public void generateLexer() {
    try (Scanner lexer = new Scanner(LexerGenerator.class.getResourceAsStream("MyDummyLexer.txt"));
         Scanner tag = new Scanner(LexerGenerator.class.getResourceAsStream("MyDummyTag.txt"))) {

      String newTag = tag.useDelimiter("\\Z").next().replace("%%INSERT_MYTAG%%", getTags());
      String newLexer = lexer.useDelimiter("\\Z").next().replace("%%INSERT_MYLEXER%%", getLexer());

      String path = "/home/eugene/university/3course/parsing/src/main/java/hw4/default_parser/lexer/";
      try (PrintWriter lexerOut = new PrintWriter(new FileOutputStream(path + "MyLexer.java"));
           PrintWriter tagOut = new PrintWriter(new FileOutputStream(path + "MyTag.java"))) {
        tagOut.print(newTag);
        lexerOut.print(newLexer);
      } catch (FileNotFoundException e) {
        e.printStackTrace();
      }
    }
  }

  public String getTags() {
    StringBuilder sb = new StringBuilder();
    int num = 0;
    for (String key : keys) {

      sb.append("  ")
        .append("public static final int ")
        .append(key)
        .append(" = ")
        .append(num)
        .append(";");
      if (terms.containsValue(key)) {
        sb.append("// ")
          .append(alternatives.get(key).get(0));
      }
      sb.append("\n");

      num2key.put(num, key);

      num++;
    }

    return sb.toString();
  }

  public String getLexer() {
    StringBuilder sb = new StringBuilder();

    for (String key : keys) {
      for (String alt : alternatives.get(key)) {
        sb.append("    ")
          .append("reserve(new MyToken(MyTag.")
          .append(key)
          .append(", \"^")
          .append(alt)
          .append("$\"));\n");
      }
    }

    return sb.toString();
  }
}
