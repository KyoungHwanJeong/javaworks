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

package funcinterface.calculater_2;

public class CalculatorTest {

	public static void main(String[] args) {

		Calculator add, sub, mul, div;
		int num1 = 10, num2 = 5;
		
		add = (x, y) -> {return num1 + num2;};
		sub = (x, y) -> num1 - num2;
		mul = (x, y) -> num1 * num2;
		div = (x, y) -> num1/num2;
		
		System.out.println("두 수의 합은: " + add.calculate(num1, num2));
		System.out.println("두 수의 차는: " + sub.calculate(num1, num2));
		System.out.println("두 수의 곱은: " + mul.calculate(num1, num2));
		System.out.println("두 수의 나눗셈은: " + div.calculate(num1, num2));
		
		
	}

}
