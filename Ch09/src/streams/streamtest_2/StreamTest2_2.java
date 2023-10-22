/*
 * stream 이용하기
 * 1. 문자형 배열에 객체("사과", "배", "수박", "참외")를 선언하고, 출력하기.
 * 2. 정수형 배열에 객체(1, 2, 3, 4)를 선언하고, 출력하기.
 * 3. 2번 객체들의 합계, 개수, 평균을 출력하기.
*/

package streams.streamtest_2;

import java.util.Arrays;

public class StreamTest2_2 {

	public static void main(String[] args) {

		// 문자형 배열
		String[] fruit = {"사과", "배", "수박", "참외"};
		Arrays.stream(fruit).forEach(str -> System.out.println(str));
		
		// 정수형 배열
		int[] number = {1, 2, 3, 4};
		Arrays.stream(number).forEach(n -> System.out.println(n));
		
		// 합계, 개수, 평균 구하기
		int sumVal = Arrays.stream(number).sum();
		int count = (int)Arrays.stream(number).count();
		double avg = (double)sumVal /count;
		
		System.out.println("합계: " + sumVal);
		System.out.println("개수: " + count);
		System.out.printf("평균: %.2f\n", avg);
	}

}
