package chapter2.collection;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("ArrayList-----------------");
		Integer[] array = { 1, 2, 3 };

		List<Integer> list1 = Arrays.asList(array);
		
		ArrayList<Integer> list2 = new ArrayList<>(list1);
		
		list1.set(0, 2);
		list2.add(4);
		list2.add(null);

		System.out.println(Arrays.toString(array));
		System.out.println(array);
		System.out.println(list1);
		System.out.println(list2);
		
		
		// キュー構造
		System.out.println("ArrayDeque-----------------");
	    Deque<String> q = new ArrayDeque<String>();
	    q.addLast("AAAAA");
	    q.addLast("BBBBB");
	    q.addLast("CCCCC");
	    System.out.println(q);
	    
	    q.addFirst("DDDDD");
	    System.out.println(q);
	    
	    //Set
		System.out.println("HashSet-----------------");
		HashSet<String> hs = new HashSet<>();
		
		hs.add("AAAA");
		hs.add("BBBB");
		hs.add(null);
		
		System.out.println(hs);
		
		//Map
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "test1");
		map.put(2, "test2");
		map.put(1, "test3");
		
		System.out.println(map.get(2));
		
		
	    

		
		
		
	}

}
