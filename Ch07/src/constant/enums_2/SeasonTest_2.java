package constant.enums_2;

import java.util.Scanner;

/*
 * 열거형 상수 enum 사용하기
 * enum- 상수로 만들어진 집합(대문자 사용), private 이고, 
 * 			생성자를 가질 수 있다.
 * 
 * enum의 요소: 봄, 여름, 가을, 겨울
 * 1. 계절을 switch-case문으로 분리하여 출력하기.
 * 		이때 봄="1번째 계절", 여름="2번째 계절", 가을="3번째 계절"
 * 		,겨울="4번째 계절"을 출력하게 하기. 
 * 
*/

public class SeasonTest_2 {

	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
		System.out.println("현재 계절을 입력하세요: ");
		
		String nowSeason = scanner.nextLine();
		//System.out.println(season);
		
		Season_2 season;
		
		switch(nowSeason) {
		
		case "봄":
			season= Season_2.봄;
			System.out.println("현재 계절은 " + season + "입니다.");
			System.out.println(season + "은 1번째 계절");
			break;
			
		case "여름":
			season= Season_2.여름;
			System.out.println("현재 계절은 " + season + "입니다.");
			System.out.println(season + "은 2번째 계절");
			break;
			
		case "가을":
			season= Season_2.가을;		
			System.out.println("현재 계절은 " + season + "입니다.");
			System.out.println(season + "은 3번째 계절");
			break;
			
		case "겨울":
			season= Season_2.겨울;
			System.out.println("현재 계절은 " + season + "입니다.");
			System.out.println(season + "은 4번째 계절");
			break;
			
			default:
				System.out.println("해당하는 계절이 없습니다.");
			}
		scanner.close();
	}

}
