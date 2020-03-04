package S20200102V2;

/*
 * 필터링한 요소를 수집하는 메소드
 * T는 요소, A는 누적기, R은 요소가 저장될 컬렉션
 * T요소를 A누적기가 R에 저장한다는 뜻.
 * Collector의 구현 객체는 다음과 같이 Collectors 클래스의 다양한 정적 메소드를 이용해서 얻을 수 있다.
 */

//| 리턴 타입                            | Collectors의 정적 메소드                                              | 설명                                                           |
//|--------------------------------------|-----------------------------------------------------------------------|----------------------------------------------------------------|
//| Collector<T, ?, List<T>>             | toList()                                                              | T를 List에 저장                                                |
//| Collector<T, ?, Set<T>>              | toSet()                                                               | T를 Set에 저장                                                 |
//| Collector<T, ?, Collection<T>>       | toCollection( Supplier<Collection<T>> )                               | T를 Supplier가 제공한<br>Collection에 저장                     |
//| Collector<T, ?, Map<K, U>>           | toMap(Function<T, K> keyMapper,Function<T, U> valueMapper)            | T를 K와 U로 매핑해서 K를 키로,<br> U를 값으로 Map에 저장       |
//| Collector<T, ?, ConcurrentMap<K, U>> | toConcurrentMap(Function<T, K> keyMapper, Function<T, U> valueMapper) | T를 K와 U로 매핑해서 K를 키로, U를 값으로 ConcurrentMap에 저장 |

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToListExam {
	// Collector 패키지들
	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("홍길동", 10, Student.Sex.MALE),
				new Student("김수애", 6, Student.Sex.FEMALE),
				new Student("신용권", 10, Student.Sex.MALE),
				new Student("박수미", 6, Student.Sex.FEMALE));
		
		//남학생들만 묶어 List 생성
		List<Student> maleList = totalList.parallelStream() // 병렬스트림 객체로 가져옴
				.filter(s -> s.getSex() == Student.Sex.MALE) // 남자면
				.collect(Collectors.toList()); // 필터링 된 값을 list객체로 리턴받음
		
		maleList.parallelStream() // 출력을 위해 병렬스트림 객체로 얻어옴
		.forEach(s -> System.out.println(s.getName())); // 출력
		
		System.out.println(); // 줄 개행
		
		// 여학생들만 묶어 HashSet 생성
		Set<Student> femaleSet = totalList.parallelStream() // 학생목록 을 병렬스트림 객체로 얻어옴
				.filter(s -> s.getSex() == Student.Sex.FEMALE) // 필터 성별이 여자이면
				.collect(Collectors.toCollection(HashSet :: new)); // HashSet으로 가져옴
		
		femaleSet.parallelStream() // Set객체를 다시 병렬스트림으로 가져옴
		.forEach(s -> System.out.println(s.getName())); // 출력해봄
	}
}