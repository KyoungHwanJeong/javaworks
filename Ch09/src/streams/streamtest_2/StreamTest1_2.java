/*
 * stream 이용하기
 * 1. String 형 ArrayList를 생성한다.
 * 2. 객체 "LG", "Samsung", "현대"를 순서대로 넣고,
 * 3. stream을 생성하여 forEach문으로 출력하기.
 */

package streams.streamtest_2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest1_2 {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<>();
		list1.add("LG");
		list1.add("Samsung");
		list1.add("현대");
		
		Stream<String> stream1 = list1.stream();
		stream1.forEach(com1 -> System.out.println(com1));
	}

}
