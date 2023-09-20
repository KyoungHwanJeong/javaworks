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
		
		System.out.println("==========2===================");
		// final 클래스 체킹
		String msg = "좋은 하루 되세요!";
			// String, Integer 같은 기본 클래스들은
		    // 변하면 안되기 때문에 상속을 못하게 막음.
		System.out.println(msg);
		
		Integer num = 100;
		System.out.println(num);
	}

}
