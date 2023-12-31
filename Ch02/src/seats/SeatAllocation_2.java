package seats;

import java.util.Scanner;

public class SeatAllocation_2 {

	public static void main(String[] args) {

		/* customerNum 입장객을 입력 받아 column 열에 배치하는 프로그램
		 * ex 24명의 입장객을 입력 받아 5열에 배치하는 프로그램
		 * 1. if ~ else문
		 * 2. 중첩 for문
		*/
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입장객 수를 입력하세요: ");
		int customerNum = sc.nextInt();
		System.out.println("열의 수를 입력하세요: ");
		int column = sc.nextInt();
		int row;
		
		if(customerNum%column == 0) {
			row = customerNum/column;
		}else {
			row = (customerNum/column)+1;
		}
		
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				int seatNum = i*column+j+1;
				if(seatNum>customerNum)
					break;
				System.out.printf("| 좌석%3d", seatNum);
			}
			System.out.println();
		}
		sc.close();
	}


}
