/*
 * LinkedList 활용하기.
 * 1. LinkedList 객체를 생성하고, 자료 "A", "B", "C"를 추가한다.
 * 2. 객체 전체를 출력하기.
 * 3. index 2번에 자료 "D"를 추가하고, 출력하기.
 * 4. 향상 for문으로 전체 자료 출력하기.
 * 
*/

package collection.queue;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		//Queue 방식- 선입선출(FIFO)
		List<String> myList = new LinkedList<>();
		
		// 자료추가
		myList.add("A");	// 0번
		myList.add("B");	// 1번
		myList.add("C");	// 2번
		
		System.out.println("============1====================");
		// 객체 출력
		System.out.println(myList);
		
		
		System.out.println("============2====================");
		
		// 특정 위치에 자료 추가
		myList.add(2, "D");
		System.out.println(myList);
		
		System.out.println("============3====================");

		// 전체 요소 출력
		for(String list : myList) {
			System.out.print(list + " ");
		}
		
	}

}
