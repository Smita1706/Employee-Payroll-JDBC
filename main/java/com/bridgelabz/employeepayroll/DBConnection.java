package com.bridgelabz.employeepayroll;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/payroll_service";
		String username = "root";
		String password = "Smita@123";
		Connection connection = null;
		try {
			System.out.println("Connectiong to database :"+ dbURL);
			connection = DriverManager.getConnection(dbURL, username, password);
			System.out.println("Database connection is successfull");
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
}
