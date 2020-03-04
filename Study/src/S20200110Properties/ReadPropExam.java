package S20200110Properties;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class ReadPropExam {

	public static void main(String[] args) throws Exception {
		Properties prop = new Properties();
		String path = ReadPropExam.class.getResource("db.properties").getPath(); // 경로를 가져오기위해 사용
		path = URLDecoder.decode(path, "utf-8"); // 문자셋 지정해줌.
		prop.load(new FileReader(path)); // path에 존재하는 prop파일을 읽어 properties객체로 만듦
		
		String drv = prop.getProperty("driver"); // driver부분 가져옴
		String url = prop.getProperty("url"); // url부분 가져옴
		String user  = prop.getProperty("username"); // user부분 가져옴
		String pass = prop.getProperty("password"); // password부분 가져옴
		
		System.out.println("driver : " + drv);
		System.out.println("url : " + url);
		System.out.println("user : " + user);
		System.out.println("pass : " + pass);
	}
}
