package S20200124ElemGrouping;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import S20200123CustomCollect.Student;

//| 리턴 타입                                  | Collectors의 정적 메소드                                                                                          | 설명                                                                           |
//|--------------------------------------------|-------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------|
//| Collector<T, ?, Map<K, List<T>>>           | groupingBy(Function<T,K> classifier)                                                                              | T를 K로 매핑하고 K키에 저장된<br> List에 T를 저장한 Map 생성                   |
//| Collector<T, ?, ConcurrentMap<K, List<T>>> | groupingByConcurrent(Function<T,K> classifier)                                                                    | 위와 같음                                                                      |
//| Collector<T, ?, Map<K, D>>                 | groupingBy(Function<T,K> classifier, <br>Collector<T,A,D> collector)                                              | T를 K로 매핑하고 K키에 저장된 D객체에 T를 누적한 Map 생성                      |
//| Collector<T, ?, ConcueerntMap<K, D>>       | groupingByConcurrent(Function<T,K> classifier, <br>Collector<T,A,D> collector)                                    | 위와 같음                                                                      |
//| Collector<T, ?, Map<K, D>>                 | groupingBy(Function<T,K> classifier, <br>Supplier<Map<K,D>> mapFactory, <br>Collector<T,A,D> collector)           | T를 K로 매핑하고 Supplier가 제공하는<br> Map에서 K키에 저장된 D객체에 T를 누적 |
//| Collector<T, ?, ConcurrentMap<K, D>>       | groupingByConcurrent(Function<T,K> classifier, <br>Supplier<Map<K,D>> mapFactory, <br>Collector<T,A,D> collector) | 위와 같음                                                                      |

public class GroupingByExam {

	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("홍길동", 10, Student.Sex.MALE, Student.City.Seoul),
				new Student("김수애", 6, Student.Sex.FEMALE, Student.City.Busan),
				new Student("신용권", 10, Student.Sex.MALE, Student.City.Busan),
				new Student("박수미", 6, Student.Sex.FEMALE, Student.City.Seoul));
		
		// Map에 Key값은 성별, Value값은 Student List로 Key값의 기준은 성별로 그룹핑한다.
		Map<Student.Sex, List<Student>> mapBySex = totalList.stream()
				.collect(Collectors.groupingBy(Student :: getSex));
		
		System.out.print("[남학생] ");
		mapBySex.get(Student.Sex.MALE).stream()
		.forEach(s -> System.out.print(s.getName() + " "));
		
		System.out.print("\n[여학생] ");
		mapBySex.get(Student.Sex.FEMALE).stream()
		.forEach(s -> System.out.print(s.getName() + " "));
		
		System.out.println();
		
		// Map에 Key값은 도시, Value값은 Student List로 Key값의 기준은 도시로 그룹핑한다.
		Map<Student.City, List<Student>> mapByCity = totalList.stream()
				.collect(Collectors.groupingBy(Student :: getCity));
		
		System.out.print("\n[서울] ");
		 mapByCity.get(Student.City.Seoul).stream()
		 .forEach(s -> System.out.print(s.getName() + " "));
		 
		System.out.print("\n[부산] ");
		mapByCity.get(Student.City.Busan).stream()
		.forEach(s -> System.out.print(s.getName() + " "));
	}
}