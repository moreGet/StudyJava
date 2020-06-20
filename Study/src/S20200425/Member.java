package S20200425;

public class Member {

	private final String name; // 필수 인자
	private final String location; // 선택적 인자
	private final String hobby; // 선택적 인자
	
	public Member(String name) {	
		this(name, "출신지역 비공개", "취미 비공개");
	}
	
	public Member(String name, String location) {
		this(name, location, "취미 비공개");
	}

	public Member(String name, String location, String hobby) {
		this.name = name;
		this.location = location;
		this.hobby = hobby;
	}
}
