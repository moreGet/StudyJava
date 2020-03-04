package S20191230V1;

import java.util.Arrays;
import java.util.List;

public class MapExam {

	public static void main(String[] args) {
		List<Student> stuList = Arrays.asList(
				new Student("ȫ�浿", 10),
				new Student("�ſ��", 20),
				new Student("���̼�", 30));
		
		stuList.parallelStream() // stu ��ü ��Ʈ�� �޾ƿ�
		.mapToInt(Student :: getCode) // Student Ŭ���� ���� getCode �Լ��� code�� ���� ����
		.forEach(System.out :: println); // ��� ��Ŵ
	}
}
