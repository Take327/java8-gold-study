package chapter5.exceptionTest;

public class Example {

	public static void doIt(int start, int end) {
		try {
			if (end > 20) {
				throw new Exception("iが指定範囲を超えています");
			}
		} catch (Exception e) {
			e.printStackTrace();// throwの後ここに処理が移る
		}
	}

}
