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

package collection.stack;

import java.util.Stack;

public class StackCoinTest {

	public static void main(String[] args) {

		// Stack 자료 구조의 객체 생성
		Stack<Coin> coinBox = new Stack<>();
		
		//Coin 객체 생성
		Coin coin500 = new Coin(500);
		Coin coin100 = new Coin(100);
		Coin coin50 = new Coin(50);
		Coin coin10 = new Coin(10);
		
		//동전 넣기(저장)	[500  - 100 - 50 - 10]
		coinBox.push(coin500);
		coinBox.push(coin100);
		coinBox.push(coin50);
		coinBox.push(coin10);
		
		//맨 위의 10원이 꺼내짐
		//int coin1 = coinBox.pop().getMoney();
		//System.out.println(coin1);
		
		System.out.println("==============1======================");
		
		// 전체 객체 출력(꺼내기) - 밖으로 나오면서 삭제된다.
		//							[10 - 50 - 100 - 500]
		while(!coinBox.isEmpty()) {	// coinBox가 비어있지 않으면
			Coin coin2 = coinBox.pop();	// 객체 1개를 꺼낸다.
			System.out.println(coin2.getMoney());
		}
		
		
	}

}
