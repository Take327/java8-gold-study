package chapter11.No22;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<Employee> empList = Arrays.asList(new Employee("Paul", "Accountant", "CA"),
				new Employee("Philip", "Sales", "NY"), new Employee("Francis", "Sales", "CA"));
		
		//forEachの引数は２つ発生する　第一引数はグルーピングするキー　第二引数はListオブジェクトが入る
		//メソッド参照は「クラス::メソッド」で実行する
		//Collectors.groupingByは指定された文字列を含む
		empList.stream().collect(Collectors.groupingBy(e->e.toString()))
				.forEach((k, e) -> System.out.println(k + ":" + e));

		empList.stream().collect(Collectors.groupingBy(Employee::getCity))
				.forEach((k, e) -> System.out.println(k + ":" + e));

	}

}
