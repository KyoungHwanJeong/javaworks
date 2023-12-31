package kr.or.iei.run;

import kr.or.iei.model.User;

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

		User[] users1 = new User[3];
		User[] users2 = new User[3];
		
		users1[0]= new User("sky789", 123456, "김기용");
		users1[1]= new User("sky567", 234567, "우영우");
		users1[2]= new User("sky123", 345678, "장그래");
		
		for(int i=0;i<users1.length;i++) {
			users1[i].showUserInfo();
		}
		System.out.println("=============================");
		
		for(int i=0;i<users1.length;i++) {
			System.out.println("아이디: "+ users1[i].getId()
					+ ", 비밀번호: " + users1[i].getPwd()
					+ ", 이름: " + users1[i].getName());
			
		}
		System.out.println("============COPY============");

		for(int i=0;i<users2.length;i++) {
			users2[i]=users1[i];
		}
		
		for(int i=0;i<users2.length;i++) {
			System.out.println("아이디: "+ users2[i].getId()
					+ ", 비밀번호: " + users2[i].getPwd()
					+ ", 이름: " + users2[i].getName());
		}
		
		System.out.println();
		
		User[] users3 = users1.clone();

		for(int i=0;i<users3.length;i++) {
			System.out.println("아이디: "+ users3[i].getId()
					+ ", 비밀번호: " + users3[i].getPwd()
					+ ", 이름: " + users3[i].getName());
		}
	}

}
