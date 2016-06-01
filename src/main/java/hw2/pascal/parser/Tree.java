package hw2.pascal.parser;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by eugene on 2016/03/23.
 */
public class Tree {
  private String node;

  private ArrayList<Tree> children = new ArrayList<>();

  public Tree(String node, Tree...children) {
    this.node = node;
    for (Tree c: children) {
      assert(c != null && c != this);
      this.children.add(c);
    }
  }

  public Tree(String node) {
    this.node = node;
  }

  public void addChild(Tree child) {
    assert(child != null && child != this);
    children.add(child);
  }

  public void printForGraphViz(PrintWriter pw) {
    pw.println("graph G {");
    printForGraphVizHelper(this, pw);
    pw.println("}");
  }

  private int num = 0;
  public void printForGraphVizHelper(Tree curNode, PrintWriter pw) {
    pw.println(num + " [label=\"" + curNode.node + "\"];");

    if (curNode.children == null)
      return;

    int myNum = num;
    for (Tree child: curNode.children) {
      num++;
      pw.println(myNum + " -- " + num + ";");
      printForGraphVizHelper(child, pw);
    }
  }

  public void print() {
    printHelper(this, 0);
  }

  public static void printHelper(Tree curNode, int depth) {
    for (int i = 0; i < 2 * depth; i++)
      System.out.print(" ");
    System.out.println(curNode.node);

    if (curNode.children == null)
      return;

    for (Tree child: curNode.children) {
      printHelper(child, depth + 1);
    }
  }
}
