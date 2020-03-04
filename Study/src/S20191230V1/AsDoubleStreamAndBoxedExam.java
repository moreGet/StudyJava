package S20191230V1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AsDoubleStreamAndBoxedExam {

	public static void main(String[] args) {
		int[] intArray = { 1, 2, 3, 4, 5 };
		
		IntStream intStream = Arrays.stream(intArray); // int�� �迭�κ��� ��Ʈ���� ����
		intStream
		.asDoubleStream() // DoubleStream ����
		.forEach(System.out :: println); // ���
		
		System.out.println();
		
		intStream = Arrays.stream(intArray); // ���� ��Ʈ���� ���� �ϰ�
		intStream 
		.boxed() // Stream<Integer> ����
		.forEach(System.out :: println); // ���
	}
}