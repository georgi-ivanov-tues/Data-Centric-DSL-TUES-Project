package bg.tues.didi.tree.functions;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import bg.tues.didi.Value;
import bg.tues.didi.tree.Node;

public class Update  implements Node {

	private static Node sqlStatement;
	private Connection connection;

	public Update(Node node, Connection conn) {
		sqlStatement = node;
		connection = conn;
	}

	@Override
	public Value evaluate() {
		try {
			executeQuery(sqlStatement.evaluate().toString());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Value.VOID;
	}

	public void executeQuery(String queryStatement) throws SQLException {
		Statement statement = connection.createStatement();
		int executeUpdateResult = statement.executeUpdate(queryStatement);
//		if(executeUpdateResult == 0){
//			System.out.println();
//		}else{
//			throw new RuntimeException("Table creation failure...");
//		}
	}
}	
