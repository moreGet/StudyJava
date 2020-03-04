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
		// Vector, HashTable 은 ThreadSafe 하다.
		// ArrayList, HashSet, HashMap은 ThreadSafe 하지않다. 따라서,
		// 이를 위해 synchronizedXXX() 메소드를 활용해 threadSafe하게 만들어 준다.
		// 점유하고 있는 스레드가 존재 한다면 다른 스레드는 점유 스레드가 작업을 완료하기 전까지 점유 할 수 없다.
		
		// 쓰레드 세이프 한 컬렉션 List
		List<Person> list = Collections.synchronizedList(new ArrayList<Person>());
		list.add(new Person("신", 27));
		
		// 쓰레드 세이프 한 컬렉션 Set
		Set<Person> set = Collections.synchronizedSet(new HashSet<Person>());
		set.add(new Person("신", 27));
		
		// 쓰레드 세이프 한 컬렉션 Map
		Map<String, Integer> map = Collections.synchronizedMap(new HashMap<String, Integer>());
		map.put("신", 27);
	}
}