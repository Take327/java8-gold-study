package chapter11.No9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Stream<List<String>> s1 = Stream.of(Arrays.asList("1", "Bill"), Arrays.asList("2", null));

		// Stream s2 =s1.flatMapToInt(x->x.stream());
		// flatMapToIntはIntStreamを戻す なので上記はx.stream() はStream型なのでコンパイルエラー
		// flatMapはストリーム要素の各要素にFunction型で処理を実行（Mapメソッドみたいな感じ）してStream型で返す。
		Stream<String> s3 = s1.flatMap(x -> x.stream());
		s3.forEach(System.out::println);

		Stream<List<Integer>> i1 = Stream.of(Arrays.asList(1, 10), Arrays.asList(2, null));
		IntStream i2 = i1.flatMapToInt(x -> x.stream().mapToInt(y->y));
		i2.forEach(System.out::println);
		//ちなみにIntStream はNullは使えないぬるぽになる。

	}

}
