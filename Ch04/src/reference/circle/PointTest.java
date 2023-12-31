package reference.circle;

public class PointTest {

	/*
	 * 포인트 p1의 점의 좌표 x=3, y=4
	 * 포인트 p2의 점의 좌표 x=-5, y=-10
	 * 값을 입력받아서 Point 자료형에서 
	 * showPointInfo()를 호출해서 출력하기.
	 * 
	 */
	
	public static void main(String[] args) {
				
		Point p1 = new Point(3,4);
		p1.showPointInfo();
		
		Point p2= new Point(-5, -10);
		p2.showPointInfo();

	}

}
