package org.dataCentricDSL.tree.funcions;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.dataCentricDSL.Value;
import org.dataCentricDSL.tree.AtomNode;
import org.dataCentricDSL.tree.IdentifierNode;
import org.dataCentricDSL.tree.Node;

public class QueryNode  implements Node {
	
	private static Node sqlStatement;
	private Connection connection;
	
	public QueryNode(AtomNode queryStatement, Connection conn) {
		sqlStatement = queryStatement;
		connection = conn;		
	}
	
	public QueryNode(IdentifierNode identifierNode, Connection conn) {
		sqlStatement = identifierNode;
		connection = conn;
	}

	@Override
	public Value evaluate() {
		ResultSet result = null;
		try {
			result = executeQuery(sqlStatement.evaluate().toString());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return new Value(result);
	}
	
	public ResultSet executeQuery(String queryStatement) throws SQLException {
	    Statement statement = connection.createStatement();
	    ResultSet result = statement.executeQuery(queryStatement);
	    return result;
	  }
}	
