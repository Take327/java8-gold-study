package chapter7.fileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		try (BufferedReader buf = new BufferedReader(new FileReader("public/sample.txt"))) {

			System.out.println(buf.readLine());

			buf.close();
			throw new IOException();

		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

}
