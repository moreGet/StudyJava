package S20200303;

import java.io.IOException;
import java.io.InputStream;

public class Main {

	public static void main(String[] args) throws IOException{
		System.out.println("== �޴� ��ȸ ==");
		System.out.println("1. ���� ��ȸ");
		System.out.println("2. ���� ���");
		System.out.println("3. ���� �Ա�");
		System.out.println("4. ���� �ϱ�");
		System.out.print("�޴��� �����ϼ���.");
		
		InputStream is = System.in;
		char inputChar = (char) is.read();
		switch(inputChar) {
			case '1':
				System.out.println("���� ��ȸ ����");
				break;
			case '2':
				System.out.println("���� ��� ����");
				break;
			case '3':
				System.out.println("���� �Ա� ����");
				break;
			case '4':
				System.out.println("���� �ϱ� ����");
				break;
		}
	}
}
