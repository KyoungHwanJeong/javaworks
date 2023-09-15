package arraycopy;

public class ArrayCopyTest2_2 {

	public static void main(String[] args) {

		/*
		 * arr1 ={'N', 'E', 'T} 배열을 선언하고 배열 복사하기
		 * 1. for문 복사
		 * 2. clone 복사
		 * 3. 역순 복사
		 */
		
		char[] arr1 = new char[] {'N','E','T'};
		char[] arr2= new char[arr1.length];
		int i;
		for(i=0;i<arr1.length;i++) {
			arr2[i]=arr1[i];
		}
		
		System.out.println(arr1);
		System.out.println(arr2);
		
		char[] arr3= new char[arr1.length];
		arr3=arr1.clone();
		System.out.println(arr3);
		
		char[] arr4= new char[arr1.length];
		for(i=0;i<arr1.length;i++) {
			arr4[i]=arr1[(arr1.length-1)-i];
		}
		System.out.println(arr4);
	}

}
