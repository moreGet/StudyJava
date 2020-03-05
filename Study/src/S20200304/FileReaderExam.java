package S20200304;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class FileReaderExam {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\dkdlw\\Documents\\Scanned Documents\\temp.txt";
		
		try {
//			FileReader fr = new FileReader(path); // 한글이 깨진다.
			BufferedReader br = new BufferedReader( // 차선책 
					new InputStreamReader(
							new FileInputStream(path), Charset.forName("UTF-8")));
			
			int data;
			char[] buf = new char[128]; // 128byte 의 버퍼
			
//			while ((data = fr.read(buf)) != -1) {
//				String strData = new String(buf, 0, data);
//				System.out.println(strData);
//			}
//			
//			fr.close();
			
			while ((data = br.read(buf)) != -1) {
				String strData = new String(buf, 0, data);
				System.out.println(strData);
			}
			
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}