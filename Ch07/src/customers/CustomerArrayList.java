package customers;

import java.util.ArrayList;

/*
 * 객체 일반 고객- 고객id: 10010, 이름: 이순신, 
 * 				고객id: 10020, 이름: 신사임당,
 * 	   Gold 고객- 고객id: 10030, 이름: 홍길동,
 * 				 고객id: 10040, 이름: 이율곡,
 * 	   VIP 고객- 고객id: 10050, 이름: 세종대왕, 상담원 아이디: 1004
 * 
 * 골드 등급과 VIP 등급은 일반 등급에 상속을 받는다.
 * 
 * Customer 클래스(SILVER 등급) : 고객 아이디, 고객 이름, 고객 등급,
 *  					보너스 포인트, 보너스 적립율(1%)
 * Gold 클래스(Gold 등급) : 고객 아이디, 고객 이름, 고객 등급(Gold), 구매 할인율(10%),
 * 						보너스 포인트, 보너스 적립율(2%)
 * VIP 클래스(VIP 등급) : 고객 아이디, 고객 이름, 고객 등급(VIP), 구매 할인율(10%),
 * 						보너스 포인트, 보너스 적립율(5%)
 * 
 *	// 구매 가격은 가격 - (가격*구매 할인율)로 계산한다.
 * 
 *  ArrayList를 이용하여 객체들을 저장하고
 *  각 고객들이 10000원의 상품을 구매했을 때,
 *  고객 정보와 보너스 포인트를 출력하기.
 *  
 *  고객 정보1에는 고객 이름, 지불할 비용은(계산) 입니다.
 *  고객 정보2에는 고객 이름의 등급, 보너스 포인트(계산) 입니다.
 *  가 들어가 있다.
 * 
*/

public class CustomerArrayList {

	public static void main(String[] args) {
	
		// 일반 고객 - 2명, 골드 - 2명, vip - 1명
		
		// 배열 선언
		// Customer[] customers = new Customer[5];
		ArrayList<Customer> customerList = new ArrayList<>();
/*		
		// 고객 객체 생성 - 부모 타입으로 생성(다형성)
		Customer lee = new Customer(10010, "이순신");
		Customer shin = new Customer(10020, "신사임당");
		Customer hong = new GoldCustomer(10030, "홍길동");
		Customer youl = new GoldCustomer(10040, "이율곡");
		Customer king = new VIPCustomer(10050, "세종대왕", 1004);
		
		// 고객 객체 저장
		customerList.add(lee);
		customerList.add(shin);
		customerList.add(hong);
		customerList.add(youl);
		customerList.add(king);
*/
		// 리스트의 add의 매개변수로 직접 객체 생성후 저장
		customerList.add(new Customer(10010, "이순신"));
		customerList.add(new Customer(10020, "신사임당"));
		customerList.add(new GoldCustomer(10030, "홍길동"));
		customerList.add(new GoldCustomer(10040, "이율곡"));
		customerList.add(new VIPCustomer(10050, "세종대왕", 1004));
		
		
		// 상품 구매
		int price = 10000;
		
		// 고객 정보 출력
		for(int i = 0; i < customerList.size(); i++) {
			Customer customers = customerList.get(i);
			
			// 보너스 적립금 계산
			int cost = customers.calcPrice(price);
			System.out.printf("%s 님이 지불할 비용은 %d 원입니다.", 
					customers.getCustomerName(), cost);
			
			System.out.println(customers.showCustomerInfo());
		}
	}

}
