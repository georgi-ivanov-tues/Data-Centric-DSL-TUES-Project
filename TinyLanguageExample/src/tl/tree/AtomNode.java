package tl.tree;

import tl.TLValue;

public class AtomNode implements TLNode {

  private TLValue value;

  public AtomNode(Object v) {
    value = (v == null) ? TLValue.NULL : new TLValue(v);
  }

  @Override
  public TLValue evaluate() {
    return value;
  }

  @Override
  public String toString() {
    return value.toString();
  }
}

