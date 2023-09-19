package abstracts.animal;

public class AnimalTest {
	
	/*
	 * Cat과 Dog의 클래스는 Animal 클래스의 상속을 받는다.
	 * 
	 * Animal 클래스: 필드에 문자열 kind(종)를 선언하고,
	 * 				breat() 메서드에 "동물이 숨을 쉽니다."를 출력한다.
	 * 				sound() 메서드는 추상메서드로 선언한다.
	 * Cat 클래스: kind에 문자열 "고양이"를 넣고 출력(생성자),
	 * 				sound() 함수를 이용해서 "야~옹!" 문자열을 출력한다.
	 * Dog 클래스: kind에 문자열 "개"를 넣고 출력(생성자),
	 * 				sound() 함수를 이용해서 "멍~ 멍~" 문자열을 출력한다. 
	 * 
	 * 메인함수:	1. 고양이 1객체를 생성하고 breat와 sound 메서드 내용을 출력하기.
	 *			2. 다형성을 이용해서 고양이 2객체를 생성하고
	 *					 breat와 sound메서드 내용을 출력하기.
	 *			3. 개 1객체를 생성하고 breat와 sound 메서드 내용을 출력하기.
	 *			4. animalsound() 메서드를 새로 생성하여 
	 *				각각 Dog와 Cat객체로 animalsound() 메서드를 호출하여 출력하기.
	 * 
	 * 
	 * 
	 * 
	*/

	public static void main(String[] args) {
		
		
		System.out.println("==========1================");
		// Cat 클래스의 인스턴스 생성
		Cat cat = new Cat();
		cat.breat();
		cat.sound();
		System.out.println("==========2================");
		
		// 다형성으로 객체 생성
		Animal cat2 = new Cat();
		cat2.breat();
		cat2.sound();
		
		System.out.println("==========3================");

		Animal dog = new Dog();
		dog.breat();
		dog.sound();
		
		System.out.println("==========4================");

		// 메서드의 매개변수의 다형성
		
		animalSound(new Dog());		// 메서드 호출
		animalSound(new Cat());		//
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
