package S20200413V2;

public class Util {
	
	public static <K, V> boolean compare(Pair<K, V> o1, Pair<K, V> o2) {
		
		boolean keyCompare = o1.getKey().equals(o2.getKey());
		boolean valueCompare = o1.getValue().equals(o2.getValue());
		
		return keyCompare && valueCompare;
	}
}