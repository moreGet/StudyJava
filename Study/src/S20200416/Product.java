package S20200416;

//�ֻ��� �θ� Ŭ���� Product<T, M>
public class Product<T, M> {
	
	private T kind; // ���׸� Ÿ�Ժ���
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