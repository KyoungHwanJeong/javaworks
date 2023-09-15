package arrays;

public class ArrayTest2 {

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
		

		// 배열의 선언 및 사용
		// 배열의 크기가 4인 cars 배열을 선언
		// 값이 비어 있으면 null을 출력
		
		String[] cars = new String[4];
		
		// 전체출력
		for(int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
											
											// String 이 비어 있으면 null
											// int 는 비어 있으면 0
		}
		System.out.println();
		
		// 입력(저장)
		cars[0] = "Sonata";
		cars[1] = "Morning";
		cars[2] = "K7";
		cars[3] = "K7";

		// 특정한 위치(1번 인덱스) 조회
		System.out.println(cars[1]);	// Morning
		
		
		// 전체출력
		for(int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);

		}
		
		
	}

}
