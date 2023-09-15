package whileexample;

import java.util.Scanner;

public class KeyRepeat {

	public static void main(String[] args) {

		
		// 'y' 키 입력 -> "계속 반복합니다."
		// 'n' 키 입력 -> "반복을 중단합니다."
		// 그 외의 키 -> "키를 잘못 눌렀습니다."
		// 문자열 동등 비교 함수는 equals()
		
		String key ="y";
		String key2 ="n";
		
		Scanner scan = new Scanner(System.in);
			
		while(true) {
			
			System.out.println("키를 입력하세요(Y/N, y/n만 입력): ");

			String str = scan.nextLine();
			
		
			// equals() - 문자가 일치하는지 비교
				if(str.equals(key) || str.equals("Y")) {
				System.out.println("계속 반복합니다.");
			
			}else if(str.equals(key2) || str.equals("N")) {
				System.out.println("반복을 중단합니다.");
				break;

			}else {
				System.out.println("키를 잘못눌렀습니다.");

			}

		
		}
		scan.close();
		
	}	// main 함수 끝
	

}		// class 끝
