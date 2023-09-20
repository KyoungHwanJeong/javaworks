package calctime_2;

/*
 * 성능 측정기
 * currentTimeMillis나 nanoTime을 쓴다.
 * 1부터 1000만 미만의 숫자 합 출력,
 * 더하기에 걸린 시간 출력하기 
 * 
*/

public class SystemTime {

	public static void main(String[] args) {

		long start1 = System.nanoTime();
		long sum1=0;
		for(int i=0; i<100000000; i++) {
			sum1 += i;
		}
		long end1 = System.nanoTime();
		System.out.println(sum1);
		System.out.println("걸린시간: "+ (end1-start1) + "ns");
		
		System.out.println("==========1=====================");
		
		long start2 = System.currentTimeMillis();
		long sum2=0;
		for(int i=0; i<10000000; i++) {
			sum2 += i;
		}
		long end2 = System.currentTimeMillis();
		System.out.println(sum2);
		System.out.println("걸린시간: "+ (end2-start2) + "ns");
		
	}

}
