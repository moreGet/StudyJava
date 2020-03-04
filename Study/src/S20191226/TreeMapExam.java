package S20191226;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		treeMap.put(1, "홍");
		treeMap.put(2, "김");
		treeMap.put(4, "박");
		treeMap.put(5, "임");
		treeMap.put(6, "최");
		treeMap.put(7, "신");
		treeMap.put(8, "이");
		
		Map.Entry<Integer, String> mapEntry = null;
		
		mapEntry = treeMap.firstEntry(); // 첫번째 값
		System.out.println(mapEntry.getKey() + " : " + mapEntry.getValue());
		
		mapEntry = treeMap.floorEntry(3); // Key값이 3이거나 바로 아래 값(더 작은 값)
		System.out.println(mapEntry.getKey() + " : " + mapEntry.getValue());
		
		mapEntry = treeMap.ceilingEntry(3); // Key값이 2이거나 바로 윗 값(더 큰 값)
		System.out.println(mapEntry.getKey() + " : " + mapEntry.getValue());
		
		// 맵 Key값 기준 Sort
		NavigableMap<Integer, String> descMap = treeMap.descendingMap(); // 내림차순
		NavigableMap<Integer, String> ascMap = descMap.descendingMap(); // 오름차순
		
		// Set값 받아오기
		Set<Map.Entry<Integer, String>> descMapSet = descMap.entrySet();
		Set<Map.Entry<Integer, String>> ascMapSet = ascMap.entrySet();
		
		// 출력
		System.out.println();
		System.out.println("for 문으로 TreeMap 출력하기(내림, 오른차순)");
		for (Map.Entry<Integer, String> temp : descMapSet) {
			System.out.println(temp.getKey() + "/" + temp.getValue());
		}
	
		System.out.println();
		
		// 오른차순 출력
		for (Map.Entry<Integer, String> temp : ascMapSet) {
			System.out.println(temp.getKey() + "/" + temp.getValue());
		}
		
		System.out.println();
		System.out.println("데이터 꺼내기");
		while (!treeMap.isEmpty()) {
			System.out.print("꺼낸 데이터 : " + treeMap.pollFirstEntry());
			System.out.println();
			System.out.print("남은 데이터 : " + treeMap.size());
		}
	}
}