package S20191226V4;

public class Message {
	
	private String command;
	private String to;
	
	public Message() {
		// TODO Auto-generated constructor stub
	}
	
	public Message(String command, String to) {
		this.command = command;
		this.to = to;
	}
	
	public String getCommand() {
		return command;
	}
	
	public String getTo() {
		return to;
	}
}
