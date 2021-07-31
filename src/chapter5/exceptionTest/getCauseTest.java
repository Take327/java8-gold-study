package chapter5.exceptionTest;

public class getCauseTest {
	static void x() throws Exception {
		try {
			y();
		} catch (Exception e) {
			// TODO: handle exception
			throw new Exception("x()のエラー:" + e);
		}
	}

	static void y() throws Exception {
		try {
			z();
		} catch (Exception e) {
			// TODO: handle exception
			throw new Exception("y()のエラー:" + e);
		}
	}

	static void z() throws Exception {
		throw new Exception("z()のエラー");
	}
}
