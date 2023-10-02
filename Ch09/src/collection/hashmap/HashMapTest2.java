/*
 * HashMap 활용하기.
 * 과목(key)와 번호(value)를 저장할 HashMap을 생성한다.
 * 과목1=("Java", ++idx)
 * 과목2=("Python", ++idx)
 * 과목3=("C", ++idx)
 * 과목4=("Python", ++idx)
 * 과목5=("JavaScript", ++idx)
 * 의 객체를 저장한다.
 * 
 * 1. 총 객체의 수: , 총 엔트리(키)의 수: 를 출력하기.
 * 2. 향상 for문으로 HashMap을 전체 조회해서 출력하기.
 * 3. "Python"의 key를 가진 객체가 있다면 삭제하고 forEach() 함수와
 *  람다식을 사용하여, HashMap을 전체 조회해서 출력하기.
 * 4. "C++"의 key를 가진 객체가 있는지 확인해서 출력하기.
 * 
*/

package collection.hashmap;

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
