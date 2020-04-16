package S20200413;

/*
 * 왜 제네렉 인가?
 * java 5부터 제네릭 타입이 추가 되었는데 제네릭을 이용함으로써 잘못된 타입이 사용될 수 있는
 * 문제를 컴파이 ㄹ과정에서 제거할 수 있게 되었다.
 * 제네릭은 컬렉션, 람다식, 스트림, NIO에서 널리 사용되므로 확실히 이해해 두어야 한다.
 */

public class GenericExam {
	
	public static void main(String[] args) {
		Box<String> stringBox = new Box<String>();
		stringBox.set("안녕?");
		System.out.println(stringBox.get());
		
		Box<Apple> appleBox = new Box<Apple>();
		appleBox.set(new Apple());
		System.out.println(appleBox.get());
	}
}