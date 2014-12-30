package org.dataCentricDSL.tree;

import org.dataCentricDSL.TLValue;
import java.util.ArrayList;
import java.util.List;

public class LookupNode implements TLNode {

  private TLNode expression;
  private List<TLNode> indexes;

  public LookupNode(TLNode e, List<TLNode> i) {
    expression = e;
    indexes = i;
  }

  @Override
  public TLValue evaluate() {

    TLValue value = expression.evaluate();

    List<TLValue> indexValues = new ArrayList<TLValue>();

    for (TLNode indexNode : indexes) {
      indexValues.add(indexNode.evaluate());
    }

    for(TLValue index : indexValues) {

      if(!index.isNumber() || !(value.isList() || value.isString())) {
        throw new RuntimeException("illegal expression: " + expression + "[" + index + "]");
      }

      int idx = index.asLong().intValue();

      if(value.isList()) {
        value = value.asList().get(idx);
      }
      else if(value.isString()) {
        value = new TLValue(String.valueOf(value.asString().charAt(idx)));
      }
    }

    return value;
  }
}

