package polymorphism.animals2;

/*
 * < 결과 >
 * "사람이 두 발로 걷습니다."
 * "호랑이가 네 발로 뜁니다."
 * "독수리가 하늘을 날아갑니다."
 * ****** 자식형으로 다운 캐스팅 ******
 * "사람이 책을 읽습니다."
 * "호랑이가 사냥을 합니다."
 * "독수리가 날개를 펴고 멀리 날아갑니다."
 * 
 * Human과 Tiger, Eagle 객체는 Animal의 상속을 받는다.
 * 
 * 
 * Animal의 	move(): "동물이 움직입니다."
 * Human의 	move(): "사람이 두 발로 걷습니다."
 * 			readBook(): "사람이 책을 읽습니다."
 * Tiger의 	move(): "호랑이가 네 발로 뜁니다."
 * 			hunting(): "호랑이가 사냥을 합니다."
 * Eagle의	move(): "독수리가 하늘을 날아갑니다."
 * 			flying(): "독수리가 날개를 펴고 멀리 날아갑니다."
 * 
 * 사람, 호랑이, 독수리를 오버라이딩 해서 출력하기.
 * 사람, 호랑이, 독수리를 다운캐스팅 해서 출력하기. 
 * 
*/

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
//***************** moveAnimal 함수로 선언 ********************* 
		Animal animal = new Human();
		//Human human = new Human(); // Human으로 바꾸면 되긴하다.
		animal = new Tiger();
		animal = new Eagle();
		animal.move();
//************************************************************
*/		
		
		// Animal의 move() 메서드 호출
		// moveAnimal() 호출
		aTest.moveAnimal(new Human());
		aTest.moveAnimal(new Tiger());
		aTest.moveAnimal(new Eagle());
		
//		Animal[] animals = new Animal[3];		
//		animals[0] = new Human();
		
	System.out.println("****** 자식형으로 다운 캐스팅 ******");	

	// 크기가 3인 Animal 인스턴스를 저장할 배열 생성
	Animal[] animals = new Animal[3];
	
	//자식 객체 생성
	animals[0] = new Human();
	animals[1] = new Tiger();
	animals[2] = new Eagle();
	
							// 배열을 순회하면서
	for(int i = 0; i< animals.length; i++) {
		Animal animal = animals[i];	// 0번 인덱스부터 객체를 저장.
		if(animal instanceof Human) {
			Human human = (Human)animal; //Human 타입 강제 형변환
			human.readBook();
		}else if(animal instanceof Tiger) {
			Tiger tiger = (Tiger)animal;//Tiger 타입 강제 형변환
			tiger.hunting();
		}else if(animal instanceof Eagle) {
			Eagle eagle = (Eagle)animal;//Eagle 타입 강제 형변환
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
