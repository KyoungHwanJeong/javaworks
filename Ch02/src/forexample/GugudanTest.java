package forexample;

public class GugudanTest {

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
		int dan =3;
		int i;
		int multiple=1;
		for(i=1; i<=9; i++) {
//			System.out.println("3 * " + i + " = " + 3*i);
		
			multiple = 3 * i;
			System.out.printf("3 * %d = %d\n", i, multiple);

		}

	}

}
