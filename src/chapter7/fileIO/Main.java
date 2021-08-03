package chapter7.fileIO;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		try (LineNumberReader buf = new LineNumberReader(new FileReader("public/sample.txt"))) {
			buf.setLineNumber(1);

			System.out.println(buf.readLine());
			System.out.println(buf.readLine());

			buf.close();
			//throw new IOException();
			
			String secondLine = Files.readAllLines(Paths.get("public/sample.txt")).get(0);
			System.out.println(secondLine);
			
			
			
			PrintWriter w = new PrintWriter("public/write.txt");
			w.print("あいうえお");
			w.print("かきくけこ");
			w.println("あいうえお");
			w.println("かきくけこ");
			
			w.close();

		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

}
