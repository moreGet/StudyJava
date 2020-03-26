package S20200314;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {
	
	public static void main(String[] args) {
		Socket socket = new Socket();
		InputStreamReader isr = null;
		PrintStream ps = null;
		
		try {
			System.out.println("[서버 접속 대기]");
			socket.connect(new InetSocketAddress("localhost", 5050));
			System.out.println("[서버 접속]");
			
			ps = new PrintStream(System.out);
			isr = new InputStreamReader(socket.getInputStream());
			
			int data = 0;
			while ((data = isr.read()) != -1) {
//				System.out.println(data);
				ps.write(data);
			}
			
			ps.flush();
		} catch (Exception e) {
			
		}
		
		if(socket.isClosed()) {
			try {
				isr.close();
				ps.close();
				socket.close();
			} catch (IOException e) {

			}
		}
	}
}