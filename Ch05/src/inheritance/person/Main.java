package inheritance.person;

public class Main {

	/*
	 * 사람 클래스: 이름, 나이
	 * 엔지니어: 사번(companyId)
	 * 
	 * 엔지니어는 사람 클래스의 상속을 받는다.
	 * 엔지니어 lee의 이름은 "봉구" 나이는 31 사번은 111이고
	 * 객체로 입력 받아서 출력하기.
	 * 
	 */
	
	public static void main(String[] args) {

		
		// 상속 : 	lee가 Person 필드와 
		//			자기클래스 Engineer를 사용할 수 있음.
		
		/*
		// 기본생성자가 없고 super(name,age)로 직접 상속받아서 에러가 뜸
		Engineer lee = new Engineer();
		lee.name ="봉구";
		lee.age = 31;
		lee.companyId = 111;
*/		
		Engineer lee = new Engineer("봉구", 31, 111);
		
		System.out.println("이름: "+ lee.getName());
		System.out.println("나이: "+ lee.getAge());
		System.out.println("사번: "+ lee.getCompanyid());
	}

}
