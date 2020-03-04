package S20200106V1;

//| 인터페이스명             | 추상메소드                       | 설명                       |
//|--------------------------|----------------------------------|----------------------------|
//| Function<T, R>           | R apply(T t)                     | 객체 T를 객체 R로 매핑     |
//| BiFunction<T, U, R>      | R apply(T t, U u)                | 객체 T와 U를 객체 R로 매핑 |
//| DoubleFunction<R>        | R apply(double value)            | double를 객체 R로 매핑     |
//| IntFunction<R>           | R apply(int value)               | int를 객체 R로 매핑        |
//| IntToDoubleFunction      | double applyAsDouble(int value)  | int를 double로 매핑        |
//| IntToLongFunction        | long applyAsLong(int value)      | int를 long으로 매핑        |
//| LongToDoubleFunction     | double applyAsDouble(long value) | long을 double로 매핑       |
//| LongToIntFunction        | int applyAsInt(long value)       | long을 int로 매핑          |
//| ToDoubleBiFunction<T, U> | double applyAsDouble(T t, U u)   | 객체 T와 U를 double로 매핑 |
//| ToDoubleFunction<T>      | double applyAsDOuble(T t)        | 객체 T를 double로 매핑     |
//| ToIntBiFunction<T, U>    | int applyAsInt(T t, U u)         | 객체 T와 U를 int로 매핑    |
//| ToIntFunction<T>         | int applyAsInt(T t)              | 객체 T를 int로 매핑        |
//| ToLongBiFunction<T, U>   | long applyAsLong(T t, U u)       | 객체 T와 U를 long으로 매핑 |
//| ToLOngFunction<T>        | long applyAsLong(T t)            | 객체 T를 long으로 매핑     |

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExam {

	private static List<Student> list = Arrays.asList(
			new Student("홍길동", 90, 96),
			new Student("신용권", 95, 93));
	
	public static void printString( Function<Student, String> function ) {
		for (Student student : list) { // list에 저장된 항목만큼 루핑시킴
			System.out.print(function.apply(student) + " "); // 람다식 실행
		}
		
		System.out.println();
	}
	
	public static void printInt( ToIntFunction<Student> function ) {
		for (Student student : list) { // List에 저장된 항목 수만큼 루핑
			System.out.print(function.applyAsInt(student) + " "); // 람다식 실행
		}
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.println("[학생 이름]");
		printString( t -> t.getName() );
		
		System.out.println("[영어 점수]");
		printInt(t -> t.getEngScore());
		
		System.out.println("[수학 점수]");
		printInt(t -> t.getMathScore());
	}
}