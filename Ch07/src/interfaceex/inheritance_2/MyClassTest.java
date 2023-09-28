/*
 * 인터페이스 상속하기.
 * 인터페이스 MyInterface는 인터페이스 X와 인터페이스 Y의 상속을 받는다.
 * 내용은 MyClass에서 구현하고,
 * 1. 인터페이스 형 타입으로 X(), Y() 호출하여 출력하기.
 * 2. MyInterface의 객체 iClass를 생성하고, X(), Y(),
 *  MyInterface()를 호출하여 출력하기.
 * 
 */

package interfaceex.inheritance_2;

public class MyClassTest {

	public static void main(String[] args) {

		MyClass myClass = new MyClass();
		
		System.out.println("=========1===================");
		X x1 = myClass;
		x1.X();
		Y y1 = myClass;
		y1.Y();
		
		System.out.println("=========2===================");

		MyInterface iClass = myClass;
		iClass.X();
		iClass.Y();
		iClass.MyInterface();
		
	}

}
