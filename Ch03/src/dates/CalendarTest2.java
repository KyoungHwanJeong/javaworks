package dates;

import java.util.Calendar;

public class CalendarTest2 {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();	// static
		
		// 지나온 시간 측정
		//1970. 1. 1 자정 이후부터 측정 - 밀리초
		// 유닉스 시스템 소프트웨어 개시된 시간
		// 1/1억(ns) > 1/백만(마이크로초) > 1/1000초(ms) > s(1초)
		//System.out.println(24*60*60*1000);
		
		long passedTime = cal.getTimeInMillis();
		System.out.println(passedTime);
		
		// 밀리 초를 일로 환산		
		passedTime = passedTime/(24*60*60*1000);
		System.out.println(passedTime + "일");
		
		// 시작일, 종료일을 설정
		Calendar startDay = Calendar.getInstance();	// 시작일 설정
		Calendar toDay = Calendar.getInstance();	// 종료일 설정
		
		startDay.set(2023, 9, 1);
		toDay.set(2023, 9, 15);
		
		// 시작일과 종료일의 차를 초로 계산
		long betweenTime = toDay.getTimeInMillis() - startDay.getTimeInMillis();
		
		// 일로 환산
		betweenTime=betweenTime/(24*60*60*1000);
		System.out.println(betweenTime + "일이 지났습니다.");
		
		// 현재 까지의 시간(밀리초)
		System.out.println(System.currentTimeMillis());
		//System.out.println(System.nanoTime());
		
		// 현재 까지의 시간(나노초)
		System.out.println(System.nanoTime());
		
	}

}
