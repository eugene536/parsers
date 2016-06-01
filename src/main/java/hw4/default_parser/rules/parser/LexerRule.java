package hw4.default_parser.rules.parser;

/**
 * Created by eugene on 2016/05/29.
 */
public class LexerRule extends Rule {
  public LexerRule(String text) {
    super(text);
  }

  @Override
  public String toString() {
    return "lexer: " + text;
  }
}
