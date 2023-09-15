package switchexample;

public class SwitchCaseTest3_2 {

	public static void main(String[] args) {

		// 사칙연산
		// 변수 - num1=10, num2=2, operator, result
		// 2 * 3  = 6

		int num1=10, num2=2;
		char operator='*';
		double result;
		
		//*************************************************************

		//		switch ~ case문
		
		switch(operator) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
			default:
				System.out.println("유효하지 않은 계산입니다.");
				return;
				
		}
		System.out.println("계산 결과는 : " + result);
		
		
		//*************************************************************		
		
				//if ~ else문
		if(operator == '+') {
			result = num1 + num2;
		}else if(operator == '-') {
			result = num1 - num2;
		}else if(operator == '*') {
			result = num1 * num2;
		}else if(operator == '/') {
			result = num1 / num2;
		}else {
			System.out.println("유효하지 않은 계산입니다.");
		}
		System.out.println("계산 결과는 : " + result);

		
		//***************************************************************		

	}

}
