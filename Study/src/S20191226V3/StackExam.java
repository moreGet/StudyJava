package S20191226V3;

import java.util.Stack;

public class StackExam {

	public static void main(String[] args) {
		Stack<Coin> pocketCoin = new Stack<Coin>();
		
		for (int i = 10; i <= 100; i+=10) {
			
			pocketCoin.add(new Coin(i));
			System.out.println("���� ���� : " + pocketCoin.size());
		}
		
		// Stack pop() Lifo ����
		// �������� ���� �� ó�� ���´�.
		while (!pocketCoin.isEmpty()) {
			
			//pop() �� ��Ҹ� �����⸸ �Ѵ�.
			//peek() �� ��Ҹ� ������ �����Ѵ�.
			Coin coinTemp = pocketCoin.pop();
			System.out.println(coinTemp.getValue());
		}
	}
}