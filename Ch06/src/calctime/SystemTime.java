package calctime;

/*
 * 성능 측정기
 * currentTimeMillis나 nanoTime을 쓴다.
 * 1부터 1000만 미만의 숫자 합 출력,
 * 더하기에 걸린 시간 출력하기 
 * 
*/

public class SystemTime {
		
	public static void main(String[] args) {

		// 성능 테스트 소요 시간 측정 - ms, ns
		// 현재까지의 시간(밀리초)
		//long start = System.currentTimeMillis();
		long start = System.nanoTime();
		long sum = 0;
		for(int i=1; i<10000000; i++) {
			sum +=i;
		}		
		//long end = System.currentTimeMillis();
		long end = System.nanoTime();
		System.out.println(sum);
		//System.out.println(end-start + "ms");
		System.out.println(end-start + "ns");

	}

}
