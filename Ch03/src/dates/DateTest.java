package dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {

		/*
		 * Date 객체
		 * Date 함수 호출
		 * SimpleDateFormat 함수 호출
		 * 날짜/시간 포멧 - "yyyy/MM/dd hh:mm:ss a" 출력
		 * 
		 */
		
		
		// Date 객체
		Date date = new Date();
		System.out.println(date);
		
		
		// 날짜/시간 포멧 - "yyyy/MM/dd hh:mm:ss a"
		// H: 24시 h: 12시, M: 월, m: 분
		SimpleDateFormat now = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss a");
		System.out.println(now.format(date));
		
		
	}

}
