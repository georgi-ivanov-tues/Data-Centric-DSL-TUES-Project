package org.dataCentricDSL.tree;

import org.dataCentricDSL.TLValue;

public class LTNode implements TLNode {

  private TLNode lhs;
  private TLNode rhs;

  public LTNode(TLNode lhs, TLNode rhs) {
    this.lhs = lhs;
    this.rhs = rhs;
  }

  @Override
  public TLValue evaluate() {

    TLValue a = lhs.evaluate();
    TLValue b = rhs.evaluate();

    if(a.isNumber() && b.isNumber()) {
      return new TLValue(a.asDouble() < b.asDouble());
    }

    if(a.isString() && b.isString()) {
      return new TLValue(a.asString().compareTo(b.asString()) < -1);
    }

    throw new RuntimeException("illegal expression: " + this);
  }

  @Override
  public String toString() {
    return String.format("(%s < %s)", lhs, rhs);
  }
}

