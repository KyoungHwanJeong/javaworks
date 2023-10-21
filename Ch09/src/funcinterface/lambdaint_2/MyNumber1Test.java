/*
 * 람다식 활용하기.
 * 
 * Calculator 인터페이스
 * 
 * MyNumber1Test
 * 1. 어떤 수에 10을 더하는 함수를 구현한다.(x = 1)
 * 2. 어떤 수를 제곱하는 함수를 구현한다.(x = 2)
 * 
*/

package funcinterface.lambdaint_2;

public class MyNumber1Test {

	public static void main(String[] args) {

		MyNumber1 number1;
		
		number1 = (x) -> System.out.println(x+10);
		number1.calculate(1);
		
		number1 = (x) -> System.out.println(x*x);
		number1.calculate(2);
		
	}

}
