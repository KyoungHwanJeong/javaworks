package Back;

import java.util.Scanner;

public class chass {

	public static void main(String[] args) {

		// 백준 체스 3003번 문제.
		int king = 1;
		int queen = 1;
		int rook = 2;
		int bishop = 2;
		int knight = 2;
		int pawn = 8;
		int count = 0;
		int result;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("king의 개수를 입력하세요: ");
		int kingNum = scanner.nextInt();

		//king = king - kingNum;

		if(kingNum <= 16) {
			king = king - kingNum;
			System.out.println("king은 " + king + "개 필요합니다.");
		}else {
			System.out.println("잘못된 값을 입력하셨습니다.");
		}
		
		
		System.out.println("queen의 개수를 입력하세요: ");
		int queenNum = scanner.nextInt();

		if(queenNum <= 16) {
			queen = queen - queenNum;
			System.out.println("queen은 " + queen + "개 필요합니다.");
		}else {
			System.out.println("잘못된 값을 입력하셨습니다.");
		}
	}

}
