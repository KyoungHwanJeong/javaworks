package data;

public class CharType {

	
	public static void main(String[] args) {
		
		/*
		 * 문자열 'A' 출력, 아스키 코드값 66 출력,
		 * 유니코드에서 '한' 출력,
		 * 유니코드에서 16진수로 '한' 출력, '글' 출력
		 */
		
		
		// 문자 자료형 - char, String
		// ASCII code(Americal Standard Code for ..)
		
		char alpha = 'A';
		System.out.println(alpha);
		System.out.println((int)alpha);// 형변환 ascii code
		
		
		
		int alpha2 = 66;
		System.out.println(alpha2);// 66
		System.out.println((char)alpha2);// B
		
		// 유니코드 - 16 bit - 2 Byte
		
		
		char uniCode1 = '한';	// 한 문자 - ' ' 홑 따옴표
		System.out.println(uniCode1);
		
		char uniCode2 = '\uD55C';		// 16진수 표기
		
		System.out.println(uniCode2);	// 한
		
		char uniCode3 = '\uAE00';
		System.out.println(uniCode3);	// 글
		
	}
}
