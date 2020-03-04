package S20191227V3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FromCollectionExam {

	private static int sum = 0;
	
	// List 에서 컬렉션을 얻어내고 스트림 출력
	public static void main(String[] args) {
		// List Stream
		List<Person> perList = Arrays.asList(
				new Person("신", 25),
				new Person("김", 35));
		
		Stream<Person> stream = perList.parallelStream();
		System.out.println("List Stream");
		stream.forEach( 
				p -> System.out.println(p.getName() + " " + p.getAge()) 
		);
		
		System.out.println();
		
		// Array Stream
		System.out.println("Arrays Stream");
		System.out.println("String");
		String[] str = { "신", "김", "이" };
		Stream<String> strStream = Arrays.stream(str);
		strStream.forEach(s -> System.out.println(s));
		
		System.out.println();
		
		System.out.println("Integer");
		int[] intArr = { 1, 2, 3 };
		IntStream intStream = Arrays.stream(intArr);
		intStream.forEach(i -> System.out.println(i));
		
		System.out.println();
		
		System.out.println("Range Integer 1이상 ~ 100이하");
		IntStream intRangeStream = IntStream.rangeClosed(1, 100);
		
		// 1이상 ~ 101미만
		//IntStream intRangeStream = IntStream.range(1, 101);
		intRangeStream.forEach(s -> sum += s);
		System.out.println(sum);
	}
}
