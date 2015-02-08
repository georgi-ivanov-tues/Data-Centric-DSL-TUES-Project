package bg.tues.didi.tree.functions;

import bg.tues.didi.Value;
import bg.tues.didi.tree.Node;

import java.io.PrintStream;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class PrintlnNode implements Node {

	private Node expression;
	private PrintStream out;

	public PrintlnNode(Node e) {
		this(e, System.out);
	}

	public PrintlnNode(Node e, PrintStream o) {
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
			out.println(value);
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
			out.println("");
		}
	}
}

