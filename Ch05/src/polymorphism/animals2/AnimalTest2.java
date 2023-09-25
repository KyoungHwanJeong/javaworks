package polymorphism.animals2;


class Animal2{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human2 extends Animal2{

	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger2 extends Animal2{

	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
	
}

class Eagle2 extends Animal2{

	@Override
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 날개를 펴고 멀리 날아갑니다.");
	}
	
}

public class AnimalTest2 {

	public void moveAnimal(Animal2 animal2) {
		animal2.move();
	}
	
	public static void main(String[] args) {

		AnimalTest2 aTest = new AnimalTest2();
		
		// Animal 타입으로 객체 생성(다형성) - 자동 형변환
		//Animal animal = new Human();
		// animal = new Tiger();
		
		// Animal의 move() 메서드 호출
		// moveAnimal() 호출
		aTest.moveAnimal(new Human2());
		aTest.moveAnimal(new Tiger2());
		aTest.moveAnimal(new Eagle2());
		
//		Animal[] animals = new Animal[3];		
//		animals[0] = new Human();
		
	System.out.println("****** 자식형으로 다운 캐스팅 ******");	

	// 크기가 3인 Animal 인스턴스를 저장할 배열 생성
	Animal2[] animals = new Animal2[3];
	
	//자식 객체 생성
	animals[0] = new Human2();
	animals[1] = new Tiger2();
	animals[2] = new Eagle2();
	
							// 배열을 순회하면서
	for(int i = 0; i< animals.length; i++) {
		Animal2 animal = animals[i];	// 0번 인덱스부터 객체를 저장.
		if(animal instanceof Human2) {
			Human2 human = (Human2)animal; //Human 타입 강제 형변환
			human.readBook();
		}else if(animal instanceof Tiger2) {
			Tiger2 tiger = (Tiger2)animal;//Tiger 타입 강제 형변환
			tiger.hunting();
		}else if(animal instanceof Eagle2) {
			Eagle2 eagle = (Eagle2)animal;//Eagle 타입 강제 형변환
			eagle.flying();
		}else {
			System.out.println("지원하지 않는 타입입니다.");
		}
	}
	
	/*
		// Animal 타입으로 객체 생성
		Animal human = new Human();
		Animal tiger = new Tiger();
		Animal eagle = new Eagle();
		
		// instanceof 키워드 사용 - 강제 형변환
		if(human instanceof Human) {
			Human h = (Human)human;		// 자식타입=(자식)부모타입
			h.readBook();
		}
		
		if(tiger instanceof Tiger) {
			Tiger t = (Tiger)tiger;
			t.hunting();
		}
		
		if(eagle instanceof Eagle) {
			Eagle e = (Eagle)eagle;
			e.flying();
		}
*/		
		
/*
		if(animal instanceof Human) {	
						// if문) Human의 객체가 animal이다.?
			Human human = (Human)animal; // 자식타입=(자식)부모타입
			human.readBook();
		}
*/		
	}

}
