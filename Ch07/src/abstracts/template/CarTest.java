package abstracts.template;

public class CarTest {

	public static void main(String[] args) {

		//Car car = new CAr();
		//ManualCar manCar = new Car();// 추상클래스는 객체 생성이
									// 안된다.
		// 추상클래스 타입으로 객체 생성.
		
		//ManualCar thisCar = new ManualCar();
		Car thisCar = new ManualCar();	// Car부모타입-다형성
		thisCar.run();
		System.out.println("==========1===================");
		
		Car myCar = new AICar();
		myCar.run();
	}

}
