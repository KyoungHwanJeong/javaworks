package forexample;

public class ForEx2 {

	public static void main(String[] args) {
		
		/*
		 * 1부터 10까지 더하기
		 * 변수 - i, total
		 */

		// 1부터 10까지 더하기
		// 변수 - i, total
		
		int i =0, total=0;		// i = 반복변수, total= 합계
		
		for(i = 1;i <= 10; i++) {
			total += i;		// total = total + i
			System.out.println("i= " + i + ", total= " + total);
		}
		System.out.println("합계 " + total);

		/*
		 *  1 = 0 + 1
		 *  3 = 1 + 2
		 * 	6 = 3 + 3
		 * 	10 =6 + 4
		 * 	...
		 */
	}

}
