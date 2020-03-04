package S20200124ElemGrouping;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import S20200123CustomCollect.Student;

//| ���� Ÿ��                                  | Collectors�� ���� �޼ҵ�                                                                                          | ����                                                                           |
//|--------------------------------------------|-------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------|
//| Collector<T, ?, Map<K, List<T>>>           | groupingBy(Function<T,K> classifier)                                                                              | T�� K�� �����ϰ� KŰ�� �����<br> List�� T�� ������ Map ����                   |
//| Collector<T, ?, ConcurrentMap<K, List<T>>> | groupingByConcurrent(Function<T,K> classifier)                                                                    | ���� ����                                                                      |
//| Collector<T, ?, Map<K, D>>                 | groupingBy(Function<T,K> classifier, <br>Collector<T,A,D> collector)                                              | T�� K�� �����ϰ� KŰ�� ����� D��ü�� T�� ������ Map ����                      |
//| Collector<T, ?, ConcueerntMap<K, D>>       | groupingByConcurrent(Function<T,K> classifier, <br>Collector<T,A,D> collector)                                    | ���� ����                                                                      |
//| Collector<T, ?, Map<K, D>>                 | groupingBy(Function<T,K> classifier, <br>Supplier<Map<K,D>> mapFactory, <br>Collector<T,A,D> collector)           | T�� K�� �����ϰ� Supplier�� �����ϴ�<br> Map���� KŰ�� ����� D��ü�� T�� ���� |
//| Collector<T, ?, ConcurrentMap<K, D>>       | groupingByConcurrent(Function<T,K> classifier, <br>Supplier<Map<K,D>> mapFactory, <br>Collector<T,A,D> collector) | ���� ����                                                                      |

public class GroupingByExam {

	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("ȫ�浿", 10, Student.Sex.MALE, Student.City.Seoul),
				new Student("�����", 6, Student.Sex.FEMALE, Student.City.Busan),
				new Student("�ſ��", 10, Student.Sex.MALE, Student.City.Busan),
				new Student("�ڼ���", 6, Student.Sex.FEMALE, Student.City.Seoul));
		
		// Map�� Key���� ����, Value���� Student List�� Key���� ������ ������ �׷����Ѵ�.
		Map<Student.Sex, List<Student>> mapBySex = totalList.stream()
				.collect(Collectors.groupingBy(Student :: getSex));
		
		System.out.print("[���л�] ");
		mapBySex.get(Student.Sex.MALE).stream()
		.forEach(s -> System.out.print(s.getName() + " "));
		
		System.out.print("\n[���л�] ");
		mapBySex.get(Student.Sex.FEMALE).stream()
		.forEach(s -> System.out.print(s.getName() + " "));
		
		System.out.println();
		
		// Map�� Key���� ����, Value���� Student List�� Key���� ������ ���÷� �׷����Ѵ�.
		Map<Student.City, List<Student>> mapByCity = totalList.stream()
				.collect(Collectors.groupingBy(Student :: getCity));
		
		System.out.print("\n[����] ");
		 mapByCity.get(Student.City.Seoul).stream()
		 .forEach(s -> System.out.print(s.getName() + " "));
		 
		System.out.print("\n[�λ�] ");
		mapByCity.get(Student.City.Busan).stream()
		.forEach(s -> System.out.print(s.getName() + " "));
	}
}