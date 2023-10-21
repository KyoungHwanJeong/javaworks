/*
 * 정규 표현식 이용하기.(Pattern.matches를 이용)
 * 
 * 
 * 
*/

package regexp_2;

import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args) {

		System.out.println("=============1=======================");

		// 전화 번호
		String regExp = "(02 | 010) -\\d{3,4}-\\d{4}";
		String phone = "010-1234-5678";
		
		boolean result = Pattern.matches(regExp, phone);
		
		if(result) {
			System.out.println("정규식과 일치합니다.");
		}else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		
		System.out.println("=============2=======================");
		
		// 계좌 번호
		regExp = "\\d{2}-\\d{3,4}";	// 숫자 2개 - 숫자 3~4개
		String acccount = "11-1234";
		result = Pattern.matches(regExp, acccount);
		
		if(result) {
			System.out.println("계좌번호 형식과 일치합니다.");
		}else {
			System.out.println("계좌번호 형식이 아닙니다. 올바른 형식으로 입력해주세요.");
		}
	}

}
