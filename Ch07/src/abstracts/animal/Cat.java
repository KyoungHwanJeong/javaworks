package abstracts.animal;

public class Cat extends Animal{

	// 부모 클래스에 추상 메서드가 있으면 반드시 구현해야 한다.
	// unimplemented methods
	
	public Cat() {
		this.kind = "고양이";
		System.out.println(kind);
	}

	@Override
	public void sound() {

		System.out.println("야~옹!");
	}
}