package threads.beepprint;

public class BeefPrintTest2 {

	public static void main(String[] args) {
/*
		//beepTask 객체 생성
		Runnable beepTask = new BeepTask();
		//작업 스레드 객체 생성 
		Thread thread = new Thread(beepTask);
		thread.start();// 스레드 시작(실행함)
*/
		for(int i=1;i<=5;i++) {
			System.out.println("띵");
			try {
				Thread.sleep(1000); // 1000 = 1s
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
		}
	}

}
