package S20200109LambdaInterface;

@FunctionalInterface
public interface InterfaceUseReturn {
	
	// 리턴값이 존재 하기 때문에 반환형을 선언 해주어야 한다.
	public int method(int x, int y);
}
