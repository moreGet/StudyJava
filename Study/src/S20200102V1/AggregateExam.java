package S20200102V1;

import java.util.Arrays;

public class AggregateExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArrays = new int[] {1, 2, 3, 4, 5};
		
		long count = Arrays.stream(intArrays)
				.filter(n -> n%2==0)
				.count();
		System.out.println("2�� ��� ���� : " + count);
		
		long sum = Arrays.stream(intArrays)
				.filter(n -> n%2==0)
				.sum();
		System.out.println("2�� ����� �� : " + sum);
		
		double avg = Arrays.stream(intArrays)
				.filter(n -> n%2==0)
				.average()
				.getAsDouble();
		System.out.println("2�� ����� ��� : " + avg);
		
		int max = Arrays.stream(intArrays)
				.filter(n -> n%2==0)
				.max()
				.getAsInt();
		System.out.println("�ִ� : " + max);
		
		int min = Arrays.stream(intArrays)
				.filter(n -> n%2==0)
				.min()
				.getAsInt();
		System.out.println("�ּڰ�  : " + min);
		
		int first = Arrays.stream(intArrays)
				.filter(n -> n%3==0)
				.findFirst()
				.getAsInt();
		System.out.println("ù��° 3�� ��� : " + first);
	}

}
