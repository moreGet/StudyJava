package S20191230V1;

import java.util.Arrays;
import java.util.List;

/**
 * @author dkdlw
 * ���͸��� �߰� ó�� ����̴�. ��Ҹ� �ɷ�����.
 * distinct()�� oldValue.equels(newValue) �� true �̸� ����
 * filter()�� ���ڰ� Predicate�� true�� �����ϴ� ��Ҹ� ���͸� �Ѵ�.  
 */

public class FilteringExam {
	
	public static void main(String[] args) {
		List<String> names = Arrays.asList(
				"ȫ�浿",
				"�ſ��",
				"���ڹ�",
				"�ſ��",
				"�Ź�ö");
		
		names.parallelStream()
		.distinct() // �ߺ� ����
		.forEach(System.out :: println);
		
		System.out.println();
		
		names.parallelStream()
		.filter(n -> n.startsWith("��")) // ù ���ڰ� "��" �ΰ� �ɷ���
		.forEach( System.out :: println );
		
		System.out.println();
		
		// ���� ����
		names.parallelStream()
		.distinct() // �ߺ�����
		.filter( n -> n.startsWith("��") ) // ���ΰ͸� ������
		.forEach( System.out :: println );
	}
}