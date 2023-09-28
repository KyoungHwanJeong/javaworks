/*
 * ArrayList로 코드 작성하기.
 * 1. ArrayList 배열에 "egg"와 "coffee"를 순서대로 저장하고,
 * 배열의 0번째를 출력하기.
 * 
 * 제너릭을 사용해서 코드 작성하기.
 * 1. 제너릭 프로그래밍으로 "egg"와 "coffee"를 순서대로 저장하고,
 * 배열의 0번째를 출력하기.
 * 
*/

package generic;

import java.util.ArrayList;

public class GenericTest {

	public static void main(String[] args) {

		System.out.println("============1===================");

		// Generic(일반화) 이전의 코드 작성
		ArrayList cartlist = new ArrayList();
		cartlist.add("egg");
		cartlist.add("coffee");
		
		// 강제 형변환이 필요하다.(다운 캐스팅)
		String item = (String)cartlist.get(0);
		System.out.println(item);
		
		System.out.println("============2===================");
		
		// Generic을 이용한 코드 작성 - 자바 1.5버전 이후
		/*
			제네릭 프로그래밍 - 어떤 값이 하나의 자료형이 아닌 여러 자료형을
				사용할 수 있도록 프로그래밍을 하는 것을 말한다.
		*/
		ArrayList<String> list =new ArrayList<>();
		list.add("egg");
		list.add("coffee");
		
		String item2 = list.get(0);
		System.out.println(item2);
		
		//ArrayList<Integer> list2 =new ArrayList<>();
		//list.add(item2);
	}

}
