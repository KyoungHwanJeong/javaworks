package overriding.shop;

public class MainClass2 {

	/*
	 * 상속 관계에서 오버라이딩...
	 * 객체
	 * 역세권 매장과 대학가 매장은 기본 음식점의 상속을 받는다.
	 * 기본음식점(HeadShop): 된장찌게(7000원), 김치찌게(7500원), 비빔밥(8000원)
	 * 역세권매장(Shop1): 된장찌게(7500원), 김치찌게(8000원), 비빔밥(8500원)
	 * 대학가매장(Shop2): 된장찌게(6000원), 김치찌게(6500원), 비빔밥(7000원)
	 * 
	 * 
	 * 매장 객체를 생성할 때 부모형으로 객체를 선언하고
	 * 자식 메서드를 각각 호출하여 음식 가격을 출력한다.
	 */
	
	public static void main(String[] args) {
		
		// 자동 형변환
		// 부모형으로 객체 생성 - 자동 형 변환
		HeadShop shop_1 = new Shop1();	// HeadShop > Shop
		shop_1.비빔밥();
		
		System.out.println("====================================");
		
		HeadShop shop_2 = new Shop2();
		shop_2.비빔밥();
		
		int iNum = 10;
		double dNum;
		
		dNum = iNum;
		System.out.println(dNum);
		
		iNum = (int)dNum;	// 강제 형변환
	}
}
