package customers;

public class CustomerTest1 {

	/*
	 * Customer 클래스(SILVER 등급) : 고객 아이디, 고객 이름, 고객 등급,
	 * 					보너스 포인트, 보너스 적립율(1%)
	 * VIPCustomer 클래스(VIP 등급) : 
	 * 				전문 상담원 아이디, 구매 할인율(10%), 보너스 포인트,
	 * 				 보너스 적립율(5%),
	 * 
	 * 일반 고객 1명: 고객 아이디(1001), 고객이름(이순신),
	 * 				구입가격 10000원을 입력 받고,
	 * VIP 고객 1명: 고객 아이디(1010), 고객이름(우영우),
	 * 			 전문상담원 아이디(7777), 구입가격 20000원을 입력 받고,
	 * 
	 * 고객의 이름과 등급, 보너스 포인트, VIP고객은 전문 상담원 ID를 출력하기
	 * 
	 */
	
	public static void main(String[] args) {

		// 일반 고객 1명, VIP 고객 1명
		Customer lee = new Customer();
		// 입력
		lee.setCustomerId(1001);
		lee.setCustomerName("이순신");
		
		int price = 10000;				// 구매 가격
		lee.calcPrice(price);
		
		
		// 출력
		System.out.println(lee.showCustomerInfo());
		
		VIPCustomer woo = new VIPCustomer();
		woo.setCustomerId(1010);
		woo.setCustomerName("우영우");
		woo.setAgentId(7777);
		
		price = 20000;
		woo.calcPrice(price);
		
		System.out.println(woo.showCustomerInfo());
		
	}

}
