package S20200227;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		String[][] str = new String[3][4];
		
		List<Student> list = Arrays.asList(
				new Student("A", "/a/b/123.png", "dkdlwmzhs1@naver.com", 15),
				new Student("B", "/a/b/124.png", "dkdlwmzhs2@naver.com", 22),
				new Student("C", "/a/b/125.png", "dkdlwmzhs3@naver.com", 35));
		
		Iterator<Student> it = list.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next().getAge());
		}
	}
}