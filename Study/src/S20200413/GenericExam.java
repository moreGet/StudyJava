package S20200413;

/*
 * �� ���׷� �ΰ�?
 * java 5���� ���׸� Ÿ���� �߰� �Ǿ��µ� ���׸��� �̿������ν� �߸��� Ÿ���� ���� �� �ִ�
 * ������ ������ ���������� ������ �� �ְ� �Ǿ���.
 * ���׸��� �÷���, ���ٽ�, ��Ʈ��, NIO���� �θ� ���ǹǷ� Ȯ���� ������ �ξ�� �Ѵ�.
 */

public class GenericExam {
	
	public static void main(String[] args) {
		Box<String> stringBox = new Box<String>();
		stringBox.set("�ȳ�?");
		System.out.println(stringBox.get());
		
		Box<Apple> appleBox = new Box<Apple>();
		appleBox.set(new Apple());
		System.out.println(appleBox.get());
	}
}