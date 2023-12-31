package whileexample;

import java.util.Scanner;

public class CoffeeMachine_2 {

	public static void main(String[] args) {

		// 커피 자동판매기 구현 프로그램
		// 커피 총 개수 - 5
		// 커피 값은 500원 투입하면 커피가 나옴
		// 500원을 초과하면 거스름 돈과 커피가 나옵니다.
		// 500원이 부족하면 커피가 안나옴
		// 커피가 다 떨어지면 "판매를 중단합니다" 출력 - 프로그램 종료
		
		int coffeeNum = 5;
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			

			System.out.println("돈을 넣어주세요: ");
			int money = scan.nextInt();
			
			if(money < 500) {
				System.out.println("현금이 부족합니다.");
			}else {
				coffeeNum--;
				money -= 500;
				System.out.println("커피와 거스름 돈 " + money +" 원이 나옵니다.");
				
				if(coffeeNum ==0) {
					System.out.println("커피 재고가 소진되어 판매를 중단합니다.");
					break;
				}
			}
			System.out.println("남은 커피는 " + coffeeNum +"개 입니다.");


		}

		scan.close();
	}

}
