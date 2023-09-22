package arraylist.food_2;

import java.util.ArrayList;

/*
 * 객체
 * carts= "사과", "콩나물", "사과", "커피"
 * 1. ArrayList로 객체들을 하나 씩 배열에 추가하고 출력하기.
 * 2. 리스트의 크기를 출력하기.
 * 3. 마지막에 입력된 "사과"를 "바나나"로 수정하고 출력하기.
 * 4. "콩나물"을 제거하고 출력하기.
 * 5. 결과를 향상된 for문으로 다시 출력하기.
 * 
 */

public class ArrayListTest1 {

	public static void main(String[] args) {

		ArrayList <String> carts= new ArrayList<>();
		carts.add("사과");
		carts.add("콩나물");
		carts.add("사과");
		carts.add("커피");
		
		System.out.println("===========1==================");
		
		for(int i=0;i<carts.size();i++) {
			System.out.println(carts.get(i));
		}
		
		System.out.println("===========2==================");

		System.out.println("리스트의 크기: "+ carts.size());
		
		System.out.println("===========3==================");

		carts.set(2, "바나나");
		for(int i=0; i<carts.size();i++) {
			System.out.print(carts.get(i) + " ");
		}
		
		System.out.println();
		System.out.println("===========4==================");

		carts.remove("콩나물");
		for(int i=0; i<carts.size();i++) {
			System.out.print(carts.get(i) + " ");
		}
		
		System.out.println();
		System.out.println("===========5==================");

		for(String c : carts) {
			System.out.print(c + " ");
		}
		System.out.println();
	}

}
