package java0725;

public class Student {
	@Override
	public String toString() {
		return "학생 [이름=" + name + ", 점수=" + score + "]";
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	private String name;
	private int score;
	
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	
	
}
