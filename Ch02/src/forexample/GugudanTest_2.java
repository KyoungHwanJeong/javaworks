package forexample;

public class GugudanTest_2 {

	public static void main(String[] args) {
		/*
		 * 단일 for문으로 구구단 3단 출력
		 */

		// 단일 for()
		/*
		  3 * 1 = 3
		  3 * 2 = 6
		  3 * 3 = 9
		  ...
		  3 * 8 = 12
		  3 * 9 = 15
		 */
		
		for(int i=1;i<10;i++) {
			System.out.println("3 * " + i + "= "+ 3*i);
		}
		System.out.println();
		for(int i=1;i<10;i++) {
			int mul= 3*i;
			System.out.printf("3 * %d = %2d\n", i,mul);
		}
	}

}
