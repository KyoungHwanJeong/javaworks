package collection.queue;

public class MyQueueTest {

	public static void main(String[] args) {

		MyQueue queue = new MyQueue();
		
		// 자료 저장
		queue.enQueue("수박");
		queue.enQueue("배");
		
		
		// 자료를 삭제 및 출력
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		//System.out.println(queue.deQueue());
	}

}
