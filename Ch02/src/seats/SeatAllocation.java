package seats;

import java.util.Scanner;

public class SeatAllocation {

	public static void main(String[] args) {

		
		/*
		 * ex 24명의 입장객을 입력 받아 5열에 배치하는 프로그램
		 * if ~ else문으로 행을 구한다.
		 * 
		*/
		
		
		// 자리 배치도
		// 변수 - customer(입장객 수), column(열), row(줄)
		// 
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("입장객 수를 입력하세요: ");
		int customer = scan.nextInt();
		
		System.out.print("좌석 열 수를 입력하세요: ");
		int column = scan.nextInt();
		
		int row;
		
		
		if(customer%column == 0) {
			row = customer/ column;
		}else {
			row = (customer/ column) + 1;
		}
		
		// 중첩 for
		for(int i=0; i<row;i++) {	
			for(int j=1; j<=column;j++) {
				int seatNum =column*i+j;
				if(seatNum > customer)
					break;
				System.out.printf("|좌석%3d\t", seatNum);
			}
			System.out.println();
		}
		
		scan.close();
	}

}
