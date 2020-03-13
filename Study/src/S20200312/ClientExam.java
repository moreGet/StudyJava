package S20200312;

import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExam {

	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket(); // 소켓 통신을 위해 빈 소켓 생성
			System.out.println("[연결 요청]");
			// 아래는 서버 IP및 통신할 포트를 정하는데,
			// 서버가 도메인일 경우 아래 처럼 InetSocketAddress 클래스로 IP로 변환 해주는 작업을 거친다.
			socket.connect(new InetSocketAddress("localhost", 5001));
			System.out.println("[연결 성공]");
		} catch (Exception e) { }
		
		if(!socket.isClosed()) { // 소켓이 닫혀 있지 않을 경우
			try {
				socket.close(); // 연결 종료
			} catch (Exception e) {
				
			}
		}
	}
}