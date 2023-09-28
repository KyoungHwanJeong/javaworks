/*
 * ArrayList로 코드 작성하기.
 * 1. ArrayList 배열에 "egg"와 "coffee"를 순서대로 저장하고,
 * 배열의 0번째를 출력하기.
 * 
 * 제너릭을 사용해서 코드 작성하기.
 * 1. 제너릭 프로그래밍으로 "egg"와 "coffee"를 순서대로 저장하고,
 * 배열의 0번째를 출력하기.
 * 
*/

package generic_2;

import java.util.ArrayList;

public class GenericTest {

	public static void main(String[] args) {

		System.out.println("==========1===================");
		ArrayList food = new ArrayList();
		food.add("egg");
		food.add("coffee");
		String list=(String)food.get(0);
		
		System.out.println(list);
		
		System.out.println("==========2===================");

		ArrayList <String> food2 = new ArrayList<>();
		food2.add("egg");
		food2.add("coffee");
		//String list2 = food2.get(0);
		System.out.println(food2.get(0));
	}

}
