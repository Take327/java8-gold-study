package chapter11.No44;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
	public static void main(String[] args) {
		try {
			//readAllLinesはListオブジェクトを返す。
			Files.readAllLines(Paths.get("text.txt"));
			//linesはstreamオブジェクトを返す。
			Files.lines(Paths.get("text.txt"));
			
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}
