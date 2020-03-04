package S20191227V2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressionsExam {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("��", 93),
				new Student("��", 96)
		);
		
		// Stream �� �̿��� list ���
		Stream<Student> stream = list.stream();
		stream.forEach(s -> {
			String name = s.getName();
			int code = s.getCode();
			
			System.out.println(name + " " + code);
		});
	}
}