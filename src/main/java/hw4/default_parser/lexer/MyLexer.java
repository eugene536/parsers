package hw4.default_parser.lexer;

import java.io.InputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by eugene on 2016/03/23.
 */
public class MyLexer {
  private final InputStream is;
  private int curPos = 0;
  private int peek = ' ';

  private ArrayList<MyToken> words = new ArrayList<>();
  private HashSet<String> keys = new HashSet<>();

  private MyToken lastToken;

  public MyLexer(InputStream is) {
    this.is = is;

    reserve(new MyToken(MyTag.T__0, "^var$"));
    reserve(new MyToken(MyTag.T__1, "^:$"));
    reserve(new MyToken(MyTag.T__2, "^;$"));
    reserve(new MyToken(MyTag.Type, "^integer$"));
    reserve(new MyToken(MyTag.Type, "^char$"));
    reserve(new MyToken(MyTag.Type, "^double$"));
    reserve(new MyToken(MyTag.Name, "^[a-z_][a-z0-9_]*$"));


//    reserve(new MyWord(MyTag.TYPE, "integer"));
//    reserve(new MyWord(MyTag.TYPE, "char"));
//    reserve(new MyWord(MyTag.VAR, "var"));
  }

  private void reserve(MyToken t) {
    assert !keys.contains(t.lexeme);
    words.add(t);
  }

  public MyToken nextToken() throws MyParseException {
    for (; peek == ' '; nextChar());
    if (peek == -1) {
      return lastToken = new MyToken(MyTag.END);
    }

    StringBuilder b = new StringBuilder();
    while (peek != -1) {
      b.append((char) peek);

      String s = b.toString();

      if (s.length() > 1) {
        MyToken word = get(s);
        MyToken prevWord = get(s.substring(0, s.length() - 1));
//        System.err.println(s + " prev: " + prevWord + "; cur: " + word);

        if (prevWord != null && word == null) {
          prevWord.setText(s.substring(0, s.length() - 1));
          return lastToken = prevWord;
        }
      }
      assert peek != ' ';

      nextChar();
    }

    MyToken t = get(b.toString());
    if (t != null) {
      assert peek == -1;
      peek = ' ';
      t.setText(b.toString());
      return lastToken = t;
    }

    throw new MyParseException("can't parse: " + b.toString(), getCurPos());
  }

  private MyToken get(String key) {
    key = key + "\n";
    for (MyToken word : words) {
      Pattern r = Pattern.compile(word.lexeme);
      Matcher m = r.matcher(key);
      if (m.find()) {
        return word;
      }
    }

    return null;
  }

  public MyToken getLastToken() {
    return lastToken;
  }

  private void nextChar() throws MyParseException {
    curPos++;
    try {
      peek = is.read();
    } catch (IOException e) {
      throw new MyParseException(e.getMessage(), curPos);
    }
  }

  public int getCurPos() {
    return curPos;
  }
}
