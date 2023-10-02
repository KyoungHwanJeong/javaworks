package collection.member_2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MemberHashMap {

	private Map<Integer, Member> hashMap;
	
	// 객체 생성
	public MemberHashMap() {
		hashMap= new HashMap<>();
	}
	
	// 회원 추가
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);
	}
	
	// 회원 목록
	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator();
		
		while(ir.hasNext()) {
			int key=ir.next();
			Member member=hashMap.get(key);
			System.out.println(member);
		}
		
	}
	
	// 회원 전체 인원(회원 수
	public int allMember() {
		return hashMap.size();
	}
	
	// 회원 삭제
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true;
		}
		System.out.println(memberId + "번 회원이 존재하지 않습니다.");
		return false;
	}
}
