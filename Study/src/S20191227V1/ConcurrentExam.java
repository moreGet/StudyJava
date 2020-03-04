package S20191227V1;

import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

import S20191226V4.Message;

// ����ó���� ���� �÷���
public class ConcurrentExam {

	public static void main(String[] args) {
		// ���� ó���� Map
		Map<Integer, String> map = new ConcurrentHashMap<Integer, String>();
		map.put(1, "��");
		
		// ���� ó���� Queue
		Queue<Message> msgQuene = new ConcurrentLinkedQueue<Message>();
		msgQuene.add(new Message("SMS", "��"));
	}
}