package chapter11.No1;

public class Outer {
	private int x;

	public Outer(int x) {
		this.x = x;
	}

	public void doIt(int y) {
		class Inner {
			int z = 0;

			public void doIt() {
				z = x * y;
				System.out.println(z);
			}
		}
		
		new Inner().doIt();
	}
}
