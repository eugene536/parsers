package hw3.haskell2c;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eugene on 2016/05/05.
 */
public class Func {
  private final String name;
  private final List<String> type;
  private final StringBuilder result = new StringBuilder();
  private final ArrayList<String> defs = new ArrayList<>();
  final ArrayList<String> genArgs = new ArrayList<>();
  private String withouCond;

  public Func(String name, List<String> type) {
    this.name = name;
    this.type = type;
  }

  @Override
  public String toString() {
    if (!defs.isEmpty()) {
      result.append(defs.get(0));
      for (int i = 1; i < defs.size(); i++) {
        result
          .append(" else ")
          .append(defs.get(i));
      }
    }

    if (withouCond != null) {
      if (!defs.isEmpty()) {
        result.append(" else ");
      }

      result.append(withouCond);
    }

    result.append("\nassert(false);\n}");
    return result.toString();
  }

  public void printDeclaration() {
    assert type.size() > 0;
    result.append(type.get(type.size() - 1)).append(" ");
    result.append(name).append("(");
    if (type.size() >= 2) {
      int i = 0;
      for (; i < type.size() - 2; i++) {
        genArgs.add("a" + i);
        result
          .append(type.get(i))
          .append(" ")
          .append(genArgs.get(i))
          .append(", ");
      }

      genArgs.add("a" + i);
      result
        .append(type.get(i))
        .append(" ")
        .append(genArgs.get(i));
    }

    result.append(") {\n");
  }

  public void printDefinition(String cond, String text) {
    defs.add("if (" + cond + ") {\n" + "return " + text + ";\n}");
  }

  public void printDefinition(ArrayList<Arg> args, String text) {
    assert args.size() == genArgs.size();
    boolean isConst = false;
    for (Arg arg : args) {
      if (arg.isConst) {
        isConst = true;
        break;
      }
    }
    StringBuilder def = new StringBuilder();

    if (isConst) {
      def.append("if (");
      int cnt = 0;
      for (int i = 0; i < genArgs.size(); i++) {
        if (args.get(i).isConst) {
          if (cnt > 0) {
            def.append(" && ");
          }
          def
            .append("(")
            .append(genArgs.get(i))
            .append(" == ")
            .append(args.get(i).name)
            .append(")");
          cnt++;
        }
      }

      def.append(") {\n");
    }
    def
      .append("return ")
      .append(text)
      .append(";\n");
    if (isConst) {
      def.append("}");
      defs.add(def.toString());
    } else if (withouCond != null) {
      throw new RuntimeException("overlapped definition");
    } else {
      withouCond = def.toString();
    }
  }
};

