package inheritance.airplane;

public class Main {

	/*
	 * 
	 * 비행기 동작: 이륙, 비행, 착륙
	 * 초음속 비행 동작: 일반비행(비행), 초음속 비행
	 * 모드 변경은 static 변수: NORMAL=1, SUPERSONIC=2
	 * 초음속 비행 동작은 비행기 동작에 상속 받는다.
	 * 
	 * 메인함수에서 이륙, 비행, 초음속 비행, 일반비행(비행), 착륙
	 * 동작에 대해 메시지를 출력하기.
	 * 
	 */
	
	public static void main(String[] args) {
		SuperSonicAirPlane sa = new SuperSonicAirPlane();
		
		sa.takeOff();
		sa.fly();
		
		// 모드 변경 - (static) 클래스 이름으로 직접 접근
		sa.flyMode = SuperSonicAirPlane.SUPERSONIC;
		sa.fly();
		
		sa.flyMode = SuperSonicAirPlane.NORMAL;
		sa.fly();
		
		sa.land();
		
	}
}
