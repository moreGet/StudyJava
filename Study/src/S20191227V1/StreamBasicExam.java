package S20191227V1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamBasicExam {

	//Stream�� java8���� �߰��� �÷��� ��Ҹ� �ϳ��� �����ؼ� ���ٽ����� ó���� �� �ֵ��� ���ش�.
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("��");
		list.add("��");
		list.add("��");
		
		//for-each �̿�
		System.out.println("for-each");
		for (String string : list) {
			System.out.println(string);
		}
		
		System.out.println();
		
		//Iterator �̿�
		Iterator<String> it = list.iterator();
		System.out.println("Iterator");
		while (it.hasNext()) {
			String string = (String) it.next();
			System.out.println(string);
		}
		
		System.out.println();
		
		//stream �̿�
		System.out.println("Stream");
		Stream<String> stream = list.stream();
		stream.forEach(name -> System.out.println(name));
	}
}