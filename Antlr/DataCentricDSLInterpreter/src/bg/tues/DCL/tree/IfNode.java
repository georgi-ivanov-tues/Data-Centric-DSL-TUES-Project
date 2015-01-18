package bg.tues.DCL.tree;

import bg.tues.DCL.Value;

import java.util.ArrayList;
import java.util.List;

public class IfNode implements Node {

  private List<Choice> choices;

  public IfNode() {
    choices = new ArrayList<Choice>();
  }

  public void addChoice(Node e, Node b) {
    choices.add(new Choice(e, b));
  }

  @Override
  public Value evaluate() {

    for(Choice ch : choices) {
      Value value = ch.expression.evaluate();

      if(!value.isBoolean()) {
        throw new RuntimeException("Illegal boolean expression " + 
            "inside if-statement: " + ch.expression);
      }

      if(value.asBoolean()) {
        return ch.block.evaluate();
      }
    }

    return Value.VOID;
  }

  private class Choice {

    Node expression;
    Node block;

    Choice(Node e, Node b) {
      expression = e;
      block = b;
    }
  }
}

