package constant.enums;

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

public class SeasonTest {

	public static void main(String[] args) {
		
		Season season;
				
		season = Season.가을;		// 초기화
		
		//System.out.println(season);
		
		switch(season) {
		case 봄:
			season = Season.봄;
			System.out.println("1번째 계절");
			break;
		case 여름:
			season = Season.여름;
			System.out.println("2번째 계절");
			break;
		case 가을:
			season = Season.가을;
			System.out.println("3번째 계절");
			break;
		case 겨울:
			season = Season.겨울;
			System.out.println("4번째 계절");
			break;
			default:
				System.out.println("계절이 없습니다.");
				break;
			}
		
		System.out.println("현재 계절은 " + season + "입니다.");
	}
}
