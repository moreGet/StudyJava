package S20200109LambdaInterface;

public class Main {

	public static void main(String[] args) {
		// 매개값과 리턴 값 이 없는 함수적 인터페이스
		MyFunctionInterface01 fi;
		
		fi = () -> {
			String str = "Method call1";
			System.out.println(str);
		};
		fi.method();
		
		// 두 번째 방법
		fi = () -> { System.out.println("Method call2"); };
		fi.method();
		
		// 세 번째 방법
		fi = () -> System.out.println("Method call3");
		fi.method();
		
		//=================================================
		
		InterfaceUseVal iuv; // 매개변수가 하나 이상인 함수인터페이스
		
		iuv = (x, y) -> { // 변수 x를 대입
			int result = (x*y);
			System.out.println(result);
		};
		iuv.method(5, 5);
		
		// 혹은
		iuv = (x, y) -> System.out.println(x*y);
		iuv.method(4, 5);
		
		//=================================================
		InterfaceUseReturn iur; // 리턴값이 있는 인터페이스
		
		// 첫 번째 방법
		iur = (x, y) -> x + y;
		int result = iur.method(5, 7);
		System.out.println(result);
		
		// 두 번째 방법
		iur = (x, y) -> {
			int result2;
			result2 = x+y;
			
			return result2;
		};
		System.out.println(iur.method(10, 30));
	}
}
