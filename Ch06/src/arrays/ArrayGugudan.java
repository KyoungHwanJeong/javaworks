package arrays;

public class ArrayGugudan {
	
	/*
	 * 1. 구구단 3단을 출력하기.
	 * 2. 배열을 사용하여 구구단 3단을 출력하기.
	 * 3. 배열을 사용하여 구구단 전체를 출력하기.
	 * 4. 배열을 사용하여 구구단 3단을 일반 복사해서 출력하고,
	 * 5. 클론 복사해서 출력하기.
	 * 
	*/
	
	public static void main(String[] args) {
		
		System.out.println("==============1=====================");

		int dan = 3;
		for(int i=1;i<10;i++) {
			System.out.println(dan + " * " + i + " = "+ dan*i);
		}
		
		System.out.println("==============2=====================");
		
		// 배열을 사용하여 구구단 저장 및 출력
		int[] gugudan = new int[9];
/*		gugudan[0]=dan*1;
		System.out.println(gugudan[0]);
*/		
		
		// gugudan 배열에 저장
		for(int i=0;i<gugudan.length;i++) {
			// 배열 요소를 저장
			gugudan[i]=dan*(i+1);
		}
		/*
		 * i=0, gugudan[0] = 3*(0+1)=3
		 * i=1, gugudan[1] = 3*(1+1)=6
		 * i=2, gugudan[2] = 3*(2+1)=9
		 * ...
		 * i=8, gugudan[8] = 3*(8+1)=27
		 * 
		 *
		 */
		// gugudan 출력
		for(int i=0;i<gugudan.length;i++) {
			// 배열 요소를 출력
			System.out.println(dan + " * " + (i+1) + " = "+ gugudan[i]);
		}
		System.out.println("================3============================");
		
		// 전체 구구단 출력
/*
		int[] gugudanFull = new int[81];
		for(int i=1;i<82;i++) {
			for(int j=2;j<10;j++) {
				System.out.println((j+1) + " * " + (i+1) + " = "+ gugudan[j]);
			}
		}
*/		
		System.out.println("================4============================");

		// 배열 복사

		int[] gugudan2 = new int[9];
		
		//1. 일반 복사
		
		for(int i=0;i<gugudan2.length;i++) {
			gugudan2[i]=gugudan[i];
		}
		// 출력
		for(int i=0;i<gugudan2.length;i++) {
			System.out.println(dan + " * " + (i+1) + " = "+ gugudan2[i]);
		}		
		
		//2. Object클래스의 clone()
		int[] gugudan3=gugudan.clone();
		
		// 출력
		for(int i=0;i<gugudan3.length;i++) {
			System.out.println(dan + " * " + (i+1) + " = "+ gugudan3[i]);
		}
	}

}
