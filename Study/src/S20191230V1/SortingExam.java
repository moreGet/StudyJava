package S20191230V1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortingExam {

	// Sorted() �޼ҵ� �̿� �Ͽ� �����ϱ�
	// ��ü ��� �� ��� Ŭ������ Comparable�� �����ϰ� �־�� �Ѵ�.
	public static void main(String[] args) {
		IntStream intStream = Arrays.stream(new int[] {5, 3, 2, 1, 4});
		intStream
		.sorted()
		.forEach(System.out :: print);

		System.out.println();
		
		// ��ü���
		List<Student2> stuLists = Arrays.asList( // Stu��ü ����Ʈ ��ȯ
				new Student2("ȫ�浿", 30),
				new Student2("�ſ��", 10),
				new Student2("���̼�", 20));
		
		stuLists.stream() // ��Ʈ�� �޾ƿ�
		.sorted() // score �������� �������� ����
		.forEach(s -> System.out.print(s.getScore() + ",")); // ���
		System.out.println();
		
		stuLists.stream()
		.sorted(Comparator.reverseOrder()) // score�������� �������� ����(��ü�� ���Ľ�Ŵ)
		.forEach(s -> System.out.print(s.getScore() + ","));
	}
}