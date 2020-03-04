package SBase;

public class VIP {

	private VIP() { } // �����ڿ� private���������ڸ� ��� �����ν� ������ ����� �Ұ��ϰ���
	
	private static class LazyHolder {
		public static final VIP INSTANCE = new VIP(); // ����Ŭ������ ������ ����
	}
	
	public static VIP getInstance() {
		return LazyHolder.INSTANCE; // get�޼ҵ�� �ν��Ͻ� ��ȯ ����(�ܺο��� �����ϰ� ���� ������)
	}
}