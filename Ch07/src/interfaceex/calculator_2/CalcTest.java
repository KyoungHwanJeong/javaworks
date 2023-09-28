/*
 * 인터페이스를 활용한 계산기 만들기.
 * 1. 인터페이스에 add, sub, mul, div, ERROR를 선언하고,
 * 2. Mycalculator 클래스에서 구현하기.
 * 3. 변수에 10과 2를 넣고 결과 출력하기.
 * 4. 변수에 10과 0을 넣고 결과 출력하기.
 * 
 */

package interfaceex.calculator_2;

public class CalcTest {

	public static void main(String[] args) {

		MyCalculator myCalc = new MyCalculator();

		System.out.println("===========1===================");
		int n1=10, n2=2;
		
		System.out.println(myCalc.add(n1, n2));
		System.out.println(myCalc.sub(n1, n2));
		System.out.println(myCalc.mul(n1, n2));
		System.out.println(myCalc.div(n1, n2));
		
		System.out.println("===========2===================");

		n1=10; n2=0;
		System.out.println(myCalc.add(n1, n2));
		System.out.println(myCalc.sub(n1, n2));
		System.out.println(myCalc.mul(n1, n2));
		System.out.println(myCalc.div(n1, n2));
	}

}
