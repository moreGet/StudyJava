package SBase0104;

public interface AbstractExam {
	// ���
	// ���� �� ���� �Ұ�, ����� ����.
	// Ÿ�� ����� = ��;
	public int TEST_VALUE = 10;
	public String TEST_STR_VALUE = "TEST";
	
	// �߻� �޼ҵ� {}�� ���ٸ� ���� Ŭ�������� �ݵ�� �����ؾ���
	public int getValue();
	public void setValue(int value);

	// ����Ʈ �޼ҵ�
	default void chkStrValue(String strTemp) {
		if(strTemp.equals("TEST")) {
			System.out.println("TEST �Դϴ�.");
		} else {
			System.out.println("TEST �ƴմϴ�.");
		}
	}

	// ���� �޼ҵ�
	static void showStrValue() {
		System.out.println(TEST_STR_VALUE);
	}
}