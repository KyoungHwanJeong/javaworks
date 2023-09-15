package arraycopy;

public class ArrayCopyTest2 {

	public static void main(String[] args) {
		
		/*
		 * arr1 ={'N', 'E', 'T} 배열을 선언하고 배열 복사하기
		 * 1. for문 복사
		 * 2. clone 복사
		 * 3. 역순 복사
		 */

		// 배열 복사하기 - 문자형 복사
		
		char[] arr1 = {'N', 'E', 'T'};
		// 크기가 3인 arr2 배열 선언
		char[] arr2= new char[3];
		int i;
		
		// 1. for문 복사
		for(i=0; i<arr1.length;i++) {
			arr2[i]=arr1[i];
		}
		System.out.println(arr2);
		
		
		System.out.println("===================================");
		
		// 2. clone 복사
		arr2= arr1.clone();
		System.out.println(arr2);
		
		System.out.println("===================================");

		// 3. 역순 복사 - {'T', 'E', 'N'}
		
		char[] arr3 = new char[3];
		for(i=0; i<arr1.length;i++) {
			arr3[i]= arr1[(arr1.length-1)-i];
		}
		System.out.println(arr3);
	}

}
