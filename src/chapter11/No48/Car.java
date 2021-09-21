package chapter11.No48;

public class Car implements Comparable<Car> {
	private int id;
	private String name;

	public Car(int id, String name) {
		this.id = id;
		this.name = name;

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return id + name;
	}

	@Override
	public int compareTo(Car o) {
		// TODO 自動生成されたメソッド・スタブ
		return this.id - o.id;
	}

}
