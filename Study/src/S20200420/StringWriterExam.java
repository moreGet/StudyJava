package S20200420;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.file.Paths;

public class StringWriterExam {
	
	public static void main(String[] args) {
		try {
			OutputStreamWriter osw = new OutputStreamWriter(
					new FileOutputStream(
							Paths.get("/tmp/abc.csv").toAbsolutePath().normalize().toString()), Charset.forName("utf8"));
			
			osw.write("¾È³ç?");
			osw.flush();
			osw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}