package chapter11.No4;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Map<Integer, String> m1 = new HashMap<>();

		m1.put(4, "d");
		m1.put(2, "b");
		m1.put(3, "c");
		m1.put(1, "a");
		System.out.println(m1);

		Map<Integer, String> m2 = new TreeMap<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO 自動生成されたメソッド・スタブ
				System.out.println("stert");
				System.out.println("o2:" + o2 + " < " + "o1:" + o1 +"?");
				
				System.out.println(o2.compareTo(o1));
				//o2 < o1 なら　-1 o2==o1 なら0
				//第二引数を元にすると逆順になる
				return o2.compareTo(o1);
			}

		});

		m2.putAll(m1);
		
		

		for (Map.Entry<Integer, String> entry : m2.entrySet()) {
			System.out.print(entry.getValue() + " ");
		}

	}

}
