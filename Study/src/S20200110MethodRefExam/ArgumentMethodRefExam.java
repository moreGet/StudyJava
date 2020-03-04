package S20200110MethodRefExam;

import java.util.function.ToIntBiFunction;

public class ArgumentMethodRefExam {

	public static void main(String[] args) {
		ToIntBiFunction<String, String> function;
		
		function = (a, b) -> a.compareToIgnoreCase(b); // innoreCase�� ��ҹ��� �������� ���Ѵ�.
		print(function.applyAsInt("Java8", "JAVA8"));
		
		function = String :: compareToIgnoreCase; // �ν��Ͻ� �޼ҵ� ȣ��
		// ������ ������ a�� b���� �������� ����, �ƴϸ� ���, �����ϴٸ� 0�� ���Ͻ�Ų��.
		print(function.applyAsInt("Java8", "JAVA8"));
	}
	
	public static void print(int order) {
		if( order<0 ) { System.out.println("���������� ���� �ɴϴ�."); }
		else if( order==0 ) { System.out.println("������ ���ڿ��Դϴ�."); }
		else { System.out.println("���������� ���߿� �ɴϴ�."); }
	}
}
