package S20200110Predicate;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

/*
 * Predicate������ �Լ��� �������̽��� and(), or(), negate() ����Ʈ �޼ҵ带 ������ �ִ�.
 * ��ΰ� �� ��밡���ϴ�.
 * �� �޼ҵ� ���� ���� ���������� &&, ||, !�� �����ȴٰ� �� �� �ִ�.
 */

//| �������̽���      | �߻� �޼ҵ�                | ����                   |
//|-------------------|----------------------------|------------------------|
//| Predicate<T>      | boolean test(T t)          | ��ü T�� ����          |
//| BiPredicate<T, U> | boolean test(T t, U u)     | ��ü T�� U�� �� ���� |
//| DoublePredicate   | boolean test(double value) | double ���� ����       |
//| IntPredicate      | boolean test(int value)    | int ���� ����          |
//| LongPredicate     | boolean test(long value)   | long ���� ����         |

public class PredicateAndOrNegateExam {

	public static void main(String[] args) {
		// 2�� ��� �˻�
		IntPredicate predicateA = a -> a%2==0; // ���ٽ� 2�ǹ�� ����
		
		// 3�� ��� �˻�
		IntPredicate predicateB = a -> a%3==0; // ���ٽ� 3�ǹ�� ����
		
		IntPredicate predicateAB;
		boolean result; 
		
		// and()
		predicateAB = predicateA.and(predicateB);
		result = predicateAB.test(9);
		System.out.println("9�� 2�� 3�� ��� �Դϱ�? " + result);
		
		// or()
		predicateAB = predicateA.or(predicateB);
		result = predicateAB.test(9);
		System.out.println("9�� 2�Ǵ� 3�� ����Դϱ�? " + result);
		
		// negate()
		predicateAB = predicateA.negate();
		result = predicateAB.test(9);
		System.out.println("9�� Ȧ���Դϱ�? " + result);
		
		// equals(static)
		Predicate<String> predicate;
		
		predicate = Predicate.isEqual(null);
		System.out.println("null, null : " + predicate.test(null));
		
		predicate = Predicate.isEqual("Java");
		System.out.println("Java, null : " + predicate.test(null));
	}
}