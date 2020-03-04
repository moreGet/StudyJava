package S20191226V2;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TreeSet�� ��ü ����� Comparable�� �ʼ��� ���� �ؾ� �Ѵ�.
		// �̴� �������� ���� ���� �ȴ�.
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		treeSet.add(new Person("��", 25));
		treeSet.add(new Person("��", 21));
		treeSet.add(new Person("��", 27));
		treeSet.add(new Person("��", 8));
		treeSet.add(new Person("��", 24));
		
		Iterator<Person> it = treeSet.iterator();
		
		while (it.hasNext()) {
			Person person = (Person) it.next();
			
			String name = person.getName();
			int age = person.getAge();
			System.out.println(name + "/" + age);
		}
	}
}