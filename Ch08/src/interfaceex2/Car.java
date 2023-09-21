package interfaceex2;

public class Car {

	// 필드 - 인터페이스형 타입 선언

	// Tire frontLeft_Tire=null;

	Tire frontLeft_Tire;
	Tire frontRight_Tire;
	Tire backLeft_Tire;
	Tire backRight_Tire;

	
	public Car() {
		frontLeft_Tire = new HanTire();
		frontRight_Tire = new HanTire();
		backLeft_Tire = new KumTire();
		backRight_Tire = new KumTire();
			
	}
	
	
	// 메서드
	
	void run() {
		frontLeft_Tire.roll();
		frontRight_Tire.roll();
		backLeft_Tire.roll();
		backRight_Tire.roll();
		
	}
	

}
