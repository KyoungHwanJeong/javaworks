package objectequals.member_2;

public class Member {
	
	private String memberId;
	private String memberName;
	
	public Member(String memberId, String memberName) {
		this.memberId=memberId;
		this.memberName=memberName;
	}

	@Override
	public int hashCode() {
		
		return memberId.hashCode();
	}

	@Override
	public boolean equals(Object obj) {

		if(obj instanceof Member) {
			Member member= (Member)obj;
			if(this.memberId.equals(member.memberId) &&
					this.memberName.equals(member.memberName)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		
		return memberId + ", " + memberName;
	}
	
	
	
	

}
