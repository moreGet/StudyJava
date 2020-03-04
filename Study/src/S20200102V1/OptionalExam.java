package S20200102V1;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<Integer>();
		
		// ���ܹ߻�
		// list�� ���� ���� ���� �ʱ� ������ ����� ���� ���� ����.
//		double avg = list.parallelStream()
//				.mapToInt(Integer :: intValue)
//				.average()
//				.getAsDouble();
		
		// ���1
		OptionalDouble opDouble = list.parallelStream()
				.mapToInt(Integer :: intValue)
				.average();
		if( opDouble.isPresent() ) {
			System.out.println("���1_��� : " + opDouble.getAsDouble());
		} else {
			System.out.println("���1_��հ��� ���� �� ������ : " + 0.0);
		}
				
		// ���2
		double avg = list.parallelStream()
				.mapToInt(Integer :: intValue)
				.average()
				.orElse(0.0);
		System.out.println("���2_��� : " + avg);
		
		// ���3
		list.parallelStream()
		.mapToInt(Integer :: intValue)
		.average()
		.ifPresent(s -> System.out.println("���3_��� : " + s));
	}
}
