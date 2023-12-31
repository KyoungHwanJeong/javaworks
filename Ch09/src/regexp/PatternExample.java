/*
 * 정규 표현식 이용하기.(Pattern.matches를 이용)
 * 
 * 
 * 
*/

package regexp;

import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args) {

		// 전화 번호 형식 검증하기 - 경로 슬래시와 구분을 위해서 한개 더 붙임
		// '\d'는 [0-9]와 같음, {3,4} - 최소 3개, 최소 4개와 같음
		
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String phone = "010-1234-5678";
		
		//matches()는 검증 결과를 true or false로 반환한다.
		boolean result = Pattern.matches(regExp, phone);
		
		//System.out.println(result);
		
		
		if(result) {	// result == true
			System.out.println("정규식과 일치합니다.");
		}else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		
		System.out.println("====================================");

		//계좌 번호
		regExp = "\\d{2}-\\d{3,4}";		// 숫자로 2개 - 숫자로 3~4개
		String account = "11-1234";
		result = Pattern.matches(regExp, account);
		
		if(result) {	// result == true
			System.out.println("계좌번호 형식과 일치합니다.");
		}else {
			System.out.println("계좌번호 형식이 아닙니다. 올바른 형식으로 입력해주세요.");
		}
	}

}
