package S20200312;

import java.net.InetAddress;

public class InetAddressExam {

	public static void main(String[] args) {
		try {
			InetAddress local = InetAddress.getLocalHost(); // 자기 자신의 PC IP를 가져옴
			System.out.println("내 컴퓨터 이름 : " + local.getHostName());
			System.out.println("내 컴퓨터 IP주소 : " + local.getHostAddress());
			
			InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
			for (InetAddress inetAddress : iaArr) {
				System.out.println("www.naver.com IP주소 : " + inetAddress.getHostAddress());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}