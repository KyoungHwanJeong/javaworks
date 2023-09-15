package protectedex.pack1;

public class B {

	public void method() {
		
		A a = new A();
		a.field = "yes";	// 같은 패키지여서 접근 가능
		a.method();
	}
}
