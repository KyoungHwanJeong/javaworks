package constant;

public class ConstantTest {

	public static void main(String[] args) {

		// 상수 선언 및 사용
		
//		int maxNum = 100;			// 변수
		final int MAX_NUM = 100;	// 상수
//		MAX_NUM = 1000;		// 상수는 변경 할 수 없음
				
		System.out.println(MAX_NUM);
		
		
//***********************************************************
		
		// 원의 넓이 = 반지름 * 반지름 * 원주율(PI)
		// 변수 - radius=5, circleArea,
		// 상수 - PI
		
		int radius = 5;
		final double PI = 3.14;
		double circleArea = 0.0;
		// PI = 3.15;			// 상수이므로 변경할 수 없음.
		
		circleArea = radius * radius * PI;
		System.out.println("원의 넓이 : " + circleArea);
		
		
	}

}
