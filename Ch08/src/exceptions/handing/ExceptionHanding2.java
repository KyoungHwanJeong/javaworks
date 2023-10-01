/*
 * 예외처리하기
 * 1. 예외가 발생할 수 있는 부분을 try-catch 문으로 처리하기.
 * 2. null문자 예외는 NullPointerException을 쓴다.
 * 3. 에러 메시지 출력에는 e.getMessage 메서드 또는 e.printStackTrace
 *  메서드를 쓴다.
 * 
 * 
*/

package exceptions.handing;

public class ExceptionHanding2 {

	public static void printLength(String data) {
		
		//예외 처리(실행 예외 - 런타임 오류)
		try {
			//에러가 발생할 수 있는 영역
			int count = data.length();	// 글자 수 세는 함수
			System.out.println("문자 수:" + count);
		}catch(NullPointerException e) {
			//에러 처리 구문
			System.out.println(e.getMessage());
			e.printStackTrace();	// 경로를 추적해서 에러를 출력.
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("[프로그램 시작]\n");
		
		//printLength("지하철");
		printLength(null);			// 예외가 발생했지만 처리가 된다.
		
		System.out.println("[프로그램 종료]\n");

	}
}
