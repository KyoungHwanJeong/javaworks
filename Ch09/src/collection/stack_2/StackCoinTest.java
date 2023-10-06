/*
 * Stack 구현하기.
 * Coin
 * 1. int형 자료를 입력받아서 저장하고, 리턴한다.
 * 
 * Main
 * 1. 동전 객체를 생성하고, 500원, 100원, 50원, 10원 순서대로 넣는다.
 * 2. 동전을 다시 빼내서 전체 출력하기.
 * 
*/

package collection.stack_2;

import java.util.Stack;

public class StackCoinTest {

	public static void main(String[] args) {

		Stack<Coin> coinBox = new Stack<>();
		
		Coin coin500 = new Coin(500);
		Coin coin100 = new Coin(100);
		Coin coin50 = new Coin(50);
		Coin coin10 = new Coin(10);
		
		// 동전 넣기
		coinBox.push(coin500);
		coinBox.push(coin100);
		coinBox.push(coin50);
		coinBox.push(coin10);
		
		System.out.println("==============1===================");
		// 동전을 빼내 전체 출력하기.
		while(!coinBox.isEmpty()) {
			Coin coin2 = coinBox.pop();
			System.out.println(coin2.getMoney());
		}
	}

}
