package S20200106V1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//| 인터페이스명      | 추상 메소드                | 설명                   |
//|-------------------|----------------------------|------------------------|
//| Predicate<T>      | boolean test(T t)          | 객체 T를 조사          |
//| BiPredicate<T, U> | boolean test(T t, U u)     | 객체 T와 U를 비교 조사 |
//| DoublePredicate   | boolean test(double value) | double 값을 조사       |
//| IntPredicate      | boolean test(int value)    | int 값을 조사          |
//| LongPredicate     | boolean test(long value)   | long 값을 조사         |

public class PredicateExam {	
	
	private static List<Student2> list = Arrays.asList(
			new Student2("홍길동", "남자", 90),
			new Student2("김순희", "여자", 90),
			new Student2("감자바", "남자", 95),
			new Student2("박한다", "여자", 92));
	
	public static double avg( Predicate<Student2> predicate ) {
		int count = 0, sum = 0;
		
		for (Student2 student2 : list) {
			// 밑에 람다식으로 구현된 메소드를 이용해 
			// student2 의 getSex메소드를 이용해 남자 일경우 true반환
			if (predicate.test(student2)) {  // true 이면
				count++; // 카운트 세고
				sum += student2.getScore(); // score 를 받아옴
			}
		}
		
		return (double)sum/count; // 평균 계산
	}
	
	public static void main(String[] args) {
		// Predicate 를 람다식으로 구현함. 매개변수, 리턴값이 존재
		double maleAvg = avg( t -> t.getSex().equals("남자") );
		System.out.println("남자 평균 점수 : " + maleAvg);
		
		double feMaleAvg = avg( t -> t.getSex().equals("여자") );
		System.out.println("여자 평균 점수 : " + feMaleAvg);
	}
}