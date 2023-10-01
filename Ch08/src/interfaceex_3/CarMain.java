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

package interfaceex_3;

public class CarMain {

	public static void main(String[] args) {

		Car car1 = new Car();
		System.out.println("==========1================");
	
		car1.run();
		
		System.out.println("==========2================");
	
		car1.frontLeft_Tire= new KumTire();
		car1.frontRight_Tire= new KumTire();
		
		car1.run();
		
		System.out.println("==========3================");

		Car2 car2 = new Car2();
		car2.tires[0]=new KumTire();
		car2.tires[1]=new KumTire();
		car2.run();
	
	}

}
