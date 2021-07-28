package chapter4.streamAPI;

public class Employee implements Comparable<Employee>{
	private int id;
	private String name;

	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return id + "=" + name;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO 自動生成されたメソッド・スタブ
		return this.id - o.id;
	}

}
