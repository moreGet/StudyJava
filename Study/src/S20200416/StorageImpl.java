package S20200416;

public class StorageImpl<T> implements Storage<T>{
	
	private T[] array;
	
	public StorageImpl(int capacity) {
		// 타입 파라메터로 배열을 생성하려면 아래 양식대로 생성 해야 한다.
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
