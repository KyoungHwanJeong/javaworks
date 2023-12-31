package kr.or.iei.run;

import kr.or.iei.model.User;

public class UserTest {
	
	/*
	 * 인스턴스 객체 user1이 저장된 주소값 출력
	 * user1의 정보: 아이디: abc123
	 * 				패스워드: 1234567
	 * 				이름: 정경환
	 * 
	 * get(),set()함수로 받아서 출력하기
	 */

	public static void main(String[] args) {

		//user1 - 인스턴스(객체)
		User user1 = new User();
//		user1.id = "abc123";
		user1.setId("abc123");
		user1.setPwd("1234567");
		user1.setName("정경환");
		
		// user1의 값이 있는 메모리 주소
		System.out.println(user1);	
		System.out.println("아이디: " + user1.getId());
		System.out.println("패스워드: " + user1.getPwd());
		System.out.println("이름: " + user1.getName());

	}

}
