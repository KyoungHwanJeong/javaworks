/*
 * HashMap 활용하기.
 * 학생이름(key)와 점수(value)를 저장할 HashMap을 생성하고,
 * 학생1=("이순신", 95)
 * 학생2=("양만춘", 87)
 * 학생3=("강감찬", 79)
 * 학생4=("이순신", 85)
 * 의 객체를 저장한다.
 * 
 * 1. 총 객체 수를 출력하기.
 * 2. "양만춘"의 key 값을 가진 특정 객체의 value를 조회해서 출력하기.
 * 3. "강감찬"의 key 값을 가진 객체가 있다면 삭제하고 총 객체 수를 출력하기.
 * 4. HashMap을 전체 조회해서 출력하기.
 * 5. 향상된 for문으로 HashMap을 전체 조회해서 출력하기.
 * 6. 객체 방식으로 출력하기.
 * 
*/

package collection.hashmap_2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {

		Map<String, Integer> map= new HashMap<>();
		
		map.put("이순신", 95);
		map.put("양만춘", 87);
		map.put("강감찬", 79);
		map.put("이순신", 85);
		
		System.out.println("==============1==================");
		System.out.println("총 객체 수: " + map.size());
	
		System.out.println("==============2==================");
		System.out.println(map.get("양만춘"));
		
		
		System.out.println("==============3==================");
		if(map.containsKey("강감찬"))
			map.remove("강감찬");
		
		System.out.println("총 객체 수: " + map.size());
		
		System.out.println("==============4==================");

		Set<String> keySet= map.keySet();
		Iterator<String> ir= keySet.iterator();
		while(ir.hasNext()) {
			String key=ir.next();
			Integer value=map.get(key);
			System.out.println(key + ":" + value);
		}
		
		
		System.out.println("==============5==================");

		for(String key: keySet) {
			System.out.println(key + ":" + map.get(key));
		}
		
		System.out.println("==============6==================");

		System.out.println(map);
	}

}
