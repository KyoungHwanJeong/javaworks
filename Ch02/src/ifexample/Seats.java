package ifexample;

import java.util.Scanner;

public class Seats {

	public static void main(String[] args) {
		
		// 입장객 수에 따른 좌석 줄 수(행) 계산
		// 변수 - 고객 customer, 열 colunmn, 행 row
		
		System.out.println("입장객 수를 입력하세요: ");
		Scanner scan1 = new Scanner(System.in);
		int customer = scan1.nextInt();
		

		System.out.println("좌석 열 수를 입력하세요: ");
		Scanner scan2 = new Scanner(System.in);
		int column = scan2.nextInt();
		
		
//		int customer=20, column =5;
		int row = customer/ column;
		
		//연산처리	(if ~else 문)
	
/*			
		if(customer % column == 0) {	// 나누어 떨어지면
			row = customer/ column;		// row = 몫
		}else {							// 나머지가 있으면
			row = customer/ column +1;	//row = 몫 +1
		}
		System.out.println(row + "줄이 필요합니다.");
*/		
/*		
		if(customer>= column) {
			if(customer % column != 0) {
				int customer_remainer = customer % column;
				row += 1;
				
				System.out.println(row +"줄이 필요하고, " + customer_remainer + "자리가 남습니다.");

			}else {
				System.out.println(row + "줄이 필요합니다.");
			}
		}
*/		
		System.out.println(row +"줄이 필요하고, " + SeatsCalc.seatcal(customer, column)+ "자리가 남습니다.");
		
		scan1.close();
		scan2.close();
		
	}

}
