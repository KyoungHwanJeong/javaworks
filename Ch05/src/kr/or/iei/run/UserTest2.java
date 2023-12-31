package kr.or.iei.run;

import kr.or.iei.model.User;

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

		// 매개변수가 있는 생성자로  user1 인스턴스를 생성한다.
		/*
		User user1= new User("sky789", "12345", "김기용");
		
		System.out.println("아이디: " + user1.getId());
		System.out.println("비밀번호: " + user1.getPwd());
		System.out.println("이 름: " + user1.getName());
		
		System.out.println("============================");
		user1.showUser1Info("111", "12345", "김기용");
		
		System.out.println("============================");
		*/
		
		// 배열 객체
/*
		Ex) String[] carts =new String[4];
		carts[0]= "콩나물";
		carts[1]= "커피";
		carts[2]= "라면";
		carts[3]= "우유";
*/
		// 크기가 3인 배열 생성
		User[] users = new User[3];
		
		//user 3명 객체 생성
		User user1= new User("sky789", "12345", "김기용");
		User user2= new User("sky567", "23456", "우영우");
		User user3= new User("sky123", "234567", "장그래");

		// 배열에 객체를 저장(입력)
		users[0]=user1;
		users[1]=user2;
		users[2]=user3;
		
		// users[0] 1개 출력
		System.out.println(users[0].getId() + ", "
					+ users[0].getPwd() + ", "
					+users[0].getName());
		
		System.out.println("==========================");

		// 전체 출력
		for(int i=0;i<users.length;i++) {
			System.out.println(users[i].getId() + ", "
					+ users[i].getPwd() + ", "
					+users[i].getName());
						
		}
		
	}

}
