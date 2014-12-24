package tl.tree;

import tl.TLValue;

import java.util.ArrayList;
import java.util.List;

public class BlockNode implements TLNode {

  private List<TLNode> statements;
  private TLNode returnStatement;

  public BlockNode() {
    statements = new ArrayList<TLNode>();
    returnStatement = null;
  }

  public void addReturn(TLNode stat) {
    returnStatement = stat;
  }

  public void addStatement(TLNode stat) {
    statements.add(stat);
  }

  @Override
  public TLValue evaluate() {
    for(TLNode stat : statements) {
      TLValue value = stat.evaluate();
      if(value != TLValue.VOID) {
        // return early from this block if value is a return statement
        return value;
      }
    }

    // return VOID or returnStatement.evaluate() if it's not null
    return returnStatement == null ? TLValue.VOID : returnStatement.evaluate();
  }

  @Override
  public String toString() {
    StringBuilder b = new StringBuilder();
    for(TLNode stat : statements) {
      b.append(stat).append("\n");
    }
    if(returnStatement != null) {
      b.append("return ").append(returnStatement).append("\n");
    }
    return b.toString();
  }
}

