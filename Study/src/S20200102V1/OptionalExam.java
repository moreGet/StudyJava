package S20200102V1;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<Integer>();
		
		// 예외발생
		// list에 값이 존재 하지 않기 때문에 평균을 구할 수가 없다.
//		double avg = list.parallelStream()
//				.mapToInt(Integer :: intValue)
//				.average()
//				.getAsDouble();
		
		// 방법1
		OptionalDouble opDouble = list.parallelStream()
				.mapToInt(Integer :: intValue)
				.average();
		if( opDouble.isPresent() ) {
			System.out.println("방법1_평균 : " + opDouble.getAsDouble());
		} else {
			System.out.println("방법1_평균값을 구할 수 없을때 : " + 0.0);
		}
				
		// 방법2
		double avg = list.parallelStream()
				.mapToInt(Integer :: intValue)
				.average()
				.orElse(0.0);
		System.out.println("방법2_평균 : " + avg);
		
		// 방법3
		list.parallelStream()
		.mapToInt(Integer :: intValue)
		.average()
		.ifPresent(s -> System.out.println("방법3_평균 : " + s));
	}
}
