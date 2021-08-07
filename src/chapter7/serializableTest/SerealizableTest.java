package chapter7.serializableTest;

import java.io.Serializable;

public class SerealizableTest implements Serializable {

	private int x;
	private transient int y;
	private static int z;

	public SerealizableTest(int x, int y, int _z) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.x = x;
		this.y = y;
		z = _z;
	}

	@Override
	public String toString() {
		return x + ":" + y + ":" + z;
	}
}
