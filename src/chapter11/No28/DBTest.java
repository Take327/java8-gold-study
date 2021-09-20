package chapter11.No28;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBTest {
	private static final String URL = "jdbc:mysql://localhost:3306/test_db";
	private static final String USER = "root";
	private static final String PASS = "root";

	public static Connection newConn = null;

	public static Connection getConnection() throws SQLException {
		try {
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			newConn = conn;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return newConn;

	}
}
