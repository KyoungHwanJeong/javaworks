package dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest_3 {

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
		
		SimpleDateFormat simdate = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(simdate.format(date));
		
	}

}
