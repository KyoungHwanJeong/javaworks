package arraycopy;

public class ArrayCopyTest1_2 {

	public static void main(String[] args) {

		/*
		 * 배열 {10,20,30,40}선언하고
		 * 1. 새로운 배열에 for문으로 복사
		 * 2. clone 메서드 사용
		 */
		
		int[] arr1 = new int[] {10,20,30,40};
		int[] arr2 = new int[4];
		
		for(int i=0; i<arr1.length;i++) {
			arr2[i]=arr1[i];			
			System.out.print(arr1[i]+ " ");
		}
		System.out.println();
		
		for(int i=0; i<arr2.length;i++) {
			System.out.print(arr2[i]+ " ");

		}
		System.out.println();
		
		int arr3[] = arr2.clone();
		for(int i=0; i<arr3.length;i++) {
			System.out.print(arr3[i]+ " ");
		}
	}

}
