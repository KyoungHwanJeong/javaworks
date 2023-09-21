package arraytest;

public class ArrayTest2 {

	public static void main(String[] args) {

		int[] arr1 = {1,2,3};
		int[] arr2 = new int[5];
		
		// 배열 복사
		for(int i=0;i<arr1.length;i++) {
			arr2[i] = arr1[i];
		}
		// 인덱스에 값을 저장한다.
		arr2[1] = 5;	// 값을 수정.
		arr2[3] = 4;
		//arr2[5] = 6;	// 에러. 배열의 크기를 초과해서 에러남.
		
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i] + " ");
		}
	}

}
