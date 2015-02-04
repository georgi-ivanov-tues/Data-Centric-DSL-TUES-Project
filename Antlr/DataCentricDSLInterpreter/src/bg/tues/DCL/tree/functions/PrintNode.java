package bg.tues.DCL.tree.functions;

import java.io.PrintStream;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import bg.tues.DCL.Value;
import bg.tues.DCL.tree.Node;

public class PrintNode implements Node {
	private Node expression;
	private PrintStream out;

	public PrintNode(Node e) {
		this(e, System.out);
	}

	public PrintNode(Node e, PrintStream o) {
		expression = e;
		out = o;
	}

	@Override
	public Value evaluate() {
		Value value = expression.evaluate();
		if(value.isResultSet()){
			try {
				printResultSet(value.asResultSet());
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}else{
			out.print(value);
		}
		return Value.VOID;
	}
	
	public void printResultSet(ResultSet resultSet) throws SQLException {
		ResultSetMetaData metaData = resultSet.getMetaData();
		int columnCount = metaData.getColumnCount();
		while(resultSet.next()) {
			for(int i = 1; i <= columnCount; i++) {
				if(i > 1) out.print(" ");
				String columnValue = resultSet.getString(i);
				out.printf("%15s", columnValue);
			}
		}
	}
}
