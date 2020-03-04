package S20200110MethodRefExam;

import java.util.function.IntBinaryOperator;

public class MethodRefExam {

	// 정적 메소드는 클래스 :: 메소드
	// 인스턴스 메소드는 참조변수 :: 메소드
	public static void main(String[] args) {
		IntBinaryOperator operator;
		
		// 정적 메소드 참조
		operator = (x, y) -> Calculator.staticMethod(x, y);
		System.out.println("결과1 : " + operator.applyAsInt(1, 2));
		
		operator = Calculator :: staticMethod;
		System.out.println("결과2 : " + operator.applyAsInt(3, 4));
		
		// 인스턴스 메소드 참조
		Calculator obj = new Calculator();
		operator =(x, y) -> obj.instanceMethod(x, y);
		System.out.println("결과3 : " + operator.applyAsInt(5, 6));
		
		operator = obj :: instanceMethod;
		System.out.println("결과4 : " + operator.applyAsInt(7, 8));
	}
}