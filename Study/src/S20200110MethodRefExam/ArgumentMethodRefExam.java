package S20200110MethodRefExam;

import java.util.function.ToIntBiFunction;

public class ArgumentMethodRefExam {

	public static void main(String[] args) {
		ToIntBiFunction<String, String> function;
		
		function = (a, b) -> a.compareToIgnoreCase(b); // innoreCase는 대소문자 구별없이 비교한다.
		print(function.applyAsInt("Java8", "JAVA8"));
		
		function = String :: compareToIgnoreCase; // 인스턴스 메소드 호출
		// 사전상 순서로 a가 b보다 먼저오면 음수, 아니면 양수, 동일하다면 0을 리턴시킨다.
		print(function.applyAsInt("Java8", "JAVA8"));
	}
	
	public static void print(int order) {
		if( order<0 ) { System.out.println("사전순으로 먼저 옵니다."); }
		else if( order==0 ) { System.out.println("동일한 문자열입니다."); }
		else { System.out.println("사전순으로 나중에 옵니다."); }
	}
}
