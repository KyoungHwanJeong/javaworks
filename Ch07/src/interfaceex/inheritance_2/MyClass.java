package interfaceex.inheritance_2;

public class MyClass implements MyInterface{

	@Override
	public void X() {
	
		System.out.println("X()가 호출 되었습니다.");
	}

	@Override
	public void Y() {

		System.out.println("Y()가 호출 되었습니다.");
	}

	@Override
	public void MyInterface() {

		System.out.println("MyInterface()가 호출 되었습니다.");
	}

}
