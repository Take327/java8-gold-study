package chapter7.serializableTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Path;

public class Import {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		File file = Path.of("/Users/takeshi/work/java学習用/java8-gold-study/public/out.ser").toFile();
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))){
			
			SerealizableTest input =(SerealizableTest)in.readObject();
			System.out.println(input);
			
			
		} catch (FileNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}

}
