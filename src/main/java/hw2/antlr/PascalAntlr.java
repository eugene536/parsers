package hw2.antlr;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 * Created by eugene on 2016/05/04.
 */

public class PascalAntlr {
  public static void main(String[] args) throws Exception {
    ANTLRInputStream in = new ANTLRInputStream(PascalAntlr.class.getResourceAsStream("input.txt"));
    PascalLexer lexer = new PascalLexer(in);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    PascalParser parser = new PascalParser(tokens);

    parser.start();

    try (PrintWriter pw = new PrintWriter(new FileOutputStream("graph.txt"))) {
      parser.root.printForGraphViz(pw);
    }
  }
}
