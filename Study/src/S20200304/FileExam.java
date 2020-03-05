package S20200304;

import java.io.File;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExam {

	public static void main(String[] args) throws Exception{
		String dir = "C:/Temp/Dir";
		String file1 = "C:/Temp/file1.txt";
		String file2 = "C:/Temp/file2.txt";
		String file3 = "file:///C:/Temp/file3.txt";
		
		File filePath = new File(dir);
		File newFile1 = new File(file1);
		File newFile2 = new File(file2);
		File newFile3 = new File(new URI(file3)); // URI��ü�� ���� ����.
		
		if (!filePath.exists()) { filePath.mkdirs(); } // ���丮 �� ���ٸ� ���丮 ����
		if (!newFile1.exists()) { newFile1.createNewFile(); } // ������ ���ٸ� ���� ����
		if (!newFile2.exists()) { newFile2.createNewFile(); }
		if (!newFile3.exists()) { newFile3.createNewFile(); }
		
		String pattern = "yyyy-MM-dd\ta\tHH:mm"; // ��¥ ���� ����
		File temp = new File("C:/Temp");
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		File[] contents = temp.listFiles(); // temp����� ���� �� ���� ������ ������
		
		System.out.println("��¥\t\t�ð�\t\t����\t\tũ��\t�̸�");
		System.out.println("--------------------------------------------------------------------------");
		for (File file : contents) { // for each ���� ���� �� ���� ������ ��� ��Ŵ
			// ������ ���� ��¥�� Date�� ��ü ������ 
			// SimpleDateFormat Ŭ������ �� ���Ͽ� �°� ��¥�� ���˽�Ŵ
			System.out.print(sdf.format(new Date(file.lastModified())));
			
			if(file.isDirectory()) { // file�� ���丮��
				System.out.print("\t<DIR>\t\t\t" + file.getName()); // ���丮 ǥ��
			} else { // file�� ���丮�� �ƴϸ�
				System.out.print("\t\t\t" + file.length() + "\t" + file.getName()); // ���� ũ�� �� �̸� ǥ��
			}
			System.out.println(); // �� ���� (�����ǵ� + ĳ���� ����)
		}
	}
}