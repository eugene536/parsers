package hw4.default_parser.main;

import hw4.default_parser.rules.parser.Rule;
import hw4.default_parser.rules.parser.ParserRuleInfo;

import java.util.*;

/**
 * Created by eugene on 2016/05/25.
 */
public class ParserGenerator {
  private HashMap<String, ParserRuleInfo> name2info = new HashMap<>();
  private String curName;
  private ParserRuleInfo curInfo;

  public void nextAlternative() {
    curInfo.alternatives.add(new ArrayList<>());
  }

  public void appendRule(Rule rule) {
    assert !curInfo.alternatives.isEmpty();
    curInfo.alternatives.get(curInfo.alternatives.size() - 1).add(rule);
  }

  public void setCurName(String curName) {
    this.curName = curName;
    curInfo = new ParserRuleInfo(curName);
    name2info.put(curName, curInfo);
  }

  public void setArgs(String args) {
    curInfo.args = args;
  }

  public void setReturns(String returns) {
    curInfo.returns = returns;
  }

  public void setLocals(String locals) {
    curInfo.locals = locals;
  }

  public void setInit(String init) {
    curInfo.init = init;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (Map.Entry<String, ParserRuleInfo> infoEntry : name2info.entrySet()) {
      sb.append(infoEntry.getKey())
        .append(" = ");
      ArrayList<ArrayList<Rule>> alt = infoEntry.getValue().alternatives;
      for (ArrayList<Rule> rules : alt) {
        sb.append(String.join("\n", rules))
          .append("\nOR\n");
      }
      sb.append("\n\n");
    }

    return sb.toString();
//    return name2info.toString();
  }

  public void build() {
    buildFirst();
    buildFollow();
  }

  private void buildFollow() {

  }

  private void buildFirst() {
    boolean changed = true;
    while (changed) {
      for (ParserRuleInfo info : name2info.values()) {
        for (ArrayList<Rule> alternative : info.alternatives) {
          for (Rule rule: alternative) {
            HashSet<Integer> first = info.first.get(rule);
//            first.add()

          }
        }
      }
    }
  }
}
