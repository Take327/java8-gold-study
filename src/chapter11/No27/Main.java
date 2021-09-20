package chapter11.No27;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//TreeSetを使う場合はComparatorを引数に匿名インスタンス渡す
		Set<Car> carSet = new TreeSet<>(new Comparator<>() {
			@Override
			public int compare(Car o1, Car o2) {
				// TODO 自動生成されたメソッド・スタブ
				return o1.getCno() - o2.getCno();
			}
		});

		carSet.add(new Car(10123, "Volkswagen"));
		carSet.add(new Car(10124, "Audi"));

		System.out.println(carSet);
		
		
		Set<Bike> carSet2 = new TreeSet<>();
		carSet2.add(new Bike(10123, "Volkswagen"));
		carSet2.add(new Bike(10124, "Audi"));
		System.out.println(carSet2);

	}

}
