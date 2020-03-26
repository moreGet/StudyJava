package S20200309;

/*
 * 자바는 Serializable 인터페이스를 구현한 클래스만 직렬화할 수 있도록 제한하고 있다.
 * Serializable 인터페이스는 필드나 메소드가 없는 빈 인터페이스 이지만
 * 객체를 직렬화 할때 private 필드를 포함한 모든 필드를 바이트로 변환해도 좋다는 표시 역할을 한다.
 * 객체를 직렬화하면 바이트로 변환되는 것은 필드들이고, 생성자 및 메소드는 직렬화에 포함되지 않는다.
 * 따라서 역직렬화할 때에는 필드의 값만 복원된다.
 * 만약 필드에 static또는 trnsient가 붙어 있을 경우에는 직렬화가 되지 않는다. 
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
