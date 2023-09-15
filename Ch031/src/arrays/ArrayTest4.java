package arrays;

public class ArrayTest4 {

	public static void main(String[] args) {

		/*
		 * 크기가 5인 실수형 data 배열을 선언하고
		 * data[0] = 10.0, data[1]= 20.0, data[2]= 30.0을 저장
		 * 전체 배열 조회
		 * 총점 출력
		 * 평균 출력
		 */
		
		// 실수형 배열의 연산
		// 크기가 5인 실수형 배열 data 선언
		// 총점 - total
		
		double[] data = new double[5];
		double total= 0.0;
		// double average;
		
		
		// 저장
		data[0] = 10.0;
		data[1] = 20.0;
		data[2] = 30.0;
		
		
		// 전체 조회
		for(int i =0; i<data.length;i++) {
			System.out.println(data[i]);
			total += data[i];

		}
		System.out.println();
		
		// 총점 출력

		System.out.println("총점은 " + total);
	
		// 평균 출력
		System.out.println("평균은 " + (double)(total/data.length));
	}

}
