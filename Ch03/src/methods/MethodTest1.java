package methods;

public class MethodTest1 {
	
	/*
	 * 반환값이 없고, 매개변수가 없는 sayHello 함수 - "안녕하세요~ 자바" 출력
	 * 반환값이 없고, 매개변수가 있는 sayHello 함수를 정의(이름: 매개변수) - "안녕하세요~" + name
	 */
	
	// 변수의 선언과 호출
	// 함수 정의(선언)와 호출(사용)
	
	// sayHello() 이름의 함수를 정의
	// void - 반환값이 없음(비어 있다)
	
	
	// 반환값이 없고, 매개변수가 없는 함수를 정의
	public static void sayHello() {
		System.out.println("안녕하세요~ 자바");
	}
	
	// 매개변수(parameter)가 있는 함수를 정의
	public static void sayHello(String name) {
		System.out.println("안녕하세요~ " + name);
	}

	public static void main(String[] args) {

		//System.out.println("안녕하세요~");
		sayHello();	// 호출
		sayHello("파이썬");
		sayHello("우영우");
	}

}
