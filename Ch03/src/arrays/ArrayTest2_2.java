package arrays;

public class ArrayTest2_2 {

	public static void main(String[] args) {

		/*
		 * 배열의 크기가 4인 cars 배열
		 * 초기값은 null로 지정해서 출력
		 * 다음 cars[0] ="Sonata",
		 *  cars[1]= "Morning",
		 *   cars[2]= "K7",
		 *    cars[3]= "K7를 넣고
		 *    특정한 위치 1번 인덱스를 출력
		 *    그리고 전체 출력
		 * 
		*/
		
		String[] cars= new String[4];
		for(int i=0;i<4;i++) {
			System.out.print(cars[i] + " ");
		}
		System.out.println();
		
		cars[0]="Sonata";
		cars[1]="Morning";
		cars[2]="K7";
		cars[3]="K7";
		
		System.out.println(cars[1]);
		
		for(int i=0;i<4;i++) {
			System.out.print(cars[i]+" ");
		}
	}

}
