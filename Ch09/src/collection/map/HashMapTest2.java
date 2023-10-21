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

package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest2 {

	public static void main(String[] args) {

		//Map 자료구조의 객체 생성
		Map<String, Integer> map = new HashMap<>();
		int idx = 0;
		
		// 자료 저장
		map.put("Java", ++idx);
		map.put("Python", ++idx);
		map.put("C", ++idx);
		map.put("Python", ++idx);
		map.put("Javascript", ++idx);

		System.out.println("===============1===========================");

		// key값 가져오기
		Set<String> keys = map.keySet();
		
		// 자료의 크기
		System.out.println("총 객체 수: " + map.size());
		System.out.println("총 엔트리(키) 수: " + keys.size());

		System.out.println("===============2===========================");

		// key - value 조회
		for(String key : keys) {
			System.out.println(key + " : " + map.get(key));
											// 순서가 없으므로 번호는 랜덤으로 나온다.
		}

		System.out.println("===============3===========================");

		// 자료 삭제
				if(map.containsKey("Python")) {
					map.remove("Python");
				}
		

		// 람다식 조회
		keys.forEach(key -> System.out.println(key + " : "
					+ map.get(key)));
		
		System.out.println("===============4===========================");


		// 자료 존재 유무
		System.out.println(map.containsKey("C++"));
		
	}

}
