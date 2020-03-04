package S20200109LambdaInterface;

public class Main {

	public static void main(String[] args) {
		// �Ű����� ���� �� �� ���� �Լ��� �������̽�
		MyFunctionInterface01 fi;
		
		fi = () -> {
			String str = "Method call1";
			System.out.println(str);
		};
		fi.method();
		
		// �� ��° ���
		fi = () -> { System.out.println("Method call2"); };
		fi.method();
		
		// �� ��° ���
		fi = () -> System.out.println("Method call3");
		fi.method();
		
		//=================================================
		
		InterfaceUseVal iuv; // �Ű������� �ϳ� �̻��� �Լ��������̽�
		
		iuv = (x, y) -> { // ���� x�� ����
			int result = (x*y);
			System.out.println(result);
		};
		iuv.method(5, 5);
		
		// Ȥ��
		iuv = (x, y) -> System.out.println(x*y);
		iuv.method(4, 5);
		
		//=================================================
		InterfaceUseReturn iur; // ���ϰ��� �ִ� �������̽�
		
		// ù ��° ���
		iur = (x, y) -> x + y;
		int result = iur.method(5, 7);
		System.out.println(result);
		
		// �� ��° ���
		iur = (x, y) -> {
			int result2;
			result2 = x+y;
			
			return result2;
		};
		System.out.println(iur.method(10, 30));
	}
}
