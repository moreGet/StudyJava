package S20191227V2;

public class Student {
	private String name;
	private int code;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, int code) {
		super();
		this.name = name;
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public String getName() {
		return name;
	}
}

// 그린 - 게임콘텐츠개발(MAX) 양성과정
// 14일 20%결석 시 학원 장려금 지급 X 
// 14일 20%결석 시 수당 지급 X