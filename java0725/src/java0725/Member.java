package java0725;

public class Member {
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	String id;

	public Member(String id) {
		super();
		this.id = id;
	}
		
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Member) {
			Member member = (Member) obj;
			if(id.equals(member.id)) {
				return true;
			}
		
		}return false;
	}
	
}