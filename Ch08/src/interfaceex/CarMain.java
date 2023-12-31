/*
 * 인터페이스
 * Tire 인터페이스
 * 1. roll 메서드가 선언되어 있다.
 * HanTire, KumTire
 * 1. Tire 인터페이스의 상속을 받고, 각각 "한타이어가 굴러갑니다.",
 *  "금타이어가 굴러갑니다."를 출력하는 roll 메서드가 있다.
 * Car
 * 1. Tire 인터페이스 타입으로 자동차의 바퀴 4개
 * (앞바퀴는 HanTire, 뒷바퀴는 KumTire)를 선언하고,
 * 2. 4개의 바퀴에 대해 run 메서드를 호출하기.
 * Car2
 * 1. Tire 인터페이스를 배열로 선언하고, 앞바퀴는 HanTire,
 *  뒷바퀴는 KumTire 선언하기.
 * 2. 향상 for문으로 run 메서드를 호출하기.
 * 
 * Main
 * 1. run() 메서드 출력하기.
 * 2. Car의 앞바퀴를 KumTire로 교체하고, run() 메서드 출력하기.
 * 3. Car2의 앞바퀴를 KumTire로 교체하고, run() 메서드 출력하기.
 * 
 * 
*/

package interfaceex;

public class CarMain {

	public static void main(String[] args) {


		Car myCar = new Car();
		
		//myCar.run();
		
		// 앞바퀴 교체(데이터 수정)
		/*
		KumTire kum1 = new KumTire();
		KumTire kum2 = new KumTire();
		
		myCar.frontLeft_Tire = kum1;
		myCar.frontRight_Tire = kum2;
		*/
	
		System.out.println("============1=======================");

		
		myCar.run();
		
		System.out.println("============2=======================");

		myCar.frontLeft_Tire = new KumTire();
		myCar.frontRight_Tire = new KumTire();
		
		myCar.run();
		
		
		System.out.println("============3=======================");
		
		
		Car2 myCar2 = new Car2();
		
		// 앞바퀴 교체(변경)
		myCar2.tires[0] = new KumTire();
		myCar2.tires[1] = new KumTire();

		myCar2.run();
	}

}
