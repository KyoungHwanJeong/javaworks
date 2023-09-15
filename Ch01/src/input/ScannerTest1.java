package input;

import java.util.Scanner;

public class ScannerTest1 {

	
	public static void main(String[] args) {
		// 입력 처리 - Scanner 클래스 사용
		// 문자열 - nextLine()
		// 숫자 - nextInt()
		
		Scanner scanner = new Scanner(System.in);	// 입력 Scanner 열기
		
		System.out.println("이름을 입력하세요: ");
		String name = scanner.nextLine();			// 문자열 입력
		
//		System.out.println("당신의 이름은 " + name + " 이군요!");
		
		
		System.out.println("나이를 입력하세요: ");
		int age = scanner.nextInt();
		System.out.println("이름 :" + name + ", 나이: "+ age);
		
		scanner.close();							// 입력 Scanner 닫기
		
		
		
	}
}
