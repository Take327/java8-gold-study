package chapter11.No67;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Path p1 = Paths.get("/x/./y/");
		
		//resolveは引数にスラッシュがあるかないかで動作が変わる！
		//スラッシュがある場合は全部置き換えてくる
		//スラッシュがないと後続に追加してくれる
		Path p2 = p1.resolve("z"); // 👉　/x/./y/z
		Path p3 = p1.resolve("/z/"); // 👉　/z
		
		System.out.println(p2);
		System.out.println(p3);
	}

}
