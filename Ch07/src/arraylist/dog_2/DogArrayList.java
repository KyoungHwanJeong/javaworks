package arraylist.dog_2;

import java.util.ArrayList;

/*
 * 객체 	dog1 = "백구1", "진돗개"
 * 		dog2 = "백구2", "치와와"
 * 		dog3 = "백구3", "불독"
 * Dog 메서드의 생성자로 개의 이름과 타입을 반환,
 * ArrayList로 인스턴스를 저장하고
 * 2번 인덱스만 출력하기.
 * 전체 출력하기.
*/

public class DogArrayList {

	public static void main(String[] args) {

		ArrayList<Dog> dogList= new ArrayList<>();
		
		Dog dog1 = new Dog("백구1", "진돗개");
		Dog dog2 = new Dog("백구2", "치와와");
		Dog dog3 = new Dog("백구3", "불독");
		
		dogList.add(dog1);
		dogList.add(dog2);
		dogList.add(dog3);
		
		System.out.println("=============1====================");

		System.out.println(dogList.get(2));
		
		System.out.println("=============2====================");

		for(int i=0;i<dogList.size();i++) {
			System.out.println(dogList.get(i));
		}
	}

}
