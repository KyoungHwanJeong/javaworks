package arraylist.shape;

import java.util.ArrayList;


/*
 *	< 출력 결과>
 *	Circle 
 *	Triangle
 *	Shape
 *
 *
 * Circle과 Triangle 클래스는 Shape 클래스의 상속을 받는다.
 * Shape 클래스에는 draw 메서드로 "Shape"를 출력하게 한다.
 * Circle 클래스에는 draw 메서드로 "Circle"을 출력하게 한다.
 * Triangle 클래스에는 draw 메서드로 "Triangle"을 출력하게 한다.
 * 
 * ShapeTest의 내용
 *	위의 출력 결과가 나오도록 ArrayList함수를 이용하여
 *	Circle과 Triangle, Shape를 list 객체에 저장하고,
 *	for문을 이용하여 list를 출력하기.
 *	향상 for문을 이용하여 list를 출력하기. 
 * 
 * 
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
		
/*		
		for(int i=0;i<list.size();i++) {
			list.get(i);
		}
*/		
		System.out.println("====================================");
		
		// list 출력하기
		for(Shape s : list) {
			s.draw();
		}
	}

}
