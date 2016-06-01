package hw4.default_parser.rules.parser;

/**
 * Created by eugene on 2016/05/29.
 */
public class ParserRule extends Rule {
  public String args;
  public boolean epsilon;

  public ParserRule(boolean epsilon) {
    super(null);
    this.epsilon = epsilon;
  }

  public ParserRule(String text) {
    super(text);
  }

  public void addArgs(String args) {
    this.args = args;
  }

  @Override
  public String toString() {
    if (epsilon) { return "!eps!"; }
    return "parser: " + text + "; args: " + args;
  }
}
