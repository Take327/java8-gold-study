package chapter11.No7;

import java.util.function.Supplier;

public class Example {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// 引数がなくParent型を返すラムダ式 つまりSupplier<Parent>
		execute(() -> new Parent());
		// ()-> new Child の省略形
		// Child型を戻り値にする場合はSupplier<Parent> もしくは Supplier<? extends Parent>
		execute(Child::new);

		//execute2(e -> e.doIt());
	}

	// Supplierは戻り値のある型 引数なし戻り値あり
	// Consumerは戻り値がない型 引数あり戻り値なし
	static void execute(Supplier<? extends Parent> parent) {
		parent.get().doIt();
		;
	}

}
