/*
 * 싱글톤 패턴, HashMap 활용하기.
 * CarFactory
 * 1. CarFactory는 싱글톤(유일한)으로 String형 key와 Car의 내용
 * value 값을 저장하는 HashMap 객체로 생성한다.
 * 2. creatCar() 메서드는 HashMap을 활용하여 자동차를 생성하고,
 *  자동차의 이름을 입력받아 저장한다.
 * 
 * Main
 * 1. 싱글톤 객체를 생성한다.
 * 2. sonata1과 sonata2의 자동차 객체를 생성하고, 각각 "연수 차"의
 * 이름을 넣고, 차의 이름이 일치하는지 출력하기.
 * 3. bmw1와 bmw2의 자동차 객체를 생성하고, 각각 "전기차"의 이름을
 * 넣고, 차의 이름이 일치하는지 출력하기.
 * 4. sonata1과 bmw1의 이름이 같은지 출력하기.
 * 
 */

package collection.carmap_2;

public class CarTest {

	public static void main(String[] args) {

		CarFactory carfactory1 = CarFactory.getInstance();
		
		System.out.println("============1==================");
		Car sonata1 = carfactory1.creatCar("연수 차");
		Car sonata2 = carfactory1.creatCar("연수 차");
		System.out.println(sonata1==sonata2);
		
		System.out.println("============2==================");
		Car bmw1 = carfactory1.creatCar("전기차");
		Car bmw2 = carfactory1.creatCar("전기차");
		System.out.println(bmw1==bmw2);
		
		System.out.println("============3==================");
		System.out.println(sonata1==bmw1);
		
	}

}
