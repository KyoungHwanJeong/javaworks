package overriding.shop_2;

public class MainClass {

	/*
	 * 상속 관계에서 오버라이딩...
	 * 객체
	 * 역세권 매장과 대학가 매장은 기본 음식점의 상속을 받는다.
	 * 기본음식점(HeadShop): 된장찌게(7000원), 김치찌게(7500원), 비빔밥(8000원)
	 * 역세권매장(Shop1): 된장찌게(7500원), 김치찌게(8000원), 비빔밥(8500원)
	 * 대학가매장(Shop2): 된장찌게(6000원), 김치찌게(6500원), 비빔밥(7000원)
	 * 
	 * 매장 객체 2개를 생성하고 역세권과 대학가 각각 매장의 메뉴 메서드를 호출하여
	 * 음식 가격을 출력한다.
	 */
	
	public static void main(String[] args) {

		Shop1 shop_1 = new Shop1();
		shop_1.된장찌게();
		shop_1.김치찌게();
		shop_1.비빔밥();
		
		Shop2 shop_2 = new Shop2();
		shop_2.된장찌게();
		shop_2.김치찌게();
		shop_2.비빔밥();
	}

}
