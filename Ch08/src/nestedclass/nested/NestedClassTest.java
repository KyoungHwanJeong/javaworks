/*
 * 내부(중첩) 클래스 활용하기.
 * class A
 * 1. 생성자로 "A객체 생성"을 출력한다.
 * 2. A는 일반 내부 클래스로 class B, 정적 내부 클래스로 class C, method 함수를
 * 	가지고 있다.
 * class B
 * 1. 생성자로 "B객체 생성"을 출력한다.
 * 2. int형 변수 field1, method1 메서드를 가지고 있다.
 * class C
 * 1. 생성자로 "C객체 생성"을 출력한다.
 * 2. int형 변수 field1, static int형 변수 field2, method2 메서드를 가지고 있다.
 * method()
 * 1. 내부 클래스로 class D를 가지고 있고,
 * 2. D class의 객체를 생성하고, int형 변수 field1과 method1 메서드에 접근한다.
 * class D
 * 1. 생성자로 "D객체 생성"을 출력한다.
 * 2. int형 변수 field1, method1 메서드를 가지고 있다.
 * 
 * Main
 * 1. A객체를 생성한다.
 * 2. B객체를 생성한다.
 * 3. B의 field1과 method1()에 접근한다.
 * 4. C객체를 생성한다.
 * 5. C의 field1과 field2, method1(), method2()에 접근한다.
 * 6. method()를 호출해서 class D를 생성한다.
 * 
 * 
*/

package nestedclass.nested;

class A{
	
	A(){
		System.out.println("A객체 생성");}
	
	// 내부 인스턴스 멤버 클래스
	class B{
		
		int field1;
		// static int field2;	// 일반 내부 클래스에서는 static 변수가 생성 안된다.
					
		B(){
			System.out.println("B객체 생성");}
		
		void method1() {}
	}
	
	//내부 정적 멤버 클래스
	static class C{
		int field1;
		static int field2;		// static 클래스에서만 static 변수가 생성 된다.
		C(){
			System.out.println("C객체 생성");
			}

		void method1() {}
		static void method2() {}
	}
	
	
	// 메서드 내부의 로컬 클래스 사용
	void method() {
		class D{
			int field1;
			// static int field2;	// 에러.
			D(){System.out.println("D객체 생성");
			}
			void method1() {}
		
		}
		// d 객체 생성
		D d = new D();
		d.field1 = 10;
		d.method1();
		
	}
}


public class NestedClassTest {

	public static void main(String[] args) {
		// a 객체 생성
		A a = new A();
		
		// b 객체 생성
		A.B b = a.new B();
		b.field1 = 3;		// 필드 접근
		b.method1();		// 메서드 접근
		
		// c 객체 생성
		// static 이 있으면 A.C로 접근한다.
		A.C c = new A.C();
		c.field1 = 2;
		c.method1();
		A.C.field2 =3;
		A.C.method2();
		
		// D클래스의 method() 호출
		a.method();
		
		
	}
}

