package input;

public class TypeConversionTest {

	public static void main(String[] args) {

		/*
		 *  형 변환 -	1. 자동 형변환
		 *  		2. 강제 형변환
		 */
		
		// 1. 자동 형변환
		
		int iNum = 20;
		float fNum = iNum;				// 실수형(4 Byte) = 정수형(4 Byte)
		
		System.out.println(iNum);		// 20
		System.out.println(fNum);		// 20.0
		
		double dNum;					// 실수형 8 Byte
		dNum = iNum + fNum;				// 자동 형변환(묵시적 형변환)
		System.out.println(dNum);		// 40.0
		
		
		
		// 2. 강제 형변환(cast)
		double dNum2 = 1.2;
		float fNum2 = 0.9F;
		
		int iNum2 = (int)dNum2 + (int)fNum2;	// 1 + 0
		int iNum3 = (int)(dNum2 + fNum2);	// 1.2 + 0.9 = (int)2.1 -----> 2가 출력된다.
		
		System.out.println(iNum2);
		System.out.println(iNum3);
		
		
		
		
	}

}
