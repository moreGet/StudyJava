package S20191226V4;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExam {

	public static void main(String[] args) {
		// Queue는 LinkedList를 이용해 구현 한다.
		Queue<Message> msgQueue = new LinkedList<Message>();
		
		// offer 메소드를 이용해 Queue에 요소 쌓기
		msgQueue.offer(new Message("sendMail", "홍"));
		msgQueue.offer(new Message("sendSMS", "신"));
		msgQueue.offer(new Message("sendKakaotalk", "신"));
		
		while (!msgQueue.isEmpty()) {
			// poll() 메소드는 요소를 지우지 않고 Queue에서 뽑아만 옴
			// peek() 메소드는 요소를 지우고 Queue에서 뽑아옴 
			Message message = msgQueue.poll();
			switch (message.getCommand()) {
			case "sendMail":
				System.out.println(message.getTo() + " 님에게 MSG 전송.");
				break;
			case "sendSMS":
				System.out.println(message.getTo() + " 님에게 SMS 전송.");
				break;
			case "sendKakaotalk":
				System.out.println(message.getTo() + " 님에게 카톡 전송.");
				break;
			default:
				break;
			}
		}
	}
}