package hw4.default_parser.lexer;

/**
 * Created by eugene on 2016/03/23.
 */
public class MyToken {
  public final String lexeme;
  public final int tag;
  public String text;

  public MyToken(int tag) {
    this.tag = tag;
    this.lexeme = null;
  }

  public MyToken(int tag, String lexeme) {
    this.lexeme = lexeme;
    this.tag = tag;
  }

  public void setText(String text) {
    this.text = text;
  }

  @Override
  public String toString() {
    return "lexeme: " + lexeme + "; tag: " + tag + "; text: |" + text + "|";
  }
}
