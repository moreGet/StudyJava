package S20200106V1;

//| �������̽���             | �߻�޼ҵ�                       | ����                       |
//|--------------------------|----------------------------------|----------------------------|
//| Function<T, R>           | R apply(T t)                     | ��ü T�� ��ü R�� ����     |
//| BiFunction<T, U, R>      | R apply(T t, U u)                | ��ü T�� U�� ��ü R�� ���� |
//| DoubleFunction<R>        | R apply(double value)            | double�� ��ü R�� ����     |
//| IntFunction<R>           | R apply(int value)               | int�� ��ü R�� ����        |
//| IntToDoubleFunction      | double applyAsDouble(int value)  | int�� double�� ����        |
//| IntToLongFunction        | long applyAsLong(int value)      | int�� long���� ����        |
//| LongToDoubleFunction     | double applyAsDouble(long value) | long�� double�� ����       |
//| LongToIntFunction        | int applyAsInt(long value)       | long�� int�� ����          |
//| ToDoubleBiFunction<T, U> | double applyAsDouble(T t, U u)   | ��ü T�� U�� double�� ���� |
//| ToDoubleFunction<T>      | double applyAsDOuble(T t)        | ��ü T�� double�� ����     |
//| ToIntBiFunction<T, U>    | int applyAsInt(T t, U u)         | ��ü T�� U�� int�� ����    |
//| ToIntFunction<T>         | int applyAsInt(T t)              | ��ü T�� int�� ����        |
//| ToLongBiFunction<T, U>   | long applyAsLong(T t, U u)       | ��ü T�� U�� long���� ���� |
//| ToLOngFunction<T>        | long applyAsLong(T t)            | ��ü T�� long���� ����     |

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExam {

	private static List<Student> list = Arrays.asList(
			new Student("ȫ�浿", 90, 96),
			new Student("�ſ��", 95, 93));
	
	public static void printString( Function<Student, String> function ) {
		for (Student student : list) { // list�� ����� �׸�ŭ ���ν�Ŵ
			System.out.print(function.apply(student) + " "); // ���ٽ� ����
		}
		
		System.out.println();
	}
	
	public static void printInt( ToIntFunction<Student> function ) {
		for (Student student : list) { // List�� ����� �׸� ����ŭ ����
			System.out.print(function.applyAsInt(student) + " "); // ���ٽ� ����
		}
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.println("[�л� �̸�]");
		printString( t -> t.getName() );
		
		System.out.println("[���� ����]");
		printInt(t -> t.getEngScore());
		
		System.out.println("[���� ����]");
		printInt(t -> t.getMathScore());
	}
}