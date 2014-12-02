package org.dataCentricDSL.derbyDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class CreateDB {
	public static String DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
	public static String JDBC_URL = "jdbc:derby:test_database;create=true";
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName(DRIVER);
		Connection connection = DriverManager.getConnection(JDBC_URL);
		connection.createStatement().execute("create table people(first_name varchar(20), last_name varchar(20))");
		connection.createStatement().execute("insert into people values "+
											"('Georgi', 'Ivanov'), " +
											"('Kiril', 'Kostadinov'), " +
											"('Nedelcho', 'Delchev'), " +
											"('Bojidar', 'Nikolov')");
		System.out.println("DB created!");
		
	}
}
