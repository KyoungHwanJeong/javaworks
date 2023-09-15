package arrays;

public class ArrayTest1 {

	public static void main(String[] args) {

		/* 변수 String 선언 car1 = "Sonata", car2 = "Morning", car3 = "K7"
		 * car1, car2, car3을 출력
		 * cars 배열을 선언하고 "Sonata", "Morning", "K7", "K7" 를 저장(중복가능)하고
		 * 한줄에 하나씩 출력,
		 * 배열의 크기(개수) 출력,
		 * for문으로 전체 출력
		*/
		
		// 변수
		String car1 = "Sonata";
		String car2 = "Morning";
		String car3 = "K7";
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
		
		System.out.println("======================");
		
		
		// 배열 - 순서가 있음, 중복 가능
		// 직접 저장 - 중괄호 { } 사용
		//
		
		String[] cars = {"Sonata", "Morning", "K7", "K7"};
//		String[] cars = new String[] {"Sonata", "Morning", "K7", "K7"};
		
		System.out.println(cars[0]);
		System.out.println(cars[1]);
		System.out.println(cars[2]);
		System.out.println(cars[3]);

		System.out.println("======================");

		// 배열의 크기(개수) - 배열이름.length
		System.out.println("배열의 크기: " + cars.length);	

		
		// for 문 - 전체 조회(출력)
		
		for(int i=0; i<cars.length;i++) {
			System.out.println(cars[i]);	// 0, 1, 2, 3
		}
	}

}
