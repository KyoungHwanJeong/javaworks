package constant.enums;

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
