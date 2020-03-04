package S20191229V1;

import java.util.Arrays;
import java.util.List;

public class StreamPipelineExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Member> list = Arrays.asList(
				new Member("��", Member.MALE, 24),
				new Member("��", Member.FEMALE, 26),
				new Member("��", Member.FEMALE, 32));
		
		double age = list.parallelStream()
				.filter(m -> m.getSex() == Member.FEMALE) // list�� ������ ������
				.mapToInt(Member :: getAge) // ����� ���̸� ���� �޾Ƽ�
				.average() // ����� �����
				.getAsDouble(); // Double ���·� ��ȯ �޴´�.
		
		System.out.println("������ ��� ���� : " + age);
		
		// ���� Ÿ���� Stream �̶�� �߰�ó�� �޼ҵ� �̴�.
		// ���� Ÿ���� �⺻Ÿ�� Ȥ�� OptionalXXX ��� ���� ó�� �޼ҵ� �̴�.
	}

}
