package arrays_2;

/*
 * 1. 구구단 3단을 출력하기.
 * 2. 배열을 사용하여 구구단 3단을 출력하기.
 * 3. 배열을 사용하여 구구단 전체를 출력하기.
 * 4. 배열을 사용하여 구구단 전체를 일반 복사해서 출력하고,
 * 5. 클론 복사해서 출력하기.
 * 
*/

public class ArrayGugudan {

	public static void main(String[] args) {

		System.out.println("============1====================");
		
		int dan =3;
		for(int i=1;i<10;i++) {
			System.out.println(dan + " * " + i + " = " + (dan*i));
		}
		System.out.println("============2====================");
		
		int[] gugudan = new int[9];
		for(int i=0;i<gugudan.length;i++) {
			gugudan[i]= dan*(i+1);
		}
		for(int i=0;i<gugudan.length;i++) {
			System.out.println(dan + " * " + (i+1) + " = " + gugudan[i]);
		}
		
		System.out.println("============3====================");
		
		int[][] gugudan_Full = new int[9][9];
		for(int i=0;i<gugudan_Full.length;i++) {
			for(int j=0;j<gugudan_Full.length;j++) {
				gugudan_Full[i][j]= (i+1)*(j+1);
			}
		}
		for(int i=1;i<gugudan_Full.length;i++) {
			for(int j=0;j<gugudan_Full.length;j++) {
				System.out.println((i+1) + " * " + (j+1) 
						+ " = " +((i+1)*(j+1)));
			}
		}
		System.out.println("============4====================");

		int[][] gugudan_Full2 = new int[9][9];
		for(int i=1;i<gugudan_Full2.length;i++) {
			for(int j=0;j<gugudan_Full2.length;j++) {
				gugudan_Full2[i][j] = gugudan_Full[i][j];
			}
		}
		for(int i=1;i<gugudan_Full2.length;i++) {
			for(int j=0;j<gugudan_Full2.length;j++) {
				System.out.println((i+1) + " * " + (j+1) 
						+ " = " +((i+1)*(j+1)));
			}
		}
		System.out.println("============5====================");

		int[][] gugudan_Full3 = gugudan_Full.clone();
		
		for(int i=1;i<gugudan_Full3.length;i++) {
			for(int j=0;j<gugudan_Full3.length;j++) {
				System.out.println((i+1) + " * " + (j+1) 
						+ " = " +((i+1)*(j+1)));
			}
		}

	}

}
