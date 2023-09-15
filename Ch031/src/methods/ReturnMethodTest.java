package methods;

public class ReturnMethodTest {
	
	/*
	 *return이 있고, 매개변수 2개인 함수이름 - add()
	 * return이 있고, 매개변수가 1개인 함수 - square()
	 * return이 있고, 매개변수가 없는 함수 - message() "행운을 빌어요!" 출력
	 * n1=10, n2=20 을 넣고 출력
	 */
	
	
	
	// return이 있는 함수(반환 자료형) - int, double, String
	// 호출한 곳으로 반환값을 보냄
	
	
	// return이 있고, 매개변수 2개인 함수이름 - add()
	public static int add(int num1,int num2) {
		return num1+num2;
	}
	
	// return이 있고, 매개변수가 1개인 함수
	public static int square(int num1) {	// 제곱 수를 계산하는 함수
		return num1*num1;
	}
	
	// return이 있고, 매개변수가 없는 함수
	public static String message() {
		//String msg ="행운을 빌어요!";
		//return msg;
		return "행운을 빌어요!";
	}

	public static void main(String[] args) {
		int n1 = 10, n2 = 20;
//		int sum = n1 + n2;
//		System.out.println(sum);
		
		/*
		 * 더하기 함수, 제곱 수 함수, "행운을 빌어요!" 출력 함수 
		*/
		
		
		// 더하기 함수 호출
		//int result = add(n1,n2);
		System.out.println("결과값1: " + add(n1,n2));
		
		// 제곱 수 호출
		int result2 = square(n1);
		System.out.println("결과값2: "+ result2);
		
		// 메시지 호출
		//String msg = message();
		System.out.println(message());
	}

}
