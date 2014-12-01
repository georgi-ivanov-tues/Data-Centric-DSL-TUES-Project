package org.dataCentricDSL.derbyDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class QueryExectution {
	
	public static void executeQuery(String sql_statement) throws SQLException{
		Connection connection = DriverManager.getConnection(CreateDB.JDBC_URL);
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql_statement);
		ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
		for(int i = 1; i <= resultSetMetaData.getColumnCount(); i++){
			System.out.format("%20s", resultSetMetaData.getColumnName(i) + "|");
		}
		while(resultSet.next()){
			System.out.println("");
			for(int i1 = 1; i1 <= resultSetMetaData.getColumnCount(); i1++){
				System.out.format("%20s", resultSet.getString(i1) + "|");
			}
		}
			
		if(statement != null) statement.close();
		if(connection != null) connection.close();
	}
}
