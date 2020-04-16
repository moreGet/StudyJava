package S20200413V3;

public class Course<T> {
	private String name;
	private T[] students;
	
	// 생성자
	public Course(String name, int capacity) {
		this.name = name;
		
		/*
		 * 타입 파라미터로 배열 생성시엔
		 * new T[n]형태로 생성이 불가하다.
		 * (T[])(new Object[n]) 형태로 생성 해야 한다.
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
		
		// 빈 배열을 찾아 요소를 삽입 해준다.
		for(int i=0; i<students.length; i++) {
			if (students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
}
