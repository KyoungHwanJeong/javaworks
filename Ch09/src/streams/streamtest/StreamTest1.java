/*
 * stream 이용하기
 * 1. String 형 ArrayList를 생성한다.
 * 2. 객체 "LG", "Samsung", "현대"를 순서대로 넣고,
 * 3. stream을 생성하여 forEach문으로 출력하기.
 */

package streams.streamtest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class StreamTest1 {

	public static void main(String[] args) {
		
		//List에 객체 생성해서 저장함
		
		/*
		List<String> list = Arrays.asList("LG", "Samsung", "현대");
		*/
		
		List<String> list = new ArrayList<>();

		list.add("LG");
		list.add("Samsung");
		list.add("현대");
		
		
		//comStream은 생성후 한번만 사용되고 다시 사용하려면 재생성을 해야함
		Stream<String> comStream = list.stream();
							// list의 모든 객체를 가져옴
		comStream.forEach(com -> System.out.println(com));
				//.forEach: 반복문
												// 람다식으로 출력
		
		//for() - 숫자 문자를 출력할 때, 
		//forEach() - 객체를 각각 출력할 때 쓴다.
		
	}

}
