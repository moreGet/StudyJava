package S20200110MethodRefExam;

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

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorRefExam {

	public static void main(String[] args) {
		Function<String, Member> function1 = Member :: new; // ������ ����
		Member member = function1.apply("angel"); // �Ű��� 1��
		
		BiFunction<String, String, Member> function2 = Member :: new; // ������ ����
		Member member2 = function2.apply("��õ��", "angel"); // �Ű� �� 2��
	}
}