package bg.tues.didi.tree.functions;

import java.io.PrintStream;
import java.sql.Connection;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import java.sql.Statement;

import bg.tues.didi.Value;
import bg.tues.didi.tree.Node;

public class UpdateNode  implements Node {

	private Node sqlStatement;
	private Connection connection;
	private PrintStream out;
	
	public UpdateNode(Node node, Connection conn, PrintStream outStream) {
		sqlStatement = node;
		connection = conn;
		out = outStream;
	}

	@Override
	public Value evaluate() {
		try {
			executeUpdate(sqlStatement.evaluate().toString());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Value.VOID;
	}

	public void executeUpdate(String queryStatement) throws SQLException {
		Statement statement = connection.createStatement();
		try {
			statement.executeUpdate(queryStatement);
		} catch (SQLException e) {
			throw new SQLException("Error on operation Update: " + e.getMessage());
		}
		out.println("Operation done");
	}
}	
