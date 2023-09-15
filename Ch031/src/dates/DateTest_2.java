package dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest_2 {

	public static void main(String[] args) {

		/*
		 * Date 객체
		 * Date 함수 호출
		 * SimpleDateFormat 함수 호출
		 * 날짜/시간 포멧 - "yyyy/MM/dd hh:mm:ss a" 출력
		 * 
		 */
		
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat date2 = new SimpleDateFormat("yyyy/MM/dd hh/mm/ss a");
		System.out.println(date2.format(date));
	}

}
