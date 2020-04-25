package S20200425;

public class Member {

	private final String name; // �ʼ� ����
	private final String location; // ������ ����
	private final String hobby; // ������ ����
	
	public Member(String name) {	
		this(name, "������� �����", "��� �����");
	}
	
	public Member(String name, String location) {
		this(name, location, "��� �����");
	}

	public Member(String name, String location, String hobby) {
		this.name = name;
		this.location = location;
		this.hobby = hobby;
	}
}
