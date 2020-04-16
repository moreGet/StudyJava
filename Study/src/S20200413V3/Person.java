package S20200413V3;

public class Person {

	private String name;
	
	public Person(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
}
