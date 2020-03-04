package S20191226V4;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExam {

	public static void main(String[] args) {
		// Queue�� LinkedList�� �̿��� ���� �Ѵ�.
		Queue<Message> msgQueue = new LinkedList<Message>();
		
		// offer �޼ҵ带 �̿��� Queue�� ��� �ױ�
		msgQueue.offer(new Message("sendMail", "ȫ"));
		msgQueue.offer(new Message("sendSMS", "��"));
		msgQueue.offer(new Message("sendKakaotalk", "��"));
		
		while (!msgQueue.isEmpty()) {
			// poll() �޼ҵ�� ��Ҹ� ������ �ʰ� Queue���� �̾Ƹ� ��
			// peek() �޼ҵ�� ��Ҹ� ����� Queue���� �̾ƿ� 
			Message message = msgQueue.poll();
			switch (message.getCommand()) {
			case "sendMail":
				System.out.println(message.getTo() + " �Կ��� MSG ����.");
				break;
			case "sendSMS":
				System.out.println(message.getTo() + " �Կ��� SMS ����.");
				break;
			case "sendKakaotalk":
				System.out.println(message.getTo() + " �Կ��� ī�� ����.");
				break;
			default:
				break;
			}
		}
	}
}