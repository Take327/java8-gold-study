package chapter1.genericTest;

public class SubA<T> {
	private T parm;

	SubA(T parm) {
		this.parm = parm;
	}

	public T getParm() {
		return parm;
	}

}
