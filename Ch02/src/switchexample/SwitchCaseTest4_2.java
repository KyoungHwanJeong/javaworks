package switchexample;

import java.util.Scanner;

public class SwitchCaseTest4_2 {

	public static void main(String[] args) {

		// 특정 월이 몇일 까지 있는지 출력
		// 변수 - month, day,
		// 31 days - 1, 3, 5, 7, 8, 10, 12
		// 30 days - 4, 6, 9, 11
		// 28 days - 2
		int day=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월을 입력하세요: ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			day= 31;
			break;
		case 4: case 6: case 9: case 11:
			day =30;
			break;
		case 2:
			day = 28;
			break;
			default:
				System.out.println("잘못된 입력입니다.");
				return;
		}
		System.out.println(month + "월은 " + day + "일까지 있습니다.");

	}

}
