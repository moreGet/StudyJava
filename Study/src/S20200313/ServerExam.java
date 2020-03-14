package S20200313;

//| 블로킹이 해제되는 경우                      | 리턴 값        |
//|---------------------------------------------|----------------|
//| 상대방이 데이터를 보냄                      | 읽은 바이트 수 |
//| 상대방이 정상적으로 Socket의 close()를 호출 | -1             |
//| 상대방이 비정상적으로 종료                  | IOException    |

// 위 예외들은 inputstream 으로 read()를 할때 블로킹이 되는데, 이 블로킹 상태가 해체 되는 조건은 위 3가지 이다.
// 따라서 위 3가지의 예외별로 서버에서도 예외처리를 해주어야 한다.

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExam {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost", 5001));
			while (true) {
				System.out.println("[연결 기다림] ");
				Socket socket = serverSocket.accept(); // 클라이언트 연결 수락
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("[연결 수락함] " + isa.getHostName());
				
				byte[] bytes = null;
				String msg = null;
				
				InputStream is = socket.getInputStream();
				bytes = new byte[100];
				int readByteCount = is.read(bytes);
				msg = new String(bytes, 0, readByteCount, "UTF-8");
				System.out.println("[데이터 받기 성공] : " + msg);
				
				OutputStream os = socket.getOutputStream();
				msg = "Hello Client";
				bytes = msg.getBytes("UTF-8");
				os.write(bytes);
				os.flush();
				System.out.println("[데이터 보내기 성공]");
				
				is.close();
				os.close();
				socket.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if (serverSocket.isClosed()) {
			try {
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}