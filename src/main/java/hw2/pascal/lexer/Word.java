package hw2.pascal.lexer;

/**
 * Created by eugene on 2016/03/23.
 */
public class Word extends Token {
  public final String lexeme;

  public Word(int tag, String lexeme) {
    super(tag);
    this.lexeme = lexeme;
  }
}
