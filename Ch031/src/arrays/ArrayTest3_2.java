package arrays;

public class ArrayTest3_2 {

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
		
		int[] number= new int[4];
		int total=0;
		number[0]=10;
		number[1]=20;
		number[2]=30;
		
		System.out.println(number[2]);
		
		for(int i=0;i<number.length;i++) {
			System.out.printf("%d\t",number[i]);
			total+=number[i];
		}
		System.out.println();
		System.out.println("합계: " + total);
		System.out.println("평균: " + (double)total/number.length);
	}

}
