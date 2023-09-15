package arrays;

public class FindMaxIdx {

	public static void main(String[] args) {
		
		/*
		 * 배열{10,50,80,30,100}을 받아
		 * 최대값의 위치를 출력
		 */
		
		// 최대값의 위치 찾기
		// 최대값의 위치를 0번으로 설정
		
		int[] arr = new int[] {10,50,80,30,100};
		int maxIdx = 0;
		
		for(int i=0;i<arr.length;i++) {
			// if문
			
			if(arr[maxIdx] < arr[i]) {	// 값의 대소 비교
				maxIdx = i;				// 최대 위치에 i를 저장
			}
			

		}
		System.out.println("최대값의 위치: " + maxIdx);
		
	}

}
