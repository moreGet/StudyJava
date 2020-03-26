package S20200309;

/*
 * �ڹٴ� Serializable �������̽��� ������ Ŭ������ ����ȭ�� �� �ֵ��� �����ϰ� �ִ�.
 * Serializable �������̽��� �ʵ峪 �޼ҵ尡 ���� �� �������̽� ������
 * ��ü�� ����ȭ �Ҷ� private �ʵ带 ������ ��� �ʵ带 ����Ʈ�� ��ȯ�ص� ���ٴ� ǥ�� ������ �Ѵ�.
 * ��ü�� ����ȭ�ϸ� ����Ʈ�� ��ȯ�Ǵ� ���� �ʵ���̰�, ������ �� �޼ҵ�� ����ȭ�� ���Ե��� �ʴ´�.
 * ���� ������ȭ�� ������ �ʵ��� ���� �����ȴ�.
 * ���� �ʵ忡 static�Ǵ� trnsient�� �پ� ���� ��쿡�� ����ȭ�� ���� �ʴ´�. 
 */

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializableWriter {

	public static void main(String[] args) throws Exception {
		String path = "C:\\Temp\\Obj.data";
		FileOutputStream fos = new FileOutputStream(path);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		ClassA classA = new ClassA();
		classA.field1 = 1;
		classA.field2.field1 = 2;
		classA.field3 = 3;
		classA.field4 = 4;
		oos.writeObject(classA);
		oos.flush(); oos.close(); fos.close();
	}
}
