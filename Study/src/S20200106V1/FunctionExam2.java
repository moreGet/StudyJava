package S20200106V1;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class FunctionExam2 {

	private static List<Student> list = Arrays.asList( // List¸¦ ¸¸µê
			new Student("È«±æµ¿", 90, 96),
			new Student("½Å¿ë±Ç", 95, 93));
	
	public static double avg( ToIntFunction<Student> function ) { 
		int sum = 0;
		for (Student student : list) { // list¿¡¼­ stu°´Ã¼¸¦ »Ì¾Æ¿È
			sum += function.applyAsInt(student); // sum º¯¼ö¿¡ ´©Àû½ÃÅ´
		}
		
		double avg = (double) sum / list.size(); // Æò±Õ ±¸ÇÔ
		return avg;
	}
	
	public static void main(String[] args) {
		double engListAvg = avg( s -> s.getEngScore() );
		System.out.println("¿µ¾î Á¡¼ö Æò±Õ : " + engListAvg);
		
		double mathAvg = avg( s -> s.getMathScore() );
		System.out.println("¼öÇÐ Æò±Õ Á¡¼ö : " + mathAvg);
	}
}