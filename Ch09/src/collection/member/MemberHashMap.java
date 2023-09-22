package collection.member;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//Member 클래스를 참조해서 회원 생성, 조회, 삭제하는 클래스
public class MemberHashMap {

	//HashMap 자료 구조 객체 생성
	private Map<Integer, Member> hashMap;
	
	//생성자
	public MemberHashMap() {
		hashMap = new HashMap<>();
	}
	
	//회원추가 - put()
	public void addMember(Member member) {
		//key - memberId, value - member객체
		hashMap.put(member.getMemberId(), member);
	}
	
	//회원 목록 조회
	public void showAllMember() {
		//인덱싱이 안된다(순서가 없기 때문에...) - 반복자(Iterator)사용
		Iterator <Integer> ir = hashMap.keySet().iterator();
		// .keySet = 일치하는 키 값을 반환해준다
		// .iterator = for 문은 처음부분부터 끝까지 1번 반복하지만
		//					iterator는 처음과 끝 양쪽에서 반대로 반복한다.
		//                  FIFO, LIFO 구조에서 배운거...
		
		while(ir.hasNext()) {	// .hasNext = 객체 수만큼 반복
			int key = ir.next();	// 키를 가져와서 key에 저장한다.
			Member member = hashMap.get(key);// key값을 매개로
									// 일치하는 멤버 객체를 가져온다.

			System.out.println(member);// 그리고 그 member를 출력한다.
		}

	}
	
	//회원 삭제
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) {	// key가 존재한다면
			hashMap.remove(memberId);		// 해당 객체를 삭제함. 
			return true;
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	// 회원의 전체 수
	public int getSize() {
		return hashMap.size();
	}
}
