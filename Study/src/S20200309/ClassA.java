package S20200309;

import java.io.Serializable;

public class ClassA implements Serializable{
	
	int field1;
	ClassB field2 = new ClassB(); // ����ȭ�� ����
	static int field3; // ����ȭ ����
	transient int field4; // ����ȭ ����
}
