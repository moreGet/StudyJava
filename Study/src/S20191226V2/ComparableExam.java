package S20191226V2;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TreeSet에 객체 저장시 Comparable를 필수로 구현 해야 한다.
		// 이는 오름차순 으로 정렬 된다.
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		treeSet.add(new Person("신", 25));
		treeSet.add(new Person("김", 21));
		treeSet.add(new Person("박", 27));
		treeSet.add(new Person("최", 8));
		treeSet.add(new Person("이", 24));
		
		Iterator<Person> it = treeSet.iterator();
		
		while (it.hasNext()) {
			Person person = (Person) it.next();
			
			String name = person.getName();
			int age = person.getAge();
			System.out.println(name + "/" + age);
		}
	}
}