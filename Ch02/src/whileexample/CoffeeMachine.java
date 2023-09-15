package whileexample;

import java.util.Scanner;

public class CoffeeMachine {

	public static void main(String[] args) {
		
		
		// 커피 자동판매기 구현 프로그램
		// 커피 총 개수 - 5
		// 커피 값은 500원 투입하면 커피가 나옴
		// 500원을 초과하면 거스름 돈과 커피가 나옵니다.
		// 500원이 부족하면 커피가 안나옴
		// 커피가 다 떨어지면 "판매를 중단합니다" 출력 - 프로그램 종료
		int coffeeNum=5;
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("돈을 넣어주세요: ");
			int money = scan.nextInt();		// 돈을 입력
			
//*****************************************************************************
/*		
			if(money < 500) {
				System.out.println("현금이 부족합니다.");
			}else {
				System.out.println("커피가 나옵니다.");
				--coffeeNum;
				System.out.println("거스름돈은 "+ (money- 500) +"원 입니다.");
		
				
				if(coffeeNum == 0) {
					System.out.println("커피가 모두 소진 되었습니다. 판매를 중지합니다.");
					break;
					}
				}
*/			
			
			
//******************************************************************************
//******************************************************************************

			
			if(money == 500) {
				System.out.println("커피가 나옵니다.");
				coffeeNum -= 1; //coffee = coffee - 1
			}else if(money > 500) {
				System.out.println((money-500) + "원을 돌려주고 커피가 나옵니다.");
				coffeeNum -= 1;
			}else{
				System.out.println("커피가 나오지 않습니다.");
			}			
			if(coffeeNum == 0) {
				System.out.println("커피가 모두 소진되었습니다. 판매를 중지합니다.");
				break;
			}			
			
//******************************************************************************			
	
			System.out.println("남은 커피의 양은 "+ coffeeNum + " 개 입니다.");

		} // while 끝
		
		scan.close();

	} // main 끝

}