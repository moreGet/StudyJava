package S20191230V1;

import java.util.Arrays;
import java.util.List;

/**
 * @author dkdlw
 * flatMapXXX() �޼ҵ�� �߰�ó�� ����� �ϴ� ���� �޼ҵ� �̴�.
 * �� ��Ҹ� ��ü�ϴ� �������� ���ο� ��Ʈ���� �����Ѵ�.
 * A�� B ��� ��Ұ� ���ڷ� �־����� A1, A2 / B1, B2 ��Ҹ� ������ ���ο� ��Ʈ���� �����ȴ�.
 */
public class FlatMapExam {

	public static void main(String[] args) {
		List<String> inputList1 = Arrays.asList(
				"java8 lambda",
				"stream mapping"
				);
		
		inputList1.parallelStream() // ���� ó�� ��Ʈ��
		.flatMap(data -> Arrays.stream(data.split(" "))) // ������ �������� ���ڿ� �и�
		.forEach(System.out :: println); // ���ڿ� ���
		
		System.out.println();
		
		List<String> inputList2 = Arrays.asList("10, 20, 30, 40, 50, 60");
		inputList2.parallelStream() // ����ó�� ��Ʈ��
		.flatMapToInt(data -> { // �߰�ó�� ���� �޼ҵ� ���ڿ� list�� ������ ��Ʈ������ ��ȯ �ϱ�.
			String[] strArr = data.split(",");  // "," ���� �߶� ���ڿ� �迭�� �ֱ�
			
			// strArr�� �ִ� ���ڿ� ��ҵ��� ���������� ���� �Ͽ� ������ �迭�� �ֱ� ���� ���� ũ��� ����
			int[] intArr = new int[strArr.length]; 
			
			// for������ ���ڿ� ��Ҹ� ������ �迭�� ����
			for (int i = 0; i < strArr.length; i++) {
				intArr[i] = Integer.parseInt(strArr[i].trim()); // trim() ��������
			}
			
			return Arrays.stream(intArr); // �ϼ��� ������ �迭�� ��Ʈ�� ������ ��ȯ��Ŵ
		}).forEach(System.out :: println); // ���.
	}
}