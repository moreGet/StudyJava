package SBase;

public class SingleTone {

	// �̱��� ������ ���� ����
	// ������ �޸� ���� ������ ����ȭ�� ������� �޸� ���� ����
	// ���� �ν��Ͻ� �̱� ������ �ٸ� Ŭ������ �ν��Ͻ����� �����͸� �����ϱ� ����.

	// ������
	// �̱��� �ν��Ͻ��� ������ ���������� ����-��� ��Ģ�� �����ϰԵȴ�. (OOP�� ����)
	// LazyHolder ����� �̱��� ����� �ַ� �����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VIP Vipa = VIP.getInstance();
		VIP Vipb = VIP.getInstance();
		
		if (Vipa == Vipb) {
			System.out.println("�̱���");
		} else {
			System.out.println("�̱����� �ƴ�");
		}
	}
}
