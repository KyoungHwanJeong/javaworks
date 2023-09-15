package arrays;

public class ArrayTest3 {

	public static void main(String[] args) {
		
		/*
		 * 크기가 4인 정수형 배열
		 * 입력값 number[0] = 10, number[1] = 20, number[2] = 30을 넣고
		 * 직접 초기화
		 * 2번 인덱스만 출력해보고
		 * 전체 조회(출력)
		 * 누적합계(total) 출력,
		 * 평균(avg) 출력
		 */

		// 크기가 4인 정수형 배열 선언
		// 정수형은 값이 비어 있으면 0을 출력한다.
		
		int[] number = new int[4];
		int total=0;
		double average;
		
		// 입력
		number[0] = 10;
		number[1] = 20;
		number[2] = 30;
		
		// 직접 초기화
		//int[] number = {10,20,30,0};
		
		// 2번 인덱스 출력
		System.out.println(number[2]);
		
		
		// 전체 조회(출력)
		for(int i=0;i<number.length;i++) {
			total += number[i];		// 누적 합계 total = total + number[i]
			System.out.printf("%5d",number[i]);
		}
		average = total/number.length;		// 평균 = 합계/ 개수
		
		System.out.println();
		System.out.println("합계 : " + total);
		System.out.println("평균 : " + average);
		System.out.println("평균 : " + (double)(total/number.length));
		
		
	}

}
