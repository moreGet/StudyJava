package S20200314;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		OutputStreamWriter osw = null;
		
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost", 5050));
			
			while (true) {
				System.out.println("[클라이언트 연결을 기다림]");
				Socket socket = serverSocket.accept();
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("[클라이언트 접속 성공] : " + isa.getHostName());
				
				osw = new OutputStreamWriter(socket.getOutputStream());
				osw.write("Hello Client");
				osw.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if (serverSocket.isClosed()) {
			try {
				osw.close();
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}