package S20200123CustomCollect;

import java.util.ArrayList;
import java.util.List;

public class MaleStudent {
	private List<Student> list;
	
	public MaleStudent() {
		list = new ArrayList<Student>();
		
		// �����ڸ� ȣ���ϴ� ������ �̸�
		System.out.println("[" + Thread.currentThread().getName() + "] MaleStudent()");
	}
	
	// ��Ҹ� �����ϴ� �޼ҵ�
	public void accumulate(Student student) {
		list.add(student);
		
		// accumulate()�� ȣ���� ������ �̸�
		System.out.println("[" + Thread.currentThread().getName() + "] accumulate()");
	}
	
	// �� MaleStudent�� �����ϴ� �޼ҵ�(���� ó�� �ÿ��� ȣ��)
	public void combine(MaleStudent other) {
		list.addAll(other.getList());
		
		// combine()�� ȣ���� ������ �̸�
		System.out.println("[" + Thread.currentThread().getName() + "] combine()");
	}
	
	// ��Ұ� ����� �÷����� ����
	public List<Student> getList() {
		return list;
	}
}