package classes_2.constructor_2;

public class PersonTest_2 {

	public static void main(String[] args) {

		/*
		 * Person 클래스를 생성하고
		 * person1 의 이름은 "우영우", 키는 165.3, 몸무게는 51.2를
		 * 입력받아서 출력하는 생성자를 호출하여 출력
		 * 
		 * person2의 이름은 "손흥민"을 매개변수로 입력 받고
		 *  키는 183.2, 몸무게는 76.7를 입력받아서 출력하는 생성자를 호출
		 *  
		 * person3의 이름은 "추신수" 키는 180.3 몸무게는 90.1을 매개변수로
		 * 입력받아 출력하는 생성자를 호출
		 * 
		 * 출력은 printf 함수를 이용한다.
		*/
		
		Person_2 person1= new Person_2();
		person1.name = "우영우";
		person1.height = 165.3F;
		person1.weight = 51.2F;
		
		Person_2 person2= new Person_2();
		person2.name = "손흥민";
		person2.height = 183.2F;
		person2.weight = 76.7F;
		
		Person_2 person3 = new Person_2();
		person3.name = "추신수";
		person3.height = 180.3F;
		person3.weight = 90.1F;
		
		person1.showPerson_2Info();
		person2.showPerson_2Info();
		person3.showPerson_2Info();
		
		System.out.println();
		System.out.println(person1.showPerson_2Info2());
		System.out.println(person2.showPerson_2Info2());
		System.out.println(person3.showPerson_2Info2());
	}

}
