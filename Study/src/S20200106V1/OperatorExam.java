package S20200106V1;

import java.util.function.IntBinaryOperator;

//	| 인터페이스명         | 추상 메소드                           | 설명                     |
//	|----------------------|---------------------------------------|--------------------------|
//	| BinaryOperator<T>    | BiFunction<T, U, R>의 하위 인터페이스 | T와 U를 연산한 후 R 리턴 |
//	| UnaryOperator<T>     | Function<T, R>의 하위 인터페이스      | T를 연산한 후 R 리턴     |
//	| DoubleBinaryOperator | double applyAsDouble(double, double)  | 두 개의 double 연산      |
//	| DoubleUnaryOperator  | double applyAsDouble(double)          | 한 개의 double 연산      |
//	| IntBinaryOperator    | int applyAsInt(int, int)              | 두 개의 int 연산         |
//	| IntUnaryOperator     | int applyAsInt(int)                   | 한 개의 int 연산         |
//	| LongBinaryOperator   | long applyAsLong(long, long)          | 두 개의 long 연산        |
//	| LongUnaryOperator    | long applyAsLong(long)                | 한 개의 long 연산        |

public class OperatorExam {
	private static int[] scores = { 92, 95, 87 };
	
	public static int maxOrMin( IntBinaryOperator op ) {
		int result = scores[0];
		for (int i : scores) {
			result = op.applyAsInt(result, i); // 구현 객체 아직 함수적 인터페이스 구현이 안되어있음.
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		// 최댓값 얻기
		int max = maxOrMin((a, b) -> { // 여기서 maxOrMin 메소드에 값을 넘겨주고
			if(a>=b) return a; // 여기서 applyAsInt 함수를 구현함
			else return b; // a가 b보다 이하면 b를 리턴
		});
		System.out.println("최댓값 : " + max); // 최댓값 구하기
		
		// 최솟값 얻기
		int min = maxOrMin((a, b) -> {
			if(a<=b) return a;
			else return b;
		});
		System.out.println("최솟값 : " + min);
	}
}