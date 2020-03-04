package S20191226;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		TreeSet<Integer> ascTreeSet = new TreeSet<Integer>();
		TreeSet<Integer> easySortTreeSet = new TreeSet<Integer>();
		
		treeSet.add(new Integer(87));
		treeSet.add(new Integer(98));
		treeSet.add(new Integer(75));
		treeSet.add(new Integer(95));
		treeSet.add(new Integer(80));
		
		// �÷��� ���縦 ���� ���� ����
		ascTreeSet = (TreeSet<Integer>) treeSet.clone();
		easySortTreeSet = (TreeSet<Integer>) ascTreeSet.clone();
		Integer score = null;
		
		score = treeSet.first();
		System.out.println("���� ���� ���� : " + score);
		
		score = treeSet.last();
		System.out.println("���� ���� ���� : " + score);
		
		score = treeSet.floor(new Integer(98));
		System.out.println("98�� �̰ų� �ٷ� �Ʒ� ���� : " + score);
		
		score = treeSet.ceiling(new Integer(95));
		System.out.println("95�� �̰ų� �ٷ� �� ���� : " + score);
		
		System.out.print("�������� : ");		
		while (!treeSet.isEmpty()) {
			System.out.print(treeSet.pollLast() + " ");
		}
		
		System.out.println();
		
		System.out.print("�������� : ");
		while (!ascTreeSet.isEmpty()) {
			System.out.print(ascTreeSet.pollFirst() + " ");
		}
		
		// ���� �����ϱ�.
		// ����
		NavigableSet<Integer> descTree = easySortTreeSet.descendingSet();
		// ����
		NavigableSet<Integer> ascTree = descTree.descendingSet();
		
		System.out.println();
		System.out.print("NavigableSet �� �̿��� �������� : ");
		for (Integer integer : ascTree) {
			System.out.print(integer + " ");
		}
		
		System.out.println();
		System.out.print("NavigableSet �� �̿��� �������� : ");
		for (Integer integer : descTree) {
			System.out.print(integer + " ");
		}
	}

}
