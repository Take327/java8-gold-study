package chapter7.serializableTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Path;

public class Output {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		File file = Path.of("/Users/takeshi/work/java学習用/java8-gold-study/public/out.ser").toFile();
		
		try(ObjectOutputStream out =new ObjectOutputStream(new FileOutputStream(file))){
			SerealizableTest test =new SerealizableTest(1,2,3);
			
			out.writeObject(test);
			
		} catch (FileNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}

}
