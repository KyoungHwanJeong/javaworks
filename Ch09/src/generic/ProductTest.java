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

package generic;

public class ProductTest {

	public static void main(String[] args) {

		// Product 객체 생성
		Product <TV, String> prod1 = new Product<>();
		
		// TV 인스턴스 생성
		TV tv = new TV();
		
		prod1.setKind(tv);
		prod1.setModel("스마트TV");
		
		tv.making();
		System.out.println("모델명: " + prod1.getModel());
		System.out.println("===============================");
		
		
		
		// 자동차를 생성해서 모델 명을 출력하세요.
		
		Product <Car, String> prod2 = new Product<>();
		
		Car car1 = new Car();
		
		prod2.setKind(car1);
		prod2.setModel("전기차");
	
		car1.makingCar();
		
		System.out.println("모델명: "+ prod2.getModel());
		
		
	}

}
