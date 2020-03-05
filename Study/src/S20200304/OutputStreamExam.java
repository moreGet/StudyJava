package S20200304;

import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamExam {

	public static void main(String[] args) throws IOException{
		OutputStream os = System.out;
		
		String msg = "æ»≥Á«œººø‰?";
		byte[] massage = msg.getBytes();
		
		os.write(massage);
		os.flush();
	}
}