package bg.tues.DCL.tree.expressions.operations;

import bg.tues.DCL.Value;
import bg.tues.DCL.tree.Node;

import java.util.List;

public class AddNode implements Node {

  private Node lhs;
  private Node rhs;

  public AddNode(Node lhs, Node rhs) {
    this.lhs = lhs;
    this.rhs = rhs;
  }

  @Override
  public Value evaluate() {

    Value a = lhs.evaluate();
    Value b = rhs.evaluate();
    
    // number + number
    if(a.isNumber() && b.isNumber()) {
      return new Value(a.asDouble() + b.asDouble());
    }

    // list + any
    if(a.isList()) {
      List<Value> list = a.asList();
      list.add(b);
      return new Value(list);
    }

    // string + any
    if(a.isString()) {
      return new Value(a.asString() + "" + b.toString());
    }

    // any + string
    if(b.isString()) {
      return new Value(a.toString() + "" + b.asString());
    }

    throw new RuntimeException("illegal expression: " + this);
  }

  @Override
  public String toString() {
    return String.format("(%s + %s)", lhs, rhs);
  }
}

