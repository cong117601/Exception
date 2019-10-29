package com.yunhe.day01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {

	private static Connection con = null;
	private static Statement statement = null;

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "000000");
			statement = con.createStatement();
			String sql = "update student set studentname='UZI' where studentage='18'";
//		 statement.executeUpdate(sql);
			System.out.println(statement.executeUpdate(sql));
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}

	}

}
