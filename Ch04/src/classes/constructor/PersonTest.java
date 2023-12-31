package classes.constructor;

public class PersonTest {

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
		*/
		
		// Person 객체 생성과 사용
		// 기본 생성자로 생성 constructor
		Person person1 = new Person();
		person1.name="우영우";
		person1.height=165.3f;
		person1.weight=51.2f;
		
		person1.showPersonInfo();
		
		System.out.println("===================================");
		
		Person person2 = new Person("손흥민");
		person2.height = 183.2F;
		person2.weight = 76.7F;
		person2.showPersonInfo();
		
		System.out.println("===================================");
		
		Person person3 = new Person("추신수", 180.3F,90.1F);
		person3.showPersonInfo();
	}

}
