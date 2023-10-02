/*
 * List, Vector 활용하기.
 * String형 List에 Vector객체를 생성하고, "양파", "마늘", "감자"를
 * 순서대로 저장한다.
 * 1. "양파"라는 내용이 있으면 삭제하고, 총 객체 수를 출력하기.
 * 2. Vector의 전체 자료를 출력하기.
 * 3. 향상 for문으로 Vecter의 전체 자료를 출력하기.
 * 
*/

package collection.list;

import java.util.List;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {

		List<String> vegeList = new Vector<>();
		
		// 자료 생성
		vegeList.add("양파");
		vegeList.add("마늘");
		vegeList.add("감자");
	
		System.out.println("=============1===================");
		// 객체 삭제
		if(vegeList.contains("양파")) {
			vegeList.remove("양파");
		}
		
		//리스트 객체의 개수
		System.out.println("총 객체수: " + vegeList.size());

		System.out.println("=============2===================");
		//전체 조회
		for(int i=0;i<vegeList.size();i++) {
			System.out.println(vegeList.get(i));
		}
		
		
		System.out.println("=============3===================");

		//전체 조회
		for(String vege : vegeList)
			System.out.println(vege);
	}

}
