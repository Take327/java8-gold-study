package chapter11.No39;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// まずはコンストラクタ参照のメソッドをインターフェース型に代入する。
		// ここでインスタンスかされるわけではない。
		//Flyableは関数がたインターフェースなので、Airplane::newを書くと
		//唯一の関数のgetAirplaneの実装内容がAirplane::newになる。
		Flyable f = Airplane::new;
		Airplane a = f.getAirplane("Boeing");
		System.out.println(a.getName());

		// 参考
		// この問題を細かく書くと以下のようになる。
		Flyable f2 = new Flyable() {
			@Override
			public Airplane getAirplane(String name) {
				// TODO 自動生成されたメソッド・スタブ
				return new Airplane(name);
			}
		};
		
		Airplane a2 = f.getAirplane("これa2");
		System.out.println(a2.getName());

		
		
	}

}
