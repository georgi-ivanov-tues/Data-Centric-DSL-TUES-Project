package bg.tues.didi.tree.functions;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import bg.tues.didi.Value;
import bg.tues.didi.tree.Node;

public class QueryNode  implements Node {
	
	private static Node sqlStatement;
	private Connection connection;

	public QueryNode(Node node, Connection conn) {
		sqlStatement = node;
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
