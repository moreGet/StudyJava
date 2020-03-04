package S20191226;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		treeMap.put(1, "ȫ");
		treeMap.put(2, "��");
		treeMap.put(4, "��");
		treeMap.put(5, "��");
		treeMap.put(6, "��");
		treeMap.put(7, "��");
		treeMap.put(8, "��");
		
		Map.Entry<Integer, String> mapEntry = null;
		
		mapEntry = treeMap.firstEntry(); // ù��° ��
		System.out.println(mapEntry.getKey() + " : " + mapEntry.getValue());
		
		mapEntry = treeMap.floorEntry(3); // Key���� 3�̰ų� �ٷ� �Ʒ� ��(�� ���� ��)
		System.out.println(mapEntry.getKey() + " : " + mapEntry.getValue());
		
		mapEntry = treeMap.ceilingEntry(3); // Key���� 2�̰ų� �ٷ� �� ��(�� ū ��)
		System.out.println(mapEntry.getKey() + " : " + mapEntry.getValue());
		
		// �� Key�� ���� Sort
		NavigableMap<Integer, String> descMap = treeMap.descendingMap(); // ��������
		NavigableMap<Integer, String> ascMap = descMap.descendingMap(); // ��������
		
		// Set�� �޾ƿ���
		Set<Map.Entry<Integer, String>> descMapSet = descMap.entrySet();
		Set<Map.Entry<Integer, String>> ascMapSet = ascMap.entrySet();
		
		// ���
		System.out.println();
		System.out.println("for ������ TreeMap ����ϱ�(����, ��������)");
		for (Map.Entry<Integer, String> temp : descMapSet) {
			System.out.println(temp.getKey() + "/" + temp.getValue());
		}
	
		System.out.println();
		
		// �������� ���
		for (Map.Entry<Integer, String> temp : ascMapSet) {
			System.out.println(temp.getKey() + "/" + temp.getValue());
		}
		
		System.out.println();
		System.out.println("������ ������");
		while (!treeMap.isEmpty()) {
			System.out.print("���� ������ : " + treeMap.pollFirstEntry());
			System.out.println();
			System.out.print("���� ������ : " + treeMap.size());
		}
	}
}