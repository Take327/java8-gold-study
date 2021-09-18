package chapter11.No8;

import java.util.concurrent.ForkJoinPool;

public class Main {

	public static void main(String[] args) {
		
		int data[] = { 1, 2, 3, 4, 5 };
		ForkJoinPool service = new ForkJoinPool();
		service.invoke(new AddAction(data, 0, data.length));
	}

}
