package S20200106V1;

//- �ڹٿ��� �����Ǵ� ǥ�� API���� �� ���� �߻� �޼ҵ带 ������ �������̽����� ��� ���ٽ� �̿� ����
//- �ڹ�8���ʹ� ����ϰ� ���Ǵ� �Լ��� �������̽��� ǥ�� API ��Ű���� ����
//- �ڹ�8���� �߰��ǰų� ����� API���� �� �� ���� �������̽����� �Ű� Ÿ������ ���� ����Ѵ�.

//| ����      | Ư¡                                                                       | ����                           |
//|-----------|----------------------------------------------------------------------------|--------------------------------|
//| Consumer  | �Ű����� �ְ�, ���ϰ��� ����                                               | �Ű��� -> Consumer             |
//| Supplier  | �Ű����� ����, ���ϰ��� ����                                               | Supplier -> ���ϰ�             |
//| Function  | �Ű����� �ְ�, ���ϰ��� ����<br> �ַ� �Ű����� ���ϰ����� ����(Ÿ�� ��ȯ)  | �Ű��� -> Function -> ���ϰ�   |
//| Operator  | �Ű����� �ְ�, ���ϰ��� ����<br> �ַ� �Ű����� �����ϰ� ����� ����        | �Ű��� -> Operator -> ���ϰ�   |
//| Predicate | �Ű����� �ְ�, ���� Ÿ���� boolean<br> �Ű����� �����ؼ� true/false�� ���� | �Ű��� -> Predicate -> boolean |

//| �������̽���         | �߻� �޼ҵ�                    | ����                           |
//|----------------------|--------------------------------|--------------------------------|
//| Consumer<T>          | void accept(T t)               | ��ü T�� �޾� �Һ�             |
//| BiConsumer<T, U>     | void accept(T t, U u)          | ��ü T�� U�� �޾� �Һ�         |
//| DoubleConsumer       | void accept(double value)      | double ���� �޾� �Һ�          |
//| IntConsumer          | void accept(int value)         | int���� �޾� �Һ�              |
//| LongConsumer         | void accept(long value)        | long ���� �޾� �Һ�            |
//| ObjDoubleConsumer<T> | void accept(T t, double value) | ��ü T�� double ���� �޾� �Һ� |
//| ObjIntConsumer<T>    | void accept(T t, int value)    | ��ü T�� int ���� �޾� �Һ�    |
//| ObjLongConsumer<T>   | void accept(T t, long value)   | ��ü T�� long ���� �޾� �Һ�   |

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> consumer = str -> System.out.println(str + " 8");
		consumer.accept("Java"); // accept �Լ� ����
		
		BiConsumer<String, Integer> biConsumer = (str, num) -> System.out.println(str + " " + num);
		biConsumer.accept("Java", 8);
		
		DoubleConsumer doubleConsumer = d -> System.out.println("Java" + " " + d);
		doubleConsumer.accept(8.0);
		
		ObjIntConsumer<String> objIntConsumer = (t, i) -> System.out.println(t + " " + i);
		objIntConsumer.accept("Java", 8);
	}
}
