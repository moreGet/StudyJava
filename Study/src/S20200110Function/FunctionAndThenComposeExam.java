package S20200110Function;

import java.util.function.Function;
import S20200110AndThen.Address;
import S20200110AndThen.Member;

/*
 * Function�� Operator ������ �Լ��� �������̽��� ���� ������ �� ���� �������̽��� ����� ���� �Լ��� �������̽���
 * �Ű������� �Ѱ��ְ�, ���� ó�� ����� �����Ѵ�.
 */
public class FunctionAndThenComposeExam {

	public static void main(String[] args) {
		Function<Member, Address> functionA; // A�� ����� ��巹�� ��ü
		Function<Address, String> functionB; // B�� ��巹���� ���ڿ� ��ü
		Function<Member, String> functionAB; // AB�� �� A�� B �ΰ��� Member�� ���ڿ� ��ü�� ���� �Լ�
		String city; // ���ڿ� ��ȯ���� ���� ����

		functionA = m -> m.getAddress(); // A�� address�� ���ϹްԲ� �������̽� ����
		functionB = a -> a.getCity(); // city�� ���ϹްԲ� �������̽� ����

		functionAB = functionA.andThen(functionB); // A�� ���� B�� �ѱ��� B���� ����ó��
		city = functionAB.apply(new Member("ȫ�浿", "hong", new Address("�ѱ�", "����"))); // A��ü���� address�� �޾Ұ� �̸� ���� B�� city�� ������
		System.out.println("���� ���� : " + city); // B���� ����ó�� �Ѱ���� ���ڿ��� city�� ��ȯ����

		functionAB = functionB.compose(functionA); // A�� ���� B�� �ѱ��� B���� ����ó��
		city = functionAB.apply(new Member("ȫ�浿", "hong", new Address("�ѱ�", "����"))); //
		System.out.println("���� ���� : " + city);
		
		/*
		 * andThen�� A.andThen(B) �� A -> B -> B ����ó��
		 * compose�� A.compose(B) �� B -> A -> A ����ó��
		 * ���� �ݴ�� ó���Ѵ�.
		 */
	}

}
