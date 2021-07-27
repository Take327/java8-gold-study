package chapter3.runnable;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("-----------------------------");
		System.out.println("■無名関数");

		Runnable runner = () -> {
			System.out.println("うなにょ");
		};

		runner.run();

		Runnable runner2 = new Runnable() {
			public void run() {
				System.out.println("うなにょ２");
			}
		};

		runner2.run();

		System.out.println("-----------------------------");
		System.out.println("■メソッド外置き");

		testA(() -> {
			System.out.println("うなうな");
		});

		System.out.println("-----------------------------");
		System.out.println("■関数インターフェース");
		FunctionInterfaceTest<String> testA = () -> {
			return "うなじろう";
		};

		System.out.println(testA.testA());

		System.out.println("■関数インターフェース(引数あり)");
		FunctionInterfaceTest2 testB = test -> {
			System.out.println(test);
		};
		
		testB.test("うなうなうーな");
	}

	public static void testA(Runnable r) {
		r.run();
	}
}
