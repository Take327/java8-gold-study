package chapter11.No27;

public class Bike implements Comparable<Bike> {

	private int cno;
	private String name;

	public Bike(int cno, String name) {
		this.cno = cno;
		this.name = name;
	}

	public int getCno() {
		return cno;
	}

	public String toString() {
		return cno + ":" + name;
	}

	@Override
	public int compareTo(Bike o) {
		// TODO 自動生成されたメソッド・スタブ
		return o.cno - cno;
	}

}
