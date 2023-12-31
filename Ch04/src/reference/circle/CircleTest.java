package reference.circle;

public class CircleTest {

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
		
	
		Circle c1 = new Circle(2,3,5);
		c1.showCircleInfo();
		
		// Point클래스를 참조하여 Circle 클래스를 출력.
		Circle c2 = new Circle(10,12,10);
		c2.showCircleInfo();
		System.out.println("============================");
		
		/*Circle[] c3 = {
				new Circle(2,3,5),			// circle[0]
				new Circle(10,12,10),		// circle[1]
				new Circle(-10,-12,10)		// circle[2]
		};*/
		Circle[] c3 = new Circle[3];
		c3[0]= new Circle(2,3,5);
		c3[1]= new Circle(10,12,10);
		c3[2]= new Circle(-10,-12,10);
		
		c3[2].showCircleInfo();
		System.out.println("=============================");
		

		// 전체조회
		for(int i=0;i<c3.length;i++) {
			c3[i].showCircleInfo();
		}
	}

}
