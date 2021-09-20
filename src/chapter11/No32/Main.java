package chapter11.No32;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int count = 0;
		List<Sales> salesList = new ArrayList<>();
		salesList.add(new Sales(1, 20));
		salesList.add(new Sales(2, 15));
		salesList.add(new Sales(3, 10));

		Sales sales = salesList.stream().reduce(new Sales(4, 0), (s1, s2) -> {
			System.out.println("s1:" + s1 + " s2:" + s2);
			s1.qty += s2.qty;
			return new Sales(s1.id, s1.qty);
		});

		salesList.add(sales);

		System.out.println("ここから次のストリーム処理");

		salesList.stream().parallel().reduce((s1, s2) -> {
			System.out.println("s1:" + s1 + " s2:" + s2);
			return s1.qty > s2.qty ? s1 : s2;
		}).ifPresent(System.out::println);
	}

}
