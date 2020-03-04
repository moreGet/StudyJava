package S20200110MethodRefExam;

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

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorRefExam {

	public static void main(String[] args) {
		Function<String, Member> function1 = Member :: new; // 생성자 참조
		Member member = function1.apply("angel"); // 매개값 1개
		
		BiFunction<String, String, Member> function2 = Member :: new; // 생성자 참조
		Member member2 = function2.apply("신천사", "angel"); // 매개 값 2개
	}
}