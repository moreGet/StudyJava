package S20200313;

//| ���ŷ�� �����Ǵ� ���                      | ���� ��        |
//|---------------------------------------------|----------------|
//| ������ �����͸� ����                      | ���� ����Ʈ �� |
//| ������ ���������� Socket�� close()�� ȣ�� | -1             |
//| ������ ������������ ����                  | IOException    |

// �� ���ܵ��� inputstream ���� read()�� �Ҷ� ���ŷ�� �Ǵµ�, �� ���ŷ ���°� ��ü �Ǵ� ������ �� 3���� �̴�.
// ���� �� 3������ ���ܺ��� ���������� ����ó���� ���־�� �Ѵ�.

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
				System.out.println("[���� ��ٸ�] ");
				Socket socket = serverSocket.accept(); // Ŭ���̾�Ʈ ���� ����
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("[���� ������] " + isa.getHostName());
				
				byte[] bytes = null;
				String msg = null;
				
				InputStream is = socket.getInputStream();
				bytes = new byte[100];
				int readByteCount = is.read(bytes);
				msg = new String(bytes, 0, readByteCount, "UTF-8");
				System.out.println("[������ �ޱ� ����] : " + msg);
				
				OutputStream os = socket.getOutputStream();
				msg = "Hello Client";
				bytes = msg.getBytes("UTF-8");
				os.write(bytes);
				os.flush();
				System.out.println("[������ ������ ����]");
				
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