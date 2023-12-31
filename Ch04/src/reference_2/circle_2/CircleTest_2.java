package reference_2.circle_2;


public class CircleTest_2 {

	/*
	 * Circle클래스 c1에 (2,3,5)값을 넣고,(showCircleInfo() 사용)
	 * Point클래스를 참조하여 Circle 생성자를 출력하기
	 * 
	 * Circle클래스 c2에 (10,12,10)값을 넣고 출력하기
	 * ================================================
	 * 배열 c3에 	c3[0] = Circle(2,3,5),
	 * 			c3[1] = Circle(10,12,10)
	 * 			c3[2] = Circle(-10,-12,10)
	 * 을 넣고,
	 * c3[2] 인덱스만 출력하기.
	 * ==================================================
	 * c3 배열 전체를 출력하기.
	 * 
	 */
	
	public static void main(String[] args) {

		Circle_2 c1 = new Circle_2(2,3,5);
		c1.showCircle_2Info();
		Circle_2 c2 = new Circle_2(10,12,10);
		c2.showCircle_2Info();
		System.out.println("=============================");
		
		Circle_2[] c3 = {
			new Circle_2(2,3,5),
			new Circle_2(10,12,10),
			new Circle_2(-10,-12,10)
		};
		c3[2].showCircle_2Info();
		System.out.println("=============================");

		
		for(int i=0;i<c3.length;i++) {
			c3[i].showCircle_2Info();
		}
		System.out.println("=============================");

	}

}
