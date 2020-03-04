package S20200110AndThen;
/*
 * Consumer의 순차적 연결
 */

import java.util.function.Consumer;

//|   종류   |  함수적 인터페이스  | andThen() | compose() |
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
 * 디폴트 및 정적 메소드는 추상 메소드가 아니기 때문에 함수적 인터페이스에 선언되어도 여전히 함수적 인터페이스의
 * 성질을 잃지 않는다(하나의 추상메소드 그리고 람다식 으로 익명구현 객체를 생성 가능한)
 * Consumer, Function, Operator 종류의 함수적 인터페이스는 andThen()과 compose() 디폴트 메소드를 가지고 잇다.
 * 함수적 인터페이스를 순차적으로 연결하고 첫번째 처리 결과를 두 번째 매개값으로ㅗ 제공해서 최종 결 과값을 얻을때 사용한다.
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
		consumerAB.accept(new Member("홍길동", "hong", null));
	}
}