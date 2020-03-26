package S20200311;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Start {

	public static void main(String[] args) {
		File file = new File("C:/tmp/a.wav");
		File file2 = new File("C:/tmp/now.wav");
		int data;
		byte[] buf = new byte[1];
		int offset = 516726 - 516318;
		int len = 0;
		int headerSize = 41;
		// 516318, 516726
		
		try {
			FileInputStream fis = new FileInputStream(file);
			FileOutputStream fos = new FileOutputStream(file2);
				
			while ((data = fis.read(buf)) != -1) {
				len += data;
				
				if(len >= (offset-headerSize)) { // len은 1부터 시작 하고 초과 연산 이므로.
					fos.write(buf, 0, data);
				} else {
					System.out.println(len);
				}
			}
			
			System.out.println("Off - " + offset);
			fis.close();
			fos.flush();
			fos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}