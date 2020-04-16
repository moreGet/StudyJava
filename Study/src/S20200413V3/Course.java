package S20200413V3;

public class Course<T> {
	private String name;
	private T[] students;
	
	// ������
	public Course(String name, int capacity) {
		this.name = name;
		
		/*
		 * Ÿ�� �Ķ���ͷ� �迭 �����ÿ�
		 * new T[n]���·� ������ �Ұ��ϴ�.
		 * (T[])(new Object[n]) ���·� ���� �ؾ� �Ѵ�.
		 */
		students = (T[]) (new Object[capacity]);
	}
	
	public String getName() {
		return name;
	}
	public T[] getStudents() {
		return students;
	}
	public void add(T t) {
		
		// �� �迭�� ã�� ��Ҹ� ���� ���ش�.
		for(int i=0; i<students.length; i++) {
			if (students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
}
