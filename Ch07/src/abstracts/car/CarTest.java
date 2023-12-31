package abstracts.car;

/*
 *	*** 출력 결과 ***
 *	버스가 달립니다.	// run()함수
 *	차가 달립니다.		// run()함수
 *	천연 가스를 충전합니다.	// refuel()함수		
 *	휘발유를 주유합니다.		// refuel()함수
 *	승객을 버스에 태웁니다.	// takePassenger()함수
 *	짐을 싣습니다.			// load()함수
 *	차가 멈춥니다.			// stop()함수
 *	차가 멈춥니다.			// stop()함수
 * 
 * Car: 추상 메서드 run과 refuel, 일반 메서드 stop
 * Bus: 일반 메서드 takePassenger
 * AutoCar: 일반 메서드 load
 * 
 */

public class CarTest {	

	public static void main(String[] args) {

		Bus bus = new Bus();
		AutoCar autoCar = new AutoCar();
		
		bus.run();		// 객체의 메서드(함수) 호출
		autoCar.run();
		
		bus.refuel();
		autoCar.refuel();
		
		bus.takePassenger();
		autoCar.load();
		
		bus.stop();
		autoCar.stop();
	}

}
