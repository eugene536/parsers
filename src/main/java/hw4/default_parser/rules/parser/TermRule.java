package hw4.default_parser.rules.parser;

/**
 * Created by eugene on 2016/05/29.
 */
public class TermRule extends Rule {
  public TermRule(String text) {
    super(text);
  }

  @Override
  public String getFirst() {
    return text;
  }

  @Override
  public String toString() {
    return "term: " + text;
  }
}
