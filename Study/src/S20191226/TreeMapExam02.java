package S20191226;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// SubSet 사용하기
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		treeMap.put(1, "홍");
		treeMap.put(2, "김");
		treeMap.put(4, "박");
		treeMap.put(5, "임");
		treeMap.put(6, "최");
		treeMap.put(7, "신");
		treeMap.put(8, "이");
		
		// treeMap 에서 2와 6포함 각 사이 값 엔트리 리턴
		NavigableMap<Integer, String> subMap = treeMap.subMap(2, true, 6, true);
		// set으로 treeMap 값 정렬
		Set<Map.Entry<Integer, String>> set = subMap.entrySet();
		
		System.out.println("Set으로 For문 돌림");
		for (Map.Entry<Integer, String> entry : set) {
			System.out.println(entry.getKey() + "/" + entry.getValue());
		}
		
		System.out.println();
		
		// 주어진 키보다 낮은 값들을 가져옴(2번째 인자 는 자신을 포함 하는지 안하는지.)
		NavigableMap<Integer, String> headMapEntry = treeMap.headMap(4, true);
		//treeMap.tailMap() 은 주어진 키보다 높은 값들을 가져옴
		
		System.out.println("Set으로 For문 돌림");
		for (Map.Entry<Integer, String> entry : headMapEntry.entrySet()) {
			
			System.out.println(entry.getKey() + "/" + entry.getValue());
		}
	}
}