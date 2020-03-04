package S20200101V1;

import java.util.Arrays;

public class LoopingExam {

	// 루핑 peek(), forEach() 가 있다.
	// 둘은 루핑한다는 기능은 동일하지만 peek()는 중간처리 이고 forEach()는 최종처리 이므로
	// 최종처리 단계에 따른 pook() 호출후 sum()이나 최종처리 메소드가 꼭 존재하여야 한다.
	// 반대로 forEach()는 최종처리 메소드 이기 때문에 후에 메소드가 나오면 안된다.
	public static void main(String[] args) {
		int[] intArr = {1, 2, 3, 4, 5};
		
		System.out.println("[peek()를 마지막에 호출한 경우]");
		Arrays.stream(intArr)
		.filter(a -> a%2 == 0)
		.peek(System.out :: println);
		
		System.out.println("[최종 처리 메소드를 마지막에 호출한 경우]");
		int total = Arrays.stream(intArr)
		.filter(a -> a%2 == 0)
		.peek(n -> System.out.println(n))
		.sum();
		System.out.println("총합 : " + total);
		
		System.out.println("[forEach()를 마지막에 호출한 경우");
		Arrays.stream(intArr)
		.filter(a -> a%2==0)
		.forEach(System.out :: println);
	}
}
