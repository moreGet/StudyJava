package S20200106V1;

import java.util.function.IntBinaryOperator;

//	| �������̽���         | �߻� �޼ҵ�                           | ����                     |
//	|----------------------|---------------------------------------|--------------------------|
//	| BinaryOperator<T>    | BiFunction<T, U, R>�� ���� �������̽� | T�� U�� ������ �� R ���� |
//	| UnaryOperator<T>     | Function<T, R>�� ���� �������̽�      | T�� ������ �� R ����     |
//	| DoubleBinaryOperator | double applyAsDouble(double, double)  | �� ���� double ����      |
//	| DoubleUnaryOperator  | double applyAsDouble(double)          | �� ���� double ����      |
//	| IntBinaryOperator    | int applyAsInt(int, int)              | �� ���� int ����         |
//	| IntUnaryOperator     | int applyAsInt(int)                   | �� ���� int ����         |
//	| LongBinaryOperator   | long applyAsLong(long, long)          | �� ���� long ����        |
//	| LongUnaryOperator    | long applyAsLong(long)                | �� ���� long ����        |

public class OperatorExam {
	private static int[] scores = { 92, 95, 87 };
	
	public static int maxOrMin( IntBinaryOperator op ) {
		int result = scores[0];
		for (int i : scores) {
			result = op.applyAsInt(result, i); // ���� ��ü ���� �Լ��� �������̽� ������ �ȵǾ�����.
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		// �ִ� ���
		int max = maxOrMin((a, b) -> { // ���⼭ maxOrMin �޼ҵ忡 ���� �Ѱ��ְ�
			if(a>=b) return a; // ���⼭ applyAsInt �Լ��� ������
			else return b; // a�� b���� ���ϸ� b�� ����
		});
		System.out.println("�ִ� : " + max); // �ִ� ���ϱ�
		
		// �ּڰ� ���
		int min = maxOrMin((a, b) -> {
			if(a<=b) return a;
			else return b;
		});
		System.out.println("�ּڰ� : " + min);
	}
}