package project2;

import java.io.Serializable;

public class Member implements Serializable {
	private String name;
	private String ssn;   // 주민번호 6자리 패스워드
	private String phone;
	private int balance;
	
	
	
	public void deposit(int deposit) {
		if(deposit <= 0) {
			System.out.println("금액을 정확히 입력하시오");
			return;
		}
		balance += deposit;
	}
	
	public void whithdraw(int withdraw) {
		if(withdraw > balance) {
			System.out.println("잔액부족");
		}
		if(withdraw <=0) {
			System.out.println("0원 미만 마이너스 단위는 출금못합니다");
			return;
		}
		balance -= withdraw;
	}

	@Override
	public String toString() {
		return "멤버 [이름" + name + ", 비번=" + ssn + ", 폰번=" + phone + ", 금액=" + balance + "]";
	}

	public Member(String name, String ssn, String phone) {
		super();
		this.name = name;
		this.ssn = ssn;
		this.phone = phone;
	}
	
	public Member() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
}