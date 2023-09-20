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
