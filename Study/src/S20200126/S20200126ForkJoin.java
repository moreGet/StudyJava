package S20200126;
import java.util.Arrays;
import java.util.List;

/*
 * ��Ʈ�� ���� ó���� �׻� ���� ó�� ���� ���� ������ ���ٰ� �Ǵ��ؼ��� �� �ȴ�.
 * �÷��ǿ� ����� ���� ���� ��Ҵ� ó�� �ð��� ª���� ���� ó���� ������ ���� ó������ ���� �� �ִ�.
 * ArrayList, �迭�� �ε����� ��Ҹ� �����ϱ� ������ ��ũ�ܰ迡�� ���� ��Һи��� ������ ó�� �ӵ��� ��������
 * HashSet, TreeSet�� ��� �и��� �����ʰ� LinkedList���� ��ũ�� ���󰡾� �ϹǷ� ��� �и��� �����ʴ�.
 * ArrayList �� �迭�� ���� ����ó�� �ӵ��� ������. �׸��� �̱��ھ� CPU�� ��� �翬 ����ó���� ������.
 * �ھ� ���� ������ ���� ���� ó���� �ӵ��� ��������.
 */

public class S20200126ForkJoin {
	
	// ��� ó��
	public static void work(int value) {
		try {
			Thread.sleep(10); // ���� �������� ���� ó���� ����
		} catch (InterruptedException e) {
			
		}
	}
	
	// ���� ó��
	public static long testSequencial(List<Integer> list) {
		long start = System.nanoTime();
		list.stream().forEach( a -> work(a) );
		long end = System.nanoTime();
		long runTime = end - start;
		
		return runTime;
	}
	
	// ���� ó��
	public static long testParallel(List<Integer> list) {
		long start = System.nanoTime();
		list.stream().parallel().forEach( a -> work(a) );
		long end = System.nanoTime();
		long runTime = end - start;
		
		return runTime;
	}
	
	// ���� �� -> ��
	public static long transNanoSec(long nano) {
		
		long sec = (nano/1000000);
		return sec;
	}
	
	public static void main(String[] args) {
		// �ҽ� �÷���
		List<Integer> list = Arrays.asList( 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 );
		
		// ���� ��Ʈ�� ó�� �ð� ���ϱ�
		long timeSequencial = testSequencial(list);
		
		// ���� ��Ʈ�� ó�� �ð� ���ϱ�
		long timeParallel = testParallel(list);
		
		System.out.println("���� : " + transNanoSec(timeSequencial) + "ms");
		System.out.println("���� : " + transNanoSec(timeParallel) + "ms");
		
		if (timeSequencial < timeParallel) {
			System.out.println("���� ó���� �� ����");
		} else {
			System.out.println("���� ó���� �� ����");
		}
	}
}