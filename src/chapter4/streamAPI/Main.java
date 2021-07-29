package chapter4.streamAPI;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
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

		System.out.println("-------------------------------");
		Map<Integer, String> map = new TreeMap<>();
		map.put(2, "B");
		map.put(1, "A");
		System.out.println(map);
		map.forEach((k, v) -> System.out.println(k + v));
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + entry.getValue());
		}
		System.out.println("-------------------------------");
		int[] intarray = { 1, 2, 3, 4, 5 };
		IntStream streamA = Arrays.stream(intarray, 1, 4);
		streamA.forEach(System.out::println);
		System.out.println("-------------------------------");
		int[] intarray2 = { 2, 4, 6, 1, 8, 9 };
		Arrays.asList(20, 35, 15).stream().sorted((i, j) -> {
			System.out.println("i:" + i + " j:" + j + " j-i=" + (j - i));
			return i - i;
		}).forEach(i -> System.out.println(i));
		System.out.println("-------------------------------");
		Set<Employee> set = new TreeSet<>(Comparator.comparing(Employee::getId));
		set.add(new Employee(3, "AAA"));
		set.add(new Employee(1, "BBB"));
		set.add(new Employee(2, "CCC"));
		System.out.println(set);

		Set<Employee> set2 = new TreeSet<>();
		set2.add(new Employee(3, "AAA"));
		set2.add(new Employee(1, "BBB"));
		set2.add(new Employee(2, "CCC"));
		System.out.println(set2);

		Comparator<Employee> comp = new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO 自動生成されたメソッド・スタブ
				return o2.getId() - o1.getId();
			}

		};

		Set<Employee> set3 = new TreeSet<>(comp);
		set3.add(new Employee(3, "AAA"));
		set3.add(new Employee(1, "BBB"));
		set3.add(new Employee(2, "CCC"));
		System.out.println(set3);
		System.out.println("-------------------------------");
		Stream<String> streamB = Stream.of("banana", "apple", "orange").filter(e -> e.length() > 5)
				.peek(System.out::print).map(String::toUpperCase).peek(System.out::print);

		System.out.print("OK ");
		streamB.count();
		System.out.println("-------------------------------");
		List<Integer> arrayC = Arrays.asList(10, 10, 15);
		System.out.println(arrayC.stream().allMatch(e -> e == 1));
		System.out.println("-------------------------------");
		List<List<String>> list = Arrays.asList(Arrays.asList("Java", "Oracle"), Arrays.asList("Lambda", "Java"));
		System.out.println(list);
		list.stream().flatMap(l ->{
			System.out.println(l);
			return l.stream();
		}).distinct().forEach(System.out::println);
		
		System.out.println("-------------------------------");
		Map<String,String> mapA = new HashMap<>();
		mapA.put("A","B");
		mapA.merge("A", "B", (v1,v2)->v1.concat(v2));
		System.out.println(mapA);
		mapA.merge("B", "C", (v1,v2)->v1.concat(v2));
		System.out.println(mapA);

		
		
		
	}

}
