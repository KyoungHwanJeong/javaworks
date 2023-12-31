/*
 * 인터페이스를 활용한 계산기 만들기.
 * 1. 인터페이스에 add, sub, mul, div, ERROR를 선언하고,
 * 2. Mycalculator 클래스에서 구현하기.
 * 3. 변수에 10과 2를 넣고 결과 출력하기.
 * 4. 변수에 10과 0을 넣고 결과 출력하기.
 * 
 */

package interfaceex.calculator;

public class CalcTest {

	public static void main(String[] args) {

		// 인터페이스는 객체를 생성할 수 없다.
		//Calculator cal = new Calculator();
		MyCalculator calc = new MyCalculator();
		int n1 = 10, n2 = 0;
		int add = calc.add(n1, n2);
		int sub = calc.sub(n1, n2);
		int mul = calc.mul(n1, n2);
		double div = calc.div(n1, n2);
		
		//출력
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
	}

}
