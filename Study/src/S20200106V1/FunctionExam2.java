package S20200106V1;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class FunctionExam2 {

	private static List<Student> list = Arrays.asList( // List�� ����
			new Student("ȫ�浿", 90, 96),
			new Student("�ſ��", 95, 93));
	
	public static double avg( ToIntFunction<Student> function ) { 
		int sum = 0;
		for (Student student : list) { // list���� stu��ü�� �̾ƿ�
			sum += function.applyAsInt(student); // sum ������ ������Ŵ
		}
		
		double avg = (double) sum / list.size(); // ��� ����
		return avg;
	}
	
	public static void main(String[] args) {
		double engListAvg = avg( s -> s.getEngScore() );
		System.out.println("���� ���� ��� : " + engListAvg);
		
		double mathAvg = avg( s -> s.getMathScore() );
		System.out.println("���� ��� ���� : " + mathAvg);
	}
}