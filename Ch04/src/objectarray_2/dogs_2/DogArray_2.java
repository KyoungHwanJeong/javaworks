package objectarray_2.dogs_2;

public class DogArray_2 {

	/*
	 * Dog class에 개의 이름, 타입을 받아서 출력하는
	 * 생성자와 get() 함수, 개의 정보 출력
	 * 
	 * Dog 배열 인스턴스 : new Dog("백구", "진돗개"),
	 * 					new Dog("해피", "시츄"),
	 * 					new Dog("대박", "불독"),
	 * 					new Dog("사랑", "치와와"),
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

		Dog_2[] dogs = {
				new Dog_2("백구", "진돗개"),
				new Dog_2("해피", "시츄"),
				new Dog_2("대박", "불독"),
				new Dog_2("사랑", "치와와")
		};
		
		for(int i=0;i<dogs.length;i++) {
			System.out.println(dogs[i].getDogName()+", "+
							dogs[i].getDogType());
		}
		System.out.println("==================================");
		for(int i=0;i<dogs.length;i++) {
			dogs[i].showDog_2Info();
		}
		System.out.println("==================================");

		for(int i=0;i<dogs.length;i++) {
			System.out.println(dogs[i].showDog_2Info2());
		}
		
		System.out.println("==================================");
		for(Dog_2 dogArr1: dogs) {
			System.out.println(dogArr1.showDog_2Info2());
		}
		System.out.println();
		for(Dog_2 dogArr2: dogs) {
			dogArr2.showDog_2Info();
		}
	}

}
