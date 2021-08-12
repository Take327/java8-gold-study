package chapter9.MysqlTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 変数の準備
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		// SQL文の作成
		String sql = "SELECT * FROM test";

		try {
			// JDBCドライバのロード
			Class.forName("com.mysql.cj.jdbc.Driver");
			// データベース接続
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db", "root", "root");
			// SQL実行準備
			stmt = con.prepareStatement(sql);
			// 実行結果取得
			rs = stmt.executeQuery();

			// データがなくなるまで(rs.next()がfalseになるまで)繰り返す
			while (rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");

				System.out.println(id + ":" + name);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("JDBCドライバのロードでエラーが発生しました");
		} catch (SQLException e) {
			System.out.println("データベースへのアクセスでエラーが発生しました。");
			e.printStackTrace();
		} finally {
			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				System.out.println("データベースへのアクセスでエラーが発生しました。");
			}
		}
	}

}