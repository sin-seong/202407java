package java0725;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentEx2 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("홍길동", 97));
		list.add(new Student("이길동", 82));
		list.add(new Student("이길동", 77));
		list.add(new Student("길길동", 94));
		list.add(new Student("군고동", 81));
		
		Comparator<Student> c = new Comparator<Student>() {
			
			@Override
			public int compare(Student o1, Student o2) {
			
				return Integer.compare(o2.getScore(), o1.getScore());
			}
		};
		
		Collections.sort(list, c);
		System.out.println(list);
	}

}
