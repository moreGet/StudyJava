package S20191227V1;

import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

import S20191226V4.Message;

// 동시처리를 위한 컬렉션
public class ConcurrentExam {

	public static void main(String[] args) {
		// 동시 처리용 Map
		Map<Integer, String> map = new ConcurrentHashMap<Integer, String>();
		map.put(1, "신");
		
		// 동시 처리용 Queue
		Queue<Message> msgQuene = new ConcurrentLinkedQueue<Message>();
		msgQuene.add(new Message("SMS", "신"));
	}
}