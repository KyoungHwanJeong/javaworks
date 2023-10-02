package collection.member_2;

import java.util.ArrayList;

public class MemberArrayList {

	private ArrayList<Member> arrayList;
	
	//객체 생성
	public MemberArrayList() {
		arrayList=new ArrayList<>();
	}
	
	// 회원 추가
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	// 회원 목록 조회
	public void showMemberInfo() {
		for(int i=0;i<arrayList.size();i++) {
			System.out.println(arrayList.get(i));
		}
	}
	
	// 회원의 전체 수
	public int allMember() {
		return arrayList.size();
	}
	
	// 회원 삭제 메서드
	public boolean removeMember(int memberId) {
		for(int i=0;i<arrayList.size();i++) {
			int dbMemberId = arrayList.get(i).getMemberId();
			
			if(dbMemberId==memberId) {
				arrayList.remove(i);
				System.out.println(memberId + "번 고객이 삭제 되었습니다.");
				return true;
			}
			
		}
		System.out.println(memberId + "번 고객이 없습니다.");

		return false;
	}
}
