package S20200124ElemGrouping;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import S20200123CustomCollect.Student;

//| 리턴 타입                          | 메소드(매개 변수)                                                                             | 설명                                                    |
//|------------------------------------|-----------------------------------------------------------------------------------------------|---------------------------------------------------------|
//| Collector<T, ?, R>                 | mapping(Function<T,U> mapper, Collector<U,A,R> collector)                                     | T를 U로 매핑한 후, U를 R에 수집                         |
//| Collector<T, ?, Double>            | averagingDouble(ToDouleFunction<T> mapper)                                                    | T를 Double로 매핑한 후, Double의 평균값을 산출          |
//| Collector<T, ?, Long>              | counting()                                                                                    | T의 카운팅 수를 산출                                    |
//| Collector<CharSequence, ?, String> | joining(CharSequence delimiter)                                                               | CharSequecne를 구분자(delimiter)로 연결한 String를 산출 |
//| Collector<T, ?, Optional<T>>       | maxBy(Comparator<T> comparator)                                                               | Comparator를 이용해서 최대 T를 산출                     |
//| Collector<T, ?, Optional<T>>       | minBy(Comparator<T> comparator)                                                               | Comparator를 이용해서 최소 T를 산출                     |
//| Collector<T, ?, Integer>           | summingInt(ToIntFunction)<br> summingLong(ToLongFunction)<br> summingDouble(ToDoubleFunction) | Int, Long, Double 타입의 합계 산출                      |

public class GroupingAndReductionExam {

	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("홍길동", 10, Student.Sex.MALE),
				new Student("김수애", 6, Student.Sex.FEMALE),
				new Student("신용권", 10, Student.Sex.MALE),
				new Student("박수미", 6, Student.Sex.FEMALE));

		// 성별로 평균 점수를 저장하는 Map 얻기
		Map<Student.Sex, Double> mapBySex = totalList.stream()
				.collect(Collectors.groupingBy(
						Student :: getSex, 
						Collectors.averagingDouble(Student :: getScore)));
		
		System.out.println("남학생 평균 점수 : " + mapBySex.get(Student.Sex.MALE));
		System.out.println("여학생 평균 점수 : " + mapBySex.get(Student.Sex.FEMALE));
		
		// 성별을 쉼표로 구분한 이름을 저장하는 Map 얻기
		Map<Student.Sex, String> mapByName = totalList.stream()
				.collect(Collectors.groupingBy(
						Student :: getSex,
						Collectors.mapping(Student :: getName, Collectors.joining(","))));
		
		System.out.println("남학생 전체 이름 : " + mapByName.get(Student.Sex.MALE));
		System.out.println("여학생 전체 이름 : " + mapByName.get(Student.Sex.FEMALE));
	}

}
