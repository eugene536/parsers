package hw2.pascal;

/**
 * Created by eugene on 2016/03/23.
 */
public class ParseException extends Exception {
  public ParseException(String message, int pos) {
    super("position: " + pos + '\n' + message);
  }
}
