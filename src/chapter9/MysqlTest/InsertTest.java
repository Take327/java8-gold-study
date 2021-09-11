package chapter9.MysqlTest;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertTest {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		try {
			String name = args[1];

			// 変数の準備
			String maxIdSQL = "SELECT max(id) from test;";

			try (Statement stmt = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db", "root", "root")
					.createStatement()) {

				ResultSet rs = stmt.executeQuery(maxIdSQL);
				int id;
				if (rs.next()) {
					id = rs.getInt(1) + 1;
				} else {
					throw new Exception();
				}

				String insertSQL = "INSERT INTO test VALUES(" + id + "," + "'" + name + "'" + ");";
				System.out.println(insertSQL);

				stmt.executeUpdate(insertSQL);

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}

		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

}
