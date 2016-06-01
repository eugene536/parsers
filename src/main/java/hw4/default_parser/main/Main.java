package hw4.default_parser.main;

import hw4.default_parser.g4.ANTLRv4Lexer;
import hw4.default_parser.g4.ANTLRv4Parser;
import hw4.default_parser.lexer.MyLexer;
import hw4.default_parser.lexer.MyParseException;
import hw4.default_parser.lexer.MyTag;
//import hw4.default_parser.parser.MyParser;
//import hw4.default_parser.parser.MyParser;
import hw4.default_parser.rules.parser.ParserRuleInfo;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.*;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by eugene on 2016/05/24.
 */
public class Main {
  public static void main(String[] args) throws IOException, MyParseException {
//    String str = " var   b: char;\n c, d : integer;\n var a, b, c, d, asdfasdf : char;\n";
//    InputStream is = new ByteArrayInputStream(str.getBytes());
//    MyParser parser = new MyParser(is);
//    parser.start();
//    MyLexer lexer = new MyLexer(is);
//    while (lexer.nextToken().tag != MyTag.END) {
//      System.err.println(lexer.getLastToken());
//    }
    ANTLRInputStream in = new ANTLRInputStream(Main.class.getResourceAsStream("Temp.g4"));
    ANTLRv4Lexer lexer = new ANTLRv4Lexer(in);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    ANTLRv4Parser parser = new ANTLRv4Parser(tokens);

    parser.grammarSpec();
    ParserGenerator parserGenr = parser.parserGenr;
    System.err.println("START");
//    for (String key : parserGenr.name2info.keySet()) {
//      System.err.println(key + " : " + Arrays.toString(parserGenr.name2info.get(key).firstForAlt.toArray()));
//    }
//    System.out.println(parserGenr);
    parser.lexerGenr.generateLexer();
    parserGenr.build();
//    System.err.println(Arrays.toString(parserGenr.name2info.get("unused").firstForAlt.toArray()));
    try (PrintWriter fos = new PrintWriter(new FileOutputStream("res.txt"))) {
    }
  }

}

