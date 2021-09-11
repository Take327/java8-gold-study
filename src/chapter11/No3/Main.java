package chapter11.No3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("No3");
		// Arrays.asList(1, 2, 3).stream().map(x -> x +
		// 1).peek(System.out::print).count();
		
		//Java9以降はcount()だと出てこない。
		List<Integer> list = Arrays.asList(1, 2, 3);
		Stream<Integer> stream = list.stream();
		stream.peek(System.out::print).forEach(System.out::print);
	}

}
