package enums.dates_2;

import java.util.ArrayList;
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

public class CalendarTest_2 {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		
		System.out.println("==========1==================");
		System.out.println(cal);
		
		System.out.println("==========2==================");
		System.out.println(cal.get(Calendar.YEAR) + "년");
		
		System.out.println("==========3==================");
		System.out.println((cal.get(Calendar.MONTH)+1) + "월");

		System.out.println("==========4==================");
		System.out.println(cal.get(Calendar.DATE) + "일");
		
		System.out.println("==========5==================");
		int week_Num = cal.get(Calendar.DAY_OF_WEEK);
		
		ArrayList<String> week = new ArrayList<>();
		week.add("일요일");
		week.add("월요일");
		week.add("화요일");
		week.add("수요일");
		week.add("목요일");
		week.add("금요일");
		week.add("토요일");

		System.out.println("오늘의 요일은 " + week.get(week_Num-1));
		
		System.out.println("==========6==================");
		
		int hour= cal.get(Calendar.HOUR_OF_DAY);
		int min= cal.get(Calendar.MINUTE);
		int sec= cal.get(Calendar.SECOND);
		
		System.out.printf("현재 시간은 %d시 %d분 %d초 입니다."
				, hour, min, sec);
		
	}

}
