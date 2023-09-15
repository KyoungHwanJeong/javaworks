package inheritance.airplane_2;

public class SuperSonicAirPlane extends AirPlane{

	final int NORMAL=1;
	final int SUPERSONIC=2;
	int flymode=NORMAL;
	
	
	public void fly() {
		if(flymode==SUPERSONIC) {
			System.out.println("비행기가 초음속 비행을 합니다.");
		}else {
			super.fly();
		}
	}
}
