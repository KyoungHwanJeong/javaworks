/*
 * 예외처리하기
 * 1. 예외가 발생할 수 있는 부분을 try-catch 문으로 처리하기.
 * 2. null문자 예외는 NullPointerException을 쓴다.
 * 3. 에러 메시지 출력에는 e.getMessage 메서드 또는 e.printStackTrace
 *  메서드를 쓴다.
 * 
 * 
*/

package exceptions.handing_2;

public class ExceptionHanding2 {

	public static void printLength(String str) {
		try {
		int result= str.length();
		System.out.println("문자열의 길이: "+ str);
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {

		System.out.print("프로그램의 시작\n");
		printLength("지하철");
		printLength(null);	// 에러 발생.
		
		System.out.print("프로그램의 종료\n");
	}

}
