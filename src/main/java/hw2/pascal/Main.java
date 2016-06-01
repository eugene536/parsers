package hw2.pascal;

import hw2.pascal.parser.Parser;
import hw2.pascal.parser.Tree;

import java.io.*;

/**
 * Created by eugene on 2016/03/23.
 */
public class Main {
  public static void main(String...args) throws ParseException {
    try (InputStream is = Main.class.getResourceAsStream("input.txt");
         PrintWriter pw = new PrintWriter("graph.txt")) {
      Parser parser = new Parser(is);
      Tree tree = parser.parse();
      tree.printForGraphViz(pw);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
