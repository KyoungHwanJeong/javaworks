package collection.member;

import java.util.ArrayList;

// 자료 관리(생성, 조회) 클래스 - DAO(Data Access Object)
public class MemberArrayList {

	// 필드 - 자료 구조 명시
	private ArrayList<Member> arrayList;
	
	// 생성자
	public MemberArrayList() {
		arrayList = new ArrayList<>();
		
	}
	
	// 회원 추가
	public void addMember(Member member) {	// Member 객체
		arrayList.add(member);
	}

	// 회원 목록 조회
	public void showAllMember() {
		for(int i = 0; i< arrayList.size();i++) {
			Member member = arrayList.get(i);
			System.out.println(member);
		}
	}
	
	// 회원의 전체 인원(회원 수)
	public int getSize() {
		return arrayList.size();
	}
	
	// 회원 삭제
	// 이미 등록된 회원번호를 가져와서
	// 매개변수로 전달 받은 회원 아이디를 비교해서 있으면 삭제한다.
	public boolean removeMember(int memberId) {
		for(int i=0;i<arrayList.size();i++) {
			int dbId = arrayList.get(i).getMemberId(); // 이미 등록된 회원번호
			// 외부 아이디와 비교해서 일치하면
			if(dbId == memberId) {
				arrayList.remove(i);// member 객체를 삭제함
				System.out.println(memberId +"번 고객이 삭제 되었습니다.");
				return true;
			}
		}
		System.out.println(memberId + "번 고객이 존재하지 않습니다.");
		return false;
	}

}
