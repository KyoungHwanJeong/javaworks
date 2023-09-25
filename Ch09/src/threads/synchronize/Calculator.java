package threads.synchronize;

public class Calculator {

	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public void setMemory(int memory){
		this.memory=memory;
		
		try {
			Thread.sleep(2000);	//2초 대기
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//현재 스레드 이름
		System.out.println(Thread.currentThread().getName()
				+ " : " + this.memory);
	}
}
