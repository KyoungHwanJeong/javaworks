/*
 * 배열 복사하기, 배열 수정하기
 * int형 배열 arr1에는 {1,2,3} 값이 있고, int형 배열 arr2은 크기가 5이다.
 * 1. arr1 배열을 arr2 배열에 복사 하고 출력하기.
 * 2. arr2 배열의 1번째 인덱스에 5를, 3번째 인덱스에 4를 저장하고 출력하기.  
 * 
*/

package arraytest_2;

public class ArrayTest2 {

	public static void main(String[] args) {

		int[] arr1 = {1,2,3};
		int[] arr2 = new int[5];
		
		for(int i=0;i<arr1.length;i++) {
			arr2[i]=arr1[i];
		}
		System.out.println("=========1===================");
		
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i] + " ");
		}
		
		System.out.println();
		System.out.println("=========2===================");

		arr2[1]=5;
		arr2[3]=4;
		
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i] + " ");
		}
	}

}
