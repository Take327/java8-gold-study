package chapter11.No66;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//new の後ろにもう一度new を書こう！！
		Outer.Inner inner = new Outer().new Inner();
		
		inner.print();
	}

}
