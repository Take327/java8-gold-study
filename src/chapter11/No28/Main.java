package chapter11.No28;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try (Connection conn = DBTest.getConnection();
				Statement stmt = conn.createStatement()) {

			ResultSet rs = stmt.executeQuery("SELECT * from test");
			while (rs.next()) {
				System.out.println(rs.getString(1) + ":" + rs.getString(2));

			}
			// stmt.executeQuery("INSERT INTO test VALUES(8,'うなふぃー')");
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
		}
	}

}
