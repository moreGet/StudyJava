package S20200416;

// �θ� Ŭ������ Product<T, M> ���� �̱� ������ �ڽĵ� �� ������ ���׸� 
// Ÿ���� ���� �ؾ� �Ѵ�.
public class ChildProduct<T, M, C> extends Product<T, M> {

	// �ڽ� Ŭ������ ������ ���׸� Ÿ�� ����
	private C company;

	// Getter, Setter
	public C getCompany() {
		return company;
	}

	public void setCompany(C company) {
		this.company = company;
	}
}
