package S20200304;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExam {

	public static void main(String[] args) {
		String path = "C:\\\\Users\\\\dkdlw\\\\Documents\\\\Scanned Documents\\\\tempWr.txt";
		File file = new File(path);
		
		try {
			// \r : ĳ�������� + \n : �����ǵ� = ����
			String data = "���� ����\n�ȳ�?";
			FileWriter fw = new FileWriter(file);
			
			fw.write(data);
			fw.flush();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}