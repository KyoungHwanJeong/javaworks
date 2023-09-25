package operator;

public class BitOperatorTest {

	public static void main(String[] args) {

		//비트 논리 연산자
		int num1 = 5;	// 0000 0101(8 bit)
		int num2 = 10;	// 0000 1010(8 bit)
		
		
		int result1, result2;
		
		// and 연산자는 양쪽 값이 모두 1일 때 1이고,
		// 나머지는 0이다.
		result1 = num1 & num2;	// 0000 0000->0
		
		// or 연산자는 양쪽 값 중에 하나라도 1이면 1이고,
		// 둘 다 0이면 0이다.
		
		result2 = num1|num2;	// 0000 1111->15
		
		System.out.println(result1);
		System.out.println(result2);
		
		
		//비트 이동 연산자
		// a << 2 - 변수 a를 2비트 만큼 왼쪽으로 이동
		// a >> 2 - 변수 a를 2비트 만큼 오른쪽으로 이동
		int a = 10;				// 0000 1010
		System.out.println(a << 2);		// 0010 1000
		System.out.println(a >> 2);		// 0000 0010
	}

}
