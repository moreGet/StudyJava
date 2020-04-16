package S20200416;

public class Main {
	
	public static void main(String[] args) {
		
		// 자식 클래스의 인스턴스 생성
		ChildProduct<Tv, String, String> product = new ChildProduct<Tv, String, String>();
		
		// Tv 클래스 인스턴스를 생성해 Set
		product.setKind(new Tv());
		// String 형 매개값 전달
		product.setModel("Smart Tv");
		// String 형 매개값 전달
		product.setCompany("Samsung");
		
		Storage<Tv> storage = new StorageImpl<Tv>(100);
		storage.add(new Tv(), 0);
		Tv tv = storage.get(0);
	}
}