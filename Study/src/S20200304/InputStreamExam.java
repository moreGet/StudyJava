package S20200304;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamExam {

	public static void main(String[] args) throws IOException{
		InputStream is = System.in;
		
		// 100 ����Ʈ ����
		byte[] datas = new byte[100];
		
		System.out.println("�̸� : ");
		int nameBytes = is.read(datas);
		// commentBytes-2�� �ϴ� ���� ���� ���� ���� = �ɸ�������(13) + �����ǵ�(10)
		String name = new String(datas, 0, nameBytes-2);
		
		System.out.println("�ϰ� ������ : ");
		int commentBytes = is.read(datas);
		// commentBytes-2�� �ϴ� ���� ���� ���� ���� = �ɸ�������(13) + �����ǵ�(10)
		String comment = new String(datas, 0, commentBytes-2);
		
		System.out.println("�Է��� �̸� : " + name);
		System.out.println("�Է��� �ϰ� ������ : " + comment);
	}
}