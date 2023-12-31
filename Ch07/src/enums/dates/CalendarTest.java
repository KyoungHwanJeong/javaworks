package enums.dates;

import java.util.Calendar;

/*
 * Calendar 함수
 * 1. Calendar 함수 출력하기
 * 2. 년 출력하기
 * 3. 월 출력하기
 * 4. 일 출력하기
 * 5. 요일 출력하기
 * 6. 시, 분, 초 출력하기
 * 
 */

public class CalendarTest {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		System.out.println(cal.toString());
		
		// 연도
		int year = cal.get(Calendar.YEAR);
		System.out.println(year + "년");
		System.out.println(cal.get(Calendar.YEAR) + "년");
		
		// 월(배열 인덱스 기준 - 0: 1월)
		int month = cal.get(Calendar.MONTH)+1;
		System.out.println(month +"월");
		System.out.println((cal.get(Calendar.MONTH)+1) +"월");
		
		// 일(date)
		int date = cal.get(Calendar.DATE);
		System.out.println(date + "일");
		
		// 요일(day) - 1:일, 2:월, ... 6:금, 7:토
		int day = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(day);
		
		String[] days = {"일요일", "월요일", "화요일", "수요일", "목요일"
				, "금요일", "토요일"};
		//System.out.println(days[0]);
		System.out.println("오늘의 요일은 " + (days[day-1]) +"입니다.");
		
		
		// 시간
		System.out.print(" " + cal.get(Calendar.HOUR) + "시");
	
		// 분
		System.out.print(" " + cal.get(Calendar.MINUTE) + "분");
			
		// 초
		System.out.println(" " + cal.get(Calendar.SECOND) + "초");
		
		
	}

}
