package hw4.default_parser.rules.parser;

/**
 * Created by eugene on 2016/05/29.
 */
public class ActionRule extends Rule {
  public ActionRule(String text) {
    super(text);
  }

  @Override
  public String toString() {
    return "action: " + text;
  }
}
