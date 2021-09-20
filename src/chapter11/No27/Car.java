package chapter11.No27;

public class Car {
	private int cno;
	private String name;

	public Car(int cno, String name) {
		this.cno = cno;
		this.name = name;
	}

	public int getCno() {
		return cno;
	}

	public String toString() {
		return cno + ":" + name;
	}

}
