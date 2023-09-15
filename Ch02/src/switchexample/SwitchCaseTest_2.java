package switchexample;

import java.util.Scanner;

public class SwitchCaseTest_2 {

	public static void main(String[] args) {
		// 랭킹에 따른 메달 출력
		// 1 - 금메달, 2 - 은메달, 3 - 동메달
		// 변수 - rank
		
		while(true) {
			System.out.println("랭킹을 입력(1 ~ 3): ");
			Scanner scan = new Scanner(System.in);
			int rank = scan.nextInt();
			
			if(rank < 1 || rank > 3) {
				System.out.println("잘못 입력하셨습니다.");
			}else {
				switch(rank) {
				case 1:		// 콜론으로 끝남
					System.out.println("금메달입니다.");
					break;
				case 2:
					System.out.println("은메달입니다.");
					break;
				case 3:
					System.out.println("동메달입니다.");
					break;
				default:	// case에 없는 경우 처리
					System.out.println("메달이 없습니다.");
					break;
				}
			}
		}
	}

}
