/*
 * HashMap 활용.
 * 1. String, Integer를 저장할 HashMap 객체를 생성한다.
 * 2. 객체: 
 * 			학생1 = ("이순신", 95)
 * 			학생2 = ("양만춘", 87)
 * 			학생3 = ("강감찬", 79)
 * 			학생4 = ("이순신", 85)
 * 를 저장하고,
 * 3. 특정객체 "양만춘"을 검색해서 value를 출력하기.
 * 4. "강감찬" 객체가 있으면 삭제하고 총 객체 수를 출력하기.
 * 5. 전체 조회하기.(iterator 이용)
 * 6. 향상 for문으로 전체 조회하기.
 * 7. 객체 자체를 출력하기.
 * 
*/

package collection.map;

// ctrl + shift + o
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {

		// 학생의 이름과 점수를 저장할 HashMap 객체 생성
		Map<String, Integer> map = new HashMap<>();
		
		// 객체 저장
		map.put("이순신", 95);	// key, value
		map.put("양만춘", 87);
		map.put("강감찬", 79);
		map.put("이순신", 85);
		
		System.out.println("===============1======================");
		// 특정 객체 조회(키 -> 점수: get() 함수이용한다.)
		System.out.println(map.get("양만춘"));
		
		System.out.println("===============2======================");

		// 객체 삭제
		if(map.containsKey("강감찬")) {	// 객체가 map에 포함되었다면
			map.remove("강감찬");			// 키를 삭제 -> 값도 삭제
		}


		// 총 객체수
		System.out.println("총 객체수: " + map.size());
		
		System.out.println("===============3======================");

		// 전체 조회
		Set<String> keySet = map.keySet();	// key값 객체를 생성
		Iterator<String> ir = keySet.iterator();
								// 키값으로 반복할 반복자 객체 생성
		while(ir.hasNext()) {	// 객체 수만큼 반복
			String key = ir.next();	// 객체가 있으면 1개 씩 가져온다.
			Integer value = map.get(key);
			System.out.println(key + ":" + value);
		}
		
		System.out.println("===============4======================");

		// 전체조회2 향상 for문
		for(String key : keySet) {
			System.out.println(key + ":" + map.get(key));
		}
		
		System.out.println("===============5======================");

		// 객체 자체를 출력하기 - {key=value, }
		System.out.println(map);
		
		
	}

}
