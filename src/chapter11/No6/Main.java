package chapter11.No6;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		String[] brics = { "BBB", "RRR", "III", "CCC" };
		Arrays.sort(brics, (a1, a2) -> a1.compareTo(a2));

		for (int i = 0; i < brics.length; i++) {
			System.out.println(brics[i]);
		}
		
		//Arraysにはstream()はない　asList()でList型にしてから使用する。
		Arrays.asList(brics).stream().forEach(e -> System.out.println(e));

		// @formatter:on

	}
}
