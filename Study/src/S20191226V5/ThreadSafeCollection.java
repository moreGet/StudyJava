package S20191226V5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import S20191226V2.Person;

public class ThreadSafeCollection {

	public static void main(String[] args) {
		// Vector, HashTable �� ThreadSafe �ϴ�.
		// ArrayList, HashSet, HashMap�� ThreadSafe �����ʴ�. ����,
		// �̸� ���� synchronizedXXX() �޼ҵ带 Ȱ���� threadSafe�ϰ� ����� �ش�.
		// �����ϰ� �ִ� �����尡 ���� �Ѵٸ� �ٸ� ������� ���� �����尡 �۾��� �Ϸ��ϱ� ������ ���� �� �� ����.
		
		// ������ ������ �� �÷��� List
		List<Person> list = Collections.synchronizedList(new ArrayList<Person>());
		list.add(new Person("��", 27));
		
		// ������ ������ �� �÷��� Set
		Set<Person> set = Collections.synchronizedSet(new HashSet<Person>());
		set.add(new Person("��", 27));
		
		// ������ ������ �� �÷��� Map
		Map<String, Integer> map = Collections.synchronizedMap(new HashMap<String, Integer>());
		map.put("��", 27);
	}
}