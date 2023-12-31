package objectarray.dogs;

public class DogArray {

	/*
	 * Dog class에 개의 이름, 타입을 받아서 출력하는
	 * 생성자와 get() 함수, 개의 정보 출력
	 * 
	 * Dog 인스턴스 : new Dog("백구", "진돗개"),
	 * 				new Dog("해피", "시츄"),
	 * 				new Dog("대박", "불독"),
	 * 				new Dog("사랑", "치와와"),
	 * 
	 * 입력 받고, 출력하기
	 * showDogInfo()를 이용해서 출력하기- showDogInfo() 함수 안에 print함수넣어서,
	 * showDogInfo2()를 이용해서 출력하기- showDogInfo2()함수에서 리턴값을 받아서 출력,
	 * 개의 정보를 출력
	 * 
	 * 향상 for문으로도 출력하기. showDogInfo(), showDogInfo2() 둘 다 사용해서...
	 * 
	 */
	
	public static void main(String[] args) {
		
		// Dog 인스턴스 4개를 생성해서 배열에 저장하고,
		// 정보를 출력하세요.(get()함수를 사용)
		
		Dog[] dogs = {
				new Dog("백구", "진돗개"),
				new Dog("해피", "시츄"),
				new Dog("대박", "불독"),
				new Dog("사랑", "치와와"),
		};
		
		for(int i=0;i<dogs.length;i++) {
			
			System.out.println(dogs[i].getName() +", "+dogs[i].getType());
		}
		System.out.println("=====================================");
		
		for(int i=0;i<dogs.length;i++) {
			dogs[i].showDogInfo();
		}
		System.out.println("=====================================");
		
		for(Dog dogArr1: dogs) {
			dogArr1.showDogInfo();
		}
		System.out.println();
		
		for(Dog dogArr2: dogs) {
			System.out.println(dogArr2.showDogInfo2());
		}
	}

}
