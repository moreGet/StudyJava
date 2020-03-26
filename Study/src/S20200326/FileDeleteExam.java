package S20200326;

import java.io.File;

public class FileDeleteExam {
	
	public static void main(String[] args) {
		
		String path = "C:/cash";
		
		DeleteFile.deleteFile(path);
	}
}

class DeleteFile {
	
	public static void deleteFile(String path) {
		
		// ������ �޾ƿ�
		File[] files = new File(path).listFiles();
		
		for (File file : files) {
			if(file.isDirectory()) { // ���丮�� ����
				
				System.out.println("DIR : " + file.getName());
				deleteFile(file.getPath());
			} else { // �ƴϸ� �� ��.
				
				System.out.println("File : " + file.getName());
				file.delete(); // file ����
			}
			file.delete(); // dir ����
		}
	}
}