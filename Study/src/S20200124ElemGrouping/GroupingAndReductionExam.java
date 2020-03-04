package S20200124ElemGrouping;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import S20200123CustomCollect.Student;

//| ���� Ÿ��                          | �޼ҵ�(�Ű� ����)                                                                             | ����                                                    |
//|------------------------------------|-----------------------------------------------------------------------------------------------|---------------------------------------------------------|
//| Collector<T, ?, R>                 | mapping(Function<T,U> mapper, Collector<U,A,R> collector)                                     | T�� U�� ������ ��, U�� R�� ����                         |
//| Collector<T, ?, Double>            | averagingDouble(ToDouleFunction<T> mapper)                                                    | T�� Double�� ������ ��, Double�� ��հ��� ����          |
//| Collector<T, ?, Long>              | counting()                                                                                    | T�� ī���� ���� ����                                    |
//| Collector<CharSequence, ?, String> | joining(CharSequence delimiter)                                                               | CharSequecne�� ������(delimiter)�� ������ String�� ���� |
//| Collector<T, ?, Optional<T>>       | maxBy(Comparator<T> comparator)                                                               | Comparator�� �̿��ؼ� �ִ� T�� ����                     |
//| Collector<T, ?, Optional<T>>       | minBy(Comparator<T> comparator)                                                               | Comparator�� �̿��ؼ� �ּ� T�� ����                     |
//| Collector<T, ?, Integer>           | summingInt(ToIntFunction)<br> summingLong(ToLongFunction)<br> summingDouble(ToDoubleFunction) | Int, Long, Double Ÿ���� �հ� ����                      |

public class GroupingAndReductionExam {

	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("ȫ�浿", 10, Student.Sex.MALE),
				new Student("�����", 6, Student.Sex.FEMALE),
				new Student("�ſ��", 10, Student.Sex.MALE),
				new Student("�ڼ���", 6, Student.Sex.FEMALE));

		// ������ ��� ������ �����ϴ� Map ���
		Map<Student.Sex, Double> mapBySex = totalList.stream()
				.collect(Collectors.groupingBy(
						Student :: getSex, 
						Collectors.averagingDouble(Student :: getScore)));
		
		System.out.println("���л� ��� ���� : " + mapBySex.get(Student.Sex.MALE));
		System.out.println("���л� ��� ���� : " + mapBySex.get(Student.Sex.FEMALE));
		
		// ������ ��ǥ�� ������ �̸��� �����ϴ� Map ���
		Map<Student.Sex, String> mapByName = totalList.stream()
				.collect(Collectors.groupingBy(
						Student :: getSex,
						Collectors.mapping(Student :: getName, Collectors.joining(","))));
		
		System.out.println("���л� ��ü �̸� : " + mapByName.get(Student.Sex.MALE));
		System.out.println("���л� ��ü �̸� : " + mapByName.get(Student.Sex.FEMALE));
	}

}
