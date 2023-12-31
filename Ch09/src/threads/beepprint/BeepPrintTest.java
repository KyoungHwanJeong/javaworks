package threads.beepprint;

import java.awt.Toolkit;

public class BeepPrintTest {

	public static void main(String[] args) {

		// 싱글 스레드 - 메인 스레드만 실행된다.
		// "띵" 문자를 5번 출력하기
		// Thread.sleep(1000) : + 1초 간격 - 대기 시간
		// 소리 발생 = Toolkit의 beep()

		Toolkit toolkit = Toolkit.getDefaultToolkit();

		for(int i=1;i<=5;i++) {
			System.out.println("띵");
			try {
				Thread.sleep(1000); // 1000 = 1s
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
		}
		
		
		// "띵" 소리를 5번 재생하기
		for(int i=1;i<=5;i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
