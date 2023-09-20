package objectequals.member_2;

/*
 * Member의 객체 member1의 사번: m1001, 이름: 우영우 이고,
 * member2도 사번: m1001, 이름: 우영우 이다.
 * 객체들 각각의 해쉬코드가 일치하도록 재정의 한 후 출력하고,
 * 
 * 문자열이 일치하도록 재정의 한 후 출력하기.
 * 
*/

public class MemberTest {

	public static void main(String[] args) {

		Member member1 = new Member("m1001","우영우");
		Member member2 = new Member("m1001","우영우");
		
		System.out.println(member1.hashCode());
		System.out.println(member2.hashCode());
		
		System.out.println(member1.equals(member2));
		
		System.out.println(member1.toString());
		System.out.println(member2.toString());
	}

}
