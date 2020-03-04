package S20200304;

import java.io.IOException;
import java.io.InputStream;

public class Main {

	public static void main(String[] args) throws IOException{
		InputStream is = System.in;
		
		// 100 바이트 버퍼
		byte[] datas = new byte[100];
		
		System.out.println("이름 : ");
		int nameBytes = is.read(datas);
		String name = new String(datas, 0, nameBytes-2);
		
		System.out.println("하고 싶은말 : ");
		int commentBytes = is.read(datas);
		String comment = new String(datas, 0, commentBytes-2);
		
		System.out.println("입력한 이름 : " + name);
		System.out.println("입력한 하고 싶은말 : " + comment);
	}
}