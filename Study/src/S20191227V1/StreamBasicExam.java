package S20191227V1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamBasicExam {

	//Stream은 java8부터 추가된 컬렉션 요소를 하나씩 참조해서 람다식으로 처리할 수 있도록 해준다.
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("강");
		list.add("신");
		list.add("김");
		
		//for-each 이용
		System.out.println("for-each");
		for (String string : list) {
			System.out.println(string);
		}
		
		System.out.println();
		
		//Iterator 이용
		Iterator<String> it = list.iterator();
		System.out.println("Iterator");
		while (it.hasNext()) {
			String string = (String) it.next();
			System.out.println(string);
		}
		
		System.out.println();
		
		//stream 이용
		System.out.println("Stream");
		Stream<String> stream = list.stream();
		stream.forEach(name -> System.out.println(name));
	}
}