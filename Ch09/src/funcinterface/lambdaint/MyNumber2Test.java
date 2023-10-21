/*
* 람다식 활용하기.
* 1. 5와 11 중에 더 큰 수 출력하기
*
*/

package funcinterface.lambdaint;

public class MyNumber2Test {

	public static void main(String[] args) {

		MyNumber2 myNum;
		
		// getMax() 구현 - 람다식 사용
		/*myNum = (x, y) -> {
			return (x >= y) ? x : y;
		};
		*/
		// return 생략 가능하다.
		myNum = (x, y) -> (x>=y) ? x:y;
		
		// getMax() 호출
		//myNum.getMax(5, 11);
		System.out.println("더 큰 수는 "+ myNum.getMax(5, 11));
		
	}

}
