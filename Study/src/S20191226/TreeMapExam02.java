package S20191226;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// SubSet ����ϱ�
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		treeMap.put(1, "ȫ");
		treeMap.put(2, "��");
		treeMap.put(4, "��");
		treeMap.put(5, "��");
		treeMap.put(6, "��");
		treeMap.put(7, "��");
		treeMap.put(8, "��");
		
		// treeMap ���� 2�� 6���� �� ���� �� ��Ʈ�� ����
		NavigableMap<Integer, String> subMap = treeMap.subMap(2, true, 6, true);
		// set���� treeMap �� ����
		Set<Map.Entry<Integer, String>> set = subMap.entrySet();
		
		System.out.println("Set���� For�� ����");
		for (Map.Entry<Integer, String> entry : set) {
			System.out.println(entry.getKey() + "/" + entry.getValue());
		}
		
		System.out.println();
		
		// �־��� Ű���� ���� ������ ������(2��° ���� �� �ڽ��� ���� �ϴ��� ���ϴ���.)
		NavigableMap<Integer, String> headMapEntry = treeMap.headMap(4, true);
		//treeMap.tailMap() �� �־��� Ű���� ���� ������ ������
		
		System.out.println("Set���� For�� ����");
		for (Map.Entry<Integer, String> entry : headMapEntry.entrySet()) {
			
			System.out.println(entry.getKey() + "/" + entry.getValue());
		}
	}
}