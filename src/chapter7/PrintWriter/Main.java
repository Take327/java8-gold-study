package chapter7.PrintWriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;

public class Main {
	public static void main(String[] args) {
		Path path = Path.of("/Users/takeshi/work/java学習用/java8-gold-study/public/write.txt");
		File file = path.toFile();

		try (PrintWriter writer = new PrintWriter(file)) {

			for (int i = 0; i <= 19; i++) {
				writer.print(i);
				writer.print(":");
				writer.print(i % 2 == 0);
				writer.println();
			}

		} catch (FileNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		try (BufferedWriter bufWriter = new BufferedWriter(new FileWriter(file))) {
			for (int i = 0; i <= 19; i += 2) {
				bufWriter.write(String.valueOf(i));
				bufWriter.write(":");
				//bufWriter.write(i % 2 == 0);
				bufWriter.newLine();
			}

		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}
}
