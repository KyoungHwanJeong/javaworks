package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {

		// Set 인터페이스를 구현한 HashSet 클래스의 객체 생성
		// 순서가 없고, 중복 데이터를 저장할 수 없다.
		Set<String> set = new HashSet<>();
		
		// 객체 생성
		set.add("Java");
		set.add("Jdbc");
		set.add("Jsp");
		set.add("Java");	// 중복데이터이므로 저장이 안됨.
		
		System.out.println("============1=======================");
		// 객체의 수
		System.out.println("총 객체수: "+ set.size());
		
		System.out.println("============2=======================");

		// 특정 객체 출력
		if(set.contains("Java")) {
			System.out.println("Java");
		}
		
		System.out.println("============3=======================");

		// 객체 삭제
		if(set.contains("Jsp")){
			set.remove("Jsp");
		}


		// 전체 목록 조회
		// 순서가 없어서 인덱싱을 할 수 없다.(Iterator 클래스를 사용한다)
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {			// 객체 수만큼 반복
			String element = iterator.next();// 다음 객체가 있으면 가져온다.
			System.out.println(element);
		}

		System.out.println("============4=======================");

		
		// 전체 조회2
		for(String element : set) {
			System.out.println(element);
		}
		
		System.out.println(set);	// 리스트 형태(toString이 정의 되어 있다.
	}

}