package reference.circle;

public class Circle {

//	int x,y;	// Point center = null(점 클래스 참조)
	int radius;
	Point center;
	
	public Circle(int x, int y, int radius){
//		this.x=x;
//		this.y=y;
		
		center = new Point(x,y);		// center객체가 메모리에 생성.
		this.radius=radius;
		}
	
	public void showCircleInfo() {
		System.out.println("원의 중심은 (" + center.x + ", " + center.y +") 이고, "
				+ "반지름은 "+ radius + "입니다.");
	}
}
