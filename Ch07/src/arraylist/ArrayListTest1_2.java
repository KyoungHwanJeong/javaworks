package arraylist;

import java.util.ArrayList;

/*
 * 객체- "사과", "콩나물", "사과", "커피"
 * 1. ArrayList를 이용하여 객체들을 하나 씩 배열에 추가하고 출력하기.
 * 2. 리스트의 크기를 출력하기
 * 3. 배열 3번째의 "사과"를 "바나나"로 수정하고 출력하기.
 * 4. "콩나물"을 제거하고 출력하기.
 * 5. 결과를 향상된 for문으로 다시 출력하기.
 */

public class ArrayListTest1_2 {

	public static void main(String[] args) {

		ArrayList<String> food = new ArrayList<>();
		
		food.add("사과");
		food.add("콩나물");
		food.add("사과");
		food.add("커피");
		
		System.out.println("============1===================");
		for(int i=0;i<food.size();i++) {
			System.out.println(food.get(i));
		}
		
		System.out.println("============2===================");
		
		System.out.println("리스트의 크기 :"+ food.size());
		
		System.out.println("============3===================");
		
		food.set(2, "바나나");
		for(int i=0;i<food.size();i++) {
			System.out.print(food.get(i)+ " ");
		}
		System.out.println();
		
		System.out.println("============4===================");
		food.remove("콩나물");
		for(int i=0;i<food.size();i++) {
			System.out.print(food.get(i)+ " ");
		}
		System.out.println();

		System.out.println("============5===================");
		for(String list : food) {
			System.out.print(list + " ");
		}
		System.out.println();
	}

}
