package interfaceex_3;

public class Car {

	Tire frontLeft_Tire;
	Tire frontRight_Tire;
	Tire backLeft_Tire;
	Tire backRight_Tire;
	
	public Car() {
		frontLeft_Tire=new HanTire();
		frontRight_Tire=new HanTire();
		backLeft_Tire=new KumTire();
		backRight_Tire=new KumTire();
		
	}
	
	public void run() {
		frontLeft_Tire.roll();
		frontRight_Tire.roll();
		backLeft_Tire.roll();
		backRight_Tire.roll();
	}
}
