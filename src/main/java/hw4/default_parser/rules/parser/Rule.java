package hw4.default_parser.rules.parser;

/**
 * Created by eugene on 2016/05/29.
 */
public class Rule implements CharSequence {
  public String text;

  public Rule(String text) {
    this.text = text;
  }

  public String getFirst() {
    throw new UnsupportedOperationException("getFirst");
  }

  @Override
  public int length() {
    return toString().length();
  }

  @Override
  public char charAt(int index) {
    return toString().charAt(index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return toString().subSequence(start, end);
  }
}
