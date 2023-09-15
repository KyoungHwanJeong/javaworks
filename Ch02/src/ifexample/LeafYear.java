package ifexample;

import java.util.Scanner;

public class LeafYear {

	public static void main(String[] args) {

		// 윤년을 판정해주는 프로그램
		// 윤년 - 4년 마다 온다.(4의 배수 - 나머지 연산자 %)
		// 추가 조건 - 100 년 단위는 윤년이 아님(and 조건), 400 년 단위는 윤년입니다.(or 조건)
		// 변수 - year
		
		

		Scanner scan = new Scanner(System.in);
		
		// int year =2020;
		System.out.println("올해의 년도를 입력하세요: ");
		int year = scan.nextInt();	
		
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year+"년은 윤년입니다. ");
		}else {				// 나머지가 1,2,3인 경우
			System.out.println(year+"년은 평년입니다. ");
		}
		
		
		scan.close();
	}

}
