package forexample;

public class GugudanFull_2 {

	public static void main(String[] args) {
		/*
		 * 구구단 전체 출력
		 */
		/* 하나는 이런식으로 출력
		 * 	2 * 1 = 2
		 *  2 * 2 = 4
		 *  
		 *  3 * 1 = 3
		 *  3 * 2 = 6
		 *  3 * 3 = 9
		 *  ...
		 */
		
		for(int i=2;i<10;i++) {
			for(int j=1;j<10;j++) {
				System.out.println(i + " * " + j + " = "+ i*j);
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=2;i<10;i++) {
			for(int j=1;j<=i;j++) {
				System.out.println(i + " * " + j + " = "+ i*j);
			}
			System.out.println();
		}
	}

}
