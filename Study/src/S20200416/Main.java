package S20200416;

public class Main {
	
	public static void main(String[] args) {
		
		// �ڽ� Ŭ������ �ν��Ͻ� ����
		ChildProduct<Tv, String, String> product = new ChildProduct<Tv, String, String>();
		
		// Tv Ŭ���� �ν��Ͻ��� ������ Set
		product.setKind(new Tv());
		// String �� �Ű��� ����
		product.setModel("Smart Tv");
		// String �� �Ű��� ����
		product.setCompany("Samsung");
		
		Storage<Tv> storage = new StorageImpl<Tv>(100);
		storage.add(new Tv(), 0);
		Tv tv = storage.get(0);
	}
}