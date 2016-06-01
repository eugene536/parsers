package hw4.my_parser;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by eugene on 2016/05/24.
 */
public class Main {
  public static void main(String[] args) throws IOException {
    ANTLRInputStream in = new ANTLRInputStream(Main.class.getResourceAsStream("input.txt"));
    TestLexer lexer = new TestLexer(in);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    TestParser parser = new TestParser(tokens);

    parser.e();
    try (PrintWriter fos = new PrintWriter(new FileOutputStream("res.txt"))) {
    }
  }
}
