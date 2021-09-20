package chapter11.No39;

public class Airplane {

	private String name;

	public Airplane(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return name;
	}
}
