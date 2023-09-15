package arrays;

public class FindMaxIdx_2 {

	public static void main(String[] args) {

		/*
		 * 배열{10,50,80,30,100}을 받아
		 * 최대값의 위치를 출력
		 */
		
		int[] arr = new int[] {10,50,80,30,100};
		int maxIdx=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[maxIdx]<arr[i]) {
				maxIdx = i;
			}
		}
		System.out.println("최대값: " + arr[maxIdx]);
		System.out.println("최대값의 위치: " + maxIdx);
	}

}
