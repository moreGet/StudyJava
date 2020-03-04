package S20191229V1;

import java.util.Arrays;
import java.util.List;

public class StreamPipelineExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Member> list = Arrays.asList(
				new Member("김", Member.MALE, 24),
				new Member("박", Member.FEMALE, 26),
				new Member("이", Member.FEMALE, 32));
		
		double age = list.parallelStream()
				.filter(m -> m.getSex() == Member.FEMALE) // list에 성별이 여자인
				.mapToInt(Member :: getAge) // 멤버의 나이만 리턴 받아서
				.average() // 평균을 계산후
				.getAsDouble(); // Double 형태로 반환 받는다.
		
		System.out.println("여직원 평균 나이 : " + age);
		
		// 리턴 타입이 Stream 이라면 중간처리 메소드 이다.
		// 리턴 타입이 기본타입 혹은 OptionalXXX 라면 최종 처리 메소드 이다.
	}

}
