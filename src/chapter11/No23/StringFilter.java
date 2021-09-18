package chapter11.No23;

import java.util.function.Predicate;

public interface StringFilter<T> extends Predicate<T>{
	public default boolean test(String str) {
		return str.equals("n");
	}
	
}
