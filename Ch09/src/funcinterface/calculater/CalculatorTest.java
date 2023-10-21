/*
 * 람다식을 이용하여 계산기 만들기.
 * 1. num1에 10, num2에 5를 넣고,
 *  Calculator FuntionalInterface에 인자를 받아서
 * 2. 람다식으로 두 수의 합을 출력하기.
 * 3. 람다식으로 두 수의 차를 출력하기.
 * 4. 람다식으로 두 수의 곱을 출력하기.
 * 5. 람다식으로 두 수의 나눗셈을 출력하기.
 * 
*/

package funcinterface.calculater;

// Calculator 변수 선언- add, sub, mul, div
// calculate()를 구현 - 람다식
// 덧셈, 뺄셈, 곱셈, 나눗셈
// calculate() 호출
public class CalculatorTest {

	public static void main(String[] args) {

		Calculator add, sub, mul, div;
		int num1 = 10, num2 = 5;
		add = (x,y) -> num1+num2;
		sub = (x,y) -> num1-num2;
		mul = (x,y) -> num1*num2;
		div = (x,y) -> num1/num2;
		
		System.out.println("두 수의 합: " +
				add.calculate(num1, num2));
		System.out.println("두 수의 차: " +
				sub.calculate(num1, num2));
		System.out.println("두 수의 곱: "
				+ mul.calculate(num1, num2));
		System.out.println("두 수의 나누기: "
				+ div.calculate(num1, num2));
		
	}

}
