package S20200102V1;

import java.util.Arrays;
import java.util.List;

public class ReductionExam {
	
	// 커스텀 집계
	public static void main(String[] args) {
		List<Student> stuLists = Arrays.asList(
				new Student("홍", 92),
				new Student("김", 95),
				new Student("신", 88));
		
		int sum1 = stuLists.parallelStream()
				.mapToInt(Student :: getScore)
				.sum(); // sum 함수
		
		int sum2 = stuLists.parallelStream()
				.map(Student :: getScore)
				.reduce((a, b) -> a+b)
				.get(); // reduce로 커스텀 함수
		
		int sum3 = stuLists.parallelStream()
				.map(Student :: getScore)
				.reduce(0, (a, b) -> a+b); // 인자값 중 defalt값 추가
		
		System.out.println("sum1 : " + sum1);
		System.out.println("sum2 : " + sum2);
		System.out.println("sum3 : " + sum3);
	}
}
