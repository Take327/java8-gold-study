package functionTest;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("----------------------------");
		System.out.println("■Functionインターフェース");

		/*************************************************
		 * Functionインターフェースは一つ目の型の引数を受け取り、 二つ目の引数の戻り値を返す。
		 * 
		 *************************************************/

		System.out.println("・apply");
		Function<String, Integer> func = (text) -> {
			try {
				Integer num = Integer.parseInt(text);
				Integer result = num * 100;

				return result;

			} catch (Exception e) {
				// TODO: handle exception

				return 1;

			}

		};

		System.out.println(func.apply("100"));
		System.out.println("");

		Function<String, String> funcA = text -> {
			System.out.println("funcA実行");
			return text + "aaa";
		};
		Function<String, String> funcB = text -> {
			System.out.println("funcB実行");
			return text + "bbb";
		};

		System.out.println("・compose");
		/*************************************************
		 * composeメソッドはFunctionAを実行する前にFunctionBを実行するよう定義する。
		 * 
		 * 
		 *************************************************/
		Function<String, String> composeTest = funcA.compose(funcB);
		System.out.println(composeTest.apply("AAAA"));
		System.out.println("");

		System.out.println("・andThen");
		Function<String, String> andThenTest = funcA.andThen(funcB);
		System.out.println(andThenTest.apply("AAAA"));
		System.out.println("");

		System.out.println("----------------------------");
		System.out.println("■Predicateインターフェース");

		System.out.println("・test");
		Predicate<Integer> over = num -> {
			System.out.println("over実行");
			return num > 100;
		};

		System.out.println(over.test(111));
		System.out.println("");

		System.out.println("・or");
		Predicate<Integer> under = num -> {
			System.out.println("under実行");
			return num < 10;
		};

		System.out.println(over.or(under).test(9));
		System.out.println("");

		System.out.println("・negate");
		System.out.println(over.negate().test(111));

		System.out.println("----------------------------");
		System.out.println("■Consumerインターフェース");
		System.out.println("・accept");
		Consumer<String> acceptTest = text -> {
			System.out.println("acceptTest:" + text);
		};

		acceptTest.accept("ABCD");

		System.out.println("・andThen");
		Consumer<String> andThenTest2 = text -> {
			System.out.println("andThenTest2:" + text);
		};

		acceptTest.andThen(andThenTest2).accept("abcd");
		System.out.println("----------------------------");
		System.out.println("■Supplierインターフェース");

		Supplier<String> supplierTest = () -> {
			return "hoge";
		};
		
		System.out.println(supplierTest.get());

	}

}
