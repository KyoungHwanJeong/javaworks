	/*
	 * 일반 고객의 고객 아이디:1001, 고객 이름:이순신, price는 10000원
	 * 고객 등급과 보너스 포인트, 지불할 비용을 출력하기,
	 * 
	 * 자동 형변환을 이용해서 VIP고객 아이디:1010, 이름: 우영우,
	 * 상담원 ID:7777 , price는 20000원을 입력 받아,
	 * 고객 등급과 보너스 포인트, 상담원 ID, 지불할 비용을 출력하기.
	 * 
	*/

package customers;

public class CustomerTest2 {
	
	public static void main(String[] args) {

		// 부모형으로 객체 생성 - 자동 형변환
		
		Customer lee = new Customer(1001, "이순신");
		
		int price =10000;
		int cost = lee.calcPrice(price);
		System.out.println(lee.showCustomerInfo());
		System.out.println(lee.getCustomerName() 
				+ "님이 지불할 비용은 "+ cost + "원입니다.");
		System.out.println("===============================");
		
		// 부모형으로 객체 생성 - 자동 형변환
		Customer woo = new VIPCustomer(1010, "우영우", 7777);
		
		price =20000;
		cost = woo.calcPrice(price);
		
		System.out.println(woo.showCustomerInfo());
		System.out.println(woo.getCustomerName() 
				+ "님이 지불할 비용은 "+ cost + "원입니다.");
		
	}

}
