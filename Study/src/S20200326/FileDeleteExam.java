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
		
		// 파일을 받아옴
		File[] files = new File(path).listFiles();
		
		for (File file : files) {
			if(file.isDirectory()) { // 디렉토리면 들어가라
				
				System.out.println("DIR : " + file.getName());
				deleteFile(file.getPath());
			} else { // 아니면 고만 들어가.
				
				System.out.println("File : " + file.getName());
				file.delete(); // file 삭제
			}
			file.delete(); // dir 삭제
		}
	}
}