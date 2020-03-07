package S20200304;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedOuputStreamExam {
	
	public static void main(String[] args) throws Exception {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		int data = -1;
		long start = 0;
		long end = 0;
		int per = 166085682;
		double result = 0;
		
		byte[] buf = new byte[512];
		
		String path = "C:\\TMP\\a.pdf";
		fis = new FileInputStream(path);
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("C:\\TMP\\nobuf.pdf");
		start = System.currentTimeMillis();
		while ((data = bis.read()) != -1) {
			result += ((double)data/(double)per)*100;
			System.out.format("%.2f%%%n", result);
			fos.write(buf, 0, data);
		}
		
		fos.flush();
		end = System.currentTimeMillis();
		fos.close(); bis.close(); fis.close();
		System.out.println("버퍼 사용 안 했을 때 : " + (end-start) + "ms");
		
		fis = new FileInputStream(path);
		bis = new BufferedInputStream(fis); 
		fos = new FileOutputStream("C:\\TMP\\copy.pdf");
		bos = new BufferedOutputStream(fos);
		start = System.currentTimeMillis();
		while ((data = bis.read()) != -1) {
			bos.write(data);
		}
		bos.flush();
		end = System.currentTimeMillis();
		System.out.println("버퍼 사용 했을 때 : " + (end-start) + "ms");
		bos.close(); fos.close(); bis.close(); fis.close();
	}
}