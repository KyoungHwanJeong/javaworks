/*
 * 함수에서 throws로 던지고, 함수를 호출한 곳에서 예외처리하기.
 * 
 * findClass
 * 1. java.lang의 Class에서 "java.lang.System2" 라는 이름의 클래스를 찾는다.
 *  forName 메서드는 클래스 이름을 찾는 함수
 * 
 * Main
 * 1. findClass 메서드를 실행하고, 예외가 발생하면 e.toString 메서드로 출력하기.
 * 예외는 ClassNotFoundException 이다.
 * 
*/

package exceptions.throwex_2;

public class ThrowsTest {

	public static void findClass() throws ClassNotFoundException {
		Class.forName("java.lang.System2");
	}
	
	public static void main(String[] args) {

		try {
			findClass();
		} catch (ClassNotFoundException e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}
		
	}

}
