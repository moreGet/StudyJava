package S20191230V1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AsDoubleStreamAndBoxedExam {

	public static void main(String[] args) {
		int[] intArray = { 1, 2, 3, 4, 5 };
		
		IntStream intStream = Arrays.stream(intArray); // int형 배열로부터 스트림을 얻어옴
		intStream
		.asDoubleStream() // DoubleStream 생성
		.forEach(System.out :: println); // 출력
		
		System.out.println();
		
		intStream = Arrays.stream(intArray); // 새로 스트림을 생성 하고
		intStream 
		.boxed() // Stream<Integer> 생성
		.forEach(System.out :: println); // 출력
	}
}