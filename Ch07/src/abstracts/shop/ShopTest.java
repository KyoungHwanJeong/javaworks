package abstracts.shop;

/*
 * 객체
 * 	된장찌게, 김치찌게, 비빔밥
 *	
 *	HeadShop에 추상클래스를 정의
 * 
 * 	Shop1의 내용: 대학가 매장입니다.(생성자)
 * 				된장찌게: 6,500원
 * 				김치찌게: 7,000원
 * 				비빔밥: 7,000원
 * 
 *	Shop2의 내용: 역세권 매장입니다.(생성자)
 *				된장찌게: 7,500원
 *				김치찌게: 8,000원
 *				비빔밥: 8,000원
 *
 * HeadShop shop1 = new Shop1();
 * 	처럼 각각 부모 타입으로 객체를 생성한다.
 * 	shop1과 shop2의 메서드 결과를 출력하기. 	
 * 
*/

public class ShopTest {

	public static void main(String[] args) {

		// 추상 클래스는 객체 생성이 안됨
		// 부모 타입으로 객체 생성
		HeadShop shop1 = new Shop1();
		shop1.된장찌게();
		shop1.김치찌게();
		shop1.비빔밥();
		
		HeadShop shop2 = new Shop2();
		shop2.된장찌게();
		shop2.김치찌게();
		shop2.비빔밥();
	}
}
