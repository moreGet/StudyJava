package S20191226;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableExam {

	public static void main(String[] args) {
		// ID�� Key ������ ���� HashMap
		Map<String, String> map = new Hashtable<String, String>();
		
		map.put("Spring", "12");
		map.put("Summer", "123");
		map.put("Fall", "1234");
		map.put("Winter", "12345");
		
//		Ű���� �Է�
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("���̵�� ��й�ȣ�� �Է� �ϼ���.");

			// ID �Է¹���
			System.out.println("���̵� : ");
			String id = sc.nextLine();
			
			System.out.println("��й�ȣ : ");
			String pass = sc.nextLine();
			System.out.println(); // �� ����
			
			if (map.containsKey(id)) {
				if (map.get(id).equals(pass)) {
					System.out.println("�α��� �Ǿ����ϴ�.");
					break;
				} else {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				}
			} else {
				System.out.println("�Է��Ͻ� ���̵� �������� �ʽ��ϴ�.");
			}
		}
	}
}
