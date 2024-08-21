package com.board.db;


public class UserDto {
	
	public UserDto() {}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public UserDto(int num, String name, String email, String ssn) {
		super();
		this.num = num;
		this.name = name;
		this.email = email;
		this.ssn = ssn;
	}
	private int num = 0;
	private String name = "";
	private String email = "";
	private String ssn = "";
	
}
