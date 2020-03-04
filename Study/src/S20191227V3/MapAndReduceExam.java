package S20191227V3;

import java.util.Arrays;
import java.util.List;

import S20191227V2.Student;

//|                 Return Type                 |                                                                                       Method(Val)                                                                                      |   Sources  |
//|:-------------------------------------------:|:--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|:----------:|
//|                  Stream<T>                  | java.util.Collection.stream() java.util.Collection.parallelStream()                                                                                                                    | Collection |
//| Stream<T> IntStream LongStream DoubleStream | Arrays.stream(T[]),      Stream.of(T[]) Arrays.stream(int[]),    IntStream.of(int[]) Arrays.stream(long[]),   LongStream.of(long[]) Arrays.stream(double[]), DoubleStream.of(double[]) |    Array   |
//|                  IntStream                  | IntStream.range(int, int) IntStream.rangeClose(int, int)                                                                                                                               |  int range |
//|                  LongStream                 | LongStream.range(long, long) LongStream.rangeClosed(long, long)                                                                                                                        | long range |
//|                 Stream<Path>                | Files.find(Path, int, BiPredicate, FileVisitOption) Files.list(Path)                                                                                                                   |  Directory |
//|                Stream<String>               | Files.lines(Path, Charset) BufferedReader.lines()                                                                                                                                      |    File    |
//|      DoubleStream IntStream LongStream      | Random.doubles(...) Random.ints() Random.longs()                                                                                                                                       |   Random   |

// ������ ���� �� ��ó��
public class MapAndReduceExam {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("��", 30),
				new Student("��", 27),
				new Student("��", 30)
		);
		
		double avg = list.parallelStream()
				//�߰� ó��
				.mapToDouble(Student::getCode)
				//���� ó��
				.average()
				.getAsDouble();
		
		System.out.println(avg);
	}
}