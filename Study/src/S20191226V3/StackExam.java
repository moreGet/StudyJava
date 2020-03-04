package S20191226V3;

import java.util.Stack;

public class StackExam {

	public static void main(String[] args) {
		Stack<Coin> pocketCoin = new Stack<Coin>();
		
		for (int i = 10; i <= 100; i+=10) {
			
			pocketCoin.add(new Coin(i));
			System.out.println("동전 갯수 : " + pocketCoin.size());
		}
		
		// Stack pop() Lifo 구조
		// 마지막에 들어간게 맨 처음 나온다.
		while (!pocketCoin.isEmpty()) {
			
			//pop() 은 요소를 꺼내기만 한다.
			//peek() 는 요소를 꺼낸후 삭제한다.
			Coin coinTemp = pocketCoin.pop();
			System.out.println(coinTemp.getValue());
		}
	}
}