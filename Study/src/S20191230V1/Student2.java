package S20191230V1;

public class Student2 implements Comparable<Student2> {

	private String name;
	private int score;

	public Student2(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	/**
	 * 본래 Code값과 인자값으로 주어진 Student 객체의 code값을 비교 후 인자값 리턴 the value 0 if x == y;a
	 * value less than 0 if x < y; anda value greater than 0 if x > y 같으면 0, x가 y보다
	 * 작으면 음수리턴, x가 더 크면 양수 리턴
	 */
	@Override
	public int compareTo(Student2 o) {
		// TODO Auto-generated method stub
		return Integer.compare(score, o.getScore());
	}
}
