package arraylist;

import java.util.ArrayList;

public class ArrayListTest1 {

	/*
	 * 객체
	 * carts= "사과", "콩나물", "커피", "우유"
	 * ArrayList로 객체들을 하나 씩 배열에 추가하고 출력하기.
	 * carts의 크기를 출력하기.
	 * "사과"를 "바나나"로 수정하고 출력하기.
	 * "콩나물"을 제거하고 출력하기.
	 * 결과를 향상된 for문으로 다시 출력하기.
	 */
	
	
	
	public static void main(String[] args) {

		//String carts = new String[4];
		//carts[0]= "사과";
		//String[] carts = {"사과", "콩나물", "커피", "우유"};
		//리스트 공간이 기본 10개 생성됨
		//리스트는 순서가있음(인덱싱, 위치찾기 가능하다)
		ArrayList<String> carts = new ArrayList<>();
		
		// 자료 추가 - add()
		carts.add("사과");
		carts.add("콩나물");
		carts.add("사과");
		carts.add("커피");
		
		
		// 자료 출력 - get()
		System.out.println(carts.get(0));
		System.out.println(carts.get(1));
		System.out.println(carts.get(2));
		System.out.println(carts.get(3));

		System.out.println("================1======================");
		// 리스트의 크기
		System.out.println("리스트의 크기: " +carts.size());
		
		System.out.println("================2=====================");
		// 자료 수정 - set()
		carts.set(2, "바나나");
		
		// 전체 조회
				for(int i = 0; i< carts.size();i++) {	// 리스트를 처음부터 반복하면서
					String cart = carts.get(i);	//저장된 자료 1개를 가져와서 cart에 저장
					System.out.print(cart + " ");
				}
				
		System.out.println();
		System.out.println("================3=====================");

		// 자료 삭제 - remove()
		carts.remove("콩나물");
		
		// 전체 조회
		for(int i = 0; i< carts.size();i++) {	// 리스트를 처음부터 반복하면서
			String cart = carts.get(i);	//저장된 자료 1개를 가져와서 cart에 저장
			System.out.print(cart + " ");
		}


		System.out.println();
		System.out.println("================4=====================");
		
		
		// 향샹된 for문 - for(자료형 변수: 리스트이름){}
		
		for(String cart:carts)
			System.out.print(cart + " ");
		
		
		
	}

}
