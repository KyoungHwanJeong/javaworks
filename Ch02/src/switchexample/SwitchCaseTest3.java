package switchexample;

public class SwitchCaseTest3 {

	public static void main(String[] args) {

		// 사칙연산
		// 변수 - num1=10, num2=2, operator, result
		// 2 * 3  = 6
		
		int num1 = 10;
		int num2 = 2;
		char operator = '*';	// 값을 초기화한다.
		double result = 0.0;			// 0으로 초기화.

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
			System.out.println("지원되지 않는 기능입니다.");
			return;		// 즉시 종료
		}
		System.out.println("결과 값은 " + result + " 입니다.");


//*************************************************************		
		
		//if ~ else문
		
		if(operator == '+') {
			result = num1 + num2;
		}else if(operator == '-') {
			result = num1 - num2;
		}else if(operator == '*') {
			result = num1 * num2;
		}else if(operator == '/'){
			result = num1 / num2;
		}else {
			System.out.println("지원되지 않는 기능입니다.");
		}
		
		System.out.println("결과 값은 " + result + " 입니다.");
		
		
//***************************************************************		
	}

}
