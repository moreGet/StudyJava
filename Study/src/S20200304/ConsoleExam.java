package S20200304;

import java.io.Console;

public class ConsoleExam {
	
	/**
	 * Console �� Null�� �����ϱ� ������ �ܼ� ���� �������� �ؾ��Ѵ�.
	 */
	public static void main(String[] args) {
		Console console = System.console();
		
		System.out.println("���̵� : ");
		String id = console.readLine();
		
		System.out.println("�н����� : ");
		char[] charPass = console.readPassword();
		String strPassword = new String(charPass); // char[] �迭�� ���ڿ��� ����
		
		System.out.println("-------------------------");
		System.out.println(id);
		System.out.println(strPassword);
	}
}