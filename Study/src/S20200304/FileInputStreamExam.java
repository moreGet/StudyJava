package S20200304;

import java.io.File;
import java.io.FileInputStream;

public class FileInputStreamExam {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\dkdlw\\Documents\\Scanned Documents\\a.jpg";
		File file = new File(path);
		
		try {
			FileInputStream fis = new FileInputStream(file);
			
			int data;
			while ((data = fis.read()) != -1) {
				 System.out.write(data);
			}
			
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}