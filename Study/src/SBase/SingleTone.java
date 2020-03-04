package SBase;

public class SingleTone {

	// 싱글톤 패턴을 쓰는 이유
	// 고정된 메모리 영역 내에서 최적화된 방법으로 메모리 낭비를 방지
	// 전역 인스턴스 이기 때문에 다른 클래스의 인스턴스들이 데이터를 공유하기 쉬움.

	// 문제점
	// 싱글톤 인스턴스의 참조가 많아질수록 개발-폐쇄 원칙을 위배하게된다. (OOP에 위배)
	// LazyHolder 방식의 싱글톤 방식을 주로 사용함
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VIP Vipa = VIP.getInstance();
		VIP Vipb = VIP.getInstance();
		
		if (Vipa == Vipb) {
			System.out.println("싱글톤");
		} else {
			System.out.println("싱글톤이 아님");
		}
	}
}
