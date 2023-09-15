package wrapper_2;

public class IntegerTest {

	/*
	 * 		Integer : 정수 메서드
	 * 		.intValue : 객체의 값에 접근하는 메서드
	 * 
	 * 	Integer.parseInt("문자") : 문자를 숫자로 변환하는 메서드
	 *  Integer.valueOf("문자"or숫자) : 정수나 문자열을 숫자로 변환하는
	 *  								메서드
	 * 
	 */
	
	public static void main(String[] args) {

		Integer num1=100;
		int num2=200;
		
		int sum=num1.intValue()+num2;
		
		System.out.println(num1);
		System.out.println(sum);
		
		Integer num3=Integer.valueOf("123");
		System.out.println(num3);
		
		int num4 =Integer.parseInt("456");
		System.out.println(num4);
	}

}
