package test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileInterface {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		File file = new File("public/write.txt");
		
		//Pathオブジェクトの作り方
		//Pathsクラスのgetメソッドから作る
		Path path = Paths.get("public/write.txt");
		//File から　Pathにする
		Path fileToPath = file.toPath();
		//Pathインターフェースのofメソッドで作成する
		Path path2 = Path.of("public/write.txt");
		
		
		//Fileオブジェクトの作り方
		//コンストラクタで作る
		File file2 = new File("public/write.txt");
		//Pathオブジェクトから作る
		File pathToFile = path.toFile();
		
		
		
		
		
		Files.lines(fileToPath).forEach(System.out::println);

	}

}
