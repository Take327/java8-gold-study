package chapter8.EFWTest;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Runnable command = new Runnable() {
			public void run() {
				System.out.println(Thread.currentThread().getName() + " 終了");
			}
		};
		
		Callable<String> command2 = new Callable<>() {

			@Override
			public String call() throws Exception {
				// TODO 自動生成されたメソッド・スタブ
				return "callable";
			}
			
		};

		ExecutorService executor = Executors.newFixedThreadPool(2);
		System.out.println("start");
		executor.execute(command);
		executor.execute(command);
		executor.execute(command);
		executor.submit(command2);
		
	}

}
