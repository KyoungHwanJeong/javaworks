/*
 * try-catch() ~finally 예외 처리하기.
 * 1. java.lang 클래스에 "java.lang.Math2" 메서드가 있는지 이름으로 찾는 메서드를
 * try-catch 문으로 만들기. 이름으로 찾는 메서드는 forName 메서드이다.
 * 2. 클래스가 있다면 "찾는 클래스가 있습니다." 메시지를 출력하고,
 * 3. 없다면 ClassNotFoundException 예외처리로 "클래스를 찾을 수 없습니다."를
 *  출력하고, printStackTrace()를 출력하기.
 * 4. 항상 수행되어야 할 프로그램 메시지로 "항상 수행됨"을 출력하기.
 *  
*/

package exceptions.handing_2;

public class ExceptionHanding3 {

	public static void main(String[] args) {

		try {
			Class.forName("java.lang.Math2");
			System.out.println("찾는 클래스가 있습니다.");
		}catch(ClassNotFoundException e) {
			System.out.println("클래스를 찾을 수 없습니다.");
			e.printStackTrace();
		}finally {
			System.out.println("항상 수행됨.");
		}
	}

}
