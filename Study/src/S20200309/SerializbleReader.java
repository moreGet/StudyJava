package S20200309;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerializbleReader {

	public static void main(String[] args) throws Exception {
		String path = "C:\\Temp\\Obj.data";
		FileInputStream fis = new FileInputStream(path);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		ClassA v = (ClassA) ois.readObject();
		System.out.println("field1: " + v.field1);
		System.out.println("field2.field1: " + v.field2.field1);
		System.out.println("field3: " + v.field3);
		System.out.println("field4: " + v.field4);
	}

}
