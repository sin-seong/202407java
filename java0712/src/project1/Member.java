package project1;

import java.io.Serializable;

public class Member implements Serializable { //타입을 만드는거임
	String name;
	String ssn; //주민번호 6자리
	String phone;
	int bal;
	
	
	

	public Member(String name, String ssn, String phone) {
		super();
		this.name = name;
		this.ssn = ssn;
		this.phone = phone;
		
	}




	


	@Override
	public String toString() {
		return "Member [name=" + name + ", ssn=" + ssn + ", phone=" + phone + ", bal=" + bal + "]";
	}







	public Member() {}
	
}
