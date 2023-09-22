package abstracts.template;

/*
 * <출력 결과>
 * 1.	시동을 켭니다.
 * 		사람이 운전합니다.
 * 		브레이크로 정지합니다.
 * 		시동을 끕니다.
 * 2.	시동을 켭니다.
 * 		차가 자율주행 합니다.
 * 		차가 스스로 멈춥니다.
 * 		시동을 끕니다.
 * 3.	좋은 하루 되세요!
 * 		100
 * 
 * Car: 추상메서드, drive와 stop을 선언하고, startCar-시동을 켭니다.
 * 		turnOff-시동을 끕니다. 작동 구현하고,
 * 		startCar, drive, stop, turnOff를 템플릿 메서드로 정의한다.
 * AICar:	drive-차가 자율주행 합니다.
 * 			stop-차가 스스로 멈춥니다.
 * ManualCar:	drive-사람이 운전합니다.
 * 				stop-브레이크로 정지합니다.
 * 
 * 1.다형성을 이용하여 부모형으로 ManualCar 객체를 생성하고 출력하기
 * 2.다형성을 이용하여 부모형으로 AICar 객체를 생성하고 출력하기
 * 3.
 * 
 */

public class CarTest {

	public static void main(String[] args) {
		
		System.out.println("==========1===================");

		//Car car = new Car();
		//ManualCar manCar = new Car();// 추상클래스는 객체 생성이
									// 안된다.
		// 추상클래스 타입으로 객체 생성.
		
		//ManualCar thisCar = new ManualCar();
		Car thisCar = new ManualCar();	// Car부모타입-다형성
		thisCar.run();
		System.out.println("==========2===================");
		
		Car myCar = new AICar();
		myCar.run();
		
		System.out.println("==========3===================");
		// final 클래스 체킹
		String msg = "좋은 하루 되세요!";
			// String, Integer 같은 기본 클래스들은
		    // 변하면 안되기 때문에 템플릿 메서드를 못 쓰게(상속을 못하게)막음.
		System.out.println(msg);
		
		Integer num = 100;
		System.out.println(num);
	}

}
