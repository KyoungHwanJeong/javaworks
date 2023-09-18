package arraylist.shape;

import java.util.ArrayList;

/*
 *	< 출력 결과>
 *	Circle 
 *	Triangle
 *	Shape
*/


class Shape{
	public void draw() {
		System.out.println("Shape");
	}
}

class Circle extends Shape{

	@Override
	public void draw() {
		System.out.println("Circle");
	}
	
}

class Triangle extends Shape{

	@Override
	public void draw() {
		System.out.println("Triangle");
	}
	
}

public class ShapeTest {

	public static void main(String[] args) {

		//ArrayList<자료형> 변수 = new ArrayList<>();
		ArrayList<Shape> list = new ArrayList<>();

		// list에 객체 저장 
		list.add(new Circle());
		list.add(new Triangle());
		list.add(new Shape());
		
		// list 출력하기
		for(Shape s : list) {
			s.draw();
		}
	}

}
