/**
 * 
 */
package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author user368
 *
 */
public class ConnectionDetails {
	public static Connection getConnectionDetails() {
		Connection connection = null;// utility
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "root");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
}
