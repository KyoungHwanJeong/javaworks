package arrays;

public class FindMaxValue {

	public static void main(String[] args) {

		/*
		 * 배열의 초기값 {1,5,8,3,2}
		 * 배열에서 최대값 찾기
		 * 전체를 반복하면서 최대값과 비교해서 최대값보다 크면 그 값을
		 * 최대값으로 변경한다.
		 * 최대값을 출력한다.
		 */
		
		// 배열에서 최대값 찾기
		// 1. 최대값 설정(maxVal) - 0번 인덱스
		// 2. 전체를 반복하면서 최대값과 비교해서
		//		최대값보다 크면 그 값을 최대값으로 변경한다.
		
		int[] arr = new int[] {1,5,8,3,2};
		int maxVal = arr[0];
	
		for(int i=1; i<arr.length; i++) {
			if(maxVal < arr[i]) {
				maxVal = arr[i];	// 1 ---> 5 ---> 8 ---> ... ---> 8
			}
		}
		/*
		 	i=0 	maxVal= 1
		 	i=1 5 > 1 maxVal= 5
		 	i=2 8 > 5 maxVal= 8
		 	i=3 3 > 5 maxVal= 8
		 	i=4 2 > 8 maxVal= 8
		 */
		// 최대값 출력
		System.out.println("최대값 : " + maxVal);
		
		
	}

}
