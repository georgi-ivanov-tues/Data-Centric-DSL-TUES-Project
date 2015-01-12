package bg.tues.DCL.tree;

import bg.tues.DCL.Value;

public class AtomNode implements Node {

  private Value value;

  public AtomNode(Object v) {
    value = (v == null) ? Value.NULL : new Value(v);
  }

  @Override
  public Value evaluate() {
    return value;
  }

  @Override
  public String toString() {
    return value.toString();
  }
}

