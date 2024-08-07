package account;

public class AccountDTO {
	

	@Override
	public String toString() {
		return "AccountDTO [id=" + id + ", name=" + name + ", sss=" + sss + ", tel=" + tel + ", balance=" + balance
				+ "]";
	}

	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getsss() {
		return sss;
	}

	public void setsss(String sss) {
		this.sss = sss;
	}

	public String gettel() {
		return tel;
	}

	public void settel(String tel) {
		this.tel = tel;
	}

	public int getbalance() {
		return balance;
	}

	public void setbalance(int balance) {
		this.balance = balance;
	}

	private int id;
	private String name;
	private String sss;
	private String tel;
	private int balance;
	
	public AccountDTO(int id, String name, String sss, String tel, int balance) {
		super();
		this.id = id;
		this.name = name;
		this.sss = sss;
		this.tel = tel;
		this.balance = balance;
	}
	
	
}
