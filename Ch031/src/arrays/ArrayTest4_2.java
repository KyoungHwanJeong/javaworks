package arrays;

public class ArrayTest4_2 {

	public static void main(String[] args) {

		/*
		 * 크기가 5인 실수형 data 배열을 선언하고
		 * data[0] = 10.0, data[1]= 20.0, data[2]= 30.0을 저장
		 * 전체 배열 조회
		 * 총점 출력
		 * 평균 출력
		 */
		
		double[] data=new double[5];
		data[0]=10.0;
		data[1]=20.0;
		data[2]=30.0;
		double total=0.0;
		
		for(int i=0;i<data.length;i++) {
			System.out.print(data[i]+ " ");
			//System.out.println(data[i]);
			total +=data[i];
		}
		System.out.println();
		System.out.println("total = " + total);
		System.out.println("avg = " + (double)total/data.length);
		
	}

}
