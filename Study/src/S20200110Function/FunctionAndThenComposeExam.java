package S20200110Function;

import java.util.function.Function;
import S20200110AndThen.Address;
import S20200110AndThen.Member;

/*
 * Function과 Operator 종류의 함수적 인터페이스는 먼저 실행한 함 수적 인터페이스의 결과를 다음 함수적 인터페이스의
 * 매개값으로 넘겨주고, 최종 처리 결과를 리턴한다.
 */
public class FunctionAndThenComposeExam {

	public static void main(String[] args) {
		Function<Member, Address> functionA; // A는 멤버와 어드레스 객체
		Function<Address, String> functionB; // B는 어드레스와 문자열 객체
		Function<Member, String> functionAB; // AB는 위 A와 B 두개를 Member와 문자열 객체로 받을 함수
		String city; // 문자열 반환값을 받을 변수

		functionA = m -> m.getAddress(); // A는 address를 리턴받게끔 인터페이스 구현
		functionB = a -> a.getCity(); // city를 리턴받게끔 인터페이스 구현

		functionAB = functionA.andThen(functionB); // A의 값을 B로 넘긴후 B에서 최종처리
		city = functionAB.apply(new Member("홍길동", "hong", new Address("한국", "서울"))); // A객체에서 address를 받았고 이를 받은 B는 city를 리턴함
		System.out.println("거주 도시 : " + city); // B에서 최종처리 한결과는 문자열로 city를 반환받음

		functionAB = functionB.compose(functionA); // A의 값을 B로 넘긴후 B에서 최종처리
		city = functionAB.apply(new Member("홍길동", "hong", new Address("한국", "서울"))); //
		System.out.println("거주 도시 : " + city);
		
		/*
		 * andThen은 A.andThen(B) 가 A -> B -> B 최종처리
		 * compose는 A.compose(B) 가 B -> A -> A 최종처리
		 * 서로 반대로 처리한다.
		 */
	}

}
