package S20200313;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExam {

	public static void main(String[] args) {
		Socket socket = null;
		
		try {
			socket = new Socket();
			System.out.println("[���� ��û]");
			socket.connect(new InetSocketAddress("localhost", 5001));
			System.out.println("[���� ����]");
			
			byte[] bytes = null;
			String msg = null;
			
			OutputStream os = socket.getOutputStream();
			msg = "Hello Server";
			bytes = msg.getBytes("UTF-8");
			os.write(bytes);
			os.flush();
			System.out.println("[������ ������ ����]");
			
			InputStream is = socket.getInputStream();
			bytes = new byte[100];
			int readByteCount = is.read(bytes);
			msg = new String(bytes, 0, readByteCount, "UTF-8");
			System.out.println("[������ �ޱ� ����] : " + msg);
			
			os.close();
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if (!socket.isClosed()) {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}