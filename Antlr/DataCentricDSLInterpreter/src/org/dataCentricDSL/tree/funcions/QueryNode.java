package org.dataCentricDSL.tree.funcions;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.dataCentricDSL.TLValue;
import org.dataCentricDSL.tree.TLNode;

public class QueryNode  implements TLNode {
	
	private static String sqlStatement;
	private Connection connection;
	
	public QueryNode(String queryStatement, Connection conn) {
		sqlStatement = queryStatement;
		connection = conn;		
	}

	@Override
	public TLValue evaluate() {
		ResultSet result = null;
		try {
			result = executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return new TLValue(result);
	}
	
	public ResultSet executeQuery() throws SQLException {
	    Statement statement = connection.createStatement();
	    ResultSet result = statement.executeQuery(sqlStatement);
	    return result;
	  }
}	
