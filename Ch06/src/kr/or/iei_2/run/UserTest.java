package kr.or.iei_2.run;

import kr.or.iei_2.model.User;

public class UserTest {
	
	/*
	 * users의 정보
	 * 		user1: 아이디: sky789, 비밀번호: 12345, 이름: 김기용
	 * 		user2: 아이디: sky567, 비밀번호: 23456, 이름: 우영우
	 * 		user3: 아이디: sky123, 비밀번호: 234567, 이름: 장그래
	 * 
	 * 배열에 객체들을 저장하고(크기 3),
	 * user1의 자료를 출력하기.(user[0])
	 * user 전체의 자료를 출력하기.
	 * 
	 */

	public static void main(String[] args) {

		User[] user1 = new User[3];
		user1[0]=new User("sky789", 1234567, "김기용");
		user1[1]=new User("aaa", 2345678, "우영우");
		user1[2]=new User("sky123", 345678, "장그래");
		
		for(int i=0;i<user1.length;i++) {
			
		}
	}

}
