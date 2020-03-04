package S20191228V4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromFileContentExam {
	
	//���Ϸ� ���� ��Ʈ�� ���
	public static void main(String[] args) throws IOException{
		
		Path path = Paths.get("src/S20191228V4/text.txt");
		Stream<String> stream;
		
		// Files.lines() �޼ҵ� �̿�
		stream = Files.lines(path);
		stream.forEach( System.out :: println );
		System.out.println();
		
		// BufferedReader�� lines() �޼ҵ� �̿�
		File file = path.toFile();
		
		// FileReader�� ���ڼ��� ������ �� ���� ����.
		// ���� InputStreamReader�� Charset�� UTF-8�� ������ �־�� �Ѵ�.
		FileInputStream fr = new FileInputStream(file);
		InputStreamReader isr = new InputStreamReader(fr, Charset.forName("UTF-8"));
		BufferedReader br = new BufferedReader(isr);
		stream = br.lines();
		stream.forEach( System.out :: println );
		
		// FromDirectoryExam
		System.out.println();
		Path path2 = Paths.get("C:\\Users\\dkdlw\\Desktop\\Work\\Test\\src");
		Stream<Path> stream2 = Files.list(path2);
		stream2.forEach( list -> System.out.println(
				list.getFileName() + 
				" " +
				list.getFileSystem()));
	}
}
