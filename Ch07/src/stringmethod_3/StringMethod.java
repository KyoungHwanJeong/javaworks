	/*
	 * charAt을 이용하여 문자열 리턴하기.
	 * substring을 이용하여 연속된 문자열 리턴하기.
	 * 
	 * 1. 문자열형 subject 객체에 "자바 프로그램"을 입력받고,
	 * 1번째 문자 출력하기.
	 * 2. 문자열형 주민번호 객체에 "950815-2345678"을 입력받고,
	 * 성별을 계산하여 "남자입니다." 또는 "여자입니다"를 출력하기.
	 * 3. 주민번호의 생년월일(0~6까지) 출력하기.
	 * 4. 주민번호의 뒷 7자리(7~마지막) 출력하기.
	 * 
	*/

package stringmethod_3;

public class StringMethod {

	public static void main(String[] args) {

		String subject = new String("자바 프로그램");
		
		System.out.println("==================1======================");
		char ch = subject.charAt(1);
		System.out.println(ch);
		
		System.out.println("==================2======================");

		String personNum = new String("950815-2345678");
		char ch2= personNum.charAt(7);
		//System.out.println(ch2);
		
		switch(ch2) {
		case '2': case '4':
			System.out.println("여자입니다.");
			break;
		case '1': case '3':
			System.out.println("남자입니다.");
			break;
		}
		
		
		System.out.println("==================3======================");

		String firstName =personNum.substring(0, 6);
		System.out.println(firstName);
		
		System.out.println("==================4======================");
		
		String secondName =personNum.substring(7 );
		System.out.println(secondName);
	}

}
