package collection.queue_2;

public class Message {

	String command;	// 수행 방법
	String to;		// 수행 대상
	
	public Message(String command, String to) {
		this.command=command;
		this.to=to;
	}
}
