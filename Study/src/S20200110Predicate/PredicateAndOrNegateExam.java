package S20200110Predicate;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

/*
 * Predicate종류의 함수적 인터페이스는 and(), or(), negate() 디폴트 메소드를 가지고 있다.
 * 모두가 다 사용가능하다.
 * 이 메소드 들은 각각 논리연산자인 &&, ||, !과 대응된다고 볼 수 있다.
 */

//| 인터페이스명      | 추상 메소드                | 설명                   |
//|-------------------|----------------------------|------------------------|
//| Predicate<T>      | boolean test(T t)          | 객체 T를 조사          |
//| BiPredicate<T, U> | boolean test(T t, U u)     | 객체 T와 U를 비교 조사 |
//| DoublePredicate   | boolean test(double value) | double 값을 조사       |
//| IntPredicate      | boolean test(int value)    | int 값을 조사          |
//| LongPredicate     | boolean test(long value)   | long 값을 조사         |

public class PredicateAndOrNegateExam {

	public static void main(String[] args) {
		// 2의 배수 검사
		IntPredicate predicateA = a -> a%2==0; // 람다식 2의배수 구현
		
		// 3의 배수 검사
		IntPredicate predicateB = a -> a%3==0; // 람다식 3의배수 구현
		
		IntPredicate predicateAB;
		boolean result; 
		
		// and()
		predicateAB = predicateA.and(predicateB);
		result = predicateAB.test(9);
		System.out.println("9는 2와 3의 배수 입니까? " + result);
		
		// or()
		predicateAB = predicateA.or(predicateB);
		result = predicateAB.test(9);
		System.out.println("9는 2또는 3의 배수입니까? " + result);
		
		// negate()
		predicateAB = predicateA.negate();
		result = predicateAB.test(9);
		System.out.println("9는 홀수입니까? " + result);
		
		// equals(static)
		Predicate<String> predicate;
		
		predicate = Predicate.isEqual(null);
		System.out.println("null, null : " + predicate.test(null));
		
		predicate = Predicate.isEqual("Java");
		System.out.println("Java, null : " + predicate.test(null));
	}
}