package banking;

import java.util.Scanner;

public class Banking_2 {

	public static void main(String[] args) {

		// 은행 업무
				// 1. 예금 2. 출금 3. 잔고 4. 종료
				
				// 메뉴 화면 만들기
				/*
				 * 
				 * 
				 */
		
		
		Scanner sc= new Scanner(System.in);
		int balance=0, money=0;
		boolean sw = true;
		
		while(sw) {
			System.out.println("===================================");
			System.out.println("|1. 예금 | 2. 출금 | 3. 잔고 |4. 종료 |");
			System.out.println("===================================");
			
			int selNum=sc.nextInt();
			
			switch(selNum) {
			case 1:
				System.out.println("예금 금액을 입력하세요(만원): ");
				balance+=sc.nextInt();
				System.out.println("통장 잔고는 "+ balance +"만원 입니다.");
				break;
			case 2:
				System.out.println("출금 금액을 입력하세요(만원): ");
				money = sc.nextInt();

				if(balance<money) {
					System.out.println("통장 잔고가 부족합니다.");
				}else {
					balance -= money;
					System.out.println("통장 잔고는 "+ balance + "만원 입니다.");
				}
				break;
			case 3:
				System.out.println("통장 잔고는 "+ balance +"만원 입니다.");
				break;
			case 4:
				sw=false;
				break;
			default:
				System.out.println("잘못 된 입력입니다.");
				break;
			}
		}
		sc.close();
		System.out.println("기기를 종료합니다.");

	}

}
