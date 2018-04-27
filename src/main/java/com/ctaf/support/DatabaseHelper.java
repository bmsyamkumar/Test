package com.ctaf.support;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseHelper {

	private static Connection con = null;
	private static Statement state = null;
	private static ResultSet result = null;

	public static boolean connect() {
		try {
			System.out.println("connecting...");
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db",
					"root", null);
			state = con.createStatement();
			return true;
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

	public static void close() {
		try {
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
				}
			}
			if (state != null) {
				try {
					state.close();
				} catch (Exception e) {
				}
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void Insert(String date, String time, String logLevel,
			String message) throws SQLException {
		if (state != null)
			state.execute("INSERT INTO table_2(DATE,TIME,LOGLEVEL,MESSAGE) VALUES ("
					+ "'"
					+ date
					+ "','"
					+ time
					+ "','"
					+ logLevel
					+ "','"
					+ message + "')");
		else {
			System.out.println("cannot proceed!!!");
		}
	}

	public static void CreateTable(String tableName) throws SQLException {
		if (!isExist(tableName)) {
			state.execute("CREATE TABLE table_2 ( id INT NOT NULL PRIMARY KEY AUTO_INCREMENT, DATE VARCHAR(200) NOT NULL, TIME VARCHAR(200) NOT NULL,LOGLEVEL VARCHAR(200) NOT NULL,MESSAGE VARCHAR(200) NOT NULL)");
		} else {
			System.out.println("already Exist");
		}
	}

	private static boolean isExist(String TableName) throws SQLException {
		// TODO Auto-generated method stub
		DatabaseMetaData meta = con.getMetaData();
		ResultSet res = meta.getTables(null, null, null,
				new String[] { "TABLE" });
		while (res.next()) {
			if (res.getString("TABLE_NAME").equalsIgnoreCase(TableName)) {
				return true;
			}
		}
		return false;
	}

}
