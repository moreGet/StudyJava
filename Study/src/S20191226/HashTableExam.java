package S20191226;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableExam {

	public static void main(String[] args) {
		// ID와 Key 저장을 위한 HashMap
		Map<String, String> map = new Hashtable<String, String>();
		
		map.put("Spring", "12");
		map.put("Summer", "123");
		map.put("Fall", "1234");
		map.put("Winter", "12345");
		
//		키보드 입력
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("아이디와 비밀번호를 입력 하세요.");

			// ID 입력받음
			System.out.println("아이디 : ");
			String id = sc.nextLine();
			
			System.out.println("비밀번호 : ");
			String pass = sc.nextLine();
			System.out.println(); // 줄 개행
			
			if (map.containsKey(id)) {
				if (map.get(id).equals(pass)) {
					System.out.println("로그인 되었습니다.");
					break;
				} else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			} else {
				System.out.println("입력하신 아이디가 존재하지 않습니다.");
			}
		}
	}
}
