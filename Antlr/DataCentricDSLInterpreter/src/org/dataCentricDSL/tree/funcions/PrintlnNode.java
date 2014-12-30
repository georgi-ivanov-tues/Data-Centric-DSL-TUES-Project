package org.dataCentricDSL.tree.funcions;

import org.dataCentricDSL.TLValue;
import org.dataCentricDSL.tree.TLNode;
import java.io.PrintStream;

public class PrintlnNode implements TLNode {

  private TLNode expression;
  private PrintStream out;

  public PrintlnNode(TLNode e) {
    this(e, System.out);
  }

  public PrintlnNode(TLNode e, PrintStream o) {
    expression = e;
    out = o;
  }

  @Override
  public TLValue evaluate() {
    TLValue value = expression.evaluate();
    out.println(value);
    return TLValue.VOID;
  }
}

