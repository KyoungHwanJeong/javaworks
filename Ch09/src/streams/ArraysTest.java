package streams;

import java.util.Arrays;
import java.util.Collections;

public class ArraysTest {

	public static void main(String[] args) {
		
		System.out.println("===========1==================");

		Integer[] num1 = {3, 1, 2, 4, 5};

		
		// 오름차순 정렬 - Arrays,sort()
		Arrays.sort(num1);
		System.out.println(Arrays.toString(num1));
		
		System.out.println("===========2=================");

		// 내림차순 정렬 - 오름차순 정렬된 배열을 뒤집는다.
		Collections.reverse(Arrays.asList(num1));
		//.asList = 입력된 값들을 ArrayList<>()로 값으로 반환시킨다.
		System.out.println(Arrays.toString(num1));

		
		System.out.println("===========3=================");

		
		// num1의 요소 중 앞에서 3개 복사
		Integer[] num2 = Arrays.copyOf(num1, 3);
							// num1의 요소를 앞에서 부터 3개 복사
		System.out.println(Arrays.toString(num2));
		
		

		
	}
}
