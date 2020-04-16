package S20200413V3;

import java.util.Arrays;

public class WildCardExample {
	
	public static void registerCourse( Course<?> course ) {
		System.out.println(course.getName() + " ������: " + 
			Arrays.toString(course.getStudents()));
	}

	public static void registerCourseStudent( Course<? extends Student> course ) {
		System.out.println(course.getName() + " ������: " + 
			Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseWorker( Course<? super Worker> course ) {
		System.out.println(course.getName() + " ������: " + 
			Arrays.toString(course.getStudents()));
	}
	
	public static void main(String[] args) {
		Course<Person> personCourse = new Course<Person>("�Ϲ��� ����", 5);
		personCourse.add(new Person("�Ϲ���"));
		personCourse.add(new Worker("������"));
		personCourse.add(new Student("�л�"));
		
		Course<Worker> workerCourse = new Course<Worker>("������ ����", 5);
		workerCourse.add(new Worker("������"));
		
		Course<Student> studentCourse = new Course<Student>("�л�����", 5);
		studentCourse.add(new Student("�л�"));
		studentCourse.add(new Student("����л�"));
		
		registerCourse(personCourse);
		registerCourseStudent(studentCourse);
		registerCourseWorker(workerCourse);
		System.out.println();
		
		// registerCourseWorker(studentCourse);
		// registerCourseStudent(workerCourse);
		System.out.println();
		
		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
	}
}
