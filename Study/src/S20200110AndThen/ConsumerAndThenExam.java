package S20200110AndThen;
/*
 * Consumer�� ������ ����
 */

import java.util.function.Consumer;

//|   ����   |  �Լ��� �������̽�  | andThen() | compose() |
//|:--------:|:-------------------:|:---------:|:---------:|
//| Consumer | Consumer<T>         |     O     |           |
//|          | BiConsumer<T, U>    |     O     |           |
//|          | DoubleConsumer      |     O     |           |
//|          | IntConsumer         |     O     |           |
//|          | LongConsumer        |     O     |           |
//| Function | Function<T, R>      |     O     |     O     |
//|          | BiFunction<T, U, R> |     O     |           |
//| Operator | BinaryOperator<T>   |     O     |           |
//|          | DoubleUnaryOperator |     O     |     O     |
//|          | IntUnaryOperator    |     O     |     O     |
//|          | LongUnaryOperator   |     O     |     O     |

/*
 * ����Ʈ �� ���� �޼ҵ�� �߻� �޼ҵ尡 �ƴϱ� ������ �Լ��� �������̽��� ����Ǿ ������ �Լ��� �������̽���
 * ������ ���� �ʴ´�(�ϳ��� �߻�޼ҵ� �׸��� ���ٽ� ���� �͸��� ��ü�� ���� ������)
 * Consumer, Function, Operator ������ �Լ��� �������̽��� andThen()�� compose() ����Ʈ �޼ҵ带 ������ �մ�.
 * �Լ��� �������̽��� ���������� �����ϰ� ù��° ó�� ����� �� ��° �Ű������Τ� �����ؼ� ���� �� ������ ������ ����Ѵ�.
 */

public class ConsumerAndThenExam {

	public static void main(String[] args) {
		Consumer<Member> consumerA = m -> {
			System.out.println("consumerA : " + m.getName());
		};
		
		Consumer<Member> consumerB = m -> {
			System.out.println("consumerB : " + m.getId());
		};
		
		Consumer<Member> consumerAB = consumerA.andThen(consumerB);
		consumerAB.accept(new Member("ȫ�浿", "hong", null));
	}
}