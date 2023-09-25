package constant.enums_2;

import java.util.Calendar;

/*
 * 열거형 상수 enum 사용하기
 * enum- 상수로 만들어진 집합(대문자 사용), private 이고, 
 * 			생성자를 가질 수 있다.
 *  
 * enum의 요소: 일요일 ~ 토요일
 * 1. 요일을 switch-case문으로 분리하여 오늘의 요일을 출력하기.
 * 2. 오늘의 요일이 일요일이면 "일요일에는 영화를 보러 갑니다."를 출력하고,
 * 	나머지 요일이면 "열심히 코딩을 합니다."를 출력한다.
 * 
 */

public class EnumWeek_2 {

	public static void main(String[] args) {

		Week_2 today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("==========1=====================");
		
		switch(week) {
			case 1:
				today = Week_2.SUNDAY; break;
			case 2:
				today = Week_2.MONDAY; break;
			case 3:
				today = Week_2.TUESDAY; break;
			case 4:
				today = Week_2.WEDNESDAY; break;
			case 5:
				today = Week_2.THURSDAY; break;
			case 6:
				today = Week_2.FRIDAY; break;
			case 7:
				today = Week_2.SATERDAY; break;
			default:
				System.out.println("해당 요일이 없습니다.");
		}
		System.out.println("오늘의 요일 :"+ today);

		System.out.println("==========2=====================");

		if(today == Week_2.SUNDAY) {
			System.out.println("일요일에는 영화를 보러 갑니다.");
		}else {
			System.out.println("열심히 코딩을 합니다.");
		}
	}

}
