package ifexample;

import java.util.Scanner;

public class MaxNumber {

	public static void main(String[] args) {

		
		// 두 수중 큰 값을 찾는 프로그램
		// 변수 - n1, n2, max
		
		int n1, n2;
		int 최대값;				// 한글이름 선언
		
		
		System.out.println("첫 번째 정수를 입력하세요: ");
		Scanner scan1 = new Scanner(System.in);
		n1= scan1.nextInt();
		
		System.out.println("두 번째 정수를 입력하세요: ");
		Scanner scan2 = new Scanner(System.in);
		n2= scan2.nextInt();
		
/*		
		// 연산 1. if ~else구문
		if(n1 >= n2) {		// n1 > n2 || n1 == n2
			최대값 = n1;
		}else {				// n1 < n2
			최대값 = n2;
		}
		
		// 연산 2. 조건 연산자
		int maxNum = (n1 >= n2) ? n1 : n2;
		
		
		// 출력
		System.out.println("두 수중 큰 값은 " + 최대값 + "입니다.");
		System.out.println("두 수중 큰 값은 " + maxNum + "입니다.");
*/		
		
		System.out.println("두 수중 큰 값은 " + MaxNumberCalc.maxNumberCal(n1, n2) + "입니다.");
	
		
		scan1.close();
		scan2.close();
	}


}
