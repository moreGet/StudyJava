package S20191227V2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressionsExam {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("신", 93),
				new Student("김", 96)
		);
		
		// Stream 을 이용한 list 출력
		Stream<Student> stream = list.stream();
		stream.forEach(s -> {
			String name = s.getName();
			int code = s.getCode();
			
			System.out.println(name + " " + code);
		});
	}
}