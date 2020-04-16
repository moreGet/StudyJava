package S20200416;

//최상위 부모 클래스 Product<T, M>
public class Product<T, M> {
	
	private T kind; // 제네릭 타입변수
	private M model;
	
	// Getter, Setter
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
}

class Tv{}