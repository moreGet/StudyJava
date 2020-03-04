package SBase;

public class VIP {

	private VIP() { } // 생성자에 private접근제한자를 사용 함으로써 생성자 사용을 불가하게함
	
	private static class LazyHolder {
		public static final VIP INSTANCE = new VIP(); // 내부클래스로 생성자 생성
	}
	
	public static VIP getInstance() {
		return LazyHolder.INSTANCE; // get메소드로 인스턴스 반환 받음(외부에서 유일하게 접근 가능함)
	}
}