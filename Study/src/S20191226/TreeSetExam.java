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
		
		// 컬렉션 복사를 위한 깊은 복사
		ascTreeSet = (TreeSet<Integer>) treeSet.clone();
		easySortTreeSet = (TreeSet<Integer>) ascTreeSet.clone();
		Integer score = null;
		
		score = treeSet.first();
		System.out.println("가장 낮은 점수 : " + score);
		
		score = treeSet.last();
		System.out.println("가장 높은 점수 : " + score);
		
		score = treeSet.floor(new Integer(98));
		System.out.println("98점 이거나 바로 아래 점수 : " + score);
		
		score = treeSet.ceiling(new Integer(95));
		System.out.println("95점 이거나 바로 윗 점수 : " + score);
		
		System.out.print("내림차순 : ");		
		while (!treeSet.isEmpty()) {
			System.out.print(treeSet.pollLast() + " ");
		}
		
		System.out.println();
		
		System.out.print("오름차순 : ");
		while (!ascTreeSet.isEmpty()) {
			System.out.print(ascTreeSet.pollFirst() + " ");
		}
		
		// 쉽게 정렬하기.
		// 내림
		NavigableSet<Integer> descTree = easySortTreeSet.descendingSet();
		// 오름
		NavigableSet<Integer> ascTree = descTree.descendingSet();
		
		System.out.println();
		System.out.print("NavigableSet 을 이용한 오름차순 : ");
		for (Integer integer : ascTree) {
			System.out.print(integer + " ");
		}
		
		System.out.println();
		System.out.print("NavigableSet 을 이용한 내림차순 : ");
		for (Integer integer : descTree) {
			System.out.print(integer + " ");
		}
	}

}
