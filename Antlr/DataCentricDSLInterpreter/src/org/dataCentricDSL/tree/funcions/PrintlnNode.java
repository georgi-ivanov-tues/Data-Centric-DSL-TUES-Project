package org.dataCentricDSL.tree.funcions;

import org.dataCentricDSL.TLValue;
import org.dataCentricDSL.tree.TLNode;

import java.io.PrintStream;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

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
		if(value.isResultSet()){
			try {
				printResultSet(value.asResultSet());
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}else{
			out.println(value);
		}
		return TLValue.VOID;
	}
	
	public void printResultSet(ResultSet resultSet) throws SQLException {
		ResultSetMetaData metaData = resultSet.getMetaData();
		int columnCount = metaData.getColumnCount();
		while(resultSet.next()) {
			for(int i = 1; i <= columnCount; i++) {
				if(i > 1) System.out.print(" ");
				String columnValue = resultSet.getString(i);
				System.out.printf("%15s", columnValue);
			}
			System.out.println("");
		}
	}
}

