package kr.or.iei_2.run;

import kr.or.iei_2.model.User;

public class UserTest2 {

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

		User[] users = new User[3];
		User user1= new User("sky789", "12345", "김기용");
		User user2= new User("sky567", "23456", "우영우");
		User user3= new User("sky123", "234567", "장그래");
		
		users[0]=user1;
		users[1]=user2;
		users[2]=user3;
		
		System.out.println(users[0].getId() + ", " +users[0].getPwd()
				+ ", " + users[0].getName());
		System.out.println();
		
		for(int i=0;i<users.length;i++) {
			System.out.println(users[i].getId() + ", "
					+ users[i].getPwd() + ", "
					+ users[i].getName());
			
		}
		
	}

}
