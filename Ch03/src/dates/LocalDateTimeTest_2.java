package dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeTest_2 {

	public static void main(String[] args) {

		/*
		 * LocalDateTime.now 클래스 사용
		 * 날짜/시간 포멧 설정 DateTimeFormatter 클래스 사용
		 * 날짜 포멧 설정 - "yyyy/MM/dd hh/mm/ss a"
		 * 날짜 설정 LocalDate 클래스 사용
		 * 시간 포멧 설정 - "HH:mm:ss a"
		 * 
		*/
		
		LocalDateTime time = LocalDateTime.now();
		System.out.println(time);
		DateTimeFormatter dtFormat= DateTimeFormatter.ofPattern("yyyy/MM/dd hh/mm/ss a");
		System.out.println(time.format(dtFormat));
		LocalDate date =LocalDate.now();
		System.out.println(date);
		LocalTime time2 = LocalTime.now();
		System.out.println(time2);
		
		DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm:ss a");
		System.out.println(time2.format(timeFormat));
	}

}
