package chapter11.No10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			Path file = Paths.get("public/sample.txt");
			BufferedReader buf = new BufferedReader(new FileReader(file.toFile()));
			Stream<String> str = buf.lines();
			str.forEach(System.out::println);
			
			
			Stream<String> str2 = Files.lines(file);
			str2.forEach(System.out::println);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

		}
	}

}
