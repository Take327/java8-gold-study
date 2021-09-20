package chapter11.No48;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {

		List<String> l1 = Arrays.asList("320 quick", "411 harness","254 rope");

		//ストリームAPIの中でのsorted()は引数なしでも並び替えできる。
		l1.stream().filter(e -> e.contains("2")).sorted().forEach(System.out::println);
		//Comparatorで逆順も可能
		l1.stream().filter(e -> e.contains("2")).sorted((o1, o2) -> o2.compareTo(o1)).forEach(System.out::println);
		
		
		//ちなみに並び替えシリーズ
		
		//TreeSetはComparatorなしでも昇順がデフォルトでついてくる。
		Set<String> s1 =new TreeSet<>();
		s1.add("bbbb");
		s1.add("cccc");
		s1.add("aaaa");
		System.out.println(s1);
		
		Set<String> s2 =new TreeSet<>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO 自動生成されたメソッド・スタブ
				return o2.compareTo(o1);
			}
		});
		s2.add("bbbb");
		s2.add("cccc");
		s2.add("aaaa");
		System.out.println(s2);
		
		//TreeMapもComparatorなしでも並び替えは可能
		Map<Integer,String> m1 = new TreeMap<>();
		m1.put(2,"BBBB");
		m1.put(3,"CCCC");
		m1.put(1,"AAAA");
		System.out.println(m1);
		//ちなみにVALUEでの並び替えはできない

		
		
		
		
		

		
		
	}
}
