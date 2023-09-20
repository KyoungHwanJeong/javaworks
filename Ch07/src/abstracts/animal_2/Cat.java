package abstracts.animal_2;

public class Cat extends Animal{
	
	public Cat(){
		this.kind = "고양이";
		System.out.println(this.kind);
	}

	@Override
	public void sound() {
		System.out.println("야~옹!");
	}

}
