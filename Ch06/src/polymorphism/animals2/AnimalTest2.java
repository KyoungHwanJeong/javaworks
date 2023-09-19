package polymorphism.animals2;


class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal{

	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal{

	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
	
}

class Eagle extends Animal{

	@Override
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 날개를 펴고 멀리 날아갑니다.");
	}
	
}
public class AnimalTest2 {

	public void moveAnimal(Animal animal) {
		animal.move();		// Animal의 move() 메서드 호출.
	}
	public static void main(String[] args) {
		
		AnimalTest2 aTest = new AnimalTest2();
		
		
		// Animal 타입으로 객체 생성(다형성) - 자동 형변환
/*
***************** moveAnimal 함수로 선언 ********************* 
		Animal animal = new Human();
		//Human human = new Human(); // Human으로 바꾸면 되긴하다.
		animal = new Tiger();
		animal = new Eagle();
		animal.move();
************************************************************
*/		
		//moveAnimal() 호출
		aTest.moveAnimal(new Human());
		aTest.moveAnimal(new Tiger());
		
		System.out.println("******원래형으로 다운 캐스팅******");
		//Animal 타입으로 객체 생성
		Animal human = new Human();
		Animal tiger = new Tiger();
		Animal eagle = new Eagle();

		
/*		
		//강제 형변환 - instanceof 키워드 사용
		for(int i = 0; i < animals.length; i++) {
			if(animals[i] instanceof Human) {
										// animal은 Human의 객체이다.
				Human human = (Human)animals[i];//자식타입= (자식)부모타입
				human.readBook();
			}else if(animals[i] instanceof Human) {
				Tiger tiger =(Tiger)animals[i];
				tiger.hunting();

			}
		}
		*/
	}

}
