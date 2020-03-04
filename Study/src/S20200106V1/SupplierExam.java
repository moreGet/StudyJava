package S20200106V1;

import java.util.function.IntSupplier;

//| �������̽���         | �߻� �޼ҵ�                    | ����                           |
//|----------------------|--------------------------------|--------------------------------|
//| Supplier<T>          | T.get()                        | T ��ü�� ����                  |
//| BooleanSupplier      | boolean getAsBoolean()         | boolean ���� ����              |
//| DoubleSupplier       | double getAsDouble()           | double ���� ����               |
//| IntSupplier          | int getAsInt()                 | int ���� ����                  |
//| LongSupplier         | long getAsLong()               | long ���� ����                 |

public class SupplierExam {
	
	public static void main(String[] args) {
		IntSupplier intSupplier = () -> {
			int num = (int) (Math.random() * 6) + 1;
			return num;
		}; // ���ٽ�
		
		int num = intSupplier.getAsInt();
		System.out.println("���� �� : " + num);
	}
}