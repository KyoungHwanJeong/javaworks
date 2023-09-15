package operator;

public class DataTypeEx {

	public static void main(String[] args) {

		// int, long의 사용
		// int = 4 Bytes(32 bits) -21억 ~ 21억
		// long = 8 Bytes(64 bits) (-)2^63 ~ (2^63)-1 
		
		
		int num1 = 1234567890;		// 12억
		long num2 = 1234567890L;	// 숫자 뒤에 L이나 l을 붙여준다.
		
		System.out.println(num1);
		System.out.println(num2);
		
	}

}
