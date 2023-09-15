package input;

import java.util.Scanner;



public class BonusPointTest {
	
/*	
	private static int BonusPoint(int price, double bonusRatio) {	// 구매포인트 함수

		int bonusPoint =(int)(price * bonusRatio);// 정수형으로 강제 형변환
		return bonusPoint;
	}
*/	
	

	public static void main(String[] args) {

		// 고객의 이름과 구매 금액을 입력
		// 이름과 구매 포인트를 출력
		// 구매포인트(bonusPoint) = 상품가격(price) * 포인트적립율(bonusRatio)
		
		// 입력
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("고객의 이름을 입력하세요: ");
		
		String customer = sc.nextLine();			// 사용자 이름을 입력
		
		
		System.out.println("구매 금액을 입력하세요: ");
		int price = sc.nextInt();					// 사용자가 금액을 입력
		int bonusPoint = 0;
		double bonusRatio = 0.02;
		
		// 계산 처리
		bonusPoint = (int)(price * bonusRatio);		// 정수형으로 강제 형변환
		
		// 출력
/*		System.out.println(customer +" 님의 보너스 포인트는 " 
								+ BonusPoint(price, bonusRatio) + " 점 입니다.");
		
*/
		System.out.println(customer +" 님의 보너스 포인트는 " 
				+ bonusPoint + " 점 입니다.");


		
		
		sc.close();
		
		
		System.out.println();
		
	}


	
}
