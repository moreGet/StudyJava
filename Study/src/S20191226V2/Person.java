package S20191226V2;

public class Person implements Comparable<Person>{

	private String name;
	private int age;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Person o) {
		
		if (age < o.age) {
			return -1;
		} else if(age == o.age) {
			return 0;
		} else {
			return 1;
		}
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
}