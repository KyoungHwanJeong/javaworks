/*
 * 배열 정렬하기
 * 1. Int형 배열에 (3, 1, 2, 4, 5) 값을 넣는다.
 * 2. 배열의 값을 오름차순으로 정렬해서 출력한다.(sort를 이용)
 * 3. 배열의 값을 내림차순으로 정렬해서 출력한다.(sort, reverse를 이용)
 * 4. 배열의 요소 중 앞에 3개의 값을 복사해서 출력하기.(copyOf를 이용)
 * 
*/
package streams.arraytest_2;

import java.util.Arrays;
import java.util.Collections;

public class ArraysTest_2 {

	public static void main(String[] args) {

		System.out.println("============1====================");
		
		Integer[] num1 = {3, 1, 2, 4, 5};
		
		// 오름차순 정렬
		Arrays.sort(num1);
		System.out.println("오름차순 정렬: " + Arrays.toString(num1));
		
		System.out.println("============2====================");
		
		Integer[] num2 = {3, 1, 2, 4, 5};
		
		// 내림차순 정렬
		Arrays.sort(num2);
		Collections.reverse(Arrays.asList(num2));
		System.out.println("내림차순 정렬: " + Arrays.toString(num2));
		
		System.out.println("============3====================");

		Integer[] num3 = Arrays.copyOf(num2, 3);
		System.out.println("배열 앞에서 3개 복사: " + Arrays.toString(num3));
	}

}
