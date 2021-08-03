package chapter6.localTimeTest;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		LocalDate nowDate = LocalDate.now();
		LocalTime time = LocalTime.now();

		System.out.println(nowDate + " " + time);

		System.out.println("------------------------------");
		LocalDate date = LocalDate.of(1994, 5, 17);

		System.out.println(date);

		System.out.println(Period.between(date, nowDate).getYears());

		System.out.println("-------------------------------");

		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);

		System.out.println("-------------------------------");
		System.out.println(Month.APRIL);
		System.out.println(DayOfWeek.FRIDAY);

		System.out.println("-------------------------------");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime formatLocalDateTime = LocalDateTime.parse("2017/04/01 10:00:00", formatter);
		System.out.println(formatLocalDateTime.format(formatter));

		System.out.println("-------------------------------");
		LocalDateTime localDateTime2 = LocalDateTime.now();
		LocalDate fromTest = LocalDate.from(localDateTime2);
		System.out.println(fromTest);

	}

}
