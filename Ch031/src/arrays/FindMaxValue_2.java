package arrays;

public class FindMaxValue_2 {

	public static void main(String[] args) {

		/*
		 * 배열의 초기값 {1,5,8,3,2}
		 * 배열에서 최대값 찾기
		 * 전체를 반복하면서 최대값과 비교해서 최대값보다 크면 그 값을
		 * 최대값으로 변경한다.
		 * 최대값을 출력한다.
		 */
		
		int[] arr = new int[] {1,5,8,3,2};
		int maxVal = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(maxVal<arr[i]) {
				maxVal = arr[i];
			}
		}
		System.out.println("최대값: " + maxVal);
	}

}
