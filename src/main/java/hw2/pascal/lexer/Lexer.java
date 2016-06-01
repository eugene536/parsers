package hw2.pascal.lexer;

import hw2.pascal.ParseException;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Hashtable;

/**
 * Created by eugene on 2016/03/23.
 */
public class Lexer {
  private final BufferedInputStream is;
  private int curPos = 0;
  private int peek = ' ';
  private Hashtable<String, Word> words = new Hashtable<>();

  public Lexer(BufferedInputStream is) {
    this.is = is;

    reserve(new Word(Tag.TYPE, "integer"));
    reserve(new Word(Tag.TYPE, "char"));
    reserve(new Word(Tag.VAR, "var"));
  }

  private void reserve(Word t) {
    words.put(t.lexeme, t);
  }

  public Token nextToken() throws ParseException {
    for (; Character.isWhitespace(peek); nextChar());
    if (peek == -1) {
      return new Token(Tag.END);
    }

    if (Character.isLetter(peek)) {
      StringBuilder b = new StringBuilder();
      while (Character.isLetterOrDigit(peek)) {
        b.append((char) peek);
        nextChar();
      }
      String s = b.toString();
      Word word = words.get(s);

      if (word == null) {
        word = new Word(Tag.NAME, s);
        words.put(s, word);
      }

      return word;
    }

    Token token = new Token(peek);
    peek = ' ';
    return token;
  }

  private void nextChar() throws ParseException {
    curPos++;
    try {
      peek = is.read();
    } catch (IOException e) {
      throw new ParseException(e.getMessage(), curPos);
    }
  }

  public int getCurPos() {
    return curPos;
  }
}
