package polymorphism.animals2_2;

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

	public static void main(String[] args) {

		Animal[] animals = new Animal[3];
		
		animals[0]= new Human();
		animals[0].move();
		animals[1]= new Tiger();
		animals[1].move();
		animals[2]= new Eagle();
		animals[2].move();
		
		System.out.println("****** 자식형으로 다운 캐스팅 ******");
		
		for(int i = 0;i<animals.length;i++) {
			Animal animal =animals[i];
			if(animal instanceof Human) {
				Human human = (Human)animal;
				human.readBook();
			}else if(animal instanceof Tiger) {
				Tiger tiger = (Tiger)animal;
				tiger.hunting();
			}else if(animal instanceof Eagle) {
				Eagle eagle = (Eagle)animal;
				eagle.flying();
			}else {
				System.out.println("지원하지 않는 타입입니다.");
			}
		}
		
	}

}
