package S20200109LambdaInterface;

// 두개이상의 추상메소드 선언을 금하게 해줌
// 함수적 인터페이스는 하나의 메소드만 선언 되어 있어야한다.
// 람다식이 하나의 메소드를 정의하기 때문에 두개 이상의 추상 메소드가 선언된
// 인터페이스는 람다식을 이용해서 구현 객체를 생성할 수 없다.
@FunctionalInterface
public interface MyFunctionInterface01 {

	public void method();
}
