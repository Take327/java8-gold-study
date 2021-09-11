package chapter10.Localize;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Locale jplocale = new Locale("ja","JP");
		
		System.out.println(jplocale);
		System.out.println(jplocale.getCountry());
		System.out.println(jplocale.getDisplayCountry());
		System.out.println(Locale.getDefault());

		System.out.println("---------------------------------------");
		Locale defLocale = Locale.getDefault();
		System.out.println(defLocale);
		System.out.println(defLocale.getCountry());
		System.out.println(defLocale.getDisplayCountry());
		
		System.out.println("---------------------------------------");		
		Locale enumLocale = Locale.US;
		System.out.println(enumLocale);
		System.out.println(enumLocale.getCountry());
		System.out.println(enumLocale.getDisplayCountry());
		
		
	}

}
