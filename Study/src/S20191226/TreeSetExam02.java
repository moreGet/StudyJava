package S20191226;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExam02 {

	public static void main(String[] args) {
		// ���ܾ� Tree Set
		TreeSet<String> wordTreeSet = new TreeSet<String>();
		
		wordTreeSet.add("apple");
		wordTreeSet.add("banana");
		wordTreeSet.add("oop");
		wordTreeSet.add("java");
		wordTreeSet.add("python");
		wordTreeSet.add("cherry");
		
		System.out.println("c ~ z �ܾ� �˻�");
		// treeSet�� ����� �ܾ�� �� c�� z ������ �ܾ���� ����(c�� z����)
		NavigableSet<String> rangeSet = wordTreeSet.subSet("c", true, "z", true);
		
		for (String string : rangeSet) {
			System.out.println(string);
		}
	}
}