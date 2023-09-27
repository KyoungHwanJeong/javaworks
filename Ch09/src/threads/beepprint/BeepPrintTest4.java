package threads.beepprint;

import java.awt.Toolkit;

public class BeepPrintTest4 {

	public static void main(String[] args) {
	
		// 스레드를 람다식으로(함수형 프로그램)구현하기
		Thread thread = new Thread(() -> {
						// 람다식 : 매개변수가 없을 때(void) 소괄호 생략 불가.
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i=0;i<=5;i++) {
				toolkit.beep();
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		thread.start();
		
		for(int i=0;i<=5;i++) {
			System.out.println("띵");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
