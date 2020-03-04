package S20200123CustomCollect;

import java.util.Arrays;
import java.util.List;

public class MaleStudentExam {

	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("홍길동", 10, Student.Sex.MALE),
				new Student("김수애", 6, Student.Sex.FEMALE),
				new Student("신용권", 10, Student.Sex.MALE),
				new Student("박수미", 6, Student.Sex.FEMALE)
				);

		/*
		MaleStudent maleStudent = totalList.stream()
				.filter(s -> s.getSex() == Student.Sex.MALE)
				.collect(
						() -> new MaleStudent(),
						(r, t) -> r.accumulate(t),
						(r1, r2) -> r1.combine(r2));
		*/
		
		// 람다식 메소드 참조 형태
		MaleStudent maleStudent = totalList.stream()
				.filter(s -> s.getSex() == Student.Sex.MALE)
				.collect(MaleStudent :: new, MaleStudent :: accumulate, MaleStudent :: combine);
		
		maleStudent.getList().stream()
		.forEach(s -> System.out.println(s.getName()));
	}

}
