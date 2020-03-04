package S20200110Predicate;

import java.util.function.BinaryOperator;

public class OperatorMinMaxExam {
	
	public static void main(String[] args) {
		BinaryOperator<Fruit> binaryOperator;
		Fruit fruit;
		
		// �ּڰ� ���ϱ�
		binaryOperator = BinaryOperator.minBy( (f1, f2) -> Integer.compare(f1.getPrice(), f2.getPrice()) );
		fruit = binaryOperator.apply(new Fruit("����", 6000), new Fruit("����", 10000));
		System.out.println(fruit.getKind());
		
		// �ִ� ���ϱ�
		binaryOperator = BinaryOperator.maxBy( (f1, f2) -> Integer.compare(f1.getPrice(), f2.getPrice()) );
		fruit = binaryOperator.apply(new Fruit("����", 6000), new Fruit("����", 10000));
		System.out.println(fruit.getKind());
	}
}
