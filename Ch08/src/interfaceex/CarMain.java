package interfaceex;

public class CarMain {

	public static void main(String[] args) {

		System.out.println("============1=======================");

		Car myCar = new Car();
		
		//myCar.run();
		
		// 앞바퀴 교체(데이터 수정)
		/*
		KumTire kum1 = new KumTire();
		KumTire kum2 = new KumTire();
		
		myCar.frontLeft_Tire = kum1;
		myCar.frontRight_Tire = kum2;
		*/
		
		myCar.frontLeft_Tire = new KumTire();
		myCar.frontRight_Tire = new KumTire();
		
		myCar.run();
		
		
		System.out.println("============2=======================");
		
		
		Car2 myCar2 = new Car2();
		
		// 앞바퀴 교체(변경)
		myCar2.tires[0] = new KumTire();
		myCar2.tires[1] = new KumTire();

		myCar2.run();
	}

}
