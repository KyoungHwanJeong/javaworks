package classes;

// 계산기 자료형 정의
public class Calculator {

	// 메서드 정의 - 더하기, 빼기, 곱하기, 나누기
	public int add(int num1, int num2) {
		return num1+num2;
	}
	public int sub(int num1, int num2) {
		return num1-num2;
	}
	public int mul(int num1, int num2) {
		return num1*num2;
	}
	public double div(int num1, int num2) {
		//return num1/num2;
		double div= (double)num1/num2;
		try {
			if(num2==0) {
				
			}
			
		}catch(Exception e) {
			System.out.println("올바르지 않은 연산입니다. ");
		}
		return div;
	}
}
