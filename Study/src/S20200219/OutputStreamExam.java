package S20200219;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamExam {
	
	public static void main(String[] args) {
		
		try {
			OutputStream os = new FileOutputStream("C:/Users/dkdlw/Desktop/test/text.txt");
			byte[] data = "ABC".getBytes();
			
			os.write(data, 1, 2);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}