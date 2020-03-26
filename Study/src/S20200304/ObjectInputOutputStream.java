package S20200304;

/*
 * Object ��ü�� ������ �ʵ��� �ڷ��� ������� �ٽ� �о�� �Ѵ�.
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputOutputStream {
	
	public static void main(String[] args) throws Exception {
		String path = "C:\\Temp\\obj.dat";
		
		FileOutputStream fos = new FileOutputStream(path);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(new Integer(10));
		oos.writeObject(new String("ȫ�浿"));
		
		oos.flush(); oos.close(); fos.close();
		
		FileInputStream fis = new FileInputStream(path);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Integer obj1 = (Integer) ois.readObject();
		String obj2 = (String) ois.readObject();
		
		ois.close(); fis.close();
		
		System.out.println(obj1);
		System.out.println(obj2);
	}
}
