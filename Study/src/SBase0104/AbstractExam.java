package SBase0104;

public interface AbstractExam {
	// 상수
	// 변수 는 생성 불가, 상수만 가능.
	// 타입 상수명 = 값;
	public int TEST_VALUE = 10;
	public String TEST_STR_VALUE = "TEST";
	
	// 추상 메소드 {}가 없다면 하위 클래스에서 반드시 구현해야함
	public int getValue();
	public void setValue(int value);

	// 디폴트 메소드
	default void chkStrValue(String strTemp) {
		if(strTemp.equals("TEST")) {
			System.out.println("TEST 입니다.");
		} else {
			System.out.println("TEST 아닙니다.");
		}
	}

	// 정적 메소드
	static void showStrValue() {
		System.out.println(TEST_STR_VALUE);
	}
}