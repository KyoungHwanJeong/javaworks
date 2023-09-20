package abstracts.animal_2;

public abstract class Animal {

	public String kind;
	
	public void breat() {
		System.out.println("동물이 숨을 쉽니다.");
	}
	
	public abstract void sound();
}
