package S20200304;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamWriterExam {
	
	public static void main(String[] args) {
		String path = "C:\\\\Users\\\\dkdlw\\\\Documents\\\\Scanned Documents\\\\tempWr.txt";
		File file = new File(path);

		int dataLen;
		char[] cbuf = new char[128]; // 버퍼
		
		try {
			// InputStream 으로 키보드에서 문자를 읽고
			InputStream is = System.in;
			// 바이트 기반 -> 문자 기반 입력 스트림
			InputStreamReader isr = new InputStreamReader(is);
			
			// 문자 기반 출력 스트림 -> 바이트 기반 
			OutputStream os = new FileOutputStream(file); // 입력받은 메시지 저장할 경로
			OutputStreamWriter osw = new OutputStreamWriter(os); // 바이트 스트림으로 보내기
			
			while ( (dataLen = isr.read(cbuf)) != -1 ) {
				String msgTemp = new String(cbuf, 0, dataLen);
				System.out.println(msgTemp);
				osw.write(msgTemp); // 문자 내보내기
				osw.flush(); // 버퍼가 커서 flush 해줘야 함
			}
			
			isr.close();
			osw.flush();
			osw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}