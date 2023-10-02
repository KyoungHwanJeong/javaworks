/*
 * HashMap으로 회원 관리하기.
 * MemberHashMap
 * 1. 회원번호(key)와 회원정보(value)를 저장하는 HashMap을 생성한다.
 * 2. Member형 객체를 받아서 회원을 추가한다.
 * 3. 회원목록을 출력하고(iterator를 이용한다), 회원 전체 수를 리턴하는
 * 메서드가 있다.
 * 4. 회원의 번호를 가져와서 일치하는 회원이 있으면 삭제하는
 * 회원 삭제 메서드가 있다.
 * 
 * Main
 * 1. HashMap으로 객체를 생성한다.
 * 2. 익명 객체로 (1001, "이순신")
 * 			(1002, "양만춘")
 * 			(1003, "을지문덕")
 *  을 생성하고, 회원에 추가하고, 전체 회원 목록을 출력하기.
 * 3. 익명 객체 (1002, "우영우")로 수정하고, 전체 회원 목록을 출력하기.
 * 4. 총 회원 수를 출력하기.
 * 5. 1003번과 1004번 회원을 삭제하고, 총 회원 수를 출력하기.
 * 6. 전체 회원 목록을 출력하기.
 * 
*/

package collection.member_2;

public class MemberHashMapTest {

	public static void main(String[] args) {

		MemberHashMap hashMap= new MemberHashMap();
		
		System.out.println("============1==================");
		hashMap.addMember(new Member(1001, "이순신"));
		hashMap.addMember(new Member(1002, "양만춘"));
		hashMap.addMember(new Member(1003, "을지문덕"));
		
		hashMap.showAllMember();
		
		System.out.println("============2==================");
		hashMap.addMember(new Member(1002, "우영우"));
		
		hashMap.showAllMember();
		
		System.out.println("============3==================");
		System.out.println("총 회원 수: " + hashMap.allMember());
		
		System.out.println("============4==================");
		
		hashMap.removeMember(1003);
		hashMap.removeMember(1004);
		System.out.println("총 회원 수: " + hashMap.allMember());
		
		System.out.println("============5==================");
		hashMap.showAllMember();
		

		
	}

}
