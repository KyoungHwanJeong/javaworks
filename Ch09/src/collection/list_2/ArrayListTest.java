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

package collection.list_2;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {

		List<String> list=new ArrayList<>();
		list.add("양파");
		list.add("마늘");
		list.add("감자");
		list.add("양파");
		
		System.out.println("=============1===================");
		System.out.println(list.get(1));
		
		System.out.println("=============2===================");

		System.out.println("배열의 총 객체 수: " + list.size());
		
		System.out.println("=============3===================");

		list.set(2, "상추");
		if(list.contains("마늘"))
			list.remove("마늘");
		
		if(list.contains("고추"))
			list.remove("고추");
		System.out.println("배열의 총 객체 수: " + list.size());
		
		System.out.println("=============4===================");

		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i) + " ");
		}
	}

}
