/*
 * 인터페이스 상속하기.
 * 인터페이스 MyInterface는 인터페이스 X와 인터페이스 Y의 상속을 받는다.
 * 내용은 MyClass에서 구현하고,
 * 1. 인터페이스 형 타입으로 X(), Y() 호출하여 출력하기.
 * 2. MyInterface의 인스턴스 iClass를 생성하고, X(), Y(),
 *  MyInterface()를 호출하여 출력하기.
 * 
 */

package interfaceex.inheritance;

public class MyClassTest {

	public static void main(String[] args) {

		MyClass myClass = new MyClass();
		
		// 인터페이스형 타입으로 형변환
		X x = myClass;
		x.x();
		
		Y y = myClass;
		y.y();
		
		//X와 Y를 상속한 MyInterface의 인스턴스(iClass) 생성
		MyInterface iClass = myClass;
		iClass.x();
		iClass.y();
		iClass.method();
		
	}

}
