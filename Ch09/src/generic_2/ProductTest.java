/*
 * 멀티 제네릭 활용하기. 
 * Product
 * 1. T와 M 2개의 매개변수를 받는 멀티 제네릭 클래스 생성하기
 * TV
 * 1. 함수가 호출되면 "회사가 TV를 제조합니다."를 출력한다.
 * Car
 * 1. 함수가 호출되면 "회사가 자동차를 제조합니다."를 출력한다.
 * Main
 * 1. Product와 TV 객체를 생성하고 모델명이 "스마트TV"인 TV를 출력하기.
 * 2. 모델명이 "전기차"인 자동차를 출력하기.
 * 
*/

package generic_2;

public class ProductTest {

	public static void main(String[] args) {

		System.out.println("=============1=================");
		// Product 객체
		Product<TV, String> product1 = new Product<>();
		// TV 객체
		TV tv = new TV();
		product1.setKind(tv);
		product1.setModel("스마트TV");
		tv.makingTV();
		System.out.println("모델명: " + product1.getModel());
		
		
		System.out.println("=============2=================");
		// Product 객체
		Product<Car, String> product2 = new Product<>();
		// Car 객체
		Car car = new Car();
		product2.setKind(car);
		product2.setModel("전기차");
		car.makingCar();
		System.out.println("모델명: " + product2.getModel());
		
	}

}
