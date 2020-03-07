package S20200304;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JFileChooser;

public class BufferedInputStreamExam {

	public static void main(String[] args) throws Exception {
		long start = 0;
		long end  = 0;
		
		// 경로를 얻기 위해 파일선택 창 생성
		JFileChooser jfc = new JFileChooser();
		jfc.showOpenDialog(null);
		
		// OK버튼을 누름과 동시에 파일의 정보중 경로를 받아옴
		String pathTmp = jfc.getSelectedFile().getPath();
		
		// Path 클래스로 절대경로및 정규화를 거쳐 경로를 생성
		Path path1 = Paths.get(pathTmp).toAbsolutePath().normalize();
		System.out.println(path1.toString());
		File file = new File(path1.toUri()); // 그 URI를 받아 File 객체로 생성
		
		// 파일 입력 스트림을 생성함
		FileInputStream fis1 = new FileInputStream(file);
		// 보조 스트림을 사용하지 않고 파일을 읽는 시간을 기록하기 위해 아래 구문을 정의
		start = System.currentTimeMillis();
		
		// 파일을 읽음 파일을 다 읽게 되면 -1를 리턴함
		while (fis1.read() != -1) {}
		end = System.currentTimeMillis(); // 파일을 다 읽은후의 시점을 기록
		System.out.println("Buffered Stream를 사용 안했을때 : " + (end-start) + "ms"); // 시간 출력
		fis1.close(); // 사용한 스트림을 닫고 자원을 반납
		
		// 아래는 보조 스트림을 이용한 읽기 및 시간 기록 패턴
		FileInputStream fis2 = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis2); // 보조 입력 스트림을 체이닝
		start = System.currentTimeMillis();
		
		while (bis.read() != -1) {} //읽기
		end = System.currentTimeMillis();
		System.out.println("Buffered Stream를 사용 했을때 : " + (end-start) + "ms"); // 시간 기록
		bis.close(); // 보조 스트림 닫기 
		fis1.close(); // 입력 스트림 닫기
	}
}