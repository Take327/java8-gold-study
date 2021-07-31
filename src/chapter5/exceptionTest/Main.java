package chapter5.exceptionTest;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		// Example.doIt(0, 25);
		// IntStream.rangeClosed(1, 25).forEach(System.out::println);

		String filePath = "/Users/takeshi/work/java学習用/java8-gold-study/public/sumple.txt";
		try (FileReader fr = new FileReader(filePath)) {
			BufferedReader br = new BufferedReader(fr);

			String line = br.readLine();
			System.out.println(line);

		} catch (Exception e) {
			System.out.println(e);
		}

		try {
			getCauseTest.x();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}

}
