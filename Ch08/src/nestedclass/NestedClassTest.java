package nestedclass;




class A{
	
	A(){
		System.out.println("A객체 생성");}
	
	// 내부 인스턴스 멤버 클래스
	class B{
		
		int field1;
		// static int field2;	// 내부 클래스에서 static 변수가 생성 안된다.
		B(){
			System.out.println("B객체 생성");}
		
		void method1() {}
	}
	
	//내부 정적 멤버 클래스
	static class C{
		int field1;
		static int field2;
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
			// static int field2;
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
		c.field2 =3;
		c.method2();
		
		// D클래스의 method() 호출
		a.method();
		
		
	}
}

