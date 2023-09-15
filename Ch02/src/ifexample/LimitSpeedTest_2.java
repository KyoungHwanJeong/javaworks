package ifexample;

import java.util.Scanner;

public class LimitSpeedTest_2 {

	public static void main(String[] args) {

		
		// if문
		// 제한 속도(limit speed) 50km이면 "제한 속도 위반"
		/*
		 * if(비교문){				// 비교문이 true이면 실행문을 실행한다.
		 * 			실행문;
		 * 	}else{					// false 이면 실행문2 실행한다.
		 *
		 * }
		 * 
		 */
		
		System.out.println("속도를 입력하세요: ");
		Scanner scan = new Scanner(System.in);
		int speed = scan.nextInt();
		
		System.out.println("현재 속도는 " + speed + " km/h 입니다.");
		
		if(speed > 50) {
			System.out.println("제한 속도 위반!");
		}else {
			System.out.println("안전속도 준수!");
		}
		
		scan.close();
	}

}
