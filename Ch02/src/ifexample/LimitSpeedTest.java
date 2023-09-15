package ifexample;

import java.util.Scanner;

public class LimitSpeedTest {

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
/*		
		int limitSpeed = 65;
*/		
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("속도를 입력하세요: ");
		int limitSpeed = scan.nextInt();
	
		
		System.out.println("시속 "+ limitSpeed + " km 입니다.");
		
		
		// 단독 if문
/*		
		if(limitSpeed >= 50) {
			System.out.println("시속 " + limitSpeed + " km는 제한 속도 위반입니다."
											+ " 과태료 10만원 부과 대상!");
		}*/

		
		//if ~ else 구문
		
		if(limitSpeed >= 50) {
			System.out.println("시속 " + limitSpeed + " km는 제한 속도 위반입니다."
											+ " 과태료 10만원 부과 대상!");
		}else {				// limitSpeed < 50 가 생략되어 있다.
			System.out.println("안전 속도 준수!");
		}
		
		
		scan.close();

		
		
	}

}
