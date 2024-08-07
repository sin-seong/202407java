package profil;

import java.util.Iterator;

public class StudentFill implements Iterable<Student> {
	private Student[] students;
	private int last = 0;
	@Override
	public Iterator<Student> iterator() {
		// TODO Auto-generated method stub
		return new StudentFillInterator(this);
	}
	public StudentFill(int maxsize) {
		this.students = new Student[maxsize];
	}
	public Student getStudentAt(int index) {
		return students[index];
	}
	public void appendStudent(Student student) {
		this.students[last] = student;
		last++;
	}
	public int getLength() {
		return last;
	}
		
}
