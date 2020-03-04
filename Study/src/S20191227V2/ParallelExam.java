package S20191227V2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list = Arrays.asList(
				new Student("±è", 30),
				new Student("½Å", 27),
				new Student("±è", 30),
				new Student("½Å", 27),
				new Student("±è", 30),
				new Student("½Å", 27),
				new Student("±è", 30),
				new Student("½Å", 27)
		);
		
		// Ã³¸®
		Stream<Student> stream = list.stream();	
		stream.forEach(ParallelExam::print);
		
		System.out.println();
		
		// º´·ÄÃ³¸®
		Stream<Student> parellelStream = list.parallelStream();
		parellelStream.forEach(ParallelExam::print);
	}
	
	public static void print(Student temp) {
		String name = temp.getName();
		int code = temp.getCode();
		
		System.out.println(name + " " + Thread.currentThread().getName());
	}
}