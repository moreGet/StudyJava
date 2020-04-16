package S20200413V2;

public class CompareMethodExam {

	public static void main(String[] args) {

		Pair<String, Object> o1 = new Pair<String, Object>();
		Pair<String, Object> o2 = new Pair<String, Object>();
		
		// o1 init
		o1.setKey("1");
		o1.setValue(1);
		
		// o2 init
		o2.setKey("2");
		o2.setValue(2);
		
		boolean compare = Util.compare(o1, o2);
		if (compare) {
			System.out.println("동등함");
		} else {
			System.out.println("동등하지 않음");
		}
	}
}