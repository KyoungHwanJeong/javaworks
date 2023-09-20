package abstracts.car_2;

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

		Car bus1 = new Bus();
		Car car1 = new AutoCar();
		
		bus1.run();
		car1.run();
		
		bus1.refuel();
		car1.refuel();
		
		Bus b =(Bus)bus1;
		b.takePassenger();
		AutoCar a=(AutoCar)car1;
		a.load();
		
		bus1.stop();
		car1.stop();
		
		
	}

}
