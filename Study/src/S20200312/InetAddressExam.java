package S20200312;

import java.net.InetAddress;

public class InetAddressExam {

	public static void main(String[] args) {
		try {
			InetAddress local = InetAddress.getLocalHost(); // �ڱ� �ڽ��� PC IP�� ������
			System.out.println("�� ��ǻ�� �̸� : " + local.getHostName());
			System.out.println("�� ��ǻ�� IP�ּ� : " + local.getHostAddress());
			
			InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
			for (InetAddress inetAddress : iaArr) {
				System.out.println("www.naver.com IP�ּ� : " + inetAddress.getHostAddress());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}