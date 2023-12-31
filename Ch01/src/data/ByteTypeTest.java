package data;

public class ByteTypeTest {

	public static void main(String[] args) {
		// byte 관련 자료형
		// 정수 자료형 - byte, short, int, long
		// byte의 범위 (-)2^7 ~ 2^7, -127 ~ 128 (256개)
		// short의 범위 (-)2^15 ~ 2^15, -32768 ~ 32767
		
		byte bData1 = -128;
		//byte bData2 = 128;	// 범위 초과함
		
		System.out.println(bData1);
		//System.out.println(bData2);
		
		
		short sData1 = 128;
//		short sData2 = 32768;	// 범위 초과함
		
		System.out.println(sData1);
		
		System.out.println("=====================");

		
		
		// 10 진수, 2 진수, 16 진수 출력
		// 객체의 이름과 주소
		
		ByteTypeTest test= new ByteTypeTest();
		System.out.println(test);		// ByteTypeTest class 의 주소: 16진수

		
		System.out.println("=====================");

		int num = 10;	// 10 진수
		int bNum = 0b1010;	// 2진수를 표기 할 때 접두어로 0b를 붙임
		int hNum = 0xA;		// 16진수를 표기 할 때 접두어로 0x를 붙임
		int hNum2 = 0x10;		// 16진수를 표기 할 때 접두어로 0x를 붙임
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(hNum);
		System.out.println(hNum2);
		
		
		System.out.println("=====================");
		
		// 10진수 5를 2진수로 표기 - 32 bit
		/* 10진수 -5를 2진수로 표기
		 * 1. 보수로 만듦
		 * 2. 1을 더함
		 */
		int val1 = 0b00000000000000000000000000000101;	// 5

		int val2 = 0b11111111111111111111111111111011;	// -5
		
		System.out.println(val1);
		System.out.println(val2);
		
		
	}
}
