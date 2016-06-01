package hw3.haskell2c;

import org.antlr.v4.runtime.*;

import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * Created by eugene on 2016/05/04.
 */

public class ANTLRDemo {
  public static void main(String[] args) throws Exception {
    ANTLRInputStream in = new ANTLRInputStream(ANTLRDemo.class.getResourceAsStream("input.txt"));
    HaskellLexer lexer = new HaskellLexer(in);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    HaskellParser parser = new HaskellParser(tokens);

    parser.program();
    try (PrintWriter fos = new PrintWriter(new FileOutputStream("res.txt"))) {
      for (String name : parser.funcNames) {
        fos.println(parser.funcs.get(name));
      }
    }
  }
}
