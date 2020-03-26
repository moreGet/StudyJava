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
				System.out.println("[Ŭ���̾�Ʈ ������ ��ٸ�]");
				Socket socket = serverSocket.accept();
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("[Ŭ���̾�Ʈ ���� ����] : " + isa.getHostName());
				
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