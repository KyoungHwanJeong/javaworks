package arraycopy;

public class ArrayCopyTest1 {

	public static void main(String[] args) {
		
		/*
		 * 배열 {10,20,30,40}선언하고
		 * 1. 새로운 배열에 for문으로 복사
		 * 2. clone 메서드 사용
		 */
		
		// 배열의 복사
		int[] arr1 = {10, 20, 30, 40};
		int[] arr2 = new int[4];
		int i;
		
		//arr2[0] = arr1[0];
		//System.out.println(arr2[0]);
		
		
		// 1. 복사
		for(i = 0;i<arr1.length;i++) {
			arr2[i]=arr1[i];
		}
		for(i = 0;i<arr1.length;i++) {
			System.out.print(arr2[i] + " ");
		}
		
		System.out.println();
		
		// 2.clone 메서드 사용
		int[] arr3 = arr2.clone();
		for(i = 0;i<arr3.length;i++) {
			System.out.print(arr3[i] + " ");
		}
		
		
		// 문자
	}

}
