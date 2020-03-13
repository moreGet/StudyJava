package S20200312;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExam {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket(); // 서버에서 소켓 통신을 위해 서버 소켓을 선언한다.
			// IP는 로컬아이피, 포트는 5001 로 바인딩 한다.
			// 아래는 Domain 정보로 주소를 받을 경우 이를 IP주소로 변환 하는 방법이다.
			serverSocket.bind(new InetSocketAddress("localhost", 5001));
			
			while (true) { // 다중 클라이언트를 받기 위해 While 문으로 소켓을 받을 준비를 한다.
				System.out.println("[연결 기다림]");
				// 클라이언트 연결이 들어올때 마다 수락을 해준다.
				Socket socket = serverSocket.accept(); 
				// 수락한 클라이언트 정보를 가져온다.
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				// 연결된 클라이언트의 이름을 가져온다.
				System.out.println("[연결 수락함] " + isa.getHostName()); // 
			}
		} catch (Exception e) {
			// 예외
		}
		
		// 서버 소켓이 닫혀 있지 않을 경우(서버 종료 할때)
		if(!serverSocket.isClosed()) {
			try {
				// 소켓을 닫고 자원을 반환
				serverSocket.close();
			} catch (IOException e0) {
				e0.printStackTrace();
			}
		}
	}
}