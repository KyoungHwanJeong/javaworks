/*
 * List, Vector 활용하기.
 * String형 List에 Vector객체를 생성하고, "양파", "마늘", "감자"를
 * 순서대로 저장한다.
 * 1. "양파"라는 내용이 있으면 삭제하고, 총 객체 수를 출력하기.
 * 2. Vector의 전체 자료를 출력하기.
 * 3. 향상 for문으로 Vecter의 전체 자료를 출력하기.
*/

package collection.list_2;

import java.util.List;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {

		List<String> vegetable = new Vector<>();
		vegetable.add("양파");
		vegetable.add("마늘");
		vegetable.add("감자");
		
		if(vegetable.contains("양파"))
			vegetable.remove("양파");
		
		System.out.println("==============1==================");
		System.out.println("총 객체 수: " + vegetable.size());
		
		System.out.println("==============2==================");
		for(int i=0;i<vegetable.size();i++) {
			System.out.println(vegetable.get(i));
		}
		
		System.out.println("==============3==================");

		for(String list: vegetable) {
			System.out.println(list);
		}
	}

}
