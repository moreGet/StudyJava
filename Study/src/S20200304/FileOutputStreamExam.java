package S20200304;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExam {
	
	public static void main(String[] args) {
		/*
		 * 파일을 읽는다.
		 */
		String originFile = "C:\\Users\\dkdlw\\Documents\\Scanned Documents\\a.jpg";
		String targetFile = "C:\\Users\\dkdlw\\Documents\\Scanned Documents\\b.jpg";
		File ori_file = new File(originFile);
		File tar_file = new File(targetFile);
		
		try {
			FileInputStream fis = new FileInputStream(ori_file);
			FileOutputStream fos = new FileOutputStream(tar_file);
			
			int data;
			byte[] buf = new byte[128];
			while ((data = fis.read(buf)) != -1) {
				 
				fos.write(buf, 0, data);
			}
			
			fis.close();
			
			fos.flush();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
