package reference_2.circle_2;

public class Circle_2 {

	Point_2 centerPoint;
	int radius;
	
	public Circle_2(int x,int y,int radius) {
		centerPoint= new Point_2(x,y);
		this.radius= radius;
	}
	
	public void showCircle_2Info() {
		System.out.println("원의 중심은 (" + centerPoint.x + ", "
				+ centerPoint.y +")이고, 반지름은 " + radius
				+"입니다.");
	}
}
