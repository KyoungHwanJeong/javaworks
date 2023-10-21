/*
 * HashSet 활용하기.
 * 1. String형 HashSet을 생성한다.
 * 	객체1 = "Java"
 * 	객체2 = "Jdbc"
 * 	객체3 = "Jsp"
 * 	객체4 = "Java"
 * 2. HashSet에 객체를 익명으로 추가하고, 총 객체 수를 출력하기.
 * 3. 특정 개체 "Java"가 있으면 출력하기.
 * 4. 개체 "Jsp"가 있으면 삭제하고, 전체 목록을 조회하기.(iterator 이용)
 * 5. 향상 for문으로 전체 목록을 조회하기.
 * 6. 리스트(list)형태로 출력하기.
 * 
*/

package collection.set_2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();
		
		set.add("Java");
		set.add("Jdbc");
		set.add("Jsp");
		set.add("Java");

		System.out.println("=============1==================");
		System.out.println("총 객체 수: " + set.size());
		
		System.out.println("=============2==================");
		
		// 특정 개체 출력
		if(set.contains("Java")) {
			System.out.println("Java");
		}
		
		System.out.println("=============3==================");
		
		// 삭제하기
		if(set.contains("Jsp")) {
			set.remove("Jsp");
		}
		
		// 전체 출력
		Iterator<String> iterator= set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
		
		System.out.println("=============4==================");

		// 향상 for문
		for(String element: set) {
			System.out.println(element);
		}
		
		System.out.println("=============5==================");
		
		// 리스트 형태로 출력
		System.out.println(set.toString());
	}

}
