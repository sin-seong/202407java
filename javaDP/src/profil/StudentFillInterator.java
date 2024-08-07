package profil;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class StudentFillInterator implements Iterator<Student> {
	private StudentFill studentFill;
	private int index;
	
	public StudentFillInterator(StudentFill studentFill) {
		this.studentFill = studentFill;
		this.index = 0;
	}

	@Override
	public boolean hasNext() {
		if(index < studentFill.getLength()) {
			return true;
		}else {
		return false;
	}
	}

	@Override
	public Student next() {
		if(!hasNext()) {
		throw new NoSuchElementException();
	}
	Student student = studentFill.getStudentAt(index);
	index++;
		return student;
	}

}
