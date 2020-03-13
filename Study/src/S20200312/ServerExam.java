package S20200312;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExam {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket(); // �������� ���� ����� ���� ���� ������ �����Ѵ�.
			// IP�� ���þ�����, ��Ʈ�� 5001 �� ���ε� �Ѵ�.
			// �Ʒ��� Domain ������ �ּҸ� ���� ��� �̸� IP�ּҷ� ��ȯ �ϴ� ����̴�.
			serverSocket.bind(new InetSocketAddress("localhost", 5001));
			
			while (true) { // ���� Ŭ���̾�Ʈ�� �ޱ� ���� While ������ ������ ���� �غ� �Ѵ�.
				System.out.println("[���� ��ٸ�]");
				// Ŭ���̾�Ʈ ������ ���ö� ���� ������ ���ش�.
				Socket socket = serverSocket.accept(); 
				// ������ Ŭ���̾�Ʈ ������ �����´�.
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				// ����� Ŭ���̾�Ʈ�� �̸��� �����´�.
				System.out.println("[���� ������] " + isa.getHostName()); // 
			}
		} catch (Exception e) {
			// ����
		}
		
		// ���� ������ ���� ���� ���� ���(���� ���� �Ҷ�)
		if(!serverSocket.isClosed()) {
			try {
				// ������ �ݰ� �ڿ��� ��ȯ
				serverSocket.close();
			} catch (IOException e0) {
				e0.printStackTrace();
			}
		}
	}
}