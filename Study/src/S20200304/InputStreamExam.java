package S20200304;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamExam {

	public static void main(String[] args) throws IOException{
		InputStream is = System.in;
		
		// 100 바이트 버퍼
		byte[] datas = new byte[100];
		
		System.out.println("이름 : ");
		int nameBytes = is.read(datas);
		// commentBytes-2를 하는 이유 엔터 제외 엔터 = 케리지리턴(13) + 라인피드(10)
		String name = new String(datas, 0, nameBytes-2);
		
		System.out.println("하고 싶은말 : ");
		int commentBytes = is.read(datas);
		// commentBytes-2를 하는 이유 엔터 제외 엔터 = 케리지리턴(13) + 라인피드(10)
		String comment = new String(datas, 0, commentBytes-2);
		
		System.out.println("입력한 이름 : " + name);
		System.out.println("입력한 하고 싶은말 : " + comment);
	}
}