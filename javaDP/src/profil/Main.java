package profil;

import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		StudentFill studentFill = new StudentFill(3);
		studentFill.appendStudent(new Student("홍길동", "20243013",90));
		studentFill.appendStudent(new Student("군주비", "20242013",84));
		studentFill.appendStudent(new Student("감가이", "20243201",73));
	
	Iterator<Student> it = studentFill.iterator();
	while(it.hasNext()) {
		Student student = it.next();
		System.out.println(student.getName());
	}
	for(Student student: studentFill) {
		System.out.println(student.getName());
	}
	System.out.println();
}
}
