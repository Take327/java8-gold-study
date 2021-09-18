package chapter11.No23;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<String> fourSeasons = Arrays.asList("Spring", "Summer", "Autumn", "Winter");
		Predicate<String> p1 = s -> s.length() > 5;
		
		//StringFilterインターフェースがPredicateを継承していないと代入できない。
		//インターフェースには抽象メソッド意外にも実装のあるメソッドを追加できるようになったけど、
		//static とdefaultをつけないといけない。
		Predicate<String> p2 =  new StringFilter<>() {
			public boolean test(String str) {
				return str.contains("er");
			}
		};

		long count = fourSeasons.stream().filter(p1).filter(p2).count();

		System.out.println(count);

	}

}
