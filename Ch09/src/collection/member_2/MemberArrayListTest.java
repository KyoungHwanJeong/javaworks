/*
 * ArrayList로 회원 관리하기.
 * MemberArrayList
 * 1. Member형 ArrayList를 생성한다.
 * 2. Member형 객체를 받아서 회원을 추가한다.
 * 3. 회원 목록을 출력하고 회원의 전체 수를 리턴하는 메서드가 있다.
 * 4. 회원의 번호를 가져와서 일치하는 회원이 있으면 삭제하는 
 * 회원 삭제 메서드가 있다.
 * 
 * Main
 * 1. ArrayList를 생성한다.
 * 2. 	멤버1=(1001, "이순신")
 * 		멤버2=(1002, "양만춘")
 * 		멤버3=(1003, "을지문덕")
 * 		멤버4=(1002, "양만춘")
 * 을 생성하고, 회원에 추가하고, 총 회원의 수를 출력하기.
 * 3. 1002번과 1004번 회원을 삭제하고 총 회원의 수를 출력하기.
 * 4. 전체 회원 목록을 출력하기.
 * 
 * 
*/

package collection.member_2;

public class MemberArrayListTest {

	public static void main(String[] args) {

		MemberArrayList memberList = new MemberArrayList();
		
		Member mem1= new Member(1001, "이순신");
		Member mem2= new Member(1002, "양만춘");
		Member mem3= new Member(1003, "을지문덕");
		Member mem4= new Member(1002, "양만춘");
		
		memberList.addMember(mem1);
		memberList.addMember(mem2);
		memberList.addMember(mem3);
		memberList.addMember(mem4);
		
		System.out.println("===========1===================");
		System.out.println("총 회원 수: " + memberList.allMember());
	
		System.out.println("===========2===================");
		
		memberList.removeMember(1002);
		memberList.removeMember(1004);
		
		System.out.println("총 회원 수: " + memberList.allMember());
	
		System.out.println("===========3===================");

		memberList.showMemberInfo();
	}

}
