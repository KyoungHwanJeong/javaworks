package classes_2.method_2;

public class UseCalculator_2 {

	public static void main(String[] args) {

		/*
		 * 계산기 만들기
		 * Calculator메서드 - 더하기, 빼기, 곱하기, 나누기
		 * Calculator 객체 calc을 만들고 num1=10, num2=2를 저장,
		 * 객체 calc가 위치한 함수의 메모리 주소값 출력하기.
		 * Calculator 메서드를 호출하여 합, 차, 곱, 나누기 출력하기 
		 *
		 */
		
		Calculator_2 calc = new Calculator_2();
		int num1=10, num2=2;
		
		int addVal=calc.add(num1, num2);
		int subVal=calc.sub(num1, num2);
		int mulVal=calc.mul(num1, num2);
		double divVal=calc.div(num1, num2);
		
		System.out.println(calc);
		System.out.println("두 수의 합은: " + addVal);
		System.out.println("두 수의 차는: " + subVal);
		System.out.println("두 수의 곱은: " + mulVal);
		System.out.println("두 수의 나누기는: " + divVal);
		
	}

}
