/*
 * HashSet 활용하기.
 * String형 set에 HashSet 객체를 생성하고, "Java", "Jdbc", "Jsp",
 * "Java"를 저장한다.
 * 1. set의 총 자료 수 출력하기.
 * 2. set의 "Java" 자료를 출력하기.
 * 3. "Jsp"자료를 삭제하고 전체 목록 출력하기.
 * 4. 전체 목록을 향상 for문으로 출력하기.
 * 5. 전체 목록을 리스트 형으로 출력하기.
 * 
*/

package collection.hashset_2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {

		Set <String> set=new HashSet<>();
		
		set.add("Java");
		set.add("Jdbc");
		set.add("Jsp");
		set.add("Java");
		
		System.out.println("=============1===================");
		System.out.println("총 자료의 수: " + set.size());
		
		System.out.println("=============2===================");
		if(set.contains("Java")) {
			System.out.println("Java");
		}
		
		System.out.println("=============3===================");
		if(set.contains("Jsp")) {
			set.remove("Jsp");
		}
		
		Iterator <String> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("=============4===================");

		for(String element: set) {
			System.out.println(element);
		}
		
		System.out.println("=============5===================");
		System.out.println(set);
		
	
	}

}
