/*
 * List 활용하기.
 * String형 배열에 "양파", "마늘", "감자", "양파"를 저장한다.
 * 1. 배열의 1번 자료 출력하기.
 * 2. 배열의 총 자료 수 출력하기.
 * 3. 배열의 2번 자료를 "상추"로 수정하고, 배열에 "마늘"이 있으면 제거하고,
 *  "고추"가 있으면 제거하고, 총 객체 수를 출력하기.
 * 4. 배열의 전체 자료를 출력하기.
 * 
 */

package collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {

		// String 자료형으로 데이터 관리 (CRUD= Create, Read, Update, Delete)
		// 순서가 있고, 중복 데이터를 저장할 수 있음.
		List<String> vegeList = new ArrayList<>();
		
		// 자료 생성(추가 - Create: add())
		vegeList.add("양파");	// 0번 인덱스 저장
		vegeList.add("마늘");	// 1번 인덱스 저장
		vegeList.add("감자");	// 2번
		vegeList.add("양파");	// 3번
		
		System.out.println("=============1===================");
		// 특정 자료 조회(Read: get())
		System.out.println(vegeList.get(1));
		
		
		System.out.println("=============2===================");

		// 리스트 객체의 개수
		System.out.println("총 객체수: " + vegeList.size());


		System.out.println("=============3===================");

		// 객체 수정(Update: set())
		vegeList.set(2, "상추");
		
		// 객체 삭제(Delete: remove())
		if(vegeList.contains("마늘"))
			vegeList.remove("마늘");
		
		if(vegeList.contains("고추"))
			vegeList.remove("고추");
		
		System.out.println("총 객체수: " + vegeList.size());

		
		System.out.println("=============4===================");

		// 전체 자료 조회(Read: get())
		for(int i=0;i<vegeList.size();i++) {	// 리스트를 순회하면서
			String vege = vegeList.get(i);		// 객체를 가져와서
			System.out.println(vege);			// 출력함
		}
		

	}

}
