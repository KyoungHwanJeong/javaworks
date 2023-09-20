package singleton.car_2;

public class CarTest {
	
	/*
	 *싱글톤 
	 * CarFactory의 객체는 1개이고,
	 * CarFactory 메서드: CarFactory 객체가 없다면 생성하고, Car 객체를 생성한다.
	 * 
	 * Car 메서드: Car를 생성하면 자동차 번호를 생성하고 반환한다.
	 * 
	 * Main: mySonata 객체와 yourMornig 객체를 생성하고,
	 * 		"신차 번호: "를 계산하여 출력하고,
	 * 		CarFactory의 주소를 출력하기.
	 * 
	 * 
	*/
	
	public static void main(String[] args) {

		CarFactory factory1 = CarFactory.getInstance();
		
		Car mySonata = factory1.creatCar();
		Car yourMorning = factory1.creatCar();
		
		System.out.println("신차번호: " + mySonata.getCarNum());
		System.out.println("신차번호: " + yourMorning.getCarNum());
		System.out.println(factory1);
	}

}
