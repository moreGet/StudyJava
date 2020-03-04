package S20200106V1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//| �������̽���      | �߻� �޼ҵ�                | ����                   |
//|-------------------|----------------------------|------------------------|
//| Predicate<T>      | boolean test(T t)          | ��ü T�� ����          |
//| BiPredicate<T, U> | boolean test(T t, U u)     | ��ü T�� U�� �� ���� |
//| DoublePredicate   | boolean test(double value) | double ���� ����       |
//| IntPredicate      | boolean test(int value)    | int ���� ����          |
//| LongPredicate     | boolean test(long value)   | long ���� ����         |

public class PredicateExam {	
	
	private static List<Student2> list = Arrays.asList(
			new Student2("ȫ�浿", "����", 90),
			new Student2("�����", "����", 90),
			new Student2("���ڹ�", "����", 95),
			new Student2("���Ѵ�", "����", 92));
	
	public static double avg( Predicate<Student2> predicate ) {
		int count = 0, sum = 0;
		
		for (Student2 student2 : list) {
			// �ؿ� ���ٽ����� ������ �޼ҵ带 �̿��� 
			// student2 �� getSex�޼ҵ带 �̿��� ���� �ϰ�� true��ȯ
			if (predicate.test(student2)) {  // true �̸�
				count++; // ī��Ʈ ����
				sum += student2.getScore(); // score �� �޾ƿ�
			}
		}
		
		return (double)sum/count; // ��� ���
	}
	
	public static void main(String[] args) {
		// Predicate �� ���ٽ����� ������. �Ű�����, ���ϰ��� ����
		double maleAvg = avg( t -> t.getSex().equals("����") );
		System.out.println("���� ��� ���� : " + maleAvg);
		
		double feMaleAvg = avg( t -> t.getSex().equals("����") );
		System.out.println("���� ��� ���� : " + feMaleAvg);
	}
}