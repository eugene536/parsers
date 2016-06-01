package hw4.default_parser.lexer;

/**
 * Created by eugene on 2016/03/23.
 */
public class MyParseException extends Exception {
  public MyParseException(String message, int pos) {
    super("position: " + pos + '\n' + message);
  }
}
