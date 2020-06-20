package S20200502;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExam {

	public static void main(String[] args) {
		
		try {
			ServerSocket sevSocket = new ServerSocket(5001);
			InputStream is;
			InputStreamReader isr;
			BufferedReader br;
			
			while(true) {
				System.out.println("Client 를 기다리는 중...");
				Socket clientSocket = sevSocket.accept();
				is = clientSocket.getInputStream();
				isr = new InputStreamReader(is);
				br = new BufferedReader(isr);
				
				String clientMsg = br.readLine();
				System.out.println("Client Msg 수신 완료...");
				
				System.out.println(clientSocket.getRemoteSocketAddress() + ": " + clientMsg);
				System.out.println("======================");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}