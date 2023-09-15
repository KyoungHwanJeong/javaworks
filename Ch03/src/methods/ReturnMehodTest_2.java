package methods;

public class ReturnMehodTest_2 {

	/*
	 *return이 있고, 매개변수 2개인 함수이름 - add()
	 * return이 있고, 매개변수가 1개인 함수 - square()
	 * return이 있고, 매개변수가 없는 함수 - message() "행운을 빌어요!" 출력
	 * n1=10, n2=20 을 넣고 출력
	 */
	
	public static int add(int num1, int num2) {
		return num1+num2;
	}
	
	public static int square(int num1) {
		return num1*num1;
	}
	
	public static String message() {
		return "행운을 빌어요";
	}
	
	public static void main(String[] args) {
		int n1=10,n2=20;
		System.out.println(n1 + " + "+ n2 + " = " + add(n1,n2));
		System.out.println(n1 + " * "+ n1 + " = " + square(n1));
		System.out.println(message());
		
		
	}

}
