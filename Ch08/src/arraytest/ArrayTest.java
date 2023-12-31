/*
 * 배열의 값을 모두 더하는 함수 만들기.
 * 1. 배열 객체 numbers 에는 {1,2,3,4} 값이 있고,
 * 2. 이 배열 안에 있는 숫자들의 합을 출력하기.
 * 
*/

package arraytest;

public class ArrayTest {

	public static int add(int[] arr) {
		int sum = 0;
		for(int i = 0;i< arr.length;i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	
	public static void main(String[] args) {

		int[] numbers = {1,2,3,4};
		
		add(numbers);
		int result = add(numbers);	// add() 함수 호출 할 때 매개변수로
									// 배열을 전달한다.
		System.out.println(result);
	}

}
