package S20191230V1;

import java.util.Arrays;
import java.util.List;

/**
 * @author dkdlw
 * 필터링은 중간 처리 기능이다. 요소를 걸러낸다.
 * distinct()는 oldValue.equels(newValue) 로 true 이면 제거
 * filter()는 인자값 Predicate가 true를 리턴하는 요소만 필터링 한다.  
 */

public class FilteringExam {
	
	public static void main(String[] args) {
		List<String> names = Arrays.asList(
				"홍길동",
				"신용권",
				"감자바",
				"신용권",
				"신민철");
		
		names.parallelStream()
		.distinct() // 중복 제거
		.forEach(System.out :: println);
		
		System.out.println();
		
		names.parallelStream()
		.filter(n -> n.startsWith("신")) // 첫 글자가 "신" 인것 걸러옴
		.forEach( System.out :: println );
		
		System.out.println();
		
		// 다중 필터
		names.parallelStream()
		.distinct() // 중복제거
		.filter( n -> n.startsWith("신") ) // 신인것만 가져옴
		.forEach( System.out :: println );
	}
}