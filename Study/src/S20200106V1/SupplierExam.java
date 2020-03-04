package S20200106V1;

import java.util.function.IntSupplier;

//| 인터페이스명         | 추상 메소드                    | 설명                           |
//|----------------------|--------------------------------|--------------------------------|
//| Supplier<T>          | T.get()                        | T 객체를 리턴                  |
//| BooleanSupplier      | boolean getAsBoolean()         | boolean 값을 리턴              |
//| DoubleSupplier       | double getAsDouble()           | double 값을 리턴               |
//| IntSupplier          | int getAsInt()                 | int 값을 리턴                  |
//| LongSupplier         | long getAsLong()               | long 값을 리턴                 |

public class SupplierExam {
	
	public static void main(String[] args) {
		IntSupplier intSupplier = () -> {
			int num = (int) (Math.random() * 6) + 1;
			return num;
		}; // 람다식
		
		int num = intSupplier.getAsInt();
		System.out.println("눈의 수 : " + num);
	}
}