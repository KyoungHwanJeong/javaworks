package dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeTest_3 {

	public static void main(String[] args) {

		/*
		 * LocalDateTime.now 클래스 사용
		 * 날짜/시간 포멧 설정 DateTimeFormatter 클래스 사용
		 * 날짜 포멧 설정 - "yyyy/MM/dd hh/mm/ss a"
		 * 날짜 설정 LocalDate 클래스 사용
		 * 시간 포멧 설정 - "HH:mm:ss a"
		 * 
		*/
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd hh/mm/ss a");
		System.out.println(now.format(dtFormatter));
		
//		LocalDate locatDate = 
		
		
	}

}
