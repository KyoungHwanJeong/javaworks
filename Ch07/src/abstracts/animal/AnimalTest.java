package abstracts.animal;

public class AnimalTest {

	public static void main(String[] args) {

		// Cat 클래스의 인스턴스 생성
		Cat cat = new Cat();
		cat.breat();
		cat.sound();
		System.out.println("==========1================");
		
		// 다형성으로 객체 생성
		Animal cat2 = new Cat();
		cat2.breat();
		cat2.sound();
		
		System.out.println("==========2================");

		Animal dog = new Dog();
		dog.breat();
		dog.sound();
		
		System.out.println("==========3================");

		// 메서드의 매개변수의 다형성
		
		animalSound(new Dog());		// 메서드 호출
		animalSound(new Cat());		//
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
