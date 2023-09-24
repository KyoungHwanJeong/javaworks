package collection.member;

public class MemberHashMapTest {

	public static void main(String[] args) {

		MemberHashMap memberMap = new MemberHashMap();
		
		// 회원 추가
		memberMap.addMember(new Member(1001, "이순신"));
		memberMap.addMember(new Member(1002, "양만춘"));
		memberMap.addMember(new Member(1003, "을지문덕"));
		memberMap.showAllMember();
		
		System.out.println("=================================");

		// 키는 중복이 허용되지 않고, 값은 변경된다.
		memberMap.addMember(new Member(1002, "우영우"));
		memberMap.showAllMember();

		System.out.println("=================================");

		System.out.println("총 객체 수: " + memberMap.getSize());
		
		// 회원 삭제
		memberMap.removeMember(1003);
		memberMap.removeMember(1004);
		
		
		System.out.println("총 객체 수: " + memberMap.getSize());

		// 회원 목록 출력
		memberMap.showAllMember();
	}

}
