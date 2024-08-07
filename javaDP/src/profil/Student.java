package profil;

public class Student {
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHakbun() {
		return hakbun;
	}

	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}

	public double getJava() {
		return java;
	}

	public void setJava(double java) {
		this.java = java;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", hakbun=" + hakbun + ", java=" + java + "]";
	}

	private String name;
	private String hakbun;
	private double java;

	public Student(String name, String hakbun, double java){
		this.name = name;
		this.hakbun = hakbun;
		this.java = java;
	}
}