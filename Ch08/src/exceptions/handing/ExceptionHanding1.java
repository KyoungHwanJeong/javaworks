/*
 * 예외처리하기.
 * 1. 문자열의 길이를 출력하는 printLength 함수에 데이터를 받아 출력한다.
 *  데이터는 "지하철" 과 null 문자열을 받는다.
 * 
 * 
*/

package exceptions.handing;

public class ExceptionHanding1 {

	public static void printLength(String data) {
		int count = data.length();	// 글자 수 세는 함수
		System.out.println("문자 수:" + count);
	}
	
	public static void main(String[] args) {
		
		System.out.println("[프로그램 시작]\n");
		
		printLength("지하철");
		printLength(null);			// 에러 발생!
		
		System.out.println("[프로그램 종료]\n");

	}
}
