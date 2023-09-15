package protectedex.pack2;

import protectedex.pack1.A;

// A가 D를 상속 받음
// 패키지가 달라도 상속 관계는 protected에 접근(사용) 가능하다.
public class D extends A{

	public D() {
		//super();	//생성자 A의 매개변수가 없을 때 생략 가능하다.
		this.field= "yes";
		this.method();
	}
}
