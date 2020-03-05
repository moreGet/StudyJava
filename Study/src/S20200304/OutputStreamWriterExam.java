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
		char[] cbuf = new char[128]; // ����
		
		try {
			// InputStream ���� Ű���忡�� ���ڸ� �а�
			InputStream is = System.in;
			// ����Ʈ ��� -> ���� ��� �Է� ��Ʈ��
			InputStreamReader isr = new InputStreamReader(is);
			
			// ���� ��� ��� ��Ʈ�� -> ����Ʈ ��� 
			OutputStream os = new FileOutputStream(file); // �Է¹��� �޽��� ������ ���
			OutputStreamWriter osw = new OutputStreamWriter(os); // ����Ʈ ��Ʈ������ ������
			
			while ( (dataLen = isr.read(cbuf)) != -1 ) {
				String msgTemp = new String(cbuf, 0, dataLen);
				System.out.println(msgTemp);
				osw.write(msgTemp); // ���� ��������
				osw.flush(); // ���۰� Ŀ�� flush ����� ��
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