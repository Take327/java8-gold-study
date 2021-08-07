package chapter7.path;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
	public static void main(String[] args) throws IOException {
		// Pathインターフェース Pathsは実装クラス
		Path paths = Paths.get("/Users/takeshi/work/java学習用/java8-gold-study/public/sample.txt");
		Path path = Path.of("/Users/takeshi/work/java学習用/java8-gold-study/public/sample.txt");

		System.out.println("paths:"+paths);
		System.out.println("path:"+path);
		System.out.println("root:"+path.getRoot());
		System.out.println("file:"+path.getFileName());
		System.out.println(FileSystems.getDefault());
		
		Path dirPath = Path.of("/Users/takeshi/work/java学習用/java8-gold-study/public/test");
		//Files.createDirectory(dirPath);
		
		try(BufferedReader in = new BufferedReader(new FileReader(path.toString()))){
			
			//System.out.println((char)in.read());
			
			in.mark(1);//8196バイトを越えないと意味がない
			
			
			in.skip(3);
			System.out.println((char)in.read());
			System.out.println((char)in.read());
			System.out.println((char)in.read());
			System.out.println((char)in.read());

			
			System.out.println(in.readLine());
			
			in.reset();
			System.out.println(in.readLine());
		
		}catch (IOException e) {
			// TODO: handle exception
		}

	}
}
