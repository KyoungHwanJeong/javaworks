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

package exceptions.throwex;

public class ThrowsTest {

	public static void main(String[] args) {

		// 함수를 호출한 곳에서 예외 처리함
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			//e.printStackTrace();
			System.out.println(e.toString());
		}
		
	}

	
	public static void findClass() throws ClassNotFoundException {
		// 컴파일러가 체크해줌 -  일반 예외
		// throws는 예외를 미룬다.(나중에 예외 처리 해야 한다)
		// 동적 로딩 방식 (Class.forName): 프로그램이 실행된 이후에 클래스의 
		// 로딩이 필요한 경우, 컴파일 없이 다른 클래스의 값을 가져올 수 있다.
		// 빠르게 값을 가져올 수 있지만 컴파일할 때 오류를 알 수 없다.
		Class.forName("java.lang.System2");
	}
}
