package org.dataCentricDSL.derbyDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class QueryExectution {

	public static ArrayList<String[]> executeQuery(String sql_statement) throws SQLException{
		Connection connection = DriverManager.getConnection(CreateDB.JDBC_URL);
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql_statement);
		ResultSetMetaData resultSetMetaData = resultSet.getMetaData();

		ArrayList<String[]> queryResult = new ArrayList<>();
		while(resultSet.next()){
			String[] row = new String[resultSetMetaData.getColumnCount()];
			for(int i1 = 1; i1 <= resultSetMetaData.getColumnCount(); i1++){
				row[i1-1] = resultSet.getString(i1);
			}
			queryResult.add(row);
		}


		if(statement != null) statement.close();
		if(connection != null) connection.close();

		return queryResult;
	}

	public static void printQueryResult(ArrayList<String[]> queryResult) throws SQLException{
		for(String[] row : queryResult){
			for(String el : row){
				System.out.printf("%15s", el);
			}
			System.out.println("");
		}
	}
}
