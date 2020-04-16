package S20200416;

public class StorageImpl<T> implements Storage<T>{
	
	private T[] array;
	
	public StorageImpl(int capacity) {
		// Ÿ�� �Ķ���ͷ� �迭�� �����Ϸ��� �Ʒ� ��Ĵ�� ���� �ؾ� �Ѵ�.
		this.array = (T[])(new Object[capacity]);
	}
	
	@Override
	public void add(T item, int index) {
		array[index] = item;
	}
	
	@Override
	public T get(int index) {
		return array[index];
	}
}
