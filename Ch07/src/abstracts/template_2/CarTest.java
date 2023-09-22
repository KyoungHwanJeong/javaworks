package abstracts.template_2;

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

		System.out.println("==========1==================");
		
		Car car1 = new ManualCar();
		car1.run();
		
		System.out.println("==========2==================");

		Car car2 = new AICar();
		car2.run();
		
		System.out.println("==========3==================");

		
	}

}
