package methods;

public class MethodTest1_2 {

	/*
	 * 반환값이 없고, 매개변수가 없는 sayHello 함수 - "안녕하세요~ 자바" 출력
	 * 반환값이 없고, 매개변수가 있는 sayHello 함수를 정의(이름: 매개변수) - "안녕하세요~" + name
	 */
	
	public static void sayHello() {
		System.out.println("안녕하세요~ 자바");
	}
	public static void sayHello(String name) {
		System.out.println("안녕하세요~ " + name);
	}
	
	public static void main(String[] args) {
		sayHello();
		sayHello("파이썬");
		
	}

}
