package collection.carmap_2;

import java.util.HashMap;
import java.util.Map;

public class CarFactory {

	private static CarFactory instance;
	private Map<String, Car> carMap= new HashMap<>();
	
	//싱글톤
	public static CarFactory getInstance() {
		if(instance==null)
			instance= new CarFactory();
		return instance;
	}
	
	//자동차 생성
	public Car creatCar(String name) {
		if(carMap.containsKey(name))
			return carMap.get(name);
		
		Car car = new Car();
		carMap.put(name, car);
		return car;
	}
}
