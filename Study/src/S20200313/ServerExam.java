package S20200313;

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