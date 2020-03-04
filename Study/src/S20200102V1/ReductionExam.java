package S20200102V1;

import java.util.Arrays;
import java.util.List;

public class ReductionExam {
	
	// Ŀ���� ����
	public static void main(String[] args) {
		List<Student> stuLists = Arrays.asList(
				new Student("ȫ", 92),
				new Student("��", 95),
				new Student("��", 88));
		
		int sum1 = stuLists.parallelStream()
				.mapToInt(Student :: getScore)
				.sum(); // sum �Լ�
		
		int sum2 = stuLists.parallelStream()
				.map(Student :: getScore)
				.reduce((a, b) -> a+b)
				.get(); // reduce�� Ŀ���� �Լ�
		
		int sum3 = stuLists.parallelStream()
				.map(Student :: getScore)
				.reduce(0, (a, b) -> a+b); // ���ڰ� �� defalt�� �߰�
		
		System.out.println("sum1 : " + sum1);
		System.out.println("sum2 : " + sum2);
		System.out.println("sum3 : " + sum3);
	}
}
