/*
 * HashMap 활용하기.
 * 1. String형 HashMap 객체를 생성한다.
 * 2. 자료 :	자료1 = ("Java", ++idx)
 * 			자료2 = ("Python", ++idx)
 * 			자료3 = ("C", ++idx)
 * 			자료4 = ("Python", ++idx)
 * 			자료5 = ("Javascript", ++idx)
 * 를 저장하고, 총 객체 수와 총 엔트리(키) 수를 출력하기.
 * 3. key와 value 값을 조회해서 전체 출력하기.
 * 4. "Python" 자료를 삭제하고 람다식으로 전체 출력하기.
 * 5. "C++" 자료가 있는지 확인해서 true 또는 false로 출력하기.
 * 
*/

package collection.map_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest2 {

	public static void main(String[] args) {

		Map<String, Integer> map1 = new HashMap<>();
		int idx = 0;
		
		// 자료 저장
		map1.put("Java", ++idx);
		map1.put("Python", ++idx);
		map1.put("C", ++idx);
		map1.put("Python", ++idx);
		map1.put("Javascript", ++idx);
		
		System.out.println("=============1======================");
		
		System.out.println("총 객체 수: " + map1.size());
		
		Set<String> keys = map1.keySet();
		System.out.println("총 엔트리(키)의 수: " + keys.size());
		
		System.out.println("=============2======================");

		for(String key1: keys) {
			System.out.println(key1 + " : " + map1.get(key1));
		}
		
		System.out.println("=============3======================");

		if(map1.containsKey("Python")) {
			map1.remove("Python");
		}
		keys.forEach(key -> System.out.println(key + " : " + map1.get(key)));
		
		System.out.println("=============4======================");

		System.out.println(map1.containsKey("C++"));
	}

}
