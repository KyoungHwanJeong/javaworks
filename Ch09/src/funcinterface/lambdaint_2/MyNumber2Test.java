/*
* 람다식 활용하기.
* 1. 5와 11 중에 더 큰 수 출력하기
*
*/

package funcinterface.lambdaint_2;

public class MyNumber2Test {

	public static void main(String[] args) {

		MyNumber2 number2;
		
		number2 = (x, y) -> (x>=y) ? x : y;
		
		System.out.println("5와 11 중에 더 큰 수는: " + number2.calculate(5, 11));
	}

}
