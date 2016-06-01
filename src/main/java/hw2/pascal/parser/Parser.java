package hw2.pascal.parser;

import hw2.pascal.ParseException;
import hw2.pascal.lexer.Lexer;
import hw2.pascal.lexer.Tag;
import hw2.pascal.lexer.Token;
import hw2.pascal.lexer.Word;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by eugene on 2016/03/23.
 */
public class Parser {
  private Lexer lex;
  private Token curToken;

  public Parser(InputStream is) {
    lex = new Lexer(new BufferedInputStream(is));
  }

  public Tree parse() throws ParseException {
    return start();
  }

  private Tree start() throws ParseException {
    curToken = lex.nextToken();
    if (curToken.tag == Tag.VAR) {
      curToken = lex.nextToken();
      Tree v = vars();
      return new Tree("start", new Tree("var"), v);
    }
    throw new ParseException("`var` expexted", lex.getCurPos());
  }

  private Tree vars() throws ParseException {
    List<Tree> children = new ArrayList<>();
    boolean addVar = false;
    while (true) {
      if (addVar && curToken.tag == Tag.VAR) {
        curToken = lex.nextToken();
        children.add(new Tree("var"));
      }
      children.add(names());

      match(':');
      children.add(new Tree(":"));

      children.add(type());

      match(';');
      children.add(new Tree(";"));

      if (curToken.tag == Tag.END)
        return new Tree("vars", children.toArray(new Tree[children.size()]));

      addVar = true;
    }
  }

  private Tree type() throws ParseException {
    if (curToken.tag == Tag.TYPE) {
      assert curToken instanceof Word;
      Tree res = new Tree("type", new Tree(((Word) curToken).lexeme));
      curToken = lex.nextToken();
      return res;
    }

    throw new ParseException("expected type after `:`", lex.getCurPos());
  }

  private Tree names() throws ParseException {
    List<Tree> result = new ArrayList<Tree>();
    result.add(oneName());
    while (true) {
      if (curToken.tag != ',')
        return new Tree("names", result.toArray(new Tree[result.size()]));
      result.add(new Tree(","));
      curToken = lex.nextToken();
      result.add(oneName());
    }
  }

  private Tree oneName() throws ParseException {
    if (curToken.tag == Tag.NAME) {
      assert (curToken instanceof Word);
      Tree res = new Tree("one_name", new Tree(((Word) curToken).lexeme));
      curToken = lex.nextToken();
      return res;
    }
    throw new ParseException("expected name of variable", lex.getCurPos());
  }

  private void match(char c) throws ParseException {
    if (curToken.tag != c) {
      if (curToken.tag < 256)
        throw new ParseException("expected: " + c + "; given: " + curToken.tag, lex.getCurPos());
      else
        throw new ParseException("expected " + c, lex.getCurPos());
    }
    curToken = lex.nextToken();
  }

}
