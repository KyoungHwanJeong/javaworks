package inheritance.person_2;

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

		Engineer lee= new Engineer("봉구", 31, 111);
		System.out.println("이름: " + lee.getName());
		System.out.println("나이: " + lee.getAge());
		System.out.println("사번: " + lee.getCompanyId());
	}

}
