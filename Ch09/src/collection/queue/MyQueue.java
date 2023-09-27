package collection.queue;

import java.util.ArrayList;
import java.util.List;

public class MyQueue {

	
	// 필드
	private List<String> arrayQueue;
	
	// 생성자
	public MyQueue() {
		arrayQueue = new ArrayList<>();
		
	}
	
	
	//  자료 저장 - add()
	public void enQueue(String data) {
		arrayQueue.add(data);
		
	}
	
	// 자료 삭제 - remove() : 맨 앞에서 꺼낸다. 삭제하면 바로 뒤에 값이 0번으로 옴.
	// 자료가 출력 되면서 삭제 된다.
	public String deQueue() {
		int size = arrayQueue.size();
		if(size == 0) {
			System.out.println("큐가 비었습니다.");
			return null;
		}
		return arrayQueue.remove(0);
	}
	
}
