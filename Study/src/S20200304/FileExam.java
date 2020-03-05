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
		File newFile3 = new File(new URI(file3)); // URI객체로 전달 가능.
		
		if (!filePath.exists()) { filePath.mkdirs(); } // 디렉토리 가 없다면 디렉토리 생성
		if (!newFile1.exists()) { newFile1.createNewFile(); } // 파일이 없다면 파일 생성
		if (!newFile2.exists()) { newFile2.createNewFile(); }
		if (!newFile3.exists()) { newFile3.createNewFile(); }
		
		String pattern = "yyyy-MM-dd\ta\tHH:mm"; // 날짜 패턴 정의
		File temp = new File("C:/Temp");
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		File[] contents = temp.listFiles(); // temp경로의 파일 및 폴더 정보를 가져옴
		
		System.out.println("날짜\t\t시간\t\t형태\t\t크기\t이름");
		System.out.println("--------------------------------------------------------------------------");
		for (File file : contents) { // for each 으로 파일 및 폴더 정보를 출력 시킴
			// 마지막 수정 날짜를 Date로 객체 생성후 
			// SimpleDateFormat 클래스로 위 패턴에 맞게 날짜를 포맷시킴
			System.out.print(sdf.format(new Date(file.lastModified())));
			
			if(file.isDirectory()) { // file이 디렉토리면
				System.out.print("\t<DIR>\t\t\t" + file.getName()); // 디렉토리 표시
			} else { // file이 디렉토리가 아니면
				System.out.print("\t\t\t" + file.length() + "\t" + file.getName()); // 파일 크기 및 이름 표시
			}
			System.out.println(); // 줄 개행 (라인피드 + 캐리지 리턴)
		}
	}
}