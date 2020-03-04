package S20200110Predicate;

import java.util.function.BinaryOperator;

public class OperatorMinMaxExam {
	
	public static void main(String[] args) {
		BinaryOperator<Fruit> binaryOperator;
		Fruit fruit;
		
		// ÃÖ¼Ú°ª ±¸ÇÏ±â
		binaryOperator = BinaryOperator.minBy( (f1, f2) -> Integer.compare(f1.getPrice(), f2.getPrice()) );
		fruit = binaryOperator.apply(new Fruit("µþ±â", 6000), new Fruit("¼ö¹Ú", 10000));
		System.out.println(fruit.getKind());
		
		// ÃÖ´ñ°ª ±¸ÇÏ±â
		binaryOperator = BinaryOperator.maxBy( (f1, f2) -> Integer.compare(f1.getPrice(), f2.getPrice()) );
		fruit = binaryOperator.apply(new Fruit("µþ±â", 6000), new Fruit("¼ö¹Ú", 10000));
		System.out.println(fruit.getKind());
	}
}
