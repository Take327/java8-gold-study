package chapter11.No2;

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		IntStream s1 = IntStream.of(1, 2, 3);
		//s1.map(x -> x + 1).forEach(System.out::print);

		// IntFunctionは引数がInt固定 戻り値のみジェネリクスで指定する
		//IntUnaryOperatorは引数がint固定の演算式を戻り値で返す
		IntFunction<IntUnaryOperator> func = x -> y -> x + y;// [x->]ここまでが引数 [y->x+y] ここが戻り値
		
		IntStream s2 = s1.map(func.apply(1));
		s2.forEach(System.out::print);
		

		// 第一ジェネリクスが引数 第二ジェネリクスが戻り値
		Function<String, String> testFunc = x -> "これは" + x + "です。";
		System.out.println(testFunc.apply("テスト"));

		IntFunction<String> test2Func = x -> "test" + x;
		System.out.println(test2Func.apply(5));

		UnaryOperator<Integer> testUn = x -> x + 1;
		IntUnaryOperator testIntUn = x -> x + 1;

	}

}
