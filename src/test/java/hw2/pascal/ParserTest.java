package hw2.pascal;

import hw2.pascal.parser.Parser;
import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.*;

/**
 * Created by eugene on 2016/05/04.
 */
public class ParserTest {
  @Test
  public void failTests() {
    String[] tests = {
      "var integer : integer;",
      "var char: char;",
      "var a, b, char, c : integer;",
      "var a, b, var, c : char;",
      "var 34234 : integer;",
      "var a : cha;",
      "var a cha;",
      "var b : chr;"};

    for (String test : tests) {
      try {
        Parser parser = new Parser(new ByteArrayInputStream(test.getBytes()));
        parser.parse();
        fail("parser must throw exception");
      } catch (ParseException e) {
        // ignore
      }
    }
  }

  @Test
  public void correctTests() {
    String[] tests = {
      "var   a:integer;",
      "var b   :   char;",
      "var a, b, c: integer;",
      "var   a  , asdf, hello123Citty:   integer;\n d, e:char; \n asdf, a:integer;\n   ",
      "var   a  , asdf, hello123Citty:   integer; d, e:   char; asdf, a: integer;"};

    for (String test : tests) {
      try {
        Parser parser = new Parser(new ByteArrayInputStream(test.getBytes()));
        parser.parse();
      } catch (ParseException e) {
        fail("parser must not throw exception");
      }
    }
  }
}
