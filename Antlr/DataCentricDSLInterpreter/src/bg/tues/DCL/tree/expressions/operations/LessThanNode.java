package bg.tues.DCL.tree.expressions.operations;

import bg.tues.DCL.Value;
import bg.tues.DCL.tree.Node;

public class LessThanNode implements Node {

  private Node lhs;
  private Node rhs;

  public LessThanNode(Node lhs, Node rhs) {
    this.lhs = lhs;
    this.rhs = rhs;
  }

  @Override
  public Value evaluate() {

    Value a = lhs.evaluate();
    Value b = rhs.evaluate();

    if(a.isNumber() && b.isNumber()) {
      return new Value(a.asDouble() < b.asDouble());
    }

    if(a.isString() && b.isString()) {
      return new Value(a.asString().compareTo(b.asString()) < -1);
    }

    throw new RuntimeException("Illegal expression: " + this);
  }

  @Override
  public String toString() {
    return String.format("(%s < %s)", lhs, rhs);
  }
}

