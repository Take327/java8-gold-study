package chapter6.localTimeTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		LocalDate nowDate = LocalDate.now();
		LocalTime time = LocalTime.now();

		System.out.println(nowDate +" " + time);

		System.out.println("------------------------------");
		LocalDate date = LocalDate.of(1994, 5, 17);

		System.out.println(date);
		
		
		System.out.println(Period.between(date, nowDate).getYears());

		System.out.println("-------------------------------");
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);


		System.out.println("-------------------------------");

	}

}
