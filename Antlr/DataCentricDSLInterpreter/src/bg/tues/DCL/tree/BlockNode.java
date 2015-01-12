package bg.tues.DCL.tree;

import bg.tues.DCL.Value;

import java.util.ArrayList;
import java.util.List;

public class BlockNode implements Node {

  private List<Node> statements;
  private Node returnStatement;

  public BlockNode() {
    statements = new ArrayList<Node>();
    returnStatement = null;
  }

  public void addReturn(Node stat) {
    returnStatement = stat;
  }

  public void addStatement(Node stat) {
    statements.add(stat);
  }

  @Override
  public Value evaluate() {
    for(Node stat : statements) {
      Value value = stat.evaluate();
      if(value != Value.VOID) {
        // return early from this block if value is a return statement
        return value;
      }
    }

    // return VOID or returnStatement.evaluate() if it's not null
    return returnStatement == null ? Value.VOID : returnStatement.evaluate();
  }

  @Override
  public String toString() {
    StringBuilder b = new StringBuilder();
    for(Node stat : statements) {
      b.append(stat).append("\n");
    }
    if(returnStatement != null) {
      b.append("return ").append(returnStatement).append("\n");
    }
    return b.toString();
  }
}

