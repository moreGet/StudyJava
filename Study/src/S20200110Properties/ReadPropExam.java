package S20200110Properties;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class ReadPropExam {

	public static void main(String[] args) throws Exception {
		Properties prop = new Properties();
		String path = ReadPropExam.class.getResource("db.properties").getPath(); // ��θ� ������������ ���
		path = URLDecoder.decode(path, "utf-8"); // ���ڼ� ��������.
		prop.load(new FileReader(path)); // path�� �����ϴ� prop������ �о� properties��ü�� ����
		
		String drv = prop.getProperty("driver"); // driver�κ� ������
		String url = prop.getProperty("url"); // url�κ� ������
		String user  = prop.getProperty("username"); // user�κ� ������
		String pass = prop.getProperty("password"); // password�κ� ������
		
		System.out.println("driver : " + drv);
		System.out.println("url : " + url);
		System.out.println("user : " + user);
		System.out.println("pass : " + pass);
	}
}
