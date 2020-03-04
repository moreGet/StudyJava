package S20191230V1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortingExam {

	// Sorted() 메소드 이용 하여 정렬하기
	// 객체 요소 일 경우 클래스가 Comparable를 구현하고 있어야 한다.
	public static void main(String[] args) {
		IntStream intStream = Arrays.stream(new int[] {5, 3, 2, 1, 4});
		intStream
		.sorted()
		.forEach(System.out :: print);

		System.out.println();
		
		// 객체요소
		List<Student2> stuLists = Arrays.asList( // Stu객체 리스트 반환
				new Student2("홍길동", 30),
				new Student2("신용권", 10),
				new Student2("유미선", 20));
		
		stuLists.stream() // 스트림 받아옴
		.sorted() // score 기준으로 오름차순 정렬
		.forEach(s -> System.out.print(s.getScore() + ",")); // 출력
		System.out.println();
		
		stuLists.stream()
		.sorted(Comparator.reverseOrder()) // score기준으로 내림차순 정렬(객체를 정렬시킴)
		.forEach(s -> System.out.print(s.getScore() + ","));
	}
}