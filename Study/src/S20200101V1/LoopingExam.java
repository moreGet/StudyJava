package S20200101V1;

import java.util.Arrays;

public class LoopingExam {

	// ���� peek(), forEach() �� �ִ�.
	// ���� �����Ѵٴ� ����� ���������� peek()�� �߰�ó�� �̰� forEach()�� ����ó�� �̹Ƿ�
	// ����ó�� �ܰ迡 ���� pook() ȣ���� sum()�̳� ����ó�� �޼ҵ尡 �� �����Ͽ��� �Ѵ�.
	// �ݴ�� forEach()�� ����ó�� �޼ҵ� �̱� ������ �Ŀ� �޼ҵ尡 ������ �ȵȴ�.
	public static void main(String[] args) {
		int[] intArr = {1, 2, 3, 4, 5};
		
		System.out.println("[peek()�� �������� ȣ���� ���]");
		Arrays.stream(intArr)
		.filter(a -> a%2 == 0)
		.peek(System.out :: println);
		
		System.out.println("[���� ó�� �޼ҵ带 �������� ȣ���� ���]");
		int total = Arrays.stream(intArr)
		.filter(a -> a%2 == 0)
		.peek(n -> System.out.println(n))
		.sum();
		System.out.println("���� : " + total);
		
		System.out.println("[forEach()�� �������� ȣ���� ���");
		Arrays.stream(intArr)
		.filter(a -> a%2==0)
		.forEach(System.out :: println);
	}
}
