package tl.tree;

import tl.TLValue;
import java.util.ArrayList;
import java.util.List;

public class IfNode implements TLNode {

  private List<Choice> choices;

  public IfNode() {
    choices = new ArrayList<Choice>();
  }

  public void addChoice(TLNode e, TLNode b) {
    choices.add(new Choice(e, b));
  }

  @Override
  public TLValue evaluate() {

    for(Choice ch : choices) {
      TLValue value = ch.expression.evaluate();

      if(!value.isBoolean()) {
        throw new RuntimeException("illegal boolean expression " + 
            "inside if-statement: " + ch.expression);
      }

      if(value.asBoolean()) {
        return ch.block.evaluate();
      }
    }

    return TLValue.VOID;
  }

  private class Choice {

    TLNode expression;
    TLNode block;

    Choice(TLNode e, TLNode b) {
      expression = e;
      block = b;
    }
  }
}

