package S20191230V1;

import java.util.Arrays;
import java.util.List;

public class MapExam {

	public static void main(String[] args) {
		List<Student> stuList = Arrays.asList(
				new Student("홍길동", 10),
				new Student("신용권", 20),
				new Student("유미선", 30));
		
		stuList.parallelStream() // stu 객체 스트림 받아옴
		.mapToInt(Student :: getCode) // Student 클래스 내에 getCode 함수로 code값 리턴 받음
		.forEach(System.out :: println); // 출력 시킴
	}
}
