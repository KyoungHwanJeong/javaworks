package abstracts.animal_2;

public class Dog extends Animal{

	public Dog() {
		this.kind="개";
		System.out.println(this.kind);
	}

	@Override
	public void sound() {

		System.out.println("멍~ 멍~");
	}
}
