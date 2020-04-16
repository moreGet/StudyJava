package S20200416;

// 부모 클래스가 Product<T, M> 형태 이기 때문에 자식도 이 형태의 제네릭 
// 타입을 포함 해야 한다.
public class ChildProduct<T, M, C> extends Product<T, M> {

	// 자식 클래스의 별도의 제네릭 타입 변수
	private C company;

	// Getter, Setter
	public C getCompany() {
		return company;
	}

	public void setCompany(C company) {
		this.company = company;
	}
}
