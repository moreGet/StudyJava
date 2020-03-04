package S20200102V2;

/*
 * ���͸��� ��Ҹ� �����ϴ� �޼ҵ�
 * T�� ���, A�� ������, R�� ��Ұ� ����� �÷���
 * T��Ҹ� A�����Ⱑ R�� �����Ѵٴ� ��.
 * Collector�� ���� ��ü�� ������ ���� Collectors Ŭ������ �پ��� ���� �޼ҵ带 �̿��ؼ� ���� �� �ִ�.
 */

//| ���� Ÿ��                            | Collectors�� ���� �޼ҵ�                                              | ����                                                           |
//|--------------------------------------|-----------------------------------------------------------------------|----------------------------------------------------------------|
//| Collector<T, ?, List<T>>             | toList()                                                              | T�� List�� ����                                                |
//| Collector<T, ?, Set<T>>              | toSet()                                                               | T�� Set�� ����                                                 |
//| Collector<T, ?, Collection<T>>       | toCollection( Supplier<Collection<T>> )                               | T�� Supplier�� ������<br>Collection�� ����                     |
//| Collector<T, ?, Map<K, U>>           | toMap(Function<T, K> keyMapper,Function<T, U> valueMapper)            | T�� K�� U�� �����ؼ� K�� Ű��,<br> U�� ������ Map�� ����       |
//| Collector<T, ?, ConcurrentMap<K, U>> | toConcurrentMap(Function<T, K> keyMapper, Function<T, U> valueMapper) | T�� K�� U�� �����ؼ� K�� Ű��, U�� ������ ConcurrentMap�� ���� |

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToListExam {
	// Collector ��Ű����
	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("ȫ�浿", 10, Student.Sex.MALE),
				new Student("�����", 6, Student.Sex.FEMALE),
				new Student("�ſ��", 10, Student.Sex.MALE),
				new Student("�ڼ���", 6, Student.Sex.FEMALE));
		
		//���л��鸸 ���� List ����
		List<Student> maleList = totalList.parallelStream() // ���Ľ�Ʈ�� ��ü�� ������
				.filter(s -> s.getSex() == Student.Sex.MALE) // ���ڸ�
				.collect(Collectors.toList()); // ���͸� �� ���� list��ü�� ���Ϲ���
		
		maleList.parallelStream() // ����� ���� ���Ľ�Ʈ�� ��ü�� ����
		.forEach(s -> System.out.println(s.getName())); // ���
		
		System.out.println(); // �� ����
		
		// ���л��鸸 ���� HashSet ����
		Set<Student> femaleSet = totalList.parallelStream() // �л���� �� ���Ľ�Ʈ�� ��ü�� ����
				.filter(s -> s.getSex() == Student.Sex.FEMALE) // ���� ������ �����̸�
				.collect(Collectors.toCollection(HashSet :: new)); // HashSet���� ������
		
		femaleSet.parallelStream() // Set��ü�� �ٽ� ���Ľ�Ʈ������ ������
		.forEach(s -> System.out.println(s.getName())); // ����غ�
	}
}