package S20200126;
import java.util.Arrays;
import java.util.List;

/*
 * 스트림 병렬 처리가 항상 순차 처리 보다 실행 성능이 좋다고 판단해서는 안 된다.
 * 컬렉션에 요소의 수가 적고 요소당 처리 시간이 짧으면 순차 처리가 오히려 병렬 처리보다 빠를 수 있다.
 * ArrayList, 배열은 인덱스로 요소를 관리하기 때문에 포크단계에서 쉽게 요소분리가 가능해 처리 속도가 빠르지만
 * HashSet, TreeSet은 요소 분리가 쉽지않고 LinkedList역시 링크를 따라가야 하므로 요소 분리가 쉽지않다.
 * ArrayList 와 배열에 비해 병렬처리 속도가 느리다. 그리고 싱글코어 CPU일 경우 당연 순차처리가 빠르다.
 * 코어 수가 많아질 수록 병렬 처리가 속도가 빨라진다.
 */

public class S20200126ForkJoin {
	
	// 요소 처리
	public static void work(int value) {
		try {
			Thread.sleep(10); // 값이 작을수록 순차 처리가 빠름
		} catch (InterruptedException e) {
			
		}
	}
	
	// 순차 처리
	public static long testSequencial(List<Integer> list) {
		long start = System.nanoTime();
		list.stream().forEach( a -> work(a) );
		long end = System.nanoTime();
		long runTime = end - start;
		
		return runTime;
	}
	
	// 병렬 처리
	public static long testParallel(List<Integer> list) {
		long start = System.nanoTime();
		list.stream().parallel().forEach( a -> work(a) );
		long end = System.nanoTime();
		long runTime = end - start;
		
		return runTime;
	}
	
	// 나노 초 -> 초
	public static long transNanoSec(long nano) {
		
		long sec = (nano/1000000);
		return sec;
	}
	
	public static void main(String[] args) {
		// 소스 컬렉션
		List<Integer> list = Arrays.asList( 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 );
		
		// 순차 스트림 처리 시간 구하기
		long timeSequencial = testSequencial(list);
		
		// 병렬 스트림 처리 시간 구하기
		long timeParallel = testParallel(list);
		
		System.out.println("순차 : " + transNanoSec(timeSequencial) + "ms");
		System.out.println("병렬 : " + transNanoSec(timeParallel) + "ms");
		
		if (timeSequencial < timeParallel) {
			System.out.println("순차 처리가 더 빠름");
		} else {
			System.out.println("병렬 처리가 더 빠름");
		}
	}
}