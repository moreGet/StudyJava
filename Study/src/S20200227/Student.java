package S20200227;

public class Student {

	private String name;
	private String path;
	private String address;
	private Integer age;
	
	public Student(String name, String path, String address, Integer age) {
		this.name = name;
		this.path = path;
		this.address = address;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
