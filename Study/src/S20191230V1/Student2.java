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
	 * ���� Code���� ���ڰ����� �־��� Student ��ü�� code���� �� �� ���ڰ� ���� the value 0 if x == y;a
	 * value less than 0 if x < y; anda value greater than 0 if x > y ������ 0, x�� y����
	 * ������ ��������, x�� �� ũ�� ��� ����
	 */
	@Override
	public int compareTo(Student2 o) {
		// TODO Auto-generated method stub
		return Integer.compare(score, o.getScore());
	}
}
