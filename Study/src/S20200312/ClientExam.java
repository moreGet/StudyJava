package S20200312;

import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExam {

	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket(); // ���� ����� ���� �� ���� ����
			System.out.println("[���� ��û]");
			// �Ʒ��� ���� IP�� ����� ��Ʈ�� ���ϴµ�,
			// ������ �������� ��� �Ʒ� ó�� InetSocketAddress Ŭ������ IP�� ��ȯ ���ִ� �۾��� ��ģ��.
			socket.connect(new InetSocketAddress("localhost", 5001));
			System.out.println("[���� ����]");
		} catch (Exception e) { }
		
		if(!socket.isClosed()) { // ������ ���� ���� ���� ���
			try {
				socket.close(); // ���� ����
			} catch (Exception e) {
				
			}
		}
	}
}