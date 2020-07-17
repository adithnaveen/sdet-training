package com.sdet.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// this class shall have all the connection related information 
// if you are connecting to multiple databases it has to be 
// put here, and all variables related to DB goes in this class 

public class GetConnection {

	static Connection connection = null;
	public PreparedStatement ps = null, ps1 = null;
	public ResultSet rs = null;

	public static Connection getMySQLConnection() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/onlinedb",
					"root", "kanchan");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return connection;
	}
	
	public static Connection getOracleConnection() {
		return null;
	}

}
