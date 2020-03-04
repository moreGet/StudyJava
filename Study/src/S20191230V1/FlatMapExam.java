package S20191230V1;

import java.util.Arrays;
import java.util.List;

/**
 * @author dkdlw
 * flatMapXXX() 메소드는 중간처리 기능을 하는 매핑 메소드 이다.
 * 한 요소를 대체하는 복수개의 새로운 스트림을 리턴한다.
 * A와 B 라는 요소가 인자로 주어지면 A1, A2 / B1, B2 요소를 가지는 새로운 스트림이 생성된다.
 */
public class FlatMapExam {

	public static void main(String[] args) {
		List<String> inputList1 = Arrays.asList(
				"java8 lambda",
				"stream mapping"
				);
		
		inputList1.parallelStream() // 병렬 처리 스트림
		.flatMap(data -> Arrays.stream(data.split(" "))) // 공백을 기준으로 문자열 분리
		.forEach(System.out :: println); // 문자열 출력
		
		System.out.println();
		
		List<String> inputList2 = Arrays.asList("10, 20, 30, 40, 50, 60");
		inputList2.parallelStream() // 병렬처리 스트림
		.flatMapToInt(data -> { // 중간처리 맵핑 메소드 문자열 list를 정수형 스트림으로 반환 하기.
			String[] strArr = data.split(",");  // "," 마다 잘라서 문자열 배열에 넣기
			
			// strArr에 있는 문자열 요소들을 정수형으로 맵핑 하여 정수형 배열에 넣기 위해 같은 크기로 선언
			int[] intArr = new int[strArr.length]; 
			
			// for문으로 문자열 요소를 정수형 배열에 대입
			for (int i = 0; i < strArr.length; i++) {
				intArr[i] = Integer.parseInt(strArr[i].trim()); // trim() 공백제거
			}
			
			return Arrays.stream(intArr); // 완성된 정수형 배열을 스트림 형으로 반환시킴
		}).forEach(System.out :: println); // 출력.
	}
}