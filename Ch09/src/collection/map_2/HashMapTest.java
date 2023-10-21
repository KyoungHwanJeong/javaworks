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

package collection.map_2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {

		Map<String, Integer> map1 = new HashMap<>();
		
		// 객체 저장
		map1.put("이순신", 95);
		map1.put("양만춘", 87);
		map1.put("강감찬", 79);
		map1.put("이순신", 85);
		
		System.out.println("=============1======================");
		
		System.out.println(map1.get("양만춘"));
		
		System.out.println("=============2======================");

		if(map1.containsKey("강감찬")) {
			map1.remove("강감찬");
		}
		
		System.out.println("총 객체 수: " + map1.size());
		
		System.out.println("=============3======================");
		
		Set<String> keySet1 = map1.keySet();
		Iterator<String> ir = keySet1.iterator();
		
		while(ir.hasNext()) {
			String key = ir.next();
			Integer value = map1.get(key);
			System.out.println(key + " : " + value);
		}
		
		System.out.println("=============4======================");

		for(String key: keySet1) {
			System.out.println(key + " : " + map1.get(key));
		}
		
		System.out.println("=============5======================");

		System.out.println(map1);
	}

}
