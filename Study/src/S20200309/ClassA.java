package S20200309;

import java.io.Serializable;

public class ClassA implements Serializable{
	
	int field1;
	ClassB field2 = new ClassB(); // 직렬화에 포함
	static int field3; // 직렬화 제외
	transient int field4; // 직렬화 제외
}
