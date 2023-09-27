package collection.carmap;

import java.util.HashMap;
import java.util.Map;

public class CarFactory {

	//자동차를 생성할 때 HashMap에 저장.
	private static CarFactory instance;
	private Map<String, Car> carMap = new HashMap<>();
	
	private CarFactory() {};
	
	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}
	
	// 자동차 생성 메서드
	public Car creatCar(String name) {		// 차 이름(key)
		
		if(carMap.containsKey(name)) {
				// containsKey 는 true 또는 false만(1 또는 0) 반환한다.
				// CarMap에 이름(key)가 있으면 이름을 가져와서 car를 반환한다.
			return carMap.get(name);
		}
		
		// Car 객체 생성
		Car car = new Car();
		
		// carMap에 name, car 저장
		carMap.put(name, car);
		
		return car;
	}
	
	
}
