package S20200304;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderExam {

	public static void main(String[] args) {
		// 바이트 기반 InputStream을 문자 기반 InputStreamReader 로 변환
		
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		
		int data;
		char[] cbuf = new char[128];
		
		try {
			while ((data = isr.read(cbuf)) != -1) {
				String strData = new String(cbuf, 0, data);
				System.out.println(strData);
			}
			
			isr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
}