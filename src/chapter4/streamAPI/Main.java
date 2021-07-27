package chapter4.streamAPI;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		class Sub {
			private String str;

			Sub(String str) {
				this.str = str;
			}

			public void print() {
				System.out.println("[" + str + "]");
			}
		}

		List<Integer> array = Arrays.asList(1, 2, 3, 4, 5);

		array.stream().filter((i) -> i % 2 == 0).forEach((i) -> System.out.println(i));
		array.stream().map((i) -> "[" + i + "]").forEach((i) -> System.out.println(i));

		Deque<String> deq = new ArrayDeque<String>(Arrays.asList("A", "B", "C"));

		deq.addLast("D");
		System.out.println(deq);

		Stream<String> subStream = Stream.of("あ", "い", "う", "え", "お");
		subStream.map(str -> new Sub(str)).forEach(obj -> obj.print());
		IntStream.range(1, 15).forEach(i -> System.out.println(i));

	}

}
