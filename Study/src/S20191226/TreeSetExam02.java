package S20191226;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExam02 {

	public static void main(String[] args) {
		// 영단어 Tree Set
		TreeSet<String> wordTreeSet = new TreeSet<String>();
		
		wordTreeSet.add("apple");
		wordTreeSet.add("banana");
		wordTreeSet.add("oop");
		wordTreeSet.add("java");
		wordTreeSet.add("python");
		wordTreeSet.add("cherry");
		
		System.out.println("c ~ z 단어 검색");
		// treeSet에 저장된 단어들 줄 c와 z 사이의 단어들을 추출(c와 z포함)
		NavigableSet<String> rangeSet = wordTreeSet.subSet("c", true, "z", true);
		
		for (String string : rangeSet) {
			System.out.println(string);
		}
	}
}